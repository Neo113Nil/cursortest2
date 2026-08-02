package ru.yandex.video.m3.player.impl;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lse;
import defpackage.mse;
import defpackage.ny61;
import defpackage.rg3;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uhx;
import defpackage.w511;
import defpackage.wd70;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.benchmark.MetricsManager;
import ru.yandex.video.m3.benchmark.models.MetricsMeasurement;
import ru.yandex.video.m3.benchmark.models.MetricsTimeline;
import ru.yandex.video.m3.benchmark.models.MetricsTimelineEvent;
import ru.yandex.video.m3.benchmark.models.ReadyForPlaybackMetricsEvent;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.AdParameters;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DecoderData;
import ru.yandex.video.m3.data.DelegatePlaybackParametersKt;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.DelegatePrepareParamsKt;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.PlaybackViewStateKt;
import ru.yandex.video.m3.data.PlayerAnalyticsData;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.RecoverDetailsKt;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StartQualityConstraint;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.ExternalStalled;
import ru.yandex.video.m3.data.dto.ExtraInternalStalled;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.BasePlayerStrategy;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.DependentLifecycleLoadControl;
import ru.yandex.video.m3.player.FirstPlaybackInfoKt;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.PlayerStrategyFactory;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.PreparingParamsKt;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.abr.AbrPreferences;
import ru.yandex.video.m3.player.abr.AbrPreferencesKt;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.decoder.YandexCodecManager;
import ru.yandex.video.m3.player.error_handling.ErrorHandler;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorSource;
import ru.yandex.video.m3.player.error_handling.factory.ErrorHandlerFactory;
import ru.yandex.video.m3.player.feature.FeatureConfigurator;
import ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManagerImpl;
import ru.yandex.video.m3.player.impl.decoder.YandexCodecManagerImpl;
import ru.yandex.video.m3.player.impl.skips.YandexPlayerSkipsManagerImpl;
import ru.yandex.video.m3.player.impl.source.LaunchType;
import ru.yandex.video.m3.player.impl.utils.MarkedExecutorService;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.StreamUrlValidatorImpl;
import ru.yandex.video.m3.player.impl.utils.UtilsKt;
import ru.yandex.video.m3.player.observers.InternalPlayerObserver;
import ru.yandex.video.m3.player.observers.InternalToPublicObserversAdapter;
import ru.yandex.video.m3.player.observers.PlayerStrategyToObserverAdapter;
import ru.yandex.video.m3.player.observers.StrmManagerToObserverAdapter;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager;
import ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter;
import ru.yandex.video.m3.player.tracking.AdditionalTrackingReporterImpl;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundleKt;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracking.SafeStrmEventLogger;
import ru.yandex.video.m3.player.tracking.StrmManager;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.StreamUrlValidator;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;
import ru.yandex.video.m3.player.utils.TrackInfo;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000þ\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 Ó\u0002*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006Ó\u0002Ô\u0002Õ\u0002Bç\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001c\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020$\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bB\u0010@J\u000f\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010M\u001a\u00020;2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020;2\u0006\u0010P\u001a\u00020O2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010QJ\u001d\u0010S\u001a\u00020;2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020;H\u0016¢\u0006\u0004\bU\u0010VJ\u001d\u0010Y\u001a\u00020;2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000WH\u0016¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020;2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000WH\u0016¢\u0006\u0004\b[\u0010ZJ\u0017\u0010^\u001a\u00020;2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020;2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020;H\u0016¢\u0006\u0004\ba\u0010VJ\u000f\u0010b\u001a\u00020;H\u0016¢\u0006\u0004\bb\u0010VJ\u000f\u0010c\u001a\u00020;H\u0016¢\u0006\u0004\bc\u0010VJ\u000f\u0010d\u001a\u00020;H\u0016¢\u0006\u0004\bd\u0010VJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020eH\u0016¢\u0006\u0004\bh\u0010gJ\u000f\u0010i\u001a\u00020eH\u0016¢\u0006\u0004\bi\u0010gJ\u000f\u0010j\u001a\u00020eH\u0016¢\u0006\u0004\bj\u0010gJ\u000f\u0010k\u001a\u00020eH\u0016¢\u0006\u0004\bk\u0010gJ\u0011\u0010m\u001a\u0004\u0018\u00010lH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020eH\u0016¢\u0006\u0004\bo\u0010gJ\u0011\u0010p\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bp\u0010DJ\u0011\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020$H\u0016¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020$H\u0016¢\u0006\u0004\by\u0010xJ\u0017\u0010{\u001a\u00020;2\u0006\u0010z\u001a\u00020eH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020;H\u0017¢\u0006\u0004\b}\u0010VJ\"\u0010\u0080\u0001\u001a\u00020;2\u0006\u0010~\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020;2\u0007\u0010\u0082\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0087\u0001\u001a\u00020;2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0013\u0010\u0089\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008c\u0001\u001a\u00020;2\u0007\u0010\u008b\u0001\u001a\u00020$H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020$H\u0016¢\u0006\u0005\b\u008e\u0001\u0010xJ\u001b\u0010\u0090\u0001\u001a\u00020;2\u0007\u0010\u008f\u0001\u001a\u00020$H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u008d\u0001J\u001c\u0010\u0092\u0001\u001a\u00020;2\b\u0010\u0091\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0088\u0001J\u0013\u0010\u0093\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u008a\u0001J\u0011\u0010\u0094\u0001\u001a\u00020eH\u0016¢\u0006\u0005\b\u0094\u0001\u0010gJ\u0011\u0010\u0095\u0001\u001a\u00020$H\u0016¢\u0006\u0005\b\u0095\u0001\u0010xJ\u0012\u0010\u0096\u0001\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0015\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J-\u0010¢\u0001\u001a\u00020;2\u0019\u0010¡\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u009f\u0001j\u0003` \u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0015\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001b\u0010¨\u0001\u001a\u00020;2\u0007\u0010§\u0001\u001a\u00020$H\u0016¢\u0006\u0006\b¨\u0001\u0010\u008d\u0001Jv\u0010µ\u0001\u001a\u00020;2\b\u0010ª\u0001\u001a\u00030©\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010e2\u0007\u0010¬\u0001\u001a\u00020$2\b\u0010®\u0001\u001a\u00030\u00ad\u00012\f\u0010°\u0001\u001a\u00070ej\u0003`¯\u00012\u0007\u0010±\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u00062\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010´\u0001\u001a\u00020$2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J%\u0010·\u0001\u001a\u00020;2\u0007\u0010¬\u0001\u001a\u00020$2\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001a\u0010¹\u0001\u001a\u00020O2\u0006\u0010J\u001a\u00020\u0004H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001JU\u0010¼\u0001\u001a\u00020;2\u0006\u0010P\u001a\u00020O2\u000b\b\u0002\u0010»\u0001\u001a\u0004\u0018\u00010e2\u0007\u0010¬\u0001\u001a\u00020$2\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010²\u0001\u001a\u00020\u00062\u0007\u0010´\u0001\u001a\u00020$2\u0006\u0010L\u001a\u00020KH\u0003¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0011\u0010¾\u0001\u001a\u00020;H\u0002¢\u0006\u0005\b¾\u0001\u0010VJ\u0011\u0010¿\u0001\u001a\u00020;H\u0002¢\u0006\u0005\b¿\u0001\u0010VJ\u0019\u0010c\u001a\u00020;2\u0007\u0010À\u0001\u001a\u00020$H\u0002¢\u0006\u0005\bc\u0010\u008d\u0001J\u0013\u0010Á\u0001\u001a\u00020;H\u0082@¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0011\u0010Ã\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bÃ\u0001\u0010VJ\u0011\u0010Ä\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bÄ\u0001\u0010VJ#\u0010È\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010Ç\u00012\b\u0010Æ\u0001\u001a\u00030Å\u0001H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0018\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J(\u0010Ì\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u009f\u0001j\u0005\u0018\u0001` \u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001c\u0010Ð\u0001\u001a\u00020;2\b\u0010Ï\u0001\u001a\u00030Î\u0001H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J2\u0010Ö\u0001\u001a\u00020;2\b\u0010Ó\u0001\u001a\u00030Ò\u00012\n\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\b\u0010Õ\u0001\u001a\u00030Ô\u0001H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0011\u0010Ø\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bØ\u0001\u0010VJ&\u0010Ü\u0001\u001a\u00020;2\b\u0010Ú\u0001\u001a\u00030Ù\u00012\b\u0010Û\u0001\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J&\u0010Þ\u0001\u001a\u00020;2\b\u0010Ú\u0001\u001a\u00030Ù\u00012\b\u0010Û\u0001\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010Ý\u0001J\u0011\u0010ß\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bß\u0001\u0010VJ\u0011\u0010à\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bà\u0001\u0010VJ\u001a\u0010á\u0001\u001a\u00020;2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0015\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u0001H\u0002¢\u0006\u0006\bä\u0001\u0010å\u0001J\u001f\u0010æ\u0001\u001a\u0004\u0018\u00010e2\t\u0010«\u0001\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001e\u0010ê\u0001\u001a\u00020;2\n\u0010é\u0001\u001a\u0005\u0018\u00010è\u0001H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u001b\u0010\u0095\u0001\u001a\u00020$2\u0007\u0010ì\u0001\u001a\u00020lH\u0002¢\u0006\u0006\b\u0095\u0001\u0010í\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010î\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ï\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010ð\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ñ\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010ò\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010ó\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010ô\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010õ\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010ö\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010÷\u0001R!\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010ø\u0001R\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010ù\u0001R\u001d\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010ù\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010ú\u0001R\u001d\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010ø\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010û\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010ü\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010ý\u0001R\u0015\u0010.\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010ú\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010þ\u0001R\u0019\u0010ÿ\u0001\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R#\u0010\u0082\u0002\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030Ç\u00010\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010\u0084\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00ad\u00010\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0083\u0002R$\u0010\u0086\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000W0\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010\u0088\u0002\u001a\t\u0012\u0004\u0012\u00020\\0\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0087\u0002R\u001f\u0010\u008a\u0002\u001a\n\u0012\u0005\u0012\u00030\u0089\u00020\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u0087\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0018\u0010\u008e\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008d\u0002R\u0018\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0018\u0010\u0093\u0002\u001a\u00030\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001e\u0010\u0096\u0002\u001a\t\u0012\u0004\u0012\u00020O0\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001e\u0010\u0099\u0002\u001a\t\u0012\u0004\u0012\u00028\u00000\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001a\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00028\u00000\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0018\u0010¢\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R!\u0010©\u0002\u001a\u00030¤\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002R!\u0010®\u0002\u001a\u00030ª\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0002\u0010¦\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u001b\u0010¯\u0002\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001b\u0010±\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u001b\u0010³\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010²\u0002R\u001b\u0010´\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010²\u0002R\u0019\u0010µ\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010ú\u0001R\u001b\u0010¶\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010¸\u0002R5\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\bR\u0010¹\u0002\u0012\u0005\b¼\u0002\u0010V\u001a\u0006\bº\u0002\u0010Ë\u0001\"\u0005\b»\u0002\u0010TR)\u0010¾\u0002\u001a\u0002092\u0007\u0010½\u0002\u001a\u0002098\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b¾\u0002\u0010¿\u0002\"\u0005\bÀ\u0002\u0010=R\u001a\u0010Ï\u0001\u001a\u00030Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Á\u0002R\u0017\u0010Â\u0002\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u0017\u0010Ä\u0002\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R$\u0010Ç\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010Æ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u0018\u0010Ê\u0002\u001a\u00030É\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R\u0019\u0010Ì\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010ú\u0001R\u0018\u0010P\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0002\u0010Î\u0002R\u0016\u0010:\u001a\u0002098VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R)\u0010Ò\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u009f\u0001j\u0003` \u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÑ\u0002\u0010Í\u0001¨\u0006Ö\u0002"}, d2 = {"Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/YandexPlayer;", "", "videoSessionId", "", "playerIndex", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "Lru/yandex/video/m3/player/impl/utils/MarkedExecutorService;", "singleThreadExecutorService", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "playerStrategyFactory", "Lru/yandex/video/m3/benchmark/MetricsManager;", "metricsManager", "Lru/yandex/video/m3/player/abr/AbrPreferences;", "abrPreferences", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "surfaceSizeHolderInternal", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "concurrentStateManager", "Lru/yandex/video/m3/player/error_handling/factory/ErrorHandlerFactory;", "errorHandlerFactory", "Lru/yandex/video/m3/player/utils/StreamUrlValidator;", "streamUrlValidator", "Lru/yandex/video/m3/player/tracking/StrmManager;", "strmManager", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegateSupplier", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeConsumer", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualityConsumer", "", "experimentalDoAutoPlayLogicInsidePlayer", "Lru/yandex/video/m3/data/DecoderData;", "decoderDataSupplier", "Lru/yandex/video/m3/player/feature/FeatureConfigurator;", "featureConfigurator", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "performPlayerReleaseOnScope", "Ltse;", "playerCoroutineScope", "<init>", "(Ljava/lang/String;ILru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/player/impl/utils/MarkedExecutorService;Lru/yandex/video/m3/player/PlayerStrategyFactory;Lru/yandex/video/m3/benchmark/MetricsManager;Lru/yandex/video/m3/player/abr/AbrPreferences;Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;Lru/yandex/video/m3/player/error_handling/factory/ErrorHandlerFactory;Lru/yandex/video/m3/player/utils/StreamUrlValidator;Lru/yandex/video/m3/player/tracking/StrmManager;Lru/yandex/video/m3/player/provider/Supplier;Lru/yandex/video/m3/player/provider/Consumer;Lru/yandex/video/m3/player/provider/Consumer;ZLru/yandex/video/m3/player/provider/Supplier;Lru/yandex/video/m3/player/feature/FeatureConfigurator;Lru/yandex/video/m3/ab/config/AbConfig;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;ZLtse;)V", "Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "getSkipsManager", "()Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "getCodecManager", "()Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "Lzy11;", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lru/yandex/video/m3/player/tracks/Track;", "getAudioTrack", "()Lru/yandex/video/m3/player/tracks/Track;", "getVideoTrack", "getSubtitlesTrack", "getVideoSessionId", "()Ljava/lang/String;", "getPlayerIndex", "()I", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "contentId", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "prepare", "(Ljava/lang/String;Lru/yandex/video/m3/data/PlaybackParameters;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/data/PlaybackParameters;)V", "playerDelegate", "connectTo", "(Lru/yandex/video/m3/player/PlayerDelegate;)V", "disconnectFromCurrentDelegate", "()V", "Lru/yandex/video/m3/player/PlayerObserver;", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerObserver;)V", "removeObserver", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "analyticsObserver", "addAnalyticsObserver", "(Lru/yandex/video/m3/player/PlayerAnalyticsObserver;)V", "removeAnalyticsObserver", "play", "pause", "stop", "stopKeepingDecoders", "", "getPosition", "()J", "getBufferedPosition", "getLiveEdgePosition", "getTimelineLeftEdge", "getContentDuration", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "getAvailableWindowDuration", "getVideoContentId", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "isPlaying", "()Z", "isPlayingAd", "position", "seekTo", "(J)V", "release", "surfaceWidth", "surfaceHeight", "setSurfaceSize", "(II)V", "quality", "setServiceQuality", "(I)V", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "muted", "setMuted", "(Z)V", "isMuted", "handleAudioFocus", "setHandleAudioFocus", "speed", "setPlaybackSpeed", "getPlaybackSpeed", "getLiveOffset", "isInLive", "getHidedPlayer", "()Ljava/lang/Object;", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "getAdditionalTrackingReporter", "()Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "extraParameters", "appendAdditionalParameters", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "isFullscreen", "notifyFullscreenModeChanged", "Lru/yandex/video/m3/player/impl/source/LaunchType;", "launchType", "startPosition", "autoPlay", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "Lru/yandex/video/m3/data/Milliseconds;", "prepareStartTime", "prepareIndex", "sourceIndex", "expandedManifestUrl", "disableAudioFromStart", "prepareInExecutor", "(Lru/yandex/video/m3/player/impl/source/LaunchType;Ljava/lang/Long;ZLru/yandex/video/m3/player/PreparingParams;JIILjava/lang/String;ZLru/yandex/video/m3/data/PlaybackParameters;)V", "callOnPrepareStartCallbacks", "(ZLru/yandex/video/m3/player/PreparingParams;)V", "requestVideoData", "(Ljava/lang/String;)Lru/yandex/video/m3/data/dto/VideoData;", "userAskedStartPosition", "prepareDelegate", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;ZLjava/lang/String;IZLru/yandex/video/m3/data/PlaybackParameters;)V", "internalPlay", "internalPause", "keepDecoders", "releaseInternalSuspend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonReleaseBlock", "executorReleaseBlock", "Ljava/lang/Runnable;", "runnable", "Ljava/util/concurrent/Future;", "submitTask", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "getPlayerDelegate", "()Lru/yandex/video/m3/player/PlayerDelegate;", "getCurrentAdditionalParametersCopy", "()Ljava/util/Map;", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "fullscreenDataBundle", "notifyFullscreenInfoUpdated", "(Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;)V", "", "throwable", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "errorSource", "notifyPlaybackError", "(Ljava/lang/Throwable;Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)V", "updateTrack", "Lru/yandex/video/m3/player/utils/TrackInfo;", "oldVideoTrackInfo", "newVideoTrackInfo", "tryUpdateAesthetePreference", "(Lru/yandex/video/m3/player/utils/TrackInfo;Lru/yandex/video/m3/player/utils/TrackInfo;)V", "tryUpdateUserQuality", "notifyLoadingStart", "notifyLoadingFinished", "notifyVideoDataPrepared", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "getStartFromCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "validateStartPosition", "(Ljava/lang/Long;)Ljava/lang/Long;", "Lru/yandex/video/m3/data/StartQualityConstraint;", "startQualityConstraint", "setStartQualityConstraint", "(Lru/yandex/video/m3/data/StartQualityConstraint;)V", "stats", "(Lru/yandex/video/m3/data/PlaybackStats;)Z", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/player/impl/utils/MarkedExecutorService;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "Lru/yandex/video/m3/player/abr/AbrPreferences;", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "Lru/yandex/video/m3/player/utils/StreamUrlValidator;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/Consumer;", "Z", "Lru/yandex/video/m3/player/feature/FeatureConfigurator;", "Lru/yandex/video/m3/ab/config/AbConfig;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "Ltse;", "releaseTimestamp", "J", "Ljava/util/concurrent/atomic/AtomicReference;", "prepareFuture", "Ljava/util/concurrent/atomic/AtomicReference;", "prepareParams", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observers", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "analyticsObservers", "Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "internalObservers", "Ljava/util/concurrent/atomic/AtomicInteger;", "prepareStartCallCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "bufferingStartCallCount", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstPlaybackReady", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/yandex/video/m3/player/tracking/SafeStrmEventLogger;", "safeLogger", "Lru/yandex/video/m3/player/tracking/SafeStrmEventLogger;", "Lru/yandex/video/m3/player/PlayerStrategy;", "playerStrategy", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "errorHandler", "Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "metricsTimeline", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl$PlayerDelegateObserverImpl;", "playerDelegateObserver", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl$PlayerDelegateObserverImpl;", "Lru/yandex/video/m3/player/impl/StalledReasonManager;", "stalledReasonManager", "Lru/yandex/video/m3/player/impl/StalledReasonManager;", "Lmse;", "releaseCoroutineExceptionHandler$delegate", "Li3y;", "getReleaseCoroutineExceptionHandler", "()Lmse;", "releaseCoroutineExceptionHandler", "Lg050;", "mutex$delegate", "getMutex", "()Lg050;", "mutex", "videoDataInternal", "Lru/yandex/video/m3/data/dto/VideoData;", "audioTrack", "Lru/yandex/video/m3/player/tracks/Track;", "videoTrack", "subtitlesTrack", "trackPrepared", "isLastPrepareAutoPlay", "Ljava/lang/Boolean;", "Lru/yandex/video/m3/data/StartQualityConstraint;", "Lru/yandex/video/m3/player/PlayerDelegate;", "getPlayerDelegate$video_player_internalRelease", "setPlayerDelegate$video_player_internalRelease", "getPlayerDelegate$video_player_internalRelease$annotations", "value", "repeatModeInternal", "Lru/yandex/video/m3/player/RepeatMode;", "setRepeatModeInternal", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "skipsManager", "Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "decoderManager", "Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "Ljava/util/concurrent/ConcurrentHashMap;", "playerAdditionalParametersInternal", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "externalPlayWhenReady", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "getPlayerAdditionalParameters", "playerAdditionalParameters", "Companion", "PlayerDelegateObserverImpl", "PlayerPlaybackErrorNotifyingImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OptimizedYandexPlayerImpl<H> implements YandexPlayer<H> {
    private static final String INCORRECT_STREAMURL_MESSAGE = "В качестве streamUrl использована некорректная для воспроизведения ссылка. Подробнее: https://nda.ya.ru/t/J-AG3_CM5oCTgJ";
    private static final String LOG_TAG = "YP:OpYandexPlayerImpl";
    private final AbConfig abConfig;
    private final AbrPreferences abrPreferences;
    private final ObserverDispatcher<PlayerAnalyticsObserver> analyticsObservers;
    private volatile Track audioTrack;
    private final AtomicInteger bufferingStartCallCount;
    private final ConcurrentPlayerStateManager concurrentStateManager;
    private final Supplier<DecoderData> decoderDataSupplier;
    private final YandexCodecManager decoderManager;
    private final ErrorHandler<H> errorHandler;
    private final boolean experimentalDoAutoPlayLogicInsidePlayer;
    private volatile boolean externalPlayWhenReady;
    private final FeatureConfigurator featureConfigurator;
    private final AtomicBoolean firstPlaybackReady;
    private FullscreenDataBundle fullscreenDataBundle;
    private final ObserverDispatcher<InternalPlayerObserver> internalObservers;
    private volatile Boolean isLastPrepareAutoPlay;
    private final TimberPlayerLogger logger;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final MetricsTimeline metricsTimeline;

    /* renamed from: mutex$delegate, reason: from kotlin metadata */
    private final i3y mutex;
    private final ObserverDispatcher<PlayerObserver<H>> observers;
    private final boolean performPlayerReleaseOnScope;
    private final ConcurrentHashMap<String, Object> playerAdditionalParametersInternal;
    private final tse playerCoroutineScope;
    private volatile PlayerDelegate<H> playerDelegate;
    private final PlayerDelegateObserverImpl<H> playerDelegateObserver;
    private final Supplier<PlayerDelegate<H>> playerDelegateSupplier;
    private final int playerIndex;
    private final PlayerStrategy<VideoData> playerStrategy;
    private final PlayerStrategyFactory playerStrategyFactory;
    private final AtomicReference<Future<?>> prepareFuture;
    private final AtomicReference<PreparingParams> prepareParams;
    private final AtomicInteger prepareStartCallCount;

    /* renamed from: releaseCoroutineExceptionHandler$delegate, reason: from kotlin metadata */
    private final i3y releaseCoroutineExceptionHandler;
    private volatile long releaseTimestamp;
    private RepeatMode repeatModeInternal;
    private final SafeStrmEventLogger safeLogger;
    private final MarkedExecutorService singleThreadExecutorService;
    private final YandexPlayerSkipsManager skipsManager;
    private final IndexGenerator sourceIndexGenerator;
    private final StalledReasonManager stalledReasonManager;
    private volatile StartQualityConstraint startQualityConstraint;
    private final Consumer<StartQuality> startQualityConsumer;
    private final StreamUrlValidator streamUrlValidator;
    private final StrmManager strmManager;
    private volatile Track subtitlesTrack;
    private final Consumer<SurfaceSize> surfaceSizeConsumer;
    private final SurfaceSizeHolderInternal surfaceSizeHolderInternal;
    private volatile boolean trackPrepared;
    private volatile VideoData videoDataInternal;
    private final String videoSessionId;
    private volatile Track videoTrack;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl$PlayerPlaybackErrorNotifyingImpl;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;", "player", "<init>", "(Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lzy11;", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerPlaybackErrorNotifyingImpl<H> implements PlayerPlaybackErrorNotifying {
        public static final int $stable = 8;
        private final OptimizedYandexPlayerImpl<H> player;

        public PlayerPlaybackErrorNotifyingImpl(OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl) {
            this.player = optimizedYandexPlayerImpl;
        }

        @Override // ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying
        public void onPlaybackError(PlaybackException playbackException) {
            OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl = this.player;
            optimizedYandexPlayerImpl.notifyPlaybackError(playbackException, null, new ErrorSource.Strategy(((OptimizedYandexPlayerImpl) optimizedYandexPlayerImpl).externalPlayWhenReady));
        }
    }

    public OptimizedYandexPlayerImpl(String str, int i, IndexGenerator indexGenerator, MarkedExecutorService markedExecutorService, PlayerStrategyFactory playerStrategyFactory, MetricsManager metricsManager, AbrPreferences abrPreferences, SurfaceSizeHolderInternal surfaceSizeHolderInternal, ConcurrentPlayerStateManager concurrentPlayerStateManager, ErrorHandlerFactory<H> errorHandlerFactory, StreamUrlValidator streamUrlValidator, StrmManager strmManager, Supplier<PlayerDelegate<H>> supplier, Consumer<SurfaceSize> consumer, Consumer<StartQuality> consumer2, boolean z, Supplier<DecoderData> supplier2, FeatureConfigurator featureConfigurator, AbConfig abConfig, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, boolean z2, tse tseVar) {
        this.videoSessionId = str;
        this.playerIndex = i;
        this.sourceIndexGenerator = indexGenerator;
        this.singleThreadExecutorService = markedExecutorService;
        this.playerStrategyFactory = playerStrategyFactory;
        this.abrPreferences = abrPreferences;
        this.surfaceSizeHolderInternal = surfaceSizeHolderInternal;
        this.concurrentStateManager = concurrentPlayerStateManager;
        this.streamUrlValidator = streamUrlValidator;
        this.strmManager = strmManager;
        this.playerDelegateSupplier = supplier;
        this.surfaceSizeConsumer = consumer;
        this.startQualityConsumer = consumer2;
        this.experimentalDoAutoPlayLogicInsidePlayer = z;
        this.decoderDataSupplier = supplier2;
        this.featureConfigurator = featureConfigurator;
        this.abConfig = abConfig;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.performPlayerReleaseOnScope = z2;
        this.playerCoroutineScope = tseVar;
        this.prepareFuture = new AtomicReference<>();
        this.prepareParams = new AtomicReference<>(null);
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = new ObserverDispatcher<>();
        this.observers = observerDispatcher;
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = new ObserverDispatcher<>();
        this.analyticsObservers = observerDispatcher2;
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher3 = new ObserverDispatcher<>();
        this.internalObservers = observerDispatcher3;
        this.prepareStartCallCount = new AtomicInteger(0);
        this.bufferingStartCallCount = new AtomicInteger(0);
        this.firstPlaybackReady = new AtomicBoolean(false);
        SafeStrmEventLogger safeStrmEventLogger = new SafeStrmEventLogger(strmManager);
        this.safeLogger = safeStrmEventLogger;
        PlayerStrategy<VideoData> create = playerStrategyFactory.create(this, new PlayerPlaybackErrorNotifyingImpl(this), safeStrmEventLogger);
        BasePlayerStrategy basePlayerStrategy = create instanceof BasePlayerStrategy ? (BasePlayerStrategy) create : null;
        if (basePlayerStrategy != null) {
            basePlayerStrategy.setExperimentalDoAutoPlayLogicInsidePlayer$video_player_internalRelease(z);
        }
        this.playerStrategy = create;
        ErrorHandler<H> create2 = errorHandlerFactory.create(create, concurrentPlayerStateManager);
        this.errorHandler = create2;
        MetricsTimeline makeTimeline = metricsManager != null ? metricsManager.makeTimeline() : null;
        this.metricsTimeline = makeTimeline;
        this.playerDelegateObserver = new PlayerDelegateObserverImpl<>(this, create, metricsManager, makeTimeline);
        StalledReasonManager stalledReasonManager = new StalledReasonManager();
        stalledReasonManager.start(this);
        this.stalledReasonManager = stalledReasonManager;
        this.releaseCoroutineExceptionHandler = kotlin.a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseCoroutineExceptionHandler$2
            @Override // defpackage.sls
            public final mse invoke() {
                return new OptimizedYandexPlayerImpl$releaseCoroutineExceptionHandler$2$invoke$$inlined$CoroutineExceptionHandler$1(lse.a);
            }
        });
        this.mutex = kotlin.a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$mutex$2
            @Override // defpackage.sls
            public final g050 invoke() {
                return gtq0.a();
            }
        });
        this.repeatModeInternal = RepeatMode.None.INSTANCE;
        this.fullscreenDataBundle = FullscreenDataBundleKt.FullscreenDataBundle$default(null, surfaceSizeHolderInternal.getSurfaceHeight$video_player_internalRelease(), surfaceSizeHolderInternal.getSurfaceWidth$video_player_internalRelease(), null, 8, null);
        this.skipsManager = new YandexPlayerSkipsManagerImpl(observerDispatcher2);
        this.decoderManager = new YandexCodecManagerImpl(new uhx(28, this));
        this.playerAdditionalParametersInternal = new ConcurrentHashMap<>();
        this.logger = new TimberPlayerLogger();
        if (!(markedExecutorService.getDelegate() instanceof ThreadPoolExecutor) || ((ThreadPoolExecutor) markedExecutorService.getDelegate()).getMaximumPoolSize() > 1) {
            ny61.g("singleThreadExecutorService was specified incorrectly!");
            throw null;
        }
        surfaceSizeHolderInternal.setSurfaceSizeConsumer(consumer);
        Integer defaultQuality = abrPreferences.getDefaultQuality();
        if (defaultQuality != null) {
            surfaceSizeHolderInternal.setServiceQuality(defaultQuality.intValue());
        }
        surfaceSizeHolderInternal.setPreferHD(abrPreferences.getAesthetePreferenceProvider().getPreferHD());
        Integer lastUserSelectedVideoHeightPx = abrPreferences.getUserQualityRepository().getLastUserSelectedVideoHeightPx();
        if (lastUserSelectedVideoHeightPx != null) {
            surfaceSizeHolderInternal.setUserQuality(Integer.valueOf(lastUserSelectedVideoHeightPx.intValue()));
        }
        create2.attachTo(this);
        observerDispatcher3.add((ObserverDispatcher<InternalPlayerObserver>) new StrmManagerToObserverAdapter(this, strmManager));
        observerDispatcher3.add((ObserverDispatcher<InternalPlayerObserver>) new PlayerStrategyToObserverAdapter(this, create));
        observerDispatcher3.add((ObserverDispatcher<InternalPlayerObserver>) new InternalToPublicObserversAdapter(this, observerDispatcher, observerDispatcher2));
    }

    private final void callOnPrepareStartCallbacks(boolean autoPlay, PreparingParams preparingParams) {
        HashSet H0;
        HashSet H02;
        HashSet H03;
        HashSet H04;
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((InternalPlayerObserver) it.next()).onPreparingInternal(preparingParams, getPlayerAdditionalParameters());
                failure4 = zy11.a;
            } catch (Throwable th) {
                failure4 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure4);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        PreparingParams copy = preparingParams.copy(new tls(this) { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$callOnPrepareStartCallbacks$fullPreparingParams$1
            final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            public final void invoke(PreparingParams.Builder builder) {
                Map<String, ? extends Object> currentAdditionalParametersCopy;
                currentAdditionalParametersCopy = this.this$0.getCurrentAdditionalParametersCopy();
                builder.setAdditionalParams(currentAdditionalParametersCopy);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PreparingParams.Builder) obj);
                return zy11.a;
            }
        });
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it2.next()).onPreparingStarted(copy);
                failure3 = zy11.a;
            } catch (Throwable th2) {
                failure3 = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure3);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher3 = this.analyticsObservers;
        synchronized (observerDispatcher3.getObservers()) {
            H03 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
        }
        Iterator it3 = H03.iterator();
        while (it3.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it3.next()).onUserManuallySelectedQuality(this.abrPreferences.getUserQualityRepository().getLastUserSelectedVideoHeightPx());
                failure2 = zy11.a;
            } catch (Throwable th3) {
                failure2 = new Result.Failure(th3);
            }
            Throwable a3 = Result.a(failure2);
            if (a3 != null) {
                h5z0.a.f(a3, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher4 = this.observers;
        synchronized (observerDispatcher4.getObservers()) {
            H04 = kotlin.collections.a.H0(observerDispatcher4.getObservers());
        }
        Iterator it4 = H04.iterator();
        while (it4.hasNext()) {
            try {
                ((PlayerObserver) it4.next()).onWillPlayWhenReadyChanged(autoPlay);
                failure = zy11.a;
            } catch (Throwable th4) {
                failure = new Result.Failure(th4);
            }
            Throwable a4 = Result.a(failure);
            if (a4 != null) {
                h5z0.a.f(a4, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commonReleaseBlock() {
        DependentLifecycleLoadControl loadControl;
        try {
            PlayerDelegate<H> playerDelegate = this.playerDelegate;
            if (playerDelegate != null && (loadControl = playerDelegate.getLoadControl()) != null) {
                loadControl.release(this);
            }
        } catch (Throwable unused) {
        }
        PlayerDelegate<H> playerDelegate2 = this.playerDelegate;
        if (playerDelegate2 != null) {
            playerDelegate2.removeObserver(this.playerDelegateObserver);
        }
        try {
            PlayerDelegate<H> playerDelegate3 = this.playerDelegate;
            if (playerDelegate3 != null) {
                playerDelegate3.release();
            }
        } catch (Throwable unused2) {
        }
        this.playerDelegate = null;
        this.audioTrack = null;
        this.videoTrack = null;
        this.subtitlesTrack = null;
        setRepeatModeInternal(RepeatMode.None.INSTANCE);
        this.stalledReasonManager.stop();
        this.errorHandler.detachFromPlayer();
        MarkedExecutorService markedExecutorService = this.singleThreadExecutorService;
        if (markedExecutorService.getCreatedByPlayer()) {
            markedExecutorService.shutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerDelegate decoderManager$lambda$2(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl) {
        PlayerDelegate<H> playerDelegate = optimizedYandexPlayerImpl.playerDelegate;
        return playerDelegate == null ? optimizedYandexPlayerImpl.getPlayerDelegate() : playerDelegate;
    }

    private final void executorReleaseBlock() {
        HashSet H0;
        Object failure;
        this.releaseTimestamp = System.currentTimeMillis();
        this.playerAdditionalParametersInternal.put("releaseTimestamp", Long.valueOf(this.releaseTimestamp));
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((InternalPlayerObserver) it.next()).onPlayerReleased();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        commonReleaseBlock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getCurrentAdditionalParametersCopy() {
        Map<String, Object> currentAdditionalParameters = this.strmManager.getCurrentAdditionalParameters();
        if (currentAdditionalParameters != null) {
            return b.t(currentAdditionalParameters);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g050 getMutex() {
        return (g050) this.mutex.getValue();
    }

    private final Map<String, Object> getPlayerAdditionalParameters() {
        return b.t(this.playerAdditionalParametersInternal);
    }

    private final synchronized PlayerDelegate<H> getPlayerDelegate() {
        PlayerDelegate<H> playerDelegate;
        try {
            playerDelegate = this.playerDelegate;
            if (playerDelegate == null) {
                PlayerDelegate<H> value = this.playerDelegateSupplier.getValue();
                PlayerDelegate<H> playerDelegate2 = value;
                playerDelegate2.addObserver(this.playerDelegateObserver);
                DependentLifecycleLoadControl loadControl = playerDelegate2.getLoadControl();
                if (loadControl != null) {
                    loadControl.start(this);
                }
                playerDelegate2.setVideoSessionId(this.videoSessionId);
                playerDelegate2.setSourceIndex(this.concurrentStateManager.getCurrentSourceIndex());
                playerDelegate2.setRepeatMode(this.repeatModeInternal);
                this.playerDelegate = playerDelegate2;
                playerDelegate = value;
            }
        } catch (Throwable th) {
            throw th;
        }
        return playerDelegate;
    }

    public static /* synthetic */ void getPlayerDelegate$video_player_internalRelease$annotations() {
    }

    private final mse getReleaseCoroutineExceptionHandler() {
        return (mse) this.releaseCoroutineExceptionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartFromCacheInfo getStartFromCacheInfo() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getStartCacheInfo();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalPause() {
        HashSet H0;
        Object failure;
        if (this.concurrentStateManager.isActive()) {
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onPauseCommand();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            this.externalPlayWhenReady = false;
            PlayerDelegate<H> playerDelegate = this.playerDelegate;
            if (playerDelegate != null) {
                playerDelegate.pause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalPlay() {
        HashSet H0;
        Object failure;
        if (!this.concurrentStateManager.isActive()) {
            notifyPlaybackError(new PlaybackException.ErrorNoPrepare(), null, ErrorSource.Player.INSTANCE);
            return;
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onPlayCommand();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        this.externalPlayWhenReady = true;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInLive(PlaybackStats stats) {
        return (stats.getVideoType() == VideoType.EVENT || stats.getVideoType() == VideoType.LIVE) && stats.getIsPlaying() && stats.getLiveEdgePosition() - stats.getPlaybackPosition() < 10000;
    }

    private final void notifyFullscreenInfoUpdated(FullscreenDataBundle fullscreenDataBundle) {
        HashSet H0;
        Object failure;
        PlayerStrategy<VideoData> playerStrategy = this.playerStrategy;
        Boolean isFullscreenExternal = fullscreenDataBundle.getIsFullscreenExternal();
        playerStrategy.onFullscreenInfoUpdated(isFullscreenExternal != null ? isFullscreenExternal.booleanValue() : false);
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onFullscreenInfoUpdated(fullscreenDataBundle);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLoadingFinished() {
        HashSet H0;
        Object failure;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(LOG_TAG, "notifyLoadingFinished", "notifyLoadingFinished prepareStartCallCount=" + this.prepareStartCallCount.get() + " bufferingStartCallCount=" + this.bufferingStartCallCount.get(), new Object[0]);
        }
        if (this.bufferingStartCallCount.get() + this.prepareStartCallCount.get() == 0) {
            ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onLoadingFinished();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLoadingStart() {
        HashSet H0;
        HashSet H02;
        HashSet H03;
        Object failure;
        Object failure2;
        Object failure3;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(LOG_TAG, "notifyLoadingStart", "notifyLoadingStart prepareStartCallCount=" + this.prepareStartCallCount.get() + " bufferingStartCallCount=" + this.bufferingStartCallCount.get(), new Object[0]);
        }
        if (this.bufferingStartCallCount.get() + this.prepareStartCallCount.get() == 1) {
            ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onLoadingStart();
                    failure3 = zy11.a;
                } catch (Throwable th) {
                    failure3 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure3);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            StalledReason stalledReason = this.stalledReasonManager.getStalledReason();
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onLoadingStart(this.stalledReasonManager.getStalledReasonWithExplanation$video_player_internalRelease());
                    failure2 = zy11.a;
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure2);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher3 = this.analyticsObservers;
            synchronized (observerDispatcher3.getObservers()) {
                H03 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
            }
            Iterator it3 = H03.iterator();
            while (it3.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it3.next()).onLoadingStart(stalledReason);
                    failure = zy11.a;
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
                Throwable a3 = Result.a(failure);
                if (a3 != null) {
                    h5z0.a.f(a3, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPlaybackError(Throwable throwable, final PreparingParams preparingParams, ErrorSource errorSource) {
        HashSet H0;
        Object failure;
        HashSet H02;
        HashSet H03;
        Object failure2;
        Object failure3;
        HashSet H04;
        HashSet H05;
        Object failure4;
        Object failure5;
        PlaybackException playbackException = throwable instanceof PlaybackException ? (PlaybackException) throwable : null;
        if (playbackException == null) {
            playbackException = new PlaybackException.ErrorGeneric(throwable);
        }
        RecoverDetails RecoverDetails = RecoverDetailsKt.RecoverDetails(this.externalPlayWhenReady, new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$notifyPlaybackError$2$recoverDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(RecoverDetails.Builder builder) {
                builder.setPreparingParams(PreparingParams.this);
                builder.setPlaybackStats(this.getPlaybackStats());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RecoverDetails.Builder) obj);
                return zy11.a;
            }
        });
        ErrorHandlingResult handleException = this.errorHandler.handleException(playbackException, preparingParams, errorSource);
        if (handleException instanceof ErrorHandlingResult.NotHandled) {
            this.concurrentStateManager.setStopped(true);
            PlayerDelegate<H> playerDelegate = this.playerDelegate;
            if (playerDelegate != null) {
                playerDelegate.stop(false);
            }
            ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
            synchronized (observerDispatcher.getObservers()) {
                H04 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H04.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackError(playbackException);
                    failure5 = zy11.a;
                } catch (Throwable th) {
                    failure5 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure5);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            if (this.prepareStartCallCount.get() == 0 && this.bufferingStartCallCount.get() == 1) {
                this.bufferingStartCallCount.set(0);
                notifyLoadingFinished();
            }
            ObserverDispatcher<PlayerObserver<H>> observerDispatcher2 = this.observers;
            synchronized (observerDispatcher2.getObservers()) {
                H05 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H05.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerObserver) it2.next()).onWillPlayWhenReadyChanged(false);
                    failure4 = zy11.a;
                } catch (Throwable th2) {
                    failure4 = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure4);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
            return;
        }
        if (!(handleException instanceof ErrorHandlingResult.Handled ? true : handleException instanceof ErrorHandlingResult.HandledByStrategy ? true : handleException instanceof ErrorHandlingResult.HandledByExternalErrorHandler)) {
            if (handleException instanceof ErrorHandlingResult.Ignored) {
                ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher3 = this.analyticsObservers;
                synchronized (observerDispatcher3.getObservers()) {
                    H0 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
                }
                Iterator it3 = H0.iterator();
                while (it3.hasNext()) {
                    try {
                        ((PlayerAnalyticsObserver) it3.next()).onNonFatalPlaybackException(playbackException, ((ErrorHandlingResult.Ignored) handleException).getMessage());
                        failure = zy11.a;
                    } catch (Throwable th3) {
                        failure = new Result.Failure(th3);
                    }
                    Throwable a3 = Result.a(failure);
                    if (a3 != null) {
                        h5z0.a.f(a3, "notifyObservers", new Object[0]);
                    }
                }
                return;
            }
            return;
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher4 = this.analyticsObservers;
        synchronized (observerDispatcher4.getObservers()) {
            H02 = kotlin.collections.a.H0(observerDispatcher4.getObservers());
        }
        Iterator it4 = H02.iterator();
        while (it4.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it4.next()).onPlayerWillTryRecoverAfterError(playbackException, RecoverDetails);
                failure3 = zy11.a;
            } catch (Throwable th4) {
                failure3 = new Result.Failure(th4);
            }
            Throwable a4 = Result.a(failure3);
            if (a4 != null) {
                h5z0.a.f(a4, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher5 = this.analyticsObservers;
        synchronized (observerDispatcher5.getObservers()) {
            H03 = kotlin.collections.a.H0(observerDispatcher5.getObservers());
        }
        Iterator it5 = H03.iterator();
        while (it5.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it5.next()).onNonFatalPlaybackException(playbackException);
                failure2 = zy11.a;
            } catch (Throwable th5) {
                failure2 = new Result.Failure(th5);
            }
            Throwable a5 = Result.a(failure2);
            if (a5 != null) {
                h5z0.a.f(a5, "notifyObservers", new Object[0]);
            }
        }
    }

    private final void notifyVideoDataPrepared(VideoData videoData) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onVideoDataPrepared(videoData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$13(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl, String str, Long l, boolean z, PreparingParams preparingParams, long j, ConcurrentPlayerStateManager.Indices indices, boolean z2, PlaybackParameters playbackParameters) {
        optimizedYandexPlayerImpl.prepareInExecutor(new LaunchType.ByContentId(str), l, z, preparingParams, j, indices.getPrepareIndex(), indices.getSourceIndex(), null, z2, playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$17(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl, VideoData videoData, Long l, boolean z, PreparingParams preparingParams, long j, ConcurrentPlayerStateManager.Indices indices, String str, boolean z2, PlaybackParameters playbackParameters) {
        optimizedYandexPlayerImpl.prepareInExecutor(new LaunchType.ByVideoData(videoData), l, z, preparingParams, j, indices.getPrepareIndex(), indices.getSourceIndex(), str, z2, playbackParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    private final void prepareDelegate(VideoData videoData, Long userAskedStartPosition, final boolean autoPlay, String expandedManifestUrl, int sourceIndex, boolean disableAudioFromStart, final PlaybackParameters playbackParameters) throws PlaybackException {
        boolean z;
        boolean z2;
        int i;
        Long l;
        String str;
        boolean z3;
        HashSet H0;
        Object failure;
        HashSet H02;
        HashSet H03;
        Object failure2;
        Object failure3;
        boolean prepareWithoutInitCodecs = playbackParameters.getPrepareWithoutInitCodecs();
        boolean preferredH264 = playbackParameters.getPreferredH264();
        DrmParameters drmParameters = playbackParameters.getDrmParameters();
        final DataSourceParameters manifestDataSourceParameters = playbackParameters.getManifestDataSourceParameters();
        final DataSourceParameters chunkDataSourceParameters = playbackParameters.getChunkDataSourceParameters();
        boolean isOffline = playbackParameters.getIsOffline();
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        MetricsTimeline metricsTimeline = this.metricsTimeline;
        if (metricsTimeline != null) {
            metricsTimeline.mark(MetricsTimelineEvent.START_PREPARE);
        }
        this.firstPlaybackReady.set(false);
        Long startPosition = this.playerStrategy.getStartPosition(userAskedStartPosition, videoData);
        this.videoDataInternal = videoData;
        this.trackPrepared = false;
        PlayerStrategy<VideoData> playerStrategy = this.playerStrategy;
        BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
        String contentId = basePlayerStrategy != null ? basePlayerStrategy.getContentId(videoData) : null;
        if (expandedManifestUrl == null) {
            i = 0;
            z2 = preferredH264;
            z = prepareWithoutInitCodecs;
            l = startPosition;
            str = this.strmManager.expandManifestUrl(this.videoSessionId, videoData, contentId, startPosition != null ? startPosition.longValue() : -9223372036854775807L, autoPlay, sourceIndex, isOffline);
        } else {
            z = prepareWithoutInitCodecs;
            z2 = preferredH264;
            i = 0;
            l = startPosition;
            str = expandedManifestUrl;
        }
        this.featureConfigurator.updateFeaturesByUri(str);
        if (this.playerDelegate == null) {
            this.playerDelegate = getPlayerDelegate();
        }
        setStartQualityConstraint(this.startQualityConstraint);
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setSourceIndex(this.concurrentStateManager.getCurrentSourceIndex());
            this.audioTrack = this.playerStrategy.prepareTrack(playerDelegate, TrackType.Audio, videoData);
            this.subtitlesTrack = this.playerStrategy.prepareTrack(playerDelegate, TrackType.Subtitles, videoData);
            this.videoTrack = this.playerStrategy.prepareTrack(playerDelegate, TrackType.Video, videoData);
            Track track = this.audioTrack;
            if (track != null) {
                if (disableAudioFromStart) {
                    track.selectTrack(new TrackVariant.Disable("", i, i));
                } else {
                    track.selectTrack(new TrackVariant.PreferredTrackVariant(videoData.getAudioLanguage()));
                }
            }
            Track track2 = this.subtitlesTrack;
            if (track2 != null) {
                track2.selectTrack(new TrackVariant.PreferredTrackVariant(videoData.getSubtitleLanguage()));
            }
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadSource(str);
                    failure3 = zy11.a;
                } catch (Throwable th) {
                    failure3 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure3);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[i]);
                }
            }
            if (drmParameters != null) {
                playerDelegate.prepareDrm(OttMediaDrmCallbackDelegateKt.prepareDrm(this.mediaDrmCallbackDelegateFactory, drmParameters));
            } else {
                playerDelegate.prepareDrm(this.playerStrategy.prepareDrm(videoData));
            }
            final boolean z4 = z2;
            final boolean z5 = z;
            z3 = autoPlay;
            playerDelegate.prepare(DelegatePlaybackParametersKt.DelegatePlaybackParameters$default(str, l, null, 4, null), DelegatePrepareParamsKt.DelegatePrepareParams(new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$prepareDelegate$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(DelegatePrepareParams.Builder builder) {
                    builder.m737setPrepareWithoutInitCodecs(Boolean.valueOf(z5 && !autoPlay));
                    builder.m736setPreferredH264(Boolean.valueOf(z4));
                    builder.setManifestDataSourceParameters(manifestDataSourceParameters);
                    builder.setChunkDataSourceParameters(chunkDataSourceParameters);
                    builder.setPlaybackParameters(playbackParameters);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DelegatePrepareParams.Builder) obj);
                    return zy11.a;
                }
            }));
            H extractPlayer = playerDelegate.extractPlayer(this);
            ObserverDispatcher<PlayerObserver<H>> observerDispatcher2 = this.observers;
            synchronized (observerDispatcher2.getObservers()) {
                H03 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H03.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerObserver) it2.next()).onHidedPlayerReady(extractPlayer);
                    failure2 = zy11.a;
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure2);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[i]);
                }
            }
        } else {
            z3 = autoPlay;
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (this.experimentalDoAutoPlayLogicInsidePlayer) {
            if (z3) {
                internalPlay();
            } else {
                internalPause();
            }
        }
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher3 = this.internalObservers;
        synchronized (observerDispatcher3.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
        }
        Iterator it3 = H0.iterator();
        while (it3.hasNext()) {
            try {
                ((InternalPlayerObserver) it3.next()).onPreparedInternal(videoData, l, z3);
                failure = zy11.a;
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
            Throwable a3 = Result.a(failure);
            if (a3 != null) {
                h5z0.a.f(a3, "notifyObservers", new Object[i]);
            }
        }
        notifyFullscreenInfoUpdated(this.fullscreenDataBundle);
    }

    public static /* synthetic */ void prepareDelegate$default(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl, VideoData videoData, Long l, boolean z, String str, int i, boolean z2, PlaybackParameters playbackParameters, int i2, Object obj) throws PlaybackException {
        if ((i2 & 2) != 0) {
            l = null;
        }
        optimizedYandexPlayerImpl.prepareDelegate(videoData, l, z, str, i, z2, playbackParameters);
    }

    private final void prepareInExecutor(LaunchType launchType, Long startPosition, boolean autoPlay, PreparingParams preparingParams, long prepareStartTime, int prepareIndex, int sourceIndex, String expandedManifestUrl, boolean disableAudioFromStart, PlaybackParameters playbackParameters) {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        HashSet H0;
        HashSet H02;
        Object failure;
        Object failure2;
        VideoData data;
        try {
            try {
                this.concurrentStateManager.setStopped(false);
                this.isLastPrepareAutoPlay = Boolean.valueOf(autoPlay);
                UtilsKt.putEntry(this.playerAdditionalParametersInternal, new ExtraInternalStalled(System.currentTimeMillis() - prepareStartTime));
                callOnPrepareStartCallbacks(autoPlay, preparingParams);
                this.prepareParams.set(preparingParams);
                this.prepareStartCallCount.incrementAndGet();
                z2 = true;
                try {
                    notifyLoadingStart();
                    try {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedException();
                        }
                        if (launchType instanceof LaunchType.ByContentId) {
                            data = requestVideoData(((LaunchType.ByContentId) launchType).getContentId());
                        } else {
                            if (!(launchType instanceof LaunchType.ByVideoData)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            data = ((LaunchType.ByVideoData) launchType).getData();
                        }
                        VideoData videoData = data;
                        if (!this.streamUrlValidator.isValid(videoData.getManifestUrl())) {
                            throw new PlaybackException.ErrorPreparing.InvalidStreamUrl(new Throwable(INCORRECT_STREAMURL_MESSAGE));
                        }
                        notifyVideoDataPrepared(videoData);
                        prepareDelegate(videoData, validateStartPosition(startPosition), autoPlay, expandedManifestUrl, sourceIndex, disableAudioFromStart, playbackParameters);
                        try {
                            this.prepareStartCallCount.decrementAndGet();
                            notifyLoadingFinished();
                        } catch (Exception e) {
                            PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e, null, new Object[0], 8, null);
                        }
                    } catch (InterruptedException unused) {
                        z7 = true;
                        PlaybackException errorPlayerReleased = this.concurrentStateManager.getIsReleased() ? new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - this.releaseTimestamp) : this.concurrentStateManager.getIsStopped() ? new PlaybackException.ErrorPlayerStopped(prepareIndex) : new PlaybackException.ErrorPlayerRePrepared(prepareIndex);
                        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
                        synchronized (observerDispatcher.getObservers()) {
                            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                        }
                        Iterator it = H0.iterator();
                        while (it.hasNext()) {
                            try {
                                ((PlayerObserver) it.next()).onWillPlayWhenReadyChanged(false);
                                failure2 = zy11.a;
                            } catch (Throwable th2) {
                                failure2 = new Result.Failure(th2);
                            }
                            Throwable a = Result.a(failure2);
                            if (a != null) {
                                h5z0.a.f(a, "notifyObservers", new Object[0]);
                            }
                        }
                        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
                        synchronized (observerDispatcher2.getObservers()) {
                            H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
                        }
                        Iterator it2 = H02.iterator();
                        while (it2.hasNext()) {
                            try {
                                ((PlayerAnalyticsObserver) it2.next()).onNonFatalPlaybackException(errorPlayerReleased);
                                failure = zy11.a;
                            } catch (Throwable th3) {
                                failure = new Result.Failure(th3);
                            }
                            Throwable a2 = Result.a(failure);
                            if (a2 != null) {
                                h5z0.a.f(a2, "notifyObservers", new Object[0]);
                            }
                        }
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e2) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e2, null, new Object[0], 8, null);
                                return;
                            }
                        }
                        if (z7) {
                            notifyLoadingFinished();
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        z6 = true;
                        notifyPlaybackError(new PlaybackException.Cancellation(e), preparingParams, ErrorSource.Prepare.INSTANCE);
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e4) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e4, null, new Object[0], 8, null);
                                return;
                            }
                        }
                        if (z6) {
                            notifyLoadingFinished();
                        }
                    } catch (ExecutionException e5) {
                        e = e5;
                        z5 = true;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        notifyPlaybackError(new PlaybackException.ErrorPreparing(e), preparingParams, ErrorSource.Prepare.INSTANCE);
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e6) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e6, null, new Object[0], 8, null);
                                return;
                            }
                        }
                        if (z5) {
                            notifyLoadingFinished();
                        }
                    } catch (PlaybackException e7) {
                        e = e7;
                        z4 = true;
                        notifyPlaybackError(e, preparingParams, ErrorSource.Prepare.INSTANCE);
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e8) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e8, null, new Object[0], 8, null);
                                return;
                            }
                        }
                        if (z4) {
                            notifyLoadingFinished();
                        }
                    } catch (Exception e9) {
                        e = e9;
                        z3 = true;
                        notifyPlaybackError(new PlaybackException.ErrorPreparing(e), preparingParams, ErrorSource.Prepare.INSTANCE);
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e10) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e10, null, new Object[0], 8, null);
                                return;
                            }
                        }
                        if (z3) {
                            notifyLoadingFinished();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = true;
                        if (z2) {
                            try {
                                this.prepareStartCallCount.decrementAndGet();
                            } catch (Exception e11) {
                                PlayerLogger.warning$default(this.logger, LOG_TAG, "prepareInExecutor", e11, null, new Object[0], 8, null);
                                throw th;
                            }
                        }
                        if (!z) {
                            throw th;
                        }
                        notifyLoadingFinished();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    z7 = false;
                } catch (CancellationException e12) {
                    e = e12;
                    z6 = false;
                } catch (ExecutionException e13) {
                    e = e13;
                    z5 = false;
                } catch (PlaybackException e14) {
                    e = e14;
                    z4 = false;
                } catch (Exception e15) {
                    e = e15;
                    z3 = false;
                } catch (Throwable th5) {
                    th = th5;
                    z = false;
                }
            } catch (Throwable th6) {
                boolean z8 = z7;
                th = th6;
                z = z8;
            }
        } catch (InterruptedException unused3) {
            z7 = false;
            z2 = false;
        } catch (CancellationException e16) {
            e = e16;
            z6 = false;
            z2 = false;
        } catch (ExecutionException e17) {
            e = e17;
            z5 = false;
            z2 = false;
        } catch (PlaybackException e18) {
            e = e18;
            z4 = false;
            z2 = false;
        } catch (Exception e19) {
            e = e19;
            z3 = false;
            z2 = false;
        } catch (Throwable th7) {
            th = th7;
            z = false;
            z2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$41(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl) {
        synchronized (optimizedYandexPlayerImpl) {
            if (!optimizedYandexPlayerImpl.concurrentStateManager.getIsReleased()) {
                optimizedYandexPlayerImpl.concurrentStateManager.setReleased(true);
                optimizedYandexPlayerImpl.executorReleaseBlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object releaseInternalSuspend(Continuation<? super zy11> continuation) {
        this.releaseTimestamp = System.currentTimeMillis();
        this.playerAdditionalParametersInternal.put("releaseTimestamp", new Long(this.releaseTimestamp));
        Object O = jl40.O(new OptimizedYandexPlayerImpl$releaseInternalSuspend$2(this, null), continuation);
        return O == CoroutineSingletons.COROUTINE_SUSPENDED ? O : zy11.a;
    }

    private final VideoData requestVideoData(String contentId) {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        try {
            return this.playerStrategy.prepareVideoData(contentId).get();
        } catch (Exception e) {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            throw e;
        }
    }

    private final void setRepeatModeInternal(RepeatMode repeatMode) {
        this.repeatModeInternal = repeatMode;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setRepeatMode(repeatMode);
        }
    }

    private final void setStartQualityConstraint(StartQualityConstraint startQualityConstraint) {
        this.startQualityConsumer.accept(startQualityConstraint != null ? StartQuality.m804boximpl(StartQuality.m805constructorimpl(startQualityConstraint.getMaxHeight())) : null);
    }

    private final void stop(boolean keepDecoders) {
        if (this.surfaceSizeHolderInternal.getSetSizeWasInvoked() && !this.surfaceSizeHolderInternal.getGetterWasUsed()) {
            PlayerLogger.warning$default(this.logger, LOG_TAG, "stop", "SurfaceSizeProvider setSize was invoked, but it's unlinked to TrackSelector", null, new Object[0], 8, null);
        }
        if (this.concurrentStateManager.isNotActive()) {
            return;
        }
        Future<?> andSet = this.prepareFuture.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(true);
        }
        submitTask(new rg3(this, keepDecoders, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$44(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl, boolean z) {
        HashSet H0;
        Object failure;
        if (optimizedYandexPlayerImpl.concurrentStateManager.isActive()) {
            optimizedYandexPlayerImpl.externalPlayWhenReady = false;
            optimizedYandexPlayerImpl.concurrentStateManager.setStopped(true);
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = optimizedYandexPlayerImpl.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onStopCommand();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            PlayerDelegate<H> playerDelegate = optimizedYandexPlayerImpl.playerDelegate;
            if (playerDelegate != null) {
                playerDelegate.stop(z);
            }
        }
    }

    private final Future<?> submitTask(Runnable runnable) {
        if (this.concurrentStateManager.getIsReleased()) {
            return null;
        }
        return ExecutorsUtilKt.submitSafely(this.singleThreadExecutorService, runnable);
    }

    private final void tryUpdateAesthetePreference(TrackInfo oldVideoTrackInfo, TrackInfo newVideoTrackInfo) {
        if ((oldVideoTrackInfo.getVariant() instanceof TrackVariant.Adaptive) && (newVideoTrackInfo.getVariant() instanceof TrackVariant.Variant) && oldVideoTrackInfo.getFormat().getHeight() < newVideoTrackInfo.getFormat().getHeight()) {
            this.abrPreferences.getAesthetePreferenceProvider().setPreferHD(true);
            this.surfaceSizeHolderInternal.setPreferHD(true);
        }
    }

    private final void tryUpdateUserQuality(TrackInfo oldVideoTrackInfo, TrackInfo newVideoTrackInfo) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        TrackVariant variant = oldVideoTrackInfo.getVariant();
        TrackVariant variant2 = newVideoTrackInfo.getVariant();
        if (variant2 instanceof TrackVariant.Variant) {
            int height = ((TrackVariant.Variant) variant2).getFormat().getHeight();
            this.abrPreferences.getUserQualityRepository().setLastUserSelectedVideoHeightPx(Integer.valueOf(height));
            this.surfaceSizeHolderInternal.setUserQuality(Integer.valueOf(height));
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onUserManuallySelectedQuality(Integer.valueOf(height));
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            return;
        }
        if ((variant instanceof TrackVariant.Variant) && (variant2 instanceof TrackVariant.Adaptive)) {
            this.abrPreferences.getUserQualityRepository().setLastUserSelectedVideoHeightPx(null);
            this.surfaceSizeHolderInternal.setUserQuality(null);
            ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H0.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onUserManuallySelectedQuality(null);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateTrack() {
        TrackInfo trackInfo;
        Track track;
        Track track2;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher;
        HashSet H0;
        Object failure;
        if (this.concurrentStateManager.isNotActive()) {
            return;
        }
        this.trackPrepared = true;
        Track track3 = this.audioTrack;
        if (track3 != null) {
            track3.update();
        }
        Track track4 = this.subtitlesTrack;
        if (track4 != null) {
            track4.update();
        }
        Track track5 = this.videoTrack;
        TrackInfo trackInfo2 = null;
        if (track5 != null) {
            TrackVariant selectedTrackVariant = track5.getSelectedTrackVariant();
            TrackFormat selectedTrackFormat = track5.getSelectedTrackFormat();
            if (selectedTrackVariant != null && selectedTrackFormat != null) {
                trackInfo = new TrackInfo(selectedTrackVariant, selectedTrackFormat);
                track = this.videoTrack;
                if (track != null) {
                    track.update();
                }
                track2 = this.videoTrack;
                if (track2 != null) {
                    TrackVariant selectedTrackVariant2 = track2.getSelectedTrackVariant();
                    TrackFormat selectedTrackFormat2 = track2.getSelectedTrackFormat();
                    if (selectedTrackVariant2 != null && selectedTrackFormat2 != null) {
                        trackInfo2 = new TrackInfo(selectedTrackVariant2, selectedTrackFormat2);
                    }
                }
                if (trackInfo != null && trackInfo2 != null) {
                    tryUpdateAesthetePreference(trackInfo, trackInfo2);
                    tryUpdateUserQuality(trackInfo, trackInfo2);
                }
                observerDispatcher = this.observers;
                synchronized (observerDispatcher.getObservers()) {
                    H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerObserver) it.next()).onTracksChanged(this.audioTrack, this.subtitlesTrack, this.videoTrack);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        h5z0.a.f(a, "notifyObservers", new Object[0]);
                    }
                }
                return;
            }
        }
        trackInfo = null;
        track = this.videoTrack;
        if (track != null) {
        }
        track2 = this.videoTrack;
        if (track2 != null) {
        }
        if (trackInfo != null) {
            tryUpdateAesthetePreference(trackInfo, trackInfo2);
            tryUpdateUserQuality(trackInfo, trackInfo2);
        }
        observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
        }
    }

    private final Long validateStartPosition(Long startPosition) {
        HashSet H0;
        Object failure;
        if (startPosition == null || startPosition.longValue() >= 0 || startPosition.longValue() == -9223372036854775807L) {
            return startPosition;
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onPlayerWillTryRecoverAfterError(new PlaybackException.ErrorNegativeStartPosition(startPosition.longValue()), RecoverDetailsKt.RecoverDetails(this.externalPlayWhenReady, new tls(this) { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$validateStartPosition$1$1
                    final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    public final void invoke(RecoverDetails.Builder builder) {
                        builder.setPlaybackStats(this.this$0.getPlaybackStats());
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((RecoverDetails.Builder) obj);
                        return zy11.a;
                    }
                }));
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        return -9223372036854775807L;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void addAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver) {
        this.analyticsObservers.add((ObserverDispatcher<PlayerAnalyticsObserver>) analyticsObserver);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void addObserver(PlayerObserver<? super H> observer) {
        this.observers.add((ObserverDispatcher<PlayerObserver<H>>) observer);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void appendAdditionalParameters(Map<String, ? extends Object> extraParameters) {
        this.playerAdditionalParametersInternal.putAll(extraParameters);
        this.strmManager.updateAdditionalParameters(getPlayerAdditionalParameters());
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void connectTo(PlayerDelegate<H> playerDelegate) {
        playerDelegate.setRepeatMode(this.repeatModeInternal);
        this.playerDelegate = playerDelegate;
        playerDelegate.addObserver(this.playerDelegateObserver);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void disconnectFromCurrentDelegate() {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerObserver) it.next()).onPlaybackEnded();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        setRepeatModeInternal(RepeatMode.None.INSTANCE);
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.removeObserver(this.playerDelegateObserver);
        }
        this.playerDelegate = null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public AdditionalTrackingReporter getAdditionalTrackingReporter() {
        PlayerStrategy<VideoData> playerStrategy = this.playerStrategy;
        AdditionalTrackingReporter additionalTrackingReporter = playerStrategy instanceof AdditionalTrackingReporter ? (AdditionalTrackingReporter) playerStrategy : null;
        if (additionalTrackingReporter != null) {
            return new AdditionalTrackingReporterImpl(additionalTrackingReporter);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public List<Ad> getAdsList() {
        List<Ad> adsList;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        return (playerDelegate == null || (adsList = playerDelegate.getAdsList()) == null) ? EmptyList.a : adsList;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public AdsLoaderHolder getAdsLoaderHolder() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null) {
            playerDelegate = getPlayerDelegate();
        }
        return playerDelegate.getAdsLoaderHolder();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getAudioTrack() {
        Track track = this.audioTrack;
        if (track == null || !this.trackPrepared) {
            return null;
        }
        return track;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getAvailableWindowDuration() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null) {
            return -1L;
        }
        Long valueOf = Long.valueOf(playerDelegate.getDuration());
        if (valueOf.longValue() == -9223372036854775807L) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -1L;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getBufferedPosition() {
        PlayerDelegate.Position bufferedPosition;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null || (bufferedPosition = playerDelegate.getBufferedPosition()) == null) {
            return -1L;
        }
        return bufferedPosition.getCurrentPosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    /* renamed from: getCodecManager, reason: from getter */
    public YandexCodecManager getDecoderManager() {
        return this.decoderManager;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getContentDuration() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if ((playerDelegate != null ? playerDelegate.getVideoType() : null) == VideoType.LIVE) {
            return Long.MIN_VALUE;
        }
        PlayerDelegate<H> playerDelegate2 = this.playerDelegate;
        if (playerDelegate2 == null) {
            return -1L;
        }
        Long valueOf = Long.valueOf(playerDelegate2.getDuration());
        Long l = valueOf.longValue() != -9223372036854775807L ? valueOf : null;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public H getHidedPlayer() {
        return getPlayerDelegate().extractPlayer(this);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getLiveEdgePosition() {
        PlayerDelegate.Position liveEdgePosition;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null || (liveEdgePosition = playerDelegate.getLiveEdgePosition()) == null) {
            return -1L;
        }
        return liveEdgePosition.getCurrentPosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getLiveOffset() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null) {
            return -9223372036854775807L;
        }
        Long valueOf = Long.valueOf(playerDelegate.getLiveOffset());
        if (!isInLive()) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -9223372036854775807L;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public float getPlaybackSpeed() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getPlaybackSpeed();
        }
        return 0.0f;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public PlaybackStats getPlaybackStats() {
        final PlaybackStats playbackStats;
        final DecoderData value = this.decoderDataSupplier.getValue();
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null || (playbackStats = playerDelegate.getPlaybackStats()) == null) {
            return null;
        }
        return playbackStats.copy(new tls(this) { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$getPlaybackStats$1$1
            final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            public final void invoke(PlaybackStats.Builder builder) {
                boolean isInLive;
                boolean isInLive2;
                boolean isInLive3;
                SurfaceSizeHolderInternal surfaceSizeHolderInternal;
                SurfaceSizeHolderInternal surfaceSizeHolderInternal2;
                isInLive = this.this$0.isInLive(playbackStats);
                builder.setInLive(Boolean.valueOf(isInLive));
                Long valueOf = Long.valueOf(playbackStats.getLiveOffset());
                isInLive2 = this.this$0.isInLive(playbackStats);
                if (!isInLive2) {
                    valueOf = null;
                }
                builder.setLiveOffset(valueOf != null ? valueOf.longValue() : -9223372036854775807L);
                Long valueOf2 = Long.valueOf(playbackStats.getTargetLiveOffset());
                isInLive3 = this.this$0.isInLive(playbackStats);
                if (!isInLive3) {
                    valueOf2 = null;
                }
                builder.setTargetLiveOffset(valueOf2 != null ? valueOf2.longValue() : -9223372036854775807L);
                Long valueOf3 = Long.valueOf(playbackStats.getWindowDuration());
                if (valueOf3.longValue() == -9223372036854775807L) {
                    valueOf3 = null;
                }
                builder.setWindowDuration(valueOf3 != null ? valueOf3.longValue() : -1L);
                surfaceSizeHolderInternal = ((OptimizedYandexPlayerImpl) this.this$0).surfaceSizeHolderInternal;
                int surfaceWidth$video_player_internalRelease = surfaceSizeHolderInternal.getSurfaceWidth$video_player_internalRelease();
                surfaceSizeHolderInternal2 = ((OptimizedYandexPlayerImpl) this.this$0).surfaceSizeHolderInternal;
                builder.setSurfaceSize(SizeKt.Size$default(surfaceWidth$video_player_internalRelease, surfaceSizeHolderInternal2.getSurfaceHeight$video_player_internalRelease(), null, 4, null));
                DecoderData decoderData = value;
                builder.setVideoDecoder(decoderData != null ? decoderData.getVideoDecoder() : null);
                DecoderData decoderData2 = value;
                builder.setAudioDecoder(decoderData2 != null ? decoderData2.getAudioDecoder() : null);
                Long valueOf4 = Long.valueOf(playbackStats.getLiveOffset());
                PlaybackStats playbackStats2 = playbackStats;
                builder.setActualLiveOffset((playbackStats2.getVideoType() == VideoType.EVENT || playbackStats2.getVideoType() == VideoType.LIVE) ? valueOf4 : null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackStats.Builder) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public PlaybackViewState getPlaybackViewState() {
        PlaybackViewState playbackViewState;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        return (playerDelegate == null || (playbackViewState = playerDelegate.getPlaybackViewState()) == null) ? PlaybackViewStateKt.PlaybackViewState(new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$getPlaybackViewState$1
            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackViewState.Builder) obj);
                return zy11.a;
            }

            public final void invoke(PlaybackViewState.Builder builder) {
            }
        }) : playbackViewState;
    }

    public final PlayerDelegate<H> getPlayerDelegate$video_player_internalRelease() {
        return this.playerDelegate;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public int getPlayerIndex() {
        return this.playerIndex;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getPosition() {
        PlayerDelegate.Position position;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null || (position = playerDelegate.getPosition()) == null) {
            return -1L;
        }
        return position.getCurrentPosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public RepeatMode getRepeatMode() {
        RepeatMode repeatMode;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        return (playerDelegate == null || (repeatMode = playerDelegate.getRepeatMode()) == null) ? this.repeatModeInternal : repeatMode;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public YandexPlayerSkipsManager getSkipsManager() {
        return this.skipsManager;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public StreamType getStreamType() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getStreamType();
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getSubtitlesTrack() {
        Track track = this.subtitlesTrack;
        if (track == null || !this.trackPrepared) {
            return null;
        }
        return track;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getTimelineLeftEdge() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getTimelineLeftEdge();
        }
        return -1L;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public String getVideoContentId() {
        VideoData videoDataInternal = getVideoDataInternal();
        if (videoDataInternal != null) {
            PlayerStrategy<VideoData> playerStrategy = this.playerStrategy;
            BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
            if (basePlayerStrategy != null) {
                return basePlayerStrategy.getContentId(videoDataInternal);
            }
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    /* renamed from: getVideoData, reason: from getter */
    public VideoData getVideoDataInternal() {
        return this.videoDataInternal;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public String getVideoSessionId() {
        return this.videoSessionId;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getVideoTrack() {
        Track track = this.videoTrack;
        if (track == null || !this.trackPrepared) {
            return null;
        }
        return track;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public VideoType getVideoType() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getVideoType();
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public float getVolume() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.getVolume();
        }
        return 1.0f;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isMuted() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.isMuted();
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isPlaying() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.isPlaying();
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isPlayingAd() {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            return playerDelegate.isPlayingAd();
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void notifyFullscreenModeChanged(final boolean isFullscreen) {
        FullscreenDataBundle copy = this.fullscreenDataBundle.copy(new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$notifyFullscreenModeChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FullscreenDataBundle.Builder builder) {
                builder.setFullscreenExternal(Boolean.valueOf(isFullscreen));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FullscreenDataBundle.Builder) obj);
                return zy11.a;
            }
        });
        this.fullscreenDataBundle = copy;
        notifyFullscreenInfoUpdated(copy);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void pause() {
        if (this.concurrentStateManager.isNotActive()) {
            return;
        }
        submitTask(new wd70(this, 2));
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void play() {
        if (this.concurrentStateManager.isNotActive()) {
            notifyPlaybackError(new PlaybackException.ErrorNoPrepare(), null, ErrorSource.Player.INSTANCE);
        } else {
            submitTask(new wd70(this, 1));
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void prepare(final VideoData videoData, final PlaybackParameters playbackParameters) {
        ExternalStalled externalStalled;
        if (this.concurrentStateManager.getIsReleased()) {
            return;
        }
        final ConcurrentPlayerStateManager.Indices beginPrepare = this.concurrentStateManager.beginPrepare(new PrepareConfig(null, videoData, playbackParameters, 1, null));
        final long currentTimeMillis = System.currentTimeMillis();
        final Long startPosition = playbackParameters.getStartPosition();
        final boolean autoPlay = playbackParameters.getAutoPlay();
        boolean isOffline = playbackParameters.getIsOffline();
        final boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        this.startQualityConstraint = playbackParameters.getStartQualityConstraint();
        this.externalPlayWhenReady = playbackParameters.getAutoPlay();
        this.playerAdditionalParametersInternal.clear();
        Map<String, Object> additionalParameters = playbackParameters.getAdditionalParameters();
        if (additionalParameters != null) {
            this.playerAdditionalParametersInternal.putAll(additionalParameters);
        }
        PlayerAnalyticsData playerAnalyticsData = playbackParameters.getPlayerAnalyticsData();
        if (playerAnalyticsData != null && (externalStalled = playerAnalyticsData.getExternalStalled()) != null) {
            UtilsKt.putEntry(this.playerAdditionalParametersInternal, externalStalled);
        }
        AdParameters adParameters = playbackParameters.getAdParameters();
        String str = null;
        String contentId = adParameters != null ? adParameters.getContentId() : null;
        PlayerStrategy<VideoData> playerStrategy = this.playerStrategy;
        BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
        String contentId2 = basePlayerStrategy != null ? basePlayerStrategy.getContentId(videoData) : null;
        if (this.streamUrlValidator.isValid(videoData.getManifestUrl())) {
            StrmManager strmManager = this.strmManager;
            String str2 = this.videoSessionId;
            Long startPosition2 = this.playerStrategy.getStartPosition(startPosition, videoData);
            str = strmManager.expandManifestUrl(str2, videoData, contentId2, startPosition2 != null ? startPosition2.longValue() : -9223372036854775807L, autoPlay, beginPrepare.getSourceIndex(), isOffline);
        }
        final String str3 = str;
        final String str4 = contentId2;
        final String str5 = contentId;
        final PreparingParams PreparingParams = PreparingParamsKt.PreparingParams(getVideoDataInternal() == null, autoPlay, beginPrepare.getSourceIndex(), AbrPreferencesKt.toLogAbrPreferences(this.abrPreferences), new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$prepare$preparingParams$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PreparingParams.Builder builder) {
                StartQualityConstraint startQualityConstraint;
                Map<String, ? extends Object> currentAdditionalParametersCopy;
                builder.setContentId(str4);
                builder.setAdContentId(str5);
                builder.setVideoData(videoData);
                builder.setStartPosition(startPosition);
                startQualityConstraint = ((OptimizedYandexPlayerImpl) this).startQualityConstraint;
                builder.setStartQualityConstraint(startQualityConstraint);
                builder.setExpandedManifestUrl(str3);
                currentAdditionalParametersCopy = this.getCurrentAdditionalParametersCopy();
                builder.setAdditionalParams(currentAdditionalParametersCopy);
                builder.setPrepareWithoutInitCodecs(Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs()));
                builder.setPreferredH264(Boolean.valueOf(playbackParameters.getPreferredH264()));
                builder.setOffline(Boolean.valueOf(playbackParameters.getIsOffline()));
                builder.setManifestDataSourceParameters(playbackParameters.getManifestDataSourceParameters());
                builder.setChunkDataSourceParameters(playbackParameters.getChunkDataSourceParameters());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PreparingParams.Builder) obj);
                return zy11.a;
            }
        });
        Future<?> andSet = this.prepareFuture.getAndSet(submitTask(new Runnable() { // from class: vd70
            @Override // java.lang.Runnable
            public final void run() {
                OptimizedYandexPlayerImpl.prepare$lambda$17(OptimizedYandexPlayerImpl.this, videoData, startPosition, autoPlay, PreparingParams, currentTimeMillis, beginPrepare, str3, disableAudioFromStart, playbackParameters);
            }
        }));
        if (andSet != null) {
            andSet.cancel(true);
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void release() {
        if (this.concurrentStateManager.getIsReleased()) {
            return;
        }
        Future<?> andSet = this.prepareFuture.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(true);
        }
        if (this.performPlayerReleaseOnScope) {
            tje.N(this.playerCoroutineScope, getReleaseCoroutineExceptionHandler(), null, new OptimizedYandexPlayerImpl$release$1(this, null), 2).w(new tls(this) { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$release$2
                final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final void invoke(Throwable th) {
                    tse tseVar;
                    tseVar = ((OptimizedYandexPlayerImpl) this.this$0).playerCoroutineScope;
                    bvf0.j(tseVar, null);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return zy11.a;
                }
            });
        } else {
            submitTask(new wd70(this, 0));
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void removeAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver) {
        this.analyticsObservers.remove(analyticsObserver);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void removeObserver(PlayerObserver<? super H> observer) {
        this.observers.remove(observer);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void seekTo(final long position) {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.seekTo(PlayerDelegate.INSTANCE.Position(new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$seekTo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PlayerDelegate.Position.Builder builder) {
                    builder.setCurrentPosition(Long.valueOf(position));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PlayerDelegate.Position.Builder) obj);
                    return zy11.a;
                }
            }));
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setHandleAudioFocus(boolean handleAudioFocus) {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setHandleAudioFocus(handleAudioFocus);
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setMuted(boolean muted) {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setMuted(muted);
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setPlaybackSpeed(float speed) {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setPlaybackSpeed(speed);
        }
    }

    public final void setPlayerDelegate$video_player_internalRelease(PlayerDelegate<H> playerDelegate) {
        this.playerDelegate = playerDelegate;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setRepeatMode(RepeatMode repeatMode) {
        setRepeatModeInternal(repeatMode);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setServiceQuality(int quality) {
        this.surfaceSizeHolderInternal.setServiceQuality(quality);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setSurfaceSize(int surfaceWidth, int surfaceHeight) {
        HashSet H0;
        Object failure;
        this.surfaceSizeHolderInternal.setSize(surfaceWidth, surfaceHeight);
        FullscreenDataBundle copy = this.fullscreenDataBundle.copy(new tls(this) { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$setSurfaceSize$1
            final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            public final void invoke(FullscreenDataBundle.Builder builder) {
                SurfaceSizeHolderInternal surfaceSizeHolderInternal;
                SurfaceSizeHolderInternal surfaceSizeHolderInternal2;
                surfaceSizeHolderInternal = ((OptimizedYandexPlayerImpl) this.this$0).surfaceSizeHolderInternal;
                builder.setSurfaceHeight(surfaceSizeHolderInternal.getSurfaceHeight$video_player_internalRelease());
                surfaceSizeHolderInternal2 = ((OptimizedYandexPlayerImpl) this.this$0).surfaceSizeHolderInternal;
                builder.setSurfaceWidth(surfaceSizeHolderInternal2.getSurfaceWidth$video_player_internalRelease());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FullscreenDataBundle.Builder) obj);
                return zy11.a;
            }
        });
        this.fullscreenDataBundle = copy;
        notifyFullscreenInfoUpdated(copy);
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onSurfaceSizeChanged(SizeKt.Size$default(surfaceWidth, surfaceHeight, null, 4, null));
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setVolume(float volume) {
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate != null) {
            playerDelegate.setVolume(volume);
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void stopKeepingDecoders() {
        stop(true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl$Companion;", "", "()V", "INCORRECT_STREAMURL_MESSAGE", "", "LOG_TAG", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isInLive() {
        PlaybackStats playbackStats;
        PlayerDelegate<H> playerDelegate = this.playerDelegate;
        if (playerDelegate == null || (playbackStats = playerDelegate.getPlaybackStats()) == null) {
            return false;
        }
        return isInLive(playbackStats);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void stop() {
        stop(false);
    }

    @Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010\u001cJ\u001d\u0010)\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010\u001cJ\u0017\u0010/\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010 J\u0019\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010\u001cJ\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010=J\u0017\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020:H\u0016¢\u0006\u0004\bA\u0010=J\u0017\u0010C\u001a\u00020\u00132\u0006\u0010B\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\u0013H\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010E\u001a\u00020\u0013H\u0016¢\u0006\u0004\bE\u0010\u001cJ\u000f\u0010F\u001a\u00020\u0013H\u0016¢\u0006\u0004\bF\u0010\u001cJ#\u0010J\u001a\u00020\u00132\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bJ\u0010NJ\u001f\u0010Q\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\"H\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\"H\u0016¢\u0006\u0004\bS\u0010RJ\u000f\u0010T\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010\u001cJ\u001f\u0010W\u001a\u00020\u00132\u0006\u0010U\u001a\u00020:2\u0006\u0010V\u001a\u00020:H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010\u001cJ\u001f\u0010]\u001a\u00020\u00132\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0011H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00132\u0006\u0010_\u001a\u00020\u0011H\u0016¢\u0006\u0004\b`\u0010aJ\u001f\u0010d\u001a\u00020\u00132\u0006\u0010b\u001a\u00020:2\u0006\u0010c\u001a\u00020:H\u0016¢\u0006\u0004\bd\u0010XJ'\u0010h\u001a\u00020\u00132\u0006\u0010e\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020:2\u0006\u0010g\u001a\u00020:H\u0016¢\u0006\u0004\bh\u0010iJ)\u0010l\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010e\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010jH\u0016¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u00132\b\u0010e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00132\u0006\u0010e\u001a\u00020\u000fH\u0016¢\u0006\u0004\bp\u0010oJ\u0017\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bu\u0010tJ!\u0010z\u001a\u00020\u00132\u0006\u0010w\u001a\u00020v2\b\u0010y\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0004\bz\u0010{J!\u0010|\u001a\u00020\u00132\u0006\u0010w\u001a\u00020v2\b\u0010y\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0004\b|\u0010{J\u0017\u0010~\u001a\u00020\u00132\u0006\u0010}\u001a\u00020\u0011H\u0016¢\u0006\u0004\b~\u0010aJ\u001b\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0084\u0001\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0007\u0010\u0083\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0087\u0001\u001a\u00020\u00132\u0007\u0010\u0086\u0001\u001a\u00020:H\u0016¢\u0006\u0005\b\u0087\u0001\u0010=J-\u0010\u008b\u0001\u001a\u00020\u00132\u0007\u0010\u0088\u0001\u001a\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020:2\u0007\u0010\u008a\u0001\u001a\u00020:H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008f\u0001\u001a\u00020\u00132\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J$\u0010\u0093\u0001\u001a\u00020\u00132\u0007\u0010\u0091\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\u00132\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u001cJ\u001b\u0010\u009b\u0001\u001a\u00020\u00132\u0007\u0010\u009a\u0001\u001a\u00020\"H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009f\u0001\u001a\u00020\u00132\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J*\u0010¥\u0001\u001a\u00020\u00132\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00012\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J%\u0010¨\u0001\u001a\u00020\u00132\u0007\u0010§\u0001\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010«\u0001\u001a\u00020\u00132\u0007\u0010ª\u0001\u001a\u00020\"H\u0016¢\u0006\u0006\b«\u0001\u0010\u009c\u0001J\u0011\u0010¬\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¬\u0001\u0010\u001cJ\u0018\u0010¯\u0001\u001a\u00030®\u0001*\u00030\u00ad\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001R\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010±\u0001R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010²\u0001R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010³\u0001R\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001¨\u0006¸\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl$PlayerDelegateObserverImpl;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;", "player", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "playerStrategy", "Lru/yandex/video/m3/benchmark/MetricsManager;", "metricsManager", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "metricsTimeline", "<init>", "(Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;Lru/yandex/video/m3/player/PlayerStrategy;Lru/yandex/video/m3/benchmark/MetricsManager;Lru/yandex/video/m3/benchmark/models/MetricsTimeline;)V", "", "url", "", "autoplay", "Lzy11;", "onNewMediaItem", "(Ljava/lang/String;Z)V", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_EXCEPTION, "onError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onNonFatalError", "onResumePlayback", "()V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/AdException;", "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "onAdSkipAvailable", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "onPausePlayback", "", "position", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "duration", "onDurationChanged", "timelineLeftEdgeMs", "onTimelineLeftEdgeChanged", "onBufferingStart", "onBufferingEnd", "onTracksChanged", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "width", "height", "onVideoSizeChanged", "(II)V", "onSurfaceSizeChanged", "onFirstFrame", "newPosition", "oldPosition", "onSeek", "(JJ)V", "onPlaybackEnded", "", "speed", "isUserAction", "onPlaybackSpeedChanged", "(FZ)V", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "chunkLengthMs", "loadTime", "onDataLoaded", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "onVideoDecoderReleased", "(Ljava/lang/String;)V", "onAudioDecoderReleased", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onAudioDecoderEnabled", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "keepDecoders", "onStop", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "logMessage", "onNoSupportedTracksForRenderer", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;)V", "bandwidthEstimation", "onBandwidthEstimation", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", BackendConfig.Restrictions.ENABLED, "className", "onNetPerfStatus", "(ZLjava/lang/String;)V", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "onRepeat", "count", "onVideoFramesDropped", "(I)V", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "bytes", "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "bitrate", "onVideoChunkLoaded", "onDrmKeysLoaded", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "Lru/yandex/video/m3/data/TrackSelectionType;", "toTrackSelectionType", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Lru/yandex/video/m3/data/TrackSelectionType;", "Lru/yandex/video/m3/player/impl/OptimizedYandexPlayerImpl;", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/benchmark/MetricsManager;", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerDelegateObserverImpl<H> implements PlayerDelegate.Observer {
        public static final int $stable = 8;
        private final TimberPlayerLogger logger = new TimberPlayerLogger();
        private final MetricsManager metricsManager;
        private final MetricsTimeline metricsTimeline;
        private final OptimizedYandexPlayerImpl<H> player;
        private final PlayerStrategy<VideoData> playerStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public PlayerDelegateObserverImpl(OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl, PlayerStrategy<? extends VideoData> playerStrategy, MetricsManager metricsManager, MetricsTimeline metricsTimeline) {
            this.player = optimizedYandexPlayerImpl;
            this.playerStrategy = playerStrategy;
            this.metricsManager = metricsManager;
            this.metricsTimeline = metricsTimeline;
        }

        private final TrackSelectionType toTrackSelectionType(TrackVariant trackVariant) {
            if (trackVariant instanceof TrackVariant.Adaptive) {
                return TrackSelectionType.ADAPTIVE;
            }
            if (trackVariant instanceof TrackVariant.Disable) {
                return TrackSelectionType.DISABLE;
            }
            if (trackVariant instanceof TrackVariant.DownloadVariant ? true : trackVariant instanceof TrackVariant.PreferredTrackVariant ? true : trackVariant instanceof TrackVariant.Variant) {
                return TrackSelectionType.FIXED;
            }
            w511.b();
            return null;
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdConfigSet(AdConfig adConfig) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdConfigSet(adConfig);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdEnd() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdEnd();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdError(AdException exception) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdError(exception);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdListChanged(List<Ad> adList) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdListChanged(adList);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdMetadata(AdMetadata adMetadata) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdMetadata(adMetadata);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdPodEnd() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdPodEnd();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdPodStart(Ad ad, int index) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdPodStart(ad, index);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdSkipAvailable(Ad ad) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdSkipAvailable(ad);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdSkipped() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdSkipped();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdStart(Ad ad) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdStart(ad);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onAudioDecoderEnabled(decoderCounter);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAudioDecoderReleased(String decoderName) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onAudioDecoderReleased(decoderName);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onAudioInputFormatChanged(format, codecReuseLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBandwidthEstimation(long bandwidthEstimation) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onBandwidthEstimation(bandwidthEstimation);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[SYNTHETIC] */
        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
            HashSet H0;
            int i;
            long j;
            long j2;
            Object failure;
            Throwable a;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    i = elapsedMs;
                    j = bytesTransferred;
                    j2 = bitrateEstimate;
                    try {
                        ((PlayerAnalyticsObserver) it.next()).onBandwidthSample(i, j, j2);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        th = th;
                        failure = new Result.Failure(th);
                        a = Result.a(failure);
                        if (a == null) {
                        }
                        elapsedMs = i;
                        bytesTransferred = j;
                        bitrateEstimate = j2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = elapsedMs;
                    j = bytesTransferred;
                    j2 = bitrateEstimate;
                }
                a = Result.a(failure);
                if (a == null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
                elapsedMs = i;
                bytesTransferred = j;
                bitrateEstimate = j2;
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferSizeChanged(long bufferSizeMs) {
            HashSet H0;
            Object failure;
            super.onBufferSizeChanged(bufferSizeMs);
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onBufferSizeChanged(bufferSizeMs);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferingEnd() {
            HashSet H0;
            HashSet H02;
            HashSet<PlayerAnalyticsObserver> H03;
            Object failure;
            TrackVariant selectedTrackVariant;
            Object failure2;
            MetricsManager metricsManager;
            Object failure3;
            TimberPlayerLogger timberPlayerLogger = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                PlayerLogger.debug$default(timberPlayerLogger, OptimizedYandexPlayerImpl.LOG_TAG, "onBufferingEnd", null, new Object[0], 4, null);
            }
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onEngineBufferingEnd();
                    failure3 = zy11.a;
                } catch (Throwable th) {
                    failure3 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure3);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ((OptimizedYandexPlayerImpl) this.player).bufferingStartCallCount.set(0);
            this.player.notifyLoadingFinished();
            if (((OptimizedYandexPlayerImpl) this.player).firstPlaybackReady.compareAndSet(false, true)) {
                if (!this.player.isPlayingAd() && (metricsManager = this.metricsManager) != null) {
                    MetricsTimeline metricsTimeline = this.metricsTimeline;
                    MetricsMeasurement measure = metricsTimeline != null ? metricsTimeline.measure(MetricsTimelineEvent.START_PREPARE) : null;
                    StreamType streamType = this.player.getStreamType();
                    VideoData videoDataInternal = this.player.getVideoDataInternal();
                    metricsManager.onEvent(new ReadyForPlaybackMetricsEvent(measure, streamType, videoDataInternal != null ? videoDataInternal.getManifestUrl() : null));
                }
                ObserverDispatcher observerDispatcher2 = ((OptimizedYandexPlayerImpl) this.player).observers;
                synchronized (observerDispatcher2.getObservers()) {
                    H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
                }
                Iterator it2 = H02.iterator();
                while (it2.hasNext()) {
                    try {
                        ((PlayerObserver) it2.next()).onReadyForFirstPlayback();
                        failure2 = zy11.a;
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    Throwable a2 = Result.a(failure2);
                    if (a2 != null) {
                        h5z0.a.f(a2, "notifyObservers", new Object[0]);
                    }
                }
                ObserverDispatcher observerDispatcher3 = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
                synchronized (observerDispatcher3.getObservers()) {
                    H03 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
                }
                for (PlayerAnalyticsObserver playerAnalyticsObserver : H03) {
                    try {
                        Track track = ((OptimizedYandexPlayerImpl) this.player).videoTrack;
                        playerAnalyticsObserver.onReadyForFirstPlayback(FirstPlaybackInfoKt.FirstPlaybackInfo$default(this.player.getStartFromCacheInfo(), (track == null || (selectedTrackVariant = track.getSelectedTrackVariant()) == null) ? null : toTrackSelectionType(selectedTrackVariant), null, 4, null));
                        failure = zy11.a;
                    } catch (Throwable th3) {
                        failure = new Result.Failure(th3);
                    }
                    Throwable a3 = Result.a(failure);
                    if (a3 != null) {
                        h5z0.a.f(a3, "notifyObservers", new Object[0]);
                    }
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferingStart() {
            HashSet H0;
            Object failure;
            TimberPlayerLogger timberPlayerLogger = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                PlayerLogger.debug$default(timberPlayerLogger, OptimizedYandexPlayerImpl.LOG_TAG, "onBufferingStart", null, new Object[0], 4, null);
            }
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onEngineBufferingStart();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ((OptimizedYandexPlayerImpl) this.player).bufferingStartCallCount.incrementAndGet();
            this.player.notifyLoadingStart();
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBytesLoaded(long bytes, TrackType trackType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onBytesLoaded(bytes, trackType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDataLoaded(long chunkLengthMs, long loadTime) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDataLoaded(chunkLengthMs, loadTime);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDecoderInitialized(trackType, decoderName, mediaCodecSelectorLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDrmKeysLoaded() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onDrmKeysLoaded();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDrmSessionAcquired(DrmType drmType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDrmSessionAcquired(drmType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDurationChanged(long duration) {
            HashSet H0;
            Object failure;
            super.onDurationChanged(duration);
            if (this.player.getVideoType() == VideoType.LIVE) {
                duration = Long.MIN_VALUE;
            }
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onContentDurationChanged(duration);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onError(PlaybackException exception) {
            OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl = this.player;
            optimizedYandexPlayerImpl.notifyPlaybackError(exception, (PreparingParams) ((OptimizedYandexPlayerImpl) optimizedYandexPlayerImpl).prepareParams.get(), new ErrorSource.PlayerDelegate(((OptimizedYandexPlayerImpl) this.player).firstPlaybackReady.get(), ((OptimizedYandexPlayerImpl) this.player).externalPlayWhenReady));
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onFirstFrame() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onFirstFrame();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadCanceled(TrackType trackType, Integer quality) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadCanceled(trackType, quality);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadError(LoadError loadError) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadError(loadError);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNetPerfStatus(boolean enabled, String className) {
            HashSet H0;
            Object failure;
            if (enabled) {
                return;
            }
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNetPerfDisabled(className);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNewMediaItem(String url, boolean autoplay) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNewMediaItem(url, autoplay);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            this.playerStrategy.onNewMediaItem(url, autoplay);
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNoSupportedTracksForRenderer(TrackType trackType, String logMessage) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNoSupportedTracksForRenderer(trackType, logMessage);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNonFatalError(PlaybackException exception) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNonFatalPlaybackException(exception);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPausePlayback() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onPausePlayback();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackEnded() {
            HashSet H0;
            Object failure;
            ((OptimizedYandexPlayerImpl) this.player).externalPlayWhenReady = false;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackEnded();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackProgress(long position) {
            HashSet H0;
            HashSet H02;
            Object failure;
            Object failure2;
            super.onPlaybackProgress(position);
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackProgress(position);
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ObserverDispatcher observerDispatcher2 = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onAnalyticsPlaybackProgress(position);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackSpeedChanged(float speed, boolean isUserAction) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackSpeedChanged(speed, isUserAction);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPreparingWithAdConfig(AdConfig adConfig) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onPreparingWithAdConfig(adConfig);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onRepeat() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onRepeat();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onRepeatModeChanged(RepeatMode repeatMode) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onRepeatModeChanged(repeatMode);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onResumePlayback() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onResumePlayback();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onSeek(long newPosition, long oldPosition) {
            HashSet H0;
            Object failure;
            this.playerStrategy.onSeek();
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onSeek(newPosition, oldPosition);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onStartFromCacheInfoReady(startFromCacheInfo);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onStop(boolean keepDecoders) {
            HashSet H0;
            HashSet H02;
            Object failure;
            Object failure2;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onStopPlayback();
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ObserverDispatcher observerDispatcher2 = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onStopPlayback(keepDecoders);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onSurfaceSizeChanged(int width, int height) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onSurfaceSizeChangedInternal(SizeKt.Size$default(width, height, null, 4, null));
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onTimelineLeftEdgeChanged(long timelineLeftEdgeMs) {
            HashSet H0;
            Object failure;
            super.onTimelineLeftEdgeChanged(timelineLeftEdgeMs);
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onTimelineLeftEdgeChanged(timelineLeftEdgeMs);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onTracksChanged() {
            this.player.updateTrack();
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoAndStreamTypeChanged(videoType, streamType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoChunkLoaded(int bitrate) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoChunkLoaded(bitrate);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoDecoderEnabled(decoderCounter);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[SYNTHETIC] */
        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            HashSet H0;
            String str;
            long j;
            long j2;
            Object failure;
            Throwable a;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    str = decoderName;
                    j = initializedTimestampMs;
                    j2 = initializationDurationMs;
                    try {
                        ((PlayerAnalyticsObserver) it.next()).onVideoDecoderInitialized(str, j, j2);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        th = th;
                        failure = new Result.Failure(th);
                        a = Result.a(failure);
                        if (a == null) {
                        }
                        decoderName = str;
                        initializedTimestampMs = j;
                        initializationDurationMs = j2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = decoderName;
                    j = initializedTimestampMs;
                    j2 = initializationDurationMs;
                }
                a = Result.a(failure);
                if (a == null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
                decoderName = str;
                initializedTimestampMs = j;
                initializationDurationMs = j2;
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoDecoderReleased(String decoderName) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoDecoderReleased(decoderName);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoFramesDropped(int count) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoFramesDropped(count);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoInputFormatChanged(format, codecReuseLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoSizeChanged(int width, int height) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onVideoSizeChanged(width, height);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onWillPlayWhenReadyChanged(willPlayWhenReady);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadCanceled(LoadCanceled loadCanceled) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.player).analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadCanceled(loadCanceled);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void prepare(final String contentId, final PlaybackParameters playbackParameters) {
        ExternalStalled externalStalled;
        if (this.concurrentStateManager.getIsReleased()) {
            return;
        }
        final ConcurrentPlayerStateManager.Indices beginPrepare = this.concurrentStateManager.beginPrepare(new PrepareConfig(contentId, null, playbackParameters, 2, null));
        final long currentTimeMillis = System.currentTimeMillis();
        final Long startPosition = playbackParameters.getStartPosition();
        final boolean autoPlay = playbackParameters.getAutoPlay();
        final boolean disableAudioFromStart = playbackParameters.getDisableAudioFromStart();
        this.startQualityConstraint = playbackParameters.getStartQualityConstraint();
        this.externalPlayWhenReady = playbackParameters.getAutoPlay();
        this.playerAdditionalParametersInternal.clear();
        Map<String, Object> additionalParameters = playbackParameters.getAdditionalParameters();
        if (additionalParameters != null) {
            this.playerAdditionalParametersInternal.putAll(additionalParameters);
        }
        PlayerAnalyticsData playerAnalyticsData = playbackParameters.getPlayerAnalyticsData();
        if (playerAnalyticsData != null && (externalStalled = playerAnalyticsData.getExternalStalled()) != null) {
            UtilsKt.putEntry(this.playerAdditionalParametersInternal, externalStalled);
        }
        AdParameters adParameters = playbackParameters.getAdParameters();
        final String contentId2 = adParameters != null ? adParameters.getContentId() : null;
        final PreparingParams PreparingParams = PreparingParamsKt.PreparingParams(getVideoDataInternal() == null, autoPlay, beginPrepare.getSourceIndex(), AbrPreferencesKt.toLogAbrPreferences(this.abrPreferences), new tls() { // from class: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$prepare$preparingParams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PreparingParams.Builder builder) {
                Map<String, ? extends Object> currentAdditionalParametersCopy;
                StartQualityConstraint startQualityConstraint;
                builder.setContentId(contentId);
                builder.setAdContentId(contentId2);
                builder.setVideoData(null);
                builder.setStartPosition(startPosition);
                currentAdditionalParametersCopy = this.getCurrentAdditionalParametersCopy();
                builder.setAdditionalParams(currentAdditionalParametersCopy);
                builder.setPrepareWithoutInitCodecs(Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs()));
                builder.setPreferredH264(Boolean.valueOf(playbackParameters.getPreferredH264()));
                builder.setOffline(Boolean.valueOf(playbackParameters.getIsOffline()));
                startQualityConstraint = ((OptimizedYandexPlayerImpl) this).startQualityConstraint;
                builder.setStartQualityConstraint(startQualityConstraint);
                builder.setManifestDataSourceParameters(playbackParameters.getManifestDataSourceParameters());
                builder.setChunkDataSourceParameters(playbackParameters.getChunkDataSourceParameters());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PreparingParams.Builder) obj);
                return zy11.a;
            }
        });
        Future<?> andSet = this.prepareFuture.getAndSet(submitTask(new Runnable() { // from class: ud70
            @Override // java.lang.Runnable
            public final void run() {
                OptimizedYandexPlayerImpl.prepare$lambda$13(OptimizedYandexPlayerImpl.this, contentId, startPosition, autoPlay, PreparingParams, currentTimeMillis, beginPrepare, disableAudioFromStart, playbackParameters);
            }
        }));
        if (andSet != null) {
            andSet.cancel(true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OptimizedYandexPlayerImpl(String str, int i, IndexGenerator indexGenerator, MarkedExecutorService markedExecutorService, PlayerStrategyFactory playerStrategyFactory, MetricsManager metricsManager, AbrPreferences abrPreferences, SurfaceSizeHolderInternal surfaceSizeHolderInternal, ConcurrentPlayerStateManager concurrentPlayerStateManager, ErrorHandlerFactory errorHandlerFactory, StreamUrlValidator streamUrlValidator, StrmManager strmManager, Supplier supplier, Consumer consumer, Consumer consumer2, boolean z, Supplier supplier2, FeatureConfigurator featureConfigurator, AbConfig abConfig, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, boolean z2, tse tseVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, r7, markedExecutorService, playerStrategyFactory, metricsManager, abrPreferences, r12, r13, errorHandlerFactory, r15, strmManager, supplier, consumer, consumer2, z, supplier2, featureConfigurator, abConfig, ottMediaDrmCallbackDelegateFactory, z2, tseVar);
        IndexGenerator indexGenerator2;
        ConcurrentPlayerStateManager concurrentPlayerStateManager2;
        StreamUrlValidator streamUrlValidator2;
        SurfaceSizeHolderInternal surfaceSizeHolderInternal2 = (i2 & 128) != 0 ? new SurfaceSizeHolderInternal(Integer.MAX_VALUE, Integer.MAX_VALUE, abrPreferences.getExperimentalShouldConsiderSelectedUserQuality()) : surfaceSizeHolderInternal;
        if ((i2 & 256) != 0) {
            indexGenerator2 = indexGenerator;
            concurrentPlayerStateManager2 = new ConcurrentPlayerStateManagerImpl(indexGenerator2);
        } else {
            indexGenerator2 = indexGenerator;
            concurrentPlayerStateManager2 = concurrentPlayerStateManager;
        }
        if ((i2 & 1024) != 0) {
            streamUrlValidator2 = new StreamUrlValidatorImpl(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            streamUrlValidator2 = streamUrlValidator;
        }
    }
}
