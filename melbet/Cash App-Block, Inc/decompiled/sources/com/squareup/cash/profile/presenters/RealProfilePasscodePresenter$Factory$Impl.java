package com.squareup.cash.profile.presenters;

import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class RealProfilePasscodePresenter$Factory$Impl {
    public final RealProfilePasscodePresenter$MetroFactory delegateFactory;

    public RealProfilePasscodePresenter$Factory$Impl(RealProfilePasscodePresenter$MetroFactory realProfilePasscodePresenter$MetroFactory) {
        this.delegateFactory = realProfilePasscodePresenter$MetroFactory;
    }

    public final TransfersPresenter create$1(ProfileScreens.SecurityScreen securityScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        securityScreen.getClass();
        RealProfilePasscodePresenter$MetroFactory realProfilePasscodePresenter$MetroFactory = this.delegateFactory;
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) realProfilePasscodePresenter$MetroFactory.balanceSnapshotManager.invoke();
        RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) realProfilePasscodePresenter$MetroFactory.cryptoBalanceRepo.invoke();
        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) realProfilePasscodePresenter$MetroFactory.instrumentManager.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) realProfilePasscodePresenter$MetroFactory.profileManager.invoke();
        FlowStarter flowStarter = (FlowStarter) realProfilePasscodePresenter$MetroFactory.blockersNavigator.invoke();
        Analytics analytics = (Analytics) realProfilePasscodePresenter$MetroFactory.analytics.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realProfilePasscodePresenter$MetroFactory.stringManager.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) realProfilePasscodePresenter$MetroFactory.featureFlagManager.invoke();
        RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) realProfilePasscodePresenter$MetroFactory.passcodeFlowStarter.invoke();
        StateFlow stateFlow = (StateFlow) realProfilePasscodePresenter$MetroFactory.passcodeSettings.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) realProfilePasscodePresenter$MetroFactory.ioDispatcher.invoke();
        realBalanceSnapshotManager.getClass();
        realCryptoBalanceRepo.getClass();
        realInstrumentManager.getClass();
        realProfileManager.getClass();
        flowStarter.getClass();
        analytics.getClass();
        androidStringManager.getClass();
        featureFlagManager.getClass();
        realPasscodeFlowStarter.getClass();
        stateFlow.getClass();
        coroutineContext.getClass();
        return new TransfersPresenter(securityScreen, screenNavigator, realBalanceSnapshotManager, realCryptoBalanceRepo, realInstrumentManager, realProfileManager, flowStarter, analytics, androidStringManager, featureFlagManager, realPasscodeFlowStarter, stateFlow, coroutineContext);
    }
}
