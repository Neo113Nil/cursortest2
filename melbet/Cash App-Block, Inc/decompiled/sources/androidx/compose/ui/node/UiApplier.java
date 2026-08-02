package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier {
    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int i, Object obj) {
        ((LayoutNode) this.current).insertAt$ui(i, (LayoutNode) obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void insertTopDown(int i, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int i, int i2, int i3) {
        ((LayoutNode) this.current).move$ui(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        ((LayoutNode) this.root).removeAll$ui();
    }

    @Override // androidx.compose.runtime.Applier
    public final void onEndChanges() {
        Owner owner = ((LayoutNode) this.root).owner;
        if (owner != null) {
            ((AndroidComposeView) owner).onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int i, int i2) {
        ((LayoutNode) this.current).removeAt$ui(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        ((LayoutNode) this.current).onReuse();
    }
}
