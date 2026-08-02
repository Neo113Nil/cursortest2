package ru.yandex.video.m3.preload_manager;

import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.DownloadResult;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "downloadId", "contentType", "", "bytesDownloaded", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "downloadedQuality", "", "isCompleted", "isCanceled", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/DownloadResult$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "DownloadResult", "(Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/preload_manager/QualityInfo;ZZLtls;)Lru/yandex/video/m3/preload_manager/DownloadResult;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadResultKt {
    public static final /* synthetic */ DownloadResult DownloadResult(String str, String str2, long j, QualityInfo qualityInfo, boolean z, boolean z2, tls tlsVar) {
        DownloadResult.Builder builder = new DownloadResult.Builder(str, str2, j, qualityInfo, z, z2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
