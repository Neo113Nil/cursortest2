package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class wo5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ wo5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        int i2 = 8;
        kjn kjnVar = gq5.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (!oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (!oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (!oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (!oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    oq5Var5.S();
                }
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (!oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    oq5Var6.S();
                }
                break;
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (!oq5Var7.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    oq5Var7.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    String string = ((Context) oq5Var8.j(cs5.b)).getString(R.string.cover_description);
                    string.getClass();
                    ukd z = o5g.z(skd.a);
                    boolean f = oq5Var8.f(string);
                    Object K = oq5Var8.K();
                    if (f || K == kjnVar) {
                        K = new wq(string, i2);
                        oq5Var8.k0(K);
                    }
                    vq2.c(zdg.E(z, (Function1) K), null, ksw.h, oq5Var8, 384, 2);
                } else {
                    oq5Var8.S();
                }
                break;
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    vum.b(d.m(vciVar, 24), ((dq0) oq5Var9.j(eq0.a)).b.a, (float) 2.5d, 0L, 0, oq5Var9, 390, 24);
                } else {
                    oq5Var9.S();
                }
                break;
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (oq5Var10.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    pd.b(new qzm[0], true, c3x.d, oq5Var10, 432, 0);
                } else {
                    oq5Var10.S();
                }
                break;
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var11;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                    }
                }
                break;
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var12;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                    }
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var13;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                List h = u75.h(new k0s("1", "Для вас"), new k0s("2", "Тренды"), new k0s("3", "Фабрика звезд"));
                oq5 oq5Var14 = (oq5) hq5Var13;
                Object K2 = oq5Var14.K();
                if (K2 == kjnVar) {
                    K2 = new uo5(1);
                    oq5Var14.k0(K2);
                }
                hdg.w(h, 0, (Function1) K2, null, false, false, false, 0L, 0L, false, null, oq5Var14, 432, 4088);
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                List h2 = u75.h(new k0s("1", "Очень длинный заголовок"), new k0s("2", "Тренды"));
                oq5 oq5Var16 = (oq5) hq5Var14;
                Object K3 = oq5Var16.K();
                if (K3 == kjnVar) {
                    K3 = new uo5(2);
                    oq5Var16.k0(K3);
                }
                hdg.w(h2, 0, (Function1) K3, null, false, false, false, 0L, 0L, false, null, oq5Var16, 432, 4088);
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var17 = (oq5) hq5Var15;
                if (!oq5Var17.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    oq5Var17.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var18 = (oq5) hq5Var16;
                if (oq5Var18.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    List h3 = u75.h(new w1s(CommonUrlParts.Values.FALSE_INTEGER, "Для вас", "Drake, Smino", t75.c("aaoe")), new w1s("1", "Популярное", null, c5b.a));
                    Object K4 = oq5Var18.K();
                    if (K4 == kjnVar) {
                        K4 = new uo5(3);
                        oq5Var18.k0(K4);
                    }
                    wdg.l(h3, 0, false, false, (Function1) K4, null, oq5Var18, 28086, 32);
                } else {
                    oq5Var18.S();
                }
                break;
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var19 = (oq5) hq5Var17;
                if (oq5Var19.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    c5b c5bVar = c5b.a;
                    List h4 = u75.h(new w1s(CommonUrlParts.Values.FALSE_INTEGER, "Для вас", null, c5bVar), new w1s("1", "Популярное", null, c5bVar));
                    Object K5 = oq5Var19.K();
                    if (K5 == kjnVar) {
                        K5 = new uo5(5);
                        oq5Var19.k0(K5);
                    }
                    wdg.l(h4, 0, true, true, (Function1) K5, null, oq5Var19, 28086, 32);
                } else {
                    oq5Var19.S();
                }
                break;
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var20 = (oq5) hq5Var18;
                if (oq5Var20.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    c5b c5bVar2 = c5b.a;
                    List h5 = u75.h(new w1s(CommonUrlParts.Values.FALSE_INTEGER, "Очень длинный заголовок", "Очень длинный подзаголовок", c5bVar2), new w1s("1", "Популярное", null, c5bVar2), new w1s("2", "Title only", "", c5bVar2));
                    Object K6 = oq5Var20.K();
                    if (K6 == kjnVar) {
                        K6 = new uo5(4);
                        oq5Var20.k0(K6);
                    }
                    wdg.l(h5, 0, false, false, (Function1) K6, null, oq5Var20, 28086, 32);
                } else {
                    oq5Var20.S();
                }
                break;
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var21 = (oq5) hq5Var19;
                if (oq5Var21.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    pd.g(0, 1, oq5Var21, null);
                } else {
                    oq5Var21.S();
                }
                break;
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                int intValue16 = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var20;
                if (oq5Var22.P(intValue16 & 1, (intValue16 & 3) != 2)) {
                    pd.b(new qzm[0], false, pd.f, oq5Var22, 0, 2);
                } else {
                    oq5Var22.S();
                }
                break;
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                int intValue17 = ((Integer) obj2).intValue();
                oq5 oq5Var23 = (oq5) hq5Var21;
                if (oq5Var23.P(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ivf.c(0, oq5Var23);
                } else {
                    oq5Var23.S();
                }
                break;
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                int intValue18 = ((Integer) obj2).intValue();
                oq5 oq5Var24 = (oq5) hq5Var22;
                if (oq5Var24.P(intValue18 & 1, (intValue18 & 3) != 2)) {
                    pd.b(new qzm[0], true, xv.e, oq5Var24, 432, 0);
                } else {
                    oq5Var24.S();
                }
                break;
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                int intValue19 = ((Integer) obj2).intValue();
                oq5 oq5Var25 = (oq5) hq5Var23;
                if (oq5Var25.P(intValue19 & 1, (intValue19 & 3) != 2)) {
                    iz2 iz2Var = b2c.f;
                    yci c = d.c(vciVar, 1.0f);
                    kfh d = ug3.d(iz2Var, false);
                    int i3 = oq5Var25.P;
                    a l = oq5Var25.l();
                    yci H = vnj.H(oq5Var25, c);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var25.d0();
                    if (oq5Var25.O) {
                        oq5Var25.k(grbVar);
                    } else {
                        oq5Var25.n0();
                    }
                    g0g.U(oq5Var25, d, wp5.f);
                    g0g.U(oq5Var25, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var25.O || !Intrinsics.d(oq5Var25.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var25, i3, kb5Var);
                    }
                    g0g.U(oq5Var25, H, wp5.d);
                    pd.g(0, 1, oq5Var25, null);
                    oq5Var25.p(true);
                } else {
                    oq5Var25.S();
                }
                break;
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var24;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                oq5 oq5Var27 = (oq5) hq5Var24;
                Object K7 = oq5Var27.K();
                if (K7 == kjnVar) {
                    K7 = new to5(9);
                    oq5Var27.k0(K7);
                }
                a0g.p((Function0) K7, null, false, false, 0L, null, jf0.e, oq5Var27, 1572870, 62);
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var25;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                g0g.m(jf0.f, rvf.M(R.string.menu_element_share, hq5Var25), null, null, 0L, 0, hq5Var25, 6, 60);
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var29 = (oq5) hq5Var26;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        break;
                    }
                }
                oq5 oq5Var30 = (oq5) hq5Var26;
                Object K8 = oq5Var30.K();
                if (K8 == kjnVar) {
                    K8 = new to5(8);
                    oq5Var30.k0(K8);
                }
                a0g.n((Function0) K8, null, false, false, false, 0.0f, jf0.h, oq5Var30, 1572870, 62);
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var31 = (oq5) hq5Var27;
                    if (oq5Var31.z()) {
                        oq5Var31.S();
                        break;
                    }
                }
                g0g.m(jf0.i, rvf.M(R.string.listen, hq5Var27), null, null, 0L, 0, hq5Var27, 6, 60);
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var32 = (oq5) hq5Var28;
                    if (oq5Var32.z()) {
                        oq5Var32.S();
                        break;
                    }
                }
                oq5 oq5Var33 = (oq5) hq5Var28;
                Object K9 = oq5Var33.K();
                if (K9 == kjnVar) {
                    K9 = new to5(7);
                    oq5Var33.k0(K9);
                }
                a0g.p((Function0) K9, null, false, false, 0L, null, jf0.k, oq5Var33, 1572870, 62);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var34 = (oq5) hq5Var29;
                    if (oq5Var34.z()) {
                        oq5Var34.S();
                        break;
                    }
                }
                g0g.m(jf0.l, "3 121", null, null, 0L, 0, hq5Var29, 54, 60);
            default:
                hq5 hq5Var30 = (hq5) obj;
                int intValue20 = ((Integer) obj2).intValue();
                oq5 oq5Var35 = (oq5) hq5Var30;
                if (oq5Var35.P(intValue20 & 1, (intValue20 & 3) != 2)) {
                    zgs zgsVar = new zgs(-1, "Audio-books", null, ((zgs) uwf.q().get(2)).c, ((zgs) uwf.q().get(2)).d);
                    bhs s = ywf.s(oq5Var35);
                    avf.j(zgsVar, null, 2, new bhs(s.a, s.b, false, s.d), null, null, null, null, null, oq5Var35, 384, 498);
                } else {
                    oq5Var35.S();
                }
                break;
        }
        return Unit.a;
    }
}
