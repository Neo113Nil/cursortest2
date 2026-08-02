package com.squareup.cash.history.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CancelPendingSupPaymentViewModel {
    public final String body;
    public final boolean isLoading;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public CancelPendingSupPaymentViewModel(String str, String str2, String str3, String str4, boolean z) {
        this.isLoading = z;
        this.title = str;
        this.body = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelPendingSupPaymentViewModel)) {
            return false;
        }
        CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel = (CancelPendingSupPaymentViewModel) obj;
        return this.isLoading == cancelPendingSupPaymentViewModel.isLoading && Intrinsics.areEqual(this.title, cancelPendingSupPaymentViewModel.title) && Intrinsics.areEqual(this.body, cancelPendingSupPaymentViewModel.body) && Intrinsics.areEqual(this.primaryButtonText, cancelPendingSupPaymentViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, cancelPendingSupPaymentViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryButtonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonText;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("CancelPendingSupPaymentViewModel(isLoading=", ", title=", this.title, ", body=", this.isLoading);
        Boxes$$ExternalSyntheticOutline1.m(m, this.body, ", primaryButtonText=", this.primaryButtonText, ", secondaryButtonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.secondaryButtonText, ")");
    }
}
