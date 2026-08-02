package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationType;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.payments.paymentlist.details.c;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class s4a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PaymentMethodDetailsModalView b;
    public final /* synthetic */ fl8 c;

    public /* synthetic */ s4a0(PaymentMethodDetailsModalView paymentMethodDetailsModalView, fl8 fl8Var, int i) {
        this.a = i;
        this.b = paymentMethodDetailsModalView;
        this.c = fl8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        c cVar2;
        int i = this.a;
        fl8 fl8Var = this.c;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.b;
        switch (i) {
            case 0:
                cVar = paymentMethodDetailsModalView.paymentMethodDetailsPresenter;
                y4a0 y4a0Var = cVar.C;
                z4a0 z4a0Var = (z4a0) y4a0Var.c;
                m950 m950Var = (m950) z4a0Var.L.get();
                v4a0 v4a0Var = (v4a0) y4a0Var.b;
                z4a0Var.A(m950Var, new ahs(fl8Var, v4a0Var.b, v4a0Var.c), new x4a0(z4a0Var, fl8Var, 0));
                break;
            default:
                cVar2 = paymentMethodDetailsModalView.paymentMethodDetailsPresenter;
                y4a0 y4a0Var2 = cVar2.C;
                z4a0 z4a0Var2 = (z4a0) y4a0Var2.c;
                g9a0 g9a0Var = z4a0Var2.F;
                PaymentMethodsAnalytics$PaymentMethodsScreen i2 = xe91.i(((v4a0) y4a0Var2.b).b);
                fl8Var.getClass();
                g9a0.l(g9a0Var, i2, PaymentMethod$Type.CARD.getCode(), PaymentMethodsAnalytics$VerificationType.Standard23ds);
                z4a0Var2.A((m950) z4a0Var2.G.get(), z4a0Var2.H.d(fl8Var), new eb0(2, y4a0Var2));
                break;
        }
    }
}
