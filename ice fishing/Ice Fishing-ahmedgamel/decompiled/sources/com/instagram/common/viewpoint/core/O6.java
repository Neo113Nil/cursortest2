package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(C1860gi c1860gi, C1266Sx c1266Sx, C07357l c07357l) {
        c1266Sx.A0d(new C1264Sv(c07357l.A2C().A01(), C1697e4.A04, C1697e4.A04, c07357l.A1D(), A00(17, 14, 113)));
        boolean A1g = c07357l.A1g();
        String A002 = A00(17, 14, 113);
        if (A1g) {
            C1262St c1262St = new C1262St(c07357l.A0x(), c07357l.A1D(), A002);
            c1262St.A04 = true;
            c1262St.A03 = A00(0, 5, 66);
            c1266Sx.A0Y(c1262St);
        }
        boolean A30 = C1310Up.A30(c1860gi, C1787fX.A03());
        C1262St c1262St2 = new C1262St(c07357l.A29().A0H().A09(), c07357l.A1D(), A00(17, 14, 113), c07357l.A29().A0H().A06());
        if (A1g && !A30) {
            c1266Sx.A0Y(c1262St2);
        } else {
            c1266Sx.A0b(c1262St2);
        }
        c1266Sx.A0d(new C1264Sv(c07357l.A29().A0H().A08(), O1.A00(c07357l.A29().A0H()), O1.A01(c07357l.A29().A0H()), c07357l.A1D(), A00(17, 14, 113)));
        O0.A00(c07357l, c1266Sx, A002);
        Iterator<String> it = c07357l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c1266Sx.A0d(new C1264Sv(url, -1, -1, c07357l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C1860gi c1860gi, C1266Sx c1266Sx, C07357l c07357l) {
        int i = 0;
        for (NR nr : c07357l.A2G()) {
            C1264Sv c1264Sv = new C1264Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c07357l.A1D(), A00(5, 12, 118));
            if (i == 0) {
                c1266Sx.A0c(c1264Sv);
            } else {
                c1266Sx.A0d(c1264Sv);
            }
            O0.A00(c07357l, c1266Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1266Sx.A0d(new C1264Sv(it.next(), -1, -1, c07357l.A1D(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1262St(nr.A0H().A09(), c07357l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
