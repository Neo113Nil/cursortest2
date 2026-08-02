package O;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: O.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344n {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2199a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2200b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2201c = new HashMap();

    public C0344n(Runnable runnable) {
        this.f2199a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f2200b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.F) ((InterfaceC0346p) it.next())).f4792a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0346p interfaceC0346p) {
        this.f2200b.remove(interfaceC0346p);
        C0343m c0343m = (C0343m) this.f2201c.remove(interfaceC0346p);
        if (c0343m != null) {
            c0343m.f2193a.b(c0343m.f2194b);
            c0343m.f2194b = null;
        }
        this.f2199a.run();
    }
}
