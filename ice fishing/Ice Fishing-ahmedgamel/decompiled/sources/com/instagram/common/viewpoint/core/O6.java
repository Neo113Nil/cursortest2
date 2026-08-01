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

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 102);
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
    public static void A02(C1840gi c1840gi, C1246Sx c1246Sx, C07157l c07157l) {
        c1246Sx.A0d(new C1244Sv(c07157l.A2C().A01(), C1677e4.A04, C1677e4.A04, c07157l.A1D(), A00(17, 14, 113)));
        boolean A1g = c07157l.A1g();
        String A002 = A00(17, 14, 113);
        if (A1g) {
            C1242St c1242St = new C1242St(c07157l.A0x(), c07157l.A1D(), A002);
            c1242St.A04 = true;
            c1242St.A03 = A00(0, 5, 66);
            c1246Sx.A0Y(c1242St);
        }
        boolean A30 = C1290Up.A30(c1840gi, C1767fX.A03());
        C1242St c1242St2 = new C1242St(c07157l.A29().A0H().A09(), c07157l.A1D(), A00(17, 14, 113), c07157l.A29().A0H().A06());
        if (A1g && !A30) {
            c1246Sx.A0Y(c1242St2);
        } else {
            c1246Sx.A0b(c1242St2);
        }
        c1246Sx.A0d(new C1244Sv(c07157l.A29().A0H().A08(), O1.A00(c07157l.A29().A0H()), O1.A01(c07157l.A29().A0H()), c07157l.A1D(), A00(17, 14, 113)));
        O0.A00(c07157l, c1246Sx, A002);
        Iterator<String> it = c07157l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c1246Sx.A0d(new C1244Sv(url, -1, -1, c07157l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C1840gi c1840gi, C1246Sx c1246Sx, C07157l c07157l) {
        int i = 0;
        for (NR nr : c07157l.A2G()) {
            C1244Sv c1244Sv = new C1244Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c07157l.A1D(), A00(5, 12, 118));
            if (i == 0) {
                c1246Sx.A0c(c1244Sv);
            } else {
                c1246Sx.A0d(c1244Sv);
            }
            O0.A00(c07157l, c1246Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1246Sx.A0d(new C1244Sv(it.next(), -1, -1, c07157l.A1D(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1242St(nr.A0H().A09(), c07157l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
