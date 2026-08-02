package com.netcetera.threeds.sdk.infrastructure;

import android.os.Build;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class mt {
    private static int get = 1;
    private static int getWarnings;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        int i = getWarnings;
        int i2 = i & 113;
        int i3 = ((((i ^ 113) | i2) << 1) - (~(-((i | 113) & (~i2))))) - 1;
        get = i3 % 128;
        if (i3 % 2 != 0 && Build.VERSION.SDK_INT < 30) {
            mn mnVar = new mn();
            int i4 = getWarnings;
            int i5 = (i4 & 111) + (i4 | 111);
            get = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 51 / 0;
            }
            return mnVar;
        }
        ml mlVar = new ml();
        int i7 = get;
        int i8 = ((i7 ^ 11) | (i7 & 11)) << 1;
        int i9 = -(((~i7) & 11) | (i7 & (-12)));
        getWarnings = ((i8 & i9) + (i9 | i8)) % 128;
        return mlVar;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ((~(i4 | i5)) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (i2 * (-209)) + (i * (-209));
        int i7 = ~i3;
        if ((((~(i | i5 | i3)) | (~(i2 | i4 | i7))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i7)) | (~(i4 | i3))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + i6 == 1) {
            return ThreeDS2Service(objArr);
        }
        int i8 = getWarnings;
        int i9 = (i8 ^ 117) + ((i8 & 117) << 1);
        get = i9 % 128;
        if (i9 % 2 != 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 31) {
            ml mlVar = new ml();
            System.currentTimeMillis();
            System.currentTimeMillis();
            return mlVar;
        }
        mn mnVar = new mn();
        int i10 = get;
        int i11 = i10 & 59;
        int i12 = -(-((i10 ^ 59) | i11));
        getWarnings = ((i11 & i12) + (i12 | i11)) % 128;
        return mnVar;
    }

    public static mk ThreeDS2Service() {
        return (mk) ThreeDS2ServiceInstance(new Object[0], 1394921779, -1394921779, (int) System.currentTimeMillis());
    }

    public static mg ThreeDS2ServiceInstance() {
        return (mg) ThreeDS2ServiceInstance(new Object[0], -734264745, 734264746, (int) System.currentTimeMillis());
    }
}
