package u8;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class l implements x {

    /* renamed from: n, reason: collision with root package name */
    public final InputStream f41292n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41293u;

    public l(InputStream input, z zVar) {
        kotlin.jvm.internal.h.e(input, "input");
        this.f41292n = input;
        this.f41293u = zVar;
    }

    @Override // u8.x
    public final z L() {
        return this.f41293u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41292n.close();
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        try {
            this.f41293u.f();
            s J = sink.J(1);
            int read = this.f41292n.read(J.f41311a, J.f41313c, (int) Math.min(8192L, 8192 - J.f41313c));
            if (read != -1) {
                J.f41313c += read;
                long j10 = read;
                sink.f41277u += j10;
                return j10;
            }
            if (J.f41312b != J.f41313c) {
                return -1L;
            }
            sink.f41276n = J.a();
            t.a(J);
            return -1L;
        } catch (AssertionError e6) {
            if (v8.f.a(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    public final String toString() {
        return "source(" + this.f41292n + ')';
    }
}
