package y8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class j implements x {

    /* renamed from: n, reason: collision with root package name */
    public byte f41930n;

    /* renamed from: u, reason: collision with root package name */
    public final r f41931u;

    /* renamed from: v, reason: collision with root package name */
    public final Inflater f41932v;

    /* renamed from: w, reason: collision with root package name */
    public final k f41933w;

    /* renamed from: x, reason: collision with root package name */
    public final CRC32 f41934x;

    public j(g source) {
        kotlin.jvm.internal.h.e(source, "source");
        r rVar = new r(source);
        this.f41931u = rVar;
        Inflater inflater = new Inflater(true);
        this.f41932v = inflater;
        this.f41933w = new k(rVar, inflater);
        this.f41934x = new CRC32();
    }

    public static void a(int i, int i4, String str) {
        if (i4 == i) {
            return;
        }
        StringBuilder c9 = AbstractC5050e.c(str, ": actual 0x");
        c9.append(Q7.j.v0(8, b.i(i4)));
        c9.append(" != expected 0x");
        c9.append(Q7.j.v0(8, b.i(i)));
        throw new IOException(c9.toString());
    }

    @Override // y8.x
    public final z L() {
        return this.f41931u.f41955n.L();
    }

    public final void b(e eVar, long j6, long j9) {
        s sVar = eVar.f41923n;
        kotlin.jvm.internal.h.b(sVar);
        while (true) {
            int i = sVar.f41960c;
            int i4 = sVar.f41959b;
            if (j6 < i - i4) {
                break;
            }
            j6 -= i - i4;
            sVar = sVar.f41963f;
            kotlin.jvm.internal.h.b(sVar);
        }
        while (j9 > 0) {
            int min = (int) Math.min(sVar.f41960c - r6, j9);
            this.f41934x.update(sVar.f41958a, (int) (sVar.f41959b + j6), min);
            j9 -= min;
            sVar = sVar.f41963f;
            kotlin.jvm.internal.h.b(sVar);
            j6 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41933w.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        long j9;
        j jVar = this;
        kotlin.jvm.internal.h.e(sink, "sink");
        byte b9 = jVar.f41930n;
        CRC32 crc32 = jVar.f41934x;
        r rVar = jVar.f41931u;
        if (b9 == 0) {
            rVar.E(10L);
            e eVar = rVar.f41956u;
            byte k9 = eVar.k(3L);
            boolean z6 = ((k9 >> 1) & 1) == 1;
            if (z6) {
                jVar.b(eVar, 0L, 10L);
            }
            a(8075, rVar.C(), "ID1ID2");
            rVar.F(8L);
            if (((k9 >> 2) & 1) == 1) {
                rVar.E(2L);
                if (z6) {
                    b(eVar, 0L, 2L);
                }
                short E8 = eVar.E();
                long j10 = ((short) (((E8 & 255) << 8) | ((E8 & 65280) >>> 8))) & 65535;
                rVar.E(j10);
                if (z6) {
                    b(eVar, 0L, j10);
                }
                rVar.F(j10);
            }
            if (((k9 >> 3) & 1) == 1) {
                long i = rVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (i == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    j9 = 2;
                    b(eVar, 0L, i + 1);
                } else {
                    j9 = 2;
                }
                rVar.F(i + 1);
            } else {
                j9 = 2;
            }
            if (((k9 >> 4) & 1) == 1) {
                long j11 = j9;
                long i4 = rVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (i4 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    j9 = j11;
                    jVar = this;
                    jVar.b(eVar, 0L, i4 + 1);
                } else {
                    jVar = this;
                    j9 = j11;
                }
                rVar.F(i4 + 1);
            } else {
                jVar = this;
            }
            if (z6) {
                rVar.E(j9);
                short E9 = eVar.E();
                a((short) (((E9 & 255) << 8) | ((E9 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            jVar.f41930n = (byte) 1;
        }
        if (jVar.f41930n == 1) {
            long j12 = sink.f41924u;
            long d9 = jVar.f41933w.d(8192L, sink);
            if (d9 != -1) {
                jVar.b(sink, j12, d9);
                return d9;
            }
            jVar.f41930n = (byte) 2;
        }
        if (jVar.f41930n == 2) {
            rVar.E(4L);
            e eVar2 = rVar.f41956u;
            a(b.f(eVar2.D()), (int) crc32.getValue(), "CRC");
            rVar.E(4L);
            a(b.f(eVar2.D()), (int) jVar.f41932v.getBytesWritten(), "ISIZE");
            jVar.f41930n = (byte) 3;
            if (!rVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
