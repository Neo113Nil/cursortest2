package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class lj implements jw {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private jw get;
    private jw initialize;

    public lj(jw jwVar, jw jwVar2) {
        this.initialize = jwVar;
        this.get = jwVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String ThreeDS2Service() {
        int i = getWarnings;
        int i2 = (-2) - ((((i | 88) << 1) - (i ^ 88)) ^ (-1));
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        jw jwVar = this.initialize;
        jw jwVar2 = this.get;
        if (i3 == 0) {
            return (String) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lo.ThreeDS2Service}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        int i4 = 90 / 0;
        return (String) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lo.ThreeDS2Service}, -1774358813, 1774358814, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance + 47;
        getWarnings = i % 128;
        int i2 = i % 2;
        jw jwVar = this.initialize;
        jw jwVar2 = this.get;
        if (i2 != 0) {
            return ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lk.ThreeDS2ServiceInstance}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        }
        int i3 = 97 / 0;
        return ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lk.ThreeDS2ServiceInstance}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = getWarnings + 34;
        ThreeDS2ServiceInstance = ((i ^ (-1)) + (i << 1)) % 128;
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.initialize, this.get, li.ThreeDS2Service}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 19;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i2 ^ 19) | i3) << 1, ~(-((i2 | 19) & (~i3))), 1, 128);
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getSDKInfo() {
        int i = getWarnings;
        int i2 = i & 101;
        int i3 = (i ^ 101) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        jw jwVar = this.initialize;
        jw jwVar2 = this.get;
        if (i5 == 0) {
            return (String) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lm.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{jwVar, jwVar2, lm.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i6 = 86 / 0;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getWarnings() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 1;
        int i3 = ((i ^ 1) | i2) << 1;
        int i4 = -((i | 1) & (~i2));
        getWarnings = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.initialize, this.get, ln.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 ^ 31;
        int i7 = (((i5 & 31) | i6) << 1) - i6;
        getWarnings = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = getWarnings;
        ThreeDS2ServiceInstance = ((((i ^ 89) | (i & 89)) << 1) - (((~i) & 89) | (i & (-90)))) % 128;
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.initialize, this.get, lg.ThreeDS2Service}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i2 = ThreeDS2ServiceInstance;
        getWarnings = (((i2 | 37) << 1) - (i2 ^ 37)) % 128;
        return str;
    }
}
