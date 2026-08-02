package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wrl {
    public static final byk0 a = cyk0.c(6.0f);

    public static final void a(String str, f530 f530Var, ety0 ety0Var, wp2 wp2Var, wp2 wp2Var2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(895790206);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.k(ety0Var) ? 256 : 128) | (btsVar.k(wp2Var) ? 2048 : 1024) | (btsVar.k(wp2Var2) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            f530 l = an91.l(ljs0.b(bzk0.c(an91.m(f530Var, 8.0f, 0.0f, 2), wp2Var2, a), 0.0f, 24.0f, 1), 8.0f, 2.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, l);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            jeb1.f(str, cj6.a.a(c530.a, x4c.x), wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, (i2 & 14) | ((i2 >> 3) & 896), (i2 << 6) & HProv.ALG_CLASS_ALL, 16376);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(f530Var, (Object) str, (Object) ety0Var, (Object) wp2Var, (Object) wp2Var2, i, 13);
        }
    }
}
