package S0;

import L0.AbstractC0061t;
import L0.J;
import Q0.AbstractC0068a;
import Q0.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends J implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final c f968g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0061t f969h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q0.j] */
    static {
        l lVar = l.f985g;
        int i2 = x.f916a;
        if (64 >= i2) {
            i2 = 64;
        }
        int l2 = AbstractC0068a.l("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (l2 < 1) {
            throw new IllegalArgumentException(E0.h.e("Expected positive parallelism level, but got ", l2).toString());
        }
        if (l2 < k.f980d) {
            if (l2 < 1) {
                throw new IllegalArgumentException(E0.h.e("Expected positive parallelism level, but got ", l2).toString());
            }
            lVar = new Q0.j(lVar, l2);
        }
        f969h = lVar;
    }

    @Override // L0.AbstractC0061t
    public final void c(v0.i iVar, Runnable runnable) {
        f969h.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(v0.j.f3014e, runnable);
    }

    @Override // L0.AbstractC0061t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
