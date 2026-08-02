package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class cf extends bt<LinearLayout> {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    final cb ThreeDS2ServiceInstance;
    private final cp get;
    private final bq initialize;

    public cf(cb cbVar, bq bqVar, cp cpVar) {
        this.ThreeDS2ServiceInstance = cbVar;
        this.initialize = bqVar;
        this.get = cpVar;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        ce ceVar = (ce) objArr[0];
        ju juVar = (ju) objArr[1];
        fx fxVar = (fx) objArr[2];
        cp cpVar = new cp();
        mg mgVar = (mg) mt.ThreeDS2ServiceInstance(new Object[0], -734264745, 734264746, (int) System.currentTimeMillis());
        cf cfVar = new cf(new cb(ceVar, cpVar, juVar, mgVar), new bq(juVar, cpVar, mgVar, fxVar), cpVar);
        int i = getWarnings;
        int i2 = ((((i ^ 19) | (i & 19)) << 1) - (~(-(((~i) & 19) | (i & (-20)))))) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return cfVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public void ThreeDS2Service() {
        int i = getWarnings;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, ~((i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1), 1, 128);
        this.initialize.initialize();
        this.ThreeDS2ServiceInstance.initialize();
        this.get.ThreeDS2Service();
        int i2 = getWarnings;
        int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)));
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public LinearLayout bh_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.addView(this.initialize.get(context));
        linearLayout.addView(this.ThreeDS2ServiceInstance.get(context));
        int i = ThreeDS2Service;
        int i2 = i & 99;
        int i3 = ((i ^ 99) | i2) << 1;
        int i4 = -((i | 99) & (~i2));
        getWarnings = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return linearLayout;
    }

    public void bi_(setScroller setscroller, LinearLayout linearLayout) {
        int i = ThreeDS2Service;
        getWarnings = ((i & 47) + (i | 47)) % 128;
        linearLayout.setVisibility(0);
        this.ThreeDS2ServiceInstance.getWarnings(setscroller);
        this.get.ThreeDS2Service(this.ThreeDS2ServiceInstance.get());
        int i2 = ThreeDS2Service;
        int i3 = i2 & 125;
        int i4 = -(-(i2 | 125));
        getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
    }

    public void get() {
        int i = ThreeDS2Service;
        int i2 = i & 77;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
        this.ThreeDS2ServiceInstance.getWarnings();
        int i5 = ThreeDS2Service;
        int i6 = i5 & 11;
        getWarnings = (i6 + ((i5 ^ 11) | i6)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bt
    public /* synthetic */ void getWarnings(setScroller setscroller, LinearLayout linearLayout) {
        int i = ThreeDS2Service;
        int i2 = ((i | 104) << 1) - (i ^ 104);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        bi_(setscroller, linearLayout);
        if (i4 != 0) {
            throw null;
        }
    }

    public void initialize(eq eqVar) {
        int i = ThreeDS2Service;
        int i2 = i & 23;
        int i3 = (i ^ 23) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        cb cbVar = this.ThreeDS2ServiceInstance;
        if (i5 != 0) {
            cbVar.initialize(eqVar);
            int i6 = 18 / 0;
        } else {
            cbVar.initialize(eqVar);
        }
        int i7 = ThreeDS2Service;
        int i8 = (i7 & 51) + (i7 | 51);
        getWarnings = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    public static cf get(ce ceVar, ju juVar, fx fxVar) {
        return (cf) get(new Object[]{ceVar, juVar, fxVar}, -689632726, 689632726, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public /* synthetic */ View initialize(Context context) {
        ThreeDS2Service = (getWarnings + 71) % 128;
        LinearLayout bh_ = bh_(context);
        int i = getWarnings;
        int i2 = ((i ^ 4) + ((i & 4) << 1)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return bh_;
        }
        throw null;
    }

    public void ThreeDS2ServiceInstance(compute computeVar) {
        int i = ThreeDS2Service;
        getWarnings = ((i & 41) + (i | 41)) % 128;
        this.get.get(computeVar);
        int i2 = ThreeDS2Service;
        int i3 = i2 & 107;
        int i4 = (i2 | 107) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        getWarnings = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void ThreeDS2ServiceInstance(keys keysVar) {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 45) | (i & 45)) << 1;
        int i3 = -(((~i) & 45) | (i & (-46)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        cb cbVar = this.ThreeDS2ServiceInstance;
        if (i5 == 0) {
            cbVar.get(keysVar);
            int i6 = ThreeDS2Service;
            int i7 = (i6 & (-114)) | ((~i6) & 113);
            int i8 = (i6 & 113) << 1;
            getWarnings = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            return;
        }
        cbVar.get(keysVar);
        throw null;
    }

    public void ThreeDS2ServiceInstance(er erVar) {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 63) - (~((i & 63) << 1))) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        cb cbVar = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            cbVar.get(erVar);
            int i4 = 44 / 0;
        } else {
            cbVar.get(erVar);
        }
        int i5 = ThreeDS2Service;
        int i6 = (i5 & (-74)) | ((~i5) & 73);
        int i7 = -(-((i5 & 73) << 1));
        getWarnings = ((i6 & i7) + (i7 | i6)) % 128;
    }
}
