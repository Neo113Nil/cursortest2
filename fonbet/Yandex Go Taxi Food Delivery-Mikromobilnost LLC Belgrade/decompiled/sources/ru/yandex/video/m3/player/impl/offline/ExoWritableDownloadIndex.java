package ru.yandex.video.m3.player.impl.offline;

import defpackage.pb51;
import defpackage.tcc;
import defpackage.u6m;
import defpackage.x6m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.offline.DownloadStorage;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/offline/ExoWritableDownloadIndex;", "Lpb51;", "Lru/yandex/video/m3/offline/DownloadStorage;", "downloadStorage", "<init>", "(Lru/yandex/video/m3/offline/DownloadStorage;)V", "", "", "states", "Lx6m;", "getDownloads", "([I)Lx6m;", "", "id", "Lu6m;", "getDownload", "(Ljava/lang/String;)Lu6m;", "download", "Lzy11;", "putDownload", "(Lu6m;)V", "removeDownload", "(Ljava/lang/String;)V", "setDownloadingStatesToQueued", "()V", "setStatesToRemoving", "stopReason", "setStopReason", "(I)V", "(Ljava/lang/String;I)V", "Lru/yandex/video/m3/offline/DownloadStorage;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoWritableDownloadIndex implements pb51 {
    public static final int $stable = 8;
    private final DownloadStorage downloadStorage;

    public ExoWritableDownloadIndex(DownloadStorage downloadStorage) {
        this.downloadStorage = downloadStorage;
    }

    @Override // defpackage.pb51
    public u6m getDownload(String id) {
        Offline.DownloadItem downloadItem = this.downloadStorage.get(id).get();
        if (downloadItem != null) {
            return ExoWritableDownloadIndexKt.toExoDownloadItem(downloadItem);
        }
        return null;
    }

    @Override // defpackage.pb51
    public x6m getDownloads(int... states) {
        Offline.DownloadState downloadState;
        ArrayList arrayList = new ArrayList(states.length);
        for (int i : states) {
            downloadState = ExoWritableDownloadIndexKt.toDownloadState(i);
            arrayList.add(downloadState);
        }
        List<Offline.DownloadItem> list = this.downloadStorage.getAll().get();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (arrayList.contains(((Offline.DownloadItem) obj).getState())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ExoWritableDownloadIndexKt.toExoDownloadItem((Offline.DownloadItem) it.next()));
        }
        return new ExoDownloadCursor(arrayList3, 0, 2, null);
    }

    @Override // defpackage.pb51
    public void putDownload(u6m download) {
        this.downloadStorage.add(ExoWritableDownloadIndexKt.toDownloadItem(download)).get();
    }

    @Override // defpackage.pb51
    public void removeDownload(String id) {
        this.downloadStorage.remove(id).get();
    }

    @Override // defpackage.pb51
    public void setDownloadingStatesToQueued() {
        Offline.DownloadItem copy;
        List<Offline.DownloadItem> list = this.downloadStorage.getAll().get();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Offline.DownloadItem) obj).getState() == Offline.DownloadState.Downloading) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copy = r4.copy((r29 & 1) != 0 ? r4.id : null, (r29 & 2) != 0 ? r4.mimeType : null, (r29 & 4) != 0 ? r4.manifestUrl : null, (r29 & 8) != 0 ? r4.state : Offline.DownloadState.Queued, (r29 & 16) != 0 ? r4.contentLength : 0L, (r29 & 32) != 0 ? r4.bytesDownloaded : 0L, (r29 & 64) != 0 ? r4.percentDownloaded : 0.0f, (r29 & 128) != 0 ? r4.startTimeMs : 0L, (r29 & 256) != 0 ? r4.updateTimeMs : 0L, (r29 & 512) != 0 ? ((Offline.DownloadItem) it.next()).trackKey : null);
            arrayList2.add(copy);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.downloadStorage.add((Offline.DownloadItem) it2.next()).get();
        }
    }

    @Override // defpackage.pb51
    public void setStatesToRemoving() {
        Offline.DownloadItem copy;
        List<Offline.DownloadItem> list = this.downloadStorage.getAll().get();
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            copy = r4.copy((r29 & 1) != 0 ? r4.id : null, (r29 & 2) != 0 ? r4.mimeType : null, (r29 & 4) != 0 ? r4.manifestUrl : null, (r29 & 8) != 0 ? r4.state : Offline.DownloadState.Removing, (r29 & 16) != 0 ? r4.contentLength : 0L, (r29 & 32) != 0 ? r4.bytesDownloaded : 0L, (r29 & 64) != 0 ? r4.percentDownloaded : 0.0f, (r29 & 128) != 0 ? r4.startTimeMs : 0L, (r29 & 256) != 0 ? r4.updateTimeMs : 0L, (r29 & 512) != 0 ? ((Offline.DownloadItem) it.next()).trackKey : null);
            arrayList.add(copy);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.downloadStorage.add((Offline.DownloadItem) it2.next()).get();
        }
    }

    @Override // defpackage.pb51
    public void setStopReason(int stopReason) {
        Offline.DownloadItem copy;
        List<Offline.DownloadItem> list = this.downloadStorage.getAll().get();
        ArrayList<Offline.DownloadItem> arrayList = new ArrayList();
        for (Object obj : list) {
            Offline.DownloadItem downloadItem = (Offline.DownloadItem) obj;
            if (downloadItem.getState() == Offline.DownloadState.Completed || downloadItem.getState() == Offline.DownloadState.Failed) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (Offline.DownloadItem downloadItem2 : arrayList) {
            Offline.DownloadState downloadState = Offline.DownloadState.Queued;
            if (stopReason != 0) {
                downloadState = null;
            }
            if (downloadState == null) {
                downloadState = Offline.DownloadState.Stopped;
            }
            copy = downloadItem2.copy((r29 & 1) != 0 ? downloadItem2.id : null, (r29 & 2) != 0 ? downloadItem2.mimeType : null, (r29 & 4) != 0 ? downloadItem2.manifestUrl : null, (r29 & 8) != 0 ? downloadItem2.state : downloadState, (r29 & 16) != 0 ? downloadItem2.contentLength : 0L, (r29 & 32) != 0 ? downloadItem2.bytesDownloaded : 0L, (r29 & 64) != 0 ? downloadItem2.percentDownloaded : 0.0f, (r29 & 128) != 0 ? downloadItem2.startTimeMs : 0L, (r29 & 256) != 0 ? downloadItem2.updateTimeMs : 0L, (r29 & 512) != 0 ? downloadItem2.trackKey : null);
            arrayList2.add(copy);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.downloadStorage.add((Offline.DownloadItem) it.next()).get();
        }
    }

    @Override // defpackage.pb51
    public void setStopReason(String id, int stopReason) {
        Offline.DownloadItem copy;
        Offline.DownloadItem downloadItem = this.downloadStorage.get(id).get();
        if (downloadItem != null) {
            Offline.DownloadState downloadState = Offline.DownloadState.Queued;
            if (stopReason != 0) {
                downloadState = null;
            }
            if (downloadState == null) {
                downloadState = Offline.DownloadState.Stopped;
            }
            copy = downloadItem.copy((r29 & 1) != 0 ? downloadItem.id : null, (r29 & 2) != 0 ? downloadItem.mimeType : null, (r29 & 4) != 0 ? downloadItem.manifestUrl : null, (r29 & 8) != 0 ? downloadItem.state : downloadState, (r29 & 16) != 0 ? downloadItem.contentLength : 0L, (r29 & 32) != 0 ? downloadItem.bytesDownloaded : 0L, (r29 & 64) != 0 ? downloadItem.percentDownloaded : 0.0f, (r29 & 128) != 0 ? downloadItem.startTimeMs : 0L, (r29 & 256) != 0 ? downloadItem.updateTimeMs : 0L, (r29 & 512) != 0 ? downloadItem.trackKey : null);
            if (copy != null) {
                this.downloadStorage.add(copy).get();
            }
        }
    }
}
