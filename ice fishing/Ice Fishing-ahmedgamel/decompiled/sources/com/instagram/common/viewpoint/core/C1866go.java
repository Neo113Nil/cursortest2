package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.go, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1866go extends AbstractRunnableC1347Wc {
    public static byte[] A02;
    public final /* synthetic */ C1865gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1866go(C1865gn c1865gn, AtomicBoolean atomicBoolean) {
        this.A00 = c1865gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        T8 t82;
        long j6;
        T8 t83;
        long j9;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(VH.A0H);
                t83 = this.A00.A02.A04;
                C1259Sq c1259Sq = this.A00.A01;
                int i = T0.A00;
                j9 = this.A00.A02.A00;
                T0.A02(t83, c1259Sq, i, A00(11, 14, 1), j9);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(VH.A0G);
            t82 = this.A00.A02.A04;
            C1259Sq c1259Sq2 = this.A00.A01;
            int i4 = T0.A04;
            j6 = this.A00.A02.A00;
            T0.A02(t82, c1259Sq2, i4, A00(0, 11, 125), j6);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
