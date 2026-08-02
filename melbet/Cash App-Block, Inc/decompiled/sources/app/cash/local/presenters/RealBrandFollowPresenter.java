package app.cash.local.presenters;

import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalBrandProfileSubScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1;
import app.cash.local.viewmodels.BrandFollowViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.cdf.localclient.LocalClientBrandProfileAdd;
import com.squareup.cash.cdf.localclient.LocalClientBrandProfileRemove;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import dev.zacsweers.metro.Provider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealBrandFollowPresenter implements BrandFollowPresenter {
    public final Analytics analytics;
    public final LocalBrand.Banner banner;
    public final BrandSpot brandSpot;
    public final Screen currentScreen;
    public final boolean needToFetchBanner;
    public final RealLocalBrandRepository repository;
    public final SVG responseContextHandler;
    public final LocalService service;
    public final LocalInstalledStore store;
    public final RealLocalBrandSyncer syncer;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider analytics;
        public final Provider repository;
        public final Provider responseContextHandlerFactory;
        public final Provider service;
        public final Provider store;
        public final Provider syncer;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
            this.syncer = provider;
            this.store = provider2;
            this.service = provider3;
            this.repository = provider4;
            this.analytics = provider5;
            this.responseContextHandlerFactory = provider6;
        }
    }

    public RealBrandFollowPresenter(RealLocalBrandSyncer realLocalBrandSyncer, LocalInstalledStore localInstalledStore, LocalService localService, RealLocalBrandRepository realLocalBrandRepository, Analytics analytics, LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl, BrandSpot brandSpot, Screen screen, LocalBrand.Banner banner, BetterNavigator.ScreenNavigator screenNavigator) {
        brandSpot.getClass();
        screen.getClass();
        this.syncer = realLocalBrandSyncer;
        this.store = localInstalledStore;
        this.service = localService;
        this.repository = realLocalBrandRepository;
        this.analytics = analytics;
        this.brandSpot = brandSpot;
        this.currentScreen = screen;
        this.banner = banner;
        this.responseContextHandler = localResponseContextHandler$Factory$Impl.create(screenNavigator);
        this.needToFetchBanner = banner == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleBrandAddRemove(RealBrandFollowPresenter realBrandFollowPresenter, boolean z, BrandSpot brandSpot, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1, ContinuationImpl continuationImpl) {
        RealBrandFollowPresenter$handleBrandAddRemove$1 realBrandFollowPresenter$handleBrandAddRemove$1;
        int i;
        SVG svg;
        String str;
        SVG svg2;
        String str2;
        Analytics analytics = realBrandFollowPresenter.analytics;
        Screen screen = realBrandFollowPresenter.currentScreen;
        if (continuationImpl instanceof RealBrandFollowPresenter$handleBrandAddRemove$1) {
            realBrandFollowPresenter$handleBrandAddRemove$1 = (RealBrandFollowPresenter$handleBrandAddRemove$1) continuationImpl;
            int i2 = realBrandFollowPresenter$handleBrandAddRemove$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBrandFollowPresenter$handleBrandAddRemove$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBrandFollowPresenter$handleBrandAddRemove$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBrandFollowPresenter$handleBrandAddRemove$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SVG svg3 = realBrandFollowPresenter.responseContextHandler;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    realBrandFollowPresenter$models$2$1$1.invoke(Boolean.TRUE);
                    LocalService localService = realBrandFollowPresenter.service;
                    if (z) {
                        BulkRemoveBrandsRequest bulkRemoveBrandsRequest = new BulkRemoveBrandsRequest(CollectionsKt__CollectionsJVMKt.listOf(new BulkRemoveBrandsRequest.RemoveBrandRequest(brandSpot.brandToken)));
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$0 = brandSpot;
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$3 = generateToken;
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$4 = svg3;
                        realBrandFollowPresenter$handleBrandAddRemove$1.label = 1;
                        Object bulkRemoveBrands = localService.bulkRemoveBrands(generateToken, bulkRemoveBrandsRequest, realBrandFollowPresenter$handleBrandAddRemove$1);
                        if (bulkRemoveBrands != coroutineSingletons) {
                            obj = bulkRemoveBrands;
                            svg2 = svg3;
                            str2 = generateToken;
                            svg2.handle((ApiResult) obj, str2, screen);
                            if (screen instanceof LocalBrandProfileScreen) {
                            }
                        }
                    } else {
                        String str3 = brandSpot.brandToken;
                        String str4 = brandSpot.locationToken;
                        if (str4 == null) {
                            str4 = null;
                        }
                        BulkAddBrandsRequest bulkAddBrandsRequest = new BulkAddBrandsRequest(CollectionsKt__CollectionsJVMKt.listOf(new BulkAddBrandsRequest.AddBrandRequest(str3, str4)));
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$0 = brandSpot;
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$3 = generateToken;
                        realBrandFollowPresenter$handleBrandAddRemove$1.L$4 = svg3;
                        realBrandFollowPresenter$handleBrandAddRemove$1.label = 2;
                        Object bulkAddBrands = localService.bulkAddBrands(generateToken, bulkAddBrandsRequest, realBrandFollowPresenter$handleBrandAddRemove$1);
                        if (bulkAddBrands != coroutineSingletons) {
                            obj = bulkAddBrands;
                            svg = svg3;
                            str = generateToken;
                            svg.handle((ApiResult) obj, str, screen);
                            if (screen instanceof LocalBrandProfileScreen) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    svg2 = realBrandFollowPresenter$handleBrandAddRemove$1.L$4;
                    str2 = realBrandFollowPresenter$handleBrandAddRemove$1.L$3;
                    brandSpot = realBrandFollowPresenter$handleBrandAddRemove$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    svg2.handle((ApiResult) obj, str2, screen);
                    if (screen instanceof LocalBrandProfileScreen) {
                        String str5 = brandSpot.brandToken;
                        String str6 = brandSpot.locationToken;
                        if (str6 == null) {
                            str6 = null;
                        }
                        analytics.track(new LocalClientBrandProfileRemove(str5, str6, ((LocalBrandProfileScreen) screen).attributionKey.value), null);
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    svg = realBrandFollowPresenter$handleBrandAddRemove$1.L$4;
                    str = realBrandFollowPresenter$handleBrandAddRemove$1.L$3;
                    brandSpot = realBrandFollowPresenter$handleBrandAddRemove$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    svg.handle((ApiResult) obj, str, screen);
                    if (screen instanceof LocalBrandProfileScreen) {
                        String str7 = brandSpot.brandToken;
                        String str8 = brandSpot.locationToken;
                        if (str8 == null) {
                            str8 = null;
                        }
                        analytics.track(new LocalClientBrandProfileAdd(str7, str8, ((LocalBrandProfileScreen) screen).attributionKey.value), null);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realBrandFollowPresenter$handleBrandAddRemove$1 = new RealBrandFollowPresenter$handleBrandAddRemove$1(realBrandFollowPresenter, continuationImpl);
        Object obj2 = realBrandFollowPresenter$handleBrandAddRemove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBrandFollowPresenter$handleBrandAddRemove$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b5  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BrandSpotSyncTokens brandSpotSyncTokens;
        LocalFulfillment.SchedulingDetails schedulingDetails;
        GapComposer gapComposer;
        boolean z;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-348747170);
        Object rememberedValue = gapComposer2.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        LocalInstalledStore localInstalledStore = this.store;
        Continuation continuation = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Object obj2 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            int i2 = 2;
            RealGooglePayer$createWallet$$inlined$map$1 realGooglePayer$createWallet$$inlined$map$1 = new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard), new ToastKt$Toast$7$1(mutableState, continuation, i2), 3), i2);
            gapComposer2.updateRememberedValue(realGooglePayer$createWallet$$inlined$map$1);
            obj2 = realGooglePayer$createWallet$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj2, null, null, gapComposer2, 48, 2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        int i3 = 7;
        Object obj3 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(i3, this, collectAsState));
            gapComposer2.updateRememberedValue(derivedStateOf);
            obj3 = derivedStateOf;
        }
        State state = (State) obj3;
        BrandSpot brandSpot = this.brandSpot;
        boolean changed = gapComposer2.changed(brandSpot.brandToken);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        Object obj4 = rememberedValue4;
        if (changed || rememberedValue4 == neverEqualPolicy) {
            RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1 m1209selectFulfillmentConfigurationNmdeRlM$default = LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(localInstalledStore, brandSpot.brandToken);
            gapComposer2.updateRememberedValue(m1209selectFulfillmentConfigurationNmdeRlM$default);
            obj4 = m1209selectFulfillmentConfigurationNmdeRlM$default;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj4, null, null, gapComposer2, 48, 2);
        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) collectAsState2.getValue();
        Screen screen = this.currentScreen;
        boolean changed2 = gapComposer2.changed(fulfillmentConfiguration) | gapComposer2.changed(screen);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj5 = rememberedValue5;
        if (changed2 || rememberedValue5 == neverEqualPolicy) {
            LocalBrandProfileSubScreen localBrandProfileSubScreen = screen instanceof LocalBrandProfileSubScreen ? (LocalBrandProfileSubScreen) screen : null;
            if (localBrandProfileSubScreen == null || (brandSpotSyncTokens = localBrandProfileSubScreen.getSyncTokens()) == null) {
                LocalBrandProfileScreen localBrandProfileScreen = screen instanceof LocalBrandProfileScreen ? (LocalBrandProfileScreen) screen : null;
                brandSpotSyncTokens = localBrandProfileScreen != null ? localBrandProfileScreen.syncTokens : new BrandSpotSyncTokens((String) (z3 ? 1 : 0), (String) (z2 ? 1 : 0), i3);
            }
            FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) collectAsState2.getValue();
            BrandSpotSyncTokens copy$default = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens, (fulfillmentConfiguration2 == null || (schedulingDetails = fulfillmentConfiguration2.getSchedulingDetails()) == null) ? null : schedulingDetails.scheduling_day_time_token, 6);
            gapComposer2.updateRememberedValue(copy$default);
            obj5 = copy$default;
        }
        BrandSpotSyncTokens brandSpotSyncTokens2 = (BrandSpotSyncTokens) obj5;
        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType((FulfillmentConfiguration) collectAsState2.getValue());
        boolean changedInstance = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(brandSpotSyncTokens2) | gapComposer2.changed(collectAsState2);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue6 == neverEqualPolicy) {
            SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(this, brandSpotSyncTokens2, collectAsState2, z4 ? 1 : 0, 25);
            gapComposer2.updateRememberedValue(sliderState$drag$2);
            rememberedValue6 = sliderState$drag$2;
        }
        Updater.LaunchedEffect(brandSpotSyncTokens2, type2, (Function2) rememberedValue6, gapComposer2);
        boolean z5 = true;
        boolean z6 = true;
        if (this.needToFetchBanner) {
            gapComposer2.startReplaceGroup(828078);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(this.repository.brand(brandSpot), z6 ? 1 : 0);
                gapComposer2.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                rememberedValue7 = cardModelView$cardHeat$$inlined$map$1;
            }
            gapComposer = gapComposer2;
            z5 = ((Boolean) Updater.collectAsState((Flow) rememberedValue7, Boolean.TRUE, null, gapComposer2, 48, 2).getValue()).booleanValue();
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.startReplaceGroup(-138511422);
            gapComposer.end(false);
            if (this.banner != LocalBrand.Banner.BANNER_ADD_BRAND_OR_REMOVE) {
                z = false;
                Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, state, mutableState, 11));
                Object obj6 = BrandFollowViewModel.None.INSTANCE;
                if (z && ((Boolean) state.getValue()) != null) {
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        Boolean bool = (Boolean) state.getValue();
                        bool.getClass();
                        if (bool.booleanValue()) {
                            obj6 = BrandFollowViewModel.Removing.INSTANCE;
                        }
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        Boolean bool2 = (Boolean) state.getValue();
                        bool2.getClass();
                        obj6 = bool2.booleanValue() ? BrandFollowViewModel.Remove.INSTANCE : BrandFollowViewModel.Add.INSTANCE;
                    } else {
                        obj6 = BrandFollowViewModel.Adding.INSTANCE;
                    }
                }
                gapComposer.end(false);
                return obj6;
            }
        }
        z = z5;
        Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, state, mutableState, 11));
        Object obj62 = BrandFollowViewModel.None.INSTANCE;
        if (z) {
            if (((Boolean) mutableState.getValue()).booleanValue()) {
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
            }
        }
        gapComposer.end(false);
        return obj62;
    }
}
