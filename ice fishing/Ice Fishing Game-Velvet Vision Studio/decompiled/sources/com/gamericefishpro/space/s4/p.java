package com.gamericefishpro.space.s4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public int a = 1;
    public final s b;
    public s c;
    public s d;
    public int e;
    public int f;

    public p(s sVar) {
        this.b = sVar;
        this.c = sVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        com.gamericefishpro.space.t4.a aVarB = this.c.b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.v).get(iA + aVarB.d) == 0) || this.e == 65039;
    }
}
