package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class oxm {
    public static final long a = c3x.e(1.0f, 0.8f, 0.0f, 1.0f, n95.e);
    public static final /* synthetic */ int b = 0;

    public static final void a(boolean z, boolean z2, d85 d85Var, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        long r;
        long z3;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1520140112);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(d85Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            if (((ma5) oq5Var.j(pa5.a)).g()) {
                oq5Var.Z(-358550694);
                r = kg5.r(R.color.icon_logo_day_old, oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-358610276);
                r = kg5.r(R.color.icon_logo_night, oq5Var);
                oq5Var.p(false);
            }
            w4k E = a0g.E(z2 ? R.drawable.ic_promo_the_most_accurate_recommendations_ru : R.drawable.ic_promo_the_most_accurate_recommendations_en, 0, oq5Var);
            if ((d85Var == null ? false : d85.c(d85Var.a, a)) || d85Var == null) {
                p85 b0 = pd.b0(r);
                int i5 = d85.o;
                z3 = mvt.z(b0.a, 0.85f, 0.48f, 0.0f, 24);
            } else {
                p85 b02 = pd.b0(d85Var.a);
                int i6 = d85.o;
                z3 = mvt.z(b02.a, 0.85f, 0.4f, 0.0f, 24);
            }
            Continuation continuation = null;
            sdr b2 = bmq.b(z3, weo.S(1000, 0, null, 6), "animateLogoTintColor", oq5Var, 432, 8);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(z ? mxm.a : mxm.c);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Unit unit = Unit.a;
            boolean z4 = (i4 & 14) == 4;
            Object K2 = oq5Var.K();
            if (z4 || K2 == kjnVar) {
                i3 = 0;
                K2 = new nxm(z, aqiVar, continuation, i3);
                oq5Var.k0(K2);
            } else {
                i3 = 0;
            }
            gld.w(oq5Var, unit, (Function2) K2);
            vci vciVar = vci.a;
            tt0.f(i8t.e((mxm) aqiVar.getValue(), "promoSimpleLogoCrossfade", oq5Var, 48, i3), vciVar, weo.S(300, i3, lya.c, 2), null, ild.C(-1500232320, new vtb(E, b2, wn5Var), oq5Var), oq5Var, ((i4 >> 9) & 112) | 24576, 4);
            oq5Var = oq5Var;
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new en6(z, z2, d85Var, wn5Var, yciVar2, i);
        }
    }
}
