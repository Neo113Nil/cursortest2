package R0;

import K0.AbstractC0043t;
import K0.J;
import P0.AbstractC0068a;
import P0.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends J implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final c f957h = new c();

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC0043t f958i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [P0.j] */
    static {
        l lVar = l.f974h;
        int i2 = x.f907a;
        if (64 >= i2) {
            i2 = 64;
        }
        int l2 = AbstractC0068a.l("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (l2 < 1) {
            throw new IllegalArgumentException(E0.h.e("Expected positive parallelism level, but got ", l2).toString());
        }
        if (l2 < k.f969d) {
            if (l2 < 1) {
                throw new IllegalArgumentException(E0.h.e("Expected positive parallelism level, but got ", l2).toString());
            }
            lVar = new P0.j(lVar, l2);
        }
        f958i = lVar;
    }

    @Override // K0.AbstractC0043t
    public final void c(v0.i iVar, Runnable runnable) {
        f958i.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(v0.j.f3009f, runnable);
    }

    @Override // K0.AbstractC0043t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
