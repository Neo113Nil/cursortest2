package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC2060kY<EnumC1063Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2060kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1071Lz A04(EnumC1063Lr enumC1063Lr) {
        return new C1071Lz(this, enumC1063Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC1063Lr.A03());
    }
}
