package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class dx extends bs<mc> {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private boolean getWarnings;

    public dx(boolean z) {
        this.getWarnings = z;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        dx dxVar = (dx) objArr[0];
        int i = get + 3;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            dxVar.ThreeDS2ServiceInstance();
            throw null;
        }
        if (dxVar.ThreeDS2ServiceInstance() != null) {
            int i2 = ThreeDS2Service;
            int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
            get = i3 % 128;
            if (i3 % 2 == 0) {
                get(new Object[]{dxVar, dxVar.ThreeDS2ServiceInstance()}, -2066858087, 2066858087, System.identityHashCode(dxVar));
                int i4 = 44 / 0;
            } else {
                get(new Object[]{dxVar, dxVar.ThreeDS2ServiceInstance()}, -2066858087, 2066858087, System.identityHashCode(dxVar));
            }
            int i5 = ThreeDS2Service;
            get = (((i5 & (-88)) | ((~i5) & 87)) + ((i5 & 87) << 1)) % 128;
        }
        int i6 = ThreeDS2Service;
        int i7 = i6 & 3;
        int i8 = (i6 ^ 3) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        get = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 15 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        int i = 0;
        dx dxVar = (dx) objArr[0];
        mc mcVar = (mc) objArr[1];
        int i2 = get;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        ThreeDS2Service = i6;
        if (i5 % 2 != 0) {
            boolean z = dxVar.getWarnings;
            throw null;
        }
        if (dxVar.getWarnings) {
            get = ((i6 & 3) + (i6 | 3)) % 128;
        } else {
            int i7 = i2 ^ 45;
            int i8 = ((i2 & 45) | i7) << 1;
            int i9 = -i7;
            ThreeDS2Service = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            i = 8;
        }
        mcVar.setVisibility(i);
        int i10 = ThreeDS2Service;
        int i11 = i10 & 9;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i11, ~((i10 ^ 9) | i11), 1, 128);
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public /* synthetic */ mc initialize(Context context) {
        int i = get;
        int i2 = (-2) - (((i & 6) + (i | 6)) ^ (-1));
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return getWarnings(context);
        }
        getWarnings(context);
        throw null;
    }

    public mc getWarnings(Context context) {
        mc mcVar = new mc(context);
        get(new Object[]{this, mcVar}, -2066858087, 2066858087, System.identityHashCode(this));
        get = (ThreeDS2Service + 121) % 128;
        return mcVar;
    }

    public void getWarnings() {
        int i = ThreeDS2Service;
        int i2 = ((i & 61) - (~(-(-(i | 61))))) - 1;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            this.getWarnings = false;
            get(new Object[]{this}, 491742382, -491742381, System.identityHashCode(this));
        } else {
            this.getWarnings = true;
            get(new Object[]{this}, 491742382, -491742381, System.identityHashCode(this));
        }
    }

    public void get() {
        int i = get;
        int i2 = ((i ^ 83) | (i & 83)) << 1;
        int i3 = -(((~i) & 83) | (i & (-84)));
        ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        this.getWarnings = false;
        get(new Object[]{this}, 491742382, -491742381, System.identityHashCode(this));
        int i4 = get;
        ThreeDS2Service = Thread$State$EnumUnboxingLocalUtility.m(i4 ^ 64, (i4 & 64) << 1, 1, 128);
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((i2 | i3) * 140) + (i2 * (-279)) + (i * EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        int i5 = (~i) | i2;
        int i6 = ~i5;
        int i7 = ~i3;
        return ((((~(i | i7)) | (~((~i2) | i))) | (~(i5 | i3))) * 140) + (((i6 | (~(i7 | i2))) * (-280)) + i4) != 1 ? getWarnings(objArr) : get(objArr);
    }
}
