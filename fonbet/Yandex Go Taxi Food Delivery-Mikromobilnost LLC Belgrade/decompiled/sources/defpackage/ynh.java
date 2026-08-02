package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;

/* loaded from: classes11.dex */
public final class ynh implements cj51 {
    public final a a = new a();

    public static final class a implements bj51 {
        public final void a() {
            CookieManager cookieManager;
            try {
                cookieManager = CookieManager.getInstance();
            } catch (UnsupportedOperationException e) {
                x4c.g("Failed to get CookieManager instance", e, null, null, 12);
                cookieManager = null;
            }
            if (cookieManager != null) {
                cookieManager.flush();
            }
        }
    }

    public final a a() {
        return this.a;
    }

    public final String b(Context context) {
        PackageInfo b = rm41.b(context);
        if (b != null) {
            return b.packageName;
        }
        return null;
    }

    public final String c(Context context) {
        PackageInfo b = rm41.b(context);
        if (b != null) {
            return b.versionName;
        }
        return null;
    }

    public final String d(Context context) {
        PackageInfo b = rm41.b(context);
        if (b != null) {
            return Long.valueOf(b.getLongVersionCode()).toString();
        }
        return null;
    }

    public final Uri[] e(int i, Intent intent) {
        return WebChromeClient.FileChooserParams.parseResult(i, intent);
    }
}
