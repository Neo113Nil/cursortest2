package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class StablecoinOnboardingViewModel {
    public final String body;
    public final String buttonLabel;
    public final String title;

    public StablecoinOnboardingViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.buttonLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinOnboardingViewModel)) {
            return false;
        }
        StablecoinOnboardingViewModel stablecoinOnboardingViewModel = (StablecoinOnboardingViewModel) obj;
        return Intrinsics.areEqual(this.title, stablecoinOnboardingViewModel.title) && Intrinsics.areEqual(this.body, stablecoinOnboardingViewModel.body) && Intrinsics.areEqual(this.buttonLabel, stablecoinOnboardingViewModel.buttonLabel);
    }

    public final int hashCode() {
        return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StablecoinOnboardingViewModel(title=", this.title, ", body=", this.body, ", buttonLabel="), this.buttonLabel, ")");
    }
}
