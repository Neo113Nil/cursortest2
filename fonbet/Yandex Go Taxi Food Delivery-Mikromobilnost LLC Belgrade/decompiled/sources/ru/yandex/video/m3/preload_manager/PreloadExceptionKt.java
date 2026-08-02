package ru.yandex.video.m3.preload_manager;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEventName", "", "Lru/yandex/video/m3/preload_manager/PreloadException;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadExceptionKt {
    public static final String toEventName(PreloadException preloadException) {
        if (preloadException instanceof PreloadException.ApiCallError) {
            return "ApiCall";
        }
        if (preloadException instanceof PreloadException.CacheInitException.StorageNotMounted) {
            return "StorageNotMounted";
        }
        if (preloadException instanceof PreloadException.CacheInitException.StorageReadOnly) {
            return "StorageReadOnly";
        }
        if (preloadException instanceof PreloadException.CacheInitException.InitFailed) {
            return "CacheInitFailed";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledManifestDownload) {
            return "CanceledManifestDownload";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledPendingRequest) {
            return "CanceledPendingRequest";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledTracksDownload) {
            return "CanceledTracksDownload";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.UnsupportedMediaType) {
            return "UnsupportedMediaType";
        }
        if (preloadException instanceof PreloadException.EmptyTrackListSelectedError) {
            return "EmptyTrackListSelected";
        }
        if (preloadException instanceof PreloadException.ManifestDownloadError) {
            return "ManifestDownload";
        }
        if (preloadException instanceof PreloadException.TracksDownloadError) {
            return "TracksDownload";
        }
        if (preloadException instanceof PreloadException.TracksDownloadTimeout) {
            return "TracksDownloadTimeout";
        }
        if (preloadException instanceof PreloadException.UnknownError) {
            return "Unknown";
        }
        w511.b();
        return null;
    }
}
