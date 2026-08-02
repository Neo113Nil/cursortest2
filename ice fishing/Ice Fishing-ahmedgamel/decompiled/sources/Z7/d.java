package Z7;

import S7.AbstractC0406u;
import S7.Q;
import X7.v;
import java.util.concurrent.Executor;
import z7.C5246j;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class d extends Q implements Executor {

    /* renamed from: v, reason: collision with root package name */
    public static final d f4185v = new d();

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC0406u f4186w;

    static {
        l lVar = l.f4201v;
        int i = v.f3817a;
        if (64 >= i) {
            i = 64;
        }
        f4186w = lVar.A(X7.a.k(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(C5246j.f42241n, runnable);
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        f4186w.p(interfaceC5245i, runnable);
    }

    @Override // S7.AbstractC0406u
    public final void q(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        f4186w.q(interfaceC5245i, runnable);
    }

    @Override // S7.AbstractC0406u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
