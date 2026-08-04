package com.gamericefishpro.space.f1;

import com.gamericefishpro.space.d0.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean b(b0 b0Var, int i, com.gamericefishpro.space.w0.b bVar, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = b0Var.d;
                if (i2 == i) {
                    b0Var.c = bVar;
                    z2 = true;
                    if (z) {
                        b0Var.e++;
                    }
                    b0Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static g e() {
        return (g) p.b.get();
    }

    public static final b0 f(u uVar) {
        b0 b0Var = uVar.d;
        Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (b0) p.t(b0Var, uVar);
    }

    public static final int g(u uVar) {
        b0 b0Var = uVar.d;
        Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((b0) p.h(b0Var)).e;
    }

    public static g h(g gVar) {
        if (gVar instanceof h0) {
            h0 h0Var = (h0) gVar;
            if (h0Var.t == com.gamericefishpro.space.b1.n.b()) {
                h0Var.r = null;
                return gVar;
            }
        }
        if (gVar instanceof i0) {
            i0 i0Var = (i0) gVar;
            if (i0Var.i == com.gamericefishpro.space.b1.n.b()) {
                i0Var.h = null;
                return gVar;
            }
        }
        g gVarG = p.g(gVar, null, false);
        gVarG.j();
        return gVarG;
    }

    public static final boolean i(u uVar, Function1 function1) {
        int i;
        com.gamericefishpro.space.w0.b bVar;
        Object objInvoke;
        g gVarJ;
        boolean zB;
        do {
            synchronized (a) {
                b0 b0Var = uVar.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.x0.e eVarBuilder = bVar.builder();
            objInvoke = function1.invoke(eVarBuilder);
            com.gamericefishpro.space.w0.b bVarD = eVarBuilder.d();
            if (Intrinsics.a(bVarD, bVar)) {
                break;
            }
            b0 b0Var3 = uVar.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = b((b0) p.w(b0Var3, uVar, gVarJ), i, bVarD, true);
            }
            p.n(gVarJ, uVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object j(c1 c1Var, Function0 function0) {
        g h0Var;
        g gVar = (g) p.b.get();
        if (gVar instanceof h0) {
            h0 h0Var2 = (h0) gVar;
            if (h0Var2.t == com.gamericefishpro.space.b1.n.b()) {
                Function1 function1 = h0Var2.r;
                Function1 function2 = h0Var2.s;
                try {
                    ((h0) gVar).r = p.k(c1Var, function1, true);
                    ((h0) gVar).s = function2;
                    return function0.invoke();
                } finally {
                    h0Var2.r = function1;
                    h0Var2.s = function2;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            h0Var = new h0(gVar instanceof c ? (c) gVar : null, c1Var, null, true, false);
        } else {
            h0Var = gVar.u(c1Var);
        }
        try {
            g gVarJ = h0Var.j();
            try {
                Object objInvoke = function0.invoke();
                g.q(gVarJ);
                h0Var.c();
                return objInvoke;
            } catch (Throwable th) {
                g.q(gVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            h0Var.c();
            throw th2;
        }
    }

    public static void k(g gVar, g gVar2, Function1 function1) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof h0) {
            ((h0) gVar).r = function1;
        } else if (gVar instanceof i0) {
            ((i0) gVar).h = function1;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
