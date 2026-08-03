package e2;

import a0.a0;
import java.util.ArrayList;
import java.util.List;
import v1.p0;
import x1.f1;
import x1.g0;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final y0.m f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1994b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1995c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1997e;

    /* renamed from: f, reason: collision with root package name */
    public n f1998f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1999g;

    public n(y0.m mVar, boolean z10, g0 g0Var, j jVar) {
        this.f1993a = mVar;
        this.f1994b = z10;
        this.f1995c = g0Var;
        this.f1996d = jVar;
        this.f1999g = g0Var.f8042h;
    }

    public static /* synthetic */ List j(int i10, n nVar) {
        return nVar.i((i10 & 1) != 0 ? !nVar.f1994b : false, (i10 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final e1.c a(f1 f1Var) {
        x1.m mVar;
        n l10 = l();
        if (l10 == null) {
            return e1.c.f1930e;
        }
        y0.m mVar2 = l10.f1995c.I.f7991f;
        if ((mVar2.f8446j & 8) != 0) {
            loop0: while (mVar2 != null) {
                if ((mVar2.f8445i & 8) != 0) {
                    mVar = mVar2;
                    ?? r62 = 0;
                    while (mVar != 0) {
                        if (mVar instanceof u1) {
                            if (mVar.h()) {
                                break loop0;
                            }
                        } else if ((mVar.f8445i & 8) != 0 && (mVar instanceof x1.m)) {
                            y0.m mVar3 = mVar.f8110v;
                            int i10 = 0;
                            mVar = mVar;
                            r62 = r62;
                            while (mVar3 != null) {
                                if ((mVar3.f8445i & 8) != 0) {
                                    i10++;
                                    r62 = r62;
                                    if (i10 == 1) {
                                        mVar = mVar3;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar != 0) {
                                            r62.b(mVar);
                                            mVar = 0;
                                        }
                                        r62.b(mVar3);
                                    }
                                }
                                mVar3 = mVar3.f8448l;
                                mVar = mVar;
                                r62 = r62;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVar = x1.f.f(r62);
                    }
                }
                if ((mVar2.f8446j & 8) == 0) {
                    break;
                }
                mVar2 = mVar2.f8448l;
            }
        }
        mVar = 0;
        u1 u1Var = (u1) mVar;
        f1 t3 = u1Var != null ? x1.f.t(u1Var, 8) : null;
        return t3 == null ? l10.a(f1Var) : t3.C(f1Var, true);
    }

    public final n b(g gVar, oc.c cVar) {
        j jVar = new j();
        jVar.f1987i = false;
        jVar.f1988j = false;
        cVar.invoke(jVar);
        n nVar = new n(new m(cVar), false, new g0(this.f1999g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        nVar.f1997e = true;
        nVar.f1998f = this;
        return nVar;
    }

    public final void c(g0 g0Var, ArrayList arrayList) {
        o0.e v10 = g0Var.v();
        Object[] objArr = v10.f5134g;
        int i10 = v10.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.G() && !g0Var2.R) {
                if (g0Var2.I.d(8)) {
                    arrayList.add(q.a(g0Var2, this.f1994b));
                } else {
                    c(g0Var2, arrayList);
                }
            }
        }
    }

    public final f1 d() {
        if (!this.f1997e) {
            u1 f10 = f();
            return f10 != null ? x1.f.t(f10, 8) : this.f1995c.I.f7988c;
        }
        n l10 = l();
        if (l10 != null) {
            return l10.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (nVar.n()) {
                arrayList2.add(nVar);
            } else if (!nVar.f1996d.f1988j) {
                nVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v14, types: [x1.u1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final u1 f() {
        y0.m mVar;
        boolean z10 = this.f1996d.f1987i;
        g0 g0Var = this.f1995c;
        Object obj = null;
        if (!z10) {
            y0.m mVar2 = g0Var.I.f7991f;
            if ((mVar2.f8446j & 8) != 0) {
                loop3: while (mVar2 != null) {
                    if ((mVar2.f8445i & 8) != 0) {
                        mVar = mVar2;
                        o0.e eVar = null;
                        while (mVar != null) {
                            if (mVar instanceof u1) {
                                if (((u1) mVar).h()) {
                                    obj = mVar;
                                }
                            } else if ((mVar.f8445i & 8) != 0 && (mVar instanceof x1.m)) {
                                int i10 = 0;
                                for (y0.m mVar3 = ((x1.m) mVar).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                    if ((mVar3.f8445i & 8) != 0) {
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
                    if ((mVar2.f8446j & 8) == 0) {
                        break;
                    }
                    mVar2 = mVar2.f8448l;
                }
            }
            return (u1) obj;
        }
        y0.m mVar4 = g0Var.I.f7991f;
        if ((mVar4.f8446j & 8) != 0) {
            mVar = null;
            while (mVar4 != null) {
                if ((mVar4.f8445i & 8) != 0) {
                    x1.m mVar5 = mVar4;
                    ?? r72 = 0;
                    while (mVar5 != 0) {
                        if (mVar5 instanceof u1) {
                            ?? r62 = (u1) mVar5;
                            if (r62.h()) {
                                if (r62.T()) {
                                    return r62;
                                }
                                if (mVar == null) {
                                    mVar = r62;
                                }
                            }
                        } else if ((mVar5.f8445i & 8) != 0 && (mVar5 instanceof x1.m)) {
                            y0.m mVar6 = mVar5.f8110v;
                            int i11 = 0;
                            mVar5 = mVar5;
                            r72 = r72;
                            while (mVar6 != null) {
                                if ((mVar6.f8445i & 8) != 0) {
                                    i11++;
                                    r72 = r72;
                                    if (i11 == 1) {
                                        mVar5 = mVar6;
                                    } else {
                                        if (r72 == 0) {
                                            r72 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar5 != 0) {
                                            r72.b(mVar5);
                                            mVar5 = 0;
                                        }
                                        r72.b(mVar6);
                                    }
                                }
                                mVar6 = mVar6.f8448l;
                                mVar5 = mVar5;
                                r72 = r72;
                            }
                            if (i11 == 1) {
                            }
                        }
                        mVar5 = x1.f.f(r72);
                    }
                }
                if ((mVar4.f8446j & 8) == 0) {
                    break;
                }
                mVar4 = mVar4.f8448l;
            }
            obj = mVar;
        }
        return (u1) obj;
    }

    public final e1.c g() {
        f1 d10 = d();
        if (d10 != null) {
            if (!d10.B0().f8456t) {
                d10 = null;
            }
            if (d10 != null) {
                return p0.g(d10).C(d10, true);
            }
        }
        return e1.c.f1930e;
    }

    public final e1.c h() {
        f1 d10 = d();
        if (d10 != null) {
            if (!d10.B0().f8456t) {
                d10 = null;
            }
            if (d10 != null) {
                return p0.e(d10);
            }
        }
        return e1.c.f1930e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f1996d.f1988j) {
            return bc.v.f1067g;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean n7 = n();
        j jVar = this.f1996d;
        if (!n7) {
            return jVar;
        }
        j a6 = jVar.a();
        p(new ArrayList(), a6);
        return a6;
    }

    public final n l() {
        g0 g0Var;
        n nVar = this.f1998f;
        if (nVar != null) {
            return nVar;
        }
        g0 g0Var2 = this.f1995c;
        boolean z10 = this.f1994b;
        if (z10) {
            g0Var = g0Var2.s();
            while (g0Var != null) {
                j u10 = g0Var.u();
                if (u10 != null && u10.f1987i) {
                    break;
                }
                g0Var = g0Var.s();
            }
        }
        g0Var = null;
        if (g0Var == null) {
            g0 s10 = g0Var2.s();
            while (true) {
                if (s10 == null) {
                    g0Var = null;
                    break;
                }
                if (s10.I.d(8)) {
                    g0Var = s10;
                    break;
                }
                s10 = s10.s();
            }
        }
        if (g0Var == null) {
            return null;
        }
        return q.a(g0Var, z10);
    }

    public final j m() {
        return this.f1996d;
    }

    public final boolean n() {
        return this.f1994b && this.f1996d.f1987i;
    }

    public final boolean o() {
        if (this.f1997e || !j(4, this).isEmpty()) {
            return false;
        }
        g0 s10 = this.f1995c.s();
        while (true) {
            if (s10 == null) {
                s10 = null;
                break;
            }
            j u10 = s10.u();
            if (u10 != null && u10.f1987i) {
                break;
            }
            s10 = s10.s();
        }
        return s10 == null;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (this.f1996d.f1988j) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (!nVar.n()) {
                jVar.c(nVar.f1996d);
                nVar.p(arrayList, jVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z10) {
        if (this.f1997e) {
            return bc.v.f1067g;
        }
        c(this.f1995c, arrayList);
        if (z10) {
            j jVar = this.f1996d;
            s.g0 g0Var = jVar.f1985g;
            Object g8 = g0Var.g(s.f2046v);
            if (g8 == null) {
                g8 = null;
            }
            g gVar = (g) g8;
            if (gVar != null && jVar.f1987i && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new a0(9, gVar)));
            }
            v vVar = s.f2025a;
            if (g0Var.c(vVar) && !arrayList.isEmpty() && jVar.f1987i) {
                Object g10 = g0Var.g(vVar);
                if (g10 == null) {
                    g10 = null;
                }
                List list = (List) g10;
                String str = list != null ? (String) bc.m.U(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new l(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
