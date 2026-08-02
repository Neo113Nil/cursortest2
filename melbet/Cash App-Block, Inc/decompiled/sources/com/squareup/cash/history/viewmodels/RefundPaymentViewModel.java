package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class RefundPaymentViewModel {
    public final String message;

    public RefundPaymentViewModel(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefundPaymentViewModel) && this.message.equals(((RefundPaymentViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RefundPaymentViewModel(message=", this.message, ")");
    }
}
