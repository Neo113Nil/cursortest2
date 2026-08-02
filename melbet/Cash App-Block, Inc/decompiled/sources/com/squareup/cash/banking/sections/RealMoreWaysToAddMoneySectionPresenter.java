package com.squareup.cash.banking.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.b$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.protos.unicorn.BankingTab;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class RealMoreWaysToAddMoneySectionPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealClientRouteParser clientRouteParser;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyAnalyticsService moneyAnalyticsService;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final SyncValueReader syncValueReader;

    public RealMoreWaysToAddMoneySectionPresenter(SyncValueReader syncValueReader, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, RealClientRouteParser realClientRouteParser, MoneyAnalyticsService moneyAnalyticsService, FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope, BetterNavigator.ScreenNavigator screenNavigator) {
        this.syncValueReader = syncValueReader;
        this.analytics = analytics;
        this.clientRouteParser = realClientRouteParser;
        this.moneyAnalyticsService = moneyAnalyticsService;
        this.featureFlagManager = featureFlagManager;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1283875458);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Trace.valuesState(this.featureFlagManager, AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1).getValue()).enabled();
        boolean changed = gapComposer.changed((BankingTab) collectAsState.getValue()) | gapComposer.changed(enabled);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.derivedStateOf(new b$$ExternalSyntheticLambda0(collectAsState, enabled, 6));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, flow, new ToastKt$Toast$9$1(flow, continuation, this, 17));
        MoreWaysToAddMoneySectionViewModel moreWaysToAddMoneySectionViewModel = (MoreWaysToAddMoneySectionViewModel) ((State) rememberedValue3).getValue();
        if (moreWaysToAddMoneySectionViewModel == null) {
            moreWaysToAddMoneySectionViewModel = new MoreWaysToAddMoneySectionViewModel(null, EmptyList.INSTANCE);
        }
        gapComposer.end(false);
        return moreWaysToAddMoneySectionViewModel;
    }
}
