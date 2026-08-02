package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    public Function1 onDraw;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.onDraw.invoke(layoutNodeDrawScope);
    }
}
