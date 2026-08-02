package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSearchQueries$forId$2;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealOffersSearchPresenter implements MoleculeCallbackPresenter {
    public final RealOffersAnalytics analytics;
    public final RealOffersAnalyticsHelper analyticsHelper;
    public final Screen args;
    public final RealBoostRepository boostRepository;
    public final ParcelableSnapshotMutableState isLoadingFullscreen$delegate;
    public final ParcelableSnapshotMutableState isLoadingSearchResults$delegate;
    public final ParcelableSnapshotMutableState isRestoringFromSearchMode$delegate;
    public final ParcelableSnapshotMutableState isSearchMode$delegate;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final RealOffersTabRefresher offersTabRefresher;
    public final RealOffersTabRepository offersTabRepository;
    public final RealRouter router;
    public final ParcelableSnapshotMutableState searchFilterTokens$delegate;
    public final long searchInputDelay;
    public SpanTracking spanTracking;
    public final AndroidStringManager stringManager;
    public final RealOffersSearchPresenter$$ExternalSyntheticLambda4 trackingAction;
    public final RealSearchTrackingManager trackingManager;

    public RealOffersSearchPresenter(OffersScreen$OffersHomeScreen offersScreen$OffersHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, RealOffersAnalyticsHelper realOffersAnalyticsHelper, long j, RealOffersTabRepository realOffersTabRepository, AndroidStringManager androidStringManager, RealBoostRepository realBoostRepository, RealOffersTabRefresher realOffersTabRefresher, RealRouter$Factory$Impl realRouter$Factory$Impl, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl, RealObservabilityManager realObservabilityManager, RealSearchTrackingManager realSearchTrackingManager) {
        offersScreen$OffersHomeScreen.getClass();
        this.args = offersScreen$OffersHomeScreen;
        this.navigator = screenNavigator;
        this.analyticsHelper = realOffersAnalyticsHelper;
        this.searchInputDelay = j;
        this.offersTabRepository = realOffersTabRepository;
        this.stringManager = androidStringManager;
        this.boostRepository = realBoostRepository;
        this.offersTabRefresher = realOffersTabRefresher;
        this.observabilityManager = realObservabilityManager;
        this.trackingManager = realSearchTrackingManager;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.analytics = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersHomeScreen);
        Boolean bool = Boolean.FALSE;
        this.isSearchMode$delegate = Updater.mutableStateOf$default(bool);
        this.isRestoringFromSearchMode$delegate = Updater.mutableStateOf$default(bool);
        this.searchFilterTokens$delegate = Updater.mutableStateOf$default("");
        this.isLoadingFullscreen$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.isLoadingSearchResults$delegate = Updater.mutableStateOf$default(bool);
        this.trackingAction = new RealOffersSearchPresenter$$ExternalSyntheticLambda4(this, 1);
    }

    public static final void access$recordSearchSpan(RealOffersSearchPresenter realOffersSearchPresenter, String str, RealOffersSearchPresenter$Companion$SearchResult realOffersSearchPresenter$Companion$SearchResult) {
        SpanTracking spanTracking = realOffersSearchPresenter.spanTracking;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsKt.mapOf(new Pair("search_query", str), new Pair("results", realOffersSearchPresenter$Companion$SearchResult.value)), 1);
        }
    }

    public final OffersSearchViewModel.OffersSearchListViewModel.Error constructSearchErrorViewModel(ApiResult.Failure failure) {
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        boolean z = failure instanceof ApiResult.Failure.NetworkFailure;
        AndroidStringManager androidStringManager = this.stringManager;
        return new OffersSearchViewModel.OffersSearchListViewModel.Error(new OffersMessageViewModel("offers_search_error_message", smallPersistentVector, new StyledText(z ? androidStringManager.get(R.string.offers_tab_network_error_title) : androidStringManager.get(R.string.offers_tab_generic_error_title), (Color) null, 6), null, null, new Button(null, null, null, null, null, new StyledText(androidStringManager.get(R.string.offers_tab_error_action_button_text), (Color) null, 6), null, 991)));
    }

    public final String getSearchFilterTokens() {
        return (String) this.searchFilterTokens$delegate.getValue();
    }

    public final boolean isSearchMode() {
        return ((Boolean) this.isSearchMode$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel] */
    /* JADX WARN: Type inference failed for: r25v3, types: [kotlin.coroutines.Continuation] */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        List split$default;
        UiCallbackModel uiCallbackModel;
        Object obj;
        String str;
        UiCallbackModel uiCallbackModel2;
        Object obj2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        MutableState mutableState4;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2;
        NeverEqualPolicy neverEqualPolicy;
        MutableState mutableState5;
        boolean z;
        GapComposer gapComposer;
        MutableState mutableState6;
        Object obj3;
        Object obj4;
        final int i;
        Object obj5;
        MutableState mutableState7;
        MutableState mutableState8;
        Object obj6;
        String str2;
        Unit unit;
        Integer num;
        Set set;
        StateFlow stateFlow;
        NeverEqualPolicy neverEqualPolicy2;
        MutableState mutableState9;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-901791572);
        Object rememberedValue = gapComposer2.rememberedValue();
        UiCallbackModel uiCallbackModel3 = null;
        NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
        Object obj7 = rememberedValue;
        if (rememberedValue == neverEqualPolicy3) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj7 = mutableStateOf$default;
        }
        MutableState mutableState10 = (MutableState) obj7;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy3) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj8 = mutableStateOf$default2;
        }
        MutableState mutableState11 = (MutableState) obj8;
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj9 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy3) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(createCompositionCoroutineScope);
            obj9 = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj9;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        char c = 0;
        Object obj10 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy3) {
            ReadonlyStateFlow stateIn = FlowKt.stateIn(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.boostRepository.boostProvider.getBoostSlots(false), 16), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
            gapComposer2.updateRememberedValue(stateIn);
            obj10 = stateIn;
        }
        StateFlow stateFlow2 = (StateFlow) obj10;
        boolean z2 = true;
        MutableState collectAsState = Updater.collectAsState(stateFlow2, null, gapComposer2, 1);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj11 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy3) {
            RealOffersTabRepository realOffersTabRepository = this.offersTabRepository;
            GpsConfigQueries gpsConfigQueries = realOffersTabRepository.cashDatabase.offersSearchQueries;
            gpsConfigQueries.getClass();
            OffersSearchQueries$forId$2 offersSearchQueries$forId$2 = OffersSearchQueries$forId$2.INSTANCE;
            int i2 = 5;
            SafeFlow flow = DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(gpsConfigQueries, 1L, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, c), i2));
            CoroutineContext coroutineContext = realOffersTabRepository.ioDispatcher;
            FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(flow, coroutineContext);
            gpsConfigQueries.getClass();
            SupportHomePresenter$models$lambda$5$$inlined$map$1 supportHomePresenter$models$lambda$5$$inlined$map$1 = new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrNull, DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(gpsConfigQueries, 2L, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, c), i2)), coroutineContext), new CardModelView.AnonymousClass1.AnonymousClass4(), c), 7);
            gapComposer2.updateRememberedValue(supportHomePresenter$models$lambda$5$$inlined$map$1);
            obj11 = supportHomePresenter$models$lambda$5$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj11, new FilterGroupSection((List) null, 3), null, gapComposer2, 0, 2);
        gapComposer2.startReplaceGroup(961721353);
        boolean changed = gapComposer2.changed(getSearchFilterTokens());
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Object obj12 = rememberedValue6;
        if (changed || rememberedValue6 == neverEqualPolicy3) {
            split$default = StringsKt__StringsKt.split$default(getSearchFilterTokens(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            for (Object obj13 : split$default) {
                if (!StringsKt.isBlank((String) obj13)) {
                    arrayList.add(obj13);
                }
            }
            Set set2 = CollectionsKt.toSet(arrayList);
            gapComposer2.updateRememberedValue(set2);
            obj12 = set2;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState((Set) obj12, gapComposer2);
        gapComposer2.end(false);
        boolean changed2 = gapComposer2.changed((FilterGroupSection) collectAsState2.getValue()) | gapComposer2.changed((Set) rememberUpdatedState.getValue());
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue7 == neverEqualPolicy3) {
            FilterGroupSection filterGroupSection = (FilterGroupSection) collectAsState2.getValue();
            Set set3 = (Set) rememberUpdatedState.getValue();
            filterGroupSection.getClass();
            set3.getClass();
            List<FilterGroupSection.FilterGroupItem> list = filterGroupSection.filter_group_items;
            ArrayList arrayList2 = new ArrayList();
            for (FilterGroupSection.FilterGroupItem filterGroupItem : list) {
                boolean z3 = z2;
                UiCallbackModel uiCallbackModel4 = uiCallbackModel3;
                FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupItem.sheet;
                if (sheet == null) {
                    uiCallbackModel2 = uiCallbackModel4;
                } else {
                    Iterator it = sheet.filter_items.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = uiCallbackModel4;
                            break;
                        }
                        obj = it.next();
                        if (CollectionsKt.contains(set3, ((FilterGroupSection.FilterGroupItem.FilterItem) obj).filter_token)) {
                            break;
                        }
                    }
                    FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj;
                    if (filterItem != null) {
                        str = filterItem.name;
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterItem.name == null");
                            return uiCallbackModel4;
                        }
                    } else {
                        str = filterGroupItem.default_name;
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterGroupItem.default_name == null");
                            return uiCallbackModel4;
                        }
                    }
                    uiCallbackModel2 = new OffersSearchFilterGroupViewModel(str, filterItem != null ? z3 : false);
                }
                if (uiCallbackModel2 != null) {
                    arrayList2.add(uiCallbackModel2);
                }
                z2 = z3;
                uiCallbackModel3 = uiCallbackModel4;
            }
            uiCallbackModel = uiCallbackModel3;
            FilterGroupsSectionViewModel filterGroupsSectionViewModel = new FilterGroupsSectionViewModel(arrayList2, !arrayList2.isEmpty());
            gapComposer2.updateRememberedValue(filterGroupsSectionViewModel);
            obj2 = filterGroupsSectionViewModel;
        } else {
            uiCallbackModel = null;
            obj2 = rememberedValue7;
        }
        FilterGroupsSectionViewModel filterGroupsSectionViewModel2 = (FilterGroupsSectionViewModel) obj2;
        Object rememberedValue8 = gapComposer2.rememberedValue();
        int i3 = 4;
        Object obj14 = rememberedValue8;
        if (rememberedValue8 == neverEqualPolicy3) {
            DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new OverlayKt$$ExternalSyntheticLambda1(i3, collectAsState2));
            gapComposer2.updateRememberedValue(derivedStateOf);
            obj14 = derivedStateOf;
        }
        State state = (State) obj14;
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj15 = rememberedValue9;
        if (rememberedValue9 == neverEqualPolicy3) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(OffersSearchViewModel.OffersSearchListViewModel.Initial.INSTANCE);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj15 = mutableStateOf$default3;
        }
        MutableState mutableState12 = (MutableState) obj15;
        Object rememberedValue10 = gapComposer2.rememberedValue();
        Object obj16 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy3) {
            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default4);
            obj16 = mutableStateOf$default4;
        }
        MutableState mutableState13 = (MutableState) obj16;
        Object rememberedValue11 = gapComposer2.rememberedValue();
        Object obj17 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy3) {
            obj17 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj17;
        Object rememberedValue12 = gapComposer2.rememberedValue();
        Object obj18 = rememberedValue12;
        if (rememberedValue12 == neverEqualPolicy3) {
            ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(uiCallbackModel);
            gapComposer2.updateRememberedValue(mutableStateOf$default5);
            obj18 = mutableStateOf$default5;
        }
        MutableState mutableState14 = (MutableState) obj18;
        Object rememberedValue13 = gapComposer2.rememberedValue();
        Object obj19 = rememberedValue13;
        if (rememberedValue13 == neverEqualPolicy3) {
            obj19 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj19;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.isLoadingFullscreen$delegate;
        Boolean bool = (Boolean) parcelableSnapshotMutableState3.getValue();
        bool.getClass();
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(bool, gapComposer2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = this.isLoadingSearchResults$delegate;
        Boolean bool2 = (Boolean) parcelableSnapshotMutableState4.getValue();
        bool2.getClass();
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(bool2, gapComposer2);
        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Boolean.valueOf(isSearchMode()), gapComposer2);
        if (isSearchMode()) {
            gapComposer2.startReplaceGroup(-249783828);
            Object[] objArr = new Object[0];
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (rememberedValue14 == neverEqualPolicy3) {
                mutableState6 = mutableState12;
                P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda2 = new P2PListViewKt$$ExternalSyntheticLambda2(5);
                gapComposer2.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda2);
                obj3 = p2PListViewKt$$ExternalSyntheticLambda2;
            } else {
                mutableState6 = mutableState12;
                obj3 = rememberedValue14;
            }
            MutableState mutableState15 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj3, gapComposer2, 48);
            Object[] objArr2 = new Object[0];
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy3) {
                parcelableSnapshotMutableState = parcelableSnapshotMutableState4;
                P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda22 = new P2PListViewKt$$ExternalSyntheticLambda2(6);
                gapComposer2.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda22);
                obj4 = p2PListViewKt$$ExternalSyntheticLambda22;
            } else {
                parcelableSnapshotMutableState = parcelableSnapshotMutableState4;
                obj4 = rememberedValue15;
            }
            MutableState mutableState16 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) obj4, gapComposer2, 48);
            Object rememberedValue16 = gapComposer2.rememberedValue();
            Object obj20 = rememberedValue16;
            if (rememberedValue16 == neverEqualPolicy3) {
                Boolean bool3 = (Boolean) mutableState16.getValue();
                bool3.getClass();
                ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(bool3);
                gapComposer2.updateRememberedValue(mutableStateOf$default6);
                obj20 = mutableStateOf$default6;
            }
            MutableState mutableState17 = (MutableState) obj20;
            Object[] objArr3 = new Object[0];
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue17 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue17 == neverEqualPolicy3) {
                mutableState4 = mutableState13;
                i = 0;
                Function0 function0 = new Function0(this) { // from class: com.squareup.cash.offers.presenters.RealOffersSearchPresenter$$ExternalSyntheticLambda3
                    public final /* synthetic */ RealOffersSearchPresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = i;
                        RealOffersSearchPresenter realOffersSearchPresenter = this.f$0;
                        switch (i4) {
                            case 0:
                                return Updater.mutableStateOf$default(realOffersSearchPresenter.analyticsHelper.activeShopSessionId());
                            default:
                                if (!realOffersSearchPresenter.isSearchMode()) {
                                    realOffersSearchPresenter.isLoadingFullscreen$delegate.setValue(Boolean.TRUE);
                                    realOffersSearchPresenter.spanTracking = null;
                                    realOffersSearchPresenter.trackingManager.onAction(TrackingAction.TerminateTracking.INSTANCE);
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(function0);
                obj5 = function0;
            } else {
                mutableState4 = mutableState13;
                i = 0;
                obj5 = rememberedValue17;
            }
            MutableState mutableState18 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) obj5, gapComposer2, i);
            Unit unit2 = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState18);
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue18 == neverEqualPolicy3) {
                ?? r25 = uiCallbackModel;
                mutableState7 = mutableState11;
                mutableState8 = mutableState14;
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1(this, mutableState18, r25, 4);
                gapComposer2.updateRememberedValue(mainPaymentView$Content$2$1);
                obj6 = mainPaymentView$Content$2$1;
            } else {
                mutableState8 = mutableState14;
                mutableState7 = mutableState11;
                obj6 = rememberedValue18;
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) obj6);
            String str3 = (String) mutableState10.getValue();
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            Set set4 = (Set) rememberUpdatedState.getValue();
            boolean changed3 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changedInstance(this) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(mutableState16) | gapComposer2.changed(mutableState15) | gapComposer2.changed(collectAsState);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue19 == neverEqualPolicy3) {
                str2 = str3;
                unit = unit2;
                num = valueOf;
                set = set4;
                stateFlow = stateFlow2;
                neverEqualPolicy2 = neverEqualPolicy3;
                MutableState mutableState19 = mutableState7;
                mutableState = collectAsState2;
                MutableState mutableState20 = mutableState6;
                MutableState mutableState21 = mutableState8;
                gapComposer = gapComposer2;
                parcelableSnapshotMutableState2 = parcelableSnapshotMutableState3;
                rememberedValue19 = new RealOffersSearchPresenter$models$2$1(this, mutableState10, rememberUpdatedState, mutableState17, mutableState21, mutableState4, mutableState19, rememberUpdatedState2, mutableState20, mutableState16, mutableState15, parcelableSnapshotMutableIntState2, collectAsState, null);
                mutableState5 = mutableState10;
                mutableState2 = rememberUpdatedState;
                mutableState9 = mutableState21;
                mutableState3 = mutableState20;
                gapComposer.updateRememberedValue(rememberedValue19);
            } else {
                str2 = str3;
                unit = unit2;
                num = valueOf;
                set = set4;
                parcelableSnapshotMutableState2 = parcelableSnapshotMutableState3;
                stateFlow = stateFlow2;
                neverEqualPolicy2 = neverEqualPolicy3;
                mutableState = collectAsState2;
                mutableState5 = mutableState10;
                gapComposer = gapComposer2;
                mutableState2 = rememberUpdatedState;
                mutableState3 = mutableState6;
                mutableState9 = mutableState8;
            }
            Updater.LaunchedEffect(str2, num, set, (Function2) rememberedValue19, gapComposer);
            StateFlow stateFlow3 = stateFlow;
            boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changedInstance(stateFlow3);
            Object rememberedValue20 = gapComposer.rememberedValue();
            neverEqualPolicy = neverEqualPolicy2;
            if (changedInstance3 || rememberedValue20 == neverEqualPolicy) {
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(this, stateFlow3, mutableState9, mutableState3, (Continuation) null, 19);
                gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                rememberedValue20 = moleculeKt$immediateClockFlow$1$1$1;
            }
            Unit unit3 = unit;
            Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue20);
            boolean changedInstance4 = gapComposer.changedInstance(this);
            Object rememberedValue21 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue21 == neverEqualPolicy) {
                z = false;
                rememberedValue21 = new RealOffersSearchPresenter$$ExternalSyntheticLambda4(this, false ? 1 : 0);
                gapComposer.updateRememberedValue(rememberedValue21);
            } else {
                z = false;
            }
            Updater.DisposableEffect(unit3, (Function1) rememberedValue21, gapComposer);
            gapComposer.end(z);
        } else {
            mutableState = collectAsState2;
            mutableState2 = rememberUpdatedState;
            mutableState3 = mutableState12;
            parcelableSnapshotMutableState = parcelableSnapshotMutableState4;
            mutableState4 = mutableState13;
            parcelableSnapshotMutableState2 = parcelableSnapshotMutableState3;
            neverEqualPolicy = neverEqualPolicy3;
            mutableState5 = mutableState10;
            z = false;
            gapComposer = gapComposer2;
            gapComposer.startReplaceGroup(-242947274);
            gapComposer.end(false);
        }
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue22 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue22 == neverEqualPolicy) {
            final int i4 = 1;
            rememberedValue22 = new Function0(this) { // from class: com.squareup.cash.offers.presenters.RealOffersSearchPresenter$$ExternalSyntheticLambda3
                public final /* synthetic */ RealOffersSearchPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i42 = i4;
                    RealOffersSearchPresenter realOffersSearchPresenter = this.f$0;
                    switch (i42) {
                        case 0:
                            return Updater.mutableStateOf$default(realOffersSearchPresenter.analyticsHelper.activeShopSessionId());
                        default:
                            if (!realOffersSearchPresenter.isSearchMode()) {
                                realOffersSearchPresenter.isLoadingFullscreen$delegate.setValue(Boolean.TRUE);
                                realOffersSearchPresenter.spanTracking = null;
                                realOffersSearchPresenter.trackingManager.onAction(TrackingAction.TerminateTracking.INSTANCE);
                            }
                            return Unit.INSTANCE;
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue22);
        }
        Updater.SideEffect((Function0) rememberedValue22, gapComposer);
        Object rememberedValue23 = gapComposer.rememberedValue();
        if (rememberedValue23 == neverEqualPolicy) {
            rememberedValue23 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue23);
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue23;
        OffersSearchViewModel offersSearchViewModel = new OffersSearchViewModel(isSearchMode(), getSearchFilterTokens(), filterGroupsSectionViewModel2, (OffersSearchViewModel.OffersSearchListViewModel) mutableState3.getValue(), parcelableSnapshotMutableIntState2.getIntValue(), ((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue(), ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue());
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (rememberedValue24 == neverEqualPolicy) {
            rememberedValue24 = new DocumentQueries$$ExternalSyntheticLambda0(this, coroutineScope2, mutableState5, rememberUpdatedState4, mutableState, mutableState2, rememberUpdatedState3, parcelableSnapshotMutableIntState, mutableState4, state);
            gapComposer.updateRememberedValue(rememberedValue24);
        }
        UiCallbackModel uiCallbackModel5 = new UiCallbackModel((Function1) rememberedValue24, offersSearchViewModel);
        gapComposer.end(z);
        return uiCallbackModel5;
    }
}
