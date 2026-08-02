package y8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class q extends InputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f41954n;

    public q(r rVar) {
        this.f41954n = rVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        r rVar = this.f41954n;
        if (rVar.f41957v) {
            throw new IOException("closed");
        }
        return (int) Math.min(rVar.f41956u.f41924u, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41954n.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        r rVar = this.f41954n;
        if (rVar.f41957v) {
            throw new IOException("closed");
        }
        e eVar = rVar.f41956u;
        if (eVar.f41924u == 0 && rVar.f41955n.d(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.z() & 255;
    }

    public final String toString() {
        return this.f41954n + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) {
        kotlin.jvm.internal.h.e(out, "out");
        r rVar = this.f41954n;
        if (rVar.f41957v) {
            throw new IOException("closed");
        }
        long j6 = 0;
        long j9 = 0;
        while (true) {
            e eVar = rVar.f41956u;
            if (eVar.f41924u == j6 && rVar.f41955n.d(8192L, eVar) == -1) {
                return j9;
            }
            long j10 = eVar.f41924u;
            j9 += j10;
            b.d(j10, 0L, j10);
            s sVar = eVar.f41923n;
            while (j10 > j6) {
                kotlin.jvm.internal.h.b(sVar);
                int min = (int) Math.min(j10, sVar.f41960c - sVar.f41959b);
                out.write(sVar.f41958a, sVar.f41959b, min);
                int i = sVar.f41959b + min;
                sVar.f41959b = i;
                long j11 = min;
                eVar.f41924u -= j11;
                j10 -= j11;
                if (i == sVar.f41960c) {
                    s a9 = sVar.a();
                    eVar.f41923n = a9;
                    t.a(sVar);
                    sVar = a9;
                }
                j6 = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i, int i4) {
        kotlin.jvm.internal.h.e(data, "data");
        r rVar = this.f41954n;
        if (!rVar.f41957v) {
            b.d(data.length, i, i4);
            e eVar = rVar.f41956u;
            if (eVar.f41924u == 0 && rVar.f41955n.d(8192L, eVar) == -1) {
                return -1;
            }
            return eVar.l(data, i, i4);
        }
        throw new IOException("closed");
    }
}
