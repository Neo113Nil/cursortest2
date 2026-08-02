package com.squareup.cash.investing.components.drip;

import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.ui.unit.Density;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class TopWithFooter implements Arrangement$Vertical {
    public static final TopWithFooter INSTANCE = new TopWithFooter();

    @Override // androidx.compose.foundation.layout.Arrangement$Vertical
    public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
        density.getClass();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i4] = i3;
            i3 += i5;
            i2++;
            i4++;
        }
        if (i3 < i) {
            int length2 = iArr2.length - 1;
            if (iArr.length != 0) {
                iArr2[length2] = i - iArr[iArr.length - 1];
            } else {
                OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
            }
        }
    }
}
