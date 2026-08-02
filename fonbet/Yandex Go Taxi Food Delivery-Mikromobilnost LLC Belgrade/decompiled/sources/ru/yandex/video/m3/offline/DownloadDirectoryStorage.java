package ru.yandex.video.m3.offline;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryStorage;", "", "activeDownloadDirectory", "", "getActiveDownloadDirectory", "()Ljava/lang/String;", "setActiveDownloadDirectory", "(Ljava/lang/String;)V", "isDownloadToExternal", "", "()Z", "setDownloadToExternal", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DownloadDirectoryStorage {
    String getActiveDownloadDirectory();

    boolean isDownloadToExternal();

    void setActiveDownloadDirectory(String str);

    void setDownloadToExternal(boolean z);
}
