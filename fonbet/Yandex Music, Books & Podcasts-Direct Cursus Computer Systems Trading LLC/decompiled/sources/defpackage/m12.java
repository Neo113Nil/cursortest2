package defpackage;

/* loaded from: classes.dex */
public final class m12 implements rhj {
    public static final m12 a = new m12();
    public static final d9c b = d9c.a("eventTimeMs");
    public static final d9c c = d9c.a("eventCode");
    public static final d9c d = d9c.a("complianceData");
    public static final d9c e = d9c.a("eventUptimeMs");
    public static final d9c f = d9c.a("sourceExtension");
    public static final d9c g = d9c.a("sourceExtensionJsonProto3");
    public static final d9c h = d9c.a("timezoneOffsetSeconds");
    public static final d9c i = d9c.a("networkConnectionInfo");
    public static final d9c j = d9c.a("experimentIds");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        md2 md2Var = (md2) ((wqg) obj);
        shjVar.g(b, md2Var.a);
        shjVar.a(c, md2Var.b);
        shjVar.a(d, md2Var.c);
        shjVar.g(e, md2Var.d);
        shjVar.a(f, md2Var.e);
        shjVar.a(g, md2Var.f);
        shjVar.g(h, md2Var.g);
        shjVar.a(i, md2Var.h);
        shjVar.a(j, md2Var.i);
    }
}
