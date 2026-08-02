package defpackage;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.shared.details.experiments.d;
import ru.yandex.taxi.altpins.router.a;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class qw1 extends v96 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ qw1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.v96
    public final boolean b() {
        switch (this.a) {
            case 0:
                iw1 iw1Var = (iw1) this.c;
                if (iw1Var.a.a.Z && iw1Var.b.g() != null && !iw1Var.c.a && !((ro0) this.e).a()) {
                    ((pep0) ((oep0) this.f)).f(new pw1(0, (a) ((t0g) this.d).get(), new d4(27, this)), zy11.a, hxx.a);
                    break;
                } else {
                    break;
                }
            default:
                if (((d) ((m2s) this.f)).a().b && ((g) this.d).a.Mg()) {
                    lv90 c = ((dqe0) this.c).a.c();
                    if (c.a().a() == PaymentMethod$Type.SHARED) {
                        c cVar = (c) ((cda0) this.b);
                        SharedAccount o = cVar.g.o(c.b);
                        snr0 l = o != null ? cVar.o.l(o) : null;
                        if (l != null && l.c == SharedAccountType.FAMILY && jl40.l(l.h.c, Boolean.TRUE)) {
                            d dVar = (d) ((m2s) this.f);
                            ForceZaloginForFamilyExperiment a = dVar.a();
                            ForceZaloginForFamilyExperiment.Screen c2 = a.c(a.d.a);
                            mbp b = c2 != null ? dVar.b(c2) : null;
                            if (b != null) {
                                ((ru.yandex.taxi.sharedpayments.c) ((h3y) this.e).get()).c(SharedPaymentContext.ORDER, b, new qpo(1, this, l));
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }
}
