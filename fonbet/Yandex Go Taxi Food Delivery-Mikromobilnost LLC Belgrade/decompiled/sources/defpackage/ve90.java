package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class ve90 extends wi90 {
    public final yvf0 b;

    public ve90(zw30 zw30Var) {
        this.b = zw30Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((pep0) oep0Var).f((m950) this.b.get(), new ie90(((vi90) obj).a()), hxx.a);
        return zy11.a;
    }
}
