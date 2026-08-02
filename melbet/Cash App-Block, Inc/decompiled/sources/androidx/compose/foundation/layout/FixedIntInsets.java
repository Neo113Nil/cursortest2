package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class FixedIntInsets implements WindowInsets {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FixedIntInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Insets(left=0, top=0, right=0, bottom=0)";
    }
}
