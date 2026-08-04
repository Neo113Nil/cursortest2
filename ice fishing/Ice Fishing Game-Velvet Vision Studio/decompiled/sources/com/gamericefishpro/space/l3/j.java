package com.gamericefishpro.space.l3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // com.gamericefishpro.space.l3.d
    public final void a(d dVar) {
        com.gamericefishpro.space.k3.a aVar = (com.gamericefishpro.space.k3.a) this.b;
        int i = aVar.r0;
        f fVar = this.h;
        ArrayList arrayList = fVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((f) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + aVar.t0);
        } else {
            fVar.d(i2 + aVar.t0);
        }
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void d() {
        com.gamericefishpro.space.k3.d dVar = this.b;
        if (dVar instanceof com.gamericefishpro.space.k3.a) {
            f fVar = this.h;
            fVar.b = true;
            ArrayList arrayList = fVar.l;
            com.gamericefishpro.space.k3.a aVar = (com.gamericefishpro.space.k3.a) dVar;
            int i = aVar.r0;
            boolean z = aVar.s0;
            int i2 = 0;
            if (i == 0) {
                fVar.e = 4;
                while (i2 < aVar.q0) {
                    com.gamericefishpro.space.k3.d dVar2 = aVar.p0[i2];
                    if (z || dVar2.f0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                fVar.e = 5;
                while (i2 < aVar.q0) {
                    com.gamericefishpro.space.k3.d dVar3 = aVar.p0[i2];
                    if (z || dVar3.f0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                fVar.e = 6;
                while (i2 < aVar.q0) {
                    com.gamericefishpro.space.k3.d dVar4 = aVar.p0[i2];
                    if (z || dVar4.f0 != 8) {
                        f fVar4 = dVar4.e.h;
                        fVar4.k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.e = 7;
            while (i2 < aVar.q0) {
                com.gamericefishpro.space.k3.d dVar5 = aVar.p0[i2];
                if (z || dVar5.f0 != 8) {
                    f fVar5 = dVar5.e.i;
                    fVar5.k.add(fVar);
                    arrayList.add(fVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void e() {
        com.gamericefishpro.space.k3.d dVar = this.b;
        if (dVar instanceof com.gamericefishpro.space.k3.a) {
            int i = ((com.gamericefishpro.space.k3.a) dVar).r0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.X = fVar.g;
            } else {
                dVar.Y = fVar.g;
            }
        }
    }

    @Override // com.gamericefishpro.space.l3.o
    public final void f() {
        this.c = null;
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
