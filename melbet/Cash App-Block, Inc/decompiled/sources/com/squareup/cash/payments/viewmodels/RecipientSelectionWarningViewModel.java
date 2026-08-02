package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecipientSelectionWarningViewModel {
    public final String message;
    public final String positiveButtonText;
    public final String title;

    public RecipientSelectionWarningViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSelectionWarningViewModel)) {
            return false;
        }
        RecipientSelectionWarningViewModel recipientSelectionWarningViewModel = (RecipientSelectionWarningViewModel) obj;
        return Intrinsics.areEqual(this.title, recipientSelectionWarningViewModel.title) && Intrinsics.areEqual(this.message, recipientSelectionWarningViewModel.message) && Intrinsics.areEqual(this.positiveButtonText, recipientSelectionWarningViewModel.positiveButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.positiveButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecipientSelectionWarningViewModel(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ")");
    }
}
