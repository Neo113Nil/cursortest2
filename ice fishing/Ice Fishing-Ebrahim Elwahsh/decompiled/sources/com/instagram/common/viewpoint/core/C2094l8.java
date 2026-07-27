package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2094l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C06464v A02 = new C06464v();
    public final AnonymousClass53 A03;

    public C2094l8(int i, AnonymousClass53 anonymousClass53, int i4) {
        this.A00 = i;
        this.A03 = anonymousClass53;
        this.A01 = i4;
    }

    private C0942Gz A00(C06464v c06464v, long j9, long j10) {
        int A00;
        int A002;
        int A0A = c06464v.A0A();
        long j11 = -1;
        long j12 = -1;
        long lastPcrTimeUsInRange = b.f6539b;
        while (c06464v.A07() >= 188 && (A002 = (A00 = LI.A00(c06464v.A0l(), c06464v.A09(), A0A)) + 188) <= A0A) {
            long A01 = LI.A01(c06464v, A00, this.A00);
            if (A01 != b.f6539b) {
                long A06 = this.A03.A06(A01);
                if (A06 > j9) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == b.f6539b) {
                        return C0942Gz.A04(A06, j10);
                    }
                    return C0942Gz.A03(j10 + j11);
                }
                long j13 = A06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j13 > j9) {
                        return C0942Gz.A03(A00 + j10);
                    }
                    j11 = A00;
                    lastPcrTimeUsInRange = A06;
                } else {
                    A04[4] = "5ynNf";
                    if (j13 > j9) {
                        return C0942Gz.A03(A00 + j10);
                    }
                    j11 = A00;
                    lastPcrTimeUsInRange = A06;
                }
            }
            c06464v.A0f(A002);
            j12 = A002;
        }
        if (lastPcrTimeUsInRange != b.f6539b) {
            return C0942Gz.A05(lastPcrTimeUsInRange, j10 + j12);
        }
        return C0942Gz.A03;
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0942Gz AIw(InterfaceC2190ms interfaceC2190ms, long j9) throws IOException {
        long A8n = interfaceC2190ms.A8n();
        int min = (int) Math.min(this.A01, interfaceC2190ms.A8O() - A8n);
        this.A02.A0d(min);
        interfaceC2190ms.AGt(this.A02.A0l(), 0, min);
        return A00(this.A02, j9, A8n);
    }
}
