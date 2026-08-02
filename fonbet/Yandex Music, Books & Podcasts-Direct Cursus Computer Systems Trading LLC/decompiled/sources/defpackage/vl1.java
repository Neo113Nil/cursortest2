package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.y;
import com.yandex.passport.internal.ui.challenge.vpn.c;
import com.yandex.plus.bdui.flex.factory.h;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.content.controller.l;
import com.yandex.plus.bdui.plus.checkout.e;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.bdui.plus.content.controller.q;
import com.yandex.plus.bdui.s;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class vl1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vl1(e9g e9gVar, c0g c0gVar, Function0 function0, ep4 ep4Var, Function0 function02, wn5 wn5Var, wn5 wn5Var2) {
        this.a = 10;
        this.d = e9gVar;
        this.e = c0gVar;
        this.b = function0;
        this.f = ep4Var;
        this.c = function02;
        this.g = wn5Var;
        this.h = wn5Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02c4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.K(), java.lang.Integer.valueOf(r8)) == false) goto L73;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        bci bciVar;
        Object obj3;
        vci vciVar;
        boolean z;
        Function0 function0;
        boolean z2;
        int i;
        int i2 = this.a;
        vci vciVar2 = vci.a;
        Object obj4 = gq5.a;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.c;
        Object obj9 = this.b;
        Object obj10 = this.e;
        Object obj11 = this.d;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                xl1.d((lvf) obj11, (dib) obj10, (Function0) obj9, (Function2) obj7, (Function2) obj6, (Function0) obj8, (ml1) obj5, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                vwb.A((rnl) obj11, (v7l) obj10, (qan) obj7, (Function0) obj9, (Function0) obj8, (Function1) obj6, (yci) obj5, (hq5) obj, rvf.R(1572865));
                return Unit.a;
            case 2:
                o18 o18Var = (o18) obj;
                oc7 oc7Var = (oc7) obj2;
                o18Var.getClass();
                oc7Var.getClass();
                o18Var.c = hag.I(Context.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C((Context) obj11);
                o18Var.c = hag.I(usr.class);
                rp7Var.getClass();
                rp7Var.C((gwc) obj10);
                o18Var.c = hag.I(l9w.class);
                rp7Var.getClass();
                rp7Var.C((l9w) obj9);
                o18Var.c = hag.I(p5c.class);
                rp7Var.getClass();
                rp7Var.C((m9w) obj8);
                o18Var.c = hag.I(n9w.class);
                rp7Var.getClass();
                rp7Var.C(n9w.a);
                o18Var.c = hag.I(z2b.class);
                rp7Var.getClass();
                rp7Var.C(z2b.a);
                o18Var.c = hag.I(pej.class);
                rp7Var.getClass();
                rp7Var.C((pej) obj7);
                o18Var.c = hag.I(o9w.class);
                rp7Var.getClass();
                rp7Var.C((o9w) obj6);
                o18Var.c = hag.I(e1n.class);
                rp7Var.getClass();
                rp7Var.C((e1n) obj5);
                o18Var.c = hag.I(i5h.class);
                rp7Var.getClass();
                rp7Var.E(new lc7(oc7Var, 0));
                o18Var.c = hag.I(dst.class);
                rp7Var.getClass();
                rp7Var.E(new lc7(oc7Var, 1));
                o18Var.c = hag.I(p4h.class);
                rp7Var.getClass();
                rp7Var.E(new rn6(23));
                o18Var.c = hag.I(nc7.class);
                rp7Var.getClass();
                rp7Var.E(new lc7(oc7Var, 2));
                return Unit.a;
            case 3:
                iab iabVar = (iab) obj11;
                gvd gvdVar = (gvd) obj8;
                qo6 qo6Var = (qo6) obj7;
                pbu pbuVar = (pbu) obj6;
                Function0 function02 = (Function0) obj9;
                tvd tvdVar = (tvd) obj5;
                dib dibVar = (dib) obj10;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    oq5Var.S();
                } else if (iabVar.d.length() == 0) {
                    oq5Var.Z(-438225485);
                    boolean v = v7g.v(pbuVar);
                    Object K = oq5Var.K();
                    if (K == obj4) {
                        K = vz1.h(oq5Var);
                    }
                    yci d = a.d(vci.a, (uoi) K, null, v, null, null, function02, 24);
                    boolean f = oq5Var.f(tvdVar);
                    Object K2 = oq5Var.K();
                    if (f || K2 == obj4) {
                        K2 = new nr(tvdVar, 19);
                        oq5Var.k0(K2);
                    }
                    men.n(gvdVar, qo6Var, wyf.s(d, (Function0) K2), oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-437530031);
                    String str = iabVar.d;
                    v7g.v(pbuVar);
                    men.m(str, dibVar, qo6Var, false, function02, null, oq5Var, 0, 32);
                    oq5Var.p(false);
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                tt0.m((jil) obj11, (Function0) obj9, (Function1) obj10, (Function0) obj8, (Function1) obj7, (drh) obj6, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                s7g.c((vdr) obj11, (kub) obj10, (tt4) obj7, (yke) obj6, (xan) obj5, (Function0) obj9, (Function0) obj8, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                ezf.l((String) obj11, (String) obj10, (List) obj7, (Function0) obj9, (Function1) obj6, (Function1) obj5, (Function0) obj8, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                u7g.m((r6p) obj11, (tmb) obj10, (nnq) obj7, (qnq) obj6, (Function0) obj9, (yci) obj5, (Function0) obj8, (hq5) obj, rvf.R(4161));
                return Unit.a;
            case 8:
                cpq cpqVar = (cpq) obj11;
                r6p r6pVar = (r6p) obj10;
                tmb tmbVar = (tmb) obj7;
                nnq nnqVar = (nnq) obj6;
                qnq qnqVar = (qnq) obj5;
                Function0 function03 = (Function0) obj9;
                Function0 function04 = (Function0) obj8;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (!oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var2.S();
                } else if (cpqVar instanceof zoq) {
                    oq5Var2.Z(-2101609572);
                    boolean h = oq5Var2.h(r6pVar);
                    Object K3 = oq5Var2.K();
                    if (h || K3 == obj4) {
                        K3 = new r9n(0, r6pVar, r6p.class, "onRefresh", "onRefresh()V", 0, 29);
                        oq5Var2.k0(K3);
                    }
                    irf.q((Function0) ((h9f) K3), tmbVar, null, oq5Var2, 64);
                    oq5Var2.p(false);
                } else if (Intrinsics.d(cpqVar, apq.a)) {
                    oq5Var2.Z(-899069720);
                    c3x.m(6, 2, 0L, oq5Var2, d.x(d.c(vciVar2, 1.0f), b2c.f, 2));
                    oq5Var2.p(false);
                } else {
                    if (!(cpqVar instanceof bpq)) {
                        throw vz1.i(oq5Var2, -899078479, false);
                    }
                    oq5Var2.Z(-2101074171);
                    List d0 = etn.d0(((bpq) cpqVar).a, nnqVar, qnqVar, oq5Var2);
                    fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
                    boolean f2 = oq5Var2.f(function03);
                    Object K4 = oq5Var2.K();
                    if (f2 || K4 == obj4) {
                        K4 = new g1j(17, function03);
                        oq5Var2.k0(K4);
                    }
                    ezf.d(a, (Function0) K4, oq5Var2, 0);
                    ezf.e(a, function04, null, oq5Var2, 0);
                    Object K5 = oq5Var2.K();
                    if (K5 == obj4) {
                        K5 = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K5);
                    }
                    mm6 mm6Var = (mm6) K5;
                    Object K6 = oq5Var2.K();
                    if (K6 == obj4) {
                        r6pVar.getClass();
                        mm6Var.getClass();
                        qnq qnqVar2 = r6pVar.a;
                        xqq xqqVar = r6pVar.b;
                        qnqVar2.getClass();
                        Object mrfVar = new mrf(mm6Var, qnqVar2, xqqVar);
                        oq5Var2.k0(mrfVar);
                        K6 = mrfVar;
                    }
                    irf.u(d0, (krf) K6, androidx.compose.ui.platform.a.a(d.c(vciVar2, 1.0f), "search_skeleton_success"), null, null, a, null, 0, null, ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 12, 0.0f, 0.0f, 13), zs4.g(oq5Var2)), ogp.A(oq5Var2)), 0.0f, 0, oq5Var2, 432, 0, 3544);
                    oq5Var2.p(false);
                }
                return Unit.a;
            case 9:
                mvp mvpVar = (mvp) obj11;
                zwp zwpVar = (zwp) obj10;
                Object obj12 = (sai) obj9;
                Context context = (Context) obj8;
                y yVar = (y) obj7;
                fnb fnbVar = (fnb) obj6;
                bci bciVar2 = (bci) obj5;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                boolean f3 = oq5Var4.f(obj12);
                Object K7 = oq5Var4.K();
                if (f3 || K7 == obj4) {
                    K7 = new qbp(0, obj12, sai.class, "hide", "hide()V", 0, 15);
                    oq5Var4.k0(K7);
                }
                Object obj13 = (Function0) ((h9f) K7);
                mvpVar.getClass();
                obj13.getClass();
                context.getClass();
                yVar.getClass();
                fnbVar.getClass();
                ovp ovpVar = mvpVar.a;
                jxp jxpVar = zwpVar.a;
                swp swpVar = (swp) ovpVar.b.getValue();
                jxpVar.getClass();
                swpVar.getClass();
                Object K8 = oq5Var4.K();
                if (K8 == obj4) {
                    cvo cvoVar = cvo.i;
                    cvo b = o6m.b(wjb.BottomsheetScreen, null, 6);
                    Resources resources = context.getApplicationContext().getResources();
                    resources.getClass();
                    z23 z23Var = new z23(resources, 2);
                    jfu jfuVar = new jfu();
                    rln rlnVar = new rln(15, z23Var, jxpVar);
                    lm4 a2 = ern.a(ywp.class);
                    bciVar = bciVar2;
                    a6p a6pVar = new a6p(4, rlnVar);
                    gs6 gs6Var = gs6.b;
                    gs6Var.getClass();
                    bjt bjtVar = new bjt(jfuVar, a6pVar, gs6Var);
                    String f4 = a2.f();
                    if (f4 == null) {
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                    ywp ywpVar = (ywp) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f4));
                    swpVar.b.getClass();
                    qf1 qf1Var = new qf1(context, yVar, 2);
                    fnbVar.getClass();
                    x3n x3nVar = new x3n();
                    x3nVar.c = fnbVar;
                    x3nVar.d = b;
                    x3nVar.b = btf.b(new qkp(17));
                    x3nVar.a = "";
                    Object wwpVar = new wwp(ywpVar, qf1Var, x3nVar);
                    oq5Var4.k0(wwpVar);
                    K8 = wwpVar;
                } else {
                    bciVar = bciVar2;
                }
                wwp wwpVar2 = (wwp) K8;
                boolean h2 = oq5Var4.h(zwpVar) | oq5Var4.h(ovpVar) | oq5Var4.f(obj13);
                Object K9 = oq5Var4.K();
                if (h2 || K9 == obj4) {
                    K9 = new p3e(23, zwpVar, ovpVar, obj13);
                    oq5Var4.k0(K9);
                }
                Function1 function1 = (Function1) K9;
                oq5Var4.a0(419377738);
                kfu a3 = rpg.a(oq5Var4);
                if (a3 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(yvp.class), a3, null, k5r.g(yvp.class, new p97(1), function1), a3 instanceof ssd ? ((ssd) a3).getDefaultViewModelCreationExtras() : gs6.b, oq5Var4);
                oq5Var4.p(false);
                yvp yvpVar = (yvp) R;
                Object K10 = oq5Var4.K();
                if (K10 == obj4) {
                    K10 = new rvp(yvpVar, wwpVar2);
                    oq5Var4.k0(K10);
                }
                rvp rvpVar = (rvp) K10;
                wvp wvpVar = (wvp) gld.M(rvpVar.c, oq5Var4).getValue();
                if (wvpVar instanceof svp) {
                    oq5Var4.Z(539779844);
                    oq5Var4.p(false);
                } else {
                    if (!(wvpVar instanceof vvp)) {
                        throw vz1.i(oq5Var4, 539776861, false);
                    }
                    oq5Var4.Z(-446604459);
                    vvp vvpVar = (vvp) wvpVar;
                    boolean h3 = oq5Var4.h(rvpVar);
                    Object K11 = oq5Var4.K();
                    if (h3 || K11 == obj4) {
                        K11 = new ucm(25, rvpVar);
                        oq5Var4.k0(K11);
                    }
                    Function2 function2 = (Function2) K11;
                    boolean booleanValue = ((Boolean) gld.M(rvpVar.d, oq5Var4).getValue()).booleanValue();
                    wwp wwpVar3 = rvpVar.b;
                    boolean h4 = oq5Var4.h(rvpVar);
                    Object K12 = oq5Var4.K();
                    if (h4 || K12 == obj4) {
                        Object bmlVar = new bml(1, rvpVar, rvp.class, "onInviteToFamilySwitched", "onInviteToFamilySwitched(Z)V", 0, 28);
                        oq5Var4.k0(bmlVar);
                        K12 = bmlVar;
                    }
                    q5g.i(zwpVar, vvpVar, function2, booleanValue, wwpVar3, (Function1) ((h9f) K12), bciVar, oq5Var4, 2097152);
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 10:
                e9g e9gVar = (e9g) obj11;
                c0g c0gVar = (c0g) obj10;
                Function0 function05 = (Function0) obj9;
                ep4 ep4Var = (ep4) obj7;
                Function0 function06 = (Function0) obj8;
                wn5 wn5Var = (wn5) obj6;
                wn5 wn5Var2 = (wn5) obj5;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    iz2 iz2Var = b2c.b;
                    kfh d2 = ug3.d(iz2Var, false);
                    int i3 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l = oq5Var5.l();
                    vci vciVar3 = vci.a;
                    yci H = vnj.H(oq5Var5, vciVar3);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var5, d2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var5, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (!oq5Var5.O) {
                        obj3 = obj4;
                        break;
                    } else {
                        obj3 = obj4;
                    }
                    ouj.x(i3, oq5Var5, i3, kb5Var3);
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var5, H, kb5Var4);
                    yci a4 = b.a.a(vciVar3, b2c.f);
                    nho a5 = lho.a(qx0.a, b2c.l, oq5Var5, 48);
                    int i4 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                    yci H2 = vnj.H(oq5Var5, a4);
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, a5, kb5Var);
                    g0g.U(oq5Var5, l2, kb5Var2);
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var5, i4, kb5Var3);
                    }
                    g0g.U(oq5Var5, H2, kb5Var4);
                    kfh d3 = ug3.d(b2c.e, false);
                    int i5 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var5.l();
                    yci H3 = vnj.H(oq5Var5, vciVar3);
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d3, kb5Var);
                    g0g.U(oq5Var5, l3, kb5Var2);
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var5, i5, kb5Var3);
                    }
                    g0g.U(oq5Var5, H3, kb5Var4);
                    wn5Var.invoke(oq5Var5, 0);
                    oq5Var5.p(true);
                    u1g.l(oq5Var5, d.r(vciVar3, 12));
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    yci o = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f), 0.0f, 8, 1);
                    kfh d4 = ug3.d(iz2Var, false);
                    int i6 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var5.l();
                    yci H4 = vnj.H(oq5Var5, o);
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d4, kb5Var);
                    g0g.U(oq5Var5, l4, kb5Var2);
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var5, i6, kb5Var3);
                    }
                    g0g.U(oq5Var5, H4, kb5Var4);
                    wn5Var2.invoke(oq5Var5, 0);
                    oq5Var5.p(true);
                    if (e9gVar == e9g.a) {
                        oq5Var5.Z(-1532652949);
                        long j = ((dq0) oq5Var5.j(eq0.a)).a.g;
                        boolean z3 = c0gVar == c0g.c;
                        if (function05 == null) {
                            oq5Var5.Z(-1532456099);
                            Object K13 = oq5Var5.K();
                            if (K13 == obj3) {
                                K13 = new nrq(6);
                                oq5Var5.k0(K13);
                            }
                            z = false;
                            oq5Var5.p(false);
                            function0 = (Function0) K13;
                        } else {
                            z = false;
                            oq5Var5.Z(781849460);
                            oq5Var5.p(false);
                            function0 = function05;
                        }
                        vciVar = vciVar3;
                        szf.b(z3, function0, vciVar, null, j, 0L, oq5Var5, 384, 40);
                    } else {
                        vciVar = vciVar3;
                        z = false;
                        oq5Var5.Z(-1536753505);
                    }
                    oq5Var5.p(z);
                    int ordinal = ep4Var.ordinal();
                    if (ordinal == 0) {
                        oq5Var5.Z(781855687);
                        oq5Var5.p(z);
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            throw vz1.i(oq5Var5, 781854376, z);
                        }
                        oq5Var5.Z(-1532118509);
                        aae.a(function06, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 4, 0.0f, 11), ep4Var == ep4.b, ild.C(898602534, new z8g(e9gVar, 1), oq5Var5), oq5Var5, 24624, 8);
                        oq5Var5.p(false);
                    }
                    oq5Var5.p(true);
                    oq5Var5.p(true);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 11:
                nfr nfrVar = (nfr) obj11;
                wfr wfrVar = (wfr) obj10;
                hn5 hn5Var = (hn5) obj9;
                ct8 ct8Var = (ct8) obj8;
                qne qneVar = (qne) obj7;
                pfr pfrVar = (pfr) obj6;
                String str2 = (String) obj5;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                aqi Q = szf.Q(nfrVar.a, hq5Var5);
                oq5 oq5Var7 = (oq5) hq5Var5;
                float i0 = ((jx7) oq5Var7.j(es5.h)).i0();
                Object K14 = oq5Var7.K();
                if (K14 == obj4) {
                    int ordinal2 = wfrVar.ordinal();
                    if (ordinal2 == 0) {
                        i = 104;
                    } else if (ordinal2 == 1) {
                        i = 251;
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        i = 323;
                    }
                    K14 = szf.g0(new cma(i * i0));
                    oq5Var7.k0(K14);
                }
                dzf dzfVar = (dzf) oq5Var7.j(ykg.a);
                yci e = d.e(d.d(vciVar2, 1.0f), ((cma) ((aqi) K14).getValue()).a);
                kfh d5 = ug3.d(b2c.b, false);
                int i7 = oq5Var7.P;
                androidx.compose.runtime.internal.a l5 = oq5Var7.l();
                yci H5 = vnj.H(oq5Var7, e);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var7.d0();
                if (oq5Var7.O) {
                    oq5Var7.k(grbVar2);
                } else {
                    oq5Var7.n0();
                }
                g0g.U(oq5Var7, d5, wp5.f);
                g0g.U(oq5Var7, l5, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var7, i7, kb5Var5);
                }
                g0g.U(oq5Var7, H5, wp5.d);
                tfr tfrVar = (tfr) Q.getValue();
                if (tfrVar instanceof sfr) {
                    oq5Var7.Z(-347690841);
                    boolean h5 = oq5Var7.h(hn5Var) | oq5Var7.h(ct8Var) | oq5Var7.h(qneVar) | oq5Var7.h(dzfVar) | oq5Var7.h(pfrVar) | oq5Var7.f(str2) | oq5Var7.f(tfrVar);
                    Object K15 = oq5Var7.K();
                    if (h5 || K15 == obj4) {
                        K15 = new ofr(hn5Var, ct8Var, qneVar, dzfVar, pfrVar, str2, (sfr) tfrVar, 0);
                        oq5Var7.k0(K15);
                    }
                    androidx.compose.ui.viewinterop.a.a(48, 4, oq5Var7, d.c(vciVar2, 1.0f), (Function1) K15, null);
                    oq5Var7.p(false);
                } else {
                    if (!(tfrVar instanceof qfr)) {
                        if (!(tfrVar instanceof rfr)) {
                            throw vz1.i(oq5Var7, 681518656, false);
                        }
                        oq5Var7.Z(681574473);
                        z2 = true;
                        ivf.k(54, 0, oq5Var7, d.c(vciVar2, 1.0f), true);
                        oq5Var7.p(false);
                        oq5Var7.p(z2);
                        return Unit.a;
                    }
                    oq5Var7.Z(681568746);
                    ivf.k(54, 0, oq5Var7, d.c(vciVar2, 1.0f), false);
                    oq5Var7.p(false);
                }
                z2 = true;
                oq5Var7.p(z2);
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                y1g.n((yj2) obj11, (sdr) obj10, (sdr) obj7, (Function0) obj9, (Function0) obj8, (Function0) obj6, (ccg) obj5, vci.a, (hq5) obj, rvf.R(3073));
                return Unit.a;
            case 13:
                s sVar = (s) obj;
                m mVar = (m) obj2;
                sVar.getClass();
                mVar.getClass();
                return new q(sVar, mVar, (com.yandex.plus.bdui.flex.ui.s) obj11, (f) obj10, new h((Function2) obj7, sVar, 2), new c(1, (e) obj9, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 12), (dzf) obj8, (tf6) obj6, (com.yandex.plus.log.api.b) obj5);
            default:
                m mVar2 = (m) obj2;
                ((s) obj).getClass();
                mVar2.getClass();
                return new l(mVar2, (com.yandex.plus.core.imageloader.b) obj11, (com.yandex.plus.pay.ui.design.api.api.a) obj10, (k) obj9, (com.yandex.plus.pay.ui.core.api.common.a) obj8, (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d) obj7, (com.yandex.plus.home.internal.di.y) obj6, (com.yandex.plus.log.api.b) obj5);
        }
    }

    public /* synthetic */ vl1(lvf lvfVar, dib dibVar, Function0 function0, Function2 function2, Function2 function22, Function0 function02, ml1 ml1Var, int i) {
        this.a = 0;
        this.d = lvfVar;
        this.e = dibVar;
        this.b = function0;
        this.f = function2;
        this.g = function22;
        this.c = function02;
        this.h = ml1Var;
    }

    public /* synthetic */ vl1(iab iabVar, gvd gvdVar, qo6 qo6Var, pbu pbuVar, Function0 function0, tvd tvdVar, dib dibVar) {
        this.a = 3;
        this.d = iabVar;
        this.c = gvdVar;
        this.f = qo6Var;
        this.g = pbuVar;
        this.b = function0;
        this.h = tvdVar;
        this.e = dibVar;
    }

    public /* synthetic */ vl1(jil jilVar, Function0 function0, Function1 function1, Function0 function02, Function1 function12, drh drhVar, yci yciVar, int i) {
        this.a = 4;
        this.d = jilVar;
        this.b = function0;
        this.e = function1;
        this.c = function02;
        this.f = function12;
        this.g = drhVar;
        this.h = yciVar;
    }

    public /* synthetic */ vl1(r6p r6pVar, tmb tmbVar, nnq nnqVar, qnq qnqVar, Function0 function0, yci yciVar, Function0 function02, int i) {
        this.a = 7;
        this.d = r6pVar;
        this.e = tmbVar;
        this.f = nnqVar;
        this.g = qnqVar;
        this.b = function0;
        this.h = yciVar;
        this.c = function02;
    }

    public /* synthetic */ vl1(cpq cpqVar, r6p r6pVar, tmb tmbVar, nnq nnqVar, qnq qnqVar, Function0 function0, Function0 function02) {
        this.a = 8;
        this.d = cpqVar;
        this.e = r6pVar;
        this.f = tmbVar;
        this.g = nnqVar;
        this.h = qnqVar;
        this.b = function0;
        this.c = function02;
    }

    public /* synthetic */ vl1(vdr vdrVar, kub kubVar, tt4 tt4Var, yke ykeVar, xan xanVar, Function0 function0, Function0 function02, int i) {
        this.a = 5;
        this.d = vdrVar;
        this.e = kubVar;
        this.f = tt4Var;
        this.g = ykeVar;
        this.h = xanVar;
        this.b = function0;
        this.c = function02;
    }

    public /* synthetic */ vl1(com.yandex.plus.bdui.flex.ui.s sVar, f fVar, e eVar, dzf dzfVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar, Function2 function2) {
        this.a = 13;
        this.d = sVar;
        this.e = fVar;
        this.b = eVar;
        this.c = dzfVar;
        this.g = tf6Var;
        this.h = bVar;
        this.f = function2;
    }

    public /* synthetic */ vl1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public /* synthetic */ vl1(Object obj, Object obj2, Object obj3, Function0 function0, Function0 function02, syc sycVar, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = function0;
        this.c = function02;
        this.g = sycVar;
        this.h = obj4;
    }

    public /* synthetic */ vl1(String str, String str2, List list, Function0 function0, Function1 function1, Function1 function12, Function0 function02, int i) {
        this.a = 6;
        this.d = str;
        this.e = str2;
        this.f = list;
        this.b = function0;
        this.g = function1;
        this.h = function12;
        this.c = function02;
    }
}
