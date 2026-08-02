package com.squareup.cash.shopping.sup.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SingleUsePaymentCancelPlanDialogViewModel {
    public final String message;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public SingleUsePaymentCancelPlanDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentCancelPlanDialogViewModel)) {
            return false;
        }
        SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel = (SingleUsePaymentCancelPlanDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, singleUsePaymentCancelPlanDialogViewModel.title) && Intrinsics.areEqual(this.message, singleUsePaymentCancelPlanDialogViewModel.message) && Intrinsics.areEqual(this.primaryButtonText, singleUsePaymentCancelPlanDialogViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, singleUsePaymentCancelPlanDialogViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        return this.secondaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.primaryButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SingleUsePaymentCancelPlanDialogViewModel(title=", this.title, ", message=", this.message, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
    }
}
