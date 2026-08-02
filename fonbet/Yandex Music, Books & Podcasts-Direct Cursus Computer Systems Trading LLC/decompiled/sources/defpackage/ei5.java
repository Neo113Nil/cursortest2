package defpackage;

/* loaded from: classes3.dex */
public final class ei5 {
    public final fi5 a;
    public final cc7 b;
    public final frt c;
    public final mm6 d;
    public final xdr e;
    public final xdr f;

    public ei5(fi5 fi5Var, cc7 cc7Var, frt frtVar) {
        tf6 e = gld.e(dm6.b);
        this.a = fi5Var;
        this.b = cc7Var;
        this.c = frtVar;
        this.d = e;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.e = ydr.a(e5bVar);
        this.f = ydr.a(Boolean.FALSE);
        ox6.B(frtVar.g(), e, new i64(14, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ei5 ei5Var, cg6 cg6Var) {
        ci5 ci5Var;
        int i;
        cc7 cc7Var;
        ei5Var.getClass();
        if (cg6Var instanceof ci5) {
            ci5Var = (ci5) cg6Var;
            int i2 = ci5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ci5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ci5Var.k;
                nm6 nm6Var = nm6.a;
                i = ci5Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cc7 cc7Var2 = ei5Var.b;
                    pjc g = ei5Var.c.g();
                    ci5Var.j = cc7Var2;
                    ci5Var.m = 1;
                    Object g0 = zsd.g0(g, ci5Var);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    obj = g0;
                    cc7Var = cc7Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cc7Var = ci5Var.j;
                    qgg.h0(obj);
                }
                return ((dc7) cc7Var).c(((xxq) obj).a, "communication_trigger_storage");
            }
        }
        ci5Var = new ci5(ei5Var, cg6Var);
        Object obj2 = ci5Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ci5Var.m;
        if (i != 0) {
        }
        return ((dc7) cc7Var).c(((xxq) obj2).a, "communication_trigger_storage");
    }
}
