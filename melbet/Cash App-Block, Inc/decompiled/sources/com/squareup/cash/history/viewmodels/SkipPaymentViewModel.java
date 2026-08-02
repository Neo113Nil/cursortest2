package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SkipPaymentViewModel {
    public final String message;

    public SkipPaymentViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkipPaymentViewModel) && Intrinsics.areEqual(this.message, ((SkipPaymentViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SkipPaymentViewModel(message=", this.message, ")");
    }
}
