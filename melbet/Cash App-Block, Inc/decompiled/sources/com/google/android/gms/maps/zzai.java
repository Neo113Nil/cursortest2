package com.google.android.gms.maps;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.MessageFormat;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import coil3.svg.internal.AndroidSvg;
import com.appsflyer.AdRevenueScheme;
import com.caverock.androidsvg.SVG;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.fillr.m1;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda9;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.zae;
import com.google.android.gms.dynamic.zah;
import com.google.android.gms.dynamite.zzo;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.zzai;
import com.google.android.libraries.places.api.model.zzde;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.crypto.CryptoTradeComplete;
import com.squareup.cash.cdf.p2pallowlist.P2PAllowListEditStart;
import com.squareup.cash.cdf.pushnotification.PushNotificationDeclineDiscardStaleMessage;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.analytics.RealCryptoFlowLogger;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceDataState;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinExchangeScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateBitcoinExchangeScenarioPlan$produceResponseContext$1;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinCdfEventsUpdates;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidAllowSamPushNotifications;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager$models$1$1;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$DirectDepositTarget;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$WhenMappings;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.CashNotification$ClearAppDataNotification$ClearAll;
import com.squareup.cash.notifications.CashNotificationFactory;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.p2pblocking.presenters.AllowListController$fetchData$1;
import com.squareup.cash.p2pblocking.presenters.AllowListController$handleRowTap$1;
import com.squareup.cash.p2pblocking.presenters.AllowListController$searchCustomers$1;
import com.squareup.cash.p2pblocking.presenters.P2PListController;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.p2pblocking.presenters.SearchResultsData;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.p2pblocking.viewmodels.P2PListEmptyState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderDelegator$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderEventDelegator$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.gcm.NotificationWorker;
import com.squareup.cash.ui.gcm.PushMessagingServiceActor$eligibleAccountTokens$1;
import com.squareup.cash.ui.gcm.PushMessagingServiceActor$onMessageReceived$1;
import com.squareup.cash.ui.gcm.RealNotificationDispatcher;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentRequest;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.AllowlistAction;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.AllowlistSearchRequest;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSearchResults;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSuggestions;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeResponse;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.cash.Countries;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.stripe3ds2.init.DefaultSecurityChecker;
import com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl;
import com.stripe.android.stripe3ds2.init.DeviceParam;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl$Reason;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.transaction.AcsData;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$deviceDataJson$1;
import com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository$startChallenge$1;
import com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Factory;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$2;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$ItemInfo;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.ViewTypeManager;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import dagger.android.AndroidInjector;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;
import okhttp3.HttpUrl;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class zzai implements ScenarioPlan, GrowToolsManagerDelegate, P2PListController, AndroidInjector {
    public Object zaa;
    public Object zab;
    public Object zac;
    public Object zad;
    public Object zza;
    public Object zzb;
    public Object zzc;
    public Object zzd;
    public Object zze;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e A[LOOP:2: B:34:0x00ee->B:48:0x017e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzai(ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1, RealEmbeddedCardReaderDelegator$Factory$Impl realEmbeddedCardReaderDelegator$Factory$Impl, RealEmbeddedCardReaderEventDelegator$Factory$Impl realEmbeddedCardReaderEventDelegator$Factory$Impl, RealNfcPaymentsManager realNfcPaymentsManager, RealObservabilityManager realObservabilityManager) {
        Object obj;
        byte[] copyOf;
        byte[] bArr;
        this.zaa = realNfcPaymentsManager;
        this.zab = realObservabilityManager;
        String take = StringsKt___StringsKt.take(14, StringsKt__StringsJVMKt.replace$default((String) forcedLazyKt$forcedLazy$1.$$delegate_0.getValue(), "-", ""));
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = take.toUpperCase(locale);
        upperCase.getClass();
        String concat = "EC".concat(upperCase);
        int[] iArr = HexExtensionsKt.BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.Companion.getClass();
        HexFormat hexFormat = HexFormat.Default;
        hexFormat.getClass();
        int length = concat.length();
        AbstractList.Companion companion = AbstractList.Companion;
        int length2 = concat.length();
        companion.getClass();
        int i = 0;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(0, length, length2);
        int i2 = 1;
        int i3 = 2;
        if (length != 0) {
            HexFormat.BytesHexFormat bytesHexFormat = hexFormat.bytes;
            if (bytesHexFormat.noLineAndGroupSeparator) {
                if (bytesHexFormat.shortByteSeparatorNoPrefixAndSuffix) {
                    if ((length & 1) == 0) {
                        int i4 = length >> 1;
                        bArr = new byte[i4];
                        int i5 = 0;
                        for (int i6 = 0; i6 < i4; i6++) {
                            bArr[i6] = HexExtensionsKt.parseByteAt(i5, concat);
                            i5 += 2;
                        }
                        copyOf = bArr != null ? bArr : copyOf;
                    }
                    bArr = null;
                    if (bArr != null) {
                    }
                } else {
                    long j = length;
                    int i7 = (int) (j / 2);
                    if (i7 * 2 == j) {
                        bArr = new byte[i7];
                        int i8 = i7 - 1;
                        int i9 = 0;
                        for (int i10 = 0; i10 < i8; i10++) {
                            bArr[i10] = HexExtensionsKt.parseByteAt(i9, concat);
                            i9 += 2;
                        }
                        bArr[i8] = HexExtensionsKt.parseByteAt(i9, concat);
                        if (bArr != null) {
                        }
                    }
                    bArr = null;
                    if (bArr != null) {
                    }
                }
                this.zac = copyOf;
                AssetPublicSuffixList assetPublicSuffixList = new AssetPublicSuffixList(new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i2), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 4));
                this.zad = assetPublicSuffixList;
                OkHttpCall.AnonymousClass1 anonymousClass1 = realEmbeddedCardReaderDelegator$Factory$Impl.delegateFactory;
                Activity activity = (Activity) ((InstanceFactory) anonymousClass1.val$callback).value;
                String str = (String) ((LambdaProvider) anonymousClass1.this$0).lambda.invoke();
                activity.getClass();
                str.getClass();
                this.zza = new TextSetter(activity, str, assetPublicSuffixList);
                this.zzb = FlowKt.MutableStateFlow(obj);
                this.zzc = FlowKt.MutableStateFlow(obj);
                this.zzd = FlowKt.MutableStateFlow(obj);
                this.zze = FlowKt.MutableStateFlow(obj);
            }
            boolean z = bytesHexFormat.ignoreCase;
            if (length <= 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
            long j2 = length;
            long wholeElementsPerSet = HexExtensionsKt.wholeElementsPerSet(1, j2, 4294967294L);
            long j3 = j2 - (BodyPartID.bodyIdMax * wholeElementsPerSet);
            long wholeElementsPerSet2 = HexExtensionsKt.wholeElementsPerSet(2, j3, 4294967294L);
            long j4 = j3 - (4294967296L * wholeElementsPerSet2);
            long wholeElementsPerSet3 = HexExtensionsKt.wholeElementsPerSet(0, j4, 2L);
            int m = (int) (SVG$Unit$EnumUnboxingLocalUtility.m(wholeElementsPerSet2, 2147483647L, wholeElementsPerSet * 2147483647L, wholeElementsPerSet3) + (j4 - (2 * wholeElementsPerSet3) > 0 ? 1 : 0));
            byte[] bArr2 = new byte[m];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i11 < length) {
                if (i13 == Integer.MAX_VALUE) {
                    if (concat.charAt(i11) == '\r') {
                        int i15 = i11 + 1;
                        i11 = (i15 >= length || concat.charAt(i15) != '\n') ? i15 : i11 + 2;
                    } else {
                        if (concat.charAt(i11) != '\n') {
                            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i11, "Expected a new line at index ", ", but was ");
                            m2m.append(concat.charAt(i11));
                            throw new NumberFormatException(m2m.toString());
                        }
                        i11++;
                    }
                    i13 = 0;
                    i14 = 0;
                } else if (i14 == Integer.MAX_VALUE) {
                    for (int i16 = 0; i16 < 2; i16++) {
                        if (!CharsKt__CharKt.equals("  ".charAt(i16), concat.charAt(i11 + i16), z)) {
                            int i17 = 2 + i11;
                            throw new NumberFormatException("Expected group separator \"  \" at index " + i11 + ", but was " + concat.substring(i11, i17 <= length ? i17 : length));
                        }
                    }
                    i11 += 2;
                    i14 = 0;
                    i13++;
                    i14++;
                    if (length - 2 >= i11) {
                        StringBuilder m2 = re$$ExternalSyntheticOutline0.m("Expected exactly 2 hexadecimal digits at index ", i11, ", but was \"", concat.substring(i11, length), "\" of length ");
                        m2.append(length - i11);
                        throw new NumberFormatException(m2.toString());
                    }
                    bArr2[i12] = HexExtensionsKt.parseByteAt(i11, concat);
                    i11 += 2;
                    i12++;
                }
                i13++;
                i14++;
                if (length - 2 >= i11) {
                }
            }
            obj = null;
            copyOf = i12 == m ? bArr2 : Arrays.copyOf(bArr2, i12);
            this.zac = copyOf;
            AssetPublicSuffixList assetPublicSuffixList2 = new AssetPublicSuffixList(new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i2), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 4));
            this.zad = assetPublicSuffixList2;
            OkHttpCall.AnonymousClass1 anonymousClass12 = realEmbeddedCardReaderDelegator$Factory$Impl.delegateFactory;
            Activity activity2 = (Activity) ((InstanceFactory) anonymousClass12.val$callback).value;
            String str2 = (String) ((LambdaProvider) anonymousClass12.this$0).lambda.invoke();
            activity2.getClass();
            str2.getClass();
            this.zza = new TextSetter(activity2, str2, assetPublicSuffixList2);
            this.zzb = FlowKt.MutableStateFlow(obj);
            this.zzc = FlowKt.MutableStateFlow(obj);
            this.zzd = FlowKt.MutableStateFlow(obj);
            this.zze = FlowKt.MutableStateFlow(obj);
        }
        copyOf = new byte[0];
        obj = null;
        this.zac = copyOf;
        AssetPublicSuffixList assetPublicSuffixList22 = new AssetPublicSuffixList(new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i2), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, i3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 3), new RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(this, 4));
        this.zad = assetPublicSuffixList22;
        OkHttpCall.AnonymousClass1 anonymousClass122 = realEmbeddedCardReaderDelegator$Factory$Impl.delegateFactory;
        Activity activity22 = (Activity) ((InstanceFactory) anonymousClass122.val$callback).value;
        String str22 = (String) ((LambdaProvider) anonymousClass122.this$0).lambda.invoke();
        activity22.getClass();
        str22.getClass();
        this.zza = new TextSetter(activity22, str22, assetPublicSuffixList22);
        this.zzb = FlowKt.MutableStateFlow(obj);
        this.zzc = FlowKt.MutableStateFlow(obj);
        this.zzd = FlowKt.MutableStateFlow(obj);
        this.zze = FlowKt.MutableStateFlow(obj);
    }

    public static final ArrayList handleSearchListChange$lambda$0$update(P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove, List list) {
        List<AllowlistCustomer> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AllowlistCustomer allowlistCustomer : list2) {
            BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
            if (Intrinsics.areEqual(blocklyCustomerMetadata != null ? blocklyCustomerMetadata.customer_token : null, tapAddOrRemove.customerToken)) {
                allowlistCustomer = AllowlistCustomer.copy$default(allowlistCustomer, null, Boolean.valueOf(tapAddOrRemove.toAdd), null, 125);
            }
            arrayList.add(allowlistCustomer);
        }
        return arrayList;
    }

    public static void setItems$default(zzai zzaiVar, ArrayList arrayList, RecyclerView.Adapter adapter) {
        zzaiVar.getClass();
        zzaiVar.zad = adapter;
        ((AsyncListDiffer) zzaiVar.zza).submitList(arrayList, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String zac = zaf.zac(context, isGooglePlayServicesAvailable);
        String zae = zaf.zae(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zae);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent, false, 0 == true ? 1 : 0));
        }
    }

    public void addItemTypeInternal(KClass kClass, KClass kClass2, Function3 function3, Function3 function32) {
        kClass.getClass();
        kClass2.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.zzb;
        if (linkedHashMap.get(kClass) != null) {
            a$$ExternalSyntheticBUOutline0.m("Item type ", kClass, " has already been added.");
            return;
        }
        Sniffer sniffer = (Sniffer) this.zzd;
        int andIncrement = sniffer.peekLength + ((AtomicInteger) sniffer.scratch).getAndIncrement();
        AdapterHelper$ItemInfo adapterHelper$ItemInfo = new AdapterHelper$ItemInfo(andIncrement, kClass2, function3, new AdapterHelper$$ExternalSyntheticLambda0(function32, 0), null);
        ((ArrayList) this.zze).add(adapterHelper$ItemInfo);
        linkedHashMap.put(kClass, adapterHelper$ItemInfo);
        ((LinkedHashMap) this.zzc).put(Integer.valueOf(andIncrement), adapterHelper$ItemInfo);
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        return FlowStarter.startFlow$default((FlowStarter) this.zac, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.zza, null, ClientScenario.PLASMA, null, null, null, null, new FlowStarter$$ExternalSyntheticLambda0(20), 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024c A[LOOP:1: B:40:0x0246->B:42:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deviceDataJson$3ds2sdk_release(SdkTransactionId sdkTransactionId, ContinuationImpl continuationImpl) {
        DefaultAuthenticationRequestParametersFactory$deviceDataJson$1 defaultAuthenticationRequestParametersFactory$deviceDataJson$1;
        int i;
        JSONObject jSONObject;
        String str;
        Iterator it;
        int i2;
        Iterator it2;
        if (continuationImpl instanceof DefaultAuthenticationRequestParametersFactory$deviceDataJson$1) {
            defaultAuthenticationRequestParametersFactory$deviceDataJson$1 = (DefaultAuthenticationRequestParametersFactory$deviceDataJson$1) continuationImpl;
            int i3 = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                defaultAuthenticationRequestParametersFactory$deviceDataJson$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("DV", "1.6");
                    DeviceDataFactoryImpl deviceDataFactoryImpl = (DeviceDataFactoryImpl) this.zaa;
                    String str2 = (String) this.zzc;
                    defaultAuthenticationRequestParametersFactory$deviceDataJson$1.L$1 = put;
                    defaultAuthenticationRequestParametersFactory$deviceDataJson$1.L$2 = "DD";
                    defaultAuthenticationRequestParametersFactory$deviceDataJson$1.label = 1;
                    Serializable create = deviceDataFactoryImpl.create(str2, sdkTransactionId, defaultAuthenticationRequestParametersFactory$deviceDataJson$1);
                    if (create == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jSONObject = put;
                    obj = create;
                    str = "DD";
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.L$2;
                    jSONObject = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                JSONObject put2 = jSONObject.put(str, new JSONObject((Map) obj));
                zzo zzoVar = (zzo) this.zab;
                zzoVar.getClass();
                HashMap hashMap = new HashMap();
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DeviceParam[]{DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_SCREEN_RESOLUTION, DeviceParam.PARAM_SDK_APP_ID, DeviceParam.PARAM_SDK_VERSION, DeviceParam.PARAM_SDK_REF_NUMBER, DeviceParam.PARAM_DATE_TIME, DeviceParam.PARAM_SDK_TRANS_ID, DeviceParam.PARAM_WEB_VIEW_USER_AGENT, DeviceParam.PARAM_SIM_CARRIER_ID, DeviceParam.PARAM_SECURE_FRP_MODE, DeviceParam.PARAM_APPLY_RAMPING_RINGER, DeviceParam.PARAM_HARDWARE_SKU, DeviceParam.PARAM_SOC_MANUFACTURER, DeviceParam.PARAM_SOC_MODEL, DeviceParam.PARAM_SIM_CARRIER_ID_NAME, DeviceParam.PARAM_MANUFACTURER_CODE, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME, DeviceParam.PARAM_MULTI_SIM_SUPPORTED, DeviceParam.PARAM_SUBSCRIPTION_ID, DeviceParam.PARAM_RTT_CALLING_MODE});
                it = DeviceParam.$ENTRIES.iterator();
                while (it.hasNext()) {
                    DeviceParam deviceParam = (DeviceParam) it.next();
                    if (!listOf.contains(deviceParam)) {
                        String str3 = deviceParam.code;
                        DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                        hashMap.put(str3, "RE01");
                    }
                }
                HashMap hashMap2 = new HashMap();
                i2 = zzoVar.zza;
                if (i2 < 26) {
                    DeviceParam deviceParam2 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr2 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A003", "RE02");
                    hashMap2.put("A053", "RE02");
                    hashMap2.put("A076", "RE02");
                }
                if (i2 > 23) {
                    DeviceParam deviceParam3 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr3 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A079", "RE02");
                }
                if (i2 < 28) {
                    DeviceParam deviceParam4 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr4 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A138", "RE02");
                    hashMap2.put("A139", "RE02");
                    hashMap2.put("A150", "RE02");
                }
                if (i2 < 29) {
                    DeviceParam deviceParam5 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr5 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A141", "RE02");
                    hashMap2.put("A142", "RE02");
                    hashMap2.put("A143", "RE02");
                    hashMap2.put("A152", "RE02");
                }
                if (i2 < 30) {
                    DeviceParam deviceParam6 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr6 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A145", "RE02");
                    hashMap2.put("A149", "RE02");
                    hashMap2.put("A151", "RE02");
                }
                if (i2 < 31) {
                    DeviceParam deviceParam7 = DeviceParam.PARAM_PLATFORM;
                    DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr7 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                    hashMap2.put("A153", "RE02");
                    hashMap2.put("A154", "RE02");
                    hashMap2.put("A155", "RE02");
                }
                LinkedHashMap plus = MapsKt__MapsKt.plus(hashMap, hashMap2);
                HashMap hashMap3 = new HashMap();
                DeviceParam deviceParam8 = DeviceParam.PARAM_PLATFORM;
                DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr8 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
                hashMap3.put("A028", "RE03");
                hashMap3.put("A029", "RE03");
                hashMap3.put("A030", "RE03");
                hashMap3.put("A031", "RE03");
                hashMap3.put("A032", "RE03");
                hashMap3.put("A033", "RE03");
                hashMap3.put("A034", "RE03");
                hashMap3.put("A035", "RE03");
                hashMap3.put("A036", "RE03");
                hashMap3.put("A037", "RE03");
                hashMap3.put("A038", "RE03");
                hashMap3.put("C011", "RE03");
                hashMap3.put("C012", "RE03");
                hashMap3.put("C009", "RE03");
                hashMap3.put("A039", "RE03");
                hashMap3.put("A040", "RE03");
                hashMap3.put("A041", "RE03");
                hashMap3.put("A001", "RE03");
                hashMap3.put("A002", "RE03");
                hashMap3.put("A003", "RE03");
                hashMap3.put("A004", "RE03");
                hashMap3.put("A017", "RE03");
                hashMap3.put("A019", "RE03");
                hashMap3.put("A020", "RE03");
                hashMap3.put("A025", "RE03");
                hashMap3.put("A027", "RE03");
                hashMap3.put("A053", "RE03");
                hashMap3.put("A076", "RE03");
                hashMap3.put("A143", "RE03");
                hashMap3.put("A146", "RE03");
                hashMap3.put("A147", "RE03");
                hashMap3.put("A148", "RE03");
                hashMap3.put("A149", "RE03");
                LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("A140", "RE04");
                JSONObject put3 = put2.put("DPNA", new JSONObject(MapsKt__MapsKt.plus(plus2, hashMap4)));
                ArrayList warnings = ((DefaultSecurityChecker) this.zac).getWarnings();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(warnings, 10));
                it2 = warnings.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Warning) it2.next()).id);
                }
                JSONObject put4 = put3.put("SW", new JSONArray((Collection) arrayList));
                put4.getClass();
                return put4;
            }
        }
        defaultAuthenticationRequestParametersFactory$deviceDataJson$1 = new DefaultAuthenticationRequestParametersFactory$deviceDataJson$1(this, continuationImpl);
        Object obj2 = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultAuthenticationRequestParametersFactory$deviceDataJson$1.label;
        if (i != 0) {
        }
        JSONObject put22 = jSONObject.put(str, new JSONObject((Map) obj2));
        zzo zzoVar2 = (zzo) this.zab;
        zzoVar2.getClass();
        HashMap hashMap5 = new HashMap();
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new DeviceParam[]{DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_SCREEN_RESOLUTION, DeviceParam.PARAM_SDK_APP_ID, DeviceParam.PARAM_SDK_VERSION, DeviceParam.PARAM_SDK_REF_NUMBER, DeviceParam.PARAM_DATE_TIME, DeviceParam.PARAM_SDK_TRANS_ID, DeviceParam.PARAM_WEB_VIEW_USER_AGENT, DeviceParam.PARAM_SIM_CARRIER_ID, DeviceParam.PARAM_SECURE_FRP_MODE, DeviceParam.PARAM_APPLY_RAMPING_RINGER, DeviceParam.PARAM_HARDWARE_SKU, DeviceParam.PARAM_SOC_MANUFACTURER, DeviceParam.PARAM_SOC_MODEL, DeviceParam.PARAM_SIM_CARRIER_ID_NAME, DeviceParam.PARAM_MANUFACTURER_CODE, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME, DeviceParam.PARAM_MULTI_SIM_SUPPORTED, DeviceParam.PARAM_SUBSCRIPTION_ID, DeviceParam.PARAM_RTT_CALLING_MODE});
        it = DeviceParam.$ENTRIES.iterator();
        while (it.hasNext()) {
        }
        HashMap hashMap22 = new HashMap();
        i2 = zzoVar2.zza;
        if (i2 < 26) {
        }
        if (i2 > 23) {
        }
        if (i2 < 28) {
        }
        if (i2 < 29) {
        }
        if (i2 < 30) {
        }
        if (i2 < 31) {
        }
        LinkedHashMap plus3 = MapsKt__MapsKt.plus(hashMap5, hashMap22);
        HashMap hashMap32 = new HashMap();
        DeviceParam deviceParam82 = DeviceParam.PARAM_PLATFORM;
        DeviceParamNotAvailableFactoryImpl$Reason[] deviceParamNotAvailableFactoryImpl$ReasonArr82 = DeviceParamNotAvailableFactoryImpl$Reason.$VALUES;
        hashMap32.put("A028", "RE03");
        hashMap32.put("A029", "RE03");
        hashMap32.put("A030", "RE03");
        hashMap32.put("A031", "RE03");
        hashMap32.put("A032", "RE03");
        hashMap32.put("A033", "RE03");
        hashMap32.put("A034", "RE03");
        hashMap32.put("A035", "RE03");
        hashMap32.put("A036", "RE03");
        hashMap32.put("A037", "RE03");
        hashMap32.put("A038", "RE03");
        hashMap32.put("C011", "RE03");
        hashMap32.put("C012", "RE03");
        hashMap32.put("C009", "RE03");
        hashMap32.put("A039", "RE03");
        hashMap32.put("A040", "RE03");
        hashMap32.put("A041", "RE03");
        hashMap32.put("A001", "RE03");
        hashMap32.put("A002", "RE03");
        hashMap32.put("A003", "RE03");
        hashMap32.put("A004", "RE03");
        hashMap32.put("A017", "RE03");
        hashMap32.put("A019", "RE03");
        hashMap32.put("A020", "RE03");
        hashMap32.put("A025", "RE03");
        hashMap32.put("A027", "RE03");
        hashMap32.put("A053", "RE03");
        hashMap32.put("A076", "RE03");
        hashMap32.put("A143", "RE03");
        hashMap32.put("A146", "RE03");
        hashMap32.put("A147", "RE03");
        hashMap32.put("A148", "RE03");
        hashMap32.put("A149", "RE03");
        LinkedHashMap plus22 = MapsKt__MapsKt.plus(plus3, hashMap32);
        HashMap hashMap42 = new HashMap();
        hashMap42.put("A140", "RE04");
        JSONObject put32 = put22.put("DPNA", new JSONObject(MapsKt__MapsKt.plus(plus22, hashMap42)));
        ArrayList warnings2 = ((DefaultSecurityChecker) this.zac).getWarnings();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(warnings2, 10));
        it2 = warnings2.iterator();
        while (it2.hasNext()) {
        }
        JSONObject put42 = put32.put("SW", new JSONArray((Collection) arrayList2));
        put42.getClass();
        return put42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eligibleAccountTokens(ContinuationImpl continuationImpl) {
        PushMessagingServiceActor$eligibleAccountTokens$1 pushMessagingServiceActor$eligibleAccountTokens$1;
        int i;
        Set set;
        AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult;
        ?? r0;
        if (continuationImpl instanceof PushMessagingServiceActor$eligibleAccountTokens$1) {
            pushMessagingServiceActor$eligibleAccountTokens$1 = (PushMessagingServiceActor$eligibleAccountTokens$1) continuationImpl;
            int i2 = pushMessagingServiceActor$eligibleAccountTokens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pushMessagingServiceActor$eligibleAccountTokens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pushMessagingServiceActor$eligibleAccountTokens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushMessagingServiceActor$eligibleAccountTokens$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) this.zab);
                    Set of = activeAccountTokenOrNull != null ? SetsKt__SetsJVMKt.setOf(activeAccountTokenOrNull) : EmptySet.INSTANCE;
                    if (!((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.zzc)).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidAllowSamPushNotifications.INSTANCE)).enabled()) {
                        return of;
                    }
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) this.zzd;
                    pushMessagingServiceActor$eligibleAccountTokens$1.L$1 = of;
                    pushMessagingServiceActor$eligibleAccountTokens$1.label = 1;
                    Object loadAccounts = realAccountholderAccountRepository.loadAccounts(pushMessagingServiceActor$eligibleAccountTokens$1);
                    if (loadAccounts == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Set set2 = of;
                    obj = loadAccounts;
                    set = set2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = pushMessagingServiceActor$eligibleAccountTokens$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj;
                if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
                    List list = ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts;
                    r0 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = ((FullAccount) it.next()).account_id;
                        if (str != null) {
                            r0.add(str);
                        }
                    }
                } else {
                    if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    r0 = EmptySet.INSTANCE;
                }
                return SetsKt___SetsKt.plus(set, (Iterable) r0);
            }
        }
        pushMessagingServiceActor$eligibleAccountTokens$1 = new PushMessagingServiceActor$eligibleAccountTokens$1(this, continuationImpl);
        Object obj2 = pushMessagingServiceActor$eligibleAccountTokens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushMessagingServiceActor$eligibleAccountTokens$1.label;
        if (i != 0) {
        }
        accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj2;
        if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
        }
        return SetsKt___SetsKt.plus(set, (Iterable) r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchData(String str, BlockingContext blockingContext, ContinuationImpl continuationImpl) {
        AllowListController$fetchData$1 allowListController$fetchData$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof AllowListController$fetchData$1) {
            allowListController$fetchData$1 = (AllowListController$fetchData$1) continuationImpl;
            int i2 = allowListController$fetchData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                allowListController$fetchData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = allowListController$fetchData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = allowListController$fetchData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlocklyService blocklyService = (BlocklyService) this.zab;
                    GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest(str);
                    allowListController$fetchData$1.label = 1;
                    obj = blocklyService.getAllowlistForCustomer(getAllowlistForCustomerRequest, allowListController$fetchData$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) this.zzb;
                    GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) ((ApiResult.Success) apiResult).response;
                    getAllowlistForCustomerResponse.getClass();
                    List list = getAllowlistForCustomerResponse.allowed_customers;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (Intrinsics.areEqual(((AllowlistCustomer) obj2).is_in_allowlist, Boolean.TRUE)) {
                            arrayList.add(obj2);
                        }
                    }
                    P2PListData.AllowListData allowListData = new P2PListData.AllowListData(arrayList);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, allowListData);
                }
                return Unit.INSTANCE;
            }
        }
        allowListController$fetchData$1 = new AllowListController$fetchData$1(this, continuationImpl);
        Object obj3 = allowListController$fetchData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = allowListController$fetchData$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public P2PListButtonValues getButtonValues(boolean z, boolean z2, boolean z3, Integer num) {
        boolean z4 = !z2 || z3;
        boolean isAtLimit = isAtLimit(num);
        P2PListButtonValues p2PListButtonValues = new P2PListButtonValues(((AndroidStringManager) this.zac).get(com.squareup.cash.R.string.allow_list_search_to_add_button_title), true, new P2PListViewEvent.TapAllowlist(num, isAtLimit), !isAtLimit);
        if (z4) {
            return p2PListButtonValues;
        }
        return null;
    }

    public CryptoTradeComplete getCryptoTradeCompleteAnalytic() {
        Pair pair;
        CryptoTradeSide cryptoTradeSide;
        BitcoinExchangeType bitcoinExchangeType = (BitcoinExchangeType) this.zze;
        boolean z = bitcoinExchangeType instanceof BitcoinExchangeType.BuyBitcoin;
        if (z) {
            String lowerCase = "BTC".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            pair = new Pair(null, lowerCase);
        } else if (bitcoinExchangeType instanceof BitcoinExchangeType.ConvertToBitcoin) {
            Locale locale = Locale.ROOT;
            String lowerCase2 = "XUS".toLowerCase(locale);
            lowerCase2.getClass();
            String lowerCase3 = "BTC".toLowerCase(locale);
            lowerCase3.getClass();
            pair = new Pair(lowerCase2, lowerCase3);
        } else {
            if (!(bitcoinExchangeType instanceof BitcoinExchangeType.SellAllBitcoin) && !(bitcoinExchangeType instanceof BitcoinExchangeType.SellBitcoin)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String lowerCase4 = "BTC".toLowerCase(Locale.ROOT);
            lowerCase4.getClass();
            pair = new Pair(lowerCase4, null);
        }
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        if (z || (bitcoinExchangeType instanceof BitcoinExchangeType.ConvertToBitcoin)) {
            cryptoTradeSide = CryptoTradeSide.BUY;
        } else {
            if (!(bitcoinExchangeType instanceof BitcoinExchangeType.SellAllBitcoin) && !(bitcoinExchangeType instanceof BitcoinExchangeType.SellBitcoin)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            cryptoTradeSide = CryptoTradeSide.SELL;
        }
        ExchangeRequest exchangeRequest = (ExchangeRequest) this.zzd;
        return new CryptoTradeComplete(exchangeRequest.recurring_schedule != null ? CryptoTradeComplete.CryptoTradeCompleteOrderType.AUTO_INVEST : exchangeRequest.custom_order_configuration != null ? CryptoTradeComplete.CryptoTradeCompleteOrderType.LIMIT : CryptoTradeComplete.CryptoTradeCompleteOrderType.STANDARD, cryptoTradeSide, str2, str);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public P2PListEmptyState getEmptyState(String str, boolean z, FamilyProfile familyProfile, BlockingContext blockingContext) {
        String str2;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.zac;
        familyProfile.getClass();
        if (familyProfile instanceof FamilyProfile.ManagedAccount) {
            String str3 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
            if (str3 == null) {
                str3 = "";
            }
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str2 = new MessageFormat(resources.getString(com.squareup.cash.R.string.allow_list_empty_state_subtitle_managed_account)).format(new Object[]{str3});
            str2.getClass();
        } else {
            str2 = ((RealAllowlistRepository) this.zza).isAllowlistOn() ? androidStringManager.get(com.squareup.cash.R.string.allow_list_empty_state_subtitle_toggle_on) : androidStringManager.get(com.squareup.cash.R.string.allow_list_empty_state_subtitle_toggle_on);
        }
        return new P2PListEmptyState(null, str2);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getFooter(String str, boolean z, boolean z2, Integer num) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.zac;
        Resources resources = androidStringManager.resources;
        if (z2) {
            if (str == null) {
                return null;
            }
            if (num == null) {
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(com.squareup.cash.R.string.allow_list_sponsor_footer)).format(new Object[]{str});
                format2.getClass();
                return format2;
            }
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(com.squareup.cash.R.string.allow_list_sponsor_with_limit_footer)).format(new Object[]{num, str});
            format3.getClass();
            return format3;
        }
        if (z) {
            return androidStringManager.get(com.squareup.cash.R.string.allow_list_dependent_footer);
        }
        if (str == null) {
            return null;
        }
        if (num == null) {
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(com.squareup.cash.R.string.allow_list_sponsor_footer)).format(new Object[]{str});
            format4.getClass();
            return format4;
        }
        resources.getClass();
        String format5 = new MessageFormat(resources.getString(com.squareup.cash.R.string.allow_list_sponsor_with_limit_footer)).format(new Object[]{num, str});
        format5.getClass();
        return format5;
    }

    public AdapterHelper$ItemInfo getItemInfoFromPosition(int i) {
        List list = ((AsyncListDiffer) this.zza).mReadOnlyList;
        list.getClass();
        Object obj = list.get(i);
        Object obj2 = ((LinkedHashMap) this.zzb).get(Reflection.factory.getOrCreateKotlinClass(obj.getClass()));
        if (obj2 != null) {
            return (AdapterHelper$ItemInfo) obj2;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(obj.getClass(), "No item info for type '", "'. Ensure this type is added."));
        return null;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public StateFlowImpl getListData() {
        return (StateFlowImpl) this.zzc;
    }

    public String getPaidInBitcoinTargetDescription(boolean z, PaidInBitcoinState paidInBitcoinState) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.zab;
        if (!z) {
            return androidStringManager.get(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_target_description_off);
        }
        String valueOf = String.valueOf(paidInBitcoinState.selectedPercentage);
        valueOf.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_target_description_on)).format(new Object[]{valueOf});
        format2.getClass();
        return format2;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public StateFlowImpl getSearchData() {
        return (StateFlowImpl) this.zze;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchHeaderTitle(boolean z) {
        return null;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchPlaceholder() {
        return ((AndroidStringManager) this.zac).get(com.squareup.cash.R.string.select_customer_to_block_search_bar_hint);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchTitle(boolean z) {
        return ((AndroidStringManager) this.zac).get(com.squareup.cash.R.string.select_customer_to_search_section_title_allowlist);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getToolbarTitle() {
        return ((AndroidStringManager) this.zac).get(com.squareup.cash.R.string.allow_list_screen_title);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleRowTap(String str, P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation) {
        AllowListController$handleRowTap$1 allowListController$handleRowTap$1;
        int i;
        ApiResult apiResult;
        FormattedResource formattedResource;
        Object value;
        P2PListData.AllowListData allowListData;
        Object value2;
        P2PSearchData p2PSearchData;
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions;
        AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults;
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions2;
        AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults2;
        if (continuation instanceof AllowListController$handleRowTap$1) {
            allowListController$handleRowTap$1 = (AllowListController$handleRowTap$1) continuation;
            int i2 = allowListController$handleRowTap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                allowListController$handleRowTap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = allowListController$handleRowTap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = allowListController$handleRowTap$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove) {
                        P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
                        AllowlistAction allowlistAction = tapAddOrRemove.toAdd ? AllowlistAction.ADD : AllowlistAction.REMOVE;
                        AegisService aegisService = (AegisService) this.zaa;
                        ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = new ModifyAllowlistForDependentRequest(str, tapAddOrRemove.customerToken, allowlistAction);
                        allowListController$handleRowTap$1.L$0 = str;
                        allowListController$handleRowTap$1.L$1 = tapAddOrRemove;
                        allowListController$handleRowTap$1.L$2 = mutableState;
                        allowListController$handleRowTap$1.label = 1;
                        obj = aegisService.modifyAllowlistForDependent(modifyAllowlistForDependentRequest, allowListController$handleRowTap$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState = allowListController$handleRowTap$1.L$2;
                p2PListRowTapButtonEvent = allowListController$handleRowTap$1.L$1;
                str = allowListController$handleRowTap$1.L$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                Analytics analytics = (Analytics) this.zad;
                P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove2 = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
                String str2 = tapAddOrRemove2.customerToken;
                boolean z = tapAddOrRemove2.toAdd;
                analytics.track(new P2PAllowListEditStart(str, str2, !z ? P2PAllowListEditStart.AllowListAction.ADD : P2PAllowListEditStart.AllowListAction.REMOVE), null);
                if (apiResult instanceof ApiResult.Success) {
                    AndroidStringManager androidStringManager = (AndroidStringManager) this.zac;
                    String str3 = tapAddOrRemove2.customerName;
                    if (z) {
                        str3.getClass();
                        formattedResource = new FormattedResource(com.squareup.cash.R.string.allow_list_failure_dialog_title_add, new Object[]{str3});
                    } else {
                        str3.getClass();
                        formattedResource = new FormattedResource(com.squareup.cash.R.string.allow_list_failure_dialog_title_remove, new Object[]{str3});
                    }
                    mutableState.setValue(new P2PFailureDialogModel(Countries.getString(androidStringManager.resources, formattedResource), androidStringManager.get(com.squareup.cash.R.string.allow_list_failure_dialog_subtitle), androidStringManager.get(com.squareup.cash.R.string.allow_list_failure_dialog_button)));
                } else {
                    String str4 = tapAddOrRemove2.customerToken;
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) this.zzb;
                    do {
                        value = stateFlowImpl.getValue();
                        P2PListData.AllowListData allowListData2 = (P2PListData.AllowListData) value;
                        if (allowListData2 != null) {
                            ArrayList<AllowlistCustomer> arrayList = allowListData2.customers;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (AllowlistCustomer allowlistCustomer : arrayList) {
                                BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
                                if (Intrinsics.areEqual(blocklyCustomerMetadata != null ? blocklyCustomerMetadata.customer_token : null, str4)) {
                                    allowlistCustomer = AllowlistCustomer.copy$default(allowlistCustomer, null, Boolean.valueOf(z), null, 125);
                                }
                                arrayList2.add(allowlistCustomer);
                            }
                            allowListData = new P2PListData.AllowListData(arrayList2);
                        } else {
                            allowListData = null;
                        }
                    } while (!stateFlowImpl.compareAndSet(value, allowListData));
                    if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove) {
                        StateFlowImpl stateFlowImpl2 = (StateFlowImpl) this.zzd;
                        do {
                            value2 = stateFlowImpl2.getValue();
                            p2PSearchData = (P2PSearchData) value2;
                            P2PSearchData.AllowSearchData allowSearchData = p2PSearchData instanceof P2PSearchData.AllowSearchData ? (P2PSearchData.AllowSearchData) p2PSearchData : null;
                            if (allowSearchData != null) {
                                AllowlistSearchResponse allowlistSearchResponse = allowSearchData.response;
                                LocalBrandBanner.Action action = allowlistSearchResponse.results;
                                if (action != null) {
                                    AllowlistSearchResponse$Results$AllowlistSuggestions allowlistSearchResponse$Results$AllowlistSuggestions = action instanceof AllowlistSearchResponse$Results$AllowlistSuggestions ? (AllowlistSearchResponse$Results$AllowlistSuggestions) action : null;
                                    if (allowlistSearchResponse$Results$AllowlistSuggestions != null) {
                                        allowlistSuggestions = allowlistSearchResponse$Results$AllowlistSuggestions.value;
                                        if (action != null) {
                                            AllowlistSearchResponse$Results$AllowlistSearchResults allowlistSearchResponse$Results$AllowlistSearchResults = action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults ? (AllowlistSearchResponse$Results$AllowlistSearchResults) action : null;
                                            if (allowlistSearchResponse$Results$AllowlistSearchResults != null) {
                                                allowlistSearchResults = allowlistSearchResponse$Results$AllowlistSearchResults.value;
                                                if (allowlistSuggestions != null) {
                                                    ArrayList handleSearchListChange$lambda$0$update = handleSearchListChange$lambda$0$update((P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent, allowlistSuggestions.customers);
                                                    ByteString unknownFields = allowlistSuggestions.unknownFields();
                                                    unknownFields.getClass();
                                                    allowlistSuggestions2 = new AllowlistSearchResponse.AllowlistSuggestions(handleSearchListChange$lambda$0$update, unknownFields);
                                                } else {
                                                    allowlistSuggestions2 = null;
                                                }
                                                if (allowlistSearchResults != null) {
                                                    ArrayList handleSearchListChange$lambda$0$update2 = handleSearchListChange$lambda$0$update((P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent, allowlistSearchResults.customers);
                                                    ByteString unknownFields2 = allowlistSearchResults.unknownFields();
                                                    unknownFields2.getClass();
                                                    allowlistSearchResults2 = new AllowlistSearchResponse.AllowlistSearchResults(handleSearchListChange$lambda$0$update2, unknownFields2);
                                                } else {
                                                    allowlistSearchResults2 = null;
                                                }
                                                p2PSearchData = new P2PSearchData.AllowSearchData(zzagj.withUpdatedResults(allowlistSearchResponse, allowlistSuggestions2, allowlistSearchResults2));
                                            }
                                        }
                                        allowlistSearchResults = null;
                                        if (allowlistSuggestions != null) {
                                        }
                                        if (allowlistSearchResults != null) {
                                        }
                                        p2PSearchData = new P2PSearchData.AllowSearchData(zzagj.withUpdatedResults(allowlistSearchResponse, allowlistSuggestions2, allowlistSearchResults2));
                                    }
                                }
                                allowlistSuggestions = null;
                                if (action != null) {
                                }
                                allowlistSearchResults = null;
                                if (allowlistSuggestions != null) {
                                }
                                if (allowlistSearchResults != null) {
                                }
                                p2PSearchData = new P2PSearchData.AllowSearchData(zzagj.withUpdatedResults(allowlistSearchResponse, allowlistSuggestions2, allowlistSearchResults2));
                            }
                        } while (!stateFlowImpl2.compareAndSet(value2, p2PSearchData));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        allowListController$handleRowTap$1 = new AllowListController$handleRowTap$1(this, (ContinuationImpl) continuation);
        Object obj2 = allowListController$handleRowTap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = allowListController$handleRowTap$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        Analytics analytics2 = (Analytics) this.zad;
        P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove22 = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
        String str22 = tapAddOrRemove22.customerToken;
        boolean z2 = tapAddOrRemove22.toAdd;
        analytics2.track(new P2PAllowListEditStart(str, str22, !z2 ? P2PAllowListEditStart.AllowListAction.ADD : P2PAllowListEditStart.AllowListAction.REMOVE), null);
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        DocumentStepFragment documentStepFragment = (DocumentStepFragment) baseDaggerFragment;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.zaa;
        documentStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        documentStepFragment.viewModelFactory = (DocumentStepViewModel_Factory_Impl) ((dagger.internal.InstanceFactory) this.zze).instance;
        documentStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
    }

    public boolean isAtLimit(Integer num) {
        int i;
        if (num != null) {
            int intValue = num.intValue();
            P2PListData.AllowListData allowListData = (P2PListData.AllowListData) ((StateFlowImpl) this.zzb).getValue();
            if (allowListData != null) {
                ArrayList arrayList = allowListData.customers;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Intrinsics.areEqual(((AllowlistCustomer) obj).is_in_allowlist, Boolean.TRUE)) {
                        arrayList2.add(obj);
                    }
                }
                i = arrayList2.size();
            } else {
                i = 0;
            }
            if (i >= intValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0416 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void logAndUpdateState(AutoValue_TransportContext autoValue_TransportContext, int i) {
        byte[] bArr;
        long j;
        AutoValue_BackendResponse autoValue_BackendResponse;
        String str;
        AutoValue_BackendResponse autoValue_BackendResponse2;
        int i2;
        SimpleRateLimiter apply;
        String str2;
        Integer num;
        HCaptcha hCaptcha;
        int i3;
        final zzai zzaiVar = this;
        final AutoValue_TransportContext autoValue_TransportContext2 = autoValue_TransportContext;
        byte[] bArr2 = autoValue_TransportContext2.extras;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) zzaiVar.zza;
        TransportBackend transportBackend = ((MetadataBackendRegistry) zzaiVar.zaa).get(autoValue_TransportContext2.backendName);
        long j2 = 0;
        while (((Boolean) sQLiteEventStore.runCriticalSection(new SynchronizationGuard$CriticalSection(zzaiVar) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda3
            public final /* synthetic */ zzai f$0;

            {
                this.f$0 = zzaiVar;
            }

            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
            public final Object execute() {
                Boolean bool;
                int i4 = r3;
                AutoValue_TransportContext autoValue_TransportContext3 = autoValue_TransportContext2;
                zzai zzaiVar2 = this.f$0;
                switch (i4) {
                    case 0:
                        SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) zzaiVar2.zab;
                        SQLiteDatabase db = sQLiteEventStore2.getDb();
                        db.beginTransaction();
                        try {
                            Long transportContextId = SQLiteEventStore.getTransportContextId(db, autoValue_TransportContext3);
                            if (transportContextId == null) {
                                bool = Boolean.FALSE;
                            } else {
                                Cursor rawQuery = sQLiteEventStore2.getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{transportContextId.toString()});
                                try {
                                    Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                    rawQuery.close();
                                    bool = valueOf;
                                } catch (Throwable th) {
                                    rawQuery.close();
                                    throw th;
                                }
                            }
                            db.setTransactionSuccessful();
                            return bool;
                        } finally {
                            db.endTransaction();
                        }
                    default:
                        SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) zzaiVar2.zab;
                        sQLiteEventStore3.getClass();
                        return (Iterable) sQLiteEventStore3.inTransaction(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(26, sQLiteEventStore3, autoValue_TransportContext3));
                }
            }
        })).booleanValue()) {
            final int i4 = 1;
            Iterable iterable = (Iterable) sQLiteEventStore.runCriticalSection(new SynchronizationGuard$CriticalSection(zzaiVar) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda3
                public final /* synthetic */ zzai f$0;

                {
                    this.f$0 = zzaiVar;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
                public final Object execute() {
                    Boolean bool;
                    int i42 = i4;
                    AutoValue_TransportContext autoValue_TransportContext3 = autoValue_TransportContext2;
                    zzai zzaiVar2 = this.f$0;
                    switch (i42) {
                        case 0:
                            SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) zzaiVar2.zab;
                            SQLiteDatabase db = sQLiteEventStore2.getDb();
                            db.beginTransaction();
                            try {
                                Long transportContextId = SQLiteEventStore.getTransportContextId(db, autoValue_TransportContext3);
                                if (transportContextId == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = sQLiteEventStore2.getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{transportContextId.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                db.setTransactionSuccessful();
                                return bool;
                            } finally {
                                db.endTransaction();
                            }
                        default:
                            SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) zzaiVar2.zab;
                            sQLiteEventStore3.getClass();
                            return (Iterable) sQLiteEventStore3.inTransaction(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(26, sQLiteEventStore3, autoValue_TransportContext3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (transportBackend == null) {
                Logging.d("Uploader", "Unknown backend for %s, deleting event batch for it...", autoValue_TransportContext2);
                autoValue_BackendResponse2 = new AutoValue_BackendResponse(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AutoValue_PersistedEvent) it.next()).event);
                }
                if (bArr2 != null) {
                    SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) zzaiVar.zze;
                    Objects.requireNonNull(sQLiteEventStore2);
                    ClientMetrics clientMetrics = (ClientMetrics) sQLiteEventStore.runCriticalSection(new Uploader$$ExternalSyntheticLambda1(sQLiteEventStore2, i4));
                    SubtreeManager subtreeManager = new SubtreeManager();
                    subtreeManager.idCounter = new HashMap();
                    subtreeManager.workflowSession = Long.valueOf(((Clock) zzaiVar.zzb).getTime());
                    subtreeManager.interceptor = Long.valueOf(((Clock) zzaiVar.zzd).getTime());
                    subtreeManager.snapshotCache = "GDT_CLIENT_METRICS";
                    Encoding encoding2 = new Encoding("proto");
                    clientMetrics.getClass();
                    n nVar = ProtoEncoderDoNotUse.ENCODER;
                    nVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        nVar.encode(clientMetrics, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    subtreeManager.emitActionToParent = new EncodedPayload(encoding2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((CctTransportBackend) transportBackend).decorate(subtreeManager.m4005build()));
                }
                CctTransportBackend cctTransportBackend = (CctTransportBackend) transportBackend;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) it2.next();
                    String str3 = autoValue_EventInternal.transportName;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(autoValue_EventInternal);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(autoValue_EventInternal);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    AutoValue_EventInternal autoValue_EventInternal2 = (AutoValue_EventInternal) ((List) entry.getValue()).get(0);
                    QosTier qosTier = QosTier.DEFAULT;
                    long time = cctTransportBackend.wallTimeClock.getTime();
                    long time2 = cctTransportBackend.uptimeClock.getTime();
                    AutoValue_ClientInfo autoValue_ClientInfo = new AutoValue_ClientInfo(new AutoValue_AndroidClientInfo(Integer.valueOf(autoValue_EventInternal2.getInteger("sdk-version")), autoValue_EventInternal2.get("model"), autoValue_EventInternal2.get("hardware"), autoValue_EventInternal2.get("device"), autoValue_EventInternal2.get("product"), autoValue_EventInternal2.get("os-uild"), autoValue_EventInternal2.get("manufacturer"), autoValue_EventInternal2.get("fingerprint"), autoValue_EventInternal2.get("locale"), autoValue_EventInternal2.get(AdRevenueScheme.COUNTRY), autoValue_EventInternal2.get("mcc_mnc"), autoValue_EventInternal2.get("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (AutoValue_EventInternal autoValue_EventInternal3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        EncodedPayload encodedPayload = autoValue_EventInternal3.encodedPayload;
                        Encoding encoding3 = encodedPayload.f989encoding;
                        byte[] bArr4 = encodedPayload.bytes;
                        long j3 = j2;
                        if (encoding3.equals(new Encoding("proto"))) {
                            hCaptcha = new HCaptcha();
                            hCaptcha.onOpenListeners = bArr4;
                        } else if (encoding3.equals(new Encoding("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            HCaptcha hCaptcha2 = new HCaptcha();
                            hCaptcha2.handler = str4;
                            hCaptcha = hCaptcha2;
                        } else {
                            String concat = "TRuntime.".concat("CctTransportBackend");
                            if (Log.isLoggable(concat, 5)) {
                                Log.w(concat, "Received event of unsupported encoding " + encoding3 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        hCaptcha.result = Long.valueOf(autoValue_EventInternal3.eventMillis);
                        hCaptcha.onFailureListeners = Long.valueOf(autoValue_EventInternal3.uptimeMillis);
                        String str5 = (String) autoValue_EventInternal3.autoMetadata.get("tz-offset");
                        hCaptcha.internalConfig = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        hCaptcha.captchaVerifier = new AutoValue_NetworkConnectionInfo((NetworkConnectionInfo.NetworkType) NetworkConnectionInfo.NetworkType.valueMap.get(autoValue_EventInternal3.getInteger("net-type")), (NetworkConnectionInfo.MobileSubtype) NetworkConnectionInfo.MobileSubtype.valueMap.get(autoValue_EventInternal3.getInteger("mobile-subtype")));
                        Integer num2 = autoValue_EventInternal3.code;
                        if (num2 != null) {
                            hCaptcha.exception = num2;
                        }
                        Integer num3 = autoValue_EventInternal3.productId;
                        if (num3 != null) {
                            AutoValue_ExternalPrivacyContext autoValue_ExternalPrivacyContext = new AutoValue_ExternalPrivacyContext(new AutoValue_ExternalPRequestContext(num3));
                            ComplianceData.ProductIdOrigin productIdOrigin = ComplianceData.ProductIdOrigin.EVENT_OVERRIDE;
                            hCaptcha.onSuccessListeners = new AutoValue_ComplianceData(autoValue_ExternalPrivacyContext);
                        }
                        String str6 = ((Long) hCaptcha.result) == null ? " eventTimeMs" : "";
                        if (((Long) hCaptcha.onFailureListeners) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) hCaptcha.internalConfig) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList4.add(new AutoValue_LogEvent(((Long) hCaptcha.result).longValue(), (Integer) hCaptcha.exception, (AutoValue_ComplianceData) hCaptcha.onSuccessListeners, ((Long) hCaptcha.onFailureListeners).longValue(), (byte[]) hCaptcha.onOpenListeners, (String) hCaptcha.handler, ((Long) hCaptcha.internalConfig).longValue(), (AutoValue_NetworkConnectionInfo) hCaptcha.captchaVerifier));
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                    }
                    arrayList3.add(new AutoValue_LogRequest(time, time2, autoValue_ClientInfo, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j2;
                AutoValue_BatchedLogRequest autoValue_BatchedLogRequest = new AutoValue_BatchedLogRequest(arrayList3);
                URL url = cctTransportBackend.endPoint;
                if (bArr != null) {
                    try {
                        CCTDestination fromByteArray = CCTDestination.fromByteArray(bArr);
                        String str7 = fromByteArray.apiKey;
                        if (str7 == null) {
                            str7 = null;
                        }
                        url = CctTransportBackend.parseUrlOrThrow(fromByteArray.endPoint);
                        str = str7;
                    } catch (IllegalArgumentException unused3) {
                        autoValue_BackendResponse = new AutoValue_BackendResponse(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    SVG svg = new SVG(url, autoValue_BatchedLogRequest, str, false, 24);
                    ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(cctTransportBackend, 28);
                    int i5 = 5;
                    SVG svg2 = svg;
                    do {
                        apply = exoPlayerImplInternal$$ExternalSyntheticLambda2.apply(svg2);
                        URL url2 = (URL) apply.secondsAndCount;
                        if (url2 != null) {
                            Logging.d("CctTransportBackend", "Following redirect to: %s", url2);
                            svg2 = new SVG(url2, (AutoValue_BatchedLogRequest) svg2.cssRules, (String) svg2.idToElementMap, false, 24);
                        } else {
                            svg2 = null;
                        }
                        if (svg2 == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    int i6 = apply.capacity;
                    if (i6 == 200) {
                        autoValue_BackendResponse2 = new AutoValue_BackendResponse(1, apply.startNanos);
                    } else {
                        if (i6 >= 500 || i6 == 404) {
                            autoValue_BackendResponse = new AutoValue_BackendResponse(2, -1L);
                        } else if (i6 == 400) {
                            try {
                                autoValue_BackendResponse = new AutoValue_BackendResponse(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                Logging.e(e, "CctTransportBackend", "Could not make request to the backend");
                                i2 = 2;
                                autoValue_BackendResponse2 = new AutoValue_BackendResponse(2, -1L);
                                i3 = autoValue_BackendResponse2.status;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            autoValue_BackendResponse = new AutoValue_BackendResponse(3, -1L);
                        }
                        autoValue_BackendResponse2 = autoValue_BackendResponse;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            i3 = autoValue_BackendResponse2.status;
            if (i3 != i2) {
                sQLiteEventStore.runCriticalSection(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda0(this, iterable, autoValue_TransportContext, j));
                ((SVG) this.zac).schedule(autoValue_TransportContext, i + 1, true);
                return;
            }
            zzaiVar = this;
            autoValue_TransportContext2 = autoValue_TransportContext;
            j2 = j;
            sQLiteEventStore.runCriticalSection(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(24, zzaiVar, iterable));
            if (i3 == 1) {
                j2 = Math.max(j2, autoValue_BackendResponse2.nextRequestWaitMillis);
                if (bArr != null) {
                    sQLiteEventStore.runCriticalSection(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(zzaiVar, 29));
                }
            } else if (i3 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    String str8 = ((AutoValue_PersistedEvent) it3.next()).event.transportName;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                sQLiteEventStore.runCriticalSection(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(25, zzaiVar, hashMap2));
            }
            bArr2 = bArr;
        }
        sQLiteEventStore.runCriticalSection(new Uploader$$ExternalSyntheticLambda9(zzaiVar, j2, autoValue_TransportContext2));
    }

    @Override // com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate
    public GrowToolsManagerViewModel models(Flow flow, Composer composer, int i) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.zab;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(827308994);
        GrowToolsManagerState rememberManagerState = KClasses.rememberManagerState(gapComposer);
        int i2 = 1;
        if (GrowToolsDirectDepositManager$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageDirectDepositScreen) this.zzb).origin.ordinal()] != 1) {
            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, 475004674, false, "Not supported origin. Add support");
        }
        gapComposer.startReplaceGroup(475001676);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealPaidInBitcoinStateManager) this.zac).states(gapComposer), gapComposer);
        GrowToolsManagerViewModel.Loaded.Header.Target target = new GrowToolsManagerViewModel.Loaded.Header.Target(androidStringManager.get(com.squareup.cash.R.string.grow_tools_bitcoin), getPaidInBitcoinTargetDescription(((PaidInBitcoinState) rememberUpdatedState.getValue()).paidInBitcoinEnabled, (PaidInBitcoinState) rememberUpdatedState.getValue()), KClassifiers.bitcoinAvatar(), Icons.Deposit16, androidStringManager.get(com.squareup.cash.R.string.grow_tools_change));
        String str = androidStringManager.get(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_title);
        String str2 = androidStringManager.get(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_toggle_text);
        boolean z = ((PaidInBitcoinState) rememberUpdatedState.getValue()).paidInBitcoinEnabled;
        Integer num = ((PaidInBitcoinState) rememberUpdatedState.getValue()).allocationBps;
        OriginSpecificData originSpecificData = new OriginSpecificData(str, str2, z, new GrowToolsDirectDepositManager$DirectDepositTarget(num != null ? num.intValue() : 0, target, getPaidInBitcoinTargetDescription(!((PaidInBitcoinState) rememberUpdatedState.getValue()).paidInBitcoinEnabled, (PaidInBitcoinState) rememberUpdatedState.getValue())), androidStringManager.get(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_toggle_off_dialog_message), androidStringManager.get(com.squareup.cash.R.string.grow_tools_direct_deposit_bitcoin_toggle_off_dialog_confirm_button));
        gapComposer.end(false);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(originSpecificData, gapComposer);
        Boolean valueOf = Boolean.valueOf(((OriginSpecificData) rememberUpdatedState2.getValue()).enabled);
        boolean changed = gapComposer.changed(rememberManagerState);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new GrowToolsAutoInvestManager$models$1$1(rememberManagerState, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.zzd).models(gapComposer, 0), gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changed2 = gapComposer.changed(rememberUpdatedState3);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ToastKt$Toast$7$1(rememberUpdatedState3, continuation, 11);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, rememberManagerState, rememberUpdatedState2, 5));
        GrowToolsManagerViewModel.Loaded buildModel = ((OriginSpecificData) rememberUpdatedState2.getValue()).buildModel(rememberManagerState, (UiCallbackModel) rememberUpdatedState3.getValue(), androidStringManager);
        gapComposer.end(false);
        return buildModel;
    }

    public void notifyCardDetected() {
        SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) this.zab, null, "notify_card_detected", null, null, 12);
        try {
            TextSetter textSetter = (TextSetter) this.zza;
            if (!textSetter.getEmbeddedCardReader().isReaderStopped()) {
                textSetter.getEmbeddedCardReader().sendCardDetected();
            }
            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
        } catch (Throwable th) {
            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
            throw th;
        }
    }

    public void notifyCardError() {
        SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) this.zab, null, "notify_card_error", null, null, 12);
        try {
            ((TextSetter) this.zza).getEmbeddedCardReader().sendCardError();
        } finally {
            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
        }
    }

    public ViewBindingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AdapterHelper$ItemInfo adapterHelper$ItemInfo;
        viewGroup.getClass();
        ArrayList arrayList = (ArrayList) this.zze;
        if (arrayList.size() == 1) {
            adapterHelper$ItemInfo = (AdapterHelper$ItemInfo) CollectionsKt.first((List) arrayList);
        } else {
            Object obj = ((LinkedHashMap) this.zzc).get(Integer.valueOf(i));
            if (obj == null) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "No item for layout id '", "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?"));
                return null;
            }
            adapterHelper$ItemInfo = (AdapterHelper$ItemInfo) obj;
        }
        Function3 function3 = adapterHelper$ItemInfo.inflateFn;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        from.getClass();
        ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder((ViewBinding) function3.invoke(from, viewGroup, Boolean.FALSE));
        Function1 function1 = adapterHelper$ItemInfo.onViewCreated;
        if (function1 != null) {
            function1.invoke(viewBindingViewHolder.binding);
        }
        return viewBindingViewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onMessageReceived(String str, ContinuationImpl continuationImpl) {
        PushMessagingServiceActor$onMessageReceived$1 pushMessagingServiceActor$onMessageReceived$1;
        int i;
        CashNotification asCashNotification;
        CashPushNotification cashPushNotification;
        CashNotification cashNotification;
        Set set;
        String str2;
        RealNotificationDispatcher realNotificationDispatcher = (RealNotificationDispatcher) this.zad;
        SessionManager sessionManager = (SessionManager) this.zab;
        if (continuationImpl instanceof PushMessagingServiceActor$onMessageReceived$1) {
            pushMessagingServiceActor$onMessageReceived$1 = (PushMessagingServiceActor$onMessageReceived$1) continuationImpl;
            int i2 = pushMessagingServiceActor$onMessageReceived$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pushMessagingServiceActor$onMessageReceived$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pushMessagingServiceActor$onMessageReceived$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushMessagingServiceActor$onMessageReceived$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((HttpUrl.Builder) this.zac).checkUpdate();
                    try {
                        Moshi moshi = (Moshi) this.zaa;
                        moshi.getClass();
                        Object fromJson = moshi.adapter(CashPushNotification.class, Util.NO_ANNOTATIONS, null).fromJson(str);
                        fromJson.getClass();
                        CashPushNotification cashPushNotification2 = (CashPushNotification) fromJson;
                        String str3 = cashPushNotification2.appToken;
                        asCashNotification = ((CashNotificationFactory) this.zzb).asCashNotification(cashPushNotification2);
                        if (!(asCashNotification instanceof CashNotification$ClearAppDataNotification$ClearAll)) {
                            if (!PlatformKt.isAuthenticated(sessionManager)) {
                                return Unit.INSTANCE;
                            }
                            Timber.Forest forest = Timber.Forest;
                            forest.d(Recorder$$ExternalSyntheticOutline2.m("Incoming GCM: ", str), new Object[0]);
                            String appTokenOrNull = PlatformKt.appTokenOrNull(sessionManager);
                            if (!Intrinsics.areEqual(appTokenOrNull, str3)) {
                                forest.w(new IllegalArgumentException(CameraSelector$$ExternalSyntheticOutline0.m("Received invalid app token. Got ", str3, ", expected ", appTokenOrNull)));
                                return Unit.INSTANCE;
                            }
                            pushMessagingServiceActor$onMessageReceived$1.L$0 = str;
                            pushMessagingServiceActor$onMessageReceived$1.L$1 = cashPushNotification2;
                            pushMessagingServiceActor$onMessageReceived$1.L$2 = asCashNotification;
                            pushMessagingServiceActor$onMessageReceived$1.label = 1;
                            obj = eligibleAccountTokens(pushMessagingServiceActor$onMessageReceived$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            cashPushNotification = cashPushNotification2;
                        }
                        cashNotification = asCashNotification;
                        cashNotification.getClass();
                        if (cashNotification.getHasBackgroundTasks()) {
                            Pool pool = (Pool) this.zze;
                            str.getClass();
                            AndroidWorkManager androidWorkManager = (AndroidWorkManager) pool.pool;
                            OneTimeWorkRequest build = SizeKt.OneTimeWorkRequestBuilder(NotificationWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("key_notification_json", str)}, 1)).build();
                            androidWorkManager.getClass();
                            if (WorkManagerImpl.getInstance() != null) {
                                ((WorkManager) androidWorkManager.workManager$delegate.getValue()).enqueue(build);
                            }
                        } else if (cashNotification.getShowNotification()) {
                            JobKt.launch$default(realNotificationDispatcher.scope, null, null, new DbSessionManager$updateDb$2(realNotificationDispatcher, cashNotification, continuation, continuation, 28), 3);
                        }
                        return Unit.INSTANCE;
                    } catch (IOException e) {
                        Timber.Forest.e("Could not parse GCM JSON data payload!", new Object[0], e);
                        return Unit.INSTANCE;
                    }
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CashNotification cashNotification2 = pushMessagingServiceActor$onMessageReceived$1.L$2;
                cashPushNotification = pushMessagingServiceActor$onMessageReceived$1.L$1;
                String str4 = pushMessagingServiceActor$onMessageReceived$1.L$0;
                SafeTrace.throwOnFailure(obj);
                asCashNotification = cashNotification2;
                str = str4;
                set = (Set) obj;
                str2 = cashPushNotification.customerToken;
                if (str2 != null || StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (str2 != null && !set.contains(str2)) {
                    Timber.Forest.w(new IllegalArgumentException("Received a push message for a different customer token. Got " + str2 + ", expected one of " + set));
                    ((Analytics) this.zza).track(new PushNotificationDeclineDiscardStaleMessage(), null);
                    return Unit.INSTANCE;
                }
                cashNotification = asCashNotification;
                cashNotification.getClass();
                if (cashNotification.getHasBackgroundTasks()) {
                }
                return Unit.INSTANCE;
            }
        }
        pushMessagingServiceActor$onMessageReceived$1 = new PushMessagingServiceActor$onMessageReceived$1(this, continuationImpl);
        Object obj3 = pushMessagingServiceActor$onMessageReceived$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushMessagingServiceActor$onMessageReceived$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        set = (Set) obj3;
        str2 = cashPushNotification.customerToken;
        if (str2 != null) {
        }
        str2 = null;
        if (str2 != null) {
            Timber.Forest.w(new IllegalArgumentException("Received a push message for a different customer token. Got " + str2 + ", expected one of " + set));
            ((Analytics) this.zza).track(new PushNotificationDeclineDiscardStaleMessage(), null);
            return Unit.INSTANCE;
        }
        cashNotification = asCashNotification;
        cashNotification.getClass();
        if (cashNotification.getHasBackgroundTasks()) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public Object onSuccess(BlockersData blockersData, Continuation continuation) {
        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.zzc)).peekCurrentValue(AmplitudeExperiments$CashBitcoinCdfEventsUpdates.INSTANCE)).enabled()) {
            RealCryptoFlowLogger realCryptoFlowLogger = (RealCryptoFlowLogger) this.zzb;
            CryptoTradeComplete cryptoTradeCompleteAnalytic = getCryptoTradeCompleteAnalytic();
            String str = blockersData.flowToken;
            str.getClass();
            realCryptoFlowLogger.cryptoTradeCompleteEvent = cryptoTradeCompleteAnalytic;
            realCryptoFlowLogger.trackedFlowToken = str;
        }
        RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo = (RealBitcoinPerformanceDataRepo) this.zad;
        BitcoinPerformanceDataState bitcoinPerformanceDataState = BitcoinPerformanceDataState.ENTERED_FLOW;
        StateFlowImpl stateFlowImpl = realBitcoinPerformanceDataRepo.performanceDataState;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bitcoinPerformanceDataState);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        InitiateBitcoinExchangeScenarioPlan$produceResponseContext$1 initiateBitcoinExchangeScenarioPlan$produceResponseContext$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof InitiateBitcoinExchangeScenarioPlan$produceResponseContext$1) {
            initiateBitcoinExchangeScenarioPlan$produceResponseContext$1 = (InitiateBitcoinExchangeScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.zzc)).peekCurrentValue(AmplitudeExperiments$CashBitcoinCdfEventsUpdates.INSTANCE);
                    featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                    if (featureFlag$EnabledDisabledAmplitudeExperiment$Options == FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled) {
                        ((Analytics) this.zab).track(getCryptoTradeCompleteAnalytic(), null);
                    }
                    CryptoService cryptoService = (CryptoService) this.zaa;
                    String str = blockersData.flowToken;
                    ExchangeRequest copy$default = ExchangeRequest.copy$default((ExchangeRequest) this.zzd, null, null, null, blockersData.requestContext, null, null, null, null, null, 8127);
                    initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.label = 1;
                    obj = cryptoService.initiateCryptoExchange(str, copy$default, initiateBitcoinExchangeScenarioPlan$produceResponseContext$1);
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
                    ResponseContext responseContext = ((ExchangeResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        initiateBitcoinExchangeScenarioPlan$produceResponseContext$1 = new InitiateBitcoinExchangeScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateBitcoinExchangeScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object searchCustomers(String str, String str2, BlockingContext blockingContext, ContinuationImpl continuationImpl) {
        AllowListController$searchCustomers$1 allowListController$searchCustomers$1;
        int i;
        ApiResult apiResult;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.zzd;
        if (continuationImpl instanceof AllowListController$searchCustomers$1) {
            allowListController$searchCustomers$1 = (AllowListController$searchCustomers$1) continuationImpl;
            int i2 = allowListController$searchCustomers$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                allowListController$searchCustomers$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = allowListController$searchCustomers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = allowListController$searchCustomers$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stateFlowImpl.setValue(null);
                    BlocklyService blocklyService = (BlocklyService) this.zab;
                    AllowlistSearchRequest allowlistSearchRequest = new AllowlistSearchRequest(str, str2);
                    allowListController$searchCustomers$1.label = 1;
                    obj = blocklyService.allowlistSearch(allowlistSearchRequest, allowListController$searchCustomers$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    P2PSearchData.AllowSearchData allowSearchData = new P2PSearchData.AllowSearchData((AllowlistSearchResponse) ((ApiResult.Success) apiResult).response);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, allowSearchData);
                }
                return Unit.INSTANCE;
            }
        }
        allowListController$searchCustomers$1 = new AllowListController$searchCustomers$1(this, continuationImpl);
        Object obj2 = allowListController$searchCustomers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = allowListController$searchCustomers$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fc A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:13:0x00f6, B:15:0x00fc, B:16:0x0177, B:23:0x0120, B:25:0x0124, B:27:0x012f, B:28:0x0137, B:29:0x0149, B:31:0x014d, B:32:0x0162, B:34:0x0166, B:35:0x017a, B:36:0x017f, B:45:0x0053, B:48:0x0065, B:50:0x007d, B:52:0x0081, B:56:0x0180, B:57:0x0185, B:58:0x0186, B:59:0x018b, B:60:0x018c, B:61:0x0191), top: B:44:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:13:0x00f6, B:15:0x00fc, B:16:0x0177, B:23:0x0120, B:25:0x0124, B:27:0x012f, B:28:0x0137, B:29:0x0149, B:31:0x014d, B:32:0x0162, B:34:0x0166, B:35:0x017a, B:36:0x017f, B:45:0x0053, B:48:0x0065, B:50:0x007d, B:52:0x0081, B:56:0x0180, B:57:0x0185, B:58:0x0186, B:59:0x018b, B:60:0x018c, B:61:0x0191), top: B:44:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startChallenge(InitChallengeArgs initChallengeArgs, ContinuationImpl continuationImpl) {
        DefaultInitChallengeRepository$startChallenge$1 defaultInitChallengeRepository$startChallenge$1;
        int i;
        StripeErrorRequestExecutor stripeErrorRequestExecutor;
        ChallengeRequestExecutor$Config challengeRequestExecutor$Config;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        ChallengeRequestResult challengeRequestResult;
        zzai zzaiVar = this;
        InitChallengeArgs initChallengeArgs2 = initChallengeArgs;
        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) zzaiVar.zzd;
        Logger logger = (Logger) zzaiVar.zze;
        if (continuationImpl instanceof DefaultInitChallengeRepository$startChallenge$1) {
            defaultInitChallengeRepository$startChallenge$1 = (DefaultInitChallengeRepository$startChallenge$1) continuationImpl;
            int i2 = defaultInitChallengeRepository$startChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultInitChallengeRepository$startChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultInitChallengeRepository$startChallenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultInitChallengeRepository$startChallenge$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    logger.info();
                    try {
                        Result.Companion companion = Result.Companion;
                        o0 o0Var = (o0) zzaiVar.zad;
                        DefaultJwsValidator defaultJwsValidator = (DefaultJwsValidator) zzaiVar.zab;
                        String str = initChallengeArgs2.challengeParameters.acsSignedContent;
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        AcsData parse = o0Var.parse(defaultJwsValidator.getPayload(str));
                        String str2 = parse.acsUrl;
                        ECPublicKey eCPublicKey = parse.acsEphemPubKey;
                        SdkTransactionId sdkTransactionId = (SdkTransactionId) zzaiVar.zaa;
                        ChallengeParameters challengeParameters = initChallengeArgs2.challengeParameters;
                        String str3 = challengeParameters.acsTransactionId;
                        if (str3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String str4 = challengeParameters.threeDsServerTransactionId;
                        if (str4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ChallengeRequestData challengeRequestData = new ChallengeRequestData("2.2.0", str4, str3, sdkTransactionId, challengeParameters.threeDSRequestorAppURL, null, 4064);
                        Payload payload = (Payload) zzaiVar.zzb;
                        str2.getClass();
                        TextSetter textSetter = new TextSetter(str2, defaultErrorReporter, (CoroutineContext) payload.a);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        stripeErrorRequestExecutor = new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) zzaiVar.zac;
                        String str5 = initChallengeArgs2.sdkReferenceNumber;
                        byte[] encoded = initChallengeArgs2.sdkKeyPair.getPrivate().getEncoded();
                        encoded.getClass();
                        byte[] encoded2 = eCPublicKey.getEncoded();
                        encoded2.getClass();
                        ChallengeRequestExecutor$Config challengeRequestExecutor$Config2 = new ChallengeRequestExecutor$Config(defaultMessageTransformer, str5, challengeRequestData, str2, new ChallengeRequestExecutor$Config.Keys(encoded, encoded2));
                        ImageRepository$ImageSupplier$Default imageRepository$ImageSupplier$Default = (ImageRepository$ImageSupplier$Default) zzaiVar.zza;
                        defaultInitChallengeRepository$startChallenge$1.L$0 = initChallengeArgs2;
                        defaultInitChallengeRepository$startChallenge$1.L$1 = zzaiVar;
                        defaultInitChallengeRepository$startChallenge$1.L$5 = stripeErrorRequestExecutor;
                        defaultInitChallengeRepository$startChallenge$1.L$6 = challengeRequestExecutor$Config2;
                        defaultInitChallengeRepository$startChallenge$1.label = 1;
                        obj = new StripeChallengeRequestExecutor$Factory(challengeRequestExecutor$Config2).create(imageRepository$ImageSupplier$Default.errorReporter, imageRepository$ImageSupplier$Default.workContext).execute(challengeRequestData, defaultInitChallengeRepository$startChallenge$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        challengeRequestExecutor$Config = challengeRequestExecutor$Config2;
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ChallengeRequestExecutor$Config challengeRequestExecutor$Config3 = defaultInitChallengeRepository$startChallenge$1.L$6;
                    StripeErrorRequestExecutor stripeErrorRequestExecutor2 = defaultInitChallengeRepository$startChallenge$1.L$5;
                    zzai zzaiVar2 = defaultInitChallengeRepository$startChallenge$1.L$1;
                    InitChallengeArgs initChallengeArgs3 = defaultInitChallengeRepository$startChallenge$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        challengeRequestExecutor$Config = challengeRequestExecutor$Config3;
                        stripeErrorRequestExecutor = stripeErrorRequestExecutor2;
                        initChallengeArgs2 = initChallengeArgs3;
                        zzaiVar = zzaiVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        initChallengeArgs2 = initChallengeArgs3;
                        Result.Companion companion22 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                    }
                }
                challengeRequestResult = (ChallengeRequestResult) obj;
                if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                    failure = new InitChallengeResult.Start(new ChallengeViewArgs(((ChallengeRequestResult.Success) challengeRequestResult).cresData, ((ChallengeRequestResult.Success) challengeRequestResult).creqData, (StripeUiCustomization) zzaiVar.zzc, challengeRequestExecutor$Config, new StripeChallengeRequestExecutor$Factory(challengeRequestExecutor$Config), initChallengeArgs2.timeoutMins, initChallengeArgs2.intentData));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                    if (((ChallengeRequestResult.ProtocolError) challengeRequestResult).data.errorComponent == ErrorData.ErrorComponent.ThreeDsSdk) {
                        stripeErrorRequestExecutor.executeAsync(((ChallengeRequestResult.ProtocolError) challengeRequestResult).data);
                    }
                    failure = new InitChallengeResult.End(new ChallengeResult.ProtocolError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).data, null, initChallengeArgs2.intentData));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
                    stripeErrorRequestExecutor.executeAsync(((ChallengeRequestResult.Timeout) challengeRequestResult).data);
                    failure = new InitChallengeResult.End(new ChallengeResult.Timeout(null, null, initChallengeArgs2.intentData));
                } else {
                    if (!(challengeRequestResult instanceof ChallengeRequestResult.RuntimeError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new InitChallengeResult.End(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).throwable, null, initChallengeArgs2.intentData));
                }
                Result.Companion companion3 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return failure;
                }
                defaultErrorReporter.reportError(m4120exceptionOrNullimpl);
                logger.error("Exception during initial challenge request.", m4120exceptionOrNullimpl);
                return new InitChallengeResult.End(new ChallengeResult.RuntimeError(m4120exceptionOrNullimpl, null, initChallengeArgs2.intentData));
            }
        }
        defaultInitChallengeRepository$startChallenge$1 = new DefaultInitChallengeRepository$startChallenge$1(zzaiVar, continuationImpl);
        Object obj2 = defaultInitChallengeRepository$startChallenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultInitChallengeRepository$startChallenge$1.label;
        if (i != 0) {
        }
        challengeRequestResult = (ChallengeRequestResult) obj2;
        if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
        }
        Result.Companion companion32 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
    }

    public void stopReadingCardPayment() {
        SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) this.zab, null, "stop_reading_card_payment", null, null, 12);
        try {
            ((RealNfcPaymentsManager) this.zaa).disableReaderMode();
            TextSetter textSetter = (TextSetter) this.zza;
            if (!textSetter.getEmbeddedCardReader().isReaderStopped()) {
                Lazy lazy = (Lazy) ((AssetPublicSuffixList) textSetter.textSwitcher).path;
                synchronized (lazy.value) {
                    CollectionsKt.toList((ArrayDeque) lazy.initializer);
                    ((ArrayDeque) lazy.initializer).clear();
                }
                textSetter.getEmbeddedCardReader().stopReader();
            }
            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
        } catch (Throwable th) {
            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchResultsData transformSearchResults(P2PSearchData p2PSearchData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext) {
        ?? r0;
        LocalBrandBanner.Action action;
        ?? r5;
        List list;
        List list2;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.zac;
        str.getClass();
        str2.getClass();
        AllowlistSearchResponse allowlistSearchResponse = ((P2PSearchData.AllowSearchData) p2PSearchData).response;
        LocalBrandBanner.Action action2 = allowlistSearchResponse.results;
        if (action2 != null) {
            AllowlistSearchResponse$Results$AllowlistSuggestions allowlistSearchResponse$Results$AllowlistSuggestions = action2 instanceof AllowlistSearchResponse$Results$AllowlistSuggestions ? (AllowlistSearchResponse$Results$AllowlistSuggestions) action2 : null;
            AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = allowlistSearchResponse$Results$AllowlistSuggestions != null ? allowlistSearchResponse$Results$AllowlistSuggestions.value : null;
            if (allowlistSuggestions != null && (list2 = allowlistSuggestions.customers) != null) {
                List list3 = list2;
                r0 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r0.add(zzage.toRowModel((AllowlistCustomer) it.next(), androidStringManager, z, z2, isAtLimit(num)));
                }
                action = allowlistSearchResponse.results;
                if (action != null) {
                    AllowlistSearchResponse$Results$AllowlistSearchResults allowlistSearchResponse$Results$AllowlistSearchResults = action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults ? (AllowlistSearchResponse$Results$AllowlistSearchResults) action : null;
                    AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults = allowlistSearchResponse$Results$AllowlistSearchResults != null ? allowlistSearchResponse$Results$AllowlistSearchResults.value : null;
                    if (allowlistSearchResults != null && (list = allowlistSearchResults.customers) != null) {
                        List list4 = list;
                        r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            r5.add(zzage.toRowModel((AllowlistCustomer) it2.next(), androidStringManager, z, z2, isAtLimit(num)));
                        }
                        return new SearchResultsData(r0, r5);
                    }
                }
                r5 = EmptyList.INSTANCE;
                return new SearchResultsData(r0, r5);
            }
        }
        r0 = EmptyList.INSTANCE;
        action = allowlistSearchResponse.results;
        if (action != null) {
        }
        r5 = EmptyList.INSTANCE;
        return new SearchResultsData(r0, r5);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public ArrayList transformToRowModels(P2PListData p2PListData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = ((P2PListData.AllowListData) p2PListData).customers;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
            BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
            if ((blocklyCustomerMetadata != null ? blocklyCustomerMetadata.customer_token : null) != null && Intrinsics.areEqual(allowlistCustomer.is_in_allowlist, Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(zzage.toRowModel((AllowlistCustomer) it.next(), (AndroidStringManager) this.zac, z, z2, isAtLimit(num)));
        }
        return arrayList3;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public Unit updateData(P2PListData p2PListData) {
        P2PListData.AllowListData allowListData = p2PListData instanceof P2PListData.AllowListData ? (P2PListData.AllowListData) p2PListData : null;
        if (allowListData != null) {
            StateFlowImpl stateFlowImpl = (StateFlowImpl) this.zzb;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, allowListData);
        }
        return Unit.INSTANCE;
    }

    public void zae(int i) {
        while (!((LinkedList) this.zac).isEmpty() && ((zah) ((LinkedList) this.zac).getLast()).zaa() >= i) {
            ((LinkedList) this.zac).removeLast();
        }
    }

    public void zaf(Bundle bundle, zah zahVar) {
        if (((zzah) this.zaa) != null) {
            zahVar.zab();
            return;
        }
        if (((LinkedList) this.zac) == null) {
            this.zac = new LinkedList();
        }
        ((LinkedList) this.zac).add(zahVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.zab;
            if (bundle2 == null) {
                this.zab = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        m1 m1Var = (m1) this.zad;
        this.zza = m1Var;
        if (m1Var == null || ((zzah) this.zaa) != null) {
            return;
        }
        try {
            Context context = (Context) this.zzc;
            synchronized (WebSocketProtocol.class) {
                WebSocketProtocol.initialize(context);
            }
            zzl zzg = zzcc.zza(context).zzg(new ObjectWrapper(context), (GoogleMapOptions) this.zzd);
            if (zzg == null) {
                return;
            }
            ((m1) this.zza).onDelegateCreated(new zzah((MapView) this.zzb, zzg));
            ArrayList arrayList = (ArrayList) this.zze;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zzah) this.zaa).getMapAsync((GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    public zzde zze() {
        List list;
        String str;
        String str2;
        String str3;
        List list2;
        List list3;
        List list4;
        String str4 = (String) this.zaa;
        if (str4 != null && (list = (List) this.zac) != null && (str = (String) this.zad) != null && (str2 = (String) this.zza) != null && (str3 = (String) this.zzb) != null && (list2 = (List) this.zzc) != null && (list3 = (List) this.zzd) != null && (list4 = (List) this.zze) != null) {
            return new zzde(str4, (Integer) this.zab, list, str, str2, str3, list2, list3, list4);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.zaa) == null) {
            sb.append(" placeId");
        }
        if (((List) this.zac) == null) {
            sb.append(" types");
        }
        if (((String) this.zad) == null) {
            sb.append(" fullText");
        }
        if (((String) this.zza) == null) {
            sb.append(" primaryText");
        }
        if (((String) this.zzb) == null) {
            sb.append(" secondaryText");
        }
        if (((List) this.zzc) == null) {
            sb.append(" fullTextMatchedSubstrings");
        }
        if (((List) this.zzd) == null) {
            sb.append(" primaryTextMatchedSubstrings");
        }
        if (((List) this.zze) == null) {
            sb.append(" secondaryTextMatchedSubstrings");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public zzai(MapView mapView, Context context, GoogleMapOptions googleMapOptions) {
        this.zad = new m1(this, 20);
        this.zze = new ArrayList();
        this.zzb = mapView;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    public zzai(Function2 function2) {
        int i = 16;
        Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(i);
        AdapterHelper$2 adapterHelper$2 = AdapterHelper$2.INSTANCE;
        this.zaa = function2;
        this.zab = equals$$ExternalSyntheticLambda0;
        this.zac = adapterHelper$2;
        o0 o0Var = new o0(this, i);
        DiffUtil diffUtil = new DiffUtil() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$differ$2
            @Override // androidx.recyclerview.widget.DiffUtil
            public final boolean areContentsTheSame(Object obj, Object obj2) {
                return ((Boolean) ((Function2) zzai.this.zab).invoke(obj, obj2)).booleanValue();
            }

            @Override // androidx.recyclerview.widget.DiffUtil
            public final boolean areItemsTheSame(Object obj, Object obj2) {
                return ((Boolean) ((Function2) zzai.this.zaa).invoke(obj, obj2)).booleanValue();
            }

            @Override // androidx.recyclerview.widget.DiffUtil
            public final Object getChangePayload(Object obj, Object obj2) {
                return ((Function2) zzai.this.zac).invoke(obj, obj2);
            }
        };
        synchronized (DiffUtil.sExecutorLock) {
            try {
                if (DiffUtil.sDiffExecutor == null) {
                    DiffUtil.sDiffExecutor = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza = new AsyncListDiffer(o0Var, new AndroidSvg(9, DiffUtil.sDiffExecutor, diffUtil));
        this.zze = new ArrayList();
        this.zzb = new LinkedHashMap();
        this.zzc = new LinkedHashMap();
        this.zzd = new Sniffer((ViewTypeManager.viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456, 29);
    }

    public zzai(Moshi moshi, SessionManager sessionManager, HttpUrl.Builder builder, RealNotificationDispatcher realNotificationDispatcher, Analytics analytics, CashNotificationFactory cashNotificationFactory, FeatureFlagManager featureFlagManager, RealAccountholderAccountRepository realAccountholderAccountRepository, Pool pool) {
        moshi.getClass();
        sessionManager.getClass();
        analytics.getClass();
        featureFlagManager.getClass();
        this.zaa = moshi;
        this.zab = sessionManager;
        this.zac = builder;
        this.zad = realNotificationDispatcher;
        this.zza = analytics;
        this.zzb = cashNotificationFactory;
        this.zzc = featureFlagManager;
        this.zzd = realAccountholderAccountRepository;
        this.zze = pool;
    }

    public zzai(String str, String str2, String str3, String str4, String str5, String str6, LinkedHashMap linkedHashMap, String str7, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        linkedHashMap = (i & 128) != 0 ? null : linkedHashMap;
        str7 = (i & 256) != 0 ? null : str7;
        str3.getClass();
        this.zaa = str;
        this.zab = str2;
        this.zac = str3;
        this.zad = str4;
        this.zza = str5;
        this.zzb = str6;
        this.zzc = linkedHashMap;
        this.zzd = str7;
        this.zze = null;
    }

    public zzai(CryptoService cryptoService, Analytics analytics, FlowStarter flowStarter, RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo, ScenarioPlanInput scenarioPlanInput, Screen screen, RealCryptoFlowLogger realCryptoFlowLogger, FeatureFlagManager featureFlagManager) {
        screen.getClass();
        this.zaa = cryptoService;
        this.zab = analytics;
        this.zac = flowStarter;
        this.zad = realBitcoinPerformanceDataRepo;
        this.zza = screen;
        this.zzb = realCryptoFlowLogger;
        this.zzc = featureFlagManager;
        if (scenarioPlanInput instanceof InitiateBitcoinExchangeScenarioPlanInput) {
            InitiateBitcoinExchangeScenarioPlanInput initiateBitcoinExchangeScenarioPlanInput = (InitiateBitcoinExchangeScenarioPlanInput) scenarioPlanInput;
            this.zzd = initiateBitcoinExchangeScenarioPlanInput.request;
            this.zze = initiateBitcoinExchangeScenarioPlanInput.bitcoinExchangeType;
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinExchangeScenarioPlanInput.class), "Invalid input. Input is not of type ");
        throw null;
    }

    public zzai(AegisService aegisService, BlocklyService blocklyService, AndroidStringManager androidStringManager, Analytics analytics, RealAllowlistRepository realAllowlistRepository) {
        this.zaa = aegisService;
        this.zab = blocklyService;
        this.zac = androidStringManager;
        this.zad = analytics;
        this.zza = realAllowlistRepository;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this.zzb = MutableStateFlow;
        this.zzc = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(null);
        this.zzd = MutableStateFlow2;
        this.zze = MutableStateFlow2;
    }
}
