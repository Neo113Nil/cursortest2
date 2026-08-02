package g7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.C4788c;

/* loaded from: classes2.dex */
public final class v implements AutoCloseable, m6.t {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f37728x = Logger.getLogger(v.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final t f37730u;

    /* renamed from: v, reason: collision with root package name */
    public final C4788c f37731v;

    /* renamed from: n, reason: collision with root package name */
    public final a7.l f37729n = new a7.l(f37728x);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f37732w = new AtomicBoolean(false);

    public v(t tVar, C4788c c4788c) {
        this.f37730u = tVar;
        this.f37731v = c4788c;
    }

    @Override // java.lang.AutoCloseable, m6.t
    public final void close() {
        if (this.f37732w.compareAndSet(false, true)) {
            t tVar = this.f37730u;
            C4788c c4788c = this.f37731v;
            synchronized (tVar.f37715a) {
                tVar.f37716b.remove(c4788c);
            }
            return;
        }
        this.f37729n.a(Level.WARNING, this.f37731v + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f37731v + "}";
    }
}
