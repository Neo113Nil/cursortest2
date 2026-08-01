package z8;

import S0.n;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.h;
import y8.s;
import y8.t;
import y8.v;
import y8.z;

/* loaded from: classes2.dex */
public final class c implements v {

    /* renamed from: n, reason: collision with root package name */
    public final OutputStream f42278n;

    /* renamed from: u, reason: collision with root package name */
    public final e f42279u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f42280v;

    public c(n nVar) {
        this.f42280v = nVar;
        this.f42278n = ((Socket) nVar.f2802u).getOutputStream();
        this.f42279u = new e((Socket) nVar.f2802u);
    }

    @Override // y8.v
    public final z L() {
        return this.f42279u;
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        y8.b.d(eVar.f41953u, 0L, j6);
        while (j6 > 0) {
            e eVar2 = this.f42279u;
            eVar2.f();
            s sVar = eVar.f41952n;
            h.b(sVar);
            int min = (int) Math.min(j6, sVar.f41989c - sVar.f41988b);
            eVar2.h();
            try {
                try {
                    this.f42278n.write(sVar.f41987a, sVar.f41988b, min);
                    if (eVar2.i()) {
                        throw eVar2.j(null);
                    }
                    int i = sVar.f41988b + min;
                    sVar.f41988b = i;
                    long j9 = min;
                    j6 -= j9;
                    eVar.f41953u -= j9;
                    if (i == sVar.f41989c) {
                        eVar.f41952n = sVar.a();
                        t.a(sVar);
                    }
                } catch (IOException e9) {
                    if (!eVar2.i()) {
                        throw e9;
                    }
                    throw eVar2.j(e9);
                }
            } catch (Throwable th) {
                eVar2.i();
                throw th;
            }
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.f42278n;
        n nVar = this.f42280v;
        e eVar = this.f42279u;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) nVar.f2803v;
            h.e(atomicInteger, "<this>");
            while (true) {
                int i6 = atomicInteger.get();
                if ((i6 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i9 = i6 | 1;
                if (atomicInteger.compareAndSet(i6, i9)) {
                    i = i9;
                    break;
                }
            }
            if (i != 0) {
                Socket socket = (Socket) nVar.f2802u;
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        e eVar = this.f42279u;
        eVar.h();
        try {
            this.f42278n.flush();
            if (eVar.i()) {
                throw eVar.j(null);
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

    public final String toString() {
        return "sink(" + ((Socket) this.f42280v.f2802u) + ')';
    }
}
