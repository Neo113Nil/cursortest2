package defpackage;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import androidx.fragment.app.t;
import com.connectsdk.etc.helper.HttpMessage;

/* loaded from: classes5.dex */
public final class a4n implements DownloadListener {
    public final t a;
    public final zh b;
    public final qyf c;
    public DownloadManager.Request d;

    public a4n(t tVar, zh zhVar) {
        tVar.getClass();
        zhVar.getClass();
        this.a = tVar;
        this.b = zhVar;
        this.c = ezf.D(tVar);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String guessFileName = URLUtil.guessFileName(str, str3, str4);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str4);
        request.addRequestHeader(HttpMessage.USER_AGENT, str2);
        request.setTitle(guessFileName);
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
        t tVar = this.a;
        if (etn.z(tVar, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 || Build.VERSION.SDK_INT >= 33) {
            DownloadManager downloadManager = (DownloadManager) tVar.getSystemService(DownloadManager.class);
            x97.y(this.c, dm6.b, null, new z3n(downloadManager, request, null, 0), 2);
            return;
        }
        try {
            this.d = request;
            this.b.a("android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (ActivityNotFoundException unused) {
            ssg.a(7, null, "Activity for requesting storage permission not found", null);
        }
    }
}
