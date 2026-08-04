package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements com.gamericefishpro.space.o1.k0 {
    public static final k0 b = new k0(0);
    public static final k0 c = new k0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i) {
        this.a = i;
    }

    @Override // com.gamericefishpro.space.o1.k0
    public final com.gamericefishpro.space.o1.o a(long j, com.gamericefishpro.space.c3.l lVar, com.gamericefishpro.space.c3.c cVar) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float fJ = cVar.J(b0.a);
                return new com.gamericefishpro.space.o1.c0(new com.gamericefishpro.space.n1.c(0.0f, -fJ, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fJ));
            default:
                float fJ2 = cVar.J(b0.a);
                return new com.gamericefishpro.space.o1.c0(new com.gamericefishpro.space.n1.c(-fJ2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fJ2, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
