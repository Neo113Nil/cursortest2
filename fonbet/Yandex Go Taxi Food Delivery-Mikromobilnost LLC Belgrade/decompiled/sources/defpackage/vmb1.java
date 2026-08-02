package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import java.io.InterruptedIOException;

/* loaded from: classes11.dex */
public abstract class vmb1 {
    public static f530 a(f530 f530Var, boolean z, awk0 awk0Var, sls slsVar, int i) {
        f530 a;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            awk0Var = null;
        }
        a = b.a(f530Var, m.a(), new w1c(z, awk0Var, slsVar, 0));
        return a;
    }

    public static final c1k0 b(xl20 xl20Var, int i) {
        boolean z = xl20Var instanceof ll20;
        c1k0 c1k0Var = null;
        c1k0 c1k0Var2 = z0k0.a;
        if (z) {
            ll20 ll20Var = (ll20) xl20Var;
            int i2 = ll20Var.a;
            if (i2 == 429 || i2 / 100 == 5) {
                hr20 hr20Var = ll20Var.c;
                if (!jl40.l(hr20Var.get("X-Retry-Action"), "stop")) {
                    String str = hr20Var.get("X-Retry-Interval-Seconds");
                    Long m = str != null ? bvu0.m(10, str) : null;
                    if (m != null && m.longValue() > 0) {
                        c1k0Var = new x0k0(m.longValue() * 1000);
                    }
                }
            }
            c1k0Var = c1k0Var2;
        } else {
            if (xl20Var instanceof ep20) {
                if (((ep20) xl20Var).a instanceof InterruptedIOException) {
                    c1k0 x0k0Var = new x0k0(0L);
                    if (i >= 0 && i < 5) {
                        c1k0Var = x0k0Var;
                    }
                }
            }
            c1k0Var = c1k0Var2;
        }
        if (c1k0Var == null) {
            return (i < 0 || i >= 5) ? c1k0Var2 : new x0k0(((long) Math.pow(2.0d, i)) * 500);
        }
        return c1k0Var;
    }

    public static final apy0 c(apy0 apy0Var, apy0 apy0Var2, float f) {
        return new apy0(cmt0.c(apy0Var.a, f, apy0Var2.a), cmt0.c(apy0Var.b, f, apy0Var2.b));
    }
}
