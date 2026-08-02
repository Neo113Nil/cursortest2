package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.action.k;
import com.yandex.plus.bdui.plus.action.r;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.s;
import com.yandex.plus.log.api.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class f6p implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6p(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mm6 mm6Var;
        irs irsVar;
        boolean z;
        String str;
        int i = 28;
        String str2 = null;
        int i2 = 18;
        switch (this.a) {
            case 0:
                zrj zrjVar = (zrj) this.b;
                Function1 function1 = (Function1) this.c;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    yci q = androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 16, 0.0f, 24, 5);
                    boolean f = oq5Var.f(function1) | oq5Var.f(zrjVar);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new l5b(function1, zrjVar, 1);
                        oq5Var.k0(K);
                    }
                    ocg.a(zrjVar, (Function0) K, q, oq5Var, 384);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                vci vciVar = vci.a;
                ppp pppVar = (ppp) this.b;
                mpp mppVar = (mpp) this.c;
                a aVar = (a) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(aVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (irv.h(oq5Var2)) {
                        oq5Var2.Z(-558481767);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-555640710);
                        eta.p(vciVar, 100, oq5Var2, false);
                    }
                    irf.r(a0g.E(2131231032, 0, oq5Var2), null, androidx.compose.ui.platform.a.a(d.m(vciVar, 140), "clear_memory_image"), null, null, 0.0f, null, oq5Var2, 432, 120);
                    float f2 = 24;
                    u1g.l(oq5Var2, d.e(vciVar, f2));
                    long j = ((opp) pppVar).a;
                    xcs.b(rvf.M(j > 0 ? R.string.clear_storage_description : R.string.clear_storage_empty_description, oq5Var2), androidx.compose.ui.platform.a.a(vciVar, "clear_memory_description"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 48, 0, 65016);
                    u1g.l(oq5Var2, d.e(vciVar, f2));
                    if (j > 0) {
                        oq5Var2.Z(-554200760);
                        oq5Var2.Z(2060333935);
                        String formatFileSize = Formatter.formatFileSize((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b), j);
                        String str3 = rvf.M(R.string.clear_memory_button, oq5Var2) + StringUtil.SPACE + formatFileSize;
                        oq5Var2.p(false);
                        boolean h = oq5Var2.h(mppVar);
                        Object K2 = oq5Var2.K();
                        if (h || K2 == gq5.a) {
                            K2 = new qbp(0, mppVar, mpp.class, "onClearMemoryClick", "onClearMemoryClick()V", 0, 5);
                            oq5Var2.k0(K2);
                        }
                        hdg.o(str3, (Function0) ((h9f) K2), androidx.compose.ui.platform.a.a(vciVar, "clear_memory_button"), 0.0f, oq5Var2, 384, 8);
                    } else {
                        oq5Var2.Z(-558481767);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                p53 p53Var = (p53) this.b;
                x8l x8lVar = (x8l) this.c;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    g0g.t(p53Var, (yci) x8lVar.invoke(oq5Var3, 0), oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                m53 m53Var = (m53) this.b;
                x8l x8lVar2 = (x8l) this.c;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    qgg.g(m53Var, (yci) x8lVar2.invoke(oq5Var4, 0), oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                j53 j53Var = (j53) this.b;
                x8l x8lVar3 = (x8l) this.c;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    pd.q(j53Var, (yci) x8lVar3.invoke(oq5Var5, 0), oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                vrp vrpVar = (vrp) this.b;
                lrp lrpVar = (lrp) this.c;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue6 & 17) == 16) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                Iterator it = vrpVar.a.iterator();
                while (it.hasNext()) {
                    trp.h((brp) it.next(), lrpVar, hq5Var6, 0);
                }
                return Unit.a;
            case 6:
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                t7g.g((wwp) this.b, (Function1) this.c, androidx.compose.foundation.layout.a.o(vci.a, 24, 0.0f, 2), (hq5) obj2, 384);
                return Unit.a;
            case 7:
                d85 d85Var = (d85) this.b;
                j5 j5Var = (j5) this.c;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(zknVar) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    oq5Var8.Z(1373575831);
                    d43 d43Var = d85Var != null ? new d43(d85Var.a, 5) : null;
                    w4k w4kVar = ((as1) k).a;
                    Integer num = (Integer) j5Var.c;
                    if (num == null) {
                        oq5Var8.Z(1373773176);
                    } else {
                        oq5Var8.Z(1373773177);
                        str2 = rvf.M(num.intValue(), oq5Var8);
                    }
                    oq5Var8.p(false);
                    irf.r(w4kVar, str2, null, (iz2) j5Var.b, (jd6) j5Var.a, 0.0f, d43Var, oq5Var8, 0, 36);
                    oq5Var8.p(false);
                } else if (Intrinsics.d(k, xr1.a) || (k instanceof zr1)) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    oq5Var9.Z(1374055556);
                    swf.e(0, 1, oq5Var9, null);
                    oq5Var9.p(false);
                } else {
                    if (!(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var7, 1429779115, false);
                    }
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    oq5Var10.Z(1374160646);
                    swf.d(qo6.k, gce.d, null, null, 0L, 0L, false, oq5Var10, 54, 124);
                    oq5Var10.p(false);
                }
                return Unit.a;
            case 8:
                ep4 ep4Var = (ep4) this.b;
                Function0 function0 = (Function0) this.c;
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var11 = (oq5) ((hq5) obj2);
                oq5Var11.Z(-1997794276);
                String M = rvf.M(R.string.overflow_menu_content_description, oq5Var11);
                boolean d = oq5Var11.d(ep4Var.ordinal()) | oq5Var11.f(M) | oq5Var11.f(function0);
                Object K3 = oq5Var11.K();
                if (d || K3 == gq5.a) {
                    K3 = new p3e(i, ep4Var, M, function0);
                    oq5Var11.k0(K3);
                }
                yci b = nfp.b(yciVar, false, (Function1) K3);
                oq5Var11.p(false);
                return b;
            case 9:
                ukd ukdVar = (ukd) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                hq5 hq5Var8 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((va5) obj).getClass();
                for (int i3 = 0; i3 < 2; i3++) {
                    y1g.l(o5g.A(new bxd(o38.a)), 1, 1, ild.C(753759013, new dv(i3, ukdVar, arrayList), hq5Var8), hq5Var8, 3072, 0);
                }
                return Unit.a;
            case 10:
                List list = (List) this.b;
                wn5 wn5Var = (wn5) this.c;
                c cVar = (c) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var9).f(cVar) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var12 = (oq5) hq5Var9;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                yci o = androidx.compose.foundation.layout.a.o(bfg.x(d.t(d.b(vci.a, 1.0f), cVar.d(), 0.0f, 2), bfg.C(hq5Var9), true, 12), 8, 0.0f, 2);
                nho a = lho.a(qx0.h, b2c.l, hq5Var9, 54);
                oq5 oq5Var13 = (oq5) hq5Var9;
                int i4 = oq5Var13.P;
                androidx.compose.runtime.internal.a l = oq5Var13.l();
                yci H = vnj.H(hq5Var9, o);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var13.d0();
                if (oq5Var13.O) {
                    oq5Var13.k(grbVar);
                } else {
                    oq5Var13.n0();
                }
                g0g.U(hq5Var9, a, wp5.f);
                g0g.U(hq5Var9, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var13, i4, kb5Var);
                }
                g0g.U(hq5Var9, H, wp5.d);
                oq5Var13.Z(580332540);
                int i5 = 0;
                for (Object obj4 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        u75.n();
                        throw null;
                    }
                    wn5Var.invoke(Integer.valueOf(i5), obj4, hq5Var9, 0);
                    i5 = i6;
                }
                oq5Var13.p(false);
                oq5Var13.p(true);
                return Unit.a;
            case 11:
                pu0 pu0Var = (pu0) this.b;
                wn5 wn5Var2 = (wn5) this.c;
                nls nlsVar = (nls) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                nlsVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var10).f(nlsVar) ? 4 : 2;
                }
                if ((intValue9 & 19) == 18) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(503331644, new k0r(i2, wn5Var2, nlsVar), hq5Var10), hq5Var10, 0, 4);
                return Unit.a;
            case 12:
                tao taoVar = (tao) this.b;
                pu0 pu0Var2 = (pu0) this.c;
                bci bciVar = (bci) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= (intValue10 & 8) == 0 ? ((oq5) hq5Var11).f(bciVar) : ((oq5) hq5Var11).h(bciVar) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var15 = (oq5) hq5Var11;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var16 = (oq5) hq5Var11;
                Context context = (Context) oq5Var16.j(AndroidCompositionLocals_androidKt.b);
                Object K4 = oq5Var16.K();
                kjn kjnVar = gq5.a;
                if (K4 == kjnVar) {
                    K4 = tlm.f(gld.R(g.a, oq5Var16), oq5Var16);
                }
                mm6 mm6Var2 = ((fs5) K4).a;
                Object K5 = oq5Var16.K();
                if (K5 == kjnVar) {
                    mqs mqsVar = (mqs) taoVar.a;
                    irs irsVar2 = (irs) taoVar.b;
                    qe3 qe3Var = (qe3) taoVar.c;
                    kxi kxiVar = (kxi) taoVar.d;
                    zhs zhsVar = new zhs(0, (sai) taoVar.e, sai.class, "hide", "hide()V", 0, 1);
                    mqsVar.getClass();
                    kxiVar.getClass();
                    context.getClass();
                    jrs jrsVar = new jrs(irsVar2.f, irsVar2.g, irsVar2.i, (qe3) irsVar2.n.getValue(), zhsVar);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String b2 = ((tnq) ((byb) qdcVar.C(I)).c(ern.a(tnq.class))).b();
                    if (!Intrinsics.d(b2, "on") && (!Intrinsics.d(b2, "on_without_9_android") || Build.VERSION.SDK_INT == 28)) {
                        mm6Var = mm6Var2;
                        irsVar = irsVar2;
                        z = false;
                    } else {
                        mm6Var = mm6Var2;
                        irsVar = irsVar2;
                        z = true;
                    }
                    K5 = new nrs(mqsVar, irsVar, qe3Var, jrsVar, kxiVar, context, mm6Var, z);
                    oq5Var16.k0(K5);
                }
                nrs nrsVar = (nrs) K5;
                aqi M2 = gld.M(nrsVar.h, hq5Var11);
                srs srsVar = (srs) M2.getValue();
                if (Intrinsics.d(srsVar, prs.a)) {
                    oq5Var16.Z(-464766516);
                    oq5Var16.p(false);
                } else {
                    if (!Intrinsics.d(srsVar, qrs.a) && !(srsVar instanceof rrs)) {
                        throw vz1.i(oq5Var16, -464768015, false);
                    }
                    oq5Var16.Z(-1522726465);
                    jf0.a(new qzm[0], pu0Var2, false, ild.C(-499939487, new t2n(27, bciVar, nrsVar, M2), oq5Var16), oq5Var16, 0, 4);
                    oq5Var16.p(false);
                }
                return Unit.a;
            case 13:
                xbb xbbVar = (xbb) this.b;
                mqs mqsVar2 = (mqs) this.c;
                c cVar2 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var12).f(cVar2) ? 4 : 2;
                }
                if ((intValue11 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var12;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar = xbbVar.d;
                boolean z2 = jzbVar != null;
                xme E = ox6.E(jzbVar, 0L, hq5Var12, 6);
                oq5 oq5Var18 = (oq5) hq5Var12;
                oq5Var18.Z(-1571803063);
                kn0 kn0Var = new kn0();
                kn0Var.d(mqsVar2.c);
                String str4 = mqsVar2.s;
                if (str4 == null) {
                    oq5Var18.Z(-1175978585);
                } else {
                    oq5Var18.Z(-1175978584);
                    kn0Var.a.append((char) 160);
                    int g = kn0Var.g(new c4r(((dq0) oq5Var18.j(eq0.a)).b.c, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                    try {
                        kn0Var.d(str4);
                    } finally {
                        kn0Var.f(g);
                    }
                }
                oq5Var18.p(false);
                mn0 h2 = kn0Var.h();
                oq5Var18.p(false);
                xv7.i(h2, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "track_bottom_sheet_dialog_header_title"), ((dq0) oq5Var18.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E), null, nu0.b(), z2 ? bow.k(cVar2, new xme[]{E}) : null, null, hq5Var12, 48, 134220848, 612344);
                return Unit.a;
            case 14:
                fjt fjtVar = (fjt) this.b;
                zpd zpdVar = (zpd) this.c;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((dsf) obj).getClass();
                oq5 oq5Var19 = (oq5) hq5Var13;
                if (oq5Var19.P(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ((djt) fjtVar).getClass();
                    qgg.b(true, zpdVar, null, oq5Var19, 0, 4);
                } else {
                    oq5Var19.S();
                }
                return Unit.a;
            case 15:
                d9g d9gVar = (d9g) this.b;
                fjt fjtVar2 = (fjt) this.c;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var20 = (oq5) hq5Var14;
                if (oq5Var20.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ((djt) fjtVar2).getClass();
                    bzf.r(d9gVar, null, oq5Var20, 0);
                } else {
                    oq5Var20.S();
                }
                return Unit.a;
            case 16:
                rru rruVar = (rru) this.b;
                Function0 function02 = (Function0) this.c;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue14 & 17) == 16) {
                    oq5 oq5Var21 = (oq5) hq5Var15;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                gdg.a(rruVar.a, function02, hq5Var15, 0);
                return Unit.a;
            case 17:
                sru sruVar = (sru) this.b;
                nru nruVar = (nru) this.c;
                hq5 hq5Var16 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue15 & 17) == 16) {
                    oq5 oq5Var22 = (oq5) hq5Var16;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                boolean z3 = sruVar.a;
                oq5 oq5Var23 = (oq5) hq5Var16;
                boolean h3 = oq5Var23.h(nruVar);
                Object K6 = oq5Var23.K();
                if (h3 || K6 == gq5.a) {
                    j6u j6uVar = new j6u(0, nruVar, nru.class, "onInviteClick", "onInviteClick()V", 0, 22);
                    oq5Var23.k0(j6uVar);
                    K6 = j6uVar;
                }
                gdg.a(z3, (Function0) ((h9f) K6), oq5Var23, 0);
                return Unit.a;
            case 18:
                u0q u0qVar = (u0q) obj;
                int intValue16 = ((Integer) obj3).intValue();
                u0qVar.getClass();
                zdg.i((dsu) this.b, (t) this.c, u0qVar, (hq5) obj2, (intValue16 << 6) & 896);
                return Unit.a;
            case 19:
                r4v r4vVar = (r4v) this.b;
                dav davVar = (dav) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str5 = (String) obj2;
                str5.getClass();
                ((String) obj3).getClass();
                r4vVar.getClass();
                exa a2 = r4vVar.a();
                cvo b3 = r4vVar.b();
                b3.getClass();
                a63 V = vq2.V(b3, new thj(pkb.SleepingAlice, "sleeping_alice", 1, 1, ""));
                int ordinal = davVar.c.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    str = "sleep_tech";
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    str = "sleeping_alice";
                }
                a2.b(booleanValue, str5, V, str);
                return Unit.a;
            case 20:
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                wdg.u((lwv) this.b, (fvf) this.c, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, 40, 7), (hq5) obj2, 384);
                return Unit.a;
            case 21:
                o oVar = (o) this.b;
                b bVar = (b) this.c;
                ((s) obj).getClass();
                ((Function0) obj2).getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new r(oVar, bVar);
            case 22:
                Context context2 = (Context) this.b;
                b bVar2 = (b) this.c;
                ((s) obj).getClass();
                ((Function0) obj2).getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new r(context2, bVar2);
            default:
                com.yandex.plus.bdui.plus.analytics.c cVar3 = (com.yandex.plus.bdui.plus.analytics.c) this.b;
                b bVar3 = (b) this.c;
                ((s) obj).getClass();
                ((Function0) obj2).getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                return new k(cVar3, bVar3);
        }
    }
}
