package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes5.dex */
public abstract class y7a {
    public static final jyr a = btf.b(new bv7(16));

    public static void a(Context context, String str, boolean z) {
        context.getClass();
        str.getClass();
        String str2 = ((jtt) a.getValue()).b() ? "yandex_music_dark" : "yandex_music";
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.getClass();
            irf.T(buildUpon, str2);
            String uri = buildUpon.build().toString();
            uri.getClass();
            str = uri;
        } catch (UnsupportedOperationException unused) {
            dfi.r("Error while trying to append query param to ".concat(str), "DonationUrlOpener");
        }
        w1g.y(context, str, z);
    }
}
