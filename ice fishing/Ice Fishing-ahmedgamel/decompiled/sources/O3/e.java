package O3;

import O2.InterfaceC0352b;
import a4.C0436d;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0352b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2340a = new AtomicReference();

    @Override // O2.InterfaceC0352b
    public final void a(boolean z3) {
        synchronized (g.f2343j) {
            try {
                Iterator it = new ArrayList(g.f2344k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f2349e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).f2339a;
                            if (z3) {
                                gVar2.getClass();
                            } else {
                                ((C0436d) gVar2.f2352h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
