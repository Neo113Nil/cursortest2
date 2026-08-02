package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public Function1 callback;

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }
}
