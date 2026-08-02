package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class kr implements jr {
    private static int get = 1;
    private static int getWarnings;
    private final jr ThreeDS2Service;
    private final jr initialize;

    public kr(jr jrVar, jr jrVar2) {
        this.ThreeDS2Service = jrVar;
        this.initialize = jrVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public String ThreeDS2Service() {
        int i = get;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        jr jrVar = this.ThreeDS2Service;
        jr jrVar2 = this.initialize;
        if (i3 == 0) {
            return (String) ku.ThreeDS2ServiceInstance(new Object[]{jrVar, jrVar2, kw.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = get;
        getWarnings = ((-2) - ((((i | 28) << 1) - (i ^ 28)) ^ (-1))) % 128;
        int intValue = ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{this.ThreeDS2Service, this.initialize, kv.get}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        int i2 = get;
        int i3 = (i2 & 33) + (i2 | 33);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return intValue;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = get;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i & 17, ~(-(-(i | 17))), 1, 128);
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.ThreeDS2Service, this.initialize, ky.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i2 = getWarnings + 35;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public int getWarnings() {
        int i = getWarnings;
        int i2 = i & 9;
        int i3 = (i ^ 9) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        int i5 = i4 % 2;
        jr jrVar = this.ThreeDS2Service;
        jr jrVar2 = this.initialize;
        if (i5 != 0) {
            return ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jrVar, jrVar2, kz.initialize}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        }
        ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jrVar, jrVar2, kz.initialize}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = i & 113;
        int i3 = i2 + ((i ^ 113) | i2);
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        jr jrVar = this.ThreeDS2Service;
        jr jrVar2 = this.initialize;
        if (i4 != 0) {
            throw null;
        }
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{jrVar, jrVar2, kx.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i5 = get;
        int i6 = (((i5 | 8) << 1) - (i5 ^ 8)) - 1;
        getWarnings = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
        return str;
    }
}
