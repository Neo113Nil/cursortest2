package defpackage;

import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes8.dex */
public final class rot {
    public final i3y a;

    public rot(sot sotVar) {
        this.a = a.b(LazyThreadSafetyMode.SYNCHRONIZED, new ppr(6, sotVar));
    }

    public final void a(String str, Throwable th) {
        ((IReporter) this.a.getValue()).reportError(str, th);
    }

    public final void b(Pair pair) {
        ((IReporter) this.a.getValue()).reportEvent((String) pair.getFirst(), (Map<String, Object>) pair.getSecond());
    }
}
