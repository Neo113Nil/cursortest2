package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class xtp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ xtp(Function0 function0) {
        this.a = 2;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = gq5.a;
        vci vciVar = vci.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v3g.c(function0, (hq5) obj, rvf.R(1));
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Function0 function02 = this.b;
                boolean f = oq5Var2.f(function02);
                Object K = oq5Var2.K();
                if (f || K == obj3) {
                    K = new ycq(function02);
                    oq5Var2.k0(K);
                }
                ivf.o((ycq) K, function02, vci.a, null, null, oq5Var2, 384, 24);
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i2 = oq5Var4.P;
                a l = oq5Var4.l();
                yci H = vnj.H(hq5Var2, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, d, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var4, i2, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                yci c = d.c(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                int i3 = oq5Var4.P;
                a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var2, c);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a, kb5Var);
                g0g.U(hq5Var2, l2, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var4, i3, kb5Var3);
                }
                g0g.U(hq5Var2, H2, kb5Var4);
                yci d2 = d.d(vciVar, 1.0f);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci g = vz1.g(1.0f, d2, true);
                float f2 = yvq.a;
                pm0.c(xp3.u(g, ugo.a(f2)), hq5Var2, 0);
                u1g.l(hq5Var2, d.e(vciVar, yvq.b));
                pm0.c(xp3.u(d.e(d.d(vciVar, 1.0f), yvq.c), ugo.c(f2, f2)), hq5Var2, 0);
                oq5Var4.p(true);
                WeakHashMap weakHashMap = rqv.w;
                gwq.b(this.b, androidx.compose.foundation.layout.a.l(vciVar, p6g.n(z7l.h(hq5Var2).f, hq5Var2)), ild.C(1812858341, new j1p(12), hq5Var2), null, hq5Var2, 384, 8);
                oq5Var4.p(true);
                break;
            case 3:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var3;
                Function0 function03 = this.b;
                boolean f3 = oq5Var6.f(function03);
                Object K2 = oq5Var6.K();
                if (f3 || K2 == obj3) {
                    K2 = new u8p(R.drawable.ic_info_24, R.string.track_info_bottom_sheet_title, "dialog_action_track_info", function03);
                    oq5Var6.k0(K2);
                }
                ivf.o((u8p) K2, function03, vci.a, null, null, oq5Var6, 384, 24);
            case 4:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                hdg.o(rvf.M(R.string.listen, hq5Var4), this.b, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2), 0.0f, hq5Var4, 384, 8);
            case 5:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                hdg.s(432, ff7.g, hq5Var5, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2), function0);
            case 6:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                hdg.s(432, xv7.j, hq5Var6, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2), function0);
            case 7:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                hdg.o(rvf.M(R.string.wave_for_two_only_you_in_wave_button, hq5Var7), this.b, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2), 0.0f, hq5Var7, 384, 8);
            case 8:
                ((Integer) obj2).getClass();
                w1g.m(function0, (hq5) obj, rvf.R(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                hyf.o(function0, (hq5) obj, rvf.R(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                v7g.l(function0, (hq5) obj, rvf.R(7));
                break;
            case 11:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                yci o = d.o(vciVar, 44, 40);
                neg.s(hq5Var8);
                long j = ((dq0) ((oq5) hq5Var8).j(eq0.a)).a.a;
                neg.o(hq5Var8);
                zsd.g(this.b, o, R.string.go_back, j, R.drawable.ic_arrow_android_back_24, hq5Var8, 48, 0);
            case 12:
                ((Integer) obj2).getClass();
                zdg.m(function0, (hq5) obj, rvf.R(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                avf.o(function0, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ivf.t(function0, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xtp(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public /* synthetic */ xtp(Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = function0;
    }
}
