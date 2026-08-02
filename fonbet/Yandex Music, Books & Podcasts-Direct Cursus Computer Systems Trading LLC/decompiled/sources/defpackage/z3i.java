package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class z3i {
    public static z3i c;
    public final boolean a;
    public final Context b;

    public z3i(Context context, boolean z, boolean z2) {
        c4i[] c4iVarArr = c4i.a;
        context.getClass();
        this.a = z;
        this.b = context;
        ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder("35dc0bfc-990e-4681-ad03-2b200fa7a485");
        newConfigBuilder.getClass();
        if (z2) {
            newConfigBuilder = newConfigBuilder.withLogs();
            newConfigBuilder.getClass();
        }
        ReporterConfig build = newConfigBuilder.build();
        build.getClass();
        AppMetrica.activateReporter(context, build);
    }

    public final IReporter a() {
        c4i[] c4iVarArr = c4i.a;
        c4i[] c4iVarArr2 = c4i.a;
        return AppMetrica.getReporter(this.b, "35dc0bfc-990e-4681-ad03-2b200fa7a485");
    }

    public final void b(String str, Map map) {
        Map<String, Object> j = uah.j(uah.j(uah.j(map, new Pair("is_debug", String.valueOf(this.a))), new Pair("payment_src", this.b.getApplicationInfo().packageName)), new Pair("sdk_version", "6.26.1"));
        IReporter a = a();
        if (a != null) {
            a.reportEvent(str, j);
        }
    }
}
