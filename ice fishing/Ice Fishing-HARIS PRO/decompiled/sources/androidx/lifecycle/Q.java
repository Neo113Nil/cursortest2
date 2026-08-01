package androidx.lifecycle;

import d0.C0126a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public final C0126a f2022a = new C0126a();

    public final void a() {
        C0126a c0126a = this.f2022a;
        if (c0126a != null && !c0126a.f2834d) {
            c0126a.f2834d = true;
            synchronized (c0126a.f2831a) {
                try {
                    Iterator it = c0126a.f2832b.values().iterator();
                    while (it.hasNext()) {
                        C0126a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0126a.f2833c.iterator();
                    while (it2.hasNext()) {
                        C0126a.a((AutoCloseable) it2.next());
                    }
                    c0126a.f2833c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
