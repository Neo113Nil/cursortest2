package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, c.f17104b, 81, 70, 71, c.f17104b, 93, c.f17104b, 93, 85, 88};
    }

    public static void A02(C1860gi c1860gi, AbstractC2025jd abstractC2025jd, boolean z6, O3 o32) {
        if (!C1310Up.A2E(c1860gi)) {
            C1266Sx c1266Sx = new C1266Sx(c1860gi);
            C1132No A07 = abstractC2025jd.A29().A0H().A07();
            c1266Sx.A0e(new VI(abstractC2025jd.A2E(), c1860gi.A0A()));
            if (A07 == null) {
                o32.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o32.AFG();
                return;
            }
            C1262St c1262St = new C1262St(A07.A0L(), abstractC2025jd.A1D(), abstractC2025jd.A10());
            c1262St.A04 = true;
            c1262St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1266Sx.A0Y(c1262St);
                    break;
            }
            c1266Sx.A0c(new C1264Sv(abstractC2025jd.A2C().A01(), -1, -1, abstractC2025jd.A1D(), abstractC2025jd.A10()));
            c1266Sx.A0c(new C1264Sv(A07.A0K(), -1, -1, abstractC2025jd.A1D(), abstractC2025jd.A10()));
            O0.A00(abstractC2025jd, c1266Sx, A00(5, 12, 71));
            c1266Sx.A0X(new C2003jA(c1860gi, o32, c1266Sx, A07, z6), new C1259Sq(abstractC2025jd.A1D(), abstractC2025jd.A10()));
            return;
        }
        o32.AFG();
    }
}
