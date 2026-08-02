package E6;

import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b implements Iterable, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final A6.a f900n;

    public b(A6.a aVar) {
        this.f900n = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f900n.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f900n.iterator();
    }
}
