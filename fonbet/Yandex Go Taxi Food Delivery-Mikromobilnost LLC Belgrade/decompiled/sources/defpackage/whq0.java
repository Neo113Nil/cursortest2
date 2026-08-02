package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;

/* loaded from: classes12.dex */
public interface whq0 {
    boolean matches(SelectedPaymentMethodPayload selectedPaymentMethodPayload);

    Parcelable toParcelable(SelectedPaymentMethodPayload selectedPaymentMethodPayload);
}
