package com.squareup.cash.payments.backend.api;

import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.util.coroutines.StateFlowKt;

/* loaded from: classes.dex */
public interface PaymentManager {
    static void showProfile$default(PaymentManager paymentManager, String str, String str2, String str3, String str4) {
        str.getClass();
        StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager).paymentActions, new PaymentAction.ShowProfile(str, str2, str3, str4, false, false));
    }
}
