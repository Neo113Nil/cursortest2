package ru.yandex.video.m3.offline;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/offline/YandexDashDownloaderHelper;", "", "()V", "calculateLastSegmentNumber", "", "firstSegmentNum", "segmentCount", "maxSegmentToDownload", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexDashDownloaderHelper {
    public static final int $stable = 0;

    public final long calculateLastSegmentNumber(long firstSegmentNum, long segmentCount, int maxSegmentToDownload) {
        return maxSegmentToDownload == -1 ? (firstSegmentNum + segmentCount) - 1 : (Math.min(segmentCount, maxSegmentToDownload) + firstSegmentNum) - 1;
    }
}
