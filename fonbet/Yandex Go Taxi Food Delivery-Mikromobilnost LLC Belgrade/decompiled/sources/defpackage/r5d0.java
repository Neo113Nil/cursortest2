package defpackage;

import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.paymentmethods.interactor.PaymentMethodValidator$PaymentSupportByTariff;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes9.dex */
public final class r5d0 {
    public final j29 a;
    public final s5d0 b;
    public final x39 c;

    public r5d0(j29 j29Var, s5d0 s5d0Var, x39 x39Var) {
        this.a = j29Var;
        this.b = s5d0Var;
        this.c = x39Var;
    }

    public final boolean a(String str) {
        if ("composite_payment.enabled".equals(str)) {
            i iVar = (i) this.a.b;
            g8a0 g8a0Var = iVar.g.d;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.PERSONAL_WALLET;
            fnx0 n = ((k) g8a0Var.c).n();
            int i = dba0.a[(n == null ? PaymentMethodValidator$PaymentSupportByTariff.UNAVAILABLE : b.j(n.c, paymentMethod$Type) ? PaymentMethodValidator$PaymentSupportByTariff.SUPPORTED : PaymentMethodValidator$PaymentSupportByTariff.NOT_SUPPORTED).ordinal()];
            if (i == 1 || i == 2) {
                xxc g = iVar.u.b.g();
                if (g != null && !g.a() && lw90.c(iVar.t, null, new n65[0], 3).b(g.a).equals(xw91.C) && g.b()) {
                    return true;
                }
            } else if (i != 3) {
                w511.b();
                return false;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        lv90 a;
        return "composite_payment.enabled".equals(str) && (a = this.a.a.a.a()) != null && a.a().a() == PaymentMethod$Type.PERSONAL_WALLET;
    }
}
