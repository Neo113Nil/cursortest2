package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2042kE extends AbstractC1092Mt {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, c.f16318c, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C2042kE.class.getSimpleName();
    }

    public C2042kE(C1840gi c1840gi, VA va, String str, Uri uri) {
        super(c1840gi, va, str);
        this.A00 = uri;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1092Mt
    public final EnumC1089Mq A0G(String str) {
        try {
            X6.A0E(new X6(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC1089Mq.A09;
    }
}
