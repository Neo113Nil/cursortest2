package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class vd30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MtCheckoutModalView b;
    public final /* synthetic */ ld30 c;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    public /* synthetic */ vd30(MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = mtCheckoutModalView;
        this.c = ld30Var;
        this.w = str;
        this.x = str2;
        this.y = str3;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderPaymentInfoView$lambda$0$0;
        zy11 renderUndefinedInfoView$lambda$0$0;
        int i = this.a;
        String str = this.y;
        String str2 = this.x;
        String str3 = this.w;
        ld30 ld30Var = this.c;
        MtCheckoutModalView mtCheckoutModalView = this.b;
        switch (i) {
            case 0:
                renderPaymentInfoView$lambda$0$0 = MtCheckoutModalView.renderPaymentInfoView$lambda$0$0(mtCheckoutModalView, ld30Var, str3, str2, str);
                return renderPaymentInfoView$lambda$0$0;
            default:
                renderUndefinedInfoView$lambda$0$0 = MtCheckoutModalView.renderUndefinedInfoView$lambda$0$0(mtCheckoutModalView, ld30Var, str3, str2, str);
                return renderUndefinedInfoView$lambda$0$0;
        }
    }
}
