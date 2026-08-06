package W1;

import a.AbstractC0083a;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1858a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final v f1859b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1860c;

    public c(OutputStream outputStream, v vVar) {
        this.f1860c = outputStream;
        this.f1859b = vVar;
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1858a) {
            case 0:
                c cVar = (c) this.f1860c;
                v vVar = this.f1859b;
                vVar.h();
                try {
                    cVar.close();
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
                ((OutputStream) this.f1860c).close();
                return;
        }
    }

    @Override // W1.u
    public final y d() {
        switch (this.f1858a) {
        }
        return this.f1859b;
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
        switch (this.f1858a) {
            case 0:
                c cVar = (c) this.f1860c;
                v vVar = this.f1859b;
                vVar.h();
                try {
                    cVar.flush();
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
                ((OutputStream) this.f1860c).flush();
                return;
        }
    }

    @Override // W1.u
    public final void h(g gVar, long j2) {
        switch (this.f1858a) {
            case 0:
                AbstractC0083a.d(gVar.f1875b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    r rVar = gVar.f1874a;
                    kotlin.jvm.internal.i.b(rVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += rVar.f1900c - rVar.f1899b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                rVar = rVar.f1903f;
                                kotlin.jvm.internal.i.b(rVar);
                            }
                        }
                    }
                    c cVar = (c) this.f1860c;
                    v vVar = this.f1859b;
                    vVar.h();
                    try {
                        cVar.h(gVar, j3);
                        if (vVar.i()) {
                            throw vVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!vVar.i()) {
                            throw e2;
                        }
                        throw vVar.k(e2);
                    } finally {
                        vVar.i();
                    }
                }
            default:
                AbstractC0083a.d(gVar.f1875b, 0L, j2);
                while (j2 > 0) {
                    this.f1859b.f();
                    r rVar2 = gVar.f1874a;
                    kotlin.jvm.internal.i.b(rVar2);
                    int min = (int) Math.min(j2, rVar2.f1900c - rVar2.f1899b);
                    ((OutputStream) this.f1860c).write(rVar2.f1898a, rVar2.f1899b, min);
                    int i2 = rVar2.f1899b + min;
                    rVar2.f1899b = i2;
                    long j4 = min;
                    j2 -= j4;
                    gVar.f1875b -= j4;
                    if (i2 == rVar2.f1900c) {
                        gVar.f1874a = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f1858a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f1860c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1860c) + ')';
        }
    }

    public c(v vVar, c cVar) {
        this.f1859b = vVar;
        this.f1860c = cVar;
    }
}
