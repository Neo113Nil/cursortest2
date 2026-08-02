package com.squareup.cash.nfc.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.GenericTreeElementsScreenPresenter$Factory$Impl;
import com.squareup.cash.genericelements.presenters.RealGenericTreeElementsPresenter$Factory$Impl;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.nfc.screens.NfcNotAvailableScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class NfcPresenterModule$Companion$$ExternalSyntheticLambda0 implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NfcPresenterModule$Companion$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                NfcNotAvailablePresenter$Factory$Impl nfcNotAvailablePresenter$Factory$Impl = (NfcNotAvailablePresenter$Factory$Impl) obj;
                screen.getClass();
                if (!(screen instanceof NfcNotAvailableScreen)) {
                    return null;
                }
                LoadTimeClock.MetroFactory metroFactory = nfcNotAvailablePresenter$Factory$Impl.delegateFactory;
                IntentLauncher intentLauncher = (IntentLauncher) metroFactory.clock.invoke();
                RealNfcPaymentsManager realNfcPaymentsManager = (RealNfcPaymentsManager) metroFactory.observabilityManager.invoke();
                intentLauncher.getClass();
                realNfcPaymentsManager.getClass();
                return MoleculePresenterKt.asPresenter$default(new NfcNotAvailablePresenter(intentLauncher, realNfcPaymentsManager, screenNavigator, (NfcNotAvailableScreen) screen));
            default:
                GenericTreeElementsScreenPresenter$Factory$Impl genericTreeElementsScreenPresenter$Factory$Impl = (GenericTreeElementsScreenPresenter$Factory$Impl) obj;
                screen.getClass();
                if (!(screen instanceof GenericTreeElementsScreen)) {
                    return null;
                }
                LoadTimeClock.MetroFactory metroFactory2 = genericTreeElementsScreenPresenter$Factory$Impl.delegateFactory;
                RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) metroFactory2.clock.invoke();
                RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl = (RealGenericTreeElementsPresenter$Factory$Impl) metroFactory2.observabilityManager.invoke();
                realGenericTreeElementsRepo.getClass();
                realGenericTreeElementsPresenter$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realGenericTreeElementsRepo, realGenericTreeElementsPresenter$Factory$Impl, (GenericTreeElementsScreen) screen, screenNavigator));
        }
    }
}
