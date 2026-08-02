package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\b\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"", "", "<init>", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = j.f6602W)
/* renamed from: com.facebook.ads.redexgen.X.qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2447qq {
    public static byte[] A00;
    public static String[] A01 = {"e7AwhByPjRPUw6TPvHQ97hdZd1", "BA53CFSFXKNaueAmPJEc9hkRINMpWiHX", "eg", "BOBLIBOzzfVObnmt242WmA3oiPmYKJxA", "5X54btT7YSWi6fK", "vwsHu7ibsWkpW0OsiHz", "pfFn7t8nBopYri9", "k"};
    public static final C2447qq A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = copyOfRange[i9] ^ i6;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "yY0Pcbq111zueav";
            strArr2[6] = "lktBBxSgK8ahxIm";
            copyOfRange[i9] = (byte) (i10 ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 31, 4, 28, 25, 30, 94, 37, 30, 25, 4};
    }

    static {
        A01();
        A02 = new C2447qq();
    }

    public final String toString() {
        return A00(0, 11, 33);
    }
}
