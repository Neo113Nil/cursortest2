package defpackage;

import java.io.Closeable;

/* loaded from: classes4.dex */
public interface vqi extends gyf, Closeable {
    void V();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        V();
    }
}
