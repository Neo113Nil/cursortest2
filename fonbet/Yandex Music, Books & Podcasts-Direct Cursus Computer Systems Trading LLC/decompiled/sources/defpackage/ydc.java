package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ydc implements qj2 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.qj2
    public final void a(boolean z) {
        synchronized (aec.k) {
            try {
                Iterator it = new ArrayList(aec.l.values()).iterator();
                while (it.hasNext()) {
                    aec aecVar = (aec) it.next();
                    if (aecVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = aecVar.i.iterator();
                        while (it2.hasNext()) {
                            aec aecVar2 = ((xdc) it2.next()).a;
                            if (!z) {
                                ((um7) aecVar2.h.get()).b();
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
