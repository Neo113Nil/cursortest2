package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class hon implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hon(ArrayList arrayList, yci yciVar, int i) {
        this.a = 8;
        e9g e9gVar = e9g.a;
        this.b = arrayList;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.a;
        int i2 = 7;
        int i3 = 17;
        int i4 = 16;
        int i5 = 14;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                con conVar = (con) obj4;
                plv plvVar = (plv) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, z)) {
                    p1g.v(R.drawable.ic_music_logo_light, o2g.j0(conVar.t), plvVar, false, oq5Var, 0, 8);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                g0g.g((qtn) obj4, (yci) obj3, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 2:
                qtn qtnVar = (qtn) obj4;
                Function2 function2 = (Function2) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                hz2 hz2Var = b2c.l;
                float f = 8;
                yci a = a.a(androidx.compose.foundation.layout.a.n(vciVar, 16, f), "release_album");
                nho a2 = lho.a(qx0.a, hz2Var, hq5Var2, 48);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i6 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, a2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var3, i6, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                yci m = d.m(vciVar, 80);
                if (qtnVar.g) {
                    oq5Var3.Z(-934654188);
                    g0g.g(qtnVar, a.a(m, "pre_save_cover"), hq5Var2, 48);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.Z(-934475721);
                    irf.y(qtnVar.a, qo6.b, a.a(m, "release_cover"), false, false, null, null, null, hq5Var2, 432, 248);
                    oq5Var3.p(false);
                }
                Object K = oq5Var3.K();
                if (K == kjnVar) {
                    K = new kin(12);
                    oq5Var3.k0(K);
                }
                yci b = nfp.b(vciVar, true, (Function1) K);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci d = d.d(androidx.compose.foundation.layout.a.q(vz1.g(1.0f, b, true), 12, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                ta5 a3 = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                int i7 = oq5Var3.P;
                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                yci H2 = vnj.H(hq5Var2, d);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, a3, kb5Var);
                g0g.U(hq5Var2, l2, kb5Var2);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var3, i7, kb5Var3);
                }
                g0g.U(hq5Var2, H2, kb5Var4);
                bg3.a(null, null, false, ild.C(414185814, new tik(11, qtnVar), hq5Var2), hq5Var2, 3072, 7);
                oq5Var3.Z(-228943247);
                float f2 = mu0.a;
                u1g.l(hq5Var2, d.e(vciVar, f2));
                String str = qtnVar.c;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges i8 = nu0.i();
                agr agrVar = eq0.a;
                oq5 oq5Var4 = (oq5) hq5Var2;
                xv7.j(str, a.a(d.d(vciVar, 1.0f), "release_subtitle1"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, i8, hq5Var2, 48, 3120, 55288);
                String str2 = qtnVar.d;
                if (str2 == null) {
                    oq5Var3.Z(-228358557);
                } else {
                    oq5Var3.Z(-228358556);
                    u1g.l(hq5Var2, d.e(vciVar, f2));
                    xv7.j(str2, a.a(d.d(vciVar, 1.0f), "release_subtitle2"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var2, 48, 3120, 55288);
                }
                boolean z2 = false;
                oq5Var3.p(false);
                oq5Var3.p(false);
                oq5Var3.p(true);
                if (function2 == null) {
                    oq5Var3.Z(-931119073);
                } else {
                    oq5Var3.Z(-931119072);
                    u1g.l(hq5Var2, d.r(vciVar, f));
                    zwf.i(((dq0) ((oq5) hq5Var2).j(agrVar)).a.c, ild.C(-1709509379, new im0(function2, 10), hq5Var2), hq5Var2, 48);
                    z2 = false;
                }
                oq5Var3.p(z2);
                oq5Var3.p(true);
                return Unit.a;
            case 3:
                Function0 function0 = (Function0) obj4;
                aqi aqiVar = (aqi) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f3 = oq5Var5.f(function0);
                    Object K2 = oq5Var5.K();
                    if (f3 || K2 == kjnVar) {
                        K2 = new rln(4, function0, aqiVar);
                        oq5Var5.k0(K2);
                    }
                    bcx.d((Function0) K2, a.a(vciVar, "confirm_button"), false, h4a.g, oq5Var5, 3120, 4);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                y5g.j((pjc) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                wn5 wn5Var = (wn5) obj4;
                d85 d85Var = (d85) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    wn5Var.invoke(oq5Var6, 0);
                    if (qv0.a()) {
                        oq5Var6.Z(-1745325303);
                    } else {
                        oq5Var6.Z(1329288665);
                        if (d85Var == null) {
                            oq5Var6.Z(-1741724344);
                        } else {
                            oq5Var6.Z(-1741724343);
                            p1g.l(d85Var.a, oq5Var6, 0);
                        }
                        oq5Var6.p(false);
                    }
                    oq5Var6.p(false);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 6:
                String str3 = (String) obj4;
                mxo mxoVar = (mxo) obj3;
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var5;
                if (oq5Var7.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (((Boolean) oq5Var7.j((agr) ymg.d.c)).booleanValue()) {
                        oq5Var7.Z(1648209630);
                        Activity C = asq.C((Context) oq5Var7.j(AndroidCompositionLocals_androidKt.b));
                        Window window = C != null ? C.getWindow() : null;
                        if (window == null) {
                            xq0.x("Required value was null.");
                            return null;
                        }
                        qxo.a(mxoVar, new vp5(new lum(window, str3)), true, oq5Var7, 384);
                    } else {
                        oq5Var7.Z(1645334318);
                    }
                    oq5Var7.p(false);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 7:
                pyc pycVar = (pyc) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                pycVar.invoke(arrayList, hq5Var6, 0);
                return Unit.a;
            case 8:
                e9g e9gVar = e9g.a;
                ((Integer) obj2).getClass();
                ywf.f((ArrayList) obj4, (yci) obj3, (hq5) obj, rvf.R(391));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                v3g.n((a2p) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                j6i j6iVar = (j6i) obj4;
                tmb tmbVar = (tmb) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean h = oq5Var9.h(j6iVar);
                    Object K3 = oq5Var9.K();
                    if (h || K3 == kjnVar) {
                        r9n r9nVar = new r9n(0, j6iVar, j6i.class, "onRetryClick", "onRetryClick()V", 0, 25);
                        oq5Var9.k0(r9nVar);
                        K3 = r9nVar;
                    }
                    irf.q((Function0) ((h9f) K3), tmbVar, null, oq5Var9, 64);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 11:
                tmb tmbVar2 = (tmb) obj4;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                pvfVar.a(new String[]{"MIXES"}, new qh1(tmbVar2, 12));
                pvfVar.a(new String[]{"MIXES_MUSIC", "MIXES_GRID"}, new qh1(tmbVar2, 13));
                pvfVar.a(new String[]{"HISTORY", "SEARCH_HISTORY"}, new oxo(4, (q6p) obj3));
                return Unit.a;
            case 12:
                Integer num = (Integer) obj4;
                d85 d85Var2 = (d85) obj3;
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var8;
                if (oq5Var10.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gae.b(a0g.E(num.intValue(), 0, oq5Var10), null, null, d85Var2.a, oq5Var10, 48, 4);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 13:
                lrp lrpVar = (lrp) obj4;
                yci yciVar = (yci) obj3;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var9;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                wrp wrpVar = (wrp) gld.M(lrpVar.getState(), hq5Var9).getValue();
                if (wrpVar instanceof urp) {
                    oq5 oq5Var12 = (oq5) hq5Var9;
                    oq5Var12.Z(-205063431);
                    urp urpVar = (urp) wrpVar;
                    trp.j(urpVar.a, yciVar, ild.C(605686966, new tik(i4, urpVar), oq5Var12), oq5Var12, 384);
                    oq5Var12.p(false);
                } else {
                    if (!(wrpVar instanceof vrp)) {
                        throw vz1.i((oq5) hq5Var9, -1669184255, false);
                    }
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    oq5Var13.Z(-204512685);
                    vrp vrpVar = (vrp) wrpVar;
                    int size = vrpVar.a.size();
                    ynn i9 = irv.i(oq5Var13);
                    gjl gjlVar = vrpVar.b;
                    boolean h2 = oq5Var13.h(lrpVar);
                    Object K4 = oq5Var13.K();
                    if (h2 || K4 == kjnVar) {
                        K4 = new tik(i3, lrpVar);
                        oq5Var13.k0(K4);
                    }
                    trp.j(size, com.yandex.music.core.ui.compose.a.c(yciVar, i9, gjlVar, (pyc) K4, 14), ild.C(1198280287, new f6p(5, vrpVar, lrpVar), oq5Var13), oq5Var13, 384);
                    oq5Var13.p(false);
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                trp.c((rqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                trp.e((tqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                trp.l((arp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                trp.f((uqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                trp.g((vqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                trp.d((sqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                if5 if5Var = (if5) obj4;
                wn5 wn5Var2 = (wn5) obj3;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                int ordinal = if5Var.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    oq5 oq5Var15 = (oq5) hq5Var10;
                    oq5Var15.Z(74242551);
                    j = ((dq0) oq5Var15.j(eq0.a)).a.a;
                    oq5Var15.p(false);
                } else if (ordinal == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var10;
                    oq5Var16.Z(74244793);
                    j = ((dq0) oq5Var16.j(eq0.a)).a.c;
                    oq5Var16.p(false);
                } else {
                    if (ordinal != 3) {
                        throw vz1.i((oq5) hq5Var10, 74238978, false);
                    }
                    oq5 oq5Var17 = (oq5) hq5Var10;
                    oq5Var17.Z(74246904);
                    j = ((dq0) oq5Var17.j(eq0.a)).a.e;
                    oq5Var17.p(false);
                }
                zwf.i(j, ild.C(1557708497, new ion(wn5Var2, i2), hq5Var10), hq5Var10, 48);
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                trp.h((brp) obj4, (lrp) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                trp.k((wqp) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                zwf.k((shq) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                bzf.i((ejq) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                rzf.k((i1r) obj4, (yci) obj3, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 26:
                jnq jnqVar = (jnq) obj3;
                pvf pvfVar2 = (pvf) obj;
                pvfVar2.getClass();
                ((gnq) obj2).getClass();
                pvfVar2.a(new String[]{"MIXES_MUSIC", "MIXES_GRID"}, new qh1((tmb) obj4, i5));
                pvfVar2.a(new String[]{"NON_MUSIC_EDITORIAL_COMPILATION", "CHART_ALBUMS"}, new ph1(jnqVar, i5));
                pvfVar2.a(new String[]{"NON_MUSIC_RECENTLY_PLAYED"}, new ph1(jnqVar, 15));
                pvfVar2.a(new String[]{"ITEM_LIST"}, new ph1(jnqVar, i4));
                pvfVar2.a(new String[]{"OVERVIEW"}, new ph1(jnqVar, i3));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                ldg.e((hvq) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hvq hvqVar = (hvq) obj4;
                uvq uvqVar = (uvq) obj3;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var11;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                yvq.a(hvqVar, (vvo) uvqVar.j.c.getValue(), androidx.compose.foundation.a.b(vciVar, ((dq0) ((oq5) hq5Var11).j(eq0.a)).c.a, vnj.i), hq5Var11, 0);
                return Unit.a;
            default:
                String str4 = (String) obj4;
                d85 d85Var3 = (d85) obj3;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var12;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var20 = (oq5) hq5Var12;
                if (str4 == null) {
                    oq5Var20.Z(1739471582);
                } else {
                    oq5Var20.Z(1739471583);
                    ocg.e(str4, jtq.d, d.e(vciVar, gwq.c), d85Var3, oq5Var20, 432, 0);
                }
                oq5Var20.p(false);
                return Unit.a;
        }
    }

    public /* synthetic */ hon(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hon(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
