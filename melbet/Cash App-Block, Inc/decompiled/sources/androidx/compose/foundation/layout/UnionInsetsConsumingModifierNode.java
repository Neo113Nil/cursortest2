package androidx.compose.foundation.layout;

/* loaded from: classes3.dex */
public final class UnionInsetsConsumingModifierNode extends InsetsConsumingModifierNode {
    public WindowInsets insets;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final WindowInsets calculateInsets(WindowInsets windowInsets) {
        return new UnionInsets(windowInsets, this.insets);
    }
}
