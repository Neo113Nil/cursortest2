package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class e5p {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final pwe c;

    public e5p(pwe pweVar) {
        new CopyOnWriteArrayList();
        this.c = pweVar;
    }

    public final void a(vjp vjpVar) {
        boolean z;
        pwe pweVar;
        if (vjpVar == null) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.contains(vjpVar)) {
                    z = false;
                } else {
                    this.b.add(vjpVar);
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (pweVar = this.c) == null) {
            return;
        }
        pweVar.onFound(vjpVar);
    }

    public final vjp b(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            vjp vjpVar = (vjp) it.next();
            if (vjpVar.a.equals(str)) {
                return vjpVar;
            }
        }
        return null;
    }

    public abstract void c();

    public abstract boolean d();

    public final boolean equals(Object obj) {
        return getClass().getName().equals(obj.getClass().getName());
    }
}
