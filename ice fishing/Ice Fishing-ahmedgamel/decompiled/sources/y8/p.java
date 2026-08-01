package y8;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class p implements f {

    /* renamed from: n, reason: collision with root package name */
    public final v f41980n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41981u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41982v;

    public p(v sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f41980n = sink;
        this.f41981u = new e();
    }

    @Override // y8.v
    public final z L() {
        return this.f41980n.L();
    }

    @Override // y8.v
    public final void T(long j6, e source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.T(j6, source);
        b();
    }

    public final f b() {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41981u;
        long j6 = eVar.f41953u;
        if (j6 == 0) {
            j6 = 0;
        } else {
            s sVar = eVar.f41952n;
            kotlin.jvm.internal.h.b(sVar);
            s sVar2 = sVar.f41993g;
            kotlin.jvm.internal.h.b(sVar2);
            if (sVar2.f41989c < 8192 && sVar2.f41991e) {
                j6 -= r6 - sVar2.f41988b;
            }
        }
        if (j6 > 0) {
            this.f41980n.T(j6, eVar);
        }
        return this;
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f41980n;
        if (this.f41982v) {
            return;
        }
        try {
            e eVar = this.f41981u;
            long j6 = eVar.f41953u;
            if (j6 > 0) {
                vVar.T(j6, eVar);
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
        this.f41982v = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41981u;
        long j6 = eVar.f41953u;
        v vVar = this.f41980n;
        if (j6 > 0) {
            vVar.T(j6, eVar);
        }
        vVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f41982v;
    }

    public final f n(int i) {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.a0(i);
        b();
        return this;
    }

    @Override // y8.f
    public final f r(long j6) {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.b0(j6);
        b();
        return this;
    }

    @Override // y8.f
    public final f s(int i) {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.a0(b.f(i));
        b();
        return this;
    }

    @Override // y8.f
    public final f t(int i) {
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.X(i);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f41980n + ')';
    }

    @Override // y8.f
    public final f u(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.d0(string);
        b();
        return this;
    }

    @Override // y8.f
    public final f v(h byteString) {
        kotlin.jvm.internal.h.e(byteString, "byteString");
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        this.f41981u.K(byteString);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (this.f41982v) {
            throw new IllegalStateException("closed");
        }
        int write = this.f41981u.write(source);
        b();
        return write;
    }
}
