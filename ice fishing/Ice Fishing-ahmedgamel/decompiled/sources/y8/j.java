package y8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class j implements x {

    /* renamed from: n, reason: collision with root package name */
    public byte f41959n;

    /* renamed from: u, reason: collision with root package name */
    public final r f41960u;

    /* renamed from: v, reason: collision with root package name */
    public final Inflater f41961v;

    /* renamed from: w, reason: collision with root package name */
    public final k f41962w;

    /* renamed from: x, reason: collision with root package name */
    public final CRC32 f41963x;

    public j(g source) {
        kotlin.jvm.internal.h.e(source, "source");
        r rVar = new r(source);
        this.f41960u = rVar;
        Inflater inflater = new Inflater(true);
        this.f41961v = inflater;
        this.f41962w = new k(rVar, inflater);
        this.f41963x = new CRC32();
    }

    public static void a(int i, int i6, String str) {
        if (i6 == i) {
            return;
        }
        StringBuilder c9 = AbstractC5049e.c(str, ": actual 0x");
        c9.append(Q7.j.f0(8, b.i(i6)));
        c9.append(" != expected 0x");
        c9.append(Q7.j.f0(8, b.i(i)));
        throw new IOException(c9.toString());
    }

    @Override // y8.x
    public final z L() {
        return this.f41960u.f41984n.L();
    }

    public final void b(e eVar, long j6, long j9) {
        s sVar = eVar.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        while (true) {
            int i = sVar.f41989c;
            int i6 = sVar.f41988b;
            if (j6 < i - i6) {
                break;
            }
            j6 -= i - i6;
            sVar = sVar.f41992f;
            kotlin.jvm.internal.h.b(sVar);
        }
        while (j9 > 0) {
            int min = (int) Math.min(sVar.f41989c - r6, j9);
            this.f41963x.update(sVar.f41987a, (int) (sVar.f41988b + j6), min);
            j9 -= min;
            sVar = sVar.f41992f;
            kotlin.jvm.internal.h.b(sVar);
            j6 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41962w.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        long j9;
        j jVar = this;
        kotlin.jvm.internal.h.e(sink, "sink");
        byte b9 = jVar.f41959n;
        CRC32 crc32 = jVar.f41963x;
        r rVar = jVar.f41960u;
        if (b9 == 0) {
            rVar.E(10L);
            e eVar = rVar.f41985u;
            byte k9 = eVar.k(3L);
            boolean z3 = ((k9 >> 1) & 1) == 1;
            if (z3) {
                jVar.b(eVar, 0L, 10L);
            }
            a(8075, rVar.C(), "ID1ID2");
            rVar.F(8L);
            if (((k9 >> 2) & 1) == 1) {
                rVar.E(2L);
                if (z3) {
                    b(eVar, 0L, 2L);
                }
                short E8 = eVar.E();
                long j10 = ((short) (((E8 & 255) << 8) | ((E8 & 65280) >>> 8))) & 65535;
                rVar.E(j10);
                if (z3) {
                    b(eVar, 0L, j10);
                }
                rVar.F(j10);
            }
            if (((k9 >> 3) & 1) == 1) {
                long i = rVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (i == -1) {
                    throw new EOFException();
                }
                if (z3) {
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
                long i6 = rVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (i6 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    j9 = j11;
                    jVar = this;
                    jVar.b(eVar, 0L, i6 + 1);
                } else {
                    jVar = this;
                    j9 = j11;
                }
                rVar.F(i6 + 1);
            } else {
                jVar = this;
            }
            if (z3) {
                rVar.E(j9);
                short E9 = eVar.E();
                a((short) (((E9 & 255) << 8) | ((E9 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            jVar.f41959n = (byte) 1;
        }
        if (jVar.f41959n == 1) {
            long j12 = sink.f41953u;
            long d2 = jVar.f41962w.d(8192L, sink);
            if (d2 != -1) {
                jVar.b(sink, j12, d2);
                return d2;
            }
            jVar.f41959n = (byte) 2;
        }
        if (jVar.f41959n == 2) {
            rVar.E(4L);
            e eVar2 = rVar.f41985u;
            a(b.f(eVar2.D()), (int) crc32.getValue(), "CRC");
            rVar.E(4L);
            a(b.f(eVar2.D()), (int) jVar.f41961v.getBytesWritten(), "ISIZE");
            jVar.f41959n = (byte) 3;
            if (!rVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
