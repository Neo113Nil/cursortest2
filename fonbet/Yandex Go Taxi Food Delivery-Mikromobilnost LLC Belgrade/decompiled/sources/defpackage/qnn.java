package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class qnn extends snn {
    public final jj3 b;
    public final yvf0 c;

    public qnn(jj3 jj3Var, le30 le30Var) {
        this.b = jj3Var;
        this.c = le30Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.b.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new t8j(24, oep0Var, this)), false, false, 28));
        return zy11.a;
    }
}
