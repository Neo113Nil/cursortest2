package i7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements o6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3226a = new AtomicReference();

    @Override // o6.b
    public final void a(boolean z10) {
        synchronized (g.f3229j) {
            try {
                ArrayList arrayList = new ArrayList(g.f3230k.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    g gVar = (g) obj;
                    if (gVar.f3235e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f3239i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f3225a;
                            if (!z10) {
                                ((u7.c) gVar2.f3238h.get()).b();
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
