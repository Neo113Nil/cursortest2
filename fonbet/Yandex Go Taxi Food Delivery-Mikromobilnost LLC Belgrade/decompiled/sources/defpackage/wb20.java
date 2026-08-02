package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.MetricaSwitch;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class wb20 {
    public static wb20 d;
    public final MetricaSwitch a;
    public final boolean b;
    public final Context c;

    public wb20(MetricaSwitch metricaSwitch, boolean z, Context context, boolean z2) {
        this.a = metricaSwitch;
        this.b = z;
        this.c = context;
        int i = vb20.a[metricaSwitch.ordinal()];
        if (i == 1) {
            ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder("35dc0bfc-990e-4681-ad03-2b200fa7a485");
            AppMetrica.activateReporter(context, (z2 ? newConfigBuilder.withLogs() : newConfigBuilder).build());
        } else {
            if (i == 2) {
                return;
            }
            w511.b();
            throw null;
        }
    }

    public final IReporter a() {
        if (this.a == MetricaSwitch.OFF) {
            return null;
        }
        return AppMetrica.getReporter(this.c, "35dc0bfc-990e-4681-ad03-2b200fa7a485");
    }

    public final void b(String str, Map map) {
        Map<String, Object> o = b.o(b.o(b.o(map, new Pair("is_debug", String.valueOf(this.b))), new Pair("payment_src", this.c.getApplicationInfo().packageName)), new Pair("sdk_version", "7.6.6"));
        IReporter a = a();
        if (a != null) {
            a.reportEvent(str, o);
        }
    }
}
