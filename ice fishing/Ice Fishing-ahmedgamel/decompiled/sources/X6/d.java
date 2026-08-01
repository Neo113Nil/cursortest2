package X6;

import b7.o;
import g7.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m6.s;
import q7.C4938g;
import r6.C4960a;

/* loaded from: classes2.dex */
public final class d implements e6.d, Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f3814y = Logger.getLogger(d.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f3815n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public final c f3816u;

    /* renamed from: v, reason: collision with root package name */
    public final b f3817v;

    /* renamed from: w, reason: collision with root package name */
    public final a f3818w;

    /* renamed from: x, reason: collision with root package name */
    public final C4960a f3819x;

    public d(C4938g c4938g, u uVar, o oVar, C4960a c4960a) {
        this.f3816u = new c(c4938g);
        this.f3817v = new b(uVar);
        this.f3818w = new a(oVar);
        this.f3819x = c4960a;
    }

    @Override // e6.d
    public final s b() {
        return this.f3817v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final Y6.c shutdown() {
        if (!this.f3815n.compareAndSet(false, true)) {
            f3814y.info("Multiple shutdown calls");
            return Y6.c.f3975e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f3816u.f3813n.shutdown());
        arrayList.add(this.f3817v.f3812n.shutdown());
        arrayList.add(this.f3818w.f3811n.shutdown());
        return Y6.c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f3816u.f3813n + ", meterProvider=" + this.f3817v.f3812n + ", loggerProvider=" + this.f3818w.f3811n + ", propagators=" + this.f3819x + "}";
    }
}
