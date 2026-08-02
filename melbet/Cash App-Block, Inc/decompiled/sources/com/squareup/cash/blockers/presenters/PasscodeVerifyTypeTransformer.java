package com.squareup.cash.blockers.presenters;

import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PasscodeVerifyTypeTransformer implements PasscodeTypedTransformer {
    public final Analytics analytics;
    public final RealAppLockState appLockState;
    public final AppService appService;
    public final BlockersScreens.PasscodeScreen args;
    public final CashBiometricsInfo biometricsInfo;
    public final AndroidBiometricsStore biometricsStore;
    public final SessionWorker$doWork$2$2 biometricsToken;
    public final BlockersDataNavigator blockersNavigator;
    public final IssuedCardManager issuedCardManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Signal signOut;
    public final AndroidStringManager stringManager;

    public PasscodeVerifyTypeTransformer(AndroidStringManager androidStringManager, AppService appService, Signal signal, BlockersDataNavigator blockersDataNavigator, Analytics analytics, RealAppLockState realAppLockState, AndroidBiometricsStore androidBiometricsStore, CashBiometricsInfo cashBiometricsInfo, IssuedCardManager issuedCardManager, BlockersScreens.PasscodeScreen passcodeScreen, BetterNavigator.ScreenNavigator screenNavigator, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2) {
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.signOut = signal;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.appLockState = realAppLockState;
        this.biometricsStore = androidBiometricsStore;
        this.biometricsInfo = cashBiometricsInfo;
        this.issuedCardManager = issuedCardManager;
        this.args = passcodeScreen;
        this.navigator = screenNavigator;
        this.biometricsToken = sessionWorker$doWork$2$2;
    }

    @Override // com.squareup.cash.blockers.presenters.PasscodeTypedTransformer
    public final Flow transform(Flow flow) {
        return FlowKt.callbackFlow(new PasscodePresenter$models$1$2(this, flow, (Continuation) null, 14));
    }
}
