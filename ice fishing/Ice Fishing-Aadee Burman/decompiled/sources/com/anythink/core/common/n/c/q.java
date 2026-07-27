package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class q implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f15904a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final v f15905b;

    /* renamed from: c, reason: collision with root package name */
    boolean f15906c;

    public q(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f15905b = vVar;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d A() {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f15904a.j();
        if (j6 > 0) {
            this.f15905b.a(this.f15904a, j6);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.a(cVar, j6);
        A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.b(str);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this.f15904a;
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15906c) {
            return;
        }
        try {
            c cVar = this.f15904a;
            long j6 = cVar.f15847c;
            if (j6 > 0) {
                this.f15905b.a(cVar, j6);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f15905b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f15906c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(f fVar) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.d(fVar);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.q.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                q.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                q qVar = q.this;
                if (qVar.f15906c) {
                    return;
                }
                qVar.flush();
            }

            public final String toString() {
                return q.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                q qVar = q.this;
                if (qVar.f15906c) {
                    throw new IOException("closed");
                }
                qVar.f15904a.l((int) ((byte) i));
                q.this.A();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i6) {
                q qVar = q.this;
                if (!qVar.f15906c) {
                    qVar.f15904a.c(bArr, i, i6);
                    q.this.A();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f15904a;
        long j6 = cVar.f15847c;
        if (j6 > 0) {
            this.f15905b.a(cVar, j6);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f15904a;
        long j6 = cVar.f15847c;
        if (j6 > 0) {
            this.f15905b.a(cVar, j6);
        }
        this.f15905b.flush();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d h(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.h(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d i(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.i(i);
        return A();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f15906c;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d j(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.j(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d k(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.k(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d l(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.l(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d m(int i) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.m(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d n(long j6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.n(j6);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d o(long j6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.o(j6);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d p(long j6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.p(j6);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d q(long j6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.q(j6);
        return A();
    }

    public final String toString() {
        return "buffer(" + this.f15905b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f15904a.write(byteBuffer);
        A();
        return write;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d c(byte[] bArr, int i, int i6) {
        if (this.f15906c) {
            throw new IllegalStateException("closed");
        }
        this.f15904a.c(bArr, i, i6);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j6 = 0;
        while (true) {
            long a_ = wVar.a_(this.f15904a, 8192L);
            if (a_ == -1) {
                return j6;
            }
            j6 += a_;
            A();
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i6) {
        if (!this.f15906c) {
            this.f15904a.b(str, i, i6);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(byte[] bArr) {
        if (!this.f15906c) {
            this.f15904a.d(bArr);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j6) {
        while (j6 > 0) {
            long a_ = wVar.a_(this.f15904a, j6);
            if (a_ != -1) {
                j6 -= a_;
                A();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, Charset charset) {
        if (!this.f15906c) {
            this.f15904a.b(str, charset);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f15905b.a();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i6, Charset charset) {
        if (!this.f15906c) {
            this.f15904a.b(str, i, i6, charset);
            return A();
        }
        throw new IllegalStateException("closed");
    }
}
