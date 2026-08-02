package defpackage;

/* loaded from: classes5.dex */
public final class cmf {
    public final frt a;
    public final wst b;
    public final xdr c = ydr.a(null);
    public final mm6 d;
    public rar e;

    public cmf(frt frtVar, wst wstVar) {
        this.a = frtVar;
        this.b = wstVar;
        mm6 r = hld.r(new yiq(), new b43(rre.f, 6).plus(dm6.b()));
        this.d = r;
        ox6.B(zsd.d0(frtVar.g(), 1), r, new zlf(this, 0));
        b(frtVar.c());
        x97.y(r, dm6.b, null, new amf(this, null, 0), 2);
    }

    public final boolean a() {
        Boolean bool = (Boolean) this.b.a(this.a.c()).f(vye.e);
        xdr xdrVar = this.c;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        return bool.booleanValue();
    }

    public final void b(xxq xxqVar) {
        rar rarVar = this.e;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.e = ox6.B(this.b.a(xxqVar).g(vye.e), this.d, new zlf(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        bmf bmfVar;
        int i;
        if (cg6Var instanceof bmf) {
            bmfVar = (bmf) cg6Var;
            int i2 = bmfVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bmfVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bmfVar.j;
                nm6 nm6Var = nm6.a;
                i = bmfVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    xxq c = this.a.c();
                    bmfVar.l = 1;
                    if (this.b.c(c, bmfVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(a());
            }
        }
        bmfVar = new bmf(this, cg6Var);
        Object obj2 = bmfVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bmfVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(a());
    }
}
