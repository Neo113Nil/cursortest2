package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedGooglePayMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class ygq0 implements whq0 {
    @Override // defpackage.whq0
    public final boolean matches(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        String methodType = selectedPaymentMethodPayload.getMethodType();
        return jl40.l(methodType != null ? methodType.toLowerCase(Locale.ROOT) : null, "google_pay");
    }

    @Override // defpackage.whq0
    public final Parcelable toParcelable(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        if (matches(selectedPaymentMethodPayload)) {
            return new SelectedGooglePayMethod(((xgq0) selectedPaymentMethodPayload.decoded(xgq0.Companion.serializer())).a);
        }
        return null;
    }
}
