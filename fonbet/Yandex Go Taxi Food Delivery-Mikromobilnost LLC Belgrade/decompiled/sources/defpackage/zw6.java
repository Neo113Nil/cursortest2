package defpackage;

import android.net.Uri;
import com.yandex.go.payments.shared.business.onboarding.a;
import com.yandex.go.payments.shared.z;
import com.yandex.go.splash.domain.b;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.settings.main.k;

/* loaded from: classes8.dex */
public final class zw6 extends ow6 {
    public final a b;
    public final mx6 c;
    public final fx60 d;
    public final z e;
    public final k f;
    public final u500 g;
    public final z9p h;
    public final ast0 i;

    public zw6(a aVar, mx6 mx6Var, fx60 fx60Var, z zVar, k kVar, u500 u500Var, z9p z9pVar, ast0 ast0Var) {
        this.b = aVar;
        this.c = mx6Var;
        this.d = fx60Var;
        this.e = zVar;
        this.f = kVar;
        this.g = u500Var;
        this.h = z9pVar;
        this.i = ast0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Uri a = ((mw6) obj).a();
        xw6 xw6Var = new xw6(this, a);
        this.d.a(Events$Zalogin$LoginContext.DEEPLINK, new jo0(this, a, xw6Var, deeplinkSource, 6));
        return zy11.a;
    }

    public final void d(Runnable runnable) {
        ((b) this.i).a(new mh3(22, this, runnable));
    }
}
