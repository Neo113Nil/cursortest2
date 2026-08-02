package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes8.dex */
public final class sp50 {
    public final ConnectivityManager a;

    public sp50(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.a = (ConnectivityManager) systemService;
        } else {
            ny61.t("null cannot be cast to non-null type android.net.ConnectivityManager");
            throw null;
        }
    }
}
