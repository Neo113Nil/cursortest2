package ru.yandex.video.m3.ott.vh;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.PlayerStrategyFactory;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "context", "Landroid/content/Context;", "manifestRepository", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "deviceProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "(Landroid/content/Context;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "create", "Lru/yandex/video/m3/player/PlayerStrategy;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "errorNotifying", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "eventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhPlayerStrategyFactory implements PlayerStrategyFactory {
    public static final int $stable = 8;
    private final Context context;
    private final DeviceProvider deviceProvider;
    private final ManifestRepository<VhVideoData> manifestRepository;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final PlayerLogger playerLogger;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\"\u001a\u00020#H\u0000¢\u0006\u0002\b$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory$Builder;", "", "context", "Landroid/content/Context;", "manifestRepository", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "deviceProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "(Landroid/content/Context;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/ott/ott/DeviceProvider;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDeviceProvider", "()Lru/yandex/video/m3/ott/ott/DeviceProvider;", "setDeviceProvider", "(Lru/yandex/video/m3/ott/ott/DeviceProvider;)V", "getManifestRepository", "()Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "setManifestRepository", "(Lru/yandex/video/m3/ott/data/repository/ManifestRepository;)V", "getMediaDrmCallbackDelegateFactory", "()Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "setMediaDrmCallbackDelegateFactory", "(Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;)V", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "build", "Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Context context;
        private DeviceProvider deviceProvider;
        private ManifestRepository<VhVideoData> manifestRepository;
        private OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
        private PlayerLogger playerLogger;

        public Builder(Context context, ManifestRepository<VhVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, DeviceProvider deviceProvider) {
            this.context = context;
            this.manifestRepository = manifestRepository;
            this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
            this.deviceProvider = deviceProvider;
        }

        public final VhPlayerStrategyFactory build$video_player_internalRelease() {
            Context context = this.context;
            ManifestRepository<VhVideoData> manifestRepository = this.manifestRepository;
            OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory = this.mediaDrmCallbackDelegateFactory;
            DeviceProvider deviceProvider = this.deviceProvider;
            PlayerLogger playerLogger = this.playerLogger;
            if (playerLogger == null) {
                playerLogger = new DummyPlayerLogger();
            }
            return new VhPlayerStrategyFactory(context, manifestRepository, ottMediaDrmCallbackDelegateFactory, deviceProvider, playerLogger, null);
        }

        public final Context getContext() {
            return this.context;
        }

        public final DeviceProvider getDeviceProvider() {
            return this.deviceProvider;
        }

        public final ManifestRepository<VhVideoData> getManifestRepository() {
            return this.manifestRepository;
        }

        public final OttMediaDrmCallbackDelegateFactory getMediaDrmCallbackDelegateFactory() {
            return this.mediaDrmCallbackDelegateFactory;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDeviceProvider(DeviceProvider deviceProvider) {
            this.deviceProvider = deviceProvider;
        }

        public final void setManifestRepository(ManifestRepository<VhVideoData> manifestRepository) {
            this.manifestRepository = manifestRepository;
        }

        public final void setMediaDrmCallbackDelegateFactory(OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory) {
            this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        }

        public final void setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }
    }

    private VhPlayerStrategyFactory(Context context, ManifestRepository<VhVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, DeviceProvider deviceProvider, PlayerLogger playerLogger) {
        this.context = context;
        this.manifestRepository = manifestRepository;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.deviceProvider = deviceProvider;
        this.playerLogger = playerLogger;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategyFactory
    public PlayerStrategy<VhVideoData> create(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, StrmEventLogger eventLogger) {
        return new VhPlayerStrategy(player, this.context, this.deviceProvider, this.playerLogger, this.manifestRepository, this.mediaDrmCallbackDelegateFactory);
    }

    public /* synthetic */ VhPlayerStrategyFactory(Context context, ManifestRepository manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, DeviceProvider deviceProvider, PlayerLogger playerLogger, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, manifestRepository, ottMediaDrmCallbackDelegateFactory, deviceProvider, playerLogger);
    }
}
