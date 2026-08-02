package com.fillr;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.icu.text.MessageFormat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.AutoValue_CaptureNode_In;
import androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In;
import androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket;
import androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError;
import androidx.camera.core.imagecapture.AutoValue_TakePictureRequest;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.BlurKt;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.CoroutineLiveData;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.zipline.Call;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.ArgsListSerializer;
import app.cash.zipline.internal.bridge.Endpoint;
import app.cash.zipline.internal.bridge.InternalCall;
import app.cash.zipline.internal.bridge.ResultOrCallback;
import app.cash.zipline.internal.bridge.SuspendingZiplineFunction;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.bumptech.glide.GlideBuilder$1;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGAndroidRenderer$MarkerPositionCalculator;
import com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector;
import com.caverock.androidsvg.SVGAndroidRenderer$PathConverter;
import com.caverock.androidsvg.SVGAndroidRenderer$PlainTextDrawer;
import com.caverock.androidsvg.SVGAndroidRenderer$PlainTextToPath;
import com.caverock.androidsvg.SVGAndroidRenderer$RendererState;
import com.caverock.androidsvg.SVGAndroidRenderer$TextWidthCalculator;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.metrics.BatchClosedMetadata;
import com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartProduct;
import com.fillr.browsersdk.model.FillrJNIBinding;
import com.fillr.browsersdk.model.FillrWebView;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.model.FillrAddressParseComponent;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.e0;
import com.fillr.n;
import com.fillr.service.CaptureFieldsMappingService;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzvh;
import com.google.android.gms.internal.measurement.zzvk;
import com.google.android.gms.internal.measurement.zzvl;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzbm;
import com.google.android.libraries.places.api.model.zzfi;
import com.google.android.libraries.places.api.model.zzgu;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.api.net.zzq;
import com.google.android.libraries.places.api.net.zzr;
import com.google.android.libraries.places.internal.zzbua;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzfm;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.libraries.places.internal.zznv;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.SequentialExecutor;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask;
import com.google.mlkit.common.sdkinternal.zzb;
import com.google.mlkit.vision.text.zza;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.performance.details.TimeoutKt;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.cash.crypto.amount.CryptoCurrency;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummary;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.crypto.backend.transaction.RealCryptoTransactionActionManager;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.RealCryptoAnalytics;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinWithdrawalScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler;
import com.squareup.cash.family.familyhub.backend.real.DependentCardControlStatusRequestHandler$buildCardStatus$1;
import com.squareup.cash.family.familyhub.backend.real.DependentCardControlStatusRequestHandler$getDependentControlStatus$1;
import com.squareup.cash.family.familyhub.backend.real.DependentCardControlStatusRequestHandler$toggleDependentControl$1;
import com.squareup.cash.family.familyhub.backend.real.DependentCardControlStatusRequestHandler$togglePostcard$1;
import com.squareup.cash.family.familyhub.backend.real.SponseeWalletSnapshot;
import com.squareup.cash.family.familyhub.backend.real.SponseeWalletSnapshotFetcher;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesSponsorDrivenCardLimits;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.fillr.real.RealFillrWebManager$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.activity.RealGrowToolsActivityPresenterFactory;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager$models$1$1;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.core.ids.SectionProviderId;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsResponse;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.cash.cashliteflow.api.v1.InitiateBitcoinWithdrawalRequest;
import com.squareup.protos.cash.cashliteflow.api.v1.InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination;
import com.squareup.protos.cash.cashliteflow.api.v1.InitiateBitcoinWithdrawalResponse;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsRequest;
import com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsRequest;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlin.text.StringsKt;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.JsonImpl;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;
import okhttp3.internal.http.StatusLine;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class e0 implements MetricsDispatcher, ProcessLifecycleMonitor.Callback, FillrJNIBinding, PlacesClient, BitcoinHomeWidgetPresenter, ScenarioPlan, DependentControlStatusRequestHandler, GrowToolsManagerDelegate {
    public static boolean shouldCaptureCreditCardValue = true;
    public static boolean shouldCapturePasswordValue = true;
    public static boolean shouldShowCreditCardPrompt = true;
    public static boolean shouldShowPasswordPrompt = true;
    public static HashSet supportedFeatures;
    public final /* synthetic */ int $r8$classId;
    public Object a;
    public Object b;
    public Object c;
    public Object f;
    public Object h;
    public Object i;

    public final class a implements PrivilegedExceptionAction {
        public final /* synthetic */ DocumentBuilder b;
        public final /* synthetic */ InputSource c;

        public a(DocumentBuilder documentBuilder, InputSource inputSource) {
            this.b = documentBuilder;
            this.c = inputSource;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final Object run() {
            return this.b.parse(this.c);
        }
    }

    public final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str == null ? "" : str;
            this.b = str2 == null ? "" : str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(31, 31, this.a);
        }

        public final String toString() {
            String str = this.a;
            boolean equals = "".equals(str);
            String str2 = this.b;
            return equals ? str2 : CameraSelector$$ExternalSyntheticOutline0.m("{", str, "}", str2);
        }
    }

    public e0() {
        this.$r8$classId = 0;
        i iVar = new i();
        new HashMap();
        iVar.b = new HashMap();
        iVar.d = new c();
        this.a = iVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new e();
        t tVar = new t("http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema", this);
        this.h = new Stack();
        this.i = new HashMap();
        a(tVar, com.fillr.a.m.getLocalPart());
        a(tVar, com.fillr.a.n.getLocalPart());
        a(tVar, com.fillr.a.a.getLocalPart());
        a(tVar, com.fillr.a.b.getLocalPart());
        a(tVar, com.fillr.a.d.getLocalPart());
        a(tVar, com.fillr.a.c.getLocalPart());
        a(tVar, com.fillr.a.p.getLocalPart());
        a(tVar, com.fillr.a.j.getLocalPart());
        a(tVar, com.fillr.a.I.getLocalPart());
        a(tVar, com.fillr.a.r.getLocalPart());
        a(tVar, com.fillr.a.s.getLocalPart());
        a(tVar, com.fillr.a.q.getLocalPart());
        a(tVar, com.fillr.a.H.getLocalPart());
        a(tVar, com.fillr.a.G.getLocalPart());
        a(tVar, com.fillr.a.E.getLocalPart());
        a(tVar, com.fillr.a.F.getLocalPart());
        a(tVar, com.fillr.a.D.getLocalPart());
        a(tVar, com.fillr.a.N.getLocalPart());
        a(tVar, com.fillr.a.l.getLocalPart());
        a(tVar, com.fillr.a.k.getLocalPart());
        a(tVar, com.fillr.a.S.getLocalPart());
        a(tVar, com.fillr.a.g.getLocalPart());
        a(tVar, com.fillr.a.h.getLocalPart());
        a(tVar, com.fillr.a.i.getLocalPart());
        a(tVar, com.fillr.a.f.getLocalPart());
        a(tVar, com.fillr.a.e.getLocalPart());
        a(tVar, com.fillr.a.z.getLocalPart());
        a(tVar, com.fillr.a.A.getLocalPart());
        a(tVar, com.fillr.a.C.getLocalPart());
        a(tVar, com.fillr.a.B.getLocalPart());
        a(tVar, com.fillr.a.y.getLocalPart());
        a(tVar, com.fillr.a.w.getLocalPart());
        a(tVar, com.fillr.a.v.getLocalPart());
        a(tVar, com.fillr.a.x.getLocalPart());
        a(tVar, com.fillr.a.J.getLocalPart());
        a(tVar, com.fillr.a.t.getLocalPart());
        a(tVar, com.fillr.a.K.getLocalPart());
        a(tVar, com.fillr.a.L.getLocalPart());
        a(tVar, com.fillr.a.M.getLocalPart());
        a(tVar, com.fillr.a.O.getLocalPart());
        a(tVar, com.fillr.a.P.getLocalPart());
        a(tVar, com.fillr.a.U.getLocalPart());
        a(tVar, com.fillr.a.Q.getLocalPart());
        a(tVar, com.fillr.a.R.getLocalPart());
        a(tVar, com.fillr.a.T.getLocalPart());
        a(tVar, com.fillr.a.u.getLocalPart());
        if (System.getProperty("org.apache.ws.commons.extensions.ExtensionRegistry") != null) {
            try {
                this.a = (i) Class.forName(System.getProperty("org.apache.ws.commons.extensions.ExtensionRegistry")).newInstance();
            } catch (ClassNotFoundException unused) {
                System.err.println("The specified extension registry class cannot be found!");
            } catch (IllegalAccessException unused2) {
                System.err.println("The specified extension registry class cannot be accessed!");
            } catch (InstantiationException unused3) {
                System.err.println("The specified extension registry class cannot be instantiated!");
            }
        }
    }

    public static void access$700(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == RecyclerView.DECELERATION_RATE || f4 == RecyclerView.DECELERATION_RATE) {
            pathInterface.lineTo(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (cos * d2) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double acos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d26 = acos2 % 6.283185307179586d;
        double d27 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ceil;
        double d29 = d28 / 2.0d;
        double sin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double cos2 = Math.cos(d31);
            double sin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (cos2 - (sin2 * sin3));
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d32 = d31 + d28;
            double cos3 = Math.cos(d32);
            double sin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i5 + 4] = (float) cos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) sin4;
            i2 = i4 + 1;
            d27 = d30;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            pathInterface.cubicTo(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static final void access$closeAndReleaseUnprocessedElements(e0 e0Var, Throwable th) {
        ArrayDeque arrayDeque = (ArrayDeque) e0Var.h;
        BufferedChannel bufferedChannel = (BufferedChannel) e0Var.f;
        if (bufferedChannel.closeOrCancelImpl(th, false)) {
            for (Object mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk(); !(mo4189tryReceivePtdJZtk instanceof ChannelResult.Failed); mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk()) {
                ChannelResult.m4192getOrThrowimpl(mo4189tryReceivePtdJZtk);
                arrayDeque.addLast(mo4189tryReceivePtdJZtk);
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            ((Function1) e0Var.b).invoke(new ArrayList(arrayDeque));
            arrayDeque.clear();
        }
    }

    public static SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix calculateViewBoxTransform(SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        PreserveAspectRatio.Alignment alignment;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && (alignment = preserveAspectRatio.alignment) != null) {
            float f3 = box.width / box2.width;
            float f4 = box.height / box2.height;
            float f5 = -box2.minX;
            float f6 = -box2.minY;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = preserveAspectRatio.scale == 2 ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = box.width / max;
            float f8 = box.height / max;
            int ordinal = alignment.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 8) {
                            }
                        }
                    }
                }
                f = box2.width - f7;
                f5 -= f;
                switch (alignment.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f2 = (box2.height - f8) / 2.0f;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f2 = box2.height - f8;
                        break;
                }
                f6 -= f2;
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (box2.width - f7) / 2.0f;
            f5 -= f;
            switch (alignment.ordinal()) {
            }
            f6 -= f2;
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r7.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface checkGenericFont(int i, Integer num, String str) {
        char c = 0;
        boolean z = i == 2;
        int i2 = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int colourWithOpacity(float f, int i) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void error(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgElementBase resolveIRI = gradientElement.document.resolveIRI(str);
        if (resolveIRI == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(resolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (resolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) resolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == 0) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) gradientElement;
                SVG.SvgLinearGradient svgLinearGradient2 = (SVG.SvgLinearGradient) resolveIRI;
                if (svgLinearGradient.x1 == null) {
                    svgLinearGradient.x1 = svgLinearGradient2.x1;
                }
                if (svgLinearGradient.y1 == null) {
                    svgLinearGradient.y1 = svgLinearGradient2.y1;
                }
                if (svgLinearGradient.x2 == null) {
                    svgLinearGradient.x2 = svgLinearGradient2.x2;
                }
                if (svgLinearGradient.y2 == null) {
                    svgLinearGradient.y2 = svgLinearGradient2.y2;
                }
            } else {
                fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) resolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.href;
        if (str2 != null) {
            fillInChainedGradientFields(gradientElement, str2);
        }
    }

    public static void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgElementBase resolveIRI = pattern.document.resolveIRI(str);
        if (resolveIRI == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(resolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (resolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.Pattern pattern2 = (SVG.Pattern) resolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.x == null) {
            pattern.x = pattern2.x;
        }
        if (pattern.y == null) {
            pattern.y = pattern2.y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        String str2 = pattern2.href;
        if (str2 != null) {
            fillInChainedPatternFields(pattern, str2);
        }
    }

    public static MediaSource$MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList immutableList, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Timeline.Period period) {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
        int currentPeriodIndex = exoPlayerImpl.getCurrentPeriodIndex();
        Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
        int adGroupIndexAfterPositionUs = (exoPlayerImpl.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period, false).getAdGroupIndexAfterPositionUs(Util.msToUs(exoPlayerImpl.getCurrentPosition()) - period.positionInWindowUs);
        for (int i = 0; i < immutableList.size(); i++) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = (MediaSource$MediaPeriodId) immutableList.get(i);
            if (isMatchingMediaPeriod(mediaSource$MediaPeriodId2, uidOfPeriod, exoPlayerImpl.isPlayingAd(), exoPlayerImpl.getCurrentAdGroupIndex(), exoPlayerImpl.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaSource$MediaPeriodId2;
            }
        }
        if (immutableList.isEmpty() && mediaSource$MediaPeriodId != null && isMatchingMediaPeriod(mediaSource$MediaPeriodId, uidOfPeriod, exoPlayerImpl.isPlayingAd(), exoPlayerImpl.getCurrentAdGroupIndex(), exoPlayerImpl.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
            return mediaSource$MediaPeriodId;
        }
        return null;
    }

    public static boolean isMatchingMediaPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = mediaSource$MediaPeriodId.periodUid;
        int i4 = mediaSource$MediaPeriodId.adGroupIndex;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && mediaSource$MediaPeriodId.adIndexInAdGroup == i2) {
            return true;
        }
        return !z && i4 == -1 && mediaSource$MediaPeriodId.nextAdGroupIndex == i3;
    }

    public static boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    public static void listenForSharedVariable(ViewTransition viewTransition) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i = viewTransition.mSharedValueID;
        GlideBuilder$1 glideBuilder$1 = new GlideBuilder$1();
        HashMap hashMap = sharedValues.mValuesListeners;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(glideBuilder$1));
    }

    public static Long nameAsTimestampSafe(File file, InternalLogger internalLogger) {
        String name = file.getName();
        name.getClass();
        Long longOrNull = StringsKt.toLongOrNull(10, name);
        if (longOrNull == null) {
            DBUtil.log$default(internalLogger, 5, InternalLogger.Target.MAINTAINER, new FileMover$delete$1(file, 1), null, false, 56);
        }
        return longOrNull;
    }

    public static String resolveFileOriginAsConsent(File file) {
        String str;
        Locale locale;
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name != null) {
            if (FeatureFileOrchestrator.IS_PENDING_DIR_REG_EX.matches(name)) {
                str = "PENDING";
                locale = Locale.US;
            } else if (FeatureFileOrchestrator.IS_GRANTED_DIR_REG_EX.matches(name)) {
                str = "GRANTED";
                locale = Locale.US;
            }
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale);
        }
        return null;
    }

    public static void setPaintColour(SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        SVG.Style style = sVGAndroidRenderer$RendererState.style;
        float floatValue = (z ? style.fillOpacity : style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = sVGAndroidRenderer$RendererState.style.color.colour;
        }
        int colourWithOpacity = colourWithOpacity(floatValue, i);
        if (z) {
            sVGAndroidRenderer$RendererState.fillPaint.setColor(colourWithOpacity);
        } else {
            sVGAndroidRenderer$RendererState.strokePaint.setColor(colourWithOpacity);
        }
    }

    public static Task zzK(Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            return Room.forException(exception instanceof ApiException ? (ApiException) exception : exception instanceof zzbua ? zzie.zzb((zzbua) exception) : ((exception instanceof ExecutionException) && (exception.getCause() instanceof zzbua)) ? zzie.zzb((zzbua) exception.getCause()) : new ApiException(new Status(13, exception.toString(), null, null)));
        }
        return task;
    }

    public t a(InputSource inputSource, o oVar) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            return a(a(newInstance.newDocumentBuilder(), inputSource), inputSource.getSystemId(), oVar);
        } catch (IOException e) {
            throw new q0(e.getMessage());
        } catch (ParserConfigurationException e2) {
            throw new q0(e2.getMessage());
        } catch (SAXException e3) {
            throw new q0(e3.getMessage());
        }
    }

    public void addTimelineForMediaPeriodId(StatusLine statusLine, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Timeline timeline) {
        if (mediaSource$MediaPeriodId == null) {
            return;
        }
        if (timeline.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid) != -1) {
            statusLine.put(mediaSource$MediaPeriodId, timeline);
            return;
        }
        Timeline timeline2 = (Timeline) ((RegularImmutableMap) this.c).get(mediaSource$MediaPeriodId);
        if (timeline2 != null) {
            statusLine.put(mediaSource$MediaPeriodId, timeline2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object buildCardStatus(SponseeWalletSnapshot sponseeWalletSnapshot, ContinuationImpl continuationImpl) {
        DependentCardControlStatusRequestHandler$buildCardStatus$1 dependentCardControlStatusRequestHandler$buildCardStatus$1;
        int i;
        int i2;
        ApiResult apiResult;
        Object obj;
        SponseeWalletSnapshot sponseeWalletSnapshot2 = sponseeWalletSnapshot;
        if (continuationImpl instanceof DependentCardControlStatusRequestHandler$buildCardStatus$1) {
            dependentCardControlStatusRequestHandler$buildCardStatus$1 = (DependentCardControlStatusRequestHandler$buildCardStatus$1) continuationImpl;
            int i3 = dependentCardControlStatusRequestHandler$buildCardStatus$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                dependentCardControlStatusRequestHandler$buildCardStatus$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = dependentCardControlStatusRequestHandler$buildCardStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentCardControlStatusRequestHandler$buildCardStatus$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    CashAppCard cashAppCard = sponseeWalletSnapshot2.card;
                    List list = sponseeWalletSnapshot2.sponseeTags;
                    if (cashAppCard == null || !sponseeWalletSnapshot2.isCardActivated) {
                        return new DependentControlStatus.Loaded.LoadedCardControl(6, list, false, false);
                    }
                    boolean z = !sponseeWalletSnapshot2.isCardLockedBySponsor;
                    if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.f)).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenCardLimits.INSTANCE)).enabled()) {
                        return new DependentControlStatus.Loaded.LoadedCardControl(6, list, z, true);
                    }
                    AegisService aegisService = (AegisService) this.i;
                    GetCustomLimitsRequest getCustomLimitsRequest = new GetCustomLimitsRequest((String) this.a, ByteString.EMPTY);
                    dependentCardControlStatusRequestHandler$buildCardStatus$1.L$0 = sponseeWalletSnapshot2;
                    dependentCardControlStatusRequestHandler$buildCardStatus$1.I$0 = z ? 1 : 0;
                    dependentCardControlStatusRequestHandler$buildCardStatus$1.label = 1;
                    Object customLimits = aegisService.getCustomLimits(getCustomLimitsRequest, dependentCardControlStatusRequestHandler$buildCardStatus$1);
                    if (customLimits == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = customLimits;
                    i2 = z ? 1 : 0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = dependentCardControlStatusRequestHandler$buildCardStatus$1.I$0;
                    sponseeWalletSnapshot2 = dependentCardControlStatusRequestHandler$buildCardStatus$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                apiResult = (ApiResult) obj2;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return new DependentControlStatus.Loaded.LoadedCardControl(6, sponseeWalletSnapshot2.sponseeTags, i2 != 0, true);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) ((ApiResult.Success) apiResult).response;
                Iterator it = getCustomLimitsResponse.custom_limits.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((CustomLimit) obj).f1242type == CustomLimit.LimitType.LIMIT_TYPE_SPONSORED_CARD_SPEND_AMOUNT_30_DAY) {
                        break;
                    }
                }
                CustomLimit customLimit = (CustomLimit) obj;
                return new DependentControlStatus.Loaded.LoadedCardControl(i2 != 0, getCustomLimitsResponse.custom_card_spend_limit_30_day_presets, customLimit != null ? customLimit.max : null, new Money(getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount, CurrencyCode.USD, 4), customLimit != null ? customLimit.remaining_usage : null, true, sponseeWalletSnapshot2.sponseeTags);
            }
        }
        dependentCardControlStatusRequestHandler$buildCardStatus$1 = new DependentCardControlStatusRequestHandler$buildCardStatus$1(this, continuationImpl);
        Object obj22 = dependentCardControlStatusRequestHandler$buildCardStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentCardControlStatusRequestHandler$buildCardStatus$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path objectToPath;
        SVG.SvgElementBase resolveIRI = svgElement.document.resolveIRI(((SVGAndroidRenderer$RendererState) this.c).style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", ((SVGAndroidRenderer$RendererState) this.c).style.clipPath);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        ((Stack) this.h).push((SVGAndroidRenderer$RendererState) this.c);
        this.c = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVG.SvgElement) && (objectToPath = objectToPath((SVG.SvgElement) svgObject, true)) != null) {
                path.op(objectToPath, Path.Op.UNION);
            }
        }
        if (((SVGAndroidRenderer$RendererState) this.c).style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path calculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (calculateClipPath != null) {
                path.op(calculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
        return path;
    }

    public float calculateTextWidth(SVG.TextContainer textContainer) {
        SVGAndroidRenderer$TextWidthCalculator sVGAndroidRenderer$TextWidthCalculator = new SVGAndroidRenderer$TextWidthCalculator(this);
        enumerateTextSpans(textContainer, sVGAndroidRenderer$TextWidthCalculator);
        return sVGAndroidRenderer$TextWidthCalculator.x;
    }

    public void checkAndFilterMappingResultForSensitiveData(HashMap hashMap) {
        HashMap hashMap2 = (HashMap) this.c;
        HashMap hashMap3 = (HashMap) this.b;
        Iterator it = new ArrayList(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.contains("Passwords.Password")) {
                if (shouldShowPasswordPrompt) {
                    hashMap3.put(str, (String) hashMap.get(str));
                }
                if (shouldShowPasswordPrompt || !shouldCapturePasswordValue) {
                    hashMap.remove(str);
                }
            } else if (str.contains("CreditCards.CreditCard") && !str.endsWith(".Type")) {
                if (shouldShowCreditCardPrompt) {
                    hashMap2.put(str, (String) hashMap.get(str));
                }
                if (shouldShowCreditCardPrompt || !shouldCaptureCreditCardValue) {
                    hashMap.remove(str);
                }
            }
        }
        n.b bVar = (n.b) this.a;
        if (bVar != null) {
            CaptureFieldsMappingService captureFieldsMappingService = (CaptureFieldsMappingService) bVar.b;
            captureFieldsMappingService.mProfileStore.setData(hashMap2);
            captureFieldsMappingService.mProfileStore.store();
        }
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        n.b bVar2 = (n.b) this.a;
        if (bVar2 != null) {
            CaptureFieldsMappingService captureFieldsMappingService2 = (CaptureFieldsMappingService) bVar2.b;
            captureFieldsMappingService2.mProfileStore.setData(hashMap3);
            captureFieldsMappingService2.mProfileStore.store();
        }
        if (hashMap3 != null) {
            hashMap3.clear();
        }
    }

    public void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path calculateClipPath;
        if (((SVGAndroidRenderer$RendererState) this.c).style.clipPath == null || (calculateClipPath = calculateClipPath(svgElement, box)) == null) {
            return;
        }
        ((Canvas) this.a).clipPath(calculateClipPath);
    }

    public void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        SVG.SvgPaint svgPaint = ((SVGAndroidRenderer$RendererState) this.c).style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) svgPaint);
        }
        SVG.SvgPaint svgPaint2 = ((SVGAndroidRenderer$RendererState) this.c).style.stroke;
        if (svgPaint2 instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) svgPaint2);
        }
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        return FlowStarter.startFlow$default((FlowStarter) this.b, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.f, null, ClientScenario.INITIATE_BITCOIN_WITHDRAWAL, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        float floatValue;
        float f;
        float floatValue2;
        float f2;
        float floatValue3;
        float floatValue4;
        float floatValue5;
        float floatValue6;
        SVG.SvgElementBase resolveIRI = ((SVG) this.b).resolveIRI(paintReference.href);
        if (resolveIRI == null) {
            error("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.href);
            SVG.SvgPaint svgPaint = paintReference.fallback;
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) this.c;
            if (svgPaint != null) {
                setPaintColour(sVGAndroidRenderer$RendererState, z, svgPaint);
                return;
            } else if (z) {
                sVGAndroidRenderer$RendererState.hasFill = false;
                return;
            } else {
                sVGAndroidRenderer$RendererState.hasStroke = false;
                return;
            }
        }
        boolean z2 = resolveIRI instanceof SVG.SvgLinearGradient;
        SVG.Colour colour = SVG.Colour.BLACK;
        if (z2) {
            SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) resolveIRI;
            String str = svgLinearGradient.href;
            if (str != null) {
                fillInChainedGradientFields(svgLinearGradient, str);
            }
            Boolean bool = svgLinearGradient.gradientUnitsAreUser;
            Object[] objArr = bool != null && bool.booleanValue();
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) this.c;
            Paint paint = z ? sVGAndroidRenderer$RendererState2.fillPaint : sVGAndroidRenderer$RendererState2.strokePaint;
            if (objArr == true) {
                SVG.Box box2 = sVGAndroidRenderer$RendererState2.viewBox;
                if (box2 == null) {
                    box2 = sVGAndroidRenderer$RendererState2.viewPort;
                }
                SVG.Length length = svgLinearGradient.x1;
                floatValue3 = length != null ? length.floatValueX(this) : RecyclerView.DECELERATION_RATE;
                SVG.Length length2 = svgLinearGradient.y1;
                floatValue4 = length2 != null ? length2.floatValueY(this) : RecyclerView.DECELERATION_RATE;
                f2 = RecyclerView.DECELERATION_RATE;
                SVG.Length length3 = svgLinearGradient.x2;
                floatValue5 = length3 != null ? length3.floatValueX(this) : box2.width;
                SVG.Length length4 = svgLinearGradient.y2;
                if (length4 != null) {
                    floatValue6 = length4.floatValueY(this);
                }
                floatValue6 = f2;
            } else {
                f2 = RecyclerView.DECELERATION_RATE;
                SVG.Length length5 = svgLinearGradient.x1;
                floatValue3 = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
                SVG.Length length6 = svgLinearGradient.y1;
                floatValue4 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
                SVG.Length length7 = svgLinearGradient.x2;
                floatValue5 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
                SVG.Length length8 = svgLinearGradient.y2;
                if (length8 != null) {
                    floatValue6 = length8.floatValue(this, 1.0f);
                }
                floatValue6 = f2;
            }
            float f3 = floatValue4;
            float f4 = floatValue5;
            float f5 = floatValue6;
            float f6 = floatValue3;
            statePush();
            this.c = findInheritFromAncestorState(svgLinearGradient);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(box.width, box.height);
            }
            Matrix matrix2 = svgLinearGradient.gradientTransform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = svgLinearGradient.children.size();
            if (size == 0) {
                statePop();
                SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState3 = (SVGAndroidRenderer$RendererState) this.c;
                if (z) {
                    sVGAndroidRenderer$RendererState3.hasFill = false;
                    return;
                } else {
                    sVGAndroidRenderer$RendererState3.hasStroke = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = svgLinearGradient.children.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                SVG.Stop stop = (SVG.Stop) ((SVG.SvgObject) it.next());
                Float f8 = stop.offset;
                float floatValue7 = f8 != null ? f8.floatValue() : f2;
                if (i == 0 || floatValue7 >= f7) {
                    fArr[i] = floatValue7;
                    f7 = floatValue7;
                } else {
                    fArr[i] = f7;
                }
                statePush();
                updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, stop);
                SVG.Style style = ((SVGAndroidRenderer$RendererState) this.c).style;
                SVG.Colour colour2 = (SVG.Colour) style.stopColor;
                if (colour2 == null) {
                    colour2 = colour;
                }
                iArr[i] = colourWithOpacity(style.stopOpacity.floatValue(), colour2.colour);
                i++;
                statePop();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i2 = svgLinearGradient.spreadMethod;
            if (i2 != 0) {
                if (i2 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i2 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            statePop();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue8 = (int) (((SVGAndroidRenderer$RendererState) this.c).style.fillOpacity.floatValue() * 256.0f);
            paint.setAlpha(floatValue8 >= 0 ? floatValue8 > 255 ? 255 : floatValue8 : 0);
            return;
        }
        if (!(resolveIRI instanceof SVG.SvgRadialGradient)) {
            if (resolveIRI instanceof SVG.SolidColor) {
                SVG.SolidColor solidColor = (SVG.SolidColor) resolveIRI;
                SVG.Style style2 = solidColor.baseStyle;
                if (z) {
                    if (isSpecified(style2, 2147483648L)) {
                        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState4 = (SVGAndroidRenderer$RendererState) this.c;
                        SVG.Style style3 = sVGAndroidRenderer$RendererState4.style;
                        SVG.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
                        style3.fill = svgPaint2;
                        sVGAndroidRenderer$RendererState4.hasFill = svgPaint2 != null;
                    }
                    if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                        ((SVGAndroidRenderer$RendererState) this.c).style.fillOpacity = solidColor.baseStyle.solidOpacity;
                    }
                    if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState5 = (SVGAndroidRenderer$RendererState) this.c;
                        setPaintColour(sVGAndroidRenderer$RendererState5, z, sVGAndroidRenderer$RendererState5.style.fill);
                        return;
                    }
                    return;
                }
                if (isSpecified(style2, 2147483648L)) {
                    SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState6 = (SVGAndroidRenderer$RendererState) this.c;
                    SVG.Style style4 = sVGAndroidRenderer$RendererState6.style;
                    SVG.SvgPaint svgPaint3 = solidColor.baseStyle.solidColor;
                    style4.stroke = svgPaint3;
                    sVGAndroidRenderer$RendererState6.hasStroke = svgPaint3 != null;
                }
                if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                    ((SVGAndroidRenderer$RendererState) this.c).style.strokeOpacity = solidColor.baseStyle.solidOpacity;
                }
                if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                    SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState7 = (SVGAndroidRenderer$RendererState) this.c;
                    setPaintColour(sVGAndroidRenderer$RendererState7, z, sVGAndroidRenderer$RendererState7.style.stroke);
                    return;
                }
                return;
            }
            return;
        }
        SVG.SvgRadialGradient svgRadialGradient = (SVG.SvgRadialGradient) resolveIRI;
        String str2 = svgRadialGradient.href;
        if (str2 != null) {
            fillInChainedGradientFields(svgRadialGradient, str2);
        }
        Boolean bool2 = svgRadialGradient.gradientUnitsAreUser;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState8 = (SVGAndroidRenderer$RendererState) this.c;
        Paint paint2 = z ? sVGAndroidRenderer$RendererState8.fillPaint : sVGAndroidRenderer$RendererState8.strokePaint;
        if (objArr2 == true) {
            SVG.Length length9 = new SVG.Length(50.0f, 9);
            SVG.Length length10 = svgRadialGradient.cx;
            float floatValueX = length10 != null ? length10.floatValueX(this) : length9.floatValueX(this);
            SVG.Length length11 = svgRadialGradient.cy;
            floatValue = length11 != null ? length11.floatValueY(this) : length9.floatValueY(this);
            SVG.Length length12 = svgRadialGradient.r;
            floatValue2 = length12 != null ? length12.floatValue(this) : length9.floatValue(this);
            f = floatValueX;
        } else {
            SVG.Length length13 = svgRadialGradient.cx;
            float floatValue9 = length13 != null ? length13.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length14 = svgRadialGradient.cy;
            floatValue = length14 != null ? length14.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length15 = svgRadialGradient.r;
            f = floatValue9;
            floatValue2 = length15 != null ? length15.floatValue(this, 1.0f) : 0.5f;
        }
        float f9 = floatValue;
        statePush();
        this.c = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(box.minX, box.minY);
            matrix3.preScale(box.width, box.height);
        }
        Matrix matrix4 = svgRadialGradient.gradientTransform;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = svgRadialGradient.children.size();
        if (size2 == 0) {
            statePop();
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState9 = (SVGAndroidRenderer$RendererState) this.c;
            if (z) {
                sVGAndroidRenderer$RendererState9.hasFill = false;
                return;
            } else {
                sVGAndroidRenderer$RendererState9.hasStroke = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = svgRadialGradient.children.iterator();
        int i3 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            SVG.Stop stop2 = (SVG.Stop) ((SVG.SvgObject) it2.next());
            Float f11 = stop2.offset;
            float floatValue10 = f11 != null ? f11.floatValue() : 0.0f;
            if (i3 == 0 || floatValue10 >= f10) {
                fArr2[i3] = floatValue10;
                f10 = floatValue10;
            } else {
                fArr2[i3] = f10;
            }
            statePush();
            updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, stop2);
            SVG.Style style5 = ((SVGAndroidRenderer$RendererState) this.c).style;
            SVG.Colour colour3 = (SVG.Colour) style5.stopColor;
            if (colour3 == null) {
                colour3 = colour;
            }
            iArr2[i3] = colourWithOpacity(style5.stopOpacity.floatValue(), colour3.colour);
            i3++;
            statePop();
        }
        if (floatValue2 == RecyclerView.DECELERATION_RATE || size2 == 1) {
            statePop();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i4 = svgRadialGradient.spreadMethod;
        if (i4 != 0) {
            if (i4 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i4 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        statePop();
        RadialGradient radialGradient = new RadialGradient(f, f9, floatValue2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue11 = (int) (((SVGAndroidRenderer$RendererState) this.c).style.fillOpacity.floatValue() * 256.0f);
        paint2.setAlpha(floatValue11 >= 0 ? floatValue11 > 255 ? 255 : floatValue11 : 0);
    }

    public boolean display() {
        Boolean bool = ((SVGAndroidRenderer$RendererState) this.c).style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doFilledPath(SVG.SvgElement svgElement, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        boolean z2;
        float floor;
        float maxY;
        boolean pushLayer;
        float f6;
        float f7;
        Canvas canvas = (Canvas) this.a;
        SVG.SvgPaint svgPaint = ((SVGAndroidRenderer$RendererState) this.c).style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            SVG.SvgElementBase resolveIRI = ((SVG) this.b).resolveIRI(((SVG.PaintReference) svgPaint).href);
            if (resolveIRI instanceof SVG.Pattern) {
                SVG.Pattern pattern = (SVG.Pattern) resolveIRI;
                Boolean bool = pattern.patternUnitsAreUser;
                boolean z3 = bool != null && bool.booleanValue();
                String str = pattern.href;
                if (str != null) {
                    fillInChainedPatternFields(pattern, str);
                }
                SVG.Length length = pattern.x;
                if (z3) {
                    f2 = length != null ? length.floatValueX(this) : 0.0f;
                    SVG.Length length2 = pattern.y;
                    f3 = length2 != null ? length2.floatValueY(this) : 0.0f;
                    SVG.Length length3 = pattern.width;
                    f4 = length3 != null ? length3.floatValueX(this) : 0.0f;
                    SVG.Length length4 = pattern.height;
                    f = length4 != null ? length4.floatValueY(this) : 0.0f;
                } else {
                    float floatValue = length != null ? length.floatValue(this, 1.0f) : 0.0f;
                    SVG.Length length5 = pattern.y;
                    float floatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
                    SVG.Length length6 = pattern.width;
                    float floatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
                    SVG.Length length7 = pattern.height;
                    float floatValue4 = length7 != null ? length7.floatValue(this, 1.0f) : 0.0f;
                    SVG.Box box = svgElement.boundingBox;
                    float f8 = box.minX;
                    float f9 = box.width;
                    float f10 = (floatValue * f9) + f8;
                    float f11 = box.minY;
                    float f12 = box.height;
                    float f13 = floatValue3 * f9;
                    f = floatValue4 * f12;
                    f2 = f10;
                    f3 = (floatValue2 * f12) + f11;
                    f4 = f13;
                }
                if (f4 == RecyclerView.DECELERATION_RATE || f == RecyclerView.DECELERATION_RATE) {
                    return;
                }
                PreserveAspectRatio preserveAspectRatio = pattern.preserveAspectRatio;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                statePush();
                canvas.clipPath(path);
                SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = new SVGAndroidRenderer$RendererState();
                updateStyle(sVGAndroidRenderer$RendererState, SVG.Style.getDefaultStyle());
                sVGAndroidRenderer$RendererState.style.overflow = Boolean.FALSE;
                findInheritFromAncestorState(pattern, sVGAndroidRenderer$RendererState);
                this.c = sVGAndroidRenderer$RendererState;
                SVG.Box box2 = svgElement.boundingBox;
                Matrix matrix = pattern.patternTransform;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (pattern.patternTransform.invert(matrix2)) {
                        SVG.Box box3 = svgElement.boundingBox;
                        float f14 = box3.minX;
                        float f15 = box3.minY;
                        float maxX = box3.maxX();
                        z = true;
                        SVG.Box box4 = svgElement.boundingBox;
                        z2 = false;
                        float f16 = box4.minY;
                        float maxX2 = box4.maxX();
                        float maxY2 = svgElement.boundingBox.maxY();
                        SVG.Box box5 = svgElement.boundingBox;
                        f5 = f2;
                        float[] fArr = {f14, f15, maxX, f16, maxX2, maxY2, box5.minX, box5.maxY()};
                        matrix2.mapPoints(fArr);
                        float f17 = fArr[0];
                        float f18 = fArr[1];
                        RectF rectF = new RectF(f17, f18, f17, f18);
                        for (int i = 2; i <= 6; i += 2) {
                            float f19 = fArr[i];
                            if (f19 < rectF.left) {
                                rectF.left = f19;
                            }
                            if (f19 > rectF.right) {
                                rectF.right = f19;
                            }
                            float f20 = fArr[i + 1];
                            if (f20 < rectF.top) {
                                rectF.top = f20;
                            }
                            if (f20 > rectF.bottom) {
                                rectF.bottom = f20;
                            }
                        }
                        float f21 = rectF.left;
                        float f22 = rectF.top;
                        box2 = new SVG.Box(f21, f22, rectF.right - f21, rectF.bottom - f22);
                        float floor2 = (((float) Math.floor((box2.minX - f5) / f4)) * f4) + f5;
                        float maxX3 = box2.maxX();
                        maxY = box2.maxY();
                        SVG.Box box6 = new SVG.Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4, f);
                        pushLayer = pushLayer();
                        for (floor = (((float) Math.floor((box2.minY - f3) / f)) * f) + f3; floor < maxY; floor += f) {
                            float f23 = floor2;
                            while (f23 < maxX3) {
                                box6.minX = f23;
                                box6.minY = floor;
                                statePush();
                                if (((SVGAndroidRenderer$RendererState) this.c).style.overflow.booleanValue()) {
                                    f6 = maxY;
                                    f7 = floor2;
                                } else {
                                    f6 = maxY;
                                    f7 = floor2;
                                    setClipRect(box6.minX, box6.minY, box6.width, box6.height);
                                }
                                SVG.Box box7 = pattern.viewBox;
                                if (box7 != null) {
                                    canvas.concat(calculateViewBoxTransform(box6, box7, preserveAspectRatio));
                                } else {
                                    Boolean bool2 = pattern.patternContentUnitsAreUser;
                                    boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                                    canvas.translate(f23, floor);
                                    if (!z4) {
                                        SVG.Box box8 = svgElement.boundingBox;
                                        canvas.scale(box8.width, box8.height);
                                    }
                                }
                                Iterator it = pattern.children.iterator();
                                while (it.hasNext()) {
                                    render((SVG.SvgObject) it.next());
                                }
                                statePop();
                                f23 += f4;
                                maxY = f6;
                                floor2 = f7;
                            }
                        }
                        if (pushLayer) {
                            popLayer(pattern.boundingBox);
                        }
                        statePop();
                        return;
                    }
                }
                f5 = f2;
                z = true;
                z2 = false;
                float floor22 = (((float) Math.floor((box2.minX - f5) / f4)) * f4) + f5;
                float maxX32 = box2.maxX();
                maxY = box2.maxY();
                SVG.Box box62 = new SVG.Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4, f);
                pushLayer = pushLayer();
                while (floor < maxY) {
                }
                if (pushLayer) {
                }
                statePop();
                return;
            }
        }
        canvas.drawPath(path, ((SVGAndroidRenderer$RendererState) this.c).fillPaint);
    }

    public void doStroke(Path path) {
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) this.c;
        int i = sVGAndroidRenderer$RendererState.style.vectorEffect;
        Canvas canvas = (Canvas) this.a;
        if (i != 2) {
            canvas.drawPath(path, sVGAndroidRenderer$RendererState.strokePaint);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((SVGAndroidRenderer$RendererState) this.c).strokePaint.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((SVGAndroidRenderer$RendererState) this.c).strokePaint);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public Call encodeCall$zipline_release(InternalCall internalCall, ZiplineService ziplineService) {
        ziplineService.getClass();
        ArrayList arrayList = (ArrayList) this.i;
        arrayList.clear();
        JsonImpl jsonImpl = ((Endpoint) this.a).json;
        ArgsListSerializer argsListSerializer = (ArgsListSerializer) this.b;
        jsonImpl.getClass();
        argsListSerializer.getClass();
        Call call = new Call(internalCall.serviceName, ziplineService, internalCall.function, internalCall.args, jsonImpl.encodeToString(argsListSerializer, internalCall), arrayList);
        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = (n3$$ExternalSyntheticLambda0) this.h;
        if (n3__externalsyntheticlambda0 != null) {
            n3__externalsyntheticlambda0.invoke(call);
            this.h = null;
        }
        return call;
    }

    public SVG encodeResultOrCallback$zipline_release(SuspendingZiplineFunction suspendingZiplineFunction, ResultOrCallback resultOrCallback) {
        ArrayList arrayList = (ArrayList) this.i;
        arrayList.clear();
        JsonImpl jsonImpl = ((Endpoint) this.a).json;
        ArgsListSerializer argsListSerializer = suspendingZiplineFunction.resultOrCallbackSerializer;
        argsListSerializer.getClass();
        jsonImpl.getClass();
        return new SVG(resultOrCallback, jsonImpl.encodeToString(argsListSerializer, resultOrCallback), arrayList);
    }

    public void enumerateTextSpans(SVG.TextContainer textContainer, zzhh zzhhVar) {
        float f;
        float f2;
        float f3;
        int anchorPosition;
        if (display()) {
            Iterator it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
                if (svgObject instanceof SVG.TextSequence) {
                    zzhhVar.processText(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
                } else if (zzhhVar.doTextContainer((SVG.TextContainer) svgObject)) {
                    boolean z2 = svgObject instanceof SVG.TextPath;
                    final float f4 = RecyclerView.DECELERATION_RATE;
                    if (z2) {
                        statePush();
                        SVG.TextPath textPath = (SVG.TextPath) svgObject;
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, textPath);
                        if (display() && visible()) {
                            SVG.SvgElementBase resolveIRI = textPath.document.resolveIRI(textPath.href);
                            if (resolveIRI == null) {
                                error("TextPath reference '%s' not found", textPath.href);
                            } else {
                                SVG.Path path = (SVG.Path) resolveIRI;
                                SVGAndroidRenderer$PathConverter sVGAndroidRenderer$PathConverter = new SVGAndroidRenderer$PathConverter(path.d);
                                Matrix matrix = path.transform;
                                final Path path2 = sVGAndroidRenderer$PathConverter.path;
                                if (matrix != null) {
                                    path2.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path2, false);
                                SVG.Length length = textPath.startOffset;
                                if (length != null) {
                                    f4 = length.floatValue(this, pathMeasure.getLength());
                                }
                                int anchorPosition2 = getAnchorPosition();
                                if (anchorPosition2 != 1) {
                                    float calculateTextWidth = calculateTextWidth(textPath);
                                    if (anchorPosition2 == 2) {
                                        calculateTextWidth /= 2.0f;
                                    }
                                    f4 -= calculateTextWidth;
                                }
                                checkForGradientsAndPatterns(textPath.textRoot);
                                boolean pushLayer = pushLayer();
                                enumerateTextSpans(textPath, new SVGAndroidRenderer$PlainTextDrawer(path2, f4) { // from class: com.caverock.androidsvg.SVGAndroidRenderer$PathTextDrawer
                                    public final Path path;

                                    {
                                        super(e0.this, f4, RecyclerView.DECELERATION_RATE);
                                        this.path = path2;
                                    }

                                    @Override // com.caverock.androidsvg.SVGAndroidRenderer$PlainTextDrawer, com.google.android.gms.internal.mlkit_vision_common.zzhh
                                    public final void processText(String str) {
                                        e0 e0Var = e0.this;
                                        if (e0Var.visible()) {
                                            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
                                            if (sVGAndroidRenderer$RendererState.hasFill) {
                                                ((Canvas) e0Var.a).drawTextOnPath(str, this.path, this.x, this.y, sVGAndroidRenderer$RendererState.fillPaint);
                                            }
                                            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) e0Var.c;
                                            if (sVGAndroidRenderer$RendererState2.hasStroke) {
                                                ((Canvas) e0Var.a).drawTextOnPath(str, this.path, this.x, this.y, sVGAndroidRenderer$RendererState2.strokePaint);
                                            }
                                        }
                                        this.x = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.measureText(str) + this.x;
                                    }
                                });
                                if (pushLayer) {
                                    popLayer(textPath.boundingBox);
                                }
                            }
                        }
                        statePop();
                    } else if (svgObject instanceof SVG.TSpan) {
                        statePush();
                        SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, tSpan);
                        if (display()) {
                            ArrayList arrayList = tSpan.x;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = zzhhVar instanceof SVGAndroidRenderer$PlainTextDrawer;
                            if (z4) {
                                float floatValueX = !z3 ? ((SVGAndroidRenderer$PlainTextDrawer) zzhhVar).x : ((SVG.Length) tSpan.x.get(0)).floatValueX(this);
                                ArrayList arrayList2 = tSpan.y;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((SVGAndroidRenderer$PlainTextDrawer) zzhhVar).y : ((SVG.Length) tSpan.y.get(0)).floatValueY(this);
                                ArrayList arrayList3 = tSpan.dx;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) tSpan.dx.get(0)).floatValueX(this);
                                ArrayList arrayList4 = tSpan.dy;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f4 = ((SVG.Length) tSpan.dy.get(0)).floatValueY(this);
                                }
                                float f5 = floatValueX;
                                f = f4;
                                f4 = f5;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z3 && (anchorPosition = getAnchorPosition()) != 1) {
                                float calculateTextWidth2 = calculateTextWidth(tSpan);
                                if (anchorPosition == 2) {
                                    calculateTextWidth2 /= 2.0f;
                                }
                                f4 -= calculateTextWidth2;
                            }
                            checkForGradientsAndPatterns(tSpan.textRoot);
                            if (z4) {
                                SVGAndroidRenderer$PlainTextDrawer sVGAndroidRenderer$PlainTextDrawer = (SVGAndroidRenderer$PlainTextDrawer) zzhhVar;
                                sVGAndroidRenderer$PlainTextDrawer.x = f4 + f3;
                                sVGAndroidRenderer$PlainTextDrawer.y = f2 + f;
                            }
                            boolean pushLayer2 = pushLayer();
                            enumerateTextSpans(tSpan, zzhhVar);
                            if (pushLayer2) {
                                popLayer(tSpan.boundingBox);
                            }
                        }
                        statePop();
                    } else if (svgObject instanceof SVG.TRef) {
                        statePush();
                        SVG.TRef tRef = (SVG.TRef) svgObject;
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, tRef);
                        if (display()) {
                            checkForGradientsAndPatterns(tRef.textRoot);
                            SVG.SvgElementBase resolveIRI2 = svgObject.document.resolveIRI(tRef.href);
                            if (resolveIRI2 == null || !(resolveIRI2 instanceof SVG.TextContainer)) {
                                error("Tref reference '%s' not found", tRef.href);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                extractRawText((SVG.TextContainer) resolveIRI2, sb);
                                if (sb.length() > 0) {
                                    zzhhVar.processText(sb.toString());
                                }
                            }
                        }
                        statePop();
                    }
                }
                z = false;
            }
        }
    }

    public void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
            if (svgObject instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) svgObject, sb);
            } else if (svgObject instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public void findInheritFromAncestorState(SVG.SvgObject svgObject, SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            Object obj = svgObject.parent;
            if (obj == null) {
                break;
            } else {
                svgObject = (SVG.SvgObject) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            updateStyleForElement(sVGAndroidRenderer$RendererState, (SVG.SvgElementBase) it.next());
        }
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) this.c;
        sVGAndroidRenderer$RendererState.viewBox = sVGAndroidRenderer$RendererState2.viewBox;
        sVGAndroidRenderer$RendererState.viewPort = sVGAndroidRenderer$RendererState2.viewPort;
    }

    public int getAnchorPosition() {
        int i;
        SVG.Style style = ((SVGAndroidRenderer$RendererState) this.c).style;
        return (style.direction == 1 || (i = style.textAnchor) == 2) ? style.textAnchor : i == 1 ? 3 : 1;
    }

    public int getCapacity() {
        int maxImages;
        Threads.checkMainThread();
        TransactorKt.checkState("The ImageReader is not initialized.", ((ProfileStore_) this.b) != null);
        ProfileStore_ profileStore_ = (ProfileStore_) this.b;
        synchronized (profileStore_.passcode) {
            maxImages = ((ImageReaderProxy) profileStore_.authStore).getMaxImages() - profileStore_.runningVersion;
        }
        return maxImages;
    }

    public String getCorrectFormData(String str, String str2, String str3, Element element) {
        Element findLeafElementWithSuffix;
        if (str.equals("StreetName") && (findLeafElementWithSuffix = Element.findLeafElementWithSuffix("StreetType", element)) != null) {
            String typeFromStreetName = getTypeFromStreetName(str2, findLeafElementWithSuffix);
            String replace = (str2 == null || typeFromStreetName == null || "".equals(typeFromStreetName)) ? str2 : str2.replace(" ".concat(typeFromStreetName), "");
            if (str3.equals("StreetName")) {
                return replace;
            }
            if (str3.equals("StreetType")) {
                return typeFromStreetName;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDependentControlStatus(boolean z, ContinuationImpl continuationImpl) {
        DependentCardControlStatusRequestHandler$getDependentControlStatus$1 dependentCardControlStatusRequestHandler$getDependentControlStatus$1;
        int i;
        SponseeWalletSnapshot sponseeWalletSnapshot;
        if (continuationImpl instanceof DependentCardControlStatusRequestHandler$getDependentControlStatus$1) {
            dependentCardControlStatusRequestHandler$getDependentControlStatus$1 = (DependentCardControlStatusRequestHandler$getDependentControlStatus$1) continuationImpl;
            int i2 = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher = (SponseeWalletSnapshotFetcher) this.b;
                    String str = (String) this.a;
                    dependentCardControlStatusRequestHandler$getDependentControlStatus$1.Z$0 = z;
                    dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label = 1;
                    obj = sponseeWalletSnapshotFetcher.fetch(str, z, dependentCardControlStatusRequestHandler$getDependentControlStatus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) obj;
                        this.h = loadedCardControl;
                        return loadedCardControl;
                    }
                    z = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                sponseeWalletSnapshot = (SponseeWalletSnapshot) obj;
                if (sponseeWalletSnapshot != null) {
                    return null;
                }
                dependentCardControlStatusRequestHandler$getDependentControlStatus$1.Z$0 = z;
                dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label = 2;
                obj = buildCardStatus(sponseeWalletSnapshot, dependentCardControlStatusRequestHandler$getDependentControlStatus$1);
            }
        }
        dependentCardControlStatusRequestHandler$getDependentControlStatus$1 = new DependentCardControlStatusRequestHandler$getDependentControlStatus$1(this, continuationImpl);
        Object obj3 = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentCardControlStatusRequestHandler$getDependentControlStatus$1.label;
        if (i != 0) {
        }
        sponseeWalletSnapshot = (SponseeWalletSnapshot) obj3;
        if (sponseeWalletSnapshot != null) {
        }
    }

    public CreationExtrasKtxKt getDistributionMethod() {
        return (CreationExtrasKtxKt) this.f;
    }

    public String getExtension() {
        return (String) this.c;
    }

    public String getFileUrl() {
        return (String) this.a;
    }

    public String getLoadingText() {
        return (String) this.i;
    }

    public BlockerAction getRetryAction() {
        return (BlockerAction) this.h;
    }

    public String getTitle() {
        return (String) this.b;
    }

    public String getTypeFromStreetName(String str, Element element) {
        ArrayList arrayList = Schema_.getInstance_((Context) this.b).getElementType(element).listValues;
        for (String str2 : (String[]) arrayList.toArray(new String[arrayList.size()])) {
            if (str != null && str.endsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    @Override // com.fillr.browsersdk.model.FillrJNIBinding
    public String getWidgetInjectionJNI() {
        return "fillrCartInformationExtractionJNI";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Path makePathAndBoundingBox(SVG.Rect rect) {
        float floatValueX;
        float floatValueY;
        float min;
        float floatValueX2;
        float floatValueY2;
        float f;
        float f2;
        Path path;
        SVG.Length length = rect.rx;
        if (length == null && rect.ry == null) {
            floatValueX = 0.0f;
        } else {
            SVG.Length length2 = rect.ry;
            if (length == null) {
                floatValueX = length2.floatValueY(this);
            } else {
                if (length2 != null) {
                    floatValueX = length.floatValueX(this);
                    floatValueY = rect.ry.floatValueY(this);
                    min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
                    float min2 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
                    SVG.Length length3 = rect.x;
                    floatValueX2 = length3 == null ? length3.floatValueX(this) : 0.0f;
                    SVG.Length length4 = rect.y;
                    floatValueY2 = length4 == null ? length4.floatValueY(this) : 0.0f;
                    float floatValueX3 = rect.width.floatValueX(this);
                    float floatValueY3 = rect.height.floatValueY(this);
                    if (rect.boundingBox == null) {
                        rect.boundingBox = new SVG.Box(floatValueX2, floatValueY2, floatValueX3, floatValueY3);
                    }
                    f = floatValueX3 + floatValueX2;
                    f2 = floatValueY2 + floatValueY3;
                    path = new Path();
                    if (min != RecyclerView.DECELERATION_RATE || min2 == RecyclerView.DECELERATION_RATE) {
                        path.moveTo(floatValueX2, floatValueY2);
                        path.lineTo(f, floatValueY2);
                        path.lineTo(f, f2);
                        path.lineTo(floatValueX2, f2);
                        path.lineTo(floatValueX2, floatValueY2);
                    } else {
                        float f3 = min * 0.5522848f;
                        float f4 = 0.5522848f * min2;
                        float f5 = floatValueY2 + min2;
                        path.moveTo(floatValueX2, f5);
                        float f6 = f5 - f4;
                        float f7 = floatValueX2 + min;
                        float f8 = f7 - f3;
                        path.cubicTo(floatValueX2, f6, f8, floatValueY2, f7, floatValueY2);
                        float f9 = f - min;
                        path.lineTo(f9, floatValueY2);
                        float f10 = f9 + f3;
                        path.cubicTo(f10, floatValueY2, f, f6, f, f5);
                        float f11 = f2 - min2;
                        path.lineTo(f, f11);
                        float f12 = f11 + f4;
                        path.cubicTo(f, f12, f10, f2, f9, f2);
                        path.lineTo(f7, f2);
                        float f13 = floatValueX2;
                        path.cubicTo(f8, f2, f13, f12, floatValueX2, f11);
                        path.lineTo(f13, f5);
                    }
                    path.close();
                    return path;
                }
                floatValueX = length.floatValueX(this);
            }
        }
        floatValueY = floatValueX;
        min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
        float min22 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
        SVG.Length length32 = rect.x;
        if (length32 == null) {
        }
        SVG.Length length42 = rect.y;
        if (length42 == null) {
        }
        float floatValueX32 = rect.width.floatValueX(this);
        float floatValueY32 = rect.height.floatValueY(this);
        if (rect.boundingBox == null) {
        }
        f = floatValueX32 + floatValueX2;
        f2 = floatValueY2 + floatValueY32;
        path = new Path();
        if (min != RecyclerView.DECELERATION_RATE) {
        }
        path.moveTo(floatValueX2, floatValueY2);
        path.lineTo(f, floatValueY2);
        path.lineTo(f, f2);
        path.lineTo(floatValueX2, f2);
        path.lineTo(floatValueX2, floatValueY2);
        path.close();
        return path;
    }

    public SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float f = RecyclerView.DECELERATION_RATE;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) this.c;
        SVG.Box box = sVGAndroidRenderer$RendererState.viewBox;
        if (box == null) {
            box = sVGAndroidRenderer$RendererState.viewPort;
        }
        return new SVG.Box(floatValueX, f, length3 != null ? length3.floatValueX(this) : box.width, length4 != null ? length4.floatValueY(this) : box.height);
    }

    @Override // com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate
    public GrowToolsManagerViewModel models(Flow flow, Composer composer, int i) {
        String str;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.c;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-682764583);
        GrowToolsManagerState rememberManagerState = KClasses.rememberManagerState(gapComposer);
        RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = ((RealReceiveP2PAsBitcoinRepo) this.a).state;
        ReceiveP2PAsBitcoinState.Inactive inactive = ReceiveP2PAsBitcoinState.Inactive.INSTANCE;
        MutableState collectAsState = Updater.collectAsState(realGooglePayer$createWallet$$inlined$filter$1, inactive, null, gapComposer, 0, 2);
        boolean z = ((ReceiveP2PAsBitcoinState) collectAsState.getValue()) instanceof ReceiveP2PAsBitcoinState.Active;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState((ReceiveP2PAsBitcoinState) collectAsState.getValue(), gapComposer);
        ReceiveP2PAsBitcoinState receiveP2PAsBitcoinState = (ReceiveP2PAsBitcoinState) collectAsState.getValue();
        boolean changed = gapComposer.changed(rememberManagerState);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        Object obj = Composer.Companion.Empty;
        if (changed || rememberedValue == obj) {
            rememberedValue = new GrowToolsAutoInvestManager$models$1$1(rememberManagerState, continuation, 2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, receiveP2PAsBitcoinState, (Function2) rememberedValue);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.h).models(gapComposer, 0), gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changed2 = gapComposer.changed(rememberUpdatedState2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == obj) {
            rememberedValue2 = new ToastKt$Toast$7$1(rememberUpdatedState2, continuation, 12);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, this, rememberManagerState, (CoroutineScope) rememberedValue3, rememberUpdatedState, 4));
        ReceiveP2PAsBitcoinState receiveP2PAsBitcoinState2 = (ReceiveP2PAsBitcoinState) collectAsState.getValue();
        if (receiveP2PAsBitcoinState2 instanceof ReceiveP2PAsBitcoinState.Active) {
            String valueOf = String.valueOf(((ReceiveP2PAsBitcoinState.Active) receiveP2PAsBitcoinState2).allocationPercentage);
            valueOf.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.grow_tools_receive_p2p_as_bitcoin_target_description_on)).format(new Object[]{valueOf});
            str.getClass();
        } else {
            if (!Intrinsics.areEqual(receiveP2PAsBitcoinState2, ReceiveP2PAsBitcoinState.Paused.INSTANCE) && !Intrinsics.areEqual(receiveP2PAsBitcoinState2, inactive)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_target_description_off);
        }
        String str2 = str;
        final String str3 = z ? androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_target_description_off) : str2;
        final GrowToolsManagerViewModel.Loaded.Header.Target target = new GrowToolsManagerViewModel.Loaded.Header.Target(androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_target_name), str2, KClassifiers.bitcoinAvatar(), Icons.ContactAdd16, androidStringManager.get(R.string.grow_tools_change));
        GrowToolsManagerViewModel.Loaded buildModel = new OriginSpecificData(androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_title), androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_toggle_text), z, new OriginSpecificData.TargetData(target, str3) { // from class: com.squareup.cash.growtools.presenters.manager.receivep2pasbtc.GrowToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget
            public final String altDescription;
            public final GrowToolsManagerViewModel.Loaded.Header.Target target;

            {
                str3.getClass();
                this.target = target;
                this.altDescription = str3;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GrowToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget)) {
                    return false;
                }
                GrowToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget growToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget = (GrowToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget) obj2;
                return this.target.equals(growToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget.target) && Intrinsics.areEqual(this.altDescription, growToolsReceiveP2PAsBitcoinManager$ReceiveP2PAsBitcoinTarget.altDescription);
            }

            @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
            public final String getAltDescription() {
                return this.altDescription;
            }

            @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
            public final GrowToolsManagerViewModel.Loaded.Header.Target getTarget() {
                return this.target;
            }

            public final int hashCode() {
                return this.altDescription.hashCode() + (this.target.hashCode() * 31);
            }

            public final String toString() {
                return "ReceiveP2PAsBitcoinTarget(target=" + this.target + ", altDescription=" + this.altDescription + ")";
            }
        }, androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_toggle_off_dialog_message), androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_toggle_off_dialog_confirm_button)).buildModel(rememberManagerState, (UiCallbackModel) rememberUpdatedState2.getValue(), androidStringManager);
        gapComposer.end(false);
        return buildModel;
    }

    @Override // com.fillr.browsersdk.model.FillrJNIBinding
    public Object newJNIInstance(FillrWebView fillrWebView) {
        return new Object() { // from class: com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformationExtractionJNI
            @JavascriptInterface
            public void cartDetected(String str) {
                try {
                    e0.this.onCartDetected(new JSONObject(str));
                } catch (JSONException unused) {
                    SVG svg = Fillr.getInstance().fillrConfig;
                }
            }

            @JavascriptInterface
            public void versionDetected(String str) {
                SVG svg = Fillr.getInstance().fillrConfig;
                e0.this.h = str;
            }
        };
    }

    public Path objectToPath(SVG.SvgElement svgElement, boolean z) {
        Path path;
        Path path2;
        Path calculateClipPath;
        ((Stack) this.h).push((SVGAndroidRenderer$RendererState) this.c);
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = new SVGAndroidRenderer$RendererState((SVGAndroidRenderer$RendererState) this.c);
        this.c = sVGAndroidRenderer$RendererState;
        updateStyleForElement(sVGAndroidRenderer$RendererState, svgElement);
        if (!display() || !visible()) {
            this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgElementBase resolveIRI = svgElement.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
                return null;
            }
            if (!(resolveIRI instanceof SVG.SvgElement)) {
                this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
                return null;
            }
            path2 = objectToPath((SVG.SvgElement) resolveIRI, false);
            if (path2 != null) {
                if (use.boundingBox == null) {
                    use.boundingBox = calculatePathBounds(path2);
                }
                Matrix matrix = use.transform;
                if (matrix != null) {
                    path2.transform(matrix);
                }
                if (((SVGAndroidRenderer$RendererState) this.c).style.clipPath != null && (calculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
                    path2.op(calculateClipPath, Path.Op.INTERSECT);
                }
                this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
                return path2;
            }
            return null;
        }
        if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                SVGAndroidRenderer$PathConverter sVGAndroidRenderer$PathConverter = new SVGAndroidRenderer$PathConverter(((SVG.Path) svgElement).d);
                SVG.Box box = svgElement.boundingBox;
                Path path3 = sVGAndroidRenderer$PathConverter.path;
                if (box == null) {
                    svgElement.boundingBox = calculatePathBounds(path3);
                }
                path = path3;
            } else {
                path = svgElement instanceof SVG.Rect ? makePathAndBoundingBox((SVG.Rect) svgElement) : svgElement instanceof SVG.Circle ? makePathAndBoundingBox((SVG.Circle) svgElement) : svgElement instanceof SVG.Ellipse ? makePathAndBoundingBox((SVG.Ellipse) svgElement) : svgElement instanceof SVG.PolyLine ? makePathAndBoundingBox((SVG.PolyLine) svgElement) : null;
            }
            if (path != null) {
                if (graphicsElement.boundingBox == null) {
                    graphicsElement.boundingBox = calculatePathBounds(path);
                }
                Matrix matrix2 = graphicsElement.transform;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((SVGAndroidRenderer$RendererState) this.c).style.clipRule;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(svgElement instanceof SVG.Text)) {
            error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
            return null;
        }
        SVG.Text text = (SVG.Text) svgElement;
        ArrayList arrayList = text.x;
        float f = RecyclerView.DECELERATION_RATE;
        float floatValueX = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.Length) text.x.get(0)).floatValueX(this);
        ArrayList arrayList2 = text.y;
        float floatValueY = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.Length) text.y.get(0)).floatValueY(this);
        ArrayList arrayList3 = text.dx;
        float floatValueX2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) text.dx.get(0)).floatValueX(this);
        ArrayList arrayList4 = text.dy;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((SVG.Length) text.dy.get(0)).floatValueY(this);
        }
        if (((SVGAndroidRenderer$RendererState) this.c).style.textAnchor != 1) {
            float calculateTextWidth = calculateTextWidth(text);
            if (((SVGAndroidRenderer$RendererState) this.c).style.textAnchor == 2) {
                calculateTextWidth /= 2.0f;
            }
            floatValueX -= calculateTextWidth;
        }
        if (text.boundingBox == null) {
            SVGAndroidRenderer$PlainTextToPath sVGAndroidRenderer$PlainTextToPath = new SVGAndroidRenderer$PlainTextToPath(this, floatValueX, floatValueY);
            enumerateTextSpans(text, sVGAndroidRenderer$PlainTextToPath);
            Object obj = sVGAndroidRenderer$PlainTextToPath.textAsPath;
            RectF rectF = (RectF) obj;
            text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
        }
        path = new Path();
        enumerateTextSpans(text, new SVGAndroidRenderer$PlainTextToPath(this, floatValueX + floatValueX2, floatValueY + f, path));
        Matrix matrix3 = text.transform;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((SVGAndroidRenderer$RendererState) this.c).style.clipRule;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        path2 = path;
        if (((SVGAndroidRenderer$RendererState) this.c).style.clipPath != null) {
            path2.op(calculateClipPath, Path.Op.INTERSECT);
        }
        this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
        return path2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    public void onCartDetected(JSONObject jSONObject) {
        boolean z;
        JSONArray optJSONArray;
        String str;
        char c;
        int optInt;
        int optInt2;
        int optInt3;
        String optString = jSONObject.optString("page_url", "");
        String optString2 = jSONObject.optString("version", "");
        String optString3 = jSONObject.optString("currency", "");
        long optLong = jSONObject.optLong("timestamp", -1L);
        char c2 = 65535;
        String str2 = null;
        Integer valueOf = jSONObject.has("cart_total") ? Integer.valueOf(jSONObject.optInt("cart_total", -1)) : null;
        Integer valueOf2 = jSONObject.has("cart_total_qty") ? Integer.valueOf(jSONObject.optInt("cart_total_qty", -1)) : null;
        Integer valueOf3 = jSONObject.has("cart_subtotal") ? Integer.valueOf(jSONObject.optInt("cart_subtotal", -1)) : null;
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("product_list") && (optJSONArray = jSONObject.optJSONArray("product_list")) != null) {
            int i = 0;
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    str = str2;
                    c = c2;
                } else {
                    String optString4 = optJSONObject.optString("name", str2);
                    String optString5 = optJSONObject.optString("url", str2);
                    String optString6 = optJSONObject.optString("image_url", str2);
                    str = str2;
                    c = 65535;
                    arrayList.add(new FillrCartInformationExtraction$FillrCartProduct(optString4, optString5, optString6, (!optJSONObject.has("item_price") || (optInt3 = optJSONObject.optInt("item_price", -1)) < 0) ? str : Integer.valueOf(optInt3), (!optJSONObject.has("line_total") || (optInt2 = optJSONObject.optInt("line_total", -1)) < 0) ? str : Integer.valueOf(optInt2), (!optJSONObject.has("quantity") || (optInt = optJSONObject.optInt("quantity", -1)) < 0) ? str : Integer.valueOf(optInt)));
                }
                i++;
                c2 = c;
                str2 = str;
            }
        }
        ?? r24 = str2;
        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = new FillrCartInformationExtraction$FillrCartInformation(optString, valueOf, valueOf3, optString3, arrayList, optString2, valueOf2, optLong);
        fillrCartInformationExtraction$FillrCartInformation.json = jSONObject.toString();
        SVG svg = (SVG) this.a;
        if (svg == null) {
            SVG svg2 = Fillr.getInstance().fillrConfig;
        } else {
            AnalyticsEvent createEvent = svg.createEvent();
            createEvent.action = "Cart Detected";
            createEvent.setExtraInfo(jSONObject.toString());
            ((Box) svg.idToElementMap).sendEvent((Context) svg.cssRules, createEvent);
        }
        if (((RealFillrWebManager$$ExternalSyntheticLambda0) this.c) != null) {
            String optString7 = jSONObject.optString("view_id");
            HashMap hashMap = (HashMap) this.b;
            if (hashMap != null) {
                FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation2 = (FillrCartInformationExtraction$FillrCartInformation) hashMap.get(optString7);
                z = true;
                if (fillrCartInformationExtraction$FillrCartInformation2 == null) {
                    hashMap.put(optString7, fillrCartInformationExtraction$FillrCartInformation);
                } else {
                    boolean z2 = optLong - fillrCartInformationExtraction$FillrCartInformation2.currentTimestamp > 2000;
                    if (fillrCartInformationExtraction$FillrCartInformation2.equals(fillrCartInformationExtraction$FillrCartInformation) && !z2) {
                        z = false;
                    }
                    if (z) {
                        hashMap.put(optString7, fillrCartInformationExtraction$FillrCartInformation);
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                FillrWebView webViewForId = ((n1) this.f).getWebViewForId(optString7);
                RealFillrWebManager$$ExternalSyntheticLambda0 realFillrWebManager$$ExternalSyntheticLambda0 = (RealFillrWebManager$$ExternalSyntheticLambda0) this.c;
                webViewForId.mWebView.get();
                RealFillrWebManager realFillrWebManager = realFillrWebManager$$ExternalSyntheticLambda0.f$0;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r24;
                    }
                    arrayList2.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Item "), ((FillrCartInformationExtraction$FillrCartProduct) next).name));
                    i2 = i3;
                }
                MapsKt__MapsKt.toMutableMap(MapsKt__MapsKt.toMap(arrayList2)).put("Cart Total", String.valueOf(fillrCartInformationExtraction$FillrCartInformation.total));
                if (fillrCartInformationExtraction$FillrCartInformation.products.size() > 0) {
                    StateFlowKt.emitOrThrow(realFillrWebManager.lastDetectCartInfoFlow, fillrCartInformationExtraction$FillrCartInformation);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onFailure(BlockersData blockersData, Continuation continuation) {
        InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1 initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1;
        int i;
        String uuid;
        CryptoPayment cryptoPayment = (CryptoPayment) this.h;
        if (continuation instanceof InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1) {
            initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1 = (InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1) continuation;
            int i2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UUID externalId = cryptoPayment.getExternalId();
                    if (externalId != null && (uuid = externalId.toString()) != null) {
                        RealCryptoTransactionActionManager realCryptoTransactionActionManager = (RealCryptoTransactionActionManager) this.i;
                        initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.L$0 = blockersData;
                        initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.label = 1;
                        if (realCryptoTransactionActionManager.onTransactionInitiated(uuid, initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealCryptoAnalytics) this.c).trackSubmitPayment(cryptoPayment, false, blockersData.flowToken, Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1 = new InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1(this, (ContinuationImpl) continuation);
        Object obj2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1.label;
        if (i != 0) {
        }
        ((RealCryptoAnalytics) this.c).trackSubmitPayment(cryptoPayment, false, blockersData.flowToken, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public void onImageProxyAvailable(ImageProxy imageProxy) {
        ProcessingRequest processingRequest;
        ProcessingRequest processingRequest2;
        Threads.checkMainThread();
        if (((ProcessingRequest) this.a) == null) {
            StringUtilsKt.w("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        TagBundle tagBundle = imageProxy.getImageInfo().getTagBundle();
        if (((Integer) tagBundle.mTagMap.get(((ProcessingRequest) this.a).mTagBundleKey)) == null) {
            StringUtilsKt.w("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((ProcessingRequest) this.a).mRequestId + ", ImageProxy tagBundle keys = " + tagBundle.mTagMap.keySet());
            imageProxy.close();
            return;
        }
        Threads.checkMainThread();
        AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = (AutoValue_ProcessingNode_In) this.i;
        Objects.requireNonNull(autoValue_ProcessingNode_In);
        autoValue_ProcessingNode_In.edge.accept(new AutoValue_ProcessingNode_InputPacket((ProcessingRequest) this.a, imageProxy));
        ProcessingRequest processingRequest3 = (ProcessingRequest) this.a;
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = (AutoValue_CaptureNode_In) this.f;
        boolean z = autoValue_CaptureNode_In != null && autoValue_CaptureNode_In.outputFormats.size() > 1;
        if (z && (processingRequest2 = (ProcessingRequest) this.a) != null) {
            processingRequest2.mTakePictureRequest.markFormatProcessStatusInSimultaneousCapture(imageProxy.getFormat());
        }
        if (!z || ((processingRequest = (ProcessingRequest) this.a) != null && processingRequest.mTakePictureRequest.isFormatProcessedInSimultaneousCapture())) {
            this.a = null;
        }
        StringUtilsKt.i("ProcessingRequest", "onImageCaptured: request ID = " + processingRequest3.mRequestId);
        if (processingRequest3.mLastCaptureProcessProgressed != -1) {
            processingRequest3.onCaptureProcessProgressed(100);
        }
        RequestWithCallback requestWithCallback = processingRequest3.mCallback;
        Threads.checkMainThread();
        if (requestWithCallback.mIsAborted) {
            return;
        }
        if (!requestWithCallback.mIsStarted) {
            Threads.checkMainThread();
            if (!requestWithCallback.mIsAborted && !requestWithCallback.mIsStarted) {
                requestWithCallback.mIsStarted = true;
            }
        }
        requestWithCallback.mCaptureCompleter.set(null);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onPaused() {
        ((AtomicBoolean) this.h).set(true);
    }

    public void onRequestAvailable(ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        TransactorKt.checkState("only one capture stage is supported.", processingRequest.mStageIds.size() == 1);
        TransactorKt.checkState("Too many acquire images. Close image to be able to process next.", getCapacity() > 0);
        this.a = processingRequest;
        Futures.addCallback(processingRequest.mCaptureFuture, new Recorder.AnonymousClass4(7, this, processingRequest), zzabp.directExecutor());
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onResumed() {
        ((AtomicBoolean) this.h).set(false);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStarted() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStopped() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onSuccess(BlockersData blockersData, Continuation continuation) {
        InitiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1 initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1;
        int i;
        String uuid;
        CryptoPayment cryptoPayment = (CryptoPayment) this.h;
        if (continuation instanceof InitiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1) {
            initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1 = (InitiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1) continuation;
            int i2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UUID externalId = cryptoPayment.getExternalId();
                    if (externalId != null && (uuid = externalId.toString()) != null) {
                        RealCryptoTransactionActionManager realCryptoTransactionActionManager = (RealCryptoTransactionActionManager) this.i;
                        initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.L$0 = blockersData;
                        initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.label = 1;
                        if (realCryptoTransactionActionManager.onTransactionInitiated(uuid, initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealCryptoAnalytics) this.c).trackSubmitPayment(cryptoPayment, true, blockersData.flowToken, Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1 = new InitiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1(this, (ContinuationImpl) continuation);
        Object obj2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateCashLiteBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
        if (i != 0) {
        }
        ((RealCryptoAnalytics) this.c).trackSubmitPayment(cryptoPayment, true, blockersData.flowToken, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public void popLayer(SVG.Box box) {
        Canvas canvas = (Canvas) this.a;
        if (((SVGAndroidRenderer$RendererState) this.c).style.mask != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2127f, 0.7151f, 0.0722f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE})));
            canvas.saveLayer(null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) ((SVG) this.b).resolveIRI(((SVGAndroidRenderer$RendererState) this.c).style.mask);
            renderMask(mask, box);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            renderMask(mask, box);
            canvas.restore();
            canvas.restore();
        }
        statePop();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        InitiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1 initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1;
        int i;
        InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest;
        CryptoAmount cryptoAmount;
        ApiResult apiResult;
        if (continuationImpl instanceof InitiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1) {
            initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1 = (InitiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.label;
                CryptoAmount cryptoAmount2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoPayment cryptoPayment = (CryptoPayment) this.h;
                    cryptoPayment.getClass();
                    blockersData.getClass();
                    RequestContext requestContext = blockersData.requestContext;
                    if (cryptoPayment instanceof CryptoPayment.InvoicePayment) {
                        CryptoPayment.InvoicePayment invoicePayment = (CryptoPayment.InvoicePayment) cryptoPayment;
                        InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = new InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination(invoicePayment.invoice.getAsUri());
                        Money money = invoicePayment.customerSuppliedAmount;
                        if (money != null) {
                            Long l = money.amount;
                            l.getClass();
                            long longValue = l.longValue();
                            zza zzaVar = CryptoCurrency.Companion;
                            cryptoAmount = new CryptoAmount(longValue);
                        } else {
                            cryptoAmount = null;
                        }
                        initiateBitcoinWithdrawalRequest = new InitiateBitcoinWithdrawalRequest(requestContext, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination, cryptoAmount, 8);
                    } else {
                        int i3 = 12;
                        if (cryptoPayment instanceof CryptoPayment.InvoiceIdPayment) {
                            initiateBitcoinWithdrawalRequest = new InitiateBitcoinWithdrawalRequest(requestContext, new InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination(((CryptoPayment.InvoiceIdPayment) cryptoPayment).invoiceId), cryptoAmount2, i3);
                        } else {
                            if (!(cryptoPayment instanceof CryptoPayment.TokenPayment)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            initiateBitcoinWithdrawalRequest = new InitiateBitcoinWithdrawalRequest(requestContext, new InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination(((CryptoPayment.TokenPayment) cryptoPayment).token), cryptoAmount2, i3);
                        }
                    }
                    CashLiteFlowClientService cashLiteFlowClientService = (CashLiteFlowClientService) this.a;
                    String str = blockersData.flowToken;
                    initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.label = 1;
                    obj = cashLiteFlowClientService.initiateBitcoinWithdrawal(str, initiateBitcoinWithdrawalRequest, initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((InitiateBitcoinWithdrawalResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1 = new InitiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateCashLiteBitcoinWithdrawalScenarioPlan$produceResponseContext$1.label;
        CryptoAmount cryptoAmount22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    public void projectCorner(AABB aabb, int i, float[] fArr) {
        float[] fArr2 = (float[]) this.f;
        fArr2[0] = (i & 1) == 0 ? aabb.minX : aabb.maxX;
        fArr2[1] = (i & 2) == 0 ? aabb.minY : aabb.maxY;
        fArr2[2] = (i & 4) == 0 ? aabb.minZ : aabb.maxZ;
        fArr2[3] = 1.0f;
        android.opengl.Matrix.multiplyMV((float[]) this.h, 0, fArr, 0, fArr2, 0);
    }

    public boolean pushLayer() {
        SVG.SvgElementBase resolveIRI;
        int i = 0;
        if (((SVGAndroidRenderer$RendererState) this.c).style.opacity.floatValue() >= 1.0f && ((SVGAndroidRenderer$RendererState) this.c).style.mask == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.a;
        int floatValue = (int) (((SVGAndroidRenderer$RendererState) this.c).style.opacity.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.h).push((SVGAndroidRenderer$RendererState) this.c);
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = new SVGAndroidRenderer$RendererState((SVGAndroidRenderer$RendererState) this.c);
        this.c = sVGAndroidRenderer$RendererState;
        String str = sVGAndroidRenderer$RendererState.style.mask;
        if (str != null && ((resolveIRI = ((SVG) this.b).resolveIRI(str)) == null || !(resolveIRI instanceof SVG.Mask))) {
            error("Mask reference '%s' not found", ((SVGAndroidRenderer$RendererState) this.c).style.mask);
            ((SVGAndroidRenderer$RendererState) this.c).style.mask = null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void render(SVG.SvgObject svgObject) {
        SVG.Length length;
        String str;
        int indexOf;
        Set systemLanguage;
        SVG.Length length2;
        Boolean bool;
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        statePush();
        if ((svgObject instanceof SVG.SvgElementBase) && (bool = ((SVG.SvgElementBase) svgObject).spacePreserve) != null) {
            ((SVGAndroidRenderer$RendererState) this.c).spacePreserve = bool.booleanValue();
        }
        if (svgObject instanceof SVG.Svg) {
            SVG.Svg svg = (SVG.Svg) svgObject;
            render(svg, makeViewPort(svg.x, svg.y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
        } else {
            boolean z = svgObject instanceof SVG.Use;
            Bitmap bitmap = null;
            float f = RecyclerView.DECELERATION_RATE;
            if (z) {
                SVG.Use use = (SVG.Use) svgObject;
                Canvas canvas = (Canvas) this.a;
                SVG.Length length3 = use.width;
                if ((length3 == null || !length3.isZero()) && ((length2 = use.height) == null || !length2.isZero())) {
                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, use);
                    if (display()) {
                        SVG.SvgObject resolveIRI = use.document.resolveIRI(use.href);
                        if (resolveIRI == null) {
                            error("Use reference '%s' not found", use.href);
                        } else {
                            Matrix matrix = use.transform;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            SVG.Length length4 = use.x;
                            float floatValueX = length4 != null ? length4.floatValueX(this) : 0.0f;
                            SVG.Length length5 = use.y;
                            canvas.translate(floatValueX, length5 != null ? length5.floatValueY(this) : 0.0f);
                            checkForClipPath(use, use.boundingBox);
                            boolean pushLayer = pushLayer();
                            ((Stack) this.i).push(use);
                            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
                            if (resolveIRI instanceof SVG.Svg) {
                                SVG.Svg svg2 = (SVG.Svg) resolveIRI;
                                SVG.Box makeViewPort = makeViewPort(null, null, use.width, use.height);
                                statePush();
                                render(svg2, makeViewPort, svg2.viewBox, svg2.preserveAspectRatio);
                                statePop();
                            } else if (resolveIRI instanceof SVG.Symbol) {
                                SVG.Length length6 = use.width;
                                if (length6 == null) {
                                    length6 = new SVG.Length(100.0f, 9);
                                }
                                SVG.Length length7 = use.height;
                                if (length7 == null) {
                                    length7 = new SVG.Length(100.0f, 9);
                                }
                                SVG.Box makeViewPort2 = makeViewPort(null, null, length6, length7);
                                statePush();
                                SVG.Symbol symbol = (SVG.Symbol) resolveIRI;
                                if (makeViewPort2.width != RecyclerView.DECELERATION_RATE && makeViewPort2.height != RecyclerView.DECELERATION_RATE) {
                                    PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
                                    if (preserveAspectRatio == null) {
                                        preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                                    }
                                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, symbol);
                                    SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) this.c;
                                    sVGAndroidRenderer$RendererState.viewPort = makeViewPort2;
                                    if (!sVGAndroidRenderer$RendererState.style.overflow.booleanValue()) {
                                        SVG.Box box = ((SVGAndroidRenderer$RendererState) this.c).viewPort;
                                        setClipRect(box.minX, box.minY, box.width, box.height);
                                    }
                                    SVG.Box box2 = symbol.viewBox;
                                    SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) this.c;
                                    if (box2 != null) {
                                        canvas.concat(calculateViewBoxTransform(sVGAndroidRenderer$RendererState2.viewPort, box2, preserveAspectRatio));
                                        ((SVGAndroidRenderer$RendererState) this.c).viewBox = symbol.viewBox;
                                    } else {
                                        SVG.Box box3 = sVGAndroidRenderer$RendererState2.viewPort;
                                        canvas.translate(box3.minX, box3.minY);
                                    }
                                    boolean pushLayer2 = pushLayer();
                                    renderChildren(symbol, true);
                                    if (pushLayer2) {
                                        popLayer(symbol.boundingBox);
                                    }
                                    updateParentBoundingBox(symbol);
                                }
                                statePop();
                            } else {
                                render(resolveIRI);
                            }
                            ((Stack) this.i).pop();
                            ((Stack) this.f).pop();
                            if (pushLayer) {
                                popLayer(use.boundingBox);
                            }
                            updateParentBoundingBox(use);
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Switch) {
                SVG.Switch r14 = (SVG.Switch) svgObject;
                updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, r14);
                if (display()) {
                    Matrix matrix2 = r14.transform;
                    if (matrix2 != null) {
                        ((Canvas) this.a).concat(matrix2);
                    }
                    checkForClipPath(r14, r14.boundingBox);
                    boolean pushLayer3 = pushLayer();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = r14.children.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SVG.SvgObject svgObject2 = (SVG.SvgObject) it.next();
                        if (svgObject2 instanceof SVG.SvgConditional) {
                            SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject2;
                            if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                                Set requiredFeatures = svgConditional.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (supportedFeatures == null) {
                                        synchronized (e0.class) {
                                            HashSet hashSet = new HashSet();
                                            supportedFeatures = hashSet;
                                            hashSet.add("Structure");
                                            supportedFeatures.add("BasicStructure");
                                            supportedFeatures.add("ConditionalProcessing");
                                            supportedFeatures.add("Image");
                                            supportedFeatures.add("Style");
                                            supportedFeatures.add("ViewportAttribute");
                                            supportedFeatures.add("Shape");
                                            supportedFeatures.add("BasicText");
                                            supportedFeatures.add("PaintAttribute");
                                            supportedFeatures.add("BasicPaintAttribute");
                                            supportedFeatures.add("OpacityAttribute");
                                            supportedFeatures.add("BasicGraphicsAttribute");
                                            supportedFeatures.add("Marker");
                                            supportedFeatures.add("Gradient");
                                            supportedFeatures.add("Pattern");
                                            supportedFeatures.add("Clip");
                                            supportedFeatures.add("BasicClip");
                                            supportedFeatures.add("Mask");
                                            supportedFeatures.add("View");
                                        }
                                    }
                                    if (!requiredFeatures.isEmpty() && supportedFeatures.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set requiredFormats = svgConditional.getRequiredFormats();
                                if (requiredFormats == null) {
                                    Set requiredFonts = svgConditional.getRequiredFonts();
                                    if (requiredFonts == null) {
                                        render(svgObject2);
                                        break;
                                    }
                                    requiredFonts.isEmpty();
                                } else {
                                    requiredFormats.isEmpty();
                                }
                            }
                        }
                    }
                    if (pushLayer3) {
                        popLayer(r14.boundingBox);
                    }
                    updateParentBoundingBox(r14);
                }
            } else if (svgObject instanceof SVG.Group) {
                SVG.Group group = (SVG.Group) svgObject;
                updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, group);
                if (display()) {
                    Matrix matrix3 = group.transform;
                    if (matrix3 != null) {
                        ((Canvas) this.a).concat(matrix3);
                    }
                    checkForClipPath(group, group.boundingBox);
                    boolean pushLayer4 = pushLayer();
                    renderChildren(group, true);
                    if (pushLayer4) {
                        popLayer(group.boundingBox);
                    }
                    updateParentBoundingBox(group);
                }
            } else {
                if (svgObject instanceof SVG.Image) {
                    SVG.Image image = (SVG.Image) svgObject;
                    Canvas canvas2 = (Canvas) this.a;
                    SVG.Length length8 = image.width;
                    if (length8 != null && !length8.isZero() && (length = image.height) != null && !length.isZero() && (str = image.href) != null) {
                        PreserveAspectRatio preserveAspectRatio2 = image.preserveAspectRatio;
                        if (preserveAspectRatio2 == null) {
                            preserveAspectRatio2 = PreserveAspectRatio.LETTERBOX;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                            }
                        }
                        if (bitmap != null) {
                            SVG.Box box4 = new SVG.Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, bitmap.getWidth(), bitmap.getHeight());
                            updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, image);
                            if (display() && visible()) {
                                Matrix matrix4 = image.transform;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                SVG.Length length9 = image.x;
                                float floatValueX2 = length9 != null ? length9.floatValueX(this) : 0.0f;
                                SVG.Length length10 = image.y;
                                float floatValueY = length10 != null ? length10.floatValueY(this) : 0.0f;
                                float floatValueX3 = image.width.floatValueX(this);
                                float floatValueX4 = image.height.floatValueX(this);
                                SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState3 = (SVGAndroidRenderer$RendererState) this.c;
                                sVGAndroidRenderer$RendererState3.viewPort = new SVG.Box(floatValueX2, floatValueY, floatValueX3, floatValueX4);
                                if (!sVGAndroidRenderer$RendererState3.style.overflow.booleanValue()) {
                                    SVG.Box box5 = ((SVGAndroidRenderer$RendererState) this.c).viewPort;
                                    setClipRect(box5.minX, box5.minY, box5.width, box5.height);
                                }
                                image.boundingBox = ((SVGAndroidRenderer$RendererState) this.c).viewPort;
                                updateParentBoundingBox(image);
                                checkForClipPath(image, image.boundingBox);
                                boolean pushLayer5 = pushLayer();
                                viewportFill();
                                canvas2.save();
                                canvas2.concat(calculateViewBoxTransform(((SVGAndroidRenderer$RendererState) this.c).viewPort, box4, preserveAspectRatio2));
                                canvas2.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new Paint(((SVGAndroidRenderer$RendererState) this.c).style.imageRendering != 3 ? 2 : 0));
                                canvas2.restore();
                                if (pushLayer5) {
                                    popLayer(image.boundingBox);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Path) {
                    SVG.Path path = (SVG.Path) svgObject;
                    if (path.d != null) {
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, path);
                        if (display() && visible()) {
                            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState4 = (SVGAndroidRenderer$RendererState) this.c;
                            if (sVGAndroidRenderer$RendererState4.hasStroke || sVGAndroidRenderer$RendererState4.hasFill) {
                                Matrix matrix5 = path.transform;
                                if (matrix5 != null) {
                                    ((Canvas) this.a).concat(matrix5);
                                }
                                Path path2 = new SVGAndroidRenderer$PathConverter(path.d).path;
                                if (path.boundingBox == null) {
                                    path.boundingBox = calculatePathBounds(path2);
                                }
                                updateParentBoundingBox(path);
                                checkForGradientsAndPatterns(path);
                                checkForClipPath(path, path.boundingBox);
                                boolean pushLayer6 = pushLayer();
                                SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState5 = (SVGAndroidRenderer$RendererState) this.c;
                                if (sVGAndroidRenderer$RendererState5.hasFill) {
                                    int i = sVGAndroidRenderer$RendererState5.style.fillRule;
                                    path2.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    doFilledPath(path, path2);
                                }
                                if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                    doStroke(path2);
                                }
                                renderMarkers(path);
                                if (pushLayer6) {
                                    popLayer(path.boundingBox);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Rect) {
                    SVG.Rect rect = (SVG.Rect) svgObject;
                    SVG.Length length11 = rect.width;
                    if (length11 != null && rect.height != null && !length11.isZero() && !rect.height.isZero()) {
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, rect);
                        if (display() && visible()) {
                            Matrix matrix6 = rect.transform;
                            if (matrix6 != null) {
                                ((Canvas) this.a).concat(matrix6);
                            }
                            Path makePathAndBoundingBox = makePathAndBoundingBox(rect);
                            updateParentBoundingBox(rect);
                            checkForGradientsAndPatterns(rect);
                            checkForClipPath(rect, rect.boundingBox);
                            boolean pushLayer7 = pushLayer();
                            if (((SVGAndroidRenderer$RendererState) this.c).hasFill) {
                                doFilledPath(rect, makePathAndBoundingBox);
                            }
                            if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                doStroke(makePathAndBoundingBox);
                            }
                            if (pushLayer7) {
                                popLayer(rect.boundingBox);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Circle) {
                    SVG.Circle circle = (SVG.Circle) svgObject;
                    SVG.Length length12 = circle.r;
                    if (length12 != null && !length12.isZero()) {
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, circle);
                        if (display() && visible()) {
                            Matrix matrix7 = circle.transform;
                            if (matrix7 != null) {
                                ((Canvas) this.a).concat(matrix7);
                            }
                            Path makePathAndBoundingBox2 = makePathAndBoundingBox(circle);
                            updateParentBoundingBox(circle);
                            checkForGradientsAndPatterns(circle);
                            checkForClipPath(circle, circle.boundingBox);
                            boolean pushLayer8 = pushLayer();
                            if (((SVGAndroidRenderer$RendererState) this.c).hasFill) {
                                doFilledPath(circle, makePathAndBoundingBox2);
                            }
                            if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                doStroke(makePathAndBoundingBox2);
                            }
                            if (pushLayer8) {
                                popLayer(circle.boundingBox);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Ellipse) {
                    SVG.Ellipse ellipse = (SVG.Ellipse) svgObject;
                    SVG.Length length13 = ellipse.rx;
                    if (length13 != null && ellipse.ry != null && !length13.isZero() && !ellipse.ry.isZero()) {
                        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, ellipse);
                        if (display() && visible()) {
                            Matrix matrix8 = ellipse.transform;
                            if (matrix8 != null) {
                                ((Canvas) this.a).concat(matrix8);
                            }
                            Path makePathAndBoundingBox3 = makePathAndBoundingBox(ellipse);
                            updateParentBoundingBox(ellipse);
                            checkForGradientsAndPatterns(ellipse);
                            checkForClipPath(ellipse, ellipse.boundingBox);
                            boolean pushLayer9 = pushLayer();
                            if (((SVGAndroidRenderer$RendererState) this.c).hasFill) {
                                doFilledPath(ellipse, makePathAndBoundingBox3);
                            }
                            if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                doStroke(makePathAndBoundingBox3);
                            }
                            if (pushLayer9) {
                                popLayer(ellipse.boundingBox);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Line) {
                    SVG.Line line = (SVG.Line) svgObject;
                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, line);
                    if (display() && visible() && ((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                        Matrix matrix9 = line.transform;
                        if (matrix9 != null) {
                            ((Canvas) this.a).concat(matrix9);
                        }
                        SVG.Length length14 = line.x1;
                        float floatValueX5 = length14 == null ? 0.0f : length14.floatValueX(this);
                        SVG.Length length15 = line.y1;
                        float floatValueY2 = length15 == null ? 0.0f : length15.floatValueY(this);
                        SVG.Length length16 = line.x2;
                        float floatValueX6 = length16 == null ? 0.0f : length16.floatValueX(this);
                        SVG.Length length17 = line.y2;
                        if (length17 != null) {
                            f = length17.floatValueY(this);
                        }
                        if (line.boundingBox == null) {
                            line.boundingBox = new SVG.Box(Math.min(floatValueX5, floatValueX6), Math.min(floatValueY2, f), Math.abs(floatValueX6 - floatValueX5), Math.abs(f - floatValueY2));
                        }
                        Path path3 = new Path();
                        path3.moveTo(floatValueX5, floatValueY2);
                        path3.lineTo(floatValueX6, f);
                        updateParentBoundingBox(line);
                        checkForGradientsAndPatterns(line);
                        checkForClipPath(line, line.boundingBox);
                        boolean pushLayer10 = pushLayer();
                        doStroke(path3);
                        renderMarkers(line);
                        if (pushLayer10) {
                            popLayer(line.boundingBox);
                        }
                    }
                } else if (svgObject instanceof SVG.Polygon) {
                    SVG.Polygon polygon = (SVG.Polygon) svgObject;
                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, polygon);
                    if (display() && visible()) {
                        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState6 = (SVGAndroidRenderer$RendererState) this.c;
                        if (sVGAndroidRenderer$RendererState6.hasStroke || sVGAndroidRenderer$RendererState6.hasFill) {
                            Matrix matrix10 = polygon.transform;
                            if (matrix10 != null) {
                                ((Canvas) this.a).concat(matrix10);
                            }
                            if (polygon.points.length >= 2) {
                                Path makePathAndBoundingBox4 = makePathAndBoundingBox(polygon);
                                updateParentBoundingBox(polygon);
                                checkForGradientsAndPatterns(polygon);
                                checkForClipPath(polygon, polygon.boundingBox);
                                boolean pushLayer11 = pushLayer();
                                if (((SVGAndroidRenderer$RendererState) this.c).hasFill) {
                                    doFilledPath(polygon, makePathAndBoundingBox4);
                                }
                                if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                    doStroke(makePathAndBoundingBox4);
                                }
                                renderMarkers(polygon);
                                if (pushLayer11) {
                                    popLayer(polygon.boundingBox);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.PolyLine) {
                    SVG.PolyLine polyLine = (SVG.PolyLine) svgObject;
                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, polyLine);
                    if (display() && visible()) {
                        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState7 = (SVGAndroidRenderer$RendererState) this.c;
                        if (sVGAndroidRenderer$RendererState7.hasStroke || sVGAndroidRenderer$RendererState7.hasFill) {
                            Matrix matrix11 = polyLine.transform;
                            if (matrix11 != null) {
                                ((Canvas) this.a).concat(matrix11);
                            }
                            if (polyLine.points.length >= 2) {
                                Path makePathAndBoundingBox5 = makePathAndBoundingBox(polyLine);
                                updateParentBoundingBox(polyLine);
                                int i2 = ((SVGAndroidRenderer$RendererState) this.c).style.fillRule;
                                makePathAndBoundingBox5.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                checkForGradientsAndPatterns(polyLine);
                                checkForClipPath(polyLine, polyLine.boundingBox);
                                boolean pushLayer12 = pushLayer();
                                if (((SVGAndroidRenderer$RendererState) this.c).hasFill) {
                                    doFilledPath(polyLine, makePathAndBoundingBox5);
                                }
                                if (((SVGAndroidRenderer$RendererState) this.c).hasStroke) {
                                    doStroke(makePathAndBoundingBox5);
                                }
                                renderMarkers(polyLine);
                                if (pushLayer12) {
                                    popLayer(polyLine.boundingBox);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Text) {
                    SVG.Text text = (SVG.Text) svgObject;
                    updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, text);
                    if (display()) {
                        Matrix matrix12 = text.transform;
                        if (matrix12 != null) {
                            ((Canvas) this.a).concat(matrix12);
                        }
                        ArrayList arrayList = text.x;
                        float floatValueX7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.Length) text.x.get(0)).floatValueX(this);
                        ArrayList arrayList2 = text.y;
                        float floatValueY3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.Length) text.y.get(0)).floatValueY(this);
                        ArrayList arrayList3 = text.dx;
                        float floatValueX8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) text.dx.get(0)).floatValueX(this);
                        ArrayList arrayList4 = text.dy;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f = ((SVG.Length) text.dy.get(0)).floatValueY(this);
                        }
                        int anchorPosition = getAnchorPosition();
                        if (anchorPosition != 1) {
                            float calculateTextWidth = calculateTextWidth(text);
                            if (anchorPosition == 2) {
                                calculateTextWidth /= 2.0f;
                            }
                            floatValueX7 -= calculateTextWidth;
                        }
                        if (text.boundingBox == null) {
                            SVGAndroidRenderer$PlainTextToPath sVGAndroidRenderer$PlainTextToPath = new SVGAndroidRenderer$PlainTextToPath(this, floatValueX7, floatValueY3);
                            enumerateTextSpans(text, sVGAndroidRenderer$PlainTextToPath);
                            RectF rectF = (RectF) sVGAndroidRenderer$PlainTextToPath.textAsPath;
                            text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), ((RectF) sVGAndroidRenderer$PlainTextToPath.textAsPath).height());
                        }
                        updateParentBoundingBox(text);
                        checkForGradientsAndPatterns(text);
                        checkForClipPath(text, text.boundingBox);
                        boolean pushLayer13 = pushLayer();
                        enumerateTextSpans(text, new SVGAndroidRenderer$PlainTextDrawer(this, floatValueX7 + floatValueX8, floatValueY3 + f));
                        if (pushLayer13) {
                            popLayer(text.boundingBox);
                        }
                    }
                }
            }
        }
        statePop();
    }

    public void renderChildren(SVG.SvgConditionalContainer svgConditionalContainer, boolean z) {
        if (z) {
            ((Stack) this.i).push(svgConditionalContainer);
            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
        }
        Iterator it = svgConditionalContainer.children.iterator();
        while (it.hasNext()) {
            render((SVG.SvgObject) it.next());
        }
        if (z) {
            ((Stack) this.i).pop();
            ((Stack) this.f).pop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((com.caverock.androidsvg.SVGAndroidRenderer$RendererState) r12.c).style.overflow.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        setClipRect(r1, r2, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        r4.reset();
        r4.preScale(r7, r6);
        r0.concat(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderMarker(SVG.Marker marker, SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector) {
        float f;
        SVG.Box box;
        boolean pushLayer;
        float f2;
        float f3;
        float f4;
        Canvas canvas = (Canvas) this.a;
        statePush();
        Float f5 = marker.orient;
        float f6 = RecyclerView.DECELERATION_RATE;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = sVGAndroidRenderer$MarkerVector.dx;
                if (f7 != RecyclerView.DECELERATION_RATE || sVGAndroidRenderer$MarkerVector.dy != RecyclerView.DECELERATION_RATE) {
                    f = (float) Math.toDegrees(Math.atan2(sVGAndroidRenderer$MarkerVector.dy, f7));
                }
            } else {
                f = marker.orient.floatValue();
            }
            float floatValue$1 = !marker.markerUnitsAreUser ? 1.0f : ((SVGAndroidRenderer$RendererState) this.c).style.strokeWidth.floatValue$1();
            this.c = findInheritFromAncestorState(marker);
            Matrix matrix = new Matrix();
            matrix.preTranslate(sVGAndroidRenderer$MarkerVector.x, sVGAndroidRenderer$MarkerVector.y);
            matrix.preRotate(f);
            matrix.preScale(floatValue$1, floatValue$1);
            SVG.Length length = marker.refX;
            float floatValueX = length == null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = marker.refY;
            float floatValueY = length2 == null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = marker.markerWidth;
            float floatValueX2 = length3 == null ? length3.floatValueX(this) : 3.0f;
            SVG.Length length4 = marker.markerHeight;
            float floatValueY2 = length4 != null ? length4.floatValueY(this) : 3.0f;
            box = marker.viewBox;
            if (box == null) {
                float f8 = floatValueX2 / box.width;
                float f9 = floatValueY2 / box.height;
                PreserveAspectRatio preserveAspectRatio = marker.preserveAspectRatio;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                boolean equals = preserveAspectRatio.equals(PreserveAspectRatio.STRETCH);
                PreserveAspectRatio.Alignment alignment = preserveAspectRatio.alignment;
                if (!equals) {
                    f8 = preserveAspectRatio.scale == 2 ? Math.max(f8, f9) : Math.min(f8, f9);
                    f9 = f8;
                }
                matrix.preTranslate((-floatValueX) * f8, (-floatValueY) * f9);
                canvas.concat(matrix);
                SVG.Box box2 = marker.viewBox;
                float f10 = box2.width * f8;
                float f11 = box2.height * f9;
                int ordinal = alignment.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                if (ordinal != 8) {
                                    if (ordinal != 9) {
                                        f3 = 0.0f;
                                        switch (alignment.ordinal()) {
                                            case 4:
                                            case 5:
                                            case 6:
                                                f4 = (floatValueY2 - f11) / 2.0f;
                                                f6 = RecyclerView.DECELERATION_RATE - f4;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                f4 = floatValueY2 - f11;
                                                f6 = RecyclerView.DECELERATION_RATE - f4;
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f2 = floatValueX2 - f10;
                    f3 = RecyclerView.DECELERATION_RATE - f2;
                    switch (alignment.ordinal()) {
                    }
                }
                f2 = (floatValueX2 - f10) / 2.0f;
                f3 = RecyclerView.DECELERATION_RATE - f2;
                switch (alignment.ordinal()) {
                }
            } else {
                matrix.preTranslate(-floatValueX, -floatValueY);
                canvas.concat(matrix);
                if (!((SVGAndroidRenderer$RendererState) this.c).style.overflow.booleanValue()) {
                    setClipRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, floatValueX2, floatValueY2);
                }
            }
            pushLayer = pushLayer();
            renderChildren(marker, false);
            if (pushLayer) {
                popLayer(marker.boundingBox);
            }
            statePop();
        }
        f = 0.0f;
        if (!marker.markerUnitsAreUser) {
        }
        this.c = findInheritFromAncestorState(marker);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(sVGAndroidRenderer$MarkerVector.x, sVGAndroidRenderer$MarkerVector.y);
        matrix2.preRotate(f);
        matrix2.preScale(floatValue$1, floatValue$1);
        SVG.Length length5 = marker.refX;
        if (length5 == null) {
        }
        SVG.Length length22 = marker.refY;
        if (length22 == null) {
        }
        SVG.Length length32 = marker.markerWidth;
        if (length32 == null) {
        }
        SVG.Length length42 = marker.markerHeight;
        if (length42 != null) {
        }
        box = marker.viewBox;
        if (box == null) {
        }
        pushLayer = pushLayer();
        renderChildren(marker, false);
        if (pushLayer) {
        }
        statePop();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderMarkers(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        String str;
        SVG.Marker marker2;
        String str2;
        SVG.Marker marker3;
        boolean z;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        int i2;
        SVG.Style style = ((SVGAndroidRenderer$RendererState) this.c).style;
        String str3 = style.markerStart;
        if (str3 == null && style.markerMid == null && style.markerEnd == null) {
            return;
        }
        if (str3 != null) {
            SVG.SvgElementBase resolveIRI = graphicsElement.document.resolveIRI(str3);
            if (resolveIRI != null) {
                marker = (SVG.Marker) resolveIRI;
                str = ((SVGAndroidRenderer$RendererState) this.c).style.markerMid;
                if (str != null) {
                    SVG.SvgElementBase resolveIRI2 = graphicsElement.document.resolveIRI(str);
                    if (resolveIRI2 != null) {
                        marker2 = (SVG.Marker) resolveIRI2;
                        str2 = ((SVGAndroidRenderer$RendererState) this.c).style.markerEnd;
                        if (str2 != null) {
                            SVG.SvgElementBase resolveIRI3 = graphicsElement.document.resolveIRI(str2);
                            if (resolveIRI3 != null) {
                                marker3 = (SVG.Marker) resolveIRI3;
                                z = graphicsElement instanceof SVG.Path;
                                float f4 = RecyclerView.DECELERATION_RATE;
                                if (!z) {
                                    arrayList = new SVGAndroidRenderer$MarkerPositionCalculator(this, ((SVG.Path) graphicsElement).d).markers;
                                    f2 = 0.0f;
                                    i = 1;
                                } else if (graphicsElement instanceof SVG.Line) {
                                    SVG.Line line = (SVG.Line) graphicsElement;
                                    SVG.Length length = line.x1;
                                    float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
                                    SVG.Length length2 = line.y1;
                                    float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
                                    SVG.Length length3 = line.x2;
                                    float floatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
                                    SVG.Length length4 = line.y2;
                                    float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f5 = floatValueX2 - floatValueX;
                                    i = 1;
                                    float f6 = floatValueY2 - floatValueY;
                                    arrayList2.add(new SVGAndroidRenderer$MarkerVector(floatValueX, floatValueY, f5, f6));
                                    arrayList2.add(new SVGAndroidRenderer$MarkerVector(floatValueX2, floatValueY2, f5, f6));
                                    f2 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i = 1;
                                    SVG.PolyLine polyLine = (SVG.PolyLine) graphicsElement;
                                    int length5 = polyLine.points.length;
                                    if (length5 < 2) {
                                        arrayList = null;
                                        f2 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = polyLine.points;
                                        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector = new SVGAndroidRenderer$MarkerVector(fArr[0], fArr[1], RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                                        int i3 = 2;
                                        float f7 = 0.0f;
                                        float f8 = 0.0f;
                                        while (true) {
                                            f = sVGAndroidRenderer$MarkerVector.y;
                                            f2 = f4;
                                            f3 = sVGAndroidRenderer$MarkerVector.x;
                                            if (i3 >= length5) {
                                                break;
                                            }
                                            float[] fArr2 = polyLine.points;
                                            float f9 = fArr2[i3];
                                            float f10 = fArr2[i3 + 1];
                                            sVGAndroidRenderer$MarkerVector.add(f9, f10);
                                            arrayList3.add(sVGAndroidRenderer$MarkerVector);
                                            sVGAndroidRenderer$MarkerVector = new SVGAndroidRenderer$MarkerVector(f9, f10, f9 - f3, f10 - f);
                                            i3 += 2;
                                            f8 = f10;
                                            f7 = f9;
                                            f4 = f2;
                                        }
                                        if (polyLine instanceof SVG.Polygon) {
                                            float[] fArr3 = polyLine.points;
                                            float f11 = fArr3[0];
                                            if (f7 != f11) {
                                                float f12 = fArr3[1];
                                                if (f8 != f12) {
                                                    sVGAndroidRenderer$MarkerVector.add(f11, f12);
                                                    arrayList3.add(sVGAndroidRenderer$MarkerVector);
                                                    SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector2 = new SVGAndroidRenderer$MarkerVector(f11, f12, f11 - f3, f12 - f);
                                                    sVGAndroidRenderer$MarkerVector2.add((SVGAndroidRenderer$MarkerVector) arrayList3.get(0));
                                                    arrayList3.add(sVGAndroidRenderer$MarkerVector2);
                                                    arrayList3.set(0, sVGAndroidRenderer$MarkerVector2);
                                                }
                                            }
                                        } else {
                                            arrayList3.add(sVGAndroidRenderer$MarkerVector);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (arrayList == null && (size = arrayList.size()) != 0) {
                                    SVG.Style style2 = ((SVGAndroidRenderer$RendererState) this.c).style;
                                    style2.markerEnd = null;
                                    style2.markerMid = null;
                                    style2.markerStart = null;
                                    if (marker != null) {
                                        renderMarker(marker, (SVGAndroidRenderer$MarkerVector) arrayList.get(0));
                                    }
                                    if (marker2 != null && arrayList.size() > 2) {
                                        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector3 = (SVGAndroidRenderer$MarkerVector) arrayList.get(0);
                                        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector4 = (SVGAndroidRenderer$MarkerVector) arrayList.get(i);
                                        i2 = 1;
                                        while (i2 < size - 1) {
                                            i2++;
                                            SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector5 = (SVGAndroidRenderer$MarkerVector) arrayList.get(i2);
                                            if (sVGAndroidRenderer$MarkerVector4.isAmbiguous) {
                                                float f13 = sVGAndroidRenderer$MarkerVector4.dx;
                                                float f14 = sVGAndroidRenderer$MarkerVector4.dy;
                                                float f15 = sVGAndroidRenderer$MarkerVector4.x;
                                                float f16 = f15 - sVGAndroidRenderer$MarkerVector3.x;
                                                float f17 = sVGAndroidRenderer$MarkerVector4.y;
                                                float f18 = ((f17 - sVGAndroidRenderer$MarkerVector3.y) * f14) + (f16 * f13);
                                                if (f18 == f2) {
                                                    f18 = ((sVGAndroidRenderer$MarkerVector5.x - f15) * f13) + ((sVGAndroidRenderer$MarkerVector5.y - f17) * f14);
                                                }
                                                if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                                                    sVGAndroidRenderer$MarkerVector4.dx = -f13;
                                                    sVGAndroidRenderer$MarkerVector4.dy = -f14;
                                                }
                                            }
                                            renderMarker(marker2, sVGAndroidRenderer$MarkerVector4);
                                            sVGAndroidRenderer$MarkerVector3 = sVGAndroidRenderer$MarkerVector4;
                                            sVGAndroidRenderer$MarkerVector4 = sVGAndroidRenderer$MarkerVector5;
                                        }
                                    }
                                    if (marker3 == null) {
                                        renderMarker(marker3, (SVGAndroidRenderer$MarkerVector) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            error("Marker reference '%s' not found", ((SVGAndroidRenderer$RendererState) this.c).style.markerEnd);
                        }
                        marker3 = null;
                        z = graphicsElement instanceof SVG.Path;
                        float f42 = RecyclerView.DECELERATION_RATE;
                        if (!z) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        SVG.Style style22 = ((SVGAndroidRenderer$RendererState) this.c).style;
                        style22.markerEnd = null;
                        style22.markerMid = null;
                        style22.markerStart = null;
                        if (marker != null) {
                        }
                        if (marker2 != null) {
                            SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector32 = (SVGAndroidRenderer$MarkerVector) arrayList.get(0);
                            SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector42 = (SVGAndroidRenderer$MarkerVector) arrayList.get(i);
                            i2 = 1;
                            while (i2 < size - 1) {
                            }
                        }
                        if (marker3 == null) {
                        }
                    } else {
                        error("Marker reference '%s' not found", ((SVGAndroidRenderer$RendererState) this.c).style.markerMid);
                    }
                }
                marker2 = null;
                str2 = ((SVGAndroidRenderer$RendererState) this.c).style.markerEnd;
                if (str2 != null) {
                }
                marker3 = null;
                z = graphicsElement instanceof SVG.Path;
                float f422 = RecyclerView.DECELERATION_RATE;
                if (!z) {
                }
                if (arrayList == null) {
                }
            } else {
                error("Marker reference '%s' not found", ((SVGAndroidRenderer$RendererState) this.c).style.markerStart);
            }
        }
        marker = null;
        str = ((SVGAndroidRenderer$RendererState) this.c).style.markerMid;
        if (str != null) {
        }
        marker2 = null;
        str2 = ((SVGAndroidRenderer$RendererState) this.c).style.markerEnd;
        if (str2 != null) {
        }
        marker3 = null;
        z = graphicsElement instanceof SVG.Path;
        float f4222 = RecyclerView.DECELERATION_RATE;
        if (!z) {
        }
        if (arrayList == null) {
        }
    }

    public void renderMask(SVG.Mask mask, SVG.Box box) {
        float f;
        float f2;
        Canvas canvas = (Canvas) this.a;
        Boolean bool = mask.maskUnitsAreUser;
        if (bool == null || !bool.booleanValue()) {
            SVG.Length length = mask.width;
            float floatValue = length != null ? length.floatValue(this, 1.0f) : 1.2f;
            SVG.Length length2 = mask.height;
            float floatValue2 = length2 != null ? length2.floatValue(this, 1.0f) : 1.2f;
            f = floatValue * box.width;
            f2 = floatValue2 * box.height;
        } else {
            SVG.Length length3 = mask.width;
            f = length3 != null ? length3.floatValueX(this) : box.width;
            SVG.Length length4 = mask.height;
            f2 = length4 != null ? length4.floatValueY(this) : box.height;
        }
        if (f == RecyclerView.DECELERATION_RATE || f2 == RecyclerView.DECELERATION_RATE) {
            return;
        }
        statePush();
        SVGAndroidRenderer$RendererState findInheritFromAncestorState = findInheritFromAncestorState(mask);
        this.c = findInheritFromAncestorState;
        findInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
        boolean pushLayer = pushLayer();
        canvas.save();
        Boolean bool2 = mask.maskContentUnitsAreUser;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(box.minX, box.minY);
            canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        canvas.restore();
        if (pushLayer) {
            popLayer(box);
        }
        statePop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r6.equals("StreetType") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void saveAddressComponentsIntoProfileElement(List list, Element element, boolean z) {
        ProfileStore_ profileStore_ = (ProfileStore_) this.a;
        for (Element element2 : element.actingElement().children) {
            String data = profileStore_.getData(element2.actingElement().pathKey);
            if (z || data == null || data.length() <= 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        FillrAddressParseComponent fillrAddressParseComponent = (FillrAddressParseComponent) it.next();
                        String str = fillrAddressParseComponent.mParam;
                        String str2 = fillrAddressParseComponent.mValue;
                        String str3 = element2.actingElement().elementName;
                        String str4 = "StreetName";
                        if (str.equals("StreetName")) {
                            if (!str3.equals("StreetName")) {
                                str4 = "StreetType";
                            }
                            String correctFormData = getCorrectFormData(str, str2, element2.actingElement().elementName, element);
                            if (!element2.actingElement().elementName.equals(str4) && correctFormData != null && correctFormData.length() > 0) {
                                profileStore_.setData(element2.actingElement().pathKey, correctFormData);
                                break;
                            }
                        }
                        str4 = str;
                        String correctFormData2 = getCorrectFormData(str, str2, element2.actingElement().elementName, element);
                        if (!element2.actingElement().elementName.equals(str4)) {
                        }
                    }
                }
            }
        }
        profileStore_.store();
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchClosedMetric(File file, BatchClosedMetadata batchClosedMetadata) {
        InternalLogger internalLogger = (InternalLogger) this.c;
        file.getClass();
        String str = (String) this.f;
        if (str == null || !zzhk.existsSafe(file, internalLogger)) {
            return;
        }
        Long nameAsTimestampSafe = nameAsTimestampSafe(file, internalLogger);
        Map map = null;
        if (nameAsTimestampSafe != null) {
            long longValue = batchClosedMetadata.lastTimeWasUsedInMs - nameAsTimestampSafe.longValue();
            if (longValue >= 0) {
                map = MapsKt__MapsKt.mapOf(new Pair("track", str), new Pair("metric_type", "batch closed"), new Pair("batch_duration", Long.valueOf(longValue)), new Pair("uploader_window", Long.valueOf(((FilePersistenceConfig) this.b).recentDelayMs)), new Pair("batch_size", Long.valueOf(zzhk.lengthSafe(file, internalLogger))), new Pair("batch_events_count", Long.valueOf(batchClosedMetadata.eventsCount)), new Pair("consent", resolveFileOriginAsConsent(file)), new Pair("filename", file.getName()), new Pair("thread", Thread.currentThread().getName()));
            }
        }
        if (map != null) {
            ((zzlj) internalLogger).logMetric(MethodCalledTelemetry$stopAndSend$1.INSTANCE$1, map, 1.5f, null);
        }
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchDeletedMetric(File file, RemovalReason removalReason, int i) {
        InternalLogger internalLogger = (InternalLogger) this.c;
        file.getClass();
        String str = (String) this.f;
        if (str == null) {
            return;
        }
        DataUploadConfiguration dataUploadConfiguration = (DataUploadConfiguration) this.a;
        Long nameAsTimestampSafe = nameAsTimestampSafe(file, internalLogger);
        Map map = null;
        if (nameAsTimestampSafe != null) {
            long longValue = nameAsTimestampSafe.longValue();
            ((Strings) this.i).getClass();
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            if (currentTimeMillis >= 0) {
                map = MapsKt__MapsKt.mapOf(new Pair("track", str), new Pair("metric_type", "batch deleted"), new Pair("batch_age", Long.valueOf(currentTimeMillis)), new Pair("uploader_delay", MapsKt__MapsKt.mapOf(new Pair("min", Long.valueOf(dataUploadConfiguration.minDelayMs)), new Pair("max", Long.valueOf(dataUploadConfiguration.maxDelayMs)))), new Pair("uploader_window", Long.valueOf(((FilePersistenceConfig) this.b).recentDelayMs)), new Pair("batch_removal_reason", removalReason.toString()), new Pair("in_background", Boolean.valueOf(((AtomicBoolean) this.h).get())), new Pair("consent", resolveFileOriginAsConsent(file)), new Pair("filename", file.getName()), new Pair("pending_batches", Integer.valueOf(i)), new Pair("thread", Thread.currentThread().getName()));
            }
        }
        if (map != null) {
            ((zzlj) internalLogger).logMetric(MethodCalledTelemetry$stopAndSend$1.INSTANCE$2, map, 1.5f, null);
        }
    }

    public void sendCaptureError(AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError) {
        int i;
        boolean z;
        Threads.checkMainThread();
        ProcessingRequest processingRequest = (ProcessingRequest) this.a;
        if (processingRequest == null || (i = processingRequest.mRequestId) != autoValue_TakePictureManager_CaptureError.requestId) {
            return;
        }
        ImageCaptureException imageCaptureException = autoValue_TakePictureManager_CaptureError.imageCaptureException;
        StringUtilsKt.w("ProcessingRequest", "onCaptureFailure: request ID = " + i, imageCaptureException);
        RequestWithCallback requestWithCallback = processingRequest.mCallback;
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = requestWithCallback.mTakePictureRequest;
        Threads.checkMainThread();
        if (requestWithCallback.mIsAborted) {
            return;
        }
        Threads.checkMainThread();
        int i2 = autoValue_TakePictureRequest.mRemainingRetires;
        if (i2 > 0) {
            z = true;
            autoValue_TakePictureRequest.mRemainingRetires = i2 - 1;
        } else {
            z = false;
        }
        if (!z) {
            Threads.checkMainThread();
            autoValue_TakePictureRequest.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(16, autoValue_TakePictureRequest, imageCaptureException));
        }
        requestWithCallback.markComplete();
        requestWithCallback.mCaptureCompleter.setException(imageCaptureException);
        if (z) {
            TakePictureManagerImpl takePictureManagerImpl = requestWithCallback.mRetryControl;
            Threads.checkMainThread();
            StringUtilsKt.d("TakePictureManagerImpl", "Add a new request for retrying.");
            takePictureManagerImpl.mNewRequests.addFirst(autoValue_TakePictureRequest);
            takePictureManagerImpl.issueNextRequest();
        }
    }

    public void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        n nVar = ((SVGAndroidRenderer$RendererState) this.c).style.clip;
        if (nVar != null) {
            f += ((SVG.Length) nVar.d).floatValueX(this);
            f2 += ((SVG.Length) ((SVGAndroidRenderer$RendererState) this.c).style.clip.a).floatValueY(this);
            f5 -= ((SVG.Length) ((SVGAndroidRenderer$RendererState) this.c).style.clip.b).floatValueX(this);
            f6 -= ((SVG.Length) ((SVGAndroidRenderer$RendererState) this.c).style.clip.c).floatValueY(this);
        }
        ((Canvas) this.a).clipRect(f, f2, f5, f6);
    }

    public void statePop() {
        ((Canvas) this.a).restore();
        this.c = (SVGAndroidRenderer$RendererState) ((Stack) this.h).pop();
    }

    public void statePush() {
        ((Canvas) this.a).save();
        ((Stack) this.h).push((SVGAndroidRenderer$RendererState) this.c);
        this.c = new SVGAndroidRenderer$RendererState((SVGAndroidRenderer$RendererState) this.c);
    }

    public String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (((SVGAndroidRenderer$RendererState) this.c).spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return String.valueOf(super.toString()) + "[" + ((HashMap) this.c).toString() + "]";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r2 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toggleDependentControl(boolean z, ContinuationImpl continuationImpl) {
        DependentCardControlStatusRequestHandler$toggleDependentControl$1 dependentCardControlStatusRequestHandler$toggleDependentControl$1;
        int i;
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl;
        Object obj;
        boolean z2;
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl2;
        DependentControlStatus.Loaded loaded;
        if (continuationImpl instanceof DependentCardControlStatusRequestHandler$toggleDependentControl$1) {
            dependentCardControlStatusRequestHandler$toggleDependentControl$1 = (DependentCardControlStatusRequestHandler$toggleDependentControl$1) continuationImpl;
            int i2 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dependentCardControlStatusRequestHandler$toggleDependentControl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentCardControlStatusRequestHandler$toggleDependentControl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) this.h;
                    dependentCardControlStatusRequestHandler$toggleDependentControl$1.L$0 = loadedCardControl;
                    dependentCardControlStatusRequestHandler$toggleDependentControl$1.Z$0 = z;
                    dependentCardControlStatusRequestHandler$toggleDependentControl$1.label = 1;
                    obj = togglePostcard(z, dependentCardControlStatusRequestHandler$toggleDependentControl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.Z$0;
                        loadedCardControl2 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        loaded = (DependentControlStatus.Loaded) obj2;
                        if (loaded == null) {
                            return loaded;
                        }
                        DependentControlStatus.Loaded.LoadedCardControl copy$default = loadedCardControl2 != null ? DependentControlStatus.Loaded.LoadedCardControl.copy$default(loadedCardControl2, z2, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) : null;
                        return copy$default != null ? copy$default : new DependentControlStatus.Loaded.LoadedCardControl(70, null, z2, true);
                    }
                    z = dependentCardControlStatusRequestHandler$toggleDependentControl$1.Z$0;
                    DependentControlStatus.Loaded.LoadedCardControl loadedCardControl3 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    loadedCardControl = loadedCardControl3;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher = (SponseeWalletSnapshotFetcher) this.b;
                boolean z3 = !z;
                Pair pair = sponseeWalletSnapshotFetcher.cached;
                if (pair != null) {
                    sponseeWalletSnapshotFetcher.cached = new Pair(pair.first, SponseeWalletSnapshot.copy$default((SponseeWalletSnapshot) pair.second, z3, null, 13));
                }
                dependentCardControlStatusRequestHandler$toggleDependentControl$1.L$0 = loadedCardControl;
                dependentCardControlStatusRequestHandler$toggleDependentControl$1.Z$0 = z;
                dependentCardControlStatusRequestHandler$toggleDependentControl$1.label = 2;
                Object dependentControlStatus = getDependentControlStatus(false, dependentCardControlStatusRequestHandler$toggleDependentControl$1);
                if (dependentControlStatus != obj3) {
                    DependentControlStatus.Loaded.LoadedCardControl loadedCardControl4 = loadedCardControl;
                    obj2 = dependentControlStatus;
                    z2 = z;
                    loadedCardControl2 = loadedCardControl4;
                    loaded = (DependentControlStatus.Loaded) obj2;
                    if (loaded == null) {
                    }
                }
                return obj3;
            }
        }
        dependentCardControlStatusRequestHandler$toggleDependentControl$1 = new DependentCardControlStatusRequestHandler$toggleDependentControl$1(this, continuationImpl);
        Object obj22 = dependentCardControlStatusRequestHandler$toggleDependentControl$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentCardControlStatusRequestHandler$toggleDependentControl$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (((com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsResponse) ((app.cash.api.ApiResult.Success) r9).response).result == com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsResponse.Result.SUCCESS) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (((com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse) ((app.cash.api.ApiResult.Success) r9).response).result == com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse.Result.SUCCESS) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r9 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r9 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object togglePostcard(boolean z, ContinuationImpl continuationImpl) {
        DependentCardControlStatusRequestHandler$togglePostcard$1 dependentCardControlStatusRequestHandler$togglePostcard$1;
        int i;
        String str = (String) this.a;
        if (continuationImpl instanceof DependentCardControlStatusRequestHandler$togglePostcard$1) {
            dependentCardControlStatusRequestHandler$togglePostcard$1 = (DependentCardControlStatusRequestHandler$togglePostcard$1) continuationImpl;
            int i2 = dependentCardControlStatusRequestHandler$togglePostcard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dependentCardControlStatusRequestHandler$togglePostcard$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dependentCardControlStatusRequestHandler$togglePostcard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentCardControlStatusRequestHandler$togglePostcard$1.label;
                boolean z2 = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PostcardClientService postcardClientService = (PostcardClientService) this.c;
                    if (z) {
                        FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = new FamilyAccountsUnlockIssuedCardsRequest(str, ByteString.EMPTY);
                        dependentCardControlStatusRequestHandler$togglePostcard$1.label = 1;
                        obj = postcardClientService.familyAccountsUnlockIssuedCards(familyAccountsUnlockIssuedCardsRequest, dependentCardControlStatusRequestHandler$togglePostcard$1);
                    } else {
                        FamilyAccountsLockIssuedCardsRequest familyAccountsLockIssuedCardsRequest = new FamilyAccountsLockIssuedCardsRequest(str, ByteString.EMPTY);
                        dependentCardControlStatusRequestHandler$togglePostcard$1.label = 2;
                        obj = postcardClientService.familyAccountsLockIssuedCards(familyAccountsLockIssuedCardsRequest, dependentCardControlStatusRequestHandler$togglePostcard$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                    }
                    return Boolean.valueOf(z2);
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof ApiResult.Success) {
                }
                return Boolean.valueOf(z2);
            }
        }
        dependentCardControlStatusRequestHandler$togglePostcard$1 = new DependentCardControlStatusRequestHandler$togglePostcard$1(this, continuationImpl);
        Object obj2 = dependentCardControlStatusRequestHandler$togglePostcard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentCardControlStatusRequestHandler$togglePostcard$1.label;
        boolean z22 = false;
        if (i != 0) {
        }
    }

    public void updateMediaPeriodTimelines(Timeline timeline) {
        ImmutableList immutableList;
        StatusLine builder = RegularImmutableMap.builder();
        if (((ImmutableList) this.b).isEmpty()) {
            addTimelineForMediaPeriodId(builder, (MediaSource$MediaPeriodId) this.f, timeline);
            if (!Objects.equals((MediaSource$MediaPeriodId) this.h, (MediaSource$MediaPeriodId) this.f)) {
                addTimelineForMediaPeriodId(builder, (MediaSource$MediaPeriodId) this.h, timeline);
            }
            if (!Objects.equals((MediaSource$MediaPeriodId) this.i, (MediaSource$MediaPeriodId) this.f) && !Objects.equals((MediaSource$MediaPeriodId) this.i, (MediaSource$MediaPeriodId) this.h)) {
                addTimelineForMediaPeriodId(builder, (MediaSource$MediaPeriodId) this.i, timeline);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((ImmutableList) this.b).size();
                immutableList = (ImmutableList) this.b;
                if (i >= size) {
                    break;
                }
                addTimelineForMediaPeriodId(builder, (MediaSource$MediaPeriodId) immutableList.get(i), timeline);
                i++;
            }
            if (!immutableList.contains((MediaSource$MediaPeriodId) this.i)) {
                addTimelineForMediaPeriodId(builder, (MediaSource$MediaPeriodId) this.i, timeline);
            }
        }
        this.c = builder.build(true);
    }

    public void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            SVG.Box box = svgElement.boundingBox;
            float f = box.minX;
            float f2 = box.minY;
            float maxX = box.maxX();
            SVG.Box box2 = svgElement.boundingBox;
            float f3 = box2.minY;
            float maxX2 = box2.maxX();
            float maxY = svgElement.boundingBox.maxY();
            SVG.Box box3 = svgElement.boundingBox;
            float[] fArr = {f, f2, maxX, f3, maxX2, maxY, box3.minX, box3.maxY()};
            matrix.preConcat(((Canvas) this.a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVG.SvgElement svgElement2 = (SVG.SvgElement) ((Stack) this.i).peek();
            SVG.Box box4 = svgElement2.boundingBox;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (box4 == null) {
                svgElement2.boundingBox = new SVG.Box(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < box4.minX) {
                box4.minX = f8;
            }
            if (f9 < box4.minY) {
                box4.minY = f9;
            }
            if (f8 + f10 > box4.maxX()) {
                box4.width = (f8 + f10) - box4.minX;
            }
            if (f9 + f11 > box4.maxY()) {
                box4.height = (f9 + f11) - box4.minY;
            }
        }
    }

    public void updateStyle(SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState, SVG.Style style) {
        if (isSpecified(style, 4096L)) {
            sVGAndroidRenderer$RendererState.style.color = style.color;
        }
        if (isSpecified(style, 2048L)) {
            sVGAndroidRenderer$RendererState.style.opacity = style.opacity;
        }
        boolean isSpecified = isSpecified(style, 1L);
        SVG.Colour colour = SVG.Colour.TRANSPARENT;
        if (isSpecified) {
            sVGAndroidRenderer$RendererState.style.fill = style.fill;
            SVG.SvgPaint svgPaint = style.fill;
            sVGAndroidRenderer$RendererState.hasFill = (svgPaint == null || svgPaint == colour) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            sVGAndroidRenderer$RendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(sVGAndroidRenderer$RendererState, true, sVGAndroidRenderer$RendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            sVGAndroidRenderer$RendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            sVGAndroidRenderer$RendererState.style.stroke = style.stroke;
            SVG.SvgPaint svgPaint2 = style.stroke;
            sVGAndroidRenderer$RendererState.hasStroke = (svgPaint2 == null || svgPaint2 == colour) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            sVGAndroidRenderer$RendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(sVGAndroidRenderer$RendererState, false, sVGAndroidRenderer$RendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            sVGAndroidRenderer$RendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            SVG.Style style2 = sVGAndroidRenderer$RendererState.style;
            SVG.Length length = style.strokeWidth;
            style2.strokeWidth = length;
            sVGAndroidRenderer$RendererState.strokePaint.setStrokeWidth(length.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            SVG.Style style3 = sVGAndroidRenderer$RendererState.style;
            Paint paint = sVGAndroidRenderer$RendererState.strokePaint;
            style3.strokeLineCap = style.strokeLineCap;
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(style.strokeLineCap);
            if (ordinal == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (ordinal == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (ordinal == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            SVG.Style style4 = sVGAndroidRenderer$RendererState.style;
            Paint paint2 = sVGAndroidRenderer$RendererState.strokePaint;
            style4.strokeLineJoin = style.strokeLineJoin;
            int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(style.strokeLineJoin);
            if (ordinal2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (ordinal2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (ordinal2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            sVGAndroidRenderer$RendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            sVGAndroidRenderer$RendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            sVGAndroidRenderer$RendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            sVGAndroidRenderer$RendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typeface = null;
        if (isSpecified(style, 1536L)) {
            SVG.Style style5 = sVGAndroidRenderer$RendererState.style;
            Paint paint3 = sVGAndroidRenderer$RendererState.strokePaint;
            SVG.Length[] lengthArr = style5.strokeDashArray;
            if (lengthArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float floatValue = style5.strokeDashArray[i2 % length2].floatValue(this);
                    fArr[i2] = floatValue;
                    f += floatValue;
                }
                if (f == RecyclerView.DECELERATION_RATE) {
                    paint3.setPathEffect(null);
                } else {
                    float floatValue2 = style5.strokeDashOffset.floatValue(this);
                    if (floatValue2 < RecyclerView.DECELERATION_RATE) {
                        floatValue2 = (floatValue2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, floatValue2));
                }
            }
        }
        if (isSpecified(style, 16384L)) {
            float textSize = ((SVGAndroidRenderer$RendererState) this.c).fillPaint.getTextSize();
            sVGAndroidRenderer$RendererState.style.fontSize = style.fontSize;
            sVGAndroidRenderer$RendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, textSize));
            sVGAndroidRenderer$RendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, textSize));
        }
        if (isSpecified(style, 8192L)) {
            sVGAndroidRenderer$RendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768L)) {
            if (style.fontWeight.intValue() == -1 && sVGAndroidRenderer$RendererState.style.fontWeight.intValue() > 100) {
                SVG.Style style6 = sVGAndroidRenderer$RendererState.style;
                style6.fontWeight = Integer.valueOf(style6.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() != 1 || sVGAndroidRenderer$RendererState.style.fontWeight.intValue() >= 900) {
                sVGAndroidRenderer$RendererState.style.fontWeight = style.fontWeight;
            } else {
                SVG.Style style7 = sVGAndroidRenderer$RendererState.style;
                style7.fontWeight = Integer.valueOf(style7.fontWeight.intValue() + 100);
            }
        }
        if (isSpecified(style, 65536L)) {
            sVGAndroidRenderer$RendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496L)) {
            SVG.Style style8 = sVGAndroidRenderer$RendererState.style;
            ArrayList arrayList = style8.fontFamily;
            if (arrayList != null && ((SVG) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typeface = checkGenericFont(style8.fontStyle, style8.fontWeight, (String) it.next());
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = checkGenericFont(style8.fontStyle, style8.fontWeight, "serif");
            }
            sVGAndroidRenderer$RendererState.fillPaint.setTypeface(typeface);
            sVGAndroidRenderer$RendererState.strokePaint.setTypeface(typeface);
        }
        if (isSpecified(style, 131072L)) {
            SVG.Style style9 = sVGAndroidRenderer$RendererState.style;
            Paint paint4 = sVGAndroidRenderer$RendererState.strokePaint;
            Paint paint5 = sVGAndroidRenderer$RendererState.fillPaint;
            style9.textDecoration = style.textDecoration;
            paint5.setStrikeThruText(style.textDecoration == 4);
            paint5.setUnderlineText(style.textDecoration == 2);
            paint4.setStrikeThruText(style.textDecoration == 4);
            paint4.setUnderlineText(style.textDecoration == 2);
        }
        if (isSpecified(style, 68719476736L)) {
            sVGAndroidRenderer$RendererState.style.direction = style.direction;
        }
        if (isSpecified(style, 262144L)) {
            sVGAndroidRenderer$RendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288L)) {
            sVGAndroidRenderer$RendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152L)) {
            sVGAndroidRenderer$RendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304L)) {
            sVGAndroidRenderer$RendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608L)) {
            sVGAndroidRenderer$RendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            sVGAndroidRenderer$RendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432L)) {
            sVGAndroidRenderer$RendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576L)) {
            sVGAndroidRenderer$RendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456L)) {
            sVGAndroidRenderer$RendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912L)) {
            sVGAndroidRenderer$RendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824L)) {
            sVGAndroidRenderer$RendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864L)) {
            sVGAndroidRenderer$RendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728L)) {
            sVGAndroidRenderer$RendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            sVGAndroidRenderer$RendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            sVGAndroidRenderer$RendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            sVGAndroidRenderer$RendererState.style.imageRendering = style.imageRendering;
        }
    }

    public void updateStyleForElement(SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState, SVG.SvgElementBase svgElementBase) {
        boolean z = svgElementBase.parent == null;
        SVG.Style style = sVGAndroidRenderer$RendererState.style;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        style.display = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        style.overflow = bool;
        style.clip = null;
        style.clipPath = null;
        style.opacity = valueOf;
        style.stopColor = SVG.Colour.BLACK;
        style.stopOpacity = valueOf;
        style.mask = null;
        style.solidColor = null;
        style.solidOpacity = valueOf;
        style.viewportFill = null;
        style.viewportFillOpacity = valueOf;
        style.vectorEffect = 1;
        SVG.Style style2 = svgElementBase.baseStyle;
        if (style2 != null) {
            updateStyle(sVGAndroidRenderer$RendererState, style2);
        }
        ArrayList arrayList = ((CSSParser.Ruleset) ((SVG) this.b).cssRules).rules;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((CSSParser.Ruleset) ((SVG) this.b).cssRules).rules.iterator();
            while (it.hasNext()) {
                CSSParser.Rule rule = (CSSParser.Rule) it.next();
                if (CSSParser.ruleMatch(rule.selector, svgElementBase)) {
                    updateStyle(sVGAndroidRenderer$RendererState, rule.style);
                }
            }
        }
        SVG.Style style3 = svgElementBase.style;
        if (style3 != null) {
            updateStyle(sVGAndroidRenderer$RendererState, style3);
        }
    }

    public void viewportFill() {
        int i;
        SVG.Style style = ((SVGAndroidRenderer$RendererState) this.c).style;
        SVG.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = style.color.colour;
        }
        Float f = style.viewportFillOpacity;
        if (f != null) {
            i = colourWithOpacity(f.floatValue(), i);
        }
        ((Canvas) this.a).drawColor(i);
    }

    public boolean visible() {
        Boolean bool = ((SVGAndroidRenderer$RendererState) this.c).style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public AbstractFuture zza() {
        AtomicLong atomicLong;
        long j;
        int i;
        ListenableFuture listenableFuture;
        Executor executor = DirectExecutor.INSTANCE;
        SettableFuture settableFuture = (SettableFuture) this.h;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = (AtomicLong) this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & BodyPartID.bodyIdMax) | (i << 32)));
        AtomicReference atomicReference = (AtomicReference) this.i;
        SettableFuture settableFuture2 = new SettableFuture();
        ListenableFuture listenableFuture2 = (ListenableFuture) atomicReference.getAndSet(settableFuture2);
        if (listenableFuture2 == null) {
            zzz zzb = zzxa.zzb(new Sniffer(this, i, 17));
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
            trustedListenableFutureTask.task = trustedListenableFutureTask.new TrustedFutureInterruptibleAsyncTask(zzb);
            executor.execute(trustedListenableFutureTask);
            listenableFuture = trustedListenableFutureTask;
        } else {
            zzvh zzvhVar = new zzvh(this, i, 0);
            int i2 = zzxa.$r8$clinit;
            listenableFuture = AbstractCatchingFuture.createAsync(listenableFuture2, Throwable.class, new zzqa(4, zzvy.zzb(), zzvhVar), (SequentialExecutor) this.f);
        }
        settableFuture2.setFuture(listenableFuture);
        zzvk zzvkVar = new zzvk(this, i);
        settableFuture2.addListener(new Fillr.AnonymousClass2(8, this, settableFuture2, zzvkVar), executor);
        return zzvkVar;
    }

    public Task zzd(final zze zzeVar, final zzns zznsVar) {
        try {
            final zzgb zzgbVar = new zzgb();
            if (!Places.zza.zzc || zznsVar.equals(zzns.zzb)) {
                zzw zzc = ((JWECryptoParts) this.a).zzc(zzeVar, zznsVar);
                final int i = 0;
                com.google.android.gms.tasks.Continuation continuation = new com.google.android.gms.tasks.Continuation(this, zzeVar, zznsVar, zzgbVar, i) { // from class: com.google.android.libraries.places.internal.zzhk
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ e0 zza;
                    public final /* synthetic */ com.google.android.libraries.places.api.net.zze zzb;
                    public final /* synthetic */ zzns zzc;

                    {
                        this.$r8$classId = i;
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        int i2 = this.$r8$classId;
                        zzns zznsVar2 = this.zzc;
                        com.google.android.libraries.places.api.net.zze zzeVar2 = this.zzb;
                        e0 e0Var = this.zza;
                        switch (i2) {
                            case 0:
                                ((zbc) e0Var.i).zzm(zzeVar2, 2, zznsVar2);
                                "FetchPlace".concat("Duration");
                                "FetchPlace".concat("Battery");
                                break;
                            default:
                                ((zbc) e0Var.i).zzm(zzeVar2, 3, zznsVar2);
                                "GetPlace".concat("Duration");
                                "GetPlace".concat("Battery");
                                break;
                        }
                        return (com.google.android.libraries.places.api.net.zzf) task.getResult();
                    }
                };
                AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                return ((zzw) zzc.continueWith(androidMainExecutor, continuation)).continueWithTask(androidMainExecutor, zzgc.zza$10);
            }
            Task zzc2 = ((SubtreeManager) this.h).zzc(zzeVar, zznsVar);
            final int i2 = 1;
            com.google.android.gms.tasks.Continuation continuation2 = new com.google.android.gms.tasks.Continuation(this, zzeVar, zznsVar, zzgbVar, i2) { // from class: com.google.android.libraries.places.internal.zzhk
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ e0 zza;
                public final /* synthetic */ com.google.android.libraries.places.api.net.zze zzb;
                public final /* synthetic */ zzns zzc;

                {
                    this.$r8$classId = i2;
                    this.zza = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i22 = this.$r8$classId;
                    zzns zznsVar2 = this.zzc;
                    com.google.android.libraries.places.api.net.zze zzeVar2 = this.zzb;
                    e0 e0Var = this.zza;
                    switch (i22) {
                        case 0:
                            ((zbc) e0Var.i).zzm(zzeVar2, 2, zznsVar2);
                            "FetchPlace".concat("Duration");
                            "FetchPlace".concat("Battery");
                            break;
                        default:
                            ((zbc) e0Var.i).zzm(zzeVar2, 3, zznsVar2);
                            "GetPlace".concat("Duration");
                            "GetPlace".concat("Battery");
                            break;
                    }
                    return (com.google.android.libraries.places.api.net.zzf) task.getResult();
                }
            };
            AndroidMainExecutor androidMainExecutor2 = TaskExecutors.MAIN_THREAD;
            return ((zzw) ((zzw) zzc2).continueWith(androidMainExecutor2, continuation2)).continueWithTask(androidMainExecutor2, zzgc.zza$2);
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    public Task zzg(zzq zzqVar) {
        List list;
        zzns zznsVar = zzns.zzc;
        Place.Field field = Place.Field.UTC_OFFSET;
        Place.Field field2 = Place.Field.OPENING_HOURS;
        Place.Field field3 = Place.Field.CURRENT_OPENING_HOURS;
        Place.Field field4 = Place.Field.BUSINESS_STATUS;
        try {
            final Place place = zzqVar.zza;
            String str = zzqVar.zzb;
            final long j = zzqVar.zzc;
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            if (place == null) {
                RegularImmutableMap regularImmutableMap = zzgu.zzb;
                list = Arrays.asList(field4, field3, field2, field);
            } else {
                RegularImmutableMap regularImmutableMap2 = zzgu.zzb;
                ArrayList arrayList = new ArrayList();
                Place.BusinessStatus businessStatus = ((zzfi) place).zzf;
                if (businessStatus == null || businessStatus == Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        arrayList.add(field4);
                    }
                    if (((zzfi) place).zzi == null) {
                        arrayList.add(field3);
                    }
                    if (((zzfi) place).zzu == null) {
                        arrayList.add(field2);
                    }
                    if (((zzfi) place).zzT == null) {
                        arrayList.add(field);
                    }
                }
                list = arrayList;
            }
            if (list.isEmpty()) {
                place.getClass();
                taskCompletionSource.setResult(new zzr(zzgu.zza(place, j)));
                return taskCompletionSource.zza;
            }
            if (place != null) {
                str = ((zzfi) place).zzp;
            }
            str.getClass();
            MetadataRepo builder = zze.builder(str, list);
            builder.mTypeface = zzqVar.zzd;
            zze build = builder.build();
            zzgb zzgbVar = new zzgb();
            if (Places.zza.zzc) {
                Task zzc = ((SubtreeManager) this.h).zzc(build, zznsVar);
                final int i = 1;
                return ((zzw) zzc).continueWith(TaskExecutors.MAIN_THREAD, new Box(this, build, zzgbVar)).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgv
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        int i2 = i;
                        long j2 = j;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Place place2 = place;
                        com.google.android.libraries.places.api.net.zzf zzfVar = (com.google.android.libraries.places.api.net.zzf) obj;
                        switch (i2) {
                            case 0:
                                com.google.android.libraries.places.api.model.zzfi zzfiVar = zzfVar.zza;
                                Place.BusinessStatus businessStatus2 = zzfiVar.zzf;
                                com.google.android.libraries.places.api.model.zzey zzeyVar = zzfiVar.zzi;
                                com.google.android.libraries.places.api.model.zzey zzeyVar2 = zzfiVar.zzu;
                                Integer num = zzfiVar.zzT;
                                if (place2 != null) {
                                    if (num == null) {
                                        num = ((com.google.android.libraries.places.api.model.zzfi) place2).zzT;
                                    }
                                    if (businessStatus2 == null) {
                                        businessStatus2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzf;
                                    }
                                    if (zzeyVar == null) {
                                        zzeyVar = ((com.google.android.libraries.places.api.model.zzfi) place2).zzi;
                                    }
                                    if (zzeyVar2 == null) {
                                        zzeyVar2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzu;
                                    }
                                }
                                zzbm builder2 = Place.builder();
                                builder2.zzf = businessStatus2;
                                builder2.zzi = zzeyVar;
                                builder2.zzu = zzeyVar2;
                                builder2.zzT = num;
                                taskCompletionSource2.setResult(new zzr(zzgu.zza(builder2.build(), j2)));
                                break;
                            default:
                                com.google.android.libraries.places.api.model.zzfi zzfiVar2 = zzfVar.zza;
                                Place.BusinessStatus businessStatus3 = zzfiVar2.zzf;
                                com.google.android.libraries.places.api.model.zzey zzeyVar3 = zzfiVar2.zzi;
                                com.google.android.libraries.places.api.model.zzey zzeyVar4 = zzfiVar2.zzu;
                                Integer num2 = zzfiVar2.zzT;
                                if (place2 != null) {
                                    if (num2 == null) {
                                        num2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzT;
                                    }
                                    if (businessStatus3 == null) {
                                        businessStatus3 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzf;
                                    }
                                    if (zzeyVar3 == null) {
                                        zzeyVar3 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzi;
                                    }
                                    if (zzeyVar4 == null) {
                                        zzeyVar4 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzu;
                                    }
                                }
                                zzbm builder3 = Place.builder();
                                builder3.zzf = businessStatus3;
                                builder3.zzi = zzeyVar3;
                                builder3.zzu = zzeyVar4;
                                builder3.zzT = num2;
                                taskCompletionSource2.setResult(new zzr(zzgu.zza(builder3.build(), j2)));
                                break;
                        }
                        return taskCompletionSource2.zza;
                    }
                }).continueWithTask(zzgc.zza$5);
            }
            final int i2 = 0;
            return ((JWECryptoParts) this.a).zzc(build, zznsVar).continueWith(TaskExecutors.MAIN_THREAD, new zbc(this, build, zzgbVar, 24)).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgv
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    int i22 = i2;
                    long j2 = j;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    Place place2 = place;
                    com.google.android.libraries.places.api.net.zzf zzfVar = (com.google.android.libraries.places.api.net.zzf) obj;
                    switch (i22) {
                        case 0:
                            com.google.android.libraries.places.api.model.zzfi zzfiVar = zzfVar.zza;
                            Place.BusinessStatus businessStatus2 = zzfiVar.zzf;
                            com.google.android.libraries.places.api.model.zzey zzeyVar = zzfiVar.zzi;
                            com.google.android.libraries.places.api.model.zzey zzeyVar2 = zzfiVar.zzu;
                            Integer num = zzfiVar.zzT;
                            if (place2 != null) {
                                if (num == null) {
                                    num = ((com.google.android.libraries.places.api.model.zzfi) place2).zzT;
                                }
                                if (businessStatus2 == null) {
                                    businessStatus2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzf;
                                }
                                if (zzeyVar == null) {
                                    zzeyVar = ((com.google.android.libraries.places.api.model.zzfi) place2).zzi;
                                }
                                if (zzeyVar2 == null) {
                                    zzeyVar2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzu;
                                }
                            }
                            zzbm builder2 = Place.builder();
                            builder2.zzf = businessStatus2;
                            builder2.zzi = zzeyVar;
                            builder2.zzu = zzeyVar2;
                            builder2.zzT = num;
                            taskCompletionSource2.setResult(new zzr(zzgu.zza(builder2.build(), j2)));
                            break;
                        default:
                            com.google.android.libraries.places.api.model.zzfi zzfiVar2 = zzfVar.zza;
                            Place.BusinessStatus businessStatus3 = zzfiVar2.zzf;
                            com.google.android.libraries.places.api.model.zzey zzeyVar3 = zzfiVar2.zzi;
                            com.google.android.libraries.places.api.model.zzey zzeyVar4 = zzfiVar2.zzu;
                            Integer num2 = zzfiVar2.zzT;
                            if (place2 != null) {
                                if (num2 == null) {
                                    num2 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzT;
                                }
                                if (businessStatus3 == null) {
                                    businessStatus3 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzf;
                                }
                                if (zzeyVar3 == null) {
                                    zzeyVar3 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzi;
                                }
                                if (zzeyVar4 == null) {
                                    zzeyVar4 = ((com.google.android.libraries.places.api.model.zzfi) place2).zzu;
                                }
                            }
                            zzbm builder3 = Place.builder();
                            builder3.zzf = businessStatus3;
                            builder3.zzi = zzeyVar3;
                            builder3.zzu = zzeyVar4;
                            builder3.zzT = num2;
                            taskCompletionSource2.setResult(new zzr(zzgu.zza(builder3.build(), j2)));
                            break;
                    }
                    return taskCompletionSource2.zza;
                }
            }).continueWithTask(zzgc.zza$4);
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    public AbstractFuture zzh(int i) {
        DirectExecutor directExecutor;
        AtomicLong atomicLong = (AtomicLong) this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
            return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
        }
        zzvl zzvlVar = new zzvl(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.c;
            zzvl zzvlVar2 = (zzvl) atomicReference.get();
            if (zzvlVar2 != null && zzvlVar2.zza > i) {
                ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture2 = ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
                return immediateCancelledFuture2 != null ? immediateCancelledFuture2 : new ImmediateFuture.ImmediateCancelledFuture();
            }
            while (!atomicReference.compareAndSet(zzvlVar2, zzvlVar)) {
                if (atomicReference.get() != zzvlVar2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i) {
                zzvlVar.cancel(true);
                while (!atomicReference.compareAndSet(zzvlVar, null) && atomicReference.get() == zzvlVar) {
                }
                return zzvlVar;
            }
            zzpn zzpnVar = (zzpn) this.a;
            AsyncCallable asyncCallable = (AsyncCallable) zzpnVar.zza;
            if (asyncCallable == null || (directExecutor = (DirectExecutor) zzpnVar.zzb) == null) {
                zzvlVar.setFuture((SettableFuture) this.h);
                return zzvlVar;
            }
            zzz zzb = zzxa.zzb(asyncCallable);
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
            trustedListenableFutureTask.task = trustedListenableFutureTask.new TrustedFutureInterruptibleAsyncTask(zzb);
            directExecutor.execute(trustedListenableFutureTask);
            zzvlVar.setFuture(trustedListenableFutureTask);
            return zzvlVar;
        }
    }

    public SVGAndroidRenderer$RendererState findInheritFromAncestorState(SVG.SvgElementBase svgElementBase) {
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = new SVGAndroidRenderer$RendererState();
        updateStyle(sVGAndroidRenderer$RendererState, SVG.Style.getDefaultStyle());
        findInheritFromAncestorState(svgElementBase, sVGAndroidRenderer$RendererState);
        return sVGAndroidRenderer$RendererState;
    }

    public static void a(t tVar, String str) {
        v1 v1Var = new v1(tVar);
        v1Var.i = str;
        tVar.b(v1Var);
    }

    public void a(b bVar, t tVar) {
        HashMap hashMap = (HashMap) this.c;
        if (!hashMap.containsKey(bVar)) {
            hashMap.put(bVar, tVar);
            return;
        }
        StringBuilder sb = new StringBuilder("A schema with target namespace ");
        sb.append(bVar.a);
        sb.append(" and system ID ");
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, bVar.b, " is already present."));
    }

    public static Document a(DocumentBuilder documentBuilder, InputSource inputSource) {
        try {
            return (Document) AccessController.doPrivileged(new a(documentBuilder, inputSource));
        } catch (PrivilegedActionException e) {
            Exception exception = e.getException();
            if (!(exception instanceof IOException)) {
                if (exception instanceof SAXException) {
                    throw ((SAXException) exception);
                }
                return null;
            }
            throw ((IOException) exception);
        }
    }

    public t a(StreamSource streamSource) {
        InputSource inputSource = new InputSource(streamSource.getSystemId());
        inputSource.setByteStream(streamSource.getInputStream());
        inputSource.setCharacterStream(streamSource.getReader());
        inputSource.setPublicId(streamSource.getPublicId());
        return a(inputSource, (o) null);
    }

    public t a(Document document, String str, o oVar) {
        t a2 = new n(this, oVar).a(document, str);
        try {
        } catch (Throwable unused) {
        }
        return a2;
    }

    public void a(QName qName, b2 b2Var) {
        HashMap hashMap = (HashMap) this.i;
        ArrayList arrayList = (ArrayList) hashMap.get(qName);
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).u = b2Var;
        }
        hashMap.remove(qName);
    }

    public Task zza(final zzk zzkVar, final zzns zznsVar) {
        try {
            final zzgb zzgbVar = new zzgb();
            if (!zznsVar.equals(zzns.zzd) && !zznsVar.equals(zzns.zze) && (!Places.zza.zzc || zznsVar.equals(zzns.zzb))) {
                zzw zza = ((JWECryptoParts) this.a).zza(zzkVar, zznsVar);
                final int i = 1;
                com.google.android.gms.tasks.Continuation continuation = new com.google.android.gms.tasks.Continuation(this, zzkVar, zznsVar, zzgbVar, i) { // from class: com.google.android.libraries.places.internal.zzha
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ e0 zza;
                    public final /* synthetic */ zzk zzb;
                    public final /* synthetic */ zzns zzc;

                    {
                        this.$r8$classId = i;
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        int i2 = this.$r8$classId;
                        zzns zznsVar2 = this.zzc;
                        zzk zzkVar2 = this.zzb;
                        e0 e0Var = this.zza;
                        switch (i2) {
                            case 0:
                                ((zbc) e0Var.i).zzk(zzkVar2, 3, zznsVar2);
                                "FindAutocompletePredictionsOnePlatform".concat("Duration");
                                "FindAutocompletePredictionsOnePlatform".concat("Battery");
                                break;
                            default:
                                ((zbc) e0Var.i).zzk(zzkVar2, 2, zznsVar2);
                                "FindAutocompletePredictions".concat("Duration");
                                "FindAutocompletePredictions".concat("Battery");
                                break;
                        }
                        return (com.google.android.libraries.places.api.net.zzl) task.getResult();
                    }
                };
                AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                return ((zzw) zza.continueWith(androidMainExecutor, continuation)).continueWithTask(androidMainExecutor, zzgc.zza$1);
            }
            Task zzb = ((SubtreeManager) this.h).zzb(zzkVar, zznsVar);
            final int i2 = 0;
            com.google.android.gms.tasks.Continuation continuation2 = new com.google.android.gms.tasks.Continuation(this, zzkVar, zznsVar, zzgbVar, i2) { // from class: com.google.android.libraries.places.internal.zzha
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ e0 zza;
                public final /* synthetic */ zzk zzb;
                public final /* synthetic */ zzns zzc;

                {
                    this.$r8$classId = i2;
                    this.zza = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i22 = this.$r8$classId;
                    zzns zznsVar2 = this.zzc;
                    zzk zzkVar2 = this.zzb;
                    e0 e0Var = this.zza;
                    switch (i22) {
                        case 0:
                            ((zbc) e0Var.i).zzk(zzkVar2, 3, zznsVar2);
                            "FindAutocompletePredictionsOnePlatform".concat("Duration");
                            "FindAutocompletePredictionsOnePlatform".concat("Battery");
                            break;
                        default:
                            ((zbc) e0Var.i).zzk(zzkVar2, 2, zznsVar2);
                            "FindAutocompletePredictions".concat("Duration");
                            "FindAutocompletePredictions".concat("Battery");
                            break;
                    }
                    return (com.google.android.libraries.places.api.net.zzl) task.getResult();
                }
            };
            AndroidMainExecutor androidMainExecutor2 = TaskExecutors.MAIN_THREAD;
            return ((zzw) ((zzw) zzb).continueWith(androidMainExecutor2, continuation2)).continueWithTask(androidMainExecutor2, zzgc.zza$7);
        } catch (Error | RuntimeException e) {
            zznv.zzb(e);
            throw e;
        }
    }

    public static void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.cx == null) {
            svgRadialGradient.cx = svgRadialGradient2.cx;
        }
        if (svgRadialGradient.cy == null) {
            svgRadialGradient.cy = svgRadialGradient2.cy;
        }
        if (svgRadialGradient.r == null) {
            svgRadialGradient.r = svgRadialGradient2.r;
        }
        if (svgRadialGradient.fx == null) {
            svgRadialGradient.fx = svgRadialGradient2.fx;
        }
        if (svgRadialGradient.fy == null) {
            svgRadialGradient.fy = svgRadialGradient2.fy;
        }
    }

    public Path makePathAndBoundingBox(SVG.Circle circle) {
        SVG.Length length = circle.cx;
        float f = RecyclerView.DECELERATION_RATE;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = circle.cy;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        float f2 = f;
        float floatValue = circle.r.floatValue(this);
        float f3 = floatValueX - floatValue;
        float f4 = f2 - floatValue;
        float f5 = floatValueX + floatValue;
        float f6 = f2 + floatValue;
        if (circle.boundingBox == null) {
            float f7 = 2.0f * floatValue;
            circle.boundingBox = new SVG.Box(f3, f4, f7, f7);
        }
        float f8 = floatValue * 0.5522848f;
        Path path = new Path();
        path.moveTo(floatValueX, f4);
        float f9 = floatValueX + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, floatValueX, f6);
        float f12 = floatValueX - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, floatValueX, f4);
        path.close();
        return path;
    }

    public Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        SVG.Length length = ellipse.cx;
        float f = RecyclerView.DECELERATION_RATE;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = ellipse.cy;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        float f2 = f;
        float floatValueX2 = ellipse.rx.floatValueX(this);
        float floatValueY = ellipse.ry.floatValueY(this);
        float f3 = floatValueX - floatValueX2;
        float f4 = f2 - floatValueY;
        float f5 = floatValueX + floatValueX2;
        float f6 = f2 + floatValueY;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVG.Box(f3, f4, floatValueX2 * 2.0f, 2.0f * floatValueY);
        }
        float f7 = floatValueX2 * 0.5522848f;
        float f8 = floatValueY * 0.5522848f;
        Path path = new Path();
        path.moveTo(floatValueX, f4);
        float f9 = floatValueX + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, floatValueX, f6);
        float f12 = floatValueX - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, floatValueX, f4);
        path.close();
        return path;
    }

    public static Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = polyLine.points;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        BitcoinPerformanceSummaryViewModel.Loading loading;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.b;
        gapComposer.startReplaceGroup(-181979614);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            Flow flow2 = ((RealBitcoinPerformanceDataRepo) this.a).bitcoinPerformanceSummary;
            gapComposer.updateRememberedValue(flow2);
            obj = flow2;
        }
        BitcoinPerformanceSummary.Empty empty = BitcoinPerformanceSummary.Empty.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) obj, empty, null, gapComposer, 0, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj2 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj2;
        boolean changed = gapComposer.changed(flow);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue3;
        if (changed || rememberedValue3 == neverEqualPolicy) {
            CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(flow, 5);
            gapComposer.updateRememberedValue(cardModelView$iconTexture$$inlined$map$1);
            obj3 = cardModelView$iconTexture$$inlined$map$1;
        }
        Flow flow3 = (Flow) obj3;
        ?? r2 = 0;
        Updater.LaunchedEffect((Composer) gapComposer, flow3, new BenefitsHubPresenter$models$1$1(flow3, (Continuation) r2, this, screenNavigator, 28));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue4;
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$2 = new AmountBlockerPresenter$models$1$2(this, mutableState, (Continuation) r2, 4);
            gapComposer.updateRememberedValue(amountBlockerPresenter$models$1$2);
            obj4 = amountBlockerPresenter$models$1$2;
        }
        Updater.LaunchedEffect((Composer) gapComposer, unit, (Function2) obj4);
        MutableState produceStaleTimeoutState = TimeoutKt.produceStaleTimeoutState((BitcoinPerformanceSummary) collectAsState.getValue(), gapComposer);
        Boolean bool = (Boolean) produceStaleTimeoutState.getValue();
        bool.getClass();
        boolean changed2 = gapComposer.changed(produceStaleTimeoutState) | gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue5;
        if (changed2 || rememberedValue5 == neverEqualPolicy) {
            InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, produceStaleTimeoutState, (Continuation) r2, 2);
            gapComposer.updateRememberedValue(anonymousClass2);
            obj5 = anonymousClass2;
        }
        Updater.LaunchedEffect((Composer) gapComposer, bool, (Function2) obj5);
        BitcoinPerformanceSummary bitcoinPerformanceSummary = (BitcoinPerformanceSummary) collectAsState.getValue();
        if (!Intrinsics.areEqual(bitcoinPerformanceSummary, empty)) {
            if (Intrinsics.areEqual(bitcoinPerformanceSummary, BitcoinPerformanceSummary.Loading.INSTANCE)) {
                loading = new BitcoinPerformanceSummaryViewModel.Loading(((Boolean) mutableState.getValue()).booleanValue() ? androidStringManager.get(R.string.bitcoin_presenters_performance_summary_subtitle) : null);
            } else if (bitcoinPerformanceSummary instanceof BitcoinPerformanceSummary.Loaded) {
                BitcoinPerformanceSummary.Loaded loaded = (BitcoinPerformanceSummary.Loaded) bitcoinPerformanceSummary;
                if (loaded.isStale && !((Boolean) produceStaleTimeoutState.getValue()).booleanValue()) {
                    loading = new BitcoinPerformanceSummaryViewModel.Loading(((Boolean) mutableState.getValue()).booleanValue() ? androidStringManager.get(R.string.bitcoin_presenters_performance_summary_subtitle) : null);
                } else {
                    Money money = loaded.allTimeReturnsValue;
                    double d = loaded.allTimeReturnsPercent;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) produceStaleTimeoutState.getValue()).booleanValue();
                    String format2 = ((MoneyFormatter) this.f).format(money);
                    NumberFormat numberFormat = (NumberFormat) this.h;
                    numberFormat.getClass();
                    r2 = new BitcoinPerformanceSummaryViewModel.Loaded(format2, BlurKt.formatPerformancePercent(numberFormat, d), booleanValue ? androidStringManager.get(R.string.bitcoin_presenters_performance_summary_subtitle) : null, booleanValue2);
                }
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            r2 = loading;
        }
        gapComposer.end(false);
        return r2;
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.i = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public e0(float[] fArr) {
        this.$r8$classId = 24;
        fArr.getClass();
        this.a = fArr;
        this.b = new float[16];
        this.c = new float[16];
        this.i = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }

    public /* synthetic */ e0(int i) {
        this.$r8$classId = i;
    }

    public e0(ContextWrapper contextWrapper, ProfileStore_ profileStore_) {
        this.$r8$classId = 15;
        this.h = null;
        this.a = profileStore_;
        this.b = contextWrapper;
        this.f = new AppPreferenceStore(contextWrapper);
        this.h = Schema_.getInstance_(contextWrapper);
    }

    public e0(CaptureFieldsMappingService captureFieldsMappingService) {
        this.$r8$classId = 14;
        this.b = new HashMap();
        this.c = new HashMap();
        this.i = captureFieldsMappingService;
        this.f = new AppPreferenceStore(captureFieldsMappingService);
        zzbq zzbqVar = new zzbq(this, 5);
        this.h = zzbqVar;
        LocalBroadcastManager.getInstance(captureFieldsMappingService).registerReceiver(zzbqVar, new IntentFilter("com.fillr.service.CaptureFieldsMappingService.SensitiveDataSave"));
    }

    public e0(AsyncCallable asyncCallable) {
        this.$r8$classId = 16;
        this.b = new AtomicLong(-9223372034707292160L);
        this.c = new AtomicReference(null);
        this.i = new AtomicReference(null);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        this.f = new SequentialExecutor(directExecutor);
        SettableFuture settableFuture = new SettableFuture();
        this.h = settableFuture;
        zzpn zzpnVar = new zzpn();
        zzpnVar.zza = asyncCallable;
        zzpnVar.zzb = directExecutor;
        this.a = zzpnVar;
        settableFuture.addListener(zzpnVar, directExecutor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(JWECryptoParts jWECryptoParts, zzah zzahVar, Box box, zbc zbcVar, zzex zzexVar, SubtreeManager subtreeManager, zzah zzahVar2) {
        this.$r8$classId = 21;
        this.a = jWECryptoParts;
        this.b = zzahVar;
        this.c = box;
        this.i = zbcVar;
        this.f = zzexVar;
        this.h = subtreeManager;
        zzfp zzfpVar = (zzfp) zzahVar2.zzc;
        AbstractTransformFuture.TransformFuture transform = com.google.common.util.concurrent.Futures.transform(zzfpVar.zzc, new zzfl(0), zzfpVar.zzb);
        final zzfm zzfmVar = new zzfm(zzahVar2, 1);
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzft
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return (ListenableFuture) zzfm.this.invoke(obj);
            }
        };
        MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) zzahVar2.zzb;
        AbstractTransformFuture.AsyncTransformFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(transform, asyncFunction, moreExecutors$ScheduledListeningDecorator);
        transformAsync.addListener(new zzb(transformAsync, new zzfv(zzahVar2, 0), 0 == true ? 1 : 0, 15), moreExecutors$ScheduledListeningDecorator);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r2.equals("logs") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r2.equals("rum") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(String str, DataUploadConfiguration dataUploadConfiguration, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger, Strings strings) {
        String str2;
        String str3;
        this.$r8$classId = 11;
        str.getClass();
        internalLogger.getClass();
        strings.getClass();
        this.a = dataUploadConfiguration;
        this.b = filePersistenceConfig;
        this.c = internalLogger;
        this.i = strings;
        switch (str.hashCode()) {
            case -1067396926:
                if (str.equals("tracing")) {
                    str2 = "trace";
                    break;
                }
                str2 = null;
                break;
            case 113290:
                str3 = "rum";
                break;
            case 3327407:
                str3 = "logs";
                break;
            case 456014590:
                if (str.equals("session-replay")) {
                    str2 = "sr";
                    break;
                }
                str2 = null;
                break;
            case 2144122390:
                if (str.equals("session-replay-resources")) {
                    str2 = "sr-resources";
                    break;
                }
                str2 = null;
                break;
            default:
                str2 = null;
                break;
        }
        this.f = str2;
        this.h = new AtomicBoolean(true);
    }

    public e0(RealFamilyProfileManager realFamilyProfileManager, RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl, AndroidStringManager androidStringManager, Set set, CoroutineScope coroutineScope) {
        SectionProviderId sectionProviderId;
        this.$r8$classId = 29;
        this.a = realFamilyProfileManager;
        this.b = realFamilyNavigator$Factory$Impl;
        this.c = androidStringManager;
        this.i = set;
        this.f = coroutineScope;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            switch (((DisclosureSectionProvider$Factory$Impl) it.next()).$r8$classId) {
                case 0:
                    sectionProviderId = SectionProviderId.DISCLOSURE;
                    break;
                case 1:
                    sectionProviderId = SectionProviderId.DEPOSIT;
                    break;
                case 2:
                    sectionProviderId = SectionProviderId.MANAGED_ACCOUNT_SETTINGS;
                    break;
                case 3:
                    sectionProviderId = SectionProviderId.APPLET;
                    break;
                default:
                    sectionProviderId = SectionProviderId.BANNER;
                    break;
            }
            linkedHashSet.add(sectionProviderId);
        }
        this.h = linkedHashSet;
    }

    public e0(CashLiteFlowClientService cashLiteFlowClientService, FlowStarter flowStarter, RealCryptoAnalytics realCryptoAnalytics, e eVar, RealCryptoTransactionActionManager realCryptoTransactionActionManager, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        this.$r8$classId = 25;
        screen.getClass();
        this.a = cashLiteFlowClientService;
        this.b = flowStarter;
        this.c = realCryptoAnalytics;
        this.i = realCryptoTransactionActionManager;
        this.f = screen;
        if (scenarioPlanInput instanceof InitiateBitcoinWithdrawalScenarioPlanInput) {
            this.h = ((InitiateBitcoinWithdrawalScenarioPlanInput) scenarioPlanInput).payment;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinWithdrawalScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
    }

    public e0(String str, SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher, PostcardClientService postcardClientService, AegisService aegisService, FeatureFlagManager featureFlagManager) {
        this.$r8$classId = 27;
        str.getClass();
        this.a = str;
        this.b = sponseeWalletSnapshotFetcher;
        this.c = postcardClientService;
        this.i = aegisService;
        this.f = featureFlagManager;
    }

    public e0(Endpoint endpoint) {
        this.$r8$classId = 10;
        this.a = endpoint;
        this.b = new ArgsListSerializer(endpoint, 2);
        this.c = new ArrayList();
        this.i = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(Context context) {
        String str;
        Integer num;
        Method method;
        Boolean bool;
        Boolean bool2;
        this.$r8$classId = 12;
        this.a = context;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool3 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                num = Integer.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                num = null;
                this.f = str;
                this.h = num;
                method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
                if (method == null) {
                }
                this.b = bool3;
                this.c = bool2;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.i = displayMetrics;
                ((WindowManager) ((Context) this.a).getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
        this.f = str;
        this.h = num;
        try {
            method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
        } catch (NoSuchMethodException unused3) {
            method = null;
        }
        if (method == null) {
            try {
                bool = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
            } catch (IllegalAccessException | InvocationTargetException unused4) {
                bool = null;
            }
            try {
                bool2 = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
            } catch (IllegalAccessException | InvocationTargetException unused5) {
                bool2 = null;
                bool3 = bool;
                this.b = bool3;
                this.c = bool2;
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                this.i = displayMetrics2;
                ((WindowManager) ((Context) this.a).getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
            }
            bool3 = bool;
        } else {
            bool2 = null;
        }
        this.b = bool3;
        this.c = bool2;
        DisplayMetrics displayMetrics22 = new DisplayMetrics();
        this.i = displayMetrics22;
        ((WindowManager) ((Context) this.a).getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics22);
    }

    public e0(SVG svg, FillrWidget fillrWidget, n1 n1Var) {
        this.$r8$classId = 13;
        this.b = new HashMap();
        if (n1Var == null) {
            a$$ExternalSyntheticBUOutline0.m$3("webViewMapper cannot be null");
            throw null;
        }
        if (svg == null) {
            a$$ExternalSyntheticBUOutline0.m$3("fillrAnalyticsManager cannot be null");
            throw null;
        }
        if (fillrWidget != null) {
            this.a = svg;
            this.i = fillrWidget;
            this.f = n1Var;
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("widget cannot be null");
        throw null;
    }

    public e0(RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo, AndroidStringManager androidStringManager, KeyValue keyValue, Analytics analytics, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 22;
        this.a = realBitcoinPerformanceDataRepo;
        this.b = androidStringManager;
        this.c = keyValue;
        this.i = analytics;
        this.f = factory.createAlwaysSigned();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        percentInstance.setMaximumFractionDigits(2);
        this.h = percentInstance;
    }

    public e0(MotionLayout motionLayout) {
        this.$r8$classId = 6;
        this.b = new ArrayList();
        this.i = "ViewTransitionController";
        this.h = new ArrayList();
        this.a = motionLayout;
    }

    public e0(RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory, RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo, CryptoFlowStarter cryptoFlowStarter, AndroidStringManager androidStringManager, GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen manageReceiveP2PAsBitcoinScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        manageReceiveP2PAsBitcoinScreen.getClass();
        this.a = realReceiveP2PAsBitcoinRepo;
        this.b = cryptoFlowStarter;
        this.c = androidStringManager;
        this.i = manageReceiveP2PAsBitcoinScreen;
        this.f = screenNavigator;
        this.h = realGrowToolsActivityPresenterFactory.create(manageReceiveP2PAsBitcoinScreen, screenNavigator, null);
    }

    public e0(Context context, AutoValue_CameraThreadConfig autoValue_CameraThreadConfig, CameraPipeImpl cameraPipeImpl, Recorder.AnonymousClass1 anonymousClass1, CameraCoordinatorAdapter cameraCoordinatorAdapter, CameraXConfig cameraXConfig) {
        this.$r8$classId = 2;
        context.getClass();
        autoValue_CameraThreadConfig.getClass();
        cameraPipeImpl.getClass();
        anonymousClass1.getClass();
        cameraCoordinatorAdapter.getClass();
        this.a = context;
        this.b = autoValue_CameraThreadConfig;
        this.c = cameraPipeImpl;
        this.i = anonymousClass1;
        this.f = cameraCoordinatorAdapter;
        this.h = cameraXConfig;
    }

    public e0(GraphLoop$processingQueue$1 graphLoop$processingQueue$1, VirtualCameraState$connect$2$1 virtualCameraState$connect$2$1) {
        this.$r8$classId = 4;
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = new BorderKt$$ExternalSyntheticLambda1(8);
        this.a = graphLoop$processingQueue$1;
        this.b = borderKt$$ExternalSyntheticLambda1;
        this.c = virtualCameraState$connect$2$1;
        this.i = AtomicFU.atomic(false);
        this.f = PapaEvent.Channel$default(Integer.MAX_VALUE, null, new ObjectList$$ExternalSyntheticLambda0(this, 7), 2);
        this.h = new ArrayDeque();
    }

    public e0(Camera2Backend camera2Backend, CameraGraphId cameraGraphId, CameraGraph$Config cameraGraph$Config, GraphProcessorImpl graphProcessorImpl, StreamGraphImpl streamGraphImpl, SurfaceGraph surfaceGraph, Camera2Backend camera2Backend2) {
        this.$r8$classId = 3;
        cameraGraph$Config.getClass();
        this.a = cameraGraphId;
        this.b = cameraGraph$Config;
        this.c = graphProcessorImpl;
        this.i = streamGraphImpl;
        this.f = surfaceGraph;
        this.h = camera2Backend2;
    }

    public e0(CoroutineLiveData coroutineLiveData, Function2 function2, ContextScope contextScope, Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0) {
        this.$r8$classId = 7;
        this.a = coroutineLiveData;
        this.b = function2;
        this.c = contextScope;
        this.i = worker$$ExternalSyntheticLambda0;
    }

    public e0(Timeline.Period period) {
        this.$r8$classId = 8;
        this.a = period;
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        this.b = RegularImmutableList.EMPTY;
        this.c = RegularImmutableMap.EMPTY;
    }

    public e0(String str, String str2, String str3, String str4, CreationExtrasKtxKt creationExtrasKtxKt, BlockerAction blockerAction) {
        this.$r8$classId = 26;
        blockerAction.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.i = str4;
        this.f = creationExtrasKtxKt;
        this.h = blockerAction;
    }

    public void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        if (box.width == RecyclerView.DECELERATION_RATE || box.height == RecyclerView.DECELERATION_RATE) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement((SVGAndroidRenderer$RendererState) this.c, svg);
        if (display()) {
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) this.c;
            sVGAndroidRenderer$RendererState.viewPort = box;
            if (!sVGAndroidRenderer$RendererState.style.overflow.booleanValue()) {
                SVG.Box box3 = ((SVGAndroidRenderer$RendererState) this.c).viewPort;
                setClipRect(box3.minX, box3.minY, box3.width, box3.height);
            }
            checkForClipPath(svg, ((SVGAndroidRenderer$RendererState) this.c).viewPort);
            Canvas canvas = (Canvas) this.a;
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) this.c;
            if (box2 != null) {
                canvas.concat(calculateViewBoxTransform(sVGAndroidRenderer$RendererState2.viewPort, box2, preserveAspectRatio));
                ((SVGAndroidRenderer$RendererState) this.c).viewBox = svg.viewBox;
            } else {
                SVG.Box box4 = sVGAndroidRenderer$RendererState2.viewPort;
                canvas.translate(box4.minX, box4.minY);
            }
            boolean pushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (pushLayer) {
                popLayer(svg.boundingBox);
            }
            updateParentBoundingBox(svg);
        }
    }
}
