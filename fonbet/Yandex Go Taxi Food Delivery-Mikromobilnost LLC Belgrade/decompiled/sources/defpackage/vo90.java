package defpackage;

import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.f;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.properties.m;
import kotlin.a;

/* loaded from: classes9.dex */
public final class vo90 {
    public final u02 a;
    public final hqe b;
    public final go90 c;
    public final im51 d;
    public final i3y e = a.a(new csz(27, this));

    public vo90(u02 u02Var, hqe hqeVar, go90 go90Var, im51 im51Var) {
        this.a = u02Var;
        this.b = hqeVar;
        this.c = go90Var;
        this.d = im51Var;
    }

    public final BindPhoneProperties a(long j, String str) {
        BindPhoneProperties.a aVar = new BindPhoneProperties.a();
        aVar.b(this.b.a());
        aVar.c(gtq0.h(this.a, j));
        if (str != null && !evu0.J(str)) {
            aVar.a(str);
        }
        BindPhoneProperties.Companion.getClass();
        return f.a(aVar);
    }

    public final LoginProperties b(Filter filter, tls tlsVar) {
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.e(filter);
        aVar.h(this.b.a());
        aVar.d();
        LoginProperties.Companion.getClass();
        LoginProperties b = i.b(aVar);
        LoginProperties.a aVar2 = new LoginProperties.a();
        aVar2.b(b);
        tlsVar.invoke(aVar2);
        return i.b(aVar2);
    }

    public final ProgressPropertiesImpl c() {
        ProgressPropertiesImpl.a aVar = new ProgressPropertiesImpl.a();
        this.d.getClass();
        aVar.a = new ProgressAnimation.Lottie(owh0.taxi_passport_loading_spinner);
        ProgressPropertiesImpl.Companion.getClass();
        return m.b(aVar);
    }
}
