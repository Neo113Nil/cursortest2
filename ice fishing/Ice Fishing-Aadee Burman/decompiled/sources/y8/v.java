package y8;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface v extends Closeable, Flushable {
    z L();

    void T(long j6, e eVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
