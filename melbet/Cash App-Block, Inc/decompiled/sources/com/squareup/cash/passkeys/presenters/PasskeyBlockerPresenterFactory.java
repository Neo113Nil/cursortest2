package com.squareup.cash.passkeys.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.blockers.presenters.BlockerPresenterFactory;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapplite.presenters.PasskeySignatureBlockerPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.passkeys.backend.CredentialManagerPasskeyCreator;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OrchestratorService;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class PasskeyBlockerPresenterFactory implements BlockerPresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object passkeyUpsellPresenterFactory;

    public /* synthetic */ PasskeyBlockerPresenterFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.passkeyUpsellPresenterFactory = obj;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.passkeyUpsellPresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (!(screen instanceof PasskeyUpsellScreen)) {
                    return null;
                }
                PasskeyUpsellScreen passkeyUpsellScreen = (PasskeyUpsellScreen) screen;
                LocalActivitySetupTeardown.MetroFactory metroFactory = ((PasskeyUpsellPresenter$Factory$Impl) obj).delegateFactory;
                Analytics analytics = (Analytics) metroFactory.appForegroundStateProvider.invoke();
                RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) metroFactory.sessionManager.invoke();
                AppService appService = (AppService) metroFactory.syncValueReader.invoke();
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.shortlinkHandler.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.ioDispatcher.invoke();
                analytics.getClass();
                realPasskeyRepository.getClass();
                appService.getClass();
                blockersDataNavigator.getClass();
                androidStringManager.getClass();
                return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(analytics, realPasskeyRepository, appService, blockersDataNavigator, androidStringManager, passkeyUpsellScreen, screenNavigator));
            default:
                screen.getClass();
                if (!(screen instanceof PasskeySignatureBlockerScreen)) {
                    return null;
                }
                PasskeySignatureBlockerScreen passkeySignatureBlockerScreen = (PasskeySignatureBlockerScreen) screen;
                RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = ((PasskeySignatureBlockerPresenter$Factory$Impl) obj).delegateFactory;
                OrchestratorService orchestratorService = (OrchestratorService) realFamilyNavigator$MetroFactory.analytics.invoke();
                CredentialManagerPasskeyCreator credentialManagerPasskeyCreator = (CredentialManagerPasskeyCreator) realFamilyNavigator$MetroFactory.sessionManager.invoke();
                AppService appService2 = (AppService) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) realFamilyNavigator$MetroFactory.stringManager.invoke();
                orchestratorService.getClass();
                credentialManagerPasskeyCreator.getClass();
                appService2.getClass();
                blockersDataNavigator2.getClass();
                return MoleculePresenterKt.asPresenter$default(new LiteCashInPresenter(orchestratorService, credentialManagerPasskeyCreator, appService2, blockersDataNavigator2, passkeySignatureBlockerScreen, screenNavigator));
        }
    }
}
