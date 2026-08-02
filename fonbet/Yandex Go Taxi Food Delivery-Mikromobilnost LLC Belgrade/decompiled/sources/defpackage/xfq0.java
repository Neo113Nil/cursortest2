package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.BankName;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.PaymentSystemName;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedCardMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class xfq0 implements whq0 {
    @Override // defpackage.whq0
    public final boolean matches(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        String methodType = selectedPaymentMethodPayload.getMethodType();
        return jl40.l(methodType != null ? methodType.toLowerCase(Locale.ROOT) : null, "card");
    }

    @Override // defpackage.whq0
    public final Parcelable toParcelable(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        BankName bankName;
        PaymentSystemName paymentSystemName;
        if (!matches(selectedPaymentMethodPayload)) {
            return null;
        }
        wfq0 wfq0Var = (wfq0) selectedPaymentMethodPayload.decoded(wfq0.Companion.serializer());
        String str = wfq0Var.b;
        if (str != null) {
            bankName = new BankName(str);
        } else {
            BankName.Companion.getClass();
            bankName = BankName.unknownBank;
        }
        String str2 = wfq0Var.a;
        String str3 = wfq0Var.c;
        if (str3 != null) {
            paymentSystemName = new PaymentSystemName(str3);
        } else {
            PaymentSystemName.Companion.getClass();
            paymentSystemName = PaymentSystemName.unknown;
        }
        return new SelectedCardMethod(bankName, str2, paymentSystemName, wfq0Var.d);
    }
}
