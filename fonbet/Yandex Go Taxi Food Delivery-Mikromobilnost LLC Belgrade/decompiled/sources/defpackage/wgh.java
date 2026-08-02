package defpackage;

import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class wgh implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zgh b;

    public /* synthetic */ wgh(zgh zghVar, int i) {
        this.a = i;
        this.b = zghVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zgh zghVar = this.b;
        qz90 qz90Var = (qz90) obj;
        switch (i) {
            case 0:
                qz90Var.e(zyh0.PlusPay_Error_Unknown_Title_New);
                qz90Var.d(zyh0.PlusPay_Error_Unknown_Subtitle_New);
                qz90Var.f = zghVar.b(zyh0.PlusPay_Error_Unknown_Expandable_Title, zyh0.PlusPay_Error_Unknown_Expandable_Text);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var.b("P000");
                break;
            case 1:
                qz90Var.e(zyh0.PlusPay_Error_Unknown_Title_New);
                qz90Var.d(zyh0.PlusPay_Error_Unknown_Subtitle_New);
                qz90Var.f = zghVar.b(zyh0.PlusPay_Error_Unknown_Expandable_Title, zyh0.PlusPay_Error_Unknown_Expandable_Text);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var.b("P023");
                break;
            case 2:
                qz90Var.e(zyh0.PlusPay_Error_Unknown_Title_New);
                qz90Var.d(zyh0.PlusPay_Error_Unknown_Subtitle_New);
                qz90Var.f = zghVar.b(zyh0.PlusPay_Error_Unknown_Expandable_Title, zyh0.PlusPay_Error_Unknown_Expandable_Text);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var.b("P011");
                break;
            default:
                qz90Var.e(zyh0.PlusPay_Error_NotEnoughFunds_Title);
                qz90Var.d(zyh0.PlusPay_Error_NotEnoughFunds_Subtitle);
                qz90Var.f = zghVar.b(zyh0.PlusPay_Error_NotEnoughFunds_Expandable_Title, zyh0.PlusPay_Error_NotEnoughFunds_Expandable_Text);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var.b("P010");
                break;
        }
        return zy11Var;
    }
}
