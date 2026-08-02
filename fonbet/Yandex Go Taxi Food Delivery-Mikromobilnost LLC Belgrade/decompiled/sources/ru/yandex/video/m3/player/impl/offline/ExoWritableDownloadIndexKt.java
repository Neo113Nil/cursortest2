package ru.yandex.video.m3.player.impl.offline;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import defpackage.eh20;
import defpackage.n7m;
import defpackage.tcc;
import defpackage.u6m;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Offline;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Lru/yandex/video/m3/data/Offline$DownloadState;", "toDownloadState", "(I)Lru/yandex/video/m3/data/Offline$DownloadState;", "toExoDownloadState", "(Lru/yandex/video/m3/data/Offline$DownloadState;)I", "Lru/yandex/video/m3/data/Offline$DownloadItem;", "Lu6m;", "toExoDownloadItem", "(Lru/yandex/video/m3/data/Offline$DownloadItem;)Lu6m;", "toDownloadItem", "(Lu6m;)Lru/yandex/video/m3/data/Offline$DownloadItem;", "STOP_REASON_CODE", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoWritableDownloadIndexKt {
    private static final int STOP_REASON_CODE = 1000;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Offline.DownloadState.values().length];
            try {
                iArr[Offline.DownloadState.Queued.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Offline.DownloadState.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Offline.DownloadState.Downloading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Offline.DownloadState.Completed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Offline.DownloadState.Failed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Offline.DownloadState.Removing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Offline.DownloadState.Restarting.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Offline.DownloadItem toDownloadItem(u6m u6mVar) {
        DownloadRequest downloadRequest = u6mVar.a;
        String str = downloadRequest.id;
        String str2 = downloadRequest.mimeType;
        if (str2 == null) {
            str2 = "video/x-unknown";
        }
        String str3 = str2;
        String uri = downloadRequest.uri.toString();
        Offline.DownloadState downloadState = toDownloadState(u6mVar.b);
        long j = u6mVar.e;
        long j2 = u6mVar.c;
        long j3 = u6mVar.d;
        long j4 = u6mVar.h.a;
        float f = u6mVar.b == 3 ? 100.0f : u6mVar.h.b;
        List<StreamKey> list = u6mVar.a.streamKeys;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StreamKey streamKey = (StreamKey) it.next();
            arrayList.add(new Offline.TrackKey(streamKey.periodIndex, streamKey.groupIndex, streamKey.streamIndex));
            it = it;
            str = str;
            str3 = str3;
        }
        return new Offline.DownloadItem(str, str3, uri, downloadState, j, j4, f, j2, j3, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offline.DownloadState toDownloadState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? Offline.DownloadState.Restarting : Offline.DownloadState.Restarting : Offline.DownloadState.Removing : Offline.DownloadState.Failed : Offline.DownloadState.Completed : Offline.DownloadState.Downloading : Offline.DownloadState.Stopped : Offline.DownloadState.Queued;
    }

    public static final u6m toExoDownloadItem(Offline.DownloadItem downloadItem) {
        String id = downloadItem.getId();
        Uri parse = Uri.parse(downloadItem.getManifestUrl());
        String q = eh20.q(downloadItem.getMimeType());
        List<Offline.TrackKey> trackKey = downloadItem.getTrackKey();
        ArrayList arrayList = new ArrayList(tcc.n(trackKey, 10));
        for (Offline.TrackKey trackKey2 : trackKey) {
            arrayList.add(new StreamKey(trackKey2.getPeriodIndex(), trackKey2.getGroupIndex(), trackKey2.getTrackIndex()));
        }
        DownloadRequest downloadRequest = new DownloadRequest(id, parse, q, arrayList, null, null, null, null);
        int exoDownloadState = toExoDownloadState(downloadItem.getState());
        long startTimeMs = downloadItem.getStartTimeMs();
        long updateTimeMs = downloadItem.getUpdateTimeMs();
        long contentLength = downloadItem.getContentLength();
        Integer num = downloadItem.getState() != Offline.DownloadState.Stopped ? null : 1000;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = downloadItem.getState() == Offline.DownloadState.Failed ? 1 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        n7m n7mVar = new n7m();
        n7mVar.a = downloadItem.getBytesDownloaded();
        n7mVar.b = downloadItem.getPercentDownloaded();
        return new u6m(downloadRequest, exoDownloadState, startTimeMs, updateTimeMs, contentLength, intValue, intValue2, n7mVar);
    }

    private static final int toExoDownloadState(Offline.DownloadState downloadState) {
        switch (WhenMappings.$EnumSwitchMapping$0[downloadState.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 7;
            default:
                w511.b();
                return 0;
        }
    }
}
