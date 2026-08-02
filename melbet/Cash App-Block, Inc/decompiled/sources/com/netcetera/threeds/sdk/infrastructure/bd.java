package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class bd extends aw {
    private static int get = 1;
    private static int getWarnings;

    public bd(Context context, au auVar) {
        super(context, auVar);
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        bd bdVar = new bd((Context) objArr[0], new au());
        int i = getWarnings;
        int i2 = (((i | 102) << 1) - (i ^ 102)) - 1;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return bdVar;
    }

    public static bd initialize(Context context) {
        return (bd) ThreeDS2ServiceInstance(new Object[]{context}, 1850761242, -1850761242, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }
}
