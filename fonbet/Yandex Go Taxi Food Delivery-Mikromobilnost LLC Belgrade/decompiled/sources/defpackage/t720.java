package defpackage;

import android.app.Application;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.Map;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class t720 {
    public final Application a;
    public final j b;

    public t720(Application application, j jVar) {
        this.a = application;
        this.b = jVar;
        AppMetricaYandex.activateReporter(application, ReporterYandexConfig.newBuilder("96bbbe34-a1bd-4b8a-8126-29879cd5d463").withLogs().build());
    }

    public final void a(String str, Map map) {
        this.b.o("WebMessenger.".concat(str), null, map);
        AppMetricaYandex.getReporter(this.a, "96bbbe34-a1bd-4b8a-8126-29879cd5d463").reportEvent(str, (Map<String, Object>) map);
    }
}
