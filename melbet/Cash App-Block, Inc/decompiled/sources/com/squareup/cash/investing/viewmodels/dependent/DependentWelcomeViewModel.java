package com.squareup.cash.investing.viewmodels.dependent;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentWelcomeViewModel {
    public final String ctaLabel;
    public final String subTitle;
    public final String title;
    public final String toolbarTitle;

    public DependentWelcomeViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.toolbarTitle = str;
        this.title = str2;
        this.subTitle = str3;
        this.ctaLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentWelcomeViewModel)) {
            return false;
        }
        DependentWelcomeViewModel dependentWelcomeViewModel = (DependentWelcomeViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, dependentWelcomeViewModel.toolbarTitle) && Intrinsics.areEqual(this.title, dependentWelcomeViewModel.title) && Intrinsics.areEqual(this.subTitle, dependentWelcomeViewModel.subTitle) && Intrinsics.areEqual(this.ctaLabel, dependentWelcomeViewModel.ctaLabel);
    }

    public final int hashCode() {
        return this.ctaLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toolbarTitle.hashCode() * 31, 31, this.title), 31, this.subTitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentWelcomeViewModel(toolbarTitle=", this.toolbarTitle, ", title=", this.title, ", subTitle="), this.subTitle, ", ctaLabel=", this.ctaLabel, ")");
    }
}
