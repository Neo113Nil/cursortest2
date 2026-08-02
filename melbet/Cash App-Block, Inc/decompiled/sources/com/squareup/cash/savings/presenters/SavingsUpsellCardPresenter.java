package com.squareup.cash.savings.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes7.dex */
public final class SavingsUpsellCardPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SavingsCardSheet args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public SavingsUpsellCardPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, SavingsCardSheet savingsCardSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analytics = analytics;
        this.args = savingsCardSheet;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final UpsellCardModel$Loaded models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1296500874);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, 0 == true ? 1 : 0, this, 2));
        SavingsCard savingsCard = this.args.card;
        String str = savingsCard.title;
        String str2 = savingsCard.body;
        SavingsCard.Image image = savingsCard.image;
        SavingsCard.Image.LocalImage localImage = image instanceof SavingsCard.Image.LocalImage ? (SavingsCard.Image.LocalImage) image : null;
        CardImage cardImage = localImage != null ? localImage.image : null;
        SavingsCard.Button button = savingsCard.primaryButton;
        UpsellCardModel$Loaded.Button button2 = new UpsellCardModel$Loaded.Button(button.text, new UpsellCardEvent.RouterClicked(button.clientRoute, button.cdfEvent));
        SavingsCard.Button button3 = savingsCard.secondaryButton;
        UpsellCardModel$Loaded upsellCardModel$Loaded = new UpsellCardModel$Loaded(str, str2, cardImage, button2, button3 != null ? new UpsellCardModel$Loaded.Button(button3.text, new UpsellCardEvent.RouterClicked(button3.clientRoute, button3.cdfEvent)) : null);
        gapComposer.end(false);
        return upsellCardModel$Loaded;
    }
}
