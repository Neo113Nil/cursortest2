package X6;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import l6.C4694a;

/* loaded from: classes2.dex */
public interface g extends Closeable {
    default U6.c M() {
        return U6.c.f3310e;
    }

    void T(C4694a c4694a, o oVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default U6.c shutdown() {
        return M();
    }
}
