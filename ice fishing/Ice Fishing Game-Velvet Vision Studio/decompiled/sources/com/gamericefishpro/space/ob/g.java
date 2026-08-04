package com.gamericefishpro.space.ob;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {
    public final com.gamericefishpro.space.r9.h a;

    public g(com.gamericefishpro.space.r9.h hVar) {
        this.a = hVar;
    }

    @Override // com.gamericefishpro.space.ob.i
    public final boolean a(com.gamericefishpro.space.pb.b bVar) {
        int i = bVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.c(bVar.a);
        return true;
    }

    @Override // com.gamericefishpro.space.ob.i
    public final boolean b(Exception exc) {
        return false;
    }
}
