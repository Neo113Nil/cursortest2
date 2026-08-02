package ru.yandex.video.m3.player.ugc_live;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.PlayerStrategyFactory;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cBG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "context", "Landroid/content/Context;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "ugcLiveVhVideoDataRepository", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "ugcLiveManager", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "recoverFromDefaultPosition", "", "startPlaybackFromLive", "maxInitialLiveDeltaMs", "", "(Landroid/content/Context;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;Lru/yandex/video/m3/player/utils/PlayerLogger;ZZJ)V", "create", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "errorNotifying", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "eventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Builder", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLivePlayerStrategyFactory implements PlayerStrategyFactory {
    private static final long DEFAULT_MAX_INITIAL_LIVE_DELTA_MS = 5000;
    private final Context context;
    private final long maxInitialLiveDeltaMs;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final PlayerLogger playerLogger;
    private final boolean recoverFromDefaultPosition;
    private final boolean startPlaybackFromLive;
    private final UgcLiveManager ugcLiveManager;
    private UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u00102\u001a\u000203H\u0000¢\u0006\u0002\b4R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory$Builder;", "", "context", "Landroid/content/Context;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "ugcLiveVhVideoDataRepository", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "ugcLiveManager", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "(Landroid/content/Context;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "maxInitialLiveDeltaMs", "", "getMaxInitialLiveDeltaMs", "()Ljava/lang/Long;", "setMaxInitialLiveDeltaMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMediaDrmCallbackDelegateFactory", "()Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "setMediaDrmCallbackDelegateFactory", "(Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;)V", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "recoverFromDefaultPosition", "", "getRecoverFromDefaultPosition", "()Ljava/lang/Boolean;", "setRecoverFromDefaultPosition", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "startPlaybackFromLive", "getStartPlaybackFromLive", "setStartPlaybackFromLive", "getUgcLiveManager", "()Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "setUgcLiveManager", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;)V", "getUgcLiveVhVideoDataRepository", "()Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "setUgcLiveVhVideoDataRepository", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;)V", "build", "Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Context context;
        private Long maxInitialLiveDeltaMs;
        private OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
        private PlayerLogger playerLogger;
        private Boolean recoverFromDefaultPosition;
        private Boolean startPlaybackFromLive;
        private UgcLiveManager ugcLiveManager;
        private UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository;

        public Builder(Context context, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager) {
            this.context = context;
            this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
            this.ugcLiveVhVideoDataRepository = ugcLiveVhVideoDataRepository;
            this.ugcLiveManager = ugcLiveManager;
        }

        public final UgcLivePlayerStrategyFactory build$video_player_internalRelease() {
            Context context = this.context;
            OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory = this.mediaDrmCallbackDelegateFactory;
            UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository = this.ugcLiveVhVideoDataRepository;
            UgcLiveManager ugcLiveManager = this.ugcLiveManager;
            PlayerLogger playerLogger = this.playerLogger;
            if (playerLogger == null) {
                playerLogger = new DummyPlayerLogger();
            }
            Boolean bool = this.recoverFromDefaultPosition;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.startPlaybackFromLive;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Long l = this.maxInitialLiveDeltaMs;
            return new UgcLivePlayerStrategyFactory(context, ottMediaDrmCallbackDelegateFactory, ugcLiveVhVideoDataRepository, ugcLiveManager, playerLogger, booleanValue, booleanValue2, l != null ? l.longValue() : 5000L, null);
        }

        public final Context getContext() {
            return this.context;
        }

        public final Long getMaxInitialLiveDeltaMs() {
            return this.maxInitialLiveDeltaMs;
        }

        public final OttMediaDrmCallbackDelegateFactory getMediaDrmCallbackDelegateFactory() {
            return this.mediaDrmCallbackDelegateFactory;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final Boolean getRecoverFromDefaultPosition() {
            return this.recoverFromDefaultPosition;
        }

        public final Boolean getStartPlaybackFromLive() {
            return this.startPlaybackFromLive;
        }

        public final UgcLiveManager getUgcLiveManager() {
            return this.ugcLiveManager;
        }

        public final UgcLiveVhVideoDataRepository getUgcLiveVhVideoDataRepository() {
            return this.ugcLiveVhVideoDataRepository;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setMaxInitialLiveDeltaMs(Long l) {
            this.maxInitialLiveDeltaMs = l;
        }

        public final void setMediaDrmCallbackDelegateFactory(OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory) {
            this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        }

        public final void setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }

        public final void setRecoverFromDefaultPosition(Boolean bool) {
            this.recoverFromDefaultPosition = bool;
        }

        public final void setStartPlaybackFromLive(Boolean bool) {
            this.startPlaybackFromLive = bool;
        }

        public final void setUgcLiveManager(UgcLiveManager ugcLiveManager) {
            this.ugcLiveManager = ugcLiveManager;
        }

        public final void setUgcLiveVhVideoDataRepository(UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository) {
            this.ugcLiveVhVideoDataRepository = ugcLiveVhVideoDataRepository;
        }
    }

    private UgcLivePlayerStrategyFactory(Context context, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, PlayerLogger playerLogger, boolean z, boolean z2, long j) {
        this.context = context;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.ugcLiveVhVideoDataRepository = ugcLiveVhVideoDataRepository;
        this.ugcLiveManager = ugcLiveManager;
        this.playerLogger = playerLogger;
        this.recoverFromDefaultPosition = z;
        this.startPlaybackFromLive = z2;
        this.maxInitialLiveDeltaMs = j;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategyFactory
    public PlayerStrategy<VideoData> create(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, StrmEventLogger eventLogger) {
        return new UgcLivePlayerStrategy(player, this.context, this.playerLogger, this.mediaDrmCallbackDelegateFactory, this.ugcLiveVhVideoDataRepository, this.ugcLiveManager, this.recoverFromDefaultPosition, this.startPlaybackFromLive, this.maxInitialLiveDeltaMs, eventLogger);
    }

    public /* synthetic */ UgcLivePlayerStrategyFactory(Context context, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, PlayerLogger playerLogger, boolean z, boolean z2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ottMediaDrmCallbackDelegateFactory, ugcLiveVhVideoDataRepository, ugcLiveManager, playerLogger, z, z2, j);
    }
}
