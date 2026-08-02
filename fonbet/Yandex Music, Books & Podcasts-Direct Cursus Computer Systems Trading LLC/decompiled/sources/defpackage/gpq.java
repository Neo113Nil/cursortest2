package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class gpq extends xqq {
    public final xdr k;
    public final xdr l;
    public final xdr m;
    public final x0q n;
    public final j0q o;
    public final cjf p;
    public final String q;
    public final ce5 r;
    public final xdr s;
    public final xdr t;
    public final x0q u;
    public rar v;

    public gpq(uoq uoqVar, l63 l63Var) {
        l63Var.getClass();
        this.k = ydr.a(null);
        this.l = ydr.a(apq.a);
        this.m = ydr.a(Boolean.FALSE);
        this.n = y0q.b(0, 1, oi3.b, 1);
        this.o = new j0q();
        this.p = uoqVar.d;
        String str = uoqVar.a;
        this.q = str;
        ce5 ce5Var = new ce5(str, ot0.F(this), uoqVar.e, l63Var);
        this.r = ce5Var;
        this.s = (xdr) ce5Var.h;
        this.t = (xdr) ce5Var.j;
        this.u = (x0q) ce5Var.l;
        ssg.a(3, "Skeleton:List", "Init SkeletonListViewModel", null);
        this.v = x97.y(ot0.F(this), null, null, new v5p(this, uoqVar, null, 23), 3);
        ox6.B(new bca((xdr) ce5Var.e, 18), ot0.F(this), new ryp(13, this));
    }

    @Override // defpackage.xqq
    public final xdr G() {
        return this.t;
    }

    @Override // defpackage.xqq
    public final x0q H() {
        return this.u;
    }

    @Override // defpackage.xqq
    public final pjc J() {
        return this.n;
    }

    @Override // defpackage.xqq
    public final j0q K() {
        return this.o;
    }

    @Override // defpackage.xqq
    public final String L() {
        return this.q;
    }

    @Override // defpackage.xqq
    public final vdr M() {
        return this.l;
    }

    @Override // defpackage.xqq
    public final xdr N() {
        return this.s;
    }

    @Override // defpackage.xqq
    public final vdr O() {
        return this.k;
    }

    @Override // defpackage.xqq
    public final vdr P() {
        return this.m;
    }

    @Override // defpackage.xqq
    public final void R(orf orfVar) {
        orfVar.getClass();
        this.r.n(orfVar);
    }

    @Override // defpackage.xqq
    public final void S() {
        rar rarVar = this.v;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.v = x97.y(ot0.F(this), null, null, new epq(this, continuation, 0), 3);
    }

    @Override // defpackage.xqq
    public final void T(String str, String str2) {
        str.getClass();
        rar rarVar = this.v;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.v = x97.y(ot0.F(this), null, null, new fpq(this, str, str2, continuation, 0), 3);
    }

    @Override // defpackage.xqq
    public final void U(int i) {
        x97.y(ot0.F(this), null, null, new epq(this, null, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(String str, String str2, boolean z, cg6 cg6Var) {
        dpq dpqVar;
        int i;
        cqq cqqVar;
        String str3;
        if (cg6Var instanceof dpq) {
            dpqVar = (dpq) cg6Var;
            int i2 = dpqVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dpqVar.o = i2 - Integer.MIN_VALUE;
                Object obj = dpqVar.m;
                nm6 nm6Var = nm6.a;
                i = dpqVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    StringBuilder sb = new StringBuilder("Load skeleton[force=");
                    sb.append(z);
                    sb.append("]: tabId=");
                    sb.append(str);
                    ssg.a(3, "Skeleton:List", su4.o(sb, " blockId=", str2), null);
                    dpqVar.j = str;
                    dpqVar.k = str2;
                    dpqVar.l = z;
                    dpqVar.o = 1;
                    cjf cjfVar = this.p;
                    cjfVar.getClass();
                    obj = cjf.c(cjfVar, z, dpqVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = dpqVar.k;
                        qgg.h0(obj);
                        if (str3 != null) {
                            x97.y(ot0.F(this), null, null, new v5p(this, str3, continuation, 24), 3);
                        }
                        return Unit.a;
                    }
                    z = dpqVar.l;
                    str2 = dpqVar.k;
                    str = dpqVar.j;
                    qgg.h0(obj);
                }
                cqqVar = (cqq) obj;
                if (cqqVar instanceof bqq) {
                    if (!(cqqVar instanceof aqq)) {
                        b6e.s();
                        return null;
                    }
                    aqq aqqVar = (aqq) cqqVar;
                    ssg.a(6, "Skeleton:List", "Skeleton loading is failed.", aqqVar.b);
                    this.n.a(aqqVar);
                    xdr xdrVar = this.l;
                    if (!(xdrVar.getValue() instanceof bpq)) {
                        zoq zoqVar = new zoq(aqqVar.a);
                        xdrVar.getClass();
                        xdrVar.m(null, zoqVar);
                    }
                    return Unit.a;
                }
                snq snqVar = (snq) ((bqq) cqqVar).a;
                this.k.l(snqVar.b);
                List list = snqVar.c;
                dpqVar.j = null;
                dpqVar.k = str2;
                dpqVar.l = z;
                dpqVar.o = 2;
                if (this.r.r(dpqVar, str, list) != nm6Var) {
                    str3 = str2;
                    if (str3 != null) {
                    }
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        dpqVar = new dpq(this, cg6Var);
        Object obj2 = dpqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = dpqVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cqqVar = (cqq) obj2;
        if (cqqVar instanceof bqq) {
        }
    }
}
