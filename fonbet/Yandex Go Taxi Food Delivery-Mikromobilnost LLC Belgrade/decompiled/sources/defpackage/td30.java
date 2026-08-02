package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

/* loaded from: classes6.dex */
public final /* synthetic */ class td30 implements b57 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MtCheckoutModalView b;
    public final /* synthetic */ ld30 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ td30(MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var, int i, Object obj) {
        this.a = i;
        this.b = mtCheckoutModalView;
        this.w = obj;
        this.c = ld30Var;
    }

    @Override // defpackage.b57
    public final void a(zy6 zy6Var) {
        int i = this.a;
        ld30 ld30Var = this.c;
        Object obj = this.w;
        MtCheckoutModalView mtCheckoutModalView = this.b;
        switch (i) {
            case 0:
                MtCheckoutModalView.renderSuccessCheckoutPaymentState$lambda$3$0(mtCheckoutModalView, (CheckoutUIState$PaymentCheckoutUIState) obj, ld30Var, (jr30) zy6Var);
                break;
            default:
                MtCheckoutModalView.renderPrice$lambda$0$0(mtCheckoutModalView, (u0f0) obj, ld30Var, (jr30) zy6Var);
                break;
        }
    }
}
