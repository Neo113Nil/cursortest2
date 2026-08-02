package com.squareup.cash.cdf.earnings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsOnboardingDismiss implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final OnboardingScreen screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class OnboardingScreen {
        public static final /* synthetic */ OnboardingScreen[] $VALUES;
        public static final OnboardingScreen CATEGORY_PICKER;
        public static final OnboardingScreen CATEGORY_SELECTION;
        public static final OnboardingScreen SUCCESS;
        public static final OnboardingScreen UPSELL;

        static {
            OnboardingScreen onboardingScreen = new OnboardingScreen("UPSELL", 0);
            UPSELL = onboardingScreen;
            OnboardingScreen onboardingScreen2 = new OnboardingScreen("CATEGORY_SELECTION", 1);
            CATEGORY_SELECTION = onboardingScreen2;
            OnboardingScreen onboardingScreen3 = new OnboardingScreen("CATEGORY_PICKER", 2);
            CATEGORY_PICKER = onboardingScreen3;
            OnboardingScreen onboardingScreen4 = new OnboardingScreen("SUCCESS", 3);
            SUCCESS = onboardingScreen4;
            $VALUES = new OnboardingScreen[]{onboardingScreen, onboardingScreen2, onboardingScreen3, onboardingScreen4};
        }

        public static OnboardingScreen valueOf(String str) {
            return (OnboardingScreen) Enum.valueOf(OnboardingScreen.class, str);
        }

        public static OnboardingScreen[] values() {
            return (OnboardingScreen[]) $VALUES.clone();
        }
    }

    public EarningsOnboardingDismiss(String str, OnboardingScreen onboardingScreen) {
        str.getClass();
        this.flow_token = str;
        this.screen = onboardingScreen;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Earnings", "cdf_action", "Onboarding");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "screen", onboardingScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsOnboardingDismiss)) {
            return false;
        }
        EarningsOnboardingDismiss earningsOnboardingDismiss = (EarningsOnboardingDismiss) obj;
        return Intrinsics.areEqual(this.flow_token, earningsOnboardingDismiss.flow_token) && this.screen == earningsOnboardingDismiss.screen;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings Onboarding Dismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.screen.hashCode() + (this.flow_token.hashCode() * 31);
    }

    public final String toString() {
        return "EarningsOnboardingDismiss(flow_token=" + this.flow_token + ", screen=" + this.screen + ")";
    }
}
