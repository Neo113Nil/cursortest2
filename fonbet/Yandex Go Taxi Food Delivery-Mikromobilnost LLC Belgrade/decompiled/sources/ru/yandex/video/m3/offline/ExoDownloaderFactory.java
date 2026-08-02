package ru.yandex.video.m3.offline;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import defpackage.db7;
import defpackage.fe10;
import defpackage.ggg;
import defpackage.jkf0;
import defpackage.jnu;
import defpackage.ly3;
import defpackage.mxt0;
import defpackage.ny61;
import defpackage.ql51;
import defpackage.r400;
import defpackage.td10;
import defpackage.tw21;
import defpackage.u7m;
import defpackage.unr0;
import defpackage.v7m;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.download.DownloaderConfig;
import ru.yandex.video.m3.model.config.download.DownloaderConfigKt;
import ru.yandex.video.m3.player.impl.source.dash.manifest.ExtendedDashManifestParser;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloaderFactory;", "Lv7m;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Ldb7;", "cacheDataSourceFactory", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ldb7;Ljava/util/concurrent/Executor;)V", "Landroidx/media3/exoplayer/offline/DownloadRequest;", "request", "Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "downloaderConfig", "Lu7m;", "createDownloaderInternal", "(Landroidx/media3/exoplayer/offline/DownloadRequest;Lru/yandex/video/m3/model/config/download/DownloaderConfig;)Lu7m;", "Landroid/net/Uri;", "", "toMimeType", "(Landroid/net/Uri;)Ljava/lang/String;", "createDownloader", "(Landroidx/media3/exoplayer/offline/DownloadRequest;)Lu7m;", "Ldb7;", "Ljava/util/concurrent/Executor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloaderFactory implements v7m, YandexDownloaderFactory {
    public static final int $stable = 8;
    private final db7 cacheDataSourceFactory;
    private final Executor executor;

    public ExoDownloaderFactory(db7 db7Var, Executor executor) {
        this.cacheDataSourceFactory = db7Var;
        this.executor = executor;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final u7m createDownloaderInternal(DownloadRequest request, DownloaderConfig downloaderConfig) {
        String mimeType = toMimeType(request.uri);
        td10 td10Var = new td10();
        td10Var.b = request.uri;
        td10Var.c = mimeType;
        List<StreamKey> list = request.streamKeys;
        td10Var.f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : ly3.w(list);
        td10Var.g = request.customCacheKey;
        byte[] bArr = request.keySetId;
        r400 r400Var = td10Var.e;
        if (bArr != null) {
            r400Var.getClass();
            Arrays.copyOf(bArr, bArr.length);
        }
        r400Var.getClass();
        fe10 a = td10Var.a();
        switch (mimeType.hashCode()) {
            case -979127466:
                if (mimeType.equals("application/x-mpegURL")) {
                    return new jnu(a, this.cacheDataSourceFactory, this.executor);
                }
                break;
            case -156749520:
                if (mimeType.equals("application/vnd.ms-sstr+xml")) {
                    return new mxt0(a, this.cacheDataSourceFactory, this.executor);
                }
                break;
            case 64194685:
                if (mimeType.equals("application/dash+xml")) {
                    db7 db7Var = this.cacheDataSourceFactory;
                    new ggg();
                    int sourceIndex = downloaderConfig.getSourceIndex();
                    return new ql51(a, new ExtendedDashManifestParser(null, null, null, null, downloaderConfig.getVsid(), sourceIndex != -1 ? String.valueOf(sourceIndex) : null, null), db7Var, this.executor, tw21.W(downloaderConfig.getStartPositionMs()), downloaderConfig.getMaxSegmentsCount());
                }
                break;
            case 1572033377:
                if (mimeType.equals("video/x-unknown")) {
                    return new jkf0(a, this.cacheDataSourceFactory, this.executor);
                }
                break;
        }
        ny61.g("Unsupported type: ".concat(mimeType));
        return null;
    }

    private final String toMimeType(Uri uri) {
        int N = tw21.N(uri);
        if (N == 0) {
            return "application/dash+xml";
        }
        if (N == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (N == 2) {
            return "application/x-mpegURL";
        }
        if (N == 4) {
            return "video/x-unknown";
        }
        ny61.r(unr0.n(uri, "Unsupported type: "));
        return null;
    }

    @Override // defpackage.v7m, ru.yandex.video.m3.preload.YandexDownloaderFactory
    public u7m createDownloader(DownloadRequest request) {
        return createDownloaderInternal(request, DownloaderConfigKt.DownloaderConfig$default(null, 1, null));
    }

    @Override // ru.yandex.video.m3.preload.YandexDownloaderFactory
    public u7m createDownloader(DownloadRequest request, DownloaderConfig downloaderConfig) {
        return createDownloaderInternal(request, downloaderConfig);
    }
}
