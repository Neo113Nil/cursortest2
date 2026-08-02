package androidx.compose.ui.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnVisibilityChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnVisibilityChangedElement extends ModifierNodeElement {
    public final Function1 callback;
    public final long minDurationMs;
    public final float minFractionVisible;

    public OnVisibilityChangedElement(long j, float f, Function1 function1) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new OnVisibilityChangedNode(this.minDurationMs, this.minFractionVisible, this.callback);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnVisibilityChangedElement.class != obj.getClass()) {
            return false;
        }
        OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
        return this.minDurationMs == onVisibilityChangedElement.minDurationMs && this.minFractionVisible == onVisibilityChangedElement.minFractionVisible && this.callback == onVisibilityChangedElement.callback;
    }

    public final int hashCode() {
        return this.callback.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.minFractionVisible, Long.hashCode(this.minDurationMs) * 31, 961);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "onViewportVisibilityChanged";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(Long.valueOf(this.minDurationMs), "minDurationMs");
        linesSequence.set(Float.valueOf(this.minFractionVisible), "minFractionVisible");
        linesSequence.set(null, "viewportRef");
        linesSequence.set(this.callback, "callback");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        OnVisibilityChangedNode onVisibilityChangedNode = (OnVisibilityChangedNode) node;
        onVisibilityChangedNode.minDurationMs = this.minDurationMs;
        onVisibilityChangedNode.minFractionVisible = this.minFractionVisible;
        onVisibilityChangedNode.callback = this.callback;
        onVisibilityChangedNode.updateViewport();
        RelativeLayoutBounds relativeLayoutBounds = onVisibilityChangedNode.lastBounds;
        if (relativeLayoutBounds != null) {
            onVisibilityChangedNode.checkVisibility(onVisibilityChangedNode.minFractionVisible, relativeLayoutBounds, onVisibilityChangedNode.lastViewport);
        }
    }
}
