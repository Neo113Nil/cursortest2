package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.ItemsListAbsoluteIndicesAdapter;
import ru.yandex.video.m3.list_player_manager.impl.WorkHelper;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/BitmapDownloaderFactory;", "", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "videoDataCache", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "firstFrameCache", "Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "preloadCount", "", "workHelper", "Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "useHardcodedRatioForBlurs", "", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;ILru/yandex/video/m3/list_player_manager/impl/WorkHelper;Z)V", "create", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;", "items", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "activityContext", "Landroidx/fragment/app/FragmentActivity;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapDownloaderFactory {
    public static final int $stable = 8;
    private final DataCache<FirstFrameData> firstFrameCache;
    private final PlayerLogger playerLogger;
    private final int preloadCount;
    private final boolean useHardcodedRatioForBlurs;
    private final DataCache<VhVideoData> videoDataCache;
    private final WorkHelper workHelper;

    public BitmapDownloaderFactory(PlayerLogger playerLogger, DataCache<VhVideoData> dataCache, DataCache<FirstFrameData> dataCache2, int i, WorkHelper workHelper, boolean z) {
        this.playerLogger = playerLogger;
        this.videoDataCache = dataCache;
        this.firstFrameCache = dataCache2;
        this.preloadCount = i;
        this.workHelper = workHelper;
        this.useHardcodedRatioForBlurs = z;
    }

    public final GlideBitmapDownloader create(ItemsListAbsoluteIndicesAdapter items, FragmentActivity activityContext) {
        return new GlideBitmapDownloader(this.playerLogger, items, this.videoDataCache, this.firstFrameCache, activityContext, this.preloadCount, this.workHelper, this.useHardcodedRatioForBlurs);
    }
}
