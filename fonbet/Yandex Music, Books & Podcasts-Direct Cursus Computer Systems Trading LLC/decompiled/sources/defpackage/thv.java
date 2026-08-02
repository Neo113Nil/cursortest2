package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class thv {
    public final bkv a;
    public final tf6 b;
    public final oq7 c;
    public final z66 d;
    public final jvu e;
    public final boolean f;
    public final jyr g;
    public jhv h;
    public final xdr i;
    public final xdr j;

    public thv(bkv bkvVar, tf6 tf6Var, oq7 oq7Var, z66 z66Var, jyr jyrVar, jvu jvuVar, boolean z) {
        this.a = bkvVar;
        this.b = tf6Var;
        this.c = oq7Var;
        this.d = z66Var;
        this.e = jvuVar;
        this.f = z;
        this.g = jyrVar;
        xdr a = ydr.a(ckv.a);
        this.i = a;
        this.j = a;
        x97.y(tf6Var, null, null, new y6v(zsd.b0(ox6.C(new qll(a.i(), 2), 2000L, san.k)), (Continuation) null, this, 4), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(thv thvVar, u5j u5jVar, x66 x66Var, cg6 cg6Var) {
        khv khvVar;
        int i;
        fhv fhvVar;
        Object a;
        fhv fhvVar2;
        rj6 rj6Var;
        xdr xdrVar = thvVar.i;
        if (cg6Var instanceof khv) {
            khvVar = (khv) cg6Var;
            int i2 = khvVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                khvVar.o = i2 - Integer.MIN_VALUE;
                Object obj = khvVar.m;
                nm6 nm6Var = nm6.a;
                i = khvVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    jhv jhvVar = thvVar.h;
                    if (jhvVar == null || (fhvVar = jhvVar.b) == null) {
                        fhvVar = (fhv) thvVar.e.invoke();
                    }
                    jhv jhvVar2 = thvVar.h;
                    f2v f2vVar = jhvVar2 != null ? jhvVar2.a : null;
                    if ((f2vVar == null || (u5jVar.b && !u5jVar.a.equals(f2vVar))) && x66Var.a) {
                        xdrVar.getClass();
                        xdrVar.m(null, ckv.a);
                        bkv bkvVar = thvVar.a;
                        f2v f2vVar2 = u5jVar.a;
                        khvVar.j = u5jVar;
                        khvVar.k = x66Var;
                        khvVar.l = fhvVar;
                        khvVar.o = 1;
                        a = bkvVar.a(f2vVar2, khvVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                    }
                    fhvVar2 = null;
                    if (fhvVar2 != null) {
                        fhvVar = fhvVar2;
                    }
                    thvVar.h = new jhv(u5jVar.a, fhvVar);
                    dkv dkvVar = new dkv(fhvVar, !x66Var.a);
                    xdrVar.getClass();
                    xdrVar.m(null, dkvVar);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fhv fhvVar3 = khvVar.l;
                x66Var = khvVar.k;
                u5j u5jVar2 = khvVar.j;
                qgg.h0(obj);
                fhvVar = fhvVar3;
                u5jVar = u5jVar2;
                a = obj;
                rj6Var = (rj6) a;
                if (!(rj6Var instanceof qj6)) {
                    fhvVar2 = (fhv) ((qj6) rj6Var).a;
                    if (fhvVar2 != null) {
                    }
                    thvVar.h = new jhv(u5jVar.a, fhvVar);
                    dkv dkvVar2 = new dkv(fhvVar, !x66Var.a);
                    xdrVar.getClass();
                    xdrVar.m(null, dkvVar2);
                    return Unit.a;
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                fhvVar2 = null;
                if (fhvVar2 != null) {
                }
                thvVar.h = new jhv(u5jVar.a, fhvVar);
                dkv dkvVar22 = new dkv(fhvVar, !x66Var.a);
                xdrVar.getClass();
                xdrVar.m(null, dkvVar22);
                return Unit.a;
            }
        }
        khvVar = new khv(thvVar, cg6Var);
        Object obj2 = khvVar.m;
        nm6 nm6Var2 = nm6.a;
        i = khvVar.o;
        if (i != 0) {
        }
        rj6Var = (rj6) a;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public final void b(iiv iivVar) {
        ((zhv) this.g.getValue()).a(ovk.p(iivVar, ejv.b));
        bjv bjvVar = iivVar.c;
        if ((bjvVar instanceof xiv) || (bjvVar instanceof ajv)) {
            return;
        }
        if (!(bjvVar instanceof yiv) && !(bjvVar instanceof ziv)) {
            b6e.s();
            return;
        }
        x97.y(this.b, null, null, new zts(this, null, 27), 3);
    }
}
