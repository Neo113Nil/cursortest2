package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setFooterDividersEnabled {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final String get;
    private final String getWarnings;
    private final int initialize;

    public setFooterDividersEnabled(String str, String str2, int i) {
        this.get = str;
        this.initialize = i;
        this.getWarnings = str2;
    }

    public static setFooterDividersEnabled ThreeDS2Service() {
        return (setFooterDividersEnabled) getWarnings(new Object[0], 32598357, -32598357, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setFooterDividersEnabled setfooterdividersenabled = new setFooterDividersEnabled("", "", om.initialize.intValue());
        int i = ThreeDS2Service;
        int i2 = i & 83;
        int i3 = (((i | 83) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return setfooterdividersenabled;
    }

    public String get() {
        int i = ThreeDS2Service;
        String str = this.getWarnings;
        int i2 = ((((i ^ 7) | (i & 7)) << 1) - (~(-(((~i) & 7) | (i & (-8)))))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String initialize() {
        int i = ThreeDS2Service;
        int i2 = ((i & 105) + (i | 105)) % 128;
        ThreeDS2ServiceInstance = i2;
        String str = this.get;
        int i3 = ((i2 | 81) << 1) - (((~i2) & 81) | (i2 & (-82)));
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public int getWarnings() {
        int i = ThreeDS2Service;
        int i2 = this.initialize;
        ThreeDS2ServiceInstance = (((i | 121) << 1) - (i ^ 121)) % 128;
        return i2;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }
}
