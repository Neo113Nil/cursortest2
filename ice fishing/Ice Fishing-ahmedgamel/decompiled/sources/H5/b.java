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
    public final R6.b f1250n;

    public b(R6.b bVar) {
        this.f1250n = bVar;
    }

    @Override // e7.e
    public final c f(Collection logs) {
        h.e(logs, "logs");
        Log.d("OneSignalOtel", "OTEL export request sent to backend. count=" + logs.size());
        c f2 = this.f1250n.f(logs);
        f2.f(new n(1, f2, this));
        return f2;
    }

    @Override // e7.e
    public final c shutdown() {
        c shutdown = this.f1250n.shutdown();
        h.d(shutdown, "shutdown(...)");
        return shutdown;
    }
}
