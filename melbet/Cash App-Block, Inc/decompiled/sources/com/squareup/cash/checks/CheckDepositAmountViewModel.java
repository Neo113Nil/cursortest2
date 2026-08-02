package com.squareup.cash.checks;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CheckDepositAmountViewModel {
    public final String body;
    public final int maxWholeDigits;
    public final boolean primaryButtonEnabled;
    public final String primaryButtonText;
    public final String title;

    public CheckDepositAmountViewModel(int i, String str, String str2, String str3, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.primaryButtonEnabled = z;
        this.primaryButtonText = str3;
        this.maxWholeDigits = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDepositAmountViewModel)) {
            return false;
        }
        CheckDepositAmountViewModel checkDepositAmountViewModel = (CheckDepositAmountViewModel) obj;
        return Intrinsics.areEqual(this.title, checkDepositAmountViewModel.title) && Intrinsics.areEqual(this.body, checkDepositAmountViewModel.body) && this.primaryButtonEnabled == checkDepositAmountViewModel.primaryButtonEnabled && Intrinsics.areEqual(this.primaryButtonText, checkDepositAmountViewModel.primaryButtonText) && this.maxWholeDigits == checkDepositAmountViewModel.maxWholeDigits;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxWholeDigits) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.primaryButtonEnabled), 31, this.primaryButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CheckDepositAmountViewModel(title=", this.title, ", body=", this.body, ", primaryButtonEnabled=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.primaryButtonEnabled, ", primaryButtonText=", this.primaryButtonText, ", maxWholeDigits=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxWholeDigits, ")", m);
    }
}
