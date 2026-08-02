package defpackage;

/* loaded from: classes10.dex */
public final class y1c implements zls {
    public final /* synthetic */ jrv a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ awk0 w;
    public final /* synthetic */ sls x;

    public y1c(jrv jrvVar, boolean z, String str, awk0 awk0Var, sls slsVar) {
        this.a = jrvVar;
        this.b = z;
        this.c = str;
        this.w = awk0Var;
        this.x = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(-1525724089);
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = ly3.i(btsVar);
        }
        zx40 zx40Var = (zx40) Q;
        f530 k = lrv.a(c530.a, zx40Var, this.a).k(new s1c(zx40Var, null, false, this.b, this.c, this.w, this.x));
        btsVar.t(false);
        return k;
    }
}
