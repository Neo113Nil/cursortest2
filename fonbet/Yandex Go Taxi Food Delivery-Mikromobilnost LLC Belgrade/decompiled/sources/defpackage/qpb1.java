package defpackage;

import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.compose.common.tariffcell.a;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.TimeUnitsVisibility;

/* loaded from: classes11.dex */
public abstract class qpb1 {
    public static final void a(zvd zvdVar, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-184842346);
        int i2 = 4;
        int i3 = i | (btsVar.k(zvdVar) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            if (zvdVar.a != null) {
                btsVar.e0(-489901851);
                long n = tje.n(AppColor$Palette.Line, btsVar);
                a7u0 a7u0Var = j.h;
                float w0 = ((fwi) btsVar.m(a7u0Var)).w0(1.0f);
                fwi fwiVar = (fwi) btsVar.m(a7u0Var);
                xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
                f530Var2 = bb1.g(f530Var, new yvd(w0, fwiVar.w0(16.0f), n));
                btsVar.t(false);
            } else {
                btsVar.e0(-489611846);
                btsVar.t(false);
                f530Var2 = f530Var;
            }
            mex0 mex0Var = zvdVar.a;
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var2);
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
            twt0 G = sb2.G(0.75f, 200.0f, 4, null);
            Object Q = btsVar.Q();
            int i4 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i4);
                btsVar.o0(Q);
            }
            w2o a2 = k.n(G, (tls) Q).a(k.a(null, null, 15)).a(k.e(null, 3));
            twt0 G2 = sb2.G(0.75f, 200.0f, 4, null);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i4);
                btsVar.o0(Q2);
            }
            ttb1.a(mex0Var, null, a2, k.s(G2, (tls) Q2).a(k.i(null, null, 15)).a(k.f(null, 3)), "AlternativeTariffCell", wwg.S(-1120421732, true, new dhj0(i2, mex0Var, tlsVar, tlsVar2), btsVar), btsVar, 224640, 2);
            btsVar = btsVar;
            a.g(zvdVar.b, null, tlsVar, tlsVar2, btsVar, i3 & 8064);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(i, 18, tlsVar, f530Var, zvdVar, tlsVar2);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1013204756);
        int i2 = (btsVar.k(list) ? 32 : 16) | i | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = m4m0.b(ymb1.l(an91.m(f530Var, 12.0f, 0.0f, 2), cyk0.c(20.0f)), tje.n(AppColor$Palette.BgMinor, btsVar), qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            if (list == null) {
                btsVar.e0(1721626108);
                btsVar.t(false);
            } else {
                btsVar.e0(1721626109);
                int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    t510 t510Var = (t510) obj;
                    npb1.b(i2 & 896, btsVar, tlsVar, t510Var, null);
                    if (i3 == scc.f(list)) {
                        btsVar.e0(-98366376);
                    } else if (t510Var.a instanceof i510) {
                        btsVar.e0(-98273903);
                        yrl.c(null, null, btsVar, 0, 7);
                    } else {
                        btsVar.e0(-98230131);
                        yrl.e(null, null, btsVar, 0, 7);
                        btsVar.t(false);
                        i3 = i4;
                    }
                    btsVar.t(false);
                    i3 = i4;
                }
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z840(f530Var, list, tlsVar, i, 0);
        }
    }

    public static final String c(zuj0 zuj0Var, long j, TimeUnitsVisibility timeUnitsVisibility) {
        long abs = Math.abs(j);
        long j2 = (abs / 60000) % 60;
        long j3 = (abs / 3600000) % 24;
        int intExact = Math.toIntExact(abs / 86400000);
        StringBuilder sb = new StringBuilder();
        int count = timeUnitsVisibility.getCount();
        if (count > 0 && intExact > 0) {
            sb.append(((avj0) zuj0Var).g(dwh0.date_format_in_days, kyh0.date_format_days_left_fallback, intExact));
            count--;
        }
        if (count > 0 && j3 > 0) {
            sb.append(HexString.CHAR_SPACE);
            sb.append(j3);
            sb.append(HexString.CHAR_SPACE);
            sb.append(((avj0) zuj0Var).h(kyh0.common_hour_sign));
            count--;
        }
        if (j3 == 0 && intExact == 0) {
            j2 = Math.max(j2, 1L);
        }
        if (count > 0 && j2 > 0) {
            sb.append(HexString.CHAR_SPACE);
            sb.append(j2);
            sb.append(HexString.CHAR_SPACE);
            sb.append(((avj0) zuj0Var).h(kyh0.common_minutes_sign));
        }
        return evu0.k0(sb.toString()).toString();
    }
}
