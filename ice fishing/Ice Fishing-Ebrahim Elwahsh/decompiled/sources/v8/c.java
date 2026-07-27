package v8;

import S0.i;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.h;
import u8.s;
import u8.t;
import u8.v;
import u8.z;

/* loaded from: classes2.dex */
public final class c implements v {

    /* renamed from: n, reason: collision with root package name */
    public final OutputStream f41378n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41379u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f41380v;

    public c(i iVar) {
        this.f41380v = iVar;
        this.f41378n = ((Socket) iVar.f2901u).getOutputStream();
        this.f41379u = new e((Socket) iVar.f2901u);
    }

    @Override // u8.v
    public final z L() {
        return this.f41379u;
    }

    @Override // u8.v
    public final void N(long j9, u8.e eVar) {
        u8.b.d(eVar.f41277u, 0L, j9);
        while (j9 > 0) {
            e eVar2 = this.f41379u;
            eVar2.f();
            s sVar = eVar.f41276n;
            h.b(sVar);
            int min = (int) Math.min(j9, sVar.f41313c - sVar.f41312b);
            eVar2.h();
            try {
                try {
                    this.f41378n.write(sVar.f41311a, sVar.f41312b, min);
                    if (eVar2.i()) {
                        throw eVar2.j(null);
                    }
                    int i = sVar.f41312b + min;
                    sVar.f41312b = i;
                    long j10 = min;
                    j9 -= j10;
                    eVar.f41277u -= j10;
                    if (i == sVar.f41313c) {
                        eVar.f41276n = sVar.a();
                        t.a(sVar);
                    }
                } catch (IOException e6) {
                    if (!eVar2.i()) {
                        throw e6;
                    }
                    throw eVar2.j(e6);
                }
            } catch (Throwable th) {
                eVar2.i();
                throw th;
            }
        }
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.f41378n;
        i iVar = this.f41380v;
        e eVar = this.f41379u;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) iVar.f2902v;
            h.e(atomicInteger, "<this>");
            while (true) {
                int i4 = atomicInteger.get();
                if ((i4 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i9 = i4 | 1;
                if (atomicInteger.compareAndSet(i4, i9)) {
                    i = i9;
                    break;
                }
            }
            if (i != 0) {
                Socket socket = (Socket) iVar.f2901u;
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
        } catch (IOException e6) {
            if (!eVar.i()) {
                throw e6;
            }
            throw eVar.j(e6);
        } finally {
            eVar.i();
        }
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        e eVar = this.f41379u;
        eVar.h();
        try {
            this.f41378n.flush();
            if (eVar.i()) {
                throw eVar.j(null);
            }
        } catch (IOException e6) {
            if (!eVar.i()) {
                throw e6;
            }
            throw eVar.j(e6);
        } finally {
            eVar.i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f41380v.f2901u) + ')';
    }
}
