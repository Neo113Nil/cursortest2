package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class gvl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gvl(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = 23;
        boolean z = true;
        switch (this.a) {
            case 0:
                bci bciVar = (bci) this.b;
                gy7 gy7Var = (gy7) this.c;
                jvl jvlVar = (jvl) this.d;
                sai saiVar = (sai) this.e;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(-1259534089, new vtb(15, gy7Var, jvlVar, saiVar), hq5Var), hq5Var, 4096, 4087);
            case 1:
                ((Integer) obj2).getClass();
                bzf.e((fvf) this.b, (ArrayList) this.c, (eha) this.d, (yci) this.e, (hq5) obj, rvf.R(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a0g.k((qxl) this.b, (jab) this.c, (qzl) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 3:
                qzl qzlVar = (qzl) this.b;
                yxl yxlVar = (yxl) this.c;
                jab jabVar = (jab) this.d;
                u0s u0sVar = (u0s) this.e;
                ((Integer) obj2).getClass();
                oq5 oq5Var2 = (oq5) ((hq5) obj);
                oq5Var2.Z(-680582864);
                owu h0 = o2g.h0(qzlVar, ((vxl) yxlVar).d, jabVar, u0sVar, oq5Var2, 0);
                oq5Var2.p(false);
                break;
            case 4:
                ((Integer) obj2).getClass();
                p1g.m((List) this.b, (qzl) this.c, (jab) this.d, (yci) this.e, (hq5) obj, rvf.R(3073));
                break;
            case 5:
                ((Integer) obj2).getClass();
                p1g.f((dvl) this.b, (eul) this.c, (List) this.d, (qzl) this.e, (hq5) obj, rvf.R(1));
                break;
            case 6:
                u0s u0sVar2 = (u0s) this.b;
                ryc rycVar = (ryc) this.c;
                thj thjVar = (thj) this.d;
                x6k x6kVar = (x6k) this.e;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                String str = (String) obj2;
                str.getClass();
                if (booleanValue) {
                    x6kVar.setValue(u0sVar2);
                }
                u0s u0sVar3 = booleanValue ? u0sVar2 : (u0s) x6kVar.getValue();
                if (u0sVar2 == null || u0sVar3 != null) {
                    rycVar.invoke(u0sVar3, thjVar, bool, str);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                v3g.j((txl) this.b, (jab) this.c, (qzl) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 8:
                fvf fvfVar = (fvf) this.b;
                o0k o0kVar = (o0k) this.c;
                nam namVar = (nam) this.d;
                mam mamVar = (mam) this.e;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    yci a = a.a(d.c(vci.a, 1.0f), "collection_podcasts_content");
                    boolean f = oq5Var3.f(namVar) | oq5Var3.h(mamVar);
                    Object K = oq5Var3.K();
                    if (f || K == gq5.a) {
                        K = new avi(i2, namVar, mamVar);
                        oq5Var3.k0(K);
                    }
                    weo.f(a, fvfVar, o0kVar, null, null, null, false, null, (Function1) K, oq5Var3, 6, 504);
                } else {
                    oq5Var3.S();
                }
                break;
            case 9:
                rbm rbmVar = (rbm) this.b;
                wbm wbmVar = (wbm) this.c;
                sdr sdrVar = (sdr) this.d;
                sdr sdrVar2 = (sdr) this.e;
                ((Integer) obj2).getClass();
                kjn kjnVar = gq5.a;
                oq5 oq5Var4 = (oq5) ((hq5) obj);
                oq5Var4.Z(330405014);
                aqi O = gld.O(rbmVar.f, oq5Var4);
                boolean f2 = oq5Var4.f(sdrVar);
                Object K2 = oq5Var4.K();
                if (f2 || K2 == kjnVar) {
                    K2 = new xtb(sdrVar, 22);
                    oq5Var4.k0(K2);
                }
                Function0 function0 = (Function0) K2;
                boolean f3 = oq5Var4.f(O);
                Object K3 = oq5Var4.K();
                if (f3 || K3 == kjnVar) {
                    K3 = new xtb(O, i2);
                    oq5Var4.k0(K3);
                }
                Function0 function02 = (Function0) K3;
                boolean f4 = oq5Var4.f(sdrVar2);
                Object K4 = oq5Var4.K();
                if (f4 || K4 == kjnVar) {
                    K4 = new xtb(sdrVar2, 24);
                    oq5Var4.k0(K4);
                }
                Function0 function03 = (Function0) K4;
                mxs mxsVar = (mxs) function02.invoke();
                n8g b = t75.b();
                mt mtVar = wbmVar.a;
                ghm ghmVar = wbmVar.e;
                ham hamVar = wbmVar.d;
                oq oqVar = mtVar.a;
                oqVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean contains = ((i4j) ((byb) qdcVar.C(I)).b(i4j.class)).h() ? lxe.n(oqVar.h()) != null : oqVar.g().contains(h94.e);
                String str2 = hamVar.f;
                if (str2 != null && !StringsKt.U(str2)) {
                    z = false;
                }
                if (contains || !z) {
                    b.add(new wam(str2));
                }
                te teVar = wbmVar.b.f;
                if (teVar != null) {
                    b.add(new uam(teVar));
                }
                b.add(new bbm(mxsVar.e.a));
                n8g a2 = t75.a(b);
                ecj ecjVar = (ecj) function0.invoke();
                n8g b2 = t75.b();
                b2.add(new xam(hamVar));
                if (!ghmVar.a.isEmpty()) {
                    b2.add(new yam(ghmVar));
                }
                if (ecjVar instanceof ccj) {
                    ArrayList<tx> arrayList = ((ccj) ecjVar).a;
                    if (!arrayList.isEmpty()) {
                        for (tx txVar : arrayList) {
                            if (txVar == null) {
                                b6e.s();
                                break;
                            } else {
                                b2.add(new abm(txVar));
                            }
                        }
                    }
                }
                n8g a3 = t75.a(b2);
                n8g b3 = t75.b();
                b3.add(new vam(mxsVar));
                n8g a4 = t75.a(b3);
                boolean booleanValue2 = ((Boolean) function03.invoke()).booleanValue();
                n8g b4 = t75.b();
                if (booleanValue2) {
                    b4.add(zam.a);
                }
                n8g a5 = t75.a(b4);
                zbm zbmVar = new zbm(CollectionsKt.g0(CollectionsKt.g0(a2, a3), a5), CollectionsKt.g0(CollectionsKt.g0(a2, a4), a5));
                oq5Var4.p(false);
                break;
            case 10:
                ((Integer) obj2).getClass();
                wdg.f((dam) this.b, (thj) this.c, (gvl) this.d, (rbm) this.e, (hq5) obj, rvf.R(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                u1g.i((nkm) this.b, (Function0) this.c, (yci) this.d, (wn5) this.e, (hq5) obj, rvf.R(25009));
                break;
            case 12:
                ((Integer) obj2).getClass();
                asq.n((wxk) this.b, (u7l) this.c, (Function2) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                c9g.l((xxk) this.b, (v7l) this.c, (Function1) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 14:
                hwm hwmVar = (hwm) this.b;
                nwm nwmVar = (nwm) this.c;
                qnq qnqVar = (qnq) this.d;
                nrf nrfVar = (nrf) this.e;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K5 = oq5Var5.K();
                    if (K5 == gq5.a) {
                        rmb rmbVar = nwmVar.g;
                        s63 s63Var = nwmVar.e;
                        qnqVar.getClass();
                        hn5 hn5Var = qnqVar.b;
                        s63Var.getClass();
                        kxi kxiVar = qnqVar.d;
                        hn5Var.getClass();
                        kxiVar.getClass();
                        s63Var.getClass();
                        sfm sfmVar = new sfm();
                        sfmVar.a = hn5Var;
                        sfmVar.b = kxiVar;
                        sfmVar.c = s63Var;
                        qyf qyfVar = qnqVar.c;
                        qyfVar.getClass();
                        rdk rdkVar = new rdk(hn5Var, nrfVar, qyfVar);
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(zb5.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        zb5 zb5Var = (zb5) qdcVar2.C(I2);
                        bdt I3 = hag.I(cx.class);
                        qdc qdcVar3 = l18Var2.a;
                        qdcVar3.getClass();
                        mx mxVar = (mx) ((cx) qdcVar3.C(I3)).b.getValue();
                        kxi kxiVar2 = qnqVar.d;
                        bdt I4 = hag.I(g0l.class);
                        qdc qdcVar4 = l18Var2.a;
                        qdcVar4.getClass();
                        iwm iwmVar = new iwm(nwmVar, sfmVar, rmbVar, rdkVar, zb5Var, mxVar, kxiVar2, (g0l) qdcVar4.C(I4), new hvl(hwmVar));
                        oq5Var5.k0(iwmVar);
                        K5 = iwmVar;
                    }
                    wdp.I((iwm) K5, hwmVar.c, (pu0) hwmVar.a.a.getValue(), null, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                pcg.h((mvi) this.b, (t1f) this.c, (Function0) this.d, (Function0) this.e, (hq5) obj, rvf.R(1));
                break;
            case 16:
                l8n l8nVar = (l8n) this.b;
                mqs mqsVar = (mqs) this.c;
                p8n p8nVar = (p8n) this.d;
                m8n m8nVar = (m8n) this.e;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1379911452, new pli(mqsVar, p8nVar, m8nVar, l8nVar, gld.M(l8nVar.v, oq5Var6), 12), oq5Var6), oq5Var6, 0, 2);
                } else {
                    oq5Var6.S();
                }
                break;
            case 17:
                yci yciVar = (yci) this.b;
                wln wlnVar = (wln) this.c;
                sdr sdrVar3 = (sdr) this.d;
                aqi aqiVar = (aqi) this.e;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var5;
                yci d = d.d(androidx.compose.foundation.a.b(yciVar, ((tln) oq5Var8.j(jft.a)).e, vnj.i), 1.0f);
                kfh d2 = ug3.d(b2c.b, false);
                int i3 = oq5Var8.P;
                androidx.compose.runtime.internal.a l = oq5Var8.l();
                yci H = vnj.H(hq5Var5, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var5, d2, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var8, i3, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                avf.h((umn) sdrVar3.getValue(), d.c(vci.a, 1.0f), wlnVar, (Function1) aqiVar.getValue(), hq5Var5, 48);
                oq5Var8.p(true);
                break;
            case 18:
                ((Integer) obj2).getClass();
                avf.i((wln) this.b, (lmn) this.c, (Function1) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                avf.h((umn) this.b, (yci) this.c, (wln) this.d, (Function1) this.e, (hq5) obj, rvf.R(49));
                break;
            case 20:
                ((Integer) obj2).getClass();
                fxf.a((con) this.b, (plv) this.c, (List) this.d, (ukd) this.e, (hq5) obj, rvf.R(1));
                break;
            case 21:
                pu0 pu0Var = (pu0) this.b;
                uwp uwpVar = (uwp) this.c;
                qbp qbpVar = (qbp) this.d;
                ComposeView composeView = (ComposeView) this.e;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(-1555126600, new t2n(9, uwpVar, qbpVar, composeView), hq5Var6), hq5Var6, 0, 4);
            case 22:
                yci yciVar2 = (yci) this.b;
                String str3 = (String) this.c;
                fyp fypVar = (fyp) this.d;
                Function0 function04 = (Function0) this.e;
                hq5 hq5Var7 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                kjn kjnVar2 = gq5.a;
                if ((intValue4 & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                gz2 gz2Var = b2c.o;
                float f5 = 8;
                yci n = androidx.compose.foundation.layout.a.n(yciVar2, f5, f5);
                oq5 oq5Var11 = (oq5) hq5Var7;
                boolean f6 = oq5Var11.f(str3) | oq5Var11.h(fypVar);
                Object K6 = oq5Var11.K();
                if (f6 || K6 == kjnVar2) {
                    K6 = new xum(16, str3, fypVar);
                    oq5Var11.k0(K6);
                }
                yci a6 = nfp.a(n, (Function1) K6);
                ta5 a7 = sa5.a(qx0.c, gz2Var, oq5Var11, 48);
                int i4 = oq5Var11.P;
                androidx.compose.runtime.internal.a l2 = oq5Var11.l();
                yci H2 = vnj.H(oq5Var11, a6);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar2);
                } else {
                    oq5Var11.n0();
                }
                g0g.U(oq5Var11, a7, wp5.f);
                g0g.U(oq5Var11, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var11.O || !Intrinsics.d(oq5Var11.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var11, i4, kb5Var2);
                }
                g0g.U(oq5Var11, H2, wp5.d);
                fypVar.getClass();
                boolean g = ((ma5) oq5Var11.j(pa5.a)).g();
                if (fypVar.equals(zxp.a)) {
                    i = !g ? R.drawable.ic_link_share_dark_64 : R.drawable.ic_link_share_64;
                } else if (fypVar.equals(zxp.b)) {
                    i = !g ? R.drawable.ic_more_share_dark_64 : R.drawable.ic_more_share_64;
                } else if (fypVar.equals(dyp.b)) {
                    i = R.drawable.ic_whatsapp_share_64;
                } else if (fypVar.equals(cyp.b)) {
                    i = R.drawable.ic_telegram_share_64;
                } else if (fypVar.equals(ayp.b)) {
                    i = R.drawable.ic_facebook_share_64;
                } else if (!fypVar.equals(byp.b)) {
                    b6e.s();
                    break;
                } else {
                    i = R.drawable.ic_instagram_share_64;
                }
                w4k E = a0g.E(i, 0, oq5Var11);
                long j = d85.n;
                vci vciVar = vci.a;
                gae.b(E, null, androidx.compose.foundation.a.e(xp3.u(vciVar, ugo.a), false, null, new meo(0), function04, 3), j, oq5Var11, 3120, 0);
                u1g.l(oq5Var11, d.e(vciVar, f5));
                ges i5 = nu0.i();
                long j2 = ((dq0) oq5Var11.j(eq0.a)).b.b;
                Object K7 = oq5Var11.K();
                if (K7 == kjnVar2) {
                    K7 = new pvp(5);
                    oq5Var11.k0(K7);
                }
                xv7.j(str3, nfp.a(vciVar, (Function1) K7), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, i5, oq5Var11, 0, 0, 65272);
                oq5Var11.p(true);
                break;
            case 23:
                ((Integer) obj2).getClass();
                fkq.d((String) this.b, (String) this.c, (d85) this.d, (yci) this.e, (hq5) obj, rvf.R(1));
                break;
            case 24:
                qqq qqqVar = (qqq) this.b;
                aqi aqiVar2 = (aqi) this.c;
                fvf fvfVar2 = (fvf) this.d;
                sdr sdrVar4 = (sdr) this.e;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                kjn kjnVar3 = gq5.a;
                oq5 oq5Var12 = (oq5) hq5Var8;
                if (oq5Var12.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str4 = (String) gld.M(qqqVar.f, oq5Var12).getValue();
                    if (str4 == null) {
                        str4 = "";
                    }
                    k2s k2sVar = (k2s) aqiVar2.getValue();
                    boolean booleanValue3 = ((Boolean) sdrVar4.getValue()).booleanValue();
                    boolean h = oq5Var12.h(qqqVar);
                    Object K8 = oq5Var12.K();
                    if (h || K8 == kjnVar3) {
                        qbp qbpVar2 = new qbp(0, qqqVar, qqq.class, "onBackClick", "onBackClick()V", 0, 25);
                        oq5Var12.k0(qbpVar2);
                        K8 = qbpVar2;
                    }
                    h9f h9fVar = (h9f) K8;
                    boolean h2 = oq5Var12.h(qqqVar);
                    Object K9 = oq5Var12.K();
                    if (h2 || K9 == kjnVar3) {
                        lgq lgqVar = new lgq(1, qqqVar, qqq.class, "onTabClick", "onTabClick(I)V", 0, 2);
                        oq5Var12.k0(lgqVar);
                        K9 = lgqVar;
                    }
                    v7g.i(str4, k2sVar, booleanValue3, fvfVar2, (Function0) h9fVar, qqqVar.i, (Function1) ((h9f) K9), null, oq5Var12, 0);
                } else {
                    oq5Var12.S();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                v7g.g((qqq) this.b, (tmb) this.c, (qnq) this.d, (nnq) this.e, (hq5) obj, rvf.R(577));
                break;
            case 26:
                ((Integer) obj2).getClass();
                pcg.m((wn5) this.b, (wn5) this.c, (wn5) this.d, (wn5) this.e, (hq5) obj, rvf.R(3511));
                break;
            case 27:
                ((Integer) obj2).getClass();
                u1g.m((por) this.b, (Function0) this.c, (Function0) this.d, (yci) this.e, (hq5) obj, rvf.R(3073));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                dpr dprVar = (dpr) this.b;
                Context context = (Context) this.c;
                mm6 mm6Var = (mm6) this.d;
                x3n x3nVar = (x3n) this.e;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean f7 = oq5Var13.f(dprVar.e);
                    Object K10 = oq5Var13.K();
                    if (f7 || K10 == gq5.a) {
                        K10 = new vnr(context, mm6Var, x3nVar, (eke) dprVar.i.getValue());
                        oq5Var13.k0(K10);
                    }
                    szf.p((vnr) K10, oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                break;
            default:
                xsq xsqVar = (xsq) this.b;
                ys4 ys4Var = (ys4) this.c;
                ws4 ws4Var = (ws4) this.d;
                hvq hvqVar = (hvq) this.e;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                ff7.g(ys4Var, ws4Var, hvqVar, um0.a, ((jsq) xsqVar).j, true, null, null, null, hq5Var10, 199680, 448);
        }
        return Unit.a;
    }

    public /* synthetic */ gvl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
