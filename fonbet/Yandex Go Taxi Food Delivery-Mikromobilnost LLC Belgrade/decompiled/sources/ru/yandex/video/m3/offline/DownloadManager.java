package ru.yandex.video.m3.offline;

import defpackage.w511;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.player.tracks.TrackVariant;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0017J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadManager;", "", "", "manifestUrl", "Ljava/util/concurrent/Future;", "", "Lru/yandex/video/m3/player/tracks/TrackVariant$DownloadVariant;", "prepareTrackVariants", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "id", "selectedTrackVariants", "Lru/yandex/video/m3/data/Offline$DownloadState;", "start", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/concurrent/Future;", "remove", "resume", "pause", "Lru/yandex/video/m3/offline/DownloadManager$DownloadObserver;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/offline/DownloadManager$DownloadObserver;)V", "removeObserver", "DownloadObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DownloadManager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadManager$DownloadObserver;", "", "Lru/yandex/video/m3/data/Offline$DownloadItem;", "downloadItem", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "Lzy11;", "onDownloadChanged", "(Lru/yandex/video/m3/data/Offline$DownloadItem;Ljava/lang/Exception;)V", "onDownloadRemoved", "(Lru/yandex/video/m3/data/Offline$DownloadItem;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface DownloadObserver {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onDownloadChanged(DownloadObserver downloadObserver, Offline.DownloadItem downloadItem, Exception exc) {
                DownloadObserver.super.onDownloadChanged(downloadItem, exc);
            }

            @Deprecated
            public static void onDownloadRemoved(DownloadObserver downloadObserver, Offline.DownloadItem downloadItem) {
                DownloadObserver.super.onDownloadRemoved(downloadItem);
            }
        }

        default void onDownloadChanged(Offline.DownloadItem downloadItem, Exception exception) {
        }

        default void onDownloadRemoved(Offline.DownloadItem downloadItem) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Future start$default(DownloadManager downloadManager, String str, String str2, List list, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: start");
            return null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.a;
        }
        return downloadManager.start(str, str2, list);
    }

    void addObserver(DownloadObserver observer);

    Future<Offline.DownloadState> pause(String id);

    Future<List<TrackVariant.DownloadVariant>> prepareTrackVariants(String manifestUrl);

    Future<Offline.DownloadState> remove(String id);

    void removeObserver(DownloadObserver observer);

    Future<Offline.DownloadState> resume(String id);

    Future<Offline.DownloadState> start(String id, String manifestUrl, List<TrackVariant.DownloadVariant> selectedTrackVariants);
}
