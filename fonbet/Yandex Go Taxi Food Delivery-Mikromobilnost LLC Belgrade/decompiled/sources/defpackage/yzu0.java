package defpackage;

import java.io.Closeable;

/* loaded from: classes9.dex */
public interface yzu0 extends Closeable, AutoCloseable {
    static {
        int i = xzu0.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        x();
    }

    void x();
}
