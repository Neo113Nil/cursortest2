package com.squareup.cash.initialscreenloader.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppUpgradeViewModel {
    public final String message;
    public final String negativeButtonText;
    public final String positiveButtonText;
    public final String secondaryButtonText;
    public final String title;

    public AppUpgradeViewModel(String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
        this.secondaryButtonText = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUpgradeViewModel)) {
            return false;
        }
        AppUpgradeViewModel appUpgradeViewModel = (AppUpgradeViewModel) obj;
        return Intrinsics.areEqual(this.title, appUpgradeViewModel.title) && Intrinsics.areEqual(this.message, appUpgradeViewModel.message) && Intrinsics.areEqual(this.positiveButtonText, appUpgradeViewModel.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, appUpgradeViewModel.negativeButtonText) && Intrinsics.areEqual(this.secondaryButtonText, appUpgradeViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.positiveButtonText);
        String str3 = this.negativeButtonText;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonText;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppUpgradeViewModel(title=", this.title, ", message=", this.message, ", positiveButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ", secondaryButtonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.secondaryButtonText, ")");
    }
}
