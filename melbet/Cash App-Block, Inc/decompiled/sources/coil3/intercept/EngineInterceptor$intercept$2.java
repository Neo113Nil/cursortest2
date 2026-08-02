package coil3.intercept;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material.InternalMutatorMutex;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.os.BundleKt;
import androidx.core.text.TextUtilsCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.cart.LocalBrandLocationOpenTabPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Image;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.EngineInterceptor;
import coil3.memory.MemoryCache$Key;
import coil3.memory.MemoryCacheService;
import coil3.memory.RealMemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.SuccessResult;
import coil3.util.AndroidSystemCallbacks;
import com.fillr.e0;
import com.google.android.filament.Texture;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.maps.zzai;
import com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapClickListeners;
import com.google.maps.android.compose.MapUpdaterState;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.beacondetection.real.BeaconRegionTracker;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.biometrics.AndroidSecureStore$Crypto$Ready;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.SecureStore$WriteResult;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$State;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$2$1;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$result$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.borrow.presenters.CreditFirstTimeBorrowBlockerPresenter;
import com.squareup.cash.borrow.presenters.RepayCustomAmountPickerPresenter$models$1$1$1;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewClose;
import com.squareup.cash.cdf.document.DocumentUploadComplete;
import com.squareup.cash.cdf.document.DocumentUploadReceiveError;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractView;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.protos.cash.postbank.api.GetDirectDepositFormRequest;
import com.squareup.protos.cash.postbank.api.GetDirectDepositFormResponse;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentRequest;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentResponse;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import net.oneformapp.ProfileStore_;
import okhttp3.ConnectionPool;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2 {
    public Object $cacheKey;
    public final /* synthetic */ Object $chain;
    public Object $eventListener;
    public Object $mappedData;
    public Object $options;
    public final /* synthetic */ int $r8$classId;
    public Object $request;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, ImageRequest imageRequest, Object obj, Ref$ObjectRef ref$ObjectRef3, EventListener eventListener, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.this$0 = engineInterceptor;
        this.$options = ref$ObjectRef;
        this.$cacheKey = ref$ObjectRef2;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$chain = ref$ObjectRef3;
        this.$eventListener = eventListener;
    }

    private final Object invokeSuspend$com$squareup$cash$biometrics$AndroidSecureStore$write$2(Object obj) {
        AndroidSecureStore androidSecureStore;
        ByteString byteString;
        MutexImpl mutexImpl;
        String str;
        PublicKey generatePublic;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            androidSecureStore = (AndroidSecureStore) this.$eventListener;
            MutexImpl mutexImpl2 = androidSecureStore.dataLock;
            byteString = (ByteString) this.$cacheKey;
            String str2 = (String) this.$chain;
            this.this$0 = mutexImpl2;
            this.$request = byteString;
            this.$mappedData = androidSecureStore;
            this.$options = str2;
            this.label = 1;
            if (mutexImpl2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutexImpl = mutexImpl2;
            str = str2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.$options;
            androidSecureStore = (AndroidSecureStore) this.$mappedData;
            byteString = (ByteString) this.$request;
            mutexImpl = (MutexImpl) this.this$0;
            SafeTrace.throwOnFailure(obj);
        }
        SecureStore$WriteResult.Success success = SecureStore$WriteResult.Success.INSTANCE;
        try {
            if (byteString == null) {
                ConnectionPool connectionPool = androidSecureStore.storage;
                str.getClass();
                ((SharedPreferences) connectionPool.delegate).edit().remove(str).apply();
                return success;
            }
            PlatformKt platformKt = androidSecureStore.crypto;
            if (!((platformKt instanceof AndroidSecureStore$Crypto$Ready) && androidSecureStore.biometrics.getAuthenticationStatusForAuthenticator(15).equals(Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE))) {
                return SecureStore$WriteResult.SecureStoreUnavailable.INSTANCE;
            }
            AndroidSecureStore.access$prepareKeyStore(androidSecureStore, (AndroidSecureStore$Crypto$Ready) platformKt);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.getClass();
            generatePublic = r5.keyFactory.generatePublic(new X509EncodedKeySpec(((AndroidSecureStore$Crypto$Ready) platformKt).keyStore.getCertificate("cash-key").getPublicKey().getEncoded()));
            cipher.init(1, generatePublic);
            ConnectionPool connectionPool2 = androidSecureStore.storage;
            ByteString.Companion companion = ByteString.Companion;
            byte[] doFinal = cipher.doFinal(byteString.toByteArray());
            doFinal.getClass();
            ByteString of$default = ByteString.Companion.of$default(doFinal);
            str.getClass();
            ((SharedPreferences) connectionPool2.delegate).edit().putString(str, of$default.base64()).apply();
            return success;
        } catch (Exception e) {
            Timber.Forest.e(e);
            ConnectionPool connectionPool3 = androidSecureStore.storage;
            str.getClass();
            ((SharedPreferences) connectionPool3.delegate).edit().remove(str).apply();
            return new SecureStore$WriteResult.Failure(e);
        } finally {
            mutexImpl.unlock(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Integer, java.lang.Long, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$blockers$presenters$BlockerImageUploader$uploadFile$1(Object obj) {
        MultiBlockerFacilitator$Resolver resolver;
        ?? r15;
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        e0 e0Var;
        Object trackBlockerSubmissionAnalyticsWithNullableResult;
        ApiResult apiResult;
        BlockersData.AnalyticsData.Source source;
        FileCategory fileCategory = (FileCategory) this.$cacheKey;
        BlockersScreens blockersScreens = (BlockersScreens) this.$options;
        e0 e0Var2 = (e0) this.$request;
        FlowCollector flowCollector2 = (FlowCollector) this.$mappedData;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            resolver = ((RealMultiBlockerFacilitator) e0Var2.c).getResolver((BetterNavigator.ScreenNavigator) e0Var2.a, blockersScreens);
            if (!resolver.getResolvesSynchronously()) {
                this.$mappedData = flowCollector2;
                this.this$0 = resolver;
                this.label = 1;
                if (flowCollector2.emit(BlockerImageUploader$State.InProgress.INSTANCE, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                e0Var = e0Var2;
                flowCollector = flowCollector2;
                i2 = 4;
                i = 3;
                r15 = 0;
                trackBlockerSubmissionAnalyticsWithNullableResult = obj;
                coroutineSingletons = coroutineSingletons2;
                apiResult = (ApiResult) trackBlockerSubmissionAnalyticsWithNullableResult;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Analytics analytics = (Analytics) e0Var.f;
                    String name = fileCategory.name();
                    String str = blockersScreens.getBlockersData().flowToken;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    String name2 = clientScenario != null ? clientScenario.name() : r15;
                    String name3 = blockersScreens.getBlockersData().ratePlan.name();
                    BlockersData.AnalyticsData analyticsData = blockersScreens.getBlockersData().analyticsData;
                    analytics.track(new DocumentUploadComplete(name2, name, str, null, name3, (analyticsData == null || (source = analyticsData.source) == null) ? r15 : source.getAnalyticsName(), null, 72), r15);
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
                    BlockersData updateFromResponseContext = blockersScreens.getBlockersData().updateFromResponseContext(responseContext, false);
                    String str2 = responseContext.dialog_message;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) e0Var.a;
                    if (str2 != null) {
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str2, null, 10));
                    } else {
                        screenNavigator.goTo(((BlockersDataNavigator) e0Var.b).getNext(blockersScreens, updateFromResponseContext));
                    }
                    this.$mappedData = r15;
                    this.this$0 = r15;
                    this.label = i;
                    if (flowCollector.emit(BlockerImageUploader$State.Success.INSTANCE, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to upload FileBlocker(" + fileCategory + ")", new Object[0]);
                    String str3 = TextUtilsCompat.errorMessaging((AndroidStringManager) e0Var.i, (ApiResult.Failure) apiResult, r15).message;
                    ((Analytics) e0Var.f).track(new DocumentUploadReceiveError(null, fileCategory.name(), str3, null, null, Boolean.valueOf(apiResult instanceof ApiResult.Failure.NetworkFailure), apiResult instanceof ApiResult.Failure.HttpFailure ? new Integer(((ApiResult.Failure.HttpFailure) apiResult).code) : r15, null, HttpStatusCode.CONFLICT_409), r15);
                    ((BetterNavigator.ScreenNavigator) e0Var.a).goTo(new FailureMessageBlockerScreen(blockersScreens.getBlockersData(), str3, r15, i2));
                    this.$mappedData = r15;
                    this.this$0 = r15;
                    this.label = i2;
                    if (flowCollector.emit(BlockerImageUploader$State.Failure.INSTANCE, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.INSTANCE;
            }
            resolver = (MultiBlockerFacilitator$Resolver) this.this$0;
            SafeTrace.throwOnFailure(obj);
        }
        ByteString.Companion companion = ByteString.Companion;
        Lazy lazy = (Lazy) this.$eventListener;
        e0Var2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) lazy.getValue()).compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
        ByteString byteString = new ByteString(Arrays.copyOf(copyOf, copyOf.length));
        Analytics analytics2 = (Analytics) e0Var2.f;
        BlockersData blockersData = blockersScreens.getBlockersData();
        AndroidStringManager androidStringManager = (AndroidStringManager) e0Var2.i;
        RegisterAliasPresenter$register$result$1 registerAliasPresenter$register$result$1 = new RegisterAliasPresenter$register$result$1((Object) resolver, blockersScreens, (Object) byteString, (String) this.$chain, this.$cacheKey, (Continuation) null, 1);
        this.$mappedData = flowCollector2;
        this.this$0 = null;
        this.label = 2;
        r15 = 0;
        flowCollector = flowCollector2;
        coroutineSingletons = coroutineSingletons2;
        i = 3;
        i2 = 4;
        e0Var = e0Var2;
        trackBlockerSubmissionAnalyticsWithNullableResult = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsWithNullableResult(analytics2, blockersData, androidStringManager, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(8), R.string.blockers_retrofit_error_message, registerAliasPresenter$register$result$1, this);
        if (trackBlockerSubmissionAnalyticsWithNullableResult == coroutineSingletons) {
            return coroutineSingletons;
        }
        apiResult = (ApiResult) trackBlockerSubmissionAnalyticsWithNullableResult;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.endsWith(r12, "." + r4, false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$4$1(Object obj) {
        WebViewBlockerPresenter webViewBlockerPresenter;
        BlockersScreens.WebViewBlockerScreen webViewBlockerScreen;
        MutableState mutableState;
        BlockersData blockersData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BlockersScreens.WebViewBlockerScreen webViewBlockerScreen2 = (BlockersScreens.WebViewBlockerScreen) this.$options;
            String str = webViewBlockerScreen2.callbackUrl;
            if (str != null) {
                WebViewBlockerPresenter webViewBlockerPresenter2 = (WebViewBlockerPresenter) this.$eventListener;
                WebViewBlockerViewEvent webViewBlockerViewEvent = (WebViewBlockerViewEvent) this.$cacheKey;
                MutableState mutableState2 = (MutableState) this.$chain;
                Uri parse = Uri.parse(((WebViewBlockerViewEvent.UrlLoading) webViewBlockerViewEvent).url);
                String host = parse.getHost();
                Continuation continuation = null;
                String m$1 = host != null ? Recorder$$ExternalSyntheticOutline2.m$1(StringsKt.removePrefix("www.", host), parse.getPath()) : null;
                Uri parse2 = Uri.parse(str);
                String host2 = parse2.getHost();
                String m$12 = host2 != null ? Recorder$$ExternalSyntheticOutline2.m$1(StringsKt.removePrefix("www.", host2), parse2.getPath()) : null;
                if (m$12 != null) {
                    if (!Intrinsics.areEqual(m$1, m$12)) {
                    }
                    if (parse != null) {
                        Uri uri = !((Boolean) mutableState2.getValue()).booleanValue() ? parse : null;
                        if (uri != null) {
                            mutableState2.setValue(Boolean.TRUE);
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                            FileBlockerView$6$2$2 fileBlockerView$6$2$2 = new FileBlockerView$6$2$2(webViewBlockerPresenter2, uri, webViewBlockerScreen2, continuation, 22);
                            this.this$0 = webViewBlockerPresenter2;
                            this.$request = mutableState2;
                            this.$mappedData = webViewBlockerScreen2;
                            this.label = 1;
                            obj = JobKt.withContext(defaultIoScheduler, fileBlockerView$6$2$2, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            webViewBlockerPresenter = webViewBlockerPresenter2;
                            webViewBlockerScreen = webViewBlockerScreen2;
                            mutableState = mutableState2;
                        }
                    }
                }
                parse = null;
                if (parse != null) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) this.$mappedData;
        mutableState = (MutableState) this.$request;
        webViewBlockerPresenter = (WebViewBlockerPresenter) this.this$0;
        SafeTrace.throwOnFailure(obj);
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
            webViewBlockerPresenter.getClass();
            if (responseContext != null) {
                BlockersData blockersData2 = webViewBlockerScreen.blockersData;
                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                blockersData = blockersData2.updateFromResponseContext(responseContext, false);
            } else {
                blockersData = webViewBlockerScreen.blockersData;
            }
            webViewBlockerPresenter.navigator.goTo(webViewBlockerPresenter.blockersDataNavigator.getNext(webViewBlockerScreen, blockersData));
        } else {
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$borrow$presenters$CreditFirstTimeBorrowBlockerPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope, (CreditFirstTimeBorrowBlockerPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain, 4);
            this.$mappedData = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$borrow$presenters$util$RealLoanPaymentFlowStarter$initiateLoanPayment$2(Object obj) {
        String generateToken;
        Object initiateLoanPayment;
        BorrowHome borrowHome = (BorrowHome) this.$chain;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.$cacheKey;
        RepayCustomAmountPickerPresenter$models$1$1$1 repayCustomAmountPickerPresenter$models$1$1$1 = (RepayCustomAmountPickerPresenter$models$1$1$1) this.$request;
        MetadataRepo metadataRepo = (MetadataRepo) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            repayCustomAmountPickerPresenter$models$1$1$1.invoke(Boolean.TRUE);
            BlockersData.Flow.INSTANCE.getClass();
            generateToken = BlockersData.Flow.Companion.generateToken();
            LendingAppService lendingAppService = (LendingAppService) metadataRepo.mMetadataList;
            ClientScenario clientScenario = ClientScenario.INITIATE_LOAN_PAYMENT;
            InitiateLoanPaymentRequest initiateLoanPaymentRequest = new InitiateLoanPaymentRequest((String) this.$options, UUID.randomUUID().toString(), (Money) this.$eventListener, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
            this.this$0 = generateToken;
            this.label = 1;
            initiateLoanPayment = lendingAppService.initiateLoanPayment(clientScenario, generateToken, initiateLoanPaymentRequest, this);
            if (initiateLoanPayment == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = (String) this.this$0;
            SafeTrace.throwOnFailure(obj);
            generateToken = str;
            initiateLoanPayment = obj;
        }
        ApiResult apiResult = (ApiResult) initiateLoanPayment;
        repayCustomAmountPickerPresenter$models$1$1$1.invoke(Boolean.FALSE);
        if (apiResult instanceof ApiResult.Failure) {
            ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) metadataRepo.mTypeface, (ApiResult.Failure) apiResult, null);
            screenNavigator.goTo(new FailureMessageScreen(errorMessaging.title, errorMessaging.message, null, borrowHome, null, 20));
        } else {
            if (!(apiResult instanceof ApiResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            BlockersData startProfileBlockersFlow$default = FlowStarter.startProfileBlockersFlow$default((FlowStarter) metadataRepo.mEmojiCharArray, ClientScenario.INITIATE_LOAN_PAYMENT, borrowHome, generateToken, 8);
            ResponseContext responseContext = ((InitiateLoanPaymentResponse) ((ApiResult.Success) apiResult).response).response_context;
            responseContext.getClass();
            screenNavigator.goTo(((BlockersDataNavigator) metadataRepo.mRootNode).getNext(null, startProfileBlockersFlow$default.updateFromResponseContext(responseContext, false)));
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$bugreporting$presenters$BugReportingPresenter$models$3$1(Object obj) {
        MutableState mutableState = (MutableState) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!((Boolean) ((MutableState) this.$request).getValue()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            Flow flow = (Flow) this.this$0;
            RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1((LocalHomePresenter) this.$options, (MutableState) this.$eventListener, mutableState, (MutableState) this.$cacheKey, (MutableState) this.$chain, (Continuation) null, 10);
            this.label = 1;
            if (FlowKt.collectLatest(flow, realIdvPresenter$models$1$1, this) == coroutineSingletons) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        if (r0.emit(r14, r13) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$card$onboarding$CardModelView$cardInkMetal$2$1(Object obj) {
        Pair pair;
        Pair pair2;
        Texture texture;
        Pair pair3;
        Texture texture2;
        Object withContext;
        Texture texture3;
        Pair pair4;
        CardTextureState cardTextureState;
        CardModelView.CardBack cardBack = (CardModelView.CardBack) this.$cacheKey;
        CardModelView.CardFront cardFront = (CardModelView.CardFront) this.$eventListener;
        CardModelView cardModelView = (CardModelView) this.$chain;
        FlowCollector flowCollector = (FlowCollector) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            pair = new Pair(cardFront, cardBack);
            CardTextureState cardTextureState2 = cardModelView.textureState;
            if (cardTextureState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState2.inkTexture);
            pair2 = (Pair) access$nullableItems.first;
            texture = (Texture) access$nullableItems.second;
            if (texture != null) {
                this.$mappedData = flowCollector;
                this.this$0 = pair;
                this.$request = pair2;
                this.$options = texture;
                this.label = 1;
                if (flowCollector.emit(texture, this) != coroutineSingletons) {
                    pair3 = pair2;
                    texture2 = texture;
                }
                return coroutineSingletons;
            }
            if (Intrinsics.areEqual(pair2, pair) || texture == null) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(cardModelView, cardFront, cardBack, continuation, 22);
                this.$mappedData = flowCollector;
                this.this$0 = pair;
                this.$request = null;
                this.$options = texture;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler, setNameViewKt$SetName$2$1, this);
                if (withContext != coroutineSingletons) {
                    texture3 = texture;
                    obj = withContext;
                    pair4 = pair;
                    Texture updateOrCreate$default = CardModelView.updateOrCreate$default(cardModelView, texture3, (Bitmap) obj, TextureType.COLOR);
                    cardTextureState = cardModelView.textureState;
                    if (cardTextureState != null) {
                    }
                }
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            texture2 = (Texture) this.$options;
            pair3 = (Pair) this.$request;
            pair = (Pair) this.this$0;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            texture3 = (Texture) this.$options;
            pair4 = (Pair) this.this$0;
            SafeTrace.throwOnFailure(obj);
            Texture updateOrCreate$default2 = CardModelView.updateOrCreate$default(cardModelView, texture3, (Bitmap) obj, TextureType.COLOR);
            cardTextureState = cardModelView.textureState;
            if (cardTextureState != null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            cardTextureState.inkTexture = new Pair(pair4, updateOrCreate$default2);
            this.$mappedData = null;
            this.this$0 = null;
            this.$request = null;
            this.$options = null;
            this.label = 3;
        }
        texture = texture2;
        pair2 = pair3;
        if (Intrinsics.areEqual(pair2, pair)) {
        }
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$12 = new SetNameViewKt$SetName$2$1(cardModelView, cardFront, cardBack, continuation, 22);
        this.$mappedData = flowCollector;
        this.this$0 = pair;
        this.$request = null;
        this.$options = texture;
        this.label = 2;
        withContext = JobKt.withContext(defaultIoScheduler2, setNameViewKt$SetName$2$12, this);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    private final Object invokeSuspend$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (LocalPosCheckInPresenter) this.$request, (CurrencyCode) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain);
            this.$mappedData = null;
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

    private final Object invokeSuspend$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$mappedData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (CardStudioPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain);
            this.$mappedData = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:53:0x005f, code lost:
    
        if (r14 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$directdeposit$presenters$DirectDepositUpdateManualFormDetailsPresenter$models$1$1(Object obj) {
        GetDirectDepositFormResponse getDirectDepositFormResponse;
        MutableState mutableState;
        MutableState mutableState2 = (MutableState) this.$cacheKey;
        MutableState mutableState3 = (MutableState) this.$eventListener;
        MutableState mutableState4 = (MutableState) this.$options;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$mappedData;
        DirectDepositUpdateManualFormScreen directDepositUpdateManualFormScreen = (DirectDepositUpdateManualFormScreen) localEditorialPresenter.screen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        DirectDepositUpdateManualFormDetailsViewModel.Error error = DirectDepositUpdateManualFormDetailsViewModel.Error.INSTANCE;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm) mutableState4.getValue()) != null) {
                return Unit.INSTANCE;
            }
            mutableState3.setValue(DirectDepositUpdateManualFormDetailsViewModel.Loading.INSTANCE);
            PostbankAppService postbankAppService = (PostbankAppService) localEditorialPresenter.installedStore;
            GetDirectDepositFormRequest getDirectDepositFormRequest = new GetDirectDepositFormRequest(directDepositUpdateManualFormScreen.token, ByteString.EMPTY);
            this.label = 1;
            obj = postbankAppService.getDirectDepositForm(getDirectDepositFormRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState = (MutableState) this.$request;
                getDirectDepositFormResponse = (GetDirectDepositFormResponse) this.this$0;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue((Uri) obj);
                if (((Uri) mutableState2.getValue()) != null) {
                    mutableState4.setValue(null);
                    mutableState3.setValue(error);
                    return Unit.INSTANCE;
                }
                String str = getDirectDepositFormResponse.customer_name;
                Money money = getDirectDepositFormResponse.amount_money;
                if (str == null) {
                    str = "";
                }
                String str2 = getDirectDepositFormResponse.employer_name;
                String str3 = str2 != null ? str2 : "";
                String str4 = getDirectDepositFormResponse.percentage;
                PaycheckDepositAllocation currencyAmount = money != null ? new PaycheckDepositAllocation.CurrencyAmount(money, ((MoneyFormatter) ((Lazy) localEditorialPresenter.responseContextHandler).getValue()).format(money)) : (str4 == null || StringsKt.isBlank(str4)) ? PaycheckDepositAllocation.All.INSTANCE : new PaycheckDepositAllocation.Percentage(Integer.parseInt(str4));
                Boolean bool = getDirectDepositFormResponse.add_signature;
                mutableState4.setValue(new DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm(str, str3, currencyAmount, bool != null ? bool.booleanValue() : false));
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
            mutableState4.setValue(null);
            mutableState3.setValue(error);
            return Unit.INSTANCE;
        }
        if (!(apiResult instanceof ApiResult.Success)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        GetDirectDepositFormResponse getDirectDepositFormResponse2 = (GetDirectDepositFormResponse) ((ApiResult.Success) apiResult).response;
        RealFormPdfProvider realFormPdfProvider = (RealFormPdfProvider) localEditorialPresenter.service;
        String str5 = directDepositUpdateManualFormScreen.token;
        String str6 = getDirectDepositFormResponse2.file_url;
        str6.getClass();
        this.this$0 = getDirectDepositFormResponse2;
        this.$request = mutableState2;
        this.label = 2;
        Comparable downloadPdf = realFormPdfProvider.downloadPdf(str5, str6, this);
        if (downloadPdf != coroutineSingletons) {
            getDirectDepositFormResponse = getDirectDepositFormResponse2;
            obj = downloadPdf;
            mutableState = mutableState2;
            mutableState.setValue((Uri) obj);
            if (((Uri) mutableState2.getValue()) != null) {
            }
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$chain;
        switch (i) {
            case 0:
                return new EngineInterceptor$intercept$2((EngineInterceptor) this.this$0, (ImageRequest) this.$request, this.$mappedData, (Options) this.$options, (EventListener) this.$eventListener, (MemoryCache$Key) this.$cacheKey, (ProfileStore_) obj2, continuation, 0);
            case 1:
                return new EngineInterceptor$intercept$2((StillCaptureRequestControl) this.$eventListener, (UseCaseCameraRequestControl) this.$cacheKey, (StillCaptureRequestControl.CaptureRequest) obj2, continuation, 1);
            case 2:
                return new EngineInterceptor$intercept$2((StillCaptureRequestControl) obj2, continuation);
            case 3:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2((MutatePriority) this.$eventListener, (MutatorMutex) this.$cacheKey, (Function1) obj2, continuation, 3);
                engineInterceptor$intercept$2.$options = obj;
                return engineInterceptor$intercept$2;
            case 4:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$22 = new EngineInterceptor$intercept$2((MutatePriority) this.$eventListener, (InternalMutatorMutex) this.$cacheKey, (Function1) obj2, continuation, 4);
                engineInterceptor$intercept$22.$options = obj;
                return engineInterceptor$intercept$22;
            case 5:
                return new EngineInterceptor$intercept$2((RealOrderBuilder) this.this$0, (MutableState) this.$request, (State) this.$mappedData, (State) this.$options, (State) this.$eventListener, (State) this.$cacheKey, (MutableState) obj2, continuation, 5);
            case 6:
                int i2 = 6;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$23 = new EngineInterceptor$intercept$2(i2, (MutableState) obj2, (Flow) this.this$0, (LocalBrandLocationOpenTabPresenter) this.$request, (CoroutineScope) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$23.$mappedData = obj;
                return engineInterceptor$intercept$23;
            case 7:
                return new EngineInterceptor$intercept$2((RealLocalBrandSyncer) this.this$0, (BrandSpot) this.$request, (String) this.$mappedData, (BrandSpotSyncTokens) this.$options, (RealLocalLauncher) this.$eventListener, (BetterNavigator.ScreenNavigator) this.$cacheKey, (Function0) obj2, continuation, 7);
            case 8:
                return new EngineInterceptor$intercept$2((MutableState) this.this$0, (MutableState) this.$request, (CollapsingToolbarScaffoldState) this.$mappedData, (LazyListState) this.$options, (ParcelableSnapshotMutableIntState) this.$eventListener, (LazyGridState) this.$cacheKey, (LocalBrandLocationMenuViewModel) obj2, continuation, 8);
            case 9:
                return new EngineInterceptor$intercept$2((EngineInterceptor) this.this$0, (Ref$ObjectRef) this.$options, (Ref$ObjectRef) this.$cacheKey, (ImageRequest) this.$request, this.$mappedData, (Ref$ObjectRef) obj2, (EventListener) this.$eventListener, continuation);
            case 10:
                return new EngineInterceptor$intercept$2((MapView) this.$mappedData, (MapClickListeners) this.$options, (CompositionContext) this.$eventListener, (MapUpdaterState) this.$cacheKey, (Function2) obj2, continuation, 10);
            case 11:
                int i3 = 11;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$24 = new EngineInterceptor$intercept$2(i3, (MutableState) obj2, (Flow) this.this$0, (ReceiptPresenter) this.$request, (State) this.$options, (ActivityItemEventHandler) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$24.$mappedData = obj;
                return engineInterceptor$intercept$24;
            case 12:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$25 = new EngineInterceptor$intercept$2((PaymentHistoryInputsRow) this.$options, (ZiplineHistoryDataJavaScripter) this.$eventListener, (AnalyticsEvent) this.$cacheKey, (AnalyticsEvent) obj2, continuation, 12);
                engineInterceptor$intercept$25.$mappedData = obj;
                return engineInterceptor$intercept$25;
            case 13:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$26 = new EngineInterceptor$intercept$2((LocationPermissionLevel) this.this$0, (BeaconDetectionSetupTeardown) this.$request, (MetadataRepo) this.$options, (BufferedChannel) this.$eventListener, (RealStrongMemoryCache) this.$cacheKey, (BeaconRegionTracker) obj2, continuation);
                engineInterceptor$intercept$26.$mappedData = obj;
                return engineInterceptor$intercept$26;
            case 14:
                return new EngineInterceptor$intercept$2((AndroidSecureStore) this.$eventListener, (ByteString) this.$cacheKey, (String) obj2, continuation, 14);
            case 15:
                int i4 = 15;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$27 = new EngineInterceptor$intercept$2(i4, (MutableState) obj2, (Flow) this.this$0, (StuckPlayerDetector) this.$request, (BetterNavigator.ScreenNavigator) this.$options, (State) this.$eventListener, (State) this.$cacheKey, continuation);
                engineInterceptor$intercept$27.$mappedData = obj;
                return engineInterceptor$intercept$27;
            case 16:
                int i5 = 16;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$28 = new EngineInterceptor$intercept$2(i5, (MutableState) obj2, (Flow) this.this$0, (Ref$ObjectRef) this.$request, (LocalPosCheckInPresenter) this.$options, (MoneyFormatter) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$28.$mappedData = obj;
                return engineInterceptor$intercept$28;
            case 17:
                int i6 = 17;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$29 = new EngineInterceptor$intercept$2(i6, (MutableState) obj2, (Flow) this.this$0, (BitcoinDepositNoteScreenView) this.$request, (DelegatingSoftwareKeyboardController) this.$options, (FocusOwnerImpl) this.$eventListener, (Function1) this.$cacheKey, continuation);
                engineInterceptor$intercept$29.$mappedData = obj;
                return engineInterceptor$intercept$29;
            case 18:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$210 = new EngineInterceptor$intercept$2((e0) this.$request, (BlockersScreens) this.$options, (Lazy) this.$eventListener, (FileCategory) this.$cacheKey, (String) obj2, continuation);
                engineInterceptor$intercept$210.$mappedData = obj;
                return engineInterceptor$intercept$210;
            case 19:
                int i7 = 19;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$211 = new EngineInterceptor$intercept$2(i7, (MutableState) obj2, (Flow) this.this$0, (InputCardInfoPresenter) this.$request, (Ref$BooleanRef) this.$options, (MutableState) this.$eventListener, (ParcelableSnapshotMutableIntState) this.$cacheKey, continuation);
                engineInterceptor$intercept$211.$mappedData = obj;
                return engineInterceptor$intercept$211;
            case 20:
                int i8 = 20;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$212 = new EngineInterceptor$intercept$2(i8, (MutableState) obj2, (Versioned) this.this$0, (PasscodePresenter) this.$request, (ParcelableSnapshotMutableIntState) this.$options, (State) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$212.$mappedData = obj;
                return engineInterceptor$intercept$212;
            case 21:
                return new EngineInterceptor$intercept$2((BlockersScreens.WebViewBlockerScreen) this.$options, (WebViewBlockerPresenter) this.$eventListener, (WebViewBlockerViewEvent) this.$cacheKey, (MutableState) obj2, continuation, 21);
            case 22:
                int i9 = 22;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$213 = new EngineInterceptor$intercept$2(i9, (MutableState) obj2, (Flow) this.this$0, (CreditFirstTimeBorrowBlockerPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$213.$mappedData = obj;
                return engineInterceptor$intercept$213;
            case 23:
                return new EngineInterceptor$intercept$2((RepayCustomAmountPickerPresenter$models$1$1$1) this.$request, (MetadataRepo) this.$mappedData, (String) this.$options, (Money) this.$eventListener, (BetterNavigator.ScreenNavigator) this.$cacheKey, (BorrowHome) obj2, continuation);
            case 24:
                return new EngineInterceptor$intercept$2((Flow) this.this$0, (MutableState) this.$request, (MutableState) this.$mappedData, (LocalHomePresenter) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) obj2, continuation, 24);
            case 25:
                EngineInterceptor$intercept$2 engineInterceptor$intercept$214 = new EngineInterceptor$intercept$2((CardModelView.CardFront) this.$eventListener, (CardModelView.CardBack) this.$cacheKey, (CardModelView) obj2, continuation, 25);
                engineInterceptor$intercept$214.$mappedData = obj;
                return engineInterceptor$intercept$214;
            case 26:
                int i10 = 26;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$215 = new EngineInterceptor$intercept$2(i10, (MutableState) obj2, (Flow) this.this$0, (LocalPosCheckInPresenter) this.$request, (CurrencyCode) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$215.$mappedData = obj;
                return engineInterceptor$intercept$215;
            case 27:
                int i11 = 27;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$216 = new EngineInterceptor$intercept$2(i11, (MutableState) obj2, (Flow) this.this$0, (CardStudioPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$216.$mappedData = obj;
                return engineInterceptor$intercept$216;
            case 28:
                return new EngineInterceptor$intercept$2((LocalEditorialPresenter) this.$mappedData, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (State) obj2, continuation, 28);
            default:
                int i12 = 29;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$217 = new EngineInterceptor$intercept$2(i12, (ParcelableSnapshotMutableIntState) obj2, (Flow) this.this$0, (TransfersPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, continuation);
                engineInterceptor$intercept$217.$mappedData = obj;
                return engineInterceptor$intercept$217;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 10:
                ((EngineInterceptor$intercept$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((EngineInterceptor$intercept$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x03bb, code lost:
    
        if (r3 == r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0804, code lost:
    
        if (r6 == r3) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0968, code lost:
    
        if (r0 == r9) goto L433;
     */
    /* JADX WARN: Removed duplicated region for block: B:420:0x082b A[Catch: all -> 0x07cd, TryCatch #4 {all -> 0x07cd, blocks: (B:413:0x07c1, B:416:0x084f, B:418:0x0823, B:420:0x082b, B:423:0x0835), top: B:412:0x07c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08f5  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:371:0x084b -> B:361:0x07ca). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$execute;
        boolean z;
        RealMemoryCache memoryCache;
        Ref$BooleanRef ref$BooleanRef;
        UseCaseCameraRequestControl useCaseCameraRequestControl;
        Object access$submitRequest;
        StillCaptureRequestControl stillCaptureRequestControl;
        StillCaptureRequestControl.CaptureRequest captureRequest;
        StillCaptureRequestControl.CaptureRequest captureRequest2;
        Mutex mutex;
        UseCaseCameraRequestControl useCaseCameraRequestControl2;
        Object awaitSurfaceSetup;
        Mutex mutex2;
        Mutex mutex3;
        UseCaseCameraRequestControl useCaseCameraRequestControl3;
        Function1 function1;
        MutatorMutex.Mutator mutator;
        Mutex mutex4;
        MutatorMutex mutatorMutex;
        MutatorMutex mutatorMutex2;
        MutatorMutex.Mutator mutator2;
        Object invoke;
        Mutex mutex5;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Function1 function12;
        InternalMutatorMutex.Mutator mutator3;
        Mutex mutex6;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex internalMutatorMutex2;
        InternalMutatorMutex.Mutator mutator4;
        Object invoke2;
        Mutex mutex7;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Object syncBrandSpot$default;
        Object obj2;
        Object orThrow;
        CompositionImpl compositionImpl;
        Object failure;
        AnalyticsEvent analyticsEvent;
        Object paymentHistoryData;
        AnalyticsEvent analyticsEvent2;
        switch (this.$r8$classId) {
            case 0:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EngineInterceptor engineInterceptor = (EngineInterceptor) this.this$0;
                    ImageRequest imageRequest = (ImageRequest) this.$request;
                    Object obj4 = this.$mappedData;
                    Options options = (Options) this.$options;
                    EventListener eventListener = (EventListener) this.$eventListener;
                    this.label = 1;
                    access$execute = EngineInterceptor.access$execute(engineInterceptor, imageRequest, obj4, options, eventListener, this);
                    break;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$execute = obj;
                }
                EngineInterceptor.ExecuteResult executeResult = (EngineInterceptor.ExecuteResult) access$execute;
                AndroidSystemCallbacks androidSystemCallbacks = ((EngineInterceptor) this.this$0).systemCallbacks;
                synchronized (androidSystemCallbacks) {
                    try {
                        RealImageLoader realImageLoader = (RealImageLoader) ((WeakReference) androidSystemCallbacks.imageLoader).get();
                        if (realImageLoader == null) {
                            androidSystemCallbacks.shutdown();
                        } else if (((Context) androidSystemCallbacks.application) == null) {
                            Context context = realImageLoader.options.application;
                            androidSystemCallbacks.application = context;
                            context.registerComponentCallbacks((AndroidSystemCallbacks.ComponentCallbacks) androidSystemCallbacks.componentCallbacks);
                        }
                    } finally {
                    }
                }
                MemoryCacheService memoryCacheService = ((EngineInterceptor) this.this$0).memoryCacheService;
                MemoryCache$Key memoryCache$Key = (MemoryCache$Key) this.$cacheKey;
                ImageRequest imageRequest2 = (ImageRequest) this.$request;
                if (memoryCache$Key == null || !imageRequest2.memoryCachePolicy.writeEnabled || !executeResult.image.getShareable() || (memoryCache = ((RealImageLoader) memoryCacheService.imageLoader).getMemoryCache()) == null) {
                    z = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(executeResult.isSampled));
                    String str = executeResult.diskCacheKey;
                    if (str != null) {
                        linkedHashMap.put("coil#disk_cache_key", str);
                    }
                    Image image = executeResult.image;
                    Map immutableMap = BundleKt.toImmutableMap(linkedHashMap);
                    synchronized (memoryCache.lock) {
                        long size = image.getSize();
                        if (size < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
                        }
                        memoryCache.strongMemoryCache.set(memoryCache$Key, image, immutableMap, size);
                    }
                    z = true;
                }
                Image image2 = executeResult.image;
                ImageRequest imageRequest3 = (ImageRequest) this.$request;
                DataSource dataSource = executeResult.dataSource;
                MemoryCache$Key memoryCache$Key2 = z ? (MemoryCache$Key) this.$cacheKey : null;
                String str2 = executeResult.diskCacheKey;
                boolean z2 = executeResult.isSampled;
                ProfileStore_ profileStore_ = (ProfileStore_) this.$chain;
                obj3 = new SuccessResult(image2, imageRequest3, dataSource, memoryCache$Key2, str2, z2, profileStore_ != null && profileStore_.isPlaceholderCached());
                return obj3;
            case 1:
                StillCaptureRequestControl stillCaptureRequestControl2 = (StillCaptureRequestControl) this.$eventListener;
                StillCaptureRequestControl.CaptureRequest captureRequest3 = (StillCaptureRequestControl.CaptureRequest) this.$chain;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    useCaseCameraRequestControl = stillCaptureRequestControl2._requestControl;
                    if (useCaseCameraRequestControl != null && !Intrinsics.areEqual((UseCaseCameraRequestControl) this.$cacheKey, useCaseCameraRequestControl)) {
                        this.$mappedData = ref$BooleanRef;
                        this.this$0 = captureRequest3;
                        this.$request = useCaseCameraRequestControl;
                        this.$options = stillCaptureRequestControl2;
                        this.label = 1;
                        access$submitRequest = StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl2, captureRequest3, useCaseCameraRequestControl, this);
                        if (access$submitRequest != coroutineSingletons) {
                            stillCaptureRequestControl = stillCaptureRequestControl2;
                            captureRequest = captureRequest3;
                        }
                        return coroutineSingletons;
                    }
                    if (ref$BooleanRef.element) {
                        MutexImpl mutexImpl = stillCaptureRequestControl2.mutex;
                        this.$mappedData = mutexImpl;
                        this.this$0 = stillCaptureRequestControl2;
                        this.$request = captureRequest3;
                        this.$options = null;
                        this.label = 2;
                        if (mutexImpl.lock(this) != coroutineSingletons) {
                            captureRequest2 = captureRequest3;
                            mutex = mutexImpl;
                            stillCaptureRequestControl2.pendingRequests.add(captureRequest2);
                            mutex.unlock(null);
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    captureRequest2 = (StillCaptureRequestControl.CaptureRequest) this.$request;
                    stillCaptureRequestControl2 = (StillCaptureRequestControl) this.this$0;
                    mutex = (Mutex) this.$mappedData;
                    SafeTrace.throwOnFailure(obj);
                    try {
                        stillCaptureRequestControl2.pendingRequests.add(captureRequest2);
                        mutex.unlock(null);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + captureRequest3 + ", will be retried with a future UseCaseCamera");
                        }
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
                StillCaptureRequestControl stillCaptureRequestControl3 = (StillCaptureRequestControl) this.$options;
                useCaseCameraRequestControl = (UseCaseCameraRequestControl) this.$request;
                StillCaptureRequestControl.CaptureRequest captureRequest4 = (StillCaptureRequestControl.CaptureRequest) this.this$0;
                ref$BooleanRef = (Ref$BooleanRef) this.$mappedData;
                SafeTrace.throwOnFailure(obj);
                captureRequest = captureRequest4;
                stillCaptureRequestControl = stillCaptureRequestControl3;
                access$submitRequest = obj;
                UseCaseCameraRequestControl useCaseCameraRequestControl4 = useCaseCameraRequestControl;
                Deferred deferred = (Deferred) access$submitRequest;
                stillCaptureRequestControl.getClass();
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                deferred.invokeOnCompletion(new n3$$ExternalSyntheticLambda0(stillCaptureRequestControl, deferred, captureRequest, useCaseCameraRequestControl4, 1));
                ref$BooleanRef2.element = false;
                ref$BooleanRef = ref$BooleanRef2;
                if (ref$BooleanRef.element) {
                }
                return Unit.INSTANCE;
            case 2:
                StillCaptureRequestControl stillCaptureRequestControl4 = (StillCaptureRequestControl) this.$chain;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    useCaseCameraRequestControl2 = stillCaptureRequestControl4._requestControl;
                    if (useCaseCameraRequestControl2 != null) {
                        this.this$0 = useCaseCameraRequestControl2;
                        this.label = 1;
                        awaitSurfaceSetup = useCaseCameraRequestControl2.awaitSurfaceSetup(this);
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            stillCaptureRequestControl4 = (StillCaptureRequestControl) this.$mappedData;
                            mutex2 = (Mutex) this.$request;
                            useCaseCameraRequestControl2 = (UseCaseCameraRequestControl) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            mutex3 = mutex2;
                            useCaseCameraRequestControl3 = useCaseCameraRequestControl2;
                            while (!stillCaptureRequestControl4.pendingRequests.isEmpty()) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i3 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        StillCaptureRequestControl stillCaptureRequestControl5 = (StillCaptureRequestControl) this.$cacheKey;
                        UseCaseCameraRequestControl useCaseCameraRequestControl5 = (UseCaseCameraRequestControl) this.$eventListener;
                        StillCaptureRequestControl.CaptureRequest captureRequest5 = (StillCaptureRequestControl.CaptureRequest) this.$options;
                        StillCaptureRequestControl stillCaptureRequestControl6 = (StillCaptureRequestControl) this.$mappedData;
                        mutex3 = (Mutex) this.$request;
                        UseCaseCameraRequestControl useCaseCameraRequestControl6 = (UseCaseCameraRequestControl) this.this$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            StillCaptureRequestControl stillCaptureRequestControl7 = stillCaptureRequestControl5;
                            UseCaseCameraRequestControl useCaseCameraRequestControl7 = useCaseCameraRequestControl5;
                            stillCaptureRequestControl4 = stillCaptureRequestControl6;
                            useCaseCameraRequestControl3 = useCaseCameraRequestControl6;
                            Object access$submitRequest2 = obj;
                            StillCaptureRequestControl.CaptureRequest captureRequest6 = captureRequest5;
                            Deferred deferred2 = (Deferred) access$submitRequest2;
                            stillCaptureRequestControl7.getClass();
                            deferred2.invokeOnCompletion(new n3$$ExternalSyntheticLambda0(stillCaptureRequestControl7, deferred2, captureRequest6, useCaseCameraRequestControl7, 1));
                            while (!stillCaptureRequestControl4.pendingRequests.isEmpty()) {
                                captureRequest5 = (StillCaptureRequestControl.CaptureRequest) stillCaptureRequestControl4.pendingRequests.poll();
                                if (captureRequest5 != null) {
                                    this.this$0 = useCaseCameraRequestControl3;
                                    this.$request = mutex3;
                                    this.$mappedData = stillCaptureRequestControl4;
                                    this.$options = captureRequest5;
                                    this.$eventListener = useCaseCameraRequestControl3;
                                    this.$cacheKey = stillCaptureRequestControl4;
                                    this.label = 3;
                                    access$submitRequest2 = StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl4, captureRequest5, useCaseCameraRequestControl3, this);
                                    if (access$submitRequest2 != coroutineSingletons2) {
                                        stillCaptureRequestControl7 = stillCaptureRequestControl4;
                                        useCaseCameraRequestControl7 = useCaseCameraRequestControl3;
                                        StillCaptureRequestControl.CaptureRequest captureRequest62 = captureRequest5;
                                        Deferred deferred22 = (Deferred) access$submitRequest2;
                                        stillCaptureRequestControl7.getClass();
                                        deferred22.invokeOnCompletion(new n3$$ExternalSyntheticLambda0(stillCaptureRequestControl7, deferred22, captureRequest62, useCaseCameraRequestControl7, 1));
                                        while (!stillCaptureRequestControl4.pendingRequests.isEmpty()) {
                                        }
                                    }
                                    return coroutineSingletons2;
                                }
                            }
                            return Unit.INSTANCE;
                        } finally {
                        }
                    }
                    useCaseCameraRequestControl2 = (UseCaseCameraRequestControl) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitSurfaceSetup = obj;
                }
                if (((Boolean) awaitSurfaceSetup).booleanValue()) {
                    MutexImpl mutexImpl2 = stillCaptureRequestControl4.mutex;
                    this.this$0 = useCaseCameraRequestControl2;
                    this.$request = mutexImpl2;
                    this.$mappedData = stillCaptureRequestControl4;
                    this.label = 2;
                    if (mutexImpl2.lock(this) != coroutineSingletons2) {
                        mutex2 = mutexImpl2;
                        mutex3 = mutex2;
                        useCaseCameraRequestControl3 = useCaseCameraRequestControl2;
                        while (!stillCaptureRequestControl4.pendingRequests.isEmpty()) {
                        }
                    }
                    return coroutineSingletons2;
                }
                return Unit.INSTANCE;
            case 3:
                MutatorMutex mutatorMutex3 = (MutatorMutex) this.$cacheKey;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    try {
                        if (i4 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineScope coroutineScope = (CoroutineScope) this.$options;
                            MutatePriority mutatePriority = (MutatePriority) this.$eventListener;
                            CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
                            element.getClass();
                            MutatorMutex.Mutator mutator5 = new MutatorMutex.Mutator(mutatePriority, (Job) element);
                            MutatorMutex.access$tryMutateOrCancel(mutatorMutex3, mutator5);
                            MutexImpl mutexImpl3 = mutatorMutex3.mutex;
                            function1 = (Function1) this.$chain;
                            this.$options = mutator5;
                            this.this$0 = mutexImpl3;
                            this.$mappedData = function1;
                            this.$request = mutatorMutex3;
                            this.label = 1;
                            if (mutexImpl3.lock(this) != coroutineSingletons3) {
                                mutator = mutator5;
                                mutex4 = mutexImpl3;
                            }
                            return coroutineSingletons3;
                        }
                        if (i4 != 1) {
                            if (i4 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutatorMutex2 = (MutatorMutex) this.$mappedData;
                            mutex5 = (Mutex) this.this$0;
                            mutator2 = (MutatorMutex.Mutator) this.$options;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                invoke = obj;
                                atomicReference2 = mutatorMutex2.currentMutator;
                                while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                                }
                                mutex5.unlock(null);
                                return invoke;
                            } catch (Throwable th) {
                                th = th;
                                atomicReference = mutatorMutex2.currentMutator;
                                while (!atomicReference.compareAndSet(mutator2, null)) {
                                }
                                throw th;
                            }
                        }
                        mutatorMutex3 = (MutatorMutex) this.$request;
                        Function1 function13 = (Function1) this.$mappedData;
                        mutex4 = (Mutex) this.this$0;
                        MutatorMutex.Mutator mutator6 = (MutatorMutex.Mutator) this.$options;
                        SafeTrace.throwOnFailure(obj);
                        mutator = mutator6;
                        function1 = function13;
                        this.$options = mutator;
                        this.this$0 = mutex4;
                        this.$mappedData = mutatorMutex;
                        this.$request = null;
                        this.label = 2;
                        invoke = function1.invoke(this);
                        if (invoke != coroutineSingletons3) {
                            mutatorMutex2 = mutatorMutex;
                            mutex5 = mutex4;
                            mutator2 = mutator;
                            atomicReference2 = mutatorMutex2.currentMutator;
                            while (!atomicReference2.compareAndSet(mutator2, null)) {
                            }
                            mutex5.unlock(null);
                            return invoke;
                        }
                        return coroutineSingletons3;
                    } catch (Throwable th2) {
                        th = th2;
                        mutatorMutex2 = mutatorMutex;
                        mutator2 = mutator;
                        atomicReference = mutatorMutex2.currentMutator;
                        while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                        }
                        throw th;
                    }
                    mutatorMutex = mutatorMutex3;
                } finally {
                }
            case 4:
                InternalMutatorMutex internalMutatorMutex3 = (InternalMutatorMutex) this.$cacheKey;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                try {
                    try {
                        if (i5 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineScope coroutineScope2 = (CoroutineScope) this.$options;
                            MutatePriority mutatePriority2 = (MutatePriority) this.$eventListener;
                            CoroutineContext.Element element2 = coroutineScope2.getCoroutineContext().get(Job.Key.$$INSTANCE);
                            element2.getClass();
                            InternalMutatorMutex.Mutator mutator7 = new InternalMutatorMutex.Mutator(mutatePriority2, (Job) element2);
                            AtomicReference atomicReference5 = internalMutatorMutex3.currentMutator;
                            while (true) {
                                InternalMutatorMutex.Mutator mutator8 = (InternalMutatorMutex.Mutator) atomicReference5.get();
                                if (mutator8 != null && mutator7.priority.compareTo(mutator8.priority) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference5.compareAndSet(mutator8, mutator7)) {
                                    if (atomicReference5.get() != mutator8) {
                                        break;
                                    }
                                }
                                if (mutator8 != null) {
                                    mutator8.job.cancel(null);
                                }
                                MutexImpl mutexImpl4 = internalMutatorMutex3.mutex;
                                function12 = (Function1) this.$chain;
                                this.$options = mutator7;
                                this.this$0 = mutexImpl4;
                                this.$mappedData = function12;
                                this.$request = internalMutatorMutex3;
                                this.label = 1;
                                if (mutexImpl4.lock(this) != coroutineSingletons4) {
                                    mutator3 = mutator7;
                                    mutex6 = mutexImpl4;
                                }
                            }
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                internalMutatorMutex2 = (InternalMutatorMutex) this.$mappedData;
                                mutex7 = (Mutex) this.this$0;
                                mutator4 = (InternalMutatorMutex.Mutator) this.$options;
                                try {
                                    SafeTrace.throwOnFailure(obj);
                                    invoke2 = obj;
                                    atomicReference4 = internalMutatorMutex2.currentMutator;
                                    while (!atomicReference4.compareAndSet(mutator4, null) && atomicReference4.get() == mutator4) {
                                    }
                                    mutex7.unlock(null);
                                    return invoke2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference3 = internalMutatorMutex2.currentMutator;
                                    while (!atomicReference3.compareAndSet(mutator4, null) && atomicReference3.get() == mutator4) {
                                    }
                                    throw th;
                                }
                            }
                            internalMutatorMutex3 = (InternalMutatorMutex) this.$request;
                            Function1 function14 = (Function1) this.$mappedData;
                            mutex6 = (Mutex) this.this$0;
                            InternalMutatorMutex.Mutator mutator9 = (InternalMutatorMutex.Mutator) this.$options;
                            SafeTrace.throwOnFailure(obj);
                            mutator3 = mutator9;
                            function12 = function14;
                        }
                        this.$options = mutator3;
                        this.this$0 = mutex6;
                        this.$mappedData = internalMutatorMutex;
                        this.$request = null;
                        this.label = 2;
                        invoke2 = function12.invoke(this);
                        if (invoke2 != coroutineSingletons4) {
                            internalMutatorMutex2 = internalMutatorMutex;
                            mutex7 = mutex6;
                            mutator4 = mutator3;
                            atomicReference4 = internalMutatorMutex2.currentMutator;
                            while (!atomicReference4.compareAndSet(mutator4, null)) {
                            }
                            mutex7.unlock(null);
                            return invoke2;
                        }
                        return coroutineSingletons4;
                    } catch (Throwable th4) {
                        th = th4;
                        internalMutatorMutex2 = internalMutatorMutex;
                        mutator4 = mutator3;
                        atomicReference3 = internalMutatorMutex2.currentMutator;
                        while (!atomicReference3.compareAndSet(mutator4, null)) {
                        }
                        throw th;
                    }
                    internalMutatorMutex = internalMutatorMutex3;
                } finally {
                }
                break;
            case 5:
                RealOrderBuilder realOrderBuilder = (RealOrderBuilder) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (realOrderBuilder.createOrderTrigger$delegate.getIntValue() == 0) {
                        return Unit.INSTANCE;
                    }
                    OrderWorkflow orderWorkflow = realOrderBuilder.pendingCreateOrderWorkflow;
                    realOrderBuilder.pendingCreateOrderWorkflow = null;
                    MutableState mutableState = (MutableState) this.$request;
                    State state = (State) this.$mappedData;
                    State state2 = (State) this.$options;
                    State state3 = (State) this.$eventListener;
                    State state4 = (State) this.$cacheKey;
                    MutableState mutableState2 = (MutableState) this.$chain;
                    this.label = 1;
                    if (RealOrderBuilder.models$createOrder(realOrderBuilder, mutableState, state, state2, state3, state4, mutableState2, orderWorkflow, true, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope3, (LocalBrandLocationOpenTabPresenter) this.$request, (CoroutineScope) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.$cacheKey;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) this.this$0;
                    BrandSpot brandSpot = (BrandSpot) this.$request;
                    String str3 = (String) this.$mappedData;
                    BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) this.$options;
                    this.label = 1;
                    syncBrandSpot$default = RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer, brandSpot, str3, brandSpotSyncTokens, null, this, 24);
                    if (syncBrandSpot$default == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    syncBrandSpot$default = obj;
                }
                LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) syncBrandSpot$default;
                if (localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.RedirectToWeb) {
                    RealLocalLauncher realLocalLauncher = (RealLocalLauncher) this.$eventListener;
                    if (realLocalLauncher != null) {
                        realLocalLauncher.openWeb(screenNavigator, ((LocalBrandSyncer$SyncResult.RedirectToWeb) localBrandSyncer$SyncResult).url);
                    }
                    screenNavigator.goTo(Back.INSTANCE);
                } else if (localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure) {
                    ((Function0) this.$chain).invoke();
                } else if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Success) && !Intrinsics.areEqual(localBrandSyncer$SyncResult, LocalBrandSyncer$SyncResult.Cache.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState3 = (MutableState) this.$request;
                MutableState mutableState4 = (MutableState) this.this$0;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                try {
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((Integer) mutableState4.getValue()) == null) {
                            return Unit.INSTANCE;
                        }
                        mutableState3.setValue(Boolean.TRUE);
                        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) this.$mappedData;
                        LazyListState lazyListState = (LazyListState) this.$options;
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$eventListener;
                        LazyGridState lazyGridState = (LazyGridState) this.$cacheKey;
                        LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) this.$chain;
                        Integer num = (Integer) mutableState4.getValue();
                        num.getClass();
                        int intValue = num.intValue();
                        this.label = 1;
                        Object coroutineScope4 = JobKt.coroutineScope(new LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2(intValue, collapsingToolbarScaffoldState, lazyListState, parcelableSnapshotMutableIntState, true, lazyGridState, localBrandLocationMenuViewModel, null), this);
                        if (coroutineScope4 != obj5) {
                            obj2 = Unit.INSTANCE;
                        }
                        if (obj2 == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState3.setValue(Boolean.FALSE);
                    mutableState4.setValue(null);
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    mutableState3.setValue(Boolean.FALSE);
                    mutableState4.setValue(null);
                    throw th5;
                }
            case 9:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                EngineInterceptor engineInterceptor2 = (EngineInterceptor) this.this$0;
                SourceFetchResult sourceFetchResult = (SourceFetchResult) ((Ref$ObjectRef) this.$options).element;
                ComponentRegistry componentRegistry = (ComponentRegistry) ((Ref$ObjectRef) this.$cacheKey).element;
                ImageRequest imageRequest4 = (ImageRequest) this.$request;
                Object obj6 = this.$mappedData;
                Options options2 = (Options) ((Ref$ObjectRef) this.$chain).element;
                EventListener eventListener2 = (EventListener) this.$eventListener;
                this.label = 1;
                Object access$decode = EngineInterceptor.access$decode(engineInterceptor2, sourceFetchResult, componentRegistry, imageRequest4, obj6, options2, eventListener2, this);
                return access$decode == coroutineSingletons8 ? coroutineSingletons8 : access$decode;
            case 10:
                MapView mapView = (MapView) this.$mappedData;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = mapView;
                    this.label = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 = new GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1(safeContinuation);
                    mapView.getClass();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        a$$ExternalSyntheticBUOutline0.m$1("getMapAsync() must be called on the main thread");
                        return null;
                    }
                    zzai zzaiVar = mapView.zza;
                    zzah zzahVar = (zzah) zzaiVar.zaa;
                    if (zzahVar != null) {
                        zzahVar.getMapAsync(googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1);
                    } else {
                        ((ArrayList) zzaiVar.zze).add(googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1);
                    }
                    orThrow = safeContinuation.getOrThrow();
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        compositionImpl = (CompositionImpl) this.$request;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th6) {
                            th = th6;
                            compositionImpl.dispose();
                            throw th;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    orThrow = obj;
                }
                CompositionImpl compositionImpl2 = new CompositionImpl((CompositionContext) this.$eventListener, new MapApplier((GoogleMap) orThrow, mapView, (MapClickListeners) this.$options));
                try {
                    compositionImpl2.setContent(new ComposableLambdaImpl(new MenuPickerSheetKt$$ExternalSyntheticLambda4(4, (MapUpdaterState) this.$cacheKey, (Function2) this.$chain), true, 704030801));
                    this.this$0 = null;
                    this.$request = compositionImpl2;
                    this.label = 2;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons9;
                } catch (Throwable th7) {
                    th = th7;
                    compositionImpl = compositionImpl2;
                    compositionImpl.dispose();
                    throw th;
                }
            case 11:
                final CoroutineScope coroutineScope5 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    final ReceiptPresenter receiptPresenter = (ReceiptPresenter) this.$request;
                    final State state5 = (State) this.$options;
                    final ActivityItemEventHandler activityItemEventHandler = (ActivityItemEventHandler) this.$eventListener;
                    final MutableState mutableState5 = (MutableState) this.$cacheKey;
                    final MutableState mutableState6 = (MutableState) this.$chain;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.activity.presenters.receipts.ReceiptPresenter$models$$inlined$CollectEffect$3$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj7, Continuation continuation) {
                            Placement placement;
                            Object obj8;
                            boolean route;
                            ReceiptPresenter receiptPresenter2 = receiptPresenter;
                            RealRouter realRouter = receiptPresenter2.router;
                            BetterNavigator.ScreenNavigator screenNavigator2 = receiptPresenter2.navigator;
                            HistoryScreens.PaymentReceipt paymentReceipt = receiptPresenter2.args;
                            ActivityAnalyticsService activityAnalyticsService = receiptPresenter2.activityAnalyticsService;
                            ReceiptViewEvent receiptViewEvent = (ReceiptViewEvent) obj7;
                            boolean areEqual = Intrinsics.areEqual(receiptViewEvent, ReceiptViewEvent.Close.INSTANCE);
                            State state6 = state5;
                            if (areEqual) {
                                ReceiptPresenter.IntermediateState intermediateState = (ReceiptPresenter.IntermediateState) state6.getValue();
                                if (intermediateState instanceof ReceiptPresenter.IntermediateState.Loaded) {
                                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = ((ReceiptPresenter.IntermediateState.Loaded) intermediateState).activityItem;
                                    formattedPaymentHistoryActivityItem.getClass();
                                    Analytics analytics = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                                    String str4 = formattedPaymentHistoryActivityItem.getUiPayment().token;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    analytics.track(new ActivityRecordViewClose(str4, Boolean.valueOf(formattedPaymentHistoryActivityItem.isBadged()), Boolean.valueOf(formattedPaymentHistoryActivityItem.getSection() == ActivityRowSection.PENDING)), null);
                                } else {
                                    ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService.track(new ActivityRecordViewClose(ActivityItemKt.getItemId(paymentReceipt.activityItemKey.activityItemGlobalId), null, null), null);
                                }
                                String str5 = paymentReceipt.encodedExitUrl;
                                Back back = Back.INSTANCE;
                                if (str5 == null) {
                                    screenNavigator2.goTo(back);
                                } else {
                                    route = realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), Build.VERSION.SDK_INT >= 33 ? URLDecoder.decode(str5, StandardCharsets.UTF_8) : URLDecoder.decode(str5));
                                    if (!route) {
                                        screenNavigator2.goTo(back);
                                    }
                                }
                            } else {
                                boolean areEqual2 = Intrinsics.areEqual(receiptViewEvent, ReceiptViewEvent.Refresh.INSTANCE);
                                CoroutineScope coroutineScope6 = coroutineScope5;
                                if (areEqual2) {
                                    JobKt.launch$default(coroutineScope6, null, null, new ReceiptPresenter$models$3$1(receiptPresenter2, null, 1), 3);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.ButtonClicked) {
                                    JobKt.launch$default(coroutineScope6, null, null, new ReceiptPresenter$models$4$3(receiptPresenter2, activityItemEventHandler, receiptViewEvent, state5, (Continuation) null), 3);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.UpsellClicked) {
                                    JobKt.launch$default(coroutineScope6, null, null, new ReceiptPresenter$models$4$4(state5, activityItemEventHandler, receiptViewEvent, receiptPresenter2, null), 3);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.UpsellViewed) {
                                    FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = ((ReceiptViewEvent.UpsellViewed) receiptViewEvent).upsell.on_demand_message_data;
                                    if (onDemandMessageData != null) {
                                        Analytics analytics2 = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                                        String str6 = onDemandMessageData.campaign_token;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        String str7 = onDemandMessageData.template_token;
                                        Integer num2 = onDemandMessageData.template_version;
                                        String str8 = onDemandMessageData.placement;
                                        if (str8 != null) {
                                            Iterator it = Placement.$ENTRIES.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    obj8 = null;
                                                    break;
                                                }
                                                obj8 = it.next();
                                                if (Intrinsics.areEqual(((Placement) obj8).name(), str8)) {
                                                    break;
                                                }
                                            }
                                            placement = (Placement) obj8;
                                        } else {
                                            placement = null;
                                        }
                                        analytics2.track(new OnDemandMessageInteractView(str6, Long.valueOf(currentTimeMillis), placement, str7, num2, AppMessageFormat.CARD, CollectionsKt.joinToString$default(onDemandMessageData.product_types, null, null, null, 0, null, null, 63)), null);
                                    }
                                } else if (Intrinsics.areEqual(receiptViewEvent, ReceiptViewEvent.AvatarClicked.INSTANCE)) {
                                    JobKt.launch$default(coroutineScope6, null, null, new EditProfilePresenter$models$2$1(state6, activityItemEventHandler, receiptPresenter2, (Continuation) null, 20), 3);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.OpenMap) {
                                    receiptPresenter2.launcher.launchMap(((ReceiptViewEvent.OpenMap) receiptViewEvent).address, 0.0d, 0.0d);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.OpenUrl) {
                                    realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((ReceiptViewEvent.OpenUrl) receiptViewEvent).url);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.OpenTimelineDetailsOverlay) {
                                    mutableState5.setValue(((ReceiptViewEvent.OpenTimelineDetailsOverlay) receiptViewEvent).details);
                                } else if (receiptViewEvent instanceof ReceiptViewEvent.ReactionSelectorDismissed) {
                                    mutableState6.setValue(ReactionsState.Hidden.INSTANCE);
                                } else {
                                    if (!(receiptViewEvent instanceof ReceiptViewEvent.ReactionSelected)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    JobKt.launch$default(coroutineScope6, null, null, new ReceiptPresenter$models$4$3(state5, activityItemEventHandler, receiptViewEvent, receiptPresenter2, (Continuation) null), 3);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow2.collect(flowCollector, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PaymentHistoryInputsRow paymentHistoryInputsRow = (PaymentHistoryInputsRow) this.$options;
                        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) this.$eventListener;
                        AnalyticsEvent analyticsEvent3 = (AnalyticsEvent) this.$cacheKey;
                        analyticsEvent = (AnalyticsEvent) this.$chain;
                        Result.Companion companion = Result.Companion;
                        paymentHistoryInputsRow.entity_id.getClass();
                        UiPayment uiPayment = paymentHistoryInputsRow.payment;
                        String str4 = uiPayment != null ? uiPayment.render_data : null;
                        UiCustomer uiCustomer = paymentHistoryInputsRow.sender;
                        String str5 = uiCustomer != null ? uiCustomer.render_data : null;
                        UiCustomer uiCustomer2 = paymentHistoryInputsRow.recipient;
                        String str6 = uiCustomer2 != null ? uiCustomer2.render_data : null;
                        this.$mappedData = null;
                        this.this$0 = analyticsEvent3;
                        this.$request = analyticsEvent;
                        this.label = 1;
                        paymentHistoryData = ziplineHistoryDataJavaScripter.paymentHistoryData(str4, str5, str6, null, this);
                        if (paymentHistoryData == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                        analyticsEvent2 = analyticsEvent3;
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AnalyticsEvent analyticsEvent4 = (AnalyticsEvent) this.$request;
                        analyticsEvent2 = (AnalyticsEvent) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        analyticsEvent = analyticsEvent4;
                        paymentHistoryData = obj;
                    }
                    failure = new RealAfterpayEligibleRetroTransactionsProvider.RetroActivityData((PaymentHistoryData) paymentHistoryData, analyticsEvent2, analyticsEvent);
                    Result.Companion companion2 = Result.Companion;
                } catch (Throwable th8) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th8);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null && (m4120exceptionOrNullimpl instanceof CancellationException)) {
                    throw m4120exceptionOrNullimpl;
                }
                if (failure instanceof Result.Failure) {
                    return null;
                }
                return failure;
            case 13:
                LocationPermissionLevel locationPermissionLevel = (LocationPermissionLevel) this.this$0;
                BeaconDetectionSetupTeardown beaconDetectionSetupTeardown = (BeaconDetectionSetupTeardown) this.$request;
                BufferedChannel bufferedChannel = (BufferedChannel) this.$eventListener;
                MetadataRepo metadataRepo = (MetadataRepo) this.$options;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1 || i14 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope6, null, null, new NetworkFetcher$doFetch$fetchResult$1(beaconDetectionSetupTeardown, bufferedChannel, (RealStrongMemoryCache) this.$cacheKey, (BeaconRegionTracker) this.$chain, locationPermissionLevel, (Continuation) null, 21), 3);
                if (locationPermissionLevel == LocationPermissionLevel.ALWAYS) {
                    this.$mappedData = null;
                    this.label = 1;
                    BeaconDetectionSetupTeardown.access$startBackgroundAwareScanning(beaconDetectionSetupTeardown, metadataRepo, bufferedChannel, this);
                } else {
                    this.$mappedData = null;
                    this.label = 2;
                    BeaconDetectionSetupTeardown.access$startForegroundOnlyScanning(beaconDetectionSetupTeardown, metadataRepo, bufferedChannel, this);
                }
                return coroutineSingletons12;
            case 14:
                return invokeSuspend$com$squareup$cash$biometrics$AndroidSecureStore$write$2(obj);
            case 15:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$12 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (StuckPlayerDetector) this.$request, (BetterNavigator.ScreenNavigator) this.$options, (State) this.$eventListener, (State) this.$cacheKey, (MutableState) this.$chain, 4);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow3.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope8, (Ref$ObjectRef) this.$request, (LocalPosCheckInPresenter) this.$options, (MoneyFormatter) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass1, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$13 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope9, (BitcoinDepositNoteScreenView) this.$request, (DelegatingSoftwareKeyboardController) this.$options, (FocusOwnerImpl) this.$eventListener, (Function1) this.$cacheKey, (MutableState) this.$chain, 5);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow5.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                return invokeSuspend$com$squareup$cash$blockers$presenters$BlockerImageUploader$uploadFile$1(obj);
            case 19:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass12 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope10, (InputCardInfoPresenter) this.$request, (Ref$BooleanRef) this.$options, (MutableState) this.$eventListener, (ParcelableSnapshotMutableIntState) this.$cacheKey, (MutableState) this.$chain, 3);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass12, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
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
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    PasscodePresenter passcodePresenter = (PasscodePresenter) this.$request;
                    Signal signal = passcodePresenter.signOutSignal;
                    PasscodePresenter$models$2$1 passcodePresenter$models$2$1 = new PasscodePresenter$models$2$1(passcodePresenter, generateToken, (ParcelableSnapshotMutableIntState) this.$options, (State) this.$eventListener, (MutableState) this.$cacheKey, (MutableState) this.$chain, null);
                    this.$mappedData = null;
                    this.label = 1;
                    if (StateFlowKt.until(signal, passcodePresenter$models$2$1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                return invokeSuspend$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$4$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$borrow$presenters$CreditFirstTimeBorrowBlockerPresenter$models$$inlined$CollectEffect$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$borrow$presenters$util$RealLoanPaymentFlowStarter$initiateLoanPayment$2(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$bugreporting$presenters$BugReportingPresenter$models$3$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$card$onboarding$CardModelView$cardInkMetal$2$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter$models$$inlined$CollectEffect$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$directdeposit$presenters$DirectDepositUpdateManualFormDetailsPresenter$models$1$1(obj);
            default:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$mappedData;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass13 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope11, (TransfersPresenter) this.$request, (MutableState) this.$options, (MutableState) this.$eventListener, (MutableState) this.$cacheKey, (ParcelableSnapshotMutableIntState) this.$chain, 6);
                    this.$mappedData = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass13, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineInterceptor$intercept$2(Parcelable parcelable, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$options = parcelable;
        this.$eventListener = obj;
        this.$cacheKey = obj2;
        this.$chain = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(StillCaptureRequestControl stillCaptureRequestControl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$chain = stillCaptureRequestControl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineInterceptor$intercept$2(int i, MutableState mutableState, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
        this.$options = obj3;
        this.$eventListener = obj4;
        this.$cacheKey = obj5;
        this.$chain = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(e0 e0Var, BlockersScreens blockersScreens, Lazy lazy, FileCategory fileCategory, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.$request = e0Var;
        this.$options = blockersScreens;
        this.$eventListener = lazy;
        this.$cacheKey = fileCategory;
        this.$chain = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(LocationPermissionLevel locationPermissionLevel, BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, MetadataRepo metadataRepo, BufferedChannel bufferedChannel, RealStrongMemoryCache realStrongMemoryCache, BeaconRegionTracker beaconRegionTracker, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.this$0 = locationPermissionLevel;
        this.$request = beaconDetectionSetupTeardown;
        this.$options = metadataRepo;
        this.$eventListener = bufferedChannel;
        this.$cacheKey = realStrongMemoryCache;
        this.$chain = beaconRegionTracker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(RepayCustomAmountPickerPresenter$models$1$1$1 repayCustomAmountPickerPresenter$models$1$1$1, MetadataRepo metadataRepo, String str, Money money, BetterNavigator.ScreenNavigator screenNavigator, BorrowHome borrowHome, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 23;
        this.$request = repayCustomAmountPickerPresenter$models$1$1$1;
        this.$mappedData = metadataRepo;
        this.$options = str;
        this.$eventListener = money;
        this.$cacheKey = screenNavigator;
        this.$chain = borrowHome;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineInterceptor$intercept$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
        this.$mappedData = obj3;
        this.$options = obj4;
        this.$eventListener = obj5;
        this.$cacheKey = obj6;
        this.$chain = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineInterceptor$intercept$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$mappedData = obj;
        this.$options = obj2;
        this.$eventListener = obj3;
        this.$cacheKey = obj4;
        this.$chain = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineInterceptor$intercept$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$eventListener = obj;
        this.$cacheKey = obj2;
        this.$chain = obj3;
    }
}
