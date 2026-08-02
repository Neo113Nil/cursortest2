package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f5v {
    public final qzc a;
    public final jyr b;

    public f5v(qzc qzcVar, jyr jyrVar) {
        this.a = qzcVar;
        this.b = jyrVar;
    }

    public static eu7 d(eu7 eu7Var, q4q q4qVar) {
        egc xeqVar;
        egc egcVar = eu7Var.a.a;
        if (egcVar instanceof km7) {
            xeqVar = new km7(bfg.B(((km7) egcVar).a, q4qVar));
        } else {
            if (!(egcVar instanceof xeq)) {
                if (!Intrinsics.d(egcVar, y4b.a)) {
                    b6e.s();
                    return null;
                }
                return eu7.a(eu7Var, new cu7(egcVar, bfg.B(eu7Var.a.b, q4qVar)), null, 2);
            }
            xeq xeqVar2 = (xeq) egcVar;
            xeqVar = new xeq(bfg.B(xeqVar2.a, q4qVar), xeqVar2.b);
        }
        egcVar = xeqVar;
        return eu7.a(eu7Var, new cu7(egcVar, bfg.B(eu7Var.a.b, q4qVar)), null, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v4v v4vVar, eu7 eu7Var, pfn pfnVar, gxc gxcVar, boolean z, rr5 rr5Var, boolean z2, List list, cg6 cg6Var) {
        c5v c5vVar;
        int i;
        gxc gxcVar2;
        Object obj;
        pfn pfnVar2;
        boolean z3;
        rj6 rj6Var;
        p4q p4qVar;
        if (cg6Var instanceof c5v) {
            c5vVar = (c5v) cg6Var;
            int i2 = c5vVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5vVar.p = i2 - Integer.MIN_VALUE;
                c5v c5vVar2 = c5vVar;
                Object obj2 = c5vVar2.n;
                nm6 nm6Var = nm6.a;
                i = c5vVar2.p;
                if (i != 0) {
                    qgg.h0(obj2);
                    List O = e3s.O(eu7Var);
                    c5vVar2.j = eu7Var;
                    c5vVar2.k = pfnVar;
                    gxcVar2 = gxcVar;
                    c5vVar2.l = gxcVar2;
                    c5vVar2.m = z2;
                    c5vVar2.p = 1;
                    Object r = this.a.r(v4vVar, O, z, rr5Var, list, c5vVar2);
                    if (r == nm6Var) {
                        return nm6Var;
                    }
                    obj = r;
                    pfnVar2 = pfnVar;
                    z3 = z2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = c5vVar2.m;
                    gxc gxcVar3 = c5vVar2.l;
                    pfn pfnVar3 = c5vVar2.k;
                    eu7 eu7Var2 = c5vVar2.j;
                    qgg.h0(obj2);
                    obj = obj2;
                    pfnVar2 = pfnVar3;
                    gxcVar2 = gxcVar3;
                    eu7Var = eu7Var2;
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return new z4v((pj6) rj6Var);
                    }
                    b6e.s();
                    return null;
                }
                ago agoVar = (ago) ((qj6) rj6Var).a;
                yku ykuVar = agoVar.c;
                t4q t4qVar = new t4q(pfnVar2, ykuVar.b, gxcVar2, z3);
                o4q n = bfg.n(eu7Var.a);
                tfo tfoVar = agoVar.b;
                tnu tnuVar = new tnu(ykuVar.a, agoVar.a);
                s4v s4vVar = new s4v(ykuVar.c, ykuVar.d);
                int ordinal = ykuVar.e.ordinal();
                if (ordinal == 0) {
                    p4qVar = p4q.a;
                } else if (ordinal == 1) {
                    p4qVar = p4q.b;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    p4qVar = p4q.c;
                }
                return new a5v(tfoVar, new u4q(tnuVar, t4qVar, s4vVar, n, p4qVar, null));
            }
        }
        c5vVar = new c5v(this, cg6Var);
        c5v c5vVar22 = c5vVar;
        Object obj22 = c5vVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = c5vVar22.p;
        if (i != 0) {
        }
        rj6Var = (rj6) obj;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xsu xsuVar, myu myuVar, cg6 cg6Var) {
        d5v d5vVar;
        int i;
        e5q N;
        v4v u4vVar;
        pfn pfnVar;
        gxc gxcVar;
        eu7 eu7Var;
        b5v b5vVar;
        String str;
        gxc gxcVar2;
        if (cg6Var instanceof d5v) {
            d5vVar = (d5v) cg6Var;
            int i2 = d5vVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5vVar.m = i2 - Integer.MIN_VALUE;
                d5v d5vVar2 = d5vVar;
                Object obj = d5vVar2.k;
                Object obj2 = nm6.a;
                i = d5vVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xsuVar.getClass();
                    myuVar.getClass();
                    if (myuVar instanceof hyu) {
                        hyu hyuVar = (hyu) myuVar;
                        N = new w4q(hyuVar.a, hyuVar.b, hyuVar.c, bfg.o(xsuVar), hyuVar.d, hyuVar.e);
                    } else {
                        if (!(myuVar instanceof iyu)) {
                            b6e.s();
                            return null;
                        }
                        N = bfg.N(xsuVar, (iyu) myuVar);
                    }
                    boolean z = N instanceof w4q;
                    if (z) {
                        u4vVar = new t4v(((w4q) N).a.b);
                    } else {
                        if (!(N instanceof y4q)) {
                            b6e.s();
                            return null;
                        }
                        u4vVar = new u4v(((y4q) N).a.e(), qgg.V(myuVar));
                    }
                    if (z) {
                        pfnVar = ((w4q) N).b.a;
                    } else {
                        if (!(N instanceof d5q)) {
                            b6e.s();
                            return null;
                        }
                        pfnVar = ((d5q) N).b().a;
                    }
                    pfn pfnVar2 = pfnVar;
                    if (z) {
                        gxcVar = ((w4q) N).b.c;
                    } else {
                        if (!(N instanceof d5q)) {
                            b6e.s();
                            return null;
                        }
                        gxcVar = ((d5q) N).b().b;
                    }
                    gxc gxcVar3 = gxcVar;
                    eu7 K = bfg.K(xsuVar);
                    rr5 w = bfg.w(xsuVar);
                    d5vVar2.j = K;
                    d5vVar2.m = 1;
                    obj = a(u4vVar, K, pfnVar2, gxcVar3, true, w, false, null, d5vVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    eu7Var = K;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eu7Var = d5vVar2.j;
                    qgg.h0(obj);
                }
                b5vVar = (b5v) obj;
                if (b5vVar instanceof a5v) {
                    if (b5vVar instanceof z4v) {
                        return new w4v(((z4v) b5vVar).a);
                    }
                    b6e.s();
                    return null;
                }
                a5v a5vVar = (a5v) b5vVar;
                q4q q4qVar = a5vVar.b;
                boolean z2 = q4qVar instanceof u4q;
                if (z2) {
                    str = ((u4q) q4qVar).b.e;
                } else {
                    if (!(q4qVar instanceof s4q)) {
                        b6e.s();
                        return null;
                    }
                    str = ((s4q) q4qVar).b.d;
                }
                if (z2) {
                    gxcVar2 = ((u4q) q4qVar).b.c;
                } else {
                    if (!(q4qVar instanceof s4q)) {
                        b6e.s();
                        return null;
                    }
                    gxcVar2 = ((s4q) q4qVar).b.c;
                }
                return new x4v(i4w.a0(n7w.e0(d(eu7Var, q4qVar)), sj2.D(a5vVar.a, new v80(str, gxcVar2, null), new d6v(q4qVar, c6v.a), false), true), q4qVar);
            }
        }
        d5vVar = new d5v(this, cg6Var);
        d5v d5vVar22 = d5vVar;
        Object obj3 = d5vVar22.k;
        Object obj22 = nm6.a;
        i = d5vVar22.m;
        if (i != 0) {
        }
        b5vVar = (b5v) obj3;
        if (b5vVar instanceof a5v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(u4v u4vVar, pfn pfnVar, gxc gxcVar, cg6 cg6Var) {
        e5v e5vVar;
        int i;
        cu7 cu7Var;
        b5v b5vVar;
        if (cg6Var instanceof e5v) {
            e5vVar = (e5v) cg6Var;
            int i2 = e5vVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5vVar.m = i2 - Integer.MIN_VALUE;
                e5v e5vVar2 = e5vVar;
                Object obj = e5vVar2.k;
                Object obj2 = nm6.a;
                i = e5vVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    y4b y4bVar = y4b.a;
                    c5b c5bVar = c5b.a;
                    cu7 cu7Var2 = new cu7(y4bVar, c5bVar);
                    eu7 eu7Var = new eu7(new cu7(y4bVar, c5bVar), new du7(-1, -1));
                    e5vVar2.j = cu7Var2;
                    e5vVar2.m = 1;
                    Object a = a(u4vVar, eu7Var, pfnVar, gxcVar, false, null, false, null, e5vVar2);
                    if (a == obj2) {
                        return obj2;
                    }
                    cu7Var = cu7Var2;
                    obj = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cu7Var = e5vVar2.j;
                    qgg.h0(obj);
                }
                b5vVar = (b5v) obj;
                if (!(b5vVar instanceof a5v)) {
                    return new x4v(new eu7(cu7Var, new du7(-1, -1)), ((a5v) b5vVar).b);
                }
                if (b5vVar instanceof z4v) {
                    return new w4v(((z4v) b5vVar).a);
                }
                b6e.s();
                return null;
            }
        }
        e5vVar = new e5v(this, cg6Var);
        e5v e5vVar22 = e5vVar;
        Object obj3 = e5vVar22.k;
        Object obj22 = nm6.a;
        i = e5vVar22.m;
        if (i != 0) {
        }
        b5vVar = (b5v) obj3;
        if (!(b5vVar instanceof a5v)) {
        }
    }
}
