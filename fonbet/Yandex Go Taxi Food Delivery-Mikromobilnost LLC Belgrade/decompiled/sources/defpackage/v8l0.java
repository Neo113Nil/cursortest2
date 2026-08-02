package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class v8l0 {
    public final fif a;
    public final wiq0 b;
    public final qlp0 c;
    public final awi d;
    public g18 e = new dai();

    public v8l0(fif fifVar, wiq0 wiq0Var, qlp0 qlp0Var, awi awiVar) {
        this.a = fifVar;
        this.b = wiq0Var;
        this.c = qlp0Var;
        this.d = awiVar;
    }

    public final void a() {
        g18 bwiVar;
        pex0 m = ((k) this.b).m();
        int i = 0;
        boolean z = (m != null ? m.u0 : null) == TariffOrderFlow.DELIVERY_FLOW;
        cwi cwiVar = (cwi) this.d;
        if (z) {
            cwiVar.b();
            bwiVar = new bwi(i, cwiVar);
        } else {
            cwiVar.getClass();
            this.e.cancel();
            bwiVar = this.a.c(new ob0(10, this));
        }
        this.e = bwiVar;
    }
}
