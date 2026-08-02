package com.squareup.cash.blockers.presenters;

import com.squareup.cash.cdf.earnings.EarningsOnboardingDismiss;
import com.squareup.cash.integration.analytics.Analytics;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class EarnerOnboardingAnalytics {
    public final Analytics analytics;

    public EarnerOnboardingAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public final void trackDismiss(String str, EarnerOnboardingScreen earnerOnboardingScreen) {
        EarningsOnboardingDismiss.OnboardingScreen onboardingScreen;
        str.getClass();
        int ordinal = earnerOnboardingScreen.ordinal();
        if (ordinal == 0) {
            onboardingScreen = EarningsOnboardingDismiss.OnboardingScreen.UPSELL;
        } else if (ordinal == 1) {
            onboardingScreen = EarningsOnboardingDismiss.OnboardingScreen.CATEGORY_SELECTION;
        } else if (ordinal == 2) {
            onboardingScreen = EarningsOnboardingDismiss.OnboardingScreen.CATEGORY_PICKER;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            onboardingScreen = EarningsOnboardingDismiss.OnboardingScreen.SUCCESS;
        }
        this.analytics.track(new EarningsOnboardingDismiss(str, onboardingScreen), null);
    }
}
