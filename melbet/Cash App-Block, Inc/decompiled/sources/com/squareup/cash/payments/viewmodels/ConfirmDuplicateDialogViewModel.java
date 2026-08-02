package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmDuplicateDialogViewModel {
    public final String message;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public ConfirmDuplicateDialogViewModel(String str, String str2, String str3, String str4) {
        this.title = str;
        this.message = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmDuplicateDialogViewModel)) {
            return false;
        }
        ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel = (ConfirmDuplicateDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, confirmDuplicateDialogViewModel.title) && Intrinsics.areEqual(this.message, confirmDuplicateDialogViewModel.message) && Intrinsics.areEqual(this.primaryButtonText, confirmDuplicateDialogViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, confirmDuplicateDialogViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryButtonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonText;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmDuplicateDialogViewModel(title=", this.title, ", message=", this.message, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
    }
}
