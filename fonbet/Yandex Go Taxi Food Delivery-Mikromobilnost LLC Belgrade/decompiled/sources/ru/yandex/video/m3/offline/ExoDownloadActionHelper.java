package ru.yandex.video.m3.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.dno;
import defpackage.wqj;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadActionHelper;", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "Landroidx/media3/exoplayer/offline/DownloadService;", Constants.KEY_SERVICE, "<init>", "(Landroid/content/Context;Ljava/lang/Class;)V", "Landroidx/media3/exoplayer/offline/DownloadRequest;", "downloadRequest", "Lzy11;", "start", "(Landroidx/media3/exoplayer/offline/DownloadRequest;)V", "", "id", "pause", "(Ljava/lang/String;)V", "resume", "remove", "Landroid/content/Context;", "Ljava/lang/Class;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloadActionHelper implements DownloadActionHelper {
    public static final int $stable = 8;
    private final Context context;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Class<? extends DownloadService> service;

    public ExoDownloadActionHelper(Context context, Class<? extends DownloadService> cls) {
        this.context = context;
        this.service = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$1(ExoDownloadActionHelper exoDownloadActionHelper, String str) {
        DownloadService.sendSetStopReason(exoDownloadActionHelper.context, exoDownloadActionHelper.service, str, Integer.MAX_VALUE, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void remove$lambda$3(ExoDownloadActionHelper exoDownloadActionHelper, String str) {
        DownloadService.sendRemoveDownload(exoDownloadActionHelper.context, exoDownloadActionHelper.service, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$2(ExoDownloadActionHelper exoDownloadActionHelper, String str) {
        DownloadService.sendSetStopReason(exoDownloadActionHelper.context, exoDownloadActionHelper.service, str, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(ExoDownloadActionHelper exoDownloadActionHelper, DownloadRequest downloadRequest) {
        DownloadService.sendAddDownload(exoDownloadActionHelper.context, exoDownloadActionHelper.service, downloadRequest, true);
    }

    @Override // ru.yandex.video.m3.offline.DownloadActionHelper
    public void pause(String id) {
        this.handler.post(new dno(this, id, 2));
    }

    @Override // ru.yandex.video.m3.offline.DownloadActionHelper
    public void remove(String id) {
        this.handler.post(new dno(this, id, 0));
    }

    @Override // ru.yandex.video.m3.offline.DownloadActionHelper
    public void resume(String id) {
        this.handler.post(new dno(this, id, 1));
    }

    @Override // ru.yandex.video.m3.offline.DownloadActionHelper
    public void start(DownloadRequest downloadRequest) {
        this.handler.post(new wqj(28, this, downloadRequest));
    }
}
