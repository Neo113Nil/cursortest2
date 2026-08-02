package ru.yandex.video.m3.player.utils;

import android.media.MediaCodecList;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/utils/MediaInfoProvider;", "", "()V", "getMediaCodecList", "", "Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "getMediaCodecListPriorV21", "getMediaCodecListV21", "getMediaInfo", "Lru/yandex/video/m3/player/utils/MediaInfo;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaInfoProvider {
    public static final int $stable = 0;
    public static final MediaInfoProvider INSTANCE = new MediaInfoProvider();

    private MediaInfoProvider() {
    }

    private final List<MediaCodecInfo> getMediaCodecList() {
        return getMediaCodecListV21();
    }

    private final List<MediaCodecInfo> getMediaCodecListPriorV21() {
        int codecCount = MediaCodecList.getCodecCount();
        ArrayList arrayList = new ArrayList(codecCount);
        for (int i = 0; i < codecCount; i++) {
            arrayList.add(MediaCodecList.getCodecInfoAt(i));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(MediaCodecInfoKt.MediaCodecInfo$default(((android.media.MediaCodecInfo) it.next()).getName(), null, 2, null));
        }
        return arrayList2;
    }

    private final List<MediaCodecInfo> getMediaCodecListV21() {
        android.media.MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        ArrayList arrayList = new ArrayList(codecInfos.length);
        for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
            arrayList.add(MediaCodecInfoKt.MediaCodecInfo$default(mediaCodecInfo.getName(), null, 2, null));
        }
        return arrayList;
    }

    public final MediaInfo getMediaInfo() {
        return MediaInfoKt.MediaInfo$default(getMediaCodecList(), null, 2, null);
    }
}
