package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PersonalInfoConfirmationViewModel {
    public final String primaryButtonText;
    public final String subtitle;
    public final String title;

    public PersonalInfoConfirmationViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.subtitle = str2;
        this.primaryButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalInfoConfirmationViewModel)) {
            return false;
        }
        PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel = (PersonalInfoConfirmationViewModel) obj;
        return Intrinsics.areEqual(this.title, personalInfoConfirmationViewModel.title) && Intrinsics.areEqual(this.subtitle, personalInfoConfirmationViewModel.subtitle) && Intrinsics.areEqual(this.primaryButtonText, personalInfoConfirmationViewModel.primaryButtonText);
    }

    public final int hashCode() {
        return this.primaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PersonalInfoConfirmationViewModel(title=", this.title, ", subtitle=", this.subtitle, ", primaryButtonText="), this.primaryButtonText, ")");
    }
}
