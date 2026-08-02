package com.squareup.cash.banking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ConfirmCashOutDialogViewModel {
    public final String message;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public ConfirmCashOutDialogViewModel(String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.title = str;
        this.message = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmCashOutDialogViewModel)) {
            return false;
        }
        ConfirmCashOutDialogViewModel confirmCashOutDialogViewModel = (ConfirmCashOutDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, confirmCashOutDialogViewModel.title) && this.message.equals(confirmCashOutDialogViewModel.message) && Intrinsics.areEqual(this.primaryButtonText, confirmCashOutDialogViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, confirmCashOutDialogViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.secondaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message), 31, this.primaryButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmCashOutDialogViewModel(title=", this.title, ", message=", this.message, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
    }
}
