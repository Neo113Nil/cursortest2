package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q0h {
    public final mm6 a;
    public final opg b;
    public final Function1 c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final xdr g;
    public final xdr h;
    public volatile boolean i;
    public volatile rar j;
    public final jyr k;

    public q0h(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, tf6 tf6Var, opg opgVar, kef kefVar) {
        tf6Var.getClass();
        kefVar.getClass();
        this.a = tf6Var;
        this.b = opgVar;
        this.c = kefVar;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
        xdr a = ydr.a(null);
        this.g = a;
        this.h = a;
        this.k = btf.b(new dmg(4, this));
        x97.y(tf6Var, null, null, new m0h(this, null, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q0h q0hVar, boolean z, cg6 cg6Var) {
        n0h n0hVar;
        int i;
        rj6 rj6Var;
        Object i0;
        boolean z2;
        rj6 rj6Var2;
        xxq xxqVar;
        String str;
        q0hVar.getClass();
        if (cg6Var instanceof n0h) {
            n0hVar = (n0h) cg6Var;
            int i2 = n0hVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0hVar.n = i2 - Integer.MIN_VALUE;
                Object obj = n0hVar.l;
                nm6 nm6Var = nm6.a;
                i = n0hVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    b1h b1hVar = (b1h) q0hVar.d.getValue();
                    n0hVar.j = z;
                    n0hVar.n = 1;
                    obj = b1hVar.a(z, n0hVar);
                } else if (i == 1) {
                    z = n0hVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rj6Var2 = n0hVar.k;
                        qgg.h0(obj);
                        q0hVar.g.l(((qj6) rj6Var2).a);
                        return Unit.a;
                    }
                    boolean z3 = n0hVar.j;
                    rj6 rj6Var3 = n0hVar.k;
                    qgg.h0(obj);
                    z2 = z3;
                    rj6Var2 = rj6Var3;
                    i0 = obj;
                    xxqVar = (xxq) i0;
                    if (xxqVar != null || (str = xxqVar.a) == null) {
                        return Unit.a;
                    }
                    c1h c1hVar = (c1h) ((qj6) rj6Var2).a;
                    n0hVar.k = rj6Var2;
                    n0hVar.j = z2;
                    n0hVar.n = 3;
                    Object a = lmm.a(((dc7) ((cc7) q0hVar.e.getValue())).c(str, "lumen"), new p0h(c1hVar, null), n0hVar);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    pjc g = ((frt) q0hVar.f.getValue()).g();
                    n0hVar.k = rj6Var;
                    n0hVar.j = z;
                    n0hVar.n = 2;
                    i0 = zsd.i0(g, n0hVar);
                    if (i0 != nm6Var) {
                        z2 = z;
                        rj6Var2 = rj6Var;
                        xxqVar = (xxq) i0;
                        if (xxqVar != null) {
                        }
                        return Unit.a;
                    }
                    return nm6Var;
                }
                return Unit.a;
            }
        }
        n0hVar = new n0h(q0hVar, cg6Var);
        Object obj2 = n0hVar.l;
        nm6 nm6Var2 = nm6.a;
        i = n0hVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q0h q0hVar, String str, cg6 cg6Var) {
        o0h o0hVar;
        int i;
        hmm hmmVar;
        y0h y0hVar;
        Boolean a;
        String b;
        String b2;
        if (cg6Var instanceof o0h) {
            o0hVar = (o0h) cg6Var;
            int i2 = o0hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = o0hVar.j;
                nm6 nm6Var = nm6.a;
                i = o0hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((dc7) ((cc7) q0hVar.e.getValue())).c(str, "lumen").getData();
                    o0hVar.l = 1;
                    obj = zsd.i0(data, o0hVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                y0hVar = null;
                if (hmmVar == null || (a = ec7.a(hmmVar, "born")) == null) {
                    return null;
                }
                boolean booleanValue = a.booleanValue();
                b = ec7.b(hmmVar, "light_uri");
                b2 = ec7.b(hmmVar, "dark_uri");
                if (b != null && b2 != null) {
                    y0hVar = new y0h(b, b2);
                }
                return new c1h(booleanValue, y0hVar);
            }
        }
        o0hVar = new o0h(q0hVar, cg6Var);
        Object obj2 = o0hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = o0hVar.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        y0hVar = null;
        if (hmmVar == null) {
            boolean booleanValue2 = a.booleanValue();
            b = ec7.b(hmmVar, "light_uri");
            b2 = ec7.b(hmmVar, "dark_uri");
            if (b != null) {
                y0hVar = new y0h(b, b2);
            }
            return new c1h(booleanValue2, y0hVar);
        }
        return null;
    }

    public final boolean c() {
        if (!d()) {
            return false;
        }
        c1h c1hVar = (c1h) this.g.getValue();
        return (c1hVar == null || !c1hVar.a) && !this.i;
    }

    public final boolean d() {
        return ((Boolean) this.b.invoke()).booleanValue() && ((Boolean) ((xdr) ((bqi) this.k.getValue())).getValue()).booleanValue();
    }

    public final void e() {
        if (d()) {
            rar rarVar = this.j;
            Continuation continuation = null;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.j = x97.y(this.a, null, null, new m0h(this, continuation, 1), 3);
        }
    }
}
