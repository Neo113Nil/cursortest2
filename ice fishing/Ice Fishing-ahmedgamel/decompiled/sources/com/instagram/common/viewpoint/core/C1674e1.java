package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1674e1 implements InterfaceC1789ft {
    public static byte[] A01;
    public final C1836ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, Byte.MAX_VALUE, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C1674e1(C1836ge c1836ge) {
        this.A00 = c1836ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1789ft
    public final Map<String, String> A6g(boolean z3) {
        HashMap hashMap = new HashMap();
        if (!SZ.A00().A04()) {
            hashMap.put(A00(0, 23, 64), UG.A00().A01(this.A00, true).A04());
        }
        hashMap.put(A00(23, 10, 51), UJ.A06(new C1263To(this.A00), this.A00, z3));
        return hashMap;
    }
}
