package ru.yandex.video.m3.preload;

import androidx.media3.exoplayer.offline.DownloadRequest;
import defpackage.jxi;
import defpackage.u7m;
import defpackage.v7m;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.download.DownloaderConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Lv7m;", "Landroidx/media3/exoplayer/offline/DownloadRequest;", "request", "Lu7m;", "createDownloader", "(Landroidx/media3/exoplayer/offline/DownloadRequest;)Lu7m;", "Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "downloaderConfig", "(Landroidx/media3/exoplayer/offline/DownloadRequest;Lru/yandex/video/m3/model/config/download/DownloaderConfig;)Lu7m;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexDownloaderFactory extends v7m {
    @jxi
    u7m createDownloader(DownloadRequest request);

    u7m createDownloader(DownloadRequest request, DownloaderConfig downloaderConfig);
}
