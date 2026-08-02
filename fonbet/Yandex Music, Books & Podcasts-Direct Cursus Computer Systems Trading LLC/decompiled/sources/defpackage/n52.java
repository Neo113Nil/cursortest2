package defpackage;

/* loaded from: classes3.dex */
public final class n52 implements rhj {
    public static final n52 a = new n52();
    public static final d9c b = d9c.a("baseAddress");
    public static final d9c c = d9c.a("size");
    public static final d9c d = d9c.a("name");
    public static final d9c e = d9c.a("uuid");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        ic2 ic2Var = (ic2) ((xp6) obj);
        shjVar.g(b, ic2Var.a);
        shjVar.g(c, ic2Var.b);
        shjVar.a(d, ic2Var.c);
        String str = ic2Var.d;
        shjVar.a(e, str != null ? str.getBytes(oq6.a) : null);
    }
}
