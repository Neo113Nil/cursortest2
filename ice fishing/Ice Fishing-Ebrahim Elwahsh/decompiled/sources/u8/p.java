package u8;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class p implements f {

    /* renamed from: n, reason: collision with root package name */
    public final v f41304n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41305u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41306v;

    public p(v sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f41304n = sink;
        this.f41305u = new e();
    }

    @Override // u8.v
    public final z L() {
        return this.f41304n.L();
    }

    @Override // u8.v
    public final void N(long j9, e source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.N(j9, source);
        b();
    }

    public final f b() {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41305u;
        long j9 = eVar.f41277u;
        if (j9 == 0) {
            j9 = 0;
        } else {
            s sVar = eVar.f41276n;
            kotlin.jvm.internal.h.b(sVar);
            s sVar2 = sVar.f41317g;
            kotlin.jvm.internal.h.b(sVar2);
            if (sVar2.f41313c < 8192 && sVar2.f41315e) {
                j9 -= r6 - sVar2.f41312b;
            }
        }
        if (j9 > 0) {
            this.f41304n.N(j9, eVar);
        }
        return this;
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f41304n;
        if (this.f41306v) {
            return;
        }
        try {
            e eVar = this.f41305u;
            long j9 = eVar.f41277u;
            if (j9 > 0) {
                vVar.N(j9, eVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            vVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f41306v = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41305u;
        long j9 = eVar.f41277u;
        v vVar = this.f41304n;
        if (j9 > 0) {
            vVar.N(j9, eVar);
        }
        vVar.flush();
    }

    public final f g(int i) {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.a0(i);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f41306v;
    }

    @Override // u8.f
    public final f r(long j9) {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.b0(j9);
        b();
        return this;
    }

    @Override // u8.f
    public final f s(int i) {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.a0(b.f(i));
        b();
        return this;
    }

    @Override // u8.f
    public final f t(int i) {
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.X(i);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f41304n + ')';
    }

    @Override // u8.f
    public final f u(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.d0(string);
        b();
        return this;
    }

    @Override // u8.f
    public final f v(h byteString) {
        kotlin.jvm.internal.h.e(byteString, "byteString");
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        this.f41305u.K(byteString);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (this.f41306v) {
            throw new IllegalStateException("closed");
        }
        int write = this.f41305u.write(source);
        b();
        return write;
    }
}
