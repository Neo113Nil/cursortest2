package com.gamericefishpro.space.h0;

import com.gamericefishpro.space.h2.x1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.gamericefishpro.space.h1.l implements x1 {
    public Function0 H;
    public p0 I;
    public com.gamericefishpro.space.z.v0 J;
    public boolean K;
    public com.gamericefishpro.space.o2.i L;
    public final r0 M = new r0(this, 0);
    public r0 N;

    public u0(Function0 function0, p0 p0Var, com.gamericefishpro.space.z.v0 v0Var, boolean z) {
        this.H = function0;
        this.I = p0Var;
        this.J = v0Var;
        this.K = z;
        A0();
    }

    public final void A0() {
        this.L = new com.gamericefishpro.space.o2.i(new s0(this, 0), new s0(this, 1));
        this.N = this.K ? new r0(this, 1) : null;
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.m;
        com.gamericefishpro.space.ki.d[] dVarArr2 = com.gamericefishpro.space.o2.u.a;
        com.gamericefishpro.space.ki.d dVar = dVarArr2[6];
        wVar.b(vVar, Boolean.TRUE);
        wVar.b(com.gamericefishpro.space.o2.s.K, this.M);
        if (this.J == com.gamericefishpro.space.z.v0.d) {
            com.gamericefishpro.space.o2.i iVar = this.L;
            if (iVar == null) {
                Intrinsics.h("scrollAxisRange");
                throw null;
            }
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.v;
            com.gamericefishpro.space.ki.d dVar2 = dVarArr2[13];
            wVar.b(vVar2, iVar);
        } else {
            com.gamericefishpro.space.o2.i iVar2 = this.L;
            if (iVar2 == null) {
                Intrinsics.h("scrollAxisRange");
                throw null;
            }
            com.gamericefishpro.space.o2.v vVar3 = com.gamericefishpro.space.o2.s.u;
            com.gamericefishpro.space.ki.d dVar3 = dVarArr2[12];
            wVar.b(vVar3, iVar2);
        }
        r0 r0Var = this.N;
        if (r0Var != null) {
            wVar.b(com.gamericefishpro.space.o2.k.f, new com.gamericefishpro.space.o2.a(null, r0Var));
        }
        wVar.b(com.gamericefishpro.space.o2.k.B, new com.gamericefishpro.space.o2.a(null, new com.gamericefishpro.space.b2.d0(22, new s0(this, 2))));
        com.gamericefishpro.space.o2.c cVarC = this.I.c();
        com.gamericefishpro.space.o2.v vVar4 = com.gamericefishpro.space.o2.s.f;
        com.gamericefishpro.space.ki.d dVar4 = dVarArr2[23];
        wVar.b(vVar4, cVarC);
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }
}
