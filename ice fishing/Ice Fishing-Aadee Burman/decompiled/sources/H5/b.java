package H5;

import F.n;
import Y6.c;
import android.util.Log;
import e7.e;
import java.util.Collection;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: n, reason: collision with root package name */
    public final R6.b f1225n;

    public b(R6.b bVar) {
        this.f1225n = bVar;
    }

    @Override // e7.e
    public final c f(Collection logs) {
        h.e(logs, "logs");
        Log.d("OneSignalOtel", "OTEL export request sent to backend. count=" + logs.size());
        c f3 = this.f1225n.f(logs);
        f3.f(new n(1, f3, this));
        return f3;
    }

    @Override // e7.e
    public final c shutdown() {
        c shutdown = this.f1225n.shutdown();
        h.d(shutdown, "shutdown(...)");
        return shutdown;
    }
}
