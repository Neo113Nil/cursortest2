package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNodeImpl;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public BorderCache borderCache;
    public Brush brush;
    public final CacheDrawModifierNodeImpl drawWithCacheModifierNode;
    public Shape shape;
    public float width;

    public BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = new CacheDrawModifierNodeImpl(new CacheDrawScope(), new CashApp$$ExternalSyntheticLambda2(this, 2));
        delegate(cacheDrawModifierNodeImpl);
        this.drawWithCacheModifierNode = cacheDrawModifierNodeImpl;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean isImportantForBounds() {
        return false;
    }
}
