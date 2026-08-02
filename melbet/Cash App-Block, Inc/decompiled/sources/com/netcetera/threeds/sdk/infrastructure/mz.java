package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes5.dex */
public final class mz {
    private static int get = 1;
    private static int initialize;

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    public static Drawable bT_(int i, int i2, int i3) {
        return (Drawable) ThreeDS2Service(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 1964355730, -1964355730, i);
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        int intValue = ((Number) objArr[0]).intValue();
        int intValue2 = ((Number) objArr[1]).intValue();
        int intValue3 = ((Number) objArr[2]).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(intValue);
        gradientDrawable.setStroke(intValue2, intValue3);
        int i = initialize;
        int i2 = (i & 115) + (i | 115);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            return gradientDrawable;
        }
        throw null;
    }
}
