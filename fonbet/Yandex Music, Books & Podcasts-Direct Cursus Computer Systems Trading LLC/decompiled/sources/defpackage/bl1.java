package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class bl1 extends xmm {
    public final rmb d;
    public final e4 e;
    public final ix6 f;
    public final ok1 g;
    public final xdr h;
    public List i;

    public bl1(s63 s63Var, rmb rmbVar, e4 e4Var, ix6 ix6Var) {
        e4Var.getClass();
        this.d = rmbVar;
        this.e = e4Var;
        this.f = ix6Var;
        this.g = (ok1) s63Var.a;
        this.h = ydr.a(new uk1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof vk1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        xk1 xk1Var;
        int i;
        List list;
        if (cg6Var instanceof xk1) {
            xk1Var = (xk1) cg6Var;
            int i2 = xk1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xk1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = xk1Var.j;
                nm6 nm6Var = nm6.a;
                i = xk1Var.l;
                xdr xdrVar = this.h;
                ok1 ok1Var = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        uk1 uk1Var = new uk1(true);
                        xdrVar.getClass();
                        xdrVar.m(null, uk1Var);
                    }
                    xk1Var.l = 1;
                    obj = this.e.b(ok1Var, z, xk1Var);
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
                list = (List) jf0.F((rj6) obj);
                this.i = list;
                if (list != null) {
                    uk1 uk1Var2 = new uk1(false);
                    xdrVar.getClass();
                    xdrVar.m(null, uk1Var2);
                    return new c73(ok1Var);
                }
                List<mqs> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (mqs mqsVar : list2) {
                    arrayList.add(new mk1(((a2t) this.f.b).a(mqsVar), mqsVar));
                }
                vk1 vk1Var = new vk1(arrayList);
                xdrVar.getClass();
                xdrVar.m(null, vk1Var);
                rmb.h(this.d, list.size(), 2);
                return new d73(ok1Var);
            }
        }
        xk1Var = new xk1(this, cg6Var);
        Object obj2 = xk1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = xk1Var.l;
        xdr xdrVar2 = this.h;
        ok1 ok1Var2 = this.g;
        if (i != 0) {
        }
        list = (List) jf0.F((rj6) obj2);
        this.i = list;
        if (list != null) {
        }
    }
}
