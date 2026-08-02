package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setCustomInsertionActionModeCallback implements setIncludeFontPadding {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int cleanup = 1;
    private String ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private final me get;
    private Bitmap getWarnings;
    private Bitmap initialize;

    public setCustomInsertionActionModeCallback(me meVar) {
        this.get = meVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void P_(Bitmap bitmap) {
        int i = cleanup;
        this.getWarnings = bitmap;
        int i2 = i & 67;
        int i3 = (~i2) & (i | 67);
        int i4 = -(-(i2 << 1));
        ThreeDS2ServiceInitializationCallback = ((i3 & i4) + (i4 | i3)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void Q_(Bitmap bitmap) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = ((i | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        cleanup = i4;
        if (i3 % 2 == 0) {
            this.initialize = bitmap;
            throw null;
        }
        this.initialize = bitmap;
        ThreeDS2ServiceInitializationCallback = ((-2) - ((((i4 | 52) << 1) - (i4 ^ 52)) ^ (-1))) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public Bitmap R_() {
        Bitmap bitmap;
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 27;
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 27) | i2) << 1, ~(-((i | 27) & (~i2))), 1, 128);
        if (this.get.ThreeDS2Service()) {
            int i3 = ThreeDS2ServiceInitializationCallback;
            bitmap = this.initialize;
            cleanup = (i3 + 73) % 128;
        } else {
            bitmap = this.getWarnings;
            int i4 = ThreeDS2ServiceInitializationCallback;
            int i5 = i4 & 33;
            int i6 = -(-((i4 ^ 33) | i5));
            cleanup = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        }
        Bitmap bitmap2 = (Bitmap) og.ThreeDS2Service(bitmap, this.getWarnings);
        int i7 = cleanup;
        int i8 = i7 & 125;
        ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1((i7 | 125) & (~i8), ~(i8 << 1), 1, 128);
        return bitmap2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i & 99;
        int i3 = ((((i ^ 99) | i2) << 1) - (~(-((i | 99) & (~i2))))) - 1;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public String get() {
        int i = cleanup;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 9) | (i & 9)) << 1, ~(-(((~i) & 9) | (i & (-10)))), 1, 128);
        ThreeDS2ServiceInitializationCallback = m$1;
        String str = this.ThreeDS2Service;
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1(m$1 & 125, ~(m$1 | 125), 1, 128);
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void getWarnings(String str) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i | 27) << 1;
        int i3 = -(((~i) & 27) | (i & (-28)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            this.ThreeDS2ServiceInstance = str;
        } else {
            this.ThreeDS2ServiceInstance = str;
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIncludeFontPadding
    public void get(String str) {
        int i = cleanup;
        this.ThreeDS2Service = str;
        int i2 = i & 67;
        int i3 = (i ^ 67) | i2;
        ThreeDS2ServiceInitializationCallback = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
    }
}
