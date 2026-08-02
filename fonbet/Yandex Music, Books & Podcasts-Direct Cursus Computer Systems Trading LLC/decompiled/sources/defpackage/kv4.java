package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class kv4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv4(cdj cdjVar) {
        this.a = 16;
        this.b = cdjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        oq5 oq5Var;
        long j;
        int i = this.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                o0k o0kVar = (o0k) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    vm C = ghh.C(o0kVar, a.c(0.0f, 24, 0.0f, 16, 5));
                    yci c = d.c(vciVar, 1.0f);
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        K = new sm4(22);
                        oq5Var2.k0(K);
                    }
                    weo.f(c, null, C, null, null, null, false, null, (Function1) K, oq5Var2, 805306368, 506);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                saf.e((tv4) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                oq5 oq5Var3 = (oq5) ((hq5) obj);
                oq5Var3.Z(-112803903);
                Boolean bool = (Boolean) gld.O(((jz4) obj3).f, oq5Var3).getValue();
                bool.getClass();
                oq5Var3.p(false);
                return bool;
            case 3:
                v25 v25Var = (v25) obj3;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean h = oq5Var4.h(v25Var);
                    Object K2 = oq5Var4.K();
                    if (h || K2 == kjnVar) {
                        ub4 ub4Var = new ub4(0, v25Var, v25.class, "onBackClick", "onBackClick()V", 0, 27);
                        oq5Var4.k0(ub4Var);
                        K2 = ub4Var;
                    }
                    zsd.g((Function0) ((h9f) K2), null, 0, 0L, 0, oq5Var4, 0, 30);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                p65 p65Var = (p65) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K3 = oq5Var5.K();
                    if (K3 == kjnVar) {
                        c65 c65Var = p65Var.k;
                        u65 u65Var = (u65) p65Var.m.getValue();
                        b65 b65Var = (b65) p65Var.n.getValue();
                        tmb x = p65Var.x();
                        kxi d = p65Var.d();
                        c65Var.getClass();
                        b65Var.getClass();
                        e00 e00Var = c65Var.a;
                        e00Var.getClass();
                        k65 k65Var = new k65(u65Var, b65Var, x, d, (g0l) ((f65) e00Var.b).f.getValue());
                        oq5Var5.k0(k65Var);
                        K3 = k65Var;
                    }
                    p65Var.A(ild.C(290549567, new d65((k65) K3), oq5Var5), oq5Var5, 6);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                vut.g((l75) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                bg3.d((rd5) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                bs1 bs1Var = (bs1) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                ivf.k(0, 0, hq5Var4, xp3.u(d.c(vciVar, 1.0f), ugo.a(8)), bs1Var instanceof zr1);
                return Unit.a;
            case 8:
                ce5 ce5Var = (ce5) obj3;
                thj thjVar = (thj) ce5Var.p;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                rmb rmbVar = (rmb) ce5Var.h;
                if (booleanValue) {
                    rmb.a(rmbVar, sjb.Pause, thjVar, null, 10);
                } else {
                    rmbVar.m(null, thjVar, str2);
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                vut.h((ut5) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                n7w.j((ew5) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                bow.h((d31) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                zsd.y((g5i) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 13:
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                pvfVar.a(new String[]{"CONCERT_PLACE"}, new r25(14, (yy5) obj3));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                xv.i((wv5) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                gld.d((j56) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                cdj cdjVar = (cdj) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                yci c2 = b.c(vciVar, "my_shelf_block_progress_state", f8g.n(cdjVar));
                nho a = lho.a(qx0.a, b2c.l, hq5Var5, 48);
                oq5 oq5Var8 = (oq5) hq5Var5;
                int i3 = oq5Var8.P;
                androidx.compose.runtime.internal.a l = oq5Var8.l();
                yci H = vnj.H(hq5Var5, c2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var5, a, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var8, i3, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                if (cdjVar.equals(adj.a)) {
                    oq5Var8.Z(-850958330);
                    str = rvf.M(R.string.podcast_episode_state_playing, hq5Var5);
                    orl.a(54, 4, 0L, hq5Var5, a.m(d.m(vciVar, 16), 2), true);
                    u1g.l(hq5Var5, d.r(vciVar, 6));
                    oq5Var8.p(false);
                } else if (cdjVar.equals(ycj.a)) {
                    oq5Var8.Z(-850488866);
                    str = rvf.M(R.string.podcast_episode_state_completed, hq5Var5);
                    irf.r(a0g.E(R.drawable.ic_check_16, 0, hq5Var5), null, d.m(vciVar, ff7.P(v7g.z(16), hq5Var5)), null, null, 0.0f, new d43(kg5.r(R.color.icon_secondary_night, hq5Var5), 5), hq5Var5, 48, 56);
                    u1g.l(hq5Var5, d.r(vciVar, 4));
                    oq5Var8.p(false);
                } else if (cdjVar instanceof zcj) {
                    oq5Var8.Z(-849897758);
                    oq5Var8.p(false);
                    str = ((zcj) cdjVar).a;
                } else {
                    if (!(cdjVar instanceof bdj)) {
                        throw vz1.i(oq5Var8, 803832961, false);
                    }
                    oq5Var8.Z(-849730234);
                    bdj bdjVar = (bdj) cdjVar;
                    str = bdjVar.a;
                    ocg.g(bdjVar.c, a.m(d.m(vciVar, ff7.P(v7g.z(16), hq5Var5)), ff7.P(v7g.z(1), hq5Var5)), ff7.P(v7g.z(2), hq5Var5), hq5Var5, 0, 0);
                    u1g.l(hq5Var5, d.r(vciVar, 4));
                    oq5Var8.p(false);
                }
                String str3 = str;
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci D = ksw.D(androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f), "my_shelf_block_progress_text"), str, null);
                float f = ug6.a;
                xv7.j(str3, D, kg5.r(R.color.text_secondary_night, hq5Var5), 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var5, 0, 3120, 55288);
                oq5Var8.p(true);
                return Unit.a;
            case 17:
                eml emlVar = (eml) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                yci m = d.m(vciVar, fj6.c);
                w4k E = a0g.E(R.drawable.ic_dislike_24, 0, hq5Var6);
                if (emlVar.a == j1g.c) {
                    oq5Var = (oq5) hq5Var6;
                    oq5Var.Z(737774376);
                    j = ((dq0) oq5Var.j(eq0.a)).a.a;
                } else {
                    oq5Var = (oq5) hq5Var6;
                    oq5Var.Z(737775434);
                    j = ((dq0) oq5Var.j(eq0.a)).a.c;
                }
                oq5Var.p(false);
                gae.b(E, null, m, j, hq5Var6, 432, 0);
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                ox6.j((ks6) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 19:
                c88 c88Var = (c88) obj3;
                ((Context) obj).getClass();
                ((eke) obj2).getClass();
                x97.y(c88Var.b, null, null, new b88(c88Var, null), 3);
                return Unit.a;
            case 20:
                z88 z88Var = (z88) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var7;
                if (oq5Var10.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean h2 = oq5Var10.h(z88Var);
                    Object K4 = oq5Var10.K();
                    if (h2 || K4 == kjnVar) {
                        ej6 ej6Var = new ej6(0, z88Var, z88.class, "onBackClick", "onBackClick()V", 0, 24);
                        oq5Var10.k0(ej6Var);
                        K4 = ej6Var;
                    }
                    zsd.g((Function0) ((h9f) K4), null, 0, 0L, 0, oq5Var10, 0, 30);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 21:
                fp7 fp7Var = (fp7) obj3;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    rvf.a(fp7Var, androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var11.j(eq0.a)).c.a, vnj.i), null, null, 1, 0.0f, null, null, false, null, null, null, null, ild.C(365054188, new qy3(fp7Var, i2), oq5Var11), oq5Var11, 24576, 24576, 16364);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 22:
                ny2 ny2Var = (ny2) obj3;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var9;
                if (oq5Var12.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ((g06) ny2Var.invoke(oq5Var12.j(ykg.a))).c(0, oq5Var12);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                ((g06) obj3).c(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                saf.k((b61) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                wdp.Q((hda) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                qwp.r((yda) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                wct.h((tea) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                leu.m((rfa) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                eha ehaVar = (eha) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var10;
                if (oq5Var13.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean h3 = oq5Var13.h(ehaVar);
                    Object K5 = oq5Var13.K();
                    if (h3 || K5 == kjnVar) {
                        dda ddaVar = new dda(0, ehaVar, eha.class, "onBackClicked", "onBackClicked()V", 0, 12);
                        oq5Var13.k0(ddaVar);
                        K5 = ddaVar;
                    }
                    zsd.g((Function0) ((h9f) K5), null, 0, 0L, 0, oq5Var13, 0, 30);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ kv4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ kv4(o0k o0kVar) {
        this.a = 0;
        this.b = o0kVar;
    }

    public /* synthetic */ kv4(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
