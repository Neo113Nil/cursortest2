package com.appsflyer.internal;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AFk1sSDK {
    public static long[] getCurrencyIso4217Code(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & BodyPartID.bodyIdMax) | ((i & BodyPartID.bodyIdMax) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }
}
