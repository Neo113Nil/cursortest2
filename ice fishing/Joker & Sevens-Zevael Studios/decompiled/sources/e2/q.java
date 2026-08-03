package e2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import v1.p0;
import x1.f1;
import x1.g0;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final e1.c f2006a = new e1.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final n a(g0 g0Var, boolean z10) {
        y0.m mVar = g0Var.I.f7991f;
        x1.l lVar = null;
        if ((mVar.f8446j & 8) != 0) {
            loop0: while (true) {
                if (mVar == null) {
                    break;
                }
                if ((mVar.f8445i & 8) != 0) {
                    y0.m mVar2 = mVar;
                    o0.e eVar = null;
                    while (mVar2 != null) {
                        if (mVar2 instanceof u1) {
                            lVar = mVar2;
                            break loop0;
                        }
                        if ((mVar2.f8445i & 8) != 0 && (mVar2 instanceof x1.m)) {
                            int i10 = 0;
                            for (y0.m mVar3 = ((x1.m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                if ((mVar3.f8445i & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        mVar2 = mVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar2 != null) {
                                            eVar.b(mVar2);
                                            mVar2 = null;
                                        }
                                        eVar.b(mVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVar2 = x1.f.f(eVar);
                    }
                }
                if ((mVar.f8446j & 8) == 0) {
                    break;
                }
                mVar = mVar.f8448l;
            }
        }
        pc.j.b(lVar);
        y0.m mVar4 = ((y0.m) ((u1) lVar)).f8443g;
        j u10 = g0Var.u();
        if (u10 == null) {
            u10 = new j();
        }
        return new n(mVar4, z10, g0Var, u10);
    }

    public static final s.u b(p pVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            n a6 = pVar.a();
            g0 g0Var = a6.f1995c;
            if (g0Var.H() && g0Var.G()) {
                s.u uVar = new s.u(48);
                f8.c cVar = new f8.c(9);
                s2.j H = a.a.H(a6.g());
                ((Region) cVar.f2340h).set(H.f6391a, H.f6392b, H.f6393c, H.f6394d);
                c(cVar, a6, uVar, a6, new f8.c(9));
                return uVar;
            }
            s.u uVar2 = s.l.f6301a;
            pc.j.c(uVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return uVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(f8.c cVar, n nVar, s.u uVar, n nVar2, f8.c cVar2) {
        e1.c V0;
        g0 g0Var;
        int i10 = nVar.f1999g;
        Region region = (Region) cVar2.f2340h;
        g0 g0Var2 = nVar2.f1995c;
        int i11 = nVar2.f1999g;
        boolean z10 = (g0Var2.H() && g0Var2.G()) ? false : true;
        Region region2 = (Region) cVar.f2340h;
        if (!region2.isEmpty() || i11 == i10) {
            if (!z10 || nVar2.f1997e) {
                x1.l f10 = nVar2.f();
                if (f10 == null) {
                    V0 = g0Var2.I.f7988c.V0();
                } else {
                    y0.m mVar = ((y0.m) f10).f8443g;
                    Object g8 = nVar2.f1996d.f1985g.g(i.f1960b);
                    if (g8 == null) {
                        g8 = null;
                    }
                    boolean z11 = g8 != null;
                    if (!mVar.f8443g.f8456t) {
                        V0 = e1.c.f1930e;
                    } else if (z11) {
                        V0 = x1.f.t(mVar, 8).V0();
                    } else {
                        f1 t3 = x1.f.t(mVar, 8);
                        V0 = p0.g(t3).C(t3, true);
                    }
                }
                s2.j H = a.a.H(V0);
                region.set(H.f6391a, H.f6392b, H.f6393c, H.f6394d);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (nVar2.f1997e) {
                        n l10 = nVar2.l();
                        uVar.h(i11, new o(nVar2, a.a.H((l10 == null || (g0Var = l10.f1995c) == null || !g0Var.H()) ? f2006a : l10.g())));
                        return;
                    } else {
                        if (i11 == -1) {
                            Rect bounds = region.getBounds();
                            uVar.h(i11, new o(nVar2, new s2.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                uVar.h(i11, new o(nVar2, new s2.j(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j3 = n.j(4, nVar2);
                for (int size = j3.size() - 1; -1 < size; size--) {
                    if (!((n) j3.get(size)).k().f1985g.c(s.f2048x)) {
                        c(cVar, nVar, uVar, (n) j3.get(size), cVar2);
                    }
                }
                if (f(nVar2)) {
                    region2.op(H.f6391a, H.f6392b, H.f6393c, H.f6394d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(j jVar, v vVar) {
        Object g8 = jVar.f1985g.g(vVar);
        if (g8 == null) {
            return null;
        }
        return g8;
    }

    public static final boolean e(n nVar) {
        f1 d10 = nVar.d();
        j jVar = nVar.f1996d;
        if (d10 != null ? d10.J0() : false) {
            return true;
        }
        v vVar = s.f2025a;
        if (jVar.f1985g.c(s.f2040p)) {
            return true;
        }
        return jVar.f1985g.c(s.f2039o);
    }

    public static final boolean f(n nVar) {
        if (!e(nVar)) {
            j jVar = nVar.f1996d;
            if (jVar.f1987i) {
                return true;
            }
            s.g0 g0Var = jVar.f1985g;
            Object[] objArr = g0Var.f6267b;
            Object[] objArr2 = g0Var.f6268c;
            long[] jArr = g0Var.f6266a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j3 = jArr[i10];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j3) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                Object obj2 = objArr2[i13];
                                if (((v) obj).f2056c) {
                                    return true;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return false;
    }
}
