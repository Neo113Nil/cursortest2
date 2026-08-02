package ru.yandex.video.m3.preload_manager;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManager;", "", "", "isOperational", "()Z", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "", "startPreload", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)Ljava/lang/String;", "Lzy11;", "setPriority", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "cancelPreload", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "startTransaction", "()Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "shutdown", "()V", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "preloadListener", "addListener", "(Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;)V", "removeListener", "Listener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreloadManager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void addListener(PreloadManager preloadManager, Listener listener) {
            PreloadManager.super.addListener(listener);
        }

        @Deprecated
        public static boolean isOperational(PreloadManager preloadManager) {
            return PreloadManager.super.isOperational();
        }

        @Deprecated
        public static void removeListener(PreloadManager preloadManager, Listener listener) {
            PreloadManager.super.removeListener(listener);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "videoSessionId", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "results", "Lzy11;", "onSuccess", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "onCancel", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "onError", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onCancel(Listener listener, VideoData videoData, String str, PreloadException preloadException) {
                Listener.super.onCancel(videoData, str, preloadException);
            }

            @Deprecated
            public static void onError(Listener listener, VideoData videoData, String str, PreloadException preloadException) {
                Listener.super.onError(videoData, str, preloadException);
            }

            @Deprecated
            public static void onSuccess(Listener listener, VideoData videoData, String str, List<DownloadResult> list) {
                Listener.super.onSuccess(videoData, str, list);
            }
        }

        default void onCancel(VideoData videoData, String videoSessionId, PreloadException exception) {
        }

        default void onError(VideoData videoData, String videoSessionId, PreloadException exception) {
        }

        default void onSuccess(VideoData videoData, String videoSessionId, List<DownloadResult> results) {
        }
    }

    default void addListener(Listener preloadListener) {
    }

    void cancelPreload(VideoData videoData);

    default boolean isOperational() {
        return !(this instanceof NoOpPreloadManager);
    }

    default void removeListener(Listener preloadListener) {
    }

    void setPriority(VideoData videoData, PreloadPriority priority);

    void shutdown();

    String startPreload(VideoData videoData, PreloadConfig config, PreloadPriority priority);

    PreloaderTransaction startTransaction();
}
