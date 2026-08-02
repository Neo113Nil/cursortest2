package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setImeHintLocales {
    private static int cleanup = 1;
    private static int createTransaction;
    private final fillInStackTrace ThreeDS2Service;
    private final getStackTrace ThreeDS2ServiceInitializationCallback;
    private final setStackTrace ThreeDS2ServiceInstance;
    private final String get;
    private final printStackTrace getSDKInfo;
    private final notifyAll getWarnings;
    private final Integer initialize;

    public setImeHintLocales(fillInStackTrace fillinstacktrace, notifyAll notifyall, setStackTrace setstacktrace, Integer num, String str, printStackTrace printstacktrace, getStackTrace getstacktrace) {
        this.ThreeDS2Service = fillinstacktrace;
        this.getWarnings = notifyall;
        this.ThreeDS2ServiceInstance = setstacktrace;
        this.initialize = num;
        this.get = str;
        this.getSDKInfo = printstacktrace;
        this.ThreeDS2ServiceInitializationCallback = getstacktrace;
    }

    public Integer ThreeDS2Service() {
        int i = createTransaction;
        int i2 = i & 71;
        int i3 = -(-(i | 71));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.initialize;
        if (i5 != 0) {
            return num;
        }
        throw null;
    }

    public printStackTrace ThreeDS2ServiceInitializationCallback() {
        int i = createTransaction;
        int i2 = i & 25;
        int i3 = (((i | 25) & (~i2)) + (i2 << 1)) % 128;
        cleanup = i3;
        printStackTrace printstacktrace = this.getSDKInfo;
        createTransaction = (((i3 | 37) << 1) - (i3 ^ 37)) % 128;
        return printstacktrace;
    }

    public fillInStackTrace ThreeDS2ServiceInstance() {
        int i = cleanup;
        int i2 = i & 63;
        int i3 = ((~i2) & (i | 63)) + (i2 << 1);
        createTransaction = i3 % 128;
        int i4 = i3 % 2;
        fillInStackTrace fillinstacktrace = this.ThreeDS2Service;
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i ^ 55;
        int i7 = ((i & 55) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        createTransaction = i9 % 128;
        if (i9 % 2 == 0) {
            return fillinstacktrace;
        }
        throw null;
    }

    public getStackTrace cleanup() {
        int i = createTransaction;
        int i2 = i ^ 51;
        int i3 = -(-((i & 51) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        getStackTrace getstacktrace = this.ThreeDS2ServiceInitializationCallback;
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
        return getstacktrace;
    }

    public boolean createTransaction() {
        int i = createTransaction;
        int i2 = i & 125;
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 125) & (~i2), ~(-(-(i2 << 1))), 1, 128);
        boolean ThreeDS2Service = og.ThreeDS2Service(this.ThreeDS2Service, this.getWarnings, this.ThreeDS2ServiceInstance, this.initialize, this.get, this.getSDKInfo, this.ThreeDS2ServiceInitializationCallback);
        int i3 = cleanup + 119;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public notifyAll get() {
        int i = cleanup;
        int i2 = (-2) - ((i + 14) ^ (-1));
        createTransaction = i2 % 128;
        int i3 = i2 % 2;
        notifyAll notifyall = this.getWarnings;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i + 65;
        createTransaction = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return notifyall;
    }

    public String getWarnings() {
        int i = createTransaction;
        int i2 = i + 63;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        String str = this.get;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = ((i ^ 107) | (i & 107)) << 1;
        int i6 = -(((~i) & 107) | (i & (-108)));
        cleanup = ((i5 & i6) + (i6 | i5)) % 128;
        return str;
    }

    public setStackTrace initialize() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        setStackTrace setstacktrace = this.ThreeDS2ServiceInstance;
        int i = createTransaction;
        int i2 = ((i ^ 85) | (i & 85)) << 1;
        int i3 = -(((~i) & 85) | (i & (-86)));
        cleanup = ((i2 & i3) + (i3 | i2)) % 128;
        return setstacktrace;
    }
}
