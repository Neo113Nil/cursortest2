package ru.yandex.video.m3.preload_manager;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadObserver;", "", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "Lzy11;", "onRequestQueued", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "downloadResults", "onJobSuccess", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "onJobCancel", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;Ljava/util/List;)V", "onJobError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "onApiError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreloadObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onApiError(PreloadObserver preloadObserver, PreloadRequest preloadRequest, PreloadException.ApiCallError apiCallError) {
            PreloadObserver.super.onApiError(preloadRequest, apiCallError);
        }

        @Deprecated
        public static void onJobCancel(PreloadObserver preloadObserver, PreloadRequest preloadRequest, PreloadException preloadException, List<DownloadResult> list) {
            PreloadObserver.super.onJobCancel(preloadRequest, preloadException, list);
        }

        @Deprecated
        public static void onJobError(PreloadObserver preloadObserver, PreloadRequest preloadRequest, PreloadException preloadException) {
            PreloadObserver.super.onJobError(preloadRequest, preloadException);
        }

        @Deprecated
        public static void onJobSuccess(PreloadObserver preloadObserver, PreloadRequest preloadRequest, List<DownloadResult> list) {
            PreloadObserver.super.onJobSuccess(preloadRequest, list);
        }

        @Deprecated
        public static void onRequestQueued(PreloadObserver preloadObserver, PreloadRequest preloadRequest) {
            PreloadObserver.super.onRequestQueued(preloadRequest);
        }
    }

    default void onApiError(PreloadRequest preloadRequest, PreloadException.ApiCallError exception) {
    }

    default void onJobCancel(PreloadRequest preloadRequest, PreloadException exception, List<DownloadResult> downloadResults) {
    }

    default void onJobError(PreloadRequest preloadRequest, PreloadException exception) {
    }

    default void onJobSuccess(PreloadRequest preloadRequest, List<DownloadResult> downloadResults) {
    }

    default void onRequestQueued(PreloadRequest preloadRequest) {
    }
}
