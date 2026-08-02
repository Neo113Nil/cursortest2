package ru.yandex.video.m3.player;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.inh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sls;
import defpackage.t26;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.a;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.benchmark.MetricsManager;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactoryImpl;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt;
import ru.yandex.video.m3.ott.ott.OttParamsDrmServiceConfig;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.abr.impl.AesthetePreferenceProviderImpl;
import ru.yandex.video.m3.player.abr.impl.UserQualityRepositoryImpl;
import ru.yandex.video.m3.player.crashmanager.CrashManager;
import ru.yandex.video.m3.player.error_handling.CacheErrorHandlingRule;
import ru.yandex.video.m3.player.error_handling.CancellationHandlingRule;
import ru.yandex.video.m3.player.error_handling.ChangesInManifestHandlingRule;
import ru.yandex.video.m3.player.error_handling.CompositeErrorHandlingRule;
import ru.yandex.video.m3.player.error_handling.DrmErrorHandlingRule;
import ru.yandex.video.m3.player.error_handling.DummyExternalErrorHandler;
import ru.yandex.video.m3.player.error_handling.ErrorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingRule;
import ru.yandex.video.m3.player.error_handling.ErrorInRendererHandlingRule;
import ru.yandex.video.m3.player.error_handling.ExternalErrorHandler;
import ru.yandex.video.m3.player.error_handling.FrameDropHandlingRule;
import ru.yandex.video.m3.player.error_handling.InstantiatingDecoderHandlingRule;
import ru.yandex.video.m3.player.error_handling.MediaResourceBusyHandlingRule;
import ru.yandex.video.m3.player.error_handling.NoInternetConnectionHandlingRule;
import ru.yandex.video.m3.player.error_handling.NoPrepareHandlingRule;
import ru.yandex.video.m3.player.error_handling.OutOfLiveWindowHandlingRule;
import ru.yandex.video.m3.player.error_handling.PreferH264HandlingRule;
import ru.yandex.video.m3.player.error_handling.PreloadedLiveDashManifestHandlingRule;
import ru.yandex.video.m3.player.error_handling.SeekFailureHandlingRule;
import ru.yandex.video.m3.player.error_handling.StuckStalledHandlingRule;
import ru.yandex.video.m3.player.error_handling.WrongThreadHandlingRule;
import ru.yandex.video.m3.player.error_handling.factory.ErrorHandlerFactoryImpl;
import ru.yandex.video.m3.player.feature.FeatureConfigurator;
import ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl;
import ru.yandex.video.m3.player.impl.YandexPlayerImpl;
import ru.yandex.video.m3.player.impl.utils.MarkedExecutorService;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParametersKt;
import ru.yandex.video.m3.player.parameters.StuckStalledConfig;
import ru.yandex.video.m3.player.parameters.StuckStalledConfigKt;
import ru.yandex.video.m3.player.provider.DrmTypeProvider;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProviderImpl;
import ru.yandex.video.m3.player.provider.drm.DrmTypeSupplier;
import ru.yandex.video.m3.player.provider.internal.DecoderDataProvider;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProvider;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProviderKt;
import ru.yandex.video.m3.player.provider.internal.StartQualityProvider;
import ru.yandex.video.m3.player.provider.internal.SurfaceSizeProvider;
import ru.yandex.video.m3.player.report.builder.BaseReportBuilder;
import ru.yandex.video.m3.player.report.builder.NoOpReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilderImpl;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.scaling.ScalingMode;
import ru.yandex.video.m3.player.tracking.SafeStrmEventLogger;
import ru.yandex.video.m3.player.tracking.StrmManager;
import ru.yandex.video.m3.player.tracking.StrmManagerFactory;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfigKt;
import ru.yandex.video.m3.player.tracking.config.DisabledStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.StrmManagerConfig;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 p*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001pB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010\u0004J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00101\u001a\u00020,H\u0000¢\u0006\u0004\b2\u0010/J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020#H\u0002¢\u0006\u0004\b@\u0010\u0004J#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0C2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bE\u0010FJG\u0010Q\u001a\u00020P2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u00182\u0006\u00101\u001a\u00020,H\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010T\u001a\u00020K2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010S\u001a\u00020)H\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bW\u0010XR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010YR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010ZR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\\R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010]R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010^R\u0016\u0010a\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010^R\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010^R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010bR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010^R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010dR\u0016\u0010e\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010gR\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010gR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010hR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lru/yandex/video/m3/player/YandexPlayerBuilder;", "", CA20Status.STATUS_CERTIFICATE_H, "<init>", "()V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/player/PlayerDelegateFactory;", "playerDelegateFactory", "(Lru/yandex/video/m3/player/PlayerDelegateFactory;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "playerStrategyFactory", "(Lru/yandex/video/m3/player/PlayerStrategyFactory;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;", ConfigConstants.CONFIG, "strmManagerConfig", "(Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/benchmark/MetricsManager;", "metricsManager", "(Lru/yandex/video/m3/benchmark/MetricsManager;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "", "quality", "setServiceQuality", "(I)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "", "value", "shouldConsiderSelectedUserQuality", "(Z)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "optimizeConcurrentCommandExecution", "experimentalDoAutoPlayLogicInsidePlayer", "synchronizedMode", "Lzy11;", "usePlayerInitThreadAsMain", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "mode", "videoScalingMode", "(Lru/yandex/video/m3/player/scaling/ScalingMode;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "", "setRecoveredErrors", "(Ljava/lang/String;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "setSourceIndexGenerator$video_player_internalRelease", "(Lru/yandex/video/m3/player/IndexGenerator;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "setSourceIndexGenerator", "eventIndexGenerator", "setEventIndexGenerator$video_player_internalRelease", "setEventIndexGenerator", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "externalErrorHandler", "setExternalErrorHandler", "(Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "setMediaDrmCallbackDelegateFactory", "(Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;)Lru/yandex/video/m3/player/YandexPlayerBuilder;", "videoSessionId", "Lru/yandex/video/m3/player/YandexPlayer;", "build", "(Ljava/lang/String;)Lru/yandex/video/m3/player/YandexPlayer;", "passContextToDeviceIdProvider", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "recordLogger", "Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerObserver;", "createErrorHandlingRule", "(Lru/yandex/video/m3/player/report/logger/RecordLogger;)Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;", "drmTypeProvider", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Lru/yandex/video/m3/player/provider/internal/DecoderDataProvider;", "decoderDataProvider", "playerIndex", "Lru/yandex/video/m3/player/tracking/StrmManager;", "createStrmManager", "(Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/ab/config/AbConfig;Lru/yandex/video/m3/player/provider/internal/DecoderDataProvider;ILru/yandex/video/m3/player/IndexGenerator;)Lru/yandex/video/m3/player/tracking/StrmManager;", "vsid", "getAbConfig", "(Landroid/content/Context;Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfig;", "Lru/yandex/video/m3/player/crashmanager/CrashManager;", "maybeRegisterCrashManager", "(Landroid/content/Context;)Lru/yandex/video/m3/player/crashmanager/CrashManager;", "Landroid/content/Context;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "Lru/yandex/video/m3/player/PlayerDelegateFactory;", "Lru/yandex/video/m3/benchmark/MetricsManager;", "Z", "defaultQuality", "Ljava/lang/Integer;", "optimizeCommandExecution", "Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;", "usePlayerInitThread", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "recoveredErrorsCsv", "Ljava/lang/String;", "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "Lokhttp3/OkHttpClient;", "fallbackOkHttpClient$delegate", "Li3y;", "getFallbackOkHttpClient", "()Lokhttp3/OkHttpClient;", "fallbackOkHttpClient", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerBuilder<H> {
    private static final boolean USE_CRASH_HANDLER = false;
    private Context context;
    private Integer defaultQuality;
    private ExecutorService executorService;
    private boolean experimentalDoAutoPlayLogicInsidePlayer;
    private ExternalErrorHandler externalErrorHandler;
    private MetricsManager metricsManager;
    private boolean optimizeCommandExecution;
    private PlayerDelegateFactory<H> playerDelegateFactory;
    private PlayerStrategyFactory playerStrategyFactory;
    private boolean shouldConsiderSelectedUserQuality;
    private IndexGenerator sourceIndexGenerator;
    private StrmManagerConfig strmManagerConfig;
    private boolean synchronizedMode;
    private boolean usePlayerInitThread;
    public static final int $stable = 8;
    private ScalingMode videoScalingMode = ScalingMode.DEFAULT;
    private String recoveredErrorsCsv = "";
    private IndexGenerator eventIndexGenerator = new SimpleIndexGenerator();
    private OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory = new OttMediaDrmCallbackDelegateFactoryImpl(OttMediaDrmCallbackDelegateKt.DrmServiceConfig$default(OttParamsDrmServiceConfig.ORIGIN, OttParamsDrmServiceConfig.REFERER, null, 4, null));

    /* renamed from: fallbackOkHttpClient$delegate, reason: from kotlin metadata */
    private final i3y fallbackOkHttpClient = a.a(new sls() { // from class: ru.yandex.video.m3.player.YandexPlayerBuilder$fallbackOkHttpClient$2
        @Override // defpackage.sls
        public final OkHttpClient invoke() {
            return new OkHttpClient(new OkHttpClient.a());
        }
    });

    public static /* synthetic */ YandexPlayer build$default(YandexPlayerBuilder yandexPlayerBuilder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return yandexPlayerBuilder.build(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread build$lambda$24$lambda$23(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("YP:OYandexPlayer");
        return newThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread build$lambda$28$lambda$27(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("YP:YandexPlayer");
        return newThread;
    }

    private final CompositeErrorHandlingRule<PlayerObserver<H>> createErrorHandlingRule(RecordLogger recordLogger) {
        final CompositeErrorHandlingRule<PlayerObserver<H>> compositeErrorHandlingRule = new CompositeErrorHandlingRule<>();
        ErrorHandlingRule changesInManifestHandlingRule = new ChangesInManifestHandlingRule();
        compositeErrorHandlingRule.addRule(changesInManifestHandlingRule);
        if (changesInManifestHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) changesInManifestHandlingRule);
        }
        MediaResourceBusyHandlingRule mediaResourceBusyHandlingRule = new MediaResourceBusyHandlingRule();
        compositeErrorHandlingRule.addRule(mediaResourceBusyHandlingRule);
        compositeErrorHandlingRule.addObserver(mediaResourceBusyHandlingRule);
        NoPrepareHandlingRule noPrepareHandlingRule = new NoPrepareHandlingRule();
        compositeErrorHandlingRule.addRule(noPrepareHandlingRule);
        compositeErrorHandlingRule.addObserver(noPrepareHandlingRule);
        ErrorHandlingRule outOfLiveWindowHandlingRule = new OutOfLiveWindowHandlingRule();
        compositeErrorHandlingRule.addRule(outOfLiveWindowHandlingRule);
        if (outOfLiveWindowHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) outOfLiveWindowHandlingRule);
        }
        ErrorHandlingRule seekFailureHandlingRule = new SeekFailureHandlingRule();
        compositeErrorHandlingRule.addRule(seekFailureHandlingRule);
        if (seekFailureHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) seekFailureHandlingRule);
        }
        ErrorHandlingRule wrongThreadHandlingRule = new WrongThreadHandlingRule();
        compositeErrorHandlingRule.addRule(wrongThreadHandlingRule);
        if (wrongThreadHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) wrongThreadHandlingRule);
        }
        ErrorHandlingRule cancellationHandlingRule = new CancellationHandlingRule();
        compositeErrorHandlingRule.addRule(cancellationHandlingRule);
        if (cancellationHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) cancellationHandlingRule);
        }
        ErrorHandlingRule errorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule = new ErrorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule();
        compositeErrorHandlingRule.addRule(errorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule);
        if (errorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) errorBehindLiveWindowFromPreloadedLiveDashManifestHandlingRule);
        }
        ErrorHandlingRule preloadedLiveDashManifestHandlingRule = new PreloadedLiveDashManifestHandlingRule();
        compositeErrorHandlingRule.addRule(preloadedLiveDashManifestHandlingRule);
        if (preloadedLiveDashManifestHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) preloadedLiveDashManifestHandlingRule);
        }
        ErrorHandlingRule stuckStalledHandlingRule = new StuckStalledHandlingRule();
        compositeErrorHandlingRule.addRule(stuckStalledHandlingRule);
        if (stuckStalledHandlingRule instanceof PlayerObserver) {
            compositeErrorHandlingRule.addObserver((PlayerObserver) stuckStalledHandlingRule);
        }
        if (evu0.J(this.recoveredErrorsCsv)) {
            return compositeErrorHandlingRule;
        }
        List g = jl40.l(this.recoveredErrorsCsv, "*") ? scc.g("Cache", "Drm", "NoInternetConnection", "QueueSecureInputBuffer", "DequeueInputBuffer", "DequeueOutputBuffer", "FailedReleaseOutputBuffer", "InstantiatingDecoder", "FrameDropDetected", "PreferH264HandlingRule") : evu0.W(this.recoveredErrorsCsv, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        if (g.contains("InstantiatingDecoder")) {
            ErrorHandlingRule instantiatingDecoderHandlingRule = new InstantiatingDecoderHandlingRule();
            compositeErrorHandlingRule.addRule(instantiatingDecoderHandlingRule);
            if (instantiatingDecoderHandlingRule instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) instantiatingDecoderHandlingRule);
            }
        }
        if (g.contains("Cache")) {
            CacheErrorHandlingRule cacheErrorHandlingRule = new CacheErrorHandlingRule();
            compositeErrorHandlingRule.addRule(cacheErrorHandlingRule);
            compositeErrorHandlingRule.addObserver(cacheErrorHandlingRule);
        }
        if (g.contains("Drm")) {
            ErrorHandlingRule drmErrorHandlingRule = new DrmErrorHandlingRule();
            compositeErrorHandlingRule.addRule(drmErrorHandlingRule);
            if (drmErrorHandlingRule instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) drmErrorHandlingRule);
            }
        }
        if (g.contains("NoInternetConnection")) {
            NoInternetConnectionHandlingRule noInternetConnectionHandlingRule = new NoInternetConnectionHandlingRule();
            compositeErrorHandlingRule.addRule(noInternetConnectionHandlingRule);
            compositeErrorHandlingRule.addObserver(noInternetConnectionHandlingRule);
        }
        if (g.contains("QueueSecureInputBuffer")) {
            ErrorHandlingRule errorInRendererHandlingRule = new ErrorInRendererHandlingRule(PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer.class);
            compositeErrorHandlingRule.addRule(errorInRendererHandlingRule);
            if (errorInRendererHandlingRule instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) errorInRendererHandlingRule);
            }
        }
        if (g.contains("DequeueInputBuffer")) {
            ErrorHandlingRule errorInRendererHandlingRule2 = new ErrorInRendererHandlingRule(PlaybackException.ErrorInRenderer.FailedDequeueInputBuffer.class);
            compositeErrorHandlingRule.addRule(errorInRendererHandlingRule2);
            if (errorInRendererHandlingRule2 instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) errorInRendererHandlingRule2);
            }
        }
        if (g.contains("DequeueOutputBuffer")) {
            ErrorHandlingRule errorInRendererHandlingRule3 = new ErrorInRendererHandlingRule(PlaybackException.ErrorInRenderer.FailedDequeueOutputBuffer.class);
            compositeErrorHandlingRule.addRule(errorInRendererHandlingRule3);
            if (errorInRendererHandlingRule3 instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) errorInRendererHandlingRule3);
            }
        }
        if (g.contains("FailedReleaseOutputBuffer")) {
            ErrorHandlingRule errorInRendererHandlingRule4 = new ErrorInRendererHandlingRule(PlaybackException.ErrorInRenderer.FailedReleaseOutputBuffer.class);
            compositeErrorHandlingRule.addRule(errorInRendererHandlingRule4);
            if (errorInRendererHandlingRule4 instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) errorInRendererHandlingRule4);
            }
        }
        if (g.contains("FrameDropDetected")) {
            ErrorHandlingRule frameDropHandlingRule = new FrameDropHandlingRule();
            compositeErrorHandlingRule.addRule(frameDropHandlingRule);
            if (frameDropHandlingRule instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) frameDropHandlingRule);
            }
        }
        if (g.contains("PreferH264HandlingRule")) {
            ErrorHandlingRule preferH264HandlingRule = new PreferH264HandlingRule();
            compositeErrorHandlingRule.addRule(preferH264HandlingRule);
            if (preferH264HandlingRule instanceof PlayerObserver) {
                compositeErrorHandlingRule.addObserver((PlayerObserver) preferH264HandlingRule);
            }
        }
        RecordLogger.log$default(recordLogger, 0L, new sls() { // from class: ru.yandex.video.m3.player.YandexPlayerBuilder$createErrorHandlingRule$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return "recoverStrategies = ".concat(kotlin.collections.a.X(compositeErrorHandlingRule.getRules(), null, null, null, new tls() { // from class: ru.yandex.video.m3.player.YandexPlayerBuilder$createErrorHandlingRule$2.1
                    @Override // defpackage.tls
                    public final CharSequence invoke(ErrorHandlingRule errorHandlingRule) {
                        return errorHandlingRule.getClass().getName();
                    }
                }, 31));
            }
        }, 1, null);
        return compositeErrorHandlingRule;
    }

    private final StrmManager createStrmManager(StrmManagerConfig strmManagerConfig, DrmTypeSupplier drmTypeProvider, ReportBuilder reportBuilder, AbConfig abConfig, DecoderDataProvider decoderDataProvider, int playerIndex, IndexGenerator eventIndexGenerator) {
        StrmManagerConfig strmManagerConfig2;
        DefaultStrmManagerConfig defaultStrmManagerConfig = strmManagerConfig instanceof DefaultStrmManagerConfig ? (DefaultStrmManagerConfig) strmManagerConfig : null;
        if (defaultStrmManagerConfig == null || (strmManagerConfig2 = DefaultStrmManagerConfigKt.mergeTestIds(defaultStrmManagerConfig, abConfig.getTestIds())) == null) {
            strmManagerConfig2 = DisabledStrmManagerConfig.INSTANCE;
        }
        return new StrmManagerFactory().create$video_player_internalRelease(strmManagerConfig2, new StrmManagerFactory.Parameters(drmTypeProvider, reportBuilder, decoderDataProvider, abConfig, playerIndex, eventIndexGenerator, false, false, 192, null));
    }

    private final AbConfig getAbConfig(Context context, StrmManagerConfig strmManagerConfig, String vsid) {
        final OkHttpClient fallbackOkHttpClient;
        YandexPlayerAbConfigManager.Companion companion = YandexPlayerAbConfigManager.INSTANCE;
        AbConfig abConfig = null;
        if (companion.isInitialized$video_player_internalRelease()) {
            YandexPlayerAbConfigManager instanceOrNull$video_player_internalRelease = companion.getInstanceOrNull$video_player_internalRelease();
            if (instanceOrNull$video_player_internalRelease != null) {
                abConfig = instanceOrNull$video_player_internalRelease.getConfig$video_player_internalRelease(vsid);
            }
        } else {
            DefaultStrmManagerConfig defaultStrmManagerConfig = strmManagerConfig instanceof DefaultStrmManagerConfig ? (DefaultStrmManagerConfig) strmManagerConfig : null;
            if (defaultStrmManagerConfig == null || (fallbackOkHttpClient = defaultStrmManagerConfig.getOkHttpClient()) == null) {
                fallbackOkHttpClient = getFallbackOkHttpClient();
            }
            companion.initialize(context, new tls() { // from class: ru.yandex.video.m3.player.YandexPlayerBuilder$getAbConfig$1
                {
                    super(1);
                }

                public final void invoke(YandexPlayerAbConfigManager.Builder builder) {
                    builder.setOkHttpClient(OkHttpClient.this);
                    builder.setUpdateAbConfigStrategy(1);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((YandexPlayerAbConfigManager.Builder) obj);
                    return zy11.a;
                }
            });
            YandexPlayerAbConfigManager instanceOrNull$video_player_internalRelease2 = companion.getInstanceOrNull$video_player_internalRelease();
            if (instanceOrNull$video_player_internalRelease2 != null) {
                abConfig = instanceOrNull$video_player_internalRelease2.getConfig$video_player_internalRelease(vsid);
            }
        }
        return abConfig == null ? AbConfig.INSTANCE.getDEFAULT$video_player_internalRelease() : abConfig;
    }

    private final OkHttpClient getFallbackOkHttpClient() {
        return (OkHttpClient) this.fallbackOkHttpClient.getValue();
    }

    private final CrashManager maybeRegisterCrashManager(Context context) {
        return null;
    }

    private final void passContextToDeviceIdProvider() {
        Context context = this.context;
        if (context != null) {
            DeviceIdProviderKt.provideContext(DeviceIdProvider.INSTANCE, context);
        }
    }

    public final YandexPlayer<H> build(String videoSessionId) {
        ExecutorService executorService;
        Looper mainLooper;
        YandexPlayer<H> yandexPlayerImpl;
        Context context = this.context;
        PlayerDelegateFactory<H> playerDelegateFactory = this.playerDelegateFactory;
        PlayerStrategyFactory playerStrategyFactory = this.playerStrategyFactory;
        StrmManagerConfig strmManagerConfig = this.strmManagerConfig;
        passContextToDeviceIdProvider();
        if (context == null) {
            ny61.r("Please specify context");
            return null;
        }
        if (playerDelegateFactory == null) {
            ny61.r("Please specify PlayerDelegateFactory");
            return null;
        }
        if (playerStrategyFactory == null) {
            ny61.r("Please specify PlayerStrategyFactory");
            return null;
        }
        if (strmManagerConfig == null) {
            ny61.r("Please specify StrmManagerConfig");
            return null;
        }
        maybeRegisterCrashManager(context);
        if (this.experimentalDoAutoPlayLogicInsidePlayer && !this.optimizeCommandExecution) {
            ny61.r("experimentalDoAutoPlayLogicInsidePlayer supports only with optimizeCommandExecution");
            return null;
        }
        if (this.metricsManager == null) {
            h5z0.a.o("MetricsManager is not specified; Please, specify it to report speed metrics", new Object[0]);
        }
        String generateVsid = videoSessionId == null ? new VsidGenerator(new SystemTimeProvider()).generateVsid() : videoSessionId;
        final AbConfig abConfig = getAbConfig(context, strmManagerConfig, generateVsid);
        int i = 2;
        boolean z = true;
        if (this.optimizeCommandExecution) {
            executorService = new ThreadPoolExecutor(1, 1, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, TimeUnit.DAYS, new LinkedBlockingQueue(), new inh(i));
        } else {
            executorService = this.executorService;
            if (executorService != null) {
                z = false;
            } else {
                executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new inh(3));
            }
        }
        MarkedExecutorService markedExecutorService = new MarkedExecutorService(z, executorService);
        SharedPreferences provideYandexPlayerSharedPreferences$video_player_internalRelease = InternalDiUtil.INSTANCE.provideYandexPlayerSharedPreferences$video_player_internalRelease(context);
        ru.yandex.video.m3.player.abr.AbrPreferences abrPreferences = new ru.yandex.video.m3.player.abr.AbrPreferences(this.defaultQuality, new AesthetePreferenceProviderImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease), new UserQualityRepositoryImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease), this.shouldConsiderSelectedUserQuality);
        if (this.usePlayerInitThread) {
            mainLooper = Looper.myLooper();
            if (mainLooper == null) {
                mainLooper = Looper.getMainLooper();
            }
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Looper looper = mainLooper;
        DrmTypeProvider drmTypeProvider = new DrmTypeProvider(new Handler(looper));
        BaseReportBuilder reportBuilderImpl = abConfig.getFlags().getEnableCodecTelemetryReportLogger() ? new ReportBuilderImpl() : NoOpReportBuilder.INSTANCE;
        CompositeErrorHandlingRule<PlayerObserver<H>> createErrorHandlingRule = createErrorHandlingRule(ReportBuilder.registerLogger$default(reportBuilderImpl, "YandexPlayerBuilder", 0, 2, null));
        DecoderDataProvider decoderDataProvider = new DecoderDataProvider();
        int nextIndex = PlayerIndexGenerator.INSTANCE.getNextIndex();
        IndexGenerator indexGenerator = this.eventIndexGenerator;
        if (indexGenerator == null) {
            indexGenerator = new SimpleIndexGenerator();
        }
        final BaseReportBuilder baseReportBuilder = reportBuilderImpl;
        final StrmManager createStrmManager = createStrmManager(strmManagerConfig, drmTypeProvider, baseReportBuilder, abConfig, decoderDataProvider, nextIndex, indexGenerator);
        SurfaceSizeProvider surfaceSizeProvider = new SurfaceSizeProvider();
        StartQualityProvider startQualityProvider = new StartQualityProvider();
        PlayerDelegateParameters PlayerDelegateParameters = PlayerDelegateParametersKt.PlayerDelegateParameters(drmTypeProvider, looper, new TrackSelectionRestrictionsProviderImpl(surfaceSizeProvider, startQualityProvider), this.videoScalingMode, new tls() { // from class: ru.yandex.video.m3.player.YandexPlayerBuilder$build$playerDelegateParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PlayerDelegateParameters.Builder builder) {
                builder.setReportBuilder(BaseReportBuilder.this);
                builder.setStrmEventLogger(new SafeStrmEventLogger(createStrmManager));
                builder.setUseMultiplatformBandwidthEstimator(Boolean.valueOf(abConfig.getFlags().getUseMultiplatformBandwidthEstimator()));
                builder.setUseMultiplatformBandwidthEstimatorWithPlatformSync(Boolean.valueOf(abConfig.getFlags().getUseMultiplatformBandwidthEstimatorWithPlatformSync()));
                builder.setEnableCodecTelemetryReportLogger(Boolean.valueOf(abConfig.getFlags().getEnableCodecTelemetryReportLogger()));
                builder.setCodecRecoverStrategy(abConfig.getFlags().getCodecRecoverStrategy());
                builder.setCodecRecoverStrategyAttempts(Integer.valueOf(abConfig.getFlags().getCodecRecoverStrategyAttempts()));
                builder.setShouldTryInitCodecsWithRetries(Boolean.valueOf(abConfig.getFlags().getCodecInitializationConfig().getShouldTryInitCodecsWithRetries()));
                builder.setInitCodecRetriesCount(Integer.valueOf(abConfig.getFlags().getCodecInitializationConfig().getRetriesCount()));
                builder.setUseIncrementalCodecInitTimeout(Boolean.valueOf(abConfig.getFlags().getCodecInitializationConfig().getUseIncrementalCodecInitTimeout()));
                builder.setInitCodecTimeoutMs(Long.valueOf(abConfig.getFlags().getCodecInitializationConfig().getTimeoutMs()));
                builder.setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround(Boolean.valueOf(abConfig.getFlags().getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround()));
                builder.setUseSurfaceControl(Boolean.valueOf(abConfig.getFlags().getUseSurfaceControl()));
                builder.setCodecTelemetryReportLoggerRecordsCount(Integer.valueOf(abConfig.getFlags().getCodecTelemetryReportLoggerRecordsCount()));
                builder.setModelsNeedsSetOutputSurfaceWorkaround(abConfig.getFlags().getModelsNeedsSetOutputSurfaceWorkaround());
                builder.setEnableAsyncDecoderQueue(abConfig.getFlags().getEnableAsyncDecoderQueue());
                builder.setDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease(Boolean.valueOf(abConfig.getFlags().getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade()));
                builder.setEnableUseLastBandwidthEstimate(abConfig.getFlags().getUseLastBandwidthEstimate());
                builder.setIgnoreSeekOnSamePosition$video_player_internalRelease(Boolean.valueOf(abConfig.getFlags().getIgnoreSeekOnSamePosition()));
                builder.setStuckStalledConfig$video_player_internalRelease(abConfig.getFlags().getStuckStalledEnabled() ? StuckStalledConfigKt.StuckStalledConfig(abConfig.getFlags().getStuckStalledMinimumBufferForAlertMs(), abConfig.getFlags().getStuckStalledAlarmPeriodMs(), abConfig.getFlags().getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse(), abConfig.getFlags().getStuckStalledProduceJustNonFatalErrors(), abConfig.getFlags().getStuckStalledWatchOnlySeekStalled(), (r17 & 32) != 0 ? new tls() { // from class: ru.yandex.video.m3.player.parameters.StuckStalledConfigKt$StuckStalledConfig$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((StuckStalledConfig.Builder) obj);
                        return zy11.a;
                    }

                    public final void invoke(StuckStalledConfig.Builder builder2) {
                    }
                } : null) : null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlayerDelegateParameters.Builder) obj);
                return zy11.a;
            }
        });
        FeatureConfigurator featureConfigurator = new FeatureConfigurator(abConfig);
        t26 t26Var = new t26(26, playerDelegateFactory, PlayerDelegateParameters, featureConfigurator);
        IndexGenerator indexGenerator2 = this.sourceIndexGenerator;
        if (indexGenerator2 == null) {
            indexGenerator2 = new SimpleIndexGenerator();
        }
        ExternalErrorHandler externalErrorHandler = this.externalErrorHandler;
        if (externalErrorHandler == null) {
            externalErrorHandler = new DummyExternalErrorHandler();
        }
        ike a = bvf0.a(cvw.U(jl40.a(), uyj.a));
        boolean useNewLogicForAutoPlayDecisionWhileRecover = abConfig.getFlags().getUseNewLogicForAutoPlayDecisionWhileRecover();
        boolean z2 = this.optimizeCommandExecution;
        MetricsManager metricsManager = this.metricsManager;
        if (z2) {
            yandexPlayerImpl = new OptimizedYandexPlayerImpl<>(generateVsid, nextIndex, indexGenerator2, markedExecutorService, playerStrategyFactory, metricsManager, abrPreferences, null, null, new ErrorHandlerFactoryImpl(createErrorHandlingRule, externalErrorHandler, useNewLogicForAutoPlayDecisionWhileRecover), null, createStrmManager, t26Var, surfaceSizeProvider, startQualityProvider, this.experimentalDoAutoPlayLogicInsidePlayer, decoderDataProvider, featureConfigurator, abConfig, this.mediaDrmCallbackDelegateFactory, abConfig.getFlags().getPerformPlayerReleaseOnScope(), a, 1408, null);
        } else {
            yandexPlayerImpl = new YandexPlayerImpl<>(generateVsid, nextIndex, indexGenerator2, markedExecutorService, playerStrategyFactory, metricsManager, this.synchronizedMode, abrPreferences, null, null, new ErrorHandlerFactoryImpl(createErrorHandlingRule, externalErrorHandler, useNewLogicForAutoPlayDecisionWhileRecover), null, createStrmManager, t26Var, surfaceSizeProvider, startQualityProvider, baseReportBuilder, decoderDataProvider, featureConfigurator, this.mediaDrmCallbackDelegateFactory, abConfig.getFlags().getPerformPlayerReleaseOnScope(), a, 2816, null);
        }
        YandexPlayerAbConfigManager instanceOrNull$video_player_internalRelease = YandexPlayerAbConfigManager.INSTANCE.getInstanceOrNull$video_player_internalRelease();
        if (instanceOrNull$video_player_internalRelease != null) {
            instanceOrNull$video_player_internalRelease.onPlayerCreated$video_player_internalRelease(yandexPlayerImpl);
        }
        return yandexPlayerImpl;
    }

    public final YandexPlayerBuilder<H> context(Context context) {
        this.context = context;
        return this;
    }

    public final YandexPlayerBuilder<H> executorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public final YandexPlayerBuilder<H> experimentalDoAutoPlayLogicInsidePlayer(boolean value) {
        this.experimentalDoAutoPlayLogicInsidePlayer = value;
        return this;
    }

    public final YandexPlayerBuilder<H> metricsManager(MetricsManager metricsManager) {
        this.metricsManager = metricsManager;
        return this;
    }

    public final YandexPlayerBuilder<H> optimizeConcurrentCommandExecution(boolean value) {
        this.optimizeCommandExecution = value;
        return this;
    }

    public final YandexPlayerBuilder<H> playerDelegateFactory(PlayerDelegateFactory<H> playerDelegateFactory) {
        this.playerDelegateFactory = playerDelegateFactory;
        return this;
    }

    public final YandexPlayerBuilder<H> playerStrategyFactory(PlayerStrategyFactory playerStrategyFactory) {
        this.playerStrategyFactory = playerStrategyFactory;
        return this;
    }

    public final YandexPlayerBuilder<H> setEventIndexGenerator$video_player_internalRelease(IndexGenerator eventIndexGenerator) {
        this.eventIndexGenerator = eventIndexGenerator;
        return this;
    }

    public final YandexPlayerBuilder<H> setExternalErrorHandler(ExternalErrorHandler externalErrorHandler) {
        this.externalErrorHandler = externalErrorHandler;
        return this;
    }

    public final YandexPlayerBuilder<H> setMediaDrmCallbackDelegateFactory(OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory) {
        this.mediaDrmCallbackDelegateFactory = mediaDrmCallbackDelegateFactory;
        return this;
    }

    public final YandexPlayerBuilder<H> setRecoveredErrors(String value) {
        this.recoveredErrorsCsv = value;
        return this;
    }

    public final YandexPlayerBuilder<H> setServiceQuality(int quality) {
        this.defaultQuality = Integer.valueOf(quality);
        return this;
    }

    public final YandexPlayerBuilder<H> setSourceIndexGenerator$video_player_internalRelease(IndexGenerator sourceIndexGenerator) {
        this.sourceIndexGenerator = sourceIndexGenerator;
        return this;
    }

    public final YandexPlayerBuilder<H> shouldConsiderSelectedUserQuality(boolean value) {
        this.shouldConsiderSelectedUserQuality = value;
        return this;
    }

    public final YandexPlayerBuilder<H> strmManagerConfig(StrmManagerConfig config) {
        this.strmManagerConfig = config;
        return this;
    }

    public final YandexPlayerBuilder<H> synchronizedMode(boolean synchronizedMode) {
        this.synchronizedMode = synchronizedMode;
        return this;
    }

    public final void usePlayerInitThreadAsMain() {
        this.usePlayerInitThread = true;
    }

    public final YandexPlayerBuilder<H> videoScalingMode(ScalingMode mode) {
        this.videoScalingMode = mode;
        return this;
    }

    public final YandexPlayer<H> build() {
        return build$default(this, null, 1, null);
    }
}
