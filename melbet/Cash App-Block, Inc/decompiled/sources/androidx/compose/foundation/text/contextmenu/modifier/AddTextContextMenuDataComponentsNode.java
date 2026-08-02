package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    public CashApp$$ExternalSyntheticLambda2 builder;

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }
}
