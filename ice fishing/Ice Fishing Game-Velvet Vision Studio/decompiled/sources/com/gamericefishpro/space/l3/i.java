package com.gamericefishpro.space.l3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // com.gamericefishpro.space.l3.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.c && !fVar.j) {
            fVar.d((int) ((((f) fVar.l.get(0)).g * ((com.gamericefishpro.space.k3.h) this.b).p0) + 0.5f));
        }
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void d() {
        com.gamericefishpro.space.k3.d dVar = this.b;
        com.gamericefishpro.space.k3.h hVar = (com.gamericefishpro.space.k3.h) dVar;
        int i = hVar.q0;
        int i2 = hVar.r0;
        int i3 = hVar.t0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.l.add(dVar.S.d.h);
                this.b.S.d.h.k.add(fVar);
                fVar.f = i;
            } else if (i2 != -1) {
                fVar.l.add(dVar.S.d.i);
                this.b.S.d.i.k.add(fVar);
                fVar.f = -i2;
            } else {
                fVar.b = true;
                fVar.l.add(dVar.S.d.i);
                this.b.S.d.i.k.add(fVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fVar.l.add(dVar.S.e.h);
            this.b.S.e.h.k.add(fVar);
            fVar.f = i;
        } else if (i2 != -1) {
            fVar.l.add(dVar.S.e.i);
            this.b.S.e.i.k.add(fVar);
            fVar.f = -i2;
        } else {
            fVar.b = true;
            fVar.l.add(dVar.S.e.i);
            this.b.S.e.i.k.add(fVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void e() {
        com.gamericefishpro.space.k3.d dVar = this.b;
        int i = ((com.gamericefishpro.space.k3.h) dVar).t0;
        f fVar = this.h;
        if (i == 1) {
            dVar.X = fVar.g;
        } else {
            dVar.Y = fVar.g;
        }
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void f() {
        this.h.c();
    }

    @Override // com.gamericefishpro.space.l3.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.k.add(fVar);
        fVar.l.add(fVar2);
    }
}
