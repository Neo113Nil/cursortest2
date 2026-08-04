package com.gamericefishpro.space.s5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.d6.c {
    public final /* synthetic */ p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, int i) {
        super(i);
        this.b = pVar;
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void g(com.gamericefishpro.space.e6.c db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.b.d(new com.gamericefishpro.space.v5.a(db));
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void h(com.gamericefishpro.space.e6.c db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        j(db, i, i2);
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void i(com.gamericefishpro.space.e6.c db) throws Throwable {
        Intrinsics.checkNotNullParameter(db, "db");
        com.gamericefishpro.space.v5.a aVar = new com.gamericefishpro.space.v5.a(db);
        p pVar = this.b;
        pVar.f(aVar);
        pVar.g = db;
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void j(com.gamericefishpro.space.e6.c db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.b.e(new com.gamericefishpro.space.v5.a(db), i, i2);
    }
}
