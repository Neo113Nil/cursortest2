package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class u110 extends v110 {
    public final h010 b;
    public final x111 c;

    public u110(h010 h010Var, x111 x111Var) {
        this.b = h010Var;
        this.c = x111Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        t110 t110Var = (t110) obj;
        this.c.a();
        this.b.a(new an30(t110Var.d(), t110Var.a(), rib1.e(t110Var.c(), t110Var.b())), null);
        return zy11.a;
    }
}
