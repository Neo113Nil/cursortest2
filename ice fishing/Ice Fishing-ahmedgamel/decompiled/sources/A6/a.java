package A6;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import r2.C4900e;
import v6.C5109b;

/* loaded from: classes2.dex */
public final class a implements Iterable, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final d f187n;

    /* renamed from: u, reason: collision with root package name */
    public final C4900e f188u;

    /* renamed from: v, reason: collision with root package name */
    public final C5109b f189v;

    /* renamed from: w, reason: collision with root package name */
    public final Logger f190w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f191x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f192y;

    /* renamed from: z, reason: collision with root package name */
    public e f193z;

    public a(d dVar, C4900e c4900e) {
        C5109b c5109b = C5109b.f41209a;
        this.f190w = Logger.getLogger(a.class.getName());
        this.f191x = new AtomicBoolean(false);
        this.f192y = new Object();
        this.f187n = dVar;
        this.f188u = c4900e;
        this.f189v = c5109b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f191x.compareAndSet(false, true)) {
            this.f187n.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e eVar;
        synchronized (this.f192y) {
            try {
                if (this.f193z == null) {
                    this.f193z = new e(this.f187n, this.f189v);
                }
                eVar = this.f193z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
