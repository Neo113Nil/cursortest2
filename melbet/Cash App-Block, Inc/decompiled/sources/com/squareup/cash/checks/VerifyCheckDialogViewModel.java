package com.squareup.cash.checks;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class VerifyCheckDialogViewModel {
    public final String message;
    public final String negativeLabel;
    public final String positiveLabel;
    public final String title;

    public VerifyCheckDialogViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.positiveLabel = str3;
        this.negativeLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCheckDialogViewModel)) {
            return false;
        }
        VerifyCheckDialogViewModel verifyCheckDialogViewModel = (VerifyCheckDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, verifyCheckDialogViewModel.title) && Intrinsics.areEqual(this.message, verifyCheckDialogViewModel.message) && Intrinsics.areEqual(this.positiveLabel, verifyCheckDialogViewModel.positiveLabel) && Intrinsics.areEqual(this.negativeLabel, verifyCheckDialogViewModel.negativeLabel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveLabel);
        String str = this.negativeLabel;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VerifyCheckDialogViewModel(title=", this.title, ", message=", this.message, ", positiveLabel="), this.positiveLabel, ", negativeLabel=", this.negativeLabel, ")");
    }
}
