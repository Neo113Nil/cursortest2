package ru.yandex.video.m3.list_player_manager.impl;

import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lzy11;", "onPreloadStarted", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "bytes", "onPreloadSuccess", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;J)V", "onPreloadCanceled", "onPreloadError", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoPreloadManagerListener {
    void onPreloadCanceled(MediaData mediaData);

    void onPreloadError(MediaData mediaData);

    void onPreloadStarted(MediaData mediaData);

    void onPreloadSuccess(MediaData mediaData, long bytes);
}
