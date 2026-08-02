package defpackage;

import android.app.Application;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.Map;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class zv2 implements tv2 {
    public final IReporterYandex a;

    public zv2(Application application, String str, boolean z) {
        ReporterYandexConfig.Builder builder = new ReporterYandexConfig.Builder(str);
        if (z) {
            builder.withLogs();
        }
        AppMetricaYandex.activateReporter(application.getApplicationContext(), builder.build());
        this.a = AppMetricaYandex.getReporter(application.getApplicationContext(), str);
    }

    @Override // defpackage.tv2
    public final void a(String str, c cVar) {
        this.a.reportEvent(str, xsq0.c(cVar));
    }

    @Override // defpackage.tv2
    public final void b(Map map) {
        this.a.reportDiagnosticEvent("FeedSDKEventBox", (Map<String, Object>) map);
    }
}
