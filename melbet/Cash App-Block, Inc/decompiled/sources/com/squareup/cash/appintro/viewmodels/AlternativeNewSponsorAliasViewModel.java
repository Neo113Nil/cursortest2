package com.squareup.cash.appintro.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class AlternativeNewSponsorAliasViewModel {
    public final String continueButtonLabel;
    public final String dismissButtonLabel;
    public final String message;
    public final String title;

    public AlternativeNewSponsorAliasViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.continueButtonLabel = str3;
        this.dismissButtonLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlternativeNewSponsorAliasViewModel)) {
            return false;
        }
        AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel = (AlternativeNewSponsorAliasViewModel) obj;
        return Intrinsics.areEqual(this.title, alternativeNewSponsorAliasViewModel.title) && Intrinsics.areEqual(this.message, alternativeNewSponsorAliasViewModel.message) && Intrinsics.areEqual(this.continueButtonLabel, alternativeNewSponsorAliasViewModel.continueButtonLabel) && Intrinsics.areEqual(this.dismissButtonLabel, alternativeNewSponsorAliasViewModel.dismissButtonLabel);
    }

    public final int hashCode() {
        return this.dismissButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.continueButtonLabel);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AlternativeNewSponsorAliasViewModel(title=", this.title, ", message=", this.message, ", continueButtonLabel="), this.continueButtonLabel, ", dismissButtonLabel=", this.dismissButtonLabel, ")");
    }
}
