package x1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.z f8061a;

    static {
        s.z zVar = s.k0.f6300a;
        f8061a = new s.z();
    }

    public static final void a(y0.m mVar, int i10, int i11) {
        if (!(mVar instanceof m)) {
            b(mVar, i10 & mVar.f8445i, i11);
            return;
        }
        m mVar2 = (m) mVar;
        int i12 = mVar2.f8109u;
        b(mVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (y0.m mVar3 = mVar2.f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
            a(mVar3, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(y0.m mVar, int i10, int i11) {
        if (i11 != 0 || mVar.g0()) {
            if ((i10 & 2) != 0 && (mVar instanceof w)) {
                f.n((w) mVar);
                if (i11 == 2) {
                    f1 t3 = f.t(mVar, 2);
                    t3.f8036x = true;
                    t3.M.invoke();
                    t3.T0();
                }
            }
            if ((i10 & 128) != 0 && (mVar instanceof v) && i11 != 2) {
                f.v(mVar).C();
            }
            if ((i10 & 256) != 0 && (mVar instanceof o)) {
                if (i11 == 1) {
                    g0 v10 = f.v(mVar);
                    v10.Y(v10.Q + 1);
                } else if (i11 == 2) {
                    f.v(mVar).Y(r0.Q - 1);
                }
                if (i11 != 2) {
                    g0 v11 = f.v(mVar);
                    if (v11.Q != 0 && !v11.o() && !v11.p() && !v11.P) {
                        y1.r rVar = (y1.r) j0.a(v11);
                        x4.e eVar = rVar.T.f8193e;
                        eVar.getClass();
                        if (v11.Q > 0) {
                            ((o0.e) eVar.f8294g).b(v11);
                            v11.P = true;
                        }
                        rVar.E(null);
                    }
                }
            }
            if ((i10 & 4) != 0 && (mVar instanceof n)) {
                f.m((n) mVar);
            }
            if ((i10 & 8) != 0 && (mVar instanceof u1)) {
                f.v(mVar).f8056v = true;
            }
            if ((i10 & 64) != 0 && (mVar instanceof p1)) {
                k0 k0Var = f.v((p1) mVar).J;
                k0Var.f8103p.f8211v = true;
                t0 t0Var = k0Var.f8104q;
                if (t0Var != null) {
                    t0Var.A = true;
                }
            }
            if ((i10 & 2048) != 0 && (mVar instanceof d1.m)) {
                d1.m mVar2 = (d1.m) mVar;
                g.f8040b = null;
                mVar2.p(g.f8039a);
                if (g.f8040b != null) {
                    y0.m mVar3 = (y0.m) mVar2;
                    if (!mVar3.f8443g.f8456t) {
                        u1.a.b("visitChildren called on an unattached node");
                    }
                    o0.e eVar2 = new o0.e(new y0.m[16]);
                    y0.m mVar4 = mVar3.f8443g;
                    y0.m mVar5 = mVar4.f8448l;
                    if (mVar5 == null) {
                        f.b(eVar2, mVar4);
                    } else {
                        eVar2.b(mVar5);
                    }
                    while (true) {
                        int i12 = eVar2.f5136i;
                        if (i12 == 0) {
                            break;
                        }
                        y0.m mVar6 = (y0.m) eVar2.k(i12 - 1);
                        if ((mVar6.f8446j & 1024) == 0) {
                            f.b(eVar2, mVar6);
                        } else {
                            while (true) {
                                if (mVar6 == null) {
                                    break;
                                }
                                if ((mVar6.f8445i & 1024) != 0) {
                                    o0.e eVar3 = null;
                                    while (mVar6 != null) {
                                        if (mVar6 instanceof d1.r) {
                                            d1.r rVar2 = (d1.r) mVar6;
                                            d1.f fVar = ((d1.i) ((y1.r) f.w(rVar2)).getFocusOwner()).f1579d;
                                            if (fVar.f1572c.a(rVar2)) {
                                                fVar.a();
                                            }
                                        } else if ((mVar6.f8445i & 1024) != 0 && (mVar6 instanceof m)) {
                                            int i13 = 0;
                                            for (y0.m mVar7 = ((m) mVar6).f8110v; mVar7 != null; mVar7 = mVar7.f8448l) {
                                                if ((mVar7.f8445i & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        mVar6 = mVar7;
                                                    } else {
                                                        if (eVar3 == null) {
                                                            eVar3 = new o0.e(new y0.m[16]);
                                                        }
                                                        if (mVar6 != null) {
                                                            eVar3.b(mVar6);
                                                            mVar6 = null;
                                                        }
                                                        eVar3.b(mVar7);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        mVar6 = f.f(eVar3);
                                    }
                                } else {
                                    mVar6 = mVar6.f8448l;
                                }
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(mVar instanceof d1.d)) {
                return;
            }
            d1.d dVar = (d1.d) mVar;
            d1.f fVar2 = ((d1.i) ((y1.r) f.w(dVar)).getFocusOwner()).f1579d;
            if (fVar2.f1573d.a(dVar)) {
                fVar2.a();
            }
        }
    }

    public static final void c(y0.m mVar) {
        if (!mVar.f8456t) {
            u1.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(mVar, -1, 0);
    }

    public static final int d(y0.l lVar) {
        int i10 = lVar instanceof v1.q ? 3 : 1;
        if (lVar instanceof c1.f) {
            i10 |= 4;
        }
        if (lVar instanceof AppendedSemanticsElement) {
            i10 |= 8;
        }
        if ((lVar instanceof z.x) || (lVar instanceof w1.e)) {
            i10 |= 32;
        }
        if (lVar instanceof b0.d) {
            i10 |= 256;
        }
        if (lVar instanceof u.j) {
            i10 |= 64;
        }
        return lVar instanceof y1.q0 ? 524288 | i10 : i10;
    }

    public static final int e(y0.m mVar) {
        int i10 = mVar.f8445i;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = mVar.getClass();
        s.z zVar = f8061a;
        int d10 = zVar.d(cls);
        if (d10 >= 0) {
            return zVar.f6364c[d10];
        }
        int i11 = mVar instanceof w ? 3 : 1;
        if (mVar instanceof n) {
            i11 |= 4;
        }
        if (mVar instanceof u1) {
            i11 |= 8;
        }
        if (mVar instanceof r1) {
            i11 |= 16;
        }
        if (mVar instanceof w1.d) {
            i11 |= 32;
        }
        if (mVar instanceof p1) {
            i11 |= 64;
        }
        if (mVar instanceof v) {
            i11 |= 128;
        }
        if (mVar instanceof o) {
            i11 |= 256;
        }
        if (mVar instanceof d1.r) {
            i11 |= 1024;
        }
        if (mVar instanceof d1.m) {
            i11 |= 2048;
        }
        if (mVar instanceof d1.d) {
            i11 |= 4096;
        }
        if (mVar instanceof p1.c) {
            i11 |= 8192;
        }
        if (mVar instanceof t1.a) {
            i11 |= 16384;
        }
        if (mVar instanceof k) {
            i11 |= 32768;
        }
        if (mVar instanceof z1) {
            i11 |= 262144;
        }
        if (mVar instanceof y1.q0) {
            i11 |= 524288;
        }
        zVar.h(i11, cls);
        return i11;
    }

    public static final int f(y0.m mVar) {
        if (!(mVar instanceof m)) {
            return e(mVar);
        }
        m mVar2 = (m) mVar;
        int i10 = mVar2.f8109u;
        for (y0.m mVar3 = mVar2.f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
            i10 |= f(mVar3);
        }
        return i10;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
