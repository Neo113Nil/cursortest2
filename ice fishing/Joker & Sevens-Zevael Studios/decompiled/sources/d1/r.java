package d1;

import android.os.Trace;
import x1.c1;
import x1.g0;
import x1.h1;
import y1.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends y0.m implements x1.k, h1, w1.d {

    /* renamed from: u, reason: collision with root package name */
    public final oc.c f1609u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1610v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1611w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1612x;

    public r(q qVar, int i10) {
        int i11 = (i10 & 1) != 0 ? 1 : 2;
        this.f1609u = (i10 & 4) != 0 ? null : qVar;
        this.f1612x = i11;
    }

    @Override // x1.h1
    public final void C() {
        u0();
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // y0.m
    public final void k0() {
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ac.d();
                }
                return;
            }
        }
        i iVar = (i) ((y1.r) x1.f.w(this)).getFocusOwner();
        iVar.b(8, true, false);
        iVar.f1579d.a();
    }

    @Override // y0.m
    public final void l0() {
        if (t0().a()) {
            ((i) ((y1.r) x1.f.w(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [o0.e] */
    public final void r0(p pVar, p pVar2) {
        c1 c1Var;
        i iVar = (i) ((y1.r) x1.f.w(this)).getFocusOwner();
        r rVar = iVar.f1583h;
        pVar.equals(pVar2);
        y0.m mVar = this.f8443g;
        if (!mVar.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = this.f8443g;
        g0 v10 = x1.f.v(this);
        loop0: while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 5120) != 0) {
                while (mVar2 != null) {
                    int i10 = mVar2.f8445i;
                    if ((i10 & 5120) != 0) {
                        if (mVar2 != mVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 4096) != 0) {
                            x1.m mVar3 = mVar2;
                            ?? r62 = 0;
                            while (mVar3 != 0) {
                                if (mVar3 instanceof d) {
                                    d dVar = (d) mVar3;
                                    if (rVar == iVar.f1583h) {
                                        dVar.n(pVar2);
                                    }
                                } else if ((mVar3.f8445i & 4096) != 0 && (mVar3 instanceof x1.m)) {
                                    y0.m mVar4 = mVar3.f8110v;
                                    int i11 = 0;
                                    mVar3 = mVar3;
                                    r62 = r62;
                                    while (mVar4 != null) {
                                        if ((mVar4.f8445i & 4096) != 0) {
                                            i11++;
                                            r62 = r62;
                                            if (i11 == 1) {
                                                mVar3 = mVar4;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar3 != 0) {
                                                    r62.b(mVar3);
                                                    mVar3 = 0;
                                                }
                                                r62.b(mVar4);
                                            }
                                        }
                                        mVar4 = mVar4.f8448l;
                                        mVar3 = mVar3;
                                        r62 = r62;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVar3 = x1.f.f(r62);
                            }
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        oc.c cVar = this.f1609u;
        if (cVar != null) {
            cVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [o0.e] */
    public final l s0() {
        boolean z10;
        c1 c1Var;
        l lVar = new l();
        lVar.f1588a = true;
        n nVar = n.f1599b;
        lVar.f1589b = nVar;
        lVar.f1590c = nVar;
        lVar.f1591d = nVar;
        lVar.f1592e = nVar;
        lVar.f1593f = nVar;
        lVar.f1594g = nVar;
        lVar.f1595h = nVar;
        lVar.f1596i = nVar;
        lVar.f1597j = k.f1584h;
        lVar.f1598k = k.f1585i;
        int i10 = this.f1612x;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((o1.a) ((o1.c) ((o1.b) x1.f.i(this, y0.f8714m))).f5150a.getValue()).f5149a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        lVar.f1588a = z10;
        y0.m mVar = this.f8443g;
        if (!mVar.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar2 = this.f8443g;
        g0 v10 = x1.f.v(this);
        loop0: while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 3072) != 0) {
                while (mVar2 != null) {
                    int i11 = mVar2.f8445i;
                    if ((i11 & 3072) != 0) {
                        if (mVar2 != mVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            x1.m mVar3 = mVar2;
                            ?? r82 = 0;
                            while (mVar3 != 0) {
                                if (mVar3 instanceof m) {
                                    ((m) mVar3).p(lVar);
                                } else if ((mVar3.f8445i & 2048) != 0 && (mVar3 instanceof x1.m)) {
                                    y0.m mVar4 = mVar3.f8110v;
                                    int i12 = 0;
                                    mVar3 = mVar3;
                                    r82 = r82;
                                    while (mVar4 != null) {
                                        if ((mVar4.f8445i & 2048) != 0) {
                                            i12++;
                                            r82 = r82;
                                            if (i12 == 1) {
                                                mVar3 = mVar4;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar3 != 0) {
                                                    r82.b(mVar3);
                                                    mVar3 = 0;
                                                }
                                                r82.b(mVar4);
                                            }
                                        }
                                        mVar4 = mVar4.f8448l;
                                        mVar3 = mVar3;
                                        r82 = r82;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                mVar3 = x1.f.f(r82);
                            }
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        return lVar;
    }

    public final p t0() {
        c1 c1Var;
        boolean z10 = this.f8456t;
        p pVar = p.f1606j;
        if (!z10) {
            return pVar;
        }
        i iVar = (i) ((y1.r) x1.f.w(this)).getFocusOwner();
        r rVar = iVar.f1583h;
        if (rVar == null) {
            return pVar;
        }
        if (this == rVar) {
            iVar.getClass();
            return p.f1603g;
        }
        if (rVar.f8456t) {
            if (!rVar.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar = rVar.f8443g.f8447k;
            g0 v10 = x1.f.v(rVar);
            while (v10 != null) {
                if ((v10.I.f7991f.f8446j & 1024) != 0) {
                    while (mVar != null) {
                        if ((mVar.f8445i & 1024) != 0) {
                            y0.m mVar2 = mVar;
                            o0.e eVar = null;
                            while (mVar2 != null) {
                                if (mVar2 instanceof r) {
                                    if (this == ((r) mVar2)) {
                                        return p.f1604h;
                                    }
                                } else if ((mVar2.f8445i & 1024) != 0 && (mVar2 instanceof x1.m)) {
                                    int i10 = 0;
                                    for (y0.m mVar3 = ((x1.m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                        if ((mVar3.f8445i & 1024) != 0) {
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
                        mVar = mVar.f8447k;
                    }
                }
                v10 = v10.s();
                mVar = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
            }
        }
        return pVar;
    }

    public final void u0() {
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ac.d();
                }
                return;
            }
        }
        pc.s sVar = new pc.s();
        x1.f.s(this, new c1.b(1, sVar, this));
        Object obj = sVar.f5683g;
        if (obj == null) {
            pc.j.k("focusProperties");
            throw null;
        }
        if (((j) obj).a()) {
            return;
        }
        ((i) ((y1.r) x1.f.w(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean v0(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z10 = false;
            if (!s0().f1588a) {
                Trace.endSection();
                return false;
            }
            int ordinal = e.u(this).ordinal();
            if (ordinal == 0) {
                z10 = e.v(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z10 = true;
                } else if (ordinal != 3) {
                    throw new ac.d();
                }
            }
            return z10;
        } finally {
            Trace.endSection();
        }
    }
}
