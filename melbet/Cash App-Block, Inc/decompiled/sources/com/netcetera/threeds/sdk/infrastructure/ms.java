package com.netcetera.threeds.sdk.infrastructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class ms implements mu {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private js getWarnings;

    public js ThreeDS2Service() {
        int i = initialize;
        int i2 = (i | 25) << 1;
        int i3 = -(((~i) & 25) | (i & (-26)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        js jsVar = this.getWarnings;
        if (i5 == 0) {
            return jsVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public View bQ_(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        int i = initialize;
        int i2 = i & 71;
        int i3 = (i | 71) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void bR_(Bundle bundle, boolean z) {
        int i = ThreeDS2Service;
        int i2 = i ^ 23;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i & 23) | i2) << 1, ~(-i2), 1, 128);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void bS_(Bundle bundle, boolean z) {
        int i = initialize;
        int i2 = (((i ^ 85) | (i & 85)) << 1) - (((~i) & 85) | (i & (-86)));
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void get(boolean z) {
        int i = ThreeDS2Service;
        int i2 = i | 81;
        int i3 = i2 << 1;
        int i4 = -((~(i & 81)) & i2);
        initialize = ((i3 & i4) + (i4 | i3)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void getWarnings(boolean z) {
        int i = ThreeDS2Service;
        int i2 = i ^ 85;
        int i3 = (((i & 85) | i2) << 1) - i2;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void initialize(js jsVar) {
        int i = ThreeDS2Service;
        int i2 = (((i | 5) << 1) - (i ^ 5)) % 128;
        initialize = i2;
        this.getWarnings = jsVar;
        int i3 = i2 & 81;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3, ~((i2 ^ 81) | i3), 1, 128);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void initialize(boolean z) {
        int i = initialize;
        int i2 = i & 15;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~(-(-((i ^ 15) | i2))), 1, 128);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mu
    public void ThreeDS2Service(boolean z) {
        int i = initialize;
        int i2 = i ^ 99;
        int i3 = (i & 99) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
