package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes4.dex */
public final class EquatableBitmap {
    public final Bitmap bitmap;
    public final int pixelHash;

    public EquatableBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        int[] iArr = new int[bitmap.getWidth()];
        IntProgressionIterator it = RangesKt___RangesKt.until(0, bitmap.getHeight()).iterator();
        int i = 1;
        while (it.hasNext) {
            int nextInt = it.nextInt();
            Bitmap bitmap2 = this.bitmap;
            bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, nextInt, this.bitmap.getWidth(), 1);
            i = (i * 31) + Arrays.hashCode(iArr);
        }
        this.pixelHash = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EquatableBitmap) {
            return this.pixelHash == ((EquatableBitmap) obj).pixelHash;
        }
        return false;
    }

    public final int hashCode() {
        return this.pixelHash;
    }
}
