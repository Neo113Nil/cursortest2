package defpackage;

import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public final class f12 implements rhj {
    public static final f12 a = new f12();
    public static final d9c b = d9c.a("sdkVersion");
    public static final d9c c = d9c.a(CommonUrlParts.MODEL);
    public static final d9c d = d9c.a("hardware");
    public static final d9c e = d9c.a("device");
    public static final d9c f = d9c.a("product");
    public static final d9c g = d9c.a("osBuild");
    public static final d9c h = d9c.a("manufacturer");
    public static final d9c i = d9c.a("fingerprint");
    public static final d9c j = d9c.a(CommonUrlParts.LOCALE);
    public static final d9c k = d9c.a(AdRevenueScheme.COUNTRY);
    public static final d9c l = d9c.a("mccMnc");
    public static final d9c m = d9c.a("applicationBuild");

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        kb2 kb2Var = (kb2) ((be0) obj);
        shjVar.a(b, kb2Var.a);
        shjVar.a(c, kb2Var.b);
        shjVar.a(d, kb2Var.c);
        shjVar.a(e, kb2Var.d);
        shjVar.a(f, kb2Var.e);
        shjVar.a(g, kb2Var.f);
        shjVar.a(h, kb2Var.g);
        shjVar.a(i, kb2Var.h);
        shjVar.a(j, kb2Var.i);
        shjVar.a(k, kb2Var.j);
        shjVar.a(l, kb2Var.k);
        shjVar.a(m, kb2Var.l);
    }
}
