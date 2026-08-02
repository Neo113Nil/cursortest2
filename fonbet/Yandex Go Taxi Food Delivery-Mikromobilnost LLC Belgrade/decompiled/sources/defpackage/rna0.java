package defpackage;

import com.yandex.go.places.impl.ui.payments.processing.PaymentsProcessingModalView;
import com.yandex.go.places.models.domain.entities.PaymentProcessingState;

/* loaded from: classes13.dex */
public final class rna0 implements wna0 {
    public final /* synthetic */ PaymentsProcessingModalView a;

    public rna0(PaymentsProcessingModalView paymentsProcessingModalView) {
        this.a = paymentsProcessingModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        PaymentsProcessingModalView paymentsProcessingModalView = this.a;
        sna0 access$getBinding = PaymentsProcessingModalView.access$getBinding(paymentsProcessingModalView);
        if (((PaymentProcessingState) ((nw70) obj).b) == PaymentProcessingState.SUCCESS) {
            access$getBinding.c.clearAnimation();
            cma1.M(access$getBinding.c);
            cma1.J(access$getBinding.d);
            access$getBinding.b.setText(paymentsProcessingModalView.getContext().getString(kyh0.discovery_payments_processing_success_text));
        }
    }
}
