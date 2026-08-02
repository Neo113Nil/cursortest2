package com.squareup.cash.overrides;

import app.cash.broadway.navigation.ScreenOverrideRule;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Source;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.session.backend.SessionManager;

/* loaded from: classes.dex */
public final class HomeScreenOverrideRule implements ScreenOverrideRule {
    public final CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteGate;
    public final RealFamilyProfileManager familyProfileManager;
    public final RealSessionFlags sessionFlags;
    public final SessionManager sessionManager;

    public HomeScreenOverrideRule(RealSessionFlags realSessionFlags, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, SessionManager sessionManager, RealFamilyProfileManager realFamilyProfileManager) {
        this.sessionFlags = realSessionFlags;
        this.cashAppLiteGate = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.sessionManager = sessionManager;
        this.familyProfileManager = realFamilyProfileManager;
    }

    @Override // app.cash.broadway.navigation.ScreenOverrideRule
    public final Screen maybeOverride(ScreenOverrideRule.State state, Screen screen) {
        screen.getClass();
        if (!(screen instanceof PaymentScreens$HomeScreens$Home)) {
            return null;
        }
        if (PlatformKt.hasOnboardedAccount(this.sessionManager)) {
            return ((this.familyProfileManager.familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount) || (this.cashAppLiteGate.f$0 || ((Boolean) this.sessionFlags.launchMoneyTabAsHome.getValue()).booleanValue())) ? new MoneyTabScreen(MoneyAnalyticsService$Companion$Source.APP_LAUNCH) : PaymentScreens$HomeScreens$PaymentPad.INSTANCE;
        }
        return new InitialScreenPlaceholder(InitialScreenPlaceholder.TriggeredBy.SignOut.INSTANCE);
    }
}
