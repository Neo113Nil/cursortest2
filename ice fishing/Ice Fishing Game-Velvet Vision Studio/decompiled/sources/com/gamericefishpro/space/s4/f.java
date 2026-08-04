package com.gamericefishpro.space.s4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public int a;
    public final Object b;
    public final Object c;

    public f(int i, String identityHash, String legacyIdentityHash) {
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyIdentityHash, "legacyIdentityHash");
        this.a = i;
        this.b = identityHash;
        this.c = legacyIdentityHash;
    }

    public abstract void a(com.gamericefishpro.space.c6.a aVar);

    public abstract void b(com.gamericefishpro.space.c6.a aVar);

    public abstract void c(com.gamericefishpro.space.c6.a aVar);

    public abstract void d(com.gamericefishpro.space.c6.a aVar);

    public abstract void e(com.gamericefishpro.space.c6.a aVar);

    public abstract void f(com.gamericefishpro.space.c6.a aVar);

    public abstract com.gamericefishpro.space.o8.a g(com.gamericefishpro.space.c6.a aVar);

    public f(j jVar) {
        this.a = 0;
        this.c = new c();
        this.b = jVar;
    }
}
