package defpackage;

/* loaded from: classes3.dex */
public final class u52 implements rhj {
    public static final u52 a = new u52();
    public static final d9c b = d9c.a("batteryLevel");
    public static final d9c c = d9c.a("batteryVelocity");
    public static final d9c d = d9c.a("proximityOn");
    public static final d9c e = d9c.a("orientation");
    public static final d9c f = d9c.a("ramUsed");
    public static final d9c g = d9c.a("diskUsed");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        rc2 rc2Var = (rc2) ((fq6) obj);
        shjVar.a(b, rc2Var.a);
        shjVar.e(c, rc2Var.b);
        shjVar.d(d, rc2Var.c);
        shjVar.e(e, rc2Var.d);
        shjVar.g(f, rc2Var.e);
        shjVar.g(g, rc2Var.f);
    }
}
