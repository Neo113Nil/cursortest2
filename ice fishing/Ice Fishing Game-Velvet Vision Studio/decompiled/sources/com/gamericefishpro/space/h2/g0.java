package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final com.gamericefishpro.space.f2.u0 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public a f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i) {
        this.h = i;
        this.a = (com.gamericefishpro.space.f2.u0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [com.gamericefishpro.space.ei.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.h2.a] */
    public static final void a(g0 g0Var, com.gamericefishpro.space.f2.a aVar, int i, f1 f1Var) {
        HashMap map = g0Var.g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jA = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (g0Var.h) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        n1 n1Var = f1Var.e0;
                        if (n1Var != null) {
                            jA = ((com.gamericefishpro.space.i2.g1) n1Var).c(false, jA);
                        }
                        jA = com.gamericefishpro.space.a.a.A(jA, f1Var.S);
                        break;
                    default:
                        o0 o0VarI0 = f1Var.I0();
                        Intrinsics.b(o0VarI0);
                        long j = o0VarI0.I;
                        jA = com.gamericefishpro.space.n1.b.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jA);
                        break;
                }
                f1Var = f1Var.J;
                Intrinsics.b(f1Var);
                if (f1Var.equals(g0Var.a.v())) {
                    int iRound = Math.round(aVar instanceof com.gamericefishpro.space.f2.k ? Float.intBitsToFloat((int) (jA & 4294967295L)) : Float.intBitsToFloat((int) (jA >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) com.gamericefishpro.space.ph.m0.d(map, aVar)).intValue();
                        com.gamericefishpro.space.f2.k kVar = com.gamericefishpro.space.f2.d.a;
                        iRound = ((Number) aVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!g0Var.b(f1Var).containsKey(aVar));
            float fC = g0Var.c(f1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f1 f1Var) {
        switch (this.h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return f1Var.s0().a();
            default:
                o0 o0VarI0 = f1Var.I0();
                Intrinsics.b(o0VarI0);
                return o0VarI0.s0().a();
        }
    }

    public final int c(f1 f1Var, com.gamericefishpro.space.f2.a aVar) {
        switch (this.h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return f1Var.m0(aVar);
            default:
                o0 o0VarI0 = f1Var.I0();
                Intrinsics.b(o0VarI0);
                return o0VarI0.m0(aVar);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.h2.a] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        a aVarB = r0.B();
        if (aVarB == null) {
            return;
        }
        if (this.c) {
            aVarB.requestLayout();
        }
        if (this.d) {
            r0.P();
        }
        if (this.e) {
            r0.requestLayout();
        }
        aVarB.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.h2.a] */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        com.gamericefishpro.space.b2.d0 d0Var = new com.gamericefishpro.space.b2.d0(3, this);
        ?? r2 = this.a;
        r2.u(d0Var);
        map.putAll(b(r2.v()));
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.h2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.h2.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        a aVar;
        g0 g0VarA;
        g0 g0VarA2;
        boolean zD = d();
        ?? r1 = this.a;
        ?? r2 = r1;
        if (!zD) {
            a aVarB = r1.B();
            if (aVarB == null) {
                return;
            }
            aVar = aVarB.a().f;
            if (aVar == null || !aVar.a().d()) {
                r2 = aVar;
                a aVar2 = this.f;
                if (aVar2 == null || aVar2.a().d()) {
                    return;
                }
                a aVarB2 = aVar2.B();
                if (aVarB2 != null && (g0VarA2 = aVarB2.a()) != null) {
                    g0VarA2.h();
                }
                a aVarB3 = aVar2.B();
                r2 = (aVarB3 == null || (g0VarA = aVarB3.a()) == null) ? 0 : g0VarA.f;
            }
        }
        r2 = aVar;
        this.f = r2;
    }
}
