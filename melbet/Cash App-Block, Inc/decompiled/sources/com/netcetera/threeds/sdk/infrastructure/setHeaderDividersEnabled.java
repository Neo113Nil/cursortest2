package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setHeaderDividersEnabled {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final String ThreeDS2ServiceInstance;
    private final String getWarnings;

    public static final class ThreeDS2ServiceInstance {
        private static int getWarnings = 1;
        private static int initialize;
        private String ThreeDS2ServiceInstance;
        private String get;

        public ThreeDS2ServiceInstance get(String str) {
            int i = getWarnings;
            int i2 = i & 99;
            int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 99) & (~i2), ~(-(-(i2 << 1))), 1, 128);
            initialize = m$1;
            this.ThreeDS2ServiceInstance = str;
            int i3 = (-2) - ((m$1 + 112) ^ (-1));
            getWarnings = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            return this;
        }

        public setHeaderDividersEnabled getWarnings() {
            setHeaderDividersEnabled setheaderdividersenabled = new setHeaderDividersEnabled(this.ThreeDS2ServiceInstance, this.get);
            int i = initialize + 125;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                return setheaderdividersenabled;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance initialize(String str) {
            int i = getWarnings;
            int i2 = i & 9;
            int i3 = (i ^ 9) | i2;
            int i4 = ((i2 & i3) + (i3 | i2)) % 128;
            initialize = i4;
            this.get = str;
            int i5 = i4 & 125;
            int i6 = ((((i4 ^ 125) | i5) << 1) - (~(-((~i5) & (i4 | 125))))) - 1;
            getWarnings = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return this;
        }
    }

    private setHeaderDividersEnabled(String str, String str2) {
        this.getWarnings = str;
        this.ThreeDS2ServiceInstance = str2;
    }

    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        int i2 = i ^ 79;
        int i3 = (i & 79) << 1;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        get = i4;
        String str = this.getWarnings;
        ThreeDS2Service = (i4 + 9) % 128;
        return str;
    }

    public String getWarnings() {
        int i = get + 29;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            int i3 = 52 / 0;
        }
        return str;
    }
}
