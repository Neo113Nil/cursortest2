package androidx.compose.foundation.layout;

/* loaded from: classes3.dex */
public final class PaddingValuesConsumingModifierNode extends InsetsConsumingModifierNode {
    public PaddingValues paddingValues;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final WindowInsets calculateInsets(WindowInsets windowInsets) {
        return new AddedInsets(windowInsets, new PaddingValuesInsets(this.paddingValues));
    }
}
