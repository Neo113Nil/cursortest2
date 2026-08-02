package defpackage;

import com.google.firebase.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wbr implements zg4 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.zg4
    public final void a(boolean z) {
        synchronized (a.k) {
            try {
                Iterator it = new ArrayList(a.l.values()).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.e.get()) {
                        Iterator it2 = aVar.i.iterator();
                        while (it2.hasNext()) {
                            a aVar2 = ((vbr) it2.next()).a;
                            if (!z) {
                                ((ich) aVar2.h.get()).b();
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
