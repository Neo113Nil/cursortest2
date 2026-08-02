package coil3.network;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.biometric.AuthenticatorUtils;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.AppWidgetSession$provideGlance$1;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.OrderBuilder$Payload;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.brand.checkout.LocalCheckoutDeeplinkPresenter$PendingCheckout;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.cart.LocalCartCheckoutNavigator;
import app.cash.local.presenters.cart.LocalCartCheckoutResult;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.service.LocalService;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2;
import app.cash.molecule.GatedFrameClock;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.SnapshotNotifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.decode.DataSource;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.RealDiskCache;
import coil3.fetch.SourceFetchResult;
import coil3.memory.RealStrongMemoryCache;
import coil3.network.internal.UtilsKt;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.gms.dynamite.zzb;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.beacondetection.real.BeaconRegionTracker;
import com.squareup.cash.biometrics.AndroidSecureValue;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter;
import com.squareup.cash.blockers.presenters.AddMoneyBlockerPresenter;
import com.squareup.cash.blockers.presenters.AtmPickerAmountBlockerPresenter;
import com.squareup.cash.blockers.presenters.CalendarBlockerPresenter;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableBratHype;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteRequest;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse$Response$DeliveryQuote;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.app.AppTheme;
import com.squareup.protos.cash.postcard.app.AppThemeState;
import com.squareup.protos.cash.postcard.app.GetAppThemesRequest;
import com.squareup.protos.cash.postcard.app.GetAppThemesResponse;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.MutexImpl;
import okio.Buffer;
import okio.ByteString;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class NetworkFetcher$doFetch$fetchResult$1 extends SuspendLambda implements Function2 {
    public Object $cacheResponse;
    public final /* synthetic */ Object $networkRequest;
    public final /* synthetic */ int $r8$classId;
    public Object $snapshot;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$fetchResult$1(int i, MutableState mutableState, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$snapshot = obj2;
        this.$cacheResponse = obj3;
        this.L$0 = obj4;
        this.this$0 = mutableState;
        this.$networkRequest = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$app$cash$local$presenters$fulfillment$FulfillmentPickerPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj) {
        LocalErrorResponse localErrorResponse;
        MutableState mutableState = (MutableState) this.$networkRequest;
        MutableState mutableState2 = (MutableState) this.this$0;
        FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) this.$snapshot;
        BetterNavigator.ScreenNavigator screenNavigator = fulfillmentPickerPresenter.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GetDeliveryQuoteRequest getDeliveryQuoteRequest = new GetDeliveryQuoteRequest(fulfillmentPickerPresenter.brandToken, (LocalAddress) ((MutableState) this.$cacheResponse).getValue(), null, EmptyList.INSTANCE, ByteString.EMPTY);
            mutableState2.setValue(null);
            mutableState.setValue(Boolean.TRUE);
            LocalService localService = fulfillmentPickerPresenter.service;
            this.L$0 = null;
            this.label = 1;
            obj = localService.getDeliveryQuote(getDeliveryQuoteRequest, this);
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
        ApiResult apiResult = (ApiResult) obj;
        mutableState.setValue(Boolean.FALSE);
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure [", "]");
            Timber.Forest.e(m, new Object[0]);
            screenNavigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(m)));
        } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
            Timber.Forest forest = Timber.Forest;
            Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
            forest.e("NetworkFailure", new Object[0], th);
            screenNavigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"NetworkFailure", th.getLocalizedMessage()})));
        } else {
            if (!(apiResult instanceof ApiResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            zzia zziaVar = ((GetDeliveryQuoteResponse) ((ApiResult.Success) apiResult).response).response;
            if (zziaVar != null) {
                GetDeliveryQuoteResponse$Response$ErrorResponse getDeliveryQuoteResponse$Response$ErrorResponse = zziaVar instanceof GetDeliveryQuoteResponse$Response$ErrorResponse ? (GetDeliveryQuoteResponse$Response$ErrorResponse) zziaVar : null;
                if (getDeliveryQuoteResponse$Response$ErrorResponse != null) {
                    localErrorResponse = getDeliveryQuoteResponse$Response$ErrorResponse.value;
                    if (localErrorResponse == null) {
                        zziaVar.getClass();
                        GetDeliveryQuoteResponse$Response$ErrorResponse getDeliveryQuoteResponse$Response$ErrorResponse2 = zziaVar instanceof GetDeliveryQuoteResponse$Response$ErrorResponse ? (GetDeliveryQuoteResponse$Response$ErrorResponse) zziaVar : null;
                        LocalErrorResponse localErrorResponse2 = getDeliveryQuoteResponse$Response$ErrorResponse2 != null ? getDeliveryQuoteResponse$Response$ErrorResponse2.value : null;
                        localErrorResponse2.getClass();
                        List list = localErrorResponse2.errors;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str = ((LocalErrorResponse.Error) it.next()).message;
                            str.getClass();
                            arrayList.add(str);
                        }
                        screenNavigator.goTo(new LocalExplanatoryDialog(arrayList, LocalExplanatoryDialog.PositiveAction.Ok.INSTANCE));
                    } else {
                        zziaVar.getClass();
                        GetDeliveryQuoteResponse$Response$DeliveryQuote getDeliveryQuoteResponse$Response$DeliveryQuote = zziaVar instanceof GetDeliveryQuoteResponse$Response$DeliveryQuote ? (GetDeliveryQuoteResponse$Response$DeliveryQuote) zziaVar : null;
                        GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote = getDeliveryQuoteResponse$Response$DeliveryQuote != null ? getDeliveryQuoteResponse$Response$DeliveryQuote.value : null;
                        deliveryQuote.getClass();
                        String str2 = deliveryQuote.brand_token;
                        str2.getClass();
                        LocalLocationSummary localLocationSummary = deliveryQuote.location_summary;
                        localLocationSummary.getClass();
                        Location.LocationSummary location = LocationKt.toLocation(localLocationSummary);
                        LocalFulfillment localFulfillment = deliveryQuote.fulfillment;
                        localFulfillment.getClass();
                        Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                        LocalMoney localMoney = deliveryQuote.delivery_fee;
                        mutableState2.setValue(new DeliveryQuote(str2, location, fulfillment, localMoney != null ? LocalMoneyKt.toMoney(localMoney) : LocalMoneysKt.zero(LocalCurrencyCode.USD), deliveryQuote));
                    }
                }
            }
            localErrorResponse = null;
            if (localErrorResponse == null) {
            }
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$app$cash$local$views$brand$menu$LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$3$1(Object obj) {
        MutableState mutableState = (MutableState) this.$snapshot;
        LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) this.L$1;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = localBrandLocationMenuViewModel.defaultSelectedMenuCategory;
            String str2 = localBrandLocationMenuViewModel.defaultSelectedMenuCategory;
            List list = localBrandLocationMenuViewModel.menuCategories;
            if (str == null || ((Boolean) mutableState.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (str2 == null ? false : Intrinsics.areEqual(((LocalBrandLocationMenuViewModel.MenuCategory) it.next()).token, str2)) {
                    break;
                }
                i2++;
            }
            int i3 = i2;
            if (i3 < 0) {
                Timber.Forest.e(Boxes$$ExternalSyntheticOutline1.m("Default category is set to ", str2 == null ? "null" : MenuCategoryToken.m1259toStringimpl(str2), " but it doesn't match any categories ", CollectionsKt.joinToString$default(list, null, null, null, 0, null, new LocationMenu$$ExternalSyntheticLambda6(10), 31), "."), new Object[0]);
                return Unit.INSTANCE;
            }
            mutableState.setValue(Boolean.TRUE);
            CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) this.$cacheResponse;
            LazyListState lazyListState = (LazyListState) this.L$0;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.this$0;
            LazyGridState lazyGridState = (LazyGridState) this.$networkRequest;
            LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel2 = (LocalBrandLocationMenuViewModel) this.L$1;
            this.label = 1;
            Object coroutineScope = JobKt.coroutineScope(new LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2(i3, collapsingToolbarScaffoldState, lazyListState, parcelableSnapshotMutableIntState, false, lazyGridState, localBrandLocationMenuViewModel2, null), this);
            if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                coroutineScope = Unit.INSTANCE;
            }
            if (coroutineScope == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        if (r14 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r6.emit(r14, r13) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0089 -> B:6:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$app$cash$molecule$MoleculeKt$immediateClockFlow$1$1(Object obj) {
        GatedFrameClock gatedFrameClock;
        Channel channel;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GatedFrameClock gatedFrameClock2 = new GatedFrameClock(EmptyCoroutineContext.INSTANCE, coroutineScope);
            BufferedChannel Channel$default = PapaEvent.Channel$default(1, null, null, 6);
            JobKt.launch(coroutineScope, gatedFrameClock2, CoroutineStart.UNDISPATCHED, new MoleculeKt$immediateClockFlow$1$1$1((SnapshotNotifier) this.this$0, (Function2) this.$networkRequest, gatedFrameClock2, Channel$default, (Continuation) null, 0));
            gatedFrameClock = gatedFrameClock2;
            channel = Channel$default;
        } else if (i == 1) {
            channel = (Channel) this.$snapshot;
            gatedFrameClock = (GatedFrameClock) this.L$1;
            SafeTrace.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.$cacheResponse;
            this.L$0 = null;
            this.L$1 = gatedFrameClock;
            this.$snapshot = channel;
            this.label = 2;
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channel = (Channel) this.$snapshot;
            gatedFrameClock = (GatedFrameClock) this.L$1;
            SafeTrace.throwOnFailure(obj);
        }
        obj = channel.mo4189tryReceivePtdJZtk();
        if (obj instanceof ChannelResult.Failed) {
            boolean z = gatedFrameClock.isRunning;
            gatedFrameClock.isRunning = true;
            if (!z) {
                gatedFrameClock.sendFrame();
            }
            this.L$0 = null;
            this.L$1 = gatedFrameClock;
            this.$snapshot = channel;
            this.label = 1;
            obj = channel.receive(this);
        } else {
            ChannelResult.m4192getOrThrowimpl(obj);
        }
        FlowCollector flowCollector2 = (FlowCollector) this.$cacheResponse;
        this.L$0 = null;
        this.L$1 = gatedFrameClock;
        this.$snapshot = channel;
        this.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0050, code lost:
    
        if (r4 == r3) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$account$presenters$ThemeSwitcherPresenter$models$2$1(Object obj) {
        Object appThemes;
        ApiResult apiResult;
        Object obj2;
        MutableState mutableState;
        GetAppThemesResponse getAppThemesResponse;
        LocalEditorialPresenter localEditorialPresenter;
        Iterator it;
        Object obj3;
        ThemeData themeData;
        ThemeData themeData2;
        String name;
        boolean z;
        MutableState mutableState2 = (MutableState) this.$networkRequest;
        LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        ThemeData themeData3 = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PostcardClientService postcardClientService = (PostcardClientService) localEditorialPresenter2.clock;
            GetAppThemesRequest getAppThemesRequest = new GetAppThemesRequest(null, ByteString.EMPTY);
            this.label = 1;
            appThemes = postcardClientService.getAppThemes(getAppThemesRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getAppThemesResponse = (GetAppThemesResponse) this.L$0;
                MutableState mutableState3 = (MutableState) this.$cacheResponse;
                LocalEditorialPresenter localEditorialPresenter3 = (LocalEditorialPresenter) this.$snapshot;
                ApiResult.Success success = (ApiResult.Success) this.L$1;
                SafeTrace.throwOnFailure(obj);
                localEditorialPresenter = localEditorialPresenter3;
                mutableState = mutableState3;
                apiResult = success;
                obj2 = obj;
                PaymentPadTheme valueOf = PaymentPadTheme.valueOf((String) obj2);
                List<AppTheme> list = getAppThemesResponse.app_themes;
                localEditorialPresenter.getClass();
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ThemeData[]{new ThemeData(PaymentPadTheme.GREEN, false, "Done", null), new ThemeData(PaymentPadTheme.BLACK, false, "Done", null)});
                ArrayList arrayList = new ArrayList();
                for (AppTheme appTheme : list) {
                    AppThemeName appThemeName = appTheme.name;
                    if (appThemeName == null || (name = appThemeName.name()) == null) {
                        themeData2 = themeData3;
                        themeData3 = themeData2;
                    } else {
                        AppThemeState appThemeState = appTheme.availability_state;
                        themeData2 = themeData3;
                        if (appThemeState != null) {
                            PaymentPadTheme valueOf2 = PaymentPadTheme.valueOf(name);
                            int ordinal = appThemeState.ordinal();
                            if (ordinal == 0) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unexpected availability_state");
                                return themeData2;
                            }
                            if (ordinal == 1) {
                                z = true;
                            } else {
                                if (ordinal != i2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return themeData2;
                                }
                                z = false;
                            }
                            LocalizedString localizedString = appTheme.finish_button_text;
                            localizedString.getClass();
                            String str = localizedString.translated_value;
                            str.getClass();
                            themeData3 = new ThemeData(valueOf2, z, str, appTheme.finish_action);
                        }
                    }
                    if (themeData3 != null) {
                        arrayList.add(themeData3);
                    }
                    themeData3 = themeData2;
                    i2 = 2;
                }
                Object obj4 = themeData3;
                ArrayList plus = CollectionsKt.plus((Iterable) arrayList, (Collection) listOf);
                it = plus.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = obj4;
                        break;
                    }
                    Object next = it.next();
                    if (((ThemeData) next).theme == valueOf) {
                        obj3 = next;
                        break;
                    }
                }
                themeData = (ThemeData) obj3;
                if (themeData != null || (r0 = themeData.theme) == null) {
                    PaymentPadTheme paymentPadTheme = PaymentPadTheme.GREEN;
                }
                mutableState.setValue(new ThemeSwitcherViewModel.Loaded(plus, paymentPadTheme, null, false, ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localEditorialPresenter.screen)).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled()));
                if (apiResult instanceof ApiResult.Failure) {
                    AndroidStringManager androidStringManager = (AndroidStringManager) localEditorialPresenter2.stringManager;
                    mutableState2.setValue(new ThemeSwitcherViewModel.Error(androidStringManager.get(R.string.app_theme_error_title), androidStringManager.get(R.string.app_theme_error_body), androidStringManager.get(R.string.app_theme_error_button)));
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            appThemes = obj;
        }
        apiResult = (ApiResult) appThemes;
        if (apiResult instanceof ApiResult.Success) {
            ApiResult.Success success2 = (ApiResult.Success) apiResult;
            GetAppThemesResponse getAppThemesResponse2 = (GetAppThemesResponse) success2.response;
            KeyValue keyValue = (KeyValue) localEditorialPresenter2.launcher;
            this.L$1 = success2;
            this.$snapshot = localEditorialPresenter2;
            this.$cacheResponse = mutableState2;
            this.L$0 = getAppThemesResponse2;
            this.label = 2;
            obj2 = keyValue.get(this);
            if (obj2 != coroutineSingletons) {
                mutableState = mutableState2;
                getAppThemesResponse = getAppThemesResponse2;
                localEditorialPresenter = localEditorialPresenter2;
                PaymentPadTheme valueOf3 = PaymentPadTheme.valueOf((String) obj2);
                List<AppTheme> list2 = getAppThemesResponse.app_themes;
                localEditorialPresenter.getClass();
                List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new ThemeData[]{new ThemeData(PaymentPadTheme.GREEN, false, "Done", null), new ThemeData(PaymentPadTheme.BLACK, false, "Done", null)});
                ArrayList arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                }
                Object obj42 = themeData3;
                ArrayList plus2 = CollectionsKt.plus((Iterable) arrayList2, (Collection) listOf2);
                it = plus2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                themeData = (ThemeData) obj3;
                if (themeData != null) {
                }
                PaymentPadTheme paymentPadTheme2 = PaymentPadTheme.GREEN;
                mutableState.setValue(new ThemeSwitcherViewModel.Loaded(plus2, paymentPadTheme2, null, false, ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localEditorialPresenter.screen)).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled()));
            }
            return coroutineSingletons;
        }
        if (apiResult instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$banking$presenters$TransfersPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (TransfersPresenter) this.$snapshot, (State) this.$cacheResponse, (State) this.this$0, (MutableState) this.$networkRequest);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$beacondetection$real$BeaconDetectionSetupTeardown$runDetection$2$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BeaconDetectionSetupTeardown beaconDetectionSetupTeardown = (BeaconDetectionSetupTeardown) this.L$1;
            BufferedChannel bufferedChannel = (BufferedChannel) this.$snapshot;
            RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) this.$cacheResponse;
            BeaconRegionTracker beaconRegionTracker = (BeaconRegionTracker) this.this$0;
            LocationPermissionLevel locationPermissionLevel = (LocationPermissionLevel) this.$networkRequest;
            this.L$0 = null;
            this.label = 1;
            if (BeaconDetectionSetupTeardown.access$processDetectedBeacons(beaconDetectionSetupTeardown, coroutineScope, bufferedChannel, realStrongMemoryCache, beaconRegionTracker, locationPermissionLevel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$benefits$presenters$BenefitsHubPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (LocalPosCheckInPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) this.this$0, (MutableState) this.$networkRequest, 15);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.biometric.BiometricPrompt, int] */
    private final Object invokeSuspend$com$squareup$cash$biometrics$AndroidBiometrics$prompt$1$1(Object obj) {
        final ProducerScope producerScope = (ProducerScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = this.label;
        try {
        } catch (CancellationException unused) {
            FragmentManager fragmentManager = (FragmentManager) r2.mClientFragmentManager;
            if (fragmentManager == null) {
                Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) fragmentManager.findFragmentByTag("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
                } else {
                    biometricFragment.cancelAuthentication(3);
                }
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            Timber.Forest.e(e);
            Biometrics$Result.PlatformException platformException = new Biometrics$Result.PlatformException(e);
            this.L$1 = null;
            this.label = 2;
            if (((ProducerCoroutine) producerScope)._channel.send(platformException, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (r2 != 0) {
            if (r2 == 1) {
                SafeTrace.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
            if (r2 == 2) {
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(((ProducerCoroutine) producerScope).close(null));
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        CredentialManager$$ExternalSyntheticLambda0 credentialManager$$ExternalSyntheticLambda0 = new CredentialManager$$ExternalSyntheticLambda0(2);
        FragmentActivity fragmentActivity = (FragmentActivity) ((Activity) this.$snapshot);
        zzb zzbVar = new zzb() { // from class: com.squareup.cash.biometrics.AndroidBiometrics$authenticationCallback$1
            @Override // com.google.android.gms.dynamite.zzb
            public final void onAuthenticationError(int i, CharSequence charSequence) {
                Object hardwareUnavailable;
                charSequence.getClass();
                switch (i) {
                    case 1:
                        hardwareUnavailable = new Biometrics$Result.Error.HardwareUnavailable(i, charSequence);
                        break;
                    case 2:
                        hardwareUnavailable = new Biometrics$Result.Error.UnableToProcess(i, charSequence);
                        break;
                    case 3:
                        hardwareUnavailable = new Biometrics$Result.Error.Timeout(i, charSequence);
                        break;
                    case 4:
                        hardwareUnavailable = new Biometrics$Result.Error.NoSpace(i, charSequence);
                        break;
                    case 5:
                        hardwareUnavailable = new Biometrics$Result.Error.SystemCanceled(i, charSequence);
                        break;
                    case 6:
                    case 8:
                    case 9:
                    case 12:
                    default:
                        hardwareUnavailable = new Biometrics$Result.Error.Generic(i, charSequence);
                        break;
                    case 7:
                        hardwareUnavailable = new Biometrics$Result.Error.Lockout(i, charSequence);
                        break;
                    case 10:
                        hardwareUnavailable = new Biometrics$Result.Error.UserCanceled(i, charSequence);
                        break;
                    case 11:
                        hardwareUnavailable = new Biometrics$Result.Error.NoBiometricSignaturesFound(i, charSequence);
                        break;
                    case 13:
                        hardwareUnavailable = new Biometrics$Result.Error.NegativeButton(i, charSequence);
                        break;
                    case 14:
                        hardwareUnavailable = new Biometrics$Result.Error.NoDeviceCredentials(i, charSequence);
                        break;
                }
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) ProducerScope.this;
                producerCoroutine.mo1159trySendJP2dKIU(hardwareUnavailable);
                producerCoroutine.close(null);
            }

            @Override // com.google.android.gms.dynamite.zzb
            public final void onAuthenticationFailed() {
                ((ProducerCoroutine) ProducerScope.this).mo1159trySendJP2dKIU(Biometrics$Result.Failure.INSTANCE);
            }

            @Override // com.google.android.gms.dynamite.zzb
            public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                authenticationResult.getClass();
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) ProducerScope.this;
                producerCoroutine.mo1159trySendJP2dKIU(Biometrics$Result.Success.INSTANCE);
                producerCoroutine.close(null);
            }
        };
        BiometricPrompt biometricPrompt = new BiometricPrompt(0, false);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        ViewModelStore viewModelStore = fragmentActivity.getViewModelStore();
        ViewModelProvider$Factory defaultViewModelProviderFactory = fragmentActivity.getDefaultViewModelProviderFactory();
        CreationExtras defaultViewModelCreationExtras = fragmentActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BiometricViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            return null;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        biometricPrompt.mClientFragmentManager = supportFragmentManager;
        biometricViewModel.mClientExecutor = credentialManager$$ExternalSyntheticLambda0;
        biometricViewModel.mClientCallback = zzbVar;
        Biometrics$Info biometrics$Info = (Biometrics$Info) this.this$0;
        CharSequence charSequence = biometrics$Info.title;
        CharSequence charSequence2 = biometrics$Info.subtitle;
        CharSequence charSequence3 = biometrics$Info.description;
        CharSequence charSequence4 = biometrics$Info.negativeButton;
        if (TextUtils.isEmpty(charSequence)) {
            a$$ExternalSyntheticBUOutline0.m$3("Title must be set and non-empty.");
            return null;
        }
        boolean isDeviceCredentialAllowed = AuthenticatorUtils.isDeviceCredentialAllowed(15);
        if (TextUtils.isEmpty(charSequence4) && !isDeviceCredentialAllowed) {
            a$$ExternalSyntheticBUOutline0.m$3("Negative text must be set and non-empty.");
            return null;
        }
        if (!TextUtils.isEmpty(charSequence4) && isDeviceCredentialAllowed) {
            a$$ExternalSyntheticBUOutline0.m$3("Negative text must not be set if device credential authentication is allowed.");
            return null;
        }
        biometricPrompt.authenticate(new n(charSequence, charSequence2, charSequence3, charSequence4), new UnleashContext(((AndroidSecureValue) this.$networkRequest).decryptionCipher));
        this.L$1 = biometricPrompt;
        this.label = 1;
        JobKt.awaitCancellation(this);
        return coroutineSingletons;
    }

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$education$BitcoinStoriesWidgetPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (Result) this.$snapshot, (BetterNavigator.ScreenNavigator) this.$cacheResponse, (State) this.this$0, (MutableState) this.$networkRequest, 16);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$custom$order$BitcoinPeriodSelectionPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (MusicPresenter) this.$snapshot, (CoroutineScope) this.$cacheResponse, (MutableState) this.this$0, (MutableState) this.$networkRequest, 19);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$blockers$actions$presenters$BlockerActionConfirmSheetPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1((Object) coroutineScope, this.$snapshot, this.$cacheResponse, this.this$0, this.$networkRequest, 6);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$blockers$presenters$AddMoneyBlockerPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            AddMoneyBlockerPresenter addMoneyBlockerPresenter = (AddMoneyBlockerPresenter) this.$snapshot;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(7, (MutableState) this.$cacheResponse, (MutableState) this.this$0, (State) this.$networkRequest, addMoneyBlockerPresenter, coroutineScope);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$blockers$presenters$AtmPickerAmountBlockerPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1((Object) coroutineScope, this.$snapshot, this.$cacheResponse, this.this$0, this.$networkRequest, 8);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$networkRequest;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1((Ref$ObjectRef) this.$snapshot, (NetworkFetcher) obj3, (Ref$ObjectRef) this.$cacheResponse, (NetworkRequest) obj2, continuation);
                networkFetcher$doFetch$fetchResult$1.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$1;
            case 1:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$12 = new NetworkFetcher$doFetch$fetchResult$1((SessionConfigAdapter) this.L$1, (UseCaseSurfaceManager) this.$snapshot, (List) this.$cacheResponse, (Map) obj3, (CameraGraphImpl) obj2, continuation, 1);
                networkFetcher$doFetch$fetchResult$12.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$12;
            case 2:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$13 = new NetworkFetcher$doFetch$fetchResult$1((Channel) this.$snapshot, (Animatable) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, continuation);
                networkFetcher$doFetch$fetchResult$13.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$13;
            case 3:
                return new NetworkFetcher$doFetch$fetchResult$1((SeekableTransitionState) this.$cacheResponse, this.L$0, (Transition) obj3, (FiniteAnimationSpec) obj2, continuation);
            case 4:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$14 = new NetworkFetcher$doFetch$fetchResult$1((Context) this.L$1, (AppWidgetId) this.$snapshot, (CashQrWidget) this.$cacheResponse, (Bundle) obj3, (Function3) obj2, continuation, 4);
                networkFetcher$doFetch$fetchResult$14.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$14;
            case 5:
                return new NetworkFetcher$doFetch$fetchResult$1(5, this.$snapshot, this.$cacheResponse, this.L$0, obj3, obj2, continuation, false);
            case 6:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$15 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (LocalCashBalancePresenter) this.$snapshot, (State) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 6);
                networkFetcher$doFetch$fetchResult$15.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$15;
            case 7:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$16 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (LocalEditorialPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, 7);
                networkFetcher$doFetch$fetchResult$16.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$16;
            case 8:
                return new NetworkFetcher$doFetch$fetchResult$1((LocalEditorialPresenter) this.L$0, (MutableState) obj3, (MutableState) obj2, continuation);
            case 9:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$17 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (LocalOrderStatusPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 9);
                networkFetcher$doFetch$fetchResult$17.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$17;
            case 10:
                return new NetworkFetcher$doFetch$fetchResult$1(10, (MutableState) obj3, (LocalBrandProfilePresenter) this.L$1, (State) this.$snapshot, (State) this.$cacheResponse, (MutableState) this.L$0, (MutableState) obj2, continuation);
            case 11:
                return new NetworkFetcher$doFetch$fetchResult$1(11, (MutableState) obj3, (LocalBrandLocationCartPresenter) this.L$1, (LocalCart) this.$snapshot, (BuyerIntentScope) this.$cacheResponse, (MutableState) this.L$0, (MutableState) obj2, continuation);
            case 12:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$18 = new NetworkFetcher$doFetch$fetchResult$1((LocalAddress) this.L$1, continuation, (FulfillmentPickerPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 12);
                networkFetcher$doFetch$fetchResult$18.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$18;
            case 13:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$19 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (LocalPosBrandOnboardingPresenter) this.$snapshot, (ShortlinkAction) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 13);
                networkFetcher$doFetch$fetchResult$19.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$19;
            case 14:
                return new NetworkFetcher$doFetch$fetchResult$1(14, (MutableState) obj3, (MutableState) this.L$1, (LazyGridState) this.$snapshot, (LocalBrandLocationMenuViewModel) this.$cacheResponse, (LazyListState) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation);
            case 15:
                return new NetworkFetcher$doFetch$fetchResult$1(15, (ParcelableSnapshotMutableIntState) obj3, (LocalBrandLocationMenuViewModel) this.L$1, (MutableState) this.$snapshot, (CollapsingToolbarScaffoldState) this.$cacheResponse, (LazyListState) this.L$0, (LazyGridState) obj2, continuation);
            case 16:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$110 = new NetworkFetcher$doFetch$fetchResult$1((FlowCollector) this.$cacheResponse, (SnapshotNotifier) obj3, (Function2) obj2, continuation);
                networkFetcher$doFetch$fetchResult$110.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$110;
            case 17:
                return new NetworkFetcher$doFetch$fetchResult$1((LocalEditorialPresenter) obj3, (MutableState) obj2, continuation);
            case 18:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$111 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (PaymentHistoryActivityItemPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 18);
                networkFetcher$doFetch$fetchResult$111.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$111;
            case 19:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$112 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (CardLockPresenter) this.$snapshot, (CoroutineScope) this.$cacheResponse, (State) obj3, (State) obj2, 19);
                networkFetcher$doFetch$fetchResult$112.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$112;
            case 20:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$113 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (TransfersPresenter) this.$snapshot, (State) this.$cacheResponse, (State) obj3, (MutableState) obj2, 20);
                networkFetcher$doFetch$fetchResult$113.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$113;
            case 21:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$114 = new NetworkFetcher$doFetch$fetchResult$1((BeaconDetectionSetupTeardown) this.L$1, (BufferedChannel) this.$snapshot, (RealStrongMemoryCache) this.$cacheResponse, (BeaconRegionTracker) obj3, (LocationPermissionLevel) obj2, continuation, 21);
                networkFetcher$doFetch$fetchResult$114.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$114;
            case 22:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$115 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (LocalPosCheckInPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 22);
                networkFetcher$doFetch$fetchResult$115.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$115;
            case 23:
                return new NetworkFetcher$doFetch$fetchResult$1(23, this.$snapshot, this.$cacheResponse, this.L$0, obj3, obj2, continuation, false);
            case 24:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$116 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (Result) this.$snapshot, (BetterNavigator.ScreenNavigator) this.$cacheResponse, (State) obj3, (MutableState) obj2, 24);
                networkFetcher$doFetch$fetchResult$116.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$116;
            case 25:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$117 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (MusicPresenter) this.$snapshot, (CoroutineScope) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 25);
                networkFetcher$doFetch$fetchResult$117.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$117;
            case 26:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$118 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (BlockerActionConfirmSheetPresenter) this.$snapshot, (ParcelableSnapshotMutableIntState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 26);
                networkFetcher$doFetch$fetchResult$118.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$118;
            case 27:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$119 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (AddMoneyBlockerPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (State) obj2, 27);
                networkFetcher$doFetch$fetchResult$119.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$119;
            case 28:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$120 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (AtmPickerAmountBlockerPresenter) this.$snapshot, (ParcelableSnapshotMutableIntState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 28);
                networkFetcher$doFetch$fetchResult$120.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$120;
            default:
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$121 = new NetworkFetcher$doFetch$fetchResult$1((Flow) this.L$1, continuation, (CalendarBlockerPresenter) this.$snapshot, (MutableState) this.$cacheResponse, (MutableState) obj3, (MutableState) obj2, 29);
                networkFetcher$doFetch$fetchResult$121.L$0 = obj;
                return networkFetcher$doFetch$fetchResult$121;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 16:
                ((NetworkFetcher$doFetch$fetchResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((NetworkFetcher$doFetch$fetchResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0547, code lost:
    
        if (r0.runRecomposeAndApplyChanges(r5) == r3) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0553, code lost:
    
        if (kotlin.Unit.INSTANCE != r3) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05f0, code lost:
    
        if (r1.invoke(r4, r0, r5) != r3) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ae, code lost:
    
        if (r8 == r3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0797, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.access$waitForComposition(r4, r5) == r11) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x078a, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.access$runAnimations(r4, r5) != r11) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06b7, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(r13, r5) == r11) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06ad, code lost:
    
        if (r0 == r11) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0a9b, code lost:
    
        if (r0 == r3) goto L467;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fd A[Catch: Exception -> 0x0381, TryCatch #6 {Exception -> 0x0381, blocks: (B:161:0x0379, B:163:0x03f7, B:165:0x03fd, B:168:0x0403, B:170:0x0407, B:171:0x0429, B:173:0x042d, B:176:0x0436, B:177:0x043b, B:178:0x043c, B:181:0x038b, B:183:0x03a3, B:185:0x03a8, B:187:0x03ac, B:189:0x03b0, B:191:0x03b6, B:193:0x03bc, B:195:0x03c2, B:199:0x03cc, B:204:0x0449, B:210:0x0394), top: B:156:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0403 A[Catch: Exception -> 0x0381, TryCatch #6 {Exception -> 0x0381, blocks: (B:161:0x0379, B:163:0x03f7, B:165:0x03fd, B:168:0x0403, B:170:0x0407, B:171:0x0429, B:173:0x042d, B:176:0x0436, B:177:0x043b, B:178:0x043c, B:181:0x038b, B:183:0x03a3, B:185:0x03a8, B:187:0x03ac, B:189:0x03b0, B:191:0x03b6, B:193:0x03bc, B:195:0x03c2, B:199:0x03cc, B:204:0x0449, B:210:0x0394), top: B:156:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bc A[Catch: Exception -> 0x0381, TryCatch #6 {Exception -> 0x0381, blocks: (B:161:0x0379, B:163:0x03f7, B:165:0x03fd, B:168:0x0403, B:170:0x0407, B:171:0x0429, B:173:0x042d, B:176:0x0436, B:177:0x043b, B:178:0x043c, B:181:0x038b, B:183:0x03a3, B:185:0x03a8, B:187:0x03ac, B:189:0x03b0, B:191:0x03b6, B:193:0x03bc, B:195:0x03c2, B:199:0x03cc, B:204:0x0449, B:210:0x0394), top: B:156:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c2 A[Catch: Exception -> 0x0381, TryCatch #6 {Exception -> 0x0381, blocks: (B:161:0x0379, B:163:0x03f7, B:165:0x03fd, B:168:0x0403, B:170:0x0407, B:171:0x0429, B:173:0x042d, B:176:0x0436, B:177:0x043b, B:178:0x043c, B:181:0x038b, B:183:0x03a3, B:185:0x03a8, B:187:0x03ac, B:189:0x03b0, B:191:0x03b6, B:193:0x03bc, B:195:0x03c2, B:199:0x03cc, B:204:0x0449, B:210:0x0394), top: B:156:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x099a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:357:0x07e2 -> B:350:0x07e6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkResponse networkResponse;
        Object access$writeToDiskCache;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        Object readBuffer;
        NetworkHeaders networkHeaders;
        Object access$getSurfaces;
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        BufferedChannel.BufferedChannelIterator it;
        Object hasNext;
        MutexImpl mutexImpl;
        SeekableTransitionState seekableTransitionState;
        Object animateOneFrame;
        SeekableTransitionState seekableTransitionState2;
        VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState;
        AnimationVector1D animationVector1D;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1;
        Object isSessionRunning;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$12;
        Object cart;
        LocalCart localCart;
        AttributionKey attributionKey;
        BrandSpot brandSpot;
        Object syncBrandSpot$default;
        CreateCartResponse createCartResponse;
        zzho zzhoVar;
        LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult;
        Object syncBrandSpot;
        Object createCheckoutResult;
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = this;
        switch (networkFetcher$doFetch$fetchResult$1.$r8$classId) {
            case 0:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) networkFetcher$doFetch$fetchResult$1.$snapshot;
                NetworkFetcher networkFetcher = (NetworkFetcher) networkFetcher$doFetch$fetchResult$1.this$0;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = networkFetcher$doFetch$fetchResult$1.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    networkResponse = (NetworkResponse) networkFetcher$doFetch$fetchResult$1.L$0;
                    RealDiskCache.RealSnapshot realSnapshot = (RealDiskCache.RealSnapshot) ref$ObjectRef3.element;
                    NetworkResponse networkResponse2 = (NetworkResponse) ref$ObjectRef2.element;
                    networkFetcher$doFetch$fetchResult$1.L$0 = networkResponse;
                    networkFetcher$doFetch$fetchResult$1.L$1 = ref$ObjectRef3;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    access$writeToDiskCache = NetworkFetcher.access$writeToDiskCache(networkFetcher, realSnapshot, networkResponse2, networkResponse, networkFetcher$doFetch$fetchResult$1);
                    if (access$writeToDiskCache != obj3) {
                        ref$ObjectRef = ref$ObjectRef3;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    NetworkResponse networkResponse3 = (NetworkResponse) networkFetcher$doFetch$fetchResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    networkResponse = networkResponse3;
                    obj2 = null;
                    readBuffer = obj;
                    Buffer buffer = (Buffer) readBuffer;
                    if (buffer.size > 0) {
                        return new SourceFetchResult(ImageSourceKt.ImageSource$default(buffer, networkFetcher.getFileSystem()), NetworkFetcher.getMimeType(networkFetcher.url, networkResponse.headers.get()), DataSource.NETWORK);
                    }
                    return obj2;
                }
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) networkFetcher$doFetch$fetchResult$1.L$1;
                NetworkResponse networkResponse4 = (NetworkResponse) networkFetcher$doFetch$fetchResult$1.L$0;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef = ref$ObjectRef4;
                networkResponse = networkResponse4;
                access$writeToDiskCache = obj;
                ref$ObjectRef.element = access$writeToDiskCache;
                networkFetcher.getClass();
                NetworkFetcher.throwIfFailureResponseCode(networkResponse);
                Object obj4 = ref$ObjectRef3.element;
                if (obj4 == null) {
                    SourceResponseBody sourceResponseBody = networkResponse.body;
                    if (sourceResponseBody == null) {
                        obj2 = null;
                        a$$ExternalSyntheticBUOutline0.m$1("body == null");
                        return obj2;
                    }
                    networkFetcher$doFetch$fetchResult$1.L$0 = networkResponse;
                    obj2 = null;
                    networkFetcher$doFetch$fetchResult$1.L$1 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 2;
                    readBuffer = UtilsKt.readBuffer(sourceResponseBody, networkFetcher$doFetch$fetchResult$1);
                    break;
                } else {
                    ref$ObjectRef2.element = networkFetcher.toNetworkResponseOrNull((RealDiskCache.RealSnapshot) obj4);
                    Object obj5 = ref$ObjectRef3.element;
                    obj5.getClass();
                    FileImageSource imageSource = networkFetcher.toImageSource((RealDiskCache.RealSnapshot) obj5);
                    String str = networkFetcher.url;
                    NetworkResponse networkResponse5 = (NetworkResponse) ref$ObjectRef2.element;
                    obj3 = new SourceFetchResult(imageSource, NetworkFetcher.getMimeType(str, (networkResponse5 == null || (networkHeaders = networkResponse5.headers) == null) ? null : networkHeaders.get()), DataSource.NETWORK);
                }
                return obj3;
            case 1:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = networkFetcher$doFetch$fetchResult$1.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CoroutineScope coroutineScope3 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                        if (!((SessionConfig.ValidatingBuilder) ((SessionConfigAdapter) networkFetcher$doFetch$fetchResult$1.L$1).validatingBuilder$delegate.getValue()).isValid()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        UseCaseSurfaceManager useCaseSurfaceManager = (UseCaseSurfaceManager) networkFetcher$doFetch$fetchResult$1.$snapshot;
                        List list = (List) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                        networkFetcher$doFetch$fetchResult$1.L$0 = coroutineScope3;
                        networkFetcher$doFetch$fetchResult$1.label = 1;
                        access$getSurfaces = UseCaseSurfaceManager.access$getSurfaces(useCaseSurfaceManager, list, 5000L, networkFetcher$doFetch$fetchResult$1);
                        if (access$getSurfaces == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        coroutineScope = coroutineScope3;
                        List list2 = (List) access$getSurfaces;
                        if (JobKt.isActive(coroutineScope)) {
                        }
                        if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                        }
                        return Boolean.FALSE;
                    }
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$getSurfaces = obj;
                    List list22 = (List) access$getSurfaces;
                    if (JobKt.isActive(coroutineScope) || list22.isEmpty()) {
                        if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                            Log.i("CXCP", "Failed to get Surfaces: isActive=" + JobKt.isActive(coroutineScope) + ", surfaces=" + list22);
                        }
                        return Boolean.FALSE;
                    }
                    if (list22.isEmpty() || list22.contains(null)) {
                        if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                            Log.w("CXCP", "Surface setup failed: Some Surfaces are invalid");
                        }
                        ((SessionConfigAdapter) networkFetcher$doFetch$fetchResult$1.L$1).reportSurfaceInvalid((DeferrableSurface) ((List) networkFetcher$doFetch$fetchResult$1.$cacheResponse).get(list22.indexOf(null)));
                        return Boolean.FALSE;
                    }
                    UseCaseSurfaceManager useCaseSurfaceManager2 = (UseCaseSurfaceManager) networkFetcher$doFetch$fetchResult$1.$snapshot;
                    Object obj6 = useCaseSurfaceManager2.lock;
                    List list3 = (List) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                    synchronized (obj6) {
                        try {
                            List list4 = list3;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj7 : list4) {
                                Object obj8 = list22.get(list3.indexOf((DeferrableSurface) obj7));
                                if (obj8 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                linkedHashMap.put((Surface) obj8, obj7);
                            }
                            useCaseSurfaceManager2.configuredSurfaceMap = linkedHashMap;
                            UseCaseSurfaceManager.access$setSurfaceListener(useCaseSurfaceManager2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Map map = (Map) networkFetcher$doFetch$fetchResult$1.this$0;
                    List list5 = (List) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                    CameraGraphImpl cameraGraphImpl = (CameraGraphImpl) networkFetcher$doFetch$fetchResult$1.$networkRequest;
                    UseCaseSurfaceManager useCaseSurfaceManager3 = (UseCaseSurfaceManager) networkFetcher$doFetch$fetchResult$1.$snapshot;
                    for (Map.Entry entry : map.entrySet()) {
                        int i3 = ((StreamId) entry.getValue()).value;
                        Surface surface = (Surface) list22.get(list5.indexOf(entry.getKey()));
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Configured " + surface + " for " + ((Object) StreamId.m57toStringimpl(i3)));
                        }
                        cameraGraphImpl.m83setSurfaceNYG5g8E(i3, surface);
                        useCaseSurfaceManager3.inactiveSurfaceCloser.mo24configurehB7JTeY(i3, (DeferrableSurface) entry.getKey(), cameraGraphImpl);
                    }
                    if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                        Log.i("CXCP", "Surface setup complete");
                    }
                    return Boolean.TRUE;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                        Log.w("CXCP", "Failed to get Surfaces: Surfaces closed", e);
                    }
                    SessionConfigAdapter sessionConfigAdapter = (SessionConfigAdapter) networkFetcher$doFetch$fetchResult$1.L$1;
                    DeferrableSurface deferrableSurface = e.mDeferrableSurface;
                    deferrableSurface.getClass();
                    sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface);
                    return Boolean.FALSE;
                } catch (TimeoutCancellationException unused) {
                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                        Log.w("CXCP", "Failed to get Surfaces within 5000 ms");
                    }
                    return Boolean.FALSE;
                }
            case 2:
                Channel channel = (Channel) networkFetcher$doFetch$fetchResult$1.$snapshot;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = networkFetcher$doFetch$fetchResult$1.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope2 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                    it = channel.iterator();
                    networkFetcher$doFetch$fetchResult$1.L$0 = coroutineScope2;
                    networkFetcher$doFetch$fetchResult$1.L$1 = it;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    hasNext = it.hasNext(networkFetcher$doFetch$fetchResult$1);
                    if (hasNext == coroutineSingletons2) {
                    }
                    if (((Boolean) hasNext).booleanValue()) {
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (BufferedChannel.BufferedChannelIterator) networkFetcher$doFetch$fetchResult$1.L$1;
                    coroutineScope2 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    hasNext = obj;
                    if (((Boolean) hasNext).booleanValue()) {
                        Object next = it.next();
                        Object m4191getOrNullimpl = ChannelResult.m4191getOrNullimpl(channel.mo4189tryReceivePtdJZtk());
                        JobKt.launch$default(coroutineScope2, null, null, new FlowExtKt$simpleScan$1(8, m4191getOrNullimpl == null ? next : m4191getOrNullimpl, (Animatable) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, null, false), 3);
                        networkFetcher$doFetch$fetchResult$1.L$0 = coroutineScope2;
                        networkFetcher$doFetch$fetchResult$1.L$1 = it;
                        networkFetcher$doFetch$fetchResult$1.label = 1;
                        hasNext = it.hasNext(networkFetcher$doFetch$fetchResult$1);
                        if (hasNext == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        if (((Boolean) hasNext).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 3:
                AnimationVector1D animationVector1D2 = SeekableTransitionState.Target1;
                Transition transition = (Transition) networkFetcher$doFetch$fetchResult$1.this$0;
                AnimationVector1D animationVector1D3 = SeekableTransitionState.ZeroVelocity;
                Object obj9 = networkFetcher$doFetch$fetchResult$1.L$0;
                SeekableTransitionState seekableTransitionState3 = (SeekableTransitionState) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = seekableTransitionState3.targetState$delegate;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = seekableTransitionState3.fraction$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = networkFetcher$doFetch$fetchResult$1.label;
                try {
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object value = parcelableSnapshotMutableState.getValue();
                        if (!Intrinsics.areEqual(obj9, value)) {
                            SeekableTransitionState.access$moveAnimationToInitialState(seekableTransitionState3);
                            seekableTransitionState3.setFraction(RecyclerView.DECELERATION_RATE);
                            transition.updateTarget$animation_core(obj9);
                            transition.setPlayTimeNanos(0L);
                            seekableTransitionState3.setCurrentState$animation_core(value);
                            parcelableSnapshotMutableState.setValue(obj9);
                        }
                        mutexImpl = seekableTransitionState3.compositionContinuationMutex;
                        networkFetcher$doFetch$fetchResult$1.L$1 = mutexImpl;
                        networkFetcher$doFetch$fetchResult$1.$snapshot = seekableTransitionState3;
                        networkFetcher$doFetch$fetchResult$1.label = 1;
                        if (mutexImpl.lock(networkFetcher$doFetch$fetchResult$1) != coroutineSingletons3) {
                            seekableTransitionState = seekableTransitionState3;
                        }
                        return coroutineSingletons3;
                    }
                    if (i5 == 1) {
                        seekableTransitionState = (SeekableTransitionState) networkFetcher$doFetch$fetchResult$1.$snapshot;
                        mutexImpl = (MutexImpl) networkFetcher$doFetch$fetchResult$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                    } else if (i5 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        networkFetcher$doFetch$fetchResult$1.label = 3;
                        break;
                    } else {
                        if (i5 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            if (!Intrinsics.areEqual(seekableTransitionState3.currentState$delegate.getValue(), obj9)) {
                                if (parcelableSnapshotMutableFloatState2.getFloatValue() < 1.0f) {
                                    SeekableTransitionState.SeekingAnimationState seekingAnimationState = seekableTransitionState3.currentAnimation;
                                    FiniteAnimationSpec finiteAnimationSpec = (FiniteAnimationSpec) networkFetcher$doFetch$fetchResult$1.$networkRequest;
                                    VectorizedFiniteAnimationSpec vectorize = finiteAnimationSpec != null ? finiteAnimationSpec.vectorize() : null;
                                    if (seekingAnimationState == null || !Intrinsics.areEqual(vectorize, seekingAnimationState.animationSpec)) {
                                        if (seekingAnimationState != null) {
                                            vectorizedFiniteAnimationSpec = seekingAnimationState.animationSpec;
                                            seekableTransitionState2 = seekableTransitionState3;
                                        } else {
                                            seekableTransitionState2 = seekableTransitionState3;
                                            vectorizedFiniteAnimationSpec = null;
                                        }
                                        if (vectorizedFiniteAnimationSpec != null) {
                                            parcelableSnapshotMutableFloatState = parcelableSnapshotMutableFloatState2;
                                            long j = seekingAnimationState.progressNanos;
                                            AnimationVector1D animationVector1D4 = seekingAnimationState.start;
                                            AnimationVector1D animationVector1D5 = seekingAnimationState.initialVelocity;
                                            AnimationVector1D animationVector1D6 = animationVector1D5 == null ? animationVector1D3 : animationVector1D5;
                                            animationVector1D = animationVector1D2;
                                            animationVector1D3 = (AnimationVector1D) vectorizedFiniteAnimationSpec.getVelocityFromNanos(j, animationVector1D4, animationVector1D2, animationVector1D6);
                                        } else {
                                            parcelableSnapshotMutableFloatState = parcelableSnapshotMutableFloatState2;
                                            animationVector1D = animationVector1D2;
                                            if (seekingAnimationState != null && seekingAnimationState.progressNanos != 0) {
                                                long j2 = seekingAnimationState.durationNanos;
                                                if (j2 == Long.MIN_VALUE) {
                                                    j2 = seekableTransitionState2.totalDurationNanos;
                                                }
                                                float f = j2 / 1.0E9f;
                                                if (f > RecyclerView.DECELERATION_RATE) {
                                                    animationVector1D3 = new AnimationVector1D(1.0f / f);
                                                }
                                            }
                                        }
                                        if (seekingAnimationState == null) {
                                            seekingAnimationState = new SeekableTransitionState.SeekingAnimationState();
                                        }
                                        AnimationVector1D animationVector1D7 = seekingAnimationState.start;
                                        seekingAnimationState.animationSpec = vectorize;
                                        seekingAnimationState.isComplete = false;
                                        seekingAnimationState.value = parcelableSnapshotMutableFloatState.getFloatValue();
                                        animationVector1D7.set$animation_core(parcelableSnapshotMutableFloatState.getFloatValue(), 0);
                                        long j3 = seekableTransitionState2.totalDurationNanos;
                                        seekingAnimationState.durationNanos = j3;
                                        seekingAnimationState.progressNanos = 0L;
                                        seekingAnimationState.initialVelocity = animationVector1D3;
                                        seekingAnimationState.animationSpecDuration = vectorize != null ? vectorize.getDurationNanos(animationVector1D7, animationVector1D, animationVector1D3) : MathKt__MathJVMKt.roundToLong((1.0d - parcelableSnapshotMutableFloatState.getFloatValue()) * j3);
                                        seekableTransitionState2.currentAnimation = seekingAnimationState;
                                        networkFetcher$doFetch$fetchResult$1.L$1 = null;
                                        networkFetcher$doFetch$fetchResult$1.$snapshot = null;
                                        networkFetcher$doFetch$fetchResult$1.label = 4;
                                        break;
                                    }
                                }
                                seekableTransitionState2 = seekableTransitionState3;
                                networkFetcher$doFetch$fetchResult$1.L$1 = null;
                                networkFetcher$doFetch$fetchResult$1.$snapshot = null;
                                networkFetcher$doFetch$fetchResult$1.label = 4;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i5 != 4) {
                            if (i5 != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            seekableTransitionState2 = seekableTransitionState3;
                            seekableTransitionState2.setFraction(RecyclerView.DECELERATION_RATE);
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        seekableTransitionState2 = seekableTransitionState3;
                        seekableTransitionState2.setCurrentState$animation_core(obj9);
                        networkFetcher$doFetch$fetchResult$1.label = 5;
                        break;
                    }
                    Object obj10 = seekableTransitionState.composedTargetState;
                    mutexImpl.unlock(null);
                    if (!Intrinsics.areEqual(obj9, obj10)) {
                        networkFetcher$doFetch$fetchResult$1.L$1 = null;
                        networkFetcher$doFetch$fetchResult$1.$snapshot = null;
                        networkFetcher$doFetch$fetchResult$1.label = 2;
                        if (seekableTransitionState3.lastFrameTimeNanos == Long.MIN_VALUE) {
                            animateOneFrame = Updater.getMonotonicFrameClock(networkFetcher$doFetch$fetchResult$1.getContext()).withFrameNanos(networkFetcher$doFetch$fetchResult$1, seekableTransitionState3.firstFrameLambda);
                            if (animateOneFrame != coroutineSingletons3) {
                                animateOneFrame = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            animateOneFrame = seekableTransitionState3.animateOneFrame(networkFetcher$doFetch$fetchResult$1);
                            if (animateOneFrame != coroutineSingletons3) {
                                animateOneFrame = Unit.INSTANCE;
                                break;
                            }
                        }
                    }
                    if (!Intrinsics.areEqual(seekableTransitionState3.currentState$delegate.getValue(), obj9)) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    mutexImpl.unlock(null);
                    throw th2;
                }
            case 4:
                AppWidgetId appWidgetId = (AppWidgetId) networkFetcher$doFetch$fetchResult$1.$snapshot;
                int i6 = appWidgetId.appWidgetId;
                Context context = (Context) networkFetcher$doFetch$fetchResult$1.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = networkFetcher$doFetch$fetchResult$1.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) networkFetcher$doFetch$fetchResult$1.L$0;
                    String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(i6);
                    networkFetcher$doFetch$fetchResult$1.L$0 = sessionManagerImpl$scope$1;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    isSessionRunning = sessionManagerImpl$scope$1.isSessionRunning(context, createUniqueRemoteUiName, networkFetcher$doFetch$fetchResult$1);
                    break;
                } else if (i7 == 1) {
                    sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) networkFetcher$doFetch$fetchResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    isSessionRunning = obj;
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sessionManagerImpl$scope$12 = (SessionManagerImpl$scope$1) networkFetcher$doFetch$fetchResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    sessionManagerImpl$scope$1 = sessionManagerImpl$scope$12;
                    AppWidgetSession appWidgetSession = (AppWidgetSession) sessionManagerImpl$scope$1.sessions.get(AppWidgetUtilsKt.createUniqueRemoteUiName(i6));
                    appWidgetSession.getClass();
                    Function3 function3 = (Function3) networkFetcher$doFetch$fetchResult$1.$networkRequest;
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 3;
                    break;
                }
                if (!((Boolean) isSessionRunning).booleanValue()) {
                    AppWidgetSession appWidgetSession2 = new AppWidgetSession((CashQrWidget) networkFetcher$doFetch$fetchResult$1.$cacheResponse, appWidgetId, (Bundle) networkFetcher$doFetch$fetchResult$1.this$0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    networkFetcher$doFetch$fetchResult$1.L$0 = sessionManagerImpl$scope$1;
                    networkFetcher$doFetch$fetchResult$1.label = 2;
                    if (sessionManagerImpl$scope$1.startSession(context, appWidgetSession2, networkFetcher$doFetch$fetchResult$1) != coroutineSingletons4) {
                        sessionManagerImpl$scope$12 = sessionManagerImpl$scope$1;
                        sessionManagerImpl$scope$1 = sessionManagerImpl$scope$12;
                    }
                    return coroutineSingletons4;
                }
                AppWidgetSession appWidgetSession3 = (AppWidgetSession) sessionManagerImpl$scope$1.sessions.get(AppWidgetUtilsKt.createUniqueRemoteUiName(i6));
                appWidgetSession3.getClass();
                Function3 function32 = (Function3) networkFetcher$doFetch$fetchResult$1.$networkRequest;
                networkFetcher$doFetch$fetchResult$1.L$0 = null;
                networkFetcher$doFetch$fetchResult$1.label = 3;
            case 5:
                Context context2 = (Context) networkFetcher$doFetch$fetchResult$1.L$0;
                AppWidgetSession appWidgetSession4 = (AppWidgetSession) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = networkFetcher$doFetch$fetchResult$1.label;
                try {
                } catch (CancellationException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    networkFetcher$doFetch$fetchResult$1.L$1 = th;
                    networkFetcher$doFetch$fetchResult$1.label = 2;
                    appWidgetSession4.notifyWidgetOfError(context2, th);
                    break;
                }
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompositionImpl compositionImpl = (CompositionImpl) networkFetcher$doFetch$fetchResult$1.$snapshot;
                    appWidgetSession4.getClass();
                    compositionImpl.setContent(new ComposableLambdaImpl(new AppWidgetSession$provideGlance$1(context2, appWidgetSession4), true, -1784282257));
                    Recomposer recomposer = (Recomposer) networkFetcher$doFetch$fetchResult$1.this$0;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) networkFetcher$doFetch$fetchResult$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        JobKt.cancel((TimerScopeKt$withTimer$2$1$blockScope$1) networkFetcher$doFetch$fetchResult$1.$networkRequest, JobKt.CancellationException("Error in recomposition coroutine", th));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = networkFetcher$doFetch$fetchResult$1.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (LocalCashBalancePresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (State) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, 0);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = networkFetcher$doFetch$fetchResult$1.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope5, (LocalEditorialPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (MutableState) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (ParcelableSnapshotMutableIntState) networkFetcher$doFetch$fetchResult$1.$networkRequest, 5);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow2.collect(datePickerKt$updateDisplayedMonth$3, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState = (MutableState) networkFetcher$doFetch$fetchResult$1.this$0;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) networkFetcher$doFetch$fetchResult$1.L$0;
                LocalCheckoutDeeplinkScreen localCheckoutDeeplinkScreen = (LocalCheckoutDeeplinkScreen) localEditorialPresenter.responseContextHandler;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = networkFetcher$doFetch$fetchResult$1.label;
                try {
                } catch (Exception e2) {
                    if (e2 instanceof CancellationException) {
                        throw e2;
                    }
                    Timber.Forest.w("Failed to load cart deeplink.", new Object[0], e2);
                    mutableState.setValue(Boolean.TRUE);
                }
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalOrderRepository realLocalOrderRepository = (RealLocalOrderRepository) localEditorialPresenter.launcher;
                    String str2 = localCheckoutDeeplinkScreen.cartToken;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    cart = realLocalOrderRepository.getCart(str2, networkFetcher$doFetch$fetchResult$1);
                    if (cart == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AttributionKey attributionKey2 = (AttributionKey) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                        brandSpot = (BrandSpot) networkFetcher$doFetch$fetchResult$1.$snapshot;
                        createCartResponse = (CreateCartResponse) networkFetcher$doFetch$fetchResult$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        attributionKey = attributionKey2;
                        syncBrandSpot$default = obj;
                        localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) syncBrandSpot$default;
                        if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure)) {
                            mutableState.setValue(Boolean.TRUE);
                        } else if (localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.RedirectToWeb) {
                            ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(new LocalBrandProfileScreen(new BrandSpot(localCheckoutDeeplinkScreen.brandToken, null), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                        } else {
                            if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Success) && !Intrinsics.areEqual(localBrandSyncer$SyncResult, LocalBrandSyncer$SyncResult.Cache.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest).setValue(new LocalCheckoutDeeplinkPresenter$PendingCheckout(brandSpot, createCartResponse, attributionKey));
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cart = obj;
                }
                CreateCartResponse createCartResponse2 = (CreateCartResponse) cart;
                if (createCartResponse2 != null && (zzhoVar = createCartResponse2.response) != null) {
                    CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                    if (createCartResponse$Response$Cart != null) {
                        localCart = createCartResponse$Response$Cart.value;
                        String str3 = localCart == null ? localCart.brand_token : null;
                        String str4 = localCart == null ? localCart.location_token : null;
                        if (createCartResponse2 != null || str3 == null || str4 == null) {
                            mutableState.setValue(Boolean.TRUE);
                            return Unit.INSTANCE;
                        }
                        BrandSpot brandSpot2 = new BrandSpot(str3, str4);
                        attributionKey = new AttributionKey(null);
                        RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) localEditorialPresenter.service;
                        networkFetcher$doFetch$fetchResult$1.L$1 = createCartResponse2;
                        networkFetcher$doFetch$fetchResult$1.$snapshot = brandSpot2;
                        networkFetcher$doFetch$fetchResult$1.$cacheResponse = attributionKey;
                        networkFetcher$doFetch$fetchResult$1.label = 2;
                        brandSpot = brandSpot2;
                        syncBrandSpot$default = RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer, brandSpot, null, null, null, networkFetcher$doFetch$fetchResult$1, 28);
                        if (syncBrandSpot$default != coroutineSingletons8) {
                            createCartResponse = createCartResponse2;
                            localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) syncBrandSpot$default;
                            if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons8;
                    }
                }
                localCart = null;
                if (localCart == null) {
                }
                if (localCart == null) {
                }
                if (createCartResponse2 != null) {
                }
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = networkFetcher$doFetch$fetchResult$1.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$32 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope6, (LocalOrderStatusPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (MutableState) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, 6);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow3.collect(datePickerKt$updateDisplayedMonth$32, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                MutableState mutableState2 = (MutableState) networkFetcher$doFetch$fetchResult$1.this$0;
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) networkFetcher$doFetch$fetchResult$1.L$1;
                BetterNavigator.ScreenNavigator screenNavigator = localBrandProfilePresenter.navigator;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = networkFetcher$doFetch$fetchResult$1.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer2 = localBrandProfilePresenter.syncer;
                    BrandSpot brandSpot3 = (BrandSpot) ((State) networkFetcher$doFetch$fetchResult$1.$snapshot).getValue();
                    String str5 = localBrandProfilePresenter.screen.attributionKey.value;
                    BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) ((State) networkFetcher$doFetch$fetchResult$1.$cacheResponse).getValue();
                    LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType((FulfillmentConfiguration) ((MutableState) networkFetcher$doFetch$fetchResult$1.L$0).getValue());
                    String str6 = (String) mutableState2.getValue();
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    syncBrandSpot = realLocalBrandSyncer2.syncBrandSpot(brandSpot3, str5, brandSpotSyncTokens, type2, str6, networkFetcher$doFetch$fetchResult$1);
                    networkFetcher$doFetch$fetchResult$1 = networkFetcher$doFetch$fetchResult$1;
                    if (syncBrandSpot == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    syncBrandSpot = obj;
                }
                LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult2 = (LocalBrandSyncer$SyncResult) syncBrandSpot;
                ((MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest).setValue(Boolean.FALSE);
                if (localBrandSyncer$SyncResult2 instanceof LocalBrandSyncer$SyncResult.RedirectToWeb) {
                    localBrandProfilePresenter.launcher.openWeb(screenNavigator, ((LocalBrandSyncer$SyncResult.RedirectToWeb) localBrandSyncer$SyncResult2).url);
                    screenNavigator.goTo(Back.INSTANCE);
                } else if (localBrandSyncer$SyncResult2 instanceof LocalBrandSyncer$SyncResult.Failure) {
                    screenNavigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                } else if (localBrandSyncer$SyncResult2 instanceof LocalBrandSyncer$SyncResult.Success) {
                    mutableState2.setValue(null);
                } else if (!Intrinsics.areEqual(localBrandSyncer$SyncResult2, LocalBrandSyncer$SyncResult.Cache.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 11:
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) networkFetcher$doFetch$fetchResult$1.L$1;
                BetterNavigator.ScreenNavigator screenNavigator2 = localBrandLocationCartPresenter.navigator;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = networkFetcher$doFetch$fetchResult$1.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCartCheckoutNavigator localCartCheckoutNavigator = localBrandLocationCartPresenter.cartCheckoutNavigator;
                    LocalCart localCart2 = (LocalCart) networkFetcher$doFetch$fetchResult$1.$snapshot;
                    BrandSpot brandSpot4 = localBrandLocationCartPresenter.brandSpot;
                    LocalBrandLocationCartScreen localBrandLocationCartScreen = localBrandLocationCartPresenter.screen;
                    AttributionKey attributionKey3 = localBrandLocationCartScreen.attributionKey;
                    boolean z = localBrandLocationCartScreen.isProfileSheetInline;
                    BrandSpotSyncTokens brandSpotSyncTokens2 = (BrandSpotSyncTokens) ((MutableState) networkFetcher$doFetch$fetchResult$1.L$0).getValue();
                    RealOrderBuilder realOrderBuilder = localBrandLocationCartPresenter.orderStore.active;
                    OrderBuilder$Payload payload = realOrderBuilder != null ? realOrderBuilder.payload() : null;
                    OpenTabCheckoutRouting openTabCheckoutRouting = OpenTabCheckoutRouting.CLOSE_OPEN_TAB;
                    BuyerIntentScope buyerIntentScope = (BuyerIntentScope) networkFetcher$doFetch$fetchResult$1.$cacheResponse;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    createCheckoutResult = localCartCheckoutNavigator.createCheckoutResult(localCart2, brandSpot4, attributionKey3, z, brandSpotSyncTokens2, screenNavigator2, payload, openTabCheckoutRouting, buyerIntentScope, networkFetcher$doFetch$fetchResult$1);
                    networkFetcher$doFetch$fetchResult$1 = networkFetcher$doFetch$fetchResult$1;
                    if (createCheckoutResult == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createCheckoutResult = obj;
                }
                LocalCartCheckoutResult localCartCheckoutResult = (LocalCartCheckoutResult) createCheckoutResult;
                if (localCartCheckoutResult instanceof LocalCartCheckoutResult.Error) {
                    ((MutableState) networkFetcher$doFetch$fetchResult$1.this$0).setValue(CollectionsKt__CollectionsJVMKt.listOf(((LocalCartCheckoutResult.Error) localCartCheckoutResult).error));
                } else {
                    if (!(localCartCheckoutResult instanceof LocalCartCheckoutResult.Navigation)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(((LocalCartCheckoutResult.Navigation) localCartCheckoutResult).screen);
                }
                ((MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest).setValue(Boolean.valueOf(false));
                return Unit.INSTANCE;
            case 12:
                return invokeSuspend$app$cash$local$presenters$fulfillment$FulfillmentPickerPresenter$models$$inlined$LaunchedEffectNotNull$1(obj);
            case 13:
                CoroutineScope coroutineScope7 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = networkFetcher$doFetch$fetchResult$1.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$12 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (LocalPosBrandOnboardingPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (ShortlinkAction) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, 2);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow4.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$12, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = networkFetcher$doFetch$fetchResult$1.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) networkFetcher$doFetch$fetchResult$1.L$1).getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new Worker$$ExternalSyntheticLambda0((LazyGridState) networkFetcher$doFetch$fetchResult$1.$snapshot, 26));
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$33 = new DatePickerKt$updateDisplayedMonth$3((LocalBrandLocationMenuViewModel) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (LazyListState) networkFetcher$doFetch$fetchResult$1.L$0, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (ParcelableSnapshotMutableIntState) networkFetcher$doFetch$fetchResult$1.$networkRequest);
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (snapshotFlow.collect(datePickerKt$updateDisplayedMonth$33, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                return invokeSuspend$app$cash$local$views$brand$menu$LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$3$1(obj);
            case 16:
                return invokeSuspend$app$cash$molecule$MoleculeKt$immediateClockFlow$1$1(obj);
            case 17:
                return invokeSuspend$com$squareup$cash$account$presenters$ThemeSwitcherPresenter$models$2$1(obj);
            case 18:
                CoroutineScope coroutineScope8 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = networkFetcher$doFetch$fetchResult$1.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$34 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope8, (PaymentHistoryActivityItemPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (MutableState) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, 10);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow5.collect(datePickerKt$updateDisplayedMonth$34, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope9 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = networkFetcher$doFetch$fetchResult$1.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$35 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope9, (CardLockPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, (CoroutineScope) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (State) networkFetcher$doFetch$fetchResult$1.this$0, (State) networkFetcher$doFetch$fetchResult$1.$networkRequest, 13);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow6.collect(datePickerKt$updateDisplayedMonth$35, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                return invokeSuspend$com$squareup$cash$banking$presenters$TransfersPresenter$models$$inlined$CollectEffect$1(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$beacondetection$real$BeaconDetectionSetupTeardown$runDetection$2$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$benefits$presenters$BenefitsHubPresenter$models$$inlined$CollectEffect$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$biometrics$AndroidBiometrics$prompt$1$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$education$BitcoinStoriesWidgetPresenter$models$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$custom$order$BitcoinPeriodSelectionPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$blockers$actions$presenters$BlockerActionConfirmSheetPresenter$models$$inlined$CollectEffect$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$blockers$presenters$AddMoneyBlockerPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$blockers$presenters$AtmPickerAmountBlockerPresenter$models$$inlined$CollectEffect$1(obj);
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) networkFetcher$doFetch$fetchResult$1.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = networkFetcher$doFetch$fetchResult$1.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) networkFetcher$doFetch$fetchResult$1.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$13 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(9, (MutableState) networkFetcher$doFetch$fetchResult$1.$cacheResponse, (MutableState) networkFetcher$doFetch$fetchResult$1.this$0, (MutableState) networkFetcher$doFetch$fetchResult$1.$networkRequest, (CalendarBlockerPresenter) networkFetcher$doFetch$fetchResult$1.$snapshot, coroutineScope10);
                    networkFetcher$doFetch$fetchResult$1.L$0 = null;
                    networkFetcher$doFetch$fetchResult$1.label = 1;
                    if (flow7.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$13, networkFetcher$doFetch$fetchResult$1) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$fetchResult$1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$snapshot = obj;
        this.$cacheResponse = obj2;
        this.L$0 = obj3;
        this.this$0 = obj4;
        this.$networkRequest = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$cacheResponse = seekableTransitionState;
        this.L$0 = obj;
        this.this$0 = transition;
        this.$networkRequest = finiteAnimationSpec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.L$0 = localEditorialPresenter;
        this.this$0 = mutableState;
        this.$networkRequest = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 17;
        this.this$0 = localEditorialPresenter;
        this.$networkRequest = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$fetchResult$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$snapshot = obj2;
        this.$cacheResponse = obj3;
        this.this$0 = obj4;
        this.$networkRequest = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$fetchResult$1(Object obj, Continuation continuation, Object obj2, Object obj3, State state, State state2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$snapshot = obj2;
        this.$cacheResponse = obj3;
        this.this$0 = state;
        this.$networkRequest = state2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(Ref$ObjectRef ref$ObjectRef, NetworkFetcher networkFetcher, Ref$ObjectRef ref$ObjectRef2, NetworkRequest networkRequest, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$snapshot = ref$ObjectRef;
        this.this$0 = networkFetcher;
        this.$cacheResponse = ref$ObjectRef2;
        this.$networkRequest = networkRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(Channel channel, Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$snapshot = channel;
        this.$cacheResponse = animatable;
        this.this$0 = mutableState;
        this.$networkRequest = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(FlowCollector flowCollector, SnapshotNotifier snapshotNotifier, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.$cacheResponse = flowCollector;
        this.this$0 = snapshotNotifier;
        this.$networkRequest = function2;
    }
}
