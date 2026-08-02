package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setCustomSelectionActionModeCallback implements setIncludeFontPadding {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private Bitmap get;
    private String initialize;

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void P_(Bitmap bitmap) {
        int i = getWarnings;
        this.get = bitmap;
        int i2 = ((i ^ 9) | (i & 9)) << 1;
        int i3 = -((i & (-10)) | ((~i) & 9));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void Q_(Bitmap bitmap) {
        int i = getWarnings;
        int i2 = i & 57;
        int i3 = ((i ^ 57) | i2) << 1;
        int i4 = -((i | 57) & (~i2));
        ThreeDS2ServiceInstance = ((i3 & i4) + (i4 | i3)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public Bitmap R_() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 22) << 1) - (i ^ 22);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.get;
        if (i4 == 0) {
            return bitmap;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public String ThreeDS2Service() {
        int i = getWarnings;
        int i2 = i & 83;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 83) & (~i2), ~(i2 << 1), 1, 128);
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public String get() {
        int i = getWarnings;
        int i2 = (i & 86) + (i | 86);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        ThreeDS2ServiceInstance = i3;
        String str = this.initialize;
        int i4 = ((i3 | 65) << 1) - (i3 ^ 65);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void getWarnings(String str) {
        int i = getWarnings;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i ^ 91, ~(-(-((i & 91) << 1))), 1, 128);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void get(String str) {
        int i = getWarnings;
        int i2 = (((i | 3) << 1) - (i ^ 3)) % 128;
        ThreeDS2ServiceInstance = i2;
        this.initialize = str;
        getWarnings = (i2 + 5) % 128;
    }
}
