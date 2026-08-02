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

    public static LO A00(InterfaceC2211ms interfaceC2211ms, C06674v c06674v) throws IOException {
        interfaceC2211ms.AGt(c06674v.A0l(), 0, 8);
        c06674v.A0f(0);
        int A0C = c06674v.A0C();
        long size = c06674v.A0O();
        return new LO(A0C, size);
    }
}
