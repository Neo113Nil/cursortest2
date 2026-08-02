package ru.yandex.video.m3.ott.impl;

import android.content.Context;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.local.SubProfileProvider;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.PictureInPictureProvider;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProviderImpl;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.IsMuteProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingEventBuilderFactory;", "", "context", "Landroid/content/Context;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "deviceProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "connectionChecker", "Lru/yandex/video/m3/ott/impl/ConnectionChecker;", "subProfileProvider", "Lru/yandex/video/m3/ott/data/local/SubProfileProvider;", "pictureInPictureProvider", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "(Landroid/content/Context;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/ott/impl/ConnectionChecker;Lru/yandex/video/m3/ott/data/local/SubProfileProvider;Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;)V", "create", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilder;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "trackingData", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingEventBuilderFactory {
    public static final int $stable = 8;
    private final ConnectionChecker connectionChecker;
    private final Context context;
    private final DeviceProvider deviceProvider;
    private final InfoProvider infoProvider;
    private final PictureInPictureProvider pictureInPictureProvider;
    private final ResourceProvider resourceProvider;
    private final SubProfileProvider subProfileProvider;
    private final TimeProvider timeProvider;

    public TrackingEventBuilderFactory(Context context, InfoProvider infoProvider, TimeProvider timeProvider, DeviceProvider deviceProvider, ResourceProvider resourceProvider, ConnectionChecker connectionChecker, SubProfileProvider subProfileProvider, PictureInPictureProvider pictureInPictureProvider) {
        this.context = context;
        this.infoProvider = infoProvider;
        this.timeProvider = timeProvider;
        this.deviceProvider = deviceProvider;
        this.resourceProvider = resourceProvider;
        this.connectionChecker = connectionChecker;
        this.subProfileProvider = subProfileProvider;
        this.pictureInPictureProvider = pictureInPictureProvider;
    }

    public final TrackingEventBuilder create(YandexPlayer<?> player, Ott.TrackingData trackingData) {
        return new TrackingEventBuilder(player, trackingData, this.infoProvider, this.timeProvider, this.deviceProvider, this.resourceProvider, this.connectionChecker, this.subProfileProvider, this.pictureInPictureProvider, new IsMuteProvider(player, SystemMediaVolumeProviderImpl.INSTANCE.buildFromContext(this.context, Integer.valueOf(player.getPlayerIndex()))));
    }
}
