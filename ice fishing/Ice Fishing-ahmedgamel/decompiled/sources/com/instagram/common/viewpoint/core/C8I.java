package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC2081kY<EnumC1084Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2081kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1092Lz A04(EnumC1084Lr enumC1084Lr) {
        return new C1092Lz(this, enumC1084Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC1084Lr.A03());
    }
}
