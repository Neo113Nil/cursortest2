package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFk1zSDK {
    public static void AFAdRevenueData(byte[] bArr, byte b2, long j2) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (((1 << i2) & j2) != 0) {
                bArr[i2] = (byte) (bArr[i2] ^ b2);
            }
        }
    }
}
