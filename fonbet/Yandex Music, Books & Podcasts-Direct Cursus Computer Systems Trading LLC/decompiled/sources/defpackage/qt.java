package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class qt implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qt(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r12)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj, Object obj2, Object obj3) {
        q0v q0vVar;
        List list = (List) this.c;
        q0v q0vVar2 = (q0v) this.d;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        int i = 1;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            two C = bfg.C(oq5Var);
            float d = cVar.d();
            float Q = ff7.Q(d, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.U(new fvr(Q, i, C, list));
                oq5Var.k0(K);
            }
            sdr sdrVar = (sdr) K;
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                q0vVar = q0vVar2;
            } else {
                q0vVar = q0vVar2;
            }
            ouj.x(i2, oq5Var, i2, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f = 28;
            u1g.l(oq5Var, d.e(vciVar, f));
            boolean z = this.b;
            u1g.n(z, oq5Var, 0);
            u1g.l(oq5Var, d.e(vciVar, f));
            yci x = bfg.x(d.d(d.e(vciVar, 200), 1.0f), C, false, 14);
            boolean f2 = oq5Var.f(list);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new h50(list, 9);
                oq5Var.k0(K2);
            }
            yci b = nfp.b(x, false, (Function1) K2);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(1785674474);
            int size = list.size();
            int i4 = 0;
            while (true) {
                int i5 = 20;
                if (i4 >= size) {
                    break;
                }
                yci r = d.r(vciVar, d);
                kfh d3 = ug3.d(b2c.f, false);
                int i6 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, r);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var5);
                }
                g0g.U(oq5Var, H3, wp5.d);
                String o = ouj.o(rvf.M(((rmv) list.get(i4)).b, oq5Var), ". ", rvf.M(R.string.widget_install_a11y_widget, oq5Var));
                w4k E = a0g.E(((rmv) list.get(i4)).a, 0, oq5Var);
                yci t = d.t(vciVar, 400, 0.0f, 2);
                boolean f3 = oq5Var.f(o) | oq5Var.d(i4);
                Object K3 = oq5Var.K();
                if (f3 || K3 == kjnVar) {
                    K3 = new v50(o, sdrVar, i4, i5);
                    oq5Var.k0(K3);
                }
                oq5 oq5Var2 = oq5Var;
                irf.r(E, null, nfp.a(t, (Function1) K3), null, null, 0.0f, null, oq5Var2, 48, 120);
                oq5Var2.p(true);
                i4++;
                vciVar = vciVar;
                kjnVar = kjnVar;
                oq5Var = oq5Var2;
            }
            oq5 oq5Var3 = oq5Var;
            kjn kjnVar2 = kjnVar;
            vci vciVar2 = vciVar;
            oq5Var3.p(false);
            oq5Var3.p(true);
            float f4 = 20;
            u1g.l(oq5Var3, d.e(vciVar2, f4));
            yci e = d.e(vciVar2, 18);
            int intValue2 = ((Number) sdrVar.getValue()).intValue();
            IntRange f5 = u75.f(list);
            int size2 = list.size();
            int size3 = list.size();
            jx7 jx7Var = (jx7) oq5Var3.j(es5.h);
            float n0 = jx7Var.n0(3);
            float n02 = jx7Var.n0(2);
            float n03 = jx7Var.n0(1);
            float n04 = jx7Var.n0(4);
            agr agrVar = eq0.a;
            m2k m2kVar = new m2k(n0, n02, n03, n04, ((dq0) oq5Var3.j(agrVar)).a.c, ((dq0) oq5Var3.j(agrVar)).a.a, size3);
            Object K4 = oq5Var3.K();
            if (K4 == kjnVar2) {
                K4 = new ulv(2);
                oq5Var3.k0(K4);
            }
            ivf.j(intValue2, f5, (Function1) K4, size2, m2kVar, e, oq5Var3, 196992, 0);
            u1g.l(oq5Var3, d.e(vciVar2, f4));
            q0v q0vVar3 = q0vVar;
            boolean f6 = oq5Var3.f(q0vVar3) | oq5Var3.f(list);
            Object K5 = oq5Var3.K();
            if (f6 || K5 == kjnVar2) {
                K5 = new ftr(15, q0vVar3, list, sdrVar);
                oq5Var3.k0(K5);
            }
            u1g.b(384, oq5Var3, d.g(vciVar2, 80, 0.0f, 2), (Function0) K5, z);
            oq5Var3.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v28, types: [wn5] */
    /* JADX WARN: Type inference failed for: r4v19, types: [yci] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float M;
        oq5 oq5Var;
        ?? b;
        float f;
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        boolean z = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                zpd zpdVar = (zpd) obj5;
                rab rabVar = (rab) obj4;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        oq5Var2.Z(-658809381);
                        M = j66.M(zpd.k, oq5Var2);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-658701718);
                        M = j66.M(zpdVar, oq5Var2);
                        oq5Var2.p(false);
                    }
                    yci e = d.e(vciVar, M);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i2 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, e);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var2, i2, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    j66.r(rabVar.a, androidx.compose.ui.platform.a.a(vciVar, "album_grid_item_title"), rabVar.e, zpdVar.a, oq5Var2, 48, 0);
                    float f2 = upd.a;
                    u1g.l(oq5Var2, d.e(vciVar, f2));
                    String str = rabVar.b;
                    agr agrVar = eq0.a;
                    long j = ((dq0) oq5Var2.j(agrVar)).b.b;
                    ges a2 = upd.a();
                    yci a3 = androidx.compose.ui.platform.a.a(vciVar, "subtitle1");
                    int i3 = zpdVar.b;
                    xv7.j(str, a3, j, 0L, 0L, 0, 0L, 2, false, i3, i3, null, a2, oq5Var2, 48, 48, 38904);
                    if (zpdVar.c != 0) {
                        oq5Var2.Z(-1787590058);
                        u1g.l(oq5Var2, d.e(vciVar, f2));
                        String str2 = rabVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        long j2 = ((dq0) oq5Var2.j(agrVar)).b.b;
                        ges a4 = upd.a();
                        yci a5 = androidx.compose.ui.platform.a.a(vciVar, "subtitle2");
                        zpd zpdVar2 = zpd.d;
                        xv7.j(str3, a5, j2, 0L, 0L, 0, 0L, 2, false, 1, 1, null, a4, oq5Var2, 48, 48, 38904);
                    } else {
                        oq5Var2.Z(-1791539892);
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                q32 q32Var = (q32) obj5;
                fvf fvfVar = (fvf) obj4;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    leu.c(q32Var, fvfVar, o0kVar, this.b, oq5Var3, (intValue2 << 6) & 896);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 2:
                q32 q32Var2 = (q32) obj5;
                w32 w32Var = (w32) obj4;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    leu.x(q32Var2, (v32) w32Var, z, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                c cVar = (c) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(cVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                xme x = ox6.x(str4, hq5Var4, 3);
                mn0 mn0Var = new mn0(6, str5, (ArrayList) null);
                float f3 = r43.a;
                h6g h6gVar = h6g.c;
                xv7.i(mn0Var, androidx.compose.ui.platform.a.a(vciVar, "content_heading_title"), ((dq0) ((oq5) hq5Var4).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 2, 0, bow.l(x), null, r43.b(), z ? bow.k(cVar, new xme[]{x}) : null, null, hq5Var4, 48, 134220800, 614392);
                return Unit.a;
            case 4:
                String str6 = (String) obj5;
                Function0 function0 = (Function0) obj4;
                uvd uvdVar = (uvd) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                uvdVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= (intValue5 & 8) == 0 ? ((oq5) hq5Var5).f(uvdVar) : ((oq5) hq5Var5).h(uvdVar) ? 4 : 2;
                }
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ta5 a6 = sa5.a(qx0.c, b2c.o, oq5Var6, 48);
                    int i4 = oq5Var6.P;
                    a l2 = oq5Var6.l();
                    yci H2 = vnj.H(oq5Var6, vciVar);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var6.d0();
                    if (oq5Var6.O) {
                        oq5Var6.k(grbVar2);
                    } else {
                        oq5Var6.n0();
                    }
                    g0g.U(oq5Var6, a6, wp5.f);
                    g0g.U(oq5Var6, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var6, i4, kb5Var2);
                    }
                    g0g.U(oq5Var6, H2, wp5.d);
                    if (z) {
                        oq5Var6.Z(1890016476);
                        u1g.l(oq5Var6, d.e(vciVar, 4));
                        gae.b(a0g.E(R.drawable.ic_logo_yandex_books, 0, oq5Var6), null, d.e(vciVar, 16), 0L, oq5Var6, 432, 8);
                        oq5Var = oq5Var6;
                        eta.p(vciVar, 8, oq5Var, false);
                    } else {
                        oq5Var = oq5Var6;
                        oq5Var.Z(1888500049);
                        oq5Var.p(false);
                    }
                    bkp.R(uvdVar, str6, function0, null, null, oq5Var, intValue5 & 14, 12);
                    oq5Var.p(true);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 5:
                String str7 = (String) obj5;
                lzs lzsVar = (lzs) obj4;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(dh3Var) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (!oq5Var7.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    oq5Var7.S();
                } else if (z) {
                    oq5Var7.Z(-1192013338);
                    qo6 qo6Var = qo6.a;
                    yci b2 = dh3Var.b(vciVar);
                    lzs lzsVar2 = lzs.a;
                    irf.y(str7, qo6Var, b2, lzsVar != lzsVar2, false, null, null, null, oq5Var7, 48, 240);
                    if (lzsVar != lzsVar2) {
                        oq5Var7.Z(-1191679344);
                        orl.a(0, 6, 0L, oq5Var7, null, lzsVar == lzs.b);
                    } else {
                        oq5Var7.Z(-1201575536);
                    }
                    oq5Var7.p(false);
                    oq5Var7.p(false);
                } else {
                    oq5Var7.Z(-1191500288);
                    swf.d(qo6.a, gce.d, null, null, 0L, 0L, false, oq5Var7, 54, 124);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 6:
                jzb jzbVar = (jzb) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                c cVar2 = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(cVar2) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                xme Q = ox6.Q(0L, hq5Var7, 3);
                xme xmeVar = new xme("spacer", v7g.z(5), v7g.z(3), nt0.g);
                xme E = ox6.E(jzbVar, 0L, hq5Var7, 6);
                kn0 kn0Var = new kn0();
                if (z) {
                    u2x.s(kn0Var, "videoicon");
                    u2x.s(kn0Var, "spacer");
                }
                kn0Var.c(charSequence);
                xv7.i(kn0Var.h(), null, ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(Q, xmeVar, E), null, null, bow.k(cVar2, new xme[]{E}), null, hq5Var7, 0, 134220848, 743418);
                return Unit.a;
            case 7:
                d85 d85Var = (d85) obj5;
                qo6 qo6Var2 = (qo6) obj4;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(zknVar) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    oq5Var10.Z(-1501547279);
                    irf.r(((as1) k).a, null, (d85Var == null || (b = androidx.compose.foundation.a.b(vciVar, d85Var.a, vnj.i)) == 0) ? vciVar : b, zknVar.d, zknVar.e, 0.0f, zknVar.g, oq5Var10, 48, 32);
                    oq5Var10.p(false);
                } else if (Intrinsics.d(k, xr1.a) || (k instanceof zr1)) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    oq5Var11.Z(-1501085813);
                    swf.e(0, 1, oq5Var11, null);
                    oq5Var11.p(false);
                } else {
                    if (!(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var8, -2126650064, false);
                    }
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    oq5Var12.Z(-1500962898);
                    swf.d(qo6Var2, gce.d, null, null, 0L, 0L, this.b, oq5Var12, 48, 60);
                    oq5Var12.p(false);
                }
                return Unit.a;
            case 8:
                Function0 function02 = (Function0) obj5;
                wn5 wn5Var = (wn5) obj4;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    bfg.f(this.b, function02, o0kVar2, null, false, ild.C(-982322116, new ngf(wn5Var, o0kVar2), oq5Var13), oq5Var13, ((intValue9 << 6) & 896) | 196608, 24);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 9:
                ru ruVar = (ru) obj5;
                xme xmeVar2 = (xme) obj4;
                c cVar3 = (c) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var10).f(cVar3) ? 4 : 2;
                }
                oq5 oq5Var14 = (oq5) hq5Var10;
                if (oq5Var14.P(intValue10 & 1, (intValue10 & 19) != 18)) {
                    xv7.i(new mn0(ruVar.b), d.d(androidx.compose.ui.platform.a.a(vciVar, "title"), 1.0f), ((dq0) oq5Var14.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar2), null, nu0.j(), z ? bow.k(cVar3, new xme[]{xmeVar2}) : null, null, oq5Var14, 48, 134220848, 612344);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 10:
                l5j l5jVar = (l5j) obj5;
                xme xmeVar3 = (xme) obj4;
                c cVar4 = (c) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                cVar4.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var11).f(cVar4) ? 4 : 2;
                }
                oq5 oq5Var15 = (oq5) hq5Var11;
                if (oq5Var15.P(intValue11 & 1, (intValue11 & 19) != 18)) {
                    xv7.i(new mn0(l5jVar.c.c), null, ((dq0) oq5Var15.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, bow.l(xmeVar3), null, nu0.j(), z ? bow.k(cVar4, new xme[]{xmeVar3}) : null, wct.p(cVar4), oq5Var15, 0, 134220848, 88058);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 11:
                nkm nkmVar = (nkm) obj5;
                xme xmeVar4 = (xme) obj4;
                c cVar5 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                cVar5.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((oq5) hq5Var12).f(cVar5) ? 4 : 2;
                }
                oq5 oq5Var16 = (oq5) hq5Var12;
                if (oq5Var16.P(intValue12 & 1, (intValue12 & 19) != 18)) {
                    xv7.i(new mn0(nkmVar.b), d.d(androidx.compose.ui.platform.a.a(vciVar, "title"), 1.0f), ((dq0) oq5Var16.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar4), null, nu0.j(), z ? bow.k(cVar5, new xme[]{xmeVar4}) : null, null, oq5Var16, 48, 134220848, 612344);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 12:
                lt ltVar = (lt) obj5;
                xme xmeVar5 = (xme) obj4;
                c cVar6 = (c) obj;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                cVar6.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((oq5) hq5Var13).f(cVar6) ? 4 : 2;
                }
                if ((intValue13 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var13;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                xv7.i(new mn0(6, ltVar.c, (ArrayList) null), b.c(androidx.compose.ui.platform.a.a(vciVar, "promo_album_title"), "explicit", Boolean.TRUE), ((dq0) ((oq5) hq5Var13).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar5), null, nu0.j(), z ? bow.k(cVar6, new xme[]{xmeVar5}) : null, wct.p(cVar6), hq5Var13, 48, 134220848, 88056);
                return Unit.a;
            case 13:
                ltu ltuVar = (ltu) obj5;
                ?? r11 = (wn5) obj4;
                c cVar7 = (c) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                cVar7.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var14).f(cVar7) ? 4 : 2;
                }
                if ((intValue14 & 19) == 18) {
                    oq5 oq5Var18 = (oq5) hq5Var14;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                ta5 a7 = sa5.a(qx0.c, b2c.n, hq5Var14, 0);
                oq5 oq5Var19 = (oq5) hq5Var14;
                int i5 = oq5Var19.P;
                a l3 = oq5Var19.l();
                yci H3 = vnj.H(hq5Var14, vciVar);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var19.d0();
                if (oq5Var19.O) {
                    oq5Var19.k(grbVar3);
                } else {
                    oq5Var19.n0();
                }
                g0g.U(hq5Var14, a7, wp5.f);
                g0g.U(hq5Var14, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var19, i5, kb5Var3);
                }
                g0g.U(hq5Var14, H3, wp5.d);
                if (z) {
                    oq5Var19.Z(116532397);
                    gtu gtuVar = (gtu) oq5Var19.j(htu.a);
                    float d = cVar7.d();
                    gtuVar.getClass();
                    f = d * 0.33333334f;
                    oq5Var19.p(false);
                } else {
                    oq5Var19.Z(116715576);
                    oq5Var19.p(false);
                    f = 0;
                }
                float f4 = f;
                boolean f5 = oq5Var19.f(ltuVar);
                Object K = oq5Var19.K();
                if (f5 || K == kjnVar) {
                    K = new m1v(ltuVar.u, ltuVar.p, ltuVar.g, ltuVar.o, new qzc(23, ltuVar.a), ltuVar.c, ltuVar.l, ltuVar.x);
                    oq5Var19.k0(K);
                }
                h4a.l((m1v) K, f8g.g0(vciVar, 1.0f), f4, hq5Var14, 48, 0);
                u1g.l(hq5Var14, d.e(vciVar, 12));
                r11.invoke(hq5Var14, 0);
                oq5Var19.p(true);
                return Unit.a;
            case 14:
                ltu ltuVar2 = (ltu) obj5;
                ab0 ab0Var = (ab0) obj4;
                c4v c4vVar = (c4v) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                c4vVar.getClass();
                boolean equals = c4vVar.equals(a4v.a);
                boolean z2 = this.b;
                if (equals) {
                    oq5 oq5Var20 = (oq5) hq5Var15;
                    oq5Var20.Z(963916808);
                    swf.s(ltuVar2, z2, oq5Var20, 0);
                    oq5Var20.p(false);
                } else if (c4vVar instanceof b4v) {
                    oq5 oq5Var21 = (oq5) hq5Var15;
                    oq5Var21.Z(963926311);
                    swf.t(ltuVar2, (b4v) c4vVar, ab0Var, z2, oq5Var21, (intValue15 << 3) & 112);
                    oq5Var21.p(false);
                } else {
                    if (!(c4vVar instanceof z3v)) {
                        throw vz1.i((oq5) hq5Var15, 963914204, false);
                    }
                    oq5 oq5Var22 = (oq5) hq5Var15;
                    oq5Var22.Z(963940590);
                    swf.r(ltuVar2, ((z3v) c4vVar).a, z2, oq5Var22, 0);
                    oq5Var22.p(false);
                }
                return Unit.a;
            case 15:
                return a(obj, obj2, obj3);
            default:
                yci yciVar = (yci) obj5;
                cqi cqiVar = (cqi) obj4;
                hq5 hq5Var16 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
                locales.getClass();
                int i6 = Intrinsics.d(locales.isEmpty() ? null : locales.get(0).getLanguage(), new Locale("ru").getLanguage()) ? z ? R.raw.logo_yandex_animation_ru_dark : R.raw.logo_yandex_animation_ru_light : z ? R.raw.logo_yandex_animation_en_dark : R.raw.logo_yandex_animation_en_light;
                oq5 oq5Var23 = (oq5) hq5Var16;
                boolean h = oq5Var23.h(cqiVar);
                Object K2 = oq5Var23.K();
                if (h || K2 == kjnVar) {
                    K2 = new dxv(28, cqiVar);
                    oq5Var23.k0(K2);
                }
                com.yandex.passport.internal.ui.a.g(i6, yciVar, (Function0) K2, 0, oq5Var23, 3072, 0);
                return Unit.a;
        }
    }

    public /* synthetic */ qt(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ qt(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
