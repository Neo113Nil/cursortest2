package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes11.dex */
public final class yev {
    public final Uri a;
    public final Integer b;
    public boolean c;

    public yev(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.a = uri;
        this.b = null;
        this.c = true;
    }

    public static yev a(String str) {
        if (str == null) {
            ny61.t("Uri must not be null");
            return null;
        }
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///".concat(str);
        }
        return new yev(Uri.parse(str));
    }

    public yev(int i) {
        this.a = null;
        this.b = Integer.valueOf(i);
        this.c = true;
    }
}
