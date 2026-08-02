package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class z9w0 extends wzv0 {
    public final yvf0 b;

    public z9w0(e6v0 e6v0Var) {
        this.b = e6v0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((pep0) oep0Var).f((m950) this.b.get(), new oaw0(((uzv0) obj).a()), hxx.a);
        return zy11.a;
    }
}
