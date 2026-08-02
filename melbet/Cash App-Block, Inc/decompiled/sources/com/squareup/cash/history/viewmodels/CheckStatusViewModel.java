package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CheckStatusViewModel {
    public final String cancelPaymentButtonLabel;
    public final String message;
    public final String title;

    public CheckStatusViewModel(String str, String str2, String str3) {
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.cancelPaymentButtonLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckStatusViewModel)) {
            return false;
        }
        CheckStatusViewModel checkStatusViewModel = (CheckStatusViewModel) obj;
        return Intrinsics.areEqual(this.title, checkStatusViewModel.title) && Intrinsics.areEqual(this.message, checkStatusViewModel.message) && Intrinsics.areEqual(this.cancelPaymentButtonLabel, checkStatusViewModel.cancelPaymentButtonLabel);
    }

    public final int hashCode() {
        String str = this.title;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.cancelPaymentButtonLabel;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CheckStatusViewModel(title=", this.title, ", message=", this.message, ", cancelPaymentButtonLabel="), this.cancelPaymentButtonLabel, ")");
    }
}
