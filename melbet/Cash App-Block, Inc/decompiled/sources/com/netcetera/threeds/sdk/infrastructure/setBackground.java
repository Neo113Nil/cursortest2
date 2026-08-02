package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class setBackground implements setDuplicateParentStateEnabled<String> {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;

    private setBackground(String str) {
        this.ThreeDS2Service = str;
    }

    public static setBackground getWarnings() {
        return (setBackground) initialize(new Object[0], -2004014802, 2004014802, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        if ((((~(i2 | (~i3))) | (~(i4 | i2))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + ((i | (~(i2 | i3))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (i4 * (-191)) + (i2 * 192) + (i * (-381)) != 1) {
            return initialize(objArr);
        }
        setBackground setbackground = new setBackground((String) objArr[0]);
        int i5 = initialize;
        int i6 = (i5 ^ 78) + ((i5 & 78) << 1);
        ThreeDS2ServiceInstance = ((i6 ^ (-1)) + (i6 << 1)) % 128;
        return setbackground;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        initialize = ((((i ^ 87) | (i & 87)) << 1) - (((~i) & 87) | (i & (-88)))) % 128;
        boolean initialize2 = oj.initialize(this.ThreeDS2Service);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = ((i2 ^ 121) | (i2 & 121)) << 1;
        int i4 = -(((~i2) & 121) | (i2 & (-122)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        initialize = i5 % 128;
        if (i5 % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2ServiceInstance() {
        boolean z;
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 83;
        int i3 = (((i ^ 83) | i2) << 1) - ((i | 83) & (~i2));
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            ThreeDS2Service();
            throw null;
        }
        if (ThreeDS2Service()) {
            int i4 = ThreeDS2ServiceInstance;
            int i5 = (i4 | 63) << 1;
            int i6 = -(i4 ^ 63);
            initialize = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            z = false;
        } else {
            int i7 = initialize;
            ThreeDS2ServiceInstance = ((i7 ^ 49) + ((i7 & 49) << 1)) % 128;
            z = true;
        }
        int i8 = initialize;
        ThreeDS2ServiceInstance = ((i8 ^ 5) + ((i8 & 5) << 1)) % 128;
        return z;
    }

    public String get() {
        int i = initialize + 25;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 != 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setBackground setbackground = new setBackground("");
        int i = initialize;
        int i2 = i & 3;
        int i3 = ((i ^ 3) | i2) << 1;
        int i4 = -((i | 3) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return setbackground;
    }

    public static setBackground ThreeDS2ServiceInstance(String str) {
        return (setBackground) initialize(new Object[]{str}, -1719229398, 1719229399, (int) System.currentTimeMillis());
    }
}
