package com.squareup.cash.onboarding.backend;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class OnboardingFlowTokenManager$FlowToken {
    public final boolean completedAliasVerification;
    public final String value;

    public OnboardingFlowTokenManager$FlowToken(String str, boolean z) {
        this.value = str;
        this.completedAliasVerification = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingFlowTokenManager$FlowToken)) {
            return false;
        }
        OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) obj;
        return this.value.equals(onboardingFlowTokenManager$FlowToken.value) && this.completedAliasVerification == onboardingFlowTokenManager$FlowToken.completedAliasVerification;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.completedAliasVerification) + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("FlowToken(value=", this.value, ", completedAliasVerification=", ")", this.completedAliasVerification);
    }
}
