package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.startup.launch.c;

/* loaded from: classes9.dex */
public final class vly extends wly {
    public final c b;

    public vly(c cVar) {
        this.b = cVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.b.b("LinkedOrder.RefreshLaunchFromDeeplink", true);
        return zy11.a;
    }
}
