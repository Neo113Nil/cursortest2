package g7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.C4772c;

/* loaded from: classes2.dex */
public final class v implements AutoCloseable, m6.t {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f37703x = Logger.getLogger(v.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final t f37705u;

    /* renamed from: v, reason: collision with root package name */
    public final C4772c f37706v;

    /* renamed from: n, reason: collision with root package name */
    public final a7.l f37704n = new a7.l(f37703x);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f37707w = new AtomicBoolean(false);

    public v(t tVar, C4772c c4772c) {
        this.f37705u = tVar;
        this.f37706v = c4772c;
    }

    @Override // java.lang.AutoCloseable, m6.t
    public final void close() {
        if (this.f37707w.compareAndSet(false, true)) {
            t tVar = this.f37705u;
            C4772c c4772c = this.f37706v;
            synchronized (tVar.f37690a) {
                tVar.f37691b.remove(c4772c);
            }
            return;
        }
        this.f37704n.a(Level.WARNING, this.f37706v + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f37706v + "}";
    }
}
