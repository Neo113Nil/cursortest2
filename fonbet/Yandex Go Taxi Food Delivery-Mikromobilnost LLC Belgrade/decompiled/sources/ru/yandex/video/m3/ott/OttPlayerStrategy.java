package ru.yandex.video.m3.ott;

import defpackage.jxi;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.ott.data.dto.drm.DrmModule;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.data.tracking.OttVideoDataSerializer;
import ru.yandex.video.m3.ott.ott.ConcurrencyArbiterManager;
import ru.yandex.video.m3.ott.ott.LicenseCheckerManager;
import ru.yandex.video.m3.ott.ott.OttEvent;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.ott.OttTrackingReporter;
import ru.yandex.video.m3.ott.ott.TimingsManager;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;
import ru.yandex.video.m3.ott.ott.TrackingManager;
import ru.yandex.video.m3.ott.util.MarkedExecutorService;
import ru.yandex.video.m3.player.BasePlayerStrategy;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.drm.PrepareDrmKt;
import ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter;
import ru.yandex.video.m3.player.tracking.TrackingEvent;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@jxi
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001iB\u0087\u0001\b\u0000\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!Bs\b\u0016\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010,J+\u00103\u001a\u0002022\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00107J+\u0010=\u001a\u00020<2\u001a\u0010;\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000209\u0018\u000108j\u0004\u0018\u0001`:H\u0016¢\u0006\u0004\b=\u0010>J)\u0010B\u001a\u00020<2\u0006\u00101\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020<H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020<H\u0016¢\u0006\u0004\bJ\u0010IJ\u000f\u0010K\u001a\u00020<H\u0016¢\u0006\u0004\bK\u0010IJ\u0017\u0010L\u001a\u00020&2\u0006\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020?2\b\u0010N\u001a\u0004\u0018\u00010?2\u0006\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020<H\u0016¢\u0006\u0004\bQ\u0010IJ\u000f\u0010R\u001a\u00020<H\u0016¢\u0006\u0004\bR\u0010IJ\u0017\u0010S\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u0002H\u0014¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020<H\u0002¢\u0006\u0004\bY\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010_R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lru/yandex/video/m3/ott/OttPlayerStrategy;", "Lru/yandex/video/m3/player/BasePlayerStrategy;", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "Lru/yandex/video/m3/ott/ott/TimingsManager;", "timingsManager", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "trackingManager", "Lru/yandex/video/m3/ott/ott/LicenseCheckerManager;", "licenseCheckerManager", "Lru/yandex/video/m3/ott/ott/TrackSelectionManager;", "trackSelectionManager", "Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;", "concurrencyArbiterManager", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "manifestRepository", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "", "isDynamicDegradationLowSecurityLevel", "Lru/yandex/video/m3/ott/util/MarkedExecutorService;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/ott/TimingsManager;Lru/yandex/video/m3/ott/ott/TrackingManager;Lru/yandex/video/m3/ott/ott/LicenseCheckerManager;Lru/yandex/video/m3/ott/ott/TrackSelectionManager;Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;ZLru/yandex/video/m3/ott/util/MarkedExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/ott/TimingsManager;Lru/yandex/video/m3/ott/ott/TrackingManager;Lru/yandex/video/m3/ott/ott/LicenseCheckerManager;Lru/yandex/video/m3/ott/ott/TrackSelectionManager;Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Z)V", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "getVideoDataSerializer", "()Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "", "contentId", "Ljava/util/concurrent/Future;", "prepareVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "reloadVideoData", "()Z", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "videoData", "Lru/yandex/video/m3/player/tracks/Track;", "prepareTrack", "(Lru/yandex/video/m3/player/PlayerDelegate;Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/ott/data/dto/OttVideoData;)Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/ott/data/dto/OttVideoData;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lzy11;", "onPreparing", "(Ljava/util/Map;)V", "", "startPosition", "autoPlay", "onPrepared", "(Lru/yandex/video/m3/ott/data/dto/OttVideoData;Ljava/lang/Long;Z)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "onResumePlayback", "()V", "onPausePlayback", "onRelease", "getContentId", "(Lru/yandex/video/m3/ott/data/dto/OttVideoData;)Ljava/lang/String;", "userAskedStartPosition", "getStartPosition", "(Ljava/lang/Long;Lru/yandex/video/m3/ott/data/dto/OttVideoData;)Ljava/lang/Long;", "onBufferingStart", "onBufferingEnd", "isDrmProxyMode", "(Lru/yandex/video/m3/ott/data/dto/OttVideoData;)Z", "Lru/yandex/video/m3/player/tracking/TrackingEvent;", "tracking", "reportCustomTracking", "(Lru/yandex/video/m3/player/tracking/TrackingEvent;)Z", "handlePlaybackError", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "Lru/yandex/video/m3/ott/ott/TimingsManager;", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "Lru/yandex/video/m3/ott/ott/LicenseCheckerManager;", "Lru/yandex/video/m3/ott/ott/TrackSelectionManager;", "Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "Z", "Lru/yandex/video/m3/ott/util/MarkedExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "useDrmSecurityLevel", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttPlayerStrategy extends BasePlayerStrategy<OttVideoData> implements AdditionalTrackingReporter {
    private static final String TAG = "OttPlayerStrategy";
    private final ConcurrencyArbiterManager concurrencyArbiterManager;
    private final PlayerPlaybackErrorNotifying errorNotifying;
    private final MarkedExecutorService executorService;
    private final boolean isDynamicDegradationLowSecurityLevel;
    private final LicenseCheckerManager licenseCheckerManager;
    private ManifestRepository<OttVideoData> manifestRepository;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final PlayerLogger playerLogger;
    private final ScheduledExecutorService scheduledExecutorService;
    private final TimingsManager timingsManager;
    private final TrackSelectionManager trackSelectionManager;
    private final TrackingManager trackingManager;
    private volatile DrmSecurityLevel useDrmSecurityLevel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Subtitles.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OttPlayerStrategy(YandexPlayer<?> yandexPlayer, ResourceProvider resourceProvider, PlayerLogger playerLogger, PlayerPlaybackErrorNotifying playerPlaybackErrorNotifying, TimingsManager timingsManager, TrackingManager trackingManager, LicenseCheckerManager licenseCheckerManager, TrackSelectionManager trackSelectionManager, ConcurrencyArbiterManager concurrencyArbiterManager, ManifestRepository<OttVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, boolean z, MarkedExecutorService markedExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(yandexPlayer, resourceProvider, playerLogger);
        this.playerLogger = playerLogger;
        this.errorNotifying = playerPlaybackErrorNotifying;
        this.timingsManager = timingsManager;
        this.trackingManager = trackingManager;
        this.licenseCheckerManager = licenseCheckerManager;
        this.trackSelectionManager = trackSelectionManager;
        this.concurrencyArbiterManager = concurrencyArbiterManager;
        this.manifestRepository = manifestRepository;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.isDynamicDegradationLowSecurityLevel = z;
        this.executorService = markedExecutorService;
        this.scheduledExecutorService = scheduledExecutorService;
        this.useDrmSecurityLevel = DrmSecurityLevel.Default;
    }

    private final void handlePlaybackError() {
        this.timingsManager.stop();
        this.licenseCheckerManager.stop();
        this.concurrencyArbiterManager.stop();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Long getStartPosition(Long userAskedStartPosition, OttVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "getStartPosition", null, new Object[]{"userAskedStartPosition=" + userAskedStartPosition, "videoData.watchProgressPosition=" + videoData.getWatchProgressPosition()}, 4, null);
        }
        return Long.valueOf(userAskedStartPosition != null ? userAskedStartPosition.longValue() : videoData.getWatchProgressPosition());
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public VideoDataSerializer getVideoDataSerializer() {
        return new OttVideoDataSerializer();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingEnd() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onBufferingEnd", null, new Object[0], 4, null);
        }
        this.trackingManager.onBufferingEnd();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingStart() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onBufferingStart", null, new Object[0], 4, null);
        }
        this.trackingManager.onBufferingStart();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onPausePlayback() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onResumePlayback", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public boolean onPlaybackError(PlaybackException playbackException) {
        boolean onPlaybackError;
        boolean z = false;
        this.playerLogger.error(TAG, "onPlaybackError", "received", playbackException, new Object[0]);
        VideoData videoDataInternal = getPlayer().getVideoDataInternal();
        OttVideoData ottVideoData = null;
        OttVideoData ottVideoData2 = videoDataInternal instanceof OttVideoData ? (OttVideoData) videoDataInternal : null;
        if (ottVideoData2 != null && (playbackException instanceof PlaybackException.DrmThrowable)) {
            ottVideoData = ottVideoData2.getFallbackVideoData();
        }
        if (ottVideoData != null) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(TAG, "onPlaybackError", "fallback to videoData", "videoData=" + INSTANCE.toLog(ottVideoData));
            }
            getPlayer().prepare(ottVideoData, PlaybackParametersKt.PlaybackParameters(true, new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$onPlaybackError$2
                {
                    super(1);
                }

                public final void invoke(PlaybackParameters.Builder builder) {
                    YandexPlayer player;
                    player = OttPlayerStrategy.this.getPlayer();
                    builder.setStartPosition(Long.valueOf(player.getPosition()));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PlaybackParameters.Builder) obj);
                    return zy11.a;
                }
            }));
        }
        if (ottVideoData == null) {
            if (playbackException instanceof PlaybackException.ErrorLicenseViolation) {
                PlayerLogger playerLogger2 = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                    playerLogger2.verbose(TAG, "onPlaybackError", "player.stop()", new Object[0]);
                }
                getPlayer().stop();
                onPlaybackError = true;
            } else if (playbackException instanceof PlaybackException.DrmThrowable.ErrorSession) {
                if (this.isDynamicDegradationLowSecurityLevel) {
                    DrmSecurityLevel drmSecurityLevel = this.useDrmSecurityLevel;
                    DrmSecurityLevel drmSecurityLevel2 = DrmSecurityLevel.Low;
                    if (drmSecurityLevel != drmSecurityLevel2 && videoDataInternal != null) {
                        this.playerLogger.info(TAG, "onPlaybackError", "Dynamic degradation low security level", new Object[0]);
                        this.useDrmSecurityLevel = drmSecurityLevel2;
                        getPlayer().prepare(videoDataInternal, PlaybackParametersKt.PlaybackParameters(true, new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$onPlaybackError$unhandled$2
                            {
                                super(1);
                            }

                            public final void invoke(PlaybackParameters.Builder builder) {
                                YandexPlayer player;
                                player = OttPlayerStrategy.this.getPlayer();
                                builder.setStartPosition(Long.valueOf(player.getPosition()));
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((PlaybackParameters.Builder) obj);
                                return zy11.a;
                            }
                        }));
                        onPlaybackError = false;
                    }
                }
                onPlaybackError = super.onPlaybackError(playbackException);
            } else {
                PlayerLogger playerLogger3 = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
                    playerLogger3.verbose(TAG, "onPlaybackError", "Do nothing, call supper method", new Object[0]);
                }
                onPlaybackError = super.onPlaybackError(playbackException);
            }
            if (onPlaybackError) {
                z = true;
            }
        }
        if (z) {
            handlePlaybackError();
        }
        PlayerLogger playerLogger4 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger4)) {
            playerLogger4.verbose(TAG, "onPlaybackError", "processed", "unhandled=" + z);
        }
        return z;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onPrepared(OttVideoData videoData, Long startPosition, boolean autoPlay) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPrepared", null, new Object[]{"videoData=" + INSTANCE.toLog(videoData), "startPosition=" + startPosition, "autoPlay=" + autoPlay}, 4, null);
        }
        this.trackingManager.onPrepared(videoData);
        this.timingsManager.start(getPlayer(), videoData);
        this.trackSelectionManager.start(getPlayer(), videoData);
        this.licenseCheckerManager.start(getPlayer(), this.errorNotifying, videoData.getContentId());
        this.concurrencyArbiterManager.ensureStarted(getPlayer(), this.errorNotifying, videoData.getConcurrencyArbiterConfig());
        super.onPrepared((OttPlayerStrategy) videoData, startPosition, autoPlay);
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onPreparing(Map<String, ? extends Object> additionalParameters) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPreparing", null, new Object[0], 4, null);
        }
        super.onPreparing(additionalParameters);
        this.timingsManager.stop();
        this.trackingManager.stop();
        this.trackSelectionManager.stop();
        this.licenseCheckerManager.stop();
        this.concurrencyArbiterManager.stop();
        this.trackingManager.start(getPlayer());
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onRelease() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(TAG, "onRelease", "start", new Object[0]);
        }
        this.trackingManager.stop();
        this.timingsManager.stop();
        this.licenseCheckerManager.stop();
        this.trackSelectionManager.stop();
        this.concurrencyArbiterManager.stop();
        super.onRelease();
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        MarkedExecutorService markedExecutorService = this.executorService;
        if (markedExecutorService != null && markedExecutorService.getCreatedByPlayer()) {
            markedExecutorService.shutdown();
        }
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(TAG, "onRelease", "success", new Object[0]);
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onResumePlayback() {
        super.onResumePlayback();
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onResumePlayback", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public PrepareDrm prepareDrm(OttVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareDrm", null, new Object[]{"videoData=" + INSTANCE.toLog(videoData) + ", useDrmSecurityLevel=" + this.useDrmSecurityLevel}, 4, null);
        }
        final DrmConfig drmConfig = videoData.getDrmConfig();
        if (drmConfig != null) {
            if (drmConfig instanceof DrmProxy) {
                return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$prepareDrm$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(PrepareDrm.Builder builder) {
                        OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory;
                        DrmSecurityLevel drmSecurityLevel;
                        ottMediaDrmCallbackDelegateFactory = OttPlayerStrategy.this.mediaDrmCallbackDelegateFactory;
                        builder.setMediaDrmCallbackDelegate(ottMediaDrmCallbackDelegateFactory.create((DrmProxy) drmConfig));
                        drmSecurityLevel = OttPlayerStrategy.this.useDrmSecurityLevel;
                        builder.setPreferDrmSecurityLevel(drmSecurityLevel);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PrepareDrm.Builder) obj);
                        return zy11.a;
                    }
                });
            }
            if (drmConfig instanceof DrmModule) {
                return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$prepareDrm$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(PrepareDrm.Builder builder) {
                        DrmSecurityLevel drmSecurityLevel;
                        builder.setOfflineLicenseKeyId(((DrmModule) DrmConfig.this).getLicenseKeyId());
                        drmSecurityLevel = this.useDrmSecurityLevel;
                        builder.setPreferDrmSecurityLevel(drmSecurityLevel);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PrepareDrm.Builder) obj);
                        return zy11.a;
                    }
                });
            }
            w511.b();
        }
        return null;
    }

    public Track prepareTrack(PlayerDelegate<?> playerDelegate, TrackType trackType, OttVideoData videoData) {
        Track prepareTrack = super.prepareTrack(playerDelegate, trackType, (TrackType) videoData);
        return WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()] == 1 ? new OttSubtitleTrackDelegate(getPlayer(), videoData.isForbiddenToDisableSubtitleWithOriginalAudio(), prepareTrack) : prepareTrack;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Future<OttVideoData> prepareVideoData(final String contentId) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareVideoData", null, new Object[]{"contentId=".concat(contentId)}, 4, null);
        }
        this.useDrmSecurityLevel = DrmSecurityLevel.Default;
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$prepareVideoData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final OttVideoData invoke() {
                ManifestRepository manifestRepository;
                ConcurrencyArbiterManager concurrencyArbiterManager;
                YandexPlayer<?> player;
                PlayerPlaybackErrorNotifying playerPlaybackErrorNotifying;
                manifestRepository = OttPlayerStrategy.this.manifestRepository;
                OttVideoData ottVideoData = (OttVideoData) manifestRepository.loadVideoData(contentId).get();
                concurrencyArbiterManager = OttPlayerStrategy.this.concurrencyArbiterManager;
                player = OttPlayerStrategy.this.getPlayer();
                playerPlaybackErrorNotifying = OttPlayerStrategy.this.errorNotifying;
                Future<?> ensureStarted = concurrencyArbiterManager.ensureStarted(player, playerPlaybackErrorNotifying, ottVideoData.getConcurrencyArbiterConfig());
                if (ensureStarted != null) {
                    ensureStarted.get();
                }
                return ottVideoData;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public boolean reloadVideoData() {
        VideoData videoDataInternal = getPlayer().getVideoDataInternal();
        if (videoDataInternal == null) {
            return false;
        }
        OttVideoData ottVideoData = videoDataInternal instanceof OttVideoData ? (OttVideoData) videoDataInternal : null;
        if (ottVideoData == null) {
            return false;
        }
        getPlayer().prepare(ottVideoData.getContentId(), PlaybackParametersKt.PlaybackParameters(true, new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$reloadVideoData$2$1
            {
                super(1);
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                YandexPlayer player;
                player = OttPlayerStrategy.this.getPlayer();
                builder.setStartPosition(Long.valueOf(player.getPosition()));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }
        }));
        return true;
    }

    @Override // ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter
    public boolean reportCustomTracking(TrackingEvent tracking) {
        if (!(tracking instanceof OttEvent)) {
            return false;
        }
        TrackingManager trackingManager = this.trackingManager;
        if (!(trackingManager instanceof OttTrackingReporter)) {
            return false;
        }
        ((OttTrackingReporter) trackingManager).reportCustomTracking((OttEvent) tracking);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/OttPlayerStrategy$Companion;", "", "()V", "TAG", "", "toLog", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OttVideoData toLog(OttVideoData ottVideoData) {
            DrmConfig drmConfig;
            OttVideoData copy;
            DrmConfig drmConfig2 = ottVideoData.getDrmConfig();
            final DrmProxy drmProxy = drmConfig2 instanceof DrmProxy ? (DrmProxy) drmConfig2 : null;
            if (drmProxy == null || (drmConfig = drmProxy.copy(new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$Companion$toLog$2$1
                {
                    super(1);
                }

                public final void invoke(DrmProxy.Builder builder) {
                    DrmRequestParams drmRequestParams = DrmProxy.this.getDrmRequestParams();
                    final DrmProxy drmProxy2 = DrmProxy.this;
                    builder.setDrmRequestParams(drmRequestParams.copy(new tls() { // from class: ru.yandex.video.m3.ott.OttPlayerStrategy$Companion$toLog$2$1.1
                        {
                            super(1);
                        }

                        public final void invoke(DrmRequestParams.Builder builder2) {
                            builder2.setPuid(null);
                            builder2.setSessionId(DrmProxy.this.getDrmRequestParams().getSessionId() != null ? "***" : null);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DrmRequestParams.Builder) obj);
                            return zy11.a;
                        }
                    }));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrmProxy.Builder) obj);
                    return zy11.a;
                }
            })) == null) {
                drmConfig = ottVideoData.getDrmConfig();
            }
            copy = ottVideoData.copy((r32 & 1) != 0 ? ottVideoData.manifestUrl : null, (r32 & 2) != 0 ? ottVideoData.contentId : null, (r32 & 4) != 0 ? ottVideoData.parentContentId : null, (r32 & 8) != 0 ? ottVideoData.audioLanguage : null, (r32 & 16) != 0 ? ottVideoData.subtitleLanguage : null, (r32 & 32) != 0 ? ottVideoData.watchProgressPosition : 0L, (r32 & 64) != 0 ? ottVideoData.drmConfig : drmConfig, (r32 & 128) != 0 ? ottVideoData.trackingData : null, (r32 & 256) != 0 ? ottVideoData.isForbiddenToDisableSubtitleWithOriginalAudio : false, (r32 & 512) != 0 ? ottVideoData.concurrencyArbiterConfig : null, (r32 & 1024) != 0 ? ottVideoData.fallbackVideoData : null, (r32 & 2048) != 0 ? ottVideoData.restrictionAge : null, (r32 & 4096) != 0 ? ottVideoData.multiplex : false, (r32 & 8192) != 0 ? ottVideoData.contentType : null);
            return copy;
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public String getContentId(OttVideoData videoData) {
        return videoData.getContentId();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public boolean isDrmProxyMode(OttVideoData videoData) {
        return videoData.getDrmConfig() instanceof DrmProxy;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public /* bridge */ /* synthetic */ Track prepareTrack(PlayerDelegate playerDelegate, TrackType trackType, VideoData videoData) {
        return prepareTrack((PlayerDelegate<?>) playerDelegate, trackType, (OttVideoData) videoData);
    }

    public OttPlayerStrategy(YandexPlayer<?> yandexPlayer, ResourceProvider resourceProvider, PlayerLogger playerLogger, PlayerPlaybackErrorNotifying playerPlaybackErrorNotifying, TimingsManager timingsManager, TrackingManager trackingManager, LicenseCheckerManager licenseCheckerManager, TrackSelectionManager trackSelectionManager, ConcurrencyArbiterManager concurrencyArbiterManager, ManifestRepository<OttVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, boolean z) {
        this(yandexPlayer, resourceProvider, playerLogger, playerPlaybackErrorNotifying, timingsManager, trackingManager, licenseCheckerManager, trackSelectionManager, concurrencyArbiterManager, manifestRepository, ottMediaDrmCallbackDelegateFactory, z, null, null);
    }
}
