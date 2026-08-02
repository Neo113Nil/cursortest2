package com.squareup.cash.composeUi.foundation.layout;

import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final class AdaptiveStackKt$spacedBetween$1 implements Arrangement$Horizontal, Arrangement$Vertical {
    public final float spacing;

    public AdaptiveStackKt$spacedBetween$1(float f) {
        this.spacing = f;
    }

    public static void placeSpaceBetween(int i, int[] iArr, int i2, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = Math.max(i2, (i - i4) / Math.max(iArr.length - 1, 1));
        float f = (z && iArr.length == 1) ? max : RecyclerView.DECELERATION_RATE;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = MathKt__MathJVMKt.roundToInt(f);
                f += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = MathKt__MathJVMKt.roundToInt(f);
            f += i8 + max;
            i3++;
            i7++;
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Horizontal
    public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        density.getClass();
        layoutDirection.getClass();
        int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(this.spacing);
        if (layoutDirection == LayoutDirection.Ltr) {
            placeSpaceBetween(i, iArr, mo230roundToPx0680j_4, iArr2, false);
        } else {
            placeSpaceBetween(i, iArr, mo230roundToPx0680j_4, iArr2, true);
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical
    /* renamed from: getSpacing-D9Ej5fM */
    public final float mo252getSpacingD9Ej5fM() {
        return this.spacing;
    }

    public final String toString() {
        return "AdaptiveStack#SpaceBetween";
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Vertical
    public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
        density.getClass();
        placeSpaceBetween(i, iArr, density.mo230roundToPx0680j_4(this.spacing), iArr2, false);
    }
}
