package androidx.emoji2.text;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1;
import androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.core.AutoValue_SurfaceOutput_CameraInputInfo;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda4;
import androidx.camera.core.processing.util.AutoValue_OutConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda17;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.google.pay.payments.LoadPaymentResult;
import app.cash.local.google.pay.payments.RealLocalGooglePayPaymentsClient$isReadyToPay$1;
import app.cash.local.google.pay.payments.RealLocalGooglePayPaymentsClient$loadPaymentData$1;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.ZiplineService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.target.Target;
import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.DataUploadRunnable;
import com.datadog.android.core.internal.data.upload.UploadScheduler;
import com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl$reportTTID$1;
import com.datadog.android.trace.internal.DatadogTracerAdapter;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.filament.Box;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzj;
import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zztp;
import com.google.android.gms.internal.measurement.zzuc;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzap;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.TransactionInfo;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1;
import com.google.android.play.core.splitcompat.zzk;
import com.google.android.play.core.splitcompat.zzn;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.crypto.tink.aead.AesCtrHmacAeadKey;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.util.Bytes;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.DirectDecrypter;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cash.beacondetection.real.BeaconScanner$startScanning$callback$1;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2$CustomizationMode$Pattern$STAMP;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$showDripSetting$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.treehouse.accessibility.AccessibilityCallbackService;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.OffersRepositoryService;
import com.squareup.cash.treehouse.activity.RawOfflineActivityService;
import com.squareup.cash.treehouse.activity.TimeZoneService;
import com.squareup.cash.treehouse.analytics.RawAnalyticsService;
import com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory;
import com.squareup.cash.treehouse.android.platform.RealErrorReporterService;
import com.squareup.cash.treehouse.android.platform.RealRawLoggerService;
import com.squareup.cash.treehouse.appconfig.RawAppConfigService;
import com.squareup.cash.treehouse.appmessaging.RawAppMessagingService;
import com.squareup.cash.treehouse.badging.RawBadgingService;
import com.squareup.cash.treehouse.biometrics.BiometricsService;
import com.squareup.cash.treehouse.buildconfig.RawBuildConfigService;
import com.squareup.cash.treehouse.clipboard.RawClipboardService;
import com.squareup.cash.treehouse.datadog.DatadogService;
import com.squareup.cash.treehouse.errorreporter.ErrorReporterService;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge;
import com.squareup.cash.treehouse.flags.RawFlagsService;
import com.squareup.cash.treehouse.logger.RawLoggerService;
import com.squareup.cash.treehouse.network.HttpClient;
import com.squareup.cash.treehouse.network.HttpClient$Companion$Adapter;
import com.squareup.cash.treehouse.network.HttpHeaders;
import com.squareup.cash.treehouse.network.RealHttpClient;
import com.squareup.cash.treehouse.network.prefetch.PrefetchClient;
import com.squareup.cash.treehouse.network.prefetch.RealPrefetchClient;
import com.squareup.cash.treehouse.platform.CashContextService;
import com.squareup.cash.treehouse.platform.PlatformLauncher$bindServices$1;
import com.squareup.cash.treehouse.platform.PlatformLauncher$launch$1;
import com.squareup.cash.treehouse.platform.PlatformLauncher$wrap$1;
import com.squareup.cash.treehouse.platform.RawTreehousePlatform;
import com.squareup.cash.treehouse.platform.RequestHeadersInjectingHttpClient;
import com.squareup.cash.treehouse.preferences.RawPreferencesService;
import com.squareup.cash.treehouse.sqldelight.SqlDelightBridge;
import com.squareup.cash.treehouse.sync.RawSyncValueService;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.librarian.api.LibrarianService;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.ActivityResult;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import com.withpersona.sdk2.inquiry.steps.ui.ScreenRenderer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.zip.ZipFile;
import javax.crypto.SecretKey;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.CalendarConverter;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;
import sqip.GooglePay;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class MetadataRepo implements UseTorchAsFlash, UploadScheduler, AsyncCallable, zzk, SignatureStateListener, Overlay, Target, ScreenRenderer {
    public Object mEmojiCharArray;
    public Object mMetadataList;
    public Object mRootNode;
    public Object mTypeface;

    public final class Node {
        public final SparseArray mChildren;
        public TypefaceEmojiRasterizer mData;

        public Node(int i) {
            this.mChildren = new SparseArray(i);
        }

        public final void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            int codepointAt = typefaceEmojiRasterizer.getCodepointAt(i);
            SparseArray sparseArray = this.mChildren;
            Node node = sparseArray == null ? null : (Node) sparseArray.get(codepointAt);
            if (node == null) {
                node = new Node(1);
                sparseArray.put(typefaceEmojiRasterizer.getCodepointAt(i), node);
            }
            if (i2 > i) {
                node.put(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mRootNode = new Node(1024);
        int __offset = metadataList.__offset(6);
        if (__offset != 0) {
            int i5 = __offset + metadataList.bb_pos;
            i = metadataList.bb.getInt(metadataList.bb.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.mEmojiCharArray = new char[i * 2];
        int __offset2 = metadataList.__offset(6);
        if (__offset2 != 0) {
            int i6 = __offset2 + metadataList.bb_pos;
            i2 = metadataList.bb.getInt(metadataList.bb.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i7);
            MetadataItem metadataItem = typefaceEmojiRasterizer.getMetadataItem();
            int __offset3 = metadataItem.__offset(4);
            Character.toChars(__offset3 != 0 ? metadataItem.bb.getInt(__offset3 + metadataItem.bb_pos) : 0, (char[]) this.mEmojiCharArray, i7 * 2);
            MetadataItem metadataItem2 = typefaceEmojiRasterizer.getMetadataItem();
            int __offset4 = metadataItem2.__offset(16);
            if (__offset4 != 0) {
                int i8 = __offset4 + metadataItem2.bb_pos;
                i3 = metadataItem2.bb.getInt(metadataItem2.bb.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            TransactorKt.checkArgument("invalid metadata codepoint length", i3 > 0);
            Node node = (Node) this.mRootNode;
            MetadataItem metadataItem3 = typefaceEmojiRasterizer.getMetadataItem();
            int __offset5 = metadataItem3.__offset(16);
            if (__offset5 != 0) {
                int i9 = __offset5 + metadataItem3.bb_pos;
                i4 = metadataItem3.bb.getInt(metadataItem3.bb.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            node.put(typefaceEmojiRasterizer, 0, i4 - 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea A[LOOP:0: B:11:0x00e4->B:13:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$launch(MetadataRepo metadataRepo, ContextScope contextScope, ZiplineManifest ziplineManifest, ContinuationImpl continuationImpl) {
        PlatformLauncher$launch$1 platformLauncher$launch$1;
        int i;
        ContextScope contextScope2;
        String str;
        RealPrefetchClient realPrefetchClient;
        Object obj;
        String str2 = ((RealTreehouseApp) metadataRepo.mMetadataList).name;
        if (continuationImpl instanceof PlatformLauncher$launch$1) {
            platformLauncher$launch$1 = (PlatformLauncher$launch$1) continuationImpl;
            int i2 = platformLauncher$launch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                platformLauncher$launch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = platformLauncher$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformLauncher$launch$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    String str3 = ziplineManifest.version;
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    String str4 = (String) ziplineManifest.metadata.get("committed_at");
                    final RealPrefetchClient realPrefetchClient2 = new RealPrefetchClient();
                    realPrefetchClient2.httpResponses = new LinkedHashMap();
                    final AndroidPlatformServiceFactory androidPlatformServiceFactory = (AndroidPlatformServiceFactory) metadataRepo.mEmojiCharArray;
                    platformLauncher$launch$1.L$0 = contextScope;
                    platformLauncher$launch$1.L$1 = ziplineManifest;
                    platformLauncher$launch$1.L$2 = str3;
                    platformLauncher$launch$1.L$4 = realPrefetchClient2;
                    platformLauncher$launch$1.label = 1;
                    RealRawLoggerService.Factory factory = androidPlatformServiceFactory.rawLoggerServiceFactory;
                    str2.getClass();
                    final RealRawLoggerService realRawLoggerService = new RealRawLoggerService(str2);
                    RealErrorReporterService.Factory factory2 = androidPlatformServiceFactory.errorReporterServiceFactory;
                    str2.getClass();
                    final RealErrorReporterService realErrorReporterService = new RealErrorReporterService(factory2.errorReporter, str2, str3, str4);
                    RawTreehousePlatform rawTreehousePlatform = new RawTreehousePlatform(realPrefetchClient2, realRawLoggerService, realErrorReporterService) { // from class: com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory$create$2
                        public final /* synthetic */ RealErrorReporterService $errorReporterService;
                        public final /* synthetic */ RealRawLoggerService $loggerService;
                        public final /* synthetic */ RealPrefetchClient $prefetchClient;
                        public final Lazy biometricsService$delegate;

                        {
                            this.$prefetchClient = realPrefetchClient2;
                            this.$loggerService = realRawLoggerService;
                            this.$errorReporterService = realErrorReporterService;
                            this.biometricsService$delegate = LazyKt.lazy(new Function0() { // from class: com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory$create$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return (BiometricsService) AndroidPlatformServiceFactory.this.biometricsServiceProvider.invoke();
                                }
                            });
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final AccessibilityCallbackService accessibilityCallbackService() {
                            return AndroidPlatformServiceFactory.this.accessibilityCallbackService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final ActivityPaymentManager activityPaymentManager() {
                            return AndroidPlatformServiceFactory.this.activityPaymentManager;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final ActivityPaymentManager2 activityPaymentManager2() {
                            return AndroidPlatformServiceFactory.this.activityPaymentManager2;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final BiometricsService biometricsService() {
                            return (BiometricsService) this.biometricsService$delegate.getValue();
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final HttpClient cashHttpClient() {
                            return (RealHttpClient) AndroidPlatformServiceFactory.this.cashHttpClient$delegate.getValue();
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final CashContextService contextService() {
                            return AndroidPlatformServiceFactory.this.contextService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final DatadogService datadogService() {
                            return AndroidPlatformServiceFactory.this.datadogService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final ErrorReporterService errorReporterService() {
                            return this.$errorReporterService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final FinancialServicesBridge financialServicesBridge() {
                            return AndroidPlatformServiceFactory.this.financialServicesBridge;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final HttpClient httpClient() {
                            return (RealHttpClient) AndroidPlatformServiceFactory.this.httpClient$delegate.getValue();
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final OffersRepositoryService offersRepositoryService() {
                            return AndroidPlatformServiceFactory.this.offersRepositoryService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final PrefetchClient prefetchClient() {
                            return this.$prefetchClient;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawAnalyticsService rawAnalyticsService() {
                            return AndroidPlatformServiceFactory.this.rawAnalyticsService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawAppConfigService rawAppConfigService() {
                            return AndroidPlatformServiceFactory.this.rawAppConfigService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawAppMessagingService rawAppMessagingService() {
                            return AndroidPlatformServiceFactory.this.appMessagingService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawBadgingService rawBadgingService() {
                            return AndroidPlatformServiceFactory.this.rawBadgingService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawBuildConfigService rawBuildConfigService() {
                            return AndroidPlatformServiceFactory.this.rawBuildConfigService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawClipboardService rawClipboardService() {
                            return AndroidPlatformServiceFactory.this.rawClipboardService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawFlagsService rawFlagsService() {
                            return AndroidPlatformServiceFactory.this.rawFlagsService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawLoggerService rawLoggerService() {
                            return this.$loggerService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawOfflineActivityService rawOfflineActivityService() {
                            return AndroidPlatformServiceFactory.this.rawOfflineActivityService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawPreferencesService rawPreferencesService() {
                            return AndroidPlatformServiceFactory.this.rawPreferencesService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final RawSyncValueService rawSyncValueService() {
                            return AndroidPlatformServiceFactory.this.rawSyncValueService;
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final SqlDelightBridge sqlDelightBridge(String str5, String str6) {
                            AndroidPlatformServiceFactory androidPlatformServiceFactory2 = AndroidPlatformServiceFactory.this;
                            return androidPlatformServiceFactory2.sqlDelightBridgeHolder.createSqlDelightBridge(str6, str5, androidPlatformServiceFactory2.ioDispatcher);
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final SqlDelightBridge sqldelightBridge(String str5) {
                            AndroidPlatformServiceFactory androidPlatformServiceFactory2 = AndroidPlatformServiceFactory.this;
                            return androidPlatformServiceFactory2.sqlDelightBridgeHolder.createSqlDelightBridge(str5, null, androidPlatformServiceFactory2.ioDispatcher);
                        }

                        @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                        public final TimeZoneService timeZoneService() {
                            return AndroidPlatformServiceFactory.this.timeZoneService;
                        }
                    };
                    if (rawTreehousePlatform == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    contextScope2 = contextScope;
                    str = str3;
                    obj2 = rawTreehousePlatform;
                    realPrefetchClient = realPrefetchClient2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realPrefetchClient = platformLauncher$launch$1.L$4;
                    str = platformLauncher$launch$1.L$2;
                    ziplineManifest = platformLauncher$launch$1.L$1;
                    contextScope2 = platformLauncher$launch$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                final RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ((ZiplineService) obj2);
                rawTreehousePlatform2.getClass();
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("prefetch.", rawTreehousePlatform2.httpClient()), new Pair("prefetch-cash.", rawTreehousePlatform2.cashHttpClient()));
                HttpHeaders httpHeaders = new HttpHeaders(ArraysKt___ArraysKt.toList(new Pair[]{new Pair("Treehouse-App", Recorder$$ExternalSyntheticOutline2.m(str2, " ", str))}));
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf.size()));
                for (Map.Entry entry : mapOf.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new RequestHeadersInjectingHttpClient((HttpClient) entry.getValue(), httpHeaders));
                }
                Map map = ziplineManifest.metadata;
                realPrefetchClient.getClass();
                contextScope2.getClass();
                map.getClass();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str5 = (String) entry2.getKey();
                    String str6 = (String) entry2.getValue();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (StringsKt__StringsJVMKt.startsWith(str5, (String) ((Map.Entry) obj).getKey(), false)) {
                            break;
                        }
                    }
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (entry3 != null) {
                        realPrefetchClient.httpResponses.put(StringsKt.removePrefix((String) entry3.getKey(), str5), JobKt.async$default(contextScope2, JobKt.SupervisorJob$default(), null, new TaxWebAppBridge.AnonymousClass3((HttpClient) entry3.getValue(), str6, continuation, 21), 2));
                    }
                }
                Object obj3 = linkedHashMap.get("prefetch.");
                obj3.getClass();
                final HttpClient httpClient = (HttpClient) obj3;
                Object obj4 = linkedHashMap.get("prefetch-cash.");
                obj4.getClass();
                final HttpClient httpClient2 = (HttpClient) obj4;
                return new RawTreehousePlatform() { // from class: com.squareup.cash.treehouse.platform.TreehousePlatformLauncher$wrap$1
                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final AccessibilityCallbackService accessibilityCallbackService() {
                        return rawTreehousePlatform2.accessibilityCallbackService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final ActivityPaymentManager activityPaymentManager() {
                        return rawTreehousePlatform2.activityPaymentManager();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final ActivityPaymentManager2 activityPaymentManager2() {
                        return rawTreehousePlatform2.activityPaymentManager2();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final BiometricsService biometricsService() {
                        return rawTreehousePlatform2.biometricsService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final HttpClient cashHttpClient() {
                        return httpClient2;
                    }

                    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
                    public final void close() {
                        rawTreehousePlatform2.close();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final CashContextService contextService() {
                        return rawTreehousePlatform2.contextService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final DatadogService datadogService() {
                        return rawTreehousePlatform2.datadogService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final ErrorReporterService errorReporterService() {
                        return rawTreehousePlatform2.errorReporterService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final FinancialServicesBridge financialServicesBridge() {
                        return rawTreehousePlatform2.financialServicesBridge();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final HttpClient httpClient() {
                        return httpClient;
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final OffersRepositoryService offersRepositoryService() {
                        return rawTreehousePlatform2.offersRepositoryService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final PrefetchClient prefetchClient() {
                        return rawTreehousePlatform2.prefetchClient();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawAnalyticsService rawAnalyticsService() {
                        return rawTreehousePlatform2.rawAnalyticsService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawAppConfigService rawAppConfigService() {
                        return rawTreehousePlatform2.rawAppConfigService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawAppMessagingService rawAppMessagingService() {
                        return rawTreehousePlatform2.rawAppMessagingService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawBadgingService rawBadgingService() {
                        return rawTreehousePlatform2.rawBadgingService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawBuildConfigService rawBuildConfigService() {
                        return rawTreehousePlatform2.rawBuildConfigService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawClipboardService rawClipboardService() {
                        return rawTreehousePlatform2.rawClipboardService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawFlagsService rawFlagsService() {
                        return rawTreehousePlatform2.rawFlagsService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawLoggerService rawLoggerService() {
                        return rawTreehousePlatform2.rawLoggerService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawOfflineActivityService rawOfflineActivityService() {
                        return rawTreehousePlatform2.rawOfflineActivityService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawPreferencesService rawPreferencesService() {
                        return rawTreehousePlatform2.rawPreferencesService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final RawSyncValueService rawSyncValueService() {
                        return rawTreehousePlatform2.rawSyncValueService();
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final SqlDelightBridge sqlDelightBridge(String str7, String str8) {
                        return rawTreehousePlatform2.sqlDelightBridge(str7, str8);
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final SqlDelightBridge sqldelightBridge(String str7) {
                        return rawTreehousePlatform2.sqldelightBridge(str7);
                    }

                    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
                    public final TimeZoneService timeZoneService() {
                        return rawTreehousePlatform2.timeZoneService();
                    }
                };
            }
        }
        platformLauncher$launch$1 = new PlatformLauncher$launch$1(metadataRepo, continuationImpl);
        Object obj22 = platformLauncher$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformLauncher$launch$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        final RawTreehousePlatform rawTreehousePlatform22 = (RawTreehousePlatform) ((ZiplineService) obj22);
        rawTreehousePlatform22.getClass();
        Map mapOf2 = MapsKt__MapsKt.mapOf(new Pair("prefetch.", rawTreehousePlatform22.httpClient()), new Pair("prefetch-cash.", rawTreehousePlatform22.cashHttpClient()));
        HttpHeaders httpHeaders2 = new HttpHeaders(ArraysKt___ArraysKt.toList(new Pair[]{new Pair("Treehouse-App", Recorder$$ExternalSyntheticOutline2.m(str2, " ", str))}));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf2.size()));
        while (r0.hasNext()) {
        }
        Map map2 = ziplineManifest.metadata;
        realPrefetchClient.getClass();
        contextScope2.getClass();
        map2.getClass();
        while (r13.hasNext()) {
        }
        Object obj32 = linkedHashMap2.get("prefetch.");
        obj32.getClass();
        final HttpClient httpClient3 = (HttpClient) obj32;
        Object obj42 = linkedHashMap2.get("prefetch-cash.");
        obj42.getClass();
        final HttpClient httpClient22 = (HttpClient) obj42;
        return new RawTreehousePlatform() { // from class: com.squareup.cash.treehouse.platform.TreehousePlatformLauncher$wrap$1
            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final AccessibilityCallbackService accessibilityCallbackService() {
                return rawTreehousePlatform22.accessibilityCallbackService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final ActivityPaymentManager activityPaymentManager() {
                return rawTreehousePlatform22.activityPaymentManager();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final ActivityPaymentManager2 activityPaymentManager2() {
                return rawTreehousePlatform22.activityPaymentManager2();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final BiometricsService biometricsService() {
                return rawTreehousePlatform22.biometricsService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final HttpClient cashHttpClient() {
                return httpClient22;
            }

            @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
            public final void close() {
                rawTreehousePlatform22.close();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final CashContextService contextService() {
                return rawTreehousePlatform22.contextService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final DatadogService datadogService() {
                return rawTreehousePlatform22.datadogService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final ErrorReporterService errorReporterService() {
                return rawTreehousePlatform22.errorReporterService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final FinancialServicesBridge financialServicesBridge() {
                return rawTreehousePlatform22.financialServicesBridge();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final HttpClient httpClient() {
                return httpClient3;
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final OffersRepositoryService offersRepositoryService() {
                return rawTreehousePlatform22.offersRepositoryService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final PrefetchClient prefetchClient() {
                return rawTreehousePlatform22.prefetchClient();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawAnalyticsService rawAnalyticsService() {
                return rawTreehousePlatform22.rawAnalyticsService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawAppConfigService rawAppConfigService() {
                return rawTreehousePlatform22.rawAppConfigService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawAppMessagingService rawAppMessagingService() {
                return rawTreehousePlatform22.rawAppMessagingService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawBadgingService rawBadgingService() {
                return rawTreehousePlatform22.rawBadgingService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawBuildConfigService rawBuildConfigService() {
                return rawTreehousePlatform22.rawBuildConfigService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawClipboardService rawClipboardService() {
                return rawTreehousePlatform22.rawClipboardService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawFlagsService rawFlagsService() {
                return rawTreehousePlatform22.rawFlagsService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawLoggerService rawLoggerService() {
                return rawTreehousePlatform22.rawLoggerService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawOfflineActivityService rawOfflineActivityService() {
                return rawTreehousePlatform22.rawOfflineActivityService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawPreferencesService rawPreferencesService() {
                return rawTreehousePlatform22.rawPreferencesService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final RawSyncValueService rawSyncValueService() {
                return rawTreehousePlatform22.rawSyncValueService();
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final SqlDelightBridge sqlDelightBridge(String str7, String str8) {
                return rawTreehousePlatform22.sqlDelightBridge(str7, str8);
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final SqlDelightBridge sqldelightBridge(String str7) {
                return rawTreehousePlatform22.sqldelightBridge(str7);
            }

            @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
            public final TimeZoneService timeZoneService() {
                return rawTreehousePlatform22.timeZoneService();
            }
        };
    }

    public static ErrorData createErrorData(ChallengeRequestData challengeRequestData, int i, String str, String str2) {
        String valueOf = String.valueOf(i);
        y0 y0Var = ErrorData.ErrorComponent.Companion;
        return new ErrorData(challengeRequestData.threeDsServerTransId, challengeRequestData.acsTransId, valueOf, str, str2, "CRes", challengeRequestData.messageVersion, challengeRequestData.sdkTransId, 4);
    }

    @Override // com.squareup.cash.overlays.Overlay
    public void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-545958543);
        AnimatedContentKt.AnimatedVisibility((MutableTransitionState) this.mEmojiCharArray, (Modifier) null, EnterTransitionImpl.None, ExitTransitionImpl.None, (String) null, Expect_jvmKt.rememberComposableLambda(523946393, new MoneyTabUIKt$$ExternalSyntheticLambda11(24, (CompositionLocalContext) this.mRootNode, (ComposableLambdaImpl) this.mTypeface), gapComposer), gapComposer, 196608, 18);
        MutableTransitionState mutableTransitionState = (MutableTransitionState) this.mEmojiCharArray;
        boolean changedInstance = gapComposer.changedInstance(mutableTransitionState);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda5(mutableTransitionState, 18);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.SideEffect((Function0) rememberedValue, gapComposer);
        gapComposer.end(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bindServices(Zipline zipline, ContinuationImpl continuationImpl) {
        PlatformLauncher$bindServices$1 platformLauncher$bindServices$1;
        int i;
        if (continuationImpl instanceof PlatformLauncher$bindServices$1) {
            platformLauncher$bindServices$1 = (PlatformLauncher$bindServices$1) continuationImpl;
            int i2 = platformLauncher$bindServices$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                platformLauncher$bindServices$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = platformLauncher$bindServices$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformLauncher$bindServices$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeferredCoroutine deferredCoroutine = (DeferredCoroutine) this.mTypeface;
                    if (deferredCoroutine == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("expected manifestReady() before bindServices()");
                        return null;
                    }
                    this.mTypeface = null;
                    platformLauncher$bindServices$1.L$0 = zipline;
                    platformLauncher$bindServices$1.label = 1;
                    obj = deferredCoroutine.awaitInternal(platformLauncher$bindServices$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zipline = platformLauncher$bindServices$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ((ZiplineService) obj);
                zipline.getClass();
                rawTreehousePlatform.getClass();
                HttpClient$Companion$Adapter httpClient$Companion$Adapter = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 10);
                if (JobKt.isActive(zipline.scope)) {
                    a$$ExternalSyntheticBUOutline0.m$1("closed");
                    return null;
                }
                zipline.endpoint.bind("rawTreehousePlatform", rawTreehousePlatform, httpClient$Companion$Adapter);
                return Unit.INSTANCE;
            }
        }
        platformLauncher$bindServices$1 = new PlatformLauncher$bindServices$1(this, continuationImpl);
        Object obj2 = platformLauncher$bindServices$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformLauncher$bindServices$1.label;
        if (i != 0) {
        }
        RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ((ZiplineService) obj2);
        zipline.getClass();
        rawTreehousePlatform2.getClass();
        HttpClient$Companion$Adapter httpClient$Companion$Adapter2 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 10);
        if (JobKt.isActive(zipline.scope)) {
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesCtrHmacAeadKey m1114build() {
        WireAdapter wireAdapter;
        Bytes tinkOutputPrefix;
        AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (AesCtrHmacAeadParameters) this.mMetadataList;
        if (aesCtrHmacAeadParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot build without parameters");
            return null;
        }
        WireAdapter wireAdapter2 = (WireAdapter) this.mEmojiCharArray;
        if (wireAdapter2 == null || (wireAdapter = (WireAdapter) this.mRootNode) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot build without key material");
            return null;
        }
        if (aesCtrHmacAeadParameters.aesKeySizeBytes != ((Bytes) wireAdapter2.adapter).data.length) {
            a$$ExternalSyntheticBUOutline0.m$6("AES key size mismatch");
            return null;
        }
        if (aesCtrHmacAeadParameters.hmacKeySizeBytes != ((Bytes) wireAdapter.adapter).data.length) {
            a$$ExternalSyntheticBUOutline0.m$6("HMAC key size mismatch");
            return null;
        }
        if (aesCtrHmacAeadParameters.hasIdRequirement() && ((Integer) this.mTypeface) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((AesCtrHmacAeadParameters) this.mMetadataList).hasIdRequirement() && ((Integer) this.mTypeface) != null) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        AesEaxParameters.Variant variant = ((AesCtrHmacAeadParameters) this.mMetadataList).variant;
        if (variant == AesEaxParameters.Variant.NO_PREFIX$1) {
            tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else if (variant == AesEaxParameters.Variant.CRUNCHY$1) {
            tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(((Integer) this.mTypeface).intValue());
        } else {
            if (variant != AesEaxParameters.Variant.TINK$1) {
                a$$ExternalSyntheticBUOutline0.m$2(((AesCtrHmacAeadParameters) this.mMetadataList).variant, "Unknown AesCtrHmacAeadParameters.Variant: ");
                return null;
            }
            tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(((Integer) this.mTypeface).intValue());
        }
        return new AesCtrHmacAeadKey((AesCtrHmacAeadParameters) this.mMetadataList, (WireAdapter) this.mEmojiCharArray, (WireAdapter) this.mRootNode, tinkOutputPrefix, (Integer) this.mTypeface);
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        zzuc zzucVar = new zzuc(1, (zztp) this.mMetadataList, (zzqa) this.mRootNode, (Executor) this.mTypeface);
        int i = zzxa.$r8$clinit;
        return Futures.transformAsync((AbstractFuture) this.mEmojiCharArray, new zzqa(4, zzvy.zzb(), zzucVar), DirectExecutor.INSTANCE);
    }

    public void createAndSendSurfaceOutput(SurfaceEdge surfaceEdge, Map.Entry entry) {
        SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry.getValue();
        StringUtilsKt.d("SurfaceProcessorNode", "     -> outputEdge = " + surfaceEdge2);
        AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo = null;
        AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo2 = new AutoValue_SurfaceOutput_CameraInputInfo(surfaceEdge.mStreamSpec.resolution, ((AutoValue_OutConfig) entry.getKey()).getCropRect, surfaceEdge.mHasCameraTransform ? (CameraInternal) this.mEmojiCharArray : null, ((AutoValue_OutConfig) entry.getKey()).getRotationDegrees, ((AutoValue_OutConfig) entry.getKey()).isMirroring);
        int i = ((AutoValue_OutConfig) entry.getKey()).getFormat;
        surfaceEdge2.getClass();
        Threads.checkMainThread();
        surfaceEdge2.checkNotClosed();
        TransactorKt.checkState("Consumer can only be linked once.", !surfaceEdge2.mHasConsumer);
        surfaceEdge2.mHasConsumer = true;
        SurfaceEdge.SettableSurface settableSurface = surfaceEdge2.mSettableSurface;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(androidx.camera.core.impl.utils.futures.Futures.transformAsync(settableSurface.getSurface(), new SurfaceEdge$$ExternalSyntheticLambda4(surfaceEdge2, settableSurface, i, autoValue_SurfaceOutput_CameraInputInfo2, autoValue_SurfaceOutput_CameraInputInfo), zzabp.mainThreadExecutor()), new Recorder.AnonymousClass1(this, surfaceEdge2, false, 10), zzabp.mainThreadExecutor());
    }

    @Override // com.squareup.cash.overlays.Overlay
    public View getAsView() {
        return (View) ((Lazy) this.mMetadataList).getValue();
    }

    @Override // com.squareup.cash.overlays.Overlay
    public /* bridge */ /* synthetic */ OnBackListener getBackListener() {
        return null;
    }

    public int getMetadataVersion() {
        MetadataList metadataList = (MetadataList) this.mMetadataList;
        int __offset = metadataList.__offset(4);
        if (__offset != 0) {
            return metadataList.bb.getInt(__offset + metadataList.bb_pos);
        }
        return 0;
    }

    public JSONObject getResponsePayload(String str) {
        Object failure;
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) this.mMetadataList;
        SecretKey secretKey = (SecretKey) this.mEmojiCharArray;
        defaultMessageTransformer.getClass();
        Base64URL[] split = JOSEObject.split(str);
        if (split.length != 5) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Unexpected number of Base64URL parts, must be five");
            return null;
        }
        Base64URL base64URL = split[0];
        Base64URL base64URL2 = split[1];
        Base64URL base64URL3 = split[2];
        Base64URL base64URL4 = split[3];
        Base64URL base64URL5 = split[4];
        JWEObject jWEObject = new JWEObject();
        try {
            Objects.requireNonNull(base64URL);
            jWEObject.header = JWEHeader.parse(base64URL);
            if (base64URL2 == null || base64URL2.value.isEmpty()) {
                jWEObject.encryptedKey = null;
            } else {
                jWEObject.encryptedKey = base64URL2;
            }
            if (base64URL3 == null || base64URL3.value.isEmpty()) {
                jWEObject.iv = null;
            } else {
                jWEObject.iv = base64URL3;
            }
            Objects.requireNonNull(base64URL4);
            jWEObject.cipherText = base64URL4;
            if (base64URL5 == null || base64URL5.value.isEmpty()) {
                jWEObject.authTag = null;
            } else {
                jWEObject.authTag = base64URL5;
            }
            jWEObject.state = 2;
            EncryptionMethod encryptionMethod = jWEObject.header.enc;
            encryptionMethod.getClass();
            byte[] encoded = secretKey.getEncoded();
            EncryptionMethod encryptionMethod2 = EncryptionMethod.A128GCM;
            if (encryptionMethod2 == encryptionMethod) {
                encoded = Arrays.copyOfRange(encoded, encoded.length - (encryptionMethod2.cekBitLength / 8), encoded.length);
                encoded.getClass();
            } else {
                encoded.getClass();
            }
            DirectDecrypter directDecrypter = new DirectDecrypter(encoded);
            synchronized (jWEObject) {
                if (jWEObject.state != 2) {
                    throw new IllegalStateException("The JWE object must be in an encrypted state");
                }
                if (jWEObject.header.zip != null && jWEObject.cipherText.value.length() > 100000) {
                    throw new JOSEException("The JWE compressed cipher text exceeds the maximum allowed length of 100000 characters");
                }
                try {
                    try {
                        JWEHeader jWEHeader = jWEObject.header;
                        jWEObject.payload = new Payload(directDecrypter.decrypt(jWEHeader, jWEObject.encryptedKey, jWEObject.iv, jWEObject.cipherText, jWEObject.authTag, jWEHeader.toBase64URL().value.getBytes(StandardCharsets.US_ASCII)));
                        jWEObject.state = 3;
                    } catch (Exception e) {
                        throw new JOSEException(e.getMessage(), e);
                    }
                } catch (JOSEException e2) {
                    throw e2;
                }
            }
            String commonSEHeader = jWEObject.header.toString();
            commonSEHeader.getClass();
            if (DefaultMessageTransformer.isValidPayloadPart(commonSEHeader)) {
                String str2 = jWEObject.iv.value;
                str2.getClass();
                if (DefaultMessageTransformer.isValidPayloadPart(str2)) {
                    String str3 = jWEObject.cipherText.value;
                    str3.getClass();
                    if (DefaultMessageTransformer.isValidPayloadPart(str3)) {
                        String str4 = jWEObject.authTag.value;
                        str4.getClass();
                        if (DefaultMessageTransformer.isValidPayloadPart(str4)) {
                            JSONObject jSONObject = new JSONObject(jWEObject.payload.toString());
                            if (defaultMessageTransformer.isLiveMode) {
                                if (!jSONObject.has("acsCounterAtoS")) {
                                    int i = ChallengeResponseParseException.$r8$clinit;
                                    throw zzap.createRequiredDataElementMissing("acsCounterAtoS");
                                }
                                try {
                                    Result.Companion companion = Result.Companion;
                                    String string2 = jSONObject.getString("acsCounterAtoS");
                                    string2.getClass();
                                    failure = Byte.valueOf(Byte.parseByte(string2));
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    failure = new Result.Failure(th);
                                }
                                if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                    int i2 = ChallengeResponseParseException.$r8$clinit;
                                    throw zzap.createInvalidDataElementFormat("acsCounterAtoS");
                                }
                                byte byteValue = ((Number) failure).byteValue();
                                if (defaultMessageTransformer.counterAcsToSdk != byteValue) {
                                    ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
                                    throw new ChallengeResponseParseException(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Data could not be decrypted by the receiving system due to technical or other reason.", Recorder$$ExternalSyntheticOutline2.m("Counters are not equal. SDK counter: ", defaultMessageTransformer.counterAcsToSdk, byteValue, ", ACS counter: "));
                                }
                            }
                            byte b = (byte) (defaultMessageTransformer.counterAcsToSdk + 1);
                            defaultMessageTransformer.counterAcsToSdk = b;
                            if (b != 0) {
                                return jSONObject;
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("ACS to SDK counter is zero");
                            return null;
                        }
                    }
                }
            }
            ProtocolError[] protocolErrorArr2 = ProtocolError.$VALUES;
            throw new ChallengeResponseParseException(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Data could not be decrypted by the receiving system due to technical or other reason.", "Invalid encryption.");
        } catch (ParseException e3) {
            JWK$$ExternalSyntheticBUOutline0.m$3(e3.getMessage(), "Invalid JWE header: ");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isReadyToPay(ContinuationImpl continuationImpl) {
        RealLocalGooglePayPaymentsClient$isReadyToPay$1 realLocalGooglePayPaymentsClient$isReadyToPay$1;
        int i;
        if (continuationImpl instanceof RealLocalGooglePayPaymentsClient$isReadyToPay$1) {
            realLocalGooglePayPaymentsClient$isReadyToPay$1 = (RealLocalGooglePayPaymentsClient$isReadyToPay$1) continuationImpl;
            int i2 = realLocalGooglePayPaymentsClient$isReadyToPay$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalGooglePayPaymentsClient$isReadyToPay$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalGooglePayPaymentsClient$isReadyToPay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalGooglePayPaymentsClient$isReadyToPay$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object value = ((Lazy) this.mTypeface).getValue();
                    value.getClass();
                    zzw isReadyToPay = ((PaymentsClient) value).isReadyToPay(GooglePay.createIsReadyToPayRequest());
                    isReadyToPay.getClass();
                    realLocalGooglePayPaymentsClient$isReadyToPay$1.label = 1;
                    obj = Okio.awaitImpl(isReadyToPay, null, realLocalGooglePayPaymentsClient$isReadyToPay$1);
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
                obj.getClass();
                return obj;
            }
        }
        realLocalGooglePayPaymentsClient$isReadyToPay$1 = new RealLocalGooglePayPaymentsClient$isReadyToPay$1(this, continuationImpl);
        Object obj2 = realLocalGooglePayPaymentsClient$isReadyToPay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalGooglePayPaymentsClient$isReadyToPay$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadPaymentData(String str, String str2, ContinuationImpl continuationImpl) {
        RealLocalGooglePayPaymentsClient$loadPaymentData$1 realLocalGooglePayPaymentsClient$loadPaymentData$1;
        int i;
        int i2;
        if (continuationImpl instanceof RealLocalGooglePayPaymentsClient$loadPaymentData$1) {
            realLocalGooglePayPaymentsClient$loadPaymentData$1 = (RealLocalGooglePayPaymentsClient$loadPaymentData$1) continuationImpl;
            int i3 = realLocalGooglePayPaymentsClient$loadPaymentData$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalGooglePayPaymentsClient$loadPaymentData$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalGooglePayPaymentsClient$loadPaymentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalGooglePayPaymentsClient$loadPaymentData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransactionInfo transactionInfo = new TransactionInfo();
                    transactionInfo.zza = 3;
                    transactionInfo.zzb = str;
                    transactionInfo.zzc = str2;
                    zzae.checkNotEmpty(str2, "currencyCode must be set!");
                    int i4 = transactionInfo.zza;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            zzae.checkNotEmpty(transactionInfo.zzb, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                        } else if (i4 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$3("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                            return null;
                        }
                    }
                    if (transactionInfo.zza == 3) {
                        zzae.checkNotEmpty(transactionInfo.zzb, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
                    }
                    PaymentDataRequest createPaymentDataRequest = GooglePay.createPaymentDataRequest((String) this.mMetadataList, transactionInfo);
                    Object value = ((Lazy) this.mTypeface).getValue();
                    value.getClass();
                    zzw loadPaymentData = ((PaymentsClient) value).loadPaymentData(createPaymentDataRequest);
                    loadPaymentData.getClass();
                    AutoResolveHelper.resolveTask(loadPaymentData, (Activity) this.mRootNode);
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1((Flow) this.mEmojiCharArray, 4);
                    realLocalGooglePayPaymentsClient$loadPaymentData$1.label = 1;
                    obj = FlowKt.first(realLocalInstalledStore$hideBrands$$inlined$map$1, realLocalGooglePayPaymentsClient$loadPaymentData$1);
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
                ActivityResult activityResult = (ActivityResult) obj;
                i2 = activityResult.resultCode;
                Intent intent = activityResult.intent;
                if (i2 == -1) {
                    if (i2 == 0) {
                        return LoadPaymentResult.Cancelled.INSTANCE;
                    }
                    if (i2 == 1) {
                        int i5 = AutoResolveHelper.$r8$clinit;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        if (status != null) {
                            return new LoadPaymentResult.GooglePayFailure(status.zza);
                        }
                    }
                } else if (intent != null) {
                    Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    PaymentData paymentData = (PaymentData) (byteArrayExtra != null ? ErrorsKt.deserializeFromBytes(byteArrayExtra, creator) : null);
                    if (paymentData != null) {
                        return new LoadPaymentResult.Success(paymentData);
                    }
                }
                return LoadPaymentResult.UnexpectedFailure.INSTANCE;
            }
        }
        realLocalGooglePayPaymentsClient$loadPaymentData$1 = new RealLocalGooglePayPaymentsClient$loadPaymentData$1(this, continuationImpl);
        Object obj2 = realLocalGooglePayPaymentsClient$loadPaymentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalGooglePayPaymentsClient$loadPaymentData$1.label;
        if (i != 0) {
        }
        ActivityResult activityResult2 = (ActivityResult) obj2;
        i2 = activityResult2.resultCode;
        Intent intent2 = activityResult2.intent;
        if (i2 == -1) {
        }
        return LoadPaymentResult.UnexpectedFailure.INSTANCE;
    }

    public synchronized boolean maybeAddToWaitingRequests(Request request) {
        try {
            String str = request.mUrl;
            boolean containsKey = ((HashMap) this.mMetadataList).containsKey(str);
            HashMap hashMap = (HashMap) this.mMetadataList;
            if (!containsKey) {
                hashMap.put(str, null);
                synchronized (request.mLock) {
                    request.mRequestCompleteListener = this;
                }
                if (VolleyLog.DEBUG) {
                    VolleyLog.d("new request, sending to network %s", str);
                }
                return false;
            }
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new ArrayList();
            }
            request.addMarker("waiting-for-response");
            list.add(request);
            ((HashMap) this.mMetadataList).put(str, list);
            if (VolleyLog.DEBUG) {
                VolleyLog.d("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil3.target.Target
    public void onError(Image image) {
        ((Function1) this.mMetadataList).invoke(((Lazy) this.mEmojiCharArray).getValue());
    }

    @Override // com.squareup.cardcustomizations.signature.SignatureStateListener
    public void onGlyphAdded() {
        ((MutableState) this.mMetadataList).setValue(Boolean.FALSE);
        if (((CardStudioViewModelV2.Content) this.mEmojiCharArray).customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP) {
            return;
        }
        ((SnapshotStateList) this.mRootNode).add(new SignatureViewKt$$ExternalSyntheticLambda1((SignatureState) this.mTypeface, 2));
    }

    public synchronized void onNoUsableResponseReceived(Request request) {
        BlockingQueue blockingQueue;
        try {
            String str = request.mUrl;
            List list = (List) ((HashMap) this.mMetadataList).remove(str);
            if (list != null && !list.isEmpty()) {
                if (VolleyLog.DEBUG) {
                    VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
                }
                Request request2 = (Request) list.remove(0);
                ((HashMap) this.mMetadataList).put(str, list);
                synchronized (request2.mLock) {
                    request2.mRequestCompleteListener = this;
                }
                if (((CacheDispatcher) this.mRootNode) != null && (blockingQueue = (BlockingQueue) this.mTypeface) != null) {
                    try {
                        blockingQueue.put(request2);
                    } catch (InterruptedException e) {
                        VolleyLog.e("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        CacheDispatcher cacheDispatcher = (CacheDispatcher) this.mRootNode;
                        cacheDispatcher.mQuit = true;
                        cacheDispatcher.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil3.target.Target
    public void onStart(Image image) {
    }

    @Override // com.squareup.cardcustomizations.signature.SignatureStateListener
    public void onStartedSigning() {
        ((MutableState) this.mMetadataList).setValue(Boolean.TRUE);
    }

    @Override // coil3.target.Target
    public void onSuccess(Image image) {
        Function1 function1 = (Function1) this.mRootNode;
        Resources resources = ((BadgedLayout) this.mTypeface).getResources();
        resources.getClass();
        function1.invoke(Image_androidKt.asDrawable(image, resources));
    }

    public void registerOnDrawListener(final View view, final Box box) {
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1
            public boolean invoked;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                MetadataRepo metadataRepo = MetadataRepo.this;
                Handler handler = (Handler) metadataRepo.mTypeface;
                if (this.invoked) {
                    return;
                }
                this.invoked = true;
                Message obtain = Message.obtain(handler, new DateFormatTextWatcher$$ExternalSyntheticLambda1(box, ((Number) ((DatadogTracerAdapter.AnonymousClass1) metadataRepo.mEmojiCharArray).invoke()).longValue(), 1));
                obtain.setAsynchronous(true);
                handler.sendMessageAtFrontOfQueue(obtain);
                handler.post(new CardEntryActivityController$$ExternalSyntheticLambda1(6, view, this, metadataRepo));
            }
        };
        if (view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(onDrawListener);
            } catch (IllegalStateException e) {
                DBUtil.log$default((InternalLogger) this.mMetadataList, 4, InternalLogger.Target.TELEMETRY, RumAppStartupTelemetryReporterImpl$reportTTID$1.INSTANCE$1, e, false, 48);
            }
        }
    }

    public void release() {
        ((DefaultSurfaceProcessor) this.mMetadataList).release();
        Threads.runOnMain(new Preview$$ExternalSyntheticLambda0(this, 15));
    }

    public void setAesKeyBytes(WireAdapter wireAdapter) {
        this.mEmojiCharArray = wireAdapter;
    }

    public void setHmacKeyBytes(WireAdapter wireAdapter) {
        this.mRootNode = wireAdapter;
    }

    public void setIdRequirement(Integer num) {
        this.mTypeface = num;
    }

    public void setParameters(AesCtrHmacAeadParameters aesCtrHmacAeadParameters) {
        this.mMetadataList = aesCtrHmacAeadParameters;
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public boolean shouldDisableAePrecapture() {
        return !((Boolean) ((Lazy) this.mTypeface).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shouldUseTorchAsFlash(Scene.AnonymousClass1 anonymousClass1, Continuation continuation) {
        UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 useTorchAsFlashImpl$shouldUseTorchAsFlash$1;
        int i;
        AndroidFrameMetadata androidFrameMetadata;
        Float f;
        Lazy lazy = (Lazy) this.mTypeface;
        if (continuation instanceof UseTorchAsFlashImpl$shouldUseTorchAsFlash$1) {
            useTorchAsFlashImpl$shouldUseTorchAsFlash$1 = (UseTorchAsFlashImpl$shouldUseTorchAsFlash$1) continuation;
            int i2 = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                useTorchAsFlashImpl$shouldUseTorchAsFlash$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.label;
                Boolean bool = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = " + ((Boolean) lazy.getValue()).booleanValue());
                    if (!((Boolean) lazy.getValue()).booleanValue()) {
                        return Boolean.TRUE;
                    }
                    useTorchAsFlashImpl$shouldUseTorchAsFlash$1.label = 1;
                    obj = anonymousClass1.invoke(useTorchAsFlashImpl$shouldUseTorchAsFlash$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                androidFrameMetadata = (AndroidFrameMetadata) obj;
                if (androidFrameMetadata != null) {
                    Log.w("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
                    return Boolean.TRUE;
                }
                CaptureResult.Key key = CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
                key.getClass();
                String str = (String) androidFrameMetadata.get(key);
                if (str == null) {
                    Log.w("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
                } else {
                    CameraDevicesImpl cameraDevicesImpl = (CameraDevicesImpl) this.mEmojiCharArray;
                    CameraId.m45constructorimpl(str);
                    CameraMetadata m93awaitCameraMetadataFpsL5FU$default = CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraDevicesImpl, str);
                    try {
                        try {
                            f = Float.valueOf(((IntrinsicZoomCalculatorImpl) this.mRootNode).getDefaultCameraDefaultViewAngleDegrees(m93awaitCameraMetadataFpsL5FU$default) / IntrinsicZoomCalculatorImpl.focalLengthToViewAngleDegrees(IntrinsicZoomCalculatorImpl.getDefaultFocalLength(m93awaitCameraMetadataFpsL5FU$default), IntrinsicZoomCalculatorImpl.getSensorHorizontalLength(m93awaitCameraMetadataFpsL5FU$default)));
                        } catch (Exception e) {
                            throw new IllegalStateException("Failed to get a valid view angle", e);
                        }
                    } catch (Exception e2) {
                        Log.e("CXCP", "Failed to get the intrinsic zoom ratio", e2);
                        f = null;
                    }
                    if (f != null) {
                        float floatValue = f.floatValue();
                        Log.d("CXCP", "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + floatValue);
                        bool = Boolean.valueOf(floatValue < 1.0f);
                    } else {
                        Log.w("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
                    }
                }
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        useTorchAsFlashImpl$shouldUseTorchAsFlash$1 = new UseTorchAsFlashImpl$shouldUseTorchAsFlash$1(this, (ContinuationImpl) continuation);
        Object obj3 = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.label;
        Boolean bool2 = null;
        if (i != 0) {
        }
        androidFrameMetadata = (AndroidFrameMetadata) obj3;
        if (androidFrameMetadata != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r10 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object showDripSetting(ScreenSource screenSource, ContinuationImpl continuationImpl) {
        RealInvestingInboundNavigator$showDripSetting$1 realInvestingInboundNavigator$showDripSetting$1;
        int i;
        boolean booleanValue;
        InvestingScreens.DividendReinvestmentSettingScreen dividendReinvestmentSettingScreen;
        Navigator navigator = (Navigator) this.mTypeface;
        if (continuationImpl instanceof RealInvestingInboundNavigator$showDripSetting$1) {
            realInvestingInboundNavigator$showDripSetting$1 = (RealInvestingInboundNavigator$showDripSetting$1) continuationImpl;
            int i2 = realInvestingInboundNavigator$showDripSetting$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInvestingInboundNavigator$showDripSetting$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInvestingInboundNavigator$showDripSetting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingInboundNavigator$showDripSetting$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) this.mEmojiCharArray;
                    RealKeyStoreProvider$load$2 realKeyStoreProvider$load$2 = new RealKeyStoreProvider$load$2(this, continuation, 20);
                    realInvestingInboundNavigator$showDripSetting$1.L$0 = screenSource;
                    realInvestingInboundNavigator$showDripSetting$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, realKeyStoreProvider$load$2, realInvestingInboundNavigator$showDripSetting$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dividendReinvestmentSettingScreen = realInvestingInboundNavigator$showDripSetting$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        navigator.goTo(dividendReinvestmentSettingScreen);
                        return Unit.INSTANCE;
                    }
                    screenSource = realInvestingInboundNavigator$showDripSetting$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                InvestingScreens.DividendReinvestmentSettingScreen dividendReinvestmentSettingScreen2 = new InvestingScreens.DividendReinvestmentSettingScreen(screenSource);
                if (booleanValue) {
                    navigator.goTo(new InvestingScreens.DividendReinvestmentWelcomeScreen(dividendReinvestmentSettingScreen2));
                    return Unit.INSTANCE;
                }
                KeyValue keyValue = (KeyValue) this.mRootNode;
                Boolean bool = Boolean.TRUE;
                realInvestingInboundNavigator$showDripSetting$1.L$0 = null;
                realInvestingInboundNavigator$showDripSetting$1.L$1 = dividendReinvestmentSettingScreen2;
                realInvestingInboundNavigator$showDripSetting$1.label = 2;
                if (keyValue.set(bool, realInvestingInboundNavigator$showDripSetting$1) != coroutineSingletons) {
                    dividendReinvestmentSettingScreen = dividendReinvestmentSettingScreen2;
                    navigator.goTo(dividendReinvestmentSettingScreen);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        realInvestingInboundNavigator$showDripSetting$1 = new RealInvestingInboundNavigator$showDripSetting$1(this, continuationImpl);
        Object obj2 = realInvestingInboundNavigator$showDripSetting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInvestingInboundNavigator$showDripSetting$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        InvestingScreens.DividendReinvestmentSettingScreen dividendReinvestmentSettingScreen22 = new InvestingScreens.DividendReinvestmentSettingScreen(screenSource);
        if (booleanValue) {
        }
    }

    public void startScanning(boolean z, Function1 function1) {
        stopScanning();
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.mMetadataList;
        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
        int i = 0;
        if (bluetoothLeScanner == null) {
            Timber.Forest.w("BeaconDetection: BluetoothLeScanner unavailable, cannot scan", new Object[0]);
            return;
        }
        this.mEmojiCharArray = bluetoothLeScanner;
        this.mTypeface = function1;
        BeaconScanner$startScanning$callback$1 beaconScanner$startScanning$callback$1 = new BeaconScanner$startScanning$callback$1(this, i);
        this.mRootNode = beaconScanner$startScanning$callback$1;
        try {
            bluetoothLeScanner.startScan(CollectionsKt__CollectionsJVMKt.listOf(zzadj.buildScanFilter$real()), new ScanSettings.Builder().setScanMode(z ? 2 : 0).setReportDelay(0L).build(), beaconScanner$startScanning$callback$1);
            Timber.Forest.i("BeaconDetection: scan started (foreground=%s)", Boolean.valueOf(z));
        } catch (SecurityException e) {
            Timber.Forest.e("BeaconDetection: missing permission for BLE scan", new Object[0], e);
            this.mRootNode = null;
        }
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public void startScheduling() {
        zzho.executeSafe((ScheduledThreadPoolExecutor) this.mEmojiCharArray, Recorder$$ExternalSyntheticOutline2.m$1((String) this.mMetadataList, ": data upload"), (InternalLogger) this.mRootNode, (DataUploadRunnable) this.mTypeface);
    }

    public void stopScanning() {
        BeaconScanner$startScanning$callback$1 beaconScanner$startScanning$callback$1 = (BeaconScanner$startScanning$callback$1) this.mRootNode;
        if (beaconScanner$startScanning$callback$1 == null) {
            return;
        }
        this.mRootNode = null;
        this.mTypeface = null;
        try {
            BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) this.mEmojiCharArray;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(beaconScanner$startScanning$callback$1);
            }
        } catch (IllegalStateException e) {
            Timber.Forest.w("BeaconDetection: BT adapter disabled during stop", new Object[0], e);
        } catch (SecurityException e2) {
            Timber.Forest.w("BeaconDetection: missing permission to stop scan", new Object[0], e2);
        }
        Timber.Forest.i("BeaconDetection: scan stopped", new Object[0]);
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public void stopScheduling() {
        ((ScheduledThreadPoolExecutor) this.mEmojiCharArray).remove((DataUploadRunnable) this.mTypeface);
    }

    public CalendarConverter.AnonymousClass1 transform(AutoValue_SurfaceProcessorNode_In autoValue_SurfaceProcessorNode_In) {
        DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.mMetadataList;
        Threads.checkMainThread();
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", (String) this.mTypeface, "] ");
        StringBuilder sb = new StringBuilder();
        sb.append(m);
        sb.append("SurfaceProcessorNode Transform (Processor=");
        sb.append(defaultSurfaceProcessor);
        sb.append("\n   inputEdge = ");
        SurfaceEdge surfaceEdge = autoValue_SurfaceProcessorNode_In.surfaceEdge;
        List<AutoValue_OutConfig> list = autoValue_SurfaceProcessorNode_In.outConfigs;
        sb.append(surfaceEdge);
        StringUtilsKt.d("SurfaceProcessorNode", sb.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringUtilsKt.d("SurfaceProcessorNode", "   outputConfig = " + ((AutoValue_OutConfig) it.next()));
        }
        this.mRootNode = new CalendarConverter.AnonymousClass1();
        for (AutoValue_OutConfig autoValue_OutConfig : list) {
            CalendarConverter.AnonymousClass1 anonymousClass1 = (CalendarConverter.AnonymousClass1) this.mRootNode;
            Rect rect = autoValue_OutConfig.getCropRect;
            int i = autoValue_OutConfig.getRotationDegrees;
            boolean z = autoValue_OutConfig.isMirroring;
            Matrix matrix = new Matrix(surfaceEdge.mSensorToBufferTransform);
            RectF rectF = new RectF(rect);
            Size size = autoValue_OutConfig.getSize;
            matrix.postConcat(TransformUtils.getRectToRect(rectF, TransformUtils.sizeToRectF(size), i, z));
            TransactorKt.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.rotateSize(i, TransformUtils.rectToSize(rect)), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            SubtreeManager builder = surfaceEdge.mStreamSpec.toBuilder();
            builder.snapshotCache = size;
            anonymousClass1.put(autoValue_OutConfig, new SurfaceEdge(autoValue_OutConfig.getTargets, autoValue_OutConfig.getFormat, builder.build(), matrix, false, rect2, surfaceEdge.mRotationDegrees - i, -1, surfaceEdge.mMirroring != z));
        }
        try {
            defaultSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest((CameraInternal) this.mEmojiCharArray, true));
        } catch (ProcessingException e) {
            StringUtilsKt.e("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry entry : ((CalendarConverter.AnonymousClass1) this.mRootNode).entrySet()) {
            createAndSendSurfaceOutput(surfaceEdge, entry);
            ((SurfaceEdge) entry.getValue()).addOnInvalidatedListener(new AFd1wSDK$$ExternalSyntheticLambda2(8, this, surfaceEdge, entry));
        }
        Recorder$$ExternalSyntheticLambda17 recorder$$ExternalSyntheticLambda17 = new Recorder$$ExternalSyntheticLambda17((CalendarConverter.AnonymousClass1) this.mRootNode, 1);
        surfaceEdge.getClass();
        surfaceEdge.mTransformationUpdatesListeners.add(recorder$$ExternalSyntheticLambda17);
        return (CalendarConverter.AnonymousClass1) this.mRootNode;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.cash.treehouse.platform.PlatformLauncher$wrap$1] */
    public PlatformLauncher$wrap$1 wrap(final EventListener eventListener) {
        eventListener.getClass();
        return new EventListener(eventListener, this) { // from class: com.squareup.cash.treehouse.platform.PlatformLauncher$wrap$1
            public final EventListener delegate;
            public final /* synthetic */ MetadataRepo this$0;

            {
                this.this$0 = this;
                eventListener.getClass();
                this.delegate = eventListener;
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void bindService(String str, ZiplineService ziplineService) {
                ziplineService.getClass();
                this.delegate.bindService(str, ziplineService);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void callEnd(Call call, CallResult callResult, Object obj) {
                call.getClass();
                this.delegate.callEnd(call, callResult, obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object callStart(Call call) {
                call.getClass();
                return this.delegate.callStart(call);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void codeLoadFailed(Exception exc, Object obj) {
                exc.getClass();
                this.delegate.codeLoadFailed(exc, obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void codeLoadSkipped(Object obj) {
                this.delegate.codeLoadSkipped(obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void codeLoadSkippedNotFresh(Object obj) {
                this.delegate.codeLoadSkippedNotFresh(obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object codeLoadStart() {
                return this.delegate.codeLoadStart();
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void codeLoadSuccess(ZiplineManifest ziplineManifest, Zipline zipline, Object obj) {
                ziplineManifest.getClass();
                zipline.getClass();
                this.delegate.codeLoadSuccess(ziplineManifest, zipline, obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void codeUnloaded() {
                this.delegate.codeUnloaded();
                JobKt.cancel((ContextScope) this.this$0.mRootNode, (CancellationException) null);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void downloadFailed(String str, Exception exc, Object obj) {
                str.getClass();
                this.delegate.downloadFailed(str, exc, obj);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object downloadStart(String str) {
                str.getClass();
                return this.delegate.downloadStart(str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void downloadSuccess(Object obj, String str) {
                str.getClass();
                this.delegate.downloadSuccess(obj, str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void initializerEnd(Object obj, String str) {
                str.getClass();
                this.delegate.initializerEnd(obj, str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object initializerStart(String str) {
                str.getClass();
                return this.delegate.initializerStart(str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void mainFunctionEnd(Object obj, String str) {
                str.getClass();
                this.delegate.mainFunctionEnd(obj, str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object mainFunctionStart(String str) {
                str.getClass();
                return this.delegate.mainFunctionStart(str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void manifestParseFailed(Exception exc) {
                this.delegate.manifestParseFailed(exc);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void manifestReady(ZiplineManifest ziplineManifest) {
                ziplineManifest.getClass();
                this.delegate.manifestReady(ziplineManifest);
                MetadataRepo metadataRepo = this.this$0;
                metadataRepo.mTypeface = JobKt.async$default((ContextScope) metadataRepo.mRootNode, null, null, new TaxWebAppBridge.AnonymousClass3(metadataRepo, ziplineManifest, (Continuation) null, 22), 3);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void manifestVerified(ZiplineManifest ziplineManifest, String str) {
                ziplineManifest.getClass();
                this.delegate.manifestVerified(ziplineManifest, str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void moduleLoadEnd(Object obj, String str) {
                str.getClass();
                this.delegate.moduleLoadEnd(obj, str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final Object moduleLoadStart(String str) {
                str.getClass();
                return this.delegate.moduleLoadStart(str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void serviceLeaked(String str) {
                str.getClass();
                this.delegate.serviceLeaked(str);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void takeService(String str, ZiplineService ziplineService) {
                this.delegate.takeService(str, ziplineService);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void uncaughtException(Throwable th) {
                th.getClass();
                this.delegate.uncaughtException(th);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownChildren-iETOA3M */
            public final void mo1391unknownChildreniETOA3M(int i, int i2) {
                this.delegate.mo1391unknownChildreniETOA3M(i, i2);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownEvent-_LM6m-c */
            public final void mo1392unknownEvent_LM6mc(int i, int i2) {
                this.delegate.mo1392unknownEvent_LM6mc(i, i2);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownEventNode-1ccMwuE */
            public final void mo1393unknownEventNode1ccMwuE(int i, int i2) {
                this.delegate.mo1393unknownEventNode1ccMwuE(i, i2);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownModifier-nx0wl1g */
            public final void mo1394unknownModifiernx0wl1g(int i) {
                this.delegate.mo1394unknownModifiernx0wl1g(i);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownProperty-LKUuuww */
            public final void mo1395unknownPropertyLKUuuww(int i, int i2) {
                this.delegate.mo1395unknownPropertyLKUuuww(i, i2);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            /* renamed from: unknownWidget-WCEpcRY */
            public final void mo1396unknownWidgetWCEpcRY(int i) {
                this.delegate.mo1396unknownWidgetWCEpcRY(i);
            }

            @Override // app.cash.redwood.treehouse.EventListener
            public final void ziplineCreated(Zipline zipline) {
                this.delegate.ziplineCreated(zipline);
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlatformLauncher$Attachment.class);
                LinkedHashMap linkedHashMap = zipline.attachments;
                Object obj = linkedHashMap.get(orCreateKotlinClass);
                Object obj2 = obj;
                if (obj == null) {
                    PlatformLauncher$Attachment platformLauncher$Attachment = new PlatformLauncher$Attachment();
                    platformLauncher$Attachment.value = this.this$0;
                    linkedHashMap.put(orCreateKotlinClass, platformLauncher$Attachment);
                    obj2 = platformLauncher$Attachment;
                }
                KClasses.cast(orCreateKotlinClass, obj2);
            }
        };
    }

    public zzao zza(UnleashContext unleashContext, zzje... zzjeVarArr) {
        zzao zzaoVar = zzao.zzf;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVar = zzh.zzb(zzjeVar);
            zzh.zzl((UnleashContext) this.mRootNode);
            if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzap) || (zzaoVar instanceof zzan)) {
                zzaoVar = ((zzz) this.mMetadataList).zzb(unleashContext, zzaoVar);
            }
        }
        return zzaoVar;
    }

    public zze zzc() {
        List list;
        String str = (String) this.mMetadataList;
        if (str != null && (list = (List) this.mEmojiCharArray) != null) {
            return new zze(str, list, (zzdi) this.mRootNode, (zzb) this.mTypeface);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.mMetadataList) == null) {
            sb.append(" placeId");
        }
        if (((List) this.mEmojiCharArray) == null) {
            sb.append(" placeFields");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public void zza(ZipFile zipFile, HashSet hashSet) {
        ((zzn) this.mTypeface).zzf((com.google.android.play.core.splitcompat.zzb) this.mMetadataList, hashSet, new SizeMap(this, 3));
    }

    public /* synthetic */ MetadataRepo(Object obj, Object obj2, Object obj3, Object obj4) {
        this.mMetadataList = obj;
        this.mEmojiCharArray = obj2;
        this.mRootNode = obj3;
        this.mTypeface = obj4;
    }

    public zze build() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) zzc().zzb);
        if (copyOf != null) {
            this.mEmojiCharArray = copyOf;
            return zzc();
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
        return null;
    }

    public MetadataRepo(int i) {
        switch (i) {
            case 16:
                this.mMetadataList = null;
                this.mEmojiCharArray = null;
                this.mRootNode = null;
                this.mTypeface = null;
                break;
            default:
                zzz zzzVar = new zzz(1);
                this.mMetadataList = zzzVar;
                UnleashContext unleashContext = new UnleashContext(null, zzzVar);
                this.mRootNode = unleashContext;
                this.mEmojiCharArray = unleashContext.zzc();
                zzj zzjVar = new zzj(0);
                this.mTypeface = zzjVar;
                unleashContext.zze("require", new com.google.android.gms.internal.measurement.zzw(zzjVar));
                ((HashMap) zzjVar.f64zza).put("internal.platform", com.google.android.gms.internal.measurement.zze.zza);
                unleashContext.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
                break;
        }
    }

    public MetadataRepo(LibrarianService librarianService, RealRegionProvider realRegionProvider, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.mMetadataList = librarianService;
        this.mEmojiCharArray = realRegionProvider;
        this.mRootNode = coroutineContext;
        this.mTypeface = cashAccountDatabaseImpl.legalDocumentQueries;
    }

    public MetadataRepo(Context context) {
        Object systemService = context.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        this.mMetadataList = adapter;
        this.mEmojiCharArray = adapter != null ? adapter.getBluetoothLeScanner() : null;
    }

    public MetadataRepo(int i, String str, Flow flow, Activity activity) {
        this.mMetadataList = str;
        this.mEmojiCharArray = flow;
        this.mRootNode = activity;
        this.mTypeface = LazyKt.lazy(new q2$$ExternalSyntheticLambda8(i, this, 3));
    }

    public MetadataRepo(RealInvestingStateManager realInvestingStateManager, CoroutineContext coroutineContext, KeyValue keyValue, Navigator navigator) {
        navigator.getClass();
        this.mMetadataList = realInvestingStateManager;
        this.mEmojiCharArray = coroutineContext;
        this.mRootNode = keyValue;
        this.mTypeface = navigator;
    }

    public MetadataRepo(ContextScope contextScope, RealTreehouseApp realTreehouseApp, AndroidPlatformServiceFactory androidPlatformServiceFactory) {
        androidPlatformServiceFactory.getClass();
        this.mMetadataList = realTreehouseApp;
        this.mEmojiCharArray = androidPlatformServiceFactory;
        this.mRootNode = JobKt.CoroutineScope(new SupervisorJobImpl(JobKt.getJob(contextScope.coroutineContext)));
    }

    public MetadataRepo(RealLocaleManager realLocaleManager, RealShiftTimeFormatter realShiftTimeFormatter, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        this.mMetadataList = realLocaleManager;
        this.mEmojiCharArray = realShiftTimeFormatter;
        this.mRootNode = androidStringManager;
        this.mTypeface = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public /* synthetic */ MetadataRepo(Object obj, Object obj2, Object obj3, Serializable serializable) {
        this.mTypeface = obj;
        this.mMetadataList = obj2;
        this.mEmojiCharArray = obj3;
        this.mRootNode = serializable;
    }

    public MetadataRepo(CameraInternal cameraInternal, DefaultSurfaceProcessor defaultSurfaceProcessor, String str) {
        this.mEmojiCharArray = cameraInternal;
        this.mMetadataList = defaultSurfaceProcessor;
        this.mTypeface = str;
    }
}
