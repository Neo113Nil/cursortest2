package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PaddingValuesInsets implements WindowInsets {
    public final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return Intrinsics.areEqual(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        return density.mo230roundToPx0680j_4(this.paddingValues.mo264calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo230roundToPx0680j_4(this.paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo230roundToPx0680j_4(this.paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        return density.mo230roundToPx0680j_4(this.paddingValues.mo267calculateTopPaddingD9Ej5fM());
    }

    public final int hashCode() {
        return this.paddingValues.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PaddingValues paddingValues = this.paddingValues;
        return "PaddingValues(" + ((Object) Dp.m1038toStringimpl(paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m1038toStringimpl(paddingValues.mo267calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m1038toStringimpl(paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m1038toStringimpl(paddingValues.mo264calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
