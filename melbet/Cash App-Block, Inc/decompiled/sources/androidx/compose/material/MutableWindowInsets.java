package androidx.compose.material;

import androidx.compose.foundation.layout.FixedDpInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
public final class MutableWindowInsets implements WindowInsets {
    public final ParcelableSnapshotMutableState insets$delegate;

    public MutableWindowInsets(FixedDpInsets fixedDpInsets) {
        this.insets$delegate = Updater.mutableStateOf$default(fixedDpInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        return ((WindowInsets) this.insets$delegate.getValue()).getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) this.insets$delegate.getValue()).getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) this.insets$delegate.getValue()).getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        return ((WindowInsets) this.insets$delegate.getValue()).getTop(density);
    }
}
