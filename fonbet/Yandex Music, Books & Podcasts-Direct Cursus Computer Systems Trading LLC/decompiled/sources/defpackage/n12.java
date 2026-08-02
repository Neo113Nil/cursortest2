package defpackage;

/* loaded from: classes.dex */
public final class n12 implements rhj {
    public static final n12 a = new n12();
    public static final d9c b = d9c.a("requestTimeMs");
    public static final d9c c = d9c.a("requestUptimeMs");
    public static final d9c d = d9c.a("clientInfo");
    public static final d9c e = d9c.a("logSource");
    public static final d9c f = d9c.a("logSourceName");
    public static final d9c g = d9c.a("logEvent");
    public static final d9c h = d9c.a("qosTier");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        nd2 nd2Var = (nd2) ((trg) obj);
        shjVar.g(b, nd2Var.a);
        shjVar.g(c, nd2Var.b);
        shjVar.a(d, nd2Var.c);
        shjVar.a(e, nd2Var.d);
        shjVar.a(f, nd2Var.e);
        shjVar.a(g, nd2Var.f);
        shjVar.a(h, i5n.a);
    }
}
