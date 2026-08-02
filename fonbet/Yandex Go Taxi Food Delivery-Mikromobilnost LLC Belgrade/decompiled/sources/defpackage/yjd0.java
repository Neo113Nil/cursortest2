package defpackage;

import ru.yandex.taxi.am.token.a;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes9.dex */
public final class yjd0 implements p8w {
    public final a a;
    public final p5z b;
    public final sls c;
    public final String d;
    public final mj e;

    public yjd0(a aVar, p5z p5zVar, sls slsVar, String str, mj mjVar) {
        this.a = aVar;
        this.b = p5zVar;
        this.c = slsVar;
        this.d = str;
        this.e = mjVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        t4j0 b = zci0Var.e.b();
        b.c.a("Authorization", kp50.h(this.a.c()));
        b.c.a("X-SDK-Client-ID", this.d);
        b.c.a("Content-Type", "application/json; charset=UTF-8");
        b.c.a("X-SDK-Version", "26.0.0");
        b.c.a("Accept-Language", this.b.getLocale().getLanguage());
        b.c.a(ExtFunctionsKt.HEADER_USER_AGENT, (String) this.c.invoke());
        String str = (String) this.e.invoke();
        if (str != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                b.a("X-AppMetrica-UUID", str);
            }
        }
        return zci0Var.b(new d5j0(b));
    }
}
