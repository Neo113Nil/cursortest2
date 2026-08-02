package X6;

import b7.n;
import g7.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m6.s;
import q7.C4887g;
import r6.C4910a;

/* loaded from: classes2.dex */
public final class d implements e6.d, Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f3769y = Logger.getLogger(d.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f3770n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public final c f3771u;

    /* renamed from: v, reason: collision with root package name */
    public final b f3772v;

    /* renamed from: w, reason: collision with root package name */
    public final a f3773w;

    /* renamed from: x, reason: collision with root package name */
    public final C4910a f3774x;

    public d(C4887g c4887g, u uVar, n nVar, C4910a c4910a) {
        this.f3771u = new c(c4887g);
        this.f3772v = new b(uVar);
        this.f3773w = new a(nVar);
        this.f3774x = c4910a;
    }

    @Override // e6.d
    public final s b() {
        return this.f3772v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final Y6.c shutdown() {
        if (!this.f3770n.compareAndSet(false, true)) {
            f3769y.info("Multiple shutdown calls");
            return Y6.c.f3919e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f3771u.f3768n.shutdown());
        arrayList.add(this.f3772v.f3767n.shutdown());
        arrayList.add(this.f3773w.f3766n.shutdown());
        return Y6.c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f3771u.f3768n + ", meterProvider=" + this.f3772v.f3767n + ", loggerProvider=" + this.f3773w.f3766n + ", propagators=" + this.f3774x + "}";
    }
}
