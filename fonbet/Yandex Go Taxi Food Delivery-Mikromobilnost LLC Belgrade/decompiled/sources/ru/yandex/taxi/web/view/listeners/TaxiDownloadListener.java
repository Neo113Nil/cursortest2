package ru.yandex.taxi.web.view.listeners;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import defpackage.jst;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/web/view/listeners/TaxiDownloadListener;", "Landroid/webkit/DownloadListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "url", "userAgent", "contentDisposition", "mimetype", "", "contentLength", "Lzy11;", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "release", "()V", "Ljava/lang/ref/WeakReference;", "activityRef", "Ljava/lang/ref/WeakReference;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TaxiDownloadListener implements DownloadListener {
    private final WeakReference<Activity> activityRef;

    public TaxiDownloadListener(Activity activity) {
        this.activityRef = new WeakReference<>(activity);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
        Activity activity = this.activityRef.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            jst.e.k(e, "No browser");
        }
    }

    public final void release() {
        this.activityRef.clear();
    }
}
