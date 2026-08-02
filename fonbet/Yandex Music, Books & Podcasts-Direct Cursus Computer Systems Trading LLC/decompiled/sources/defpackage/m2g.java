package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final /* synthetic */ class m2g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        Object obj3 = gq5.a;
        int i2 = 2;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o2g.c((j2g) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                bci bciVar = (bci) obj5;
                sai saiVar = (sai) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(saiVar);
                Object K = oq5Var2.K();
                if (f || K == obj3) {
                    Object pefVar = new pef(0, saiVar, sai.class, "hide", "hide()V", 0, 21);
                    oq5Var2.k0(pefVar);
                    K = pefVar;
                }
                g0g.b(bciVar, (Function0) ((h9f) K), oq5Var2, 8);
                return Unit.a;
            case 2:
                ComposeView composeView = (ComposeView) obj5;
                etg etgVar = (etg) obj4;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    dzf viewLifecycleOwner = etgVar.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
                    pd.b(new qzm[0], false, bow.c, oq5Var3, 0, 2);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                cwg cwgVar = (cwg) obj5;
                Object obj6 = (jp0) obj4;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    aqi Q = szf.Q(cwgVar.c, oq5Var4);
                    aqi Q2 = szf.Q(cwgVar.d, oq5Var4);
                    List list = (List) Q.getValue();
                    mwg mwgVar = ((lwg) Q2.getValue()).a;
                    boolean h = oq5Var4.h(cwgVar) | oq5Var4.f(Q2) | oq5Var4.f(obj6);
                    Object K2 = oq5Var4.K();
                    if (h || K2 == obj3) {
                        K2 = new v48(27, cwgVar, Q2, obj6);
                        oq5Var4.k0(K2);
                    }
                    Function2 function2 = (Function2) K2;
                    boolean h2 = oq5Var4.h(cwgVar) | oq5Var4.f(Q2) | oq5Var4.f(obj6);
                    Object K3 = oq5Var4.K();
                    if (h2 || K3 == obj3) {
                        K3 = new cte(i2, cwgVar, obj6, Q2);
                        oq5Var4.k0(K3);
                    }
                    a0g.f(mwgVar, list, function2, (Function0) K3, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                mwg mwgVar2 = (mwg) obj5;
                Function0 function0 = (Function0) obj4;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    a0g.g(mwgVar2, function0, null, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                k7i k7iVar = (k7i) obj5;
                n8i n8iVar = (n8i) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object K4 = oq5Var6.K();
                    if (K4 == obj3) {
                        K4 = new l8i(k7iVar, n8iVar);
                        oq5Var6.k0(K4);
                    }
                    zdg.e((l8i) K4, oq5Var6, 0);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                bfg.c((l8i) obj5, (p7i) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                qgg.c((l8i) obj5, (s7i) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                rvf.f((w8i) obj5, (tmb) obj4, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 9:
                o0k o0kVar = (o0k) obj5;
                tsf tsfVar = (tsf) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    yci a = a.a(vciVar, "mixes_screen_loading");
                    Object K5 = oq5Var7.K();
                    if (K5 == obj3) {
                        K5 = new p1i(11);
                        oq5Var7.k0(K5);
                    }
                    rvf.e(a, o0kVar, tsfVar, (Function1) K5, oq5Var7, 3078);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                swf.f((c8i) obj5, (Function1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                pyc pycVar = (pyc) obj5;
                bci bciVar2 = (bci) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                pycVar.invoke(bciVar2, hq5Var7, 8);
                return Unit.a;
            case 12:
                sdr sdrVar = (sdr) obj5;
                kii kiiVar = (kii) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i3 = kii.p;
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    yci e = d.e(d.d(gut.a0(vciVar), 1.0f), 56);
                    boolean f2 = oq5Var9.f(sdrVar);
                    Object K6 = oq5Var9.K();
                    if (f2 || K6 == obj3) {
                        K6 = new xp(sdrVar, 13);
                        oq5Var9.k0(K6);
                    }
                    yci b = nfp.b(e, false, (Function1) K6);
                    lx0 lx0Var = qx0.h;
                    hz2 hz2Var = b2c.l;
                    boolean f3 = oq5Var9.f(sdrVar) | oq5Var9.h(kiiVar);
                    Object K7 = oq5Var9.K();
                    if (f3 || K7 == obj3) {
                        K7 = new dae(26, sdrVar, kiiVar);
                        oq5Var9.k0(K7);
                    }
                    weo.i(b, null, null, false, lx0Var, hz2Var, null, false, null, (Function1) K7, oq5Var9, 12804096, 334);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                q5g.c((rli) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 14:
                ArrayList arrayList = (ArrayList) obj4;
                IntRange intRange = (IntRange) obj;
                List list2 = (List) obj2;
                intRange.getClass();
                list2.getClass();
                ((gmi) obj5).s.E(list2);
                if (list2.size() != CollectionsKt.J(intRange)) {
                    su4.s(2, null, "Unexpected behaviour, loadedItems.size != loadedItemsCounts", null);
                    return Unit.a;
                }
                Iterator it = list2.iterator();
                int i4 = intRange.a;
                int i5 = intRange.b;
                if (i4 <= i5) {
                    while (true) {
                        arrayList.set(i4, it.next());
                        if (i4 != i5) {
                            i4++;
                        }
                    }
                }
                return Unit.a;
            case 15:
                lni lniVar = (lni) obj5;
                i50 i50Var = (i50) obj4;
                Throwable th = (Throwable) obj;
                l3o l3oVar = (l3o) obj2;
                th.getClass();
                ssg.a(6, "MusicMatchRecognitionService", "error: response=" + l3oVar, th);
                lniVar.a(new qni((l3oVar != null ? Integer.valueOf(l3oVar.d) : null) != null ? new fue(l3oVar.d) : new gue()), i50Var);
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                ((h1b) obj5).u((jz3) obj4, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                f8g.a((lti) obj5, (tmb) obj4, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 18:
                j76 j76Var = (j76) obj5;
                tmb tmbVar = (tmb) obj4;
                hq5 hq5Var9 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (oq5Var10.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    hmj hmjVar = hmj.b;
                    yci d = d.d(vciVar, 1.0f);
                    boolean h3 = oq5Var10.h(j76Var);
                    Object K8 = oq5Var10.K();
                    if (h3 || K8 == obj3) {
                        Object kefVar = new kef(1, j76Var, j76.class, "onRefresh", "onRefresh(Z)V", 0, 15);
                        oq5Var10.k0(kefVar);
                        K8 = kefVar;
                    }
                    rvf.j((Function1) ((h9f) K8), tmbVar, d, 0, false, hmjVar, oq5Var10, 197056, 24);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 19:
                r2j r2jVar = (r2j) obj5;
                kxi kxiVar = (kxi) obj4;
                hq5 hq5Var10 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var10;
                if (oq5Var11.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean f4 = oq5Var11.f(r2jVar);
                    Object K9 = oq5Var11.K();
                    if (f4 || K9 == obj3) {
                        K9 = new o2j(r2jVar, kxiVar);
                        oq5Var11.k0(K9);
                    }
                    zwf.b((o2j) K9, null, oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                zwf.b((o2j) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 21:
                i5j i5jVar = (i5j) obj5;
                m4j m4jVar = (m4j) obj4;
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var11;
                if (oq5Var12.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    j66.u(i5jVar, null, m4jVar.d, m4jVar.e, oq5Var12, 0);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                hyf.l((l5j) obj5, (yci) obj4, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                ezf.c((w6j) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                w1g.e((eaj) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                eaj eajVar = (eaj) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                eajVar.getClass();
                caj cajVar = eajVar.a;
                cajVar.e.h(new d70(cajVar.d.d, c70.c, ((mgt) obj4).a, 0, str), booleanValue);
                return Unit.a;
            case 26:
                caj cajVar2 = (caj) obj5;
                wnd wndVar = (wnd) obj4;
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var12;
                if (oq5Var13.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean f5 = oq5Var13.f(cajVar2) | oq5Var13.f(wndVar);
                    Object K10 = oq5Var13.K();
                    if (f5 || K10 == obj3) {
                        K10 = new eaj(cajVar2, wndVar);
                        oq5Var13.k0(K10);
                    }
                    w1g.e((eaj) K10, null, oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 27:
                kbj kbjVar = (kbj) obj5;
                e9g e9gVar = (e9g) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var13;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                String str2 = kbjVar.a;
                qo6 qo6Var = qo6.g;
                irf.y(str2, qo6Var, d.m(vciVar, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var, hq5Var13, 48), hq5Var13, 48, 120);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ime imeVar = (ime) obj5;
                bci bciVar3 = (bci) obj4;
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                awc awcVar = (awc) imeVar.c;
                mqs mqsVar = (mqs) imeVar.b;
                qe3 qe3Var = (qe3) imeVar.d;
                mqsVar.getClass();
                lcj lcjVar = (lcj) awcVar.a;
                k68 k68Var = (k68) lcjVar.r.getValue();
                tbb tbbVar = (tbb) lcjVar.s.getValue();
                mcj mcjVar = new mcj(lcjVar.g, lcjVar.j, lcjVar.k, lcjVar.l, lcjVar.h, (k8w) lcjVar.m.getValue(), (qe3) lcjVar.q.getValue());
                k68Var.getClass();
                tbbVar.getClass();
                oq5 oq5Var16 = (oq5) hq5Var14;
                boolean h4 = oq5Var16.h(mqsVar) | oq5Var16.h(k68Var) | oq5Var16.h(tbbVar);
                Object K11 = oq5Var16.K();
                if (h4 || K11 == obj3) {
                    K11 = new p3e(mqsVar, k68Var, tbbVar);
                    oq5Var16.k0(K11);
                }
                Function1 function1 = (Function1) K11;
                oq5Var16.a0(419377738);
                kfu a2 = rpg.a(oq5Var16);
                if (a2 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(vcj.class), a2, null, k5r.g(vcj.class, new p97(1), function1), a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var16);
                oq5Var16.p(false);
                vcj vcjVar = (vcj) R;
                Object K12 = oq5Var16.K();
                if (K12 == obj3) {
                    K12 = new ncj(mqsVar, qe3Var, mcjVar, vcjVar);
                    oq5Var16.k0(K12);
                }
                v7g.c((ncj) K12, bciVar3, hq5Var14, 64);
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                v7g.c((ncj) obj5, (bci) obj4, (hq5) obj, rvf.R(65));
                return Unit.a;
        }
    }

    public /* synthetic */ m2g(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
