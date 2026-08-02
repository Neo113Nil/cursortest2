package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class sov extends gjv {
    public final yvf0 b;

    public sov(xh xhVar) {
        this.b = xhVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        m950 m950Var = (m950) this.b.get();
        zy11 zy11Var = zy11.a;
        ((pep0) oep0Var).f(m950Var, zy11Var, hxx.a);
        return zy11Var;
    }
}
