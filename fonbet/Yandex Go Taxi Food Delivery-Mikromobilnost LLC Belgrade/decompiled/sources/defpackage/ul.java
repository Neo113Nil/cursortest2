package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.yandex.passport.internal.autologin.ui.h;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import io.appmetrica.analytics.BuildConfig;
import ru.yandex.taxi.am.k;

/* loaded from: classes5.dex */
public final class ul {
    public final k a;
    public final fhz b;
    public final p370 c;
    public final vo90 d;

    public ul(k kVar, fhz fhzVar, p370 p370Var, vo90 vo90Var) {
        this.a = kVar;
        this.b = fhzVar;
        this.c = p370Var;
        this.d = vo90Var;
    }

    public final void a() {
        k kVar = this.a;
        mu11 a = kVar.x.a();
        if (!a.a() || kVar.Mg()) {
            return;
        }
        this.b.e();
        BindPhoneProperties a2 = this.d.a(a.a, null);
        p370 p370Var = this.c;
        y50 y50Var = (y50) p370Var.c;
        h hVar = new h(((ep90) p370Var.w).a().t().a, 4);
        Intent e = hVar.b.e((Context) p370Var.b, a2);
        a60 a60Var = (a60) y50Var;
        a60Var.getClass();
        try {
            a60Var.e(BuildConfig.API_LEVEL, e);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
