package y8;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class l implements x {

    /* renamed from: n, reason: collision with root package name */
    public final InputStream f41939n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41940u;

    public l(InputStream input, z zVar) {
        kotlin.jvm.internal.h.e(input, "input");
        this.f41939n = input;
        this.f41940u = zVar;
    }

    @Override // y8.x
    public final z L() {
        return this.f41940u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41939n.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        try {
            this.f41940u.f();
            s J = sink.J(1);
            int read = this.f41939n.read(J.f41958a, J.f41960c, (int) Math.min(8192L, 8192 - J.f41960c));
            if (read != -1) {
                J.f41960c += read;
                long j9 = read;
                sink.f41924u += j9;
                return j9;
            }
            if (J.f41959b != J.f41960c) {
                return -1L;
            }
            sink.f41923n = J.a();
            t.a(J);
            return -1L;
        } catch (AssertionError e9) {
            if (z8.f.a(e9)) {
                throw new IOException(e9);
            }
            throw e9;
        }
    }

    public final String toString() {
        return "source(" + this.f41939n + ')';
    }
}
