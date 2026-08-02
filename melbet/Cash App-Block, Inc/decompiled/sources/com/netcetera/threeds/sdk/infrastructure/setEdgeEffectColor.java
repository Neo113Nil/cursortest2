package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setEdgeEffectColor {
    private static int get = 0;
    private static int initialize = 1;
    private final Context ThreeDS2ServiceInstance;

    public setEdgeEffectColor(Context context) {
        this.ThreeDS2ServiceInstance = context;
    }

    public boolean ThreeDS2ServiceInstance(setTranscriptMode... settranscriptmodeArr) {
        int i = initialize;
        int i2 = i & 1;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 1) | i2) << 1, ~(-((i | 1) & (~i2))), 1, 128);
        get = m$1;
        int length = settranscriptmodeArr.length;
        int i3 = m$1 & 11;
        int i4 = -(-(m$1 | 11));
        initialize = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        int i5 = 0;
        while (i5 < length) {
            int i6 = initialize;
            int i7 = i6 & 21;
            int i8 = -(-(i6 | 21));
            int i9 = (i7 & i8) + (i8 | i7);
            get = i9 % 128;
            if (i9 % 2 != 0) {
                this.ThreeDS2ServiceInstance.checkCallingOrSelfPermission(settranscriptmodeArr[i5].onError);
                throw null;
            }
            if (this.ThreeDS2ServiceInstance.checkCallingOrSelfPermission(settranscriptmodeArr[i5].onError) == 0) {
                System.identityHashCode(this);
                System.identityHashCode(this);
                return false;
            }
            int i10 = (i5 | 1) << 1;
            int i11 = -(((~i5) & 1) | (i5 & (-2)));
            i5 = (i11 | i10) + (i10 & i11);
            int i12 = get;
            int i13 = (i12 & (-32)) | ((~i12) & 31);
            int i14 = (i12 & 31) << 1;
            initialize = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        }
        int i15 = initialize;
        int i16 = (i15 & 76) + (i15 | 76);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        get = i17 % 128;
        if (i17 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
