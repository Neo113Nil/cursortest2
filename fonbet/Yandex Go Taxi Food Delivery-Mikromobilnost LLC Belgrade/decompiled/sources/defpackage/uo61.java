package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.ssl.Alerts;
import yads.bs1;
import yads.cs1;
import yads.t31;

/* loaded from: classes7.dex */
public final class uo61 extends co61 {
    public static final byte[] o = {79, Alerts.alert_unrecognized_name, 117, 115, 72, 101, 97, Alerts.alert_no_renegotiation};
    public static final byte[] p = {79, Alerts.alert_unrecognized_name, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(dl81 dl81Var, byte[] bArr) {
        int i = dl81Var.c;
        int i2 = dl81Var.b;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        dl81Var.d(0, bArr.length, bArr2);
        dl81Var.m(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.co61
    public final long a(dl81 dl81Var) {
        int i;
        byte[] bArr = dl81Var.a;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.i * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // defpackage.co61
    public final void c(boolean z) {
        super.c(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.co61
    public final boolean d(dl81 dl81Var, long j, lg61 lg61Var) {
        if (e(dl81Var, o)) {
            byte[] copyOf = Arrays.copyOf(dl81Var.a, dl81Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = m7a1.a(copyOf);
            if (lg61Var.a == null) {
                da81 da81Var = new da81();
                da81Var.k = "audio/opus";
                da81Var.x = i;
                da81Var.y = 48000;
                da81Var.m = a;
                lg61Var.a = new qd81(da81Var);
                return true;
            }
        } else {
            if (!e(dl81Var, p)) {
                if (lg61Var.a != null) {
                    return false;
                }
                ny61.k();
                return false;
            }
            if (lg61Var.a == null) {
                ny61.k();
                return false;
            }
            if (!this.n) {
                this.n = true;
                dl81Var.m(dl81Var.b + 8);
                cs1 d = w8a1.d(t31.q((String[]) w8a1.c(dl81Var, false, false).b));
                if (d != null) {
                    qd81 qd81Var = lg61Var.a;
                    qd81Var.getClass();
                    da81 da81Var2 = new da81(qd81Var);
                    cs1 cs1Var = lg61Var.a.C;
                    if (cs1Var != null) {
                        bs1[] bs1VarArr = cs1Var.b;
                        if (bs1VarArr.length != 0) {
                            d = new cs1((bs1[]) rf71.r(d.b, bs1VarArr));
                        }
                    }
                    da81Var2.i = d;
                    lg61Var.a = new qd81(da81Var2);
                    return true;
                }
            }
        }
        return true;
    }
}
