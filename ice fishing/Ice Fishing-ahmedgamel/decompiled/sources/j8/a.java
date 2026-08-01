package j8;

import i8.p;
import i8.x;
import kotlin.jvm.internal.h;
import y8.e;
import y8.g;
import y8.z;

/* loaded from: classes2.dex */
public final class a extends x implements y8.x {

    /* renamed from: u, reason: collision with root package name */
    public final p f38479u;

    /* renamed from: v, reason: collision with root package name */
    public final long f38480v;

    public a(p pVar, long j6) {
        this.f38479u = pVar;
        this.f38480v = j6;
    }

    @Override // y8.x
    public final z L() {
        return z.f41999d;
    }

    @Override // i8.x
    public final long b() {
        return this.f38480v;
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        h.e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // i8.x
    public final p j() {
        return this.f38479u;
    }

    @Override // i8.x
    public final g z() {
        return y8.b.b(this);
    }

    @Override // i8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
