package defpackage;

import android.net.Uri;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public abstract class v1b1 {
    public static final void a(lru lruVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1466280185);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(lruVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            xab1.a(an91.j(c530.a, lruVar.d), null, wwg.S(-2063035825, true, new nfj(13, lruVar, aVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(lruVar, aVar, i, 29);
        }
    }

    public static final void b(t1y t1yVar, float f, a aVar, fid fidVar, int i) {
        f530 q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1057443592);
        int i2 = (btsVar.k(t1yVar) ? 32 : 16) | i | (btsVar.b(f) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            if (t1yVar instanceof r1y) {
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                q = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            } else {
                boolean z = t1yVar instanceof q1y;
                c530 c530Var = c530.a;
                if (z) {
                    q = ljs0.q(c530Var, ((q1y) t1yVar).a);
                } else {
                    if (!(t1yVar instanceof s1y)) {
                        w511.b();
                        return;
                    }
                    q = ljs0.q(c530Var, ((float) ((s1y) t1yVar).a) * f);
                }
            }
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, q);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            aVar.invoke(cj6.a, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wq1(t1yVar, f, aVar, i, 2);
        }
    }

    public static final lum c(tls tlsVar) {
        return new lum(new zbd(21), qs3.a, new a0(9, tlsVar), rs3.a);
    }

    public static final lum d() {
        return new lum(new zbd(22), ss3.a, new f22(28), ts3.a);
    }

    public static final z970 e(q qVar, odn0 odn0Var) {
        qVar.getClass();
        frl0 frl0Var = frl0.t;
        Uri uri = odn0Var.a;
        wwo0 p = frl0Var.p(uri);
        if (p != null) {
            return new x970(p.b, p.d, p.c);
        }
        ado0 j = frl0.n.j(uri);
        if (j != null) {
            String str = j.b;
            String str2 = j.c;
            int i = zhn0.a[j.a.ordinal()];
            if (i == 1) {
                return new r970(str, str2);
            }
            if (i == 2) {
                return new y970(str, str2);
            }
            if (i == 3) {
                return new m970(str2);
            }
            if (i == 4) {
                return new n970(str2);
            }
            w511.b();
            return null;
        }
        if (frl0.r.n(uri) != null) {
            return new w970(uri);
        }
        if (frl0.o.k(uri) != null) {
            return s970.a;
        }
        if (frl0.k.g(uri) != null) {
            return p970.a;
        }
        uho0 m = frl0.q.m(uri);
        if (m != null) {
            return new v970(m.b, m.c);
        }
        if (frl0.u.q(uri) != null) {
            return t970.a;
        }
        if (frl0.l.h(uri) != null) {
            return q970.a;
        }
        a1n0 f = frl0.j.f(uri);
        if (f != null) {
            return new o970(f.c, f.b);
        }
        if (frl0.p.l(uri) != null) {
            return u970.a;
        }
        return null;
    }
}
