package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class txe implements uxe {
    public final wiq0 a;

    public /* synthetic */ txe(wiq0 wiq0Var) {
        this.a = wiq0Var;
    }

    @Override // defpackage.uxe
    public TariffOrderFlow get() {
        pex0 m = ((k) this.a).m();
        if (m != null) {
            return m.u0;
        }
        return null;
    }
}
