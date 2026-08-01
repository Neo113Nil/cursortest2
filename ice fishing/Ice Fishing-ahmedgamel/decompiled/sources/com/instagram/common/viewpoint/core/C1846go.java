package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.go, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1846go extends AbstractRunnableC1327Wc {
    public static byte[] A02;
    public final /* synthetic */ C1845gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1846go(C1845gn c1845gn, AtomicBoolean atomicBoolean) {
        this.A00 = c1845gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        T8 t82;
        long j6;
        T8 t83;
        long j9;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(VH.A0H);
                t83 = this.A00.A02.A04;
                C1239Sq c1239Sq = this.A00.A01;
                int i = T0.A00;
                j9 = this.A00.A02.A00;
                T0.A02(t83, c1239Sq, i, A00(11, 14, 1), j9);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(VH.A0G);
            t82 = this.A00.A02.A04;
            C1239Sq c1239Sq2 = this.A00.A01;
            int i6 = T0.A04;
            j6 = this.A00.A02.A00;
            T0.A02(t82, c1239Sq2, i6, A00(0, 11, 125), j6);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
