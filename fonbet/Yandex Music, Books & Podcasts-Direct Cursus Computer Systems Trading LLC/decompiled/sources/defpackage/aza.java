package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import java.util.Map;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;

/* loaded from: classes3.dex */
public final class aza implements EasyLoginAnalytics {
    public final jyr a;

    public aza(gza gzaVar, String str) {
        this.a = btf.b(new zya(0, gzaVar, str));
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics
    public final void sendEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        ((IReporterYandex) this.a.getValue()).reportEvent(str, (Map<String, Object>) map);
    }
}
