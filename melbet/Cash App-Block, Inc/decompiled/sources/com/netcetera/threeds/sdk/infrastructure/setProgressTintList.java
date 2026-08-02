package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class setProgressTintList {
    private static int get = 1;
    private static int initialize;

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        Context context = (Context) objArr[0];
        setIndeterminateTintMode setindeterminatetintmode = (setIndeterminateTintMode) objArr[1];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[2];
        setWeightSum setweightsum = (setWeightSum) objArr[3];
        int i = get;
        int i2 = (i & (-72)) | ((~i) & 71);
        int i3 = (i & 71) << 1;
        initialize = ((i2 & i3) + (i3 | i2)) % 128;
        setProgressTintMode ThreeDS2ServiceInstance = setSecondaryProgressTintList.ThreeDS2ServiceInstance(setProgressBackgroundTintBlendMode.ThreeDS2Service(context, setindeterminatetintmode, sethorizontalgravity, setweightsum));
        int i4 = get;
        int i5 = ((i4 | 81) << 1) - (i4 ^ 81);
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public static setProgressTintMode initialize(Context context, setIndeterminateTintMode setindeterminatetintmode, setHorizontalGravity sethorizontalgravity, setWeightSum setweightsum) {
        return (setProgressTintMode) ThreeDS2ServiceInstance(new Object[]{context, setindeterminatetintmode, sethorizontalgravity, setweightsum}, 1911123866, -1911123866, (int) System.currentTimeMillis());
    }
}
