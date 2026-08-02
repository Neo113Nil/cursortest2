package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class k52 implements rhj {
    public static final k52 a = new k52();
    public static final d9c b = d9c.a("arch");
    public static final d9c c = d9c.a(CommonUrlParts.MODEL);
    public static final d9c d = d9c.a("cores");
    public static final d9c e = d9c.a("ram");
    public static final d9c f = d9c.a("diskSpace");
    public static final d9c g = d9c.a("simulator");
    public static final d9c h = d9c.a("state");
    public static final d9c i = d9c.a("manufacturer");
    public static final d9c j = d9c.a("modelClass");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        dc2 dc2Var = (dc2) ((wp6) obj);
        shjVar.e(b, dc2Var.a);
        shjVar.a(c, dc2Var.b);
        shjVar.e(d, dc2Var.c);
        shjVar.g(e, dc2Var.d);
        shjVar.g(f, dc2Var.e);
        shjVar.d(g, dc2Var.f);
        shjVar.e(h, dc2Var.g);
        shjVar.a(i, dc2Var.h);
        shjVar.a(j, dc2Var.i);
    }
}
