package androidx.compose.material3;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.camera2.impl.ResultListener;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.ActiveCamera;
import androidx.camera.camera2.pipe.compat.AndroidCameraState;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.CameraDeviceWrapper;
import androidx.camera.camera2.pipe.compat.CameraState;
import androidx.camera.camera2.pipe.compat.CameraStateClosed;
import androidx.camera.camera2.pipe.compat.CameraStateClosing;
import androidx.camera.camera2.pipe.compat.CameraStateOpen;
import androidx.camera.camera2.pipe.compat.CameraStateUnopened;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.compat.CaptureSessionState$cameraDevice$2$1;
import androidx.camera.camera2.pipe.compat.OpenCameraResult;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.compose.ViewfinderArgs;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.interaction.DragInteraction$Cancel;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.DragInteraction$Stop;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.LinkStateInteractionSourceObserver;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.OnVisibilityChangedNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1;
import androidx.paging.GenerationalViewportHint;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings;
import androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1;
import androidx.paging.ViewportHint;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.protocol.host.ArcadeHostProtocol;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1;
import app.cash.local.presenters.instore.TableQrCodeScannerPresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalLoyaltySheet;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewEvent;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewEvent;
import app.cash.local.viewmodels.sheet.LoyaltySheetEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.redwood.treehouse.RealEventPublisher$ZiplineEventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.redwood.treehouse.RealTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1;
import app.cash.redwood.treehouse.ZiplineCodeSession;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.zipline.EventListener;
import app.cash.zipline.Zipline;
import app.cash.zipline.loader.LoadResult;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.internal.zzm;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$newPhotoResults$2$1$1;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewModel;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewEvent;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewEvent$DownloadClick;
import com.squareup.cash.activity.backend.ActivityFormattingResult;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$activity$2$1$2$emit$1;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$activityForReceipt$$inlined$map$1$2$1;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$11$1$1$emit$1;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewModel;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.businessprofile.BusinessProfileManageDowngradeToPersonal;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowConfirmScheduling;
import com.squareup.cash.cdf.localmarketing.EventLocation;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignTappedMessage;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewUpsellImpression;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.DeepLinkParserKt;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.db2.payment.Pending;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.presenters.TransferStockPresenter$models$3$1$2;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.treehouse.network.HttpClient$Companion$Adapter;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.UpdateBusinessAccountTaxInfoFlowParameters;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.util.android.ActivityResult;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonImpl;
import okio.ByteString;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.RequestFactory;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ThumbNode$onAttach$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(LazyGridState lazyGridState, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.this$0 = lazyGridState;
        this.label = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new ThumbNode$onAttach$1((ThumbNode) obj2, continuation, 0);
            case 1:
                return new ThumbNode$onAttach$1((Deferred) obj2, continuation, 1);
            case 2:
                return new ThumbNode$onAttach$1((ResultListener) obj2, continuation, 2);
            case 3:
                return new ThumbNode$onAttach$1(continuation, (UseCaseCameraImpl) obj2);
            case 4:
                return new ThumbNode$onAttach$1((List) obj2, continuation, 4);
            case 5:
                return new ThumbNode$onAttach$1((ActiveCamera) obj2, continuation, 5);
            case 6:
                return new ThumbNode$onAttach$1((Camera2CameraStatusMonitor) obj2, continuation, 6);
            case 7:
                return new ThumbNode$onAttach$1((HCaptcha) obj2, continuation, 7);
            case 8:
                return new ThumbNode$onAttach$1((AndroidCameraState) obj2, continuation, 8);
            case 9:
                return new ThumbNode$onAttach$1((JWECryptoParts) obj2, continuation, 9);
            case 10:
                return new ThumbNode$onAttach$1((e0) obj2, continuation, 10);
            case 11:
                return new ThumbNode$onAttach$1((zzm) obj2, continuation, 11);
            case 12:
                return new ThumbNode$onAttach$1((GraphCommand.RequestProcessor) obj2, continuation, 12);
            case 13:
                return new ThumbNode$onAttach$1((CameraBackendsImpl) obj2, continuation, 13);
            case 14:
                return new ThumbNode$onAttach$1((SurfaceRequest) obj2, continuation, 14);
            case 15:
                return new ThumbNode$onAttach$1((SeekableTransitionState) obj2, continuation, 15);
            case 16:
                return new ThumbNode$onAttach$1((DefaultDebugIndication.DefaultDebugIndicationInstance) obj2, continuation, 16);
            case 17:
                return new ThumbNode$onAttach$1((MouseWheelScrollingLogic) obj2, continuation, 17);
            case 18:
                return new ThumbNode$onAttach$1((LazyGridState) obj2, this.label, continuation);
            case 19:
                return new ThumbNode$onAttach$1((Recorder.AnonymousClass4) obj2, continuation, 19);
            case 20:
                return new ThumbNode$onAttach$1((CursorAnimationState) obj2, continuation, 20);
            case 21:
                return new ThumbNode$onAttach$1((LinkStateInteractionSourceObserver) obj2, continuation, 21);
            case 22:
                return new ThumbNode$onAttach$1((RequestFactory) obj2, continuation, 22);
            case 23:
                return new ThumbNode$onAttach$1((TextFieldSelectionState) obj2, continuation, 23);
            case 24:
                ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1((SelectionManager) obj2, continuation, 24);
                long j = ((Offset) obj).packedValue;
                return thumbNode$onAttach$1;
            case 25:
                return new ThumbNode$onAttach$1((Scene.AnonymousClass1) obj2, continuation, 25);
            case 26:
                return new ThumbNode$onAttach$1((SuspendingPointerInputModifierNodeImpl) obj2, continuation, 26);
            case 27:
                return new ThumbNode$onAttach$1((OnVisibilityChangedNode) obj2, continuation, 27);
            case 28:
                return new ThumbNode$onAttach$1((AsyncFontListLoader) obj2, continuation, 28);
            default:
                return new ThumbNode$onAttach$1((GlanceRemoteViewsService.GlanceRemoteViewsFactory) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 24:
                long j = ((Offset) obj).packedValue;
                break;
        }
        return ((ThumbNode$onAttach$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x03cc, code lost:
    
        if (r0.shutdown$camera_camera2_pipe() == r1) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03bf, code lost:
    
        if (r2.shutdown$camera_camera2_pipe() == r1) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x050e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(2000, r14) == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0503, code lost:
    
        if (r1.awaitInternal(r14) == r0) goto L291;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CompletableDeferredImpl completableDeferredImpl;
        boolean isTerminated;
        Object first;
        OpenCameraResult openCameraResult;
        Unit unit;
        int i = 3;
        int i2 = 5;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ThumbNode thumbNode = (ThumbNode) this.this$0;
                SharedFlowImpl sharedFlowImpl = thumbNode.interactionSource.interactions;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(i3, ref$IntRef, thumbNode);
                this.label = 1;
                sharedFlowImpl.collect(anonymousClass1, this);
                return coroutineSingletons;
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
                Deferred deferred = (Deferred) this.this$0;
                this.label = 1;
                Object await = deferred.await(this);
                return await == coroutineSingletons2 ? coroutineSingletons2 : await;
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
                CompletableDeferredImpl completableDeferredImpl2 = ((ResultListener) this.this$0).completeSignal;
                this.label = 1;
                Object awaitInternal = completableDeferredImpl2.awaitInternal(this);
                return awaitInternal == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Closing " + ((UseCaseCameraImpl) this.this$0));
                    }
                    UseCaseGraphContext useCaseGraphContext = ((UseCaseCameraImpl) this.this$0).useCaseGraphContext;
                    if (useCaseGraphContext._graph.isInitialized()) {
                        AutoCloseable graph = useCaseGraphContext.getGraph();
                        if (graph instanceof AutoCloseable) {
                            graph.close();
                        } else {
                            if (!(graph instanceof ExecutorService)) {
                                Path$$ExternalSyntheticBUOutline0.m$3();
                                return null;
                            }
                            ExecutorService executorService = (ExecutorService) graph;
                            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                executorService.shutdown();
                                while (!isTerminated) {
                                    try {
                                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
                                        if (i3 == 0) {
                                            executorService.shutdownNow();
                                            i3 = 1;
                                        }
                                    }
                                }
                                if (i3 != 0) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                    UseCaseSurfaceManager useCaseSurfaceManager = (UseCaseSurfaceManager) ((UseCaseCameraImpl) this.this$0).useCaseSurfaceManager$delegate.getValue();
                    synchronized (useCaseSurfaceManager.lock) {
                        try {
                            completableDeferredImpl = useCaseSurfaceManager.stopDeferred;
                            if (completableDeferredImpl == null) {
                                DeferredCoroutine deferredCoroutine = useCaseSurfaceManager.setupDeferred;
                                if (deferredCoroutine != null) {
                                    deferredCoroutine.cancel(null);
                                }
                                useCaseSurfaceManager.inactiveSurfaceCloser.closeAll();
                                useCaseSurfaceManager.configuredSurfaceMap = null;
                                completableDeferredImpl = new CompletableDeferredImpl();
                                useCaseSurfaceManager.stopDeferred = completableDeferredImpl;
                                useCaseSurfaceManager.tryClearSurfaceListener();
                            } else if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                                Log.w("CXCP", "UseCaseSurfaceManager is already stopping!");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.label = 1;
                    Object awaitInternal2 = completableDeferredImpl.awaitInternal(this);
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (awaitInternal2 == coroutineSingletons4) {
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
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                List list = (List) this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Futures.nonCancellationPropagating(((DeferrableSurface) it.next()).getSurface()));
                }
                ListFuture listFuture = new ListFuture(new ArrayList(arrayList), false, zzabp.directExecutor());
                this.label = 1;
                Object await2 = RecipientAvatars.await(listFuture, this);
                return await2 == coroutineSingletons6 ? coroutineSingletons6 : await2;
            case 5:
                ActiveCamera activeCamera = (ActiveCamera) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = activeCamera.androidCameraState._state;
                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(i4, continuation, i5);
                    this.label = 1;
                    if (FlowKt.first(stateFlowImpl, anonymousClass2, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                activeCamera.wakelock.release();
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Camera2CameraStatusMonitor camera2CameraStatusMonitor = (Camera2CameraStatusMonitor) this.this$0;
                    CallbackFlowBuilder callbackFlowBuilder = camera2CameraStatusMonitor.cameraStatus;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(camera2CameraStatusMonitor, i5);
                    this.label = 1;
                    if (callbackFlowBuilder.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
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
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl completableDeferredImpl3 = (CompletableDeferredImpl) ((HCaptcha) this.this$0).captchaVerifier;
                    this.label = 1;
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.label = 2;
                break;
            case 8:
                AndroidCameraState androidCameraState = (AndroidCameraState) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl2 = androidCameraState._state;
                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass22 = new DataStoreImpl$data$1.AnonymousClass2(i4, continuation, i);
                    this.label = 1;
                    first = FlowKt.first(stateFlowImpl2, anonymousClass22, this);
                    if (first == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                CameraState cameraState = (CameraState) first;
                if (cameraState instanceof CameraStateOpen) {
                    return new OpenCameraResult(androidCameraState, null, 2);
                }
                if (cameraState instanceof CameraStateClosing) {
                    androidCameraState.close();
                    openCameraResult = new OpenCameraResult(null, ((CameraStateClosing) cameraState).cameraErrorCode, 1);
                } else {
                    if (!(cameraState instanceof CameraStateClosed)) {
                        if (!(cameraState instanceof CameraStateUnopened)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        androidCameraState.close();
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(cameraState, "Unexpected CameraState: ");
                        return null;
                    }
                    androidCameraState.close();
                    openCameraResult = new OpenCameraResult(null, ((CameraStateClosed) cameraState).cameraErrorCode, 1);
                }
                return openCameraResult;
            case 9:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 != 0) {
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                JWECryptoParts jWECryptoParts = (JWECryptoParts) this.this$0;
                this.label = 1;
                JWECryptoParts.access$processingLoop(jWECryptoParts, this);
                return coroutineSingletons11;
            case 10:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    e0 e0Var = (e0) this.this$0;
                    this.label = 1;
                    if (JobKt.supervisorScope(new SliderDraggableState$drag$2(e0Var, continuation, 8), this) == coroutineSingletons12) {
                        return coroutineSingletons12;
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
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(1000L, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                zzm zzmVar = (zzm) this.this$0;
                synchronized (zzmVar.zze) {
                    if (!zzmVar.zza && zzmVar.zzd == 0) {
                        zzmVar.zzf = null;
                        zzmVar.zza = true;
                        ((DialogHostKt$$ExternalSyntheticLambda0) ((zzm) this.this$0).zzc).invoke();
                        unit = Unit.INSTANCE;
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            case 12:
                GraphCommand.RequestProcessor requestProcessor = (GraphCommand.RequestProcessor) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TraceParser traceParser = requestProcessor.old;
                    if (traceParser != null) {
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TraceParser traceParser2 = requestProcessor.f0new;
                if (traceParser2 != null) {
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 13:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraBackendsImpl cameraBackendsImpl = (CameraBackendsImpl) this.this$0;
                    this.label = 1;
                    Log.d("CXCP", "CameraBackends#shutdown");
                    LinkedHashMap linkedHashMap = cameraBackendsImpl.activeCameraBackends;
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Camera2Backend camera2Backend = (Camera2Backend) ((Map.Entry) it2.next()).getValue();
                        camera2Backend.getClass();
                        Log.d("CXCP", "Camera2Backend#shutdownAsync");
                        JobKt.cancel(camera2Backend.camera2DeviceCache.scope, (CancellationException) null);
                        arrayList2.add(JobKt.async$default(camera2Backend.threads.cameraPipeScope, null, null, new SliderDraggableState$drag$2(camera2Backend, continuation, i2), 3));
                    }
                    Object joinAll = AwaitKt.joinAll(arrayList2, this);
                    if (joinAll != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        joinAll = Unit.INSTANCE;
                    }
                    if (joinAll == obj2) {
                        return obj2;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                try {
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons15;
                    }
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                } catch (CancellationException e) {
                    String message = e.getMessage();
                    if (message != null && StringsKt.contains((CharSequence) message, (CharSequence) "Surface replaced", false)) {
                        SurfaceRequest surfaceRequest = (SurfaceRequest) this.this$0;
                        surfaceRequest.willNotProvideSurface();
                        surfaceRequest.mSurfaceRecreationCompleter.set(null);
                    }
                    return Unit.INSTANCE;
                }
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.this$0;
                    this.label = 1;
                    if (SeekableTransitionState.access$runAnimations(seekableTransitionState, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndication.DefaultDebugIndicationInstance) this.this$0;
                SharedFlowImpl sharedFlowImpl2 = defaultDebugIndicationInstance.interactionSource.interactions;
                DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(ref$IntRef2, ref$IntRef3, ref$IntRef4, defaultDebugIndicationInstance, 1);
                this.label = 1;
                sharedFlowImpl2.collect(datePickerKt$updateDisplayedMonth$3, this);
                return coroutineSingletons17;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                BufferedChannel bufferedChannel = ((MouseWheelScrollingLogic) this.this$0).channel;
                this.label = 1;
                Object coroutineScope = JobKt.coroutineScope(new TransferStockPresenter$models$3$1$2(bufferedChannel, continuation, i5), this);
                return coroutineScope == coroutineSingletons18 ? coroutineSingletons18 : coroutineScope;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LazyGridState) this.this$0).snapToItemIndexInternal$foundation(this.label, 0);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationState animationState = (AnimationState) ((Recorder.AnonymousClass4) this.this$0).this$0;
                    Float f = new Float(RecyclerView.DECELERATION_RATE);
                    SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new Float(0.5f), 1);
                    this.label = 1;
                    if (AnimatableKt.animateTo$default(animationState, f, spring$default, true, null, this, 8) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CursorAnimationState cursorAnimationState = (CursorAnimationState) this.this$0;
                    this.label = 1;
                    cursorAnimationState.getClass();
                    Object coroutineScope2 = JobKt.coroutineScope(new RealGcmRegistrar$unregister$2(cursorAnimationState, continuation, i5), this);
                    if (coroutineScope2 != obj3) {
                        coroutineScope2 = Unit.INSTANCE;
                    }
                    if (coroutineScope2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 != 0) {
                    if (i26 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) this.this$0;
                this.label = 1;
                linkStateInteractionSourceObserver.getClass();
                linkStateInteractionSourceObserver.interactionSource.interactions.collect(new AnonymousClass1(i2, new MutableObjectList(), linkStateInteractionSourceObserver), this);
                return coroutineSingletons21;
            case 22:
                RequestFactory requestFactory = (RequestFactory) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(Updater.snapshotFlow(new Threads$$ExternalSyntheticLambda1(requestFactory, 27)), 1);
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2(requestFactory, 4);
                    this.label = 1;
                    Object collect = drop.collect(new FlowKt__MergeKt$flattenConcat$1$1(lazyPagingItems$collectLoadState$22, 16), this);
                    if (collect != coroutineSingletons22) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                SelectionManager selectionManager = (SelectionManager) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair contextTextAndSelection$foundation = selectionManager.getContextTextAndSelection$foundation();
                    if (contextTextAndSelection$foundation != null) {
                        AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.first;
                        long j = ((TextRange) contextTextAndSelection$foundation.second).packedValue;
                        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = selectionManager.platformSelectionBehaviors;
                        if (platformSelectionBehaviorsImpl != null) {
                            this.label = 1;
                            Object m438onShowContextMenuOrSelectionToolbarSbBc2M = platformSelectionBehaviorsImpl.m438onShowContextMenuOrSelectionToolbarSbBc2M(annotatedString, j, this);
                            if (m438onShowContextMenuOrSelectionToolbarSbBc2M != coroutineSingletons24) {
                                m438onShowContextMenuOrSelectionToolbarSbBc2M = Unit.INSTANCE;
                            }
                            if (m438onShowContextMenuOrSelectionToolbarSbBc2M == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        }
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Scene.AnonymousClass1 anonymousClass12 = (Scene.AnonymousClass1) this.this$0;
                    this.label = 1;
                    if (anonymousClass12.invoke(this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = (SuspendingPointerInputModifierNodeImpl) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputEventHandler pointerInputEventHandler = suspendingPointerInputModifierNodeImpl._pointerInputEventHandler;
                    this.label = 2;
                    if (pointerInputEventHandler.invoke(suspendingPointerInputModifierNodeImpl, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i31 != 1 && i31 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                OnVisibilityChangedNode onVisibilityChangedNode = (OnVisibilityChangedNode) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j2 = onVisibilityChangedNode.minDurationMs;
                    this.label = 1;
                    if (JobKt.delay(j2, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                onVisibilityChangedNode.triggerCallback();
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AsyncFontListLoader asyncFontListLoader = (AsyncFontListLoader) this.this$0;
                    this.label = 1;
                    if (asyncFontListLoader.load(this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                try {
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory = (GlanceRemoteViewsService.GlanceRemoteViewsFactory) this.this$0;
                        AppWidgetId appWidgetId = new AppWidgetId(glanceRemoteViewsFactory.appWidgetId);
                        this.label = 1;
                        if (GlanceRemoteViewsService.GlanceRemoteViewsFactory.access$startSessionIfNeededAndWaitUntilReady(glanceRemoteViewsFactory, appWidgetId, this) == coroutineSingletons29) {
                            return coroutineSingletons29;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                } catch (ClosedSendChannelException e2) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e2));
                }
        }
    }

    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $pressCount;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.$pressCount = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x011c, code lost:
        
            if (r4.emit(r16, r2) == r9) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
        /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f3 -> B:18:0x00f8). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$activity$backend$offline$RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2(Object obj, Continuation continuation) {
            RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1 realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1;
            int i;
            FlowCollector flowCollector;
            List list;
            int i2;
            int i3;
            int i4;
            Iterator it;
            int i5;
            int i6;
            ArrayList arrayList;
            ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter;
            int i7;
            RealOfflineActivitiesManager realOfflineActivitiesManager = (RealOfflineActivitiesManager) this.this$0;
            if (continuation instanceof RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1) {
                realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1 = (RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1) continuation;
                int i8 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label;
                if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        flowCollector = (FlowCollector) this.$pressCount;
                        List list2 = (List) obj;
                        Flow flow = realOfflineActivitiesManager.historyDataJavaScripter;
                        realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$4 = flowCollector;
                        realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$6 = list2;
                        realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$0 = 0;
                        realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$1 = 0;
                        realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label = 1;
                        obj2 = FlowKt.first(flow, realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            list = list2;
                            i2 = 0;
                            i3 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i9 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$4;
                        int i10 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$3;
                        int i11 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$2;
                        int i12 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$1;
                        int i13 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$0;
                        Iterator it2 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$12;
                        Collection collection = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$10;
                        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter2 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$7;
                        List list3 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$6;
                        FlowCollector flowCollector2 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$4;
                        SafeTrace.throwOnFailure(obj2);
                        i6 = i9;
                        i2 = i12;
                        ziplineHistoryDataJavaScripter = ziplineHistoryDataJavaScripter2;
                        i5 = i10;
                        ArrayList arrayList2 = collection;
                        i4 = i13;
                        flowCollector = flowCollector2;
                        it = it2;
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) obj2;
                        if (formattedPaymentHistoryActivityItem != null) {
                            arrayList2.add(formattedPaymentHistoryActivityItem);
                        }
                        arrayList = arrayList2;
                        i7 = i11;
                        FlowCollector flowCollector3 = flowCollector;
                        Continuation continuation2 = null;
                        if (!it.hasNext()) {
                            Pending pending = (Pending) it.next();
                            CoroutineContext coroutineContext = realOfflineActivitiesManager.jsDispatcher;
                            EditProfilePresenter$models$2$1 editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1(pending, realOfflineActivitiesManager, ziplineHistoryDataJavaScripter, continuation2, 12);
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$4 = flowCollector3;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$6 = null;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$7 = ziplineHistoryDataJavaScripter;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$10 = arrayList;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$12 = it;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$0 = i4;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$1 = i2;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$2 = i7;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$3 = i5;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$4 = i6;
                            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label = 2;
                            Object withContext = JobKt.withContext(coroutineContext, editProfilePresenter$models$2$1, realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1);
                            if (withContext != coroutineSingletons) {
                                i11 = i7;
                                obj2 = withContext;
                                flowCollector = flowCollector3;
                                arrayList2 = arrayList;
                                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2 = (FormattedPaymentHistoryActivityItem) obj2;
                                if (formattedPaymentHistoryActivityItem2 != null) {
                                }
                                arrayList = arrayList2;
                                i7 = i11;
                                FlowCollector flowCollector32 = flowCollector;
                                Continuation continuation22 = null;
                                if (!it.hasNext()) {
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$4 = null;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$6 = null;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$7 = null;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$10 = null;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$12 = null;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$0 = i4;
                                    realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label = 3;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    i2 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$1;
                    i3 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.I$0;
                    list = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$6;
                    flowCollector = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    ArrayList arrayList3 = new ArrayList();
                    i4 = i3;
                    it = list.iterator();
                    i5 = 0;
                    i6 = 0;
                    arrayList = arrayList3;
                    ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj2;
                    i7 = 0;
                    FlowCollector flowCollector322 = flowCollector;
                    Continuation continuation222 = null;
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
            }
            realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1 = new RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1(this, continuation);
            Object obj22 = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1.label;
            if (i != 0) {
            }
            ArrayList arrayList32 = new ArrayList();
            i4 = i3;
            it = list.iterator();
            i5 = 0;
            i6 = 0;
            arrayList = arrayList32;
            ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj22;
            i7 = 0;
            FlowCollector flowCollector3222 = flowCollector;
            Continuation continuation2222 = null;
            if (!it.hasNext()) {
            }
            return coroutineSingletons2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r4 == null) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$activity$presenters$ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2(Object obj, Continuation continuation) {
            ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1 activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1;
            int i;
            String str;
            String str2;
            Long l;
            if (continuation instanceof ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1) {
                activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1 = (ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                int i2 = activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.$pressCount;
                        InvitationConfig invitationConfig = (InvitationConfig) obj;
                        String str3 = invitationConfig.short_invite_friends_cta;
                        boolean z = invitationConfig.enabled;
                        if (str3 != null) {
                            str2 = z ? str3 : null;
                        }
                        ActivityInviteItemPresenter activityInviteItemPresenter = (ActivityInviteItemPresenter) this.this$0;
                        AndroidStringManager androidStringManager = activityInviteItemPresenter.stringManager;
                        Money money = invitationConfig.bounty_amount;
                        if (!z || ((l = money.amount) != null && l.longValue() == 0)) {
                            str = androidStringManager.get(R.string.history_invite_label);
                        } else {
                            String format2 = activityInviteItemPresenter.moneyFormatter.format(money);
                            format2.getClass();
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            str = new MessageFormat(resources.getString(R.string.history_invite_label_amount)).format(new Object[]{format2});
                            str.getClass();
                        }
                        str2 = str;
                        ActivityInviteItemViewModel.Ready ready = new ActivityInviteItemViewModel.Ready(str2);
                        activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(ready, activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1 = new ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
            Object obj22 = activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = activityInviteItemPresenter$models$lambda$0$$inlined$map$1$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        
            if (r2.emit(r1, r3) == r4) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:366:0x0773, code lost:
        
            if (r0.emit(r2, r3) != r4) goto L351;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x02f5  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0303  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x03a3  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x03af  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x04fe  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0503  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x0519  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x056f  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x057b  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x06cd  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:345:0x06d9  */
        /* JADX WARN: Removed duplicated region for block: B:357:0x073a  */
        /* JADX WARN: Removed duplicated region for block: B:369:0x074e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
        /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r10v48 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1;
            int i;
            FlowCollector flowCollector;
            RealBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1;
            int i2;
            LocalHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1 localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1;
            int i3;
            ClientRoute tryParse;
            ClientRoute.ViewLocalBrandProfileQrOrdering viewLocalBrandProfileQrOrdering;
            LocalMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1 localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i4;
            RealTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1 realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1;
            int i5;
            ProfileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1 profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1;
            int i6;
            ProfileUpsellViewModel.ProfileUpsellRow.Icon icon;
            RealProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1 realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1;
            int i7;
            Intent intent;
            RealSingleActivityManager$activityForReceipt$$inlined$map$1$2$1 realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1;
            int i8;
            FlowCollector flowCollector2;
            SingleActivity singleActivity;
            SingleActivity singleActivity2;
            FlowCollector flowCollector3;
            ActivityFormattingResult activityFormattingResult;
            SingleActivity singleActivity3;
            r6 = 0;
            int i9 = 0;
            r10 = null;
            r10 = null;
            Uri fileUri = null;
            ZiplineCodeSession ziplineCodeSession = null;
            switch (this.$r8$classId) {
                case 0:
                    Interaction interaction = (Interaction) obj;
                    Ref$IntRef ref$IntRef = (Ref$IntRef) this.$pressCount;
                    if (interaction instanceof PressInteraction.Press) {
                        ref$IntRef.element++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        ref$IntRef.element--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        ref$IntRef.element--;
                    }
                    r6 = ref$IntRef.element > 0;
                    ThumbNode thumbNode = (ThumbNode) this.this$0;
                    if (thumbNode.isPressed != r6) {
                        thumbNode.isPressed = r6;
                        DepthSortedSetKt.requireLayoutNode(thumbNode).invalidateMeasurements$ui();
                    }
                    return Unit.INSTANCE;
                case 1:
                    String str = ((CameraId) obj).value;
                    if (Intrinsics.areEqual(str, (String) this.$pressCount)) {
                        Log.d("CXCP", ((Object) CameraId.m46toStringimpl(str)) + " has become available! Notifying listeners...");
                        Iterator it = ((Camera2CameraAvailabilityMonitor$startMonitoring$2) this.this$0).listeners.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            ((CompletableDeferred) it.next()).complete(Unit.INSTANCE);
                        }
                    }
                    return Unit.INSTANCE;
                case 2:
                    CameraState cameraState = (CameraState) obj;
                    if (cameraState instanceof CameraStateOpen) {
                        CaptureSessionState captureSessionState = (CaptureSessionState) ((Ref$ObjectRef) this.$pressCount).element;
                        CameraDeviceWrapper cameraDeviceWrapper = ((CameraStateOpen) cameraState).cameraDevice;
                        synchronized (captureSessionState.lock) {
                            CaptureSessionState.State state = captureSessionState.state;
                            if (state != CaptureSessionState.State.CLOSING && state != CaptureSessionState.State.CLOSED) {
                                captureSessionState._cameraDevice = cameraDeviceWrapper;
                                JobKt.launch$default(captureSessionState.scope, null, null, new CaptureSessionState$cameraDevice$2$1(captureSessionState, r10, r6 ? 1 : 0), 3);
                            }
                        }
                    } else if (cameraState instanceof CameraStateClosing) {
                        ((CaptureSessionState) ((Ref$ObjectRef) this.$pressCount).element).shutdown();
                    } else if (cameraState instanceof CameraStateClosed) {
                        ((CaptureSessionState) ((Ref$ObjectRef) this.$pressCount).element).shutdown();
                        Camera2CameraController camera2CameraController = (Camera2CameraController) this.this$0;
                        CameraStateClosed cameraStateClosed = (CameraStateClosed) cameraState;
                        synchronized (camera2CameraController.lock) {
                            try {
                                if (!camera2CameraController.isClosed()) {
                                    CameraError cameraError = cameraStateClosed.cameraErrorCode;
                                    if (cameraError != null) {
                                        camera2CameraController.lastCameraError = cameraError;
                                        int i10 = cameraError.value;
                                        if (i10 != 6 && i10 != 1 && i10 != 2) {
                                            camera2CameraController.controllerState = CameraController$ControllerState$ERROR.INSTANCE;
                                            Log.d("CXCP", camera2CameraController + " encountered error: " + ((Object) CameraError.m43toStringimpl(cameraStateClosed.cameraErrorCode.value)));
                                        }
                                        camera2CameraController.controllerState = CameraController$ControllerState$ERROR.INSTANCE$3;
                                        Log.d("CXCP", camera2CameraController + " is disconnected");
                                    } else {
                                        camera2CameraController.controllerState = CameraController$ControllerState$ERROR.INSTANCE$5;
                                    }
                                    camera2CameraController.surfaceTracker.unregisterAllSurfaces();
                                    camera2CameraController.tryRestart();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    Pair pair = (Pair) obj;
                    ImplementationMode implementationMode = (ImplementationMode) pair.first;
                    AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = (AutoValue_SurfaceRequest_TransformationInfo) pair.second;
                    ProduceStateScope produceStateScope = (ProduceStateScope) this.$pressCount;
                    SurfaceRequest surfaceRequest = (SurfaceRequest) this.this$0;
                    int i11 = autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees;
                    boolean z = autoValue_SurfaceRequest_TransformationInfo.isMirroring;
                    Rect rect = autoValue_SurfaceRequest_TransformationInfo.getCropRect;
                    produceStateScope.setValue(new ViewfinderArgs(surfaceRequest, implementationMode, new TransformationInfo(rect.left, rect.top, rect.right, rect.bottom, i11, z)));
                    return Unit.INSTANCE;
                case 4:
                    Interaction interaction2 = (Interaction) obj;
                    ArrayList arrayList = (ArrayList) this.$pressCount;
                    if (interaction2 instanceof DragInteraction$Start) {
                        arrayList.add(interaction2);
                    } else if (interaction2 instanceof DragInteraction$Stop) {
                        arrayList.remove(((DragInteraction$Stop) interaction2).start);
                    } else if (interaction2 instanceof DragInteraction$Cancel) {
                        arrayList.remove(((DragInteraction$Cancel) interaction2).start);
                    }
                    ((MutableState) this.this$0).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                    return Unit.INSTANCE;
                case 5:
                    Interaction interaction3 = (Interaction) obj;
                    LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) this.this$0;
                    MutableObjectList mutableObjectList = (MutableObjectList) this.$pressCount;
                    if ((interaction3 instanceof HoverInteraction$Enter) || (interaction3 instanceof FocusInteraction$Focus) || (interaction3 instanceof PressInteraction.Press)) {
                        mutableObjectList.add(interaction3);
                    } else if (interaction3 instanceof HoverInteraction$Exit) {
                        mutableObjectList.remove(((HoverInteraction$Exit) interaction3).enter);
                    } else if (interaction3 instanceof FocusInteraction$Unfocus) {
                        mutableObjectList.remove(((FocusInteraction$Unfocus) interaction3).focus);
                    } else if (interaction3 instanceof PressInteraction.Release) {
                        mutableObjectList.remove(((PressInteraction.Release) interaction3).press);
                    } else if (interaction3 instanceof PressInteraction.Cancel) {
                        mutableObjectList.remove(((PressInteraction.Cancel) interaction3).press);
                    }
                    Object[] objArr = mutableObjectList.content;
                    int i12 = mutableObjectList._size;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        Interaction interaction4 = (Interaction) objArr[i14];
                        if (interaction4 instanceof HoverInteraction$Enter) {
                            linkStateInteractionSourceObserver.getClass();
                            i13 |= 2;
                        } else if (interaction4 instanceof FocusInteraction$Focus) {
                            linkStateInteractionSourceObserver.getClass();
                            i13 |= 1;
                        } else if (interaction4 instanceof PressInteraction.Press) {
                            linkStateInteractionSourceObserver.getClass();
                            i13 |= 4;
                        }
                    }
                    linkStateInteractionSourceObserver.interactionState.setIntValue(i13);
                    return Unit.INSTANCE;
                case 6:
                    long j = ((Offset) obj).packedValue;
                    Animatable animatable = (Animatable) this.$pressCount;
                    if ((((Offset) animatable.getValue()).packedValue & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) animatable.getValue()).packedValue & BodyPartID.bodyIdMax)) == Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) {
                        Object snapTo = animatable.snapTo(new Offset(j), continuation);
                        return snapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? snapTo : Unit.INSTANCE;
                    }
                    JobKt.launch$default((CoroutineScope) this.this$0, null, null, new FlashControl$applyScreenFlash$3(animatable, j, (Continuation) null, 3), 3);
                    return Unit.INSTANCE;
                case 7:
                    return emit((IndexedValue) obj, continuation);
                case 8:
                    Object access$doLoad = PageFetcherSnapshot.access$doLoad((PageFetcherSnapshot) this.$pressCount, (LoadType) this.this$0, (GenerationalViewportHint) obj, continuation);
                    return access$doLoad == CoroutineSingletons.COROUTINE_SUSPENDED ? access$doLoad : Unit.INSTANCE;
                case 9:
                    return emit(continuation);
                case 10:
                    PageEvent pageEvent = (PageEvent) obj;
                    Continuation continuation2 = null;
                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                        Log.v("Paging", "Collected " + pageEvent, null);
                    }
                    LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = (LazyPagingItems$pagingDataPresenter$1) this.$pressCount;
                    Object withContext = JobKt.withContext(lazyPagingItems$pagingDataPresenter$1.mainContext, new SliderState$drag$2(pageEvent, lazyPagingItems$pagingDataPresenter$1, (PagingData) this.this$0, continuation2, 11), continuation);
                    return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
                case 11:
                    if (continuation instanceof PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1) {
                        pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 = (PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1) continuation;
                        int i15 = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label = i15 - PKIFailureInfo.systemUnavail;
                            Object obj2 = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                FlowCollector flowCollector4 = (FlowCollector) this.$pressCount;
                                TaxWebAppBridge.AnonymousClass4 anonymousClass4 = (TaxWebAppBridge.AnonymousClass4) this.this$0;
                                pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.L$0 = flowCollector4;
                                pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label = 1;
                                Object map = ((PageEvent) obj).map(anonymousClass4, pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1);
                                if (map != coroutineSingletons) {
                                    obj2 = map;
                                    flowCollector = flowCollector4;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            flowCollector = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.L$0 = null;
                            pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label = 2;
                            break;
                        }
                    }
                    pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 = new PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1(this, continuation);
                    Object obj22 = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label;
                    if (i != 0) {
                    }
                    pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.L$0 = null;
                    pagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1.label = 2;
                case 12:
                    if (continuation instanceof RealBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1) {
                        realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1 = (RealBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1) continuation;
                        int i16 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.label;
                        if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                            realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                            Object obj3 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                FlowCollector flowCollector5 = (FlowCollector) this.$pressCount;
                                SqlDriver sqlDriver = ((RealBadger2) this.this$0).badgeQueries.driver;
                                AvatarsKt$$ExternalSyntheticLambda2 avatarsKt$$ExternalSyntheticLambda2 = new AvatarsKt$$ExternalSyntheticLambda2(10);
                                sqlDriver.getClass();
                                Object executeAsOne = new SimpleQuery(1095086205, new String[]{"badge"}, sqlDriver, "Badge.sq", "hasBadgesToClear", "SELECT EXISTS (\n  SELECT 1 FROM badge\n  WHERE cleared_at IS NOT NULL\n  AND clear_succeeded_at IS NULL\n  LIMIT 1\n)", avatarsKt$$ExternalSyntheticLambda2).executeAsOne();
                                realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.label = 1;
                                if (flowCollector5.emit(executeAsOne, realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj3);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    Object obj4 = SchedulingDayTimePickerViewModel.ModelState.LoadingDays.INSTANCE;
                    MutableState mutableState = (MutableState) this.this$0;
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$pressCount;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                    LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen = (LocalSchedulingDayTimePickerScreen) cardStudioPresenter.appConfig;
                    SchedulingDayTimePickerViewEvent schedulingDayTimePickerViewEvent = (SchedulingDayTimePickerViewEvent) obj;
                    if (Intrinsics.areEqual(schedulingDayTimePickerViewEvent, SchedulingDayTimePickerViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator.goTo(Back.INSTANCE);
                    } else if (Intrinsics.areEqual(schedulingDayTimePickerViewEvent, SchedulingDayTimePickerViewEvent.RetryLoadingDays.INSTANCE)) {
                        mutableState.setValue(obj4);
                    } else if (Intrinsics.areEqual(schedulingDayTimePickerViewEvent, SchedulingDayTimePickerViewEvent.RetryLoadingTimes.INSTANCE)) {
                        SchedulingDayTimePickerViewModel.ModelState modelState = (SchedulingDayTimePickerViewModel.ModelState) mutableState.getValue();
                        SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays = modelState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays ? (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState : null;
                        if (loadedDays != null) {
                            obj4 = SchedulingDayTimePickerViewModel.ModelState.LoadedDays.copy$default(loadedDays, null, SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadingTimes.INSTANCE, 3);
                        }
                        mutableState.setValue(obj4);
                    } else if (schedulingDayTimePickerViewEvent instanceof SchedulingDayTimePickerViewEvent.DaySelected) {
                        SchedulingDayTimePickerViewModel.ModelState modelState2 = (SchedulingDayTimePickerViewModel.ModelState) mutableState.getValue();
                        modelState2.getClass();
                        SchedulingDay schedulingDay = ((SchedulingDayTimePickerViewEvent.DaySelected) schedulingDayTimePickerViewEvent).day;
                        mutableState.setValue(SchedulingDayTimePickerViewModel.ModelState.LoadedDays.copy$default((SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState2, schedulingDay, CardStudioPresenter.access$asInitialTimesState(cardStudioPresenter, schedulingDay), 1));
                    } else if (schedulingDayTimePickerViewEvent instanceof SchedulingDayTimePickerViewEvent.TimeSelected) {
                        SchedulingDayTimePickerViewModel.ModelState modelState3 = (SchedulingDayTimePickerViewModel.ModelState) mutableState.getValue();
                        modelState3.getClass();
                        mutableState.setValue(SchedulingDayTimePickerViewModel.ModelState.LoadedDays.copy$default((SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState3, null, new SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes(((SchedulingDayTimePickerViewEvent.TimeSelected) schedulingDayTimePickerViewEvent).time), 3));
                    } else {
                        if (!Intrinsics.areEqual(schedulingDayTimePickerViewEvent, SchedulingDayTimePickerViewEvent.ConfirmClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        SchedulingDayTimePickerViewModel.ModelState modelState4 = (SchedulingDayTimePickerViewModel.ModelState) mutableState.getValue();
                        modelState4.getClass();
                        SchedulingTime selectedTime = zzuh.getSelectedTime((SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState4);
                        selectedTime.getClass();
                        ((Analytics) cardStudioPresenter.analytics).track(new LocalClientFulfillmentFlowConfirmScheduling(((BrandSpot) cardStudioPresenter.cardStudioQueries).brandToken, localSchedulingDayTimePickerScreen.locationToken, localSchedulingDayTimePickerScreen.buyerToken, localSchedulingDayTimePickerScreen.checkoutFlowToken, CardStudioPresenter.access$getFulfillmentTypeForCdf(cardStudioPresenter)), null);
                        AskedQuestion askedQuestion = localSchedulingDayTimePickerScreen.question;
                        LocalFulfillment localFulfillment = selectedTime.fulfillment;
                        localFulfillment.getClass();
                        Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                        String str2 = localSchedulingDayTimePickerScreen.locationToken;
                        FulfillmentConfiguration.Delivery asDelivery = FulfillmentConfigurationKt.getAsDelivery(localSchedulingDayTimePickerScreen.fulfillmentConfiguration);
                        screenNavigator.giveAnswer(askedQuestion, FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(fulfillment, str2, asDelivery != null ? asDelivery.deliveryFee : 0));
                    }
                    return Unit.INSTANCE;
                case 14:
                    JobKt.launch$default((CoroutineScope) this.$pressCount, null, null, new ZiplineLoader$ModuleJob$run$3((LocalHomeGeoPresenter) this.this$0, (LocalHomeViewEvent) obj, r10, 15), 3);
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof LocalHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1) {
                        localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1 = (LocalHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                        int i17 = localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                            localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                            Object obj5 = localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                FlowCollector flowCollector6 = (FlowCollector) this.$pressCount;
                                GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
                                GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = ((LocalHomeGeoPresenter) this.this$0).response;
                                getBrandCollectionResponse.getClass();
                                BrandCollection brandCollection = getBrandCollectionResponse.brand_collection;
                                if (brandCollection == null && (brandCollection = getNeighborhoodsTabContentResponse.brand_collection) == null) {
                                    brandCollection = (BrandCollection) CollectionsKt.firstOrNull(getNeighborhoodsTabContentResponse.brand_collection_sections);
                                }
                                localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                                if (flowCollector6.emit(brandCollection, localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj5);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1 = new LocalHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = localHomeGeoPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    TableQrCodeScannerPresenter tableQrCodeScannerPresenter = (TableQrCodeScannerPresenter) this.$pressCount;
                    BetterNavigator.ScreenNavigator screenNavigator2 = tableQrCodeScannerPresenter.navigator;
                    TableQrCodeScannerViewEvent tableQrCodeScannerViewEvent = (TableQrCodeScannerViewEvent) obj;
                    if (tableQrCodeScannerViewEvent instanceof TableQrCodeScannerViewEvent.DialogClosed) {
                        MutableState mutableState2 = (MutableState) this.this$0;
                        mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() + 1));
                    } else if (tableQrCodeScannerViewEvent instanceof TableQrCodeScannerViewEvent.NavigationClicked) {
                        screenNavigator2.goTo(Back.INSTANCE);
                    } else {
                        if (!(tableQrCodeScannerViewEvent instanceof TableQrCodeScannerViewEvent.QrCodeDetected)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str3 = ((TableQrCodeScannerViewEvent.QrCodeDetected) tableQrCodeScannerViewEvent).url;
                        RealClientRouteParser realClientRouteParser = tableQrCodeScannerPresenter.clientRouteParser;
                        RealDeepLinkParser realDeepLinkParser = tableQrCodeScannerPresenter.deepLinkParser;
                        if (DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, str3)) {
                            tryParse = DeepLinkParserKt.tryParse(realDeepLinkParser, str3);
                            if (tryParse == null) {
                                if (ClientRouteParserKt.tryIsClientRouteCandidate(realClientRouteParser, str3)) {
                                    tryParse = ClientRouteParserKt.tryParse(realClientRouteParser, str3);
                                }
                                tryParse = null;
                            }
                            viewLocalBrandProfileQrOrdering = tryParse instanceof ClientRoute.ViewLocalBrandProfileQrOrdering ? (ClientRoute.ViewLocalBrandProfileQrOrdering) tryParse : null;
                            if (viewLocalBrandProfileQrOrdering == null) {
                                screenNavigator2.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(tableQrCodeScannerPresenter.stringManager.get(R.string.local_presenters_table_qr_invalid))));
                            } else {
                                screenNavigator2.goTo(new LocalBrandProfileScreen(new BrandSpot(viewLocalBrandProfileQrOrdering.currency.concat(viewLocalBrandProfileQrOrdering.name), viewLocalBrandProfileQrOrdering.locationToken), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, new BrandSpotSyncTokens(viewLocalBrandProfileQrOrdering.inStoreOrderingToken, RealUuidGenerator.generate().toString(), 1), str3, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE));
                            }
                        } else {
                            if (ClientRouteParserKt.tryIsClientRouteCandidate(realClientRouteParser, str3)) {
                                tryParse = ClientRouteParserKt.tryParse(realClientRouteParser, str3);
                                if (tryParse instanceof ClientRoute.ViewLocalBrandProfileQrOrdering) {
                                }
                                if (viewLocalBrandProfileQrOrdering == null) {
                                }
                            }
                            tryParse = null;
                            if (tryParse instanceof ClientRoute.ViewLocalBrandProfileQrOrdering) {
                            }
                            if (viewLocalBrandProfileQrOrdering == null) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 17:
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.$pressCount;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                    MarketingMessagesViewEvent marketingMessagesViewEvent = (MarketingMessagesViewEvent) obj;
                    if (Intrinsics.areEqual(marketingMessagesViewEvent, MarketingMessagesViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator3.goTo(Back.INSTANCE);
                    } else if (marketingMessagesViewEvent instanceof MarketingMessagesViewEvent.MessageClicked) {
                        Analytics analytics = (Analytics) disclosurePresenter.analytics;
                        MarketingMessageData marketingMessageData = ((MarketingMessagesViewEvent.MessageClicked) marketingMessagesViewEvent).marketingMessage;
                        String str4 = marketingMessageData.brandSpot.brandToken;
                        String str5 = marketingMessageData.messageToken;
                        MarketingMessageOfferDetails marketingMessageOfferDetails = marketingMessageData.offerDetails;
                        String str6 = marketingMessageOfferDetails != null ? marketingMessageOfferDetails.offerToken : null;
                        EventLocation eventLocation = EventLocation.MESSAGES;
                        analytics.track(new LocalMarketingBuyerMarketingCampaignTappedMessage(str4, str5, str6), null);
                        screenNavigator3.goTo(new LocalMarketingMessageScreen(marketingMessageData, eventLocation));
                    } else if (marketingMessagesViewEvent instanceof MarketingMessagesViewEvent.BrandProfileClicked) {
                        screenNavigator3.goTo(new LocalBrandProfileScreen(((MarketingMessagesViewEvent.BrandProfileClicked) marketingMessagesViewEvent).brandSpot, new AttributionKey(null), (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                    } else {
                        if (!(marketingMessagesViewEvent instanceof MarketingMessagesViewEvent.FilterSelected)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((MutableState) this.this$0).setValue(((MarketingMessagesViewEvent.FilterSelected) marketingMessagesViewEvent).filter);
                    }
                    return Unit.INSTANCE;
                case 18:
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.$pressCount;
                    BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                    MutableState mutableState3 = (MutableState) this.this$0;
                    LoyaltySheetEvent loyaltySheetEvent = (LoyaltySheetEvent) obj;
                    if (loyaltySheetEvent instanceof LoyaltySheetEvent.SelectTier) {
                        mutableState3.setValue(new RewardToken(((LoyaltySheetEvent.SelectTier) loyaltySheetEvent).token));
                    } else if (loyaltySheetEvent instanceof LoyaltySheetEvent.Redeem) {
                        AskedQuestion askedQuestion2 = ((LocalLoyaltySheet) endAppLockPresenter.appLockState).question;
                        RewardToken rewardToken = (RewardToken) mutableState3.getValue();
                        String str7 = rewardToken != null ? rewardToken.value : null;
                        str7.getClass();
                        screenNavigator4.giveAnswer(askedQuestion2, new RewardToken(str7));
                    } else {
                        if (!(loyaltySheetEvent instanceof LoyaltySheetEvent.SheetDismissed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator4.goTo(Back.INSTANCE);
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof LocalMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1 = (LocalMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i18 = localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                            localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                            Object obj6 = localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                FlowCollector flowCollector7 = (FlowCollector) this.$pressCount;
                                if (!Intrinsics.areEqual((CharSequence) obj, ((LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) this.this$0).value)) {
                                    localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector7.emit(obj, localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj6);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1 = new LocalMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj62 = localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = localMenuItemDetailsViewKt$FreeTextEntryOption$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof RealTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1) {
                        realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1 = (RealTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1) continuation;
                        int i19 = realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.label;
                        if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                            realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                FlowCollector flowCollector8 = (FlowCollector) this.$pressCount;
                                LoadResult loadResult = (LoadResult) obj;
                                if (!(loadResult instanceof LoadResult.Failure)) {
                                    if (!(loadResult instanceof LoadResult.Success)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    RealTreehouseApp realTreehouseApp = (RealTreehouseApp) this.this$0;
                                    Zipline zipline = ((LoadResult.Success) loadResult).zipline;
                                    if (realTreehouseApp.spec == null) {
                                        a$$ExternalSyntheticBUOutline0.m$1("closed");
                                        return null;
                                    }
                                    zipline.getClass();
                                    PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) Zipline.take$default(zipline, "treehouse", new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 14));
                                    EventListener eventListener = zipline.eventListener;
                                    eventListener.getClass();
                                    SVG svg = ((RealEventPublisher$ZiplineEventListener) eventListener).eventPublisher;
                                    JsonImpl jsonImpl = zipline.endpoint.json;
                                    n.b bVar = (n.b) svg.idToElementMap;
                                    jsonImpl.getClass();
                                    ziplineCodeSession = new ZiplineCodeSession(realTreehouseApp.dispatchers, svg, realTreehouseApp.appScope, pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, realTreehouseApp.factory.frameClockFactory, zipline, realTreehouseApp.leakDetector, new ArcadeHostProtocol(jsonImpl, bVar));
                                }
                                if (ziplineCodeSession != null) {
                                    realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector8.emit(ziplineCodeSession, realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj7);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1 = new RealTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj72 = realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realTreehouseApp$codeHost$1$codeUpdatesFlow$$inlined$mapNotNull$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    ProfileUpsellPresenter profileUpsellPresenter = (ProfileUpsellPresenter) this.this$0;
                    if (continuation instanceof ProfileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1) {
                        profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1 = (ProfileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1) continuation;
                        int i20 = profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.label;
                        if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                            profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                            Object obj8 = profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                FlowCollector flowCollector9 = (FlowCollector) this.$pressCount;
                                ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
                                Analytics analytics2 = profileUpsellPresenter.analytics;
                                String str8 = profilePageUpsellComponentV2.entity_id;
                                str8.getClass();
                                analytics2.track(new PersonalProfileViewUpsellImpression(str8), null);
                                String str9 = profilePageUpsellComponentV2.header_text;
                                str9.getClass();
                                String str10 = profilePageUpsellComponentV2.subtext;
                                str10.getClass();
                                ProfilePageUpsellComponentV2.IconV2 iconV2 = profilePageUpsellComponentV2.icon_v2;
                                if (iconV2 != null) {
                                    int i21 = ProfileUpsellPresenter.WhenMappings.$EnumSwitchMapping$1[iconV2.ordinal()];
                                    icon = i21 != 1 ? i21 != 2 ? i21 != 3 ? i21 != 4 ? i21 != 5 ? ProfileUpsellViewModel.ProfileUpsellRow.Icon.UNKNOWN : ProfileUpsellViewModel.ProfileUpsellRow.Icon.SECURITY_CHECK_OUTLINE : ProfileUpsellViewModel.ProfileUpsellRow.Icon.FAILURE : ProfileUpsellViewModel.ProfileUpsellRow.Icon.ACTION_REQUIRED : ProfileUpsellViewModel.ProfileUpsellRow.Icon.VERIFICATION_ALERT : ProfileUpsellViewModel.ProfileUpsellRow.Icon.VERIFYING;
                                } else {
                                    ProfilePageUpsellComponentV2.Icon icon2 = profilePageUpsellComponentV2.icon;
                                    if (icon2 != null) {
                                        int i22 = ProfileUpsellPresenter.WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()];
                                        icon = i22 != 1 ? i22 != 2 ? i22 != 3 ? i22 != 4 ? ProfileUpsellViewModel.ProfileUpsellRow.Icon.UNKNOWN : ProfileUpsellViewModel.ProfileUpsellRow.Icon.FAILURE : ProfileUpsellViewModel.ProfileUpsellRow.Icon.ACTION_REQUIRED : ProfileUpsellViewModel.ProfileUpsellRow.Icon.VERIFICATION_ALERT : ProfileUpsellViewModel.ProfileUpsellRow.Icon.VERIFYING;
                                    } else {
                                        icon = ProfileUpsellViewModel.ProfileUpsellRow.Icon.UNKNOWN;
                                    }
                                }
                                ProfileUpsellViewModel.ProfileUpsellRow.Icon icon3 = icon;
                                String str11 = profilePageUpsellComponentV2.url_on_press;
                                str11.getClass();
                                String str12 = profilePageUpsellComponentV2.entity_id;
                                str12.getClass();
                                ProfileUpsellViewModel.ProfileUpsellRow profileUpsellRow = new ProfileUpsellViewModel.ProfileUpsellRow(str9, str10, icon3, str11, str12);
                                profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.label = 1;
                                if (flowCollector9.emit(profileUpsellRow, profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1 = new ProfileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = profileUpsellPresenter$profileUpsellV2$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    MutableState mutableState4 = (MutableState) this.this$0;
                    DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) this.$pressCount;
                    FlowStarter flowStarter = (FlowStarter) disclosurePresenter2.blockersNavigator;
                    BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator;
                    BusinessInfoViewEvent businessInfoViewEvent = (BusinessInfoViewEvent) obj;
                    if (Intrinsics.areEqual(businessInfoViewEvent, BusinessInfoViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator5.goTo(Back.INSTANCE);
                    } else if (Intrinsics.areEqual(businessInfoViewEvent, BusinessInfoViewEvent.ViewBusinessTaxInfo.INSTANCE)) {
                        Screen screen = (BusinessInfoScreen) disclosurePresenter2.args;
                        screenNavigator5.goTo(FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) flowStarter, Flow$Type.UPDATE_BUSINESS_ACCOUNT_TAX_INFO, new UpdateBusinessAccountTaxInfoFlowParameters(null, null, null, UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.IN_APP_BUSINESS_INFO_SECTION, null, ByteString.EMPTY), screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, null, null, 984));
                    } else if (businessInfoViewEvent instanceof BusinessInfoViewEvent.BusinessAddressClicked) {
                        String str13 = ((BusinessInfoViewEvent.BusinessAddressClicked) businessInfoViewEvent).address;
                        if (str13.length() > 0) {
                            mutableState4.setValue(new BusinessInfoViewModel.ConfirmationSheetViewModel(str13));
                        } else {
                            PoolVisibility.Companion companion = AddressSource.Companion;
                            screenNavigator5.goTo(FlowStarter.startSetAddressFlow$default(flowStarter, 5));
                        }
                    } else if (businessInfoViewEvent instanceof BusinessInfoViewEvent.UpdateBusinessAddress) {
                        PoolVisibility.Companion companion2 = AddressSource.Companion;
                        screenNavigator5.goTo(FlowStarter.startSetAddressFlow$default(flowStarter, 5));
                    } else if (businessInfoViewEvent instanceof BusinessInfoViewEvent.DismissBottomSheet) {
                        mutableState4.setValue(null);
                    } else {
                        if (!Intrinsics.areEqual(businessInfoViewEvent, BusinessInfoViewEvent.DowngradeToPersonalProfile.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockersData.Flow.INSTANCE.getClass();
                        ((Analytics) disclosurePresenter2.analytics).track(new BusinessProfileManageDowngradeToPersonal(BusinessProfileManageDowngradeToPersonal.DowngradeToPersonalEntrypoint.BUSINESS_INFO, BlockersData.Flow.Companion.generateToken()), null);
                        screenNavigator5.goTo(((RealFlowStarter) flowStarter).startBusinessAccountDowngradeFlow(DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_BUSINESS_INFO_SECTION, (BusinessInfoScreen) disclosurePresenter2.args));
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (!Intrinsics.areEqual((AccountDocumentsDownloadOptionsViewEvent$DownloadClick) obj, AccountDocumentsDownloadOptionsViewEvent$DownloadClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState5 = (MutableState) this.$pressCount;
                    Calendar calendar = AccountDocumentsDownloadOptionsPresenter.cal;
                    ProfileDocumentModel profileDocumentModel = (ProfileDocumentModel) mutableState5.getValue();
                    if (profileDocumentModel != null) {
                        ((AccountDocumentsDownloadOptionsPresenter) this.this$0).launcher.launchUrlInInternalBrowser(profileDocumentModel.url);
                    }
                    return Unit.INSTANCE;
                case 24:
                    if (continuation instanceof RealProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1) {
                        realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1 = (RealProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1) continuation;
                        int i23 = realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.label;
                        if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                FlowCollector flowCollector10 = (FlowCollector) this.$pressCount;
                                ActivityResult activityResult = (ActivityResult) obj;
                                int i24 = activityResult.requestCode;
                                if (i24 == 0) {
                                    RealProfilePhotoManager realProfilePhotoManager = (RealProfilePhotoManager) this.this$0;
                                    Path path = realProfilePhotoManager.tempPath;
                                    if (path != null) {
                                        fileUri = ((RealStorage) realProfilePhotoManager.storage).getFileUri(path, RealProfilePhotoManager$newPhotoResults$2$1$1.INSTANCE);
                                    }
                                } else if (i24 == 1 && (intent = activityResult.intent) != null) {
                                    fileUri = intent.getData();
                                }
                                if (fileUri != null) {
                                    realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector10.emit(fileUri, realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1) == coroutineSingletons8) {
                                        return coroutineSingletons8;
                                    }
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1 = new RealProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj92 = realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realProfilePhotoManager$newPhotoResults$$inlined$mapNotNull$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 25:
                    return emit((SingleActivity) obj, continuation);
                case 26:
                    if (continuation instanceof RealSingleActivityManager$activityForReceipt$$inlined$map$1$2$1) {
                        realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1 = (RealSingleActivityManager$activityForReceipt$$inlined$map$1$2$1) continuation;
                        int i25 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label;
                        if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                            realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                flowCollector2 = (FlowCollector) this.$pressCount;
                                singleActivity = (SingleActivity) obj;
                                ActivityItem activityItem = singleActivity.activityItem;
                                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = activityItem instanceof FormattedPaymentHistoryActivityItem ? (FormattedPaymentHistoryActivityItem) activityItem : null;
                                if (formattedPaymentHistoryActivityItem != null) {
                                    ZiplineActivityItemFormatter ziplineActivityItemFormatter = ((RealSingleActivityManager) this.this$0).activityItemFormatter;
                                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$4 = flowCollector2;
                                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$6 = singleActivity;
                                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.I$0 = 0;
                                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label = 1;
                                    Object dynamicFormat = ziplineActivityItemFormatter.dynamicFormat(formattedPaymentHistoryActivityItem, realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1);
                                    if (dynamicFormat != coroutineSingletons9) {
                                        obj10 = dynamicFormat;
                                        singleActivity2 = singleActivity;
                                        flowCollector3 = flowCollector2;
                                    }
                                    return coroutineSingletons9;
                                }
                                realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$4 = null;
                                realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$6 = null;
                                realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.I$0 = i9;
                                realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label = 2;
                                break;
                            } else {
                                if (i8 != 1) {
                                    if (i8 == 2) {
                                        SafeTrace.throwOnFailure(obj10);
                                        return Unit.INSTANCE;
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i9 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.I$0;
                                singleActivity2 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$6;
                                flowCollector3 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$4;
                                SafeTrace.throwOnFailure(obj10);
                            }
                            activityFormattingResult = (ActivityFormattingResult) obj10;
                            if (!(activityFormattingResult instanceof FormattedPaymentHistoryActivityItem)) {
                                singleActivity3 = SingleActivity.copy$default(singleActivity2, (ActivityItem) activityFormattingResult, null, 2);
                            } else {
                                if (!(activityFormattingResult instanceof FormattingFailedActivityItem)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                singleActivity3 = new SingleActivity(null, LoadingState.ERROR);
                            }
                            flowCollector2 = flowCollector3;
                            singleActivity = singleActivity3;
                            realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$4 = null;
                            realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$6 = null;
                            realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.I$0 = i9;
                            realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label = 2;
                        }
                    }
                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1 = new RealSingleActivityManager$activityForReceipt$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    activityFormattingResult = (ActivityFormattingResult) obj102;
                    if (!(activityFormattingResult instanceof FormattedPaymentHistoryActivityItem)) {
                    }
                    flowCollector2 = flowCollector3;
                    singleActivity = singleActivity3;
                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$4 = null;
                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.L$6 = null;
                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.I$0 = i9;
                    realSingleActivityManager$activityForReceipt$$inlined$map$1$2$1.label = 2;
                case 27:
                    return emit$com$squareup$cash$activity$backend$offline$RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2(obj, continuation);
                case 28:
                    return emit$com$squareup$cash$activity$presenters$ActivityInviteItemPresenter$models$lambda$0$$inlined$map$1$2(obj, continuation);
                default:
                    return emit$1(continuation);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (((com.squareup.cash.payments.backend.real.RealOfflineManager) r7).forceRetryAll(r1) != r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
            if (r7.load(r8, r1) == r2) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit$1(Continuation continuation) {
            ActivityTabPresenter$models$11$1$1$emit$1 activityTabPresenter$models$11$1$1$emit$1;
            int i;
            ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) this.$pressCount;
            if (continuation instanceof ActivityTabPresenter$models$11$1$1$emit$1) {
                activityTabPresenter$models$11$1$1$emit$1 = (ActivityTabPresenter$models$11$1$1$emit$1) continuation;
                int i2 = activityTabPresenter$models$11$1$1$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    activityTabPresenter$models$11$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = activityTabPresenter$models$11$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = activityTabPresenter$models$11$1$1$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        StandaloneCoroutine standaloneCoroutine = activityTabPresenter.loadMoreJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        activityTabPresenter.loadMoreJob = null;
                        ActivitiesManager activitiesManager = (ActivitiesManager) ((MutableState) this.this$0).getValue();
                        ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                        activityTabPresenter$models$11$1$1$emit$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OfflineManager offlineManager = activityTabPresenter.offlineManager;
                    activityTabPresenter$models$11$1$1$emit$1.label = 2;
                }
            }
            activityTabPresenter$models$11$1$1$emit$1 = new ActivityTabPresenter$models$11$1$1$emit$1(this, continuation);
            Object obj2 = activityTabPresenter$models$11$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = activityTabPresenter$models$11$1$1$emit$1.label;
            if (i != 0) {
            }
            OfflineManager offlineManager2 = activityTabPresenter.offlineManager;
            activityTabPresenter$models$11$1$1$emit$1.label = 2;
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, Object obj, Object obj2, int i) {
            this.$r8$classId = i;
            this.$pressCount = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(IndexedValue indexedValue, Continuation continuation) {
            CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            int i;
            Ref$IntRef ref$IntRef = (Ref$IntRef) this.$pressCount;
            if (continuation instanceof CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (CachedPageEventFlow$downstreamFlow$1$2$emit$1) continuation;
                int i2 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        indexedValue.getClass();
                        if (indexedValue.index > ref$IntRef.element) {
                            FlowCollector flowCollector = (FlowCollector) this.this$0;
                            Object obj2 = indexedValue.value;
                            cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0 = indexedValue;
                            cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = 1;
                            if (flowCollector.emit(obj2, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    indexedValue = cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$IntRef.element = indexedValue.index;
                    return Unit.INSTANCE;
                }
            }
            cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
            Object obj3 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
            if (i != 0) {
            }
            ref$IntRef.element = indexedValue.index;
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x02b1, code lost:
        
            if (r12.lock(r1) == r2) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x03e5, code lost:
        
            if (r12.lock(r1) == r2) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x039b, code lost:
        
            if (r12.lock(r1) == r2) goto L157;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0491  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x045f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0416  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x03cf  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0385  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.material3.ThumbNode$onAttach$1$1] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r12v15, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r12v39, types: [int[]] */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v66, types: [int[]] */
        /* JADX WARN: Type inference failed for: r12v67 */
        /* JADX WARN: Type inference failed for: r12v90 */
        /* JADX WARN: Type inference failed for: r12v91 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Continuation continuation) {
            PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
            PageFetcherSnapshotState.Holder holder;
            Mutex mutex;
            PageFetcherSnapshot pageFetcherSnapshot;
            LoadStates snapshot;
            LoadType loadType;
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            LoadType loadType2;
            CoroutineScope coroutineScope3;
            LoadStates loadStates;
            PageFetcherSnapshotState.Holder holder2;
            Mutex mutex2;
            LoadType loadType3;
            PageFetcherSnapshot pageFetcherSnapshot2;
            PageFetcherSnapshot pageFetcherSnapshot3;
            LoadType loadType4;
            LoadType loadType5;
            PageFetcherSnapshot pageFetcherSnapshot4;
            ViewportHint viewportHint;
            CoroutineScope coroutineScope4;
            PageFetcherSnapshot pageFetcherSnapshot5;
            PageFetcherSnapshotState.Holder holder3;
            Mutex mutex3;
            LoadStates loadStates2;
            LoadType loadType6;
            PageFetcherSnapshot pageFetcherSnapshot6;
            PageFetcherSnapshot pageFetcherSnapshot7;
            PageFetcherSnapshotState.Holder holder4;
            Mutex mutex4;
            PageFetcherSnapshotState pageFetcherSnapshotState;
            LoadType loadType7;
            LoadStates loadStates3;
            CoroutineScope coroutineScope5;
            PageFetcherSnapshot pageFetcherSnapshot8;
            Mutex mutex5;
            LoadType loadType8;
            PageFetcherSnapshot pageFetcherSnapshot9;
            PageFetcherSnapshotState.Holder holder5;
            PageFetcherSnapshot pageFetcherSnapshot10;
            LoadType loadType9;
            ViewportHint viewportHint2;
            PageFetcherSnapshot pageFetcherSnapshot11;
            CoroutineScope coroutineScope6;
            LoadStates loadStates4;
            PageFetcherSnapshotState.Holder holder6;
            Mutex mutex6;
            LoadType loadType10;
            PageFetcherSnapshotState.Holder holder7;
            Mutex mutex7;
            CoroutineScope coroutineScope7;
            PageFetcherSnapshot pageFetcherSnapshot12;
            LoadType loadType11;
            PageFetcherSnapshotState.Holder holder8;
            Mutex mutex8;
            PageFetcherSnapshot pageFetcherSnapshot13;
            PageFetcherSnapshot pageFetcherSnapshot14;
            LoadType loadType12;
            LoadType loadType13;
            ViewportHint viewportHint3;
            PageFetcherSnapshot pageFetcherSnapshot15;
            PageFetcherSnapshot pageFetcherSnapshot16;
            CoroutineScope coroutineScope8;
            CoroutineScope coroutineScope9;
            PageFetcherSnapshot pageFetcherSnapshot17;
            PageFetcherSnapshotState.Holder holder9;
            Mutex mutex9;
            LoadState loadState;
            PageFetcherSnapshot pageFetcherSnapshot18 = (PageFetcherSnapshot) this.$pressCount;
            try {
                try {
                    try {
                        if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) continuation;
                            int i = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label;
                            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = i - PKIFailureInfo.systemUnavail;
                                Object obj = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                switch (pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label) {
                                    case 0:
                                        SafeTrace.throwOnFailure(obj);
                                        holder = pageFetcherSnapshot18.stateHolder;
                                        mutex = holder.lock;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = holder;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot18;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = mutex;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 1;
                                        if (mutex.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                            pageFetcherSnapshot = pageFetcherSnapshot18;
                                            try {
                                                PageFetcherSnapshotState pageFetcherSnapshotState2 = holder.state;
                                                snapshot = pageFetcherSnapshotState2.sourceLoadStates.snapshot();
                                                pageFetcherSnapshotState2.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) pageFetcherSnapshot.hintHandler.state).mRootNode);
                                                mutex.unlock(null);
                                                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                                                loadType = LoadType.REFRESH;
                                                if (!(snapshot.refresh instanceof LoadState.Error)) {
                                                    coroutineScope2 = coroutineScope10;
                                                    loadStates = snapshot;
                                                    if (PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] != 1) {
                                                        holder2 = pageFetcherSnapshot18.stateHolder;
                                                        mutex2 = holder2.lock;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot18;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = pageFetcherSnapshot18;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                                        if (mutex2.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                            loadType3 = loadType;
                                                            pageFetcherSnapshot2 = pageFetcherSnapshot18;
                                                            pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                            loadType4 = loadType3;
                                                            try {
                                                                ViewportHint viewportHint4 = (ViewportHint) holder2.state.failedHintsByLoadType.get(loadType3);
                                                                mutex2.unlock(null);
                                                                LoadType loadType14 = loadType4;
                                                                viewportHint = viewportHint4;
                                                                loadType = loadType14;
                                                                pageFetcherSnapshot4 = pageFetcherSnapshot2;
                                                                loadType5 = loadType3;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                                                if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot4, loadType, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        loadType5 = loadType;
                                                        pageFetcherSnapshot4 = pageFetcherSnapshot18;
                                                        pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                                        viewportHint = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                                        if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot4, loadType, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                            coroutineScope4 = coroutineScope2;
                                                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                                            snapshot = loadStates;
                                                            if (loadType5 == LoadType.REFRESH) {
                                                                holder3 = pageFetcherSnapshot5.stateHolder;
                                                                mutex3 = holder3.lock;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = snapshot;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope4;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder3;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex3;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                                                break;
                                                            }
                                                            pageFetcherSnapshot18 = pageFetcherSnapshot5;
                                                            coroutineScope = coroutineScope4;
                                                            loadStates2 = snapshot;
                                                            loadType6 = LoadType.PREPEND;
                                                            if (!(loadStates2.prepend instanceof LoadState.Error)) {
                                                                PageFetcherSnapshotState.Holder holder10 = pageFetcherSnapshot18.stateHolder;
                                                                MutexImpl mutexImpl = holder10.lock;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot18;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder10;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                                                if (mutexImpl.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                    pageFetcherSnapshot7 = pageFetcherSnapshot18;
                                                                    holder4 = holder10;
                                                                    mutex4 = mutexImpl;
                                                                    pageFetcherSnapshotState = holder4.state;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot7;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex4;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                                                    if (pageFetcherSnapshot7.setLoading(pageFetcherSnapshotState, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                        loadType7 = loadType6;
                                                                        loadStates3 = loadStates2;
                                                                        coroutineScope5 = coroutineScope;
                                                                        pageFetcherSnapshot8 = pageFetcherSnapshot7;
                                                                        mutex4.unlock(null);
                                                                        this = PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()];
                                                                        if (this == 1) {
                                                                            PageFetcherSnapshotState.Holder holder11 = pageFetcherSnapshot8.stateHolder;
                                                                            mutex5 = holder11.lock;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder11;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                                                            if (mutex5.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                                loadType8 = loadType7;
                                                                                pageFetcherSnapshot9 = pageFetcherSnapshot8;
                                                                                holder5 = holder11;
                                                                                pageFetcherSnapshot10 = pageFetcherSnapshot9;
                                                                                try {
                                                                                    viewportHint2 = (ViewportHint) holder5.state.failedHintsByLoadType.get(loadType8);
                                                                                    mutex5.unlock(null);
                                                                                    pageFetcherSnapshot11 = pageFetcherSnapshot10;
                                                                                    loadType9 = loadType8;
                                                                                    pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope5;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType9;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                                                                    if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType7, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                                    }
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            loadType9 = loadType7;
                                                                            viewportHint2 = null;
                                                                            pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType9;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                                                            if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType7, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                                                coroutineScope6 = coroutineScope5;
                                                                                loadStates4 = loadStates3;
                                                                                if (loadType9 == LoadType.REFRESH) {
                                                                                    holder6 = pageFetcherSnapshot8.stateHolder;
                                                                                    mutex6 = holder6.lock;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates4;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope6;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder6;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex6;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                                                                    break;
                                                                                }
                                                                                loadStates2 = loadStates4;
                                                                                pageFetcherSnapshot6 = pageFetcherSnapshot8;
                                                                                coroutineScope = coroutineScope6;
                                                                                loadType10 = LoadType.APPEND;
                                                                                if (loadStates2.append instanceof LoadState.Error) {
                                                                                    holder7 = pageFetcherSnapshot6.stateHolder;
                                                                                    mutex7 = holder7.lock;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot6;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder7;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex7;
                                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                                                                    break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                pageFetcherSnapshot6 = pageFetcherSnapshot18;
                                                                loadType10 = LoadType.APPEND;
                                                                if (loadStates2.append instanceof LoadState.Error) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    coroutineScope = coroutineScope10;
                                                    loadStates2 = snapshot;
                                                    loadType6 = LoadType.PREPEND;
                                                    if (!(loadStates2.prepend instanceof LoadState.Error)) {
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        return coroutineSingletons;
                                    case 1:
                                        mutex = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        PageFetcherSnapshotState pageFetcherSnapshotState22 = holder.state;
                                        snapshot = pageFetcherSnapshotState22.sourceLoadStates.snapshot();
                                        pageFetcherSnapshotState22.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) pageFetcherSnapshot.hintHandler.state).mRootNode);
                                        mutex.unlock(null);
                                        CoroutineScope coroutineScope102 = (CoroutineScope) this.this$0;
                                        loadType = LoadType.REFRESH;
                                        if (!(snapshot.refresh instanceof LoadState.Error)) {
                                        }
                                        break;
                                    case 2:
                                        Mutex mutex10 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                        PageFetcherSnapshotState.Holder holder12 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        loadType2 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope3 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        PageFetcherSnapshot pageFetcherSnapshot19 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        LoadStates loadStates5 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        PageFetcherSnapshotState pageFetcherSnapshotState3 = holder12.state;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot19;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 3;
                                        if (pageFetcherSnapshot19.setLoading(pageFetcherSnapshotState3, loadType2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                            pageFetcherSnapshot18 = pageFetcherSnapshot19;
                                            snapshot = loadStates5;
                                            this = mutex10;
                                            this.unlock(null);
                                            loadType = loadType2;
                                            coroutineScope2 = coroutineScope3;
                                            loadStates = snapshot;
                                            if (PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] != 1) {
                                            }
                                        }
                                        return coroutineSingletons;
                                    case 3:
                                        Mutex mutex11 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        LoadType loadType15 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        CoroutineScope coroutineScope11 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        PageFetcherSnapshot pageFetcherSnapshot20 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        snapshot = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        loadType2 = loadType15;
                                        pageFetcherSnapshot18 = pageFetcherSnapshot20;
                                        coroutineScope3 = coroutineScope11;
                                        this = mutex11;
                                        this.unlock(null);
                                        loadType = loadType2;
                                        coroutineScope2 = coroutineScope3;
                                        loadStates = snapshot;
                                        if (PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] != 1) {
                                        }
                                        break;
                                    case 4:
                                        pageFetcherSnapshot2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                        loadType4 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                        mutex2 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                        holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        loadType3 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope2 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        loadStates = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        ViewportHint viewportHint42 = (ViewportHint) holder2.state.failedHintsByLoadType.get(loadType3);
                                        mutex2.unlock(null);
                                        LoadType loadType142 = loadType4;
                                        viewportHint = viewportHint42;
                                        loadType = loadType142;
                                        pageFetcherSnapshot4 = pageFetcherSnapshot2;
                                        loadType5 = loadType3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                        if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot4, loadType, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 5:
                                        loadType5 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        CoroutineScope coroutineScope12 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        PageFetcherSnapshot pageFetcherSnapshot21 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        LoadStates loadStates6 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        snapshot = loadStates6;
                                        pageFetcherSnapshot5 = pageFetcherSnapshot21;
                                        coroutineScope4 = coroutineScope12;
                                        if (loadType5 == LoadType.REFRESH) {
                                        }
                                        pageFetcherSnapshot18 = pageFetcherSnapshot5;
                                        coroutineScope = coroutineScope4;
                                        loadStates2 = snapshot;
                                        loadType6 = LoadType.PREPEND;
                                        if (!(loadStates2.prepend instanceof LoadState.Error)) {
                                        }
                                        break;
                                    case 6:
                                        mutex3 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope4 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        snapshot = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        try {
                                            LoadState loadState2 = holder3.state.sourceLoadStates.get(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(loadState2 instanceof LoadState.Error)) {
                                                PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot5, coroutineScope4);
                                            }
                                            pageFetcherSnapshot18 = pageFetcherSnapshot5;
                                            coroutineScope = coroutineScope4;
                                            loadStates2 = snapshot;
                                            loadType6 = LoadType.PREPEND;
                                            if (!(loadStates2.prepend instanceof LoadState.Error)) {
                                            }
                                        } finally {
                                        }
                                        break;
                                    case 7:
                                        mutex4 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                        holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        loadType6 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        loadStates2 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        pageFetcherSnapshotState = holder4.state;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (pageFetcherSnapshot7.setLoading(pageFetcherSnapshotState, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 8:
                                        mutex4 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        CoroutineScope coroutineScope13 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        LoadStates loadStates7 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        coroutineScope5 = coroutineScope13;
                                        loadStates3 = loadStates7;
                                        mutex4.unlock(null);
                                        this = PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()];
                                        if (this == 1) {
                                        }
                                        break;
                                    case 9:
                                        pageFetcherSnapshot10 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                        loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                        mutex5 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                        holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        loadType8 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope5 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot9 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        loadStates3 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        viewportHint2 = (ViewportHint) holder5.state.failedHintsByLoadType.get(loadType8);
                                        mutex5.unlock(null);
                                        pageFetcherSnapshot11 = pageFetcherSnapshot10;
                                        loadType9 = loadType8;
                                        pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType7, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 10:
                                        loadType9 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        CoroutineScope coroutineScope14 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        PageFetcherSnapshot pageFetcherSnapshot22 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        LoadStates loadStates8 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        loadStates4 = loadStates8;
                                        pageFetcherSnapshot8 = pageFetcherSnapshot22;
                                        coroutineScope6 = coroutineScope14;
                                        if (loadType9 == LoadType.REFRESH) {
                                        }
                                        loadStates2 = loadStates4;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot8;
                                        coroutineScope = coroutineScope6;
                                        loadType10 = LoadType.APPEND;
                                        if (loadStates2.append instanceof LoadState.Error) {
                                        }
                                        return Unit.INSTANCE;
                                    case 11:
                                        mutex6 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        coroutineScope6 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        loadStates4 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        try {
                                            LoadState loadState3 = holder6.state.sourceLoadStates.get(LoadType.REFRESH);
                                            mutex6.unlock(null);
                                            if (!(loadState3 instanceof LoadState.Error)) {
                                                PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot8, coroutineScope6);
                                            }
                                            loadStates2 = loadStates4;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot8;
                                            coroutineScope = coroutineScope6;
                                            loadType10 = LoadType.APPEND;
                                            if (loadStates2.append instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        } finally {
                                        }
                                    case 12:
                                        mutex7 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        holder7 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        loadType10 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        coroutineScope = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        PageFetcherSnapshotState pageFetcherSnapshotState4 = holder7.state;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutex7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (pageFetcherSnapshot6.setLoading(pageFetcherSnapshotState4, loadType10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                            PageFetcherSnapshot pageFetcherSnapshot23 = pageFetcherSnapshot6;
                                            coroutineScope7 = coroutineScope;
                                            pageFetcherSnapshot12 = pageFetcherSnapshot23;
                                            loadType11 = loadType10;
                                            mutex7.unlock(null);
                                            this = PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType11.ordinal()];
                                            if (this == 1) {
                                                holder8 = pageFetcherSnapshot12.stateHolder;
                                                mutex8 = holder8.lock;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot12;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope7;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType11;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder8;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex8;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType11;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = pageFetcherSnapshot12;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutex8.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                    pageFetcherSnapshot13 = pageFetcherSnapshot12;
                                                    pageFetcherSnapshot14 = pageFetcherSnapshot13;
                                                    loadType12 = loadType11;
                                                    try {
                                                        viewportHint3 = (ViewportHint) holder8.state.failedHintsByLoadType.get(loadType12);
                                                        mutex8.unlock(null);
                                                        pageFetcherSnapshot15 = pageFetcherSnapshot13;
                                                        loadType13 = loadType12;
                                                        pageFetcherSnapshot12 = pageFetcherSnapshot14;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot12;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope7;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                        if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot15, loadType11, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else {
                                                loadType13 = loadType11;
                                                viewportHint3 = null;
                                                pageFetcherSnapshot15 = pageFetcherSnapshot12;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot12;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope7;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot15, loadType11, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                    pageFetcherSnapshot16 = pageFetcherSnapshot12;
                                                    coroutineScope8 = coroutineScope7;
                                                    if (loadType13 == LoadType.REFRESH) {
                                                        PageFetcherSnapshotState.Holder holder13 = pageFetcherSnapshot16.stateHolder;
                                                        MutexImpl mutexImpl2 = holder13.lock;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot16;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope8;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = holder13;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                        if (mutexImpl2.lock(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                                            coroutineScope9 = coroutineScope8;
                                                            pageFetcherSnapshot17 = pageFetcherSnapshot16;
                                                            holder9 = holder13;
                                                            mutex9 = mutexImpl2;
                                                            try {
                                                                loadState = holder9.state.sourceLoadStates.get(LoadType.REFRESH);
                                                                mutex9.unlock(null);
                                                                if (!(loadState instanceof LoadState.Error)) {
                                                                    PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot17, coroutineScope9);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                        return coroutineSingletons;
                                    case 13:
                                        mutex7 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        loadType11 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        CoroutineScope coroutineScope15 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        pageFetcherSnapshot12 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        coroutineScope7 = coroutineScope15;
                                        mutex7.unlock(null);
                                        this = PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings.$EnumSwitchMapping$0[loadType11.ordinal()];
                                        if (this == 1) {
                                        }
                                        break;
                                    case 14:
                                        pageFetcherSnapshot13 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                        loadType11 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                        mutex8 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                        holder8 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        loadType12 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        coroutineScope7 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        pageFetcherSnapshot14 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        viewportHint3 = (ViewportHint) holder8.state.failedHintsByLoadType.get(loadType12);
                                        mutex8.unlock(null);
                                        pageFetcherSnapshot15 = pageFetcherSnapshot13;
                                        loadType13 = loadType12;
                                        pageFetcherSnapshot12 = pageFetcherSnapshot14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot15, loadType11, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 15:
                                        loadType13 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        coroutineScope8 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        pageFetcherSnapshot16 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        if (loadType13 == LoadType.REFRESH) {
                                        }
                                        return Unit.INSTANCE;
                                    case 16:
                                        mutex9 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                        holder9 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                        coroutineScope9 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                        pageFetcherSnapshot17 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        loadState = holder9.state.sourceLoadStates.get(LoadType.REFRESH);
                                        mutex9.unlock(null);
                                        if (!(loadState instanceof LoadState.Error)) {
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                }
                            }
                        }
                        switch (pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label) {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, continuation);
            Object obj2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        
            if (((kotlinx.coroutines.channels.ProducerCoroutine) r3)._channel.send(r0, r4) == r5) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        
            if (((kotlinx.coroutines.channels.ProducerCoroutine) r3)._channel.send(r0, r4) == r5) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        
            if (((kotlinx.coroutines.channels.ProducerCoroutine) r3)._channel.send(r20, r4) == r5) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [com.squareup.cash.activity.backend.ActivityItem, com.squareup.cash.activity.backend.loader.LoadingState, com.squareup.cash.activity.backend.loader.SingleActivity] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(SingleActivity singleActivity, Continuation continuation) {
            RealSingleActivityManager$activity$2$1$2$emit$1 realSingleActivityManager$activity$2$1$2$emit$1;
            int i;
            Locale locale;
            ?? r2;
            Object obj;
            SingleActivity singleActivity2;
            ActivityFormattingResult activityFormattingResult;
            ProducerScope producerScope = (ProducerScope) this.this$0;
            if (continuation instanceof RealSingleActivityManager$activity$2$1$2$emit$1) {
                realSingleActivityManager$activity$2$1$2$emit$1 = (RealSingleActivityManager$activity$2$1$2$emit$1) continuation;
                int i2 = realSingleActivityManager$activity$2$1$2$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realSingleActivityManager$activity$2$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realSingleActivityManager$activity$2$1$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSingleActivityManager$activity$2$1$2$emit$1.label;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        RealSingleActivityManager realSingleActivityManager = (RealSingleActivityManager) this.$pressCount;
                        realSingleActivityManager.cache.activityItem = singleActivity;
                        ActivityItem activityItem = singleActivity.activityItem;
                        if ((activityItem instanceof PaymentHistoryActivityItem) && (locale = realSingleActivityManager.locale) != null) {
                            ZiplineActivityItemFormatter ziplineActivityItemFormatter = realSingleActivityManager.activityItemFormatter;
                            realSingleActivityManager$activity$2$1$2$emit$1.L$0 = singleActivity;
                            realSingleActivityManager$activity$2$1$2$emit$1.label = 1;
                            CoroutineContext coroutineContext = ziplineActivityItemFormatter.computationDispatcher;
                            EditProfilePresenter$models$2$1 editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1(ziplineActivityItemFormatter, (PaymentHistoryActivityItem) activityItem, locale, continuation2, 9);
                            r2 = 0;
                            Object withContext = JobKt.withContext(coroutineContext, editProfilePresenter$models$2$1, realSingleActivityManager$activity$2$1$2$emit$1);
                            if (withContext != coroutineSingletons) {
                                obj = withContext;
                                singleActivity2 = singleActivity;
                                activityFormattingResult = (ActivityFormattingResult) obj;
                                if (!(activityFormattingResult instanceof FormattingFailedActivityItem)) {
                                }
                            }
                        } else {
                            realSingleActivityManager$activity$2$1$2$emit$1.L$0 = null;
                            realSingleActivityManager$activity$2$1$2$emit$1.label = 4;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    singleActivity2 = realSingleActivityManager$activity$2$1$2$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    r2 = 0;
                    activityFormattingResult = (ActivityFormattingResult) obj;
                    if (!(activityFormattingResult instanceof FormattingFailedActivityItem)) {
                        SingleActivity singleActivity3 = new SingleActivity(r2, LoadingState.ERROR);
                        realSingleActivityManager$activity$2$1$2$emit$1.L$0 = r2;
                        realSingleActivityManager$activity$2$1$2$emit$1.label = 2;
                    } else if (activityFormattingResult instanceof FormattedPaymentHistoryActivityItem) {
                        SingleActivity copy$default = SingleActivity.copy$default(singleActivity2, (ActivityItem) activityFormattingResult, r2, 2);
                        realSingleActivityManager$activity$2$1$2$emit$1.L$0 = r2;
                        realSingleActivityManager$activity$2$1$2$emit$1.label = 3;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return coroutineSingletons;
                }
            }
            realSingleActivityManager$activity$2$1$2$emit$1 = new RealSingleActivityManager$activity$2$1$2$emit$1(this, continuation);
            Object obj22 = realSingleActivityManager$activity$2$1$2$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realSingleActivityManager$activity$2$1$2$emit$1.label;
            Continuation continuation22 = null;
            if (i != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbNode$onAttach$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(Continuation continuation, UseCaseCameraImpl useCaseCameraImpl) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.this$0 = useCaseCameraImpl;
    }
}
