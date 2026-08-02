package defpackage;

import android.os.Build;

/* loaded from: classes3.dex */
public final class ja2 implements rhj {
    public static final ja2 a = new ja2();
    public static final d9c b = d9c.a("appId");
    public static final d9c c = d9c.a("deviceModel");
    public static final d9c d = d9c.a("sessionSdkVersion");
    public static final d9c e = d9c.a("osVersion");
    public static final d9c f = d9c.a("logEnvironment");
    public static final d9c g = d9c.a("androidAppInfo");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        iw0 iw0Var = (iw0) obj;
        shj shjVar = (shj) obj2;
        shjVar.a(b, iw0Var.a);
        shjVar.a(c, Build.MODEL);
        shjVar.a(d, "2.1.2");
        shjVar.a(e, Build.VERSION.RELEASE);
        shjVar.a(f, vqg.LOG_ENVIRONMENT_PROD);
        shjVar.a(g, iw0Var.b);
    }
}
