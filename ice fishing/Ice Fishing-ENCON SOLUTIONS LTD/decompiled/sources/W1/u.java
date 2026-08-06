package W1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    y d();

    void flush();

    void h(g gVar, long j2);
}
