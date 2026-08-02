package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class setContentInsetsAbsolute implements setNetworkAvailable {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final Runnable initialize;

    public setContentInsetsAbsolute(Runnable runnable) {
        this.initialize = runnable;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void ThreeDS2Service(setCursorVisible setcursorvisible) {
        int i = ThreeDS2Service;
        int i2 = (i ^ 115) + ((i & 115) << 1);
        get = i2 % 128;
        int i3 = i2 % 2;
        Runnable runnable = this.initialize;
        if (i3 != 0) {
            runnable.run();
            throw null;
        }
        runnable.run();
        int i4 = ThreeDS2Service;
        int i5 = ((i4 ^ 85) | (i4 & 85)) << 1;
        int i6 = -(((~i4) & 85) | (i4 & (-86)));
        int i7 = (i5 & i6) + (i6 | i5);
        get = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
        int i = ThreeDS2Service;
        int i2 = i & 95;
        int i3 = (i ^ 95) | i2;
        get = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        this.initialize.run();
        int i4 = ThreeDS2Service;
        int i5 = (i4 ^ 51) + ((i4 & 51) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void get(setScrollCaptureCallback setscrollcapturecallback) {
        int i = get;
        int i2 = i ^ 67;
        int i3 = ((i & 67) | i2) << 1;
        int i4 = -i2;
        ThreeDS2Service = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        this.initialize.run();
        get = (ThreeDS2Service + 69) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void initialize(setScrollCaptureCallback setscrollcapturecallback) {
        int i = get;
        int i2 = i ^ 75;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i & 75) | i2) << 1, ~(-i2), 1, 128);
        this.initialize.run();
        int i3 = get;
        int i4 = i3 & 61;
        int i5 = (((i3 ^ 61) | i4) << 1) - ((i3 | 61) & (~i4));
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void ThreeDS2Service(setScroller setscroller) {
        ThreeDS2Service = (get + 43) % 128;
        this.initialize.run();
        int i = get;
        int i2 = ((i & 4) + (i | 4)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
    public void ThreeDS2Service(setScrollCaptureCallback setscrollcapturecallback) {
        int i = get;
        ThreeDS2Service = ((i ^ 29) + ((i & 29) << 1)) % 128;
        this.initialize.run();
        int i2 = get;
        int i3 = ((i2 ^ 87) - (~(-(-((i2 & 87) << 1))))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
