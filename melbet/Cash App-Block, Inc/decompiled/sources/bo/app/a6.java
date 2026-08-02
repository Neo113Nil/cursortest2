package bo.app;

import android.net.Uri;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public abstract class a6 {
    public static String a(String str, String str2, String str3, String str4, int i) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        if (!StringsKt__StringsJVMKt.startsWith(str, "http://", false) && !StringsKt__StringsJVMKt.startsWith(str, "https://", false)) {
            str = "https://".concat(str);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("sse");
        buildUpon.appendQueryParameter("mite", str2);
        buildUpon.appendQueryParameter("auth", str3);
        buildUpon.appendQueryParameter("attempts", String.valueOf(i));
        if (str4 != null) {
            buildUpon.appendQueryParameter("rcs", str4);
        }
        String uri = buildUpon.build().toString();
        uri.getClass();
        return uri;
    }
}
