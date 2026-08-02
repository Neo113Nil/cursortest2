package ru.yandex.video.m3.offline;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.source.TrackFilterProvider;
import ru.yandex.video.m3.source.TrackItem;
import ru.yandex.video.m3.source.TrackItemKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/offline/OfflineTrackFilterProvider;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "downloadStorage", "Lru/yandex/video/m3/offline/DownloadStorage;", "(Lru/yandex/video/m3/offline/DownloadStorage;)V", "filter", "", "Lru/yandex/video/m3/source/TrackItem;", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "playbackParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfflineTrackFilterProvider implements TrackFilterProvider {
    public static final int $stable = 8;
    private final DownloadStorage downloadStorage;

    public OfflineTrackFilterProvider(DownloadStorage downloadStorage) {
        this.downloadStorage = downloadStorage;
    }

    @Override // ru.yandex.video.m3.source.TrackFilterProvider
    public List<TrackItem> filter(Uri uri, PlaybackParameters playbackParameters) {
        List<Offline.TrackKey> trackKey;
        Offline.DownloadItem downloadItem = this.downloadStorage.getByManifest(uri.toString()).get();
        if (downloadItem == null || (trackKey = downloadItem.getTrackKey()) == null) {
            return EmptyList.a;
        }
        List<Offline.TrackKey> list = trackKey;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Offline.TrackKey trackKey2 : list) {
            arrayList.add(TrackItemKt.TrackItem$default(trackKey2.getPeriodIndex(), trackKey2.getGroupIndex(), trackKey2.getTrackIndex(), null, 8, null));
        }
        return arrayList;
    }
}
