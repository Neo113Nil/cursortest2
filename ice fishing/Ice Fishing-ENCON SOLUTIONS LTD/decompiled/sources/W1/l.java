package W1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public byte f1881a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1882b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f1883c;

    /* renamed from: d, reason: collision with root package name */
    public final m f1884d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f1885e;

    public l(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        q qVar = new q(source);
        this.f1882b = qVar;
        Inflater inflater = new Inflater(true);
        this.f1883c = inflater;
        this.f1884d = new m(qVar, inflater);
        this.f1885e = new CRC32();
    }

    public static void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3)));
        }
    }

    public final void b(g gVar, long j2, long j3) {
        r rVar = gVar.f1874a;
        kotlin.jvm.internal.i.b(rVar);
        while (true) {
            int i2 = rVar.f1900c;
            int i3 = rVar.f1899b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            rVar = rVar.f1903f;
            kotlin.jvm.internal.i.b(rVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(rVar.f1900c - r6, j3);
            this.f1885e.update(rVar.f1898a, (int) (rVar.f1899b + j2), min);
            j3 -= min;
            rVar = rVar.f1903f;
            kotlin.jvm.internal.i.b(rVar);
            j2 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1884d.close();
    }

    @Override // W1.w
    public final y d() {
        return this.f1882b.f1895a.d();
    }

    @Override // W1.w
    public final long e(g sink, long j2) {
        q qVar;
        g gVar;
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        byte b2 = this.f1881a;
        CRC32 crc32 = this.f1885e;
        q qVar2 = this.f1882b;
        if (b2 == 0) {
            qVar2.q(10L);
            g gVar2 = qVar2.f1896b;
            byte b3 = gVar2.b(3L);
            boolean z2 = ((b3 >> 1) & 1) == 1;
            if (z2) {
                b(gVar2, 0L, 10L);
            }
            a("ID1ID2", 8075, qVar2.n());
            qVar2.r(8L);
            if (((b3 >> 2) & 1) == 1) {
                qVar2.q(2L);
                if (z2) {
                    b(gVar2, 0L, 2L);
                }
                short m2 = gVar2.m();
                long j4 = ((short) (((m2 & 255) << 8) | ((m2 & 65280) >>> 8))) & 65535;
                qVar2.q(j4);
                if (z2) {
                    b(gVar2, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                qVar2.r(j3);
            }
            if (((b3 >> 3) & 1) == 1) {
                gVar = gVar2;
                long b4 = qVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    qVar = qVar2;
                    b(gVar, 0L, b4 + 1);
                } else {
                    qVar = qVar2;
                }
                qVar.r(b4 + 1);
            } else {
                qVar = qVar2;
                gVar = gVar2;
            }
            if (((b3 >> 4) & 1) == 1) {
                long b5 = qVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b5 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    b(gVar, 0L, b5 + 1);
                }
                qVar.r(b5 + 1);
            }
            if (z2) {
                qVar.q(2L);
                short m3 = gVar.m();
                a("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f1881a = (byte) 1;
        } else {
            qVar = qVar2;
        }
        if (this.f1881a == 1) {
            long j5 = sink.f1875b;
            long e2 = this.f1884d.e(sink, 8192L);
            if (e2 != -1) {
                b(sink, j5, e2);
                return e2;
            }
            this.f1881a = (byte) 2;
        }
        if (this.f1881a != 2) {
            return -1L;
        }
        a("CRC", qVar.m(), (int) crc32.getValue());
        a("ISIZE", qVar.m(), (int) this.f1883c.getBytesWritten());
        this.f1881a = (byte) 3;
        if (qVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
