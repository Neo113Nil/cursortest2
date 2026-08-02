package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class ao implements size {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final String get;

    public ao(String str, String str2) {
        this.ThreeDS2Service = str;
        this.get = str2;
    }

    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 3;
        int i3 = (i | 3) & (~i2);
        int i4 = -(-(i2 << 1));
        initialize = ((i3 & i4) + (i3 | i4)) % 128;
        String str = this.get;
        int identityHashCode = System.identityHashCode(this);
        int i5 = ~identityHashCode;
        int i6 = ~((1204649726 ^ i5) | (1204649726 & i5));
        int i7 = 273602352 ^ i6;
        int i8 = i6 & 273602352;
        int i9 = (-811805126) - (~(-(~(((i8 & i7) | (i7 ^ i8)) * (-235)))));
        int i10 = ~((1204649726 & identityHashCode) | (1204649726 ^ identityHashCode));
        int i11 = 273602352 & i10;
        int i12 = (i10 | 273602352) & (~i11);
        int i13 = -(-(((i12 & i11) | (i12 ^ i11)) * (-470)));
        int i14 = i9 & i13;
        int i15 = (((i13 | i9) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        int i16 = ~((identityHashCode & 1473249278) | (i5 & 1473249278) | ((-1473249279) & identityHashCode));
        int i17 = -(-(((i16 & 5002800) | (5002800 ^ i16)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
        int i18 = i15 & i17;
        int i19 = (i17 ^ i15) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = ~System.identityHashCode(this);
        int i22 = (-9986049) & i21;
        int i23 = ((-9986049) | i21) & (~i22);
        int i24 = (-1579416473) - (~(-(-(((i23 & i22) | (i23 ^ i22)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))));
        int i25 = (232290695 & i21) | ((~i21) & (-232290696));
        int i26 = i21 & (-232290696);
        int i27 = ~((i26 & i25) | (i25 ^ i26));
        int i28 = (i27 & (-802847680)) | ((-802847680) ^ i27);
        int i29 = i28 & 222304647;
        int i30 = (i28 | 222304647) & (~i29);
        int i31 = ((i30 & i29) | (i30 ^ i29)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
        int i32 = i24 & i31;
        int i33 = (i31 | i24) & (~i32);
        int i34 = i32 << 1;
        if (i20 <= (i33 & i34) + (i33 | i34)) {
            int i35 = 52 / 0;
        }
        return str;
    }

    public String initialize() {
        int i = initialize;
        String str = this.ThreeDS2Service;
        int i2 = ((i & 28) + (i | 28)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
