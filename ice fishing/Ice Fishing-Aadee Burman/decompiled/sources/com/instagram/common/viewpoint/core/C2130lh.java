package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2130lh implements InterfaceC1004Jj {
    public final List<C2350pT> A00;

    public C2130lh(List<C2350pT> list) {
        this.A00 = list;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final List<C2350pT> A7X(long j6) {
        return j6 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final long A83(int i) {
        AbstractC06243y.A07(i == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A8a(long j6) {
        return j6 < 0 ? 0 : -1;
    }
}
