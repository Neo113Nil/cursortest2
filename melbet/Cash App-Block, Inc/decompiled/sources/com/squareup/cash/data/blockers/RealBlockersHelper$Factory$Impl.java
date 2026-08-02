package com.squareup.cash.data.blockers;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.AndroidToaster;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealBlockersHelper$Factory$Impl {
    public final RealBlockersHelper.MetroFactory delegateFactory;

    public RealBlockersHelper$Factory$Impl(RealBlockersHelper.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealBlockersHelper create(Navigator navigator) {
        navigator.getClass();
        RealBlockersHelper.MetroFactory metroFactory = this.delegateFactory;
        AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) metroFactory.appForegroundStateProvider.invoke();
        RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) metroFactory.clientScenarioCompleter.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
        AppService appService = (AppService) metroFactory.appService.invoke();
        Analytics analytics = (Analytics) metroFactory.analytics.invoke();
        SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory.signedInStateManager.invoke();
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory.supportNavigator.invoke();
        AndroidToaster androidToaster = (AndroidToaster) metroFactory.toaster.invoke();
        IntentLauncher intentLauncher = (IntentLauncher) metroFactory.launcher.invoke();
        RealFileDownloader realFileDownloader = (RealFileDownloader) metroFactory.fileDownloader.invoke();
        AndroidFileProvider androidFileProvider = (AndroidFileProvider) metroFactory.fileProvider.invoke();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.blockerFlowAnalytics.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.routerFactory.value;
        RealClipboardManager realClipboardManager = (RealClipboardManager) metroFactory.clipboardManager.invoke();
        AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) metroFactory.activityFinisher.invoke();
        RealHapticVibrator realHapticVibrator = (RealHapticVibrator) ((ArcadeModule$ProvideHapticVibratorMetroFactory) metroFactory.hapticVibrator).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory.uiDispatcher.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.scope.value;
        AndroidClock androidClock = (AndroidClock) metroFactory.clock.invoke();
        appForegroundStateProvider.getClass();
        realClientScenarioCompleter.getClass();
        androidStringManager.getClass();
        blockersDataNavigator.getClass();
        appService.getClass();
        analytics.getClass();
        signedInStateManager.getClass();
        realSupportNavigator.getClass();
        androidToaster.getClass();
        intentLauncher.getClass();
        realFileDownloader.getClass();
        androidFileProvider.getClass();
        blockerFlowListener.getClass();
        realRouter$Factory$Impl.getClass();
        realClipboardManager.getClass();
        androidActivityFinisher.getClass();
        featureFlagManager.getClass();
        coroutineContext.getClass();
        coroutineContext2.getClass();
        coroutineScope.getClass();
        androidClock.getClass();
        return new RealBlockersHelper(appForegroundStateProvider, realClientScenarioCompleter, androidStringManager, blockersDataNavigator, appService, analytics, signedInStateManager, realSupportNavigator, androidToaster, intentLauncher, realFileDownloader, androidFileProvider, blockerFlowListener, realRouter$Factory$Impl, realClipboardManager, androidActivityFinisher, realHapticVibrator, featureFlagManager, coroutineContext, coroutineContext2, coroutineScope, navigator, androidClock);
    }
}
