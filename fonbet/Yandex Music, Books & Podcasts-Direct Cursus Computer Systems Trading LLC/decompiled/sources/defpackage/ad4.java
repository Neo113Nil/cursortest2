package defpackage;

import com.connectsdk.service.DeviceService;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class ad4 extends zc4 {
    public final jd4 n;
    public final hs4 o;

    public ad4(jd4 jd4Var, hs4 hs4Var) {
        this.n = jd4Var;
        o2g.O(hs4Var, "time");
        this.o = hs4Var;
    }

    public static Level n0(int i) {
        int D = ouj.D(i);
        return D != 1 ? (D == 2 || D == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // defpackage.zc4
    public final void I(int i, String str) {
        jd4 jd4Var = this.n;
        sue sueVar = jd4Var.b;
        Level n0 = n0(i);
        if (jd4.c.isLoggable(n0)) {
            jd4.a(sueVar, n0, str);
        }
        if (!m0(i) || i == 1) {
            return;
        }
        int D = ouj.D(i);
        ite iteVar = D != 2 ? D != 3 ? ite.a : ite.c : ite.b;
        long x = this.o.x();
        o2g.O(str, DeviceService.KEY_DESC);
        new jte(str, iteVar, x, null);
        synchronized (jd4Var.a) {
        }
    }

    @Override // defpackage.zc4
    public final void J(int i, String str, Object... objArr) {
        I(i, (m0(i) || jd4.c.isLoggable(n0(i))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean m0(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.n.a) {
        }
        return false;
    }
}
