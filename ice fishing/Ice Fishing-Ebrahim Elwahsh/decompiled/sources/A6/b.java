package A6;

import java.io.Closeable;
import java.util.Iterator;
import w6.C5174a;

/* loaded from: classes2.dex */
public final class b implements Iterable, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final C5174a f40n;

    public b(C5174a c5174a) {
        this.f40n = c5174a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40n.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f40n.iterator();
    }
}
