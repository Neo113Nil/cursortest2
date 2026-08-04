package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.t0.t2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements com.gamericefishpro.space.t0.j, p1, g {
    public static final a0 l0 = new a0("Undefined intrinsics block and it is required");
    public static final z m0 = new z();
    public static final com.gamericefishpro.space.h0.a n0 = new com.gamericefishpro.space.h0.a(2);
    public boolean A;
    public f0 B;
    public int C;
    public final com.gamericefishpro.space.u6.e D;
    public com.gamericefishpro.space.v0.e E;
    public boolean F;
    public f0 G;
    public o1 H;
    public com.gamericefishpro.space.f3.z I;
    public int J;
    public boolean K;
    public boolean L;
    public com.gamericefishpro.space.o2.l M;
    public boolean N;
    public final com.gamericefishpro.space.v0.e O;
    public boolean P;
    public com.gamericefishpro.space.f2.l0 Q;
    public com.gamericefishpro.space.u6.c R;
    public com.gamericefishpro.space.c3.c S;
    public com.gamericefishpro.space.c3.l T;
    public com.gamericefishpro.space.i2.z1 U;
    public com.gamericefishpro.space.t0.z V;
    public d0 W;
    public d0 X;
    public boolean Y;
    public final a1 Z;
    public final j0 a0;
    public com.gamericefishpro.space.f2.h0 b0;
    public f1 c0;
    public final boolean d;
    public boolean d0;
    public int e;
    public com.gamericefishpro.space.h1.m e0;
    public com.gamericefishpro.space.h1.m f0;
    public com.gamericefishpro.space.f3.d g0;
    public com.gamericefishpro.space.b2.w h0;
    public boolean i;
    public boolean i0;
    public int j0;
    public boolean k0;
    public long v;
    public long w;
    public long y;
    public boolean z;

    public f0(int i) {
        this(com.gamericefishpro.space.o2.m.a.addAndGet(1), (i & 1) == 0);
    }

    public static void T(f0 f0Var, boolean z, int i) {
        f0 f0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (f0Var.B == null) {
            com.gamericefishpro.space.e2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        o1 o1Var = f0Var.H;
        if (o1Var == null || f0Var.K || f0Var.d) {
            return;
        }
        ((com.gamericefishpro.space.i2.t) o1Var).A(f0Var, true, z, z2);
        if (z3) {
            r0 r0Var = f0Var.a0.q;
            Intrinsics.b(r0Var);
            j0 j0Var = r0Var.y;
            f0 f0VarV2 = j0Var.a.v();
            d0 d0Var = j0Var.a.W;
            if (f0VarV2 == null || d0Var == d0.i) {
                return;
            }
            while (f0VarV2.W == d0Var && (f0VarV = f0VarV2.v()) != null) {
                f0VarV2 = f0VarV;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                if (f0VarV2.B != null) {
                    T(f0VarV2, z, 6);
                    return;
                } else {
                    V(f0VarV2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (f0VarV2.B != null) {
                f0VarV2.S(z);
            } else {
                f0VarV2.U(z);
            }
        }
    }

    public static void V(f0 f0Var, boolean z, int i) {
        o1 o1Var;
        f0 f0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (f0Var.K || f0Var.d || (o1Var = f0Var.H) == null) {
            return;
        }
        ((com.gamericefishpro.space.i2.t) o1Var).A(f0Var, false, z, z2);
        if (z3) {
            j0 j0Var = f0Var.a0.p.y;
            f0 f0VarV2 = j0Var.a.v();
            d0 d0Var = j0Var.a.W;
            if (f0VarV2 == null || d0Var == d0.i) {
                return;
            }
            while (f0VarV2.W == d0Var && (f0VarV = f0VarV2.v()) != null) {
                f0VarV2 = f0VarV;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                V(f0VarV2, z, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                f0VarV2.U(z);
            }
        }
    }

    public static void W(f0 f0Var) {
        j0 j0Var = f0Var.a0;
        if (e0.a[j0Var.d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + j0Var.d);
        }
        if (j0Var.e) {
            T(f0Var, true, 6);
            return;
        }
        if (j0Var.f) {
            f0Var.S(true);
        }
        if (f0Var.q()) {
            V(f0Var, true, 6);
        } else if (f0Var.p()) {
            f0Var.U(true);
        }
    }

    private final String j(f0 f0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(f0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        f0 f0Var2 = f0Var.G;
        sb.append(f0Var2 != null ? f0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A(long j, o oVar, int i, boolean z) {
        a1 a1Var = this.Z;
        f1 f1Var = a1Var.d;
        com.gamericefishpro.space.o1.h0 h0Var = f1.f0;
        a1Var.d.P0(f1.h0, f1Var.H0(j), oVar, i, z);
    }

    public final void B(int i, f0 f0Var) {
        if (f0Var.G != null && f0Var.H != null) {
            com.gamericefishpro.space.e2.a.b(j(f0Var));
        }
        f0Var.G = this;
        com.gamericefishpro.space.u6.e eVar = this.D;
        ((com.gamericefishpro.space.v0.e) eVar.b).a(i, f0Var);
        ((com.gamericefishpro.space.a2.b) eVar.c).invoke();
        O();
        if (f0Var.d) {
            this.C++;
        }
        G();
        o1 o1Var = this.H;
        if (o1Var != null) {
            f0Var.b(o1Var);
        }
        if (f0Var.a0.l > 0) {
            j0 j0Var = this.a0;
            j0Var.d(j0Var.l + 1);
        }
        if (f0Var.j0 > 0) {
            a0(this.j0 + 1);
        }
    }

    public final void C() {
        if (this.d0) {
            a1 a1Var = this.Z;
            f1 f1Var = a1Var.c;
            f1 f1Var2 = a1Var.d.J;
            this.c0 = null;
            while (!Intrinsics.a(f1Var, f1Var2)) {
                if ((f1Var != null ? f1Var.e0 : null) != null) {
                    this.c0 = f1Var;
                    break;
                }
                f1Var = f1Var != null ? f1Var.J : null;
            }
        }
        f1 f1Var3 = this.c0;
        if (f1Var3 != null && f1Var3.e0 == null) {
            throw com.gamericefishpro.space.m5.a.e("layer was not set");
        }
        if (f1Var3 != null) {
            f1Var3.R0();
            return;
        }
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.C();
        }
    }

    public final void D() {
        a1 a1Var = this.Z;
        f1 f1Var = a1Var.d;
        q qVar = a1Var.c;
        while (f1Var != qVar) {
            Intrinsics.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) f1Var;
            n1 n1Var = xVar.e0;
            if (n1Var != null) {
                n1Var.invalidate();
            }
            f1Var = xVar.I;
        }
        n1 n1Var2 = a1Var.c.e0;
        if (n1Var2 != null) {
            n1Var2.invalidate();
        }
    }

    public final void E() {
        if (this.d) {
            f0 f0VarV = v();
            if (f0VarV != null) {
                f0VarV.E();
                return;
            }
            return;
        }
        if (this.B != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.N) {
            return;
        }
        if (this.Z.b.y != null || this.f0 != null) {
            this.L = true;
            return;
        }
        com.gamericefishpro.space.o2.l lVar = this.M;
        this.N = true;
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        a0Var.d = new com.gamericefishpro.space.o2.l();
        q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) i0.a(this)).getSnapshotObserver();
        com.gamericefishpro.space.b2.b bVar = new com.gamericefishpro.space.b2.b(2, this, a0Var);
        snapshotObserver.a.c(this, snapshotObserver.d, bVar);
        this.N = false;
        this.M = (com.gamericefishpro.space.o2.l) a0Var.d;
        this.L = false;
        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) i0.a(this);
        tVar.getSemanticsOwner().b(this, lVar);
        tVar.C();
    }

    public final void G() {
        f0 f0Var;
        if (this.C > 0) {
            this.F = true;
        }
        if (!this.d || (f0Var = this.G) == null) {
            return;
        }
        f0Var.G();
    }

    public final boolean H() {
        return this.H != null;
    }

    public final boolean I() {
        return this.a0.p.K;
    }

    public final Boolean J() {
        r0 r0Var = this.a0.q;
        if (r0Var != null) {
            return Boolean.valueOf(r0Var.I != p0.i);
        }
        return null;
    }

    public final void K() {
        f0 f0VarV;
        if (this.W == d0.i) {
            f();
        }
        r0 r0Var = this.a0.q;
        Intrinsics.b(r0Var);
        boolean z = true;
        try {
            r0Var.z = true;
            if (!r0Var.D) {
                com.gamericefishpro.space.e2.a.b("replace() called on item that was not placed");
            }
            r0Var.T = false;
            if (r0Var.I == p0.i) {
                z = false;
            }
            r0Var.p0(r0Var.G, r0Var.H);
            if (z && !r0Var.T && (f0VarV = r0Var.y.a.v()) != null) {
                f0VarV.S(false);
            }
        } finally {
            r0Var.z = false;
        }
    }

    public final void L(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            com.gamericefishpro.space.u6.e eVar = this.D;
            com.gamericefishpro.space.v0.e eVar2 = (com.gamericefishpro.space.v0.e) eVar.b;
            com.gamericefishpro.space.a2.b bVar = (com.gamericefishpro.space.a2.b) eVar.c;
            Object objL = eVar2.l(i5);
            bVar.invoke();
            ((com.gamericefishpro.space.v0.e) eVar.b).a(i6, (f0) objL);
            bVar.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(f0 f0Var) {
        if (f0Var.a0.l > 0) {
            j0 j0Var = this.a0;
            j0Var.d(j0Var.l - 1);
        }
        if (this.H != null) {
            f0Var.h();
        }
        f0Var.G = null;
        if (f0Var.j0 > 0) {
            a0(this.j0 - 1);
        }
        f0Var.Z.d.J = null;
        if (f0Var.d) {
            this.C--;
            com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) f0Var.D.b;
            Object[] objArr = eVar.d;
            int i = eVar.i;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).Z.d.J = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        com.gamericefishpro.space.p2.b rectManager;
        this.z = true;
        o1 o1Var = this.H;
        if (o1Var == null || (rectManager = ((com.gamericefishpro.space.i2.t) o1Var).getRectManager()) == null) {
            return;
        }
        rectManager.d(this);
    }

    public final void O() {
        if (!this.d) {
            this.P = true;
            return;
        }
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.O();
        }
    }

    public final void P() {
        com.gamericefishpro.space.u6.e eVar = this.D;
        com.gamericefishpro.space.v0.e eVar2 = (com.gamericefishpro.space.v0.e) eVar.b;
        com.gamericefishpro.space.v0.e eVar3 = (com.gamericefishpro.space.v0.e) eVar.b;
        int i = eVar2.i;
        while (true) {
            i--;
            if (-1 >= i) {
                eVar3.g();
                ((com.gamericefishpro.space.a2.b) eVar.c).invoke();
                return;
            }
            M((f0) eVar3.d[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            com.gamericefishpro.space.e2.a.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            com.gamericefishpro.space.u6.e eVar = this.D;
            M((f0) ((com.gamericefishpro.space.v0.e) eVar.b).d[i3]);
            Object objL = ((com.gamericefishpro.space.v0.e) eVar.b).l(i3);
            ((com.gamericefishpro.space.a2.b) eVar.c).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        f0 f0VarV;
        if (this.W == d0.i) {
            f();
        }
        v0 v0Var = this.a0.p;
        j0 j0Var = v0Var.y;
        try {
            v0Var.z = true;
            if (!v0Var.D) {
                com.gamericefishpro.space.e2.a.b("replace called on unplaced item");
            }
            boolean z = v0Var.K;
            v0Var.p0(v0Var.F, v0Var.H, v0Var.G);
            if (z && !v0Var.X && (f0VarV = j0Var.a.v()) != null) {
                f0VarV.U(false);
            }
            v0Var.z = false;
        } catch (Throwable th) {
            try {
                j0Var.a.Y(th);
                throw null;
            } catch (Throwable th2) {
                v0Var.z = false;
                throw th2;
            }
        }
    }

    public final void S(boolean z) {
        o1 o1Var;
        if (this.d || (o1Var = this.H) == null) {
            return;
        }
        ((com.gamericefishpro.space.i2.t) o1Var).B(this, true, z);
    }

    public final void U(boolean z) {
        o1 o1Var;
        if (this.d || (o1Var = this.H) == null) {
            return;
        }
        ((com.gamericefishpro.space.i2.t) o1Var).B(this, false, z);
    }

    public final void X() {
        com.gamericefishpro.space.v0.e eVarZ = z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            d0 d0Var = f0Var.X;
            f0Var.W = d0Var;
            if (d0Var != d0.i) {
                f0Var.X();
            }
        }
    }

    public final void Y(Throwable th) {
        com.gamericefishpro.space.t0.z zVar = this.V;
        t2 t2Var = com.gamericefishpro.space.g1.g.a;
        com.gamericefishpro.space.b1.l lVar = (com.gamericefishpro.space.b1.l) zVar;
        lVar.getClass();
        com.gamericefishpro.space.g1.e eVar = (com.gamericefishpro.space.g1.e) com.gamericefishpro.space.t0.i.w(lVar, t2Var);
        if (eVar == null) {
            throw th;
        }
        com.gamericefishpro.space.wa.b.R(th, new com.gamericefishpro.space.e.e(3, (com.gamericefishpro.space.g1.f) eVar, this));
        throw th;
    }

    public final void Z(com.gamericefishpro.space.c3.c cVar) {
        if (Intrinsics.a(this.S, cVar)) {
            return;
        }
        this.S = cVar;
        E();
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.C();
        }
        D();
        for (com.gamericefishpro.space.h1.l lVar = this.Z.f; lVar != null; lVar = lVar.y) {
            lVar.a();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a(com.gamericefishpro.space.h1.m r20) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.h2.f0.a(com.gamericefishpro.space.h1.m):void");
    }

    public final void a0(int i) {
        f0 f0VarV;
        f0 f0VarV2;
        int i2 = this.j0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (f0VarV2 = v()) != null) {
                f0VarV2.a0(f0VarV2.j0 + 1);
            }
            if (i == 0 && this.j0 > 0 && (f0VarV = v()) != null) {
                f0VarV.a0(f0VarV.j0 - 1);
            }
            this.j0 = i;
        }
    }

    public final void b(o1 o1Var) {
        f0 f0Var;
        com.gamericefishpro.space.o2.l lVarX;
        if (this.H != null) {
            com.gamericefishpro.space.e2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        f0 f0Var2 = this.G;
        if (f0Var2 != null && !Intrinsics.a(f0Var2.H, o1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(o1Var);
            sb.append(") than the parent's owner(");
            f0 f0VarV = v();
            sb.append(f0VarV != null ? f0VarV.H : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            f0 f0Var3 = this.G;
            sb.append(f0Var3 != null ? f0Var3.g(0) : null);
            com.gamericefishpro.space.e2.a.b(sb.toString());
        }
        f0 f0VarV2 = v();
        j0 j0Var = this.a0;
        if (f0VarV2 == null) {
            j0Var.p.K = true;
            ((com.gamericefishpro.space.i2.t) o1Var).getRectManager().e(this, false);
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                r0Var.I = p0.d;
            }
        }
        a1 a1Var = this.Z;
        a1Var.d.J = f0VarV2 != null ? f0VarV2.Z.c : null;
        this.H = o1Var;
        this.J = (f0VarV2 != null ? f0VarV2.J : -1) + 1;
        com.gamericefishpro.space.h1.m mVar = this.f0;
        if (mVar != null) {
            a(mVar);
        }
        this.f0 = null;
        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) o1Var;
        tVar.getLayoutNodes().h(this.e, this);
        f0 f0Var4 = this.G;
        if (f0Var4 == null || (f0Var = f0Var4.B) == null) {
            f0Var = this.B;
        }
        b0(f0Var);
        if (this.B == null && a1Var.d(512)) {
            b0(this);
        }
        if (!this.k0) {
            for (com.gamericefishpro.space.h1.l lVar = a1Var.f; lVar != null; lVar = lVar.y) {
                lVar.q0();
            }
        }
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.D.b;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).b(o1Var);
        }
        if (!this.k0) {
            a1Var.e();
        }
        E();
        if (f0VarV2 != null) {
            f0VarV2.E();
        }
        com.gamericefishpro.space.f3.d dVar = this.g0;
        if (dVar != null) {
            dVar.invoke(o1Var);
        }
        j0Var.j();
        if (!this.k0 && a1Var.d(8)) {
            F();
        }
        com.gamericefishpro.space.i1.b bVar = tVar.h0;
        if (bVar == null || (lVarX = x()) == null || !lVarX.d.b(com.gamericefishpro.space.o2.s.q)) {
            return;
        }
        bVar.z.a(this.e);
        bVar.d.n(bVar.i, this.e, true);
    }

    public final void b0(f0 f0Var) {
        if (Intrinsics.a(f0Var, this.B)) {
            return;
        }
        this.B = f0Var;
        j0 j0Var = this.a0;
        if (f0Var != null) {
            if (j0Var.q == null) {
                j0Var.q = new r0(j0Var);
            }
            a1 a1Var = this.Z;
            f1 f1Var = a1Var.c.I;
            for (f1 f1Var2 = a1Var.d; !Intrinsics.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.I) {
                f1Var2.F0();
            }
        } else {
            j0Var.q = null;
            j0Var.f = false;
            j0Var.e = false;
        }
        E();
    }

    public final void c() {
        this.X = this.W;
        this.W = d0.i;
        com.gamericefishpro.space.v0.e eVarZ = z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.W != d0.i) {
                f0Var.c();
            }
        }
    }

    public final void c0(com.gamericefishpro.space.f2.l0 l0Var) {
        if (Intrinsics.a(this.Q, l0Var)) {
            return;
        }
        this.Q = l0Var;
        com.gamericefishpro.space.u6.c cVar = this.R;
        if (cVar != null) {
            ((com.gamericefishpro.space.t0.f1) cVar.e).setValue(l0Var);
        }
        E();
    }

    @Override // com.gamericefishpro.space.t0.j
    public final void d() {
        com.gamericefishpro.space.f3.z zVar = this.I;
        if (zVar != null) {
            zVar.d();
        }
        com.gamericefishpro.space.f2.h0 h0Var = this.b0;
        if (h0Var != null) {
            h0Var.d();
        }
        a1 a1Var = this.Z;
        f1 f1Var = a1Var.c.I;
        for (f1 f1Var2 = a1Var.d; !Intrinsics.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.I) {
            f1Var2.W0();
        }
    }

    public final void d0(com.gamericefishpro.space.h1.m mVar) {
        if (this.d && this.e0 != com.gamericefishpro.space.h1.j.a) {
            com.gamericefishpro.space.e2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.k0) {
            com.gamericefishpro.space.e2.a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.f0 = mVar;
            return;
        }
        a(mVar);
        if (this.L) {
            F();
        }
    }

    @Override // com.gamericefishpro.space.t0.j
    public final void e() {
        com.gamericefishpro.space.i1.b bVar;
        com.gamericefishpro.space.f3.z zVar = this.I;
        if (zVar != null) {
            zVar.e();
        }
        com.gamericefishpro.space.f2.h0 h0Var = this.b0;
        if (h0Var != null) {
            h0Var.i(true);
        }
        this.k0 = true;
        com.gamericefishpro.space.h1.l lVar = this.Z.e;
        for (com.gamericefishpro.space.h1.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.w) {
            if (lVar2.G) {
                lVar2.v0();
            }
        }
        for (com.gamericefishpro.space.h1.l lVar3 = lVar; lVar3 != null; lVar3 = lVar3.w) {
            if (lVar3.G) {
                lVar3.x0();
            }
        }
        while (lVar != null) {
            if (lVar.G) {
                lVar.r0();
            }
            lVar = lVar.w;
        }
        if (H()) {
            this.M = null;
            this.L = false;
        }
        o1 o1Var = this.H;
        if (o1Var == null || (bVar = ((com.gamericefishpro.space.i2.t) o1Var).h0) == null || !bVar.z.e(this.e)) {
            return;
        }
        bVar.d.n(bVar.i, this.e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void e0(com.gamericefishpro.space.i2.z1 z1Var) {
        if (Intrinsics.a(this.U, z1Var)) {
            return;
        }
        this.U = z1Var;
        com.gamericefishpro.space.h1.l lVar = this.Z.f;
        if ((lVar.v & 16) != 0) {
            while (lVar != null) {
                if ((lVar.i & 16) != 0) {
                    ?? E = lVar;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof t1) {
                            ((t1) E).U();
                        } else if ((E.i & 16) != 0 && (E instanceof j)) {
                            com.gamericefishpro.space.h1.l lVar2 = ((j) E).I;
                            int i = 0;
                            E = E;
                            eVar = eVar;
                            while (lVar2 != null) {
                                if ((lVar2.i & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        eVar = eVar;
                                        E = lVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        }
                                        if (E != 0) {
                                            eVar.b(E);
                                            E = 0;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.y;
                                E = E;
                                eVar = eVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E = k.e(eVar);
                    }
                }
                if ((lVar.v & 16) == 0) {
                    return;
                } else {
                    lVar = lVar.y;
                }
            }
        }
    }

    public final void f() {
        this.X = this.W;
        this.W = d0.i;
        com.gamericefishpro.space.v0.e eVarZ = z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.W == d0.e) {
                f0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.C <= 0 || !this.F) {
            return;
        }
        this.F = false;
        com.gamericefishpro.space.v0.e eVar = this.E;
        if (eVar == null) {
            eVar = new com.gamericefishpro.space.v0.e(new f0[16]);
            this.E = eVar;
        }
        eVar.g();
        com.gamericefishpro.space.v0.e eVar2 = (com.gamericefishpro.space.v0.e) this.D.b;
        Object[] objArr = eVar2.d;
        int i = eVar2.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.d) {
                eVar.c(eVar.i, f0Var.z());
            } else {
                eVar.b(f0Var);
            }
        }
        j0 j0Var = this.a0;
        j0Var.p.R = true;
        r0 r0Var = j0Var.q;
        if (r0Var != null) {
            r0Var.L = true;
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        com.gamericefishpro.space.v0.e eVarZ = z();
        Object[] objArr = eVarZ.d;
        int i3 = eVarZ.i;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((f0) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void h() {
        g0 g0Var;
        o1 o1Var = this.H;
        if (o1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            f0 f0VarV = v();
            sb.append(f0VarV != null ? f0VarV.g(0) : null);
            com.gamericefishpro.space.e2.a.c(sb.toString());
            throw new com.gamericefishpro.space.oh.e();
        }
        f0 f0VarV2 = v();
        j0 j0Var = this.a0;
        if (f0VarV2 != null) {
            f0VarV2.C();
            f0VarV2.E();
            v0 v0Var = j0Var.p;
            d0 d0Var = d0.i;
            v0Var.E = d0Var;
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                r0Var.C = d0Var;
            }
        }
        g0 g0Var2 = j0Var.p.P;
        g0Var2.b = true;
        g0Var2.c = false;
        g0Var2.d = false;
        g0Var2.e = false;
        g0Var2.f = null;
        r0 r0Var2 = j0Var.q;
        if (r0Var2 != null && (g0Var = r0Var2.J) != null) {
            g0Var.b = true;
            g0Var.c = false;
            g0Var.d = false;
            g0Var.e = false;
            g0Var.f = null;
        }
        a1 a1Var = this.Z;
        com.gamericefishpro.space.h1.l lVar = a1Var.e;
        f1 f1Var = a1Var.c.I;
        for (f1 f1Var2 = a1Var.d; !Intrinsics.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.I) {
            f1Var2.c1();
            if (f1Var2.H.I()) {
                f1Var2.X0();
            }
        }
        com.gamericefishpro.space.b2.w wVar = this.h0;
        if (wVar != null) {
            wVar.invoke(o1Var);
        }
        for (com.gamericefishpro.space.h1.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.w) {
            if (lVar2.G) {
                lVar2.x0();
            }
        }
        this.K = true;
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.D.b;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).h();
        }
        Unit unit = Unit.a;
        this.K = false;
        while (lVar != null) {
            if (lVar.G) {
                lVar.r0();
            }
            lVar = lVar.w;
        }
        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) o1Var;
        tVar.getLayoutNodes().g(this.e);
        t0 t0Var = tVar.q0;
        com.gamericefishpro.space.a8.c cVar = t0Var.b;
        ((com.gamericefishpro.space.vb.c) cVar.e).q(this);
        ((com.gamericefishpro.space.vb.c) cVar.i).q(this);
        ((com.gamericefishpro.space.vb.c) cVar.v).q(this);
        ((com.gamericefishpro.space.v0.e) t0Var.e.d).k(this);
        tVar.i0 = true;
        com.gamericefishpro.space.i1.b bVar = tVar.h0;
        if (bVar != null && bVar.z.e(this.e)) {
            bVar.d.n(bVar.i, this.e, false);
        }
        tVar.getRectManager().g(this);
        this.H = null;
        b0(null);
        this.J = 0;
        v0 v0Var2 = j0Var.p;
        v0Var2.B = Integer.MAX_VALUE;
        v0Var2.A = Integer.MAX_VALUE;
        v0Var2.K = false;
        r0 r0Var3 = j0Var.q;
        if (r0Var3 != null) {
            r0Var3.B = Integer.MAX_VALUE;
            r0Var3.A = Integer.MAX_VALUE;
            r0Var3.I = p0.i;
        }
        if (a1Var.d(8)) {
            com.gamericefishpro.space.o2.l lVar3 = this.M;
            this.M = null;
            this.L = false;
            tVar.getSemanticsOwner().b(this, lVar3);
            tVar.C();
        }
    }

    public final void i(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar) {
        try {
            this.Z.d.D0(qVar, bVar);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.B != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        v0 v0Var = this.a0.p;
        com.gamericefishpro.space.c3.a aVar = v0Var.C ? new com.gamericefishpro.space.c3.a(v0Var.v) : null;
        if (aVar != null) {
            o1 o1Var = this.H;
            if (o1Var != null) {
                ((com.gamericefishpro.space.i2.t) o1Var).v(this, aVar.a);
                return;
            }
            return;
        }
        o1 o1Var2 = this.H;
        if (o1Var2 != null) {
            ((com.gamericefishpro.space.i2.t) o1Var2).u(true);
        }
    }

    public final List l() {
        r0 r0Var = this.a0.q;
        Intrinsics.b(r0Var);
        com.gamericefishpro.space.v0.e eVar = r0Var.K;
        j0 j0Var = r0Var.y;
        j0Var.a.n();
        if (!r0Var.L) {
            return eVar.f();
        }
        f0 f0Var = j0Var.a;
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (eVar.i <= i2) {
                r0 r0Var2 = f0Var2.a0.q;
                Intrinsics.b(r0Var2);
                eVar.b(r0Var2);
            } else {
                r0 r0Var3 = f0Var2.a0.q;
                Intrinsics.b(r0Var3);
                Object[] objArr2 = eVar.d;
                Object obj = objArr2[i2];
                objArr2[i2] = r0Var3;
            }
        }
        eVar.m(((com.gamericefishpro.space.v0.b) f0Var.n()).d.i, eVar.i);
        r0Var.L = false;
        return eVar.f();
    }

    public final List m() {
        return this.a0.p.e0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((com.gamericefishpro.space.v0.e) this.D.b).f();
    }

    public final boolean p() {
        return this.a0.p.N;
    }

    public final boolean q() {
        return this.a0.p.M;
    }

    public final d0 r() {
        return this.a0.p.E;
    }

    public final d0 s() {
        d0 d0Var;
        r0 r0Var = this.a0.q;
        return (r0Var == null || (d0Var = r0Var.C) == null) ? d0.i : d0Var;
    }

    @Override // com.gamericefishpro.space.h2.p1
    public final boolean t() {
        return H();
    }

    public final String toString() {
        return com.gamericefishpro.space.i2.f0.q(this) + " children: " + ((com.gamericefishpro.space.v0.b) n()).d.i + " measurePolicy: " + this.Q + " deactivated: " + this.k0;
    }

    public final com.gamericefishpro.space.u6.c u() {
        com.gamericefishpro.space.u6.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        com.gamericefishpro.space.f2.l0 l0Var = this.Q;
        com.gamericefishpro.space.u6.c cVar2 = new com.gamericefishpro.space.u6.c();
        cVar2.d = this;
        cVar2.e = com.gamericefishpro.space.t0.i.v(l0Var);
        this.R = cVar2;
        return cVar2;
    }

    public final f0 v() {
        f0 f0Var = this.G;
        while (f0Var != null && f0Var.d) {
            f0Var = f0Var.G;
        }
        return f0Var;
    }

    public final int w() {
        return this.a0.p.B;
    }

    public final com.gamericefishpro.space.o2.l x() {
        if (H() && !this.k0 && this.Z.d(8)) {
            return this.M;
        }
        return null;
    }

    public final com.gamericefishpro.space.v0.e y() {
        boolean z = this.P;
        com.gamericefishpro.space.v0.e eVar = this.O;
        if (z) {
            eVar.g();
            eVar.c(eVar.i, z());
            com.gamericefishpro.space.ph.u.m(eVar.d, n0, 0, eVar.i);
            this.P = false;
        }
        return eVar;
    }

    public final com.gamericefishpro.space.v0.e z() {
        f0();
        if (this.C == 0) {
            return (com.gamericefishpro.space.v0.e) this.D.b;
        }
        com.gamericefishpro.space.v0.e eVar = this.E;
        Intrinsics.b(eVar);
        return eVar;
    }

    public f0(int i, boolean z) {
        this.d = z;
        this.e = i;
        this.v = 9223372034707292159L;
        this.w = 0L;
        this.y = 9223372034707292159L;
        this.z = true;
        this.D = new com.gamericefishpro.space.u6.e(4, new com.gamericefishpro.space.v0.e(new f0[16]), new com.gamericefishpro.space.a2.b(5, this));
        this.O = new com.gamericefishpro.space.v0.e(new f0[16]);
        this.P = true;
        this.Q = l0;
        this.S = i0.a;
        this.T = com.gamericefishpro.space.c3.l.d;
        this.U = m0;
        com.gamericefishpro.space.t0.z.u.getClass();
        this.V = com.gamericefishpro.space.t0.y.b;
        d0 d0Var = d0.i;
        this.W = d0Var;
        this.X = d0Var;
        this.Z = new a1(this);
        this.a0 = new j0(this);
        this.d0 = true;
        this.e0 = com.gamericefishpro.space.h1.j.a;
    }
}
