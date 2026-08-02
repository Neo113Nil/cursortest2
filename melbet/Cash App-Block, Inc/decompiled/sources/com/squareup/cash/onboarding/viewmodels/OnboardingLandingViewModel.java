package com.squareup.cash.onboarding.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OnboardingLandingViewModel {
    public final String ctaText;
    public final String placeholderImageUrl;
    public final String tagline;
    public final String videoUrl;

    public OnboardingLandingViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.tagline = str;
        this.ctaText = str2;
        this.placeholderImageUrl = str3;
        this.videoUrl = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingLandingViewModel)) {
            return false;
        }
        OnboardingLandingViewModel onboardingLandingViewModel = (OnboardingLandingViewModel) obj;
        return Intrinsics.areEqual(this.tagline, onboardingLandingViewModel.tagline) && Intrinsics.areEqual(this.ctaText, onboardingLandingViewModel.ctaText) && Intrinsics.areEqual(this.placeholderImageUrl, onboardingLandingViewModel.placeholderImageUrl) && Intrinsics.areEqual(this.videoUrl, onboardingLandingViewModel.videoUrl);
    }

    public final int hashCode() {
        return this.videoUrl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tagline.hashCode() * 31, 31, this.ctaText), 31, this.placeholderImageUrl);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnboardingLandingViewModel(tagline=", this.tagline, ", ctaText=", this.ctaText, ", placeholderImageUrl="), this.placeholderImageUrl, ", videoUrl=", this.videoUrl, ")");
    }
}
