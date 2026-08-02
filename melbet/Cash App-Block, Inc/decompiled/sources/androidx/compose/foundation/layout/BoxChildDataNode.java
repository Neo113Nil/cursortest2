package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {
    public Alignment alignment;
    public boolean matchParentSize;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
