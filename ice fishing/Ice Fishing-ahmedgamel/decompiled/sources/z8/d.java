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
    public final InputStream f42281n;

    /* renamed from: u, reason: collision with root package name */
    public final e f42282u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f42283v;

    public d(n nVar) {
        this.f42283v = nVar;
        this.f42281n = ((Socket) nVar.f2802u).getInputStream();
        this.f42282u = new e((Socket) nVar.f2802u);
    }

    @Override // y8.x
    public final z L() {
        return this.f42282u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        n nVar = this.f42283v;
        e eVar = this.f42282u;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) nVar.f2803v;
            h.e(atomicInteger, "<this>");
            while (true) {
                int i6 = atomicInteger.get();
                if ((i6 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i9 = i6 | 2;
                if (atomicInteger.compareAndSet(i6, i9)) {
                    i = i9;
                    break;
                }
            }
            if (i != 0) {
                Socket socket = (Socket) nVar.f2802u;
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f42281n.close();
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
        e eVar = this.f42282u;
        eVar.f();
        s J = sink.J(1);
        int min = (int) Math.min(8192L, 8192 - J.f41989c);
        try {
            eVar.h();
            try {
                int read = this.f42281n.read(J.f41987a, J.f41989c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                if (read != -1) {
                    J.f41989c += read;
                    long j9 = read;
                    sink.f41953u += j9;
                    return j9;
                }
                if (J.f41988b != J.f41989c) {
                    return -1L;
                }
                sink.f41952n = J.a();
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
        return "source(" + ((Socket) this.f42283v.f2802u) + ')';
    }
}
