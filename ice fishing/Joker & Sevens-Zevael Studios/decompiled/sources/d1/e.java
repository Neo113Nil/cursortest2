package d1;

import a0.b0;
import android.view.View;
import m0.i1;
import v1.p0;
import x1.c1;
import x1.f1;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1569a = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(r rVar, r rVar2, int i10, a0.r rVar3) {
        y0.m mVar;
        g0 v10;
        c1 c1Var;
        if (rVar.t0() != p.f1604h) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        r[] rVarArr = new r[16];
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar2 = rVar.f8443g;
        y0.m mVar3 = mVar2.f8448l;
        if (mVar3 == null) {
            x1.f.b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar.f5136i;
            mVar = null;
            if (i12 == 0) {
                break;
            }
            y0.m mVar4 = (y0.m) eVar.k(i12 - 1);
            if ((mVar4.f8446j & 1024) == 0) {
                x1.f.b(eVar, mVar4);
            } else {
                while (true) {
                    if (mVar4 == null) {
                        break;
                    }
                    if ((mVar4.f8445i & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (mVar4 != null) {
                            if (mVar4 instanceof r) {
                                r rVar4 = (r) mVar4;
                                int i13 = i11 + 1;
                                if (rVarArr.length < i13) {
                                    int length = rVarArr.length;
                                    ?? r11 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(rVarArr, 0, r11, 0, length);
                                    rVarArr = r11;
                                }
                                rVarArr[i11] = rVar4;
                                i11 = i13;
                            } else if ((mVar4.f8445i & 1024) != 0 && (mVar4 instanceof x1.m)) {
                                int i14 = 0;
                                for (y0.m mVar5 = ((x1.m) mVar4).f8110v; mVar5 != null; mVar5 = mVar5.f8448l) {
                                    if ((mVar5.f8445i & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            mVar4 = mVar5;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar4 != null) {
                                                eVar2.b(mVar4);
                                                mVar4 = null;
                                            }
                                            eVar2.b(mVar5);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            mVar4 = x1.f.f(eVar2);
                        }
                    } else {
                        mVar4 = mVar4.f8448l;
                    }
                }
            }
        }
        bc.l.b0(rVarArr, s.f1613a, 0, i11);
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            uc.d q10 = uc.e.q(0, i11);
            int i15 = q10.f6735g;
            int i16 = q10.f6736h;
            if (i15 <= i16) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        r rVar5 = rVarArr[i16];
                        if (r(rVar5) && a(rVar5, rVar3)) {
                            break;
                        }
                    }
                    if (pc.j.a(rVarArr[i16], rVar2)) {
                        z10 = true;
                    }
                    if (i16 == i15) {
                        break;
                    }
                    i16--;
                }
                return true;
            }
            if (i10 != 1) {
                if (!rVar.f8443g.f8456t) {
                }
                y0.m mVar6 = rVar.f8443g.f8447k;
                v10 = x1.f.v(rVar);
                loop5: while (true) {
                    if (v10 == null) {
                    }
                }
                if (mVar != null) {
                }
            }
            return false;
        }
        uc.d q11 = uc.e.q(0, i11);
        int i17 = q11.f6735g;
        int i18 = q11.f6736h;
        if (i17 <= i18) {
            boolean z11 = false;
            while (true) {
                if (z11) {
                    r rVar6 = rVarArr[i17];
                    if (r(rVar6) && k(rVar6, rVar3)) {
                        break;
                    }
                }
                if (pc.j.a(rVarArr[i17], rVar2)) {
                    z11 = true;
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
            return true;
        }
        if (i10 != 1 && rVar.s0().f1588a) {
            if (!rVar.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar62 = rVar.f8443g.f8447k;
            v10 = x1.f.v(rVar);
            loop5: while (true) {
                if (v10 == null) {
                    break;
                }
                if ((v10.I.f7991f.f8446j & 1024) != 0) {
                    while (mVar62 != null) {
                        if ((mVar62.f8445i & 1024) != 0) {
                            y0.m mVar7 = mVar62;
                            o0.e eVar3 = null;
                            while (mVar7 != null) {
                                if (mVar7 instanceof r) {
                                    mVar = mVar7;
                                    break loop5;
                                }
                                if ((mVar7.f8445i & 1024) != 0 && (mVar7 instanceof x1.m)) {
                                    int i19 = 0;
                                    for (y0.m mVar8 = ((x1.m) mVar7).f8110v; mVar8 != null; mVar8 = mVar8.f8448l) {
                                        if ((mVar8.f8445i & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                mVar7 = mVar8;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar7 != null) {
                                                    eVar3.b(mVar7);
                                                    mVar7 = null;
                                                }
                                                eVar3.b(mVar8);
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                mVar7 = x1.f.f(eVar3);
                            }
                        }
                        mVar62 = mVar62.f8447k;
                    }
                }
                v10 = v10.s();
                mVar62 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
            }
            if (mVar != null) {
                return ((Boolean) rVar3.invoke(rVar)).booleanValue();
            }
        }
        return false;
    }

    public static final b B(int i10) {
        if (i10 == 1) {
            return new b(2);
        }
        if (i10 == 2) {
            return new b(1);
        }
        if (i10 == 17) {
            return new b(3);
        }
        if (i10 == 33) {
            return new b(5);
        }
        if (i10 == 66) {
            return new b(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean C(int i10, a0.r rVar, r rVar2, e1.c cVar) {
        int ordinal = rVar2.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n7 = n(rVar2);
                if (n7 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n7.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean C = C(i10, rVar, n7, cVar);
                        if (!pc.j.a(C, Boolean.FALSE)) {
                            return C;
                        }
                        if (cVar == null) {
                            if (n7.t0() != p.f1604h) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            r g8 = g(n7);
                            if (g8 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = j(g8);
                        }
                        return Boolean.valueOf(l(i10, rVar, rVar2, cVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new ac.d();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = j(n7);
                }
                return Boolean.valueOf(l(i10, rVar, rVar2, cVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rVar2.s0().f1588a ? (Boolean) rVar.invoke(rVar2) : cVar == null ? Boolean.valueOf(i(rVar2, i10, rVar)) : Boolean.valueOf(z(i10, rVar, rVar2, cVar));
                }
                throw new ac.d();
            }
        }
        return Boolean.valueOf(i(rVar2, i10, rVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(r rVar, a0.r rVar2) {
        int ordinal = rVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n7 = n(rVar);
                if (n7 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n7.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new ac.d();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (a(n7, rVar2) || m(rVar, n7, 2, rVar2) || (n7.s0().f1588a && ((Boolean) rVar2.invoke(n7)).booleanValue())) {
                        return true;
                    }
                }
                return m(rVar, n7, 2, rVar2);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ac.d();
                }
                if (!w(rVar, rVar2)) {
                    if (!(rVar.s0().f1588a ? ((Boolean) rVar2.invoke(rVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return w(rVar, rVar2);
    }

    public static final boolean b(e1.c cVar, e1.c cVar2, e1.c cVar3, int i10) {
        float f10;
        float f11;
        boolean c3 = c(i10, cVar3, cVar);
        float f12 = cVar3.f1932b;
        float f13 = cVar3.f1934d;
        float f14 = cVar3.f1931a;
        float f15 = cVar3.f1933c;
        float f16 = cVar.f1934d;
        float f17 = cVar.f1932b;
        float f18 = cVar.f1933c;
        float f19 = cVar.f1931a;
        if (c3 || !c(i10, cVar2, cVar)) {
            return false;
        }
        if (i10 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i10 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i10 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f10 = f19 - cVar2.f1933c;
        } else if (i10 == 4) {
            f10 = cVar2.f1931a - f18;
        } else if (i10 == 5) {
            f10 = f17 - cVar2.f1934d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f1932b - f16;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (i10 == 3) {
            f11 = f19 - f14;
        } else if (i10 == 4) {
            f11 = f15 - f18;
        } else if (i10 == 5) {
            f11 = f17 - f12;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f10 < f11;
    }

    public static final boolean c(int i10, e1.c cVar, e1.c cVar2) {
        if (i10 == 3 || i10 == 4) {
            return cVar.f1934d > cVar2.f1932b && cVar.f1932b < cVar2.f1934d;
        }
        if (i10 == 5 || i10 == 6) {
            return cVar.f1933c > cVar2.f1931a && cVar.f1931a < cVar2.f1933c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final e1.c d(View view, y1.r rVar) {
        int[] iArr = f1569a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        rVar.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        return new e1.c(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean e(r rVar, boolean z10) {
        int ordinal = rVar.t0().ordinal();
        p pVar = p.f1606j;
        if (ordinal == 0) {
            ((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f(null);
            rVar.r0(p.f1603g, pVar);
            return true;
        }
        if (ordinal == 1) {
            r n7 = n(rVar);
            if (!(n7 != null ? e(n7, z10) : true)) {
                return false;
            }
            rVar.r0(p.f1604h, pVar);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new ac.d();
        }
        if (z10) {
            ((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f(null);
            rVar.r0(p.f1605i, pVar);
        }
        return z10;
    }

    public static final void f(r rVar, o0.e eVar) {
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new y0.m[16]);
        y0.m mVar = rVar.f8443g;
        y0.m mVar2 = mVar.f8448l;
        if (mVar2 == null) {
            x1.f.b(eVar2, mVar);
        } else {
            eVar2.b(mVar2);
        }
        while (true) {
            int i10 = eVar2.f5136i;
            if (i10 == 0) {
                return;
            }
            y0.m mVar3 = (y0.m) eVar2.k(i10 - 1);
            if ((mVar3.f8446j & 1024) == 0) {
                x1.f.b(eVar2, mVar3);
            } else {
                while (true) {
                    if (mVar3 == null) {
                        break;
                    }
                    if ((mVar3.f8445i & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (mVar3 != null) {
                            if (mVar3 instanceof r) {
                                r rVar2 = (r) mVar3;
                                if (rVar2.f8456t && !x1.f.v(rVar2).R) {
                                    if (rVar2.s0().f1588a) {
                                        eVar.b(rVar2);
                                    } else {
                                        f(rVar2, eVar);
                                    }
                                }
                            } else if ((mVar3.f8445i & 1024) != 0 && (mVar3 instanceof x1.m)) {
                                int i11 = 0;
                                for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                    if ((mVar4.f8445i & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != null) {
                                                eVar3.b(mVar3);
                                                mVar3 = null;
                                            }
                                            eVar3.b(mVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar3 = x1.f.f(eVar3);
                        }
                    } else {
                        mVar3 = mVar3.f8448l;
                    }
                }
            }
        }
    }

    public static final r g(r rVar) {
        r rVar2 = ((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f1583h;
        if (rVar2 == null || !rVar2.f8456t) {
            return null;
        }
        return rVar2;
    }

    public static final r h(o0.e eVar, e1.c cVar, int i10) {
        e1.c d10;
        if (i10 == 3) {
            d10 = cVar.d((cVar.f1933c - cVar.f1931a) + 1, 0.0f);
        } else if (i10 == 4) {
            d10 = cVar.d(-((cVar.f1933c - cVar.f1931a) + 1), 0.0f);
        } else if (i10 == 5) {
            d10 = cVar.d(0.0f, (cVar.f1934d - cVar.f1932b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d10 = cVar.d(0.0f, -((cVar.f1934d - cVar.f1932b) + 1));
        }
        Object[] objArr = eVar.f5134g;
        int i11 = eVar.f5136i;
        r rVar = null;
        for (int i12 = 0; i12 < i11; i12++) {
            r rVar2 = (r) objArr[i12];
            if (r(rVar2)) {
                e1.c j3 = j(rVar2);
                if (o(j3, d10, cVar, i10)) {
                    rVar = rVar2;
                    d10 = j3;
                }
            }
        }
        return rVar;
    }

    public static final boolean i(r rVar, int i10, oc.c cVar) {
        e1.c cVar2;
        o0.e eVar = new o0.e(new r[16]);
        f(rVar, eVar);
        int i11 = eVar.f5136i;
        if (i11 <= 1) {
            r rVar2 = (r) (i11 == 0 ? null : eVar.f5134g[0]);
            if (rVar2 != null) {
                return ((Boolean) cVar.invoke(rVar2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                e1.c j3 = j(rVar);
                float f10 = j3.f1931a;
                float f11 = j3.f1932b;
                cVar2 = new e1.c(f10, f11, f10, f11);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                e1.c j6 = j(rVar);
                float f12 = j6.f1933c;
                float f13 = j6.f1934d;
                cVar2 = new e1.c(f12, f13, f12, f13);
            }
            r h10 = h(eVar, cVar2, i10);
            if (h10 != null) {
                return ((Boolean) cVar.invoke(h10)).booleanValue();
            }
        }
        return false;
    }

    public static final e1.c j(r rVar) {
        f1 f1Var = rVar.f8450n;
        return f1Var != null ? p0.g(f1Var).C(f1Var, false) : e1.c.f1930e;
    }

    public static final boolean k(r rVar, a0.r rVar2) {
        int ordinal = rVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n7 = n(rVar);
                if (n7 != null) {
                    return k(n7, rVar2) || m(rVar, n7, 1, rVar2);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rVar.s0().f1588a ? ((Boolean) rVar2.invoke(rVar)).booleanValue() : x(rVar, rVar2);
                }
                throw new ac.d();
            }
        }
        return x(rVar, rVar2);
    }

    public static final boolean l(int i10, a0.r rVar, r rVar2, e1.c cVar) {
        if (z(i10, rVar, rVar2, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) y(rVar2, i10, new u(((i) ((y1.r) x1.f.w(rVar2)).getFocusOwner()).f1583h, rVar2, cVar, i10, rVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(r rVar, r rVar2, int i10, a0.r rVar3) {
        if (A(rVar, rVar2, i10, rVar3)) {
            return true;
        }
        Boolean bool = (Boolean) y(rVar, i10, new u(((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f1583h, rVar, rVar2, i10, rVar3, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r n(r rVar) {
        boolean z10 = rVar.f8443g.f8456t;
        if (z10) {
            if (!z10) {
                u1.a.b("visitChildren called on an unattached node");
            }
            o0.e eVar = new o0.e(new y0.m[16]);
            y0.m mVar = rVar.f8443g;
            y0.m mVar2 = mVar.f8448l;
            if (mVar2 == null) {
                x1.f.b(eVar, mVar);
            } else {
                eVar.b(mVar2);
            }
            loop0: while (true) {
                int i10 = eVar.f5136i;
                if (i10 == 0) {
                    break;
                }
                y0.m mVar3 = (y0.m) eVar.k(i10 - 1);
                if ((mVar3.f8446j & 1024) == 0) {
                    x1.f.b(eVar, mVar3);
                } else {
                    while (true) {
                        if (mVar3 == null) {
                            break;
                        }
                        if ((mVar3.f8445i & 1024) != 0) {
                            o0.e eVar2 = null;
                            while (mVar3 != null) {
                                if (mVar3 instanceof r) {
                                    r rVar2 = (r) mVar3;
                                    if (rVar2.f8443g.f8456t) {
                                        int ordinal = rVar2.t0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new ac.d();
                                        }
                                    }
                                } else if ((mVar3.f8445i & 1024) != 0 && (mVar3 instanceof x1.m)) {
                                    int i11 = 0;
                                    for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                        if ((mVar4.f8445i & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                mVar3 = mVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar3 != null) {
                                                    eVar2.b(mVar3);
                                                    mVar3 = null;
                                                }
                                                eVar2.b(mVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVar3 = x1.f.f(eVar2);
                            }
                        } else {
                            mVar3 = mVar3.f8448l;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean o(e1.c cVar, e1.c cVar2, e1.c cVar3, int i10) {
        if (!p(i10, cVar, cVar3)) {
            return false;
        }
        if (p(i10, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i10)) {
            return !b(cVar3, cVar2, cVar, i10) && q(i10, cVar3, cVar) < q(i10, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i10, e1.c cVar, e1.c cVar2) {
        float f10 = cVar.f1932b;
        float f11 = cVar.f1934d;
        float f12 = cVar.f1931a;
        float f13 = cVar.f1933c;
        if (i10 == 3) {
            float f14 = cVar2.f1933c;
            float f15 = cVar2.f1931a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i10 == 4) {
            float f16 = cVar2.f1931a;
            float f17 = cVar2.f1933c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i10 == 5) {
            float f18 = cVar2.f1934d;
            float f19 = cVar2.f1932b;
            return (f18 > f11 || f19 >= f11) && f19 > f10;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f20 = cVar2.f1932b;
        float f21 = cVar2.f1934d;
        return (f20 < f10 || f21 <= f10) && f21 < f11;
    }

    public static final long q(int i10, e1.c cVar, e1.c cVar2) {
        float f10;
        float f11;
        float f12 = cVar2.f1932b;
        float f13 = cVar2.f1934d;
        float f14 = cVar2.f1931a;
        float f15 = cVar2.f1933c;
        if (i10 == 3) {
            f10 = cVar.f1931a - f15;
        } else if (i10 == 4) {
            f10 = f14 - cVar.f1933c;
        } else if (i10 == 5) {
            f10 = cVar.f1932b - f13;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - cVar.f1934d;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j3 = (long) f10;
        if (i10 == 3 || i10 == 4) {
            float f16 = cVar.f1932b;
            float f17 = 2;
            f11 = (((cVar.f1934d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f1931a;
            float f19 = 2;
            f11 = (((cVar.f1933c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j6 = (long) f11;
        return (j6 * j6) + (13 * j3 * j3);
    }

    public static final boolean r(r rVar) {
        g0 g0Var;
        f1 f1Var;
        g0 g0Var2;
        f1 f1Var2 = rVar.f8450n;
        return (f1Var2 == null || (g0Var = f1Var2.f8033u) == null || !g0Var.H() || (f1Var = rVar.f8450n) == null || (g0Var2 = f1Var.f8033u) == null || !g0Var2.G()) ? false : true;
    }

    public static final a s(r rVar) {
        int ordinal = rVar.t0().ordinal();
        a aVar = a.f1564g;
        if (ordinal != 0) {
            a aVar2 = a.f1565h;
            if (ordinal == 1) {
                r n7 = n(rVar);
                if (n7 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                a s10 = s(n7);
                if (s10 == aVar) {
                    s10 = null;
                }
                if (s10 != null) {
                    return s10;
                }
                if (rVar.f1610v) {
                    return aVar;
                }
                rVar.f1610v = true;
                try {
                    l s02 = rVar.s0();
                    h focusOwner = ((y1.r) x1.f.w(rVar)).getFocusOwner();
                    r rVar2 = ((i) focusOwner).f1583h;
                    s02.f1598k.getClass();
                    r rVar3 = ((i) focusOwner).f1583h;
                    return (rVar2 == rVar3 || rVar3 == null) ? aVar : n.f1601d == n.f1600c ? aVar2 : a.f1566i;
                } finally {
                    rVar.f1610v = false;
                }
            }
            if (ordinal == 2) {
                return aVar2;
            }
            if (ordinal != 3) {
                throw new ac.d();
            }
        }
        return aVar;
    }

    public static final a t(r rVar) {
        if (!rVar.f1611w) {
            rVar.f1611w = true;
            try {
                l s02 = rVar.s0();
                h focusOwner = ((y1.r) x1.f.w(rVar)).getFocusOwner();
                r rVar2 = ((i) focusOwner).f1583h;
                s02.f1597j.getClass();
                r rVar3 = ((i) focusOwner).f1583h;
                if (rVar2 != rVar3 && rVar3 != null) {
                    return n.f1601d == n.f1600c ? a.f1565h : a.f1566i;
                }
            } finally {
                rVar.f1611w = false;
            }
        }
        return a.f1564g;
    }

    public static final a u(r rVar) {
        y0.m mVar;
        c1 c1Var;
        int ordinal = rVar.t0().ordinal();
        a aVar = a.f1564g;
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n7 = n(rVar);
                if (n7 != null) {
                    return s(n7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ac.d();
                }
                if (!rVar.f8443g.f8456t) {
                    u1.a.b("visitAncestors called on an unattached node");
                }
                y0.m mVar2 = rVar.f8443g.f8447k;
                g0 v10 = x1.f.v(rVar);
                loop0: while (true) {
                    if (v10 == null) {
                        mVar = null;
                        break;
                    }
                    if ((v10.I.f7991f.f8446j & 1024) != 0) {
                        while (mVar2 != null) {
                            if ((mVar2.f8445i & 1024) != 0) {
                                mVar = mVar2;
                                o0.e eVar = null;
                                while (mVar != null) {
                                    if (mVar instanceof r) {
                                        break loop0;
                                    }
                                    if ((mVar.f8445i & 1024) != 0 && (mVar instanceof x1.m)) {
                                        int i10 = 0;
                                        for (y0.m mVar3 = ((x1.m) mVar).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                            if ((mVar3.f8445i & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    mVar = mVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.m[16]);
                                                    }
                                                    if (mVar != null) {
                                                        eVar.b(mVar);
                                                        mVar = null;
                                                    }
                                                    eVar.b(mVar3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    mVar = x1.f.f(eVar);
                                }
                            }
                            mVar2 = mVar2.f8447k;
                        }
                    }
                    v10 = v10.s();
                    mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
                }
                r rVar2 = (r) mVar;
                if (rVar2 == null) {
                    return aVar;
                }
                int ordinal2 = rVar2.t0().ordinal();
                if (ordinal2 == 0) {
                    return t(rVar2);
                }
                if (ordinal2 == 1) {
                    return u(rVar2);
                }
                if (ordinal2 == 2) {
                    return a.f1565h;
                }
                if (ordinal2 != 3) {
                    throw new ac.d();
                }
                a u10 = u(rVar2);
                a aVar2 = u10 != aVar ? u10 : null;
                return aVar2 == null ? t(rVar2) : aVar2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean v(r rVar) {
        o0.e eVar;
        c1 c1Var;
        char c3;
        c1 c1Var2;
        i iVar = (i) ((y1.r) x1.f.w(rVar)).getFocusOwner();
        r rVar2 = iVar.f1583h;
        p t02 = rVar.t0();
        if (rVar2 == rVar) {
            rVar.r0(t02, t02);
            return true;
        }
        int i10 = 0;
        if (rVar2 == null && !((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f1576a.D()) {
            return false;
        }
        char c7 = 16;
        if (rVar2 != null) {
            eVar = new o0.e(new r[16]);
            if (!rVar2.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar = rVar2.f8443g.f8447k;
            g0 v10 = x1.f.v(rVar2);
            while (v10 != null) {
                if ((v10.I.f7991f.f8446j & 1024) != 0) {
                    while (mVar != null) {
                        if ((mVar.f8445i & 1024) != 0) {
                            y0.m mVar2 = mVar;
                            o0.e eVar2 = null;
                            while (mVar2 != null) {
                                if (mVar2 instanceof r) {
                                    eVar.b((r) mVar2);
                                } else if ((mVar2.f8445i & 1024) != 0 && (mVar2 instanceof x1.m)) {
                                    int i11 = 0;
                                    for (y0.m mVar3 = ((x1.m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                        if ((mVar3.f8445i & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                mVar2 = mVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar2 != null) {
                                                    eVar2.b(mVar2);
                                                    mVar2 = null;
                                                }
                                                eVar2.b(mVar3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVar2 = x1.f.f(eVar2);
                            }
                        }
                        mVar = mVar.f8447k;
                    }
                }
                v10 = v10.s();
                mVar = (v10 == null || (c1Var2 = v10.I) == null) ? null : c1Var2.f7990e;
            }
        } else {
            eVar = null;
        }
        r[] rVarArr = new r[16];
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar4 = rVar.f8443g.f8447k;
        g0 v11 = x1.f.v(rVar);
        int i12 = 1;
        int i13 = 0;
        while (v11 != null) {
            if ((v11.I.f7991f.f8446j & 1024) != 0) {
                while (mVar4 != null) {
                    if ((mVar4.f8445i & 1024) != 0) {
                        y0.m mVar5 = mVar4;
                        o0.e eVar3 = null;
                        while (mVar5 != null) {
                            if (mVar5 instanceof r) {
                                r rVar3 = (r) mVar5;
                                Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.j(rVar3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i14 = i13 + 1;
                                    if (rVarArr.length < i14) {
                                        int length = rVarArr.length;
                                        ?? r42 = new Object[Math.max(i14, length * 2)];
                                        System.arraycopy(rVarArr, i10, r42, i10, length);
                                        rVarArr = r42;
                                    }
                                    rVarArr[i13] = rVar3;
                                    i13 = i14;
                                }
                                if (rVar3 == rVar2) {
                                    i12 = i10;
                                }
                            } else if ((mVar5.f8445i & 1024) != 0 && (mVar5 instanceof x1.m)) {
                                int i15 = i10;
                                for (y0.m mVar6 = ((x1.m) mVar5).f8110v; mVar6 != null; mVar6 = mVar6.f8448l) {
                                    if ((mVar6.f8445i & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            mVar5 = mVar6;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar5 != null) {
                                                eVar3.b(mVar5);
                                                mVar5 = null;
                                            }
                                            eVar3.b(mVar6);
                                        }
                                    }
                                }
                                c3 = 16;
                                if (i15 == 1) {
                                    c7 = 16;
                                    i10 = 0;
                                }
                                mVar5 = x1.f.f(eVar3);
                                c7 = c3;
                                i10 = 0;
                            }
                            c3 = 16;
                            mVar5 = x1.f.f(eVar3);
                            c7 = c3;
                            i10 = 0;
                        }
                    }
                    mVar4 = mVar4.f8447k;
                    c7 = c7;
                    i10 = 0;
                }
            }
            char c10 = c7;
            v11 = v11.s();
            mVar4 = (v11 == null || (c1Var = v11.I) == null) ? null : c1Var.f7990e;
            c7 = c10;
            i10 = 0;
        }
        if (i12 == 0 || rVar2 == null || e(rVar2, false)) {
            x1.f.s(rVar, new b0.p0(2, rVar));
            int ordinal = rVar.t0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new ac.d();
                        }
                    }
                }
                ((i) ((y1.r) x1.f.w(rVar)).getFocusOwner()).f(rVar);
            }
            p pVar = p.f1606j;
            p pVar2 = p.f1604h;
            if (eVar != null) {
                int i16 = eVar.f5136i - 1;
                Object[] objArr = eVar.f5134g;
                if (i16 < objArr.length) {
                    while (i16 >= 0) {
                        r rVar4 = (r) objArr[i16];
                        if (iVar.f1583h != rVar) {
                            break;
                        }
                        rVar4.r0(pVar2, pVar);
                        i16--;
                    }
                }
            }
            int i17 = i13 - 1;
            int length2 = rVarArr.length;
            p pVar3 = p.f1603g;
            if (i17 < length2) {
                while (i17 >= 0) {
                    r rVar5 = rVarArr[i17];
                    if (iVar.f1583h != rVar) {
                        break;
                    }
                    rVar5.r0(rVar5 == rVar2 ? pVar3 : pVar, pVar2);
                    i17--;
                }
            }
            if (iVar.f1583h == rVar) {
                rVar.r0(t02, pVar3);
                if (iVar.f1583h != rVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean w(r rVar, a0.r rVar2) {
        r[] rVarArr = new r[16];
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar = rVar.f8443g;
        y0.m mVar2 = mVar.f8448l;
        if (mVar2 == null) {
            x1.f.b(eVar, mVar);
        } else {
            eVar.b(mVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f5136i;
            if (i11 == 0) {
                break;
            }
            y0.m mVar3 = (y0.m) eVar.k(i11 - 1);
            if ((mVar3.f8446j & 1024) == 0) {
                x1.f.b(eVar, mVar3);
            } else {
                while (true) {
                    if (mVar3 == null) {
                        break;
                    }
                    if ((mVar3.f8445i & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (mVar3 != null) {
                            if (mVar3 instanceof r) {
                                r rVar3 = (r) mVar3;
                                int i12 = i10 + 1;
                                if (rVarArr.length < i12) {
                                    int length = rVarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(rVarArr, 0, r10, 0, length);
                                    rVarArr = r10;
                                }
                                rVarArr[i10] = rVar3;
                                i10 = i12;
                            } else if ((mVar3.f8445i & 1024) != 0 && (mVar3 instanceof x1.m)) {
                                int i13 = 0;
                                for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                    if ((mVar4.f8445i & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != null) {
                                                eVar2.b(mVar3);
                                                mVar3 = null;
                                            }
                                            eVar2.b(mVar4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            mVar3 = x1.f.f(eVar2);
                        }
                    } else {
                        mVar3 = mVar3.f8448l;
                    }
                }
            }
        }
        bc.l.b0(rVarArr, s.f1613a, 0, i10);
        int i14 = i10 - 1;
        if (i14 < rVarArr.length) {
            while (i14 >= 0) {
                r rVar4 = rVarArr[i14];
                if (r(rVar4) && a(rVar4, rVar2)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(r rVar, a0.r rVar2) {
        r[] rVarArr = new r[16];
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar = rVar.f8443g;
        y0.m mVar2 = mVar.f8448l;
        if (mVar2 == null) {
            x1.f.b(eVar, mVar);
        } else {
            eVar.b(mVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f5136i;
            if (i11 == 0) {
                break;
            }
            y0.m mVar3 = (y0.m) eVar.k(i11 - 1);
            if ((mVar3.f8446j & 1024) == 0) {
                x1.f.b(eVar, mVar3);
            } else {
                while (true) {
                    if (mVar3 == null) {
                        break;
                    }
                    if ((mVar3.f8445i & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (mVar3 != null) {
                            if (mVar3 instanceof r) {
                                r rVar3 = (r) mVar3;
                                int i12 = i10 + 1;
                                if (rVarArr.length < i12) {
                                    int length = rVarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(rVarArr, 0, r10, 0, length);
                                    rVarArr = r10;
                                }
                                rVarArr[i10] = rVar3;
                                i10 = i12;
                            } else if ((mVar3.f8445i & 1024) != 0 && (mVar3 instanceof x1.m)) {
                                int i13 = 0;
                                for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                    if ((mVar4.f8445i & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != null) {
                                                eVar2.b(mVar3);
                                                mVar3 = null;
                                            }
                                            eVar2.b(mVar4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            mVar3 = x1.f.f(eVar2);
                        }
                    } else {
                        mVar3 = mVar3.f8448l;
                    }
                }
            }
        }
        bc.l.b0(rVarArr, s.f1613a, 0, i10);
        for (int i14 = 0; i14 < i10; i14++) {
            r rVar4 = rVarArr[i14];
            if (r(rVar4) && k(rVar4, rVar2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (pc.j.a((b0.m) r5.f(r0), (b0.m) r10.f(r0)) != false) goto L99;
     */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(r rVar, int i10, oc.c cVar) {
        Object obj;
        y0.m mVar;
        c1 c1Var;
        if (!rVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = rVar.f8443g.f8447k;
        g0 v10 = x1.f.v(rVar);
        loop0: while (true) {
            obj = null;
            if (v10 == null) {
                mVar = null;
                break;
            }
            if ((v10.I.f7991f.f8446j & 1024) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 1024) != 0) {
                        mVar = mVar2;
                        o0.e eVar = null;
                        while (mVar != null) {
                            if (mVar instanceof r) {
                                break loop0;
                            }
                            if ((mVar.f8445i & 1024) != 0 && (mVar instanceof x1.m)) {
                                int i11 = 0;
                                for (y0.m mVar3 = ((x1.m) mVar).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                    if ((mVar3.f8445i & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            mVar = mVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar != null) {
                                                eVar.b(mVar);
                                                mVar = null;
                                            }
                                            eVar.b(mVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar = x1.f.f(eVar);
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        r rVar2 = (r) mVar;
        if (rVar2 != null) {
            w1.g gVar = v1.f.f7076a;
        }
        b0.m mVar4 = (b0.m) rVar.f(v1.f.f7076a);
        if (mVar4 != null) {
            int i12 = 5;
            if (i10 != 5) {
                i12 = 6;
                if (i10 != 6) {
                    i12 = 3;
                    if (i10 != 3) {
                        i12 = 4;
                        if (i10 != 4) {
                            i12 = 2;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                }
                                i12 = 1;
                            }
                        }
                    }
                }
            }
            b0.j jVar = mVar4.f851b;
            a0.e eVar2 = mVar4.f850a;
            b0 b0Var = eVar2.f41a;
            b0 b0Var2 = eVar2.f41a;
            if (b0Var.g().f115m <= 0 || b0Var2.g().f112j.isEmpty()) {
                return cVar.invoke(b0.m.f849e);
            }
            int min = mVar4.g(i12) ? Math.min(b0Var2.g().f115m - 1, ((a0.t) bc.m.X(b0Var2.g().f112j)).f120a) : Math.max(0, ((i1) b0Var2.f19d.f136b).g());
            pc.s sVar = new pc.s();
            jVar.getClass();
            o0.e eVar3 = jVar.f839a;
            b0.i iVar = new b0.i(min, min);
            eVar3.b(iVar);
            sVar.f5683g = iVar;
            while (obj == null && mVar4.f((b0.i) sVar.f5683g, i12)) {
                b0.i iVar2 = (b0.i) sVar.f5683g;
                int i13 = iVar2.f831a;
                int i14 = iVar2.f832b;
                if (mVar4.g(i12)) {
                    i14++;
                } else {
                    i13--;
                }
                b0.i iVar3 = new b0.i(i13, i14);
                eVar3.b(iVar3);
                eVar3.j((b0.i) sVar.f5683g);
                sVar.f5683g = iVar3;
                g0 g0Var = b0Var2.f25j;
                if (g0Var != null) {
                    g0Var.k();
                }
                obj = cVar.invoke(new b0.l(mVar4, sVar, i12));
            }
            eVar3.j((b0.i) sVar.f5683g);
            g0 g0Var2 = b0Var2.f25j;
            if (g0Var2 != null) {
                g0Var2.k();
            }
            return obj;
        }
        return null;
    }

    public static final boolean z(int i10, a0.r rVar, r rVar2, e1.c cVar) {
        r h10;
        o0.e eVar = new o0.e(new r[16]);
        if (!rVar2.f8443g.f8456t) {
            u1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new y0.m[16]);
        y0.m mVar = rVar2.f8443g;
        y0.m mVar2 = mVar.f8448l;
        if (mVar2 == null) {
            x1.f.b(eVar2, mVar);
        } else {
            eVar2.b(mVar2);
        }
        while (true) {
            int i11 = eVar2.f5136i;
            if (i11 == 0) {
                break;
            }
            y0.m mVar3 = (y0.m) eVar2.k(i11 - 1);
            if ((mVar3.f8446j & 1024) == 0) {
                x1.f.b(eVar2, mVar3);
            } else {
                while (true) {
                    if (mVar3 == null) {
                        break;
                    }
                    if ((mVar3.f8445i & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (mVar3 != null) {
                            if (mVar3 instanceof r) {
                                r rVar3 = (r) mVar3;
                                if (rVar3.f8456t) {
                                    eVar.b(rVar3);
                                }
                            } else if ((mVar3.f8445i & 1024) != 0 && (mVar3 instanceof x1.m)) {
                                int i12 = 0;
                                for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                    if ((mVar4.f8445i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar3 != null) {
                                                eVar3.b(mVar3);
                                                mVar3 = null;
                                            }
                                            eVar3.b(mVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            mVar3 = x1.f.f(eVar3);
                        }
                    } else {
                        mVar3 = mVar3.f8448l;
                    }
                }
            }
        }
        while (eVar.f5136i != 0 && (h10 = h(eVar, cVar, i10)) != null) {
            if (h10.s0().f1588a) {
                return ((Boolean) rVar.invoke(h10)).booleanValue();
            }
            if (l(i10, rVar, h10, cVar)) {
                return true;
            }
            eVar.j(h10);
        }
        return false;
    }
}
