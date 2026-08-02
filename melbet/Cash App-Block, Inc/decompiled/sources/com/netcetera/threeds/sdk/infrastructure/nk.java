package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class nk {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r2 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        throw com.netcetera.threeds.sdk.infrastructure.setTextAlignment.getExpiryDate.initialize(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        r2 = com.netcetera.threeds.sdk.infrastructure.nk.ThreeDS2Service;
        r3 = (r2 & 39) + (r2 | 39);
        com.netcetera.threeds.sdk.infrastructure.nk.getWarnings = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if ((r3 % 2) == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service(String str) {
        int i = getWarnings;
        int i2 = i & 41;
        int i3 = (i ^ 41) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.nk.ThreeDS2Service;
        r2 = r0 ^ 115;
        com.netcetera.threeds.sdk.infrastructure.nk.getWarnings = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1(((r0 & 115) | r2) << 1, ~(-r2), 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005b, code lost:
    
        throw com.netcetera.threeds.sdk.infrastructure.setTextAlignment.values.initialize(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.nk.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.nk.ThreeDS2Service = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r5 & 56, r5 | 56, 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(String str) {
        int i = ThreeDS2Service;
        int i2 = (i ^ 9) + ((i & 9) << 1);
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }
}
