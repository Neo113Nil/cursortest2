package ru.yandex.video.m3.preload_manager;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadManager;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/InternalListener;", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", Constants.KEY_EXCEPTION, "Lzy11;", "onInternalApiError", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalListener extends PreloadManager.Listener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onCancel(InternalListener internalListener, VideoData videoData, String str, PreloadException preloadException) {
            InternalListener.super.onCancel(videoData, str, preloadException);
        }

        @Deprecated
        public static void onError(InternalListener internalListener, VideoData videoData, String str, PreloadException preloadException) {
            InternalListener.super.onError(videoData, str, preloadException);
        }

        @Deprecated
        public static void onInternalApiError(InternalListener internalListener, VideoData videoData, PreloadException.ApiCallError apiCallError) {
            InternalListener.super.onInternalApiError(videoData, apiCallError);
        }

        @Deprecated
        public static void onSuccess(InternalListener internalListener, VideoData videoData, String str, List<DownloadResult> list) {
            InternalListener.super.onSuccess(videoData, str, list);
        }
    }

    default void onInternalApiError(VideoData videoData, PreloadException.ApiCallError exception) {
    }
}
