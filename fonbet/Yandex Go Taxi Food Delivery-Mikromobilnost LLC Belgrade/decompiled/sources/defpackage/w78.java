package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class w78 extends v78 {
    public final yvf0 b;

    public w78(yvf0 yvf0Var) {
        this.b = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((pep0) oep0Var).f((m950) this.b.get(), new z09(((u78) obj).a().toString()), hxx.a);
        return zy11.a;
    }
}
