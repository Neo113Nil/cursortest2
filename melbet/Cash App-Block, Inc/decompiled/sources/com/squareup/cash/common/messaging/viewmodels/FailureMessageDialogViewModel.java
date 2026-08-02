package com.squareup.cash.common.messaging.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FailureMessageDialogViewModel {
    public final String dismissButtonText;
    public final String message;
    public final String title;

    public FailureMessageDialogViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.message = str2;
        this.dismissButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureMessageDialogViewModel)) {
            return false;
        }
        FailureMessageDialogViewModel failureMessageDialogViewModel = (FailureMessageDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, failureMessageDialogViewModel.title) && Intrinsics.areEqual(this.message, failureMessageDialogViewModel.message) && Intrinsics.areEqual(this.dismissButtonText, failureMessageDialogViewModel.dismissButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.dismissButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FailureMessageDialogViewModel(title=", this.title, ", message=", this.message, ", dismissButtonText="), this.dismissButtonText, ")");
    }
}
