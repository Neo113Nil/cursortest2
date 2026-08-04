package com.gamericefishpro.space.f2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 implements com.gamericefishpro.space.c3.c {
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(t0 t0Var, u0 u0Var) {
        t0Var.getClass();
        if (u0Var instanceof com.gamericefishpro.space.h2.x0) {
            ((com.gamericefishpro.space.h2.x0) u0Var).p(t0Var.d);
        }
    }

    public static void k(t0 t0Var, u0 u0Var, long j) {
        t0Var.getClass();
        a(t0Var, u0Var);
        u0Var.a0(com.gamericefishpro.space.c3.i.c(j, u0Var.w), 0.0f, null);
    }

    public static void l(t0 t0Var, u0 u0Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (t0Var.e() == com.gamericefishpro.space.c3.l.d || t0Var.f() == 0) {
            a(t0Var, u0Var);
            u0Var.a0(com.gamericefishpro.space.c3.i.c(j, u0Var.w), 0.0f, null);
        } else {
            int iF = (t0Var.f() - u0Var.d) - ((int) (j >> 32));
            a(t0Var, u0Var);
            u0Var.a0(com.gamericefishpro.space.c3.i.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), u0Var.w), 0.0f, null);
        }
    }

    public static void o(t0 t0Var, u0 u0Var, int i, int i2) {
        int i3 = w0.b;
        v0 v0Var = v0.e;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (t0Var.e() == com.gamericefishpro.space.c3.l.d || t0Var.f() == 0) {
            a(t0Var, u0Var);
            u0Var.a0(com.gamericefishpro.space.c3.i.c(j, u0Var.w), 0.0f, v0Var);
        } else {
            int iF = (t0Var.f() - u0Var.d) - ((int) (j >> 32));
            a(t0Var, u0Var);
            u0Var.a0(com.gamericefishpro.space.c3.i.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), u0Var.w), 0.0f, v0Var);
        }
    }

    public static void p(t0 t0Var, u0 u0Var, Function1 function1) {
        t0Var.getClass();
        long j = 0;
        a(t0Var, u0Var);
        u0Var.a0(com.gamericefishpro.space.c3.i.c((j & 4294967295L) | (j << 32), u0Var.w), 0.0f, function1);
    }

    public static void t(t0 t0Var, u0 u0Var, long j) {
        int i = w0.b;
        v0 v0Var = v0.e;
        t0Var.getClass();
        a(t0Var, u0Var);
        u0Var.a0(com.gamericefishpro.space.c3.i.c(j, u0Var.w), 0.0f, v0Var);
    }

    public float d(m mVar) {
        return Float.NaN;
    }

    public abstract com.gamericefishpro.space.c3.l e();

    public abstract int f();

    public final void h(u0 u0Var, int i, int i2, float f) {
        a(this, u0Var);
        u0Var.a0(com.gamericefishpro.space.c3.i.c((((long) i2) & 4294967295L) | (((long) i) << 32), u0Var.w), f, null);
    }
}
