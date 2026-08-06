package W1;

import a.AbstractC0083a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1873b;

    public /* synthetic */ f(i iVar, int i2) {
        this.f1872a = i2;
        this.f1873b = iVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f1872a) {
            case 0:
                return (int) Math.min(((g) this.f1873b).f1875b, Integer.MAX_VALUE);
            default:
                q qVar = (q) this.f1873b;
                if (qVar.f1897c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(qVar.f1896b.f1875b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1872a) {
            case 0:
                break;
            default:
                ((q) this.f1873b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1872a) {
            case 0:
                g gVar = (g) this.f1873b;
                if (gVar.f1875b > 0) {
                    return gVar.c() & 255;
                }
                return -1;
            default:
                q qVar = (q) this.f1873b;
                if (qVar.f1897c) {
                    throw new IOException("closed");
                }
                g gVar2 = qVar.f1896b;
                if (gVar2.f1875b == 0 && qVar.f1895a.e(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.c() & 255;
        }
    }

    public final String toString() {
        switch (this.f1872a) {
            case 0:
                return ((g) this.f1873b) + ".inputStream()";
            default:
                return ((q) this.f1873b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i2, int i3) {
        switch (this.f1872a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                return ((g) this.f1873b).read(sink, i2, i3);
            default:
                kotlin.jvm.internal.i.e(sink, "data");
                q qVar = (q) this.f1873b;
                if (!qVar.f1897c) {
                    AbstractC0083a.d(sink.length, i2, i3);
                    g gVar = qVar.f1896b;
                    if (gVar.f1875b == 0 && qVar.f1895a.e(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(sink, i2, i3);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
