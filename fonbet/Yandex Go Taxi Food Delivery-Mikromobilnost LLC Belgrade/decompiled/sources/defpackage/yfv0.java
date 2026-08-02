package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public final class yfv0 {
    public final wiq0 a;
    public final vfv0 b;
    public volatile rfv0 c;

    public yfv0(wiq0 wiq0Var, vfv0 vfv0Var) {
        this.a = wiq0Var;
        this.b = vfv0Var;
    }

    public final boolean a() {
        kb5 kb5Var;
        vfv0 vfv0Var = this.b;
        if (!vfv0Var.a.isEnabled()) {
            return false;
        }
        fnx0 n = ((k) this.a).n();
        TariffOrderFlow tariffOrderFlow = (n == null || (kb5Var = n.e) == null) ? null : kb5Var.d;
        TariffOrderFlow.Companion.getClass();
        String b = ijx0.b(tariffOrderFlow);
        if (b == null) {
            return false;
        }
        return vfv0Var.b().h.contains(b);
    }
}
