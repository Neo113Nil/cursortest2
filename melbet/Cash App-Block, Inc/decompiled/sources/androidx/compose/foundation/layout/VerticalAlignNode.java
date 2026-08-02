package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public BiasAlignment.Vertical vertical;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        rowColumnParentData.crossAxisAlignment = new CrossAxisAlignment$VerticalCrossAxisAlignment(this.vertical);
        return rowColumnParentData;
    }
}
