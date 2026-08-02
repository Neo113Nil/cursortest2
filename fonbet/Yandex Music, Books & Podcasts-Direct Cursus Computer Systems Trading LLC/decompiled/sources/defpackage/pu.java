package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pu(boolean z, bf4 bf4Var, um0 um0Var, d85 d85Var) {
        this.a = 1;
        float f = if4.a;
        this.b = z;
        this.c = bf4Var;
        this.d = um0Var;
        this.e = d85Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        Object obj4;
        Continuation continuation;
        float f;
        boolean z;
        yci q;
        float M;
        long j;
        ges b;
        int i = this.a;
        vci vciVar = vci.a;
        Object obj5 = gq5.a;
        boolean z2 = this.b;
        int i2 = 0;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ru ruVar = (ru) obj8;
                xme xmeVar = (xme) obj7;
                ges gesVar = (ges) obj6;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                xv7.i(new mn0(6, ruVar.b, (ArrayList) null), d.d(a.a(vciVar, "title"), 1.0f), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar), null, gesVar, z2 ? bow.k(cVar, new xme[]{xmeVar}) : null, null, hq5Var, 48, 134220848, 612344);
                return Unit.a;
            case 1:
                float f2 = if4.b;
                bf4 bf4Var = (bf4) obj8;
                um0 um0Var = (um0) obj7;
                d85 d85Var = (d85) obj6;
                c cVar2 = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                float f3 = if4.c;
                cVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                float c = cVar2.c();
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                boolean z3 = this.b;
                if (K == obj5) {
                    K = CollectionsKt.q0(bf4Var.c, (int) (z3 ? c / f2 : c / (f2 + if4.a)));
                    oq5Var3.k0(K);
                }
                List list2 = (List) K;
                vci vciVar2 = vci.a;
                yci o = androidx.compose.foundation.layout.a.o(z3 ? d.e(vciVar2, (Math.max(list2.size() - 1, 0) * f3) + (list2.size() * f2)) : vciVar2, 16, 0.0f, 2);
                ta5 a = sa5.a(qx0.e, b2c.n, oq5Var3, 6);
                int i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, o);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(function0);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, a, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var3, i3, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                oq5Var3.Z(-1111149321);
                int i4 = 0;
                for (Object obj9 : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u75.n();
                        throw null;
                    }
                    af4 af4Var = (af4) obj9;
                    um0 um0Var2 = um0Var;
                    oq5 oq5Var4 = oq5Var3;
                    vm0 b2 = fn0.b(i4, 0.0f, um0Var2, oq5Var4, 0, 2);
                    Object K2 = oq5Var4.K();
                    if (K2 == obj5) {
                        list = list2;
                        Object fk0Var = new fk0(new cma(um0Var2 == um0.a ? i2 : fn0.b), azt.c, null, 12);
                        oq5Var4.k0(fk0Var);
                        obj4 = fk0Var;
                    } else {
                        list = list2;
                        obj4 = K2;
                    }
                    fk0 fk0Var2 = (fk0) obj4;
                    Integer valueOf = Integer.valueOf(i4);
                    int i6 = i4;
                    boolean d = oq5Var4.d(um0Var2.ordinal()) | oq5Var4.h(fk0Var2) | oq5Var4.d(i6);
                    Object K3 = oq5Var4.K();
                    if (d || K3 == obj5) {
                        continuation = null;
                        K3 = new rs(um0Var2, fk0Var2, i6, continuation, 1);
                        oq5Var4.k0(K3);
                    } else {
                        continuation = null;
                    }
                    gld.y(um0Var2, valueOf, (Function2) K3, oq5Var4);
                    vm0 vm0Var = fk0Var2.c;
                    yci u = d.u(d.d(vciVar2, 1.0f), b2c.k, true);
                    if (z3) {
                        float f4 = i6 * f3;
                        f = f3;
                        z = false;
                        q = androidx.compose.foundation.layout.a.k(vciVar2, 0.0f, f4, 1);
                    } else {
                        f = f3;
                        z = false;
                        q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 12, 0.0f, 0.0f, 13);
                    }
                    yci f5 = u.f(q);
                    boolean f6 = oq5Var4.f(vm0Var);
                    Object K4 = oq5Var4.K();
                    Object obj10 = K4;
                    if (f6 || K4 == obj5) {
                        Object xpVar = new xp(vm0Var, 1);
                        oq5Var4.k0(xpVar);
                        obj10 = xpVar;
                    }
                    yci i7 = androidx.compose.foundation.layout.a.i(f5, (Function1) obj10);
                    boolean f7 = oq5Var4.f(b2);
                    Object K5 = oq5Var4.K();
                    Object obj11 = K5;
                    if (f7 || K5 == obj5) {
                        Object la1Var = new la1(b2, 15);
                        oq5Var4.k0(la1Var);
                        obj11 = la1Var;
                    }
                    yci s = wyf.s(i7, (Function0) obj11);
                    String str = af4Var.a;
                    String str2 = af4Var.b;
                    boolean z4 = i6 == u75.g(list) || !z3;
                    Integer valueOf2 = bf4Var.b ? Integer.valueOf(i5) : continuation;
                    boolean z5 = af4Var.d == etq.b;
                    String str3 = af4Var.c;
                    boolean f8 = oq5Var4.f(vm0Var);
                    Object K6 = oq5Var4.K();
                    if (f8 || K6 == obj5) {
                        K6 = new la1(vm0Var, 16);
                        oq5Var4.k0(K6);
                    }
                    qwp.p(str, z4, valueOf2, str3, d85Var, s, f2, str2, z5, z3, (Function0) K6, oq5Var4, ScreenMirroringConfig.Video.BITRATE_1_5MB);
                    list2 = list;
                    i4 = i5;
                    um0Var = um0Var2;
                    oq5Var3 = oq5Var4;
                    i2 = 0;
                    f3 = f;
                }
                oq5 oq5Var5 = oq5Var3;
                oq5Var5.p(i2);
                oq5Var5.p(true);
                return Unit.a;
            case 2:
                ut5 ut5Var = (ut5) obj8;
                bu5 bu5Var = (bu5) obj7;
                tsf tsfVar = (tsf) obj6;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(o0kVar) ? 4 : 2;
                }
                int i8 = intValue3;
                if ((i8 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var7 = (oq5) hq5Var3;
                boolean h = oq5Var7.h(ut5Var);
                Object K7 = oq5Var7.K();
                if (h || K7 == obj5) {
                    Object e65Var = new e65(0, ut5Var, ut5.class, "onRefreshScreen", "onRefreshScreen()V", 0, 5);
                    oq5Var7.k0(e65Var);
                    K7 = e65Var;
                }
                bfg.f(this.b, (Function0) ((h9f) K7), o0kVar, null, false, ild.C(-717585317, new wl(bu5Var, o0kVar, tsfVar, ut5Var, 29), oq5Var7), oq5Var7, ((i8 << 6) & 896) | 196608, 24);
                return Unit.a;
            case 3:
                pu0 pu0Var = (pu0) obj8;
                ew5 ew5Var = (ew5) obj7;
                nsh nshVar = (nsh) obj6;
                bci bciVar = (bci) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= (intValue4 & 8) == 0 ? ((oq5) hq5Var4).f(bciVar) : ((oq5) hq5Var4).h(bciVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var4;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(-291819936, new s43(bciVar, ew5Var, nshVar, this.b, 8), hq5Var4), hq5Var4, 0, 4);
                return Unit.a;
            case 4:
                ew5 ew5Var2 = (ew5) obj8;
                ges gesVar2 = (ges) obj6;
                ges gesVar3 = (ges) obj7;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue5 & 17) == 16) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                if (!z2) {
                    oq5 oq5Var10 = (oq5) hq5Var5;
                    oq5Var10.Z(-725290863);
                    n7w.j(ew5Var2, oq5Var10, 8);
                    oq5Var10.p(false);
                    return Unit.a;
                }
                oq5 oq5Var11 = (oq5) hq5Var5;
                oq5Var11.Z(-730313080);
                oq5Var11.p(false);
                lx0 lx0Var = qx0.e;
                gz2 gz2Var = b2c.o;
                yci e = d.e(vciVar, w1g.p(gesVar3, 0, oq5Var11, 0, 2) + w1g.p(gesVar2, 0, oq5Var11, 0, 2) + 10);
                ta5 a2 = sa5.a(lx0Var, gz2Var, oq5Var11, 54);
                int i9 = oq5Var11.P;
                androidx.compose.runtime.internal.a l2 = oq5Var11.l();
                yci H2 = vnj.H(oq5Var11, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar);
                } else {
                    oq5Var11.n0();
                }
                g0g.U(oq5Var11, a2, wp5.f);
                g0g.U(oq5Var11, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var11.O || !Intrinsics.d(oq5Var11.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var11, i9, kb5Var2);
                }
                g0g.U(oq5Var11, H2, wp5.d);
                oq5Var11.Z(1519852060);
                StringBuilder sb = new StringBuilder();
                sb.append(rvf.M(R.string.concert_tab_ticket_price_button_text, oq5Var11));
                sb.append(StringUtil.SPACE + ew5Var2.f);
                String sb2 = sb.toString();
                oq5Var11.p(false);
                agr agrVar = eq0.a;
                xcs.b(sb2, null, ((dq0) oq5Var11.j(agrVar)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar2, oq5Var11, 0, 3120, 55290);
                Integer num = ew5Var2.g;
                if (num != null) {
                    oq5Var11.Z(-128650228);
                    u1g.l(oq5Var11, d.e(vciVar, mu0.a));
                    xcs.b(rvf.N(R.string.concert_tab_price_button_cashback_text, new Object[]{num}, oq5Var11), null, d85.b(((dq0) oq5Var11.j(agrVar)).b.e, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar3, oq5Var11, 0, 3120, 55290);
                } else {
                    oq5Var11.Z(-134987310);
                }
                oq5Var11.p(false);
                oq5Var11.p(true);
                return Unit.a;
            case 5:
                xo6 xo6Var = (xo6) obj8;
                pbu pbuVar = (pbu) obj7;
                qan qanVar = (qan) obj6;
                xxk xxkVar = (xxk) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xxkVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(xxkVar) ? 4 : 2;
                }
                oq5 oq5Var12 = (oq5) hq5Var6;
                if (oq5Var12.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    xee.g(xxkVar, xo6Var, this.b, pbuVar, xxkVar.equals(qanVar.b), oq5Var12, intValue6 & 14);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 6:
                pyc pycVar = (pyc) obj8;
                v1g v1gVar = (v1g) obj7;
                w3g w3gVar = (w3g) obj6;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var13 = (oq5) hq5Var7;
                if (oq5Var13.P(intValue7 & 1, (intValue7 & 17) != 16)) {
                    if (z2) {
                        oq5Var13.Z(1026311028);
                        M = j66.M(zpd.k, oq5Var13);
                        oq5Var13.p(false);
                    } else {
                        oq5Var13.Z(1026419063);
                        M = j66.M(zpd.j, oq5Var13);
                        oq5Var13.p(false);
                    }
                    yci e2 = d.e(vciVar, M);
                    nho a3 = lho.a(qx0.a, b2c.k, oq5Var13, 0);
                    int i10 = oq5Var13.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var13.l();
                    yci H3 = vnj.H(oq5Var13, e2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(grbVar2);
                    } else {
                        oq5Var13.n0();
                    }
                    kb5 kb5Var3 = wp5.f;
                    g0g.U(oq5Var13, a3, kb5Var3);
                    kb5 kb5Var4 = wp5.e;
                    g0g.U(oq5Var13, l3, kb5Var4);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i10))) {
                        ouj.x(i10, oq5Var13, i10, kb5Var5);
                    }
                    kb5 kb5Var6 = wp5.d;
                    g0g.U(oq5Var13, H3, kb5Var6);
                    kfh d2 = ug3.d(b2c.b, false);
                    int i11 = oq5Var13.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var13.l();
                    yci H4 = vnj.H(oq5Var13, vciVar);
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(grbVar2);
                    } else {
                        oq5Var13.n0();
                    }
                    g0g.U(oq5Var13, d2, kb5Var3);
                    g0g.U(oq5Var13, l4, kb5Var4);
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i11))) {
                        ouj.x(i11, oq5Var13, i11, kb5Var5);
                    }
                    g0g.U(oq5Var13, H4, kb5Var6);
                    if (pycVar == null) {
                        oq5Var13.Z(1929752248);
                    } else {
                        oq5Var13.Z(1929752249);
                        pycVar.invoke(b.a, oq5Var13, 6);
                    }
                    oq5Var13.p(false);
                    oq5Var13.p(true);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var13, 0);
                    int i12 = oq5Var13.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var13.l();
                    yci H5 = vnj.H(oq5Var13, vciVar);
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(grbVar2);
                    } else {
                        oq5Var13.n0();
                    }
                    g0g.U(oq5Var13, a4, kb5Var3);
                    g0g.U(oq5Var13, l5, kb5Var4);
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i12))) {
                        ouj.x(i12, oq5Var13, i12, kb5Var5);
                    }
                    g0g.U(oq5Var13, H5, kb5Var6);
                    j66.r(v1gVar.a, null, v1gVar.c, zpd.j.a, oq5Var13, 0, 2);
                    u1g.l(oq5Var13, d.e(vciVar, upd.a));
                    v3g.d(w3gVar, null, false, oq5Var13, 0, 6);
                    oq5Var13.p(true);
                    oq5Var13.p(true);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 7:
                g6p g6pVar = (g6p) obj8;
                tmb tmbVar = (tmb) obj7;
                lvf lvfVar = (lvf) obj6;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var8;
                if (oq5Var14.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    int i13 = lvf.f;
                    t7g.d(g6pVar, tmbVar, lvfVar, this.b, null, oq5Var14, 576);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 8:
                jzb jzbVar = (jzb) obj8;
                String str4 = (String) obj7;
                e9g e9gVar = (e9g) obj6;
                c cVar3 = (c) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(cVar3) ? 4 : 2;
                }
                oq5 oq5Var15 = (oq5) hq5Var9;
                if (oq5Var15.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    if (z2) {
                        oq5Var15.Z(-174080519);
                        j = ((dq0) oq5Var15.j(eq0.a)).b.a;
                    } else {
                        oq5Var15.Z(-174079461);
                        j = ((dq0) oq5Var15.j(eq0.a)).b.b;
                    }
                    oq5Var15.p(false);
                    xme Q = ox6.Q(j, oq5Var15, 1);
                    xme E = ox6.E(jzbVar, j, oq5Var15, 2);
                    mn0 mn0Var = new mn0(str4);
                    if (e9gVar == e9g.b) {
                        oq5Var15.Z(-174068002);
                        b = nu0.j();
                    } else {
                        oq5Var15.Z(-174066820);
                        b = nu0.b();
                    }
                    oq5Var15.p(false);
                    ges gesVar4 = b;
                    LinkedHashMap l6 = bow.l(Q, E);
                    pn0 k = bow.k(cVar3, new xme[]{Q, E});
                    yci a5 = a.a(d.d(vciVar, 1.0f), "clip_title");
                    boolean f9 = oq5Var15.f(str4);
                    Object K8 = oq5Var15.K();
                    if (f9 || K8 == obj5) {
                        K8 = new srp(str4, r14);
                        oq5Var15.k0(K8);
                    }
                    xv7.i(mn0Var, com.yandex.music.core.ui.compose.b.c(nfp.b(a5, false, (Function1) K8), "enabled", Boolean.valueOf(z2)), j, 0L, 0L, 0, 0L, 2, false, 1, 0, l6, null, gesVar4, k, null, oq5Var15, 0, 134220848, 612344);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            default:
                gy7 gy7Var = (gy7) obj8;
                vus vusVar = (vus) obj7;
                sai saiVar = (sai) obj6;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue10 & 17) == 16) {
                    oq5 oq5Var16 = (oq5) hq5Var10;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var17 = (oq5) hq5Var10;
                boolean h2 = oq5Var17.h(vusVar) | oq5Var17.f(saiVar);
                Object K9 = oq5Var17.K();
                if (h2 || K9 == obj5) {
                    K9 = new wes(r14, vusVar, saiVar);
                    oq5Var17.k0(K9);
                }
                Function1 function1 = (Function1) K9;
                if (!z2) {
                    function1 = null;
                }
                pd.k(gy7Var, function1, null, oq5Var17, 8);
                return Unit.a;
        }
    }

    public /* synthetic */ pu(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ pu(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ pu(ru ruVar, xme xmeVar, boolean z, ges gesVar) {
        this.a = 0;
        this.c = ruVar;
        this.d = xmeVar;
        this.b = z;
        this.e = gesVar;
    }

    public /* synthetic */ pu(boolean z, ew5 ew5Var, ges gesVar, ges gesVar2) {
        this.a = 4;
        this.b = z;
        this.c = ew5Var;
        this.e = gesVar;
        this.d = gesVar2;
    }

    public /* synthetic */ pu(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
