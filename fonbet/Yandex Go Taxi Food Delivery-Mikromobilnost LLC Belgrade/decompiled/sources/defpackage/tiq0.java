package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedSbpTokenMethod;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class tiq0 implements whq0 {
    @Override // defpackage.whq0
    public final boolean matches(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        String methodType = selectedPaymentMethodPayload.getMethodType();
        return jl40.l(methodType != null ? methodType.toLowerCase(Locale.ROOT) : null, "sbp_token");
    }

    @Override // defpackage.whq0
    public final Parcelable toParcelable(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        if (!matches(selectedPaymentMethodPayload)) {
            return null;
        }
        siq0 siq0Var = (siq0) selectedPaymentMethodPayload.decoded(siq0.Companion.serializer());
        return new SelectedSbpTokenMethod(siq0Var.b, siq0Var.c, siq0Var.a);
    }
}
