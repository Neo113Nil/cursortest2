package bo.app;

import android.net.Uri;
import java.net.URL;

/* loaded from: classes3.dex */
public final class kd {
    public final String a;
    public final Uri b;
    public final URL c;
    public final boolean d;

    public kd(Uri uri) {
        uri.getClass();
        this.b = uri;
        String uri2 = uri.toString();
        uri2.getClass();
        this.a = uri2;
        this.c = new URL(uri2);
        this.d = false;
    }

    public final String toString() {
        return this.a;
    }

    public kd(String str, boolean z) {
        str.getClass();
        this.b = Uri.parse(str);
        this.a = str;
        this.c = new URL(str);
        this.d = z;
    }
}
