package defpackage;

import android.graphics.ColorMatrixColorFilter;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class bp5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ bp5(int i) {
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
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    h1b h1bVar = jzb.b;
                    z9u j = t7l.j();
                    Object K = oq5Var.K();
                    if (K == kjnVar) {
                        K = new to5(19);
                        oq5Var.k0(K);
                    }
                    o5g.j(j, (Function0) K, null, oq5Var, 48, 4);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    o5g.k(null, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    h1b h1bVar2 = jzb.b;
                    z9u j2 = t7l.j();
                    Object K2 = oq5Var3.K();
                    if (K2 == kjnVar) {
                        K2 = new to5(17);
                        oq5Var3.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    Object K3 = oq5Var3.K();
                    if (K3 == kjnVar) {
                        K3 = new to5(18);
                        oq5Var3.k0(K3);
                    }
                    o5g.l(j2, function0, (Function0) K3, null, null, oq5Var3, 432, 24);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    o5g.m(0, oq5Var4);
                } else {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_backward_big_24, 0, oq5Var5), rvf.M(R.string.player_previous_description, oq5Var5), null, ((dq0) oq5Var5.j(eq0.a)).a.a, oq5Var5, 0, 4);
                } else {
                    oq5Var5.S();
                }
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_forward_big_24, 0, oq5Var6), rvf.M(R.string.player_skip_description, oq5Var6), null, ((dq0) oq5Var6.j(eq0.a)).a.a, oq5Var6, 0, 4);
                } else {
                    oq5Var6.S();
                }
                break;
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_more_24, 0, oq5Var7), null, null, ((dq0) oq5Var7.j(eq0.a)).a.a, oq5Var7, 48, 4);
                } else {
                    oq5Var7.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_full_screen_off_24, 0, oq5Var8), null, null, ((dq0) oq5Var8.j(eq0.a)).a.a, oq5Var8, 48, 4);
                } else {
                    oq5Var8.S();
                }
                break;
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    q5g.r(l6u.a, prm.a, null, oq5Var9, 6, 4);
                } else {
                    oq5Var9.S();
                }
                break;
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (oq5Var10.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_more_24, 0, oq5Var10), rvf.M(R.string.overflow_menu_content_description, oq5Var10), a.a(vciVar, "video_clip_show_overflow"), ((dq0) oq5Var10.j(eq0.a)).a.c, oq5Var10, 384, 0);
                } else {
                    oq5Var10.S();
                }
                break;
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var11;
                if (oq5Var11.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_full_screen_on_24, 0, oq5Var11), null, null, ((dq0) oq5Var11.j(eq0.a)).a.a, oq5Var11, 48, 4);
                } else {
                    oq5Var11.S();
                }
                break;
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    w8u.d(l6u.a, prm.a, null, oq5Var12, 6, 4);
                } else {
                    oq5Var12.S();
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var13;
                if (oq5Var13.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    m4u m4uVar = (m4u) CollectionsKt.Q(l6u.a);
                    m6u m6uVar = l6u.b;
                    Object K4 = oq5Var13.K();
                    if (K4 == kjnVar) {
                        K4 = new to5(25);
                        oq5Var13.k0(K4);
                    }
                    Function0 function02 = (Function0) K4;
                    Object K5 = oq5Var13.K();
                    if (K5 == kjnVar) {
                        K5 = new to5(26);
                        oq5Var13.k0(K5);
                    }
                    Function0 function03 = (Function0) K5;
                    Object K6 = oq5Var13.K();
                    if (K6 == kjnVar) {
                        K6 = new to5(27);
                        oq5Var13.k0(K6);
                    }
                    Function0 function04 = (Function0) K6;
                    Object K7 = oq5Var13.K();
                    if (K7 == kjnVar) {
                        K7 = new to5(28);
                        oq5Var13.k0(K7);
                    }
                    Function0 function05 = (Function0) K7;
                    Object K8 = oq5Var13.K();
                    if (K8 == kjnVar) {
                        K8 = new to5(29);
                        oq5Var13.k0(K8);
                    }
                    Function0 function06 = (Function0) K8;
                    Object K9 = oq5Var13.K();
                    if (K9 == kjnVar) {
                        K9 = new uo5(7);
                        oq5Var13.k0(K9);
                    }
                    Function1 function1 = (Function1) K9;
                    Object K10 = oq5Var13.K();
                    if (K10 == kjnVar) {
                        K10 = new cp5(0);
                        oq5Var13.k0(K10);
                    }
                    Function0 function07 = (Function0) K10;
                    Object K11 = oq5Var13.K();
                    if (K11 == kjnVar) {
                        K11 = new cp5(1);
                        oq5Var13.k0(K11);
                    }
                    Function0 function08 = (Function0) K11;
                    Object K12 = oq5Var13.K();
                    if (K12 == kjnVar) {
                        K12 = new cp5(2);
                        oq5Var13.k0(K12);
                    }
                    Function0 function09 = (Function0) K12;
                    Object K13 = oq5Var13.K();
                    if (K13 == kjnVar) {
                        K13 = new cp5(3);
                        oq5Var13.k0(K13);
                    }
                    w8u.c(m4uVar, null, m6uVar, false, true, true, true, function02, function03, function04, function05, function06, function1, function07, function08, null, function09, (Function0) K13, oq5Var13, 920350128, 14380470);
                } else {
                    oq5Var13.S();
                }
                break;
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    m6u m6uVar2 = l6u.b;
                    Object K14 = oq5Var14.K();
                    if (K14 == kjnVar) {
                        K14 = new to5(21);
                        oq5Var14.k0(K14);
                    }
                    Function0 function010 = (Function0) K14;
                    Object K15 = oq5Var14.K();
                    if (K15 == kjnVar) {
                        K15 = new to5(22);
                        oq5Var14.k0(K15);
                    }
                    Function0 function011 = (Function0) K15;
                    Object K16 = oq5Var14.K();
                    if (K16 == kjnVar) {
                        K16 = new uo5(6);
                        oq5Var14.k0(K16);
                    }
                    Function1 function12 = (Function1) K16;
                    Object K17 = oq5Var14.K();
                    if (K17 == kjnVar) {
                        K17 = new to5(23);
                        oq5Var14.k0(K17);
                    }
                    Function0 function012 = (Function0) K17;
                    Object K18 = oq5Var14.K();
                    if (K18 == kjnVar) {
                        K18 = new to5(24);
                        oq5Var14.k0(K18);
                    }
                    w8u.a(false, true, true, m6uVar2, function010, function011, function12, function012, (Function0) K18, oq5Var14, 115043766);
                    w8u.b(new z9u(0, "", "", "", "", "", "0:00", jzb.c, true, null), true, true, m6uVar2, null, oq5Var14, 3504);
                } else {
                    oq5Var14.S();
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var15;
                if (oq5Var15.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    m6u m6uVar3 = l6u.b;
                    Object K19 = oq5Var15.K();
                    if (K19 == kjnVar) {
                        K19 = new cp5(4);
                        oq5Var15.k0(K19);
                    }
                    Function0 function013 = (Function0) K19;
                    Object K20 = oq5Var15.K();
                    if (K20 == kjnVar) {
                        K20 = new cp5(5);
                        oq5Var15.k0(K20);
                    }
                    Function0 function014 = (Function0) K20;
                    Object K21 = oq5Var15.K();
                    if (K21 == kjnVar) {
                        K21 = new uo5(8);
                        oq5Var15.k0(K21);
                    }
                    Function1 function13 = (Function1) K21;
                    Object K22 = oq5Var15.K();
                    if (K22 == kjnVar) {
                        K22 = new cp5(6);
                        oq5Var15.k0(K22);
                    }
                    Function0 function015 = (Function0) K22;
                    Object K23 = oq5Var15.K();
                    if (K23 == kjnVar) {
                        K23 = new to5(20);
                        oq5Var15.k0(K23);
                    }
                    w8u.a(false, true, false, m6uVar3, function013, function014, function13, function015, (Function0) K23, oq5Var15, 115043766);
                    w8u.b(new z9u(0, "", "", "", "", "", "0:00", jzb.d, true, null), false, true, m6uVar3, null, oq5Var15, 3504);
                } else {
                    oq5Var15.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var16;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                irf.r(a0g.E(2131232992, 0, hq5Var16), null, d.m(vciVar, BuildConfig.API_LEVEL), null, null, 0.0f, null, hq5Var16, 432, 120);
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var17;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                q7g.u(0, hq5Var17, null, rvf.M(R.string.wave_for_two_already_exist_title, hq5Var17));
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var18;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                q7g.t(0, hq5Var18, null, rvf.M(R.string.wave_for_two_already_exist_subtitle, hq5Var18));
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var19;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                w4k E = a0g.E(2131232992, 0, hq5Var19);
                float[] y = bcx.y();
                bcx.H(y);
                u85 u85Var = new u85(new ColorMatrixColorFilter(y));
                u85Var.b = y;
                irf.r(E, null, d.m(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 12, 1), BuildConfig.API_LEVEL), null, null, 0.0f, u85Var, hq5Var19, 432, 56);
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var20;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                q7g.u(0, hq5Var20, null, rvf.M(R.string.wave_for_two_expired_title, hq5Var20));
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var21 = (oq5) hq5Var21;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        break;
                    }
                }
                q7g.t(0, hq5Var21, null, rvf.M(R.string.wave_for_two_expired_subtitle, hq5Var21));
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var22;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                q7g.a(0, 1, hq5Var22, null);
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var23 = (oq5) hq5Var23;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        break;
                    }
                }
                q7g.t(0, hq5Var23, null, rvf.M(R.string.wave_for_two_invitation_subtitle, hq5Var23));
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var24;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                q7g.a(0, 1, hq5Var24, null);
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var25;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                irf.r(a0g.E(2131232992, 0, hq5Var25), null, d.m(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 12, 1), BuildConfig.API_LEVEL), null, null, 0.0f, null, hq5Var25, 432, 120);
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var26;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                q7g.u(0, hq5Var26, null, rvf.M(R.string.wave_for_two_not_accepted_title, hq5Var26));
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var27 = (oq5) hq5Var27;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        break;
                    }
                }
                q7g.t(0, hq5Var27, null, rvf.M(R.string.wave_for_two_not_accepted_subtitle, hq5Var27));
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var28;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                q7g.a(0, 1, hq5Var28, null);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var29 = (oq5) hq5Var29;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        break;
                    }
                }
                q7g.u(0, hq5Var29, null, rvf.M(R.string.wave_for_two_groups_limit_title, hq5Var29));
            default:
                hq5 hq5Var30 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var30 = (oq5) hq5Var30;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        break;
                    }
                }
                q7g.t(0, hq5Var30, null, rvf.M(R.string.wave_for_two_groups_limit_subtitle, hq5Var30));
        }
        return Unit.a;
    }
}
