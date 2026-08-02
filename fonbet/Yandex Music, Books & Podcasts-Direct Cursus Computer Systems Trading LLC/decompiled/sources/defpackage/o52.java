package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes3.dex */
public final class o52 implements rhj {
    public static final o52 a = new o52();
    public static final d9c b = d9c.a("threads");
    public static final d9c c = d9c.a(Constants.KEY_EXCEPTION);
    public static final d9c d = d9c.a("appExitInfo");
    public static final d9c e = d9c.a("signal");
    public static final d9c f = d9c.a("binaries");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        hc2 hc2Var = (hc2) ((cq6) obj);
        shjVar.a(b, hc2Var.a);
        shjVar.a(c, hc2Var.b);
        shjVar.a(d, hc2Var.c);
        shjVar.a(e, hc2Var.d);
        shjVar.a(f, hc2Var.e);
    }
}
