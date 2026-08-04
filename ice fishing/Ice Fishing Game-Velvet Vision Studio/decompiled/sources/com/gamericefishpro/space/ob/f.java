package com.gamericefishpro.space.ob;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final com.gamericefishpro.space.r9.h b;

    public f(j jVar, com.gamericefishpro.space.r9.h hVar) {
        this.a = jVar;
        this.b = hVar;
    }

    @Override // com.gamericefishpro.space.ob.i
    public final boolean a(com.gamericefishpro.space.pb.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.a(new a(str, bVar.e, bVar.f));
        return true;
    }

    @Override // com.gamericefishpro.space.ob.i
    public final boolean b(Exception exc) {
        this.b.b(exc);
        return true;
    }
}
