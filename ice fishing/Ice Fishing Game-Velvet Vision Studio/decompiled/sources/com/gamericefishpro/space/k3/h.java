package com.gamericefishpro.space.k3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public c s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public h() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // com.gamericefishpro.space.k3.d
    public final void L(com.gamericefishpro.space.i3.c cVar, boolean z) {
        if (this.S == null) {
            return;
        }
        c cVar2 = this.s0;
        cVar.getClass();
        int iN = com.gamericefishpro.space.i3.c.n(cVar2);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.s0 = this.H;
        } else {
            this.s0 = this.I;
        }
        arrayList.add(this.s0);
        c[] cVarArr = this.P;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.s0;
        }
    }

    @Override // com.gamericefishpro.space.k3.d
    public final void b(com.gamericefishpro.space.i3.c cVar, boolean z) {
        e eVar = (e) this.S;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.S;
        boolean z2 = dVar != null && dVar.o0[0] == 2;
        if (this.t0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.S;
            z2 = dVar2 != null && dVar2.o0[1] == 2;
        }
        if (this.u0) {
            c cVar2 = this.s0;
            if (cVar2.c) {
                com.gamericefishpro.space.i3.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.s0.d());
                if (this.q0 != -1) {
                    if (z2) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    com.gamericefishpro.space.i3.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            com.gamericefishpro.space.i3.f fVarK3 = cVar.k(this.s0);
            cVar.e(fVarK3, cVar.k(objI), this.q0, 8);
            if (z2) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            com.gamericefishpro.space.i3.f fVarK4 = cVar.k(this.s0);
            com.gamericefishpro.space.i3.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.r0, 8);
            if (z2) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            com.gamericefishpro.space.i3.f fVarK6 = cVar.k(this.s0);
            com.gamericefishpro.space.i3.f fVarK7 = cVar.k(objI2);
            float f = this.p0;
            com.gamericefishpro.space.i3.b bVarL = cVar.l();
            bVarL.d.g(fVarK6, -1.0f);
            bVarL.d.g(fVarK7, f);
            cVar.c(bVarL);
        }
    }

    @Override // com.gamericefishpro.space.k3.d
    public final boolean c() {
        return true;
    }

    @Override // com.gamericefishpro.space.k3.d
    public final c i(int i) {
        int iB = com.gamericefishpro.space.i3.e.b(i);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.k3.d
    public final boolean x() {
        return this.u0;
    }

    @Override // com.gamericefishpro.space.k3.d
    public final boolean y() {
        return this.u0;
    }
}
