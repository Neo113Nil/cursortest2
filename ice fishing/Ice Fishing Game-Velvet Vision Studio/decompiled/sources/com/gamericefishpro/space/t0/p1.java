package com.gamericefishpro.space.t0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    public x a;
    public int b;
    public a c;
    public Function2 d;
    public int e;
    public com.gamericefishpro.space.t.c0 f;
    public com.gamericefishpro.space.t.h0 g;

    public p1(x xVar) {
        this.a = xVar;
    }

    public static boolean a(d0 d0Var, com.gamericefishpro.space.t.h0 h0Var) {
        Intrinsics.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        m2 m2Var = d0Var.i;
        if (m2Var == null) {
            m2Var = f.z;
        }
        return !m2Var.a(d0Var.h().f, h0Var.g(d0Var));
    }

    public final boolean b() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final n0 c(Object obj) {
        n0 n0VarS;
        x xVar = this.a;
        return (xVar == null || (n0VarS = xVar.s(this, obj)) == null) ? n0.d : n0VarS;
    }

    public final void d() {
        x xVar = this.a;
        if (xVar != null) {
            xVar.H = true;
            xVar.M.o();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
