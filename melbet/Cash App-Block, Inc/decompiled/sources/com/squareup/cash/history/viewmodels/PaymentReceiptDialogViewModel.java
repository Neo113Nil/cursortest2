package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentReceiptDialogViewModel {
    public final String content;
    public final String dismissButtonLabel;
    public final String title;

    public PaymentReceiptDialogViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.content = str2;
        this.dismissButtonLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentReceiptDialogViewModel)) {
            return false;
        }
        PaymentReceiptDialogViewModel paymentReceiptDialogViewModel = (PaymentReceiptDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, paymentReceiptDialogViewModel.title) && Intrinsics.areEqual(this.content, paymentReceiptDialogViewModel.content) && Intrinsics.areEqual(this.dismissButtonLabel, paymentReceiptDialogViewModel.dismissButtonLabel);
    }

    public final int hashCode() {
        String str = this.title;
        return this.dismissButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.content);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentReceiptDialogViewModel(title=", this.title, ", content=", this.content, ", dismissButtonLabel="), this.dismissButtonLabel, ")");
    }
}
