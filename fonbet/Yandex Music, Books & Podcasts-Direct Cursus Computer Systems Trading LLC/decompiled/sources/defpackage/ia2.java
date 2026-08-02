package defpackage;

import android.os.Build;

/* loaded from: classes3.dex */
public final class ia2 implements rhj {
    public static final ia2 a = new ia2();
    public static final d9c b = d9c.a("packageName");
    public static final d9c c = d9c.a("versionName");
    public static final d9c d = d9c.a("appBuildVersion");
    public static final d9c e = d9c.a("deviceManufacturer");
    public static final d9c f = d9c.a("currentProcessDetails");
    public static final d9c g = d9c.a("appProcessDetails");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        mb0 mb0Var = (mb0) obj;
        shj shjVar = (shj) obj2;
        shjVar.a(b, mb0Var.a);
        shjVar.a(c, mb0Var.b);
        shjVar.a(d, mb0Var.c);
        shjVar.a(e, Build.MANUFACTURER);
        shjVar.a(f, mb0Var.d);
        shjVar.a(g, mb0Var.e);
    }
}
