package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2293oE implements InterfaceC06935v {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, 39, 53, 35, 35, 36, 54, 47, 58, 22, 26, 1, 20, 21};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (A00(0, 4, 65).equals(com.instagram.common.viewpoint.core.C5C.A06) != false) goto L8;
     */
    static {
        boolean z6;
        A01();
        if (A00(8, 6, 91).equals(C5C.A05)) {
            if (!A00(4, 4, 66).equals(C5C.A06)) {
            }
            z6 = true;
            A01 = z6;
        }
        z6 = false;
        A01 = z6;
    }
}
