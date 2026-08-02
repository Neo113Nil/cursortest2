package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.tariffcard.experiment.GradientDto;
import com.yandex.go.tariffcard.experiment.SummaryOptionsTariffCardExperiment;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public abstract class rib1 {
    public static final void a(int i, fid fidVar, f530 f530Var, String str) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-120035331);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(str) ? 32 : 16) | (btsVar.k(null) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ((Boolean) btsVar.m(n.a)).booleanValue();
            btsVar.e0(1735556810);
            if (str == null) {
                btsVar.e0(1735556809);
                btsVar.t(false);
            } else {
                btsVar.e0(1735556810);
                ovi0 a = mja1.a(str, null, 6);
                b5d.a.getClass();
                v0b1.a(a, f530Var, null, b5d.b, null, null, null, mhe.c, 0.0f, 0, btsVar, ((i2 << 3) & 112) | 12585984, 884);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(f530Var, str, i, i3);
        }
    }

    public static final void b(lla llaVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1319006623);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(llaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = bzk0.c(ymb1.l(f530Var, cyk0.c(20.0f)), AppColor$Palette.BgMinor, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            a(0, btsVar, cj6Var.b(c530Var), llaVar.a);
            f530 k = an91.k(c530Var, 12.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            qgy.b(llaVar.b, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar).g.b, null, btsVar, 805309440, 6, 10742);
            oeb1.c(btsVar, ljs0.e(c530Var, 2.0f));
            qgy.b(llaVar.c, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10742);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(llaVar, f530Var, i, 23);
        }
    }

    public static final boolean c(SummaryOptionsTariffCardExperiment summaryOptionsTariffCardExperiment, String str, TariffOrderFlow tariffOrderFlow) {
        if (summaryOptionsTariffCardExperiment.b) {
            boolean contains = summaryOptionsTariffCardExperiment.d.contains(str);
            jsq0 jsq0Var = summaryOptionsTariffCardExperiment.e;
            boolean contains2 = jsq0Var != null ? jsq0Var.contains(tariffOrderFlow) : false;
            if (contains || contains2) {
                return true;
            }
        }
        return false;
    }

    public static final dxt d(GradientDto gradientDto) {
        if (gradientDto == null) {
            return null;
        }
        double d = gradientDto.c;
        if (0.0d > d || d > 1.0d) {
            return null;
        }
        return new dxt(gradientDto.a, gradientDto.b, (float) d);
    }

    public static final pj40 e(String str, String str2) {
        return ((str == null || evu0.J(str)) && (str2 == null || evu0.J(str2))) ? pj40.c : new pj40(str, str2);
    }
}
