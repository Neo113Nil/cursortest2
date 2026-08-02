package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e6c implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6c b;

    public /* synthetic */ e6c(g6c g6cVar, int i) {
        this.a = i;
        this.b = g6cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        if (r12 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, Continuation continuation) {
        f6c f6cVar;
        int i;
        cvl cvlVar;
        g6c g6cVar;
        List list2;
        List list3;
        xdr xdrVar;
        kzp kzpVar;
        g6c g6cVar2 = this.b;
        xdr xdrVar2 = g6cVar2.p;
        jyr jyrVar = g6cVar2.j;
        if (continuation instanceof f6c) {
            f6cVar = (f6c) continuation;
            int i2 = f6cVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f6cVar.o = i2 - Integer.MIN_VALUE;
                Object obj = f6cVar.m;
                nm6 nm6Var = nm6.a;
                i = f6cVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    u5c u5cVar = (u5c) jyrVar.getValue();
                    f6cVar.j = list;
                    f6cVar.o = 1;
                    obj = u5cVar.a.a(f6cVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xdrVar = f6cVar.l;
                        g6cVar = f6cVar.k;
                        list3 = f6cVar.j;
                        qgg.h0(obj);
                        xdrVar.l(obj);
                        list = list3;
                        rmb.h(g6cVar.b, list == null ? list.size() : 0, 2);
                        kzpVar = g6cVar2.n;
                        if (kzpVar != null) {
                            kzpVar.invoke(new d73(g6cVar2.a));
                        }
                        return Unit.a;
                    }
                    list = f6cVar.j;
                    qgg.h0(obj);
                }
                cvlVar = (cvl) obj;
                if (cvlVar != null || cvlVar.g == 0 || (list2 = list) == null || list2.isEmpty()) {
                    xdrVar2.getClass();
                    xdrVar2.m(null, y5c.a);
                    g6cVar = g6cVar2;
                    rmb.h(g6cVar.b, list == null ? list.size() : 0, 2);
                    kzpVar = g6cVar2.n;
                    if (kzpVar != null) {
                    }
                    return Unit.a;
                }
                w5c w5cVar = new w5c(cvlVar, idc.a, g6c.b(g6cVar2, list));
                xdrVar2.getClass();
                xdrVar2.m(null, w5cVar);
                xdr xdrVar3 = g6cVar2.o;
                f6cVar.j = list;
                f6cVar.k = g6cVar2;
                f6cVar.l = xdrVar3;
                f6cVar.o = 2;
                Object g0 = zsd.g0(new bca(((u5c) jyrVar.getValue()).a.b(null), 18), f6cVar);
                if (g0 != nm6Var) {
                    list3 = list;
                    xdrVar = xdrVar3;
                    obj = g0;
                    g6cVar = g6cVar2;
                    xdrVar.l(obj);
                    list = list3;
                    rmb.h(g6cVar.b, list == null ? list.size() : 0, 2);
                    kzpVar = g6cVar2.n;
                    if (kzpVar != null) {
                    }
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        f6cVar = new f6c(this, continuation);
        Object obj2 = f6cVar.m;
        nm6 nm6Var2 = nm6.a;
        i = f6cVar.o;
        if (i != 0) {
        }
        cvlVar = (cvl) obj2;
        if (cvlVar != null) {
        }
        xdrVar2.getClass();
        xdrVar2.m(null, y5c.a);
        g6cVar = g6cVar2;
        rmb.h(g6cVar.b, list == null ? list.size() : 0, 2);
        kzpVar = g6cVar2.n;
        if (kzpVar != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Pair pair = (Pair) obj;
                z5c z5cVar = (z5c) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                g6c g6cVar = this.b;
                g6cVar.p.l(z5cVar);
                if (!booleanValue) {
                    return Unit.a;
                }
                Object m = g6cVar.h.a.m(new Integer(0), continuation);
                if (m != nm6.a) {
                    m = Unit.a;
                }
                return m == nm6.a ? m : Unit.a;
            default:
                return b((List) obj, continuation);
        }
    }
}
