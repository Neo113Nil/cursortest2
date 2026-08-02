package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yads.zt3;

/* loaded from: classes7.dex */
public final class y771 {
    public final ArrayDeque b = new ArrayDeque();
    public zt3 c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a(zt3 zt3Var) {
        zt3Var.a = this;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.add(zt3Var);
        if (this.c == null) {
            zt3 zt3Var2 = (zt3) arrayDeque.poll();
            this.c = zt3Var2;
            if (zt3Var2 != null) {
                zt3Var2.a(this.a);
            }
        }
    }
}
