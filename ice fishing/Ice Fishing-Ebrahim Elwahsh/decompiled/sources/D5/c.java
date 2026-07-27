package D5;

import a7.f;
import android.util.Log;
import java.util.Collection;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: n, reason: collision with root package name */
    public final N6.b f704n;

    public c(N6.b bVar) {
        this.f704n = bVar;
    }

    @Override // a7.f
    public final U6.c e(Collection logs) {
        h.e(logs, "logs");
        Log.d("OneSignalOtel", "OTEL export request sent to backend. count=" + logs.size());
        U6.c e6 = this.f704n.e(logs);
        e6.f(new b(0, e6, this));
        return e6;
    }

    @Override // a7.f
    public final U6.c shutdown() {
        U6.c shutdown = this.f704n.shutdown();
        h.d(shutdown, "shutdown(...)");
        return shutdown;
    }
}
