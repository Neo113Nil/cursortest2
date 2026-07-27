package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2092l5 implements L8 {
    public final C06464u A00 = new C06464u(new byte[4]);
    public final /* synthetic */ C2090l3 A01;

    public C2092l5(C2090l3 c2090l3) {
        this.A01 = c2090l3;
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void A5A(C06474v c06474v) {
        int secondHeaderByte;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int tableId = c06474v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c06474v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c06474v.A0g(6);
        int A07 = c06474v.A07() / 4;
        for (int i = 0; i < A07; i++) {
            c06474v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int A04 = this.A00.A04(13);
                sparseArray2 = this.A01.A0B;
                if (sparseArray2.get(A04) == null) {
                    sparseArray3 = this.A01.A0B;
                    sparseArray3.put(A04, new C2096l9(new C2091l4(this.A01, A04)));
                    C2090l3.A02(this.A01);
                }
            }
        }
        secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            sparseArray = this.A01.A0B;
            sparseArray.remove(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}
