package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2095l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C06474v A02 = new C06474v();
    public final AnonymousClass53 A03;

    public C2095l8(int i, AnonymousClass53 anonymousClass53, int i6) {
        this.A00 = i;
        this.A03 = anonymousClass53;
        this.A01 = i6;
    }

    private C0943Gz A00(C06474v c06474v, long j6, long j9) {
        int A00;
        int A002;
        int A0A = c06474v.A0A();
        long j10 = -1;
        long j11 = -1;
        long lastPcrTimeUsInRange = b.f6382b;
        while (c06474v.A07() >= 188 && (A002 = (A00 = LI.A00(c06474v.A0l(), c06474v.A09(), A0A)) + 188) <= A0A) {
            long A01 = LI.A01(c06474v, A00, this.A00);
            if (A01 != b.f6382b) {
                long A06 = this.A03.A06(A01);
                if (A06 > j6) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == b.f6382b) {
                        return C0943Gz.A04(A06, j9);
                    }
                    return C0943Gz.A03(j9 + j10);
                }
                long j12 = A06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j12 > j6) {
                        return C0943Gz.A03(A00 + j9);
                    }
                    j10 = A00;
                    lastPcrTimeUsInRange = A06;
                } else {
                    A04[4] = "5ynNf";
                    if (j12 > j6) {
                        return C0943Gz.A03(A00 + j9);
                    }
                    j10 = A00;
                    lastPcrTimeUsInRange = A06;
                }
            }
            c06474v.A0f(A002);
            j11 = A002;
        }
        if (lastPcrTimeUsInRange != b.f6382b) {
            return C0943Gz.A05(lastPcrTimeUsInRange, j9 + j11);
        }
        return C0943Gz.A03;
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0943Gz AIw(InterfaceC2191ms interfaceC2191ms, long j6) throws IOException {
        long A8n = interfaceC2191ms.A8n();
        int min = (int) Math.min(this.A01, interfaceC2191ms.A8O() - A8n);
        this.A02.A0d(min);
        interfaceC2191ms.AGt(this.A02.A0l(), 0, min);
        return A00(this.A02, j6, A8n);
    }
}
