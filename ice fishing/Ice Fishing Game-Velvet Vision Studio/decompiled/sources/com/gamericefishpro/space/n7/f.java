package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.q0.e0;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.y0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final long a = com.gamericefishpro.space.o1.o.c(4294922834L);
    public static final long b = com.gamericefishpro.space.o1.o.c(4294940672L);
    public static final long c = com.gamericefishpro.space.o1.o.c(4278233855L);
    public static final long d = com.gamericefishpro.space.o1.o.c(4294956800L);
    public static final /* synthetic */ int e = 0;

    public static final void a(final int i, Function2 onLevelComplete, Function1 onDefeat, Function0 onBack, q qVar, com.gamericefishpro.space.t0.r rVar, int i2) {
        q qVar2;
        int i3;
        long j;
        q qVar3;
        Intrinsics.checkNotNullParameter(onLevelComplete, "onLevelComplete");
        Intrinsics.checkNotNullParameter(onDefeat, "onDefeat");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar.b0(221738178);
        int i4 = i2 | (rVar.d(i) ? 4 : 2) | (rVar.h(onLevelComplete) ? 32 : 16) | (rVar.h(onDefeat) ? 256 : 128) | (rVar.h(onBack) ? 2048 : 1024) | 8192;
        if ((i4 & 9363) == 9362 && rVar.E()) {
            rVar.V();
            qVar3 = qVar;
        } else {
            rVar.X();
            int i5 = i2 & 1;
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (i5 == 0 || rVar.B()) {
                rVar.a0(1142398097);
                boolean z = (i4 & 14) == 4;
                Object objP = rVar.P();
                if (z || objP == obj) {
                    objP = new Function0() { // from class: com.gamericefishpro.space.n7.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object[] parameters = {Integer.valueOf(i)};
                            Intrinsics.checkNotNullParameter(parameters, "parameters");
                            Intrinsics.checkNotNullParameter(parameters, "<this>");
                            Intrinsics.checkNotNullParameter(parameters, "<this>");
                            return new com.gamericefishpro.space.lj.a(2, new ArrayList(new com.gamericefishpro.space.ph.p(parameters, false)));
                        }
                    };
                    rVar.k0(objP);
                }
                Function0 function0 = (Function0) objP;
                rVar.p(false);
                rVar.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(q.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar), function0);
                rVar.p(false);
                qVar2 = (q) s0VarK;
                i3 = i4 & (-57345);
            } else {
                rVar.V();
                i3 = i4 & (-57345);
                qVar2 = qVar;
            }
            rVar.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(qVar2.c, rVar);
            Boolean boolValueOf = Boolean.valueOf(((g) v0VarL.getValue()).k);
            rVar.a0(1142401936);
            boolean zF = ((i3 & 112) == 32) | rVar.f(v0VarL);
            Object objP2 = rVar.P();
            if (zF || objP2 == obj) {
                objP2 = new com.gamericefishpro.space.k7.e(onLevelComplete, v0VarL, null, 2);
                rVar.k0(objP2);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, boolValueOf, (Function2) objP2);
            Boolean boolValueOf2 = Boolean.valueOf(((g) v0VarL.getValue()).l);
            rVar.a0(1142405909);
            boolean zF2 = ((i3 & 896) == 256) | rVar.f(v0VarL);
            Object objP3 = rVar.P();
            if (zF2 || objP3 == obj) {
                objP3 = new com.gamericefishpro.space.k7.e(onDefeat, v0VarL, null, 3);
                rVar.k0(objP3);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, boolValueOf2, (Function2) objP3);
            boolean z2 = (((g) v0VarL.getValue()).k || ((g) v0VarL.getValue()).l) ? false : true;
            rVar.a0(1142410852);
            boolean zH = rVar.h(qVar2);
            Object objP4 = rVar.P();
            if (zH || objP4 == obj) {
                objP4 = new c(qVar2, 0);
                rVar.k0(objP4);
            }
            rVar.p(false);
            y3.a(z2, (Function0) objP4, rVar, 0);
            if (((g) v0VarL.getValue()).e <= 10) {
                j = a;
            } else {
                j = ((g) v0VarL.getValue()).e <= 30 ? b : com.gamericefishpro.space.o1.s.c;
            }
            long j2 = j;
            float f = 0.0f;
            float f2 = ((g) v0VarL.getValue()).f > 0 ? ((g) v0VarL.getValue()).e / ((g) v0VarL.getValue()).f : 0.0f;
            int i6 = ((g) v0VarL.getValue()).e / 60;
            int i7 = ((g) v0VarL.getValue()).e % 60;
            if (((g) v0VarL.getValue()).c > 0) {
                f = ((g) v0VarL.getValue()).b / ((g) v0VarL.getValue()).c;
                if (f > 1.0f) {
                    f = 1.0f;
                }
            }
            q qVar4 = qVar2;
            e0.a(null, null, null, null, null, 0, 0L, 0L, null, com.gamericefishpro.space.b1.n.c(283945041, new e(qVar4, onBack, i, v0VarL, i6, i7, j2, f2, f), rVar), rVar, 805306368, 511);
            qVar3 = qVar4;
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.a(i, onLevelComplete, onDefeat, onBack, qVar3, i2);
        }
    }

    public static final g b(s2 s2Var) {
        return (g) s2Var.getValue();
    }

    public static final long c(com.gamericefishpro.space.i7.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return com.gamericefishpro.space.o1.o.c(4293212469L);
        }
        if (iOrdinal == 1) {
            return com.gamericefishpro.space.o1.o.c(4278238420L);
        }
        if (iOrdinal == 2) {
            return com.gamericefishpro.space.o1.o.c(4294956367L);
        }
        throw new com.gamericefishpro.space.oh.k();
    }
}
