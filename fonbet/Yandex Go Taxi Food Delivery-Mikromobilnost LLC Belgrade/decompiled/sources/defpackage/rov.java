package defpackage;

import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class rov extends bjv {
    public final yvf0 b;

    public rov(xpj0 xpj0Var) {
        this.b = xpj0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((pep0) oep0Var).f((m950) this.b.get(), ResumeInAppCallSource.DEEPLINK, hxx.a);
        return zy11.a;
    }
}
