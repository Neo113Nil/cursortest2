package ru.yandex.video.m3.offline;

import androidx.media3.exoplayer.offline.DownloadRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadActionHelper;", "", "Landroidx/media3/exoplayer/offline/DownloadRequest;", "downloadRequest", "Lzy11;", "start", "(Landroidx/media3/exoplayer/offline/DownloadRequest;)V", "", "id", "pause", "(Ljava/lang/String;)V", "resume", "remove", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DownloadActionHelper {
    void pause(String id);

    void remove(String id);

    void resume(String id);

    void start(DownloadRequest downloadRequest);
}
