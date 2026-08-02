package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class kq implements jo {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final jo get;
    private final jo getWarnings;

    public kq(jo joVar, jo joVar2) {
        this.getWarnings = joVar;
        this.get = joVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 29;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 29) | i2) << 1, ~(-((i | 29) & (~i2))), 1, 128);
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.getWarnings, this.get, kt.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i3 = ThreeDS2ServiceInstance;
        int i4 = i3 ^ 63;
        int i5 = -(-((i3 & 63) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & (-102)) | ((~i) & 101);
        int i3 = -(-((i & 101) << 1));
        ThreeDS2Service = ((i2 & i3) + (i3 | i2)) % 128;
        int intValue = ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{this.getWarnings, this.get, ko.ThreeDS2Service}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 & 93;
        int i6 = ((i4 ^ 93) | i5) << 1;
        int i7 = -((i4 | 93) & (~i5));
        ThreeDS2Service = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        return intValue;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int identityHashCode = System.identityHashCode(this);
        int i = ((~identityHashCode) & 618927321) | ((-618927322) & identityHashCode);
        int i2 = 618927321 & identityHashCode;
        int i3 = (i & i2) | (i ^ i2);
        int i4 = ((-387622525) & i3) | ((~i3) & 387622524);
        int i5 = i3 & 387622524;
        int i6 = -(-(((i5 & i4) | (i4 ^ i5)) * (-381)));
        int i7 = ((1474706778 ^ i6) | (1474706778 & i6)) << 1;
        int i8 = -((i6 & (-1474706779)) | (1474706778 & (~i6)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        int i10 = ~identityHashCode;
        int i11 = i10 & 618927321;
        int i12 = ((i10 | 618927321) & (~i11)) | i11;
        int i13 = (i12 | (~i12)) & (~i12);
        int i14 = 551817345 & i13;
        int i15 = (i13 | 551817345) & (~i14);
        int i16 = (i15 & i14) | (i15 ^ i14);
        int i17 = ((i16 & 320512548) | (i16 ^ 320512548)) * 381;
        int i18 = i9 | i17;
        int i19 = i18 << 1;
        int i20 = -((~(i17 & i9)) & i18);
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        int i22 = i21 & (-1444304902);
        int i23 = ((i21 ^ (-1444304902)) | i22) << 1;
        int i24 = -(((-1444304902) | i21) & (~i22));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i26 = ~identityHashCode2;
        int i27 = ~((1969721529 & i26) | ((~i26) & (-1969721530)) | (i26 & (-1969721530)));
        int i28 = ((~i27) & 354418688) | ((-354418689) & i27);
        int i29 = i27 & 354418688;
        int i30 = -(-(((i29 & i28) | (i28 ^ i29)) * (-712)));
        int i31 = (((((-1102189930) ^ i30) | ((-1102189930) & i30)) << 1) - (~(-((i30 & 1102189929) | ((-1102189930) & (~i30)))))) - 1;
        int i32 = ~identityHashCode2;
        int i33 = 1616361983 ^ i32;
        int i34 = 1616361983 & i32;
        int i35 = (i33 & i34) | (i33 ^ i34);
        int i36 = ~((i35 & (-1969721530)) | (i35 ^ (-1969721530)));
        int i37 = (i32 & (-1615302842)) | (1615302841 & identityHashCode2);
        int i38 = identityHashCode2 & (-1615302842);
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = (i31 - (~(-(~(((i39 & i36) | (((~i39) & i36) | ((~i36) & i39))) * (-712)))))) - 2;
        int i41 = i26 & (-1969721530);
        int i42 = (i26 | (-1969721530)) & (~i41);
        int i43 = ~((i41 & i42) | (i42 ^ i41));
        int i44 = 1616361983 & i43;
        int i45 = (i43 | 1616361983) & (~i44);
        int i46 = ((i45 & i44) | (i45 ^ i44)) * 712;
        int i47 = i40 & i46;
        int i48 = (i47 - (~((i46 ^ i40) | i47))) - 1;
        jo joVar = this.getWarnings;
        jo joVar2 = this.get;
        if (i25 <= i48) {
            return (String) ku.ThreeDS2ServiceInstance(new Object[]{joVar, joVar2, km.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public int getWarnings() {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = ((i & 125) + (i | 125)) % 128;
        int intValue = ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{this.getWarnings, this.get, ks.get}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        int i2 = ThreeDS2ServiceInstance + 65;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return intValue;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 51) % 128;
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{this.getWarnings, this.get, kp.ThreeDS2ServiceInstance}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i = ThreeDS2Service;
        int i2 = (((i & (-20)) | ((~i) & 19)) - (~((i & 19) << 1))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
