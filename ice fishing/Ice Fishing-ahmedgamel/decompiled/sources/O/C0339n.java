package O;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: O.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339n {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2112b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2113c = new HashMap();

    public C0339n(Runnable runnable) {
        this.f2111a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f2112b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.F) ((InterfaceC0341p) it.next())).f4824a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0341p interfaceC0341p) {
        this.f2112b.remove(interfaceC0341p);
        C0338m c0338m = (C0338m) this.f2113c.remove(interfaceC0341p);
        if (c0338m != null) {
            c0338m.f2105a.b(c0338m.f2106b);
            c0338m.f2106b = null;
        }
        this.f2111a.run();
    }
}
