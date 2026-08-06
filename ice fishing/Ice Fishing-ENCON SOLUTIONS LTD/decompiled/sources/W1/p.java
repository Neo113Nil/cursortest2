package W1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final u f1892a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1893b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1894c;

    public p(u sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1892a = sink;
        this.f1893b = new g();
    }

    public final h a() {
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f1893b;
        long j2 = gVar.f1875b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            r rVar = gVar.f1874a;
            kotlin.jvm.internal.i.b(rVar);
            r rVar2 = rVar.f1904g;
            kotlin.jvm.internal.i.b(rVar2);
            if (rVar2.f1900c < 8192 && rVar2.f1902e) {
                j2 -= r6 - rVar2.f1899b;
            }
        }
        if (j2 > 0) {
            this.f1892a.h(gVar, j2);
        }
        return this;
    }

    public final h b(int i2) {
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        this.f1893b.u(i2);
        a();
        return this;
    }

    public final h c(int i2) {
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        this.f1893b.w(i2);
        a();
        return this;
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f1892a;
        if (this.f1894c) {
            return;
        }
        try {
            g gVar = this.f1893b;
            long j2 = gVar.f1875b;
            if (j2 > 0) {
                uVar.h(gVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f1894c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // W1.u
    public final y d() {
        return this.f1892a.d();
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f1893b;
        long j2 = gVar.f1875b;
        u uVar = this.f1892a;
        if (j2 > 0) {
            uVar.h(gVar, j2);
        }
        uVar.flush();
    }

    @Override // W1.h
    public final h g(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        this.f1893b.x(string);
        a();
        return this;
    }

    @Override // W1.u
    public final void h(g source, long j2) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        this.f1893b.h(source, j2);
        a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1894c;
    }

    public final String toString() {
        return "buffer(" + this.f1892a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f1894c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f1893b.write(source);
        a();
        return write;
    }
}
