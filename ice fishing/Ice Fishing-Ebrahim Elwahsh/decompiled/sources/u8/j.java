package u8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class j implements x {

    /* renamed from: n, reason: collision with root package name */
    public byte f41283n;

    /* renamed from: u, reason: collision with root package name */
    public final r f41284u;

    /* renamed from: v, reason: collision with root package name */
    public final Inflater f41285v;

    /* renamed from: w, reason: collision with root package name */
    public final k f41286w;

    /* renamed from: x, reason: collision with root package name */
    public final CRC32 f41287x;

    public j(g source) {
        kotlin.jvm.internal.h.e(source, "source");
        r rVar = new r(source);
        this.f41284u = rVar;
        Inflater inflater = new Inflater(true);
        this.f41285v = inflater;
        this.f41286w = new k(rVar, inflater);
        this.f41287x = new CRC32();
    }

    public static void a(int i, int i4, String str) {
        if (i4 == i) {
            return;
        }
        StringBuilder c4 = AbstractC5088e.c(str, ": actual 0x");
        c4.append(M7.j.W(8, b.i(i4)));
        c4.append(" != expected 0x");
        c4.append(M7.j.W(8, b.i(i)));
        throw new IOException(c4.toString());
    }

    @Override // u8.x
    public final z L() {
        return this.f41284u.f41308n.L();
    }

    public final void b(e eVar, long j9, long j10) {
        s sVar = eVar.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        while (true) {
            int i = sVar.f41313c;
            int i4 = sVar.f41312b;
            if (j9 < i - i4) {
                break;
            }
            j9 -= i - i4;
            sVar = sVar.f41316f;
            kotlin.jvm.internal.h.b(sVar);
        }
        while (j10 > 0) {
            int min = (int) Math.min(sVar.f41313c - r6, j10);
            this.f41287x.update(sVar.f41311a, (int) (sVar.f41312b + j9), min);
            j10 -= min;
            sVar = sVar.f41316f;
            kotlin.jvm.internal.h.b(sVar);
            j9 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41286w.close();
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        long j10;
        j jVar = this;
        kotlin.jvm.internal.h.e(sink, "sink");
        byte b9 = jVar.f41283n;
        CRC32 crc32 = jVar.f41287x;
        r rVar = jVar.f41284u;
        if (b9 == 0) {
            rVar.D(10L);
            e eVar = rVar.f41309u;
            byte k6 = eVar.k(3L);
            boolean z8 = ((k6 >> 1) & 1) == 1;
            if (z8) {
                jVar.b(eVar, 0L, 10L);
            }
            a(8075, rVar.B(), "ID1ID2");
            rVar.E(8L);
            if (((k6 >> 2) & 1) == 1) {
                rVar.D(2L);
                if (z8) {
                    b(eVar, 0L, 2L);
                }
                short E8 = eVar.E();
                long j11 = ((short) (((E8 & 255) << 8) | ((E8 & 65280) >>> 8))) & 65535;
                rVar.D(j11);
                if (z8) {
                    b(eVar, 0L, j11);
                }
                rVar.E(j11);
            }
            if (((k6 >> 3) & 1) == 1) {
                long g9 = rVar.g((byte) 0, 0L, Long.MAX_VALUE);
                if (g9 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    j10 = 2;
                    b(eVar, 0L, g9 + 1);
                } else {
                    j10 = 2;
                }
                rVar.E(g9 + 1);
            } else {
                j10 = 2;
            }
            if (((k6 >> 4) & 1) == 1) {
                long j12 = j10;
                long g10 = rVar.g((byte) 0, 0L, Long.MAX_VALUE);
                if (g10 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    j10 = j12;
                    jVar = this;
                    jVar.b(eVar, 0L, g10 + 1);
                } else {
                    jVar = this;
                    j10 = j12;
                }
                rVar.E(g10 + 1);
            } else {
                jVar = this;
            }
            if (z8) {
                rVar.D(j10);
                short E9 = eVar.E();
                a((short) (((E9 & 255) << 8) | ((E9 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            jVar.f41283n = (byte) 1;
        }
        if (jVar.f41283n == 1) {
            long j13 = sink.f41277u;
            long f6 = jVar.f41286w.f(8192L, sink);
            if (f6 != -1) {
                jVar.b(sink, j13, f6);
                return f6;
            }
            jVar.f41283n = (byte) 2;
        }
        if (jVar.f41283n == 2) {
            rVar.D(4L);
            e eVar2 = rVar.f41309u;
            a(b.f(eVar2.D()), (int) crc32.getValue(), "CRC");
            rVar.D(4L);
            a(b.f(eVar2.D()), (int) jVar.f41285v.getBytesWritten(), "ISIZE");
            jVar.f41283n = (byte) 3;
            if (!rVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
