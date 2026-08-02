package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ap5 implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ ap5(int i) {
        this.a = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                ugs ugsVar = (ugs) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ugsVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(ugsVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    avf.c(ugsVar, oq5Var, intValue & 14);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ace aceVar = (ace) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aceVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(aceVar) : ((oq5) hq5Var2).h(aceVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                h4a.h(aceVar, null, hq5Var2, intValue2 & 14);
            case 2:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                gae.b(a0g.E(R.drawable.ic_trailer_32, 0, hq5Var3), null, null, ((q9b) oq5Var4.j(s9b.a)).b(oq5Var4), oq5Var4, 48, 4);
            case 3:
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue4 & 17) == 16) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                    }
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue5 & 17) == 16) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                    }
                }
                break;
            case 5:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(zknVar) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(1 & intValue6, (intValue6 & 19) != 18)) {
                    bs1 k = zknVar.b.k();
                    if (k instanceof as1) {
                        oq5Var7.Z(-682450246);
                        irf.r(((as1) k).a, null, a.a(d.c(vciVar, 1.0f), "video_clip_cover"), null, hd6.a, 0.0f, null, oq5Var7, 25008, 104);
                        oq5Var7.p(false);
                    } else if (k instanceof yr1) {
                        oq5Var7.Z(-682080106);
                        ug3.a(androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var7.j(eq0.a)).c.c, vnj.i), oq5Var7, 0);
                        oq5Var7.p(false);
                    } else {
                        oq5Var7.Z(-681870236);
                        swf.e(6, 0, oq5Var7, d.c(a.a(vciVar, "video_clip_placeholder"), 1.0f));
                        oq5Var7.p(false);
                    }
                } else {
                    oq5Var7.S();
                }
                break;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).g(booleanValue) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (oq5Var8.P(1 & intValue7, (intValue7 & 19) != 18)) {
                    w4k E = a0g.E(booleanValue ? R.drawable.ic_like_active_24 : R.drawable.ic_like_unactive_24, 0, oq5Var8);
                    if (booleanValue) {
                        oq5Var8.Z(1673907753);
                        j = ((dq0) oq5Var8.j(eq0.a)).a.g;
                    } else {
                        oq5Var8.Z(1673908716);
                        j = ((dq0) oq5Var8.j(eq0.a)).a.a;
                    }
                    oq5Var8.p(false);
                    gae.b(E, null, null, j, oq5Var8, 48, 4);
                } else {
                    oq5Var8.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue8 & 17) == 16) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_screen_create_button, hq5Var8), null, ((dq0) ((oq5) hq5Var8).j(eq0.a)).b.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var8, 0, 0, 65530);
            case 8:
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue9 & 17) == 16) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_invitation_button_accept, hq5Var9), null, ((dq0) ((oq5) hq5Var9).j(eq0.a)).b.e, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), hq5Var9, 0, 0, 65018);
            case 9:
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue10 & 17) == 16) {
                    oq5 oq5Var11 = (oq5) hq5Var10;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_not_accepted_button, hq5Var10), null, ((dq0) ((oq5) hq5Var10).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var10, 0, 0, 65530);
            case 10:
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue11 & 17) == 16) {
                    oq5 oq5Var12 = (oq5) hq5Var11;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_not_accepted_button, hq5Var11), null, ((dq0) ((oq5) hq5Var11).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var11, 0, 0, 65530);
            case 11:
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue12 & 17) == 16) {
                    oq5 oq5Var13 = (oq5) hq5Var12;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_share_button, hq5Var12), null, ((dq0) ((oq5) hq5Var12).j(eq0.a)).b.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var12, 0, 0, 65530);
            case 12:
                hq5 hq5Var13 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue13 & 17) == 16) {
                    oq5 oq5Var14 = (oq5) hq5Var13;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                q7g.a(6, 0, hq5Var13, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 32, 0.0f, 0.0f, 13));
            case 13:
                hq5 hq5Var14 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue14 & 17) == 16) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.wave_for_two_promo_sheet_button, hq5Var14), null, ((dq0) ((oq5) hq5Var14).j(eq0.a)).b.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var14, 0, 0, 65530);
            case 14:
                hq5 hq5Var15 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue15 & 17) == 16) {
                    oq5 oq5Var16 = (oq5) hq5Var15;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.cancel_text, hq5Var15), null, ((dq0) ((oq5) hq5Var15).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var15, 0, 0, 65530);
            case 15:
                hq5 hq5Var16 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue16 & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var16;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.ok_text, hq5Var16), null, ((dq0) ((oq5) hq5Var16).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var16, 0, 0, 65530);
            case 16:
                hq5 hq5Var17 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue17 & 17) == 16) {
                    oq5 oq5Var18 = (oq5) hq5Var17;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                    }
                }
                break;
            case 17:
                hq5 hq5Var18 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue18 & 17) == 16) {
                    oq5 oq5Var19 = (oq5) hq5Var18;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                u1g.l(hq5Var18, d.e(vciVar, hdg.Z(hq5Var18)));
            case 18:
                hq5 hq5Var19 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue19 & 17) == 16) {
                    oq5 oq5Var20 = (oq5) hq5Var19;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                u1g.l(hq5Var19, d.e(vciVar, ((gtu) ((oq5) hq5Var19).j(htu.a)).j));
            case 19:
                hq5 hq5Var20 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue20 & 17) == 16) {
                    oq5 oq5Var21 = (oq5) hq5Var20;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        break;
                    }
                }
                u1g.l(hq5Var20, d.e(vciVar, hdg.Z(hq5Var20)));
            case 20:
                hq5 hq5Var21 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue21 & 17) == 16) {
                    oq5 oq5Var22 = (oq5) hq5Var21;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                r2v.g(null, hq5Var21, 0);
            case 21:
                hq5 hq5Var22 = (hq5) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue22 & 17) == 16) {
                    oq5 oq5Var23 = (oq5) hq5Var22;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        break;
                    }
                }
                bn2 bn2Var = ((zn2) ((oq5) hq5Var22).j(ao2.a)).b;
                gae.b(a0g.E(R.drawable.ic_offline_mode_lte_wi_fi_40, 0, hq5Var22), null, d.c(vciVar, 1.0f), neg.m(hq5Var22).b.b, hq5Var22, 432, 0);
            case 22:
                hq5 hq5Var23 = (hq5) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue23 & 17) == 16) {
                    oq5 oq5Var24 = (oq5) hq5Var23;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                    }
                }
                break;
            case 23:
                hq5 hq5Var24 = (hq5) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue24 & 17) == 16) {
                    oq5 oq5Var25 = (oq5) hq5Var24;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_play_big_32, 0, hq5Var24), null, null, 0L, hq5Var24, 48, 12);
            case 24:
                c cVar = (c) obj;
                hq5 hq5Var25 = (hq5) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((oq5) hq5Var25).f(cVar) ? 4 : 2;
                }
                if ((intValue25 & 19) == 18) {
                    oq5 oq5Var26 = (oq5) hq5Var25;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                pm0.d(d.d(b.a.a(vciVar, b2c.f), 0.5f), ges.b(nu0.c(), 0L, v7g.z(16), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213), hq5Var25, 0);
            case 25:
                hq5 hq5Var26 = (hq5) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue26 & 17) == 16) {
                    oq5 oq5Var27 = (oq5) hq5Var26;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        break;
                    }
                }
                xcs.b("Next", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var26, 6, 0, 131070);
            case 26:
                hq5 hq5Var27 = (hq5) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue27 & 17) == 16) {
                    oq5 oq5Var28 = (oq5) hq5Var27;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                xcs.b("Play/Pause", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var27, 6, 0, 131070);
            case 27:
                int intValue28 = ((Integer) obj).intValue();
                hq5 hq5Var28 = (hq5) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                if ((intValue29 & 6) == 0) {
                    intValue29 |= ((oq5) hq5Var28).d(intValue28) ? 4 : 2;
                }
                if ((intValue29 & 19) == 18) {
                    oq5 oq5Var29 = (oq5) hq5Var28;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        break;
                    }
                }
                gae.b(a0g.E(intValue28, intValue29 & 14, hq5Var28), null, d.c(vciVar, 1.0f), d85.f, hq5Var28, 3504, 0);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jav javVar = (jav) obj;
                int intValue30 = ((Integer) obj3).intValue();
                javVar.getClass();
                qgg.v(javVar, null, (hq5) obj2, intValue30 & 14);
                break;
            default:
                yci yciVar = (yci) obj;
                hq5 hq5Var29 = (hq5) obj2;
                int intValue31 = ((Integer) obj3).intValue();
                yciVar.getClass();
                if ((intValue31 & 6) == 0) {
                    intValue31 |= ((oq5) hq5Var29).f(yciVar) ? 4 : 2;
                }
                if ((intValue31 & 19) == 18) {
                    oq5 oq5Var30 = (oq5) hq5Var29;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        break;
                    }
                }
                pd.g(intValue31 & 14, 0, hq5Var29, yciVar);
        }
        return Unit.a;
    }
}
