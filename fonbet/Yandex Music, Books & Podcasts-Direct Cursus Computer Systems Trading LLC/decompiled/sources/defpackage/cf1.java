package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class cf1 extends xmm {
    public final s63 d;
    public final u51 e;
    public final rmb f;
    public final wa g;
    public final f91 h;
    public final si1 i;
    public final oj1 j;
    public final gf1 k;
    public final se1 l;
    public final xdr m;

    public cf1(s63 s63Var, u51 u51Var, rmb rmbVar, wa waVar, f91 f91Var, si1 si1Var, oj1 oj1Var, gf1 gf1Var, d51 d51Var) {
        u51Var.getClass();
        waVar.getClass();
        f91Var.getClass();
        si1Var.getClass();
        oj1Var.getClass();
        gf1Var.getClass();
        this.d = s63Var;
        this.e = u51Var;
        this.f = rmbVar;
        this.g = waVar;
        this.h = f91Var;
        this.i = si1Var;
        this.j = oj1Var;
        this.k = gf1Var;
        this.l = (se1) s63Var.a;
        this.m = ydr.a(new hf1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.l;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.m.getValue() instanceof if1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        if (p(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        bf1 bf1Var;
        int i;
        if (cg6Var instanceof bf1) {
            bf1Var = (bf1) cg6Var;
            int i2 = bf1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bf1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = bf1Var.k;
                Object obj2 = nm6.a;
                i = bf1Var.m;
                se1 se1Var = this.l;
                xdr xdrVar = this.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        hf1 hf1Var = new hf1(true);
                        xdrVar.getClass();
                        xdrVar.m(null, hf1Var);
                    }
                    bf1Var.j = z;
                    bf1Var.m = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rj6 rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                            te1 te1Var = (te1) ((qj6) rj6Var).a;
                            te1Var.getClass();
                            if1 if1Var = new if1(new nnk(te1Var.a, te1Var.b));
                            xdrVar.getClass();
                            xdrVar.m(null, if1Var);
                            p43 p43Var = te1Var.c;
                            this.f.g(1, p43Var != null ? p43Var.a : null);
                            return new d73(se1Var);
                        }
                        if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        hf1 hf1Var2 = new hf1(false);
                        xdrVar.getClass();
                        xdrVar.m(null, hf1Var2);
                        ((pj6) rj6Var).a();
                        return new c73(se1Var);
                    }
                    z = bf1Var.j;
                    qgg.h0(obj);
                }
                bf1Var.j = z;
                bf1Var.m = 2;
                obj = this.k.a(se1Var, z, bf1Var);
            }
        }
        bf1Var = new bf1(this, cg6Var);
        Object obj3 = bf1Var.k;
        Object obj22 = nm6.a;
        i = bf1Var.m;
        se1 se1Var2 = this.l;
        xdr xdrVar2 = this.m;
        if (i != 0) {
        }
        bf1Var.j = z;
        bf1Var.m = 2;
        obj3 = this.k.a(se1Var2, z, bf1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(cg6 cg6Var) {
        af1 af1Var;
        int i;
        nnd nndVar;
        if (cg6Var instanceof af1) {
            af1Var = (af1) cg6Var;
            int i2 = af1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                af1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = af1Var.k;
                nm6 nm6Var = nm6.a;
                i = af1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    si1 si1Var = this.i;
                    if (!((Boolean) ((ri1) si1Var.c.c).invoke()).booleanValue()) {
                        return Unit.a;
                    }
                    nnd nndVar2 = si1Var.c;
                    af1Var.j = nndVar2;
                    af1Var.m = 1;
                    Object b = ((l91) this.h).b(af1Var);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    nndVar = nndVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nndVar = af1Var.j;
                    qgg.h0(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = (xdr) nndVar.b;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            }
        }
        af1Var = new af1(this, cg6Var);
        Object obj2 = af1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = af1Var.m;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        xdr xdrVar2 = (xdr) nndVar.b;
        xdrVar2.getClass();
        xdrVar2.m(null, bool2);
        return Unit.a;
    }
}
