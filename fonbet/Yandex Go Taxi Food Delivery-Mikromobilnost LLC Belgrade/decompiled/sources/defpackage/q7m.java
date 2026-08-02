package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.e;

/* loaded from: classes10.dex */
public final class q7m {
    public final int a;
    public final long b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public boolean d;
    public boolean e;
    public final /* synthetic */ DownloadService f;

    public q7m(DownloadService downloadService, int i, long j) {
        this.f = downloadService;
        this.a = i;
        this.b = j;
    }

    public final void a() {
        p7m p7mVar;
        DownloadService downloadService = this.f;
        p7mVar = downloadService.downloadManagerHelper;
        p7mVar.getClass();
        e eVar = p7mVar.b;
        Notification foregroundNotification = downloadService.getForegroundNotification(eVar.m, eVar.k);
        boolean z = this.e;
        int i = this.a;
        if (z) {
            ((NotificationManager) downloadService.getSystemService("notification")).notify(i, foregroundNotification);
        } else {
            if (tw21.a >= 29) {
                try {
                    downloadService.startForeground(i, foregroundNotification, 1);
                } catch (RuntimeException e) {
                    lk91.e("Util", "The service must be declared with a foregroundServiceType that includes dataSync");
                    throw e;
                }
            } else {
                downloadService.startForeground(i, foregroundNotification);
            }
            this.e = true;
        }
        if (this.d) {
            Handler handler = this.c;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new uxh(24, this), this.b);
        }
    }
}
