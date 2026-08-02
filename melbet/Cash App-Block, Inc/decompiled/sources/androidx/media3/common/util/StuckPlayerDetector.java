package androidx.media3.common.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraComponentImpl;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraUpdateException;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.PlaybackInfo;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.datadog.trace.core.util.Matchers;
import com.fillr.browsersdk.FillrAuthenticationStore;
import com.fillr.n;
import com.google.android.gms.internal.measurement.zzacb;
import com.google.android.gms.internal.measurement.zzacz;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzadq;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzafj;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzru;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.android.gms.internal.measurement.zzsm;
import com.google.android.gms.internal.measurement.zzsx;
import com.google.android.gms.internal.measurement.zztw;
import com.google.android.gms.internal.measurement.zzub;
import com.google.android.gms.internal.measurement.zzvd;
import com.google.android.gms.internal.measurement.zzwi;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.internal.measurement.zzzm;
import com.google.android.gms.internal.mlkit_genai_prompt.zznv;
import com.google.common.base.Present;
import com.google.common.math.DoubleUtils;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SequentialExecutor;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzd;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.autofillweb.api.AutofillWebManager;
import com.squareup.cash.autofillweb.real.CashFillJavascriptInterface;
import com.squareup.cash.autofillweb.real.CashFillWebManager$$ExternalSyntheticLambda0;
import com.squareup.cash.autofillweb.real.CashFillWebManager$1;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.capability.BitcoinCapability;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.statsandsettings.BitcoinSettingsWidgetPresenter$WhenMappings;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonDisplayType;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.transaction.RealCryptoTransactionActionManager;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.RealCryptoAnalytics;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinWithdrawalScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateBitcoinWithdrawalScenarioPlan$onFailure$1;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateBitcoinWithdrawalScenarioPlan$onSuccess$1;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinSymbolDisplaySetting;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinBtcxStablecoin;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.MarketCapabilityAvailability;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.backend.api.PlaybackState;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sharesheet.ShareableAssetsManager$DownloadedImage;
import com.squareup.cash.stablecoin.capability.api.StablecoinCapability;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.ui.TextControllerKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking$performSignup$1;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$TransitionData;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.savings.SavingsElement;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class StuckPlayerDetector implements AutofillWebManager, BitcoinHomeWidgetPresenter, ScenarioPlan, LinkSignupHandler, WorkflowWorker {
    public final /* synthetic */ int $r8$classId;
    public Object callback;
    public Object clock;
    public Object handler;
    public Object period;
    public Object player;
    public Object playerListener;
    public Object stuckBufferingDetector;
    public Object stuckPlayingDetector;
    public Object stuckPlayingNotEndingDetector;
    public Object stuckSuppressedDetector;

    public final class StuckBufferingDetector {
        public int adGroupIndex;
        public int adIndexInAdGroup;
        public long bufferedDurationInOtherPeriodsMs;
        public long bufferedPositionInPeriodMs;
        public boolean isBuffering;
        public Object periodUid;
        public long startRealtimeMs;
        public final int stuckBufferingTimeoutMs;

        public StuckBufferingDetector(int i) {
            this.stuckBufferingTimeoutMs = i;
        }

        public final void update() {
            long contentBufferedPosition;
            if (((ExoPlayerImpl) StuckPlayerDetector.this.player).getPlaybackState() != 2 || !((ExoPlayerImpl) StuckPlayerDetector.this.player).getPlayWhenReady() || ((ExoPlayerImpl) StuckPlayerDetector.this.player).getPlaybackSuppressionReason() != 0) {
                if (this.isBuffering) {
                    ((SystemHandlerWrapper) StuckPlayerDetector.this.handler).removeMessages(1);
                }
                this.isBuffering = false;
                return;
            }
            Timeline currentTimeline = ((ExoPlayerImpl) StuckPlayerDetector.this.player).getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(((ExoPlayerImpl) StuckPlayerDetector.this.player).getCurrentPeriodIndex());
            int currentAdGroupIndex = ((ExoPlayerImpl) StuckPlayerDetector.this.player).getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = ((ExoPlayerImpl) StuckPlayerDetector.this.player).getCurrentAdIndexInAdGroup();
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) StuckPlayerDetector.this.player;
            exoPlayerImpl.verifyApplicationThread();
            if (exoPlayerImpl.isPlayingAd()) {
                PlaybackInfo playbackInfo = exoPlayerImpl.playbackInfo;
                contentBufferedPosition = playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId) ? Util.usToMs(exoPlayerImpl.playbackInfo.bufferedPositionUs) : exoPlayerImpl.getDuration();
            } else {
                contentBufferedPosition = exoPlayerImpl.getContentBufferedPosition();
            }
            long max = Math.max(0L, contentBufferedPosition - ((ExoPlayerImpl) StuckPlayerDetector.this.player).getCurrentPosition());
            ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) StuckPlayerDetector.this.player;
            exoPlayerImpl2.verifyApplicationThread();
            long max2 = Math.max(0L, Util.usToMs(exoPlayerImpl2.playbackInfo.totalBufferedDurationUs) - max);
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                contentBufferedPosition -= Util.usToMs(currentTimeline.getPeriodByUid(uidOfPeriod, (Timeline.Period) StuckPlayerDetector.this.period).positionInWindowUs);
            }
            ((SystemClock) StuckPlayerDetector.this.clock).getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.isBuffering && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && contentBufferedPosition == this.bufferedPositionInPeriodMs && max2 == this.bufferedDurationInOtherPeriodsMs) {
                long j = elapsedRealtime - this.startRealtimeMs;
                int i = this.stuckBufferingTimeoutMs;
                if (j >= i) {
                    ExoPlayerImpl.this.stopInternal(new ExoPlaybackException(2, new StuckPlayerException(1, i), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
                    return;
                }
                return;
            }
            this.isBuffering = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.bufferedPositionInPeriodMs = contentBufferedPosition;
            this.bufferedDurationInOtherPeriodsMs = max2;
            ((SystemHandlerWrapper) StuckPlayerDetector.this.handler).removeMessages(1);
            ((SystemHandlerWrapper) StuckPlayerDetector.this.handler).handler.sendEmptyMessageDelayed(1, this.stuckBufferingTimeoutMs);
        }
    }

    public final class StuckPlayingDetector {
        public int adGroupIndex;
        public int adIndexInAdGroup;
        public long currentPositionInPeriodMs;
        public boolean isPlaying;
        public Object periodUid;
        public long startRealtimeMs;
        public final int stuckPlayingTimeoutMs;

        public StuckPlayingDetector(int i) {
            this.stuckPlayingTimeoutMs = i;
        }

        public final void update() {
            StuckPlayerDetector stuckPlayerDetector = StuckPlayerDetector.this;
            SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) stuckPlayerDetector.handler;
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) stuckPlayerDetector.player;
            if (!exoPlayerImpl.isPlaying()) {
                if (this.isPlaying) {
                    systemHandlerWrapper.removeMessages(2);
                }
                this.isPlaying = false;
                return;
            }
            Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(exoPlayerImpl.getCurrentPeriodIndex());
            int currentAdGroupIndex = exoPlayerImpl.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = exoPlayerImpl.getCurrentAdIndexInAdGroup();
            long currentPosition = exoPlayerImpl.getCurrentPosition();
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                currentPosition -= Util.usToMs(currentTimeline.getPeriodByUid(uidOfPeriod, (Timeline.Period) stuckPlayerDetector.period).positionInWindowUs);
            }
            ((SystemClock) stuckPlayerDetector.clock).getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean z = this.isPlaying;
            int i = this.stuckPlayingTimeoutMs;
            if (z && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && currentPosition == this.currentPositionInPeriodMs) {
                if (elapsedRealtime - this.startRealtimeMs >= i) {
                    ExoPlayerImpl.this.stopInternal(new ExoPlaybackException(2, new StuckPlayerException(2, i), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
                    return;
                }
                return;
            }
            this.isPlaying = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.currentPositionInPeriodMs = currentPosition;
            systemHandlerWrapper.removeMessages(2);
            systemHandlerWrapper.handler.sendEmptyMessageDelayed(2, i);
        }
    }

    public final class StuckPlayingNotEndingDetector {
        public int adGroupIndex;
        public int adIndexInAdGroup;
        public boolean isPlayingAndReachedDuration;
        public Object periodUid;
        public long startRealtimeMs;
        public final int stuckPlayingNotEndingTimeoutMs;

        public StuckPlayingNotEndingDetector(int i) {
            this.stuckPlayingNotEndingTimeoutMs = i;
        }

        public final void update() {
            long duration;
            StuckPlayerDetector stuckPlayerDetector = StuckPlayerDetector.this;
            Timeline.Period period = (Timeline.Period) stuckPlayerDetector.period;
            SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) stuckPlayerDetector.handler;
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) stuckPlayerDetector.player;
            Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(exoPlayerImpl.getCurrentPeriodIndex());
            int currentAdGroupIndex = exoPlayerImpl.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = exoPlayerImpl.getCurrentAdIndexInAdGroup();
            long currentPosition = exoPlayerImpl.getCurrentPosition();
            if (uidOfPeriod == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? exoPlayerImpl.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.getPeriodByUid(uidOfPeriod, period);
                currentPosition -= Util.usToMs(period.positionInWindowUs);
                duration = Util.usToMs(period.durationUs);
            }
            boolean isPlaying = exoPlayerImpl.isPlaying();
            if (!isPlaying || duration == -9223372036854775807L || currentPosition < duration) {
                systemHandlerWrapper.removeMessages(3);
                if (isPlaying && duration != -9223372036854775807L) {
                    exoPlayerImpl.verifyApplicationThread();
                    systemHandlerWrapper.handler.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / exoPlayerImpl.playbackInfo.playbackParameters.speed));
                }
                this.isPlayingAndReachedDuration = false;
                return;
            }
            ((SystemClock) stuckPlayerDetector.clock).getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean z = this.isPlayingAndReachedDuration;
            int i = this.stuckPlayingNotEndingTimeoutMs;
            if (z && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup) {
                if (elapsedRealtime - this.startRealtimeMs >= i) {
                    ExoPlayerImpl.this.stopInternal(new ExoPlaybackException(2, new StuckPlayerException(3, i), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
                    return;
                }
                return;
            }
            this.isPlayingAndReachedDuration = true;
            this.startRealtimeMs = elapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            systemHandlerWrapper.removeMessages(3);
            systemHandlerWrapper.handler.sendEmptyMessageDelayed(3, i);
        }
    }

    public final class StuckSuppressedDetector {
        public boolean isSuppressed;
        public long startRealtimeMs;
        public final int stuckSuppressedTimeoutMs;
        public int suppressionReason;

        public StuckSuppressedDetector(int i) {
            this.stuckSuppressedTimeoutMs = i;
        }

        public final void update() {
            StuckPlayerDetector stuckPlayerDetector = StuckPlayerDetector.this;
            SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) stuckPlayerDetector.handler;
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) stuckPlayerDetector.player;
            int playbackSuppressionReason = exoPlayerImpl.getPlaybackSuppressionReason();
            if (!exoPlayerImpl.getPlayWhenReady() || exoPlayerImpl.getPlaybackState() == 1 || exoPlayerImpl.getPlaybackState() == 4 || playbackSuppressionReason == 0 || playbackSuppressionReason == 1) {
                if (this.isSuppressed) {
                    systemHandlerWrapper.removeMessages(4);
                }
                this.isSuppressed = false;
                return;
            }
            ((SystemClock) stuckPlayerDetector.clock).getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean z = this.isSuppressed;
            int i = this.stuckSuppressedTimeoutMs;
            if (z && this.suppressionReason == playbackSuppressionReason) {
                if (elapsedRealtime - this.startRealtimeMs >= i) {
                    ExoPlayerImpl.this.stopInternal(new ExoPlaybackException(2, new StuckPlayerException(4, i), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
                    return;
                }
                return;
            }
            this.isSuppressed = true;
            this.startRealtimeMs = elapsedRealtime;
            this.suppressionReason = playbackSuppressionReason;
            systemHandlerWrapper.removeMessages(4);
            systemHandlerWrapper.handler.sendEmptyMessageDelayed(4, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.media3.common.util.StuckPlayerDetector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public StuckPlayerDetector(Lazy lazy, Context context, AutoValue_CameraThreadConfig autoValue_CameraThreadConfig, Recorder.AnonymousClass1 anonymousClass1, CameraSelector cameraSelector, Recorder.AnonymousClass1 anonymousClass12, CameraXConfig cameraXConfig) {
        ?? r7;
        this.$r8$classId = 1;
        lazy.getClass();
        context.getClass();
        autoValue_CameraThreadConfig.getClass();
        anonymousClass1.getClass();
        this.player = lazy;
        this.playerListener = cameraSelector;
        this.callback = anonymousClass12;
        this.clock = cameraXConfig;
        this.period = new CameraCoordinatorAdapter((CameraPipeImpl) lazy.getValue(), ((CameraPipeImpl) lazy.getValue()).cameras());
        Lazy lazy2 = LazyKt.lazy(new l2$$ExternalSyntheticLambda7(context, autoValue_CameraThreadConfig, (Object) this, anonymousClass1, 1));
        this.stuckBufferingDetector = lazy2;
        this.stuckPlayingDetector = EmptySet.INSTANCE;
        this.stuckPlayingNotEndingDetector = new Object();
        this.stuckSuppressedDetector = new AtomicBoolean(false);
        ArrayList m92awaitCameraIdsSeavPBo$default = CameraDevicesImpl.m92awaitCameraIdsSeavPBo$default(((DaggerCameraAppComponent$CameraAppComponentImpl) lazy2.getValue()).getCameraDevices());
        if (m92awaitCameraIdsSeavPBo$default != null) {
            r7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(m92awaitCameraIdsSeavPBo$default, 10));
            Iterator it = m92awaitCameraIdsSeavPBo$default.iterator();
            while (it.hasNext()) {
                r7.add(((CameraId) it.next()).value);
            }
        } else {
            r7 = EmptyList.INSTANCE;
        }
        ReadonlySharedFlow readonlySharedFlow = ((CameraPipeImpl) ((Lazy) this.player).getValue()).cameras().m95getCameraBackendSeavPBo().camera2DeviceCache.cameraIds;
        Executor executor = autoValue_CameraThreadConfig.cameraExecutor;
        executor.getClass();
        this.handler = new PipeCameraPresenceSource(readonlySharedFlow, JobKt.CoroutineScope(JobKt.from(executor)), r7, context);
        onCameraIdsUpdated(r7);
    }

    public static final RealShareTargetsManager$TargetPreparationState.FailedToLoad access$assetFailedToLoad(StuckPlayerDetector stuckPlayerDetector, ShareTarget shareTarget, ShareableAssetsManager$DownloadedImage.Failure failure) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) stuckPlayerDetector.stuckSuppressedDetector;
        String title = shareTarget.getTitle();
        Object obj = linkedHashMap.get(title);
        if (obj == null) {
            obj = new LinkedHashSet();
            linkedHashMap.put(title, obj);
        }
        ((LinkedHashSet) obj).add(failure.url);
        return new RealShareTargetsManager$TargetPreparationState.FailedToLoad(shareTarget, failure.failureMessage);
    }

    public static final void access$updatePlaybackState(StuckPlayerDetector stuckPlayerDetector) {
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) ((ExoPlayer) stuckPlayerDetector.player);
        PlaybackState playbackState = exoPlayerImpl.getPlaybackState() == 1 ? PlaybackState.IDLE : exoPlayerImpl.getPlaybackState() == 2 ? PlaybackState.BUFFERING : (exoPlayerImpl.isPlaying() || exoPlayerImpl.getPlaybackState() != 3) ? exoPlayerImpl.isPlaying() ? PlaybackState.PLAYING : PlaybackState.STOPPED : PlaybackState.PAUSED;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) stuckPlayerDetector.handler;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, playbackState);
    }

    public AutoValue_VideoEncoderConfig build() {
        String str = ((String) this.player) == null ? " mimeType" : "";
        if (((Integer) this.playerListener) == null) {
            str = str.concat(" profile");
        }
        if (((Timebase) this.callback) == null) {
            str = str.concat(" inputTimebase");
        }
        if (((android.util.Size) this.clock) == null) {
            str = str.concat(" resolution");
        }
        if (((Integer) this.period) == null) {
            str = str.concat(" colorFormat");
        }
        if (((AutoValue_VideoEncoderDataSpace) this.handler) == null) {
            str = str.concat(" dataSpace");
        }
        if (((Integer) this.stuckBufferingDetector) == null) {
            str = str.concat(" captureFrameRate");
        }
        if (((Integer) this.stuckPlayingDetector) == null) {
            str = str.concat(" encodeFrameRate");
        }
        if (((Integer) this.stuckPlayingNotEndingDetector) == null) {
            str = str.concat(" IFrameInterval");
        }
        if (((Integer) this.stuckSuppressedDetector) == null) {
            str = str.concat(" bitrate");
        }
        if (str.isEmpty()) {
            return new AutoValue_VideoEncoderConfig((String) this.player, ((Integer) this.playerListener).intValue(), (Timebase) this.callback, (android.util.Size) this.clock, ((Integer) this.period).intValue(), (AutoValue_VideoEncoderDataSpace) this.handler, ((Integer) this.stuckBufferingDetector).intValue(), ((Integer) this.stuckPlayingDetector).intValue(), ((Integer) this.stuckPlayingNotEndingDetector).intValue(), ((Integer) this.stuckSuppressedDetector).intValue());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
        return null;
    }

    public LinkedHashSet calculateAvailableCameraIds(List list) {
        String str;
        Lazy lazy = (Lazy) this.stuckBufferingDetector;
        DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl = (DaggerCameraAppComponent$CameraAppComponentImpl) lazy.getValue();
        CameraSelector cameraSelector = (CameraSelector) this.playerListener;
        List<String> list2 = CollectionsKt.toList(list);
        Recorder.AnonymousClass1 anonymousClass1 = (Recorder.AnonymousClass1) this.callback;
        daggerCameraAppComponent$CameraAppComponentImpl.getClass();
        list2.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraAppComponentImpl.getCameraDevices();
            if (cameraSelector != null) {
                try {
                    str = Section.Header.decideSkippedCameraIdByHeuristic(cameraDevices, cameraSelector.getLensFacing());
                } catch (IllegalStateException e) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        android.util.Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list2) {
                    if (!Intrinsics.areEqual(str2, str)) {
                        DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = daggerCameraAppComponent$CameraAppComponentImpl.cameraAppComponentImpl;
                        CameraId.m45constructorimpl(str2);
                        CameraInfoInternal cameraInfoInternal = ((CameraInternal) new DaggerCameraAppComponent$CameraComponentImpl(daggerCameraAppComponent$CameraAppComponentImpl2, new n.a(str2, 1), anonymousClass1).cameraInternalAdapterProvider.get()).getCameraInfoInternal();
                        cameraInfoInternal.getClass();
                        arrayList2.add(cameraInfoInternal);
                    }
                }
                for (CameraInfo cameraInfo : cameraSelector.filter(arrayList2)) {
                    cameraInfo.getClass();
                    String cameraId = ((CameraInfoInternal) cameraInfo).getCameraId();
                    cameraId.getClass();
                    arrayList.add(cameraId);
                }
                list2 = arrayList;
            }
            CameraDevicesImpl cameraDevices2 = ((DaggerCameraAppComponent$CameraAppComponentImpl) lazy.getValue()).getCameraDevices();
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : list2) {
                if (Intrinsics.areEqual(str3, "0") || Intrinsics.areEqual(str3, "1")) {
                    arrayList3.add(str3);
                } else if (SavingsElement.Element.isBackwardCompatible(cameraDevices2, str3)) {
                    arrayList3.add(str3);
                } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    android.util.Log.d("CXCP", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                android.util.Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new InitializationException(e2);
        }
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        ClientScenario clientScenario = (ClientScenario) this.stuckPlayingNotEndingDetector;
        return FlowStarter.startFlow$default((FlowStarter) this.playerListener, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.handler, null, clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getAddress1FieldDetected() {
        return (SharedFlowImpl) this.stuckBufferingDetector;
    }

    public Set getAvailableCameraIds() {
        synchronized (this.stuckPlayingNotEndingDetector) {
            if (((AtomicBoolean) this.stuckSuppressedDetector).get()) {
                return EmptySet.INSTANCE;
            }
            return new LinkedHashSet((Set) this.stuckPlayingDetector);
        }
    }

    public CameraInternal getCamera(String str) {
        str.getClass();
        if (((AtomicBoolean) this.stuckSuppressedDetector).get()) {
            throw new CameraUpdateException("CameraFactory has been shut down.");
        }
        DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl = ((DaggerCameraAppComponent$CameraAppComponentImpl) ((Lazy) this.stuckBufferingDetector).getValue()).cameraAppComponentImpl;
        CameraId.m45constructorimpl(str);
        return (CameraInternal) new DaggerCameraAppComponent$CameraComponentImpl(daggerCameraAppComponent$CameraAppComponentImpl, new n.a(str, 1), (Recorder.AnonymousClass1) this.callback).cameraInternalAdapterProvider.get();
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getCardFieldDetected() {
        return (SharedFlowImpl) this.clock;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getCurrentFocusedField() {
        return (SharedFlowImpl) this.stuckPlayingNotEndingDetector;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getInfoFieldsDetected() {
        return (SharedFlowImpl) this.period;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getLastCapturedValueInfo() {
        return (SharedFlowImpl) this.stuckPlayingDetector;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public Flow getLoggingFieldsDetected() {
        return (SharedFlowImpl) this.handler;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void handleOnPageFinished(WebView webView) {
        webView.getClass();
        webView.evaluateJavascript(((RealCashFillJsStore) this.player).javascript, new CashFillWebManager$$ExternalSyntheticLambda0(0));
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void handleOnPageStarted(WebView webView, String str) {
        webView.getClass();
        str.getClass();
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public WebResourceResponse handleShouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void handleSignupFailure(NetworkingLinkSignupState networkingLinkSignupState, Throwable th) {
        networkingLinkSignupState.getClass();
        th.getClass();
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) this.handler;
        String str = networkingLinkSignupState.validEmail;
        str.getClass();
        String str2 = networkingLinkSignupState.validPhone;
        Object invoke = networkingLinkSignupState.payload.invoke();
        invoke.getClass();
        Throwable attestationErrorIfApplicable = FillrAuthenticationStore.toAttestationErrorIfApplicable(th, new ElementsSessionContext.PrefillDetails(str, str2, ((NetworkingLinkSignupState.Payload) invoke).phoneController.getCountryCode()));
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) this.stuckSuppressedDetector;
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
        Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Error saving account to Link", attestationErrorIfApplicable, logger$Companion$NOOP_LOGGER$1, pane);
        NavigationManagerImpl.tryNavigateTo$default((NavigationManagerImpl) this.stuckBufferingDetector, Destination.invoke$default(Destination.Success.INSTANCE, pane), null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v55, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        RealCurrencyConverter realCurrencyConverter;
        Money money;
        boolean z;
        Continuation continuation;
        boolean z2;
        Object balanceLoaded;
        String str;
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel = null;
        switch (i2) {
            case 5:
                GapComposer gapComposer2 = gapComposer;
                gapComposer2.startReplaceGroup(318138586);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(new BitcoinBalanceWidgetViewModel(null, null, null, null));
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 20);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Flow flow2 = (Flow) rememberedValue2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState2 = (MutableState) rememberedValue3;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealJurisdictionConfigManager) this.player).select(), 9);
                    gapComposer2.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue4 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer2, 48, 2);
                CurrencyCode currencyCode = (CurrencyCode) collectAsState.getValue();
                boolean changed = gapComposer2.changed(currencyCode == null ? -1 : currencyCode.ordinal());
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    CurrencyCode currencyCode2 = (CurrencyCode) collectAsState.getValue();
                    rememberedValue5 = currencyCode2 != null ? ((RealCurrencyConverter.Factory) ((CurrencyConverter$Factory) this.period)).get(currencyCode2) : null;
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                RealCurrencyConverter realCurrencyConverter2 = (RealCurrencyConverter) rememberedValue5;
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = ((RealDependentCustomerTokenRepository) this.stuckPlayingDetector).getCustomerToken();
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                String str2 = (String) rememberedValue6;
                CurrencyCode currencyCode3 = (CurrencyCode) collectAsState.getValue();
                long j = 0L;
                gapComposer2.startReplaceGroup(1837196802);
                if (str2 != null) {
                    gapComposer2.startReplaceGroup(1161819885);
                    RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) this.stuckBufferingDetector;
                    gapComposer2.startReplaceGroup(-475025669);
                    realCurrencyConverter = realCurrencyConverter2;
                    TargetEntityManager$TargetEntityValue syncValues = realDependentBalancesStore.targetEntityManager.syncValues(realDependentBalancesStore.entityManagerEvent, str2, CollectionsKt__CollectionsKt.listOf((Object[]) new DomainType[]{DomainType.BALANCE_SNAPSHOT, DomainType.SAVINGS_FOLDER, DomainType.INVEST_STATE, DomainType.SPONSORSHIP_CRYPTO_AUTHORIZATION}), gapComposer2, 432);
                    gapComposer2 = gapComposer2;
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$12 = new CardModelView$cardHeat$$inlined$map$1(realDependentBalancesStore.jurisdictionConfigManager.select(), 28);
                        gapComposer2.updateRememberedValue(cardModelView$cardHeat$$inlined$map$12);
                        rememberedValue7 = cardModelView$cardHeat$$inlined$map$12;
                    }
                    MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer2, 48, 2);
                    DependentBalanceName dependentBalanceName = DependentBalanceName.Cash;
                    boolean areEqual = Intrinsics.areEqual(syncValues, TargetEntityManager$TargetEntityValue.Failed.INSTANCE);
                    DependentBalance.LoadingState.BalanceFailedToLoad balanceFailedToLoad = DependentBalance.LoadingState.BalanceFailedToLoad.INSTANCE;
                    DependentBalance.LoadingState.BalanceLoading balanceLoading = DependentBalance.LoadingState.BalanceLoading.INSTANCE;
                    if (areEqual) {
                        balanceLoaded = balanceFailedToLoad;
                    } else {
                        if (!Intrinsics.areEqual(syncValues, TargetEntityManager$TargetEntityValue.Loading.INSTANCE)) {
                            if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            CurrencyCode currencyCode4 = (CurrencyCode) collectAsState2.getValue();
                            if (currencyCode4 != null) {
                                Money findBitcoinBalance = RealDependentBalancesStore.findBitcoinBalance(((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues);
                                if (findBitcoinBalance == null) {
                                    findBitcoinBalance = zznv.access$toZeroMoney(currencyCode4);
                                }
                                balanceLoaded = new DependentBalance.LoadingState.BalanceLoaded(findBitcoinBalance);
                            }
                        }
                        balanceLoaded = balanceLoading;
                    }
                    gapComposer2.end(false);
                    if (balanceLoaded instanceof DependentBalance.LoadingState.BalanceLoaded) {
                        money = ((DependentBalance.LoadingState.BalanceLoaded) balanceLoaded).amount;
                    } else {
                        if (!balanceLoaded.equals(balanceFailedToLoad) && !balanceLoaded.equals(balanceLoading)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(balanceLoaded, "This state should not be possible here: ");
                            return null;
                        }
                        money = new Money((Long) j, currencyCode3, 4);
                    }
                    z = false;
                    gapComposer2.end(false);
                } else {
                    realCurrencyConverter = realCurrencyConverter2;
                    gapComposer2.startReplaceGroup(1162311359);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = ((RealCryptoBalanceRepo) this.callback).getBitcoinBalance();
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer2, 48, 2).getValue();
                    money = cryptoBalance$BitcoinBalance != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance) : new Money((Long) j, currencyCode3, 4);
                    z = false;
                    gapComposer2.end(false);
                }
                gapComposer2.end(z);
                Money money2 = money;
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = ViewShowRenderingKt.displayUnitProto((RealBitcoinProfileRepo) this.handler);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue9, BitcoinDisplayUnits.BITCOIN, null, gapComposer2, 48, 2);
                GapComposer gapComposer3 = gapComposer2;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer3.changedInstance(this);
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new MLKitTitleGenerator$prepareModel$1(this, mutableState2, null, 24);
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue10);
                Updater.LaunchedEffect(gapComposer3, flow2, new AndroidSecureStore$read$2(flow2, (Continuation) null, mutableState2, collectAsState, this, 11));
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    continuation = null;
                    rememberedValue11 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(rememberedValue11);
                } else {
                    continuation = null;
                }
                MutableState mutableState3 = (MutableState) rememberedValue11;
                if (realCurrencyConverter != null) {
                    gapComposer3.startReplaceGroup(-1383927846);
                    Updater.LaunchedEffect(realCurrencyConverter, money2, new BenefitsHubPresenter$models$1$1(realCurrencyConverter, money2, continuation, mutableState3), gapComposer3);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1383879796);
                    gapComposer3.end(false);
                }
                BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) collectAsState3.getValue();
                Money money3 = (Money) mutableState3.getValue();
                Boolean bool = (Boolean) mutableState2.getValue();
                bool.booleanValue();
                if (bitcoinDisplayUnits == null || money3 == null) {
                    z2 = false;
                    gapComposer3.startReplaceGroup(-1331751381);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1331814807);
                    Updater.LaunchedEffect(new Object[]{money2, bitcoinDisplayUnits, money3, bool}, new GLSceneScope$FrameRenderer$5$1$1$1$1(money2, bitcoinDisplayUnits, money3, bool, null, this, mutableState), gapComposer3);
                    z2 = false;
                    gapComposer3.end(false);
                }
                BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel = (BitcoinBalanceWidgetViewModel) mutableState.getValue();
                gapComposer3.end(z2);
                return bitcoinBalanceWidgetViewModel;
            case 6:
                RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) this.clock;
                BitcoinLimitsProvider bitcoinLimitsProvider = (BitcoinLimitsProvider) this.player;
                RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) this.stuckBufferingDetector;
                gapComposer.startReplaceGroup(-836796580);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = ((RealBitcoinSponsoredStateRepo) this.stuckPlayingDetector).sponsorshipStateProvider.isSponsored();
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                Flow flow3 = (Flow) rememberedValue12;
                Boolean bool2 = Boolean.FALSE;
                MutableState collectAsState4 = Updater.collectAsState(flow3, bool2, null, gapComposer, 48, 2);
                boolean isAvailable = realBitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN_BUY_MARKET);
                boolean isAvailable2 = realBitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN_SELL_MARKET);
                boolean booleanValue = ((Boolean) collectAsState4.getValue()).booleanValue();
                RealStablecoinCapabilityHelper realStablecoinCapabilityHelper = (RealStablecoinCapabilityHelper) this.stuckPlayingNotEndingDetector;
                StablecoinCapability stablecoinCapability = StablecoinCapability.STABLECOIN_TO_BITCOIN_MARKET_CONVERT;
                FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options featureFlag$EnabledDisabledUnassignedFeatureFlag$Options = (FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) realStablecoinCapabilityHelper.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinBtcxStablecoin.INSTANCE);
                MarketCapabilityAvailability currentAvailability = realStablecoinCapabilityHelper.marketCapabilitiesManager.currentAvailability(RealStablecoinCapabilityHelper.mapToMarketCapability(stablecoinCapability));
                boolean z3 = featureFlag$EnabledDisabledUnassignedFeatureFlag$Options.enabled() && currentAvailability != null && currentAvailability.isAvailable();
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 22);
                    gapComposer.updateRememberedValue(rememberedValue13);
                }
                Flow flow4 = (Flow) rememberedValue13;
                Object rememberedValue14 = gapComposer.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = bitcoinLimitsProvider.getBuyLimit();
                    gapComposer.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue14, null, null, gapComposer, 48, 2);
                Object rememberedValue15 = gapComposer.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = bitcoinLimitsProvider.getSellLimit();
                    gapComposer.updateRememberedValue(rememberedValue15);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue15, null, null, gapComposer, 48, 2);
                MutableState collectAsState7 = Updater.collectAsState(((RealCryptoBalanceRepo) this.period).getStablecoinBalance(), null, null, gapComposer, 48, 2);
                boolean changed2 = gapComposer.changed((CryptoBalance$StablecoinBalance) collectAsState7.getValue());
                Object rememberedValue16 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue16 == neverEqualPolicy) {
                    CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) collectAsState7.getValue();
                    rememberedValue16 = Boolean.valueOf((cryptoBalance$StablecoinBalance != null ? cryptoBalance$StablecoinBalance.amount : 0L) > 0);
                    gapComposer.updateRememberedValue(rememberedValue16);
                }
                boolean booleanValue2 = ((Boolean) rememberedValue16).booleanValue();
                Object rememberedValue17 = gapComposer.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = FlowKt.distinctUntilChanged(new AppLockMonitor$special$$inlined$map$2(Countries.asMoney(realBitcoinActivityProvider.cryptoBalanceRepo.getBitcoinBalance()), 6));
                    gapComposer.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue17, bool2, null, gapComposer, 48, 2);
                Object rememberedValue18 = gapComposer.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = realBitcoinActivityProvider.hasBitcoinActivity();
                    gapComposer.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue18, null, null, gapComposer, 48, 2);
                Updater.LaunchedEffect(gapComposer, flow4, new EngineInterceptor$intercept$2(15, collectAsState7, flow4, this, screenNavigator, collectAsState5, collectAsState6, (Continuation) null));
                boolean booleanValue3 = ((Boolean) collectAsState8.getValue()).booleanValue();
                Boolean bool3 = (Boolean) collectAsState9.getValue();
                AndroidStringManager androidStringManager = (AndroidStringManager) this.handler;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (isAvailable) {
                    createListBuilder.add(new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Text(androidStringManager.get(Intrinsics.areEqual(bool3, Boolean.TRUE) ? R.string.buy_label : R.string.buy_bitcoin)), BitcoinTradeButtonsWidgetViewEvent.Buy.INSTANCE));
                }
                Boolean bool4 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool3, bool4)) {
                    if (isAvailable2 && booleanValue3) {
                        createListBuilder.add(new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Text(androidStringManager.get(R.string.sell_label)), BitcoinTradeButtonsWidgetViewEvent.Sell.INSTANCE));
                    }
                    if (!booleanValue) {
                        createListBuilder.add(new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Drawable(androidStringManager.get(R.string.transfer)), BitcoinTradeButtonsWidgetViewEvent.Transfer.INSTANCE));
                    }
                }
                if (z3 && Intrinsics.areEqual(bool3, bool4) && booleanValue2) {
                    createListBuilder.add(new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Text(androidStringManager.get(R.string.get_bitcoin_label)), BitcoinTradeButtonsWidgetViewEvent.Convert.INSTANCE));
                }
                BitcoinTradeButtonsWidgetViewModel bitcoinTradeButtonsWidgetViewModel = new BitcoinTradeButtonsWidgetViewModel(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                gapComposer.end(false);
                return bitcoinTradeButtonsWidgetViewModel;
            default:
                gapComposer.startReplaceGroup(278789126);
                Object rememberedValue19 = gapComposer.rememberedValue();
                if (rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new CardModelView$iconTexture$$inlined$map$1(flow, 8);
                    gapComposer.updateRememberedValue(rememberedValue19);
                }
                Flow flow5 = (Flow) rememberedValue19;
                Object rememberedValue20 = gapComposer.rememberedValue();
                if (rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = (Flow) this.stuckPlayingDetector;
                    gapComposer.updateRememberedValue(rememberedValue20);
                }
                Boolean bool5 = Boolean.FALSE;
                MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue20, bool5, null, gapComposer, 48, 2);
                Object rememberedValue21 = gapComposer.rememberedValue();
                if (rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = (ChannelFlowTransformLatest) this.stuckBufferingDetector;
                    gapComposer.updateRememberedValue(rememberedValue21);
                }
                MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer, 48, 2);
                Object rememberedValue22 = gapComposer.rememberedValue();
                if (rememberedValue22 == neverEqualPolicy) {
                    rememberedValue22 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) this.stuckPlayingNotEndingDetector;
                    gapComposer.updateRememberedValue(rememberedValue22);
                }
                MutableState collectAsState12 = Updater.collectAsState((Flow) rememberedValue22, null, null, gapComposer, 48, 2);
                Object rememberedValue23 = gapComposer.rememberedValue();
                if (rememberedValue23 == neverEqualPolicy) {
                    rememberedValue23 = (Flow) this.stuckSuppressedDetector;
                    gapComposer.updateRememberedValue(rememberedValue23);
                }
                MutableState collectAsState13 = Updater.collectAsState((Flow) rememberedValue23, bool5, null, gapComposer, 48, 2);
                Object rememberedValue24 = gapComposer.rememberedValue();
                if (rememberedValue24 == neverEqualPolicy) {
                    rememberedValue24 = ((RealProfileNotificationsRepository) this.callback).getNotificationSettings();
                    gapComposer.updateRememberedValue(rememberedValue24);
                }
                MutableState collectAsState14 = Updater.collectAsState((Flow) rememberedValue24, null, null, gapComposer, 48, 2);
                ?? r2 = 0;
                r2 = 0;
                Updater.LaunchedEffect(gapComposer, flow5, new SetNamePresenter$models$1$1$1(flow5, (Continuation) r2, this, screenNavigator, 1));
                boolean booleanValue4 = ((Boolean) collectAsState10.getValue()).booleanValue();
                Money money4 = (Money) collectAsState11.getValue();
                BitcoinDisplayUnits bitcoinDisplayUnits2 = (BitcoinDisplayUnits) collectAsState12.getValue();
                boolean booleanValue5 = ((Boolean) collectAsState13.getValue()).booleanValue();
                UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) collectAsState14.getValue();
                List list = uiNotificationSettings != null ? uiNotificationSettings.category_preferences : null;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) this.player;
                if (money4 != null) {
                    ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (booleanValue4) {
                        if (bitcoinDisplayUnits2 != null) {
                            String str3 = androidStringManager2.get(R.string.display_currency);
                            int i3 = BitcoinSettingsWidgetPresenter$WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits2.ordinal()];
                            if (i3 == 1) {
                                str = androidStringManager2.get(R.string.bitcoin_settings_section_btc_units_name);
                            } else if (i3 == 2) {
                                str = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.period)).peekCurrentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled() ? androidStringManager2.get(R.string.bitcoin_settings_section_bitcoin_symbol_name) : androidStringManager2.get(R.string.bitcoin_settings_section_satoshis_units_name);
                            } else {
                                if (i3 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return bitcoinHomeWidgetViewModel;
                                }
                                str = androidStringManager2.get(R.string.bitcoin_settings_section_bitcoin_symbol_name);
                            }
                            createListBuilder2.add(new BitcoinSettingsWidgetOption.DisplayCurrency(str3, str));
                        }
                        if (list != null) {
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((UiCategoryNotificationPreference) it.next()).category == NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS) {
                                            createListBuilder2.add(new BitcoinSettingsWidgetOption.PriceAlerts(androidStringManager2.get(R.string.price_alerts)));
                                        }
                                    }
                                }
                            }
                        }
                        if (booleanValue5) {
                            createListBuilder2.add(new BitcoinSettingsWidgetOption.Limits(androidStringManager2.get(R.string.limits)));
                        }
                    } else {
                        createListBuilder2.add(new BitcoinSettingsWidgetOption.PricePerBitcoin(androidStringManager2.get(R.string.price_per_bitcoin), ((MoneyFormatter) this.handler).format(money4)));
                    }
                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                    if (!build.isEmpty()) {
                        r2 = new BitcoinSettingsWidgetViewModel(booleanValue4, build);
                    }
                }
                bitcoinHomeWidgetViewModel = r2;
                gapComposer.end(false);
                return bitcoinHomeWidgetViewModel;
        }
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void navigateToVerification() {
        NavigationManagerImpl.tryNavigateTo$default((NavigationManagerImpl) this.stuckBufferingDetector, Destination.invoke$default(Destination.NetworkingSaveToLinkVerification.INSTANCE, FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE), null, 6);
    }

    public void onCameraIdsUpdated(List list) {
        list.getClass();
        if (((AtomicBoolean) this.stuckSuppressedDetector).get()) {
            return;
        }
        LinkedHashSet calculateAvailableCameraIds = calculateAvailableCameraIds(list);
        synchronized (this.stuckPlayingNotEndingDetector) {
            try {
                if (((AtomicBoolean) this.stuckSuppressedDetector).get()) {
                    return;
                }
                if (Intrinsics.areEqual((Set) this.stuckPlayingDetector, calculateAvailableCameraIds)) {
                    return;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    android.util.Log.d("CXCP", "Updated available camera list: " + ((Set) this.stuckPlayingDetector) + " -> " + calculateAvailableCameraIds);
                }
                this.stuckPlayingDetector = calculateAvailableCameraIds;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onFailure(BlockersData blockersData, Continuation continuation) {
        InitiateBitcoinWithdrawalScenarioPlan$onFailure$1 initiateBitcoinWithdrawalScenarioPlan$onFailure$1;
        int i;
        if (continuation instanceof InitiateBitcoinWithdrawalScenarioPlan$onFailure$1) {
            initiateBitcoinWithdrawalScenarioPlan$onFailure$1 = (InitiateBitcoinWithdrawalScenarioPlan$onFailure$1) continuation;
            int i2 = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateBitcoinWithdrawalScenarioPlan$onFailure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoTransactionActionManager realCryptoTransactionActionManager = (RealCryptoTransactionActionManager) this.period;
                    String str = (String) this.stuckSuppressedDetector;
                    str.getClass();
                    initiateBitcoinWithdrawalScenarioPlan$onFailure$1.L$0 = blockersData;
                    initiateBitcoinWithdrawalScenarioPlan$onFailure$1.label = 1;
                    if (realCryptoTransactionActionManager.onTransactionInitiated(str, initiateBitcoinWithdrawalScenarioPlan$onFailure$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealCryptoAnalytics) this.callback).trackSubmitPayment((CryptoPayment) this.stuckBufferingDetector, false, blockersData.flowToken, Boolean.valueOf(((String) this.stuckPlayingDetector) != null));
                return Unit.INSTANCE;
            }
        }
        initiateBitcoinWithdrawalScenarioPlan$onFailure$1 = new InitiateBitcoinWithdrawalScenarioPlan$onFailure$1(this, (ContinuationImpl) continuation);
        Object obj2 = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateBitcoinWithdrawalScenarioPlan$onFailure$1.label;
        if (i != 0) {
        }
        ((RealCryptoAnalytics) this.callback).trackSubmitPayment((CryptoPayment) this.stuckBufferingDetector, false, blockersData.flowToken, Boolean.valueOf(((String) this.stuckPlayingDetector) != null));
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onSuccess(BlockersData blockersData, Continuation continuation) {
        InitiateBitcoinWithdrawalScenarioPlan$onSuccess$1 initiateBitcoinWithdrawalScenarioPlan$onSuccess$1;
        int i;
        if (continuation instanceof InitiateBitcoinWithdrawalScenarioPlan$onSuccess$1) {
            initiateBitcoinWithdrawalScenarioPlan$onSuccess$1 = (InitiateBitcoinWithdrawalScenarioPlan$onSuccess$1) continuation;
            int i2 = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoTransactionActionManager realCryptoTransactionActionManager = (RealCryptoTransactionActionManager) this.period;
                    String str = (String) this.stuckSuppressedDetector;
                    str.getClass();
                    initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.L$0 = blockersData;
                    initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.label = 1;
                    if (realCryptoTransactionActionManager.onTransactionInitiated(str, initiateBitcoinWithdrawalScenarioPlan$onSuccess$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealCryptoAnalytics) this.callback).trackSubmitPayment((CryptoPayment) this.stuckBufferingDetector, true, blockersData.flowToken, Boolean.valueOf(((String) this.stuckPlayingDetector) == null));
                return Unit.INSTANCE;
            }
        }
        initiateBitcoinWithdrawalScenarioPlan$onSuccess$1 = new InitiateBitcoinWithdrawalScenarioPlan$onSuccess$1(this, (ContinuationImpl) continuation);
        Object obj2 = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateBitcoinWithdrawalScenarioPlan$onSuccess$1.label;
        if (i != 0) {
        }
        ((RealCryptoAnalytics) this.callback).trackSubmitPayment((CryptoPayment) this.stuckBufferingDetector, true, blockersData.flowToken, Boolean.valueOf(((String) this.stuckPlayingDetector) == null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0183, code lost:
    
        if (r1 != r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c9, code lost:
    
        if (r1 == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        if (r1 == r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum performSignup(NetworkingLinkSignupState networkingLinkSignupState, ContinuationImpl continuationImpl) {
        LinkSignupHandlerForNetworking$performSignup$1 linkSignupHandlerForNetworking$performSignup$1;
        LinkSignupHandlerForNetworking$performSignup$1 linkSignupHandlerForNetworking$performSignup$12;
        NetworkingLinkSignupState networkingLinkSignupState2;
        List list;
        NetworkingLinkSignupState networkingLinkSignupState3;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        PhoneNumberController phoneNumberController;
        boolean z;
        Object invoke;
        List list2;
        Object performSignUp;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        List list3;
        LinkBrand linkBrand;
        SaveAccountToLink saveAccountToLink = (SaveAccountToLink) this.period;
        if (continuationImpl instanceof LinkSignupHandlerForNetworking$performSignup$1) {
            linkSignupHandlerForNetworking$performSignup$1 = (LinkSignupHandlerForNetworking$performSignup$1) continuationImpl;
            int i = linkSignupHandlerForNetworking$performSignup$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                linkSignupHandlerForNetworking$performSignup$1.label = i - PKIFailureInfo.systemUnavail;
                linkSignupHandlerForNetworking$performSignup$12 = linkSignupHandlerForNetworking$performSignup$1;
                Object obj = linkSignupHandlerForNetworking$performSignup$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                Continuation continuation = null;
                switch (linkSignupHandlerForNetworking$performSignup$12.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        ((FinancialConnectionsAnalyticsTrackerImpl) this.handler).track(new FinancialConnectionsAnalyticsEvent.Click("click.save_to_link", FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE));
                        GetCachedAccounts getCachedAccounts = (GetCachedAccounts) this.callback;
                        networkingLinkSignupState2 = networkingLinkSignupState;
                        linkSignupHandlerForNetworking$performSignup$12.L$0 = networkingLinkSignupState2;
                        linkSignupHandlerForNetworking$performSignup$12.label = 1;
                        obj = getCachedAccounts.invoke(linkSignupHandlerForNetworking$performSignup$12);
                        break;
                    case 1:
                        networkingLinkSignupState2 = linkSignupHandlerForNetworking$performSignup$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        List list4 = (List) obj;
                        GetOrFetchSync getOrFetchSync = (GetOrFetchSync) this.playerListener;
                        linkSignupHandlerForNetworking$performSignup$12.L$0 = networkingLinkSignupState2;
                        linkSignupHandlerForNetworking$performSignup$12.L$1 = list4;
                        linkSignupHandlerForNetworking$performSignup$12.label = 2;
                        Object invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, linkSignupHandlerForNetworking$performSignup$12, 3);
                        if (invoke$default != coroutineSingletons) {
                            list = list4;
                            networkingLinkSignupState3 = networkingLinkSignupState2;
                            obj = invoke$default;
                            financialConnectionsSessionManifest = ((SynchronizeSessionResponse) obj).manifest;
                            Async async = networkingLinkSignupState3.payload;
                            String str = networkingLinkSignupState3.validPhone;
                            String str2 = networkingLinkSignupState3.validEmail;
                            Object invoke2 = async.invoke();
                            invoke2.getClass();
                            phoneNumberController = ((NetworkingLinkSignupState.Payload) invoke2).phoneController;
                            if (!networkingLinkSignupState3.getValid()) {
                                if (!financialConnectionsSessionManifest.appVerificationEnabled) {
                                    String countryCode = phoneNumberController.getCountryCode();
                                    str2.getClass();
                                    str.getClass();
                                    z = financialConnectionsSessionManifest.paymentMethodType == null;
                                    LinkBrand invoke3 = ((RealCurrentLinkBrand) this.stuckPlayingDetector).invoke();
                                    linkSignupHandlerForNetworking$performSignup$12.L$0 = null;
                                    linkSignupHandlerForNetworking$performSignup$12.L$1 = null;
                                    linkSignupHandlerForNetworking$performSignup$12.L$2 = null;
                                    linkSignupHandlerForNetworking$performSignup$12.L$3 = null;
                                    linkSignupHandlerForNetworking$performSignup$12.label = 6;
                                    saveAccountToLink.getClass();
                                    obj = saveAccountToLink.ensureReadyAccounts(z, list, invoke3, new WorkflowLayout$start$1(saveAccountToLink, str2, countryCode, str, (Continuation) null, 26), linkSignupHandlerForNetworking$performSignup$12);
                                    break;
                                } else {
                                    RequestIntegrityToken requestIntegrityToken = (RequestIntegrityToken) this.clock;
                                    FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.SIGNUP;
                                    FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
                                    linkSignupHandlerForNetworking$performSignup$12.L$0 = networkingLinkSignupState3;
                                    linkSignupHandlerForNetworking$performSignup$12.L$1 = list;
                                    linkSignupHandlerForNetworking$performSignup$12.L$2 = financialConnectionsSessionManifest;
                                    linkSignupHandlerForNetworking$performSignup$12.L$3 = phoneNumberController;
                                    linkSignupHandlerForNetworking$performSignup$12.label = 3;
                                    invoke = requestIntegrityToken.invoke(attestationEndpoint, pane, linkSignupHandlerForNetworking$performSignup$12);
                                    if (invoke != coroutineSingletons) {
                                        list2 = list;
                                        String str3 = (String) invoke;
                                        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) this.player;
                                        String str4 = networkingLinkSignupState3.validEmail;
                                        str4.getClass();
                                        String str5 = networkingLinkSignupState3.validPhone;
                                        str5.getClass();
                                        String countryCode2 = phoneNumberController.getCountryCode();
                                        String str6 = (String) this.stuckPlayingNotEndingDetector;
                                        linkSignupHandlerForNetworking$performSignup$12.L$0 = null;
                                        linkSignupHandlerForNetworking$performSignup$12.L$1 = list2;
                                        linkSignupHandlerForNetworking$performSignup$12.L$2 = financialConnectionsSessionManifest;
                                        linkSignupHandlerForNetworking$performSignup$12.L$3 = null;
                                        linkSignupHandlerForNetworking$performSignup$12.label = 4;
                                        financialConnectionsConsumerSessionRepositoryImpl.getClass();
                                        performSignUp = financialConnectionsConsumerSessionRepositoryImpl.performSignUp(str4, str5, countryCode2, str3, str6, new StateFlowKt$combineState$2(3, financialConnectionsConsumerSessionRepositoryImpl.consumersApiService, ConsumersApiServiceImpl.class, "mobileSignUp", "mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), linkSignupHandlerForNetworking$performSignup$12);
                                        linkSignupHandlerForNetworking$performSignup$12 = linkSignupHandlerForNetworking$performSignup$12;
                                        if (performSignUp != coroutineSingletons) {
                                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = financialConnectionsSessionManifest;
                                            obj = performSignUp;
                                            financialConnectionsSessionManifest2 = financialConnectionsSessionManifest3;
                                            list3 = list2;
                                            ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) obj;
                                            String str7 = consumerSessionSignup.consumerSession.clientSecret;
                                            financialConnectionsSessionManifest2.getClass();
                                            z = financialConnectionsSessionManifest2.paymentMethodType == null;
                                            linkBrand = consumerSessionSignup.consumerSession.linkBrand;
                                            if (linkBrand == null) {
                                                LinkBrand linkBrand2 = financialConnectionsSessionManifest2.rawLinkBrand;
                                                if (linkBrand2 == null) {
                                                    linkBrand2 = LinkBrand.Link;
                                                }
                                                linkBrand = linkBrand2;
                                            }
                                            linkSignupHandlerForNetworking$performSignup$12.L$0 = null;
                                            linkSignupHandlerForNetworking$performSignup$12.L$1 = null;
                                            linkSignupHandlerForNetworking$performSignup$12.L$2 = null;
                                            linkSignupHandlerForNetworking$performSignup$12.L$3 = null;
                                            linkSignupHandlerForNetworking$performSignup$12.label = 5;
                                            saveAccountToLink.getClass();
                                            obj = saveAccountToLink.ensureReadyAccounts(z, list3, linkBrand, new WorkerWorkflow$render$1(saveAccountToLink, str7, continuation, 25), linkSignupHandlerForNetworking$performSignup$12);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                Path$$ExternalSyntheticBUOutline0.m$1((Object) CameraSelector$$ExternalSyntheticOutline0.m("Form invalid! ", str2, " ", str));
                                return null;
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        List list5 = linkSignupHandlerForNetworking$performSignup$12.L$1;
                        NetworkingLinkSignupState networkingLinkSignupState4 = linkSignupHandlerForNetworking$performSignup$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        list = list5;
                        networkingLinkSignupState3 = networkingLinkSignupState4;
                        financialConnectionsSessionManifest = ((SynchronizeSessionResponse) obj).manifest;
                        Async async2 = networkingLinkSignupState3.payload;
                        String str8 = networkingLinkSignupState3.validPhone;
                        String str22 = networkingLinkSignupState3.validEmail;
                        Object invoke22 = async2.invoke();
                        invoke22.getClass();
                        phoneNumberController = ((NetworkingLinkSignupState.Payload) invoke22).phoneController;
                        if (!networkingLinkSignupState3.getValid()) {
                        }
                        break;
                    case 3:
                        phoneNumberController = linkSignupHandlerForNetworking$performSignup$12.L$3;
                        FinancialConnectionsSessionManifest financialConnectionsSessionManifest4 = linkSignupHandlerForNetworking$performSignup$12.L$2;
                        List list6 = linkSignupHandlerForNetworking$performSignup$12.L$1;
                        networkingLinkSignupState3 = linkSignupHandlerForNetworking$performSignup$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        financialConnectionsSessionManifest = financialConnectionsSessionManifest4;
                        list2 = list6;
                        String str32 = (String) invoke;
                        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2 = (FinancialConnectionsConsumerSessionRepositoryImpl) this.player;
                        String str42 = networkingLinkSignupState3.validEmail;
                        str42.getClass();
                        String str52 = networkingLinkSignupState3.validPhone;
                        str52.getClass();
                        String countryCode22 = phoneNumberController.getCountryCode();
                        String str62 = (String) this.stuckPlayingNotEndingDetector;
                        linkSignupHandlerForNetworking$performSignup$12.L$0 = null;
                        linkSignupHandlerForNetworking$performSignup$12.L$1 = list2;
                        linkSignupHandlerForNetworking$performSignup$12.L$2 = financialConnectionsSessionManifest;
                        linkSignupHandlerForNetworking$performSignup$12.L$3 = null;
                        linkSignupHandlerForNetworking$performSignup$12.label = 4;
                        financialConnectionsConsumerSessionRepositoryImpl2.getClass();
                        performSignUp = financialConnectionsConsumerSessionRepositoryImpl2.performSignUp(str42, str52, countryCode22, str32, str62, new StateFlowKt$combineState$2(3, financialConnectionsConsumerSessionRepositoryImpl2.consumersApiService, ConsumersApiServiceImpl.class, "mobileSignUp", "mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), linkSignupHandlerForNetworking$performSignup$12);
                        linkSignupHandlerForNetworking$performSignup$12 = linkSignupHandlerForNetworking$performSignup$12;
                        if (performSignUp != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        financialConnectionsSessionManifest2 = linkSignupHandlerForNetworking$performSignup$12.L$2;
                        List list7 = linkSignupHandlerForNetworking$performSignup$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        list3 = list7;
                        ConsumerSessionSignup consumerSessionSignup2 = (ConsumerSessionSignup) obj;
                        String str72 = consumerSessionSignup2.consumerSession.clientSecret;
                        financialConnectionsSessionManifest2.getClass();
                        if (financialConnectionsSessionManifest2.paymentMethodType == null) {
                        }
                        linkBrand = consumerSessionSignup2.consumerSession.linkBrand;
                        if (linkBrand == null) {
                        }
                        linkSignupHandlerForNetworking$performSignup$12.L$0 = null;
                        linkSignupHandlerForNetworking$performSignup$12.L$1 = null;
                        linkSignupHandlerForNetworking$performSignup$12.L$2 = null;
                        linkSignupHandlerForNetworking$performSignup$12.L$3 = null;
                        linkSignupHandlerForNetworking$performSignup$12.label = 5;
                        saveAccountToLink.getClass();
                        obj = saveAccountToLink.ensureReadyAccounts(z, list3, linkBrand, new WorkerWorkflow$render$1(saveAccountToLink, str72, continuation, 25), linkSignupHandlerForNetworking$performSignup$12);
                        break;
                    case 5:
                        List list8 = linkSignupHandlerForNetworking$performSignup$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return FinancialConnectionsSessionManifest.Pane.SUCCESS;
                    case 6:
                        List list9 = linkSignupHandlerForNetworking$performSignup$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return FinancialConnectionsSessionManifest.Pane.SUCCESS;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        linkSignupHandlerForNetworking$performSignup$1 = new LinkSignupHandlerForNetworking$performSignup$1(this, continuationImpl);
        linkSignupHandlerForNetworking$performSignup$12 = linkSignupHandlerForNetworking$performSignup$1;
        Object obj2 = linkSignupHandlerForNetworking$performSignup$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Continuation continuation2 = null;
        switch (linkSignupHandlerForNetworking$performSignup$12.label) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request, still in use, count: 2, list:
          (r11v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request) from 0x0099: MOVE (r15v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request) = (r11v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request)
          (r11v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request) from 0x008c: MOVE (r15v6 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request) = (r11v2 com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.media3.common.util.StuckPlayerDetector, com.squareup.cash.blockers.data.BlockersData, com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request] */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public java.lang.Object produceResponseContext(com.squareup.cash.blockers.data.BlockersData r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.StuckPlayerDetector.produceResponseContext(com.squareup.cash.blockers.data.BlockersData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void registerWebView(WebView webView) {
        webView.getClass();
        this.callback = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new CashFillJavascriptInterface((BufferedChannel) this.stuckSuppressedDetector), "CashFillWebView");
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 0));
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void setAutofillInfo(AutofillWebInfo autofillWebInfo) {
        WebView webView = (WebView) this.callback;
        if (webView != null) {
            LinkedHashMap dataMap = autofillWebInfo.toDataMap();
            Moshi moshi = (Moshi) this.playerListener;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType typeOf = Reflection.typeOf(String.class);
            companion.getClass();
            KTypeProjection invariant = KTypeProjection.Companion.invariant(typeOf);
            KTypeProjection invariant2 = KTypeProjection.Companion.invariant(Reflection.typeOf(String.class));
            ReflectionFactory reflectionFactory = Reflection.factory;
            webView.evaluateJavascript(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n       (function () {\n          window?.cashFill?.setProfileData(", _MoshiKotlinExtensionsKt.adapter(moshi, reflectionFactory.typeOf(reflectionFactory.getOrCreateKotlinClass(Map.class), Arrays.asList(invariant, invariant2), false)).toJson(dataMap), ")\n       })(); \n      "), new CashFillWebManager$$ExternalSyntheticLambda0(0));
        }
    }

    public void startChooserActivity(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        ((Activity) this.callback).startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void triggerAutofill() {
        WebView webView = (WebView) this.callback;
        if (webView != null) {
            webView.evaluateJavascript("\n        (function () {\n           window?.cashFill?.performAutofill()\n        })();\n        ", new CashFillWebManager$$ExternalSyntheticLambda0(0));
        }
    }

    @Override // com.squareup.cash.autofillweb.api.AutofillWebManager
    public void unregisterWebView(WebView webView) {
        webView.getClass();
        this.callback = null;
    }

    public ListenableFuture zzb(zzqa zzqaVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.stuckPlayingDetector) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.stuckSuppressedDetector;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    Futures.getDone((ListenableFuture) this.stuckSuppressedDetector);
                } catch (ExecutionException unused) {
                    this.stuckSuppressedDetector = null;
                }
            }
            if (((ListenableFuture) this.stuckSuppressedDetector) == null) {
                this.stuckSuppressedDetector = Futures.nonCancellationPropagating(((BinaryBitmap) this.stuckPlayingNotEndingDetector).submitAsync(zzxa.zzb(new zzub(this, 0)), (SequentialExecutor) this.clock));
            }
            listenableFuture = (ListenableFuture) this.stuckSuppressedDetector;
        }
        return ((BinaryBitmap) this.stuckPlayingNotEndingDetector).submitAsync(zzxa.zzb(new n(this, listenableFuture, zzqaVar, executor)), DirectExecutor.INSTANCE);
    }

    public zzacb zzm(Uri uri) {
        zzvd zzvdVar = (zzvd) this.callback;
        String str = (String) this.player;
        zzru zzruVar = (zzru) this.period;
        try {
            try {
                zztw zztwVar = (zztw) this.stuckBufferingDetector;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String sb2 = sb.toString();
                zztwVar.getClass();
                zzwi zza = zztw.zza(sb2);
                try {
                    InputStream zzc = zzlf.zzc(zzruVar.zze(uri));
                    try {
                        zzadu zza2 = ((zzadq) ((zzafj) zzvdVar.zza.zzg(7))).zza(zzc, zzvdVar.zzb);
                        if (zzc != null) {
                            zzc.close();
                        }
                        zza.close();
                        return zza2;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        zza.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                zzzm zze = zzruVar.zze(uri);
                if (((zzsx) zze.zzc).zze((Uri) zze.zzf)) {
                    throw e;
                }
                return zzvdVar.zza;
            }
        } catch (IOException e2) {
            throw zzh.zza(zzruVar, uri, e2, str);
        }
    }

    public void zzn(Uri uri, Object obj) {
        String str = (String) this.player;
        zzru zzruVar = (zzru) this.period;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            zztw zztwVar = (zztw) this.stuckBufferingDetector;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String sb2 = sb.toString();
            zztwVar.getClass();
            zzwi zza = zztw.zza(sb2);
            try {
                zzz zzzVar = new zzz(3);
                try {
                    zzzm zze = zzruVar.zze(build);
                    ArrayList zzd = zze.zzd(((zzsx) zze.zzc).zzj((Uri) zze.zzf));
                    new zzz[]{zzzVar}[0].zza(zzd);
                    OutputStream outputStream = (OutputStream) zzd.get(0);
                    try {
                        zzacb zzacbVar = (zzacb) obj;
                        zzacbVar.getClass();
                        zzadu zzaduVar = (zzadu) zzacbVar;
                        int zzcq = zzaduVar.zzcq();
                        boolean z = zzada.zzc;
                        if (zzcq > 4096) {
                            zzcq = 4096;
                        }
                        zzacz zzaczVar = new zzacz(outputStream, zzcq);
                        zzaduVar.zzcH(zzaczVar);
                        zzaczVar.zzx();
                        if (((zzsm) zzzVar.zzb) == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        ((OutputStream) zzzVar.zza).flush();
                        ((zzsm) zzzVar.zzb).zza.getFD().sync();
                        outputStream.close();
                        zza.close();
                        zzzm zze2 = zzruVar.zze(build);
                        zzzm zze3 = zzruVar.zze(uri);
                        zzsx zzsxVar = (zzsx) zze2.zzc;
                        if (zzsxVar != ((zzsx) zze3.zzc)) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        zzsxVar.zzl((Uri) zze2.zzf, (Uri) zze3.zzf);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw zzh.zza(zzruVar, uri, e, str);
                }
            } finally {
            }
        } catch (IOException e2) {
            zzzm zze4 = zzruVar.zze(build);
            if (((zzsx) zze4.zzc).zze((Uri) zze4.zzf)) {
                try {
                    zzzm zze5 = zzruVar.zze(build);
                    ((zzsx) zze5.zzc).zzk((Uri) zze5.zzf);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public /* synthetic */ StuckPlayerDetector(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.$r8$classId = i;
        this.player = obj;
        this.playerListener = obj2;
        this.callback = obj3;
        this.clock = obj4;
        this.period = obj5;
        this.handler = obj6;
        this.stuckBufferingDetector = obj7;
        this.stuckPlayingDetector = obj8;
        this.stuckPlayingNotEndingDetector = obj9;
        this.stuckSuppressedDetector = obj10;
    }

    public StuckPlayerDetector(String str, ImmediateFuture immediateFuture, zzvd zzvdVar, Executor executor, zzru zzruVar, Present present, zztw zztwVar) {
        this.$r8$classId = 3;
        this.stuckPlayingDetector = new Object();
        this.stuckPlayingNotEndingDetector = new BinaryBitmap(4);
        this.stuckSuppressedDetector = null;
        this.player = str;
        this.playerListener = Futures.nonCancellationPropagating(immediateFuture);
        this.callback = zzvdVar;
        this.clock = new SequentialExecutor(executor);
        this.period = zzruVar;
        this.handler = present;
        this.stuckBufferingDetector = zztwVar;
    }

    public StuckPlayerDetector(ExoPlayer exoPlayer, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.$r8$classId = 10;
        this.player = exoPlayer;
        this.playerListener = coroutineScope;
        this.callback = coroutineContext;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Float.valueOf(RecyclerView.DECELERATION_RATE));
        this.clock = MutableStateFlow;
        this.period = FlowKt.asStateFlow(MutableStateFlow);
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(PlaybackState.IDLE);
        this.handler = MutableStateFlow2;
        this.stuckBufferingDetector = FlowKt.asStateFlow(MutableStateFlow2);
        this.stuckSuppressedDetector = new Player.Listener() { // from class: com.squareup.cash.music.backend.real.RealMediaPlayer$playerListener$1
            @Override // androidx.media3.common.Player.Listener
            public final void onIsPlayingChanged(boolean z) {
                StuckPlayerDetector stuckPlayerDetector = StuckPlayerDetector.this;
                StuckPlayerDetector.access$updatePlaybackState(stuckPlayerDetector);
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) stuckPlayerDetector.stuckPlayingDetector;
                Continuation continuation = null;
                if (!z) {
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    stuckPlayerDetector.stuckPlayingDetector = null;
                } else {
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    stuckPlayerDetector.stuckPlayingDetector = null;
                    stuckPlayerDetector.stuckPlayingDetector = JobKt.launch$default((CoroutineScope) stuckPlayerDetector.playerListener, (CoroutineContext) stuckPlayerDetector.callback, null, new MusicPresenter$models$2$1(stuckPlayerDetector, continuation, 23), 2);
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public final void onPlaybackStateChanged(int i) {
                StuckPlayerDetector.access$updatePlaybackState(StuckPlayerDetector.this);
            }
        };
    }

    public StuckPlayerDetector(RealCashFillJsStore realCashFillJsStore, Moshi moshi, CoroutineScope coroutineScope) {
        this.$r8$classId = 4;
        this.player = realCashFillJsStore;
        this.playerListener = moshi;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.clock = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.period = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.handler = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.stuckBufferingDetector = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.stuckPlayingDetector = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.stuckPlayingNotEndingDetector = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        this.stuckSuppressedDetector = PapaEvent.Channel$default(50, null, null, 6);
        JobKt.launch$default(coroutineScope, null, null, new CashFillWebManager$1(this, null), 3);
    }

    public StuckPlayerDetector(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, TransitionWorker$TransitionData transitionWorker$TransitionData, InquiryService inquiryService, FallbackModeManager fallbackModeManager, UiStepSavedStateHelper uiStepSavedStateHelper, com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager featureFlagManager, Context context) {
        this.$r8$classId = 14;
        inquirySessionConfig.getClass();
        transitionWorker$TransitionData.getClass();
        inquiryService.getClass();
        fallbackModeManager.getClass();
        uiStepSavedStateHelper.getClass();
        featureFlagManager.getClass();
        context.getClass();
        this.player = str;
        this.playerListener = str2;
        this.callback = str3;
        this.clock = inquirySessionConfig;
        this.period = transitionWorker$TransitionData;
        this.handler = inquiryService;
        this.stuckBufferingDetector = fallbackModeManager;
        this.stuckPlayingDetector = uiStepSavedStateHelper;
        this.stuckPlayingNotEndingDetector = featureFlagManager;
        this.stuckSuppressedDetector = context;
    }

    public StuckPlayerDetector(CryptoService cryptoService, FlowStarter flowStarter, RealCryptoAnalytics realCryptoAnalytics, Result result, zzd zzdVar, RealCryptoTransactionActionManager realCryptoTransactionActionManager, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        this.$r8$classId = 8;
        screen.getClass();
        this.player = cryptoService;
        this.playerListener = flowStarter;
        this.callback = realCryptoAnalytics;
        this.clock = result;
        this.period = realCryptoTransactionActionManager;
        this.handler = screen;
        if (scenarioPlanInput instanceof InitiateBitcoinWithdrawalScenarioPlanInput) {
            this.stuckBufferingDetector = ((InitiateBitcoinWithdrawalScenarioPlanInput) scenarioPlanInput).payment;
            this.stuckPlayingNotEndingDetector = ClientScenario.INITIATE_BITCOIN_WITHDRAWAL;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinWithdrawalScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
    }

    public StuckPlayerDetector(BetterNavigator.ScreenNavigator screenNavigator, GlobalSearchScreen globalSearchScreen, RealGlobalSearchRepository realGlobalSearchRepository, ActivitySectionPresenter$Factory$Impl activitySectionPresenter$Factory$Impl, RowSectionPresenter$Factory$Impl rowSectionPresenter$Factory$Impl, RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext, RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, Analytics analytics, AndroidStringManager androidStringManager) {
        this.$r8$classId = 9;
        globalSearchScreen.getClass();
        this.player = screenNavigator;
        this.playerListener = globalSearchScreen;
        this.callback = realGlobalSearchRepository;
        this.clock = activitySectionPresenter$Factory$Impl;
        this.period = rowSectionPresenter$Factory$Impl;
        this.handler = realGlobalSearchAnalyticsContext;
        this.stuckBufferingDetector = realGlobalSearchAnalyticsHelper;
        this.stuckPlayingDetector = analytics;
        this.stuckPlayingNotEndingDetector = androidStringManager;
        this.stuckSuppressedDetector = new ParcelableSnapshotMutableIntState(0);
    }

    public StuckPlayerDetector(RealJurisdictionConfigManager realJurisdictionConfigManager, RealProfileManager realProfileManager, RealCryptoBalanceRepo realCryptoBalanceRepo, RealBitcoinFormatter realBitcoinFormatter, CurrencyConverter$Factory currencyConverter$Factory, RealBitcoinProfileRepo realBitcoinProfileRepo, RealDependentBalancesStore realDependentBalancesStore, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 5;
        this.player = realJurisdictionConfigManager;
        this.playerListener = realProfileManager;
        this.callback = realCryptoBalanceRepo;
        this.clock = realBitcoinFormatter;
        this.period = currencyConverter$Factory;
        this.handler = realBitcoinProfileRepo;
        this.stuckBufferingDetector = realDependentBalancesStore;
        this.stuckPlayingDetector = realDependentCustomerTokenRepository;
        this.stuckPlayingNotEndingDetector = factory.createSymbolAndCode();
        this.stuckSuppressedDetector = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public StuckPlayerDetector(RealBitcoinActivityProvider realBitcoinActivityProvider, RealBitcoinProfileRepo realBitcoinProfileRepo, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, Analytics analytics, RealProfileNotificationsRepository realProfileNotificationsRepository, SessionManager sessionManager, FeatureFlagManager featureFlagManager, zzb zzbVar, RealCryptoValueRepo realCryptoValueRepo, BitcoinFeatureAvailabilityProvider bitcoinFeatureAvailabilityProvider) {
        this.$r8$classId = 7;
        this.player = androidStringManager;
        this.playerListener = analytics;
        this.callback = realProfileNotificationsRepository;
        this.clock = sessionManager;
        this.period = featureFlagManager;
        this.handler = factory.create(MoneyFormatterConfig.STANDARD);
        this.stuckBufferingDetector = realCryptoValueRepo.valuePerBitcoin(null);
        this.stuckPlayingDetector = realBitcoinActivityProvider.hasBitcoinActivity();
        this.stuckPlayingNotEndingDetector = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
        this.stuckSuppressedDetector = bitcoinFeatureAvailabilityProvider.isLimitsAvailable();
    }

    public /* synthetic */ StuckPlayerDetector() {
        this.$r8$classId = 2;
    }

    public StuckPlayerDetector(HCaptcha hCaptcha, RealProfileManager realProfileManager, Activity activity, AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager, AndroidPackageManager androidPackageManager, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.$r8$classId = 11;
        this.player = hCaptcha;
        this.playerListener = realProfileManager;
        this.callback = activity;
        this.clock = androidStringManager;
        this.period = realClipboardManager;
        this.handler = androidPackageManager;
        this.stuckBufferingDetector = coroutineContext;
        this.stuckPlayingDetector = coroutineScope;
        this.stuckSuppressedDetector = new LinkedHashMap();
    }

    public StuckPlayerDetector(ExoPlayerImpl exoPlayerImpl, ExoPlayerImpl.ComponentListener componentListener, SystemClock systemClock, int i, int i2, int i3, int i4) {
        this.$r8$classId = 0;
        this.player = exoPlayerImpl;
        this.callback = componentListener;
        this.clock = systemClock;
        this.period = new Timeline.Period();
        this.handler = systemClock.createHandler(exoPlayerImpl.applicationLooper, new ListenerSet$$ExternalSyntheticLambda0(this, 1));
        this.stuckBufferingDetector = new StuckBufferingDetector(i);
        this.stuckPlayingDetector = new StuckPlayingDetector(i2);
        this.stuckPlayingNotEndingDetector = new StuckPlayingNotEndingDetector(i3);
        this.stuckSuppressedDetector = new StuckSuppressedDetector(i4);
        Player.Listener listener = new Player.Listener() { // from class: androidx.media3.common.util.StuckPlayerDetector.1
            @Override // androidx.media3.common.Player.Listener
            public final void onEvents(ExoPlayerImpl exoPlayerImpl2, Player.Events events) {
                StuckPlayerDetector stuckPlayerDetector = StuckPlayerDetector.this;
                ((StuckBufferingDetector) stuckPlayerDetector.stuckBufferingDetector).update();
                ((StuckPlayingDetector) stuckPlayerDetector.stuckPlayingDetector).update();
                ((StuckPlayingNotEndingDetector) stuckPlayerDetector.stuckPlayingNotEndingDetector).update();
                ((StuckSuppressedDetector) stuckPlayerDetector.stuckSuppressedDetector).update();
            }
        };
        this.playerListener = listener;
        exoPlayerImpl.listeners.add(listener);
    }

    public StuckPlayerDetector(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, GetOrFetchSync getOrFetchSync, GetCachedAccounts getCachedAccounts, RequestIntegrityToken requestIntegrityToken, SaveAccountToLink saveAccountToLink, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NavigationManagerImpl navigationManagerImpl, RealCurrentLinkBrand realCurrentLinkBrand, String str, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        this.$r8$classId = 13;
        financialConnectionsConsumerSessionRepositoryImpl.getClass();
        getOrFetchSync.getClass();
        getCachedAccounts.getClass();
        requestIntegrityToken.getClass();
        saveAccountToLink.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        navigationManagerImpl.getClass();
        realCurrentLinkBrand.getClass();
        str.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.player = financialConnectionsConsumerSessionRepositoryImpl;
        this.playerListener = getOrFetchSync;
        this.callback = getCachedAccounts;
        this.clock = requestIntegrityToken;
        this.period = saveAccountToLink;
        this.handler = financialConnectionsAnalyticsTrackerImpl;
        this.stuckBufferingDetector = navigationManagerImpl;
        this.stuckPlayingDetector = realCurrentLinkBrand;
        this.stuckPlayingNotEndingDetector = str;
        this.stuckSuppressedDetector = logger$Companion$NOOP_LOGGER$1;
    }
}
