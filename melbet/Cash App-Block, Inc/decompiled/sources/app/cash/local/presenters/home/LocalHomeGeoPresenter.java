package app.cash.local.presenters.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$Factory$Impl;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$Factory$Impl;
import app.cash.local.presenters.wallet.TabContentPresenterKt;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.LocalViewFactory;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.passcode.backend.RealAppLockState;
import coil3.RealImageLoader$execute$2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NeighborhoodsSegmentedTab;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.util.compose.SharedViewEventsKt;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class LocalHomeGeoPresenter implements MoleculePresenter {
    public static final LocationViewModel DEFAULT_LOCATION = new LocationViewModel(45.5231d, -122.6765d, 11.8f);
    public final LocalBrandProfilePresenter$Factory$Impl brandProfilePresenterFactory;
    public final CashMapPresenter$Factory$Impl cashMapPresenterFactory;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final GetNeighborhoodsTabContentResponse response;
    public final boolean segmentedTabEnabled;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;
    public final SharedFlowImpl tabContentEvents = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    public final TabContentPresenter$Factory$Impl tabContentPresenterFactory;

    public LocalHomeGeoPresenter(RealLocalBrandSyncer realLocalBrandSyncer, LocalInstalledStore localInstalledStore, AndroidClock androidClock, CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl, TabContentPresenter$Factory$Impl tabContentPresenter$Factory$Impl, LocalBrandProfilePresenter$Factory$Impl localBrandProfilePresenter$Factory$Impl, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse, BetterNavigator.ScreenNavigator screenNavigator) {
        this.syncer = realLocalBrandSyncer;
        this.store = localInstalledStore;
        this.clock = androidClock;
        this.cashMapPresenterFactory = cashMapPresenter$Factory$Impl;
        this.tabContentPresenterFactory = tabContentPresenter$Factory$Impl;
        this.brandProfilePresenterFactory = localBrandProfilePresenter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.response = getNeighborhoodsTabContentResponse;
        this.navigator = screenNavigator;
        this.segmentedTabEnabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$NeighborhoodsSegmentedTab.INSTANCE)).enabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0309  */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [app.cash.local.viewmodels.home.TabSheetUpperContent] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [com.squareup.protos.cash.local.client.v1.MapboxConfiguration] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalHomeViewModel models(Flow flow, Composer composer, int i) {
        ?? r2;
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        Object obj2;
        boolean changed;
        Object rememberedValue;
        LocalBrandProfilePresenter localBrandProfilePresenter;
        boolean z;
        Object models;
        boolean changed2;
        Object rememberedValue2;
        ?? r19;
        MapboxConfiguration mapboxConfiguration;
        ?? r23;
        boolean changedInstance;
        boolean z2;
        Object obj3;
        BrandCollectionModel.Location location;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1958308329);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 10;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        BrandFollowViewModel brandFollowViewModel = null;
        boolean z3 = false;
        Object obj4 = rememberedValue3;
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1((Object) this, (Continuation) (z3 ? 1 : 0), i2);
            gapComposer.updateRememberedValue(blockRunner$cancel$1);
            obj4 = blockRunner$cancel$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj4);
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = this.response;
        boolean changed3 = gapComposer.changed(getNeighborhoodsTabContentResponse);
        Object rememberedValue4 = gapComposer.rememberedValue();
        LocalInstalledStore localInstalledStore = this.store;
        if (changed3 || rememberedValue4 == neverEqualPolicy) {
            RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).brandCollections, 16), this, 2);
            gapComposer.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$$inlined$map$1);
            rememberedValue4 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1;
        }
        Flow flow2 = (Flow) rememberedValue4;
        BrandCollection brandCollection = getNeighborhoodsTabContentResponse.brand_collection;
        if (brandCollection == null) {
            brandCollection = (BrandCollection) CollectionsKt.firstOrNull(getNeighborhoodsTabContentResponse.brand_collection_sections);
        }
        MutableState collectAsState = Updater.collectAsState(flow2, brandCollection, null, gapComposer, 0, 2);
        BrandCollection brandCollection2 = (BrandCollection) collectAsState.getValue();
        BrandCollection.GeoFence geoFence = brandCollection2 != null ? brandCollection2.geo_fence : null;
        boolean changed4 = gapComposer.changed(geoFence);
        Object rememberedValue5 = gapComposer.rememberedValue();
        AndroidStringManager androidStringManager = this.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        Object obj5 = rememberedValue5;
        if (changed4 || rememberedValue5 == neverEqualPolicy) {
            LocationDeniedScreen locationDeniedScreen = new LocationDeniedScreen(androidStringManager.get(R.string.local_presenters_map_location_permission_title), androidStringManager.get(R.string.local_presenters_map_location_permission_details), androidStringManager.get(R.string.local_presenters_map_location_permission_settings), androidStringManager.get(R.string.local_presenters_map_location_permission_ignore), null, null, null);
            LocationViewModel locationModel = _MoshiKotlinExtensionsKt.toLocationModel(geoFence);
            if (locationModel == null) {
                locationModel = DEFAULT_LOCATION;
            }
            CashMapPresenter create = this.cashMapPresenterFactory.create(screenNavigator, locationDeniedScreen, null, "LOCAL_HOME_GEO", locationModel, _MoshiKotlinExtensionsKt.toLatLngBounds(geoFence));
            gapComposer.updateRememberedValue(create);
            obj5 = create;
        }
        CashMapPresenter cashMapPresenter = (CashMapPresenter) obj5;
        boolean changed5 = gapComposer.changed(getNeighborhoodsTabContentResponse);
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue6;
        if (changed5 || rememberedValue6 == neverEqualPolicy) {
            TabContentPresenter create2 = this.tabContentPresenterFactory.create(getNeighborhoodsTabContentResponse, screenNavigator);
            gapComposer.updateRememberedValue(create2);
            obj6 = create2;
        }
        TabContentPresenter tabContentPresenter = (TabContentPresenter) obj6;
        gapComposer.startMovableGroup(-738588158, geoFence);
        UiCallbackModel models2 = cashMapPresenter.models(gapComposer);
        gapComposer.end(false);
        boolean changed6 = gapComposer.changed((BrandCollection) collectAsState.getValue());
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue7 == neverEqualPolicy) {
            BrandCollection brandCollection3 = (BrandCollection) collectAsState.getValue();
            if (brandCollection3 != null) {
                List list = brandCollection3.locations;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BrandCollectionData.Location brandCollectionLocationData = BrandCollectionDataKt.toBrandCollectionLocationData((BrandCollection.Location) it.next());
                    if (brandCollectionLocationData != null) {
                        arrayList.add(brandCollectionLocationData);
                    }
                }
                r2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    BrandCollectionData.Location location2 = (BrandCollectionData.Location) it2.next();
                    BrandCollectionModel.Location model = TabContentPresenterKt.toModel(location2, this.clock, androidStringManager, brandFollowViewModel);
                    String str5 = location2.category;
                    String str6 = model.address;
                    Iterator it3 = it2;
                    String str7 = location2.clientRoute;
                    String str8 = model.name;
                    String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str5, str6}), " · ", null, null, 0, null, null, 62);
                    LocationStatus locationStatus = model.status;
                    String joinToString$default2 = ((locationStatus instanceof LocationStatus.Open) || (locationStatus instanceof LocationStatus.Closed)) ? CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{locationStatus.getLabel(), locationStatus.getDescription()}), " · ", null, null, 0, null, null, 62) : null;
                    if (joinToString$default2 == null || StringsKt.isBlank(joinToString$default2)) {
                        str = str6;
                        str2 = str8;
                        str3 = null;
                    } else {
                        str3 = joinToString$default2;
                        str = str6;
                        str2 = str8;
                    }
                    if (str == null) {
                        if (str5 == null) {
                            str5 = "";
                        }
                        str4 = str5;
                    } else {
                        str4 = str;
                    }
                    LocalColor localColor = model.backgroundColor;
                    GpsCoordinates gpsCoordinates = location2.gpsCoordinates;
                    r2.add(new LocalHomeGeoViewModel.Location(str7, str2, joinToString$default, str3, str4, localColor, model, gpsCoordinates.latitude, gpsCoordinates.longitude));
                    androidStringManager = androidStringManager;
                    it2 = it3;
                    brandFollowViewModel = null;
                }
            } else {
                r2 = 0;
            }
            if (r2 == 0) {
                r2 = EmptyList.INSTANCE;
            }
            rememberedValue7 = r2;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        List list2 = (List) rememberedValue7;
        gapComposer.startMovableGroup(-738582219, getNeighborhoodsTabContentResponse);
        LocalHomeViewModel models3 = tabContentPresenter.models((Flow) this.tabContentEvents, (Composer) gapComposer, 0);
        gapComposer.end(false);
        LocalHomeViewModel.TabContent tabContent = (LocalHomeViewModel.TabContent) models3;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(LocalInstalledStoreKt.localCashBalanceOrNothing(localInstalledStore), 10);
            gapComposer.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
            rememberedValue8 = realLocalInstalledStore$hideBrands$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer, 48, 2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$12 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalPosCheckIn), 15);
            gapComposer.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$12);
            rememberedValue9 = realLocalInstalledStore$hideBrands$$inlined$map$12;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$2(flow, (Continuation) null, this, 6));
        LocationSelection locationSelection = ((CashMapViewModel) models2.model).selectedLocation;
        String str9 = locationSelection != null ? locationSelection.locationToken : null;
        Iterator it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            if (Intrinsics.areEqual(((LocalHomeGeoViewModel.Location) obj).token, str9)) {
                break;
            }
        }
        LocalHomeGeoViewModel.Location location3 = (LocalHomeGeoViewModel.Location) obj;
        MutableSharedFlow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer);
        Object rememberedValue10 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(createCompositionCoroutineScope);
            obj7 = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj7;
        Object[] objArr = new Object[0];
        Object rememberedValue11 = gapComposer.rememberedValue();
        Object obj8 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy) {
            LocalMapKt$$ExternalSyntheticLambda3 localMapKt$$ExternalSyntheticLambda3 = new LocalMapKt$$ExternalSyntheticLambda3(6);
            gapComposer.updateRememberedValue(localMapKt$$ExternalSyntheticLambda3);
            obj8 = localMapKt$$ExternalSyntheticLambda3;
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj8, gapComposer, 48);
        BrandSpot brandSpot = (location3 == null || (location = location3.sheetModel) == null) ? null : location.brandSpot;
        if (brandSpot != null) {
            mutableState.setValue(brandSpot);
        } else if (str9 == null) {
            obj2 = null;
            mutableState.setValue(null);
            if (brandSpot == null) {
                brandSpot = (BrandSpot) mutableState.getValue();
            }
            changed = gapComposer.changed(brandSpot);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed || rememberedValue == neverEqualPolicy) {
                Object create3 = brandSpot == null ? this.brandProfilePresenterFactory.create(new LocalBrandProfileScreen(brandSpot, (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE), screenNavigator) : obj2;
                gapComposer.updateRememberedValue(create3);
                rememberedValue = create3;
            }
            localBrandProfilePresenter = (LocalBrandProfilePresenter) rememberedValue;
            gapComposer.startMovableGroup(-738522847, brandSpot);
            if (localBrandProfilePresenter != null) {
                gapComposer.startReplaceGroup(-1419327632);
                z = false;
                gapComposer.end(false);
                models = obj2;
            } else {
                z = false;
                gapComposer.startReplaceGroup(-738521423);
                models = localBrandProfilePresenter.models((Flow) rememberSharedViewEvents, (Composer) gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            changed2 = gapComposer.changed(models);
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changed2 || rememberedValue2 == neverEqualPolicy) {
                Object uiCallbackModel = models == null ? new UiCallbackModel(new RealBadger2$$ExternalSyntheticLambda0(13, coroutineScope, rememberSharedViewEvents), models) : obj2;
                gapComposer.updateRememberedValue(uiCallbackModel);
                rememberedValue2 = uiCallbackModel;
            }
            UiCallbackModel uiCallbackModel2 = (UiCallbackModel) rememberedValue2;
            TabToolbarInternalViewModel tabToolbarInternalViewModel = tabContent.toolbarInternalModel;
            LocalCashBalance localCashBalance = (LocalCashBalance) collectAsState2.getValue();
            if (this.segmentedTabEnabled) {
                if ((localCashBalance != null ? localCashBalance.amount : obj2) != null) {
                    LocalCurrencyCode localCurrencyCode = LocalCurrencyCode.USD;
                    r19 = new TabSheetUpperContent(new TabSheetUpperContent.Pill.LocalCashAmount(StringsKt.removePrefix("$", LocalsKt.format(localCashBalance))));
                    mapboxConfiguration = getNeighborhoodsTabContentResponse.mapbox_configuration;
                    if (mapboxConfiguration == null) {
                        String str10 = getNeighborhoodsTabContentResponse.mapbox_access_token;
                        r23 = str10 != null ? new MapboxConfiguration(str10, EmptyList.INSTANCE, ByteString.EMPTY) : obj2;
                    } else {
                        r23 = mapboxConfiguration;
                    }
                    changedInstance = gapComposer.changedInstance(models2);
                    Object rememberedValue12 = gapComposer.rememberedValue();
                    if (!changedInstance || rememberedValue12 == neverEqualPolicy) {
                        z2 = false;
                        LocalHomeGeoPresenter$$ExternalSyntheticLambda2 localHomeGeoPresenter$$ExternalSyntheticLambda2 = new LocalHomeGeoPresenter$$ExternalSyntheticLambda2(models2, 0);
                        gapComposer.updateRememberedValue(localHomeGeoPresenter$$ExternalSyntheticLambda2);
                        obj3 = localHomeGeoPresenter$$ExternalSyntheticLambda2;
                    } else {
                        z2 = false;
                        obj3 = rememberedValue12;
                    }
                    LocalHomeViewModel.Geo geo = new LocalHomeViewModel.Geo(new LocalHomeGeoViewModel(tabToolbarInternalViewModel, models2, list2, r19, tabContent, location3, uiCallbackModel2, r23, (Function0) obj3));
                    gapComposer.end(z2);
                    return geo;
                }
            }
            r19 = obj2;
            mapboxConfiguration = getNeighborhoodsTabContentResponse.mapbox_configuration;
            if (mapboxConfiguration == null) {
            }
            changedInstance = gapComposer.changedInstance(models2);
            Object rememberedValue122 = gapComposer.rememberedValue();
            if (changedInstance) {
            }
            z2 = false;
            LocalHomeGeoPresenter$$ExternalSyntheticLambda2 localHomeGeoPresenter$$ExternalSyntheticLambda22 = new LocalHomeGeoPresenter$$ExternalSyntheticLambda2(models2, 0);
            gapComposer.updateRememberedValue(localHomeGeoPresenter$$ExternalSyntheticLambda22);
            obj3 = localHomeGeoPresenter$$ExternalSyntheticLambda22;
            LocalHomeViewModel.Geo geo2 = new LocalHomeViewModel.Geo(new LocalHomeGeoViewModel(tabToolbarInternalViewModel, models2, list2, r19, tabContent, location3, uiCallbackModel2, r23, (Function0) obj3));
            gapComposer.end(z2);
            return geo2;
        }
        obj2 = null;
        if (brandSpot == null) {
        }
        changed = gapComposer.changed(brandSpot);
        rememberedValue = gapComposer.rememberedValue();
        if (!changed) {
        }
        if (brandSpot == null) {
        }
        gapComposer.updateRememberedValue(create3);
        rememberedValue = create3;
        localBrandProfilePresenter = (LocalBrandProfilePresenter) rememberedValue;
        gapComposer.startMovableGroup(-738522847, brandSpot);
        if (localBrandProfilePresenter != null) {
        }
        gapComposer.end(z);
        changed2 = gapComposer.changed(models);
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changed2) {
        }
        if (models == null) {
        }
        gapComposer.updateRememberedValue(uiCallbackModel);
        rememberedValue2 = uiCallbackModel;
        UiCallbackModel uiCallbackModel22 = (UiCallbackModel) rememberedValue2;
        TabToolbarInternalViewModel tabToolbarInternalViewModel2 = tabContent.toolbarInternalModel;
        LocalCashBalance localCashBalance2 = (LocalCashBalance) collectAsState2.getValue();
        if (this.segmentedTabEnabled) {
        }
        r19 = obj2;
        mapboxConfiguration = getNeighborhoodsTabContentResponse.mapbox_configuration;
        if (mapboxConfiguration == null) {
        }
        changedInstance = gapComposer.changedInstance(models2);
        Object rememberedValue1222 = gapComposer.rememberedValue();
        if (changedInstance) {
        }
        z2 = false;
        LocalHomeGeoPresenter$$ExternalSyntheticLambda2 localHomeGeoPresenter$$ExternalSyntheticLambda222 = new LocalHomeGeoPresenter$$ExternalSyntheticLambda2(models2, 0);
        gapComposer.updateRememberedValue(localHomeGeoPresenter$$ExternalSyntheticLambda222);
        obj3 = localHomeGeoPresenter$$ExternalSyntheticLambda222;
        LocalHomeViewModel.Geo geo22 = new LocalHomeViewModel.Geo(new LocalHomeGeoViewModel(tabToolbarInternalViewModel2, models2, list2, r19, tabContent, location3, uiCallbackModel22, r23, (Function0) obj3));
        gapComposer.end(z2);
        return geo22;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider brandProfilePresenterFactory;
        public final Provider cashMapPresenterFactory;
        public final LambdaProvider clock;
        public final DoubleCheck featureFlagManager;
        public final Provider store;
        public final LambdaProvider stringManager;
        public final DoubleCheck syncer;
        public final Provider tabContentPresenterFactory;

        public MetroFactory(LambdaProvider lambdaProvider, RealSessionFlags.MetroFactory metroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.clock = lambdaProvider;
            this.store = metroFactory;
            this.cashMapPresenterFactory = walletUiFactory$MetroFactory;
            this.syncer = doubleCheck;
            this.tabContentPresenterFactory = attestedKeyMetrics$MetroFactory;
            this.featureFlagManager = doubleCheck2;
            this.stringManager = lambdaProvider2;
            this.brandProfilePresenterFactory = musicViewFactory$MetroFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, LocalViewFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, RealAppLockState.MetroFactory metroFactory3, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3) {
            this.store = doubleCheck;
            this.cashMapPresenterFactory = metroFactory;
            this.tabContentPresenterFactory = metroFactory2;
            this.clock = lambdaProvider;
            this.brandProfilePresenterFactory = metroFactory3;
            this.syncer = doubleCheck2;
            this.stringManager = lambdaProvider2;
            this.featureFlagManager = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2) {
            this.syncer = doubleCheck;
            this.store = metroFactory;
            this.clock = lambdaProvider;
            this.cashMapPresenterFactory = instanceFactory;
            this.tabContentPresenterFactory = instanceFactory2;
            this.brandProfilePresenterFactory = instanceFactory3;
            this.stringManager = lambdaProvider2;
            this.featureFlagManager = doubleCheck2;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2) {
            this.store = instanceFactory;
            this.cashMapPresenterFactory = instanceFactory2;
            this.syncer = doubleCheck;
            this.tabContentPresenterFactory = metroFactory;
            this.clock = lambdaProvider;
            this.brandProfilePresenterFactory = metroFactory2;
            this.stringManager = lambdaProvider2;
            this.featureFlagManager = doubleCheck2;
        }
    }
}
