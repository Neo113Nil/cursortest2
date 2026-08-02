package androidx.compose.ui.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnFirstVisibleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnFirstVisibleNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnFirstVisibleElement extends ModifierNodeElement {
    public final Function0 callback;

    public OnFirstVisibleElement(Function0 function0) {
        this.callback = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new OnFirstVisibleNode(this.callback);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && OnFirstVisibleElement.class == obj.getClass() && this.callback == ((OnFirstVisibleElement) obj).callback;
    }

    public final int hashCode() {
        return this.callback.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, Long.hashCode(0L) * 31, 961);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "onFirstVisible";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(0L, "minDurationMs");
        linesSequence.set(Float.valueOf(1.0f), "minFractionVisible");
        linesSequence.set(null, "viewportBounds");
        linesSequence.set(this.callback, "callback");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        OnFirstVisibleNode onFirstVisibleNode = (OnFirstVisibleNode) node;
        onFirstVisibleNode.getClass();
        onFirstVisibleNode.callback = this.callback;
        onFirstVisibleNode.updateViewport();
        RelativeLayoutBounds relativeLayoutBounds = onFirstVisibleNode.lastBounds;
        if (relativeLayoutBounds != null) {
            onFirstVisibleNode.checkVisibility(1.0f, relativeLayoutBounds, onFirstVisibleNode.lastViewport);
        }
    }
}
