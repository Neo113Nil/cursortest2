package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {
    public SpringSpec fadeInSpec;
    public SpringSpec fadeOutSpec;
    public SpringSpec placementSpec;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
