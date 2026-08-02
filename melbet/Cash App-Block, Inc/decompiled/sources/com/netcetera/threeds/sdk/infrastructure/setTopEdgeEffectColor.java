package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.UUID;

/* loaded from: classes5.dex */
public class setTopEdgeEffectColor {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;

    public String initialize() {
        int i = ThreeDS2ServiceInstance;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 85) | (i & 85)) << 1, ~(-(((~i) & 85) | (i & (-86)))), 1, 128);
        String uuid = UUID.randomUUID().toString();
        int i2 = getWarnings;
        int i3 = (((i2 | 68) << 1) - (i2 ^ 68)) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            return uuid;
        }
        throw null;
    }
}
