package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ro5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ro5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
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
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                y9l.a(z0v.b(hq5Var2), hq5Var2, 0);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                y9l.a(z0v.b(hq5Var3), hq5Var3, 0);
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_trash_24, 0, hq5Var4), rvf.M(R.string.delete_button, hq5Var4), null, ((dq0) ((oq5) hq5Var4).j(eq0.a)).a.c, hq5Var4, 0, 4);
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                po6 po6Var = new po6("", "Bohemian rhapsody", "by awesome Freddie", true, jzb.d, true, true);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var5, 0);
                oq5 oq5Var6 = (oq5) hq5Var5;
                int i2 = oq5Var6.P;
                a l = oq5Var6.l();
                yci H = vnj.H(hq5Var5, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var5, a, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var6, i2, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                ngg.c(po6Var, crm.a, null, null, false, hq5Var5, 0, 28);
                u1g.l(hq5Var5, d.e(vciVar, 20));
                ngg.d(null, hq5Var5, 6);
                oq5Var6.p(true);
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                ngg.f(0, hq5Var6);
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (!oq5Var8.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var8.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    iz2 iz2Var = b2c.f;
                    yci d = d.d(vciVar, 1.0f);
                    float f = y2n.a;
                    yci e = d.e(d, f);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i3 = oq5Var9.P;
                    a l2 = oq5Var9.l();
                    yci H2 = vnj.H(oq5Var9, e);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var9.d0();
                    if (oq5Var9.O) {
                        oq5Var9.k(grbVar2);
                    } else {
                        oq5Var9.n0();
                    }
                    g0g.U(oq5Var9, d2, wp5.f);
                    g0g.U(oq5Var9, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var9.O || !Intrinsics.d(oq5Var9.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var9, i3, kb5Var2);
                    }
                    g0g.U(oq5Var9, H2, wp5.d);
                    pm0.c(xp3.u(d.e(d.d(vciVar, 1.0f), f), ugo.a(8)), oq5Var9, 0);
                    oq5Var9.p(true);
                } else {
                    oq5Var9.S();
                }
                break;
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (!oq5Var10.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    oq5Var10.S();
                }
                break;
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var10;
                if (oq5Var11.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String string = ((Context) oq5Var11.j(cs5.b)).getString(R.string.cover_description);
                    string.getClass();
                    ukd z = o5g.z(skd.a);
                    boolean f2 = oq5Var11.f(string);
                    Object K = oq5Var11.K();
                    if (f2 || K == kjnVar) {
                        K = new wq(string, 7);
                        oq5Var11.k0(K);
                    }
                    vq2.c(zdg.E(z, (Function1) K), null, vnj.c, oq5Var11, 384, 2);
                } else {
                    oq5Var11.S();
                }
                break;
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var11;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                    }
                }
                break;
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var12;
                if (oq5Var13.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_close_mid_24, 0, oq5Var13), rvf.M(R.string.clear_text_content_description, oq5Var13), null, ((dq0) oq5Var13.j(eq0.a)).a.a, oq5Var13, 0, 4);
                } else {
                    oq5Var13.S();
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var13;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                    }
                }
                break;
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                    }
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var16 = (oq5) hq5Var15;
                if (oq5Var16.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_settings_24, 0, oq5Var16), rvf.M(R.string.app_preferences_text, oq5Var16), null, ((dq0) oq5Var16.j(eq0.a)).a.a, oq5Var16, 0, 4);
                } else {
                    oq5Var16.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var17 = (oq5) hq5Var16;
                if (oq5Var17.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Object K2 = oq5Var17.K();
                    if (K2 == kjnVar) {
                        K2 = new to5(0);
                        oq5Var17.k0(K2);
                    }
                    rzf.i((Function0) K2, null, oq5Var17, 6);
                } else {
                    oq5Var17.S();
                }
                break;
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var18 = (oq5) hq5Var17;
                if (oq5Var18.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_settings_24, 0, oq5Var18), null, null, ((dq0) oq5Var18.j(eq0.a)).a.c, oq5Var18, 48, 4);
                } else {
                    oq5Var18.S();
                }
                break;
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var19 = (oq5) hq5Var18;
                if (oq5Var19.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    dtp dtpVar = new dtp(new usp(nyn.a), new xsp(false), new rsp(p5n.b), new atp(new opl(50000L)), new osp(xgl.b), nsp.a);
                    Object K3 = oq5Var19.K();
                    if (K3 == kjnVar) {
                        K3 = new z35(27);
                        oq5Var19.k0(K3);
                    }
                    Function1 function1 = (Function1) K3;
                    Object K4 = oq5Var19.K();
                    if (K4 == kjnVar) {
                        K4 = new z35(28);
                        oq5Var19.k0(K4);
                    }
                    Function1 function12 = (Function1) K4;
                    Object K5 = oq5Var19.K();
                    if (K5 == kjnVar) {
                        K5 = new z35(29);
                        oq5Var19.k0(K5);
                    }
                    Function1 function13 = (Function1) K5;
                    Object K6 = oq5Var19.K();
                    if (K6 == kjnVar) {
                        K6 = new to5(1);
                        oq5Var19.k0(K6);
                    }
                    Function0 function0 = (Function0) K6;
                    Object K7 = oq5Var19.K();
                    if (K7 == kjnVar) {
                        K7 = new to5(2);
                        oq5Var19.k0(K7);
                    }
                    Function0 function02 = (Function0) K7;
                    Object K8 = oq5Var19.K();
                    if (K8 == kjnVar) {
                        K8 = new uo5(0);
                        oq5Var19.k0(K8);
                    }
                    g0g.q(dtpVar, function1, function12, function13, function0, function02, (Function1) K8, null, oq5Var19, 1797552, 128);
                } else {
                    oq5Var19.S();
                }
                break;
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var20 = (oq5) hq5Var19;
                if (oq5Var20.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_share_new_24, 0, oq5Var20), rvf.M(R.string.share_icon, oq5Var20), null, ((dq0) oq5Var20.j(eq0.a)).a.a, oq5Var20, 0, 4);
                } else {
                    oq5Var20.S();
                }
                break;
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var21 = (oq5) hq5Var20;
                if (oq5Var21.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Object K9 = oq5Var21.K();
                    if (K9 == kjnVar) {
                        K9 = new to5(3);
                        oq5Var21.k0(K9);
                    }
                    y5g.M((Function0) K9, null, oq5Var21, 6, 2);
                } else {
                    oq5Var21.S();
                }
                break;
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var21;
                if (!oq5Var22.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    oq5Var22.S();
                }
                break;
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var23 = (oq5) hq5Var22;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                    }
                }
                break;
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var23;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                    }
                }
                break;
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var24;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                ngg.f(0, hq5Var24);
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var25;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_trailer_24, 0, hq5Var25), rvf.M(R.string.dialog_action_trailer_track, hq5Var25), androidx.compose.ui.platform.a.a(vciVar, "trailer_icon"), ((dq0) ((oq5) hq5Var25).j(eq0.a)).a.a, hq5Var25, 384, 0);
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var27 = (oq5) hq5Var26;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        break;
                    }
                }
                yci b = androidx.compose.foundation.a.b(d.m(vciVar, 52), d85.h, vnj.i);
                kfh d3 = ug3.d(b2c.b, false);
                oq5 oq5Var28 = (oq5) hq5Var26;
                int i4 = oq5Var28.P;
                a l3 = oq5Var28.l();
                yci H3 = vnj.H(hq5Var26, b);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var28.d0();
                if (oq5Var28.O) {
                    oq5Var28.k(grbVar3);
                } else {
                    oq5Var28.n0();
                }
                g0g.U(hq5Var26, d3, wp5.f);
                g0g.U(hq5Var26, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var28.O || !Intrinsics.d(oq5Var28.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var28, i4, kb5Var3);
                }
                g0g.U(hq5Var26, H3, wp5.d);
                oq5Var28.p(true);
                break;
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var29 = (oq5) hq5Var27;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        break;
                    }
                }
                ug3.a(androidx.compose.foundation.a.b(d.d(d.e(vciVar, 36), 1.0f), d85.i, vnj.i), hq5Var27, 6);
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var30 = (oq5) hq5Var28;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        break;
                    }
                }
                zyj zyjVar = zyj.c;
                rba rbaVar = rba.c;
                lzs lzsVar = lzs.a;
                nxq nxqVar = nxq.c;
                oq5 oq5Var31 = (oq5) hq5Var28;
                Object K10 = oq5Var31.K();
                if (K10 == kjnVar) {
                    K10 = new to5(4);
                    oq5Var31.k0(K10);
                }
                Function0 function03 = (Function0) K10;
                Object K11 = oq5Var31.K();
                if (K11 == kjnVar) {
                    K11 = new to5(5);
                    oq5Var31.k0(K11);
                }
                qgg.l(zyjVar, rbaVar, lzsVar, false, true, function03, null, (Function0) K11, i4w.d, i4w.e, null, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var31, 920350134, 48, 0, 2094080);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var32 = (oq5) hq5Var29;
                if (oq5Var32.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_sort_24, 0, oq5Var32), rvf.M(R.string.sort, oq5Var32), null, ((dq0) oq5Var32.j(eq0.a)).a.a, oq5Var32, 0, 4);
                } else {
                    oq5Var32.S();
                }
                break;
            default:
                hq5 hq5Var30 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var33 = (oq5) hq5Var30;
                if (oq5Var33.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Object K12 = oq5Var33.K();
                    if (K12 == kjnVar) {
                        K12 = new to5(6);
                        oq5Var33.k0(K12);
                    }
                    a0g.q((Function0) K12, null, oq5Var33, 6);
                } else {
                    oq5Var33.S();
                }
                break;
        }
        return Unit.a;
    }
}
