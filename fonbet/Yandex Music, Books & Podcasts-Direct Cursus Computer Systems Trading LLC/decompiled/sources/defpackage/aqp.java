package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class aqp implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aqp(String str, String str2, String str3) {
        this.a = 7;
        this.d = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v111, types: [yci] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rmb rmbVar;
        cvo cvoVar;
        boolean z;
        ?? f;
        switch (this.a) {
            case 0:
                n53 n53Var = (n53) this.d;
                eqp eqpVar = (eqp) this.b;
                x8l x8lVar = (x8l) this.c;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    qgg.f(n53Var, eqpVar, (yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                k53 k53Var = (k53) this.d;
                eqp eqpVar2 = (eqp) this.b;
                x8l x8lVar2 = (x8l) this.c;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    pd.p(k53Var, eqpVar2, (yci) x8lVar2.invoke(oq5Var2, 0), oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                x53 x53Var = (x53) this.d;
                eqp eqpVar3 = (eqp) this.b;
                x8l x8lVar3 = (x8l) this.c;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    q5g.p(x53Var, eqpVar3, (yci) x8lVar3.invoke(oq5Var3, 0), oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                d53 d53Var = (d53) this.d;
                eqp eqpVar4 = (eqp) this.b;
                x8l x8lVar4 = (x8l) this.c;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    ltg.g(d53Var, eqpVar4, (yci) x8lVar4.invoke(oq5Var4, 0), oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                hvq hvqVar = (hvq) this.d;
                yci yciVar = (yci) this.b;
                vvo vvoVar = (vvo) this.c;
                lwq lwqVar = (lwq) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                lwqVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(lwqVar) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                if (lwqVar instanceof iwq) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    oq5Var6.Z(2135035898);
                    ldg.e(hvqVar, d.c(yciVar, 1.0f), oq5Var6, 0);
                    oq5Var6.p(false);
                } else if (lwqVar.equals(jwq.a)) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    oq5Var7.Z(2135238080);
                    boolean h = oq5Var7.h(hvqVar);
                    Object K = oq5Var7.K();
                    if (h || K == gq5.a) {
                        vuq vuqVar = new vuq(0, hvqVar, hvq.class, "onBackClick", "onBackClick()V", 0, 1);
                        oq5Var7.k0(vuqVar);
                        K = vuqVar;
                    }
                    wdg.h((Function0) ((h9f) K), null, oq5Var7, 0);
                    oq5Var7.p(false);
                } else {
                    if (!(lwqVar instanceof kwq)) {
                        throw vz1.i((oq5) hq5Var5, -1732244408, false);
                    }
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    oq5Var8.Z(2135409200);
                    xvq.a((kwq) lwqVar, vvoVar, hvqVar, null, oq5Var8, intValue5 & 14);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 5:
                d85 d85Var = (d85) this.d;
                o0k o0kVar = (o0k) this.b;
                String str = (String) this.c;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var9 = (oq5) hq5Var6;
                if (oq5Var9.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                    pd.b(new qzm[0], true, ild.C(-444306092, new t2n(20, d85Var, o0kVar, str), oq5Var9), oq5Var9, 432, 0);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 6:
                tmb tmbVar = (tmb) this.d;
                pfr pfrVar = (pfr) this.b;
                jnq jnqVar = (jnq) this.c;
                s63 s63Var = (s63) obj;
                nfr nfrVar = (nfr) obj2;
                qnq qnqVar = (qnq) obj3;
                s63Var.getClass();
                nfrVar.getClass();
                qnqVar.getClass();
                yer yerVar = (yer) s63Var.a;
                rmb x = tmbVar != null ? q5g.x(tmbVar, s63Var) : null;
                nrf nrfVar = yerVar.a;
                String str2 = nrfVar.a;
                String str3 = nrfVar.b;
                wfr wfrVar = yerVar.d;
                hn5 hn5Var = qnqVar.b;
                moq moqVar = pfrVar.c;
                l13 l13Var = moqVar.c;
                rmb rmbVar2 = x;
                ct8 a = ((lzp) l13Var.a.D(hag.I(lzp.class), l13Var, l13Var.b)).a(moqVar.b);
                loq loqVar = pfrVar.a;
                if (rmbVar2 == null) {
                    rmbVar = new rmb(new uqi(gfo.Unknown), (jnqVar == null || (cvoVar = jnqVar.b) == null) ? new cvo(wjb.ExpandedPlayerScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60) : cvoVar, new lab(1, 0, 0, "1", yerVar.a.a), null, false, btf.b(new tka(19)), new x6s(26));
                } else {
                    rmbVar = rmbVar2;
                }
                loqVar.getClass();
                qnqVar.getClass();
                g73 g73Var = new g73(str2, str3, new wn5(new vl1(nfrVar, wfrVar, hn5Var, a, new qne(new lhq(qnqVar, 1), rmbVar), pfrVar, str2, 11), -734920667, true), (cma) null, 24);
                xdr xdrVar = nfrVar.b;
                xdrVar.getClass();
                return new cyd(g73Var, xdrVar);
            case 7:
                String str4 = (String) this.d;
                String str5 = (String) this.b;
                String str6 = (String) this.c;
                c cVar = (c) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var10 = (oq5) hq5Var7;
                if (oq5Var10.P(intValue7 & 1, (intValue7 & 19) != 18)) {
                    ids O = o5g.O(0, 1, oq5Var10);
                    ges j = nu0.j();
                    cds a2 = ids.a(O, str4, j, 0, false, 0, cVar.b, 988);
                    ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var10, 0);
                    int i = oq5Var10.P;
                    androidx.compose.runtime.internal.a l = oq5Var10.l();
                    vci vciVar = vci.a;
                    yci H = vnj.H(oq5Var10, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var10.d0();
                    if (oq5Var10.O) {
                        oq5Var10.k(grbVar);
                    } else {
                        oq5Var10.n0();
                    }
                    g0g.U(oq5Var10, a3, wp5.f);
                    g0g.U(oq5Var10, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var10, i, kb5Var);
                    }
                    g0g.U(oq5Var10, H, wp5.d);
                    agr agrVar = eq0.a;
                    long j2 = ((dq0) oq5Var10.j(agrVar)).b.a;
                    boolean f2 = oq5Var10.f(str5);
                    Object K2 = oq5Var10.K();
                    if (f2 || K2 == gq5.a) {
                        K2 = new srp(str5, 8);
                        oq5Var10.k0(K2);
                    }
                    xcs.b(str4, nfp.b(vciVar, false, (Function1) K2), j2, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, j, oq5Var10, 0, 3120, 55288);
                    oq5 oq5Var11 = oq5Var10;
                    if (a2.b.f >= 3 || str6 == null) {
                        z = false;
                        oq5Var11.Z(-136505528);
                    } else {
                        oq5Var11.Z(-129548539);
                        u1g.l(oq5Var11, d.e(vciVar, 2));
                        xcs.b(str6, null, ((dq0) oq5Var11.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, nu0.i(), oq5Var11, 0, 3120, 55290);
                        oq5Var11 = oq5Var11;
                        z = false;
                    }
                    oq5Var11.p(z);
                    oq5Var11.p(true);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 8:
                pu0 pu0Var = (pu0) this.d;
                kt6 kt6Var = (kt6) this.b;
                mqs mqsVar = (mqs) this.c;
                bci bciVar = (bci) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= (intValue8 & 8) == 0 ? ((oq5) hq5Var8).f(bciVar) : ((oq5) hq5Var8).h(bciVar) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var13 = (oq5) hq5Var8;
                tmb tmbVar2 = ((hai) oq5Var13.j(iai.a)).b;
                mqsVar.getClass();
                tmbVar2.getClass();
                xts xtsVar = (xts) kt6Var.a.a.getValue();
                xtsVar.getClass();
                boolean h2 = oq5Var13.h(mqsVar) | oq5Var13.h(xtsVar);
                Object K3 = oq5Var13.K();
                kjn kjnVar = gq5.a;
                if (h2 || K3 == kjnVar) {
                    K3 = new wes(3, mqsVar, xtsVar);
                    oq5Var13.k0(K3);
                }
                Function1 function1 = (Function1) K3;
                oq5Var13.a0(419377738);
                kfu a4 = rpg.a(oq5Var13);
                if (a4 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(bus.class), a4, null, k5r.g(bus.class, new p97(1), function1), a4 instanceof ssd ? ((ssd) a4).getDefaultViewModelCreationExtras() : gs6.b, oq5Var13);
                oq5Var13.p(false);
                bus busVar = (bus) R;
                boolean f3 = oq5Var13.f(busVar) | oq5Var13.f(tmbVar2) | oq5Var13.f(xtsVar);
                Object K4 = oq5Var13.K();
                if (f3 || K4 == kjnVar) {
                    K4 = new yts(busVar, tmbVar2, (nmj) xtsVar.c.getValue());
                    oq5Var13.k0(K4);
                }
                kg5.e(pu0Var, bciVar, (yts) K4, androidx.compose.ui.platform.a.a(vci.a, "track_credentials_bottom_sheet"), oq5Var13, 3136 | ((intValue8 << 3) & 112));
                return Unit.a;
            case 9:
                pu0 pu0Var2 = (pu0) this.d;
                apo apoVar = (apo) this.b;
                Activity activity = (Activity) this.c;
                bci bciVar2 = (bci) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bciVar2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= (intValue9 & 8) == 0 ? ((oq5) hq5Var9).f(bciVar2) : ((oq5) hq5Var9).h(bciVar2) ? 4 : 2;
                }
                if ((intValue9 & 19) == 18) {
                    oq5 oq5Var14 = (oq5) hq5Var9;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], pu0Var2, false, ild.C(1103195749, new kws(7, apoVar, activity, bciVar2), hq5Var9), hq5Var9, 0, 4);
                return Unit.a;
            case 10:
                pu0 pu0Var3 = (pu0) this.d;
                kt6 kt6Var2 = (kt6) this.b;
                x1u x1uVar = (x1u) this.c;
                bci bciVar3 = (bci) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bciVar3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= (intValue10 & 8) == 0 ? ((oq5) hq5Var10).f(bciVar3) : ((oq5) hq5Var10).h(bciVar3) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var15 = (oq5) hq5Var10;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var16 = (oq5) hq5Var10;
                tmb tmbVar3 = ((hai) oq5Var16.j(iai.a)).b;
                x1uVar.getClass();
                tmbVar3.getClass();
                h3u h3uVar = (h3u) kt6Var2.a.b.getValue();
                h3uVar.getClass();
                boolean h3 = oq5Var16.h(x1uVar) | oq5Var16.h(h3uVar);
                Object K5 = oq5Var16.K();
                kjn kjnVar2 = gq5.a;
                if (h3 || K5 == kjnVar2) {
                    K5 = new wes(13, x1uVar, h3uVar);
                    oq5Var16.k0(K5);
                }
                Function1 function12 = (Function1) K5;
                oq5Var16.a0(419377738);
                kfu a5 = rpg.a(oq5Var16);
                if (a5 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R2 = ngg.R(ern.a(k3u.class), a5, null, k5r.g(k3u.class, new p97(1), function12), a5 instanceof ssd ? ((ssd) a5).getDefaultViewModelCreationExtras() : gs6.b, oq5Var16);
                oq5Var16.p(false);
                k3u k3uVar = (k3u) R2;
                boolean f4 = oq5Var16.f(k3uVar) | oq5Var16.f(tmbVar3) | oq5Var16.f(h3uVar);
                Object K6 = oq5Var16.K();
                if (f4 || K6 == kjnVar2) {
                    K6 = new i3u(k3uVar, tmbVar3, (nmj) h3uVar.c.getValue());
                    oq5Var16.k0(K6);
                }
                kg5.e(pu0Var3, bciVar3, (i3u) K6, androidx.compose.ui.platform.a.a(vci.a, "video_clip_credentials_bottom_sheet"), oq5Var16, 3136 | ((intValue10 << 3) & 112));
                return Unit.a;
            case 11:
                nru nruVar = (nru) this.d;
                aqi aqiVar = (aqi) this.b;
                fvf fvfVar = (fvf) this.c;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var11).f(o0kVar2) ? 4 : 2;
                }
                int i2 = intValue11;
                if ((i2 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var11;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                tru truVar = (tru) aqiVar.getValue();
                boolean k = truVar.k();
                boolean z2 = !(truVar instanceof rru);
                oq5 oq5Var18 = (oq5) hq5Var11;
                boolean h4 = oq5Var18.h(nruVar);
                Object K7 = oq5Var18.K();
                if (h4 || K7 == gq5.a) {
                    j6u j6uVar = new j6u(0, nruVar, nru.class, "onRefresh", "onRefresh()V", 0, 19);
                    oq5Var18.k0(j6uVar);
                    K7 = j6uVar;
                }
                bfg.f(k, (Function0) ((h9f) K7), o0kVar2, null, z2, ild.C(1303584769, new mqr(truVar, nruVar, o0kVar2, fvfVar, 8), oq5Var18), oq5Var18, ((i2 << 6) & 896) | 196608, 8);
                return Unit.a;
            case 12:
                ltu ltuVar = (ltu) this.d;
                aqi aqiVar2 = (aqi) this.b;
                sdr sdrVar = (sdr) this.c;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue12 & 17) == 16) {
                    oq5 oq5Var19 = (oq5) hq5Var12;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                r4v c = ltuVar.c(new spd(0, 1, 1), hq5Var12);
                oq5 oq5Var20 = (oq5) hq5Var12;
                Object K8 = oq5Var20.K();
                kjn kjnVar3 = gq5.a;
                if (K8 == kjnVar3) {
                    K8 = wg.E;
                    oq5Var20.k0(K8);
                }
                Function0 function0 = (Function0) K8;
                Object K9 = oq5Var20.K();
                if (K9 == kjnVar3) {
                    K9 = new xpp(27, aqiVar2);
                    oq5Var20.k0(K9);
                }
                Function0 function02 = (Function0) K9;
                Object K10 = oq5Var20.K();
                if (K10 == kjnVar3) {
                    K10 = new otu(sdrVar, aqiVar2);
                    oq5Var20.k0(K10);
                }
                hdg.y(function0, function02, (Function0) K10, c, null, oq5Var20, 438);
                return Unit.a;
            case 13:
                ltu ltuVar2 = (ltu) this.d;
                sdr sdrVar2 = (sdr) this.b;
                sdr sdrVar3 = (sdr) this.c;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue13 & 17) == 16) {
                    oq5 oq5Var21 = (oq5) hq5Var13;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                r4v c2 = ltuVar2.c(new spd(0, 1, 1), hq5Var13);
                oq5 oq5Var22 = (oq5) hq5Var13;
                Object K11 = oq5Var22.K();
                kjn kjnVar4 = gq5.a;
                if (K11 == kjnVar4) {
                    K11 = auu.b;
                    oq5Var22.k0(K11);
                }
                Function0 function03 = (Function0) K11;
                boolean f5 = oq5Var22.f(sdrVar2);
                Object K12 = oq5Var22.K();
                if (f5 || K12 == kjnVar4) {
                    K12 = new oj2(sdrVar2, 8);
                    oq5Var22.k0(K12);
                }
                Function0 function04 = (Function0) K12;
                boolean f6 = oq5Var22.f(sdrVar2);
                Object K13 = oq5Var22.K();
                if (f6 || K13 == kjnVar4) {
                    K13 = new stu(sdrVar3, sdrVar2, 1);
                    oq5Var22.k0(K13);
                }
                hdg.y(function03, function04, (Function0) K13, c2, null, oq5Var22, 6);
                return Unit.a;
            case 14:
                sdr sdrVar4 = (sdr) this.d;
                Function0 function05 = (Function0) this.b;
                poi poiVar = (poi) this.c;
                hq5 hq5Var14 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                long j3 = ((m2v) sdrVar4.getValue()).b;
                asq.p((long) (yhn.c(((t6k) poiVar).e(), 0.0f, 1.0f) * j3), j3, ((dq0) ((oq5) hq5Var14).j(eq0.a)).c.d, ((ylu) function05.invoke()).d, null, hq5Var14, 0);
                return Unit.a;
            case 15:
                Function0 function06 = (Function0) this.d;
                Function0 function07 = (Function0) this.b;
                yci yciVar2 = (yci) this.c;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var15).f(zknVar) ? 4 : 2;
                }
                if ((intValue14 & 19) == 18) {
                    oq5 oq5Var23 = (oq5) hq5Var15;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        return Unit.a;
                    }
                }
                bs1 k2 = zknVar.b.k();
                boolean z3 = k2 instanceof as1;
                vci vciVar2 = vci.a;
                kjn kjnVar5 = gq5.a;
                if (z3) {
                    oq5 oq5Var24 = (oq5) hq5Var15;
                    oq5Var24.Z(35937567);
                    w4k w4kVar = ((as1) k2).a;
                    boolean f7 = oq5Var24.f(function06);
                    Object K14 = oq5Var24.K();
                    if (f7 || K14 == kjnVar5) {
                        K14 = new ex(24, function06);
                        oq5Var24.k0(K14);
                    }
                    irf.r(w4kVar, null, androidx.compose.ui.layout.a.e(vciVar2, (Function1) K14), zknVar.d, zknVar.e, 0.0f, null, oq5Var24, 48, 96);
                    oq5Var24.p(false);
                } else if (Intrinsics.d(k2, xr1.a) || (k2 instanceof zr1)) {
                    oq5 oq5Var25 = (oq5) hq5Var15;
                    oq5Var25.Z(36372745);
                    boolean f8 = oq5Var25.f(function07);
                    Object K15 = oq5Var25.K();
                    if (f8 || K15 == kjnVar5) {
                        K15 = new ex(25, function07);
                        oq5Var25.k0(K15);
                    }
                    swf.e(0, 0, oq5Var25, androidx.compose.ui.layout.a.e(vciVar2, (Function1) K15));
                    oq5Var25.p(false);
                } else {
                    if (!(k2 instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var15, -1384315927, false);
                    }
                    oq5 oq5Var26 = (oq5) hq5Var15;
                    oq5Var26.Z(36607353);
                    qo6 qo6Var = qo6.d;
                    gce gceVar = gce.d;
                    boolean f9 = oq5Var26.f(function06);
                    Object K16 = oq5Var26.K();
                    if (f9 || K16 == kjnVar5) {
                        K16 = new ex(26, function06);
                        oq5Var26.k0(K16);
                    }
                    swf.d(qo6Var, gceVar, androidx.compose.ui.layout.a.e(vciVar2, (Function1) K16), yciVar2, 0L, ((dq0) oq5Var26.j(eq0.a)).c.b, false, oq5Var26, 54, 80);
                    oq5Var26.p(false);
                }
                return Unit.a;
            default:
                final fuw fuwVar = (fuw) this.d;
                Function1 function13 = (Function1) this.b;
                Function2 function2 = (Function2) this.c;
                ((Integer) obj3).getClass();
                ((yci) obj).getClass();
                oq5 oq5Var27 = (oq5) ((hq5) obj2);
                oq5Var27.Z(-1726563753);
                Object K17 = oq5Var27.K();
                kjn kjnVar6 = gq5.a;
                if (K17 == kjnVar6) {
                    K17 = tlm.f(gld.R(g.a, oq5Var27), oq5Var27);
                }
                tf6 X = gld.X(((fs5) K17).a, dm6.b().g);
                boolean f10 = oq5Var27.f(fuwVar) | oq5Var27.h(X) | oq5Var27.f(function13) | oq5Var27.h(function2);
                Object K18 = oq5Var27.K();
                if (f10 || K18 == kjnVar6) {
                    inr inrVar = new inr(function13, fuwVar, X, function2, (Continuation) null, 15);
                    oq5Var27.k0(inrVar);
                    K18 = inrVar;
                }
                vci vciVar3 = vci.a;
                f = vciVar3.f(new SuspendPointerInputElement(fuwVar, null, null, new dur((Function2) K18), 6));
                boolean f11 = oq5Var27.f(fuwVar);
                Object K19 = oq5Var27.K();
                if (f11 || K19 == kjnVar6) {
                    final int i3 = 0;
                    K19 = new Function1() { // from class: guw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i3) {
                                case 0:
                                    long Q = nt0.Q(((hqe) obj4).a);
                                    fuw fuwVar2 = fuwVar;
                                    fuwVar2.g = Q;
                                    fuwVar2.d();
                                    break;
                                default:
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    fuw fuwVar3 = fuwVar;
                                    zcoVar.k(fuwVar3.c());
                                    zcoVar.n(fuwVar3.c());
                                    zcoVar.x(((Number) fuwVar3.e.e()).floatValue());
                                    zcoVar.y(((Number) fuwVar3.f.e()).floatValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var27.k0(K19);
                }
                yci f12 = androidx.compose.ui.layout.a.f(vciVar3, (Function1) K19);
                if (((Boolean) fuwVar.h.getValue()).booleanValue()) {
                    vciVar3 = f;
                }
                yci f13 = f12.f(vciVar3);
                boolean f14 = oq5Var27.f(fuwVar);
                Object K20 = oq5Var27.K();
                if (f14 || K20 == kjnVar6) {
                    final int i4 = 1;
                    K20 = new Function1() { // from class: guw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i4) {
                                case 0:
                                    long Q = nt0.Q(((hqe) obj4).a);
                                    fuw fuwVar2 = fuwVar;
                                    fuwVar2.g = Q;
                                    fuwVar2.d();
                                    break;
                                default:
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    fuw fuwVar3 = fuwVar;
                                    zcoVar.k(fuwVar3.c());
                                    zcoVar.n(fuwVar3.c());
                                    zcoVar.x(((Number) fuwVar3.e.e()).floatValue());
                                    zcoVar.y(((Number) fuwVar3.f.e()).floatValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var27.k0(K20);
                }
                yci a6 = androidx.compose.ui.graphics.a.a(f13, (Function1) K20);
                oq5Var27.p(false);
                return a6;
        }
    }

    public /* synthetic */ aqp(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
