package com.gamericefishpro.space.t0;

import android.os.Trace;
import com.gamericefishpro.space.i9.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public int A;
    public int B;
    public boolean C;
    public final com.gamericefishpro.space.f1.w D;
    public final ArrayList E;
    public boolean F;
    public d2 G;
    public e2 H;
    public h2 I;
    public boolean J;
    public l1 K;
    public com.gamericefishpro.space.u0.a L;
    public final com.gamericefishpro.space.u0.b M;
    public a N;
    public com.gamericefishpro.space.u0.c O;
    public c2 P;
    public final com.gamericefishpro.space.g1.f Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public w U;
    public final com.gamericefishpro.space.h2.d2 a;
    public final u b;
    public final e2 c;
    public final com.gamericefishpro.space.t.k0 d;
    public final com.gamericefishpro.space.u0.a e;
    public final com.gamericefishpro.space.u0.a f;
    public final com.gamericefishpro.space.m.d g;
    public final x h;
    public k1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public com.gamericefishpro.space.t.u p;
    public boolean q;
    public boolean r;
    public com.gamericefishpro.space.t.w v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final com.gamericefishpro.space.h2.r n = new com.gamericefishpro.space.h2.r();
    public final ArrayList s = new ArrayList();
    public final com.gamericefishpro.space.h2.r t = new com.gamericefishpro.space.h2.r();
    public l1 u = com.gamericefishpro.space.b1.l.z;
    public final com.gamericefishpro.space.h2.r x = new com.gamericefishpro.space.h2.r();
    public int z = -1;

    public r(com.gamericefishpro.space.h2.d2 d2Var, u uVar, e2 e2Var, com.gamericefishpro.space.t.k0 k0Var, com.gamericefishpro.space.u0.a aVar, com.gamericefishpro.space.u0.a aVar2, com.gamericefishpro.space.m.d dVar, x xVar) {
        this.a = d2Var;
        this.b = uVar;
        this.c = e2Var;
        this.d = k0Var;
        this.e = aVar;
        this.f = aVar2;
        this.g = dVar;
        this.h = xVar;
        this.C = uVar.f() || uVar.d();
        this.D = new com.gamericefishpro.space.f1.w(1, this);
        this.E = new ArrayList();
        d2 d2VarD = e2Var.d();
        d2VarD.c();
        this.G = d2VarD;
        e2 e2Var2 = new e2();
        if (uVar.f()) {
            e2Var2.c();
        }
        if (uVar.d()) {
            e2Var2.D = new com.gamericefishpro.space.t.w();
        }
        this.H = e2Var2;
        h2 h2VarF = e2Var2.f();
        h2VarF.e(true);
        this.I = h2VarF;
        this.M = new com.gamericefishpro.space.u0.b(this, aVar);
        d2 d2VarD2 = this.H.d();
        try {
            a aVarA = d2VarD2.a(0);
            d2VarD2.c();
            this.N = aVarA;
            this.O = new com.gamericefishpro.space.u0.c();
            this.Q = new com.gamericefishpro.space.g1.f(this);
            CoroutineContext coroutineContextJ = uVar.j();
            CoroutineContext coroutineContextC = C();
            this.R = coroutineContextJ.o(coroutineContextC == null ? kotlin.coroutines.g.d : coroutineContextC);
        } catch (Throwable th) {
            d2VarD2.c();
            throw th;
        }
    }

    public static final int R(r rVar, int i, boolean z, int i2) {
        d2 d2Var = rVar.G;
        if (d2Var.j(i)) {
            int i3 = d2Var.i(i);
            Object objP = d2Var.p(d2Var.b, i);
            if (i3 == 206 && Intrinsics.a(objP, s.e)) {
                Object objH = d2Var.h(i, 0);
                y1 y1Var = objH instanceof y1 ? (y1) objH : null;
                x1 x1Var = y1Var != null ? y1Var.a : null;
                p pVar = x1Var instanceof p ? (p) x1Var : null;
                if (pVar != null) {
                    for (r rVar2 : pVar.d.e) {
                        e2 e2Var = rVar2.c;
                        if (e2Var.e > 0 && (e2Var.d[1] & 67108864) != 0) {
                            x xVar = rVar2.h;
                            synchronized (xVar.v) {
                                xVar.p();
                                com.gamericefishpro.space.t.h0 h0Var = xVar.G;
                                xVar.G = y3.t();
                                try {
                                    xVar.O.g0(h0Var);
                                    Unit unit = Unit.a;
                                } catch (Throwable th) {
                                    xVar.G = h0Var;
                                    throw th;
                                }
                            }
                            com.gamericefishpro.space.u0.a aVar = new com.gamericefishpro.space.u0.a();
                            rVar2.L = aVar;
                            d2 d2VarD = rVar2.c.d();
                            try {
                                rVar2.G = d2VarD;
                                com.gamericefishpro.space.u0.b bVar = rVar2.M;
                                com.gamericefishpro.space.u0.a aVar2 = bVar.b;
                                try {
                                    bVar.b = aVar;
                                    rVar2.Q(0);
                                    com.gamericefishpro.space.u0.b bVar2 = rVar2.M;
                                    bVar2.b();
                                    if (bVar2.c) {
                                        bVar2.b.c.w0(com.gamericefishpro.space.u0.c0.c);
                                        if (bVar2.c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.b.c.w0(com.gamericefishpro.space.u0.m.c);
                                            bVar2.c = false;
                                        }
                                    }
                                    bVar.b = aVar2;
                                    d2VarD.c();
                                } catch (Throwable th2) {
                                    bVar.b = aVar2;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                d2VarD.c();
                                throw th3;
                            }
                        }
                        rVar.b.r(rVar2.h);
                    }
                }
                return d2Var.o(i);
            }
            if (!d2Var.l(i)) {
                return d2Var.o(i);
            }
        } else if (d2Var.d(i)) {
            int i4 = d2Var.b[(i * 5) + 3] + i;
            int iR = 0;
            for (int i5 = i + 1; i5 < i4; i5 += d2Var.b[(i5 * 5) + 3]) {
                boolean zL = d2Var.l(i5);
                if (zL) {
                    rVar.M.c();
                    com.gamericefishpro.space.u0.b bVar3 = rVar.M;
                    Object objN = d2Var.n(i5);
                    bVar3.c();
                    bVar3.h.add(objN);
                }
                iR += R(rVar, i5, zL || z, zL ? 0 : i2 + iR);
                if (zL) {
                    rVar.M.c();
                    rVar.M.a();
                }
            }
            if (!d2Var.l(i)) {
                return iR;
            }
        } else if (!d2Var.l(i)) {
            return d2Var.o(i);
        }
        return 1;
    }

    public final p1 A() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (p1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean B() {
        if (!E() || this.w) {
            return true;
        }
        p1 p1VarA = A();
        return (p1VarA == null || (p1VarA.b & 4) == 0) ? false : true;
    }

    public final com.gamericefishpro.space.g1.f C() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        return this.S;
    }

    public final boolean E() {
        p1 p1VarA;
        return (this.S || this.y || this.w || (p1VarA = A()) == null || (p1VarA.b & 8) != 0) ? false : true;
    }

    public final void F(ArrayList arrayList) {
        com.gamericefishpro.space.u0.a aVar = this.f;
        com.gamericefishpro.space.u0.b bVar = this.M;
        com.gamericefishpro.space.u0.a aVar2 = bVar.b;
        try {
            bVar.b = aVar;
            aVar.c.w0(com.gamericefishpro.space.u0.a0.c);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.b.c.w0(com.gamericefishpro.space.u0.n.c);
                bVar.f = 0;
                bVar.b = aVar2;
                return;
            }
            Pair pair = (Pair) arrayList.get(0);
            u0 u0Var = (u0) pair.d;
            u0Var.getClass();
            throw null;
        } catch (Throwable th) {
            bVar.b = aVar2;
            throw th;
        }
    }

    public final void G(l1 l1Var, Object obj) {
        W(126665345, 0, null, null);
        H();
        l0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                h2.z(this.I);
            }
            boolean z = (this.S || Intrinsics.a(this.G.f(), l1Var)) ? false : true;
            if (z) {
                N(l1Var);
            }
            W(202, 0, s.c, l1Var);
            this.K = null;
            this.w = z;
            throw null;
        } catch (Throwable th) {
            try {
                com.gamericefishpro.space.wa.b.R(th, new o(this, 2));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object H() {
        boolean z = this.S;
        f fVar = n.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof b2)) {
                return objM;
            }
        } else if (this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final List I() {
        u uVar = this.b;
        t tVarH = uVar.h();
        x xVar = tVarH != null ? (x) tVarH : null;
        if (xVar == null) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        e2 e2Var = xVar.y;
        d2 d2VarD = e2Var.d();
        try {
            Integer numU = com.gamericefishpro.space.u6.f.u(d2VarD, uVar, 0, d2VarD.c);
            d2VarD.c();
            if (numU == null) {
                return com.gamericefishpro.space.ph.g0.d;
            }
            d2 d2VarD2 = e2Var.d();
            try {
                return CollectionsKt.F(com.gamericefishpro.space.u6.f.N(d2VarD2, numU.intValue(), 0), xVar.O.I());
            } finally {
                d2VarD2.c();
            }
        } catch (Throwable th) {
            d2VarD.c();
            throw th;
        }
    }

    public final int J(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += g2.a(this.G.b, iQ);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object K(x xVar, x xVar2, Integer num, List list, Function0 function0) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                p1 p1Var = (p1) pair.d;
                Object obj = pair.e;
                if (obj != null) {
                    f0(p1Var, obj);
                } else {
                    f0(p1Var, null);
                }
            }
            if (xVar == null) {
                objInvoke = function0.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (xVar2 == null || xVar2.equals(xVar) || iIntValue < 0) {
                    objInvoke = function0.invoke();
                } else {
                    xVar.K = xVar2;
                    xVar.L = iIntValue;
                    try {
                        objInvoke = function0.invoke();
                        xVar.K = null;
                        xVar.L = 0;
                    } catch (Throwable th) {
                        xVar.K = null;
                        xVar.L = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = function0.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[LOOP:7: B:34:0x00b1->B:50:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:66:0x0144
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.t0.r.L():void");
    }

    public final void M() {
        int i;
        Q(this.G.g);
        com.gamericefishpro.space.u0.b bVar = this.M;
        bVar.d(false);
        com.gamericefishpro.space.h2.r rVar = bVar.d;
        r rVar2 = bVar.a;
        d2 d2Var = rVar2.G;
        if (d2Var.c > 0 && rVar.a(-2) != (i = d2Var.i)) {
            if (!bVar.c && bVar.e) {
                bVar.d(false);
                bVar.b.c.w0(com.gamericefishpro.space.u0.q.c);
                bVar.c = true;
            }
            if (i > 0) {
                a aVarA = d2Var.a(i);
                rVar.c(i);
                bVar.d(false);
                com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
                l0Var.w0(com.gamericefishpro.space.u0.p.c);
                com.gamericefishpro.space.i.a.M(l0Var, 0, aVarA);
                bVar.c = true;
            }
        }
        bVar.b.c.w0(com.gamericefishpro.space.u0.y.c);
        int i2 = bVar.f;
        d2 d2Var2 = rVar2.G;
        bVar.f = d2Var2.b[(d2Var2.g * 5) + 3] + i2;
    }

    public final void N(l1 l1Var) {
        com.gamericefishpro.space.t.w wVar = this.v;
        if (wVar == null) {
            wVar = new com.gamericefishpro.space.t.w();
            this.v = wVar;
        }
        wVar.h(this.G.g, l1Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void O(int i, int i2, int i3) {
        d2 d2Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (d2Var.q(i) == i2) {
                i3 = i2;
            } else if (d2Var.q(i2) == i) {
                i3 = i;
            } else if (d2Var.q(i) == d2Var.q(i2)) {
                i3 = d2Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = d2Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = d2Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = d2Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = d2Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = d2Var.q(iQ5)) {
                    i3 = d2Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (d2Var.l(i)) {
                this.M.a();
            }
            i = d2Var.q(i);
        }
        o(i2, i3);
    }

    public final Object P() {
        boolean z = this.S;
        f fVar = n.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof b2)) {
                return objM instanceof y1 ? ((y1) objM).a : objM;
            }
        } else if (this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final void Q(int i) {
        boolean zL = this.G.l(i);
        com.gamericefishpro.space.u0.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i);
            bVar.c();
            bVar.h.add(objN);
        }
        R(this, i, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean S(int i, boolean z) {
        p1 p1VarA;
        if ((i & 1) == 0 && (this.S || this.y)) {
            c2 c2Var = this.P;
            if (c2Var != null && (p1VarA = A()) != null && c2Var.c()) {
                int i2 = p1VarA.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                p1VarA.b = i3;
                p1VarA.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                com.gamericefishpro.space.u0.l0 l0Var = this.M.b.c;
                l0Var.w0(com.gamericefishpro.space.u0.x.c);
                com.gamericefishpro.space.i.a.M(l0Var, 0, p1VarA);
                this.b.q(p1VarA);
                return false;
            }
        } else if (!z && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    public final void T() {
        int i;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        d2 d2Var = this.G;
        int iG = d2Var.g();
        int[] iArr = d2Var.b;
        int i2 = d2Var.g;
        Object objP = i2 < d2Var.h ? d2Var.p(iArr, i2) : null;
        Object objF = d2Var.f();
        int i3 = this.m;
        f fVar = n.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(fVar)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i3);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i3);
            }
            Z(null, (iArr[(d2Var.g * 5) + 1] & 1073741824) != 0);
            L();
            d2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(fVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i3), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i = 0;
        } else {
            i = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i);
        this.T = jRotateLeft2;
        Z(null, (iArr[(d2Var.g * 5) + 1] & 1073741824) != 0);
        L();
        d2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void U() {
        d2 d2Var = this.G;
        int i = d2Var.i;
        this.l = i >= 0 ? d2Var.b[(i * 5) + 1] & 67108863 : 0;
        d2Var.t();
    }

    public final void V() {
        if (this.l != 0) {
            s.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        p1 p1VarA = A();
        if (p1VarA != null) {
            int i = p1VarA.b;
            if ((i & 128) == 0) {
                p1VarA.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            U();
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    public final void W(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        k1 k1Var;
        k1 k1Var2;
        ArrayList arrayList;
        com.gamericefishpro.space.t.w wVar;
        int i3;
        Object objValueOf;
        com.gamericefishpro.space.t.h0 h0Var;
        Object objG;
        com.gamericefishpro.space.t.d0 d0Var;
        h2 h2Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        d2 d2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        d2 d2Var2;
        int i13;
        Object objP;
        h2 h2Var2;
        int i14;
        k1 k1Var3;
        Object obj4 = obj;
        if (this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = n.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3);
                j = i15;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                h2Var2 = this.I;
                i14 = h2Var2.t;
                if (z) {
                    h2Var2.Q(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    h2Var2.Q(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    h2Var2.Q(i, obj4, obj5, false);
                }
                k1Var3 = this.j;
                if (k1Var3 != null) {
                    int i16 = (-2) - i14;
                    p0 p0Var = new p0(-1, i, i16, -1);
                    k1Var3.e.h(i16, new j0(-1, this.k - k1Var3.b, 0));
                    k1Var3.d.add(p0Var);
                }
                w(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    d2Var2 = this.G;
                    i13 = d2Var2.g;
                    if (i13 < d2Var2.h) {
                        objP = d2Var2.p(d2Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (Intrinsics.a(obj4, objP)) {
                        Z(obj2, z);
                        z3 = z2;
                    }
                }
                d2Var = this.G;
                iArr = d2Var.b;
                arrayList2 = new ArrayList();
                if (d2Var.k <= 0) {
                    i10 = d2Var.g;
                    while (i10 < d2Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = d2Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new p0(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new k1(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            k1Var = this.j;
            if (k1Var != null) {
                arrayList = k1Var.d;
                wVar = k1Var.e;
                i3 = k1Var.b;
                if (obj4 != null) {
                    objValueOf = new o0(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                h0Var = ((com.gamericefishpro.space.v0.a) k1Var.f.getValue()).a;
                objG = h0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof com.gamericefishpro.space.t.d0) {
                    d0Var = (com.gamericefishpro.space.t.d0) objG;
                    Object objK = d0Var.k(0);
                    if (d0Var.h()) {
                        h0Var.k(objValueOf);
                    }
                    if (d0Var.b == 1) {
                        h0Var.m(objValueOf, d0Var.e());
                    }
                    objG = objK;
                } else {
                    h0Var.k(objValueOf);
                }
                p0 p0Var2 = (p0) objG;
                if (!z3 || p0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        h2 h2VarF = this.H.f();
                        this.I = h2VarF;
                        h2VarF.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    h2Var = this.I;
                    int i19 = h2Var.t;
                    if (z) {
                        h2Var.Q(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        h2Var.Q(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        h2Var.Q(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    p0 p0Var3 = new p0(-1, i, i20, -1);
                    wVar.h(i20, new j0(-1, this.k - i3, i4));
                    arrayList.add(p0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    k1Var2 = new k1(i5, arrayList3);
                } else {
                    int i21 = p0Var2.c;
                    arrayList.add(p0Var2);
                    j0 j0Var = (j0) wVar.b(i21);
                    this.k = (j0Var != null ? j0Var.b : -1) + i3;
                    j0 j0Var2 = (j0) wVar.b(i21);
                    int i22 = j0Var2 != null ? j0Var2.a : -1;
                    int i23 = k1Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = wVar.c;
                            long[] jArr = wVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j2 = jArr[i26];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j2 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                j0 j0Var3 = (j0) objArr3[(i26 << 3) + i28];
                                                int i29 = j0Var3.a;
                                                if (i29 == i22) {
                                                    j0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        j0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j2 >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = wVar.c;
                        long[] jArr2 = wVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j3 = jArr2[i30];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j3 & 255) < 128) {
                                            i9 = i25;
                                            j0 j0Var4 = (j0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = j0Var4.a;
                                            if (i33 == i22) {
                                                j0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                j0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j3 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    com.gamericefishpro.space.u0.b bVar = this.M;
                    int i34 = bVar.f;
                    r rVar = bVar.a;
                    bVar.f = (i21 - rVar.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        bVar.d(false);
                        com.gamericefishpro.space.h2.r rVar2 = bVar.d;
                        d2 d2Var3 = rVar.G;
                        if (d2Var3.c > 0 && rVar2.a(-2) != (i7 = d2Var3.i)) {
                            if (!bVar.c && bVar.e) {
                                bVar.d(false);
                                bVar.b.c.w0(com.gamericefishpro.space.u0.q.c);
                                bVar.c = true;
                            }
                            if (i7 > 0) {
                                a aVarA = d2Var3.a(i7);
                                rVar2.c(i7);
                                bVar.d(false);
                                com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
                                l0Var.w0(com.gamericefishpro.space.u0.p.c);
                                com.gamericefishpro.space.i.a.M(l0Var, 0, aVarA);
                                bVar.c = true;
                            }
                        }
                        com.gamericefishpro.space.u0.l0 l0Var2 = bVar.b.c;
                        l0Var2.w0(com.gamericefishpro.space.u0.u.c);
                        l0Var2.e[l0Var2.f - l0Var2.c[l0Var2.d - 1].a] = i6;
                    }
                    Z(obj2, z);
                    k1Var2 = null;
                }
            } else {
                k1Var2 = null;
            }
            w(z, k1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j = 0;
        this.T = jRotateLeft ^ j;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            h2Var2 = this.I;
            i14 = h2Var2.t;
            if (z) {
                h2Var2.Q(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                h2Var2.Q(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                h2Var2.Q(i, obj4, obj5, false);
            }
            k1Var3 = this.j;
            if (k1Var3 != null) {
                int i110 = (-2) - i14;
                p0 p0Var4 = new p0(-1, i, i110, -1);
                k1Var3.e.h(i110, new j0(-1, this.k - k1Var3.b, 0));
                k1Var3.d.add(p0Var4);
            }
            w(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                d2Var2 = this.G;
                i13 = d2Var2.g;
                if (i13 < d2Var2.h) {
                    objP = d2Var2.p(d2Var2.b, i13);
                } else {
                    objP = null;
                }
                if (Intrinsics.a(obj4, objP)) {
                    Z(obj2, z);
                    z3 = z2;
                }
            }
            d2Var = this.G;
            iArr = d2Var.b;
            arrayList2 = new ArrayList();
            if (d2Var.k <= 0) {
                i10 = d2Var.g;
                while (i10 < d2Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = d2Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new p0(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new k1(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        k1Var = this.j;
        if (k1Var != null) {
            arrayList = k1Var.d;
            wVar = k1Var.e;
            i3 = k1Var.b;
            if (obj4 != null) {
                objValueOf = new o0(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            h0Var = ((com.gamericefishpro.space.v0.a) k1Var.f.getValue()).a;
            objG = h0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof com.gamericefishpro.space.t.d0) {
                d0Var = (com.gamericefishpro.space.t.d0) objG;
                Object objK2 = d0Var.k(0);
                if (d0Var.h()) {
                    h0Var.k(objValueOf);
                }
                if (d0Var.b == 1) {
                    h0Var.m(objValueOf, d0Var.e());
                }
                objG = objK2;
            } else {
                h0Var.k(objValueOf);
            }
            p0 p0Var5 = (p0) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                h2 h2VarF2 = this.H.f();
                this.I = h2VarF2;
                h2VarF2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            h2Var = this.I;
            int i113 = h2Var.t;
            if (z) {
                h2Var.Q(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                h2Var.Q(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                h2Var.Q(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            p0 p0Var6 = new p0(-1, i, i210, -1);
            wVar.h(i210, new j0(-1, this.k - i3, i4));
            arrayList.add(p0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            k1Var2 = new k1(i5, arrayList4);
        } else {
            k1Var2 = null;
        }
        w(z, k1Var2);
    }

    public final void X() {
        W(-127, 0, null, null);
    }

    public final void Y(int i, z0 z0Var) {
        W(i, 0, z0Var, null);
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            d2 d2Var = this.G;
            if (d2Var.k <= 0) {
                if ((d2Var.b[(d2Var.g * 5) + 1] & 1073741824) == 0) {
                    m1.a("Expected a node group");
                }
                d2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            com.gamericefishpro.space.u0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
            l0Var.w0(com.gamericefishpro.space.u0.f0.c);
            com.gamericefishpro.space.i.a.M(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        com.gamericefishpro.space.u0.c cVar = this.O;
        cVar.d.s0();
        cVar.c.s0();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        d2 d2Var = this.G;
        if (!d2Var.f) {
            d2Var.c();
        }
        if (this.I.w) {
            return;
        }
        x();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            W(i, 0, null, null);
            return;
        }
        if (this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        d2 d2Var = this.G;
        boolean z = this.S;
        f fVar = n.a;
        if (z) {
            d2Var.k++;
            this.I.Q(i, fVar, fVar, false);
            w(false, null);
            return;
        }
        if (d2Var.g() == i && ((i3 = d2Var.g) >= d2Var.h || (d2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            d2Var.u();
            w(false, null);
            return;
        }
        if (d2Var.k <= 0 && (i2 = d2Var.g) != d2Var.h) {
            int i4 = this.k;
            M();
            this.M.e(i4, d2Var.s());
            i.h(this.s, i2, d2Var.g);
        }
        d2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            h2 h2VarF = this.H.f();
            this.I = h2VarF;
            h2VarF.M();
            this.J = false;
            this.K = null;
        }
        h2 h2Var = this.I;
        h2Var.d();
        int i5 = h2Var.t;
        h2Var.Q(i, fVar, fVar, false);
        this.N = h2Var.b(i5);
        w(false, null);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            com.gamericefishpro.space.u0.l0 l0Var = this.O.c;
            l0Var.w0(com.gamericefishpro.space.u0.g0.c);
            com.gamericefishpro.space.i.a.M(l0Var, 0, obj);
            Intrinsics.c(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            com.gamericefishpro.space.ei.e0.c(2, function2);
            com.gamericefishpro.space.i.a.M(l0Var, 1, function2);
            return;
        }
        com.gamericefishpro.space.u0.b bVar = this.M;
        bVar.b();
        com.gamericefishpro.space.u0.l0 l0Var2 = bVar.b.c;
        l0Var2.w0(com.gamericefishpro.space.u0.g0.c);
        Intrinsics.c(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        com.gamericefishpro.space.ei.e0.c(2, function2);
        com.gamericefishpro.space.i.a.N(l0Var2, 0, obj, 1, function2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    public final r b0(int i) {
        p1 p1Var;
        boolean z;
        a0(i);
        boolean z2 = this.S;
        com.gamericefishpro.space.m.d dVar = this.g;
        ArrayList arrayList = this.E;
        x xVar = this.h;
        if (z2) {
            p1 p1Var2 = new p1(xVar);
            arrayList.add(p1Var2);
            l0(p1Var2);
            p1Var2.e = this.B;
            p1Var2.b &= -17;
            dVar.o();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iQ = i.q(i2, arrayList2);
        m0 m0Var = iQ >= 0 ? (m0) arrayList2.remove(iQ) : null;
        Object objM = this.G.m();
        if (Intrinsics.a(objM, n.a)) {
            p1Var = new p1(xVar);
            l0(p1Var);
        } else {
            Intrinsics.c(objM, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            p1Var = (p1) objM;
        }
        if (m0Var == null) {
            int i3 = p1Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                p1Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = p1Var.b;
        p1Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(p1Var);
        p1Var.e = this.B;
        p1Var.b &= -17;
        dVar.o();
        int i5 = p1Var.b;
        if ((i5 & 256) != 0) {
            p1Var.b = (i5 & (-257)) | 512;
            com.gamericefishpro.space.u0.l0 l0Var = this.M.b.c;
            l0Var.w0(com.gamericefishpro.space.u0.d0.c);
            com.gamericefishpro.space.i.a.M(l0Var, 0, p1Var);
            if (!this.y) {
                int i6 = p1Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    p1Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final boolean c(float f) {
        Object objH = H();
        if ((objH instanceof Float) && f == ((Number) objH).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f));
        return true;
    }

    public final void c0(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        W(207, 0, null, obj);
    }

    public final boolean d(int i) {
        Object objH = H();
        if ((objH instanceof Integer) && i == ((Number) objH).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i));
        return true;
    }

    public final void d0() {
        W(125, 2, null, null);
        this.r = true;
    }

    public final boolean e(long j) {
        Object objH = H();
        if ((objH instanceof Long) && j == ((Number) objH).longValue()) {
            return false;
        }
        l0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e0() {
        this.m = 0;
        this.G = this.c.d();
        W(100, 0, null, null);
        u uVar = this.b;
        uVar.t();
        l1 l1VarI = uVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(l1VarI);
        this.K = null;
        if (!this.q) {
            this.q = uVar.e();
        }
        if (!this.C) {
            this.C = uVar.f();
        }
        if (this.C) {
            t2 t2Var = com.gamericefishpro.space.g1.g.a;
            Intrinsics.c(t2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            l1VarI = ((com.gamericefishpro.space.b1.l) l1VarI).i(t2Var, new u2(C()));
        }
        this.u = l1VarI;
        Set set = (Set) i.w(l1VarI, com.gamericefishpro.space.g1.i.a);
        if (set != null) {
            set.add(y());
            uVar.o(set);
        }
        W(Long.hashCode(uVar.g()), 0, null, null);
    }

    public final boolean f(Object obj) {
        if (Intrinsics.a(H(), obj)) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final boolean f0(p1 p1Var, Object obj) {
        a aVar = p1Var.c;
        if (aVar == null) {
            return false;
        }
        int iB = this.G.a.b(aVar);
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iQ = i.q(iB, arrayList);
        if (iQ < 0) {
            int i = -(iQ + 1);
            if (!(obj instanceof d0)) {
                obj = null;
            }
            arrayList.add(i, new m0(p1Var, iB, obj));
            return true;
        }
        m0 m0Var = (m0) arrayList.get(iQ);
        if (!(obj instanceof d0)) {
            m0Var.c = null;
            return true;
        }
        Object obj2 = m0Var.c;
        if (obj2 == null) {
            m0Var.c = obj;
            return true;
        }
        if (obj2 instanceof com.gamericefishpro.space.t.i0) {
            ((com.gamericefishpro.space.t.i0) obj2).a(obj);
            return true;
        }
        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.t.q0.a;
        com.gamericefishpro.space.t.i0 i0Var2 = new com.gamericefishpro.space.t.i0(2);
        i0Var2.k(obj2);
        i0Var2.k(obj);
        m0Var.c = i0Var2;
        return true;
    }

    public final boolean g(boolean z) {
        Object objH = H();
        if ((objH instanceof Boolean) && z == ((Boolean) objH).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[LOOP:1: B:17:0x003a->B:32:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[EDGE_INSN: B:40:0x008b->B:33:0x008b BREAK  A[LOOP:1: B:17:0x003a->B:32:0x0088], SYNTHETIC] */
    public final void g0(com.gamericefishpro.space.t.h0 h0Var) {
        ArrayList arrayList = this.s;
        for (int iE = com.gamericefishpro.space.ph.x.e(arrayList); -1 < iE; iE--) {
            m0 m0Var = (m0) arrayList.get(iE);
            a aVar = m0Var.a.c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(iE);
            } else {
                int i = m0Var.b;
                int i2 = aVar.a;
                if (i != i2) {
                    m0Var.b = i2;
                }
            }
        }
        Object[] objArr = h0Var.b;
        Object[] objArr2 = h0Var.c;
        long[] jArr = h0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            p1 p1Var = (p1) obj;
                            a aVar2 = p1Var.c;
                            if (aVar2 != null) {
                                int i7 = aVar2.a;
                                if (obj2 == f.y) {
                                    obj2 = null;
                                }
                                arrayList.add(new m0(p1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        com.gamericefishpro.space.ph.b0.k(arrayList, i.c);
    }

    public final boolean h(Object obj) {
        if (H() == obj) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final void h0(int i, int i2) {
        if (m0(i) != i2) {
            if (i < 0) {
                com.gamericefishpro.space.t.u uVar = this.p;
                if (uVar == null) {
                    uVar = new com.gamericefishpro.space.t.u();
                    this.p = uVar;
                }
                uVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                com.gamericefishpro.space.ph.u.j(iArr, -1);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        com.gamericefishpro.space.u0.b bVar = this.M;
        bVar.c = false;
        bVar.d.b = 0;
        bVar.f = 0;
        bVar.e = true;
        bVar.g = 0;
        bVar.h.clear();
        bVar.i = -1;
        bVar.j = -1;
        bVar.k = -1;
        bVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        int iM0 = m0(i);
        if (iM0 != i2) {
            int i3 = i2 - iM0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM1 = m0(i) + i3;
                h0(i, iM1);
                for (int i4 = size; -1 < i4; i4--) {
                    k1 k1Var = (k1) arrayList.get(i4);
                    if (k1Var != null && k1Var.a(i, iM1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                if (i < 0) {
                    i = this.G.i;
                } else if (this.G.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final Object j(o1 o1Var) {
        return i.w(l(), o1Var);
    }

    public final com.gamericefishpro.space.b1.l j0(l1 l1Var, com.gamericefishpro.space.b1.l lVar) {
        com.gamericefishpro.space.b1.l lVar2 = (com.gamericefishpro.space.b1.l) l1Var;
        lVar2.getClass();
        com.gamericefishpro.space.b1.k kVar = new com.gamericefishpro.space.b1.k(lVar2);
        kVar.putAll(lVar);
        com.gamericefishpro.space.b1.l lVarF = kVar.f();
        Y(204, s.d);
        H();
        l0(lVarF);
        H();
        l0(lVar);
        p(false);
        return lVarF;
    }

    public final void k(Function0 function0) {
        if (!this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            s.a("createNode() can only be called when inserting");
        }
        com.gamericefishpro.space.h2.r rVar = this.n;
        int i = rVar.a[rVar.b - 1];
        h2 h2Var = this.I;
        a aVarB = h2Var.b(h2Var.v);
        this.l++;
        com.gamericefishpro.space.u0.c cVar = this.O;
        com.gamericefishpro.space.u0.l0 l0Var = cVar.c;
        l0Var.w0(com.gamericefishpro.space.u0.r.d);
        com.gamericefishpro.space.i.a.M(l0Var, 0, function0);
        l0Var.e[l0Var.f - l0Var.c[l0Var.d - 1].a] = i;
        com.gamericefishpro.space.i.a.M(l0Var, 1, aVarB);
        com.gamericefishpro.space.u0.l0 l0Var2 = cVar.d;
        l0Var2.w0(com.gamericefishpro.space.u0.r.e);
        l0Var2.e[l0Var2.f - l0Var2.c[l0Var2.d - 1].a] = i;
        com.gamericefishpro.space.i.a.M(l0Var2, 0, aVarB);
    }

    public final void k0(Object obj) {
        if (obj instanceof x1) {
            y1 y1Var = new y1((x1) obj, this.m - 1);
            if (this.S) {
                com.gamericefishpro.space.u0.l0 l0Var = this.M.b.c;
                l0Var.w0(com.gamericefishpro.space.u0.w.c);
                com.gamericefishpro.space.i.a.M(l0Var, 0, y1Var);
            }
            this.d.add(obj);
            obj = y1Var;
        }
        l0(obj);
    }

    public final l1 l() {
        l1 l1Var;
        l1 l1Var2 = this.K;
        if (l1Var2 != null) {
            return l1Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        z0 z0Var = s.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && Intrinsics.a(this.I.t(iE), z0Var)) {
                    Object objQ = this.I.q(iE);
                    Intrinsics.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    l1 l1Var3 = (l1) objQ;
                    this.K = l1Var3;
                    return l1Var3;
                }
                h2 h2Var = this.I;
                iE = h2Var.E(h2Var.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    d2 d2Var = this.G;
                    if (Intrinsics.a(d2Var.p(d2Var.b, iQ), z0Var)) {
                        com.gamericefishpro.space.t.w wVar = this.v;
                        if (wVar == null || (l1Var = (l1) wVar.b(iQ)) == null) {
                            d2 d2Var2 = this.G;
                            Object objB = d2Var2.b(d2Var2.b, iQ);
                            Intrinsics.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            l1Var = (l1) objB;
                        }
                        this.K = l1Var;
                        return l1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        l1 l1Var4 = this.u;
        this.K = l1Var4;
        return l1Var4;
    }

    public final void l0(Object obj) {
        if (this.S) {
            h2 h2Var = this.I;
            if (h2Var.n <= 0 || h2Var.i == h2Var.k) {
                h2Var.F(obj);
                return;
            }
            com.gamericefishpro.space.t.w wVar = h2Var.s;
            if (wVar == null) {
                wVar = new com.gamericefishpro.space.t.w();
            }
            h2Var.s = wVar;
            int i = h2Var.v;
            Object objB = wVar.b(i);
            if (objB == null) {
                objB = new com.gamericefishpro.space.t.d0();
                wVar.h(i, objB);
            }
            ((com.gamericefishpro.space.t.d0) objB).a(obj);
            return;
        }
        d2 d2Var = this.G;
        boolean z = d2Var.n;
        com.gamericefishpro.space.u0.b bVar = this.M;
        if (!z) {
            a aVarA = d2Var.a(d2Var.i);
            com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
            l0Var.w0(com.gamericefishpro.space.u0.e.c);
            com.gamericefishpro.space.i.a.N(l0Var, 0, aVarA, 1, obj);
            return;
        }
        int iC = (d2Var.l - g2.c(d2Var.b, d2Var.i)) - 1;
        if (bVar.a.G.i - bVar.f >= 0) {
            bVar.d(true);
            com.gamericefishpro.space.u0.l0 l0Var2 = bVar.b.c;
            l0Var2.w0(com.gamericefishpro.space.u0.r.g);
            com.gamericefishpro.space.i.a.M(l0Var2, 0, obj);
            l0Var2.e[l0Var2.f - l0Var2.c[l0Var2.d - 1].a] = iC;
            return;
        }
        d2 d2Var2 = this.G;
        a aVarA2 = d2Var2.a(d2Var2.i);
        com.gamericefishpro.space.u0.l0 l0Var3 = bVar.b.c;
        l0Var3.w0(com.gamericefishpro.space.u0.r.f);
        com.gamericefishpro.space.i.a.N(l0Var3, 0, obj, 1, aVarA2);
        l0Var3.e[l0Var3.f - l0Var3.c[l0Var3.d - 1].a] = iC;
    }

    public final com.gamericefishpro.space.g1.a m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        com.gamericefishpro.space.qh.d dVarB = com.gamericefishpro.space.ph.w.b();
        h2 h2Var = this.I;
        dVarB.addAll(com.gamericefishpro.space.u6.f.l(h2Var, null, h2Var.t, null));
        d2 d2Var = this.G;
        boolean z = d2Var.f;
        int[] iArr = d2Var.b;
        if (z || d2Var.c == 0) {
            collection = com.gamericefishpro.space.ph.g0.d;
        } else {
            com.gamericefishpro.space.g1.l lVar = new com.gamericefishpro.space.g1.l(d2Var);
            int iQ = d2Var.i;
            Object objValueOf = Integer.valueOf(d2Var.l - g2.c(iArr, iQ));
            while (iQ >= 0) {
                lVar.n(d2Var.i(iQ), d2Var.k(iQ) ? d2Var.p(iArr, iQ) : n.a, d2Var.a.i(iQ), objValueOf);
                objValueOf = d2Var.a(iQ);
                iQ = d2Var.q(iQ);
            }
            collection = (ArrayList) lVar.d;
        }
        dVarB.addAll(collection);
        dVarB.addAll(I());
        return new com.gamericefishpro.space.g1.a(com.gamericefishpro.space.ph.w.a(dVarB));
    }

    public final int m0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        com.gamericefishpro.space.t.u uVar = this.p;
        if (uVar == null || uVar.c(i) < 0) {
            return 0;
        }
        int iC = uVar.c(i);
        if (iC >= 0) {
            return uVar.c[iC];
        }
        com.gamericefishpro.space.u.a.e("Cannot find value for key " + i);
        throw null;
    }

    public final void n(com.gamericefishpro.space.t.h0 h0Var, Function2 function2) {
        ArrayList arrayList = this.s;
        int i = 1;
        if (this.F) {
            s.a("Reentrant composition is not supported");
        }
        this.g.o();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(com.gamericefishpro.space.f1.p.j().g());
            this.v = null;
            g0(h0Var);
            this.k = 0;
            this.F = true;
            try {
                e0();
                Object objH = H();
                if (objH != function2 && function2 != null) {
                    l0(function2);
                }
                com.gamericefishpro.space.f1.w wVar = this.D;
                com.gamericefishpro.space.v0.e eVarO = i.o();
                try {
                    eVarO.b(wVar);
                    z0 z0Var = s.a;
                    if (function2 != null) {
                        Y(200, z0Var);
                        com.gamericefishpro.space.ei.e0.c(2, function2);
                        function2.invoke(this, 1);
                        p(false);
                    } else if (!this.w || objH == null || objH.equals(n.a)) {
                        T();
                    } else {
                        Y(200, z0Var);
                        com.gamericefishpro.space.ei.e0.c(2, objH);
                        Function2 function3 = (Function2) objH;
                        com.gamericefishpro.space.ei.e0.c(2, function3);
                        function3.invoke(this, 1);
                        p(false);
                    }
                    eVarO.l(eVarO.i - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        s.a("Check failed");
                    }
                    x();
                    Unit unit = Unit.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    eVarO.l(eVarO.i - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    com.gamericefishpro.space.wa.b.R(th2, new o(this, i));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        s.a("Check failed");
                    }
                    x();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void n0() {
        if (!this.r) {
            s.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            s.a("useNode() called while inserting");
        }
        d2 d2Var = this.G;
        Object objN = d2Var.n(d2Var.i);
        com.gamericefishpro.space.u0.b bVar = this.M;
        bVar.c();
        bVar.h.add(objN);
        if (this.y && (objN instanceof j)) {
            bVar.b();
            bVar.b.c.w0(com.gamericefishpro.space.u0.i0.c);
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            com.gamericefishpro.space.u0.b bVar = this.M;
            bVar.c();
            bVar.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x051b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        com.gamericefishpro.space.h2.r rVar;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        com.gamericefishpro.space.h2.r rVar2;
        int i7;
        LinkedHashSet linkedHashSet;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        com.gamericefishpro.space.h2.r rVar3 = this.n;
        int i15 = rVar3.a[rVar3.b - 2] - 1;
        boolean z2 = this.S;
        f fVar = n.a;
        if (z2) {
            h2 h2Var = this.I;
            int i16 = h2Var.v;
            int iS = h2Var.s(i16);
            Object objT = this.I.t(i16);
            Object objQ = this.I.q(i16);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(fVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            d2 d2Var = this.G;
            int i17 = d2Var.i;
            int i18 = d2Var.i(i17);
            d2 d2Var2 = this.G;
            Object objP = d2Var2.p(d2Var2.b, i17);
            d2 d2Var3 = this.G;
            Object objB = d2Var3.b(d2Var3.b, i17);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(fVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        k1 k1Var = this.j;
        ArrayList arrayList4 = this.s;
        com.gamericefishpro.space.u0.b bVar = this.M;
        if (k1Var != null) {
            com.gamericefishpro.space.t.w wVar = k1Var.e;
            int i20 = k1Var.b;
            ArrayList arrayList5 = k1Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = k1Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    p0 p0Var = (p0) arrayList5.get(i22);
                    if (hashSet2.contains(p0Var)) {
                        rVar2 = rVar3;
                        i7 = i22;
                        if (!linkedHashSet2.contains(p0Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                p0 p0Var2 = (p0) arrayList6.get(i25);
                                if (p0Var2 != p0Var) {
                                    j0 j0Var = (j0) wVar.b(p0Var2.c);
                                    int i26 = j0Var != null ? j0Var.b : -1;
                                    linkedHashSet2.add(p0Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        j0 j0Var2 = (j0) wVar.b(p0Var2.c);
                                        int i27 = j0Var2 != null ? j0Var2.c : p0Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = bVar.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.j == i28 - i30 && bVar.k == i29 - i30) {
                                                    bVar.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.j = i28;
                                            bVar.k = i29;
                                            bVar.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = wVar.c;
                                                long[] jArr5 = wVar.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    j0 j0Var3 = (j0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = j0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        j0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        j0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = wVar.c;
                                            long[] jArr6 = wVar.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                j0 j0Var4 = (j0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = j0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    j0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    j0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                j0 j0Var5 = (j0) wVar.b(p0Var2.c);
                                int i41 = i10 + (j0Var5 != null ? j0Var5.c : p0Var2.d);
                                i22 = i11;
                                k1Var = k1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                rVar3 = rVar2;
                            } else {
                                i23 = i25;
                                rVar3 = rVar2;
                                i22 = i7;
                            }
                        }
                    } else {
                        rVar2 = rVar3;
                        j0 j0Var6 = (j0) wVar.b(p0Var.c);
                        int i42 = j0Var6 != null ? j0Var6.b : -1;
                        int i43 = p0Var.c;
                        i7 = i22;
                        bVar.e(i42 + i20, p0Var.d);
                        k1Var.a(i43, 0);
                        bVar.f = (i43 - bVar.a.G.g) + bVar.f;
                        this.G.r(i43);
                        M();
                        this.G.s();
                        i.h(arrayList4, i43, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    rVar3 = rVar2;
                }
                rVar = rVar3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    d2 d2Var4 = this.G;
                    bVar.f = (d2Var4.h - bVar.a.G.g) + bVar.f;
                    d2Var4.t();
                }
            } else {
                rVar = rVar3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            rVar = rVar3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            d2 d2Var5 = this.G;
            int i44 = d2Var5.m - d2Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    bVar.d(false);
                    com.gamericefishpro.space.h2.r rVar4 = bVar.d;
                    d2 d2Var6 = bVar.a.G;
                    if (d2Var6.c > 0 && rVar4.a(-2) != (i6 = d2Var6.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.c.w0(com.gamericefishpro.space.u0.q.c);
                            bVar.c = true;
                        }
                        if (i6 > 0) {
                            a aVarA = d2Var6.a(i6);
                            rVar4.c(i6);
                            bVar.d(false);
                            com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
                            l0Var.w0(com.gamericefishpro.space.u0.p.c);
                            com.gamericefishpro.space.i.a.M(l0Var, 0, aVarA);
                            bVar.c = true;
                        }
                    }
                    com.gamericefishpro.space.u0.l0 l0Var2 = bVar.b.c;
                    l0Var2.w0(com.gamericefishpro.space.u0.e0.c);
                    l0Var2.e[l0Var2.f - l0Var2.c[l0Var2.d - 1].a] = i44;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            d2 d2Var7 = this.G;
            if (d2Var7.k > 0 || (i5 = d2Var7.g) == d2Var7.h) {
                break;
            }
            M();
            bVar.e(i45, this.G.s());
            i.h(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                com.gamericefishpro.space.u0.c cVar = this.O;
                com.gamericefishpro.space.u0.l0 l0Var3 = cVar.d;
                if (!l0Var3.v0()) {
                    s.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                com.gamericefishpro.space.u0.l0 l0Var4 = cVar.c;
                com.gamericefishpro.space.u0.j0[] j0VarArr = l0Var3.c;
                int i46 = l0Var3.d - 1;
                l0Var3.d = i46;
                com.gamericefishpro.space.u0.j0 j0Var7 = j0VarArr[i46];
                j0VarArr[i46] = null;
                l0Var4.w0(j0Var7);
                Object[] objArr7 = l0Var3.g;
                Object[] objArr8 = l0Var4.g;
                int i47 = l0Var4.h;
                int i48 = j0Var7.b;
                int i49 = l0Var3.h;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = l0Var3.g;
                int i51 = l0Var3.h;
                Intrinsics.checkNotNullParameter(objArr9, "<this>");
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = l0Var3.e;
                int[] iArr2 = l0Var4.e;
                int i52 = l0Var4.f;
                int i53 = j0Var7.a;
                int i54 = l0Var3.f;
                com.gamericefishpro.space.ph.u.c(i52 - i53, i54 - i53, i54, iArr, iArr2);
                l0Var3.h -= i48;
                l0Var3.f -= i53;
                i19 = 1;
            }
            d2 d2Var8 = this.G;
            if (d2Var8.k <= 0) {
                m1.a("Unbalanced begin/end empty");
            }
            d2Var8.k--;
            h2 h2Var2 = this.I;
            int i55 = h2Var2.v;
            h2Var2.j();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.k();
                this.I.e(true);
                a aVar = this.N;
                if (this.O.c.u0()) {
                    e2 e2Var = this.H;
                    bVar.b();
                    bVar.d(false);
                    com.gamericefishpro.space.h2.r rVar5 = bVar.d;
                    d2 d2Var9 = bVar.a.G;
                    if (d2Var9.c <= 0 || rVar5.a(-2) == (i4 = d2Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.c.w0(com.gamericefishpro.space.u0.q.c);
                            bVar.c = true;
                        }
                        if (i4 > 0) {
                            a aVarA2 = d2Var9.a(i4);
                            rVar5.c(i4);
                            bVar.d(false);
                            com.gamericefishpro.space.u0.l0 l0Var5 = bVar.b.c;
                            l0Var5.w0(com.gamericefishpro.space.u0.p.c);
                            com.gamericefishpro.space.i.a.M(l0Var5, 0, aVarA2);
                            i3 = 1;
                            bVar.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    bVar.c();
                    com.gamericefishpro.space.u0.l0 l0Var6 = bVar.b.c;
                    l0Var6.w0(com.gamericefishpro.space.u0.s.c);
                    com.gamericefishpro.space.i.a.N(l0Var6, 0, aVar, i3, e2Var);
                    r3 = 0;
                } else {
                    e2 e2Var2 = this.H;
                    com.gamericefishpro.space.u0.c cVar2 = this.O;
                    bVar.b();
                    bVar.d(false);
                    com.gamericefishpro.space.h2.r rVar6 = bVar.d;
                    d2 d2Var10 = bVar.a.G;
                    if (d2Var10.c > 0 && rVar6.a(-2) != (i2 = d2Var10.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.c.w0(com.gamericefishpro.space.u0.q.c);
                            bVar.c = true;
                        }
                        if (i2 > 0) {
                            a aVarA3 = d2Var10.a(i2);
                            rVar6.c(i2);
                            bVar.d(false);
                            com.gamericefishpro.space.u0.l0 l0Var7 = bVar.b.c;
                            l0Var7.w0(com.gamericefishpro.space.u0.p.c);
                            com.gamericefishpro.space.i.a.M(l0Var7, 0, aVarA3);
                            bVar.c = true;
                        }
                    }
                    bVar.c();
                    com.gamericefishpro.space.u0.l0 l0Var8 = bVar.b.c;
                    l0Var8.w0(com.gamericefishpro.space.u0.t.c);
                    int i57 = l0Var8.h - l0Var8.c[l0Var8.d - 1].b;
                    Object[] objArr10 = l0Var8.g;
                    objArr10[i57] = aVar;
                    objArr10[i57 + 1] = e2Var2;
                    objArr10[i57 + 2] = cVar2;
                    this.O = new com.gamericefishpro.space.u0.c();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.e != 0) {
                    h0(i56, r3);
                    i0(i56, i19);
                }
            }
        } else {
            if (z) {
                bVar.a();
            }
            int i58 = bVar.a.G.i;
            com.gamericefishpro.space.h2.r rVar7 = bVar.d;
            int i59 = i;
            if (rVar7.a(i59) > i58) {
                s.a("Missed recording an endGroup");
            }
            if (rVar7.a(i59) == i58) {
                bVar.d(false);
                rVar7.b();
                bVar.b.c.w0(com.gamericefishpro.space.u0.m.c);
            }
            int i60 = this.G.i;
            if (i19 != m0(i60)) {
                i0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            bVar.c();
        }
        ArrayList arrayList7 = this.i;
        k1 k1Var2 = (k1) arrayList7.remove(arrayList7.size() - 1);
        if (k1Var2 != null && !z3) {
            k1Var2.c++;
        }
        this.j = k1Var2;
        this.k = rVar.b() + i19;
        this.m = rVar.b();
        this.l = rVar.b() + i19;
    }

    public final void q() {
        p(false);
        p1 p1VarA = A();
        if (p1VarA != null) {
            int i = p1VarA.b;
            if ((i & 1) != 0) {
                p1VarA.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0083 A[SYNTHETIC] */
    public final p1 t() {
        p1 p1Var;
        a aVarA;
        com.gamericefishpro.space.n7.p pVar;
        ArrayList arrayList = this.E;
        p1 p1Var2 = !arrayList.isEmpty() ? (p1) arrayList.remove(arrayList.size() - 1) : null;
        if (p1Var2 != null) {
            p1Var2.b &= -9;
            this.g.o();
            int i = this.B;
            com.gamericefishpro.space.t.c0 c0Var = p1Var2.f;
            if (c0Var == null || (p1Var2.b & 16) != 0) {
                pVar = null;
                break;
            }
            Object[] objArr = c0Var.b;
            int[] iArr = c0Var.c;
            long[] jArr = c0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                pVar = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                pVar = new com.gamericefishpro.space.n7.p(i, 1, p1Var2, c0Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    pVar = null;
                    break;
                }
                if (i2 == length) {
                    pVar = null;
                    break;
                }
                i2++;
            }
            com.gamericefishpro.space.u0.b bVar = this.M;
            if (pVar != null) {
                com.gamericefishpro.space.u0.l0 l0Var = bVar.b.c;
                l0Var.w0(com.gamericefishpro.space.u0.l.c);
                com.gamericefishpro.space.i.a.N(l0Var, 0, pVar, 1, this.h);
            }
            int i6 = p1Var2.b;
            if ((i6 & 512) != 0) {
                p1Var2.b = i6 & (-513);
                com.gamericefishpro.space.u0.l0 l0Var2 = bVar.b.c;
                l0Var2.w0(com.gamericefishpro.space.u0.o.c);
                com.gamericefishpro.space.i.a.M(l0Var2, 0, p1Var2);
                int i7 = p1Var2.b;
                p1Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    p1Var2.b = i7 & (-1153);
                    this.y = false;
                }
            }
        }
        if (p1Var2 != null) {
            int i8 = p1Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (p1Var2.c == null) {
                    if (this.S) {
                        h2 h2Var = this.I;
                        aVarA = h2Var.b(h2Var.v);
                    } else {
                        d2 d2Var = this.G;
                        aVarA = d2Var.a(d2Var.i);
                    }
                    p1Var2.c = aVarA;
                }
                p1Var2.b &= -5;
                p1Var = p1Var2;
            } else {
                p1Var = null;
            }
        } else {
            p1Var = null;
        }
        p(false);
        return p1Var;
    }

    public final void u() {
        if (this.F || this.z != 100) {
            m1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        p(false);
        this.b.c();
        p(false);
        com.gamericefishpro.space.u0.b bVar = this.M;
        if (bVar.c) {
            bVar.d(false);
            bVar.d(false);
            bVar.b.c.w0(com.gamericefishpro.space.u0.m.c);
            bVar.c = false;
        }
        bVar.b();
        if (bVar.d.b != 0) {
            s.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            s.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(boolean z, k1 k1Var) {
        this.i.add(this.j);
        this.j = k1Var;
        int i = this.l;
        com.gamericefishpro.space.h2.r rVar = this.n;
        rVar.c(i);
        rVar.c(this.m);
        rVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        e2 e2Var = new e2();
        if (this.C) {
            e2Var.c();
        }
        if (this.b.d()) {
            e2Var.D = new com.gamericefishpro.space.t.w();
        }
        this.H = e2Var;
        h2 h2VarF = e2Var.f();
        h2VarF.e(true);
        this.I = h2VarF;
    }

    public final com.gamericefishpro.space.g1.d y() {
        w wVar = this.U;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.h);
        this.U = wVar2;
        return wVar2;
    }

    public final l1 z() {
        return l();
    }
}
