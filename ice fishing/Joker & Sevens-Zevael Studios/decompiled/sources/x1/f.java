package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f8031a = new j1(1);

    public static final long a(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void b(o0.e eVar, y0.m mVar) {
        o0.e w3 = v(mVar).w();
        int i10 = w3.f5136i - 1;
        Object[] objArr = w3.f5134g;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b(((g0) objArr[i10]).I.f7991f);
                i10--;
            }
        }
    }

    public static final int c(o0 o0Var, v1.k kVar) {
        o0 f02 = o0Var.f0();
        if (f02 == null) {
            u1.a.b("Child of " + o0Var + " cannot be null when calculating alignment line");
        }
        if (o0Var.j0().a().containsKey(kVar)) {
            Integer num = (Integer) o0Var.j0().a().get(kVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int b02 = f02.b0(kVar);
            if (b02 != Integer.MIN_VALUE) {
                f02.f8125p = true;
                o0Var.f8126q = true;
                o0Var.p0();
                f02.f8125p = false;
                o0Var.f8126q = false;
                return b02 + ((int) (kVar instanceof v1.k ? f02.l0() & 4294967295L : f02.l0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        w1 w1Var = v(cVar).I.f7990e;
        pc.j.c(w1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return w1Var.f8200u;
    }

    public static final y0.m e(l lVar, int i10) {
        y0.m mVar = ((y0.m) lVar).f8443g.f8448l;
        if (mVar == null || (mVar.f8446j & i10) == 0) {
            return null;
        }
        while (mVar != null) {
            int i11 = mVar.f8445i;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return mVar;
            }
            mVar = mVar.f8448l;
        }
        return null;
    }

    public static final y0.m f(o0.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.f5136i) == 0) {
            return null;
        }
        return (y0.m) eVar.k(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w g(y0.m mVar) {
        if ((mVar.f8445i & 2) != 0) {
            if (mVar instanceof w) {
                return (w) mVar;
            }
            if (mVar instanceof m) {
                y0.m mVar2 = ((m) mVar).f8110v;
                while (mVar2 != 0) {
                    if (mVar2 instanceof w) {
                        return (w) mVar2;
                    }
                    mVar2 = (!(mVar2 instanceof m) || (mVar2.f8445i & 2) == 0) ? mVar2.f8448l : ((m) mVar2).f8110v;
                }
            }
        }
        return null;
    }

    public static final int h(long j3, long j6) {
        boolean q10 = q(j3);
        if (q10 != q(j6)) {
            return q10 ? -1 : 1;
        }
        return (Math.min(l(j3), l(j6)) >= 0.0f && p(j3) != p(j6)) ? p(j3) ? -1 : 1 : (int) Math.signum(l(j3) - l(j6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(k kVar, m0.u1 u1Var) {
        if (!((y0.m) kVar).f8443g.f8456t) {
            u1.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        u0.i iVar = (u0.i) v(kVar).E;
        iVar.getClass();
        return m0.z.t(iVar, u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final z1 j(l lVar, Object obj) {
        c1 c1Var;
        y0.m mVar = (y0.m) lVar;
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = mVar.f8443g.f8447k;
        g0 v10 = v(lVar);
        while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 262144) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 262144) != 0) {
                        m mVar3 = mVar2;
                        ?? r42 = 0;
                        while (mVar3 != 0) {
                            if (mVar3 instanceof z1) {
                                z1 z1Var = (z1) mVar3;
                                if (obj.equals(z1Var.r())) {
                                    return z1Var;
                                }
                            } else if ((mVar3.f8445i & 262144) != 0 && (mVar3 instanceof m)) {
                                y0.m mVar4 = mVar3.f8110v;
                                int i10 = 0;
                                mVar3 = mVar3;
                                r42 = r42;
                                while (mVar4 != null) {
                                    if ((mVar4.f8445i & 262144) != 0) {
                                        i10++;
                                        r42 = r42;
                                        if (i10 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != 0) {
                                                r42.b(mVar3);
                                                mVar3 = 0;
                                            }
                                            r42.b(mVar4);
                                        }
                                    }
                                    mVar4 = mVar4.f8448l;
                                    mVar3 = mVar3;
                                    r42 = r42;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVar3 = f(r42);
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, x1.l, x1.z1] */
    /* JADX WARN: Type inference failed for: r3v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final z1 k(z1 z1Var) {
        c1 c1Var;
        y0.m mVar = (y0.m) z1Var;
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = mVar.f8443g.f8447k;
        g0 v10 = v(z1Var);
        while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 262144) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 262144) != 0) {
                        m mVar3 = mVar2;
                        ?? r5 = 0;
                        while (mVar3 != 0) {
                            if (mVar3 instanceof z1) {
                                z1 z1Var2 = (z1) mVar3;
                                if (pc.j.a(z1Var.r(), z1Var2.r()) && z1Var.getClass() == z1Var2.getClass()) {
                                    return z1Var2;
                                }
                            } else if ((mVar3.f8445i & 262144) != 0 && (mVar3 instanceof m)) {
                                y0.m mVar4 = mVar3.f8110v;
                                int i10 = 0;
                                mVar3 = mVar3;
                                r5 = r5;
                                while (mVar4 != null) {
                                    if ((mVar4.f8445i & 262144) != 0) {
                                        i10++;
                                        r5 = r5;
                                        if (i10 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != 0) {
                                                r5.b(mVar3);
                                                mVar3 = 0;
                                            }
                                            r5.b(mVar4);
                                        }
                                    }
                                    mVar4 = mVar4.f8448l;
                                    mVar3 = mVar3;
                                    r5 = r5;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVar3 = f(r5);
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        return null;
    }

    public static final float l(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(n nVar) {
        if (((y0.m) nVar).f8443g.f8456t) {
            t(nVar, 1).I0();
        }
    }

    public static final void n(w wVar) {
        v(wVar).C();
    }

    public static final void o(u1 u1Var) {
        v(u1Var).E();
    }

    public static final boolean p(long j3) {
        return (j3 & 2) != 0;
    }

    public static final boolean q(long j3) {
        return (j3 & 1) != 0;
    }

    public static final boolean r(g0 g0Var) {
        if (g0Var.f8047m == null) {
            return false;
        }
        g0 s10 = g0Var.s();
        return (s10 != null ? s10.f8047m : null) == null || g0Var.J.f8089b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(y0.m mVar, oc.a aVar) {
        i1 i1Var = mVar.f8449m;
        if (i1Var == null) {
            i1Var = new i1((h1) mVar);
            mVar.f8449m = i1Var;
        }
        ((y1.r) w(mVar)).getSnapshotObserver().a(i1Var, e.f8010l, aVar);
    }

    public static final f1 t(l lVar, int i10) {
        f1 f1Var = ((y0.m) lVar).f8443g.f8450n;
        pc.j.b(f1Var);
        if (f1Var.B0() != lVar || !g1.g(i10)) {
            return f1Var;
        }
        f1 f1Var2 = f1Var.f8034v;
        pc.j.b(f1Var2);
        return f1Var2;
    }

    public static final f1 u(l lVar) {
        if (!((y0.m) lVar).f8443g.f8456t) {
            u1.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        f1 t3 = t(lVar, 2);
        if (!t3.B0().f8456t) {
            u1.a.b("LayoutCoordinates is not attached.");
        }
        return t3;
    }

    public static final g0 v(l lVar) {
        f1 f1Var = ((y0.m) lVar).f8443g.f8450n;
        if (f1Var != null) {
            return f1Var.f8033u;
        }
        throw a4.d.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m1 w(l lVar) {
        m1 m1Var = v(lVar).f8053s;
        if (m1Var != null) {
            return m1Var;
        }
        throw a4.d.e("This node does not have an owner.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, x1.l, x1.z1] */
    /* JADX WARN: Type inference failed for: r12v0, types: [oc.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void x(z1 z1Var, oc.c cVar) {
        c1 c1Var;
        y0.m mVar = (y0.m) z1Var;
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = mVar.f8443g.f8447k;
        g0 v10 = v(z1Var);
        while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 262144) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 262144) != 0) {
                        m mVar3 = mVar2;
                        ?? r5 = 0;
                        while (mVar3 != 0) {
                            boolean z10 = true;
                            if (mVar3 instanceof z1) {
                                z1 z1Var2 = (z1) mVar3;
                                if (pc.j.a(z1Var.r(), z1Var2.r()) && z1Var.getClass() == z1Var2.getClass()) {
                                    z10 = ((Boolean) cVar.invoke(z1Var2)).booleanValue();
                                }
                                if (!z10) {
                                    return;
                                }
                            } else {
                                if (((mVar3.f8445i & 262144) != 0) && (mVar3 instanceof m)) {
                                    y0.m mVar4 = mVar3.f8110v;
                                    int i10 = 0;
                                    mVar3 = mVar3;
                                    r5 = r5;
                                    while (mVar4 != null) {
                                        if ((mVar4.f8445i & 262144) != 0) {
                                            i10++;
                                            r5 = r5;
                                            if (i10 == 1) {
                                                mVar3 = mVar4;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar3 != 0) {
                                                    r5.b(mVar3);
                                                    mVar3 = 0;
                                                }
                                                r5.b(mVar4);
                                            }
                                        }
                                        mVar4 = mVar4.f8448l;
                                        mVar3 = mVar3;
                                        r5 = r5;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            mVar3 = f(r5);
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, x1.z1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [oc.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void y(z1 z1Var, oc.c cVar) {
        y0.m mVar = (y0.m) z1Var;
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar2 = mVar.f8443g;
        y0.m mVar3 = mVar2.f8448l;
        if (mVar3 == null) {
            b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i10 = eVar.f5136i;
            if (i10 == 0) {
                return;
            }
            y0.m mVar4 = (y0.m) eVar.k(i10 - 1);
            if ((mVar4.f8446j & 262144) != 0) {
                for (y0.m mVar5 = mVar4; mVar5 != null; mVar5 = mVar5.f8448l) {
                    if ((mVar5.f8445i & 262144) != 0) {
                        m mVar6 = mVar5;
                        ?? r72 = 0;
                        while (mVar6 != 0) {
                            if (mVar6 instanceof z1) {
                                z1 z1Var2 = (z1) mVar6;
                                y1 y1Var = (pc.j.a(z1Var.r(), z1Var2.r()) && z1Var.getClass() == z1Var2.getClass()) ? (y1) cVar.invoke(z1Var2) : y1.f8218g;
                                if (y1Var == y1.f8220i) {
                                    return;
                                }
                                if (y1Var == y1.f8219h) {
                                    break;
                                }
                            } else if ((mVar6.f8445i & 262144) != 0 && (mVar6 instanceof m)) {
                                y0.m mVar7 = mVar6.f8110v;
                                int i11 = 0;
                                mVar6 = mVar6;
                                r72 = r72;
                                while (mVar7 != null) {
                                    if ((mVar7.f8445i & 262144) != 0) {
                                        i11++;
                                        r72 = r72;
                                        if (i11 == 1) {
                                            mVar6 = mVar7;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar6 != 0) {
                                                r72.b(mVar6);
                                                mVar6 = 0;
                                            }
                                            r72.b(mVar7);
                                        }
                                    }
                                    mVar7 = mVar7.f8448l;
                                    mVar6 = mVar6;
                                    r72 = r72;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar6 = f(r72);
                        }
                    }
                }
            }
            b(eVar, mVar4);
        }
    }
}
