package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.eg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1734eg {
    public static byte[] A09;
    public final C0897Ek A02;
    public final C1964iS A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final E7 A04 = new E7() { // from class: com.facebook.ads.redexgen.X.4R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4F c4f) {
            String str;
            C1964iS c1964iS;
            str = C1734eg.this.A06;
            C1965iT c1965iT = new C1965iT(str, c4f.A03(), c4f.A01(), c4f.A02());
            if (c4f.A00() >= 0.05d) {
                c1965iT.A06(c4f.A01());
            }
            C1734eg.A00(C1734eg.this);
            c1964iS = C1734eg.this.A05;
            c1964iS.A04(c1965iT);
        }
    };
    public final EA A03 = new EA() { // from class: com.facebook.ads.redexgen.X.4Q
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            boolean z6;
            z6 = C1734eg.this.A08;
            if (z6) {
                C1734eg c1734eg = C1734eg.this;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c1734eg.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C1734eg(C0897Ek c0897Ek, String str, boolean z6, Map<String, String> map) {
        this.A06 = str;
        this.A02 = c0897Ek;
        this.A07 = map;
        this.A08 = z6;
        this.A05 = new C1964iS(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C1734eg c1734eg) {
        int i = c1734eg.A01;
        c1734eg.A01 = i + 1;
        return i;
    }

    public final Map<String, String> A06() {
        String A01 = C1964iS.A01(this.A05.A03());
        HashMap hashMap = new HashMap();
        if (this.A07 != null) {
            hashMap.putAll(this.A07);
        }
        if (A01 == null) {
            A01 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A01);
        hashMap.put(A02(11, 11, a.f22514Q), String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        hashMap.put(A02(0, 11, 8), String.valueOf(i));
        return hashMap;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
