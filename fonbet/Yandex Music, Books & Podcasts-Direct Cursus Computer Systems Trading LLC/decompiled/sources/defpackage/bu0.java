package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class bu0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ bu0(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        long j = this.b;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_video_shot_small_16, 0, hq5Var), null, a.a(androidx.compose.foundation.layout.a.k(d.c(vciVar, 1.0f), 0.0f, ff7.P(v7g.z(2), hq5Var), 1), "video_cover"), this.b, hq5Var, 48, 0);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_clip_16, 0, hq5Var2), null, a.a(androidx.compose.foundation.layout.a.k(d.c(vciVar, 1.0f), 0.0f, ff7.P(v7g.z(2), hq5Var2), 1), "video_icon"), this.b, hq5Var2, 48, 0);
            case 2:
                ((Integer) obj2).getClass();
                x97.l(j, (hq5) obj, rvf.R(1));
                break;
            case 3:
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    xv7.i(o8g.m(f8g.Y(R.string.collection_wave_onboarding_text, oq5Var3), this.b, oq5Var3, 0, 0), androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, 2, 7), ((dq0) oq5Var3.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 2, 0, null, null, nu0.i(), null, null, oq5Var3, 48, 3120, 907256);
                } else {
                    oq5Var3.S();
                }
                break;
            case 4:
                hq5 hq5Var4 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yci u = xp3.u(d.m(androidx.compose.foundation.layout.a.m(vciVar, 12), 100), ugo.a);
                    boolean e = oq5Var4.e(j);
                    Object K = oq5Var4.K();
                    kjn kjnVar = gq5.a;
                    if (e || K == kjnVar) {
                        K = new nm0(j, 1);
                        oq5Var4.k0(K);
                    }
                    yci t = wyf.t(u, (Function0) K);
                    kfh d = ug3.d(b2c.b, false);
                    int i2 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, t);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, d, wp5.f);
                    g0g.U(oq5Var4, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var4, i2, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    w4k E = a0g.E(2131231419, 0, oq5Var4);
                    yci c = d.c(vciVar, 1.0f);
                    Object K2 = oq5Var4.K();
                    if (K2 == kjnVar) {
                        K2 = new z35(10);
                        oq5Var4.k0(K2);
                    }
                    irf.r(E, null, nfp.a(c, (Function1) K2), null, null, 0.0f, null, oq5Var4, 48, 120);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                break;
            case 5:
                hq5 hq5Var5 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    swf.d(qo6.m, gce.d, null, null, 0L, this.b, false, oq5Var5, 54, 92);
                } else {
                    oq5Var5.S();
                }
                break;
            case 6:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_more_24, 0, hq5Var6), rvf.M(R.string.overflow_menu_content_description, hq5Var6), null, this.b, hq5Var6, 0, 4);
            case 7:
                ((Integer) obj2).getClass();
                p1g.l(j, (hq5) obj, rvf.R(1));
                break;
            case 8:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_search_24, 0, hq5Var7), rvf.M(R.string.search, hq5Var7), null, this.b, hq5Var7, 0, 4);
            case 9:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_more_24, 0, hq5Var8), rvf.M(R.string.overflow_menu_content_description, hq5Var8), a.a(d.m(vciVar, 24), "track_overflow"), this.b, hq5Var8, 384, 0);
            case 10:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var9;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_trailer_24, 0, hq5Var9), rvf.M(R.string.menu_element_trailer, hq5Var9), null, this.b, hq5Var9, 0, 4);
            default:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.external, 0, hq5Var10), null, androidx.compose.foundation.layout.a.k(vciVar, 0.0f, ff7.P(v7g.z(2), hq5Var10), 1), this.b, hq5Var10, 48, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ bu0(long j, int i, int i2) {
        this.a = i2;
        this.b = j;
    }
}
