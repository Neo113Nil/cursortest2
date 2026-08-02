package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes9.dex */
public interface uis0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    ydz0 timeout();

    void write(yp6 yp6Var, long j);
}
