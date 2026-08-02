package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ConfirmableOptionViewModel {
    public final String message;
    public final String negativeButtonText;
    public final String positiveButtonText;
    public final String title;

    public ConfirmableOptionViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmableOptionViewModel)) {
            return false;
        }
        ConfirmableOptionViewModel confirmableOptionViewModel = (ConfirmableOptionViewModel) obj;
        return Intrinsics.areEqual(this.title, confirmableOptionViewModel.title) && Intrinsics.areEqual(this.message, confirmableOptionViewModel.message) && Intrinsics.areEqual(this.positiveButtonText, confirmableOptionViewModel.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, confirmableOptionViewModel.negativeButtonText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonText);
        String str = this.negativeButtonText;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmableOptionViewModel(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }
}
