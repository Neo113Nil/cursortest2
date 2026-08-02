package Q3;

import Q2.InterfaceC0357b;
import android.util.Log;
import c4.C0553d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0357b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2656a = new AtomicReference();

    @Override // Q2.InterfaceC0357b
    public final void a(boolean z6) {
        synchronized (g.f2659j) {
            try {
                Iterator it = new ArrayList(g.f2660k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f2665e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).f2655a;
                            if (z6) {
                                gVar2.getClass();
                            } else {
                                ((C0553d) gVar2.f2668h.get()).b();
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
