package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2041kE extends AbstractC1091Mt {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, c.f16476c, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C2041kE.class.getSimpleName();
    }

    public C2041kE(C1839gi c1839gi, VA va, String str, Uri uri) {
        super(c1839gi, va, str);
        this.A00 = uri;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1091Mt
    public final EnumC1088Mq A0G(String str) {
        try {
            X6.A0E(new X6(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC1088Mq.A09;
    }
}
