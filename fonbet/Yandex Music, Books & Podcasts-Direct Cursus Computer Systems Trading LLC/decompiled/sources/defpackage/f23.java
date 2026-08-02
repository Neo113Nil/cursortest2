package defpackage;

import java.util.Iterator;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class f23 implements ja8 {
    public final g23 a;
    public boolean b;

    public f23(g23 g23Var) {
        this.a = g23Var;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        synchronized (this.a.d) {
            if (this.b) {
                return;
            }
            this.b = true;
            g23 g23Var = this.a;
            int i = g23Var.b;
            if (i == 0) {
                throw new IllegalStateException("Critical section is not held");
            }
            int i2 = i - 1;
            g23Var.b = i2;
            if (i2 == 0) {
                g23Var.a = null;
                Iterator it = CollectionsKt.w0(g23Var.c).iterator();
                while (it.hasNext()) {
                    LockSupport.unpark((Thread) it.next());
                }
            }
        }
    }
}
