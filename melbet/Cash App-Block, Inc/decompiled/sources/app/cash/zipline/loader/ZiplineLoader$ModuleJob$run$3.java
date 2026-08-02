package app.cash.zipline.loader;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.datastore.core.SimpleActor;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.room.coroutines.PooledConnectionImpl;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.StartStopTokensImpl;
import androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTrackerKt;
import androidx.work.impl.constraints.trackers.ConstraintTrackerKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.BuyerIntentSyncManager$$ExternalSyntheticLambda2;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.backend.real.CalculateLineItemsManager$observeMutations$3;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.cart.OpenTabAddRoundState;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.molecule.RecompositionMode;
import app.cash.passcode.backend.AppLockMonitor;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.passcode.screens.EndAppLock;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.redwood.treehouse.RealTreehouseApp$codeHost$1;
import app.cash.redwood.treehouse.StateSnapshot;
import app.cash.redwood.treehouse.ViewContentCodeBinding;
import app.cash.redwood.treehouse.ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.zipline.EventListener$Companion$NONE$1;
import app.cash.zipline.QuickJs;
import app.cash.zipline.Zipline;
import app.cash.zipline.internal.CoroutineEventLoop$DelayedJob;
import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.internal.GuestService$Companion$Adapter$GeneratedOutboundService;
import app.cash.zipline.internal.bridge.FlowZiplineCollector;
import app.cash.zipline.internal.bridge.FlowZiplineService;
import app.cash.zipline.internal.bridge.StateFlowZiplineService;
import app.cash.zipline.loader.ZiplineFile;
import app.cash.zipline.loader.ZiplineLoader;
import app.cash.zipline.loader.internal.InternalJniKt;
import app.cash.zipline.loader.internal.InternalJniKt$systemEpochMsClock$1;
import app.cash.zipline.loader.internal.fetcher.Fetcher;
import app.cash.zipline.loader.internal.fetcher.HttpFetcher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.util.AndroidSystemCallbacks;
import com.android.volley.Response;
import com.fillr.n;
import com.google.android.gms.dynamite.zzf;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LocalAutomaticDiscountsAndroid;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.protos.cash.local.client.app.v1.AbandonPOSCheckInRequest;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.GetActiveOrdersRequest;
import com.squareup.protos.cash.local.client.v1.GetActiveOrdersResponse;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.internal.connection.RealConnectionPool;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ZiplineLoader$ModuleJob$run$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $byteString;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$ModuleJob$run$3(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$byteString = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$byteString;
        switch (i) {
            case 0:
                return new ZiplineLoader$ModuleJob$run$3((ZiplineLoader.ModuleJob) this.this$0, (ByteString) obj2, continuation, 0);
            case 1:
                return new ZiplineLoader$ModuleJob$run$3((Function2) this.this$0, (PooledConnectionImpl) obj2, continuation, 1);
            case 2:
                return new ZiplineLoader$ModuleJob$run$3((Function2) this.this$0, (Ref$ObjectRef) obj2, continuation, 2);
            case 3:
                ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$3 = new ZiplineLoader$ModuleJob$run$3((BatteryNotLowController) obj2, continuation, 3);
                ziplineLoader$ModuleJob$run$3.this$0 = obj;
                return ziplineLoader$ModuleJob$run$3;
            case 4:
                return new ZiplineLoader$ModuleJob$run$3((CalculateLineItemsManager) this.this$0, (CartBuilder) obj2, continuation, 4);
            case 5:
                return new ZiplineLoader$ModuleJob$run$3((LocalBrandLocationCheckoutPresenter) this.this$0, (FulfillmentConfiguration) obj2, continuation, 5);
            case 6:
                return new ZiplineLoader$ModuleJob$run$3((LocalMenuComboDetailsPresenter) this.this$0, (FulfillmentConfiguration) obj2, continuation, 6);
            case 7:
                return new ZiplineLoader$ModuleJob$run$3((LocalMenuItemDetailsPresenter) this.this$0, (FulfillmentConfiguration) obj2, continuation, 7);
            case 8:
                return new ZiplineLoader$ModuleJob$run$3((LocalBrandProfilePresenter) this.this$0, (State) obj2, continuation, 8);
            case 9:
                return new ZiplineLoader$ModuleJob$run$3((LocalBrandProfilePresenter) this.this$0, (MutableState) obj2, continuation, 9);
            case 10:
                return new ZiplineLoader$ModuleJob$run$3((LocalBrandLocationCartPresenter) this.this$0, (MutableState) obj2, continuation, 10);
            case 11:
                return new ZiplineLoader$ModuleJob$run$3((LocalBrandLocationCartPresenter) this.this$0, (FulfillmentConfiguration) obj2, continuation, 11);
            case 12:
                return new ZiplineLoader$ModuleJob$run$3((MutableState) obj2, continuation, 12);
            case 13:
                return new ZiplineLoader$ModuleJob$run$3((CartBuilder) this.this$0, (CartEntryWithQuantity) obj2, continuation, 13);
            case 14:
                return new ZiplineLoader$ModuleJob$run$3((FulfillmentPickerPresenter) this.this$0, (MutableState) obj2, continuation, 14);
            case 15:
                return new ZiplineLoader$ModuleJob$run$3((LocalHomeGeoPresenter) this.this$0, (LocalHomeViewEvent) obj2, continuation, 15);
            case 16:
                return new ZiplineLoader$ModuleJob$run$3((LocalPosBrandOnboardingPresenter) this.this$0, (ShortlinkAction) obj2, continuation, 16);
            case 17:
                return new ZiplineLoader$ModuleJob$run$3((LocalPosLocalCashRedemptionPresenter) this.this$0, (LocalPOSCheckIn) obj2, continuation, 17);
            case 18:
                return new ZiplineLoader$ModuleJob$run$3((LocalHomePresenter) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 18);
            case 19:
                return new ZiplineLoader$ModuleJob$run$3((TabContentPresenter) this.this$0, (LocalHomeViewEvent) obj2, continuation, 19);
            case 20:
                return new ZiplineLoader$ModuleJob$run$3((LazyGridState) this.this$0, (CollapsingToolbarScaffoldState) obj2, continuation, 20);
            case 21:
                return new ZiplineLoader$ModuleJob$run$3((String) this.this$0, (MutableState) obj2, continuation, 21);
            case 22:
                return new ZiplineLoader$ModuleJob$run$3((PagerState) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 22);
            case 23:
                return new ZiplineLoader$ModuleJob$run$3((AppLockMonitor) obj2, continuation, 23);
            case 24:
                return new ZiplineLoader$ModuleJob$run$3((RealTreehouseApp$codeHost$1) this.this$0, (EventListener.Factory) obj2, continuation, 24);
            case 25:
                return new ZiplineLoader$ModuleJob$run$3((OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) this.this$0, (Response) obj2, continuation, 25);
            case 26:
                return new ZiplineLoader$ModuleJob$run$3((ViewContentCodeBinding) this.this$0, (String) obj2, continuation, 26);
            case 27:
                return new ZiplineLoader$ModuleJob$run$3((CoroutineEventLoop$DelayedJob) this.this$0, (n) obj2, continuation, 27);
            case 28:
                ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$32 = new ZiplineLoader$ModuleJob$run$3((FlowZiplineService) obj2, continuation, 28);
                ziplineLoader$ModuleJob$run$32.this$0 = obj;
                return ziplineLoader$ModuleJob$run$32;
            default:
                ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$33 = new ZiplineLoader$ModuleJob$run$3((StateFlowZiplineService) obj2, continuation, 29);
                ziplineLoader$ModuleJob$run$33.this$0 = obj;
                return ziplineLoader$ModuleJob$run$33;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 25:
                ((ZiplineLoader$ModuleJob$run$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((ZiplineLoader$ModuleJob$run$3) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0351, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(3000, r32) != r1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x035f, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(3000, r32) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03a7, code lost:
    
        if (r1.expand(r4, r32) == r0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0398, code lost:
    
        if (androidx.compose.foundation.lazy.grid.LazyGridState.animateScrollToItem$default(r1, 0, r32) == r0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0512, code lost:
    
        if (app.cash.local.backend.real.RealLocalBrandSyncer.syncBrandSpot$default(r1, r1, null, null, r4, r32, 20) == r9) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0526, code lost:
    
        if (r0 == r9) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v74, types: [androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x035f -> B:120:0x0363). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object activeOrders;
        OpenTabAddRoundState openTabAddRoundState;
        Object syncBrandSpot$default;
        int i;
        Object startLocalClientScenarioHackFlow;
        MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1;
        StateSnapshot stateSnapshot;
        int i2 = 3;
        int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ZiplineLoader.ModuleJob moduleJob = (ZiplineLoader.ModuleJob) this.this$0;
                    EventListenerAdapter eventListenerAdapter = moduleJob.receiver;
                    ByteString byteString = (ByteString) this.$byteString;
                    String str = moduleJob.id;
                    ByteString byteString2 = moduleJob.module.sha256;
                    this.label = 1;
                    app.cash.zipline.EventListener eventListener = eventListenerAdapter.delegate;
                    Zipline zipline = eventListenerAdapter.zipline;
                    Object moduleLoadStart = eventListener.moduleLoadStart(zipline, str);
                    try {
                        byte[] byteArray = ZiplineFile.Companion.toZiplineFile(byteString).quickjsBytecode.toByteArray();
                        zzf zzfVar = InternalJniKt.ecdsaP256;
                        QuickJs quickJs = zipline.quickJs;
                        quickJs.execute(quickJs.compile(quickJs.context, "globalThis.app_cash_zipline_currentModuleId = '" + str + "';", "?"));
                        quickJs.execute(byteArray);
                        quickJs.evaluate("delete globalThis.app_cash_zipline_currentModuleId;", "?");
                        eventListener.moduleLoadEnd(zipline, str, moduleLoadStart);
                        if (Unit.INSTANCE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        eventListener.moduleLoadEnd(zipline, str, moduleLoadStart);
                        throw th;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Function2 function2 = (Function2) this.this$0;
                PooledConnectionImpl pooledConnectionImpl = (PooledConnectionImpl) this.$byteString;
                this.label = 1;
                Object invoke = function2.invoke(pooledConnectionImpl, this);
                return invoke == coroutineSingletons2 ? coroutineSingletons2 : invoke;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Function2 function22 = (Function2) this.this$0;
                Object obj2 = ((Ref$ObjectRef) this.$byteString).element;
                this.label = 1;
                Object invoke2 = function22.invoke(obj2, this);
                return invoke2 == coroutineSingletons3 ? coroutineSingletons3 : invoke2;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerScope producerScope = (ProducerScope) this.this$0;
                    BatteryNotLowController batteryNotLowController = (BatteryNotLowController) this.$byteString;
                    BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1 = new BaseConstraintController$track$1$listener$1(batteryNotLowController, producerScope);
                    BatteryNotLowTracker batteryNotLowTracker = batteryNotLowController.tracker;
                    batteryNotLowTracker.getClass();
                    synchronized (batteryNotLowTracker.lock) {
                        try {
                            if (batteryNotLowTracker.listeners.add(baseConstraintController$track$1$listener$1)) {
                                if (batteryNotLowTracker.listeners.size() == 1) {
                                    batteryNotLowTracker.currentState = batteryNotLowTracker.readSystemState$1();
                                    Logger$LogcatLogger.get().debug(ConstraintTrackerKt.TAG, batteryNotLowTracker.getClass().getSimpleName() + ": initial state = " + batteryNotLowTracker.currentState);
                                    Logger$LogcatLogger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, batteryNotLowTracker.getClass().getSimpleName().concat(": registering receiver"));
                                    batteryNotLowTracker.appContext.registerReceiver(batteryNotLowTracker.broadcastReceiver, batteryNotLowTracker.getIntentFilter());
                                }
                                baseConstraintController$track$1$listener$1.onConstraintChanged(batteryNotLowTracker.currentState);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(29, (BatteryNotLowController) this.$byteString, baseConstraintController$track$1$listener$1);
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, dialogHostKt$$ExternalSyntheticLambda0, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CartBuilder cartBuilder = (CartBuilder) this.$byteString;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CalculateLineItemsManager calculateLineItemsManager = (CalculateLineItemsManager) this.this$0;
                    DerivedStateFlow valuesState = Trace.valuesState(calculateLineItemsManager.featureFlagManager, LaunchDarklyFeatureFlags$LocalAutomaticDiscountsAndroid.INSTANCE);
                    RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                    Flow m4195debounceHG0u8IE = FlowKt.m4195debounceHG0u8IE(FlowKt.combine(valuesState, FlowKt.distinctUntilChanged(new RealLocalInstalledStore$hideBrands$$inlined$map$1(BundleKt.moleculeFlow$default(new BuyerIntentSyncManager$$ExternalSyntheticLambda2(cartBuilder, i3)), i2)), BundleKt.moleculeFlow$default(new BuyerIntentSyncManager$$ExternalSyntheticLambda2(cartBuilder, i2)), LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(calculateLineItemsManager.store, ((RealCartBuilder) cartBuilder).brandSpot.brandToken), CalculateLineItemsManager$observeMutations$3.INSTANCE), CalculateLineItemsManager.debounceInterval);
                    Savers_androidKt$$ExternalSyntheticLambda0 savers_androidKt$$ExternalSyntheticLambda0 = new Savers_androidKt$$ExternalSyntheticLambda0(calculateLineItemsManager, 11);
                    SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = FlowKt.defaultKeySelector;
                    TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, savers_androidKt$$ExternalSyntheticLambda0);
                    Continuation continuation2 = null;
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new SliderState$drag$2(calculateLineItemsManager, cartBuilder, continuation2, 20), FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(m4195debounceHG0u8IE, saversKt$$ExternalSyntheticLambda2, savers_androidKt$$ExternalSyntheticLambda0));
                    RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(cartBuilder, continuation2, 24);
                    this.label = 1;
                    if (FlowKt.collectLatest(mapLatest, realBadger2$clear$2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) this.this$0;
                    LocalInstalledStore localInstalledStore = localBrandLocationCheckoutPresenter.store;
                    String str2 = localBrandLocationCheckoutPresenter.brandSpot.brandToken;
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) this.$byteString;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore).m1289updateFulfillmentConfigurationNoPDS7c(str2, fulfillmentConfiguration, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) this.this$0;
                    LocalInstalledStore localInstalledStore2 = localMenuComboDetailsPresenter.store;
                    String str3 = localMenuComboDetailsPresenter.screen.brandSpot.brandToken;
                    FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) this.$byteString;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore2).m1289updateFulfillmentConfigurationNoPDS7c(str3, fulfillmentConfiguration2, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) this.this$0;
                    LocalInstalledStore localInstalledStore3 = localMenuItemDetailsPresenter.store;
                    String str4 = localMenuItemDetailsPresenter.screen.brandSpot.brandToken;
                    FulfillmentConfiguration fulfillmentConfiguration3 = (FulfillmentConfiguration) this.$byteString;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore3).m1289updateFulfillmentConfigurationNoPDS7c(str4, fulfillmentConfiguration3, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer = ((LocalBrandProfilePresenter) this.this$0).syncer;
                    BrandSpot brandSpot = (BrandSpot) ((State) this.$byteString).getValue();
                    this.label = 1;
                    if (realLocalBrandSyncer.syncBuyerInfo(brandSpot, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalService localService = localBrandProfilePresenter.service;
                    GetActiveOrdersRequest getActiveOrdersRequest = new GetActiveOrdersRequest(localBrandProfilePresenter.screen.brandSpot.brandToken);
                    this.label = 1;
                    activeOrders = localService.getActiveOrders(getActiveOrdersRequest, this);
                    if (activeOrders == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    activeOrders = obj;
                }
                ApiResult apiResult = (ApiResult) activeOrders;
                if (apiResult instanceof ApiResult.Success) {
                    ((MutableState) this.$byteString).setValue(((GetActiveOrdersResponse) ((ApiResult.Success) apiResult).response).active_orders);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) this.this$0;
                    LocalInstalledStore localInstalledStore4 = localBrandLocationCartPresenter.store;
                    String str5 = localBrandLocationCartPresenter.brandSpot.brandToken;
                    RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore4;
                    str5.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(realLocalInstalledStore.fulfillmentConfigurationQueries.select(str5)), realLocalInstalledStore.ioDispatcher);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(i5, (MutableState) this.$byteString);
                    this.label = 1;
                    Object collect = mapToOneOrNull.collect(new RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1.AnonymousClass2(anonymousClass1, realLocalInstalledStore, i5), this);
                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationCartPresenter localBrandLocationCartPresenter2 = (LocalBrandLocationCartPresenter) this.this$0;
                    LocalInstalledStore localInstalledStore5 = localBrandLocationCartPresenter2.store;
                    String str6 = localBrandLocationCartPresenter2.brandSpot.brandToken;
                    FulfillmentConfiguration fulfillmentConfiguration4 = (FulfillmentConfiguration) this.$byteString;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore5).m1289updateFulfillmentConfigurationNoPDS7c(str6, fulfillmentConfiguration4, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState = (MutableState) this.$byteString;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OpenTabAddRoundState openTabAddRoundState2 = (OpenTabAddRoundState) mutableState.getValue();
                    if ((openTabAddRoundState2 instanceof OpenTabAddRoundState.Failure) || (openTabAddRoundState2 instanceof OpenTabAddRoundState.Ordered)) {
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                        this.this$0 = openTabAddRoundState2;
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                        openTabAddRoundState = openTabAddRoundState2;
                        mutableState.setValue(new OpenTabAddRoundState.Idle(openTabAddRoundState.getAttemptId()));
                    } else if (!(openTabAddRoundState2 instanceof OpenTabAddRoundState.Ordering) && !(openTabAddRoundState2 instanceof OpenTabAddRoundState.Idle)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    openTabAddRoundState = (OpenTabAddRoundState) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(new OpenTabAddRoundState.Idle(openTabAddRoundState.getAttemptId()));
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                CartBuilder cartBuilder2 = (CartBuilder) this.this$0;
                CartEntry cartEntry = ((CartEntryWithQuantity) this.$byteString).getCartEntry();
                RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder2;
                cartEntry.getClass();
                realCartBuilder.clearServerDerivedState();
                SnapshotStateList snapshotStateList = realCartBuilder.selections;
                ListIterator listIterator = snapshotStateList.listIterator();
                int i20 = 0;
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                    if (!stateListIterator.hasNext()) {
                        i20 = -1;
                    } else if (!Intrinsics.areEqual(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry(), cartEntry)) {
                        i20++;
                    }
                }
                if (i20 != -1) {
                    String str7 = ((CartEntryWithQuantity) snapshotStateList.remove(i20)).getCartEntry().offerToken;
                    if (str7 != null) {
                        realCartBuilder.m1204clearRemovedOfferLW58JdM(str7);
                    }
                    ListIterator listIterator2 = snapshotStateList.listIterator();
                    while (true) {
                        StateListIterator stateListIterator2 = (StateListIterator) listIterator2;
                        if (stateListIterator2.hasNext()) {
                            i4 += ((CartEntryWithQuantity) stateListIterator2.next()).getQuantity();
                        } else if (i4 == 0) {
                            BlockersData.Flow.INSTANCE.getClass();
                            String generateToken = BlockersData.Flow.Companion.generateToken();
                            generateToken.getClass();
                            realCartBuilder.checkoutFlowToken = generateToken;
                            realCartBuilder.includesPreorderItemsState.setValue(Boolean.FALSE);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 14:
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = fulfillmentPickerPresenter.navigator;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeliveryQuote deliveryQuote = (DeliveryQuote) ((MutableState) this.$byteString).getValue();
                    RealLocalBrandSyncer realLocalBrandSyncer2 = fulfillmentPickerPresenter.syncer;
                    if (deliveryQuote == null) {
                        BrandSpot brandSpot2 = fulfillmentPickerPresenter.brandSpot;
                        this.label = 2;
                        syncBrandSpot$default = RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer2, brandSpot2, null, null, null, this, 28);
                        break;
                    } else {
                        BrandSpot brandSpot3 = new BrandSpot(fulfillmentPickerPresenter.brandToken, deliveryQuote.location.token);
                        LocalFulfillmentType localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
                        this.label = 1;
                        break;
                    }
                    return coroutineSingletons15;
                }
                if (i21 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i21 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    syncBrandSpot$default = obj;
                    LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) syncBrandSpot$default;
                    if (localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure) {
                        screenNavigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                    } else if (localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.RedirectToWeb) {
                        fulfillmentPickerPresenter.launcher.openWeb(screenNavigator, ((LocalBrandSyncer$SyncResult.RedirectToWeb) localBrandSyncer$SyncResult).url);
                        screenNavigator.goTo(Back.INSTANCE);
                    } else if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Cache) && !(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((LocalHomeGeoPresenter) this.this$0).tabContentEvents;
                    LocalHomeViewEvent localHomeViewEvent = (LocalHomeViewEvent) this.$byteString;
                    this.label = 1;
                    if (sharedFlowImpl.emit(localHomeViewEvent, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                LocalPosBrandOnboardingPresenter localPosBrandOnboardingPresenter = (LocalPosBrandOnboardingPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = localPosBrandOnboardingPresenter.shortlinkHandler;
                    ShortlinkAction shortlinkAction = (ShortlinkAction) this.$byteString;
                    shortlinkAction.getClass();
                    BetterNavigator.ScreenNavigator screenNavigator2 = localPosBrandOnboardingPresenter.navigator;
                    GetShortlinkRequest.InvocationContext invocationContext = GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_INTERACTION;
                    ConvertFromJavaKt$$Lambda$4 convertFromJavaKt$$Lambda$4 = new ConvertFromJavaKt$$Lambda$4(localPosBrandOnboardingPresenter, i5);
                    this.label = 1;
                    if (realCashLocalShortlinkHandler.handleShortlink(shortlinkAction, screenNavigator2, invocationContext, convertFromJavaKt$$Lambda$4, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = (LocalPosLocalCashRedemptionPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalService localService2 = (LocalService) localPosLocalCashRedemptionPresenter.service;
                    AbandonPOSCheckInRequest abandonPOSCheckInRequest = new AbandonPOSCheckInRequest(null, ((LocalPOSCheckIn) this.$byteString).check_in_token, ((POSLocalCashRedemption) localPosLocalCashRedemptionPresenter.localCashRedemption).location_token, ByteString.EMPTY);
                    this.label = 1;
                    if (localService2.abandonPOSCheckIn(abandonPOSCheckInRequest, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                localPosLocalCashRedemptionPresenter.navigator.goTo(LocalTabScreen.INSTANCE);
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer3 = (RealLocalBrandSyncer) ((LocalHomePresenter) this.this$0).syncer;
                    boolean z = ((ParcelableSnapshotMutableIntState) this.$byteString).getIntValue() > 0;
                    this.label = 1;
                    if (realLocalBrandSyncer3.syncLocalTab(z, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl2 = ((TabContentPresenter) this.this$0).toolbarEvents;
                    TabToolbarInternalViewEvent tabToolbarInternalViewEvent = ((LocalHomeViewEvent.TabToolbarEvent) ((LocalHomeViewEvent) this.$byteString)).event;
                    this.label = 1;
                    if (sharedFlowImpl2.emit(tabToolbarInternalViewEvent, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyGridState lazyGridState = (LazyGridState) this.this$0;
                    this.label = 1;
                    i = 0;
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    i = 0;
                }
                CollapsingToolbarState collapsingToolbarState = ((CollapsingToolbarScaffoldState) this.$byteString).toolbarState;
                this.label = 2;
                break;
            case 21:
                MutableState mutableState2 = (MutableState) this.$byteString;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.FALSE);
                    if (((String) this.this$0) == null) {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                } else if (i28 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.TRUE);
                    this.label = 2;
                    break;
                } else {
                    if (i28 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.FALSE);
                    this.label = 1;
                    break;
                }
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagerState pagerState = (PagerState) this.this$0;
                    int intValue = ((ParcelableSnapshotMutableIntState) this.$byteString).getIntValue();
                    this.label = 1;
                    if (PagerState.scrollToPage$default(pagerState, intValue, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor appLockMonitor = (AppLockMonitor) this.$byteString;
                    MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$12 = appLockMonitor.navigatorSwitcher;
                    RealPasscodeFlowStarter realPasscodeFlowStarter = appLockMonitor.passcodeFlowStarter;
                    EndAppLock endAppLock = EndAppLock.INSTANCE;
                    ClientScenario clientScenario = ClientScenario.UNLOCK_APP;
                    this.this$0 = mainActivity$navigatorSwitcher$12;
                    this.label = 1;
                    startLocalClientScenarioHackFlow = realPasscodeFlowStarter.startLocalClientScenarioHackFlow(endAppLock, clientScenario, null, null);
                    if (startLocalClientScenarioHackFlow == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                    mainActivity$navigatorSwitcher$1 = mainActivity$navigatorSwitcher$12;
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainActivity$navigatorSwitcher$1 = (MainActivity$navigatorSwitcher$1) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    startLocalClientScenarioHackFlow = obj;
                }
                Screen screen = (Screen) startLocalClientScenarioHackFlow;
                mainActivity$navigatorSwitcher$1.getClass();
                screen.getClass();
                MainContainerDelegate mainContainerDelegate = mainActivity$navigatorSwitcher$1.this$0.mainContainerDelegate;
                if (mainContainerDelegate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                    throw null;
                }
                CashNavigator cashNavigator = mainContainerDelegate.cashNavigator;
                cashNavigator.getClass();
                cashNavigator.hasReceivedLockNavigation = true;
                SimpleActor simpleActor = cashNavigator.navigator;
                int ordinal = ((NavigatorState) ((Enum) simpleActor.consumeMessage)).ordinal();
                if (ordinal == 0) {
                    simpleActor.navigatorFor(NavigatorState.Locked).goTo(screen, null, null);
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        NavigatorState navigatorState = NavigatorState.Locked;
                        simpleActor.navigatorFor(navigatorState).goTo(screen, null, null);
                        simpleActor.setActiveKey(navigatorState);
                    } else if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 24:
                RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = (RealTreehouseApp$codeHost$1) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EventListener.Factory factory = (EventListener.Factory) this.$byteString;
                    factory.getClass();
                    RealTreehouseApp realTreehouseApp = realTreehouseApp$codeHost$1.this$0;
                    RealTreehouseApp.Factory factory2 = realTreehouseApp.factory;
                    AndroidSystemCallbacks androidSystemCallbacks = realTreehouseApp.spec;
                    if (androidSystemCallbacks == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("closed");
                        return null;
                    }
                    ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = realTreehouseApp.dispatchers.zipline;
                    ManifestVerifier manifestVerifier = factory2.manifestVerifier;
                    ZiplineHttpClient ziplineHttpClient = factory2.httpClient;
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = app.cash.zipline.EventListener.NONE;
                    InternalJniKt$systemEpochMsClock$1 internalJniKt$systemEpochMsClock$1 = InternalJniKt.systemEpochMsClock;
                    executorCoroutineDispatcherImpl.getClass();
                    internalJniKt$systemEpochMsClock$1.getClass();
                    HttpFetcher httpFetcher = new HttpFetcher(ziplineHttpClient);
                    int i32 = 19;
                    ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(eventListener$Companion$NONE$1, i32);
                    int i33 = SemaphoreKt.MAX_SPIN_CYCLES;
                    new SemaphoreImpl(3);
                    ArraysKt___ArraysKt.filterNotNull(new Fetcher[]{null, httpFetcher});
                    int i34 = SemaphoreKt.MAX_SPIN_CYCLES;
                    new SemaphoreImpl(8);
                    ZiplineLoader ziplineLoader = new ZiplineLoader(executorCoroutineDispatcherImpl, manifestVerifier, httpFetcher, (15 & 16) != 0 ? exoPlayerImplInternal$$ExternalSyntheticLambda2 : new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(i32, factory, realTreehouseApp), internalJniKt$systemEpochMsClock$1, null, null, null, null);
                    if (!androidSystemCallbacks.shutdown) {
                        ZiplineCache ziplineCache = (ZiplineCache) factory2.cache.getValue();
                        CoroutineDispatcher limitedParallelism = factory2.ziplineLoaderDispatcher.limitedParallelism(1);
                        ziplineCache.getClass();
                        ziplineLoader = ZiplineLoader.copy$default(ZiplineLoader.copy$default(ziplineLoader, null, null, ziplineCache, limitedParallelism, null, 19), factory2.embeddedDir, factory2.embeddedFileSystem, null, null, null, 28);
                    }
                    String str8 = (String) androidSystemCallbacks.activityCallbacks;
                    ChannelFlowTransformLatest channelFlowTransformLatest = (ChannelFlowTransformLatest) androidSystemCallbacks.imageLoader;
                    SerializersModule serializersModule = (SerializersModule) androidSystemCallbacks.componentCallbacks;
                    RealConnectionPool realConnectionPool = (RealConnectionPool) androidSystemCallbacks.application;
                    RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(androidSystemCallbacks, realTreehouseApp, continuation, 17);
                    serializersModule.getClass();
                    ChannelFlowBuilder channelFlow = FlowKt.channelFlow(new ZiplineLoader$load$2(ziplineLoader, str8, realConnectionPool, serializersModule, realImageLoader$execute$2, channelFlowTransformLatest, (Continuation) null, 0));
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(realTreehouseApp$codeHost$1, 12);
                    this.label = 1;
                    Object collect2 = channelFlow.collect(new ThumbNode$onAttach$1.AnonymousClass1(20, lazyPagingItems$collectLoadState$2, realTreehouseApp), this);
                    if (collect2 != coroutineSingletons25) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService = (OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) this.this$0;
                    Object call = onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService.callHandler.call(onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, 2, new Object[0]);
                    call.getClass();
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2((Response) this.$byteString, 13);
                    this.label = 1;
                    if (((StateFlow) call).collect(lazyPagingItems$collectLoadState$22, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 26:
                ViewContentCodeBinding viewContentCodeBinding = (ViewContentCodeBinding) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService = viewContentCodeBinding.treehouseUiOrNull;
                    if (ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService == null || (stateSnapshot = (StateSnapshot) ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService.callHandler.call(ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService, 1, new Object[0])) == null) {
                        return Unit.INSTANCE;
                    }
                    StartStopTokensImpl startStopTokensImpl = viewContentCodeBinding.stateStore;
                    String str9 = (String) this.$byteString;
                    this.label = 1;
                    startStopTokensImpl.runs.put(str9, stateSnapshot);
                    if (Unit.INSTANCE == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                n nVar = (n) this.$byteString;
                CoroutineEventLoop$DelayedJob coroutineEventLoop$DelayedJob = (CoroutineEventLoop$DelayedJob) this.this$0;
                int i37 = coroutineEventLoop$DelayedJob.timeoutId;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = coroutineEventLoop$DelayedJob.delayMillis;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.ensureActive(((ContextScope) nVar.b).getCoroutineContext());
                GuestService$Companion$Adapter$GeneratedOutboundService guestService$Companion$Adapter$GeneratedOutboundService = (GuestService$Companion$Adapter$GeneratedOutboundService) nVar.c;
                Object call2 = guestService$Companion$Adapter$GeneratedOutboundService.callHandler.call(guestService$Companion$Adapter$GeneratedOutboundService, 0, Integer.valueOf(i37));
                call2.getClass();
                ((LinkedHashMap) nVar.d).remove(new Integer(i37));
                return Unit.INSTANCE;
            case 28:
                final ProducerScope producerScope2 = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowZiplineService flowZiplineService = (FlowZiplineService) this.$byteString;
                    FlowZiplineCollector flowZiplineCollector = new FlowZiplineCollector() { // from class: app.cash.zipline.internal.bridge.FlowSerializer$toFlow$1$1
                        @Override // app.cash.zipline.internal.bridge.FlowZiplineCollector
                        public final Object emit(Object obj3, Continuation continuation3) {
                            int i40 = i4;
                            ProducerScope producerScope3 = producerScope2;
                            switch (i40) {
                                case 0:
                                    Object send = ((ProducerCoroutine) producerScope3)._channel.send(obj3, continuation3);
                                    if (send != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object send2 = ((ProducerCoroutine) producerScope3)._channel.send(obj3, continuation3);
                                    if (send2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.this$0 = null;
                    this.label = 1;
                    if (flowZiplineService.collect(flowZiplineCollector, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                final ProducerScope producerScope3 = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowZiplineService stateFlowZiplineService = (StateFlowZiplineService) this.$byteString;
                    FlowZiplineCollector flowZiplineCollector2 = new FlowZiplineCollector() { // from class: app.cash.zipline.internal.bridge.FlowSerializer$toFlow$1$1
                        @Override // app.cash.zipline.internal.bridge.FlowZiplineCollector
                        public final Object emit(Object obj3, Continuation continuation3) {
                            int i402 = i5;
                            ProducerScope producerScope32 = producerScope3;
                            switch (i402) {
                                case 0:
                                    Object send = ((ProducerCoroutine) producerScope32)._channel.send(obj3, continuation3);
                                    if (send != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object send2 = ((ProducerCoroutine) producerScope32)._channel.send(obj3, continuation3);
                                    if (send2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.this$0 = null;
                    this.label = 1;
                    if (stateFlowZiplineService.collect(flowZiplineCollector2, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$ModuleJob$run$3(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$byteString = obj;
    }
}
