package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class AuthorizeGooglePayPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.AuthorizeGooglePayScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final GooglePayPaymentsClient googlePayPaymentsClient;
    public final BetterNavigator.ScreenNavigator navigator;
    public final String paymentsMerchantId;
    public final AndroidStringManager stringManager;

    public AuthorizeGooglePayPresenter(GooglePayPaymentsClient googlePayPaymentsClient, BlockersDataNavigator blockersDataNavigator, AppService appService, AndroidStringManager androidStringManager, String str, BlockersScreens.AuthorizeGooglePayScreen authorizeGooglePayScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.googlePayPaymentsClient = googlePayPaymentsClient;
        this.blockersDataNavigator = blockersDataNavigator;
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.paymentsMerchantId = str;
        this.args = authorizeGooglePayScreen;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1980116838);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(AuthorizeGooglePayViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new CashtagPresenter$models$2$1(flow, (Continuation) null, this, 1));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new CashtagPresenter$models$2$1(this, mutableState, mutableState2, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1714309864);
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new AuthorizeGooglePayPresenter$models$3$1(this, mutableState, null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1712030372);
            gapComposer.end(false);
        }
        AuthorizeGooglePayViewModel authorizeGooglePayViewModel = (AuthorizeGooglePayViewModel) mutableState.getValue();
        gapComposer.end(false);
        return authorizeGooglePayViewModel;
    }
}
