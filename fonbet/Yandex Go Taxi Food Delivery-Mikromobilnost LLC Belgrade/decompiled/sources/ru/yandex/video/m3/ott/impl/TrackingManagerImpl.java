package ru.yandex.video.m3.ott.impl;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.n601;
import defpackage.scc;
import defpackage.tcc;
import defpackage.w511;
import defpackage.y7x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdType;
import ru.yandex.video.m3.ott.data.dto.Tracking;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.ott.impl.TrackingEventBuilder;
import ru.yandex.video.m3.ott.ott.OttEvent;
import ru.yandex.video.m3.ott.ott.OttTrackingReporter;
import ru.yandex.video.m3.ott.ott.TrackingManager;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounter;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorTypeKt;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u001a\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010 J\u000f\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010 J+\u00104\u001a\u00020\u00172\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202\u0018\u000100j\u0004\u0018\u0001`3H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010A0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR \u0010X\u001a\b\u0012\u0004\u0012\u0002020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingManagerImpl;", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "Lru/yandex/video/m3/ott/ott/OttTrackingReporter;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "watchCounterPlaying", "watchCounterContentDuration", "firstBufferingDuration", "bufferingDuration", "preparingStreamDuration", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilderFactory;", "eventBuilderFactory", "Lru/yandex/video/m3/ott/impl/TrackingReporter;", "trackingReporter", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/ott/impl/TrackingEventBuilderFactory;Lru/yandex/video/m3/ott/impl/TrackingReporter;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/Tracking;", "tracking", "Lzy11;", "createTrackingEventFactory$video_player_internalRelease", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/Tracking;)V", "createTrackingEventFactory", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onPrepared", "(Lru/yandex/video/m3/ott/data/dto/Tracking;)V", "onBufferingStart", "()V", "onBufferingEnd", "stop", "Lru/yandex/video/m3/ott/ott/OttEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "reportCustomTracking", "(Lru/yandex/video/m3/ott/ott/OttEvent;)V", "", "calculateTimeBetweenAdEvents", "()J", "startScheduledWorkHeartbeat", "stopScheduledWorkHeartbeat", "startScheduledWorkHeartbeat30", "stopScheduledWorkHeartbeat30", "startScheduledWorkContentDurations", "stopScheduledWorkContentDurations", "", "", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "trySendEvent", "(Ljava/util/Map;)V", "pauseContentCounter", "resumeContentCounter", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilderFactory;", "Lru/yandex/video/m3/ott/impl/TrackingReporter;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilder;", "trackingEventBuilder", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilder;", "", "Ljava/util/concurrent/ScheduledFuture;", "contentDurationFutures", "Ljava/util/List;", "heartbeatFuture", "Ljava/util/concurrent/ScheduledFuture;", "heartbeat30Future", "Ljava/util/concurrent/atomic/AtomicLong;", "bufferingCount", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBuffering", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/data/Ad;", "currentAd", "Lru/yandex/video/m3/data/Ad;", "lastAdEventTime", "Lru/yandex/video/m3/ott/data/dto/Tracking;", "", "isFullscreen", "Z", "isPlayerStoppedEventSent", "Lru/yandex/video/m3/player/PlayerObserver;", "playerObserver", "Lru/yandex/video/m3/player/PlayerObserver;", "getPlayerObserver$video_player_internalRelease", "()Lru/yandex/video/m3/player/PlayerObserver;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "playerAnalyticsObserver", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "getPlayerAnalyticsObserver$video_player_internalRelease", "()Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingManagerImpl implements TrackingManager, OttTrackingReporter {
    public static final int $stable = 8;
    private final TimeCounter bufferingDuration;
    private volatile Ad currentAd;
    private final TrackingEventBuilderFactory eventBuilderFactory;
    private final ExecutorService executorService;
    private final TimeCounter firstBufferingDuration;
    private volatile ScheduledFuture<?> heartbeat30Future;
    private volatile ScheduledFuture<?> heartbeatFuture;
    private boolean isFullscreen;
    private boolean isPlayerStoppedEventSent;
    private volatile YandexPlayer<?> player;
    private final TimeCounter preparingStreamDuration;
    private final ScheduledExecutorService scheduledExecutorService;
    private volatile Tracking tracking;
    private volatile TrackingEventBuilder trackingEventBuilder;
    private final TrackingReporter trackingReporter;
    private final TimeCounter watchCounterContentDuration;
    private final TimeCounter watchCounterPlaying;
    private volatile List<? extends ScheduledFuture<?>> contentDurationFutures = EmptyList.a;
    private volatile AtomicLong bufferingCount = new AtomicLong(0);
    private volatile AtomicBoolean isBuffering = new AtomicBoolean(false);
    private volatile AtomicLong lastAdEventTime = new AtomicLong(0);
    private final PlayerObserver<Object> playerObserver = new PlayerObserver<Object>() { // from class: ru.yandex.video.m3.ott.impl.TrackingManagerImpl$playerObserver$1
        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onAdEnd() {
            Ad ad;
            TrackingEventBuilder.AdParams adParams;
            TrackingEventBuilder trackingEventBuilder;
            AtomicLong atomicLong;
            AdType type;
            String name;
            long calculateTimeBetweenAdEvents;
            ad = TrackingManagerImpl.this.currentAd;
            if (ad == null || (type = ad.getType()) == null || (name = type.name()) == null) {
                adParams = null;
            } else {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                calculateTimeBetweenAdEvents = TrackingManagerImpl.this.calculateTimeBetweenAdEvents();
                adParams = new TrackingEventBuilder.AdParams(lowerCase, calculateTimeBetweenAdEvents);
            }
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.AD_SLOT_END, (String) null, (TrackingEventBuilder.MultiplexParams) null, adParams, 6, (Object) null) : null);
            TrackingManagerImpl.this.currentAd = null;
            atomicLong = TrackingManagerImpl.this.lastAdEventTime;
            atomicLong.set(0L);
            TrackingManagerImpl.this.resumeContentCounter();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onAdError(AdException exception) {
            Ad ad;
            TrackingEventBuilder.AdParams adParams;
            TrackingEventBuilder trackingEventBuilder;
            AdType type;
            String name;
            long calculateTimeBetweenAdEvents;
            ad = TrackingManagerImpl.this.currentAd;
            if (ad == null || (type = ad.getType()) == null || (name = type.name()) == null) {
                adParams = null;
            } else {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                calculateTimeBetweenAdEvents = TrackingManagerImpl.this.calculateTimeBetweenAdEvents();
                adParams = new TrackingEventBuilder.AdParams(lowerCase, calculateTimeBetweenAdEvents);
            }
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.AD_ERROR, ErrorTypeKt.toErrorType(exception), (TrackingEventBuilder.MultiplexParams) null, adParams, 4, (Object) null) : null);
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onAdPodEnd() {
            Ad ad;
            TrackingEventBuilder.AdParams adParams;
            TrackingEventBuilder trackingEventBuilder;
            AdType type;
            String name;
            long calculateTimeBetweenAdEvents;
            ad = TrackingManagerImpl.this.currentAd;
            if (ad == null || (type = ad.getType()) == null || (name = type.name()) == null) {
                adParams = null;
            } else {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                calculateTimeBetweenAdEvents = TrackingManagerImpl.this.calculateTimeBetweenAdEvents();
                adParams = new TrackingEventBuilder.AdParams(lowerCase, calculateTimeBetweenAdEvents);
            }
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.AD_CREATIVE_END, (String) null, (TrackingEventBuilder.MultiplexParams) null, adParams, 6, (Object) null) : null);
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onAdPodStart(Ad ad, int index) {
            Ad ad2;
            TrackingEventBuilder.AdParams adParams;
            TrackingEventBuilder trackingEventBuilder;
            AdType type;
            String name;
            long calculateTimeBetweenAdEvents;
            ad2 = TrackingManagerImpl.this.currentAd;
            if (ad2 == null || (type = ad2.getType()) == null || (name = type.name()) == null) {
                adParams = null;
            } else {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                calculateTimeBetweenAdEvents = TrackingManagerImpl.this.calculateTimeBetweenAdEvents();
                adParams = new TrackingEventBuilder.AdParams(lowerCase, calculateTimeBetweenAdEvents);
            }
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.AD_CREATIVE_START, (String) null, (TrackingEventBuilder.MultiplexParams) null, adParams, 6, (Object) null) : null);
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onAdStart(Ad ad) {
            AtomicLong atomicLong;
            TrackingManagerImpl.this.currentAd = ad;
            atomicLong = TrackingManagerImpl.this.lastAdEventTime;
            atomicLong.set(System.currentTimeMillis());
            TrackingManagerImpl.this.pauseContentCounter();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPausePlayback() {
            TrackingEventBuilder trackingEventBuilder;
            TimeCounter timeCounter;
            TimeCounter timeCounter2;
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_PAUSE, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
            TrackingManagerImpl.this.stopScheduledWorkHeartbeat();
            TrackingManagerImpl.this.stopScheduledWorkContentDurations();
            timeCounter = TrackingManagerImpl.this.watchCounterPlaying;
            timeCounter.stop();
            timeCounter2 = TrackingManagerImpl.this.watchCounterContentDuration;
            timeCounter2.stop();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            YandexPlayer yandexPlayer;
            YandexPlayer yandexPlayer2;
            TimeCounter timeCounter;
            TimeCounter timeCounter2;
            TrackingEventBuilder trackingEventBuilder;
            yandexPlayer = TrackingManagerImpl.this.player;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(this);
            }
            yandexPlayer2 = TrackingManagerImpl.this.player;
            if (yandexPlayer2 != null) {
                yandexPlayer2.removeAnalyticsObserver(TrackingManagerImpl.this.getPlayerAnalyticsObserver());
            }
            TrackingManagerImpl.this.isPlayerStoppedEventSent = true;
            TrackingManagerImpl.this.stopScheduledWorkHeartbeat();
            TrackingManagerImpl.this.stopScheduledWorkHeartbeat30();
            TrackingManagerImpl.this.stopScheduledWorkContentDurations();
            timeCounter = TrackingManagerImpl.this.watchCounterPlaying;
            timeCounter.stop();
            timeCounter2 = TrackingManagerImpl.this.watchCounterContentDuration;
            timeCounter2.stop();
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_ERROR, ErrorTypeKt.toErrorType(playbackException), (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 12, (Object) null) : null);
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onResumePlayback() {
            TimeCounter timeCounter;
            TrackingEventBuilder trackingEventBuilder;
            TimeCounter timeCounter2;
            TimeCounter timeCounter3;
            Tracking tracking;
            TrackingEventBuilder trackingEventBuilder2;
            timeCounter = TrackingManagerImpl.this.watchCounterPlaying;
            boolean isEverStarted = timeCounter.isEverStarted();
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            if (isEverStarted) {
                trackingEventBuilder2 = trackingManagerImpl.trackingEventBuilder;
                trackingManagerImpl.trySendEvent(trackingEventBuilder2 != null ? TrackingEventBuilder.build$default(trackingEventBuilder2, TrackingEventType.PLAYER_PLAY, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
            } else {
                trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
                trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.CONTENT_START, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
            }
            TrackingManagerImpl.this.startScheduledWorkHeartbeat();
            TrackingManagerImpl.this.startScheduledWorkContentDurations();
            timeCounter2 = TrackingManagerImpl.this.watchCounterPlaying;
            timeCounter2.start();
            timeCounter3 = TrackingManagerImpl.this.watchCounterContentDuration;
            timeCounter3.start();
            tracking = TrackingManagerImpl.this.tracking;
            if (tracking == null || !tracking.getMultiplex()) {
                return;
            }
            TrackingManagerImpl.this.startScheduledWorkHeartbeat30();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onStopPlayback() {
            boolean z;
            TimeCounter timeCounter;
            TimeCounter timeCounter2;
            TrackingEventBuilder trackingEventBuilder;
            z = TrackingManagerImpl.this.isPlayerStoppedEventSent;
            if (!z) {
                TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
                trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
                trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_STOP, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
                TrackingManagerImpl.this.isPlayerStoppedEventSent = true;
            }
            TrackingManagerImpl.this.stopScheduledWorkHeartbeat();
            TrackingManagerImpl.this.stopScheduledWorkHeartbeat30();
            TrackingManagerImpl.this.stopScheduledWorkContentDurations();
            timeCounter = TrackingManagerImpl.this.watchCounterPlaying;
            timeCounter.stop();
            timeCounter2 = TrackingManagerImpl.this.watchCounterContentDuration;
            timeCounter2.stop();
        }
    };
    private final PlayerAnalyticsObserver playerAnalyticsObserver = new PlayerAnalyticsObserver() { // from class: ru.yandex.video.m3.ott.impl.TrackingManagerImpl$playerAnalyticsObserver$1
        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onFullscreenInfoUpdated(FullscreenDataBundle fullscreenDataBundle) {
            TrackingEventBuilder trackingEventBuilder;
            Boolean isFullscreenExternal = fullscreenDataBundle.getIsFullscreenExternal();
            boolean booleanValue = isFullscreenExternal != null ? isFullscreenExternal.booleanValue() : false;
            TrackingManagerImpl.this.isFullscreen = booleanValue;
            trackingEventBuilder = TrackingManagerImpl.this.trackingEventBuilder;
            if (trackingEventBuilder != null) {
                trackingEventBuilder.setFullscreen(booleanValue);
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onNonFatalPlaybackException(PlaybackException nonFatalPlaybackException) {
            TrackingEventBuilder trackingEventBuilder;
            TrackingManagerImpl trackingManagerImpl = TrackingManagerImpl.this;
            trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
            trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_ERROR, ErrorTypeKt.toErrorType(nonFatalPlaybackException), (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 12, (Object) null) : null);
        }
    };

    public TrackingManagerImpl(TimeCounter timeCounter, TimeCounter timeCounter2, TimeCounter timeCounter3, TimeCounter timeCounter4, TimeCounter timeCounter5, TrackingEventBuilderFactory trackingEventBuilderFactory, TrackingReporter trackingReporter, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService) {
        this.watchCounterPlaying = timeCounter;
        this.watchCounterContentDuration = timeCounter2;
        this.firstBufferingDuration = timeCounter3;
        this.bufferingDuration = timeCounter4;
        this.preparingStreamDuration = timeCounter5;
        this.eventBuilderFactory = trackingEventBuilderFactory;
        this.trackingReporter = trackingReporter;
        this.scheduledExecutorService = scheduledExecutorService;
        this.executorService = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateTimeBetweenAdEvents() {
        if (this.lastAdEventTime.get() > 0) {
            return (System.currentTimeMillis() - this.lastAdEventTime.get()) / 1000;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTrackingEventFactory$lambda$1(TrackingManagerImpl trackingManagerImpl) {
        TrackingEventBuilder trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
        if (trackingEventBuilder != null) {
            trackingEventBuilder.updateDeviceInfoParams();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseContentCounter() {
        stopScheduledWorkContentDurations();
        this.watchCounterContentDuration.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeContentCounter() {
        YandexPlayer<?> yandexPlayer;
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 == null || !yandexPlayer2.isPlaying() || (yandexPlayer = this.player) == null || yandexPlayer.isPlayingAd()) {
            return;
        }
        startScheduledWorkContentDurations();
        this.watchCounterContentDuration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScheduledWorkContentDurations() {
        if (this.contentDurationFutures.isEmpty()) {
            List g = scc.g(new Pair(Long.valueOf(10000 - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_10), new Pair(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_20), new Pair(Long.valueOf(30000 - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_30), new Pair(Long.valueOf(40000 - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_40), new Pair(Long.valueOf(MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_50), new Pair(Long.valueOf(60000 - this.watchCounterContentDuration.getTime()), TrackingEventType.CONTENT_DURATION_60));
            ArrayList arrayList = new ArrayList();
            for (Object obj : g) {
                if (((Number) ((Pair) obj).c()).longValue() >= 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(ExecutorsUtilKt.scheduleSafely(this.scheduledExecutorService, new y7x0(28, this, pair), ((Number) pair.c()).longValue(), TimeUnit.MILLISECONDS));
            }
            this.contentDurationFutures = arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScheduledWorkContentDurations$lambda$9$lambda$8(TrackingManagerImpl trackingManagerImpl, Pair pair) {
        TrackingEventBuilder trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
        trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, (TrackingEventType) pair.f(), (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScheduledWorkHeartbeat() {
        if (this.heartbeatFuture == null) {
            this.heartbeatFuture = ExecutorsUtilKt.scheduleAtFixedRateSafely(this.scheduledExecutorService, new n601(this, 0), 60000 - (this.watchCounterPlaying.getTime() % 60000), 60000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScheduledWorkHeartbeat$lambda$4(TrackingManagerImpl trackingManagerImpl) {
        TrackingEventBuilder trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
        trackingManagerImpl.trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.HEARTBEAT, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScheduledWorkHeartbeat30() {
        if (this.heartbeat30Future != null || this.player == null) {
            return;
        }
        this.heartbeat30Future = ExecutorsUtilKt.scheduleAtFixedRateSafely(this.scheduledExecutorService, new y7x0(29, this, new AtomicLong(this.watchCounterContentDuration.getTime())), 30000L, 30000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScheduledWorkHeartbeat30$lambda$6(TrackingManagerImpl trackingManagerImpl, AtomicLong atomicLong) {
        Map<String, ? extends Object> map;
        long time = trackingManagerImpl.watchCounterContentDuration.getTime();
        long time2 = trackingManagerImpl.bufferingDuration.getTime();
        synchronized (trackingManagerImpl.isBuffering) {
            if (trackingManagerImpl.isBuffering.get()) {
                trackingManagerImpl.bufferingDuration.reset();
                trackingManagerImpl.bufferingDuration.start();
            }
        }
        TrackingEventBuilder trackingEventBuilder = trackingManagerImpl.trackingEventBuilder;
        if (trackingEventBuilder != null) {
            map = TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.HEARTBEAT_30S, (String) null, new TrackingEventBuilder.MultiplexParams(time - atomicLong.get(), time2, trackingManagerImpl.firstBufferingDuration.getTime(), trackingManagerImpl.bufferingCount.get(), trackingManagerImpl.preparingStreamDuration.getTime(), null, 32, null), (TrackingEventBuilder.AdParams) null, 10, (Object) null);
        } else {
            map = null;
        }
        trackingManagerImpl.trySendEvent(map);
        atomicLong.set(time);
        trackingManagerImpl.bufferingCount.set(0L);
        trackingManagerImpl.firstBufferingDuration.reset();
        trackingManagerImpl.bufferingDuration.reset();
        trackingManagerImpl.preparingStreamDuration.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScheduledWorkContentDurations() {
        Iterator<T> it = this.contentDurationFutures.iterator();
        while (it.hasNext()) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) it.next();
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
        this.contentDurationFutures = EmptyList.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScheduledWorkHeartbeat() {
        ScheduledFuture<?> scheduledFuture = this.heartbeatFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.heartbeatFuture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScheduledWorkHeartbeat30() {
        ScheduledFuture<?> scheduledFuture = this.heartbeat30Future;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.heartbeat30Future = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trySendEvent(Map<String, ? extends Object> event) {
        if (event != null) {
            this.trackingReporter.report(event);
        }
    }

    public final void createTrackingEventFactory$video_player_internalRelease(YandexPlayer<?> player, Tracking tracking) {
        this.player = player;
        this.tracking = tracking;
        TrackingEventBuilder create = this.eventBuilderFactory.create(player, tracking.getTrackingData());
        create.setFullscreen(this.isFullscreen);
        this.trackingEventBuilder = create;
        ExecutorsUtilKt.executeSafely(this.executorService, new n601(this, 1));
    }

    /* renamed from: getPlayerAnalyticsObserver$video_player_internalRelease, reason: from getter */
    public final PlayerAnalyticsObserver getPlayerAnalyticsObserver() {
        return this.playerAnalyticsObserver;
    }

    public final PlayerObserver<Object> getPlayerObserver$video_player_internalRelease() {
        return this.playerObserver;
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManager
    public void onBufferingEnd() {
        resumeContentCounter();
        synchronized (this.isBuffering) {
            this.isBuffering.set(false);
            this.bufferingDuration.stop();
            this.firstBufferingDuration.stop();
        }
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManager
    public void onBufferingStart() {
        pauseContentCounter();
        synchronized (this.isBuffering) {
            try {
                this.isBuffering.set(true);
                if (this.watchCounterPlaying.isEverStarted()) {
                    this.bufferingCount.incrementAndGet();
                    this.bufferingDuration.start();
                } else {
                    this.firstBufferingDuration.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManager
    public void onPrepared(Tracking tracking) {
        createTrackingEventFactory$video_player_internalRelease(this.player, tracking);
        this.watchCounterPlaying.reset();
        this.watchCounterContentDuration.reset();
        this.preparingStreamDuration.stop();
        TrackingEventBuilder trackingEventBuilder = this.trackingEventBuilder;
        trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.VIDEO_START, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
    }

    @Override // ru.yandex.video.m3.ott.ott.OttTrackingReporter
    public void reportCustomTracking(OttEvent event) {
        Map<String, ? extends Object> map = null;
        if (event instanceof OttEvent.Error) {
            TrackingEventBuilder trackingEventBuilder = this.trackingEventBuilder;
            if (trackingEventBuilder != null) {
                map = TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_ERROR, event.getName(), (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 12, (Object) null);
            }
        } else if (!(event instanceof OttEvent.Regular)) {
            w511.b();
            return;
        } else {
            TrackingEventBuilder trackingEventBuilder2 = this.trackingEventBuilder;
            if (trackingEventBuilder2 != null) {
                map = TrackingEventBuilder.build$default(trackingEventBuilder2, event.getName(), (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null);
            }
        }
        trySendEvent(map);
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManager
    public void start(YandexPlayer<?> player) {
        this.player = player;
        this.isPlayerStoppedEventSent = false;
        player.addObserver(this.playerObserver);
        player.addAnalyticsObserver(this.playerAnalyticsObserver);
        this.preparingStreamDuration.start();
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManager
    public void stop() {
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            yandexPlayer.removeObserver(this.playerObserver);
        }
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 != null) {
            yandexPlayer2.removeAnalyticsObserver(this.playerAnalyticsObserver);
        }
        if (!this.isPlayerStoppedEventSent) {
            TrackingEventBuilder trackingEventBuilder = this.trackingEventBuilder;
            trySendEvent(trackingEventBuilder != null ? TrackingEventBuilder.build$default(trackingEventBuilder, TrackingEventType.PLAYER_STOP, (String) null, (TrackingEventBuilder.MultiplexParams) null, (TrackingEventBuilder.AdParams) null, 14, (Object) null) : null);
            this.isPlayerStoppedEventSent = true;
        }
        stopScheduledWorkHeartbeat();
        stopScheduledWorkHeartbeat30();
        stopScheduledWorkContentDurations();
        this.watchCounterPlaying.reset();
        this.watchCounterContentDuration.reset();
        this.firstBufferingDuration.reset();
        this.bufferingDuration.reset();
        this.preparingStreamDuration.reset();
        this.trackingEventBuilder = null;
        this.player = null;
    }
}
