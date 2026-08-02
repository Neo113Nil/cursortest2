package com.squareup.cash.blockers.presenters;

import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PasscodeConfirmTypeTransformer implements PasscodeTypedTransformer {
    public final Analytics analytics;
    public final RealAppLockState appLockState;
    public final AppService appService;
    public final BlockersScreens.PasscodeScreen args;
    public final CashBiometricsInfo biometricsInfo;
    public final AndroidBiometricsStore biometricsStore;
    public final SessionWorker$doWork$2$2 biometricsToken;
    public final BlockersDataNavigator blockersNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public PasscodeConfirmTypeTransformer(AndroidStringManager androidStringManager, AppService appService, BlockersDataNavigator blockersDataNavigator, Analytics analytics, RealAppLockState realAppLockState, AndroidBiometricsStore androidBiometricsStore, CashBiometricsInfo cashBiometricsInfo, BlockersScreens.PasscodeScreen passcodeScreen, BetterNavigator.ScreenNavigator screenNavigator, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2) {
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.appLockState = realAppLockState;
        this.biometricsStore = androidBiometricsStore;
        this.biometricsInfo = cashBiometricsInfo;
        this.args = passcodeScreen;
        this.navigator = screenNavigator;
        this.biometricsToken = sessionWorker$doWork$2$2;
    }

    @Override // com.squareup.cash.blockers.presenters.PasscodeTypedTransformer
    public final Flow transform(Flow flow) {
        return FlowKt.channelFlow(new PasscodePresenter$models$1$2(this, flow, (Continuation) null, 9));
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appLockState;
        public final DoubleCheck appService;
        public final Provider biometricsInfo;
        public final Provider biometricsStore;
        public final Provider blockersNavigator;
        public final LambdaProvider stringManager;

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory3, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.blockersNavigator = metroFactory;
            this.biometricsStore = metroFactory2;
            this.appService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.biometricsInfo = metroFactory3;
            this.analytics = doubleCheck2;
            this.appLockState = doubleCheck3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, RealGlobalConfigManager.MetroFactory metroFactory, RealAppLockState.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory) {
            this.stringManager = lambdaProvider;
            this.blockersNavigator = metroFactory;
            this.biometricsStore = metroFactory2;
            this.appService = doubleCheck;
            this.analytics = doubleCheck2;
            this.appLockState = doubleCheck3;
            this.biometricsInfo = instanceFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, TreehouseFlows.MetroFactory metroFactory2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory) {
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.analytics = doubleCheck2;
            this.appLockState = doubleCheck3;
            this.biometricsStore = metroFactory2;
            this.biometricsInfo = arcadeModule$ProvideHapticVibratorMetroFactory;
        }
    }
}
