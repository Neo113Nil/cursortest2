package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class r4u implements y9t0 {
    public byte a;
    public final jci0 b;
    public final Inflater c;
    public final usv w;
    public final CRC32 x;

    public r4u(qq6 qq6Var) {
        jci0 jci0Var = new jci0(qq6Var);
        this.b = jci0Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.w = new usv(jci0Var, inflater);
        this.x = new CRC32();
    }

    public static void a(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder v = oyr.v(str, ": actual 0x");
        v.append(evu0.N(MoneyInputEditView.DEFAULT_VALUE, 8, j.f(i2)));
        v.append(" != expected 0x");
        v.append(evu0.N(MoneyInputEditView.DEFAULT_VALUE, 8, j.f(i)));
        throw new IOException(v.toString());
    }

    public final void c(yp6 yp6Var, long j, long j2) {
        t7q0 t7q0Var = yp6Var.a;
        while (true) {
            int i = t7q0Var.c;
            int i2 = t7q0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            t7q0Var = t7q0Var.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(t7q0Var.c - r6, j2);
            this.x.update(t7q0Var.a, (int) (t7q0Var.b + j), min);
            j2 -= min;
            t7q0Var = t7q0Var.f;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        r4u r4uVar = this;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = r4uVar.a;
        CRC32 crc32 = r4uVar.x;
        jci0 jci0Var = r4uVar.b;
        if (b == 0) {
            jci0Var.B1(10L);
            yp6 yp6Var2 = jci0Var.b;
            byte e = yp6Var2.e(3L);
            boolean z = ((e >> 1) & 1) == 1;
            if (z) {
                r4uVar.c(jci0Var.b, 0L, 10L);
            }
            a(8075, jci0Var.readShort(), "ID1ID2");
            jci0Var.skip(8L);
            if (((e >> 2) & 1) == 1) {
                jci0Var.B1(2L);
                if (z) {
                    c(jci0Var.b, 0L, 2L);
                }
                long R = yp6Var2.R() & 65535;
                jci0Var.B1(R);
                if (z) {
                    c(jci0Var.b, 0L, R);
                }
                jci0Var.skip(R);
            }
            if (((e >> 3) & 1) == 1) {
                long e1 = jci0Var.e1((byte) 0, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                if (e1 == -1) {
                    ny61.b();
                    return 0L;
                }
                if (z) {
                    c(jci0Var.b, 0L, e1 + 1);
                }
                jci0Var.skip(e1 + 1);
            }
            if (((e >> 4) & 1) == 1) {
                long e12 = jci0Var.e1((byte) 0, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                if (e12 == -1) {
                    ny61.b();
                    return 0L;
                }
                if (z) {
                    r4uVar = this;
                    r4uVar.c(jci0Var.b, 0L, e12 + 1);
                } else {
                    r4uVar = this;
                }
                jci0Var.skip(e12 + 1);
            } else {
                r4uVar = this;
            }
            if (z) {
                a(jci0Var.a(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            r4uVar.a = (byte) 1;
        }
        if (r4uVar.a == 1) {
            long j2 = yp6Var.b;
            long read = r4uVar.w.read(yp6Var, j);
            if (read != -1) {
                r4uVar.c(yp6Var, j2, read);
                return read;
            }
            r4uVar.a = (byte) 2;
        }
        if (r4uVar.a == 2) {
            a(jci0Var.d2(), (int) crc32.getValue(), "CRC");
            a(jci0Var.d2(), (int) r4uVar.c.getBytesWritten(), "ISIZE");
            r4uVar.a = (byte) 3;
            if (!jci0Var.I1()) {
                ny61.v("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.b.a.timeout();
    }
}
