package c7;

import j7.C4612c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class v implements AutoCloseable, i6.t {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f5758x = Logger.getLogger(v.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final t f5760u;

    /* renamed from: v, reason: collision with root package name */
    public final C4612c f5761v;

    /* renamed from: n, reason: collision with root package name */
    public final W6.l f5759n = new W6.l(f5758x);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f5762w = new AtomicBoolean(false);

    public v(t tVar, C4612c c4612c) {
        this.f5760u = tVar;
        this.f5761v = c4612c;
    }

    @Override // java.lang.AutoCloseable, i6.t
    public final void close() {
        if (this.f5762w.compareAndSet(false, true)) {
            t tVar = this.f5760u;
            C4612c c4612c = this.f5761v;
            synchronized (tVar.f5745a) {
                tVar.f5746b.remove(c4612c);
            }
            return;
        }
        this.f5759n.a(Level.WARNING, this.f5761v + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f5761v + "}";
    }
}
