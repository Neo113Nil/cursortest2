package defpackage;

import android.app.Application;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;

/* loaded from: classes.dex */
public final class uv2 {
    public final IReporterYandex a;

    public uv2(String str, cot cotVar) {
        AppMetricaYandex.activateReporter(((Application) cotVar.b).getApplicationContext(), new ReporterYandexConfig.Builder(str).build());
        this.a = AppMetricaYandex.getReporter(((Application) cotVar.b).getApplicationContext(), str);
    }
}
