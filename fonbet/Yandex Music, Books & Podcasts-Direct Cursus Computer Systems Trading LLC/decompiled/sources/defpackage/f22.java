package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class f22 implements c22 {
    public static final hmm.a c = new hmm.a("downloaded_auto_cache_onboarding");
    public final cc7 a;
    public final frt b;

    public f22(cc7 cc7Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = cc7Var;
        this.b = frtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        d22 d22Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof d22) {
            d22Var = (d22) cg6Var;
            int i2 = d22Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d22Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d22Var.j;
                nm6 nm6Var = nm6.a;
                i = d22Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((dc7) this.a).c(this.b.c().a, "downloaded_flags").getData();
                    d22Var.l = 1;
                    obj = zsd.i0(data, d22Var);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.TRUE;
                }
                Boolean bool = (Boolean) hmmVar.a(c);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        d22Var = new d22(this, cg6Var);
        Object obj2 = d22Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d22Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }
}
