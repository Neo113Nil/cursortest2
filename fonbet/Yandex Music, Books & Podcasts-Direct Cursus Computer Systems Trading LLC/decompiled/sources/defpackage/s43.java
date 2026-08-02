package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class s43 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s43(j2s j2sVar, Function1 function1, yci yciVar, boolean z, int i) {
        this.a = 23;
        this.c = j2sVar;
        this.e = function1;
        this.d = yciVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj, Object obj2) {
        long j;
        yhs yhsVar = (yhs) this.c;
        pfm pfmVar = (pfm) this.d;
        Function1 function1 = (Function1) this.e;
        lfm lfmVar = (lfm) obj;
        lfmVar.getClass();
        lfmVar.a();
        yhsVar.d.setValue(Boolean.TRUE);
        long j2 = ((iur) pfmVar).y;
        long j3 = (((j2 << 32) >> 33) & 4294967295L) | ((j2 >> 33) << 32);
        long floatToRawIntBits = (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L);
        long j4 = lfmVar.c;
        float degrees = (float) Math.toDegrees(Math.atan2(Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L))));
        if (degrees < 0.0f) {
            degrees += 360.0f;
        }
        int F = hyf.F(yhsVar.a());
        long a = yhsVar.a();
        msa msaVar = nsa.b;
        long n = nsa.n(a, yd5.M(hyf.F(a), ssa.HOURS));
        ssa ssaVar = ssa.SECONDS;
        float s = nsa.s(n, ssaVar) / 10.0f;
        if (240.0f <= s && s <= 360.0f && 0.0f <= degrees && degrees <= 120.0f) {
            F++;
        }
        long a2 = yhsVar.a();
        int i = F;
        float s2 = nsa.s(nsa.n(a2, yd5.M(hyf.F(a2), r10)), ssaVar) / 10.0f;
        long M = yd5.M((((0.0f > s2 || s2 > 120.0f || 240.0f > degrees || degrees > 360.0f) ? i : i - 1) * 3600) + eeh.b(degrees * 10), ssaVar);
        long M2 = yd5.M(0, ssaVar);
        ssa ssaVar2 = ssa.MINUTES;
        long M3 = yd5.M(5, ssaVar2);
        long a3 = yhsVar.a();
        if (new nsa(a3).compareTo(new nsa(M2)) >= 0 && new nsa(a3).compareTo(new nsa(M3)) <= 0) {
            long M4 = yd5.M(30, ssaVar2);
            if (new nsa(M).compareTo(new nsa(yd5.M(60, ssaVar2))) <= 0 && new nsa(M).compareTo(new nsa(M4)) >= 0 && hyf.F(yhsVar.a()) == 0) {
                j = yd5.M(1, ssaVar2);
                yhsVar.c.setValue(new nsa(j));
                function1.invoke(new nsa(!this.b ? hyf.H(yhsVar.a()) : yhsVar.a()));
                return Unit.a;
            }
        }
        j = ((nsa) yhn.i(new nsa(M), new nsa(yhsVar.a), new nsa(yhsVar.b))).a;
        yhsVar.c.setValue(new nsa(j));
        function1.invoke(new nsa(!this.b ? hyf.H(yhsVar.a()) : yhsVar.a()));
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int R = rvf.R(1);
        gdg.c((String) this.c, (yci) this.d, this.b, (Function2) this.e, (hq5) obj, R);
        return Unit.a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var;
        boolean z;
        ik ikVar;
        ut5 ut5Var;
        k2v k2vVar;
        aqi aqiVar;
        int i = this.a;
        Object obj3 = gq5.a;
        boolean z2 = this.b;
        yci yciVar = vci.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                irf.g((z43) obj6, (yci) obj5, (o0k) obj4, this.b, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                i4w.d(this.b, (sb3) obj6, (Function0) obj5, (Function0) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                vwb.y(this.b, (String) obj6, (jzb) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                eml emlVar = (eml) obj6;
                st4 st4Var = (st4) obj5;
                sdr sdrVar = (sdr) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var2;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                yci r = d.r(yciVar, 92);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var2 = (oq5) hq5Var2;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var2, r);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var2, d, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                boolean z3 = emlVar.b;
                b bVar = b.a;
                if (z3) {
                    oq5Var2.Z(-1879566776);
                    boolean z4 = emlVar.a == j1g.a;
                    long j = ((dq0) ((oq5) hq5Var2).j(eq0.a)).a.g;
                    yci a = bVar.a(yciVar, b2c.e);
                    boolean g = oq5Var2.g(z2) | oq5Var2.h(st4Var);
                    Object K = oq5Var2.K();
                    if (g || K == obj3) {
                        K = new ps(z2, st4Var, 2);
                        oq5Var2.k0(K);
                    }
                    hq5Var = hq5Var2;
                    saf.q(z4, (Function0) K, a, null, j, 0L, hq5Var, 0, 40);
                    z = false;
                } else {
                    hq5Var = hq5Var2;
                    z = false;
                    oq5Var2.Z(-1901554270);
                }
                oq5Var2.p(z);
                boolean z5 = ((u7l) sdrVar.getValue()).a;
                boolean h = oq5Var2.h(st4Var);
                Object K2 = oq5Var2.K();
                if (h || K2 == obj3) {
                    K2 = new ub4(0, st4Var, st4.class, "onPlayClick", "onPlayClick()V", 0, 10);
                    oq5Var2.k0(K2);
                }
                saf.r(z5, (Function0) ((h9f) K2), bVar.a(yciVar, b2c.g), 0L, hq5Var, 0);
                oq5Var2.p(true);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                qt4.g((CharSequence) obj6, this.b, (jzb) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                ox6.f(rvf.R(1), (hq5) obj, (yci) obj5, (String) obj6, (String) obj4, this.b);
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                qwp.i((ct5) obj6, (Function0) obj4, this.b, (yci) obj5, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 7:
                bu5 bu5Var = (bu5) obj6;
                ut5 ut5Var2 = (ut5) obj5;
                tsf tsfVar = (tsf) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                boolean z6 = bu5Var instanceof au5;
                boolean z7 = bu5Var instanceof zt5;
                ogp.g.e(z6, z7 && (((zt5) bu5Var).a instanceof ft5), null, hq5Var3, 4096, 4);
                if (ut5Var2.g) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    oq5Var4.Z(281150169);
                    if (z6) {
                        oq5Var4.Z(2053741602);
                        oq5Var4.p(false);
                        ikVar = fk.a;
                    } else {
                        if (!z7) {
                            throw vz1.i(oq5Var4, 2053740353, false);
                        }
                        oq5Var4.Z(-758419646);
                        wct wctVar = ((zt5) bu5Var).a;
                        if (wctVar instanceof ft5) {
                            oq5Var4.Z(2053747876);
                            oq5Var4.p(false);
                            ikVar = gk.a;
                        } else {
                            if (!(wctVar instanceof gt5)) {
                                throw vz1.i(oq5Var4, 2053744832, false);
                            }
                            oq5Var4.Z(-758229802);
                            String str = ((gt5) wctVar).i;
                            if (str == null) {
                                str = vz1.n(oq5Var4, 2053754078, R.string.concert_catalog_full_title, oq5Var4, false);
                            } else {
                                oq5Var4.Z(2053753396);
                                oq5Var4.p(false);
                            }
                            hk hkVar = new hk(str);
                            oq5Var4.p(false);
                            ikVar = hkVar;
                        }
                        oq5Var4.p(false);
                    }
                    oq5Var4.p(false);
                } else {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    oq5Var5.Z(281026789);
                    ikVar = new hk(rvf.M(R.string.concerts_catalog_title, oq5Var5));
                    oq5Var5.p(false);
                }
                ik ikVar2 = ikVar;
                oq5 oq5Var6 = (oq5) hq5Var3;
                boolean h2 = oq5Var6.h(ut5Var2);
                Object K3 = oq5Var6.K();
                if (h2 || K3 == obj3) {
                    ut5Var = ut5Var2;
                    K3 = new e65(0, ut5Var, ut5.class, "onBackClick", "onBackClick()V", 0, 4);
                    oq5Var6.k0(K3);
                } else {
                    ut5Var = ut5Var2;
                }
                h9f h9fVar = (h9f) K3;
                boolean z8 = this.b;
                xp3.c(ikVar2, tsfVar, androidx.compose.ui.platform.a.a(yciVar, "concert_catalog_content"), null, (Function0) h9fVar, null, !z8, false, null, null, null, ild.C(-332001061, new pu(ut5Var, z8, bu5Var, tsfVar, 2), oq5Var6), oq5Var6, 384, 48, 1960);
                return Unit.a;
            case 8:
                bci bciVar = (bci) obj6;
                ew5 ew5Var = (ew5) obj5;
                nsh nshVar = (nsh) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                fvf a2 = hvf.a(0, 0, hq5Var4, 0, 3);
                oq5 oq5Var8 = (oq5) hq5Var4;
                yd5.f(null, null, bciVar, a2, null, false, false, false, 0L, 0L, 0.0f, ild.C(1432017407, new zv5(ew5Var, ((hai) oq5Var8.j(iai.a)).b.b(), nshVar, this.b, a2), oq5Var8), oq5Var8, 4096, 4071);
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                qld.g((un6) obj6, (mcu) obj4, this.b, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                vwb.k(this.b, (Function0) obj6, (Function0) obj5, (Function0) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                qgg.e((l8i) obj6, (List) obj4, this.b, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                rhi rhiVar = (rhi) obj6;
                e9g e9gVar = (e9g) obj5;
                aqi aqiVar2 = (aqi) obj4;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                qhi.b(rhiVar.c, (qmu) aqiVar2.getValue(), d.m(yciVar, lsq.s(e9gVar)), this.b, hq5Var5, 0, 0);
                return Unit.a;
            case 13:
                ges gesVar = (ges) obj6;
                raj rajVar = (raj) obj5;
                cdj cdjVar = (cdj) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (oq5Var10.P(intValue & 1, (intValue & 3) != 2)) {
                    float p = w1g.p(gesVar, 0, oq5Var10, 0, 2) * 2;
                    float f = mu0.a;
                    yci u = d.u(d.e(yciVar, w1g.p(nu0.i(), 0, oq5Var10, 0, 2) + p + f), b2c.l, true);
                    ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var10, 6);
                    int i3 = oq5Var10.P;
                    a l2 = oq5Var10.l();
                    yci H2 = vnj.H(oq5Var10, u);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var10.d0();
                    if (oq5Var10.O) {
                        oq5Var10.k(grbVar2);
                    } else {
                        oq5Var10.n0();
                    }
                    g0g.U(oq5Var10, a3, wp5.f);
                    g0g.U(oq5Var10, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var10, i3, kb5Var2);
                    }
                    g0g.U(oq5Var10, H2, wp5.d);
                    String str2 = rajVar.b;
                    boolean z9 = rajVar.e;
                    jzb jzbVar = rajVar.d;
                    boolean z10 = this.b;
                    qgg.r(str2, z9, jzbVar, gesVar, z10, 2, oq5Var10, 196608, 0);
                    u1g.l(oq5Var10, d.e(yciVar, f));
                    if (rajVar.g) {
                        oq5Var10.Z(1538681048);
                        xcs.b(rvf.M(R.string.bookmate_plus_badge_text, oq5Var10), androidx.compose.ui.platform.a.a(yciVar, "non_music_bookmate_badge"), d85.f, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ges.a(nu0.i(), j66.m0()), oq5Var10, 432, 3120, 55288);
                        oq5Var10.p(false);
                    } else {
                        oq5Var10.Z(1539133090);
                        asq.i(rajVar.f, z10, cdjVar, false, oq5Var10, 3072);
                        oq5Var10.p(false);
                    }
                    oq5Var10.p(true);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 14:
                kbj kbjVar = (kbj) obj6;
                w3g w3gVar = (w3g) obj5;
                ges gesVar2 = (ges) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var7;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                yci d2 = d.d(yciVar, 1.0f);
                ta5 a4 = sa5.a(qx0.c, b2c.n, hq5Var7, 0);
                oq5 oq5Var12 = (oq5) hq5Var7;
                int i4 = oq5Var12.P;
                a l3 = oq5Var12.l();
                yci H3 = vnj.H(hq5Var7, d2);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var12.d0();
                if (oq5Var12.O) {
                    oq5Var12.k(grbVar3);
                } else {
                    oq5Var12.n0();
                }
                g0g.U(hq5Var7, a4, wp5.f);
                g0g.U(hq5Var7, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var12, i4, kb5Var3);
                }
                g0g.U(hq5Var7, H3, wp5.d);
                jzb jzbVar2 = kbjVar.f;
                bg3.a(null, null, false, ild.C(1081298684, new ttb(kbjVar, this.b, ox6.E(jzbVar2, 0L, hq5Var7, 6), jzbVar2 != null, gesVar2), hq5Var7), hq5Var7, 3072, 7);
                if (kbjVar.h) {
                    oq5Var12.Z(1845494368);
                    u1g.l(hq5Var7, d.e(yciVar, mu0.a));
                    String M = rvf.M(R.string.bookmate_plus_badge_text, hq5Var7);
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    xv7.j(M, androidx.compose.ui.platform.a.a(yciVar, "non_music_list_item_bookmate_badge"), d85.f, 0L, 0L, 0, 0L, 2, false, 1, 0, null, ges.a(nu0.i(), j66.m0()), hq5Var7, 432, 3120, 55288);
                    oq5Var12.p(false);
                } else if (w3gVar != null) {
                    oq5Var12.Z(1846148685);
                    u1g.l(hq5Var7, d.e(yciVar, mu0.a));
                    v3g.d(w3gVar, androidx.compose.ui.platform.a.a(yciVar, "non_music_list_item_subscribers_count"), false, hq5Var7, 48, 4);
                    oq5Var12.p(false);
                } else {
                    oq5Var12.Z(1860679318);
                    oq5Var12.p(false);
                }
                String str3 = kbjVar.c;
                if (str3 != null) {
                    oq5Var12.Z(1846595736);
                    u1g.l(hq5Var7, d.e(yciVar, mu0.a));
                    h6g h6gVar3 = nu0.a;
                    h6g h6gVar4 = h6g.c;
                    xv7.j(str3, androidx.compose.ui.platform.a.a(yciVar, "non_music_list_item_subtitle"), ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var7, 48, 3120, 55288);
                } else {
                    oq5Var12.Z(1841925648);
                }
                oq5Var12.p(false);
                oq5Var12.p(true);
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                asq.o((g0t) obj6, this.b, (cdj) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                rvf.k((Function1) obj6, (yci) obj5, this.b, (hmj) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                zy2 zy2Var = (zy2) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var8;
                if (oq5Var13.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (zy2Var.c) {
                        oq5Var13.Z(-914178012);
                        nho a5 = lho.a(qx0.a, b2c.l, oq5Var13, 48);
                        int i5 = oq5Var13.P;
                        a l4 = oq5Var13.l();
                        yci H4 = vnj.H(oq5Var13, yciVar);
                        xp5.T.getClass();
                        grb grbVar4 = wp5.b;
                        oq5Var13.d0();
                        if (oq5Var13.O) {
                            oq5Var13.k(grbVar4);
                        } else {
                            oq5Var13.n0();
                        }
                        g0g.U(oq5Var13, a5, wp5.f);
                        g0g.U(oq5Var13, l4, wp5.e);
                        kb5 kb5Var4 = wp5.g;
                        if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i5))) {
                            ouj.x(i5, oq5Var13, i5, kb5Var4);
                        }
                        g0g.U(oq5Var13, H4, wp5.d);
                        if (zy2Var.b) {
                            oq5Var13.Z(1978176703);
                            u1g.o(0, 0L, oq5Var13, null, function0);
                        } else {
                            oq5Var13.Z(1976833690);
                        }
                        oq5Var13.p(false);
                        xp3.h(0, oq5Var13, null, function02, z2);
                        oq5Var13.p(true);
                    } else {
                        oq5Var13.Z(-915413703);
                    }
                    oq5Var13.p(false);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 18:
                vm7 vm7Var = (vm7) obj6;
                Function0 function03 = (Function0) obj5;
                Function0 function04 = (Function0) obj4;
                hq5 hq5Var9 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var9;
                if (oq5Var14.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (vm7Var.b) {
                        oq5Var14.Z(-773638789);
                        nho a6 = lho.a(qx0.a, b2c.l, oq5Var14, 48);
                        int i6 = oq5Var14.P;
                        a l5 = oq5Var14.l();
                        yci H5 = vnj.H(oq5Var14, yciVar);
                        xp5.T.getClass();
                        grb grbVar5 = wp5.b;
                        oq5Var14.d0();
                        if (oq5Var14.O) {
                            oq5Var14.k(grbVar5);
                        } else {
                            oq5Var14.n0();
                        }
                        g0g.U(oq5Var14, a6, wp5.f);
                        g0g.U(oq5Var14, l5, wp5.e);
                        kb5 kb5Var5 = wp5.g;
                        if (oq5Var14.O || !Intrinsics.d(oq5Var14.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var14, i6, kb5Var5);
                        }
                        g0g.U(oq5Var14, H5, wp5.d);
                        if (vm7Var.a) {
                            oq5Var14.Z(5509526);
                            u1g.o(0, 0L, oq5Var14, null, function03);
                        } else {
                            oq5Var14.Z(3840455);
                        }
                        oq5Var14.p(false);
                        xp3.h(0, oq5Var14, null, function04, z2);
                        oq5Var14.p(true);
                    } else {
                        oq5Var14.Z(-775200538);
                    }
                    oq5Var14.p(false);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 19:
                bz2 bz2Var = (bz2) obj6;
                Function0 function05 = (Function0) obj5;
                Function0 function06 = (Function0) obj4;
                hq5 hq5Var10 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    nho a7 = lho.a(qx0.a, b2c.l, oq5Var15, 48);
                    int i7 = oq5Var15.P;
                    a l6 = oq5Var15.l();
                    yci H6 = vnj.H(oq5Var15, yciVar);
                    xp5.T.getClass();
                    grb grbVar6 = wp5.b;
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar6);
                    } else {
                        oq5Var15.n0();
                    }
                    g0g.U(oq5Var15, a7, wp5.f);
                    g0g.U(oq5Var15, l6, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var15.O || !Intrinsics.d(oq5Var15.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var15, i7, kb5Var6);
                    }
                    g0g.U(oq5Var15, H6, wp5.d);
                    if (bz2Var.b) {
                        oq5Var15.Z(-1783677617);
                        u1g.o(0, 0L, oq5Var15, null, function05);
                    } else {
                        oq5Var15.Z(-1784994590);
                    }
                    oq5Var15.p(false);
                    xp3.h(0, oq5Var15, null, function06, z2);
                    oq5Var15.p(true);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 20:
                zy2 zy2Var2 = (zy2) obj6;
                Function0 function07 = (Function0) obj5;
                Function0 function08 = (Function0) obj4;
                hq5 hq5Var11 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var16 = (oq5) hq5Var11;
                if (oq5Var16.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (zy2Var2.c) {
                        oq5Var16.Z(-1433478209);
                        nho a8 = lho.a(qx0.a, b2c.l, oq5Var16, 48);
                        int i8 = oq5Var16.P;
                        a l7 = oq5Var16.l();
                        yci H7 = vnj.H(oq5Var16, yciVar);
                        xp5.T.getClass();
                        grb grbVar7 = wp5.b;
                        oq5Var16.d0();
                        if (oq5Var16.O) {
                            oq5Var16.k(grbVar7);
                        } else {
                            oq5Var16.n0();
                        }
                        g0g.U(oq5Var16, a8, wp5.f);
                        g0g.U(oq5Var16, l7, wp5.e);
                        kb5 kb5Var7 = wp5.g;
                        if (oq5Var16.O || !Intrinsics.d(oq5Var16.K(), Integer.valueOf(i8))) {
                            ouj.x(i8, oq5Var16, i8, kb5Var7);
                        }
                        g0g.U(oq5Var16, H7, wp5.d);
                        if (zy2Var2.b) {
                            oq5Var16.Z(-1346220454);
                            u1g.o(0, 0L, oq5Var16, null, function07);
                        } else {
                            oq5Var16.Z(-1347410699);
                        }
                        oq5Var16.p(false);
                        xp3.h(0, oq5Var16, null, function08, z2);
                        oq5Var16.p(true);
                    } else {
                        oq5Var16.Z(-1434561132);
                    }
                    oq5Var16.p(false);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                tyf.g((pzo) obj6, (ozo) obj4, this.b, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                bfg.a((String) obj6, (jzb) obj5, this.b, (e9g) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                hdg.v((j2s) obj6, (Function1) obj4, (yci) obj5, this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                dag.k((oht) obj6, this.b, (Function1) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                return a(obj, obj2);
            case 26:
                CharSequence charSequence = (CharSequence) obj6;
                Function0 function09 = (Function0) obj5;
                Function0 function010 = (Function0) obj4;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var12;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var18 = (oq5) hq5Var12;
                if (charSequence != null) {
                    oq5Var18.Z(2055693145);
                    oq5Var18.Z(-1042060546);
                    yci d3 = d.d(yciVar, 1.0f);
                    if (z2) {
                        yciVar = androidx.compose.foundation.a.i(xp3.u(yciVar, o5g.E(oq5Var18)), rvf.M(R.string.copy, oq5Var18), irf.S(function09, oq5Var18, 0), function010, 39);
                    }
                    yci f2 = d3.f(yciVar);
                    oq5Var18.p(false);
                    Object K4 = oq5Var18.K();
                    if (K4 == obj3) {
                        K4 = new phs(5);
                        oq5Var18.k0(K4);
                    }
                    szf.u(charSequence, nfp.b(f2, false, (Function1) K4), oq5Var18, 0);
                } else {
                    oq5Var18.Z(2051540788);
                }
                oq5Var18.p(false);
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                ((qbt) obj6).w((yci) obj5, (zbt) obj4, this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return d(obj, obj2);
            default:
                ltu ltuVar = (ltu) obj6;
                sdr sdrVar2 = (sdr) obj5;
                ab0 ab0Var = (ab0) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var13;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var20 = (oq5) hq5Var13;
                boolean booleanValue = ((Boolean) oq5Var20.j(upg.a)).booleanValue();
                int i9 = 14;
                boolean z11 = this.b;
                if (booleanValue) {
                    oq5Var20.Z(-1003168581);
                    boolean f3 = oq5Var20.f(ltuVar);
                    Object K5 = oq5Var20.K();
                    if (f3 || K5 == obj3) {
                        K5 = ltuVar.a();
                        oq5Var20.k0(K5);
                    }
                    s2v s2vVar = (s2v) K5;
                    aqi M2 = gld.M(s2vVar.h, oq5Var20);
                    Object K6 = oq5Var20.K();
                    if (K6 == obj3) {
                        K6 = szf.U(new f6u(M2, 14));
                        oq5Var20.k0(K6);
                    }
                    sdr sdrVar3 = (sdr) K6;
                    sdrVar2.getClass();
                    sdrVar3.getClass();
                    c4v c4vVar = (c4v) sdrVar2.getValue();
                    if ((c4vVar instanceof z3v) || Intrinsics.d(c4vVar, a4v.a)) {
                        k2vVar = null;
                    } else {
                        if (!(c4vVar instanceof b4v)) {
                            b6e.s();
                            return null;
                        }
                        k2vVar = ((b4v) c4vVar).a.b.a;
                    }
                    a6v C = aaw.C(k2vVar, ((Boolean) sdrVar3.getValue()).booleanValue(), oq5Var20);
                    act S = weo.S(300, 0, null, 6);
                    sdr b = bmq.b(C.b(), S, "WavePrimaryColorAnim", oq5Var20, 432, 8);
                    sdr b2 = bmq.b(C.a(), S, "WaveSecondaryColorAnim", oq5Var20, 432, 8);
                    sdr b3 = bmq.b(C.d(), S, "WaveWordsButtonColorAnim", oq5Var20, 432, 8);
                    sdr V = zwf.V(S, sk3.Y(C.c()), oq5Var20, 0);
                    Object K7 = oq5Var20.K();
                    if (K7 == obj3) {
                        K7 = szf.g0(zlu.b);
                        oq5Var20.k0(K7);
                    }
                    aqi aqiVar3 = (aqi) K7;
                    Object[] objArr = {b, b2, b3, V};
                    boolean f4 = oq5Var20.f(b) | oq5Var20.f(b2) | oq5Var20.f(b3) | oq5Var20.f(V);
                    Object K8 = oq5Var20.K();
                    if (f4 || K8 == obj3) {
                        K8 = new lua(b, b2, b3, V, aqiVar3, null, 0);
                        aqiVar = aqiVar3;
                        oq5Var20.k0(K8);
                    } else {
                        aqiVar = aqiVar3;
                    }
                    gld.z(objArr, (Function2) K8, oq5Var20);
                    agr agrVar = zlu.d;
                    boolean f5 = oq5Var20.f(aqiVar);
                    Object K9 = oq5Var20.K();
                    if (f5 || K9 == obj3) {
                        K9 = new f6u(aqiVar, 15);
                        oq5Var20.k0(K9);
                    }
                    etn.l(agrVar.a((Function0) K9), ild.C(270807724, new hqq(z11, ltuVar, s2vVar, sdrVar2, sdrVar3, M2, ab0Var, aqiVar), oq5Var20), oq5Var20, 56);
                    oq5Var20.p(false);
                } else {
                    oq5Var20.Z(-998699807);
                    Object value = sdrVar2.getValue();
                    Object K10 = oq5Var20.K();
                    if (K10 == obj3) {
                        K10 = new xlu(26);
                        oq5Var20.k0(K10);
                    }
                    ot0.l(value, (Function1) K10, null, null, null, false, ild.C(1793179810, new qt(ltuVar, z11, ab0Var, i9), oq5Var20), oq5Var20, 1769520, 28);
                    oq5Var20.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ s43(Object obj, yci yciVar, Object obj2, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = yciVar;
        this.e = obj2;
        this.b = z;
    }

    public /* synthetic */ s43(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ s43(Object obj, Object obj2, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.b = z;
        this.d = yciVar;
    }

    public /* synthetic */ s43(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ s43(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ s43(Object obj, boolean z, Object obj2, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.e = obj2;
        this.d = yciVar;
    }

    public /* synthetic */ s43(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ s43(boolean z, Object obj, Function0 function0, Function0 function02, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = obj;
        this.d = function0;
        this.e = function02;
    }

    public /* synthetic */ s43(boolean z, String str, Object obj, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.e = obj;
        this.d = yciVar;
    }
}
