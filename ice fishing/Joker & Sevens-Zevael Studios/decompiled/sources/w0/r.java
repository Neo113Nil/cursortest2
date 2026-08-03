package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7593a = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final boolean b(u uVar, int i10, q0.c cVar, boolean z10) {
        boolean z11;
        synchronized (f7593a) {
            try {
                int i11 = uVar.f7617d;
                if (i11 == i10) {
                    uVar.f7616c = cVar;
                    z11 = true;
                    if (z10) {
                        uVar.f7618e++;
                    }
                    uVar.f7617d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j3) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j6 = jArr[i11];
            if (j3 > j6) {
                i10 = i11 + 1;
            } else {
                if (j3 >= j6) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static g d() {
        return (g) m.f7579b.s();
    }

    public static final u e(q qVar) {
        u uVar = qVar.f7592g;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (u) m.t(uVar, qVar);
    }

    public static final int f(q qVar) {
        u uVar = qVar.f7592g;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((u) m.i(uVar)).f7618e;
    }

    public static g g(g gVar) {
        if (gVar instanceof z) {
            z zVar = (z) gVar;
            if (zVar.f7631t == u0.e.c()) {
                zVar.f7629r = null;
                return gVar;
            }
        }
        if (gVar instanceof a0) {
            a0 a0Var = (a0) gVar;
            if (a0Var.f7542i == u0.e.c()) {
                a0Var.f7541h = null;
                return gVar;
            }
        }
        g h10 = m.h(gVar, null, false);
        h10.j();
        return h10;
    }

    public static final boolean h(q qVar, oc.c cVar) {
        int i10;
        q0.c cVar2;
        Object invoke;
        g k3;
        boolean b2;
        do {
            synchronized (f7593a) {
                u uVar = qVar.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar2 = uVar2.f7616c;
            }
            pc.j.b(cVar2);
            q0.f f10 = cVar2.f();
            invoke = cVar.invoke(f10);
            q0.c d10 = f10.d();
            if (pc.j.a(d10, cVar2)) {
                break;
            }
            u uVar3 = qVar.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = b((u) m.w(uVar3, qVar, k3), i10, d10, true);
            }
            m.n(k3, qVar);
        } while (!b2);
        return ((Boolean) invoke).booleanValue();
    }

    public static Object i(oc.c cVar, oc.a aVar) {
        g zVar;
        if (cVar == null) {
            return aVar.invoke();
        }
        g gVar = (g) m.f7579b.s();
        if (gVar instanceof z) {
            z zVar2 = (z) gVar;
            if (zVar2.f7631t == u0.e.c()) {
                oc.c cVar2 = zVar2.f7629r;
                oc.c cVar3 = zVar2.f7630s;
                try {
                    ((z) gVar).f7629r = m.l(cVar, cVar2, true);
                    ((z) gVar).f7630s = cVar3;
                    return aVar.invoke();
                } finally {
                    zVar2.f7629r = cVar2;
                    zVar2.f7630s = cVar3;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            zVar = new z(gVar instanceof c ? (c) gVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            zVar = gVar.u(cVar);
        }
        try {
            g j3 = zVar.j();
            try {
                Object invoke = aVar.invoke();
                g.q(j3);
                zVar.c();
                return invoke;
            } catch (Throwable th) {
                g.q(j3);
                throw th;
            }
        } catch (Throwable th2) {
            zVar.c();
            throw th2;
        }
    }

    public static void j(g gVar, g gVar2, oc.c cVar) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof z) {
            ((z) gVar).f7629r = cVar;
        } else if (gVar instanceof a0) {
            ((a0) gVar).f7541h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static final void k() {
        throw new UnsupportedOperationException();
    }
}
