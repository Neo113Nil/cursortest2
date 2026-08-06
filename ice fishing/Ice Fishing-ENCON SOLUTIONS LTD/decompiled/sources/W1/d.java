package W1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1861a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1862b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1863c;

    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        this.f1861a = i2;
        this.f1862b = obj;
        this.f1863c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1861a) {
            case 0:
                d dVar = (d) this.f1863c;
                v vVar = (v) this.f1862b;
                vVar.h();
                try {
                    dVar.close();
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!vVar.i()) {
                        throw e2;
                    }
                    throw vVar.k(e2);
                } finally {
                    vVar.i();
                }
            default:
                ((InputStream) this.f1862b).close();
                return;
        }
    }

    @Override // W1.w
    public final y d() {
        switch (this.f1861a) {
            case 0:
                return (v) this.f1862b;
            default:
                return (y) this.f1863c;
        }
    }

    @Override // W1.w
    public final long e(g sink, long j2) {
        switch (this.f1861a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                d dVar = (d) this.f1863c;
                v vVar = (v) this.f1862b;
                vVar.h();
                try {
                    long e2 = dVar.e(sink, 8192L);
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return e2;
                } catch (IOException e3) {
                    if (vVar.i()) {
                        throw vVar.k(e3);
                    }
                    throw e3;
                } finally {
                    vVar.i();
                }
            default:
                kotlin.jvm.internal.i.e(sink, "sink");
                try {
                    ((y) this.f1863c).f();
                    r q2 = sink.q(1);
                    int read = ((InputStream) this.f1862b).read(q2.f1898a, q2.f1900c, (int) Math.min(8192L, 8192 - q2.f1900c));
                    if (read == -1) {
                        if (q2.f1899b == q2.f1900c) {
                            sink.f1874a = q2.a();
                            s.a(q2);
                        }
                        return -1L;
                    }
                    q2.f1900c += read;
                    long j3 = read;
                    sink.f1875b += j3;
                    return j3;
                } catch (AssertionError e4) {
                    if (R1.d.u(e4)) {
                        throw new IOException(e4);
                    }
                    throw e4;
                }
        }
    }

    public final String toString() {
        switch (this.f1861a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f1863c) + ')';
            default:
                return "source(" + ((InputStream) this.f1862b) + ')';
        }
    }
}
