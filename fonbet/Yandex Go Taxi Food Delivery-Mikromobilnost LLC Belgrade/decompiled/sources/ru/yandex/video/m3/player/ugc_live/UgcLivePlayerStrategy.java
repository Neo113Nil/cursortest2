package ru.yandex.video.m3.player.ugc_live;

import android.content.Context;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.player.BasePlayerStrategy;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.drm.PrepareDrmKt;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.ugc_live.xiva.TooEarlyStoppedException;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001?\b\u0000\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BBe\b\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B]\b\u0016\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategy;", "Lru/yandex/video/m3/player/BasePlayerStrategy;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "ugcLiveVhVideoDataRepository", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "ugcLiveManager", "", "shouldRecoverFromDefaultPosition", "shouldStartPlaybackFromLive", "", "maxInitialLiveDeltaMs", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/content/Context;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;ZZJLru/yandex/video/m3/player/tracking/StrmEventLogger;Lru/yandex/video/m3/player/impl/utils/InfoProvider;)V", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/content/Context;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;ZZJLru/yandex/video/m3/player/tracking/StrmEventLogger;)V", "Lzy11;", "releaseUgcLiveManager", "()V", "", "contentId", "Ljava/util/concurrent/Future;", "prepareVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "reloadVideoData", "()Z", "videoData", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "userAskedStartPosition", "getStartPosition", "(Ljava/lang/Long;Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Ljava/lang/Long;", "getContentId", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Ljava/lang/String;", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "onRelease", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "Z", "J", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "Ljava/util/concurrent/atomic/AtomicReference;", "ru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategy$playbackStartObserver$1", "playbackStartObserver", "Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategy$playbackStartObserver$1;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLivePlayerStrategy extends BasePlayerStrategy<VhVideoData> {
    private static final String TAG = "UgcLivePlayerStrategy";
    private final InfoProvider infoProvider;
    private final long maxInitialLiveDeltaMs;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final UgcLivePlayerStrategy$playbackStartObserver$1 playbackStartObserver;
    private final PlayerLogger playerLogger;
    private final AtomicReference<PreparingParams> preparingParams;
    private final boolean shouldRecoverFromDefaultPosition;
    private final boolean shouldStartPlaybackFromLive;
    private final StrmEventLogger strmEventLogger;
    private final UgcLiveManager ugcLiveManager;
    private UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r3v2, types: [ru.yandex.video.m3.player.PlayerAnalyticsObserver, ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$playbackStartObserver$1] */
    public UgcLivePlayerStrategy(final YandexPlayer<?> yandexPlayer, Context context, PlayerLogger playerLogger, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, boolean z, boolean z2, long j, StrmEventLogger strmEventLogger, InfoProvider infoProvider) {
        super(yandexPlayer, new DefaultResourceProvider(context), playerLogger);
        this.playerLogger = playerLogger;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.ugcLiveVhVideoDataRepository = ugcLiveVhVideoDataRepository;
        this.ugcLiveManager = ugcLiveManager;
        this.shouldRecoverFromDefaultPosition = z;
        this.shouldStartPlaybackFromLive = z2;
        this.maxInitialLiveDeltaMs = j;
        this.strmEventLogger = strmEventLogger;
        this.infoProvider = infoProvider;
        this.preparingParams = new AtomicReference<>();
        ?? r3 = new PlayerAnalyticsObserver() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$playbackStartObserver$1
            private final AtomicBoolean isReadyForFirstPlayback = new AtomicBoolean(false);
            private AtomicBoolean isFirstPlayCommandRecevied = new AtomicBoolean(true);

            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onPlayCommand() {
                boolean z3;
                AtomicReference atomicReference;
                long j2;
                if (this.isFirstPlayCommandRecevied.get()) {
                    this.isFirstPlayCommandRecevied.set(false);
                    if (this.isReadyForFirstPlayback.compareAndSet(true, false)) {
                        z3 = UgcLivePlayerStrategy.this.shouldStartPlaybackFromLive;
                        if (z3) {
                            atomicReference = UgcLivePlayerStrategy.this.preparingParams;
                            PreparingParams preparingParams = (PreparingParams) atomicReference.get();
                            if (preparingParams == null || preparingParams.getAutoPlay()) {
                                return;
                            }
                            long liveEdgePosition = yandexPlayer.getLiveEdgePosition();
                            long position = liveEdgePosition - yandexPlayer.getPosition();
                            j2 = UgcLivePlayerStrategy.this.maxInitialLiveDeltaMs;
                            if (position > j2) {
                                yandexPlayer.seekTo(liveEdgePosition);
                            }
                        }
                    }
                }
            }

            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onPreparingStarted(PreparingParams params) {
                AtomicReference atomicReference;
                atomicReference = UgcLivePlayerStrategy.this.preparingParams;
                atomicReference.set(params);
            }

            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onReadyForFirstPlayback(FirstPlaybackInfo firstPlaybackInfo) {
                this.isReadyForFirstPlayback.set(true);
            }

            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onStopPlayback(boolean keepDecoders) {
                this.isReadyForFirstPlayback.set(false);
                this.isFirstPlayCommandRecevied.set(true);
            }
        };
        this.playbackStartObserver = r3;
        yandexPlayer.addAnalyticsObserver(r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseUgcLiveManager() {
        this.ugcLiveManager.release();
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Long getStartPosition(Long userAskedStartPosition, VhVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "getStartPosition", null, new Object[]{"userAskedStartPosition=" + userAskedStartPosition, "videoData.watchProgressPosition=" + videoData.getWatchProgressPositionMs()}, 4, null);
        }
        return userAskedStartPosition == null ? Long.valueOf(videoData.getWatchProgressPositionMs()) : userAskedStartPosition;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public boolean onPlaybackError(PlaybackException playbackException) {
        releaseUgcLiveManager();
        if ((playbackException instanceof PlaybackException.ErrorPreparing) && (playbackException.getCause() instanceof TooEarlyStoppedException)) {
            return false;
        }
        if (!(playbackException instanceof PlaybackException.ErrorNoPrepare)) {
            return super.onPlaybackError(playbackException);
        }
        reloadVideoData();
        return false;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onRelease() {
        super.onRelease();
        releaseUgcLiveManager();
        getPlayer().removeAnalyticsObserver(this.playbackStartObserver);
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public PrepareDrm prepareDrm(VhVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareDrm", null, new Object[]{"videoData=" + INSTANCE.toLog(videoData)}, 4, null);
        }
        final DrmProxy drmConfig = videoData.getDrmConfig();
        if (drmConfig != null) {
            return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$prepareDrm$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PrepareDrm.Builder builder) {
                    OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory;
                    ottMediaDrmCallbackDelegateFactory = UgcLivePlayerStrategy.this.mediaDrmCallbackDelegateFactory;
                    builder.setMediaDrmCallbackDelegate(ottMediaDrmCallbackDelegateFactory.create(drmConfig));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PrepareDrm.Builder) obj);
                    return zy11.a;
                }
            });
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Future<VhVideoData> prepareVideoData(final String contentId) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareVideoData", null, new Object[]{"contentId=".concat(contentId)}, 4, null);
        }
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$prepareVideoData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VhVideoData invoke() {
                UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository;
                InfoProvider infoProvider;
                UgcLiveManager ugcLiveManager;
                YandexPlayer player;
                StrmEventLogger strmEventLogger;
                UgcLivePlayerStrategy.this.releaseUgcLiveManager();
                ugcLiveVhVideoDataRepository = UgcLivePlayerStrategy.this.ugcLiveVhVideoDataRepository;
                String str = contentId;
                infoProvider = UgcLivePlayerStrategy.this.infoProvider;
                UgcLiveVideoData loadVideoData = ugcLiveVhVideoDataRepository.loadVideoData(str, infoProvider.getVpuid());
                ugcLiveManager = UgcLivePlayerStrategy.this.ugcLiveManager;
                String xivaSubscriptionId = loadVideoData.getXivaSubscriptionId();
                if (xivaSubscriptionId == null) {
                    xivaSubscriptionId = contentId;
                }
                player = UgcLivePlayerStrategy.this.getPlayer();
                String videoSessionId = player.getVideoSessionId();
                strmEventLogger = UgcLivePlayerStrategy.this.strmEventLogger;
                return ugcLiveManager.getVhVideoData(loadVideoData, xivaSubscriptionId, videoSessionId, strmEventLogger);
            }
        });
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public boolean reloadVideoData() {
        VideoData videoDataInternal = getPlayer().getVideoDataInternal();
        if (videoDataInternal == null) {
            return false;
        }
        VhVideoData vhVideoData = videoDataInternal instanceof VhVideoData ? (VhVideoData) videoDataInternal : null;
        if (vhVideoData == null) {
            return false;
        }
        final Long valueOf = this.shouldRecoverFromDefaultPosition ? null : Long.valueOf(getPlayer().getPosition());
        getPlayer().prepare(vhVideoData.getContentId(), PlaybackParametersKt.PlaybackParameters(true, new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$reloadVideoData$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                builder.setStartPosition(valueOf);
            }
        }));
        return true;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategy$Companion;", "", "()V", "TAG", "", "toLog", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final VhVideoData toLog(VhVideoData vhVideoData) {
            return vhVideoData.getDrmConfig() instanceof DrmProxyWithFreeRequestParams ? vhVideoData.copy(new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$Companion$toLog$1
                public final void invoke(VhVideoData.Builder builder) {
                    DrmProxy drmConfig = builder.getDrmConfig();
                    DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams = null;
                    DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams2 = drmConfig instanceof DrmProxyWithFreeRequestParams ? (DrmProxyWithFreeRequestParams) drmConfig : null;
                    if (drmProxyWithFreeRequestParams2 != null) {
                        String proxyUrl = drmProxyWithFreeRequestParams2.getProxyUrl();
                        String provisioningUrl = drmProxyWithFreeRequestParams2.getProvisioningUrl();
                        Map<String, String> freeRequestParams = drmProxyWithFreeRequestParams2.getFreeRequestParams();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : freeRequestParams.entrySet()) {
                            if (!jl40.l(entry.getKey(), "sessionId")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        drmProxyWithFreeRequestParams = DrmProxyWithFreeRequestParamsKt.DrmProxyWithFreeRequestParams$default(proxyUrl, provisioningUrl, linkedHashMap, null, 8, null);
                    }
                    builder.setDrmConfig(drmProxyWithFreeRequestParams);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            }) : vhVideoData.copy(new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$Companion$toLog$2
                public final void invoke(VhVideoData.Builder builder) {
                    final DrmProxy drmConfig = builder.getDrmConfig();
                    builder.setDrmConfig(drmConfig != null ? drmConfig.copy(new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$Companion$toLog$2$1$1
                        {
                            super(1);
                        }

                        public final void invoke(DrmProxy.Builder builder2) {
                            DrmRequestParams drmRequestParams = DrmProxy.this.getDrmRequestParams();
                            final DrmProxy drmProxy = DrmProxy.this;
                            builder2.setDrmRequestParams(drmRequestParams.copy(new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategy$Companion$toLog$2$1$1.1
                                {
                                    super(1);
                                }

                                public final void invoke(DrmRequestParams.Builder builder3) {
                                    builder3.setPuid(null);
                                    builder3.setSessionId(DrmProxy.this.getDrmRequestParams().getSessionId() != null ? "***" : null);
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
                    }) : null);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            });
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public String getContentId(VhVideoData videoData) {
        return videoData.getContentId();
    }

    public UgcLivePlayerStrategy(YandexPlayer<?> yandexPlayer, Context context, PlayerLogger playerLogger, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, boolean z, boolean z2, long j, StrmEventLogger strmEventLogger) {
        this(yandexPlayer, context, playerLogger, ottMediaDrmCallbackDelegateFactory, ugcLiveVhVideoDataRepository, ugcLiveManager, z, z2, j, strmEventLogger, new InfoProviderImpl(context));
    }
}
