package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j6) {
        this.A00 = i;
        this.A01 = j6;
    }

    public static LO A00(InterfaceC2191ms interfaceC2191ms, C06474v c06474v) throws IOException {
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 8);
        c06474v.A0f(0);
        int A0C = c06474v.A0C();
        long size = c06474v.A0O();
        return new LO(A0C, size);
    }
}
