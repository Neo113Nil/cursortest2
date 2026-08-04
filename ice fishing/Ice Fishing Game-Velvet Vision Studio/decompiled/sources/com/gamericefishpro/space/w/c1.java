package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements e {
    public final p1 a;
    public final com.gamericefishpro.space.u6.l b;
    public Object c;
    public Object d;
    public o e;
    public o f;
    public final o g;
    public long h;
    public o i;

    public c1(i iVar, com.gamericefishpro.space.u6.l lVar, Object obj, Object obj2, o oVar) {
        this.a = iVar.a(lVar);
        this.b = lVar;
        this.c = obj2;
        this.d = obj;
        this.e = (o) ((Function1) lVar.d).invoke(obj);
        Function1 function1 = (Function1) lVar.d;
        this.f = (o) function1.invoke(obj2);
        this.g = oVar != null ? c.h(oVar) : ((o) function1.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // com.gamericefishpro.space.w.e
    public final boolean a() {
        return this.a.a();
    }

    @Override // com.gamericefishpro.space.w.e
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        o oVarR = this.a.r(j, this.e, this.f, this.g);
        int iB = oVarR.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(oVarR.a(i))) {
                i0.b("AnimationVector cannot contain a NaN. " + oVarR + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((Function1) this.b.e).invoke(oVarR);
    }

    @Override // com.gamericefishpro.space.w.e
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // com.gamericefishpro.space.w.e
    public final com.gamericefishpro.space.u6.l d() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.w.e
    public final Object e() {
        return this.c;
    }

    @Override // com.gamericefishpro.space.w.e
    public final o f(long j) {
        if (!g(j)) {
            return this.a.f(j, this.e, this.f, this.g);
        }
        o oVar = this.i;
        if (oVar != null) {
            return oVar;
        }
        o oVarK = this.a.k(this.e, this.f, this.g);
        this.i = oVarK;
        return oVarK;
    }

    public final void h(Object obj) {
        if (Intrinsics.a(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (o) ((Function1) this.b.d).invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.a(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (o) ((Function1) this.b.d).invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
