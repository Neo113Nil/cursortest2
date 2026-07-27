package com.appsflyer.internal;

/* loaded from: classes4.dex */
public final class AFk1pSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void getCurrencyIso4217Code(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int getRevenue(int i) {
        AFj1aSDK aFj1aSDK = AFj1aSDK.getCurrencyIso4217Code;
        return ((aFj1aSDK.getMonetizationNetwork[0][(i >>> 24) & 255] + aFj1aSDK.getMonetizationNetwork[1][(i >>> 16) & 255]) ^ aFj1aSDK.getMonetizationNetwork[2][(i >>> 8) & 255]) + aFj1aSDK.getMonetizationNetwork[3][i & 255];
    }
}
