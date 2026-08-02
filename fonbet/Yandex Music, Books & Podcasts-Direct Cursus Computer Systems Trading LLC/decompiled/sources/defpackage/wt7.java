package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wt7 extends aur implements Function2 {
    public oqi j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ au7 n;
    public final /* synthetic */ au7 o;
    public final /* synthetic */ fyu p;
    public final /* synthetic */ List q;
    public final /* synthetic */ List r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public fwu u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt7(au7 au7Var, Continuation continuation, au7 au7Var2, fyu fyuVar, List list, List list2, int i, int i2) {
        super(2, continuation);
        this.n = au7Var;
        this.o = au7Var2;
        this.p = fyuVar;
        this.q = list;
        this.r = list2;
        this.s = i;
        this.t = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new wt7(this.n, continuation, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wt7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(3:(1:(7:6|7|8|9|10|11|12)(2:18|19))(7:20|21|22|23|24|(4:27|10|11|12)|26)|16|17)(1:31))(3:65|(1:67)|26)|32|33|(1:35)(1:62)|36|(8:38|39|(1:41)(2:57|(1:59)(2:60|61))|42|43|(1:45)(2:52|(1:54)(2:55|56))|46|(2:48|(2:50|26)(4:51|24|(0)|26)))|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0074, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0075, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v14, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v15, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        int i;
        ?? r2;
        Object obj2;
        egc km7Var;
        xvu xvuVar;
        fwu f;
        fwu f2;
        Object a;
        int i2;
        int i3;
        Object c;
        qqi qqiVar2;
        au7 au7Var = this.o;
        xdr xdrVar = (xdr) au7Var.o;
        nm6 nm6Var = nm6.a;
        int i4 = this.m;
        int i5 = this.s;
        int i6 = 0;
        if (i4 == 0) {
            qgg.h0(obj);
            qqi qqiVar3 = (qqi) this.n.m;
            this.j = qqiVar3;
            this.k = 0;
            this.m = 1;
            if (qqiVar3.a(this) != nm6Var) {
                qqiVar = qqiVar3;
                i = 0;
            }
            return nm6Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i7 = this.v;
                int i8 = this.l;
                i3 = this.k;
                f2 = this.u;
                ?? r6 = this.j;
                try {
                    qgg.h0(obj);
                    qqiVar = r6;
                    i2 = i7;
                    i6 = i8;
                    a = obj;
                    boolean booleanValue = ((Boolean) a).booleanValue();
                    xdrVar.l(f2);
                    this.j = qqiVar;
                    this.u = null;
                    this.k = i3;
                    this.l = i6;
                    this.v = i2;
                    this.m = 3;
                    c = au7.c(au7Var, booleanValue, f2, i5, this);
                    if (c != nm6Var) {
                        qqiVar2 = qqiVar;
                        obj2 = c;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return obj2;
                    }
                    return nm6Var;
                } catch (Throwable th) {
                    th = th;
                    r2 = r6;
                }
            } else {
                if (i4 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r2 = this.j;
                try {
                    qgg.h0(obj);
                    c = obj;
                    qqiVar2 = r2;
                    obj2 = c;
                    qqiVar = qqiVar2;
                    qqiVar.b(null);
                    return obj2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            r2.b(null);
            throw th;
        }
        int i9 = this.k;
        ?? r4 = this.j;
        qgg.h0(obj);
        i = i9;
        qqiVar = r4;
        Object value = xdrVar.getValue();
        xvu xvuVar2 = value instanceof xvu ? (xvu) value : null;
        obj2 = pvu.a;
        if (xvuVar2 != null) {
            fyu fyuVar = this.p;
            boolean z = fyuVar instanceof eyu;
            List list = this.q;
            if (z) {
                km7Var = new xeq(list, ((eyu) fyuVar).a);
            } else {
                if (!Intrinsics.d(fyuVar, dyu.a)) {
                    throw new x7j();
                }
                km7Var = new km7(list);
            }
            eu7 eu7Var = new eu7(new cu7(km7Var, this.r), new du7(-1, -1));
            boolean z2 = xvuVar2 instanceof bwu;
            a3l a3lVar = a3l.a;
            if (z2) {
                xvuVar = xvuVar2;
                f = au7Var.f(eu7Var, ((bwu) xvuVar2).a.b, ((bwu) xvuVar2).b, false, a3lVar);
            } else {
                xvuVar = xvuVar2;
                if (!(xvuVar instanceof fwu)) {
                    throw new x7j();
                }
                f = au7Var.f(eu7Var, ((fwu) xvuVar).a.b, ((fwu) xvuVar).b, false, a3lVar);
            }
            tyu tyuVar = f.a;
            eu7 a2 = tyuVar.a(i5);
            if (a2 != null) {
                f2 = au7Var.f(n7w.z(a2, this.t), tyuVar.b, f.b, false, a3lVar);
                v5j v5jVar = v5j.d;
                this.j = qqiVar;
                this.u = f2;
                this.k = i;
                this.l = 0;
                this.v = 0;
                this.m = 2;
                a = au7.a(au7Var, xvuVar, f2, v5jVar, this);
                if (a == nm6Var) {
                    return nm6Var;
                }
                i2 = 0;
                i3 = i;
                boolean booleanValue2 = ((Boolean) a).booleanValue();
                xdrVar.l(f2);
                this.j = qqiVar;
                this.u = null;
                this.k = i3;
                this.l = i6;
                this.v = i2;
                this.m = 3;
                c = au7.c(au7Var, booleanValue2, f2, i5, this);
                if (c != nm6Var) {
                }
                return nm6Var;
            }
        }
        qqiVar.b(null);
        return obj2;
    }
}
