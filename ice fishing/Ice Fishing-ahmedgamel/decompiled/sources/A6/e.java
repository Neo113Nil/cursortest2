package A6;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import v6.C5109b;

/* loaded from: classes2.dex */
public final class e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final d f210n;

    /* renamed from: u, reason: collision with root package name */
    public final C5109b f211u;

    /* renamed from: w, reason: collision with root package name */
    public c f213w;

    /* renamed from: v, reason: collision with root package name */
    public final Logger f212v = Logger.getLogger(e.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public boolean f214x = false;

    public e(d dVar, C5109b c5109b) {
        this.f210n = dVar;
        this.f211u = c5109b;
    }

    public final synchronized boolean a() {
        d dVar;
        C5109b c5109b;
        try {
            try {
                c cVar = this.f213w;
                if (cVar != null) {
                    if (!this.f214x) {
                        return true;
                    }
                    cVar.b();
                    this.f213w.close();
                    this.f213w = null;
                }
                this.f214x = false;
                dVar = this.f210n;
                c5109b = this.f211u;
            } catch (IOException e9) {
                this.f212v.log(Level.SEVERE, "Error reading from storage", (Throwable) e9);
            }
            if (((AtomicBoolean) dVar.f207x).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            c a9 = dVar.a(c5109b, 1);
            if (a9 != null) {
                this.f213w = a9;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f210n.f206w).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        synchronized (this) {
            if (((AtomicBoolean) this.f210n.f206w).get()) {
                return null;
            }
            if (!a()) {
                return null;
            }
            this.f214x = true;
            c cVar = this.f213w;
            Objects.requireNonNull(cVar);
            return cVar.f198n;
        }
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        c cVar = this.f213w;
        if (cVar != null) {
            try {
                cVar.b();
            } catch (IOException e9) {
                this.f212v.log(Level.SEVERE, "Error deleting stored item", (Throwable) e9);
            }
        }
    }
}
