package R1;

import L1.AbstractC0015p;
import L1.F;
import Q1.v;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends F implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1034c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0015p f1035d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q1.h] */
    static {
        l lVar = l.f1050c;
        int i = v.f974a;
        if (64 >= i) {
            i = 64;
        }
        int j = Q1.a.j("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (j < 1) {
            throw new IllegalArgumentException(D1.h.e("Expected positive parallelism level, but got ", j).toString());
        }
        if (j < k.f1046d) {
            if (j < 1) {
                throw new IllegalArgumentException(D1.h.e("Expected positive parallelism level, but got ", j).toString());
            }
            lVar = new Q1.h(lVar, j);
        }
        f1035d = lVar;
    }

    @Override // L1.AbstractC0015p
    public final void b(v1.i iVar, Runnable runnable) {
        f1035d.b(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(v1.j.f4497a, runnable);
    }

    @Override // L1.AbstractC0015p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
