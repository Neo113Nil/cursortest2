package defpackage;

/* loaded from: classes4.dex */
public final class t6r {
    public final frt a;
    public final cc7 b;
    public final w6r c;
    public final mm6 d;
    public final jyr e;
    public final xdr f;

    public t6r(frt frtVar, cc7 cc7Var, w6r w6rVar, jyr jyrVar) {
        tf6 e = gld.e(dm6.b);
        this.a = frtVar;
        this.b = cc7Var;
        this.c = w6rVar;
        this.d = e;
        this.e = jyrVar;
        xdr a = ydr.a(awe.a);
        this.f = a;
        ox6.B(a, e, new ryp(17, this));
        x97.y(e, null, null, new r6r(this, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t6r t6rVar, cg6 cg6Var) {
        s6r s6rVar;
        int i;
        cc7 cc7Var;
        t6rVar.getClass();
        if (cg6Var instanceof s6r) {
            s6rVar = (s6r) cg6Var;
            int i2 = s6rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s6rVar.m = i2 - Integer.MIN_VALUE;
                Object obj = s6rVar.k;
                nm6 nm6Var = nm6.a;
                i = s6rVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cc7 cc7Var2 = t6rVar.b;
                    pjc g = t6rVar.a.g();
                    s6rVar.j = cc7Var2;
                    s6rVar.m = 1;
                    Object g0 = zsd.g0(g, s6rVar);
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
                    cc7Var = s6rVar.j;
                    qgg.h0(obj);
                }
                return ((dc7) cc7Var).c(((xxq) obj).a, "splash_screen_storage");
            }
        }
        s6rVar = new s6r(t6rVar, cg6Var);
        Object obj2 = s6rVar.k;
        nm6 nm6Var2 = nm6.a;
        i = s6rVar.m;
        if (i != 0) {
        }
        return ((dc7) cc7Var).c(((xxq) obj2).a, "splash_screen_storage");
    }

    public final void b() {
        x97.y(this.d, null, null, new r6r(this, null, 0), 3);
    }
}
