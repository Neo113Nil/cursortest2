package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;

/* loaded from: classes3.dex */
public final class v3i {
    public final Context a;
    public final xdr b = ydr.a(null);

    public v3i(Context context) {
        this.a = context;
        AppMetricaYandex.requestStartupParams(context, new u3i(this), "appmetrica_device_id");
    }

    public final String a() {
        String str = (String) this.b.getValue();
        return str == null ? AppMetricaYandex.getDeviceId(this.a) : str;
    }
}
