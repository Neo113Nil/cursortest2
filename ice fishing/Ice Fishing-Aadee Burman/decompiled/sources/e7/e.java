package e7;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface e extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    Y6.c f(Collection collection);

    Y6.c shutdown();
}
