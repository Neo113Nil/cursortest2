package defpackage;

import android.net.Uri;
import com.yandex.go.payments.shared.z;
import com.yandex.go.splash.domain.b;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.settings.main.k;

/* loaded from: classes8.dex */
public final class une extends lmr0 {
    public final z b;
    public final k c;
    public final u500 d;
    public final z9p e;
    public final ast0 f;

    public une(z zVar, k kVar, u500 u500Var, z9p z9pVar, ast0 ast0Var) {
        this.b = zVar;
        this.c = kVar;
        this.d = u500Var;
        this.e = z9pVar;
        this.f = ast0Var;
    }

    public static final void d(une uneVar, Runnable runnable) {
        ((b) uneVar.f).a(new l7a(24, uneVar, runnable));
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Uri a = ((kmr0) obj).a();
        this.b.c(a, deeplinkSource, new yw6(this, a, 1));
        return zy11.a;
    }
}
