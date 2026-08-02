package ru.yandex.video.m3.offline;

import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Offline;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u0003H&J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\f\u001a\u00020\bH&J\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadStorage;", "", "add", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/data/Offline$DownloadItem;", "item", "get", "id", "", "getAll", "", "getByManifest", "manifest", "remove", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DownloadStorage {
    Future<Offline.DownloadItem> add(Offline.DownloadItem item);

    Future<Offline.DownloadItem> get(String id);

    Future<List<Offline.DownloadItem>> getAll();

    Future<Offline.DownloadItem> getByManifest(String manifest);

    Future<Offline.DownloadItem> remove(String id);
}
