package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.UUID;

/* loaded from: classes13.dex */
public final class tt41 {
    public final WebView a;
    public final String b;
    public final String c;
    public final String d;

    public tt41(WebView webView, String str) {
        String str2;
        this.a = webView;
        this.b = str;
        try {
            str2 = webView.getUrl();
            if (str2 == null) {
                str2 = "";
            }
        } catch (Exception unused) {
            str2 = this.b;
        }
        this.c = Uri.parse(str2).getHost();
        this.d = UUID.randomUUID().toString();
    }
}
