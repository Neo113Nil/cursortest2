package b7;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import p6.C4840a;

/* renamed from: b7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0527g extends Closeable {
    default Y6.c M() {
        return Y6.c.f3975e;
    }

    void Q(C4840a c4840a, p pVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default Y6.c shutdown() {
        return M();
    }
}
