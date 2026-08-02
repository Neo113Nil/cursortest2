package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC2081kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2081kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1092Lz A04(M5 m52) {
        return new C1092Lz(this, m52 == null ? A00(0, 4, 114) : m52.A03());
    }
}
