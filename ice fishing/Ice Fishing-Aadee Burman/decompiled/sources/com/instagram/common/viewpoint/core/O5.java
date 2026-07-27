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

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, c.f16317b, 81, 70, 71, c.f16317b, 93, c.f16317b, 93, 85, 88};
    }

    public static void A02(C1840gi c1840gi, AbstractC2005jd abstractC2005jd, boolean z3, O3 o32) {
        if (!C1290Up.A2E(c1840gi)) {
            C1246Sx c1246Sx = new C1246Sx(c1840gi);
            C1112No A07 = abstractC2005jd.A29().A0H().A07();
            c1246Sx.A0e(new VI(abstractC2005jd.A2E(), c1840gi.A0A()));
            if (A07 == null) {
                o32.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o32.AFG();
                return;
            }
            C1242St c1242St = new C1242St(A07.A0L(), abstractC2005jd.A1D(), abstractC2005jd.A10());
            c1242St.A04 = true;
            c1242St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1246Sx.A0Y(c1242St);
                    break;
            }
            c1246Sx.A0c(new C1244Sv(abstractC2005jd.A2C().A01(), -1, -1, abstractC2005jd.A1D(), abstractC2005jd.A10()));
            c1246Sx.A0c(new C1244Sv(A07.A0K(), -1, -1, abstractC2005jd.A1D(), abstractC2005jd.A10()));
            O0.A00(abstractC2005jd, c1246Sx, A00(5, 12, 71));
            c1246Sx.A0X(new C1983jA(c1840gi, o32, c1246Sx, A07, z3), new C1239Sq(abstractC2005jd.A1D(), abstractC2005jd.A10()));
            return;
        }
        o32.AFG();
    }
}
