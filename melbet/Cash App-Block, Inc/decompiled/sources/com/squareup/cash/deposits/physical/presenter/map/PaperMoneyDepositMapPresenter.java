package com.squareup.cash.deposits.physical.presenter.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.address.typeahead.backend.api.Coordinates;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeInfo;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashLimitReachedScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.deposits.physical.screens.SwipeToLoadOnboardingScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$MapDataViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$ViewTextViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PaperMoneyDepositMapScreen args;
    public final RealCashDepositBarcodeManager barcodeManager;
    public final CashMapPresenter cashMapPresenter;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final RealLocationSearchClient locationSearchClient;
    public final PaperCashDepositBlocker.MapScreen mapScreen;
    public final BetterNavigator.ScreenNavigator navigator;
    public final KeyValue onboardingLastViewedAt;
    public final BooleanPreference onboardingViewedCache;
    public final PhysicalDepositUsAddressSearchQueries physicalDepositUsAddressSearchQueries;
    public final zzb retailerLocationManager;
    public final AndroidStringManager stringManager;

    public PaperMoneyDepositMapPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, RealCashDepositBarcodeManager realCashDepositBarcodeManager, zzb zzbVar, RealLocationSearchClient realLocationSearchClient, AndroidClock androidClock, AndroidStringManager androidStringManager, Analytics analytics, CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl, KeyValue keyValue, BooleanPreference booleanPreference, PaperMoneyDepositMapScreen paperMoneyDepositMapScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        paperMoneyDepositMapScreen.getClass();
        this.ioDispatcher = coroutineContext;
        this.barcodeManager = realCashDepositBarcodeManager;
        this.retailerLocationManager = zzbVar;
        this.locationSearchClient = realLocationSearchClient;
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.onboardingLastViewedAt = keyValue;
        this.onboardingViewedCache = booleanPreference;
        this.args = paperMoneyDepositMapScreen;
        this.navigator = screenNavigator;
        BlockersData blockersData = paperMoneyDepositMapScreen.blockersData;
        String nextBlockerId = blockersData.getNextBlockerId();
        ClientScenario clientScenario = blockersData.clientScenario;
        String name = clientScenario != null ? clientScenario.name() : null;
        String str = blockersData.flowToken;
        PaperCashDepositBlocker.MapScreen mapScreen = paperMoneyDepositMapScreen.paperCashDepositBlocker.map_screen;
        mapScreen.getClass();
        this.mapScreen = mapScreen;
        this.physicalDepositUsAddressSearchQueries = cashAccountDatabaseImpl.physicalDepositUsAddressSearchQueries;
        String str2 = mapScreen.location_disabled_title_text;
        str2.getClass();
        String str3 = mapScreen.location_disabled_detail_text;
        str3.getClass();
        String str4 = mapScreen.location_disabled_settings_text;
        str4.getClass();
        this.cashMapPresenter = cashMapPresenter$Factory$Impl.create(screenNavigator, new LocationDeniedScreen(str2, str3, str4, mapScreen.location_disabled_ignore_text, nextBlockerId, name, str), new EnumListAdapter$encode$1(1, this, PaperMoneyDepositMapPresenter.class, "pmdGrantLocationPermissionEvent", "pmdGrantLocationPermissionEvent(Z)Lcom/squareup/cash/cdf/Event;", 0, 3), "PMD_FINDER", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$centerOnSearchAddress(PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, SelectedSearchAddressResult selectedSearchAddressResult, ContinuationImpl continuationImpl) {
        PaperMoneyDepositMapPresenter$centerOnSearchAddress$1 paperMoneyDepositMapPresenter$centerOnSearchAddress$1;
        int i;
        SelectedSearchAddressResult selectedSearchAddressResult2;
        SearchLocation searchLocation;
        LocationSearchClient$LocationDetailsResult locationSearchClient$LocationDetailsResult;
        LocationSearchClient$LocationDetailsResult locationSearchClient$LocationDetailsResult2;
        AndroidStringManager androidStringManager = paperMoneyDepositMapPresenter.stringManager;
        if (continuationImpl instanceof PaperMoneyDepositMapPresenter$centerOnSearchAddress$1) {
            paperMoneyDepositMapPresenter$centerOnSearchAddress$1 = (PaperMoneyDepositMapPresenter$centerOnSearchAddress$1) continuationImpl;
            int i2 = paperMoneyDepositMapPresenter$centerOnSearchAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paperMoneyDepositMapPresenter$centerOnSearchAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                PaperMoneyDepositMapPresenter$centerOnSearchAddress$1 paperMoneyDepositMapPresenter$centerOnSearchAddress$12 = paperMoneyDepositMapPresenter$centerOnSearchAddress$1;
                Object obj = paperMoneyDepositMapPresenter$centerOnSearchAddress$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paperMoneyDepositMapPresenter$centerOnSearchAddress$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SearchLocation searchLocation2 = new SearchLocation(selectedSearchAddressResult.identifier, selectedSearchAddressResult.primaryText, selectedSearchAddressResult.secondaryText, selectedSearchAddressResult.fullText);
                    RealLocationSearchClient realLocationSearchClient = paperMoneyDepositMapPresenter.locationSearchClient;
                    LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId = selectedSearchAddressResult.sessionId;
                    paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$0 = selectedSearchAddressResult;
                    paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$1 = searchLocation2;
                    paperMoneyDepositMapPresenter$centerOnSearchAddress$12.label = 1;
                    Object details = realLocationSearchClient.getDetails(locationSearchClient$SessionId$GoogleSessionId, searchLocation2, paperMoneyDepositMapPresenter$centerOnSearchAddress$12);
                    if (details != coroutineSingletons) {
                        selectedSearchAddressResult2 = selectedSearchAddressResult;
                        searchLocation = searchLocation2;
                        obj = details;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    locationSearchClient$LocationDetailsResult2 = paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                    Coordinates coordinates = ((LocationSearchClient$LocationDetailsResult.Success) locationSearchClient$LocationDetailsResult2).location.coordinates;
                    return new LocationViewModel(coordinates.latitude, coordinates.longitude, 12.5f);
                }
                searchLocation = paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$1;
                SelectedSearchAddressResult selectedSearchAddressResult3 = paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$0;
                SafeTrace.throwOnFailure(obj);
                selectedSearchAddressResult2 = selectedSearchAddressResult3;
                locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj;
                Continuation continuation = null;
                if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
                    if (!Intrinsics.areEqual(locationSearchClient$LocationDetailsResult, LocationSearchClient$LocationDetailsResult.Failure.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    paperMoneyDepositMapPresenter.navigator.goTo(new PhysicalDepositErrorScreen(androidStringManager.get(R.string.error_loading_address), androidStringManager.get(R.string.error_loading_address_description), androidStringManager.get(R.string.cancel), androidStringManager.get(R.string.retry), selectedSearchAddressResult2));
                    return null;
                }
                CoroutineContext coroutineContext = paperMoneyDepositMapPresenter.ioDispatcher;
                LocationSearchClient$LocationDetailsResult.Success success = (LocationSearchClient$LocationDetailsResult.Success) locationSearchClient$LocationDetailsResult;
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(paperMoneyDepositMapPresenter, success, searchLocation, continuation, 1);
                paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$0 = null;
                paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$1 = null;
                paperMoneyDepositMapPresenter$centerOnSearchAddress$12.L$2 = success;
                paperMoneyDepositMapPresenter$centerOnSearchAddress$12.label = 2;
                if (JobKt.withContext(coroutineContext, gLSceneScopeProvider$SceneScope$2$1$1, paperMoneyDepositMapPresenter$centerOnSearchAddress$12) != coroutineSingletons) {
                    locationSearchClient$LocationDetailsResult2 = locationSearchClient$LocationDetailsResult;
                    Coordinates coordinates2 = ((LocationSearchClient$LocationDetailsResult.Success) locationSearchClient$LocationDetailsResult2).location.coordinates;
                    return new LocationViewModel(coordinates2.latitude, coordinates2.longitude, 12.5f);
                }
                return coroutineSingletons;
            }
        }
        paperMoneyDepositMapPresenter$centerOnSearchAddress$1 = new PaperMoneyDepositMapPresenter$centerOnSearchAddress$1(paperMoneyDepositMapPresenter, continuationImpl);
        PaperMoneyDepositMapPresenter$centerOnSearchAddress$1 paperMoneyDepositMapPresenter$centerOnSearchAddress$122 = paperMoneyDepositMapPresenter$centerOnSearchAddress$1;
        Object obj2 = paperMoneyDepositMapPresenter$centerOnSearchAddress$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paperMoneyDepositMapPresenter$centerOnSearchAddress$122.label;
        if (i != 0) {
        }
        locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj2;
        Continuation continuation2 = null;
        if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (kotlin.time.Duration.m4176toLongimpl(kotlin.time.DurationKt.toDuration(r8.clock.millis() - r2, kotlin.time.DurationUnit.MILLISECONDS), kotlin.time.DurationUnit.DAYS) >= 30) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initialNavigation(PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, ContinuationImpl continuationImpl) {
        PaperMoneyDepositMapPresenter$initialNavigation$1 paperMoneyDepositMapPresenter$initialNavigation$1;
        int i;
        boolean z;
        long longValue;
        boolean z2;
        FormBlocker formBlocker;
        BetterNavigator.ScreenNavigator screenNavigator = paperMoneyDepositMapPresenter.navigator;
        PaperMoneyDepositMapScreen paperMoneyDepositMapScreen = paperMoneyDepositMapPresenter.args;
        if (continuationImpl instanceof PaperMoneyDepositMapPresenter$initialNavigation$1) {
            paperMoneyDepositMapPresenter$initialNavigation$1 = (PaperMoneyDepositMapPresenter$initialNavigation$1) continuationImpl;
            int i2 = paperMoneyDepositMapPresenter$initialNavigation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paperMoneyDepositMapPresenter$initialNavigation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paperMoneyDepositMapPresenter$initialNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paperMoneyDepositMapPresenter$initialNavigation$1.label;
                z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = paperMoneyDepositMapPresenter.onboardingLastViewedAt;
                    paperMoneyDepositMapPresenter$initialNavigation$1.label = 1;
                    obj = keyValue.get(paperMoneyDepositMapPresenter$initialNavigation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                longValue = ((Number) obj).longValue();
                if (longValue != 0) {
                    Duration.Companion companion = Duration.Companion;
                }
                z = false;
                z2 = paperMoneyDepositMapPresenter.onboardingViewedCache.get();
                if (!z && (formBlocker = paperMoneyDepositMapScreen.paperCashDepositBlocker.swipe_to_load_blocker) != null) {
                    screenNavigator.goTo(new SwipeToLoadOnboardingScreen(formBlocker, paperMoneyDepositMapScreen.blockersData));
                } else if (z2) {
                    screenNavigator.goTo(new PaperMoneyDepositOnboardingScreen(paperMoneyDepositMapScreen.paperCashDepositBlocker, paperMoneyDepositMapScreen.blockersData));
                } else {
                    PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog = paperMoneyDepositMapScreen.paperCashDepositBlocker.limits_reached_dialog;
                    if (limitsReachedDialog != null) {
                        screenNavigator.goTo(new PhysicalCashLimitReachedScreen(limitsReachedDialog, paperMoneyDepositMapScreen.blockersData));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        paperMoneyDepositMapPresenter$initialNavigation$1 = new PaperMoneyDepositMapPresenter$initialNavigation$1(paperMoneyDepositMapPresenter, continuationImpl);
        Object obj2 = paperMoneyDepositMapPresenter$initialNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paperMoneyDepositMapPresenter$initialNavigation$1.label;
        z = true;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (longValue != 0) {
        }
        z = false;
        z2 = paperMoneyDepositMapPresenter.onboardingViewedCache.get();
        if (!z) {
        }
        if (z2) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        CashMapViewModel cashMapViewModel;
        Object gLSceneScopeProvider$SceneScope$2$1$1;
        UiCallbackModel uiCallbackModel;
        Continuation continuation;
        List list;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel;
        PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage benefitReinforcementMessage;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-959639182);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(new PaperMoneyDepositMapSectionViewModel$MapDataViewModel(EmptyList.INSTANCE));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState5 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(new PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel());
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState6 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.LocationUpdateViewModel.DEFAULT_LOCATION_VIEW_MODEL);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState7 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState8 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState9 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState10 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState11 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(PaperMoneyDepositMapViewModel.DepositMethodFilter.$ENTRIES);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState12 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = this.barcodeManager.barcodeInfo();
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
        UiCallbackModel models = this.cashMapPresenter.models(gapComposer);
        CashMapViewModel cashMapViewModel2 = (CashMapViewModel) models.model;
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, (Object) this, (Object) collectAsState, mutableState11, mutableState12, 20));
        boolean changedInstance = gapComposer.changedInstance(models);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue10 == obj) {
            cashMapViewModel = cashMapViewModel2;
            gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((Object) models, mutableState9, mutableState10, continuation2, 2);
            uiCallbackModel = models;
            continuation = null;
            gapComposer.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
        } else {
            gLSceneScopeProvider$SceneScope$2$1$1 = rememberedValue10;
            cashMapViewModel = cashMapViewModel2;
            uiCallbackModel = models;
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer, cashMapViewModel, (Function2) gLSceneScopeProvider$SceneScope$2$1$1);
        CashMapViewEvent.MapMovementFinished mapMovementFinished = (CashMapViewEvent.MapMovementFinished) mutableState9.getValue();
        List list2 = (List) mutableState12.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue11 == obj) {
            list = list2;
            mutableState = collectAsState;
            Object offersHomePresenter$models$8$1 = new OffersHomePresenter$models$8$1(mutableState9, this, mutableState8, mutableState12, mutableState5, null);
            mutableState2 = mutableState12;
            mutableState3 = mutableState5;
            gapComposer.updateRememberedValue(offersHomePresenter$models$8$1);
            rememberedValue11 = offersHomePresenter$models$8$1;
        } else {
            list = list2;
            mutableState2 = mutableState12;
            mutableState3 = mutableState5;
            mutableState = collectAsState;
        }
        Updater.LaunchedEffect(mapMovementFinished, list, (Function2) rememberedValue11, gapComposer);
        LocationSelection locationSelection = (LocationSelection) mutableState10.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue12 == obj) {
            mutableState4 = mutableState;
            Object dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1(mutableState10, this, mutableState3, mutableState4, (Continuation) null);
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
            rememberedValue12 = dotGridKt$DotGrid$3$1;
        } else {
            mutableState4 = mutableState;
        }
        Updater.LaunchedEffect(gapComposer, locationSelection, (Function2) rememberedValue12);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj) {
            rememberedValue13 = new HeroTagViewKt$$ExternalSyntheticLambda12(10, mutableState11);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        Function2 function2 = (Function2) rememberedValue13;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changedInstance4 = gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue14 == obj) {
            rememberedValue14 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 21);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue14, gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue15 == obj) {
            rememberedValue15 = new RealProfileManager$setPhoto$2(mutableState11, this, continuation, 28);
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue15);
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue16 == obj) {
            rememberedValue16 = new GooglePayPresenter$models$1$1(this, continuation, 9);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue16);
        PaperMoneyDepositMapSectionViewModel$ViewTextViewModel paperMoneyDepositMapSectionViewModel$ViewTextViewModel = new PaperMoneyDepositMapSectionViewModel$ViewTextViewModel(this.mapScreen);
        PaperMoneyDepositMapSectionViewModel$MapDataViewModel paperMoneyDepositMapSectionViewModel$MapDataViewModel = (PaperMoneyDepositMapSectionViewModel$MapDataViewModel) mutableState3.getValue();
        PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel paperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel = (PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel) mutableState6.getValue();
        PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.LocationUpdateViewModel locationUpdateViewModel = (PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.LocationUpdateViewModel) mutableState7.getValue();
        PaperCashDepositBlocker.MapScreen mapScreen = this.args.paperCashDepositBlocker.map_screen;
        if (mapScreen == null || (benefitReinforcementMessage = mapScreen.benefit_reinforcement_message) == null) {
            paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = continuation;
        } else {
            String str = benefitReinforcementMessage.text;
            str.getClass();
            Icon icon = benefitReinforcementMessage.icon;
            icon.getClass();
            paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = new PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel(icon, str);
        }
        PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = new PaperMoneyDepositMapViewModel(paperMoneyDepositMapSectionViewModel$ViewTextViewModel, paperMoneyDepositMapSectionViewModel$MapDataViewModel, paperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel, locationUpdateViewModel, paperMoneyDepositMapSectionViewModel$FeeInformationViewModel, uiCallbackModel, (List) mutableState2.getValue(), ((BarcodeInfo) mutableState4.getValue()) != null);
        gapComposer.end(false);
        return paperMoneyDepositMapViewModel;
    }
}
