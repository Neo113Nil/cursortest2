package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07307g extends AbstractC1995j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, c.f17105c, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C07307g(C1860gi c1860gi, O7 o72) {
        super(c1860gi, o72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j6) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j6));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC1831gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0P() {
        C2042ju c2042ju = (C2042ju) this.A01;
        if (c2042ju.A0R()) {
            N2 n22 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n22 != null) {
                this.A07.A0B(c2042ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0R(N1 n12, C1291Tw c1291Tw, C1289Tu c1289Tu, O8 o82) {
        C2042ju c2042ju = (C2042ju) n12;
        long currentTimeMillis = System.currentTimeMillis();
        C1992ix c1992ix = new C1992ix(this, o82, c2042ju, currentTimeMillis, c1289Tu);
        A0H().postDelayed(c1992ix, c1291Tw.A05().A05());
        c2042ju.A0L(this.A0B, new C1991iw(this, c1992ix, currentTimeMillis, c1289Tu), this.A09, o82, UK.A0K());
    }
}
