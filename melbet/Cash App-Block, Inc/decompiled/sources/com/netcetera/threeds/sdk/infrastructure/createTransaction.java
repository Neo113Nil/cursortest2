package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class createTransaction {
    public int get;
    public int getWarnings;
    public int initialize;

    public static int ThreeDS2Service(int i) {
        int[][] iArr = ThreeDS2Service.get.getWarnings;
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static void ThreeDS2ServiceInstance(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
