package defpackage;

/* loaded from: classes3.dex */
public final class na2 implements rhj {
    public static final na2 a = new na2();
    public static final d9c b = d9c.a("sessionId");
    public static final d9c c = d9c.a("firstSessionId");
    public static final d9c d = d9c.a("sessionIndex");
    public static final d9c e = d9c.a("eventTimestampUs");
    public static final d9c f = d9c.a("dataCollectionStatus");
    public static final d9c g = d9c.a("firebaseInstallationId");
    public static final d9c h = d9c.a("firebaseAuthenticationToken");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        dmp dmpVar = (dmp) obj;
        shj shjVar = (shj) obj2;
        shjVar.a(b, dmpVar.a);
        shjVar.a(c, dmpVar.b);
        shjVar.e(d, dmpVar.c);
        shjVar.g(e, dmpVar.d);
        shjVar.a(f, dmpVar.e);
        shjVar.a(g, dmpVar.f);
        shjVar.a(h, dmpVar.g);
    }
}
