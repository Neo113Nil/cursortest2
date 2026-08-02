package defpackage;

import android.net.Uri;
import com.connectsdk.service.config.WebOSTVServiceConfig;

/* loaded from: classes3.dex */
public abstract class lp {
    public static final jyr a = l18.b.b(hag.I(v3i.class), true);

    public static Uri a(String str) {
        str.getClass();
        String a2 = ((v3i) a.getValue()).a();
        Uri.Builder appendQueryParameter = Uri.parse("https://widget.tickets.yandex.ru/w/sessions").buildUpon().appendPath(str).appendQueryParameter(WebOSTVServiceConfig.KEY_CLIENT_KEY, "bc976093-9cf5-408e-903d-ff204d929080");
        appendQueryParameter.getClass();
        if (a2 != null) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("deviceId", a2);
            appendQueryParameter.getClass();
        }
        Uri build = appendQueryParameter.build();
        build.getClass();
        return build;
    }
}
