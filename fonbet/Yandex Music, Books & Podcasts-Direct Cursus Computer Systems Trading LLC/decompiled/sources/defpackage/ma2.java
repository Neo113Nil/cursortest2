package defpackage;

/* loaded from: classes3.dex */
public final class ma2 implements rhj {
    public static final ma2 a = new ma2();
    public static final d9c b = d9c.a("eventType");
    public static final d9c c = d9c.a("sessionData");
    public static final d9c d = d9c.a("applicationInfo");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        rlp rlpVar = (rlp) obj;
        shj shjVar = (shj) obj2;
        rlpVar.getClass();
        shjVar.a(b, ojb.SESSION_START);
        shjVar.a(c, rlpVar.a);
        shjVar.a(d, rlpVar.b);
    }
}
