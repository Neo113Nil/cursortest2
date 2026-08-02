package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class vl3 extends pi3 {
    public final jj3 b;

    public vl3(jj3 jj3Var) {
        this.b = jj3Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.b.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, null, false, false, 30));
        return zy11.a;
    }
}
