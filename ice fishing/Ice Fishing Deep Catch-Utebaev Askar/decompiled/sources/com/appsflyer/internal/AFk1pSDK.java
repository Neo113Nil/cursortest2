package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1pSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void getCurrencyIso4217Code(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int getRevenue(int i2) {
        int[][] iArr = AFj1aSDK.getCurrencyIso4217Code.getMonetizationNetwork;
        return ((iArr[0][(i2 >>> 24) & 255] + iArr[1][(i2 >>> 16) & 255]) ^ iArr[2][(i2 >>> 8) & 255]) + iArr[3][i2 & 255];
    }
}
