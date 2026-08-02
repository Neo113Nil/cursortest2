package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ogq {
    public final k21 a;

    public ogq(k21 k21Var) {
        this.a = k21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        ngq ngqVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof ngq) {
            ngqVar = (ngq) cg6Var;
            int i2 = ngqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ngqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ngqVar.j;
                nm6 nm6Var = nm6.a;
                i = ngqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ngqVar.l = 1;
                    obj = k21.b(this.a, str, z, ngqVar, 28);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    List list = ((i21) ((qj6) rj6Var).a).k;
                    return list == null ? new nj6(null) : new qj6(list);
                }
                if (rj6Var instanceof pj6) {
                    return rj6Var;
                }
                b6e.s();
                return null;
            }
        }
        ngqVar = new ngq(this, cg6Var);
        Object obj2 = ngqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ngqVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
