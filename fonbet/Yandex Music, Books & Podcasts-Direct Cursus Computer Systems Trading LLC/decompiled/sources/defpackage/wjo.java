package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class wjo extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    public final String a;
    public final int b;
    public final boolean c;

    public wjo(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread jt1Var = this.c ? new jt1(runnable, str) : new Thread(runnable, str);
        jt1Var.setPriority(this.b);
        jt1Var.setDaemon(true);
        return jt1Var;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return su4.o(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public wjo(String str) {
        this(str, 5, false);
    }
}
