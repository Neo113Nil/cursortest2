package com.squareup.cash.payments.backend.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentActionComplete {
    public final PaymentAction action;
    public final PaymentActionResult result;

    public PaymentActionComplete(PaymentAction paymentAction, PaymentActionResult paymentActionResult) {
        paymentAction.getClass();
        this.action = paymentAction;
        this.result = paymentActionResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentActionComplete)) {
            return false;
        }
        PaymentActionComplete paymentActionComplete = (PaymentActionComplete) obj;
        return Intrinsics.areEqual(this.action, paymentActionComplete.action) && Intrinsics.areEqual(this.result, paymentActionComplete.result);
    }

    public final PaymentAction getAction() {
        return this.action;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        PaymentActionResult paymentActionResult = this.result;
        return hashCode + (paymentActionResult == null ? 0 : paymentActionResult.hashCode());
    }

    public final String toString() {
        return "PaymentActionComplete(action=" + this.action + ", result=" + this.result + ")";
    }
}
