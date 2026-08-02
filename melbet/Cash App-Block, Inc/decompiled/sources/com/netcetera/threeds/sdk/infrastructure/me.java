package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class me {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    private final Context get;

    public me(Context context) {
        this.get = context;
    }

    public boolean ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 1) | (i & 1)) << 1;
        int i3 = -(((~i) & 1) | (i & (-2)));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0 && Build.VERSION.SDK_INT < 89) {
            int i5 = ThreeDS2Service;
            int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
            ThreeDS2ServiceInstance = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if ((this.get.getResources().getConfiguration().uiMode & 48) == 32) {
            ThreeDS2ServiceInstance = (ThreeDS2Service + 113) % 128;
            return true;
        }
        int i7 = ThreeDS2Service;
        int i8 = ((i7 | 106) << 1) - (i7 ^ 106);
        ThreeDS2ServiceInstance = ((i8 ^ (-1)) + (i8 << 1)) % 128;
        return false;
    }
}
