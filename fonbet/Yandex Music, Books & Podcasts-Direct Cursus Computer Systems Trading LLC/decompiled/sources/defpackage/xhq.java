package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class xhq extends xfg {
    public final vjg d;
    public final a2t e;
    public final wt5 f;
    public final xdr g;
    public final fkn h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhq(vjg vjgVar, oq7 oq7Var, oo6 oo6Var, wt5 wt5Var) {
        super(oq7Var);
        vjgVar.getClass();
        oq7Var.getClass();
        oo6Var.getClass();
        this.d = vjgVar;
        this.e = oo6Var;
        this.f = wt5Var;
        xdr a = ydr.a(ohq.a);
        this.g = a;
        this.h = new fkn(a);
        this.i = "Similar";
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.xfg
    public final String b() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(mwk mwkVar, cg6 cg6Var) {
        whq whqVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof whq) {
            whqVar = (whq) cg6Var;
            int i2 = whqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = whqVar.k;
                nm6 nm6Var = nm6.a;
                i = whqVar.m;
                vjg vjgVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    mqs a = mwkVar.a();
                    if (a == null) {
                        return new c73(vjgVar);
                    }
                    String str = a.a;
                    whqVar.j = mwkVar;
                    whqVar.m = 1;
                    obj = this.f.a(str, 3, whqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mwkVar = whqVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return new c73(vjgVar);
                    }
                    b6e.s();
                    return null;
                }
                List list = (List) ((qj6) rj6Var).a;
                if (list.isEmpty()) {
                    return new b73(vjgVar);
                }
                List<mqs> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (mqs mqsVar : list2) {
                    arrayList.add(new khq(this.e.a(mqsVar), mqsVar));
                }
                phq phqVar = new phq(arrayList, mwkVar);
                xdr xdrVar = this.g;
                xdrVar.getClass();
                xdrVar.m(null, phqVar);
                return new d73(vjgVar);
            }
        }
        whqVar = new whq(this, cg6Var);
        Object obj2 = whqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = whqVar.m;
        vjg vjgVar2 = this.d;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
