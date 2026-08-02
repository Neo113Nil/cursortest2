package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class wd1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ wd1(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        sdr sdrVar = this.b;
        switch (i3) {
            case 0:
                wn5 wn5Var = weo.a;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(sdrVar);
                Object K = oq5Var2.K();
                if (f || K == gq5.a) {
                    K = new la1(sdrVar, 1);
                    oq5Var2.k0(K);
                }
                yci s = wyf.s(vci.a, (Function0) K);
                kfh d = ug3.d(b2c.b, false);
                int i4 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, s);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var2, i4, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                eta.l(0, wn5Var, oq5Var2, true);
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                ot0.n(((Number) sdrVar.getValue()).floatValue(), hq5Var2, 0);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(1 & intValue, (intValue & 3) != 2)) {
                    tt0.k(((Number) sdrVar.getValue()).floatValue(), oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                ((wbi) sdrVar.getValue()).c(0, hq5Var4);
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(1 & intValue2, (intValue2 & 3) != 2)) {
                    Integer num = (Integer) sdrVar.getValue();
                    if (num == null) {
                        oq5Var6.Z(-286866427);
                    } else {
                        oq5Var6.Z(-286866426);
                        xcs.b(rvf.M(num.intValue(), oq5Var6), null, ((dq0) oq5Var6.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var6, 0, 3120, 55290);
                    }
                    oq5Var6.p(false);
                } else {
                    oq5Var6.S();
                }
                break;
            default:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                if (((Boolean) sdrVar.getValue()).booleanValue()) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    oq5Var8.Z(2091601693);
                    neg.o(oq5Var8);
                    oq5Var8.p(false);
                    i = R.drawable.ic_sound_off_24;
                } else {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    oq5Var9.Z(2091683998);
                    neg.o(oq5Var9);
                    oq5Var9.p(false);
                    i = R.drawable.ic_sound_on_24;
                }
                w4k E = a0g.E(i, 0, hq5Var6);
                if (((Boolean) sdrVar.getValue()).booleanValue()) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    oq5Var10.Z(2091870959);
                    neg.s(oq5Var10);
                    oq5Var10.p(false);
                    i2 = R.string.unmute_description;
                } else {
                    oq5 oq5Var11 = (oq5) hq5Var6;
                    oq5Var11.Z(2091967121);
                    neg.s(oq5Var11);
                    oq5Var11.p(false);
                    i2 = R.string.mute_description;
                }
                gae.b(E, rvf.M(i2, hq5Var6), null, 0L, hq5Var6, 0, 12);
        }
        return Unit.a;
    }
}
