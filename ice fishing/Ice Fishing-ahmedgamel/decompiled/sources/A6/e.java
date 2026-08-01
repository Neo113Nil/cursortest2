package A6;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import v6.C5119b;

/* loaded from: classes2.dex */
public final class e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final d f53n;

    /* renamed from: u, reason: collision with root package name */
    public final C5119b f54u;

    /* renamed from: w, reason: collision with root package name */
    public c f56w;

    /* renamed from: v, reason: collision with root package name */
    public final Logger f55v = Logger.getLogger(e.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public boolean f57x = false;

    public e(d dVar, C5119b c5119b) {
        this.f53n = dVar;
        this.f54u = c5119b;
    }

    public final synchronized boolean a() {
        d dVar;
        C5119b c5119b;
        try {
            try {
                c cVar = this.f56w;
                if (cVar != null) {
                    if (!this.f57x) {
                        return true;
                    }
                    cVar.b();
                    this.f56w.close();
                    this.f56w = null;
                }
                this.f57x = false;
                dVar = this.f53n;
                c5119b = this.f54u;
            } catch (IOException e9) {
                this.f55v.log(Level.SEVERE, "Error reading from storage", (Throwable) e9);
            }
            if (((AtomicBoolean) dVar.f50x).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            c a9 = dVar.a(c5119b, 1);
            if (a9 != null) {
                this.f56w = a9;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f53n.f49w).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        synchronized (this) {
            if (((AtomicBoolean) this.f53n.f49w).get()) {
                return null;
            }
            if (!a()) {
                return null;
            }
            this.f57x = true;
            c cVar = this.f56w;
            Objects.requireNonNull(cVar);
            return cVar.f41n;
        }
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        c cVar = this.f56w;
        if (cVar != null) {
            try {
                cVar.b();
            } catch (IOException e9) {
                this.f55v.log(Level.SEVERE, "Error deleting stored item", (Throwable) e9);
            }
        }
    }
}
