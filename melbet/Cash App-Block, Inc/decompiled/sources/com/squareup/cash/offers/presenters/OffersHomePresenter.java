package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.node.NodeChain;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$3$1;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.RealCardDetailsCreator;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection$Content$HeroSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.task.RepeatTaskExecutor;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class OffersHomePresenter implements MoleculePresenter {
    public final RealOffersAnalytics analytics;
    public final RealOffersAnalyticsHelper analyticsHelper;
    public final OffersScreen$OffersHomeScreen args;
    public final RealBoostRepository boostRepository;
    public final RealClientRouteParser clientRouteParser;
    public final RealClientSyncer clientSyncer;
    public final AndroidClock clock;
    public boolean isBrowseStartTracked;
    public final boolean isNewSession;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOffersPopupMessageDismisser offersPopupMessageDismisser;
    public final RealOffersSearchPresenter offersSearchPresenter;
    public final RealOffersTabRefresher offersTabRefresher;
    public final RealOffersTabRepository offersTabRepository;
    public final Flow pendingAppMessages;
    public final RealRouter router;
    public final RealOffersSpanManager spanManager;
    public final AndroidStringManager stringManager;

    public OffersHomePresenter(OffersScreen$OffersHomeScreen offersScreen$OffersHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, RealOffersTabRepository realOffersTabRepository, AndroidStringManager androidStringManager, RealOffersAnalyticsHelper realOffersAnalyticsHelper, RealClientRouteParser realClientRouteParser, RealBoostRepository realBoostRepository, AndroidClock androidClock, RealOffersTabRefresher realOffersTabRefresher, IntentLauncher intentLauncher, Flow flow, RealOffersPopupMessageDismisser realOffersPopupMessageDismisser, RealOffersSpanManager realOffersSpanManager, RealClientSyncer realClientSyncer, RealRouter$Factory$Impl realRouter$Factory$Impl, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl, RealOffersSearchPresenter$Factory$Impl realOffersSearchPresenter$Factory$Impl) {
        RealOffersAnalyticsHelper realOffersAnalyticsHelper2;
        offersScreen$OffersHomeScreen.getClass();
        this.args = offersScreen$OffersHomeScreen;
        this.navigator = screenNavigator;
        this.offersTabRepository = realOffersTabRepository;
        this.stringManager = androidStringManager;
        this.analyticsHelper = realOffersAnalyticsHelper;
        this.clientRouteParser = realClientRouteParser;
        this.boostRepository = realBoostRepository;
        this.clock = androidClock;
        this.offersTabRefresher = realOffersTabRefresher;
        this.launcher = intentLauncher;
        this.pendingAppMessages = flow;
        this.offersPopupMessageDismisser = realOffersPopupMessageDismisser;
        this.spanManager = realOffersSpanManager;
        this.clientSyncer = realClientSyncer;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.analytics = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersHomeScreen);
        NodeChain nodeChain = realOffersSearchPresenter$Factory$Impl.delegateFactory;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper3 = (RealOffersAnalyticsHelper) ((DoubleCheck) nodeChain.layoutNode).getValue();
        long longValue = ((Number) ((DoubleCheck) nodeChain.sentinelHead).getValue()).longValue();
        RealOffersTabRepository realOffersTabRepository2 = (RealOffersTabRepository) ((DoubleCheck) nodeChain.innerCoordinator).getValue();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) nodeChain.outerCoordinator).lambda.invoke();
        RealBoostRepository realBoostRepository2 = (RealBoostRepository) ((DoubleCheck) nodeChain.tail).getValue();
        RealOffersTabRefresher realOffersTabRefresher2 = (RealOffersTabRefresher) ((Provider) nodeChain.head).invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) ((Provider) nodeChain.current).invoke();
        RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl2 = (RealOffersAnalytics$Factory$Impl) ((Provider) nodeChain.buffer).invoke();
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) nodeChain.stack).lambda.invoke();
        RealSearchTrackingManager realSearchTrackingManager = (RealSearchTrackingManager) ((RealLocaleAssetProvider$MetroFactory) nodeChain.cachedDiffer).invoke();
        realOffersAnalyticsHelper3.getClass();
        realOffersTabRepository2.getClass();
        androidStringManager2.getClass();
        realBoostRepository2.getClass();
        realOffersTabRefresher2.getClass();
        realRouter$Factory$Impl2.getClass();
        realOffersAnalytics$Factory$Impl2.getClass();
        realObservabilityManager.getClass();
        this.offersSearchPresenter = new RealOffersSearchPresenter(offersScreen$OffersHomeScreen, screenNavigator, realOffersAnalyticsHelper3, longValue, realOffersTabRepository2, androidStringManager2, realBoostRepository2, realOffersTabRefresher2, realRouter$Factory$Impl2, realOffersAnalytics$Factory$Impl2, realObservabilityManager, realSearchTrackingManager);
        String uuid = offersScreen$OffersHomeScreen.instanceId.toString();
        uuid.getClass();
        boolean equals = uuid.equals(realOffersAnalyticsHelper.activeShopSessionId());
        this.isNewSession = !equals;
        this.isBrowseStartTracked = equals;
        realOffersSpanManager.onAction(new OffersSpanAction.StartRootSpan("offers_browse_span"));
        if (uuid.equals(realOffersAnalyticsHelper.activeShopSessionId())) {
            realOffersAnalyticsHelper2 = realOffersAnalyticsHelper;
        } else {
            realOffersAnalyticsHelper2 = realOffersAnalyticsHelper;
            realOffersAnalyticsHelper2.refreshFlowToken(OffersAnalyticsHelper$Flow.SHOP);
            realOffersAnalyticsHelper2.searchSourceScreen = "";
            realOffersAnalyticsHelper2.searchSourceSection = "";
            realOffersAnalyticsHelper2.searchSourceFilter = "";
        }
        StateFlowImpl stateFlowImpl = realOffersAnalyticsHelper2.shopSessionId;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, uuid);
        OffersScreen$OffersHomeScreen.OriginInfo originInfo = offersScreen$OffersHomeScreen.originInfo;
        realOffersAnalyticsHelper2.origin = originInfo != null ? originInfo.origin : null;
        realOffersAnalyticsHelper2.referrerFlowToken = originInfo != null ? originInfo.referrerFlowToken : null;
    }

    public static final OffersHomeListingViewModel.Error access$constructHomeErrorViewModel(OffersHomePresenter offersHomePresenter, ApiResult.Failure failure) {
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        boolean z = failure instanceof ApiResult.Failure.NetworkFailure;
        AndroidStringManager androidStringManager = offersHomePresenter.stringManager;
        Color color = null;
        int i = 6;
        return new OffersHomeListingViewModel.Error(new OffersMessageViewModel("offers_home_error_message", smallPersistentVector, new StyledText(z ? androidStringManager.get(R.string.offers_tab_network_error_title) : androidStringManager.get(R.string.offers_tab_generic_error_title), color, i), null, null, new Button(null, null, null, null, null, new StyledText(androidStringManager.get(R.string.offers_tab_error_action_button_text), color, i), null, 991)));
    }

    public static final void access$routeActionUrl(OffersHomePresenter offersHomePresenter, String str, String str2) {
        ClientRoute tryParse = ClientRouteParserKt.tryParse(offersHomePresenter.clientRouteParser, str);
        if (!(tryParse instanceof ClientRoute.ViewOffersSearch)) {
            RealRouter realRouter = offersHomePresenter.router;
            OffersScreen$OffersHomeScreen offersScreen$OffersHomeScreen = offersHomePresenter.args;
            realRouter.route(new RoutingParams(new OffersScreen$OffersHomeScreen(offersScreen$OffersHomeScreen.instanceId, offersScreen$OffersHomeScreen.originInfo, str2), null, null, null, null, null, 510), str);
            return;
        }
        RealOffersSearchPresenter realOffersSearchPresenter = offersHomePresenter.offersSearchPresenter;
        ClientRoute.ViewOffersSearch viewOffersSearch = (ClientRoute.ViewOffersSearch) tryParse;
        String str3 = viewOffersSearch.filterTokens;
        String str4 = viewOffersSearch.sourceScreen;
        String str5 = viewOffersSearch.sourceSection;
        String str6 = viewOffersSearch.sourceFilter;
        realOffersSearchPresenter.getClass();
        if (realOffersSearchPresenter.isSearchMode()) {
            return;
        }
        realOffersSearchPresenter.isSearchMode$delegate.setValue(Boolean.TRUE);
        realOffersSearchPresenter.isRestoringFromSearchMode$delegate.setValue(Boolean.FALSE);
        realOffersSearchPresenter.searchFilterTokens$delegate.setValue(str3);
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersSearchPresenter.analyticsHelper;
        realOffersAnalyticsHelper.searchSourceScreen = str4;
        realOffersAnalyticsHelper.searchSourceSection = str5;
        realOffersAnalyticsHelper.searchSourceFilter = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        UiCallbackModel uiCallbackModel;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        HeroSection heroSection;
        MutableState mutableState4;
        MutableState mutableState5;
        String str;
        Object heroTileListItemViewModel;
        MutableState mutableState6;
        Object offersHomePresenter$models$8$1;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        MutableState mutableState10;
        MutableState mutableState11;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1329873608);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.boostRepository.boostProvider.getBoostSlots(false), 15);
            gapComposer.updateRememberedValue(moneyTabPresenter$models$lambda$31$$inlined$map$1);
            rememberedValue = moneyTabPresenter$models$lambda$31$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState12 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = this.pendingAppMessages;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState13 = (MutableState) rememberedValue4;
        Object[] objArr = new Object[0];
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i3 = 3;
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new P2PListViewKt$$ExternalSyntheticLambda2(i3);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState14 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue5, gapComposer, 48);
        Object rememberedValue6 = gapComposer.rememberedValue();
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.analyticsHelper;
        if (rememberedValue6 == neverEqualPolicy) {
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realOffersAnalyticsHelper.flowTokenUpdates(OffersAnalyticsHelper$Flow.BROWSE), new OffersHomePresenter$models$browseFlowToken$2$1(mutableState13, mutableState14, continuation, i2), i3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue6 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue6, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BROWSE), null, gapComposer, 0, 2);
        UiCallbackModel models = this.offersSearchPresenter.models(gapComposer);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(models.model, gapComposer);
        Object[] objArr2 = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 17);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState15 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue7, gapComposer, 0);
        Object[] objArr3 = {((OffersSearchViewModel) rememberUpdatedState.getValue()).filterTokens};
        boolean changed = gapComposer.changed(rememberUpdatedState);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new OverlayKt$$ExternalSyntheticLambda1(2, rememberUpdatedState);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        String str2 = (String) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue8, gapComposer, 0);
        Object[] objArr4 = {Boolean.valueOf(((OffersSearchViewModel) rememberUpdatedState.getValue()).isSearchMode)};
        boolean changed2 = gapComposer.changed(rememberUpdatedState);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new OverlayKt$$ExternalSyntheticLambda1(i3, rememberUpdatedState);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        boolean booleanValue = ((Boolean) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue9, gapComposer, 0)).booleanValue();
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Updater.mutableStateOf$default(OffersHomeListingViewModel.Initial.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState16 = (MutableState) rememberedValue10;
        Object[] objArr5 = new Object[0];
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy) {
            uiCallbackModel = models;
            rememberedValue11 = new P2PListViewKt$$ExternalSyntheticLambda2(4);
            gapComposer.updateRememberedValue(rememberedValue11);
        } else {
            uiCallbackModel = models;
        }
        MutableState mutableState17 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue11, gapComposer, 48);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        MutableState mutableState18 = (MutableState) rememberedValue12;
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == neverEqualPolicy) {
            rememberedValue13 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        MutableState mutableState19 = (MutableState) rememberedValue13;
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == neverEqualPolicy) {
            rememberedValue14 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        MutableState mutableState20 = (MutableState) rememberedValue14;
        HomeSection homeSection = (HomeSection) mutableState20.getValue();
        OffersHomeListItemViewModel.HeroOffersTileViewModel.Placeholder placeholder = OffersHomeListItemViewModel.HeroOffersTileViewModel.Placeholder.INSTANCE;
        if (homeSection == null) {
            gapComposer.startReplaceGroup(-1484406411);
            gapComposer.end(false);
            mutableState = rememberUpdatedState;
            mutableState2 = mutableState17;
            mutableState3 = mutableState15;
            mutableState4 = mutableState12;
            mutableState5 = mutableState13;
            str = str2;
            heroTileListItemViewModel = null;
        } else {
            mutableState = rememberUpdatedState;
            gapComposer.startReplaceGroup(-1484406410);
            String str3 = (String) collectAsState.getValue();
            mutableState2 = mutableState17;
            zzku zzkuVar = homeSection.content;
            mutableState3 = mutableState15;
            if (zzkuVar != null) {
                HomeSection$Content$HeroSection homeSection$Content$HeroSection = zzkuVar instanceof HomeSection$Content$HeroSection ? (HomeSection$Content$HeroSection) zzkuVar : null;
                if (homeSection$Content$HeroSection != null) {
                    heroSection = homeSection$Content$HeroSection.value;
                    if (heroSection != null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: hero home section cannot be null");
                        return null;
                    }
                    AnalyticsEvent analyticsEvent = homeSection.analytics_view_event;
                    if (analyticsEvent == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: hero_tile analytics_view_event is null");
                        return null;
                    }
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent), gapComposer);
                    Object rememberedValue15 = gapComposer.rememberedValue();
                    AndroidClock androidClock = this.clock;
                    if (rememberedValue15 == neverEqualPolicy) {
                        mutableState4 = mutableState12;
                        mutableState5 = mutableState13;
                        rememberedValue15 = AndroidTileMode_androidKt.currentEffectiveHeroTile(heroSection, androidClock.millis());
                        gapComposer.updateRememberedValue(rememberedValue15);
                    } else {
                        mutableState4 = mutableState12;
                        mutableState5 = mutableState13;
                    }
                    HeroSection.HeroTile heroTile = (HeroSection.HeroTile) rememberedValue15;
                    boolean changedInstance2 = gapComposer.changedInstance(androidClock) | gapComposer.changedInstance(heroSection);
                    Object rememberedValue16 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue16 == neverEqualPolicy) {
                        str = str2;
                        rememberedValue16 = new RealMRIFactory$sign$2(androidClock, heroSection, continuation, 10);
                        gapComposer.updateRememberedValue(rememberedValue16);
                    } else {
                        str = str2;
                    }
                    HeroSection.HeroTile heroTile2 = (HeroSection.HeroTile) Updater.produceState(heroTile, heroSection, (Function2) rememberedValue16, gapComposer, 0).getValue();
                    heroTileListItemViewModel = heroTile2 != null ? AndroidTileMode_androidKt.toHeroTileListItemViewModel(heroTile2, str3, (OffersAnalyticsEventSpec) rememberUpdatedState2.getValue()) : placeholder;
                    gapComposer.end(false);
                }
            }
            heroSection = null;
            if (heroSection != null) {
            }
        }
        if (heroTileListItemViewModel == null) {
            heroTileListItemViewModel = placeholder;
        }
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(heroTileListItemViewModel, gapComposer);
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (rememberedValue17 == neverEqualPolicy) {
            rememberedValue17 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        MutableState mutableState21 = (MutableState) rememberedValue17;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue18 == neverEqualPolicy) {
            rememberedValue18 = new MainPaymentView$Content$2$1(this, (Continuation) null, 1);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue18);
        String str4 = (String) collectAsState.getValue();
        OffersHomeListingViewModel offersHomeListingViewModel = (OffersHomeListingViewModel) mutableState16.getValue();
        boolean changed3 = gapComposer.changed(collectAsState);
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue19 == neverEqualPolicy) {
            mutableState6 = mutableState21;
            rememberedValue19 = new OffersHomePresenter$models$2$1(mutableState16, collectAsState, null, 0);
            gapComposer.updateRememberedValue(rememberedValue19);
        } else {
            mutableState6 = mutableState21;
        }
        Updater.LaunchedEffect(str4, offersHomeListingViewModel, (Function2) rememberedValue19, gapComposer);
        OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel = (OffersHomeListItemViewModel.HeroOffersTileViewModel) rememberUpdatedState3.getValue();
        OffersHomeListingViewModel offersHomeListingViewModel2 = (OffersHomeListingViewModel) mutableState16.getValue();
        boolean changed4 = gapComposer.changed(rememberUpdatedState3);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue20 == neverEqualPolicy) {
            rememberedValue20 = new OffersHomePresenter$models$2$1(mutableState16, rememberUpdatedState3, null, 6);
            gapComposer.updateRememberedValue(rememberedValue20);
        }
        Updater.LaunchedEffect(heroOffersTileViewModel, offersHomeListingViewModel2, (Function2) rememberedValue20, gapComposer);
        String str5 = (String) collectAsState3.getValue();
        boolean changed5 = gapComposer.changed(collectAsState3);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue21 == neverEqualPolicy) {
            rememberedValue21 = new OffersHomePresenter$models$2$1(mutableState16, collectAsState3, null, 7);
            gapComposer.updateRememberedValue(rememberedValue21);
        }
        Updater.LaunchedEffect(gapComposer, str5, (Function2) rememberedValue21);
        OffersAnalyticsEventSpec offersAnalyticsEventSpec = (OffersAnalyticsEventSpec) mutableState19.getValue();
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue22 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue22 == neverEqualPolicy) {
            rememberedValue22 = new OffersHomePresenter$models$5$1(this, mutableState19, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue22);
        }
        Updater.LaunchedEffect(gapComposer, offersAnalyticsEventSpec, (Function2) rememberedValue22);
        PopupMessage popupMessage = (PopupMessage) collectAsState2.getValue();
        boolean changed6 = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(this);
        Object rememberedValue23 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue23 == neverEqualPolicy) {
            rememberedValue23 = new OffersHomePresenter$models$5$1(collectAsState2, this, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue23);
        }
        Updater.LaunchedEffect(gapComposer, popupMessage, (Function2) rememberedValue23);
        MutableState mutableState22 = mutableState3;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState18, mutableState16, mutableState, mutableState2, mutableState22, 22));
        boolean changedInstance5 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState22) | gapComposer.changed(collectAsState) | gapComposer.changed(collectAsState3);
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue24 == neverEqualPolicy) {
            mutableState7 = mutableState2;
            offersHomePresenter$models$8$1 = new OffersHomePresenter$models$8$1(this, mutableState16, mutableState22, collectAsState, collectAsState3, mutableState4, mutableState19, mutableState20, mutableState6, (Continuation) null);
            mutableState8 = mutableState16;
            mutableState9 = mutableState22;
            mutableState10 = collectAsState3;
            gapComposer.updateRememberedValue(offersHomePresenter$models$8$1);
        } else {
            mutableState8 = mutableState16;
            mutableState9 = mutableState22;
            offersHomePresenter$models$8$1 = rememberedValue24;
            mutableState10 = collectAsState3;
            mutableState7 = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) offersHomePresenter$models$8$1);
        String str6 = str;
        boolean changedInstance6 = gapComposer.changedInstance(this) | gapComposer.changed(booleanValue) | gapComposer.changed(str6) | gapComposer.changed(mutableState10) | gapComposer.changed(mutableState14) | gapComposer.changed(mutableState7);
        Object rememberedValue25 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue25 == neverEqualPolicy) {
            mutableState11 = mutableState5;
            PasscodePresenter$models$3$1 passcodePresenter$models$3$1 = new PasscodePresenter$models$3$1(this, booleanValue, str6, mutableState10, mutableState14, mutableState7, mutableState11, null, 2);
            gapComposer.updateRememberedValue(passcodePresenter$models$3$1);
            rememberedValue25 = passcodePresenter$models$3$1;
        } else {
            mutableState11 = mutableState5;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue25);
        OffersHomeViewModel offersHomeViewModel = new OffersHomeViewModel(((Boolean) mutableState11.getValue()).booleanValue(), (String) mutableState9.getValue(), (OffersHomeListingViewModel) mutableState8.getValue(), uiCallbackModel, this.stringManager.get(R.string.offers_tab_home_toolbar_title), ((Boolean) mutableState18.getValue()).booleanValue());
        gapComposer.end(false);
        return offersHomeViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider analyticsFactory;
        public final DoubleCheck analyticsHelper;
        public final Provider boostRepository;
        public final Provider clientRouteParser;
        public final Provider clientSyncer;
        public final LambdaProvider clock;
        public final Provider launcher;
        public final Provider offersPopupMessageDismisser;
        public final Provider offersSearchPresenterFactory;
        public final Provider offersTabRefresher;
        public final DoubleCheck offersTabRepository;
        public final Provider pendingAppMessages;
        public final Provider routerFactory;
        public final Provider spanManager;
        public final LambdaProvider stringManager;

        public MetroFactory(RealAppLockState.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealTabProvider.MetroFactory metroFactory2, DelegateFactory delegateFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, CashNavigationLogger.MetroFactory metroFactory3, RealBadger2.MetroFactory metroFactory4, RepeatTaskExecutor.MetroFactory metroFactory5, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck5, InstanceFactory instanceFactory) {
            this.offersTabRefresher = metroFactory;
            this.stringManager = lambdaProvider;
            this.offersTabRepository = doubleCheck;
            this.launcher = metroFactory2;
            this.clientRouteParser = delegateFactory;
            this.clock = lambdaProvider2;
            this.spanManager = doubleCheck2;
            this.clientSyncer = doubleCheck3;
            this.routerFactory = metroFactory3;
            this.analyticsFactory = metroFactory4;
            this.boostRepository = metroFactory5;
            this.pendingAppMessages = doubleCheck4;
            this.offersPopupMessageDismisser = lambdaProvider3;
            this.analyticsHelper = doubleCheck5;
            this.offersSearchPresenterFactory = instanceFactory;
        }

        public MetroFactory(NavigationSideEffects.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, RealFlowTokenGenerator.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider5, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.pendingAppMessages = metroFactory;
            this.stringManager = lambdaProvider;
            this.offersTabRepository = doubleCheck;
            this.analyticsHelper = doubleCheck2;
            this.clock = lambdaProvider2;
            this.clientRouteParser = doubleCheck3;
            this.offersTabRefresher = metroFactory2;
            this.launcher = metroFactory3;
            this.offersPopupMessageDismisser = lambdaProvider3;
            this.analyticsFactory = lambdaProvider4;
            this.spanManager = musicViewFactory$MetroFactory;
            this.offersSearchPresenterFactory = lambdaProvider5;
            this.boostRepository = doubleCheck4;
            this.clientSyncer = instanceFactory;
            this.routerFactory = instanceFactory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, ShiftsAnalytics.MetroFactory metroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory2, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider5) {
            this.offersTabRepository = doubleCheck;
            this.offersTabRefresher = metroFactory;
            this.launcher = instanceFactory;
            this.stringManager = lambdaProvider;
            this.clock = lambdaProvider2;
            this.spanManager = musicViewFactory$MetroFactory;
            this.analyticsHelper = doubleCheck2;
            this.clientRouteParser = doubleCheck3;
            this.clientSyncer = instanceFactory2;
            this.boostRepository = doubleCheck4;
            this.offersPopupMessageDismisser = lambdaProvider3;
            this.analyticsFactory = lambdaProvider4;
            this.pendingAppMessages = doubleCheck5;
            this.routerFactory = instanceFactory3;
            this.offersSearchPresenterFactory = lambdaProvider5;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck5, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, RealKnotLauncher.MetroFactory metroFactory2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3) {
            this.offersTabRepository = doubleCheck;
            this.stringManager = lambdaProvider;
            this.analyticsHelper = doubleCheck2;
            this.clientRouteParser = doubleCheck3;
            this.boostRepository = doubleCheck4;
            this.clock = lambdaProvider2;
            this.offersTabRefresher = doubleCheck5;
            this.launcher = metroFactory;
            this.pendingAppMessages = doubleCheck6;
            this.offersPopupMessageDismisser = doubleCheck7;
            this.spanManager = musicViewFactory$MetroFactory;
            this.clientSyncer = metroFactory2;
            this.routerFactory = instanceFactory;
            this.analyticsFactory = instanceFactory2;
            this.offersSearchPresenterFactory = instanceFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealCardDetailsCreator.MetroFactory metroFactory2, InstanceFactory instanceFactory, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, LambdaProvider lambdaProvider2, RealBrazeConfigurator.MetroFactory metroFactory3, RealSandboxer.MetroFactory metroFactory4, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory2) {
            this.offersTabRepository = doubleCheck;
            this.analyticsHelper = doubleCheck2;
            this.offersTabRefresher = metroFactory;
            this.clientRouteParser = doubleCheck3;
            this.stringManager = lambdaProvider;
            this.boostRepository = doubleCheck4;
            this.pendingAppMessages = doubleCheck5;
            this.launcher = metroFactory2;
            this.spanManager = instanceFactory;
            this.offersPopupMessageDismisser = realLiteCashInRepo$MetroFactory;
            this.clock = lambdaProvider2;
            this.clientSyncer = metroFactory3;
            this.routerFactory = metroFactory4;
            this.analyticsFactory = lambdaProvider3;
            this.offersSearchPresenterFactory = instanceFactory2;
        }
    }
}
