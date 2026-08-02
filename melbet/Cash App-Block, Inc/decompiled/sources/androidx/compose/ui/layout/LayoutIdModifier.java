package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public Object layoutId;

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final Object getLayoutId() {
        return this.layoutId;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
