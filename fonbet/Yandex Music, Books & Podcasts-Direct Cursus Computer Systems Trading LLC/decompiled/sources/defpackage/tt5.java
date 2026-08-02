package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class tt5 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt5(a8a a8aVar) {
        this.a = 9;
        this.b = a8aVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        qcj qcjVar = (qcj) this.b;
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
        jzb jzbVar = qcjVar.f;
        boolean z = jzbVar != null;
        xme E = ox6.E(jzbVar, 0L, hq5Var, 6);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(qcjVar.a);
        String sb2 = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((jn0) arrayList.get(i)).a(sb.length()));
        }
        xv7.i(new mn0(sb2, arrayList2), a.o(d.d(vci.a, 1.0f), 16, 0.0f, 2), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 4, 0, bow.l(E), null, nu0.b(), z ? bow.k(cVar, new xme[]{E}) : null, null, hq5Var, 48, 134220848, 612344);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        usj usjVar = (usj) this.b;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            xme x = ox6.x(null, oq5Var, 7);
            mn0 mn0Var = new mn0(usjVar.a);
            float f = r43.a;
            ges b = r43.b();
            long j = ((dq0) oq5Var.j(eq0.a)).b.a;
            LinkedHashMap l = bow.l(x);
            pn0 k = bow.k(cVar, new xme[]{x});
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new hpj(10);
                oq5Var.k0(K);
            }
            xv7.i(mn0Var, androidx.compose.ui.platform.a.a(nfp.b(vci.a, false, (Function1) K), "open_playlist_title"), j, 0L, 0L, 0, 0L, 0, false, 2, 0, l, null, b, k, null, oq5Var, 0, 134220800, 614392);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                wct wctVar = (wct) obj4;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((dsf) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                fgq.i(new dt5(true), null, hq5Var, 0);
                return Unit.a;
            case 1:
                d31 d31Var = (d31) obj4;
                g31 g31Var = (g31) obj;
                hq5 hq5Var2 = (hq5) obj2;
                ((Integer) obj3).getClass();
                g31Var.getClass();
                if (g31Var instanceof e31) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    oq5Var2.Z(1427329644);
                    vut.p(((e31) g31Var).a, oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    if (!(g31Var instanceof f31)) {
                        throw vz1.i((oq5) hq5Var2, 1427327850, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    oq5Var3.Z(1297703300);
                    f31 f31Var = (f31) g31Var;
                    tdl tdlVar = f31Var.c;
                    boolean h = oq5Var3.h(d31Var) | oq5Var3.h(g31Var);
                    Object K = oq5Var3.K();
                    if (h || K == kjnVar) {
                        K = new qi(d31Var, g31Var, (Continuation) null, 29);
                        oq5Var3.k0(K);
                    }
                    gld.w(oq5Var3, tdlVar, (Function2) K);
                    String str = f31Var.a;
                    long F = nt0.F(f31Var.b, oq5Var3, 2);
                    obh g0 = hdg.g0("concert: " + tdlVar.a.a, oq5Var3);
                    boolean h2 = oq5Var3.h(d31Var) | oq5Var3.h(g31Var);
                    Object K2 = oq5Var3.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new aw5(1, d31Var, g31Var);
                        oq5Var3.k0(K2);
                    }
                    bcx.a(2131231422, str, F, g0, (Function0) K2, null, oq5Var3, 4096);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 2:
                g36 g36Var = (g36) obj4;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    fgq.i(new dt5(g36Var.a), null, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                mcu mcuVar = (mcu) obj4;
                wxk wxkVar = (wxk) obj;
                hq5 hq5Var4 = (hq5) obj2;
                ((Integer) obj3).getClass();
                wxkVar.getClass();
                qld.g(wxkVar.b(), mcuVar, rzf.A(wxkVar), xp3.u(a.d(d.d(vciVar, 1.0f), 1.0f), o5g.C(hq5Var4)), hq5Var4, 0);
                return Unit.a;
            case 4:
                tmb tmbVar = (tmb) obj4;
                Function0 function0 = (Function0) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var5).h(function0) ? 4 : 2;
                }
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean z2 = (intValue3 & 14) == 4;
                    Object K3 = oq5Var5.K();
                    if (z2 || K3 == kjnVar) {
                        K3 = new ex(7, function0);
                        oq5Var5.k0(K3);
                    }
                    rvf.j((Function1) K3, tmbVar, null, 0, false, null, oq5Var5, 64, 60);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                nt6 nt6Var = (nt6) obj4;
                c cVar = (c) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var6).f(cVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar = nt6Var.e;
                boolean z3 = jzbVar != null;
                xme E = ox6.E(jzbVar, 0L, hq5Var6, 6);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(nt6Var.b);
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(((jn0) arrayList.get(i2)).a(sb.length()));
                }
                xv7.i(new mn0(sb2, arrayList2), androidx.compose.ui.platform.a.a(a.o(d.d(vciVar, 1.0f), 24, 0.0f, 2), "credentials_bottom_sheet_title"), ((dq0) ((oq5) hq5Var6).j(eq0.a)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, bow.l(E), null, nu0.c(), z3 ? bow.k(cVar, new xme[]{E}) : null, null, hq5Var6, 48, 134217728, 622328);
                return Unit.a;
            case 6:
                o1s o1sVar = (o1s) obj4;
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var7 = (oq5) ((hq5) obj2);
                oq5Var7.Z(-100559267);
                float f = o1sVar.b;
                ov6 ov6Var = nya.a;
                sdr a = pk0.a(f, weo.S(250, 0, ov6Var, 2), null, oq5Var7, 0, 12);
                sdr a2 = pk0.a(o1sVar.a, weo.S(250, 0, ov6Var, 2), null, oq5Var7, 0, 12);
                yci x = d.x(d.d(yciVar, 1.0f), b2c.h, 2);
                boolean f2 = oq5Var7.f(a2);
                Object K4 = oq5Var7.K();
                Object obj5 = K4;
                if (f2 || K4 == kjnVar) {
                    xp xpVar = new xp(a2, 3);
                    oq5Var7.k0(xpVar);
                    obj5 = xpVar;
                }
                yci r = d.r(a.i(x, (Function1) obj5), ((cma) a.getValue()).a);
                oq5Var7.p(false);
                return r;
            case 7:
                qw qwVar = (qw) obj4;
                c cVar2 = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var7).f(cVar2) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                lt ltVar = qwVar.a.a.a;
                jzb jzbVar2 = ltVar.g;
                xme E2 = ox6.E(jzbVar2, 0L, hq5Var7, 6);
                xv7.i(new mn0(6, ltVar.c, (ArrayList) null), androidx.compose.ui.platform.a.a(vciVar, "promo_album_title"), ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(E2), null, nu0.j(), jzbVar2 != null ? bow.k(cVar2, new xme[]{E2}) : null, wct.p(cVar2), hq5Var7, 48, 134220848, 88056);
                return Unit.a;
            case 8:
                b61 b61Var = (b61) obj4;
                e61 e61Var = (e61) obj;
                hq5 hq5Var8 = (hq5) obj2;
                ((Integer) obj3).getClass();
                e61Var.getClass();
                if (e61Var instanceof c61) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    oq5Var9.Z(897344974);
                    vut.p(((c61) e61Var).a, oq5Var9, 0);
                    oq5Var9.p(false);
                } else {
                    if (!(e61Var instanceof d61)) {
                        throw vz1.i((oq5) hq5Var8, 897343135, false);
                    }
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    oq5Var10.Z(2048048241);
                    d61 d61Var = (d61) e61Var;
                    udl udlVar = d61Var.c;
                    boolean h3 = oq5Var10.h(b61Var) | oq5Var10.h(e61Var);
                    Object K5 = oq5Var10.K();
                    if (h3 || K5 == kjnVar) {
                        K5 = new nz5(b61Var, e61Var, (Continuation) null, 11);
                        oq5Var10.k0(K5);
                    }
                    gld.w(oq5Var10, udlVar, (Function2) K5);
                    String str2 = d61Var.a;
                    long F2 = nt0.F(d61Var.b, oq5Var10, 2);
                    obh g02 = hdg.g0("donation: ".concat(udlVar.a.a), oq5Var10);
                    boolean h4 = oq5Var10.h(b61Var) | oq5Var10.h(e61Var);
                    Object K6 = oq5Var10.K();
                    if (h4 || K6 == kjnVar) {
                        K6 = new aw5(22, b61Var, e61Var);
                        oq5Var10.k0(K6);
                    }
                    bcx.a(R.drawable.ic_donate_32, str2, F2, g02, (Function0) K6, null, oq5Var10, 4096);
                    oq5Var10.p(false);
                }
                return Unit.a;
            case 9:
                a8a a8aVar = (a8a) obj4;
                c cVar3 = (c) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var9).f(cVar3) ? 4 : 2;
                }
                oq5 oq5Var11 = (oq5) hq5Var9;
                if (oq5Var11.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    pm0.a(null, ild.C(-1180143187, new kw5(a8aVar, cVar3), oq5Var11), oq5Var11, 48, 1);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 10:
                laa laaVar = (laa) obj4;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue7 & 17) == 16) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                quj.k(laaVar, null, hq5Var10, 0);
                return Unit.a;
            case 11:
                eha ehaVar = (eha) obj4;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    boolean h5 = oq5Var13.h(ehaVar);
                    Object K7 = oq5Var13.K();
                    if (h5 || K7 == kjnVar) {
                        dda ddaVar = new dda(0, ehaVar, eha.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 10);
                        oq5Var13.k0(ddaVar);
                        K7 = ddaVar;
                    }
                    a0g.q((Function0) ((h9f) K7), null, oq5Var13, 0);
                    boolean h6 = oq5Var13.h(ehaVar);
                    Object K8 = oq5Var13.K();
                    if (h6 || K8 == kjnVar) {
                        dda ddaVar2 = new dda(0, ehaVar, eha.class, "onSearchClicked", "onSearchClicked()V", 0, 11);
                        oq5Var13.k0(ddaVar2);
                        K8 = ddaVar2;
                    }
                    a0g.o(48, 4, 0L, oq5Var13, androidx.compose.ui.platform.a.a(vciVar, "toolbar_search_button"), (Function0) ((h9f) K8));
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 12:
                d2b d2bVar = (d2b) obj4;
                o1b o1bVar = (o1b) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                o1bVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var12).f(o1bVar) ? 4 : 2;
                }
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (!oq5Var14.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    oq5Var14.S();
                } else if (o1bVar instanceof m1b) {
                    oq5Var14.Z(-1292755268);
                    boolean z4 = ((m1b) o1bVar).a;
                    Object K9 = oq5Var14.K();
                    if (K9 == kjnVar) {
                        K9 = new rua(21);
                        oq5Var14.k0(K9);
                    }
                    qgg.w(z4, nfp.a(vciVar, (Function1) K9), 1, false, oq5Var14, 3456, 0);
                    oq5Var14.p(false);
                } else {
                    if (!(o1bVar instanceof n1b)) {
                        throw vz1.i(oq5Var14, -1292757024, false);
                    }
                    oq5Var14.Z(-1292746711);
                    q6k.e((n1b) o1bVar, d2bVar, null, oq5Var14, intValue9 & 14);
                    oq5Var14.p(false);
                }
                return Unit.a;
            case 13:
                sp1 sp1Var = (sp1) obj;
                int intValue10 = ((Integer) obj3).intValue();
                sp1Var.getClass();
                saf.f(sp1Var, (nii) obj4, (hq5) obj2, intValue10 & 14);
                return Unit.a;
            case 14:
                yfx yfxVar = (yfx) obj4;
                mhq mhqVar = (mhq) obj;
                ((Integer) obj3).getClass();
                mhqVar.getClass();
                oq5 oq5Var15 = (oq5) ((hq5) obj2);
                Object K10 = oq5Var15.K();
                if (K10 == kjnVar) {
                    K10 = new shq(mhqVar, (lf5) ((ijl) yfxVar.b).a.getValue());
                    oq5Var15.k0(K10);
                }
                zwf.k((shq) K10, null, oq5Var15, 0);
                return Unit.a;
            case 15:
                vyb vybVar = (vyb) obj4;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var16 = (oq5) hq5Var13;
                if (oq5Var16.P(intValue11 & 1, (intValue11 & 17) != 16)) {
                    xcs.b(vybVar.c, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var16, 0, 0, 131070);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 16:
                m1v m1vVar = (m1v) obj4;
                c3v c3vVar = (c3v) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                iz2 iz2Var = b2c.f;
                yci c = d.c(vciVar, 1.0f);
                kfh d = ug3.d(iz2Var, false);
                oq5 oq5Var17 = (oq5) hq5Var14;
                int i3 = oq5Var17.P;
                androidx.compose.runtime.internal.a l = oq5Var17.l();
                yci H = vnj.H(hq5Var14, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var17.d0();
                if (oq5Var17.O) {
                    oq5Var17.k(grbVar);
                } else {
                    oq5Var17.n0();
                }
                g0g.U(hq5Var14, d, wp5.f);
                g0g.U(hq5Var14, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var17.O || !Intrinsics.d(oq5Var17.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var17, i3, kb5Var);
                }
                g0g.U(hq5Var14, H, wp5.d);
                if (c3vVar == null || !(c3vVar.c || c3vVar.b.a())) {
                    oq5Var17.Z(289423177);
                    Object K11 = oq5Var17.K();
                    if (K11 == kjnVar) {
                        K11 = new g4d(27);
                        oq5Var17.k0(K11);
                    }
                    h4a.o(nfp.b(vciVar, false, (Function1) K11), hq5Var14, 0);
                    oq5Var17.p(false);
                } else {
                    oq5Var17.Z(288571638);
                    oq5Var17.Z(1671878771);
                    Object j = oq5Var17.j(our.a);
                    tur turVar = (tur) (((Boolean) oq5Var17.j(vpg.a)).booleanValue() ? j : null);
                    oq5Var17.p(false);
                    yci o = a.o(vciVar, 40, 0.0f, 2);
                    Object K12 = oq5Var17.K();
                    if (K12 == kjnVar) {
                        K12 = new g4d(26);
                        oq5Var17.k0(K12);
                    }
                    yci b = nfp.b(o, false, (Function1) K12);
                    boolean f3 = oq5Var17.f(turVar) | oq5Var17.h(m1vVar);
                    Object K13 = oq5Var17.K();
                    if (f3 || K13 == kjnVar) {
                        K13 = new zya(13, turVar, m1vVar);
                        oq5Var17.k0(K13);
                    }
                    j3v.a(c3vVar, (Function0) K13, b, hq5Var14, intValue12 & 14);
                    oq5Var17.p(false);
                }
                oq5Var17.p(true);
                return Unit.a;
            case 17:
                xme xmeVar = (xme) obj4;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue13 & 17) == 16) {
                    oq5 oq5Var18 = (oq5) hq5Var15;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                xmeVar.d.invoke(hq5Var15, 0);
                return Unit.a;
            case 18:
                lze lzeVar = (lze) obj4;
                rze rzeVar = (rze) obj;
                hq5 hq5Var16 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                rzeVar.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var16).f(rzeVar) ? 4 : 2;
                }
                oq5 oq5Var19 = (oq5) hq5Var16;
                if (!oq5Var19.P(intValue14 & 1, (intValue14 & 19) != 18)) {
                    oq5Var19.S();
                } else if (rzeVar instanceof qze) {
                    oq5Var19.Z(291756336);
                    gld.t((qze) rzeVar, lzeVar, null, null, oq5Var19, intValue14 & 14, 12);
                    oq5Var19.p(false);
                } else {
                    if (!(rzeVar instanceof pze)) {
                        throw vz1.i(oq5Var19, 291754493, false);
                    }
                    oq5Var19.Z(291761334);
                    gld.s((pze) rzeVar, null, oq5Var19, intValue14 & 14);
                    oq5Var19.p(false);
                }
                return Unit.a;
            case 19:
                x1g x1gVar = (x1g) obj4;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var17 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((oq5) hq5Var17).f(dh3Var) ? 4 : 2;
                }
                oq5 oq5Var20 = (oq5) hq5Var17;
                if (oq5Var20.P(intValue15 & 1, (intValue15 & 19) != 18)) {
                    if (x1gVar.b) {
                        oq5Var20.Z(23133960);
                        w4k E3 = a0g.E(R.drawable.ic_plus_bookmate_multicolor_18, 0, oq5Var20);
                        yci a3 = dh3Var.a(vciVar, b2c.j);
                        float f4 = 4;
                        irf.r(E3, null, androidx.compose.ui.platform.a.a(d.e(a.q(a3, 0.0f, 0.0f, f4, f4, 3), 18), "non_music_grid_item_badge"), null, null, 0.0f, null, oq5Var20, 48, 120);
                    } else {
                        oq5Var20.Z(21463308);
                    }
                    oq5Var20.p(false);
                } else {
                    oq5Var20.S();
                }
                return Unit.a;
            case 20:
                w3g w3gVar = (w3g) obj4;
                hq5 hq5Var18 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue16 & 17) == 16) {
                    oq5 oq5Var21 = (oq5) hq5Var18;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                ivf.p(48, hq5Var18, d.c(vciVar, 1.0f), w3gVar.c);
                return Unit.a;
            case 21:
                l1h l1hVar = (l1h) obj4;
                c cVar4 = (c) obj;
                hq5 hq5Var19 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                cVar4.getClass();
                if ((intValue17 & 6) == 0) {
                    z = true;
                    intValue17 |= ((oq5) hq5Var19).f(cVar4) ? 4 : 2;
                } else {
                    z = true;
                }
                if ((intValue17 & 19) == 18) {
                    oq5 oq5Var22 = (oq5) hq5Var19;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                jzb jzbVar3 = l1hVar.f;
                boolean z5 = jzbVar3 != null ? z : false;
                xme E4 = ox6.E(jzbVar3, 0L, hq5Var19, 6);
                StringBuilder sb3 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                new ArrayList();
                sb3.append(l1hVar.b);
                String sb4 = sb3.toString();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList4.add(((jn0) arrayList3.get(i4)).a(sb3.length()));
                }
                xv7.i(new mn0(sb4, arrayList4), a.o(d.d(vciVar, 1.0f), 24, 0.0f, 2), ((dq0) ((oq5) hq5Var19).j(eq0.a)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, bow.l(E4), null, nu0.c(), z5 ? bow.k(cVar4, new xme[]{E4}) : null, null, hq5Var19, 48, 134217728, 622328);
                return Unit.a;
            case 22:
                qqi qqiVar = (qqi) obj4;
                qqi.h.set(qqiVar, null);
                qqiVar.b(null);
                return Unit.a;
            case 23:
                dvi dviVar = (dvi) obj4;
                hq5 hq5Var20 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var23 = (oq5) hq5Var20;
                if (oq5Var23.P(intValue18 & 1, (intValue18 & 17) != 16)) {
                    boolean h7 = oq5Var23.h(dviVar);
                    Object K14 = oq5Var23.K();
                    if (h7 || K14 == kjnVar) {
                        sui suiVar = new sui(0, dviVar, dvi.class, "onShowLikesClick", "onShowLikesClick()V", 0, 2);
                        oq5Var23.k0(suiVar);
                        K14 = suiVar;
                    }
                    swf.l((Function0) ((h9f) K14), androidx.compose.ui.platform.a.a(vciVar, "my_shelf_show_more_likes"), null, null, oq5Var23, 48, 12);
                } else {
                    oq5Var23.S();
                }
                return Unit.a;
            case 24:
                hq5 hq5Var21 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                String M = rvf.M(R.string.rup_block_title, hq5Var21);
                ((awi) obj4).getClass();
                zvi zviVar = zvi.a;
                if (!zviVar.equals(zviVar)) {
                    throw vz1.i((oq5) hq5Var21, 326090603, false);
                }
                oq5 oq5Var24 = (oq5) hq5Var21;
                oq5Var24.Z(326091505);
                o6g a4 = awi.a(oq5Var24);
                oq5Var24.p(false);
                zdg.f(M, a4, null, hq5Var21, 0);
                return Unit.a;
            case 25:
                o2j o2jVar = (o2j) obj4;
                kht khtVar = (kht) obj;
                hq5 hq5Var22 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                khtVar.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((oq5) hq5Var22).f(khtVar) ? 4 : 2;
                }
                oq5 oq5Var25 = (oq5) hq5Var22;
                if (!oq5Var25.P(intValue19 & 1, (intValue19 & 19) != 18)) {
                    oq5Var25.S();
                } else if (khtVar instanceof xgt) {
                    oq5Var25.Z(1460706474);
                    zwf.d((xgt) khtVar, o2jVar, null, oq5Var25, intValue19 & 14);
                    oq5Var25.p(false);
                } else {
                    if (!(khtVar instanceof kgt)) {
                        throw vz1.i(oq5Var25, 1460705023, false);
                    }
                    oq5Var25.Z(1460711058);
                    zwf.c((kgt) khtVar, null, oq5Var25, intValue19 & 14);
                    oq5Var25.p(false);
                }
                return Unit.a;
            case 26:
                return a(obj, obj2, obj3);
            case 27:
                return d(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                q0k q0kVar = (q0k) obj4;
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                int L = mfhVar.L(q0kVar.c(mfhVar.getLayoutDirection()) + q0kVar.b(mfhVar.getLayoutDirection()));
                ksk M2 = ffhVar.M(ia6.i(((ga6) obj3).a, L, 0));
                return mfh.m0(mfhVar, M2.a - (L * 2), M2.b, new b4k(L, 0, M2));
            default:
                fik fikVar = (fik) obj4;
                pyc pycVar = (pyc) obj;
                hq5 hq5Var23 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                pycVar.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((oq5) hq5Var23).h(pycVar) ? 4 : 2;
                }
                if ((intValue20 & 19) == 18) {
                    oq5 oq5Var26 = (oq5) hq5Var23;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], (pu0) fikVar.a.invoke(), false, ild.C(-686664123, new wt2(pycVar, true ? 1 : 0), hq5Var23), hq5Var23, 0, 4);
                return Unit.a;
        }
    }

    public /* synthetic */ tt5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ tt5(qqi qqiVar, pqi pqiVar) {
        this.a = 22;
        this.b = qqiVar;
    }
}
