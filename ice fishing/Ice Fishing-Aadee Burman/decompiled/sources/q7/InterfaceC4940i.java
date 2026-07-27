package q7;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: q7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4940i extends Closeable {
    default Y6.c M() {
        return Y6.c.f3975e;
    }

    boolean N();

    boolean U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default Y6.c shutdown() {
        return M();
    }
}
