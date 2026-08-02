package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public abstract class y9l {
    public static final float a = 56;
    public static final ArrayList b;

    static {
        IntRange intRange = new IntRange(0, 16, 1);
        ArrayList arrayList = new ArrayList(v75.o(intRange, 10));
        ype it = intRange.iterator();
        while (it.c) {
            arrayList.add(new d85(c3x.e(0.0f, 0.0f, 0.0f, (float) Math.pow(1 - (it.nextInt() / 16.0f), 2), n95.e)));
        }
        b = arrayList;
    }

    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1978786412);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            bg3.a(yciVar2, b2c.f, false, up6.f, oq5Var, (i2 & 14) | 3120, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar2, i, 9);
        }
    }

    public static final void b(int i, hq5 hq5Var, yci yciVar, String str) {
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-470417931);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            str2 = str;
        } else {
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            str2 = str;
            ltg.e(qo6.d, str2, d.c(vci.a, 1.0f), hd6.b, null, up6.c, up6.d, up6.e, oq5Var, ((i2 << 3) & 112) | 14355846, 16);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str2, yciVar, i, 10);
        }
    }

    public static final void c(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1303058231);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            n7w.x(str, ((w3v) oq5Var.j(x3v.a)).b.b, new fds(0.9f, 8, v7g.z(138), v7g.z(32)), null, 0, 0, oq5Var, (i2 & 14) | 3072);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 9);
        }
    }

    public static final void d(a3v a3vVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1825110668);
        if ((((oq5Var.h(a3vVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = a3vVar instanceof y2v;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-1567410050);
                b(48, oq5Var, androidx.compose.foundation.layout.a.k(d.c(vciVar, 1.0f), 0.0f, 16, 1), ((y2v) a3vVar).b);
                oq5Var.p(false);
            } else {
                if (!(a3vVar instanceof z2v)) {
                    throw vz1.i(oq5Var, -1574584790, false);
                }
                oq5Var.Z(-1567097415);
                c(48, oq5Var, androidx.compose.foundation.layout.a.o(d.c(vciVar, 1.0f), 16, 0.0f, 2), ((z2v) a3vVar).a);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(a3vVar, yciVar, i, 9);
        }
    }
}
