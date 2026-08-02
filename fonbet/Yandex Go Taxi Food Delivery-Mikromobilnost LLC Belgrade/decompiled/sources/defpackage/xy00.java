package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes9.dex */
public final class xy00 extends yy00 {
    public final h010 b;
    public final x111 c;
    public final yvf0 d;
    public final yvf0 e;

    public xy00(h010 h010Var, x111 x111Var, yvf0 yvf0Var, dt00 dt00Var) {
        this.b = h010Var;
        this.c = x111Var;
        this.d = yvf0Var;
        this.e = dt00Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        wy00 wy00Var = (wy00) obj;
        this.c.a();
        String f = wy00Var.f();
        String str = (f == null || f.length() == 0) ? null : f;
        String c = wy00Var.c();
        String str2 = (c == null || c.length() == 0) ? null : c;
        String a = wy00Var.a();
        MtCheckoutDeeplinkStatus.Companion.getClass();
        MtCheckoutDeeplinkStatus a2 = md30.a(a);
        if (str != null || str2 != null) {
            this.b.a(new um30(str, str2, wy00Var.b().toString(), new pj40(wy00Var.e(), wy00Var.d()), a2), null);
        } else if (a != null) {
            if (!((d) ((nz00) this.d.get())).d0(wy00Var.b())) {
                oep0.b(oep0Var, (m950) this.e.get());
            }
        }
        return zy11.a;
    }
}
