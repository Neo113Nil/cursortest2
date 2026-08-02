package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bj(wf wfVar, Function0 function0, yci yciVar, String str, String str2, int i) {
        this.a = 24;
        this.d = wfVar;
        this.c = function0;
        this.b = yciVar;
        this.e = str;
        this.f = str2;
    }

    private final Object a(Object obj, Object obj2) {
        long j;
        d85 d85Var = (d85) this.d;
        hvq hvqVar = (hvq) this.e;
        zsq zsqVar = (zsq) this.f;
        um0 um0Var = (um0) this.b;
        o0c o0cVar = (o0c) this.c;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        if (d85Var == null) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1657034215);
            j = ((dq0) oq5Var2.j(eq0.a)).b.d;
            oq5Var2.p(false);
        } else {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-1657035331);
            oq5Var3.p(false);
            j = d85Var.a;
        }
        long j2 = j;
        oq5 oq5Var4 = (oq5) hq5Var;
        boolean z = ((float) ((Configuration) oq5Var4.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp) / ((jx7) oq5Var4.j(es5.h)).i0() <= 330.0f;
        vci vciVar = vci.a;
        float f = 16;
        yci m = a.m(d.c(vciVar, 1.0f), f);
        boolean h = oq5Var4.h(hvqVar) | oq5Var4.h(zsqVar);
        Object K = oq5Var4.K();
        Object obj3 = gq5.a;
        if (h || K == obj3) {
            K = new ko1(hvqVar, zsqVar, 6);
            oq5Var4.k0(K);
        }
        yci b = com.yandex.music.core.ui.compose.a.b(m, null, 0L, 0.0f, null, (Function2) K, 15);
        ta5 a = sa5.a(qx0.e, b2c.o, oq5Var4, 54);
        int i = oq5Var4.P;
        androidx.compose.runtime.internal.a l = oq5Var4.l();
        yci H = vnj.H(oq5Var4, b);
        xp5.T.getClass();
        Function0 function0 = wp5.b;
        oq5Var4.d0();
        if (oq5Var4.O) {
            oq5Var4.k(function0);
        } else {
            oq5Var4.n0();
        }
        g0g.U(oq5Var4, a, wp5.f);
        g0g.U(oq5Var4, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var4, i, kb5Var);
        }
        g0g.U(oq5Var4, H, wp5.d);
        vm0 b2 = fn0.b(0, 0.0f, um0Var, oq5Var4, 6, 2);
        ges f2 = nu0.f();
        String str = o0cVar.a;
        long j3 = f2.a.b;
        float f3 = z ? 0.75f : 1.0f;
        v7g.p(j3);
        long D = v7g.D(kes.c(j3) * f3, j3 & 1095216660480L);
        long j4 = f2.b.c;
        v7g.p(j4);
        long D2 = v7g.D(kes.c(j4) * 0.85f, j4 & 1095216660480L);
        float f4 = z ? 0.75f : 1.0f;
        v7g.p(D2);
        boolean z2 = z;
        ges b3 = ges.b(f2, 0L, D, null, null, 0L, 0, v7g.D(kes.c(D2) * f4, D2 & 1095216660480L), null, null, 0, 0, 16646141);
        boolean f5 = oq5Var4.f(b2);
        Object K2 = oq5Var4.K();
        if (f5 || K2 == obj3) {
            K2 = new xtb(b2, 7);
            oq5Var4.k0(K2);
        }
        xcs.b(str, wyf.s(vciVar, (Function0) K2), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, b3, oq5Var4, 0, 0, 65016);
        u1g.l(oq5Var4, d.e(vciVar, f));
        vm0 b4 = fn0.b(1, 0.0f, um0Var, oq5Var4, 6, 2);
        ges d = nu0.d();
        String str2 = o0cVar.b;
        long j5 = d.a.b;
        float f6 = z2 ? 0.75f : 1.0f;
        v7g.p(j5);
        long D3 = v7g.D(kes.c(j5) * f6, j5 & 1095216660480L);
        long j6 = d.b.c;
        float f7 = z2 ? 0.75f : 1.0f;
        v7g.p(j6);
        ges b5 = ges.b(d, 0L, D3, null, null, 0L, 0, v7g.D(kes.c(j6) * f7, j6 & 1095216660480L), null, null, 0, 0, 16646141);
        boolean f8 = oq5Var4.f(b4);
        Object K3 = oq5Var4.K();
        if (f8 || K3 == obj3) {
            K3 = new xtb(b4, 8);
            oq5Var4.k0(K3);
        }
        xcs.b(str2, wyf.s(vciVar, (Function0) K3), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, b5, oq5Var4, 0, 0, 65016);
        u1g.l(oq5Var4, d.e(vciVar, f));
        vm0 b6 = fn0.b(2, 0.0f, um0Var, oq5Var4, 6, 2);
        ges j7 = nu0.j();
        String str3 = o0cVar.c;
        long j8 = j7.a.b;
        float f9 = z2 ? 0.75f : 1.0f;
        v7g.p(j8);
        long D4 = v7g.D(kes.c(j8) * f9, j8 & 1095216660480L);
        long j9 = j7.b.c;
        float f10 = z2 ? 0.75f : 1.0f;
        v7g.p(j9);
        ges b7 = ges.b(j7, 0L, D4, null, null, 0L, 0, v7g.D(kes.c(j9) * f10, j9 & 1095216660480L), null, null, 0, 0, 16646141);
        boolean f11 = oq5Var4.f(b6);
        Object K4 = oq5Var4.K();
        if (f11 || K4 == obj3) {
            K4 = new xtb(b6, 9);
            oq5Var4.k0(K4);
        }
        xcs.b(str3, wyf.s(vciVar, (Function0) K4), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, b7, oq5Var4, 0, 0, 65016);
        oq5Var4.p(true);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        nt0.q((String) this.d, (jef) this.e, (tmb) this.f, (qnq) this.b, (nnq) this.c, (hq5) obj, rvf.R(4609));
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        a0g.a((wf) this.d, (Function0) this.c, (yci) this.b, (String) this.e, (String) this.f, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y2h.d((sdr) this.d, (e4h) this.e, (c6h) this.f, (b2h) this.c, (yci) this.b, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y2h.e((aqi) this.d, (sdr) this.e, (b2h) this.f, (c6h) this.c, (yci) this.b, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        p6g.b((k4k) this.d, (lvf) this.e, (dib) this.f, (i1i) this.b, (tmb) this.c, (hq5) obj, rvf.R(32833));
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        avf.d((c8i) this.d, (spd) this.e, (ynn) this.f, (Function2) this.b, (ryc) this.c, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05f6  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        kb5 kb5Var;
        vci vciVar;
        long j3;
        Pair pair;
        boolean h;
        Object K;
        h9f h9fVar;
        int i = this.a;
        int i2 = 4;
        vci vciVar2 = vci.a;
        kjn kjnVar = gq5.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                d85 d85Var = (d85) obj7;
                Set set = (Set) obj5;
                yci yciVar = (yci) obj4;
                d85 d85Var2 = (d85) obj6;
                Function0 function0 = (Function0) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges gesVar = new ges(0L, v7g.z(8), tqc.n, null, null, wqc.b, null, 0L, null, 0, v7g.z(10), null, nu0.a, 0, 15597529);
                oq5 oq5Var2 = (oq5) hq5Var;
                if (d85Var == null) {
                    oq5Var2.Z(1562981048);
                    j = ((dq0) oq5Var2.j(eq0.a)).b.b;
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(1562980025);
                    oq5Var2.p(false);
                    j = d85Var.a;
                }
                long j4 = j;
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean f = oq5Var3.f(set);
                Object K2 = oq5Var3.K();
                if (f || K2 == kjnVar) {
                    K2 = new ej(0, set);
                    oq5Var3.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                yci u = xp3.u(yciVar, ugo.b(((cma) function1.invoke(ogo.a)).a, ((cma) function1.invoke(ogo.b)).a, ((cma) function1.invoke(ogo.d)).a, ((cma) function1.invoke(ogo.c)).a));
                if (d85Var2 == null) {
                    oq5Var3.Z(1563000410);
                    j2 = ((dq0) oq5Var3.j(eq0.a)).c.c;
                    oq5Var3.p(false);
                } else {
                    oq5Var3.Z(1562999263);
                    oq5Var3.p(false);
                    j2 = d85Var2.a;
                }
                float f2 = 2;
                yci n = a.n(androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(u, j2, vnj.i), false, null, new meo(0), function0, 3), 4, f2);
                nho a = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                int i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, n);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, a, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var3, i3, kb5Var2);
                }
                g0g.U(oq5Var3, H, wp5.d);
                lg3.b(j4, gesVar, null, oq5Var3, 0);
                u1g.l(oq5Var3, d.r(vciVar2, f2));
                gae.b(a0g.E(R.drawable.ic_more_24, 0, oq5Var3), null, a.o(d.m(vciVar2, w1g.p(gesVar, 0, oq5Var3, 0, 2)), 0.0f, 1, 1), j4, oq5Var3, 48, 0);
                oq5Var3.p(true);
                return Unit.a;
            case 1:
                yci yciVar2 = (yci) obj4;
                i01 i01Var = (i01) obj7;
                s01 s01Var = (s01) obj6;
                Function0 function02 = (Function0) obj3;
                u9b u9bVar = (u9b) obj5;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                yci a2 = androidx.compose.ui.platform.a.a(yciVar2, "artist_info_block");
                oq5 oq5Var5 = (oq5) hq5Var2;
                boolean h2 = oq5Var5.h(i01Var) | oq5Var5.f(s01Var);
                Object K3 = oq5Var5.K();
                if (h2 || K3 == kjnVar) {
                    K3 = new hb(8, i01Var, s01Var);
                    oq5Var5.k0(K3);
                }
                yci e = androidx.compose.foundation.a.e(a2, false, null, null, (Function0) K3, 7);
                float f3 = 16;
                yci f4 = a.o(e, f3, 0.0f, 2).f((yci) function02.invoke());
                kfh d = ug3.d(b2c.b, false);
                int i4 = oq5Var5.P;
                androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                yci H2 = vnj.H(oq5Var5, f4);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar2);
                } else {
                    oq5Var5.n0();
                }
                kb5 kb5Var3 = wp5.f;
                g0g.U(oq5Var5, d, kb5Var3);
                kb5 kb5Var4 = wp5.e;
                g0g.U(oq5Var5, l2, kb5Var4);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var5, i4, kb5Var5);
                }
                kb5 kb5Var6 = wp5.d;
                g0g.U(oq5Var5, H2, kb5Var6);
                boolean booleanValue = ((Boolean) oq5Var5.j(koe.a)).booleanValue();
                vci vciVar3 = vci.a;
                if (booleanValue) {
                    oq5Var5.Z(751777513);
                    kb5Var = kb5Var6;
                    ug3.a(androidx.compose.foundation.a.b(xp3.u(d.c(vciVar3, 1.0f), o5g.C(oq5Var5)), d85.b(d85.g, 0.7f, 0.0f, 0.0f, 0.0f, 14), vnj.i), oq5Var5, 0);
                    oq5Var5.p(false);
                } else {
                    oq5Var5.Z(751240531);
                    yci u2 = xp3.u(vciVar3, o5g.C(oq5Var5));
                    int t = wct.t();
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                    String e2 = u9bVar.e(t, webPath$Storage);
                    String e3 = u9bVar.e(frv.b() * 3, webPath$Storage);
                    hs1 J = up6.J(oq5Var5);
                    Object K4 = oq5Var5.K();
                    if (K4 == kjnVar) {
                        K4 = h01.b;
                        oq5Var5.k0(K4);
                    }
                    i4w.j(e3, e2, J, hd6.a, null, u2, (Function1) K4, null, oq5Var5, 1600512, 128);
                    oq5Var5.p(false);
                    kb5Var = kb5Var6;
                }
                yci m = a.m(b.a.a(vciVar3, b2c.h), f3);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var5, 0);
                int i5 = oq5Var5.P;
                androidx.compose.runtime.internal.a l3 = oq5Var5.l();
                yci H3 = vnj.H(oq5Var5, m);
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar2);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(oq5Var5, a3, kb5Var3);
                g0g.U(oq5Var5, l3, kb5Var4);
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var5, i5, kb5Var5);
                }
                g0g.U(oq5Var5, H3, kb5Var);
                String str = s01Var.a;
                Object K5 = oq5Var5.K();
                if (K5 == kjnVar) {
                    K5 = new zs0(5);
                    oq5Var5.k0(K5);
                }
                yci b = nfp.b(vciVar3, false, (Function1) K5);
                ges b2 = nu0.b();
                agr agrVar = eq0.a;
                xcs.b(str, b, ((dq0) oq5Var5.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, oq5Var5, 0, 0, 65528);
                String str2 = s01Var.b;
                String str3 = (str2 == null || StringsKt.U(str2)) ? null : str2;
                if (str3 != null) {
                    oq5Var5.Z(-1405785919);
                    u1g.l(oq5Var5, d.e(vciVar3, 4));
                    vciVar = vciVar3;
                    xcs.b(str3, d.q(vciVar3, 0.0f, 0.0f, 428, 0.0f, 11), ((dq0) oq5Var5.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, nu0.j(), oq5Var5, 48, 3120, 55288);
                } else {
                    vciVar = vciVar3;
                    oq5Var5.Z(-1411693713);
                }
                oq5Var5.p(false);
                String o = vz1.o(vciVar, 4, oq5Var5, R.string.artist_info_block_more, oq5Var5);
                Object K6 = oq5Var5.K();
                if (K6 == kjnVar) {
                    K6 = new zs0(6);
                    oq5Var5.k0(K6);
                }
                xcs.b(o, nfp.a(vciVar, (Function1) K6), ((dq0) oq5Var5.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var5, 0, 0, 65528);
                oq5Var5.p(true);
                oq5Var5.p(true);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                fgq.f((vm) obj7, (d81) obj6, (t71) obj5, (fvf) obj3, (yci) obj4, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 3:
                bci bciVar = (bci) obj7;
                ybf ybfVar = (ybf) obj6;
                m91 m91Var = (m91) obj5;
                h1d h1dVar = (h1d) obj4;
                oa1 oa1Var = (oa1) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var3;
                if (oq5Var6.P(intValue & 1, (intValue & 3) != 2)) {
                    fvf a4 = hvf.a(0, 0, oq5Var6, 0, 3);
                    yd5.f(null, null, bciVar, a4, null, false, false, false, 0L, 0L, 0.0f, ild.C(509030657, new up(ybfVar, m91Var, h1dVar, a4, oa1Var), oq5Var6), oq5Var6, 4096, 4071);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                saf.i((pp1) obj7, (u51) obj6, (qkl) obj5, (sp1) obj3, (yci) obj4, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                ot0.d((uo2) obj7, (yci) obj4, (String) obj6, (Function1) obj5, (wn5) obj3, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                wct.c((h93) obj7, (u0s) obj6, (jab) obj5, (thj) obj4, (va3) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                bow.c((va3) obj7, (c93) obj6, (thj) obj5, (wl) obj4, (Function1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                String str4 = (String) obj7;
                g24 g24Var = (g24) obj6;
                hvq hvqVar = (hvq) obj5;
                zsq zsqVar = (zsq) obj4;
                j54 j54Var = (j54) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                String M = rvf.M(R.string.slides_carousel_selection_button, hq5Var4);
                long G = c3x.G(hq5Var4);
                long H4 = c3x.H(hq5Var4);
                oq5 oq5Var8 = (oq5) hq5Var4;
                Object K7 = oq5Var8.K();
                if (K7 == kjnVar) {
                    K7 = new h14(i2);
                    oq5Var8.k0(K7);
                }
                yci b3 = nfp.b(vciVar2, false, (Function1) K7);
                boolean f5 = oq5Var8.f(str4) | oq5Var8.h(g24Var) | oq5Var8.h(hvqVar) | oq5Var8.h(zsqVar) | oq5Var8.h(j54Var);
                Object K8 = oq5Var8.K();
                if (f5 || K8 == kjnVar) {
                    j3 = H4;
                    rh1 rh1Var = new rh1(str4, g24Var, hvqVar, zsqVar, j54Var, 3);
                    oq5Var8.k0(rh1Var);
                    K8 = rh1Var;
                } else {
                    j3 = H4;
                }
                hdg.b(M, (Function0) K8, b3, new d85(G), new d85(j3), oq5Var8, 0, 0);
                return Unit.a;
            case 9:
                fvf fvfVar = (fvf) obj7;
                ArrayList arrayList = (ArrayList) obj6;
                o0k o0kVar = (o0k) obj5;
                i10 i10Var = (i10) obj4;
                pu4 pu4Var = (pu4) obj3;
                hq5 hq5Var5 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (oq5Var9.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c3x.t(fvfVar, arrayList, oq5Var9, 0);
                    vm C = ghh.C(o0kVar, a.c(0.0f, 24, 0.0f, 16, 5));
                    yci a5 = androidx.compose.ui.platform.a.a(d.c(vciVar2, 1.0f), "collection_albums_success_screen");
                    boolean h3 = oq5Var9.h(arrayList) | oq5Var9.d(i10Var.ordinal()) | oq5Var9.h(pu4Var);
                    Object K9 = oq5Var9.K();
                    if (h3 || K9 == kjnVar) {
                        K9 = new g3(16, arrayList, i10Var, pu4Var);
                        oq5Var9.k0(K9);
                    }
                    weo.f(a5, fvfVar, C, null, null, null, false, null, (Function1) K9, oq5Var9, 6, 504);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 10:
                g5u g5uVar = (g5u) obj7;
                fvf fvfVar2 = (fvf) obj6;
                g5u g5uVar2 = (g5u) obj5;
                o0k o0kVar2 = (o0k) obj4;
                k65 k65Var = (k65) obj3;
                hq5 hq5Var6 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (oq5Var10.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean z = g5uVar instanceof f5u;
                    if (z) {
                        pair = new Pair(u75.h(null, null, null), u75.h(null, null));
                    } else {
                        if (g5uVar instanceof d5u) {
                            List list = ((d5u) g5uVar).a;
                            if (list.size() < 3) {
                                pair = new Pair(fgq.w(list, 0), c5b.a);
                            } else {
                                pair = new Pair(fgq.w(list.subList(0, 3), 0), fgq.w(list.subList(3, list.size()), 3));
                            }
                        } else {
                            if (!(g5uVar instanceof e5u)) {
                                b6e.s();
                                return null;
                            }
                            c5b c5bVar = c5b.a;
                            pair = new Pair(c5bVar, c5bVar);
                        }
                        List list2 = (List) pair.a;
                        List list3 = (List) pair.b;
                        c3x.t(fvfVar2, CollectionsKt.g0(list2, g5uVar2 instanceof e5u ? t75.c(null) : CollectionsKt.g0(c5b.a, list3)), oq5Var10, 0);
                        boolean z2 = !z;
                        float f6 = 16;
                        vm C2 = ghh.C(o0kVar2, a.c(0.0f, f6, 0.0f, f6, 5));
                        yci c = d.c(vciVar2, 1.0f);
                        h = oq5Var10.h(list2) | oq5Var10.h(k65Var) | oq5Var10.f(g5uVar2) | oq5Var10.h(list3);
                        K = oq5Var10.K();
                        if (!h || K == kjnVar) {
                            K = new i50(list2, g5uVar2, list3, k65Var, 6);
                            oq5Var10.k0(K);
                        }
                        weo.f(c, fvfVar2, C2, null, null, null, z2, null, (Function1) K, oq5Var10, 6, 376);
                    }
                    List list22 = (List) pair.a;
                    List list32 = (List) pair.b;
                    c3x.t(fvfVar2, CollectionsKt.g0(list22, g5uVar2 instanceof e5u ? t75.c(null) : CollectionsKt.g0(c5b.a, list32)), oq5Var10, 0);
                    boolean z22 = !z;
                    float f62 = 16;
                    vm C22 = ghh.C(o0kVar2, a.c(0.0f, f62, 0.0f, f62, 5));
                    yci c2 = d.c(vciVar2, 1.0f);
                    h = oq5Var10.h(list22) | oq5Var10.h(k65Var) | oq5Var10.f(g5uVar2) | oq5Var10.h(list32);
                    K = oq5Var10.K();
                    if (!h) {
                    }
                    K = new i50(list22, g5uVar2, list32, k65Var, 6);
                    oq5Var10.k0(K);
                    weo.f(c2, fvfVar2, C22, null, null, null, z22, null, (Function1) K, oq5Var10, 6, 376);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                vut.d((l75) obj7, (pfn) obj6, (mmu) obj5, (jzi) obj4, (kxi) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                qwp.t((String) obj7, (String) obj6, (String) obj5, (iu5) obj3, (yci) obj4, (hq5) obj, rvf.R(3073));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                leu.f((tsf) obj7, (wct) obj6, (ut5) obj5, (vm) obj3, (yci) obj4, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                u2x.i((String) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                k98 k98Var = (k98) obj7;
                fp7 fp7Var = (fp7) obj6;
                fvf fvfVar3 = (fvf) obj5;
                z88 z88Var = (z88) obj4;
                fvf fvfVar4 = (fvf) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var7;
                if (oq5Var11.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    List list4 = k98Var.b;
                    if (list4 == null) {
                        list4 = c5b.a;
                    }
                    rvf.a(fp7Var, y2x.q(androidx.compose.foundation.a.b(d.c(vciVar2, 1.0f), ((dq0) oq5Var11.j(eq0.a)).c.a, vnj.i)), null, null, 1, 0.0f, null, null, false, null, null, null, null, ild.C(-257026195, new k71(fvfVar3, list4, z88Var, fvfVar4, k98Var.a), oq5Var11), oq5Var11, 24576, 24576, 16364);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                rwa.a((iwa) obj7, (e2o) obj6, (Function2) obj5, (Function1) obj3, (yci) obj4, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 17:
                yci yciVar3 = (yci) obj4;
                iab iabVar = (iab) obj7;
                Function0 function03 = (Function0) obj3;
                Function0 function04 = (Function0) obj6;
                dib dibVar = (dib) obj5;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var8;
                if (oq5Var12.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gz2 gz2Var = b2c.o;
                    yci f7 = d.d(yciVar3, 1.0f).f(vciVar2);
                    ta5 a6 = sa5.a(qx0.c, gz2Var, oq5Var12, 48);
                    int i6 = oq5Var12.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var12.l();
                    yci H5 = vnj.H(oq5Var12, f7);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar3);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, a6, wp5.f);
                    g0g.U(oq5Var12, l4, wp5.e);
                    kb5 kb5Var7 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var12, i6, kb5Var7);
                    }
                    g0g.U(oq5Var12, H5, wp5.d);
                    String str5 = iabVar.b;
                    ztd ztdVar = iabVar.e;
                    if (str5.length() > 0) {
                        oq5Var12.Z(-1947199776);
                        xv7.j(iabVar.b, androidx.compose.ui.platform.a.a(a.o(androidx.compose.foundation.a.e(xp3.u(vciVar2, o5g.E(oq5Var12)), false, null, null, function03, 7), 4, 0.0f, 2), DeviceService.KEY_DESC), ((q9b) oq5Var12.j(s9b.a)).d(oq5Var12), 0L, 0L, 3, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var12, 0, 3120, 55032);
                        if (ztdVar == null) {
                            oq5Var12.Z(-1946380850);
                            oq5Var12.p(false);
                        } else {
                            oq5Var12.Z(-1946380849);
                            eta.p(vciVar2, 12, oq5Var12, false);
                        }
                    } else {
                        oq5Var12.Z(-1955371407);
                    }
                    oq5Var12.p(false);
                    if (ztdVar == null) {
                        oq5Var12.Z(-1946206072);
                    } else {
                        oq5Var12.Z(-1946206071);
                        ghh.f(ztdVar, function04, dibVar, null, null, oq5Var12, 0);
                    }
                    oq5Var12.p(false);
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                tt0.r((fud) obj7, (Function0) obj3, (Function0) obj6, (Function0) obj5, (yci) obj4, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 19:
                return a(obj, obj2);
            case 20:
                ((Integer) obj2).getClass();
                ghh.f((ztd) obj7, (Function0) obj3, (dib) obj6, (yci) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 21:
                aqi aqiVar = (aqi) obj7;
                fvf fvfVar5 = (fvf) obj6;
                j2e j2eVar = (j2e) obj5;
                sdr sdrVar = (sdr) obj4;
                sdr sdrVar2 = (sdr) obj3;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    String str6 = (String) sdrVar.getValue();
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = str6;
                    k2s k2sVar = (k2s) aqiVar.getValue();
                    boolean booleanValue2 = ((Boolean) sdrVar2.getValue()).booleanValue();
                    boolean h4 = oq5Var13.h(j2eVar);
                    Object K10 = oq5Var13.K();
                    if (h4 || K10 == kjnVar) {
                        K10 = new v2d(0, j2eVar, j2e.class, "onSearchClick", "onSearchClick()V", 0, 9);
                        oq5Var13.k0(K10);
                    }
                    Function0 function05 = (Function0) ((h9f) K10);
                    boolean h5 = oq5Var13.h(j2eVar);
                    Object K11 = oq5Var13.K();
                    if (h5 || K11 == kjnVar) {
                        K11 = new aub(1, j2eVar, j2e.class, "onTabClick", "onTabClick(I)V", 0, 13);
                        oq5Var13.k0(K11);
                    }
                    Function1 function12 = (Function1) ((h9f) K11);
                    boolean h6 = oq5Var13.h(j2eVar);
                    Object K12 = oq5Var13.K();
                    if (h6 || K12 == kjnVar) {
                        K12 = new le0(2, j2eVar, j2e.class, "onStickyTabClick", "onStickyTabClick(ILcom/yandex/music/shared/design/api/components/tabs/bar/TabBarUiItem;)V", 0, 16);
                        oq5Var13.k0(K12);
                    }
                    xv7.o(str7, k2sVar, booleanValue2, fvfVar5, function05, function12, null, null, (Function2) ((h9f) K12), oq5Var13, ScreenMirroringConfig.Video.BITRATE_1_5MB, 128);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 22:
                String str8 = (String) obj7;
                aqi aqiVar2 = (aqi) obj6;
                fvf fvfVar6 = (fvf) obj5;
                jef jefVar = (jef) obj4;
                sdr sdrVar3 = (sdr) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var10;
                if (oq5Var14.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    k2s k2sVar2 = (k2s) aqiVar2.getValue();
                    boolean booleanValue3 = ((Boolean) sdrVar3.getValue()).booleanValue();
                    boolean h7 = oq5Var14.h(jefVar);
                    Object K13 = oq5Var14.K();
                    if (h7 || K13 == kjnVar) {
                        K13 = new v2d(0, jefVar, jef.class, "onSearchClick", "onSearchClick()V", 0, 21);
                        oq5Var14.k0(K13);
                    }
                    Function0 function06 = (Function0) ((h9f) K13);
                    boolean h8 = oq5Var14.h(jefVar);
                    Object K14 = oq5Var14.K();
                    if (h8 || K14 == kjnVar) {
                        K14 = new kef(1, jefVar, jef.class, "onTabClick", "onTabClick(I)V", 0, 0);
                        oq5Var14.k0(K14);
                    }
                    Function1 function13 = (Function1) ((h9f) K14);
                    if (jefVar.e) {
                        oq5Var14.Z(-2036951481);
                        boolean h9 = oq5Var14.h(jefVar);
                        Object K15 = oq5Var14.K();
                        if (h9 || K15 == kjnVar) {
                            K15 = new v2d(0, jefVar, jef.class, "onBackButtonClick", "onBackButtonClick()V", 0, 22);
                            oq5Var14.k0(K15);
                        }
                        h9fVar = (h9f) K15;
                        oq5Var14.p(false);
                    } else {
                        oq5Var14.Z(-2036918498);
                        oq5Var14.p(false);
                        h9fVar = null;
                    }
                    xv7.o(str8, k2sVar2, booleanValue3, fvfVar6, function06, function13, (Function0) h9fVar, null, null, oq5Var14, 0, 384);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 23:
                return d(obj, obj2);
            case 24:
                return g(obj, obj2);
            case 25:
                return h(obj, obj2);
            case 26:
                return j(obj, obj2);
            case 27:
                return k(obj, obj2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return l(obj, obj2);
            default:
                sai saiVar = (sai) obj7;
                lai laiVar = (lai) obj6;
                lai laiVar2 = (lai) obj5;
                hai haiVar = (hai) obj4;
                pyc pycVar = (pyc) obj3;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var11;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                bci c3 = rbi.c(0, 1, hq5Var11, saiVar.a);
                oq5 oq5Var16 = (oq5) hq5Var11;
                Object K16 = oq5Var16.K();
                if (K16 == kjnVar) {
                    K16 = tlm.f(gld.R(g.a, oq5Var16), oq5Var16);
                }
                mm6 mm6Var = ((fs5) K16).a;
                Unit unit = Unit.a;
                boolean f8 = oq5Var16.f(saiVar) | oq5Var16.h(c3) | oq5Var16.h(mm6Var) | oq5Var16.f(laiVar) | oq5Var16.f(laiVar2);
                Object K17 = oq5Var16.K();
                if (f8 || K17 == kjnVar) {
                    K17 = new ckg(saiVar, c3, mm6Var, laiVar, laiVar2, null, 6);
                    oq5Var16.k0(K17);
                }
                gld.w(oq5Var16, unit, (Function2) K17);
                etn.l(iai.a.a(haiVar), ild.C(-2094305890, new m2g(11, pycVar, c3), oq5Var16), oq5Var16, 56);
                return Unit.a;
        }
    }

    public /* synthetic */ bj(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = obj5;
    }

    public /* synthetic */ bj(uo2 uo2Var, yci yciVar, String str, Function1 function1, wn5 wn5Var, int i) {
        this.a = 5;
        this.d = uo2Var;
        this.b = yciVar;
        this.e = str;
        this.f = function1;
        this.c = wn5Var;
    }

    public /* synthetic */ bj(d85 d85Var, hvq hvqVar, zsq zsqVar, um0 um0Var, o0c o0cVar) {
        this.a = 19;
        this.d = d85Var;
        this.e = hvqVar;
        this.f = zsqVar;
        this.b = um0Var;
        this.c = o0cVar;
    }

    public /* synthetic */ bj(d85 d85Var, Set set, yci yciVar, d85 d85Var2, Function0 function0) {
        this.a = 0;
        this.d = d85Var;
        this.f = set;
        this.b = yciVar;
        this.e = d85Var2;
        this.c = function0;
    }

    public /* synthetic */ bj(ztd ztdVar, Function0 function0, dib dibVar, yci yciVar, yci yciVar2, int i) {
        this.a = 20;
        this.d = ztdVar;
        this.c = function0;
        this.e = dibVar;
        this.b = yciVar;
        this.f = yciVar2;
    }

    public /* synthetic */ bj(fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i) {
        this.a = 18;
        this.d = fudVar;
        this.c = function0;
        this.e = function02;
        this.f = function03;
        this.b = yciVar;
    }

    public /* synthetic */ bj(yci yciVar, i01 i01Var, s01 s01Var, Function0 function0, u9b u9bVar) {
        this.a = 1;
        this.b = yciVar;
        this.d = i01Var;
        this.e = s01Var;
        this.c = function0;
        this.f = u9bVar;
    }

    public /* synthetic */ bj(yci yciVar, iab iabVar, Function0 function0, Function0 function02, dib dibVar) {
        this.a = 17;
        this.b = yciVar;
        this.d = iabVar;
        this.c = function0;
        this.e = function02;
        this.f = dibVar;
    }

    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, Object obj4, yci yciVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.b = yciVar;
    }

    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = obj5;
    }
}
