package H1;

import A1.AbstractC0018t;
import A1.K;
import F1.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends K implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f683c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0018t f684d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [F1.i] */
    static {
        l lVar = l.f700c;
        int i2 = w.f633a;
        if (64 >= i2) {
            i2 = 64;
        }
        int k2 = F1.a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (k2 < 1) {
            throw new IllegalArgumentException(C1.a.f(k2, "Expected positive parallelism level, but got ").toString());
        }
        if (k2 < k.f695d) {
            if (k2 < 1) {
                throw new IllegalArgumentException(C1.a.f(k2, "Expected positive parallelism level, but got ").toString());
            }
            lVar = new F1.i(lVar, k2);
        }
        f684d = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(l1.j.f8138a, runnable);
    }

    @Override // A1.AbstractC0018t
    public final void j(l1.i iVar, Runnable runnable) {
        f684d.j(iVar, runnable);
    }

    @Override // A1.AbstractC0018t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
