package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.os.Handler;
import defpackage.inh;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManagerImpl;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\rB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultVideoDataPreloadManagerFactory;", "T", "Lru/yandex/video/m3/data/dto/VideoData;", "", "videoDataRepository", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "videoDataCache", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "callbackHandler", "Landroid/os/Handler;", "(Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Landroid/os/Handler;)V", "create", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultVideoDataPreloadManagerFactory<T extends VideoData> {

    @Deprecated
    public static final String THREAD_NAME = "YP:VideoDataDownloader";
    private final Handler callbackHandler;
    private final DataCache<T> videoDataCache;
    private final VideoDataRepository<T> videoDataRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DefaultVideoDataPreloadManagerFactory(VideoDataRepository<T> videoDataRepository, DataCache<T> dataCache, Handler handler) {
        this.videoDataRepository = videoDataRepository;
        this.videoDataCache = dataCache;
        this.callbackHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread create$lambda$0(Runnable runnable) {
        return new Thread(runnable, THREAD_NAME);
    }

    public final VideoDataPreloadManager create() {
        return new VideoDataPreloadManagerImpl(this.videoDataRepository, this.videoDataCache, Executors.newSingleThreadExecutor(new inh(0)), this.callbackHandler);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultVideoDataPreloadManagerFactory$Companion;", "", "()V", "THREAD_NAME", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
