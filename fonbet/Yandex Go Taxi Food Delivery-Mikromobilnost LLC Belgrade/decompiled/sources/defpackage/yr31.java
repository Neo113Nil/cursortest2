package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class yr31 {
    public final bs31 a = new bs31();

    public final void S(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        bs31 bs31Var = this.a;
        if (bs31Var != null) {
            if (bs31Var.d) {
                bs31.a(autoCloseable);
                return;
            }
            synchronized (bs31Var.a) {
                autoCloseable2 = (AutoCloseable) bs31Var.b.put(str, autoCloseable);
            }
            bs31.a(autoCloseable2);
        }
    }

    public final void T() {
        bs31 bs31Var = this.a;
        if (bs31Var != null && !bs31Var.d) {
            bs31Var.d = true;
            synchronized (bs31Var.a) {
                try {
                    Iterator it = bs31Var.b.values().iterator();
                    while (it.hasNext()) {
                        bs31.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bs31Var.c.iterator();
                    while (it2.hasNext()) {
                        bs31.a((AutoCloseable) it2.next());
                    }
                    bs31Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        V();
    }

    public final AutoCloseable U(String str) {
        AutoCloseable autoCloseable;
        bs31 bs31Var = this.a;
        if (bs31Var == null) {
            return null;
        }
        synchronized (bs31Var.a) {
            autoCloseable = (AutoCloseable) bs31Var.b.get(str);
        }
        return autoCloseable;
    }

    public void V() {
    }
}
