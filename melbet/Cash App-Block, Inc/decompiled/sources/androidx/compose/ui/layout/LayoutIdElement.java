package androidx.compose.ui.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class LayoutIdElement extends ModifierNodeElement {
    public final Object layoutId;

    public LayoutIdElement(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        LayoutIdModifier layoutIdModifier = new LayoutIdModifier();
        layoutIdModifier.layoutId = this.layoutId;
        return layoutIdModifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.layoutId.equals(((LayoutIdElement) obj).layoutId);
    }

    public final int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "layoutId";
        inspectorInfo.value = this.layoutId;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("LayoutIdElement(layoutId="), this.layoutId, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((LayoutIdModifier) node).layoutId = this.layoutId;
    }
}
