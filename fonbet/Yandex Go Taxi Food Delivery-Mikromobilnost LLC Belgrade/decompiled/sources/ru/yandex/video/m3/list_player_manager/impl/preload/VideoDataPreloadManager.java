package ru.yandex.video.m3.list_player_manager.impl.preload;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u000fJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;", "", "", "", "videoContentIds", "Lzy11;", "startPreload", "(Ljava/lang/Iterable;)V", "cancelPreload", "shutDown", "()V", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;", "preloadListener", "setListener", "(Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;)V", "VideoDataPreloadListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoDataPreloadManager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void setListener(VideoDataPreloadManager videoDataPreloadManager, VideoDataPreloadListener videoDataPreloadListener) {
            VideoDataPreloadManager.super.setListener(videoDataPreloadListener);
        }

        @Deprecated
        public static void shutDown(VideoDataPreloadManager videoDataPreloadManager) {
            VideoDataPreloadManager.super.shutDown();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H&¢\u0006\u0004\b\n\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;", "", "", "", "Lru/yandex/video/m3/data/dto/VideoData;", Constants.KEY_DATA, "Lzy11;", "onVideoDataLoaded", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/preload_manager/PreloadException;", "onVideoDataError", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface VideoDataPreloadListener {
        void onVideoDataError(Map<String, ? extends PreloadException> data);

        void onVideoDataLoaded(Map<String, ? extends VideoData> data);
    }

    void cancelPreload(Iterable<String> videoContentIds);

    default void setListener(VideoDataPreloadListener preloadListener) {
    }

    default void shutDown() {
    }

    void startPreload(Iterable<String> videoContentIds);
}
