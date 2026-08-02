package z8;

import S0.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.h;
import y8.s;
import y8.t;
import y8.x;
import y8.z;

/* loaded from: classes2.dex */
public final class d implements x {

    /* renamed from: n, reason: collision with root package name */
    public final InputStream f42250n;

    /* renamed from: u, reason: collision with root package name */
    public final e f42251u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f42252v;

    public d(n nVar) {
        this.f42252v = nVar;
        this.f42250n = ((Socket) nVar.f2931u).getInputStream();
        this.f42251u = new e((Socket) nVar.f2931u);
    }

    @Override // y8.x
    public final z L() {
        return this.f42251u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        n nVar = this.f42252v;
        e eVar = this.f42251u;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) nVar.f2932v;
            h.e(atomicInteger, "<this>");
            while (true) {
                int i4 = atomicInteger.get();
                if ((i4 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i6 = i4 | 2;
                if (atomicInteger.compareAndSet(i4, i6)) {
                    i = i6;
                    break;
                }
            }
            if (i != 0) {
                Socket socket = (Socket) nVar.f2931u;
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f42250n.close();
                    }
                }
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e9) {
            if (!eVar.i()) {
                throw e9;
            }
            throw eVar.j(e9);
        } finally {
            eVar.i();
        }
    }

    @Override // y8.x
    public final long d(long j6, y8.e sink) {
        h.e(sink, "sink");
        e eVar = this.f42251u;
        eVar.f();
        s J = sink.J(1);
        int min = (int) Math.min(8192L, 8192 - J.f41960c);
        try {
            eVar.h();
            try {
                int read = this.f42250n.read(J.f41958a, J.f41960c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
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
            } catch (IOException e9) {
                if (eVar.i()) {
                    throw eVar.j(e9);
                }
                throw e9;
            } finally {
                eVar.i();
            }
        } catch (AssertionError e10) {
            if (f.a(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f42252v.f2931u) + ')';
    }
}
