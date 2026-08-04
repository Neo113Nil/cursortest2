package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {
    public final s d;
    public s e;

    public q(s sVar) {
        this.d = sVar;
        if (sVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.e = sVar.i();
    }

    public final s a() {
        s sVarB = b();
        sVarB.getClass();
        if (s.f(sVarB, true)) {
            return sVarB;
        }
        throw new x0();
    }

    public final s b() {
        if (!this.e.g()) {
            return this.e;
        }
        s sVar = this.e;
        sVar.getClass();
        q0 q0Var = q0.c;
        q0Var.getClass();
        q0Var.a(sVar.getClass()).c(sVar);
        sVar.h();
        return this.e;
    }

    public final void c() {
        if (this.e.g()) {
            return;
        }
        s sVarI = this.d.i();
        s sVar = this.e;
        q0 q0Var = q0.c;
        q0Var.getClass();
        q0Var.a(sVarI.getClass()).a(sVarI, sVar);
        this.e = sVarI;
    }

    public final Object clone() {
        q qVar = (q) this.d.c(5);
        qVar.e = b();
        return qVar;
    }
}
