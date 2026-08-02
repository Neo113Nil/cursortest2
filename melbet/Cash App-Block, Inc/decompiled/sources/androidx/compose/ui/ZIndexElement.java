package androidx.compose.ui;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/ZIndexNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZIndexElement extends ModifierNodeElement {
    public final float zIndex;

    public ZIndexElement(float f) {
        this.zIndex = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ZIndexNode zIndexNode = new ZIndexNode();
        zIndexNode.zIndex = this.zIndex;
        return zIndexNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "zIndex";
        inspectorInfo.properties.set(Float.valueOf(this.zIndex), "zIndex");
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("ZIndexElement(zIndex="), this.zIndex, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((ZIndexNode) node).zIndex = this.zIndex;
    }
}
