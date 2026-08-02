package defpackage;

/* loaded from: classes4.dex */
public final class s7r {
    public final frt a;
    public final cc7 b;
    public final mm6 c;
    public final xdr d;

    public s7r(cc7 cc7Var, frt frtVar) {
        tf6 e = gld.e(dm6.b);
        this.a = frtVar;
        this.b = cc7Var;
        this.c = e;
        this.d = ydr.a(null);
        x97.y(e, null, null, new v0r(this, null, 6), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s7r s7rVar, cg6 cg6Var) {
        r7r r7rVar;
        int i;
        cc7 cc7Var;
        if (cg6Var instanceof r7r) {
            r7rVar = (r7r) cg6Var;
            int i2 = r7rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r7rVar.m = i2 - Integer.MIN_VALUE;
                Object obj = r7rVar.k;
                nm6 nm6Var = nm6.a;
                i = r7rVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cc7 cc7Var2 = s7rVar.b;
                    pjc g = s7rVar.a.g();
                    r7rVar.j = cc7Var2;
                    r7rVar.m = 1;
                    Object g0 = zsd.g0(g, r7rVar);
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
                    cc7Var = r7rVar.j;
                    qgg.h0(obj);
                }
                return ((dc7) cc7Var).c(((xxq) obj).a, "splash_screen_settings_storage");
            }
        }
        r7rVar = new r7r(s7rVar, cg6Var);
        Object obj2 = r7rVar.k;
        nm6 nm6Var2 = nm6.a;
        i = r7rVar.m;
        if (i != 0) {
        }
        return ((dc7) cc7Var).c(((xxq) obj2).a, "splash_screen_settings_storage");
    }
}
