package defpackage;

import okio.ByteString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class qes extends gas {
    public static final ByteString c = cvw.r("0021F904");
    public final yp6 b;

    public qes(qq6 qq6Var) {
        super(qq6Var);
        this.b = new yp6();
    }

    public final boolean a(long j) {
        yp6 yp6Var = this.b;
        long j2 = yp6Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.read(yp6Var, j3) == j3;
    }

    @Override // defpackage.gas, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        long j2;
        long j3;
        a(j);
        yp6 yp6Var2 = this.b;
        long j4 = 0;
        if (yp6Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = -1;
            while (true) {
                ByteString byteString = c;
                j6 = this.b.e1(byteString.m(0), j6 + 1, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                if (j6 == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (a(byteString.h()) && yp6Var2.Q(j6, byteString)) {
                    break;
                }
                j4 = j2;
            }
            if (j6 == -1) {
                break;
            }
            long read = yp6Var2.read(yp6Var, j6 + 4);
            if (read < j2) {
                read = j2;
            }
            j5 += read;
            if (a(5L) && yp6Var2.e(4L) == 0 && (((yp6Var2.e(2L) & 255) << 8) | (yp6Var2.e(1L) & 255)) < 2) {
                yp6Var.e0(yp6Var2.e(j2));
                yp6Var.e0(10);
                yp6Var.e0(0);
                yp6Var2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long read2 = yp6Var2.read(yp6Var, j - j5);
            j3 = 0;
            if (read2 < 0) {
                read2 = 0;
            }
            j5 += read2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
