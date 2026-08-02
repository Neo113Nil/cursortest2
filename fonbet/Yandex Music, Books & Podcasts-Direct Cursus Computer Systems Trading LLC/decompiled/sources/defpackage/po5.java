package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import com.yandex.pulse.metrics.o;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class po5 implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ po5(int i) {
        this.a = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    szf.f(0, oq5Var);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    szf.f(0, oq5Var2);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                yci yciVar = (yci) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                yciVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(yciVar) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                pd.g(intValue3 & 14, 0, hq5Var3, yciVar);
            case 3:
                w4k w4kVar = (w4k) obj;
                int intValue4 = ((Integer) obj3).intValue();
                w4kVar.getClass();
                h1b h1bVar = hd6.b;
                iz2 iz2Var = b2c.f;
                vci vciVar = vci.a;
                oq5 oq5Var4 = (oq5) ((hq5) obj2);
                Object K = oq5Var4.K();
                if (K == gq5.a) {
                    K = new z35(26);
                    oq5Var4.k0(K);
                }
                irf.r(w4kVar, null, a.b(vciVar, (Function1) K), iz2Var, h1bVar, 0.0f, null, oq5Var4, (intValue4 & 14) | 27696, 96);
                break;
            case 4:
                c cVar = (c) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var4).f(cVar) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                vci vciVar2 = vci.a;
                yci u = xp3.u(d.m(vciVar2, Math.min(cVar.c(), cVar.d())), ugo.a);
                long j = ((w3v) ((oq5) hq5Var4).j(x3v.a)).b.c;
                float f = y9l.a;
                u1g.l(hq5Var4, u.f(a.b(vciVar2, new x9l(0, j, d85.m))));
            case 5:
                vgq vgqVar = (vgq) obj;
                int intValue6 = ((Integer) obj3).intValue();
                vgqVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(s14.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ywf.g(vgqVar, (s14) qdcVar.C(I), null, (hq5) obj2, intValue6 & 14);
                break;
            case 6:
                sub subVar = (sub) obj;
                int intValue7 = ((Integer) obj3).intValue();
                subVar.getClass();
                sj2.g(subVar, null, (hq5) obj2, intValue7 & 14);
                break;
            case 7:
                sub subVar2 = (sub) obj;
                int intValue8 = ((Integer) obj3).intValue();
                subVar2.getClass();
                sj2.g(subVar2, null, (hq5) obj2, intValue8 & 14);
                break;
            case 8:
                hq5 hq5Var5 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue9 & 1, (intValue9 & 17) != 16)) {
                    u1g.l(oq5Var6, d.e(vci.a, 24));
                } else {
                    oq5Var6.S();
                }
                break;
            case 9:
                hq5 hq5Var6 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue10 & 1, (intValue10 & 17) != 16)) {
                    y2x.f(rvf.M(R.string.similar_playlists, oq5Var7), androidx.compose.ui.platform.a.a(vci.a, "similar_playlist_title"), 0, null, null, oq5Var7, 48, 28);
                } else {
                    oq5Var7.S();
                }
                break;
            case 10:
                hq5 hq5Var7 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (oq5Var8.P(intValue11 & 1, (intValue11 & 17) != 16)) {
                    y2x.f(rvf.M(R.string.popular_episodes, oq5Var8), null, 0, null, t9b.a(14, 24), oq5Var8, 0, 14);
                } else {
                    oq5Var8.S();
                }
                break;
            case 11:
                hq5 hq5Var8 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue12 & 1, (intValue12 & 17) != 16)) {
                    xv7.k(d.e(d.d(vci.a, 1.0f), 16), ((dq0) oq5Var9.j(eq0.a)).c.a, 0.0f, 0.0f, oq5Var9, 6, 12);
                } else {
                    oq5Var9.S();
                }
                break;
            case 12:
                hq5 hq5Var9 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (oq5Var10.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    gae.b(a0g.E(R.drawable.ic_close_32, 0, oq5Var10), null, null, 0L, oq5Var10, 48, 12);
                } else {
                    oq5Var10.S();
                }
                break;
            case 13:
                hq5 hq5Var10 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var11 = (oq5) hq5Var10;
                if (oq5Var11.P(intValue14 & 1, (intValue14 & 17) != 16)) {
                    xv7.j(rvf.M(R.string.permissions_microphone_not_now, oq5Var11), null, 0L, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var11, 0, 0, 65534);
                } else {
                    oq5Var11.S();
                }
                break;
            case 14:
                hq5 hq5Var11 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var12 = (oq5) hq5Var11;
                if (oq5Var12.P(intValue15 & 1, (intValue15 & 17) != 16)) {
                    xv7.j(rvf.M(R.string.permissions_notifications_not_now, oq5Var12), null, 0L, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var12, 0, 0, 65534);
                } else {
                    oq5Var12.S();
                }
                break;
            case 15:
                hq5 hq5Var12 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var13 = (oq5) hq5Var12;
                if (oq5Var13.P(intValue16 & 1, (intValue16 & 17) != 16)) {
                    String upperCase = rvf.M(R.string.delete_button, oq5Var13).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    xcs.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var13, 0, 0, 131070);
                } else {
                    oq5Var13.S();
                }
                break;
            case 16:
                hq5 hq5Var13 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var13;
                if (oq5Var14.P(intValue17 & 1, (intValue17 & 17) != 16)) {
                    String upperCase2 = rvf.M(R.string.cancel_text, oq5Var14).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    xcs.b(upperCase2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var14, 0, 0, 131070);
                } else {
                    oq5Var14.S();
                }
                break;
            case 17:
                hq5 hq5Var14 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((List) obj).getClass();
                if ((intValue18 & 17) == 16) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                    }
                }
                break;
            case 18:
                hq5 hq5Var15 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var16 = (oq5) hq5Var15;
                if (oq5Var16.P(intValue19 & 1, (intValue19 & 17) != 16)) {
                    u1g.l(oq5Var16, d.e(vci.a, 16));
                } else {
                    oq5Var16.S();
                }
                break;
            case 19:
                hq5 hq5Var16 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var17 = (oq5) hq5Var16;
                if (oq5Var17.P(intValue20 & 1, (intValue20 & 17) != 16)) {
                    u1g.l(oq5Var17, d.e(vci.a, 64));
                } else {
                    oq5Var17.S();
                }
                break;
            case 20:
                hq5 hq5Var17 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                oq5 oq5Var18 = (oq5) hq5Var17;
                if (oq5Var18.P(intValue21 & 1, (intValue21 & 17) != 16)) {
                    qgg.b(true, zpd.k, null, oq5Var18, 54, 4);
                } else {
                    oq5Var18.S();
                }
                break;
            case 21:
                hq5 hq5Var18 = (hq5) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var19 = (oq5) hq5Var18;
                if (!oq5Var19.P(intValue22 & 1, (intValue22 & 17) != 16)) {
                    oq5Var19.S();
                }
                break;
            case 22:
                hq5 hq5Var19 = (hq5) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var20 = (oq5) hq5Var19;
                if (!oq5Var20.P(intValue23 & 1, (intValue23 & 17) != 16)) {
                    oq5Var20.S();
                }
                break;
            case 23:
                hq5 hq5Var20 = (hq5) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var21 = (oq5) hq5Var20;
                if (oq5Var21.P(intValue24 & 1, (intValue24 & 17) != 16)) {
                    u1g.l(oq5Var21, d.e(vci.a, 64));
                } else {
                    oq5Var21.S();
                }
                break;
            case 24:
                hq5 hq5Var21 = (hq5) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((List) obj).getClass();
                if ((intValue25 & 17) == 16) {
                    oq5 oq5Var22 = (oq5) hq5Var21;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                    }
                }
                break;
            case 25:
                hq5 hq5Var22 = (hq5) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((List) obj).getClass();
                oq5 oq5Var23 = (oq5) hq5Var22;
                if (!oq5Var23.P(intValue26 & 1, (intValue26 & 17) != 16)) {
                    oq5Var23.S();
                }
                break;
            case 26:
                hq5 hq5Var23 = (hq5) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue27 & 17) == 16) {
                    oq5 oq5Var24 = (oq5) hq5Var23;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_share_32, 0, hq5Var23), null, null, d85.f, hq5Var23, 3120, 4);
            case 27:
                hq5 hq5Var24 = (hq5) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue28 & 17) == 16) {
                    oq5 oq5Var25 = (oq5) hq5Var24;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_play_32, 0, hq5Var24), null, null, 0L, hq5Var24, 48, 12);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var25 = (hq5) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue29 & 17) == 16) {
                    oq5 oq5Var26 = (oq5) hq5Var25;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_like_32, 0, hq5Var25), null, null, d85.f, hq5Var25, 3120, 4);
            default:
                ugs ugsVar = (ugs) obj;
                hq5 hq5Var26 = (hq5) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ugsVar.getClass();
                if ((intValue30 & 6) == 0) {
                    intValue30 |= ((oq5) hq5Var26).f(ugsVar) ? 4 : 2;
                }
                oq5 oq5Var27 = (oq5) hq5Var26;
                if (oq5Var27.P(intValue30 & 1, (intValue30 & 19) != 18)) {
                    avf.b(ugsVar, oq5Var27, intValue30 & 14);
                } else {
                    oq5Var27.S();
                }
                break;
        }
        return Unit.a;
    }
}
