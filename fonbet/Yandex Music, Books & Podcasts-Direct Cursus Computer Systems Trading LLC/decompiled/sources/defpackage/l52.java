package defpackage;

/* loaded from: classes3.dex */
public final class l52 implements rhj {
    public static final l52 a = new l52();
    public static final d9c b = d9c.a("generator");
    public static final d9c c = d9c.a("identifier");
    public static final d9c d = d9c.a("appQualitySessionId");
    public static final d9c e = d9c.a("startedAt");
    public static final d9c f = d9c.a("endedAt");
    public static final d9c g = d9c.a("crashed");
    public static final d9c h = d9c.a("app");
    public static final d9c i = d9c.a("user");
    public static final d9c j = d9c.a("os");
    public static final d9c k = d9c.a("device");
    public static final d9c l = d9c.a("events");
    public static final d9c m = d9c.a("generatorType");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        zb2 zb2Var = (zb2) ((nq6) obj);
        shjVar.a(b, zb2Var.a);
        shjVar.a(c, zb2Var.b.getBytes(oq6.a));
        shjVar.a(d, zb2Var.c);
        shjVar.g(e, zb2Var.d);
        shjVar.a(f, zb2Var.e);
        shjVar.d(g, zb2Var.f);
        shjVar.a(h, zb2Var.g);
        shjVar.a(i, zb2Var.h);
        shjVar.a(j, zb2Var.i);
        shjVar.a(k, zb2Var.j);
        shjVar.a(l, zb2Var.k);
        shjVar.e(m, zb2Var.l);
    }
}
