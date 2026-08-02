package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yz4 extends bfu {
    public final j0q A;
    public final jyr B;
    public final cz4 k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final rhp q;
    public final rhp r;
    public final ce5 s;
    public final xdr t;
    public final fkn u;
    public final j0q v;
    public final xdr w;
    public final xdr x;
    public final j0q y;
    public final xdr z;

    public yz4(cz4 cz4Var, fnb fnbVar, cvo cvoVar, lnq lnqVar) {
        cz4Var.getClass();
        cvoVar.getClass();
        this.k = cz4Var;
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        this.l = b;
        this.m = l18Var.b(hag.I(vxr.class), true);
        this.n = l18Var.b(hag.I(jp1.class), true);
        jyr b2 = btf.b(new ym4(12, this));
        this.o = l18Var.b(hag.I(snu.class), true);
        this.p = btf.b(new fv4(this, fnbVar, cvoVar));
        this.q = new rhp();
        this.r = new rhp();
        ce5 ce5Var = new ce5("collection", ot0.F(this), cz4Var.b, lnqVar);
        this.s = ce5Var;
        xdr a = ydr.a(pz4.a);
        this.t = a;
        this.u = new fkn(a);
        this.v = new j0q();
        this.w = ydr.a(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.x = ydr.a(bool);
        this.y = new j0q();
        this.z = ydr.a(bool);
        this.A = new j0q();
        this.B = btf.b(new r93(27, this));
        ox6.B(((z66) b.getValue()).e(), ot0.F(this), new tz4(this, 1));
        ox6.B(zsd.b0(new d64((vdr) ((bsr) ((trr) b2.getValue()).a.getValue()).g.getValue(), 3)), ot0.F(this), new tz4(this, 2));
        x97.y(ot0.F(this), null, null, new vz4(this, null, 1), 3);
        ox6.B(new bca((xdr) ce5Var.e, 18), ot0.F(this), new tz4(this, 0));
    }

    public static dz4 G() {
        l18 l18Var = l18.b;
        bdt I = hag.I(t35.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ikg a = ((t35) qdcVar.C(I)).a();
        bdt I2 = hag.I(dz4.class);
        qdc qdcVar2 = a.a;
        qdcVar2.getClass();
        return (dz4) qdcVar2.C(I2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yz4 yz4Var, wpq wpqVar, boolean z, cg6 cg6Var) {
        xz4 xz4Var;
        int i;
        ce5 ce5Var = yz4Var.s;
        if (cg6Var instanceof xz4) {
            xz4Var = (xz4) cg6Var;
            int i2 = xz4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xz4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = xz4Var.j;
                Object obj2 = nm6.a;
                i = xz4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ce5Var.p();
                    xz4Var.l = 1;
                    if (yz4Var.H(xz4Var, wpqVar, z) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ce5Var.o();
                return Unit.a;
            }
        }
        xz4Var = new xz4(yz4Var, cg6Var);
        Object obj3 = xz4Var.j;
        Object obj22 = nm6.a;
        i = xz4Var.l;
        if (i != 0) {
        }
        ce5Var.o();
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(cg6 cg6Var, wpq wpqVar, boolean z) {
        uz4 uz4Var;
        int i;
        rj6 rj6Var;
        wpq wpqVar2;
        boolean z2;
        if (cg6Var instanceof uz4) {
            uz4Var = (uz4) cg6Var;
            int i2 = uz4Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uz4Var.n = i2 - Integer.MIN_VALUE;
                Object obj = uz4Var.l;
                nm6 nm6Var = nm6.a;
                i = uz4Var.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    xiu xiuVar = this.k.a;
                    uz4Var.j = wpqVar;
                    uz4Var.k = z;
                    uz4Var.n = 1;
                    obj = xiuVar.z(uz4Var, wpqVar, z);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = uz4Var.k;
                        wpqVar2 = uz4Var.j;
                        qgg.h0(obj);
                        wpq wpqVar3 = wpqVar2;
                        z = z2;
                        wpqVar = wpqVar3;
                        if (wpqVar == wpq.a && !z) {
                            rar y = x97.y(ot0.F(this), null, null, new vz4(this, continuation, 0), 3);
                            rhp rhpVar = this.r;
                            rhpVar.getClass();
                            rhpVar.c(y);
                        }
                        return Unit.a;
                    }
                    z = uz4Var.k;
                    wpqVar = uz4Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar = this.t;
                    xdrVar.getClass();
                    xdrVar.m(null, oz4.a);
                    if (wpqVar == wpq.a) {
                    }
                    return Unit.a;
                }
                List list = (List) ((qj6) rj6Var).a;
                uz4Var.j = wpqVar;
                uz4Var.k = z;
                uz4Var.n = 2;
                if (this.s.r(uz4Var, null, list) != nm6Var) {
                    boolean z3 = z;
                    wpqVar2 = wpqVar;
                    z2 = z3;
                    wpq wpqVar32 = wpqVar2;
                    z = z2;
                    wpqVar = wpqVar32;
                    if (wpqVar == wpq.a) {
                        rar y2 = x97.y(ot0.F(this), null, null, new vz4(this, continuation, 0), 3);
                        rhp rhpVar2 = this.r;
                        rhpVar2.getClass();
                        rhpVar2.c(y2);
                    }
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        uz4Var = new uz4(this, cg6Var);
        Object obj2 = uz4Var.l;
        nm6 nm6Var2 = nm6.a;
        i = uz4Var.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
