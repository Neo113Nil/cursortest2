package androidx.compose.ui.layout;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes3.dex */
public final class OnFirstVisibleNode extends Modifier.Node implements ObserverModifierNode {
    public Function0 callback;
    public ThrottledCallbacks.Entry handle;
    public StandaloneCoroutine job;
    public RelativeLayoutBounds lastBounds;
    public boolean lastResult;
    public RelativeLayoutBounds lastViewport;
    public final BoundsAnimation$animate$1 rectChanged = new BoundsAnimation$animate$1(this, 10);

    public OnFirstVisibleNode(Function0 function0) {
        this.callback = function0;
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        float fractionVisibleInRect;
        StandaloneCoroutine standaloneCoroutine;
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
        boolean z = fractionVisibleInRect > 1.0f || fractionVisibleInRect == 1.0f;
        if (z && !this.lastResult) {
            ThrottledCallbacks.Entry entry = this.handle;
            if (entry != null) {
                entry.unregister();
            }
            StandaloneCoroutine standaloneCoroutine2 = this.job;
            if (standaloneCoroutine2 != null) {
                standaloneCoroutine2.cancel(null);
            }
            this.callback.invoke();
        } else if (!z && this.lastResult && (standaloneCoroutine = this.job) != null) {
            standaloneCoroutine.cancel(null);
        }
        this.lastResult = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
        updateViewport();
        this.handle = RulerKt.registerOnLayoutRectChanged(this, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ThrottledCallbacks.Entry entry = this.handle;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        if (Intrinsics.areEqual(this.lastViewport, (Object) null)) {
            return;
        }
        this.lastViewport = null;
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(1.0f, relativeLayoutBounds, null);
        }
    }

    public final void updateViewport() {
        if (Intrinsics.areEqual(this.lastViewport, (Object) null)) {
            return;
        }
        this.lastViewport = null;
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(1.0f, relativeLayoutBounds, null);
        }
    }
}
