package com.squareup.cash.blockers.presenters.onboarding;

import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidToaster;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class WelcomePresenter$Factory$Impl {
    public final RealBlockersHelper.MetroFactory delegateFactory;

    public WelcomePresenter$Factory$Impl(RealBlockersHelper.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final WelcomePresenter create(BlockersScreens.WelcomeScreen welcomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        RealBlockersHelper.MetroFactory metroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.appForegroundStateProvider.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) metroFactory.clientScenarioCompleter.invoke();
        RealProfileSyncSetupTeardown realProfileSyncSetupTeardown = (RealProfileSyncSetupTeardown) metroFactory.stringManager.invoke();
        RealOnboardingIntegrityChecker realOnboardingIntegrityChecker = (RealOnboardingIntegrityChecker) metroFactory.blockersNavigator.invoke();
        RealColdStartIntegrityChecker realColdStartIntegrityChecker = (RealColdStartIntegrityChecker) metroFactory.appService.invoke();
        AcceptableScrim acceptableScrim = (AcceptableScrim) metroFactory.routerFactory.value;
        RealAppLockState realAppLockState = (RealAppLockState) metroFactory.analytics.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.signedInStateManager.invoke();
        RealSessionFlags realSessionFlags = (RealSessionFlags) metroFactory.supportNavigator.invoke();
        SessionManager sessionManager = (SessionManager) metroFactory.toaster.invoke();
        Analytics analytics = (Analytics) metroFactory.launcher.invoke();
        RealAccountSwitchAnalytics realAccountSwitchAnalytics = (RealAccountSwitchAnalytics) metroFactory.fileDownloader.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.fileProvider.invoke();
        RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.blockerFlowAnalytics.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.clipboardManager.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.activityFinisher.invoke();
        AndroidToaster androidToaster = (AndroidToaster) metroFactory.featureFlagManager.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) metroFactory.ioDispatcher.invoke();
        KeyValue keyValue = (KeyValue) metroFactory.uiDispatcher.invoke();
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) metroFactory.clock.invoke();
        AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = (AccountSwitchScreenStateRelay) metroFactory.scope.value;
        TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) metroFactory.hapticVibrator.invoke();
        blockersDataNavigator.getClass();
        appConfigManager.getClass();
        realProfileSyncSetupTeardown.getClass();
        realOnboardingIntegrityChecker.getClass();
        realColdStartIntegrityChecker.getClass();
        acceptableScrim.getClass();
        realAppLockState.getClass();
        coroutineContext.getClass();
        realSessionFlags.getClass();
        sessionManager.getClass();
        analytics.getClass();
        realAccountSwitchAnalytics.getClass();
        realRouter$Factory$Impl.getClass();
        realMoneyNavigatorHelper.getClass();
        androidStringManager.getClass();
        featureFlagManager.getClass();
        androidToaster.getClass();
        realProfileManager.getClass();
        keyValue.getClass();
        userJourneyTracker.getClass();
        accountSwitchScreenStateRelay.getClass();
        timeToLiveSyncState.getClass();
        return new WelcomePresenter(blockersDataNavigator, appConfigManager, realProfileSyncSetupTeardown, realOnboardingIntegrityChecker, realColdStartIntegrityChecker, acceptableScrim, realAppLockState, coroutineContext, realSessionFlags, sessionManager, analytics, realAccountSwitchAnalytics, realRouter$Factory$Impl, realMoneyNavigatorHelper, androidStringManager, featureFlagManager, androidToaster, realProfileManager, keyValue, userJourneyTracker, accountSwitchScreenStateRelay, timeToLiveSyncState, screenNavigator, welcomeScreen);
    }
}
