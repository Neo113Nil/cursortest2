package com.squareup.cash.appmessages.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.appmessages.PopupAppMessageViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class BalancePopupAppMessagePresenter implements MoleculePresenter {
    public final /* synthetic */ CardStudioPresenter $$delegate_0;
    public final /* synthetic */ int $r8$classId;

    public BalancePopupAppMessagePresenter(Flow flow, PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            case 2:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            case 3:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            case 4:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            case 5:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            default:
                this.$$delegate_0 = popupAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.$$delegate_0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-218670177);
                PopupAppMessageViewModel models = cardStudioPresenter.models(flow, (Composer) gapComposer, i & 14);
                gapComposer.end(false);
                return models;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(998963614);
                PopupAppMessageViewModel models2 = cardStudioPresenter.models(flow, (Composer) gapComposer2, i & 14);
                gapComposer2.end(false);
                return models2;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-221386762);
                PopupAppMessageViewModel models3 = cardStudioPresenter.models(flow, (Composer) gapComposer3, i & 14);
                gapComposer3.end(false);
                return models3;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1512755150);
                PopupAppMessageViewModel models4 = cardStudioPresenter.models(flow, (Composer) gapComposer4, i & 14);
                gapComposer4.end(false);
                return models4;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(861175805);
                PopupAppMessageViewModel models5 = cardStudioPresenter.models(flow, (Composer) gapComposer5, i & 14);
                gapComposer5.end(false);
                return models5;
            default:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(952695808);
                PopupAppMessageViewModel models6 = cardStudioPresenter.models(flow, (Composer) gapComposer6, i & 14);
                gapComposer6.end(false);
                return models6;
        }
    }
}
