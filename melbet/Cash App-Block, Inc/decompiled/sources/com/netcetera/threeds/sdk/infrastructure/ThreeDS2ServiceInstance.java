package com.netcetera.threeds.sdk.infrastructure;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public class ThreeDS2ServiceInstance {
    public static void ThreeDS2Service(long[] jArr, long[] jArr2, int i) {
        long j = jArr[i % 4] * 2147483085;
        long j2 = jArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j2) / 2147483647L;
        jArr[i2] = (j + j2) % 2147483647L;
    }

    private static long ThreeDS2ServiceInstance(long j, int i) {
        return getWarnings(j, 1812433253L, 30, i);
    }

    private static long getWarnings(long j, long j2, int i, int i2) {
        return (j2 * (j ^ (j >> i))) + i2;
    }

    public static long[] initialize(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & BodyPartID.bodyIdMax) | ((i & BodyPartID.bodyIdMax) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = ThreeDS2ServiceInstance(jArr[i3 - 1], i3);
        }
        return jArr;
    }
}
