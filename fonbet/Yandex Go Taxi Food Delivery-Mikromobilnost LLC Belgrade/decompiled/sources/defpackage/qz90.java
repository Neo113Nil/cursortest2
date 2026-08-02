package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qz90 {
    public final omm0 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public sz90 f;
    public final ArrayList g = new ArrayList();

    public qz90(PlusPayCompositeOffers.Offer offer, omm0 omm0Var) {
        this.a = omm0Var;
    }

    public final void a(PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction) {
        this.g.add(paymentErrorButtonContent$ClickAction);
    }

    public final void b(String str) {
        this.d = str;
        this.e = this.a.b(zyh0.PlusPay_Error_ErrorCode_Accessibility, str);
    }

    public final mz90 c(PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction) {
        String a;
        int i = pz90.a[paymentErrorButtonContent$ClickAction.ordinal()];
        omm0 omm0Var = this.a;
        if (i == 1) {
            a = omm0Var.a(zyh0.PlusPay_Error_Unknown_Button);
        } else if (i == 2) {
            a = omm0Var.a(zyh0.PlusPay_Error_Button_Retry);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            a = omm0Var.a(zyh0.PlusPay_Error_Button_ChangeCard);
        }
        return new mz90(a, paymentErrorButtonContent$ClickAction);
    }

    public final void d(int i) {
        this.c = this.a.a(i);
    }

    public final void e(int i) {
        this.b = this.a.a(i);
    }
}
