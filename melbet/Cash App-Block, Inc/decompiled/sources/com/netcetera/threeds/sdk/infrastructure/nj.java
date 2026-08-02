package com.netcetera.threeds.sdk.infrastructure;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public final class nj {
    private static int get = 0;
    private static int initialize = 1;

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((i | i2) * (-470)) + (i2 * 471) + (i * 471);
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = (~(i5 | i6)) | (~(i6 | i3));
        int i8 = ~(i2 | (~i3) | i);
        if ((((~(i | i6 | i3)) | i8) * 470) + ((i7 | i8) * (-470)) + i4 != 1) {
            int i9 = get;
            int i10 = i9 & 15;
            int i11 = ((i9 ^ 15) | i10) << 1;
            int i12 = -((i9 | 15) & (~i10));
            initialize = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
            int i13 = Resources.getSystem().getDisplayMetrics().densityDpi;
            get = (initialize + 61) % 128;
            return Integer.valueOf(i13);
        }
        int intValue = ((Number) objArr[0]).intValue();
        int i14 = initialize;
        int i15 = ((i14 ^ 79) | (i14 & 79)) << 1;
        int i16 = -(((~i14) & 79) | (i14 & (-80)));
        get = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
        int i17 = (int) (intValue * Resources.getSystem().getDisplayMetrics().density);
        int i18 = get;
        int i19 = i18 ^ 11;
        int i20 = ((i18 & 11) | i19) << 1;
        int i21 = -i19;
        initialize = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
        return Integer.valueOf(i17);
    }

    public static int ThreeDS2ServiceInstance() {
        return ((Integer) ThreeDS2Service(new Object[0], 173048073, -173048073, (int) System.currentTimeMillis())).intValue();
    }

    public static int initialize(int i) {
        return ((Integer) ThreeDS2Service(new Object[]{Integer.valueOf(i)}, 256526108, -256526107, i)).intValue();
    }
}
