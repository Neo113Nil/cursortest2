package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class jrd implements n3r {
    public byte a;
    public final ikn b;
    public final Inflater c;
    public final ake d;
    public final CRC32 e;

    public jrd(n3r n3rVar) {
        n3rVar.getClass();
        ikn iknVar = new ikn(n3rVar);
        this.b = iknVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new ake(iknVar, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder m = tlm.m(str, ": actual 0x");
        m.append(StringsKt.X(8, ox6.P(i2)));
        m.append(" != expected 0x");
        m.append(StringsKt.X(8, ox6.P(i)));
        throw new IOException(m.toString());
    }

    public final void b(hi3 hi3Var, long j, long j2) {
        xap xapVar = hi3Var.a;
        xapVar.getClass();
        while (true) {
            int i = xapVar.c;
            int i2 = xapVar.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            xapVar = xapVar.f;
            xapVar.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(xapVar.c - r6, j2);
            this.e.update(xapVar.a, (int) (xapVar.b + j), min);
            j2 -= min;
            xapVar = xapVar.f;
            xapVar.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        jrd jrdVar = this;
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = jrdVar.a;
        CRC32 crc32 = jrdVar.e;
        ikn iknVar = jrdVar.b;
        if (b == 0) {
            iknVar.a0(10L);
            hi3 hi3Var2 = iknVar.b;
            byte P = hi3Var2.P(3L);
            boolean z = ((P >> 1) & 1) == 1;
            if (z) {
                jrdVar.b(hi3Var2, 0L, 10L);
            }
            a(8075, iknVar.readShort(), "ID1ID2");
            iknVar.skip(8L);
            if (((P >> 2) & 1) == 1) {
                iknVar.a0(2L);
                if (z) {
                    b(hi3Var2, 0L, 2L);
                }
                long l0 = hi3Var2.l0() & 65535;
                iknVar.a0(l0);
                if (z) {
                    b(hi3Var2, 0L, l0);
                }
                iknVar.skip(l0);
            }
            if (((P >> 3) & 1) == 1) {
                long b2 = iknVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b2 == -1) {
                    xq0.v();
                    return 0L;
                }
                if (z) {
                    b(hi3Var2, 0L, b2 + 1);
                }
                iknVar.skip(b2 + 1);
            }
            if (((P >> 4) & 1) == 1) {
                long b3 = iknVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b3 == -1) {
                    xq0.v();
                    return 0L;
                }
                if (z) {
                    jrdVar = this;
                    jrdVar.b(hi3Var2, 0L, b3 + 1);
                } else {
                    jrdVar = this;
                }
                iknVar.skip(b3 + 1);
            } else {
                jrdVar = this;
            }
            if (z) {
                a(iknVar.z(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            jrdVar.a = (byte) 1;
        }
        if (jrdVar.a == 1) {
            long j2 = hi3Var.b;
            long e0 = jrdVar.d.e0(hi3Var, j);
            if (e0 != -1) {
                jrdVar.b(hi3Var, j2, e0);
                return e0;
            }
            jrdVar.a = (byte) 2;
        }
        if (jrdVar.a == 2) {
            a(iknVar.g(), (int) crc32.getValue(), "CRC");
            a(iknVar.g(), (int) jrdVar.c.getBytesWritten(), "ISIZE");
            jrdVar.a = (byte) 3;
            if (!iknVar.a()) {
                kac.f("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.b.a.i();
    }
}
