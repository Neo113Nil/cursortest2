package defpackage;

/* loaded from: classes3.dex */
public final class d52 implements rhj {
    public static final d52 a = new d52();
    public static final d9c b = d9c.a("pid");
    public static final d9c c = d9c.a("processName");
    public static final d9c d = d9c.a("reasonCode");
    public static final d9c e = d9c.a("importance");
    public static final d9c f = d9c.a("pss");
    public static final d9c g = d9c.a("rss");
    public static final d9c h = d9c.a("timestamp");
    public static final d9c i = d9c.a("traceFile");
    public static final d9c j = d9c.a("buildIdMappingForArch");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        tb2 tb2Var = (tb2) ((qp6) obj);
        shjVar.e(b, tb2Var.a);
        shjVar.a(c, tb2Var.b);
        shjVar.e(d, tb2Var.c);
        shjVar.e(e, tb2Var.d);
        shjVar.g(f, tb2Var.e);
        shjVar.g(g, tb2Var.f);
        shjVar.g(h, tb2Var.g);
        shjVar.a(i, tb2Var.h);
        shjVar.a(j, tb2Var.i);
    }
}
