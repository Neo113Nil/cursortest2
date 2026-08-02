package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class mf3 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ mf3(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vci vciVar = vci.a;
        String str = this.b;
        switch (i) {
            case 0:
                zb6 zb6Var = (zb6) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                zb6Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(zb6Var) : ((oq5) hq5Var).h(zb6Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                zb6Var.a = str;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                n7w.k(0, hq5Var2, null, rvf.M(R.string.concert_info_genre_title, hq5Var2), str);
            case 2:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                n7w.k(0, hq5Var3, null, rvf.M(R.string.concert_info_age_title, hq5Var3), str);
            case 3:
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue4 & 17) == 16) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                n7w.k(0, hq5Var4, null, rvf.M(R.string.concert_info_source_title, hq5Var4), str);
            case 4:
                hq5 hq5Var5 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                long b = d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14);
                ges j = nu0.j();
                yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -ff7.P(v7g.z(1), hq5Var5), 1), 0.0f, 0.0f, doi.a, 0.0f, 11);
                oq5 oq5Var5 = (oq5) hq5Var5;
                Object K = oq5Var5.K();
                if (K == gq5.a) {
                    K = new p1i(27);
                    oq5Var5.k0(K);
                }
                xcs.b(this.b, nfp.a(q, (Function1) K), b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, oq5Var5, 384, 0, 65528);
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xv7.j(this.b, androidx.compose.ui.platform.a.a(d.x(androidx.compose.foundation.layout.a.m(vciVar, 24), b2c.f, 2), "my_shelf_promo_placeholder"), ((dq0) oq5Var6.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var6, 48, 0, 65272);
                } else {
                    oq5Var6.S();
                }
                break;
            case 6:
                hq5 hq5Var7 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue6 & 17) == 16) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.b(this.b, androidx.compose.foundation.layout.a.o(vciVar, mu0.e, 0.0f, 2), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var7, 48, 3120, 55292);
            case 7:
                hq5 hq5Var8 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue7 & 17) == 16) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                xcs.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, hq5Var8, 0, 3120, 120830);
            case 8:
                hq5 hq5Var9 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    xcs.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, oq5Var9, 0, 3120, 120830);
                } else {
                    oq5Var9.S();
                }
                break;
            case 9:
                hq5 hq5Var10 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue9 & 17) == 16) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                cb0.f(str, hq5Var10, 0);
            case 10:
                hq5 hq5Var11 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue10 & 17) == 16) {
                    oq5 oq5Var11 = (oq5) hq5Var11;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                cb0.f(str, hq5Var11, 0);
            case 11:
                hq5 hq5Var12 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((dsf) obj).getClass();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue11 & 1, (intValue11 & 17) != 16)) {
                    String M = rvf.M(R.string.expand_more, oq5Var12);
                    ges j2 = nu0.j();
                    agr agrVar = eq0.a;
                    p0q.a(this.b, j2, ((dq0) oq5Var12.j(agrVar)).b.a, ((dq0) oq5Var12.j(agrVar)).b.d, M, M, null, oq5Var12, 12582960, 256);
                } else {
                    oq5Var12.S();
                }
                break;
            case 12:
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((oq5) hq5Var13).f(dh3Var) ? 4 : 2;
                }
                if ((intValue12 & 19) == 18) {
                    oq5 oq5Var13 = (oq5) hq5Var13;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                edo.a(dh3Var, str, hq5Var13, intValue12 & 14);
            case 13:
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((dsf) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ixf.j(str, oq5Var14, 0);
                    u1g.l(oq5Var14, d.e(vciVar, 24));
                } else {
                    oq5Var14.S();
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var15;
                if (oq5Var15.P(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ixf.j(str, oq5Var15, 0);
                    u1g.l(oq5Var15, d.e(vciVar, 24));
                } else {
                    oq5Var15.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue15 & 17) == 16) {
                    oq5 oq5Var16 = (oq5) hq5Var16;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                wcs.b(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) ((oq5) hq5Var16).j(vdt.a)).o, hq5Var16, 0, 0, 65534);
            case 16:
                hq5 hq5Var17 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue16 & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var17;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                wcs.b(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) ((oq5) hq5Var17).j(vdt.a)).o, hq5Var17, 0, 0, 65534);
            default:
                hq5 hq5Var18 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue17 & 17) == 16) {
                    oq5 oq5Var18 = (oq5) hq5Var18;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                oq5 oq5Var19 = (oq5) hq5Var18;
                wcs.b(this.b, null, ((i95) oq5Var19.j(j95.a)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var19.j(vdt.a)).k, hq5Var18, 0, 0, 65530);
        }
        return Unit.a;
    }
}
