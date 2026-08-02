package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class spb1 {
    public static final void a(f530 f530Var, CharSequence charSequence, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1684864438);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(1486480443);
            btsVar.t(false);
        } else {
            btsVar.e0(1486480444);
            f530 k = an91.k(f530Var, 8.0f);
            boolean c = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new jg0(22);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new s140(19, tlsVar);
                btsVar.o0(Q2);
            }
            ohb1.b(null, false, null, (sls) Q2, wwg.S(-1025950976, true, new or9(9, charSequence), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar.t(true);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(f530Var, (Object) charSequence, (Object) tlsVar, i, 7);
        }
    }

    public static final void b(lxd lxdVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1298198408);
        int i2 = i | (btsVar.k(lxdVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 1);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            v0b1.a(lxdVar.a, ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
            CharSequence charSequence = lxdVar.b;
            if (charSequence == null) {
                btsVar.e0(-368436556);
                btsVar.t(false);
            } else {
                btsVar.e0(-368436555);
                qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(lxdVar, i, 14);
        }
    }

    public static final void c(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-759153189);
        int i2 = (btsVar.k(list) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new qh2(list, 10);
                btsVar.o0(Q);
            }
            adb1.a(null, null, null, null, null, null, false, null, (tls) Q, btsVar, 0, 511);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, 9, list);
        }
    }

    public static final void d(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(545135201);
        int i2 = (btsVar.k(list) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                if (obj != null) {
                    ny61.u();
                    return;
                } else {
                    rpb1.a(i3 != scc.f(list), btsVar, 0);
                    i3 = i4;
                }
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, 5, list);
        }
    }

    public static final void e(he40 he40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(542548889);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(he40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 22;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(233081459, true, new ut9(i3, he40Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(he40Var, tlsVar, i, i3);
        }
    }

    public static final void f(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2139091622);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).f.c, null, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 18, charSequence);
        }
    }

    public static final long g(int i, int i2) {
        return h(0L, 0L, 0L, i, i2);
    }

    public static final long h(long j, long j2, long j3, long j4, long j5) {
        return TimeUnit.SECONDS.toMillis(j4) + TimeUnit.MINUTES.toMillis(j3) + TimeUnit.HOURS.toMillis(j2) + TimeUnit.DAYS.toMillis(j) + j5;
    }
}
