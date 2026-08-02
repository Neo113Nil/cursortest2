package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;

/* loaded from: classes5.dex */
public abstract class RealAfterpayEligibleRetroTransactionsProviderKt {
    public static final PaymentHistoryInputsRow access$getPaymentHistoryInputsRow(ActivityRow.Body body) {
        ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow = body instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body : null;
        if (paymentHistoryInputsRow != null) {
            return paymentHistoryInputsRow.getValue();
        }
        return null;
    }
}
