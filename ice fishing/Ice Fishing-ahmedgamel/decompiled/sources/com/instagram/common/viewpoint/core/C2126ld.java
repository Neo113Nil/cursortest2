package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2126ld implements InterfaceC1004Jj {
    public final long[] A00;
    public final C2350pT[] A01;

    public C2126ld(C2350pT[] c2350pTArr, long[] jArr) {
        this.A01 = c2350pTArr;
        this.A00 = jArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final List<C2350pT> A7X(long j6) {
        int A0L = C5C.A0L(this.A00, j6, true, false);
        if (A0L == -1 || this.A01[A0L] == C2350pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0L]);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final long A83(int i) {
        boolean z3 = true;
        AbstractC06243y.A07(i >= 0);
        if (i >= this.A00.length) {
            z3 = false;
        }
        AbstractC06243y.A07(z3);
        return this.A00[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A8a(long j6) {
        int A0K = C5C.A0K(this.A00, j6, false, false);
        int index = this.A00.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
