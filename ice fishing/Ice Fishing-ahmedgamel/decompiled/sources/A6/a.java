package A6;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import t0.C4986A;
import v6.C5119b;

/* loaded from: classes2.dex */
public final class a implements Iterable, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final d f30n;

    /* renamed from: u, reason: collision with root package name */
    public final C4986A f31u;

    /* renamed from: v, reason: collision with root package name */
    public final C5119b f32v;

    /* renamed from: w, reason: collision with root package name */
    public final Logger f33w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f34x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f35y;

    /* renamed from: z, reason: collision with root package name */
    public e f36z;

    public a(d dVar, C4986A c4986a) {
        C5119b c5119b = C5119b.f41430a;
        this.f33w = Logger.getLogger(a.class.getName());
        this.f34x = new AtomicBoolean(false);
        this.f35y = new Object();
        this.f30n = dVar;
        this.f31u = c4986a;
        this.f32v = c5119b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f34x.compareAndSet(false, true)) {
            this.f30n.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e eVar;
        synchronized (this.f35y) {
            try {
                if (this.f36z == null) {
                    this.f36z = new e(this.f30n, this.f32v);
                }
                eVar = this.f36z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
