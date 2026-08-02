package ru.yandex.video.m3.player.ui.debug.internal.providers;

import defpackage.q5c;
import defpackage.s5c;
import defpackage.scc;
import defpackage.sls;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounter;
import ru.yandex.video.m3.player.impl.tracking.TimeCounterImpl;
import ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002JKB-\b\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0015\b\u0010\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0016J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0016J%\u00107\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\f\u00106\u001a\b\u0012\u0004\u0012\u00020%05H\u0002¢\u0006\u0004\b7\u00108R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020%0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProvider;", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "initStalledCounter", "stalledCounter", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "watchedTimeProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;)V", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "", "positionMs", "Lzy11;", "onPlaybackProgress", "(J)V", "Lru/yandex/video/m3/data/StalledReason;", "stalledReason", "onLoadingStart", "(Lru/yandex/video/m3/data/StalledReason;)V", "onLoadingFinished", "()V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "getCurrentSessionColor", "()Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "", "averageUpscale", "maxUpscale", "getVideoQualityScore", "(DD)D", "updateTvtCriteria", "updateFatalCriteria", "updateVqsCriteria", "updateStalledCountCriteria", "updateInitStalledDurationCriteria", "updateMaxStalledDurationCriteria", "Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProviderImpl$CriteriaType;", "criteriaType", "Lkotlin/Function0;", "action", "updateCriteria", "(Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProviderImpl$CriteriaType;Lsls;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/UpscaleHolder;", "upscaleHolder", "Lru/yandex/video/m3/player/ui/debug/internal/providers/UpscaleHolder;", "lastStalledReason", "Lru/yandex/video/m3/data/StalledReason;", "initStallLength", "J", "maxStallLength", "", "stalledCount", CA20Status.STATUS_USER_I, "", "sessionColorCriteria", "Ljava/util/Map;", "Companion", "CriteriaType", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionColorProviderImpl implements SessionColorProvider {
    public static final int LONG_SESSION_INIT_STALLED_LENGTH_MS_RED_BOUND = 12860;
    public static final int LONG_SESSION_INIT_STALLED_LENGTH_MS_YELLOW_BOUND = 5350;
    public static final int LONG_SESSION_MAX_STALLED_LENGTH_MS_RED_BOUND = 21630;
    public static final int LONG_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND = 3270;
    public static final int LONG_SESSION_STALLED_COUNT_RED_BOUND = 14;
    public static final int LONG_SESSION_STALLED_COUNT_YELLOW_BOUND = 4;
    public static final int SHORT_SESSION_DURATION = 600;
    public static final int SHORT_SESSION_INIT_STALLED_LENGTH_MS_RED_BOUND = 12730;
    public static final int SHORT_SESSION_INIT_STALLED_LENGTH_MS_YELLOW_BOUND = 8200;
    public static final int SHORT_SESSION_MAX_STALLED_LENGTH_MS_RED_BOUND = 3190;
    public static final int SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND = 450;
    public static final int SHORT_SESSION_STALLED_COUNT_RED_BOUND = 3;
    public static final int SHORT_SESSION_STALLED_COUNT_YELLOW_BOUND = 1;
    private static final s5c VQS_GREEN_RANGE;
    private static final s5c VQS_RED_RANGE;
    private static final List<StalledReason> initStalleds;
    private static final List<StalledReason> notCountedStalleds;
    private long initStallLength;
    private final TimeCounter initStalledCounter;
    private StalledReason lastStalledReason;
    private long maxStallLength;
    private Map<CriteriaType, ? extends SessionColor> sessionColorCriteria;
    private int stalledCount;
    private final TimeCounter stalledCounter;
    private final UpscaleHolder upscaleHolder;
    private final WatchedTimeProviderImpl watchedTimeProvider;
    private final YandexPlayer<?> yandexPlayer;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProviderImpl$CriteriaType;", "", "(Ljava/lang/String;I)V", "HAS_TVT", "HAS_FATAL", "VQS", "STALLED_COUNT", "INIT_STALLED_DURATION", "MAX_STALLED_DURATION", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CriteriaType {
        HAS_TVT,
        HAS_FATAL,
        VQS,
        STALLED_COUNT,
        INIT_STALLED_DURATION,
        MAX_STALLED_DURATION
    }

    static {
        StalledReason stalledReason = StalledReason.SET_SOURCE;
        StalledReason stalledReason2 = StalledReason.INIT;
        initStalleds = scc.g(stalledReason, stalledReason2);
        notCountedStalleds = scc.g(stalledReason, stalledReason2, StalledReason.AD_END, StalledReason.AD_START);
        VQS_RED_RANGE = new q5c(0.0d, 87.5d);
        VQS_GREEN_RANGE = new q5c(95.0d, 100.0d);
    }

    private SessionColorProviderImpl(YandexPlayer<?> yandexPlayer, TimeCounter timeCounter, TimeCounter timeCounter2, WatchedTimeProviderImpl watchedTimeProviderImpl) {
        this.yandexPlayer = yandexPlayer;
        this.initStalledCounter = timeCounter;
        this.stalledCounter = timeCounter2;
        this.watchedTimeProvider = watchedTimeProviderImpl;
        this.upscaleHolder = new UpscaleHolder(0, 0, 0, watchedTimeProviderImpl, 7, null);
        yandexPlayer.addObserver(watchedTimeProviderImpl);
        if (yandexPlayer.isPlaying()) {
            watchedTimeProviderImpl.onResumePlayback();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CriteriaType criteriaType : CriteriaType.values()) {
            linkedHashMap.put(criteriaType, SessionColor.GREEN);
        }
        this.sessionColorCriteria = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getVideoQualityScore(double averageUpscale, double maxUpscale) {
        return Math.exp(((maxUpscale * 0.15d) + (averageUpscale * 0.85d)) * (-0.33d)) * 100.0d;
    }

    private final void updateCriteria(CriteriaType criteriaType, sls action) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sessionColorCriteria);
        linkedHashMap.put(criteriaType, action.invoke());
        this.sessionColorCriteria = linkedHashMap;
    }

    private final void updateFatalCriteria() {
        updateCriteria(CriteriaType.HAS_FATAL, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateFatalCriteria$1
            @Override // defpackage.sls
            public final SessionColor invoke() {
                return SessionColor.RED;
            }
        });
    }

    private final void updateInitStalledDurationCriteria() {
        updateCriteria(CriteriaType.INIT_STALLED_DURATION, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateInitStalledDurationCriteria$1
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
            @Override // defpackage.sls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final SessionColor invoke() {
                StalledReason stalledReason;
                long j;
                TimeCounter timeCounter;
                long time;
                WatchedTimeProviderImpl watchedTimeProviderImpl;
                List list;
                StalledReason stalledReason2;
                stalledReason = SessionColorProviderImpl.this.lastStalledReason;
                if (stalledReason != null) {
                    list = SessionColorProviderImpl.initStalleds;
                    stalledReason2 = SessionColorProviderImpl.this.lastStalledReason;
                    if (a.G(list, stalledReason2)) {
                        time = SessionColorProviderImpl.this.initStallLength;
                        watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                        return watchedTimeProviderImpl.getWatchedTime() >= 600 ? time > 12730 ? SessionColor.RED : time > 8200 ? SessionColor.YELLOW : SessionColor.GREEN : time > 12860 ? SessionColor.RED : time > 5350 ? SessionColor.YELLOW : SessionColor.GREEN;
                    }
                }
                j = SessionColorProviderImpl.this.initStallLength;
                timeCounter = SessionColorProviderImpl.this.initStalledCounter;
                time = j + timeCounter.getTime();
                watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                if (watchedTimeProviderImpl.getWatchedTime() >= 600) {
                }
            }
        });
    }

    private final void updateMaxStalledDurationCriteria() {
        updateCriteria(CriteriaType.MAX_STALLED_DURATION, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateMaxStalledDurationCriteria$1
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
            @Override // defpackage.sls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final SessionColor invoke() {
                StalledReason stalledReason;
                long j;
                TimeCounter timeCounter;
                WatchedTimeProviderImpl watchedTimeProviderImpl;
                List list;
                StalledReason stalledReason2;
                stalledReason = SessionColorProviderImpl.this.lastStalledReason;
                if (stalledReason != null) {
                    list = SessionColorProviderImpl.notCountedStalleds;
                    stalledReason2 = SessionColorProviderImpl.this.lastStalledReason;
                    if (!a.G(list, stalledReason2)) {
                        j = SessionColorProviderImpl.this.maxStallLength;
                        watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                        return watchedTimeProviderImpl.getWatchedTime() >= 600 ? j > 3190 ? SessionColor.RED : j > 450 ? SessionColor.YELLOW : SessionColor.GREEN : j > 21630 ? SessionColor.RED : j > 3270 ? SessionColor.YELLOW : SessionColor.GREEN;
                    }
                }
                j = SessionColorProviderImpl.this.maxStallLength;
                timeCounter = SessionColorProviderImpl.this.stalledCounter;
                long time = timeCounter.getTime();
                if (j < time) {
                    j = time;
                }
                watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                if (watchedTimeProviderImpl.getWatchedTime() >= 600) {
                }
            }
        });
    }

    private final void updateStalledCountCriteria() {
        updateCriteria(CriteriaType.STALLED_COUNT, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateStalledCountCriteria$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final SessionColor invoke() {
                WatchedTimeProviderImpl watchedTimeProviderImpl;
                int i;
                int i2;
                int i3;
                int i4;
                watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                long watchedTime = watchedTimeProviderImpl.getWatchedTime();
                SessionColorProviderImpl sessionColorProviderImpl = SessionColorProviderImpl.this;
                if (watchedTime < 600) {
                    i3 = sessionColorProviderImpl.stalledCount;
                    if (i3 > 3) {
                        return SessionColor.RED;
                    }
                    i4 = SessionColorProviderImpl.this.stalledCount;
                    return i4 > 1 ? SessionColor.YELLOW : SessionColor.GREEN;
                }
                i = sessionColorProviderImpl.stalledCount;
                if (i > 14) {
                    return SessionColor.RED;
                }
                i2 = SessionColorProviderImpl.this.stalledCount;
                return i2 > 4 ? SessionColor.YELLOW : SessionColor.GREEN;
            }
        });
    }

    private final void updateTvtCriteria() {
        updateCriteria(CriteriaType.HAS_TVT, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateTvtCriteria$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final SessionColor invoke() {
                WatchedTimeProviderImpl watchedTimeProviderImpl;
                watchedTimeProviderImpl = SessionColorProviderImpl.this.watchedTimeProvider;
                return watchedTimeProviderImpl.getWatchedTime() > 0 ? SessionColor.GREEN : SessionColor.RED;
            }
        });
    }

    private final void updateVqsCriteria() {
        updateCriteria(CriteriaType.VQS, new sls() { // from class: ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl$updateVqsCriteria$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final SessionColor invoke() {
                UpscaleHolder upscaleHolder;
                UpscaleHolder upscaleHolder2;
                double videoQualityScore;
                s5c s5cVar;
                s5c s5cVar2;
                upscaleHolder = SessionColorProviderImpl.this.upscaleHolder;
                double averageUpscale = upscaleHolder.getAverageUpscale();
                upscaleHolder2 = SessionColorProviderImpl.this.upscaleHolder;
                videoQualityScore = SessionColorProviderImpl.this.getVideoQualityScore(averageUpscale, upscaleHolder2.getMaxUpscale());
                s5cVar = SessionColorProviderImpl.VQS_RED_RANGE;
                if (s5cVar.b(Double.valueOf(videoQualityScore))) {
                    return SessionColor.RED;
                }
                s5cVar2 = SessionColorProviderImpl.VQS_GREEN_RANGE;
                return s5cVar2.b(Double.valueOf(videoQualityScore)) ? SessionColor.GREEN : SessionColor.YELLOW;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider
    public SessionColor getCurrentSessionColor() {
        Object obj;
        Object obj2;
        Object obj3;
        updateInitStalledDurationCriteria();
        updateMaxStalledDurationCriteria();
        Collection<? extends SessionColor> values = this.sessionColorCriteria.values();
        Iterator<T> it = values.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((SessionColor) obj2) == SessionColor.RED) {
                break;
            }
        }
        SessionColor sessionColor = (SessionColor) obj2;
        if (sessionColor == null) {
            Iterator<T> it2 = values.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((SessionColor) obj3) == SessionColor.YELLOW) {
                    break;
                }
            }
            sessionColor = (SessionColor) obj3;
            if (sessionColor == null) {
                Iterator<T> it3 = values.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((SessionColor) next) == SessionColor.GREEN) {
                        obj = next;
                        break;
                    }
                }
                SessionColor sessionColor2 = (SessionColor) obj;
                return sessionColor2 == null ? SessionColor.NONE : sessionColor2;
            }
        }
        return sessionColor;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider, ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingFinished() {
        if (a.G(initStalleds, this.lastStalledReason)) {
            this.initStallLength = this.initStalledCounter.getTime() + this.initStallLength;
            this.initStalledCounter.reset();
        }
        if (!a.G(notCountedStalleds, this.lastStalledReason)) {
            long j = this.maxStallLength;
            long time = this.stalledCounter.getTime();
            if (j < time) {
                j = time;
            }
            this.maxStallLength = j;
            this.stalledCounter.reset();
        }
        this.lastStalledReason = null;
        updateInitStalledDurationCriteria();
        updateMaxStalledDurationCriteria();
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadingStart(StalledReason stalledReason) {
        this.lastStalledReason = stalledReason;
        if (!notCountedStalleds.contains(stalledReason)) {
            this.stalledCount++;
            this.stalledCounter.start();
        }
        if (initStalleds.contains(stalledReason)) {
            this.initStalledCounter.start();
        }
        updateStalledCountCriteria();
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider, ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackError(PlaybackException playbackException) {
        updateFatalCriteria();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackProgress(long positionMs) {
        updateTvtCriteria();
        updateVqsCriteria();
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSurfaceSizeChanged(Size surfaceSize) {
        this.upscaleHolder.updateSurface(surfaceSize.getHeight());
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider, ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        Size capping;
        TrackFormat selectedTrackFormat = videoTrack.getSelectedTrackFormat();
        TrackVariant selectedTrackVariant = videoTrack.getSelectedTrackVariant();
        if (selectedTrackVariant instanceof TrackVariant.Adaptive) {
            UpscaleHolder upscaleHolder = this.upscaleHolder;
            CappingProvider cappingProvider = ((TrackVariant.Adaptive) selectedTrackVariant).getCappingProvider();
            upscaleHolder.updateCapping((cappingProvider == null || (capping = cappingProvider.getCapping()) == null) ? -1 : capping.getHeight());
        }
        this.upscaleHolder.updateQuality(selectedTrackFormat != null ? selectedTrackFormat.getHeight() : -1);
    }

    public SessionColorProviderImpl(YandexPlayer<?> yandexPlayer) {
        this(yandexPlayer, new TimeCounterImpl(new SystemTimeProvider()), new TimeCounterImpl(new SystemTimeProvider()), new WatchedTimeProviderImpl(yandexPlayer, new TimeCounterImpl(new SystemTimeProvider())));
    }
}
