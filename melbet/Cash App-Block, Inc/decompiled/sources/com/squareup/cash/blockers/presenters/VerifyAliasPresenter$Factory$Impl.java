package com.squareup.cash.blockers.presenters;

import com.datadog.android.trace.Trace;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.validation.RealPendingEmailVerification;
import com.squareup.preferences.StringPreference;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class VerifyAliasPresenter$Factory$Impl {
    public final TabToolbarPresenter.MetroFactory delegateFactory;

    public VerifyAliasPresenter$Factory$Impl(TabToolbarPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final VerifyAliasPresenter create(BlockersScreens.VerifyAliasScreen verifyAliasScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        TabToolbarPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) metroFactory.bitcoinCapabilityProvider).lambda.invoke();
        Analytics analytics = (Analytics) ((DoubleCheck) metroFactory.badgingStateAccessibilityHelper).getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.sessionManager.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.profileManager.invoke();
        FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) metroFactory.moneybotFlagsHelper).getValue();
        ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((AndroidFileSaver.MetroFactory) metroFactory.moneybotAnalyticsService).invoke();
        RealAliasRegistrar realAliasRegistrar = (RealAliasRegistrar) metroFactory.badges.invoke();
        RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) ((LambdaProvider) metroFactory.sessionFlags).lambda.invoke();
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) ((LambdaProvider) metroFactory.syncValueReader).lambda.invoke();
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory.badger2.invoke();
        SharedFlow sharedFlow = (SharedFlow) ((LambdaProvider) metroFactory.p2pSettingsManager).lambda.invoke();
        StringPreference stringPreference = (StringPreference) ((DoubleCheck) metroFactory.familyNavigatorFactory).getValue();
        RealPendingEmailVerification realPendingEmailVerification = (RealPendingEmailVerification) ((DoubleCheck) metroFactory.familyProfileManager).getValue();
        Signal signal = (Signal) ((DoubleCheck) metroFactory.balanceSnapshotManager).getValue();
        Duration duration = new Duration(Trace.m1912provideResendCodeButtonDelayUwyO8pc());
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.featureFlagManager.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) metroFactory.moneyFormatterFactory).lambda.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory.tabToolbarOutboundNavigatorFactory).value;
        androidStringManager.getClass();
        analytics.getClass();
        blockerFlowListener.getClass();
        blockersDataNavigator.getClass();
        flowStarter.getClass();
        realAliasRegistrar.getClass();
        realOnboardingFlowTokenManager.getClass();
        userJourneyTracker.getClass();
        realSupportNavigator.getClass();
        sharedFlow.getClass();
        stringPreference.getClass();
        realPendingEmailVerification.getClass();
        signal.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        coroutineContext.getClass();
        coroutineScope.getClass();
        return new VerifyAliasPresenter(androidStringManager, analytics, blockerFlowListener, blockersDataNavigator, flowStarter, toolbarTuckTargets, realAliasRegistrar, realOnboardingFlowTokenManager, userJourneyTracker, realSupportNavigator, sharedFlow, stringPreference, realPendingEmailVerification, signal, duration.rawValue, realBlockersHelper$Factory$Impl, verifyAliasScreen, screenNavigator, coroutineContext, coroutineScope);
    }
}
