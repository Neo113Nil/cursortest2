package a7;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface f extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    U6.c e(Collection collection);

    U6.c shutdown();
}
