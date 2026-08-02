package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CancelPaymentViewModel {
    public final String message;

    public CancelPaymentViewModel(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelPaymentViewModel) && Intrinsics.areEqual(this.message, ((CancelPaymentViewModel) obj).message);
    }

    public final int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelPaymentViewModel(message=", this.message, ")");
    }
}
