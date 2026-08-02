package com.netcetera.threeds.sdk.infrastructure;

import android.os.Build;

/* loaded from: classes5.dex */
public class setLinksClickable {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        String str = (String) objArr[0];
        int i = ThreeDS2Service;
        initialize = ((i & 107) + (i | 107)) % 128;
        String str2 = (String) oj.getWarnings(str, "");
        if (Build.VERSION.SDK_INT < 30) {
            setAutoLinkMask setautolinkmask = new setAutoLinkMask(str2);
            int i2 = initialize;
            int i3 = i2 & 121;
            int i4 = -(-(i2 | 121));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 69 / 0;
            }
            return setautolinkmask;
        }
        setShowSoftInputOnFocus setshowsoftinputonfocus = new setShowSoftInputOnFocus(str2);
        int i7 = ThreeDS2Service;
        int i8 = (i7 & (-36)) | ((~i7) & 35);
        int i9 = (i7 & 35) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            return setshowsoftinputonfocus;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2Service(objArr);
    }

    public static setShadowLayer ThreeDS2Service(String str) {
        return (setShadowLayer) get(new Object[]{str}, 721461077, -721461077, (int) System.currentTimeMillis());
    }
}
