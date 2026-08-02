package com.squareup.cash.payments.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmRetryResourceDialog implements DialogViewModel {
    public final String message;
    public final String negativeButtonText;
    public final String positiveButtonText;
    public final String title;

    public ConfirmRetryResourceDialog(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmRetryResourceDialog)) {
            return false;
        }
        ConfirmRetryResourceDialog confirmRetryResourceDialog = (ConfirmRetryResourceDialog) obj;
        return Intrinsics.areEqual(this.title, confirmRetryResourceDialog.title) && Intrinsics.areEqual(this.message, confirmRetryResourceDialog.message) && Intrinsics.areEqual(this.positiveButtonText, confirmRetryResourceDialog.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, confirmRetryResourceDialog.negativeButtonText);
    }

    @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.negativeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmRetryResourceDialog(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }
}
