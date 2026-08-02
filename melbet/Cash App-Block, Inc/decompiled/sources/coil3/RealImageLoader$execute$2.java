package coil3;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.emoji2.text.MetadataRepo;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.work.impl.StartStopTokensImpl;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.backend.real.RealMarketingMessageRepository$getMarketingMessages$1;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.viewmodels.GiftCardInputState;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.views.home.LocalHomeGeoViewKt;
import app.cash.molecule.SnapshotNotifier;
import app.cash.redwood.treehouse.OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.redwood.treehouse.StateSnapshot;
import app.cash.redwood.treehouse.TreehouseLayout;
import app.cash.redwood.treehouse.ViewContentCodeBinding;
import app.cash.redwood.treehouse.ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineScopedKt;
import app.cash.zipline.loader.OkHttpZiplineHttpClient;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.memory.RealStrongMemoryCache;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.size.DimensionKt;
import coil3.util.AndroidSystemCallbacks;
import com.android.volley.Response;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.fillr.m1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzpa;
import com.google.android.gms.maps.GoogleMap;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout$$ExternalSyntheticLambda3;
import com.squareup.cash.treehouse.platform.PlatformLauncher$Attachment;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse$Response$Quote;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $request;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$request = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$request;
        switch (i) {
            case 0:
                RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2((RealImageLoader) this.this$0, (ImageRequest) obj2, continuation, 0);
                realImageLoader$execute$2.L$0 = obj;
                return realImageLoader$execute$2;
            case 1:
                return new RealImageLoader$execute$2((LocalBrandProfilePresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 1);
            case 2:
                return new RealImageLoader$execute$2((LocalBrandProfilePresenter) this.L$0, (FulfillmentConfiguration) this.this$0, (State) obj2, continuation, 2);
            case 3:
                return new RealImageLoader$execute$2((LocalBrandLocationCartPresenter) this.L$0, (BrandSpotSyncTokens) this.this$0, (State) obj2, continuation, 3);
            case 4:
                RealImageLoader$execute$2 realImageLoader$execute$22 = new RealImageLoader$execute$2((Flow) this.this$0, continuation, (MusicPresenter) obj2, 4);
                realImageLoader$execute$22.L$0 = obj;
                return realImageLoader$execute$22;
            case 5:
                return new RealImageLoader$execute$2((CardStudioPresenter) this.this$0, (MutableState) obj2, continuation, 5);
            case 6:
                RealImageLoader$execute$2 realImageLoader$execute$23 = new RealImageLoader$execute$2((Flow) this.this$0, continuation, (LocalHomeGeoPresenter) obj2, 6);
                realImageLoader$execute$23.L$0 = obj;
                return realImageLoader$execute$23;
            case 7:
                return new RealImageLoader$execute$2((RealLocalBrandRepository) this.L$0, (BrandSpot) this.this$0, (MutableState) obj2, continuation, 7);
            case 8:
                RealImageLoader$execute$2 realImageLoader$execute$24 = new RealImageLoader$execute$2((Flow) this.this$0, continuation, (LocalPosCheckInPresenter) obj2, 8);
                realImageLoader$execute$24.L$0 = obj;
                return realImageLoader$execute$24;
            case 9:
                return new RealImageLoader$execute$2((LocalPosCheckInPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 9);
            case 10:
                RealImageLoader$execute$2 realImageLoader$execute$25 = new RealImageLoader$execute$2((Flow) this.this$0, continuation, (ErrorPresenter) obj2, 10);
                realImageLoader$execute$25.L$0 = obj;
                return realImageLoader$execute$25;
            case 11:
                return new RealImageLoader$execute$2((GiftCardInputState) this.L$0, (TextFieldState) this.this$0, (Function1) obj2, continuation, 11);
            case 12:
                return new RealImageLoader$execute$2((TextFieldState) this.L$0, (Function1) this.this$0, (State) obj2, continuation, 12);
            case 13:
                return new RealImageLoader$execute$2((MutableState) this.L$0, (LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) this.this$0, (Function1) obj2, continuation, 13);
            case 14:
                return new RealImageLoader$execute$2((RealSheetState) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 14);
            case 15:
                return new RealImageLoader$execute$2((UiCallbackModel) this.L$0, (RealSheetState) this.this$0, (MutableState) obj2, continuation, 15);
            case 16:
                RealImageLoader$execute$2 realImageLoader$execute$26 = new RealImageLoader$execute$2((SnapshotNotifier) this.this$0, (Function2) obj2, continuation, 16);
                realImageLoader$execute$26.L$0 = obj;
                return realImageLoader$execute$26;
            case 17:
                RealImageLoader$execute$2 realImageLoader$execute$27 = new RealImageLoader$execute$2((AndroidSystemCallbacks) this.this$0, (RealTreehouseApp) obj2, continuation, 17);
                realImageLoader$execute$27.L$0 = obj;
                return realImageLoader$execute$27;
            case 18:
                RealImageLoader$execute$2 realImageLoader$execute$28 = new RealImageLoader$execute$2((OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) this.this$0, (ViewContentCodeBinding) obj2, continuation, 18);
                realImageLoader$execute$28.L$0 = obj;
                return realImageLoader$execute$28;
            case 19:
                return new RealImageLoader$execute$2((ViewContentCodeBinding) obj2, continuation);
            case 20:
                RealImageLoader$execute$2 realImageLoader$execute$29 = new RealImageLoader$execute$2((FlowCollector) this.this$0, (String) obj2, continuation, 20);
                realImageLoader$execute$29.L$0 = obj;
                return realImageLoader$execute$29;
            case 21:
                RealImageLoader$execute$2 realImageLoader$execute$210 = new RealImageLoader$execute$2((OkHttpZiplineHttpClient) this.this$0, (Request) obj2, continuation, 21);
                realImageLoader$execute$210.L$0 = obj;
                return realImageLoader$execute$210;
            case 22:
                return new RealImageLoader$execute$2((AsyncImagePainter) this.this$0, (AsyncImagePainter.Input) obj2, continuation, 22);
            case 23:
                return new RealImageLoader$execute$2((zzmz) this.L$0, (Context) this.this$0, (String) obj2, continuation, 23);
            case 24:
                return new RealImageLoader$execute$2((GenerateContentRequest) this.L$0, (zzpa) this.this$0, (RealStrongMemoryCache) obj2, continuation, 24);
            case 25:
                return new RealImageLoader$execute$2((JavaDataStorage) this.L$0, (Preferences.Key) this.this$0, (Long) obj2, continuation, 25);
            case 26:
                RealImageLoader$execute$2 realImageLoader$execute$211 = new RealImageLoader$execute$2((Function3) this.this$0, (GoogleMap) obj2, continuation, 26);
                realImageLoader$execute$211.L$0 = obj;
                return realImageLoader$execute$211;
            case 27:
                return new RealImageLoader$execute$2((ComposeUiClusterRenderer) this.L$0, (ComposeUiClusterRenderer.ViewKey) this.this$0, (ComposeUiClusterRenderer.InvalidatingComposeView) obj2, continuation, 27);
            case 28:
                return new RealImageLoader$execute$2((AddressTypeaheadState) this.L$0, (AddressSearchResult) this.this$0, (MutableState) obj2, continuation, 28);
            default:
                return new RealImageLoader$execute$2((RealBugReportSender) this.L$0, (ApiResult.Success) this.this$0, (Pair) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealImageLoader$execute$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01af, code lost:
    
        if (r2 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0283, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, "heartbeat") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05f5, code lost:
    
        if (r2 == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e0, code lost:
    
        if (r4 == r3) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0769, code lost:
    
        if ((!r2.isEmpty()) == true) goto L359;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v66 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object syncBrandSpot$default;
        MutableState mutableState;
        Object fulfillmentSchedulingQuote;
        Object shouldShowRequestPermissionRationale;
        Object shouldShowOverridePrompt;
        ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
        ViewContentCodeBinding viewContentCodeBinding;
        Object obj2;
        Object execute;
        AsyncImagePainter asyncImagePainter;
        Object handle;
        AsyncImagePainter.State state;
        ImageResult imageResult;
        AsyncImagePainter.State error;
        Object zza;
        Object select$views;
        int i = this.$r8$classId;
        int i2 = 24;
        int i3 = 10;
        int i4 = 3;
        boolean z = false;
        boolean z2 = false;
        int i5 = 2;
        Object obj3 = this.$request;
        int i6 = 1;
        ?? r11 = 0;
        StateSnapshot stateSnapshot = null;
        r11 = 0;
        switch (i) {
            case 0:
                ImageRequest imageRequest = (ImageRequest) obj3;
                RealImageLoader realImageLoader = (RealImageLoader) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Deferred job = ExtrasKt.getDisposable(imageRequest, JobKt.async$default((CoroutineScope) this.L$0, (CoroutineContext) realImageLoader.options.mainCoroutineContextLazy.getValue(), null, new RealImageLoader$enqueue$job$1(realImageLoader, imageRequest, r11, i6), 2)).getJob();
                    this.label = 1;
                    Object await = job.await(this);
                    if (await == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 1:
                MutableState mutableState2 = (MutableState) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (LocalBrandProfilePresenter.models$lambda$9(mutableState2) != null) {
                        RealMarketingMessageRepository realMarketingMessageRepository = ((LocalBrandProfilePresenter) this.L$0).marketingMessageRepository;
                        String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9(mutableState2);
                        models$lambda$9.getClass();
                        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new SafeFlow(new SliderState$drag$2(realMarketingMessageRepository, models$lambda$9, (Continuation) r11, 21)), realMarketingMessageRepository.redeemedOfferTokens, new RealMarketingMessageRepository$getMarketingMessages$1(i4, r11, i6), z2 ? 1 : 0);
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1((MutableState) obj3, (Continuation) r11, i6);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalInstalledStore localInstalledStore = ((LocalBrandProfilePresenter) this.L$0).store;
                    String str = ((BrandSpot) ((State) obj3).getValue()).brandToken;
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) this.this$0;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore).m1289updateFulfillmentConfigurationNoPDS7c(str, fulfillmentConfiguration, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) this.L$0;
                BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationCartPresenter.navigator;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer = localBrandLocationCartPresenter.syncer;
                    BrandSpot brandSpot = localBrandLocationCartPresenter.brandSpot;
                    String str2 = localBrandLocationCartPresenter.screen.attributionKey.value;
                    BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) this.this$0;
                    LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType((FulfillmentConfiguration) ((State) obj3).getValue());
                    this.label = 1;
                    syncBrandSpot$default = RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer, brandSpot, str2, brandSpotSyncTokens, type2, this, 16);
                    if (syncBrandSpot$default == coroutineSingletons4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    syncBrandSpot$default = obj;
                }
                LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) syncBrandSpot$default;
                if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.RedirectToWeb)) {
                    if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure)) {
                        if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Success) && !Intrinsics.areEqual(localBrandSyncer$SyncResult, LocalBrandSyncer$SyncResult.Cache.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        screenNavigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                    }
                } else {
                    screenNavigator.goTo(Back.INSTANCE);
                }
                break;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(coroutineScope, (MusicPresenter) obj3, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.this$0;
                LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen = (LocalSchedulingDayTimePickerScreen) cardStudioPresenter.appConfig;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj3;
                    LocalService localService = (LocalService) cardStudioPresenter.ioContext;
                    String str3 = ((BrandSpot) cardStudioPresenter.cardStudioQueries).brandToken;
                    String str4 = localSchedulingDayTimePickerScreen.locationToken;
                    GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment getFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment = new GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment(FulfillmentConfigurationKt.toProtoFulfillment(localSchedulingDayTimePickerScreen.fulfillmentConfiguration));
                    ArrayList arrayList = localSchedulingDayTimePickerScreen.itemTokens;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((MenuItemToken) it.next()).value);
                    }
                    GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = new GetFulfillmentSchedulingQuoteRequest(str3, str4, (String) null, getFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment, arrayList2, 36);
                    this.L$0 = mutableState;
                    this.label = 1;
                    fulfillmentSchedulingQuote = localService.getFulfillmentSchedulingQuote(getFulfillmentSchedulingQuoteRequest, this);
                    if (fulfillmentSchedulingQuote == coroutineSingletons6) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    MutableState mutableState3 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState3;
                    fulfillmentSchedulingQuote = obj;
                }
                ApiResult apiResult = (ApiResult) fulfillmentSchedulingQuote;
                boolean z3 = apiResult instanceof ApiResult.Success;
                Object obj4 = SchedulingDayTimePickerViewModel.ModelState.FailedToLoadDays.INSTANCE;
                if (!z3) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) ((ApiResult.Success) apiResult).response;
                    RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
                    if (rumTagsUtilsKt != null) {
                        GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse = rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse ? (GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) rumTagsUtilsKt : null;
                        LocalErrorResponse localErrorResponse = getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse != null ? getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse.value : null;
                        if (localErrorResponse != null) {
                            if (localErrorResponse.errors != null) {
                                break;
                            }
                        }
                    }
                    RumTagsUtilsKt rumTagsUtilsKt2 = getFulfillmentSchedulingQuoteResponse.response;
                    if (rumTagsUtilsKt2 != null) {
                        GetFulfillmentSchedulingQuoteResponse$Response$Quote getFulfillmentSchedulingQuoteResponse$Response$Quote = rumTagsUtilsKt2 instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote ? (GetFulfillmentSchedulingQuoteResponse$Response$Quote) rumTagsUtilsKt2 : null;
                        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote2 = getFulfillmentSchedulingQuoteResponse$Response$Quote != null ? getFulfillmentSchedulingQuoteResponse$Response$Quote.value : null;
                        if (fulfillmentSchedulingQuote2 != null) {
                            r11 = fulfillmentSchedulingQuote2.scheduling_days;
                        }
                    }
                    if (r11 == 0) {
                        r11 = EmptyList.INSTANCE;
                    }
                    SchedulingDay schedulingDay = (SchedulingDay) CollectionsKt.first((List) r11);
                    obj4 = new SchedulingDayTimePickerViewModel.ModelState.LoadedDays(r11, schedulingDay, CardStudioPresenter.access$asInitialTimesState(cardStudioPresenter, schedulingDay));
                }
                mutableState.setValue(obj4);
                break;
            case 6:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(14, coroutineScope2, (LocalHomeGeoPresenter) obj3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass1, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealLocalBrandRepository) this.L$0).brand((BrandSpot) this.this$0), 24);
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1((MutableState) obj3, (Continuation) r11, i5);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2(coroutineScope3, (LocalPosCheckInPresenter) obj3, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(lazyPagingItems$collectLoadState$22, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                MutableState mutableState4 = (MutableState) this.this$0;
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.L$0;
                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = (AndroidPermissionManager$create$1) localPosCheckInPresenter.cameraPermissions;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState4.getValue()).booleanValue() && !Intrinsics.areEqual((Boolean) ((MutableState) obj3).getValue(), Boolean.TRUE)) {
                        this.label = 1;
                        shouldShowRequestPermissionRationale = androidPermissionManager$create$1.shouldShowRequestPermissionRationale(this);
                        break;
                    } else {
                        break;
                    }
                } else if (i16 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    shouldShowRequestPermissionRationale = obj;
                } else if (i16 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    shouldShowOverridePrompt = obj;
                    if (((Boolean) shouldShowOverridePrompt).booleanValue()) {
                        mutableState4.setValue(Boolean.TRUE);
                        ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(((AndroidStringManager) localPosCheckInPresenter.stringManager).get(R.string.local_presenters_check_in_need_permission_to_scan)), LocalExplanatoryDialog.PositiveAction.OpenSettings.INSTANCE));
                    }
                    break;
                }
                if (!((Boolean) shouldShowRequestPermissionRationale).booleanValue()) {
                    this.label = 2;
                    shouldShowOverridePrompt = androidPermissionManager$create$1.shouldShowOverridePrompt(this);
                    break;
                } else {
                    androidPermissionManager$create$1.request();
                }
                break;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$23 = new LazyPagingItems$collectLoadState$2(coroutineScope4, (ErrorPresenter) obj3, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(lazyPagingItems$collectLoadState$23, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((GiftCardInputState) this.L$0) != null) {
                        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(i6, (TextFieldState) this.this$0))), 1);
                        SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i6, (Function1) obj3);
                        this.label = 1;
                        if (drop.collect(anonymousClass2, this) == coroutineSingletons12) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop2 = FlowKt.drop(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(i5, (TextFieldState) this.L$0))), 1);
                    AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2((Function1) this.this$0, (State) obj3, (Continuation) r11, 17);
                    this.label = 1;
                    if (FlowKt.collectLatest(drop2, animatedImageDecoder$wrapDrawable$2, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new TooltipKt$$ExternalSyntheticLambda1(27, (MutableState) this.L$0));
                    LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry freeTextEntry = (LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) this.this$0;
                    RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(snapshotFlow, freeTextEntry, i4);
                    AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$22 = new AnimatedImageDecoder$wrapDrawable$2((Function1) obj3, freeTextEntry, (Continuation) r11, 18);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$scheduleBadgeClearingWork$$inlined$map$1, animatedImageDecoder$wrapDrawable$22, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                RealSheetState realSheetState = (RealSheetState) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState5 = (MutableState) this.this$0;
                    int i22 = LocalHomeGeoViewKt.$r8$clinit;
                    mutableState5.setValue(Boolean.TRUE);
                    if (realSheetState.getSettledPosition() == SheetPosition.Hidden) {
                        this.label = 1;
                        if (realSheetState.peek(this) == coroutineSingletons15) {
                            break;
                        }
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int i23 = LocalHomeGeoViewKt.$r8$clinit;
                ((MutableState) obj3).setValue(Boolean.TRUE);
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((UiCallbackModel) this.L$0) == null) {
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1((RealSheetState) this.this$0, i4));
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$13 = new TabContentPresenter$models$4$1$1$1((MutableState) obj3, (Continuation) r11, 4);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow2, tabContentPresenter$models$4$1$1$13, this) == coroutineSingletons16) {
                            break;
                        }
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(flowCollector, (SnapshotNotifier) this.this$0, (Function2) obj3, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(networkFetcher$doFetch$fetchResult$1, this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                Zipline zipline = (Zipline) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidSystemCallbacks androidSystemCallbacks = (AndroidSystemCallbacks) this.this$0;
                    this.L$0 = null;
                    this.label = 1;
                    androidSystemCallbacks.getClass();
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlatformLauncher$Attachment.class);
                    zipline.getClass();
                    Object obj5 = zipline.attachments.get(orCreateKotlinClass);
                    if (obj5 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("expected TreehousePlatformLauncher to be attached already");
                        break;
                    } else {
                        KClasses.cast(orCreateKotlinClass, obj5);
                        PlatformLauncher$Attachment platformLauncher$Attachment = (PlatformLauncher$Attachment) obj5;
                        MetadataRepo metadataRepo = platformLauncher$Attachment.value;
                        if (metadataRepo == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("multiple calls to take() ?");
                            break;
                        } else {
                            platformLauncher$Attachment.value = null;
                            Object bindServices = metadataRepo.bindServices(zipline, this);
                            if (bindServices != coroutineSingletons18) {
                                bindServices = Unit.INSTANCE;
                            }
                            if (bindServices == coroutineSingletons18) {
                                break;
                            }
                        }
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService = (OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) this.this$0;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object call = onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService.callHandler.call(onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, 2, new Object[0]);
                    call.getClass();
                    ViewContentCodeBinding viewContentCodeBinding2 = (ViewContentCodeBinding) obj3;
                    Response response = new Response(viewContentCodeBinding2, onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, ((Boolean) ((StateFlow) call).getValue()).booleanValue());
                    m1 m1Var = viewContentCodeBinding2.onBackPressedDispatcher;
                    m1Var.getClass();
                    RedwoodLayoutKt$toAndroid$1 redwoodLayoutKt$toAndroid$1 = new RedwoodLayoutKt$toAndroid$1(response, response.intermediate);
                    response.result = new n$$ExternalSyntheticLambda0(i3, redwoodLayoutKt$toAndroid$1, response);
                    ((OnBackPressedDispatcher) m1Var.a).addCallback(redwoodLayoutKt$toAndroid$1);
                    CallResult callResult = new CallResult(response, redwoodLayoutKt$toAndroid$1);
                    JobKt.launch$default(coroutineScope5, null, null, new ZiplineLoader$ModuleJob$run$3(onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, response, r11, 25), 3);
                    this.L$0 = null;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(callResult, 6));
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons19) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                ViewContentCodeBinding viewContentCodeBinding3 = (ViewContentCodeBinding) obj3;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Recorder.AnonymousClass6 anonymousClass6 = viewContentCodeBinding3.serviceScope;
                    PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = viewContentCodeBinding3.codeSession.appService;
                    anonymousClass6.getClass();
                    PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ZiplineScopedKt.withScope(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, (ZiplineScope) anonymousClass6.this$0);
                    CashTreehouseLayout$$ExternalSyntheticLambda3 cashTreehouseLayout$$ExternalSyntheticLambda3 = viewContentCodeBinding3.contentSource;
                    cashTreehouseLayout$$ExternalSyntheticLambda3.getClass();
                    ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService = (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) ((Function1) cashTreehouseLayout$$ExternalSyntheticLambda3.f$0).invoke(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2);
                    viewContentCodeBinding3.treehouseUiOrNull = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
                    viewContentCodeBinding3.eventBridge.idToElementMap = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
                    TreehouseLayout treehouseLayout = viewContentCodeBinding3.viewOrNull;
                    if (treehouseLayout == null) {
                        viewContentCodeBinding = viewContentCodeBinding3;
                        viewContentCodeBinding.stateSnapshot = stateSnapshot;
                        Object call2 = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService.callHandler.call(ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService, 0, viewContentCodeBinding3);
                        call2.getClass();
                        break;
                    } else {
                        String str5 = treehouseLayout.stateSnapshotId;
                        StartStopTokensImpl startStopTokensImpl = viewContentCodeBinding3.stateStore;
                        String str6 = str5 != null ? str5 : "";
                        this.L$0 = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
                        this.this$0 = viewContentCodeBinding3;
                        this.label = 1;
                        obj2 = startStopTokensImpl.runs.get(str6);
                        if (obj2 == coroutineSingletons20) {
                            break;
                        } else {
                            viewContentCodeBinding = viewContentCodeBinding3;
                        }
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    viewContentCodeBinding = (ViewContentCodeBinding) this.this$0;
                    ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService2 = (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService2;
                    obj2 = obj;
                }
                stateSnapshot = (StateSnapshot) obj2;
                viewContentCodeBinding.stateSnapshot = stateSnapshot;
                Object call22 = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService.callHandler.call(ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService, 0, viewContentCodeBinding3);
                call22.getClass();
            case 20:
                String str7 = (String) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(str7, "reload")) {
                        break;
                    } else {
                        this.L$0 = null;
                        this.label = 1;
                        if (((FlowCollector) this.this$0).emit((String) obj3, this) == coroutineSingletons21) {
                            break;
                        }
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                z = true;
                break;
            case 21:
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealWebSocket$$ExternalSyntheticLambda3 realWebSocket$$ExternalSyntheticLambda3 = new RealWebSocket$$ExternalSyntheticLambda3(((OkHttpZiplineHttpClient) this.this$0).okHttpClient.newWebSocket((Request) obj3, new WebSocketListener() { // from class: app.cash.zipline.loader.OkHttpZiplineHttpClient$openDevelopmentServerWebSocket$2$webSocket$1
                        @Override // okhttp3.WebSocketListener
                        public final void onClosing(WebSocket webSocket, int i31, String str8) {
                            ProducerCoroutine producerCoroutine = (ProducerCoroutine) ProducerScope.this;
                            producerCoroutine.getClass();
                            producerCoroutine.close(null);
                            ((RealWebSocket) webSocket).close(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, null);
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onFailure(WebSocket webSocket, Throwable th, okhttp3.Response response2) {
                            webSocket.getClass();
                            ProducerCoroutine producerCoroutine = (ProducerCoroutine) ProducerScope.this;
                            producerCoroutine.getClass();
                            producerCoroutine.close(null);
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onMessage(WebSocket webSocket, String str8) {
                            ChannelsKt__ChannelsKt.trySendBlocking(str8, ProducerScope.this);
                        }
                    }), i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, realWebSocket$$ExternalSyntheticLambda3, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                AsyncImagePainter.Input input = (AsyncImagePainter.Input) obj3;
                AsyncImagePainter asyncImagePainter2 = (AsyncImagePainter) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1 = asyncImagePainter2.previewHandler;
                    if (asyncImagePreviewHandler$Companion$Default$1 != null) {
                        ImageRequest access$updateRequest = AsyncImagePainter.access$updateRequest(asyncImagePainter2, input.request, true);
                        RealImageLoader realImageLoader2 = input.imageLoader;
                        this.label = 1;
                        handle = asyncImagePreviewHandler$Companion$Default$1.handle(realImageLoader2, access$updateRequest, this);
                        break;
                    } else {
                        ImageRequest access$updateRequest2 = AsyncImagePainter.access$updateRequest(asyncImagePainter2, input.request, false);
                        RealImageLoader realImageLoader3 = input.imageLoader;
                        this.L$0 = asyncImagePainter2;
                        this.label = 2;
                        execute = realImageLoader3.execute(access$updateRequest2, this);
                        if (execute != coroutineSingletons23) {
                            asyncImagePainter = asyncImagePainter2;
                            imageResult = (ImageResult) execute;
                            asyncImagePainter.getClass();
                            if (!(imageResult instanceof SuccessResult)) {
                            }
                            state = error;
                        }
                    }
                    break;
                } else if (i31 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    handle = obj;
                    state = (AsyncImagePainter.State) handle;
                } else if (i31 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    asyncImagePainter = (AsyncImagePainter) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    execute = obj;
                    imageResult = (ImageResult) execute;
                    asyncImagePainter.getClass();
                    if (!(imageResult instanceof SuccessResult)) {
                        SuccessResult successResult = (SuccessResult) imageResult;
                        error = new AsyncImagePainter.State.Success(AsyncImageKt.m1445asPainter55t9rM(successResult.image, successResult.request.context, asyncImagePainter.filterQuality), successResult);
                    } else if (!(imageResult instanceof ErrorResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ErrorResult errorResult = (ErrorResult) imageResult;
                        Image image = errorResult.image;
                        error = new AsyncImagePainter.State.Error(image != null ? AsyncImageKt.m1445asPainter55t9rM(image, errorResult.request.context, asyncImagePainter.filterQuality) : null, errorResult);
                    }
                    state = error;
                }
                AsyncImagePainter.access$updateState(asyncImagePainter2, state);
                break;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                SafeTrace.throwOnFailure(obj);
                if (i32 == 0) {
                    zzmz zzmzVar = (zzmz) this.L$0;
                    Context context = (Context) this.this$0;
                    zzmh zzmhVar = new zzmh((String) obj3, zzmzVar, context, (Continuation) null, 0);
                    this.label = 1;
                    if (zzmz.zzi(zzmzVar, context, zzmhVar, this) == coroutineSingletons24) {
                    }
                }
                break;
            case 24:
                GenerateContentRequest generateContentRequest = (GenerateContentRequest) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                SafeTrace.throwOnFailure(obj);
                if (i33 != 0) {
                    zza = obj;
                } else {
                    generateContentRequest.getClass();
                    zzpa zzpaVar = (zzpa) this.this$0;
                    this.label = 1;
                    zza = zzpa.zza(zzpaVar, "", this);
                    if (zza == coroutineSingletons25) {
                    }
                }
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DataStore dataStore = ((JavaDataStorage) this.L$0).dataStore;
                    AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$23 = new AnimatedImageDecoder$wrapDrawable$2((Preferences.Key) this.this$0, (Long) obj3, (Continuation) r11, i2);
                    this.label = 1;
                    Object edit = DimensionKt.edit(dataStore, animatedImageDecoder$wrapDrawable$23, this);
                    if (edit != coroutineSingletons26) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 26:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Function3) this.this$0).invoke(coroutineScope6, (GoogleMap) obj3, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ComposeUiClusterRenderer composeUiClusterRenderer = (ComposeUiClusterRenderer) this.L$0;
                    ComposeUiClusterRenderer.ViewKey viewKey = (ComposeUiClusterRenderer.ViewKey) this.this$0;
                    ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView = (ComposeUiClusterRenderer.InvalidatingComposeView) obj3;
                    this.label = 1;
                    int i37 = ComposeUiClusterRenderer.$r8$clinit;
                    Continuation continuation = null;
                    Object collectLatest = FlowKt.collectLatest(FlowKt.callbackFlow(new NetworkFetcher$doFetch$2(invalidatingComposeView, continuation, 7)), new AnimatedImageDecoder$wrapDrawable$2(viewKey, composeUiClusterRenderer, invalidatingComposeView, continuation, 25), this);
                    Object obj7 = collectLatest;
                    if (collectLatest != obj6) {
                        obj7 = Unit.INSTANCE;
                    }
                    if (obj7 == obj6) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) this.L$0;
                    AddressSearchResult addressSearchResult = (AddressSearchResult) this.this$0;
                    this.label = 1;
                    select$views = addressTypeaheadState.select$views(addressSearchResult, this);
                    if (select$views == coroutineSingletons28) {
                        break;
                    }
                } else if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    select$views = obj;
                }
                if (!((Boolean) select$views).booleanValue()) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = AddressTypeaheadKt.LocalAddressSearcher;
                    ((MutableState) obj3).setValue(null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealBugReportSender.access$uploadNavigationBreadcrumbs((RealBugReportSender) this.L$0, (CreateBugReportResponse) ((ApiResult.Success) this.this$0).response, (Pair) obj3, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i39 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(ViewContentCodeBinding viewContentCodeBinding, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.$request = viewContentCodeBinding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$request = moleculePresenter;
    }
}
