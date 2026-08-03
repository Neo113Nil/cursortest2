package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final z3.d f715a = new z3.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        z3.d dVar = this.f715a;
        if (dVar != null) {
            if (dVar.f9104d) {
                z3.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f9101a) {
                autoCloseable2 = (AutoCloseable) dVar.f9102b.put(str, autoCloseable);
            }
            z3.d.a(autoCloseable2);
        }
    }

    public final void b() {
        z3.d dVar = this.f715a;
        if (dVar != null && !dVar.f9104d) {
            dVar.f9104d = true;
            synchronized (dVar.f9101a) {
                try {
                    Iterator it = dVar.f9102b.values().iterator();
                    while (it.hasNext()) {
                        z3.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f9103c.iterator();
                    while (it2.hasNext()) {
                        z3.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f9103c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        z3.d dVar = this.f715a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f9101a) {
            autoCloseable = (AutoCloseable) dVar.f9102b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
