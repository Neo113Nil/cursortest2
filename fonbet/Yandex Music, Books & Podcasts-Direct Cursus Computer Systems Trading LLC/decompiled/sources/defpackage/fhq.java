package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class fhq extends xfg {
    public final vjg d;
    public final f4m e;
    public final xdr f;
    public final fkn g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhq(vjg vjgVar, oq7 oq7Var, f4m f4mVar) {
        super(oq7Var);
        vjgVar.getClass();
        oq7Var.getClass();
        this.d = vjgVar;
        this.e = f4mVar;
        xdr a = ydr.a(xgq.a);
        this.f = a;
        this.g = new fkn(a);
        this.h = "SimilarEntities";
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.xfg
    public final String b() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(mwk mwkVar, cg6 cg6Var) {
        ehq ehqVar;
        int i;
        boolean z;
        if (cg6Var instanceof ehq) {
            ehqVar = (ehq) cg6Var;
            int i2 = ehqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ehqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ehqVar.k;
                nm6 nm6Var = nm6.a;
                i = ehqVar.m;
                vjg vjgVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    mqs a = mwkVar.a();
                    if (a == null) {
                        return new c73(vjgVar);
                    }
                    String str = a.a;
                    ehqVar.j = mwkVar;
                    ehqVar.m = 1;
                    obj = ((jhq) this.e.b).c(str, ehqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mwkVar = ehqVar.j;
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                z = rj6Var instanceof qj6;
                xdr xdrVar = this.f;
                if (z) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, ygq.a);
                    return new d73(vjgVar);
                }
                List list = (List) ((qj6) rj6Var).a;
                if (list.isEmpty()) {
                    return new b73(vjgVar);
                }
                mqs a2 = mwkVar.a();
                wgq wgqVar = new wgq(a2 != null ? a2.d() : null, list, mwkVar);
                xdrVar.getClass();
                xdrVar.m(null, wgqVar);
                return new d73(vjgVar);
            }
        }
        ehqVar = new ehq(this, cg6Var);
        Object obj2 = ehqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ehqVar.m;
        vjg vjgVar2 = this.d;
        if (i != 0) {
        }
        rj6 rj6Var2 = (rj6) obj2;
        z = rj6Var2 instanceof qj6;
        xdr xdrVar2 = this.f;
        if (z) {
        }
    }
}
