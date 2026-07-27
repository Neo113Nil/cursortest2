package Z7;

import S7.AbstractC0402u;
import S7.Q;
import X7.v;
import java.util.concurrent.Executor;
import z7.C5273j;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class d extends Q implements Executor {

    /* renamed from: v, reason: collision with root package name */
    public static final d f4207v = new d();

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC0402u f4208w;

    static {
        l lVar = l.f4223v;
        int i = v.f3862a;
        if (64 >= i) {
            i = 64;
        }
        f4208w = lVar.A(X7.a.k(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(C5273j.f42269n, runnable);
    }

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        f4208w.p(interfaceC5272i, runnable);
    }

    @Override // S7.AbstractC0402u
    public final void q(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        f4208w.q(interfaceC5272i, runnable);
    }

    @Override // S7.AbstractC0402u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
