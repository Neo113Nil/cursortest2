package com.gamericefishpro.space.sa;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends p {
    public final /* synthetic */ com.gamericefishpro.space.r9.h e;
    public final /* synthetic */ com.gamericefishpro.space.qa.e i;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d dVar, com.gamericefishpro.space.r9.h hVar, com.gamericefishpro.space.r9.h hVar2, com.gamericefishpro.space.qa.e eVar) {
        super(hVar);
        this.v = dVar;
        this.e = hVar2;
        this.i = eVar;
    }

    @Override // com.gamericefishpro.space.sa.p
    public final void b() {
        synchronized (this.v.f) {
            try {
                d dVar = this.v;
                com.gamericefishpro.space.r9.h hVar = this.e;
                dVar.e.add(hVar);
                hVar.a.addOnCompleteListener(new com.gamericefishpro.space.u6.c(dVar, hVar));
                if (this.v.l.getAndIncrement() > 0) {
                    this.v.b.a("Already connected to the service.", new Object[0]);
                }
                d.b(this.v, this.i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
