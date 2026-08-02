package androidx.compose.ui.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement {
    public final Function1 callback;

    public OnLayoutRectChangedElement(Function1 function1) {
        this.callback = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        OnLayoutRectChangedNode onLayoutRectChangedNode = new OnLayoutRectChangedNode();
        onLayoutRectChangedNode.callback = this.callback;
        return onLayoutRectChangedNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnLayoutRectChangedElement) && this.callback == ((OnLayoutRectChangedElement) obj).callback;
    }

    public final int hashCode() {
        return this.callback.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(0L) * 31, 31, 0L);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "onRectChanged";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(0L, "throttleMillis");
        linesSequence.set(0L, "debounceMillis");
        linesSequence.set(this.callback, "callback");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        OnLayoutRectChangedNode onLayoutRectChangedNode = (OnLayoutRectChangedNode) node;
        onLayoutRectChangedNode.getClass();
        onLayoutRectChangedNode.callback = this.callback;
        ThrottledCallbacks.Entry entry = onLayoutRectChangedNode.handle;
        if (entry != null) {
            entry.unregister();
        }
        onLayoutRectChangedNode.handle = RulerKt.registerOnLayoutRectChanged(onLayoutRectChangedNode, onLayoutRectChangedNode.callback);
    }
}
