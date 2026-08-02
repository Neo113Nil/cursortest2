package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ConfirmReplaceInfoViewModel {
    public final String infoText;
    public final String primaryButtonText;
    public final String secondaryButtonText;

    public ConfirmReplaceInfoViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.infoText = str;
        this.primaryButtonText = str2;
        this.secondaryButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmReplaceInfoViewModel)) {
            return false;
        }
        ConfirmReplaceInfoViewModel confirmReplaceInfoViewModel = (ConfirmReplaceInfoViewModel) obj;
        return Intrinsics.areEqual(this.infoText, confirmReplaceInfoViewModel.infoText) && Intrinsics.areEqual(this.primaryButtonText, confirmReplaceInfoViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, confirmReplaceInfoViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        return this.secondaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.infoText.hashCode() * 31, 31, this.primaryButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmReplaceInfoViewModel(infoText=", this.infoText, ", primaryButtonText=", this.primaryButtonText, ", secondaryButtonText="), this.secondaryButtonText, ")");
    }
}
