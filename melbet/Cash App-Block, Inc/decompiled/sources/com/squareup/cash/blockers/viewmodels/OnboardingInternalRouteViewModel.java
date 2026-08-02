package com.squareup.cash.blockers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class OnboardingInternalRouteViewModel {
    public final String errorBody;
    public final String errorButton;
    public final String errorTitle;
    public final boolean loading;

    public OnboardingInternalRouteViewModel(boolean z, String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.loading = z;
        this.errorTitle = str;
        this.errorBody = str2;
        this.errorButton = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingInternalRouteViewModel)) {
            return false;
        }
        OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) obj;
        return this.loading == onboardingInternalRouteViewModel.loading && Intrinsics.areEqual(this.errorTitle, onboardingInternalRouteViewModel.errorTitle) && Intrinsics.areEqual(this.errorBody, onboardingInternalRouteViewModel.errorBody) && Intrinsics.areEqual(this.errorButton, onboardingInternalRouteViewModel.errorButton);
    }

    public final int hashCode() {
        return this.errorButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.loading) * 31, 31, this.errorTitle), 31, this.errorBody);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("OnboardingInternalRouteViewModel(loading=", ", errorTitle=", this.errorTitle, ", errorBody=", this.loading), this.errorBody, ", errorButton=", this.errorButton, ")");
    }
}
