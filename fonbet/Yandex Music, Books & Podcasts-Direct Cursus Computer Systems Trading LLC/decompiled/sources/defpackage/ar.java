package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class ar implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ar(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        ip4 ip4Var = (ip4) this.b;
        ynn ynnVar = (ynn) this.c;
        jht jhtVar = (jht) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        jhtVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(jhtVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (jhtVar instanceof wgt) {
            oq5Var.Z(-944310277);
            up6.i(((wgt) jhtVar).b, a.a(vci.a, "video_clip_block"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(244333423, new jv(2, ip4Var, ynnVar), oq5Var), oq5Var, 48, 384, 4092);
            oq5Var.p(false);
        } else {
            if (!(jhtVar instanceof jgt)) {
                throw vz1.i(oq5Var, 939368343, false);
            }
            oq5Var.Z(-943129394);
            ArrayList arrayList = new ArrayList(8);
            for (int i = 0; i < 8; i++) {
                arrayList.add(Unit.a);
            }
            up6.j(arrayList, null, null, 0.0f, 0.0f, null, null, false, 0, ild.C(-570707982, new u2(21, jhtVar), oq5Var), oq5Var, 100663296, 766);
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        mm6 mm6Var = (mm6) this.b;
        aqi aqiVar = (aqi) this.c;
        String str = (String) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(str) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        if (str != null) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(615078882);
            boolean booleanValue = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
            vci vciVar = vci.a;
            if (booleanValue) {
                oq5Var2.Z(615106069);
                ug3.a(d.c(androidx.compose.foundation.a.b(vciVar, p85.a(pd.b0(d85.i), 0.2f, 0.0f, 13).b(), vnj.i), 1.0f), oq5Var2, 0);
                oq5Var2.p(false);
                oq5Var2.p(false);
                return Unit.a;
            }
            oq5Var2.Z(612690084);
            oq5Var2.p(false);
            cce cceVar = (cce) oq5Var2.j(tkg.a);
            boolean h = oq5Var2.h(mm6Var);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                K = new ny2(i, mm6Var, aqiVar);
                oq5Var2.k0(K);
            }
            Function1 function1 = (Function1) K;
            oq5Var2.a0(2140758544);
            is1 is1Var = new is1(str, ild.j, cceVar);
            xkn xknVar = zvt.b;
            Object obj4 = null;
            fs1 G = yd5.G(is1Var, rq1.u, function1 == null ? null : new lma(27, obj4, function1, obj4), hd6.b, 1, oq5Var2);
            oq5Var2.p(false);
            irf.r(G, null, d.c(vciVar, 1.0f), null, hd6.a, 0.0f, null, oq5Var2, 25008, 104);
            oq5Var2.p(false);
        } else {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(612690084);
            oq5Var3.p(false);
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        hps hpsVar = (hps) this.b;
        cce cceVar = (cce) this.c;
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
        String str = hpsVar.a;
        vci vciVar = vci.a;
        d51 d51Var = hd6.a;
        if (str == null) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-648382024);
            oq5Var2.p(false);
            z = false;
        } else {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-648382023);
            z = false;
            irf.r(yd5.F(str, cceVar, oq5Var3), null, d.c(vciVar, 1.0f), null, d51Var, 0.0f, null, oq5Var3, 25008, 104);
            oq5Var3.p(false);
        }
        for (kps kpsVar : hpsVar.b) {
            yhm yhmVar = kpsVar.a;
            yci j = androidx.compose.foundation.layout.a.j(d.o(vciVar, (yhmVar.d / 100.0f) * cVar.d(), (yhmVar.e / 100.0f) * cVar.d()), (yhmVar.a / 100.0f) * cVar.d(), (yhmVar.b / 100.0f) * cVar.d());
            if (kpsVar instanceof ips) {
                oq5 oq5Var4 = (oq5) hq5Var;
                oq5Var4.Z(-1875128913);
                saf safVar = ((ips) kpsVar).b;
                if (safVar instanceof mn6) {
                    oq5Var4.Z(-1875029031);
                    irf.r(yd5.F(((mn6) safVar).n, cceVar, oq5Var4), null, j, null, d51Var, 0.0f, null, oq5Var4, 24624, 104);
                    oq5Var4.p(z);
                } else {
                    if (!(safVar instanceof nn6)) {
                        throw vz1.i(oq5Var4, 493701299, z);
                    }
                    oq5Var4.Z(-1874435753);
                    nn6 nn6Var = (nn6) safVar;
                    bfg.b(nn6Var.n, nn6Var.o, nn6Var.p, j, oq5Var4, 0);
                    oq5Var4 = oq5Var4;
                    oq5Var4.p(z);
                }
                oq5Var4.p(z);
            } else {
                if (!(kpsVar instanceof jps)) {
                    throw vz1.i((oq5) hq5Var, 493698896, z);
                }
                oq5 oq5Var5 = (oq5) hq5Var;
                oq5Var5.Z(-1873959345);
                irf.r(yd5.F(((jps) kpsVar).b, cceVar, oq5Var5), null, j, null, d51Var, 0.0f, null, oq5Var5, 24624, 104);
                oq5Var5.p(z);
            }
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        cpq cpqVar = (cpq) this.b;
        c26 c26Var = (c26) this.c;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        boolean z = cpqVar instanceof bpq;
        vci vciVar = vci.a;
        if (z) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(1595943290);
            List list = ((bpq) cpqVar).a;
            boolean f = oq5Var2.f(list);
            Object K = oq5Var2.K();
            if (f || K == gq5.a) {
                K = c26Var.r(list);
                oq5Var2.k0(K);
            }
            zc4.f((List) K, c26Var, o0kVar, d.c(vciVar, 1.0f), oq5Var2, ((intValue << 6) & 896) | 3072);
            oq5Var2.p(false);
        } else if (Intrinsics.d(cpqVar, apq.a)) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(1596431850);
            zc4.d(d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f), oq5Var3, 6);
            oq5Var3.p(false);
        } else {
            if (!(cpqVar instanceof zoq)) {
                throw vz1.i((oq5) hq5Var, -1611087479, false);
            }
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.Z(1596783111);
            zc4.c(c26Var, d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f), oq5Var4, 0);
            oq5Var4.p(false);
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.b;
        w4k w4kVar = (w4k) this.c;
        ((Integer) obj3).getClass();
        ((am0) obj).getClass();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        boolean f = oq5Var.f(function0);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new or(13, function0);
            oq5Var.k0(K);
        }
        float f2 = 50;
        irf.r(w4kVar, null, men.s(androidx.compose.foundation.layout.a.p(wyf.s(vci.a, (Function0) K), f2, 46, f2, 54), 40, null), null, hd6.e, 0.0f, null, oq5Var, 24624, 104);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        zn6 zn6Var = (zn6) this.b;
        Function0 function0 = (Function0) this.c;
        ((Integer) obj3).getClass();
        ((am0) obj).getClass();
        long j = ((yn6) zn6Var).a;
        oq5 oq5Var = (oq5) ((hq5) obj2);
        boolean e = oq5Var.e(j);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (e || K == kjnVar) {
            p85 b0 = pd.b0(j);
            K = new d85(p85.a(b0, 0.0f, yhn.c(b0.c + (c3x.N(j) > 0.7f ? 0.2f : -0.3f), 0.0f, 1.0f), 11).b());
            oq5Var.k0(K);
        }
        long j2 = ((d85) K).a;
        boolean f = oq5Var.f(function0);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            K2 = new or(14, function0);
            oq5Var.k0(K2);
        }
        xee.i(wyf.s(vci.a, (Function0) K2), j2, oq5Var, 0);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) this.b;
        Function2 function22 = (Function2) this.c;
        zkn zknVar = (zkn) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        zknVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(zknVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        bs1 k = zknVar.b.k();
        if (k instanceof as1) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1106556001);
            irf.r(((as1) k).a, null, null, zknVar.d, zknVar.e, 0.0f, null, oq5Var2, 48, 100);
            oq5Var2.p(false);
        } else if (k instanceof zr1) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-1106279419);
            function2.invoke(oq5Var3, 0);
            oq5Var3.p(false);
        } else {
            if (!Intrinsics.d(k, xr1.a) && !(k instanceof yr1)) {
                throw vz1.i((oq5) hq5Var, 2042511395, false);
            }
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.Z(-1106135641);
            function22.invoke(oq5Var4, 0);
            oq5Var4.p(false);
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        String str;
        ges gesVar;
        boolean z;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
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
        ges j = nu0.j();
        ids O = o5g.O(0, 1, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean f = oq5Var2.f(str2);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            int i = ga6.i(cVar.b);
            if (i < 0) {
                ume.a("width must be >= 0");
            }
            long h = ia6.h(i, i, 0, Integer.MAX_VALUE);
            str = str2;
            gesVar = j;
            K = ids.a(O, str, gesVar, 0, false, 0, h, 988);
            oq5Var2.k0(K);
        } else {
            str = str2;
            gesVar = j;
        }
        cds cdsVar = (cds) K;
        ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        vci vciVar = vci.a;
        yci H = vnj.H(oq5Var2, vciVar);
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
        agr agrVar = eq0.a;
        long j2 = ((dq0) oq5Var2.j(agrVar)).b.a;
        if (str3 == null) {
            str3 = "";
        }
        ges gesVar2 = gesVar;
        xcs.b(str, ksw.D(vciVar, rvf.N(R.string.overview_block_content_description, new Object[]{str3}, oq5Var2), null), j2, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, gesVar2, oq5Var2, 0, 3120, 55288);
        if (cdsVar.b.f > 3) {
            oq5Var2.Z(1432089269);
            String M = rvf.M(R.string.non_music_screen_read_more, oq5Var2);
            long j3 = ((dq0) oq5Var2.j(agrVar)).b.d;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new wh7(7);
                oq5Var2.k0(K2);
            }
            xcs.b(M, nfp.a(vciVar, (Function1) K2), j3, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar2, oq5Var2, 0, 3120, 55288);
            z = false;
        } else {
            z = false;
            oq5Var2.Z(1429677841);
        }
        oq5Var2.p(z);
        oq5Var2.p(true);
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        return com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, new c56((ArrayList) this.b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (rja) this.c), 15);
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        zwa zwaVar = (zwa) this.b;
        sdr sdrVar = (sdr) this.c;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        kwa kwaVar = (kwa) sdrVar.getValue();
        if (kwaVar instanceof iwa) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-497767299);
            tua.b((iwa) kwaVar, zwaVar, null, oq5Var2, 0);
            oq5Var2.p(false);
        } else {
            if (!Intrinsics.d(kwaVar, jwa.a)) {
                throw vz1.i((oq5) hq5Var, -1401532604, false);
            }
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-497543169);
            oq5Var3.p(false);
        }
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mqs mqsVar;
        mqs mqsVar2;
        boolean z;
        oq5 oq5Var;
        switch (this.a) {
            case 0:
                kkp kkpVar = (kkp) this.b;
                pu0 pu0Var = (pu0) this.c;
                bci bciVar = (bci) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var;
                Context context = (Context) oq5Var3.j(AndroidCompositionLocals_androidKt.b);
                Object K = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                }
                mm6 mm6Var = ((fs5) K).a;
                Object K2 = oq5Var3.K();
                if (K2 == kjnVar) {
                    oq oqVar = (oq) kkpVar.b;
                    br brVar = (br) kkpVar.c;
                    qe3 qe3Var = (qe3) kkpVar.d;
                    c3 c3Var = new c3(0, (sai) kkpVar.e, sai.class, "hide", "hide()V", 0, 8);
                    oqVar.getClass();
                    context.getClass();
                    Context context2 = brVar.b;
                    y yVar = brVar.a;
                    kxi kxiVar = brVar.c;
                    PlaybackScope playbackScope = brVar.d;
                    ((f) brVar.t.getValue()).getClass();
                    hr hrVar = new hr(oqVar, brVar, qe3Var, new cr(context2, yVar, kxiVar, playbackScope, f.a(), brVar.u, c3Var), context, mm6Var);
                    oq5Var3.k0(hrVar);
                    K2 = hrVar;
                }
                hr hrVar2 = (hr) K2;
                aqi M = gld.M(hrVar2.f, hq5Var);
                mr mrVar = (mr) M.getValue();
                if (Intrinsics.d(mrVar, jr.a)) {
                    oq5Var3.Z(1646912880);
                    oq5Var3.p(false);
                } else {
                    if (!Intrinsics.d(mrVar, kr.a) && !(mrVar instanceof lr)) {
                        throw vz1.i(oq5Var3, 1646911381, false);
                    }
                    oq5Var3.Z(-485174629);
                    jf0.a(new qzm[0], pu0Var, false, ild.C(-435172347, new x3(5, bciVar, hrVar2, M), oq5Var3), oq5Var3, 0, 4);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 1:
                yci yciVar = (yci) this.b;
                i01 i01Var = (i01) this.c;
                t01 t01Var = (t01) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                t01Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(t01Var) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                boolean z2 = t01Var instanceof r01;
                kjn kjnVar2 = gq5.a;
                if (z2) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(1460091681);
                    r01 r01Var = (r01) t01Var;
                    boolean f = oq5Var5.f(yciVar);
                    Object K3 = oq5Var5.K();
                    if (f || K3 == kjnVar2) {
                        K3 = new z3(17, yciVar);
                        oq5Var5.k0(K3);
                    }
                    xv7.c(r01Var, (Function0) K3, null, oq5Var5, intValue2 & 14);
                    oq5Var5.p(false);
                } else {
                    if (!(t01Var instanceof s01)) {
                        throw vz1.i((oq5) hq5Var2, 1460090143, false);
                    }
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(1460097232);
                    s01 s01Var = (s01) t01Var;
                    boolean f2 = oq5Var6.f(yciVar);
                    Object K4 = oq5Var6.K();
                    if (f2 || K4 == kjnVar2) {
                        K4 = new z3(17, yciVar);
                        oq5Var6.k0(K4);
                    }
                    Function0 function0 = (Function0) K4;
                    int i = intValue2 & 14;
                    boolean h = oq5Var6.h(i01Var) | (i == 4);
                    Object K5 = oq5Var6.K();
                    if (h || K5 == kjnVar2) {
                        K5 = new a3(5, i01Var, t01Var);
                        oq5Var6.k0(K5);
                    }
                    xv7.b(s01Var, i01Var, function0, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K5, 15), oq5Var6, i);
                    oq5Var6.p(false);
                }
                return Unit.a;
            case 2:
                kkp kkpVar2 = (kkp) this.b;
                ia0 ia0Var = (ia0) kkpVar2.c;
                pu0 pu0Var2 = (pu0) this.c;
                bci bciVar2 = (bci) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bciVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? ((oq5) hq5Var3).f(bciVar2) : ((oq5) hq5Var3).h(bciVar2) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var3;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var3;
                Object K6 = oq5Var8.K();
                kjn kjnVar3 = gq5.a;
                if (K6 == kjnVar3) {
                    zy zyVar = new zy(0, (sai) kkpVar2.e, sai.class, "hide", "hide()V", 0, 17);
                    t tVar = (t) ia0Var.b;
                    jfu viewModelStore = tVar.getViewModelStore();
                    y supportFragmentManager = tVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    x11 x11Var = new x11(tVar, viewModelStore, supportFragmentManager, (kxi) ia0Var.c, zyVar);
                    oq5Var8.k0(x11Var);
                    K6 = x11Var;
                }
                x11 x11Var2 = (x11) K6;
                c01 c01Var = (c01) kkpVar2.b;
                qe3 qe3Var2 = (qe3) kkpVar2.d;
                c01Var.getClass();
                x11Var2.getClass();
                Context context3 = (Context) oq5Var8.j(AndroidCompositionLocals_androidKt.b);
                Object K7 = oq5Var8.K();
                if (K7 == kjnVar3) {
                    K7 = tlm.f(gld.R(g.a, oq5Var8), oq5Var8);
                }
                mm6 mm6Var2 = ((fs5) K7).a;
                boolean f3 = oq5Var8.f(c01Var) | oq5Var8.f(ia0Var) | oq5Var8.f(qe3Var2) | oq5Var8.f(x11Var2);
                Object K8 = oq5Var8.K();
                if (f3 || K8 == kjnVar3) {
                    b21 b21Var = new b21(c01Var, ia0Var, qe3Var2, x11Var2, context3, mm6Var2);
                    oq5Var8.k0(b21Var);
                    K8 = b21Var;
                }
                b21 b21Var2 = (b21) K8;
                aqi M2 = gld.M(b21Var2.g, oq5Var8);
                g21 g21Var = (g21) M2.getValue();
                if (Intrinsics.d(g21Var, d21.a)) {
                    oq5Var8.Z(-659336692);
                    oq5Var8.p(false);
                } else {
                    if (!Intrinsics.d(g21Var, e21.a) && !(g21Var instanceof f21)) {
                        throw vz1.i(oq5Var8, -659338218, false);
                    }
                    oq5Var8.Z(1035534717);
                    jf0.a(new qzm[0], pu0Var2, false, ild.C(-1027148881, new x3(11, bciVar2, b21Var2, M2), oq5Var8), oq5Var8, 0, 4);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 3:
                nii niiVar = (nii) this.b;
                s31 s31Var = (s31) this.c;
                x31 x31Var = (x31) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                x31Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(x31Var) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var4;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                if (x31Var instanceof v31) {
                    oq5 oq5Var10 = (oq5) hq5Var4;
                    oq5Var10.Z(1392584733);
                    hld.e((v31) x31Var, niiVar, null, oq5Var10, intValue4 & 14);
                    oq5Var10.p(false);
                } else {
                    if (!(x31Var instanceof w31)) {
                        throw vz1.i((oq5) hq5Var4, 1392582710, false);
                    }
                    oq5 oq5Var11 = (oq5) hq5Var4;
                    oq5Var11.Z(220613694);
                    hld.c((w31) x31Var, s31Var, niiVar, null, oq5Var11, intValue4 & 14);
                    oq5Var11.p(false);
                }
                return Unit.a;
            case 4:
                d41 d41Var = (d41) this.b;
                aqi aqiVar = (aqi) this.c;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var12 = (oq5) hq5Var5;
                if (oq5Var12.P(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ild.c((t41) aqiVar.getValue(), d41Var, o0kVar, null, oq5Var12, (intValue5 << 6) & 896);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 5:
                nii niiVar2 = (nii) this.b;
                k61 k61Var = (k61) this.c;
                t61 t61Var = (t61) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                t61Var.getClass();
                if (t61Var instanceof r61) {
                    oq5 oq5Var13 = (oq5) hq5Var6;
                    oq5Var13.Z(-1660726468);
                    vnj.c((r61) t61Var, niiVar2, null, oq5Var13, intValue6 & 14);
                    oq5Var13.p(false);
                } else {
                    if (!(t61Var instanceof s61)) {
                        throw vz1.i((oq5) hq5Var6, -1660728739, false);
                    }
                    oq5 oq5Var14 = (oq5) hq5Var6;
                    oq5Var14.Z(-1660721371);
                    vnj.b((s61) t61Var, k61Var, niiVar2, null, oq5Var14, intValue6 & 14);
                    oq5Var14.p(false);
                }
                return Unit.a;
            case 6:
                qxp qxpVar = (qxp) this.b;
                l81 l81Var = (l81) this.c;
                d91 d91Var = (d91) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                d91Var.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(d91Var) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var15 = (oq5) hq5Var7;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                if (d91Var instanceof b91) {
                    oq5 oq5Var16 = (oq5) hq5Var7;
                    oq5Var16.Z(510503628);
                    men.f((b91) d91Var, null, oq5Var16, intValue7 & 14);
                    oq5Var16.p(false);
                } else {
                    if (!(d91Var instanceof c91)) {
                        throw vz1.i((oq5) hq5Var7, 510501826, false);
                    }
                    oq5 oq5Var17 = (oq5) hq5Var7;
                    oq5Var17.Z(510507985);
                    c91 c91Var = (c91) d91Var;
                    yci a = a.a(vci.a, "block_familiar_you");
                    boolean h2 = ((intValue7 & 14) == 4) | oq5Var17.h(l81Var);
                    Object K9 = oq5Var17.K();
                    if (h2 || K9 == gq5.a) {
                        K9 = new a3(9, l81Var, d91Var);
                        oq5Var17.k0(K9);
                    }
                    men.e(qxpVar, c91Var, l81Var, com.yandex.music.core.ui.compose.a.b(a, null, 0L, 0.0f, null, (Function2) K9, 15), oq5Var17, (intValue7 << 3) & 112);
                    oq5Var17.p(false);
                }
                return Unit.a;
            case 7:
                ld1 ld1Var = (ld1) this.b;
                w41 w41Var = (w41) this.c;
                kd1 kd1Var = (kd1) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                kd1Var.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).d(kd1Var.ordinal()) ? 4 : 2;
                }
                oq5 oq5Var18 = (oq5) hq5Var8;
                if (oq5Var18.P(intValue8 & 1, (intValue8 & 19) != 18)) {
                    ma1.a(ld1Var, kd1Var, w41Var, null, oq5Var18, (intValue8 << 3) & 112, 8);
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 8:
                vk1 vk1Var = (vk1) this.b;
                sk1 sk1Var = (sk1) this.c;
                int intValue9 = ((Integer) obj).intValue();
                int intValue10 = ((Integer) obj2).intValue();
                int intValue11 = ((Integer) obj3).intValue();
                mk1 mk1Var = (mk1) CollectionsKt.S(vk1Var.a, intValue9);
                vci vciVar = vci.a;
                return (mk1Var == null || (mqsVar = mk1Var.b) == null) ? vciVar : com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, new sh1(2, sk1Var, mqsVar, new spd(intValue10, intValue11, intValue9)), 15);
            case 9:
                zl1 zl1Var = (zl1) this.b;
                ne1 ne1Var = (ne1) this.c;
                int intValue12 = ((Integer) obj).intValue();
                int intValue13 = ((Integer) obj2).intValue();
                int intValue14 = ((Integer) obj3).intValue();
                nk1 nk1Var = (nk1) CollectionsKt.S(zl1Var.a, intValue12);
                vci vciVar2 = vci.a;
                return (nk1Var == null || (mqsVar2 = nk1Var.b) == null) ? vciVar2 : com.yandex.music.core.ui.compose.a.b(vciVar2, null, 0L, 0.0f, null, new sh1(4, ne1Var, mqsVar2, new spd(intValue13, intValue14, intValue12)), 15);
            case 10:
                sp1 sp1Var = (sp1) this.b;
                pp1 pp1Var = (pp1) this.c;
                pw5 pw5Var = (pw5) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                pw5Var.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((oq5) hq5Var9).f(pw5Var) ? 4 : 2;
                }
                if ((intValue15 & 19) == 18) {
                    oq5 oq5Var19 = (oq5) hq5Var9;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                if (sp1Var.c) {
                    oq5 oq5Var20 = (oq5) hq5Var9;
                    oq5Var20.Z(-1932548678);
                    oq5Var20.p(false);
                    qwp.k(pw5Var.d, pw5Var.e, pw5Var.f, pp1Var.c, null, 0.0f, oq5Var20, 0);
                    return Unit.a;
                }
                oq5 oq5Var21 = (oq5) hq5Var9;
                oq5Var21.Z(-1920568976);
                u2x.b(pw5Var, ksw.D(androidx.compose.foundation.a.b(xp3.u(d.e(d.t(vci.a, 52, 0.0f, 2), 80), o5g.F(oq5Var21)), ((dq0) oq5Var21.j(eq0.a)).c.c, vnj.i), pp1Var.c, null), oq5Var21, intValue15 & 14);
                oq5Var21.p(false);
                return Unit.a;
            case 11:
                aqi aqiVar2 = (aqi) this.b;
                sp1 sp1Var2 = (sp1) this.c;
                zp1 zp1Var = (zp1) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                zp1Var.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= (intValue16 & 8) == 0 ? ((oq5) hq5Var10).f(zp1Var) : ((oq5) hq5Var10).h(zp1Var) ? 4 : 2;
                }
                if ((intValue16 & 19) == 18) {
                    oq5 oq5Var22 = (oq5) hq5Var10;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                String str = zp1Var.a;
                ArrayList arrayList = zp1Var.b;
                op1 op1Var = (op1) aqiVar2.getValue();
                oq5 oq5Var23 = (oq5) hq5Var10;
                float f4 = androidx.compose.foundation.layout.a.f((o0k) oq5Var23.j(lkg.a), (xof) oq5Var23.j(es5.n));
                long j = d85.n;
                boolean f5 = oq5Var23.f(aqiVar2);
                Object K10 = oq5Var23.K();
                kjn kjnVar4 = gq5.a;
                if (f5 || K10 == kjnVar4) {
                    K10 = new x80(aqiVar2, 3);
                    oq5Var23.k0(K10);
                }
                Function1 function1 = (Function1) K10;
                wn5 wn5Var = leu.a;
                boolean h3 = oq5Var23.h(sp1Var2) | ((intValue16 & 14) == 4 || ((intValue16 & 8) != 0 && oq5Var23.h(zp1Var)));
                Object K11 = oq5Var23.K();
                if (h3 || K11 == kjnVar4) {
                    K11 = new kc(24, sp1Var2, zp1Var);
                    oq5Var23.k0(K11);
                }
                ngg.h(str, arrayList, op1Var, function1, wn5Var, null, j, 0L, false, null, f4, 0.0f, (Function1) K11, oq5Var23, 1598016, 0, 6048);
                return Unit.a;
            case 12:
                v32 v32Var = (v32) this.b;
                q32 q32Var = (q32) this.c;
                hq5 hq5Var11 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                float f6 = 16;
                vci vciVar3 = vci.a;
                yci o = androidx.compose.foundation.layout.a.o(vciVar3, f6, 0.0f, 2);
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var11, 0);
                oq5 oq5Var24 = (oq5) hq5Var11;
                int i2 = oq5Var24.P;
                androidx.compose.runtime.internal.a l = oq5Var24.l();
                yci H = vnj.H(hq5Var11, o);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var24.d0();
                if (oq5Var24.O) {
                    oq5Var24.k(grbVar);
                } else {
                    oq5Var24.n0();
                }
                g0g.U(hq5Var11, a2, wp5.f);
                g0g.U(hq5Var11, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var24.O || !Intrinsics.d(oq5Var24.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var24, i2, kb5Var);
                }
                g0g.U(hq5Var11, H, wp5.d);
                u1g.l(hq5Var11, d.e(vciVar3, 32));
                leu.w(v32Var, q32Var, hq5Var11, 0);
                u1g.l(hq5Var11, d.e(vciVar3, f6));
                oq5Var24.p(true);
                return Unit.a;
            case 13:
                w4k w4kVar = (w4k) obj;
                int intValue17 = ((Integer) obj3).intValue();
                w4kVar.getClass();
                irf.r(w4kVar, null, null, (g40) this.b, (jd6) this.c, 0.0f, null, (hq5) obj2, (intValue17 & 14) | 48, 100);
                return Unit.a;
            case 14:
                q91 q91Var = (q91) this.b;
                String str2 = (String) this.c;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue18 & 17) == 16) {
                    oq5 oq5Var25 = (oq5) hq5Var12;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        return Unit.a;
                    }
                }
                vci vciVar4 = vci.a;
                yci d = d.d(vciVar4, 1.0f);
                gz2 gz2Var = b2c.o;
                ta5 a3 = sa5.a(qx0.c, gz2Var, hq5Var12, 48);
                oq5 oq5Var26 = (oq5) hq5Var12;
                int i3 = oq5Var26.P;
                androidx.compose.runtime.internal.a l2 = oq5Var26.l();
                yci H2 = vnj.H(hq5Var12, d);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var26.d0();
                if (oq5Var26.O) {
                    oq5Var26.k(grbVar2);
                } else {
                    oq5Var26.n0();
                }
                g0g.U(hq5Var12, a3, wp5.f);
                g0g.U(hq5Var12, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var26.O || !Intrinsics.d(oq5Var26.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var26, i3, kb5Var2);
                }
                g0g.U(hq5Var12, H2, wp5.d);
                j66.r(q91Var.a, a.a(vciVar4, "artist_name").f(new HorizontalAlignElement(gz2Var)), null, zpd.p.a, hq5Var12, 0, 4);
                if (str2 == null || str2.length() <= 0) {
                    oq5Var26.Z(-921776160);
                } else {
                    oq5Var26.Z(-919721914);
                    u1g.l(hq5Var12, d.e(vciVar4, upd.a));
                    gdg.g(str2, a.a(new HorizontalAlignElement(gz2Var), "subtitle"), ((dq0) ((oq5) hq5Var12).j(eq0.a)).b.b, null, hq5Var12, 0, 8);
                }
                oq5Var26.p(false);
                oq5Var26.p(true);
                return Unit.a;
            case 15:
                rab rabVar = (rab) this.b;
                String str3 = (String) this.c;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue19 & 17) == 16) {
                    oq5 oq5Var27 = (oq5) hq5Var13;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        return Unit.a;
                    }
                }
                yci yciVar2 = vci.a;
                yci d2 = d.d(yciVar2, 1.0f);
                ta5 a4 = sa5.a(qx0.c, b2c.n, hq5Var13, 0);
                oq5 oq5Var28 = (oq5) hq5Var13;
                int i4 = oq5Var28.P;
                androidx.compose.runtime.internal.a l3 = oq5Var28.l();
                yci H3 = vnj.H(hq5Var13, d2);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var28.d0();
                if (oq5Var28.O) {
                    oq5Var28.k(grbVar3);
                } else {
                    oq5Var28.n0();
                }
                g0g.U(hq5Var13, a4, wp5.f);
                g0g.U(hq5Var13, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var28.O || !Intrinsics.d(oq5Var28.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var28, i4, kb5Var3);
                }
                g0g.U(hq5Var13, H3, wp5.d);
                String str4 = rabVar.a;
                yci a5 = a.a(yciVar2, "title");
                jzb jzbVar = rabVar.e;
                zpd zpdVar = zpd.o;
                j66.r(str4, a5, jzbVar, zpdVar.a, hq5Var13, 48, 0);
                if (rabVar.b.length() > 0) {
                    oq5Var28.Z(-1092588927);
                    u1g.l(hq5Var13, d.e(yciVar2, upd.a));
                    String str5 = rabVar.b;
                    long j2 = ((dq0) ((oq5) hq5Var13).j(eq0.a)).b.b;
                    ges a6 = upd.a();
                    oq5Var28.Z(1211692009);
                    yci a7 = a.a(yciVar2, "subtitle");
                    if (str3 != null) {
                        wn5 C = ild.C(-2092748367, new mf3(str3, 0), hq5Var13);
                        oq5Var28.Z(-1713140123);
                        if (((Boolean) oq5Var28.j(koe.a)).booleanValue()) {
                            oq5Var28.p(false);
                        } else {
                            zb6 zb6Var = new zb6();
                            zb6Var.a = null;
                            C.invoke(zb6Var, oq5Var28, 48);
                            yciVar2 = ksw.D(yciVar2, zb6Var.a, null);
                            oq5Var28.p(false);
                        }
                        a7 = a7.f(yciVar2);
                    }
                    yci yciVar3 = a7;
                    oq5Var28.p(false);
                    int i5 = zpdVar.b;
                    z = false;
                    oq5Var = oq5Var28;
                    xv7.j(str5, yciVar3, j2, 0L, 0L, 0, 0L, 2, false, i5, i5, null, a6, hq5Var13, 0, 48, 38904);
                } else {
                    z = false;
                    oq5Var = oq5Var28;
                    oq5Var.Z(-1094793430);
                }
                oq5Var.p(z);
                oq5Var.p(true);
                return Unit.a;
            case 16:
                vy3 vy3Var = (vy3) this.b;
                ny3 ny3Var = (ny3) this.c;
                int intValue20 = ((Integer) obj).intValue();
                hq5 hq5Var14 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((oq5) hq5Var14).d(intValue20) ? 4 : 2;
                }
                if ((intValue21 & 19) == 18) {
                    oq5 oq5Var29 = (oq5) hq5Var14;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        return Unit.a;
                    }
                }
                vq1.l((wx3) vy3Var.a.get(intValue20), ny3Var, b.b(a.a(vci.a, "pager_page"), intValue20), hq5Var14, 8);
                return Unit.a;
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                g5u g5uVar = (g5u) this.b;
                k65 k65Var = (k65) this.c;
                androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                aVar.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((oq5) hq5Var15).f(aVar) ? 4 : 2;
                }
                oq5 oq5Var30 = (oq5) hq5Var15;
                if (oq5Var30.P(intValue22 & 1, (intValue22 & 19) != 18)) {
                    fgq.p(g5uVar, k65Var, a.a(androidx.compose.foundation.lazy.a.a(aVar, vci.a), "recommendations"), oq5Var30, 0);
                } else {
                    oq5Var30.S();
                }
                return Unit.a;
            case 21:
                iil iilVar = (iil) this.b;
                aqi aqiVar3 = (aqi) this.c;
                hq5 hq5Var16 = (hq5) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue23 & 17) == 16) {
                    oq5 oq5Var31 = (oq5) hq5Var16;
                    if (oq5Var31.z()) {
                        oq5Var31.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var32 = (oq5) hq5Var16;
                boolean h4 = oq5Var32.h(iilVar) | oq5Var32.h(gil.a);
                Object K12 = oq5Var32.K();
                if (h4 || K12 == gq5.a) {
                    K12 = new ap1(26, aqiVar3, iilVar);
                    oq5Var32.k0(K12);
                }
                xee.d((Function0) K12, null, false, null, null, null, null, u2x.e, oq5Var32, 805306368, 510);
                return Unit.a;
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj, obj2, obj3);
            default:
                s1b s1bVar = (s1b) this.b;
                r1b r1bVar = (r1b) this.c;
                b2b b2bVar = (b2b) obj;
                hq5 hq5Var17 = (hq5) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                b2bVar.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((oq5) hq5Var17).f(b2bVar) ? 4 : 2;
                }
                if ((intValue24 & 19) == 18) {
                    oq5 oq5Var33 = (oq5) hq5Var17;
                    if (oq5Var33.z()) {
                        oq5Var33.S();
                        return Unit.a;
                    }
                }
                if (b2bVar instanceof z1b) {
                    oq5 oq5Var34 = (oq5) hq5Var17;
                    oq5Var34.Z(-1541411102);
                    boolean z3 = ((z1b) b2bVar).a;
                    Object K13 = oq5Var34.K();
                    if (K13 == gq5.a) {
                        K13 = new rua(19);
                        oq5Var34.k0(K13);
                    }
                    o2g.t(z3, nfp.a(vci.a, (Function1) K13), 4, true, oq5Var34, 3456, 0);
                    oq5Var34.p(false);
                } else {
                    if (!(b2bVar instanceof a2b)) {
                        throw vz1.i((oq5) hq5Var17, -1541413124, false);
                    }
                    oq5 oq5Var35 = (oq5) hq5Var17;
                    oq5Var35.Z(-1541402067);
                    quj.n((a2b) b2bVar, s1bVar, r1bVar, null, oq5Var35, intValue24 & 14);
                    oq5Var35.p(false);
                }
                return Unit.a;
        }
    }
}
