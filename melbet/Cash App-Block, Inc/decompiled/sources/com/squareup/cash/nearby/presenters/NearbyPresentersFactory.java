package com.squareup.cash.nearby.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.billssubscriptions.screens.BillsSubscriptionsMerchantListScreen;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.nearby.screens.NearbyOrderedListsScreen;

/* loaded from: classes.dex */
public final class NearbyPresentersFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NearbyPresentersFactory(Object obj, int i) {
        this.$r8$classId = i;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        screen.getClass();
        switch (i) {
            case 0:
                if (screen instanceof NearbyOrderedListsScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((NearbyOrderedListsScreen) screen, screenNavigator));
                }
                return null;
            default:
                if (screen instanceof BillsSubscriptionsMerchantListScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator));
                }
                return null;
        }
    }
}
