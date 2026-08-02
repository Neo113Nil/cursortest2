package androidx.compose.ui.layout;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.UnplacedAwareModifierNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes3.dex */
public final class OnVisibilityChangedNode extends Modifier.Node implements ObserverModifierNode, UnplacedAwareModifierNode {
    public Function1 callback;
    public ThrottledCallbacks.Entry handle;
    public StandaloneCoroutine job;
    public RelativeLayoutBounds lastBounds;
    public boolean lastReportedResult;
    public boolean lastResult;
    public RelativeLayoutBounds lastViewport;
    public long minDurationMs;
    public float minFractionVisible;
    public final BoundsAnimation$animate$1 rectChanged = new BoundsAnimation$animate$1(this, 11);

    public OnVisibilityChangedNode(long j, float f, Function1 function1) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function1;
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        float fractionVisibleInRect;
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null) {
            relativeLayoutBounds.getClass();
            long j = relativeLayoutBounds2.topLeft;
            long j2 = relativeLayoutBounds2.bottomRight;
            fractionVisibleInRect = relativeLayoutBounds.fractionVisibleInRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        } else {
            long j3 = relativeLayoutBounds.windowSize;
            fractionVisibleInRect = relativeLayoutBounds.fractionVisibleInRect(0, 0, (int) (j3 >> 32), (int) j3);
        }
        boolean z = fractionVisibleInRect > f || fractionVisibleInRect == 1.0f;
        if (z != this.lastResult) {
            this.lastResult = z;
            StandaloneCoroutine standaloneCoroutine = this.job;
            Continuation continuation = null;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            this.job = null;
            if (z != this.lastReportedResult) {
                if (!z || this.minDurationMs <= 0) {
                    triggerCallback();
                } else {
                    this.job = JobKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$onAttach$1(this, continuation, 27), 3);
                }
            }
        }
    }

    public final void fireExitIfNeeded() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            triggerCallback();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        this.handle = RulerKt.registerOnLayoutRectChanged(this, this.rectChanged);
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        fireExitIfNeeded();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        fireExitIfNeeded();
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    public final void onUnplaced() {
        fireExitIfNeeded();
    }

    public final void triggerCallback() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.job = null;
        this.callback.invoke(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }

    public final void updateViewport() {
        if (this.lastViewport != null) {
            this.lastViewport = null;
            RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
            if (relativeLayoutBounds != null) {
                checkVisibility(this.minFractionVisible, relativeLayoutBounds, null);
            }
        }
    }
}
