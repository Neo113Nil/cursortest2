package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import com.connectsdk.service.DeviceService;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj, Object obj2) {
        d85 d85Var;
        ka1 ka1Var = (ka1) this.b;
        yi1 yi1Var = (yi1) this.c;
        tvd tvdVar = (tvd) this.d;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        te teVar = ka1Var.i;
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = oq5Var2.h(yi1Var);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            m71 m71Var = new m71(0, yi1Var, yi1.class, "onBrandedButtonClick", "onBrandedButtonClick()V", 0, 10);
            oq5Var2.k0(m71Var);
            K = m71Var;
        }
        h9f h9fVar = (h9f) K;
        boolean h2 = oq5Var2.h(yi1Var);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            m71 m71Var2 = new m71(0, yi1Var, yi1.class, "onBrandedButtonShown", "onBrandedButtonShown()V", 0, 11);
            oq5Var2.k0(m71Var2);
            K2 = m71Var2;
        }
        h9f h9fVar2 = (h9f) K2;
        boolean f = oq5Var2.f(tvdVar);
        Object K3 = oq5Var2.K();
        if (f || K3 == kjnVar) {
            K3 = new nr(tvdVar, 8);
            oq5Var2.k0(K3);
        }
        yci s = wyf.s(vci.a, (Function0) K3);
        q0k c = a.c(0.0f, 20, 0.0f, 0.0f, 13);
        q9b q9bVar = (q9b) oq5Var2.j(s9b.a);
        if (q9bVar.a != 16) {
            p85 p85Var = q9bVar.b;
            p85Var.getClass();
            d85Var = new d85(p85.a(p85Var, 0.0f, yhn.c(p85Var.c + 0.1f, 0.2f, 0.7f), 11).b());
        } else {
            d85Var = null;
        }
        xp3.e(teVar, (Function0) h9fVar, s, (Function0) h9fVar2, 0.0f, c, d85Var, oq5Var2, 196608, 16);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0873  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ty tyVar;
        List list;
        ey eyVar;
        qy qyVar;
        ey eyVar2;
        py pyVar;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.a;
        my myVar = my.a;
        int i2 = 4;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                y3 y3Var = (y3) obj5;
                n4 n4Var = (n4) obj4;
                kkp kkpVar = (kkp) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                exa exaVar = (exa) ((ep5) y3Var.c).invoke(n4Var.a, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(exaVar) | oq5Var2.f(n4Var) | oq5Var2.f(kkpVar);
                Object K = oq5Var2.K();
                if (f || K == kjnVar) {
                    K = new b4(n4Var, kkpVar, exaVar);
                    oq5Var2.k0(K);
                }
                etn.m.invoke((b4) K, oq5Var2, 0);
                return Unit.a;
            case 1:
                i3 i3Var = (i3) obj5;
                ge geVar = (ge) obj4;
                qnq qnqVar = (qnq) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object K2 = oq5Var4.K();
                if (K2 == kjnVar) {
                    hn5 hn5Var = qnqVar.b;
                    s63 s63Var = geVar.a;
                    hn5Var.getClass();
                    K2 = new be(geVar, new yfx(hn5Var, d.p(((sd) s63Var.a).c)));
                    oq5Var4.k0(K2);
                }
                ((wn5) i3Var.c).invoke((be) K2, oq5Var4, 0);
                return Unit.a;
            case 2:
                bci bciVar = (bci) obj5;
                il ilVar = (il) obj4;
                aqi aqiVar = (aqi) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                j66.a(bciVar, (ml) aqiVar.getValue(), ilVar, hq5Var3, 8);
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                j66.a((bci) obj5, (ml) obj4, (il) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 4:
                e9g e9gVar = (e9g) obj5;
                klu kluVar = (klu) obj4;
                sdr sdrVar = (sdr) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                float s = lsq.s(e9gVar);
                int ordinal = e9gVar.ordinal();
                if (ordinal == 0) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(426926575);
                    y1g.t(kluVar, (qmu) sdrVar.getValue(), androidx.compose.foundation.layout.d.m(vciVar, s), null, null, oq5Var7, 0, 24);
                    oq5Var7.p(false);
                } else {
                    if (ordinal != 1) {
                        throw vz1.i((oq5) hq5Var4, -2064439348, false);
                    }
                    oq5 oq5Var8 = (oq5) hq5Var4;
                    oq5Var8.Z(427206350);
                    swf.m(kluVar.c, kluVar.f, (qmu) sdrVar.getValue(), s, androidx.compose.foundation.layout.d.m(vciVar, s), oq5Var8, 0);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 5:
                bci bciVar2 = (bci) obj5;
                hr hrVar = (hr) obj4;
                aqi aqiVar2 = (aqi) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                gld.a((mr) aqiVar2.getValue(), bciVar2, hrVar, androidx.compose.ui.platform.a.a(vciVar, "album_bottom_sheet_dialog"), hq5Var5, 3136);
                return Unit.a;
            case 6:
                ru ruVar = (ru) obj5;
                e9g e9gVar2 = (e9g) obj4;
                ges gesVar = (ges) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var6, 0);
                oq5 oq5Var11 = (oq5) hq5Var6;
                int i3 = oq5Var11.P;
                androidx.compose.runtime.internal.a l = oq5Var11.l();
                yci H = vnj.H(hq5Var6, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar);
                } else {
                    oq5Var11.n0();
                }
                g0g.U(hq5Var6, a, wp5.f);
                g0g.U(hq5Var6, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var11.O || !Intrinsics.d(oq5Var11.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var11, i3, kb5Var);
                }
                g0g.U(hq5Var6, H, wp5.d);
                jzb jzbVar = ruVar.e;
                bg3.a(null, null, false, ild.C(-1831829497, new pu(ruVar, ox6.E(jzbVar, 0L, hq5Var6, 6), jzbVar != null, gesVar), hq5Var6), hq5Var6, 3072, 7);
                String str = ruVar.c;
                String str2 = ruVar.d;
                int ordinal2 = e9gVar2.ordinal();
                if (ordinal2 == 0) {
                    oq5Var11.Z(1250560332);
                    if (str != null) {
                        oq5Var11.Z(1250579614);
                        u1g.l(hq5Var6, androidx.compose.foundation.layout.d.e(vciVar, mu0.a));
                        h6g h6gVar = nu0.a;
                        h6g h6gVar2 = h6g.c;
                        xv7.j(str, androidx.compose.foundation.layout.d.d(androidx.compose.ui.platform.a.a(vciVar, "artist"), 1.0f), ((dq0) ((oq5) hq5Var6).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var6, 48, 3120, 55288);
                        z = false;
                    } else {
                        z = false;
                        oq5Var11.Z(1247296869);
                    }
                    oq5Var11.p(z);
                    if (str2 != null) {
                        oq5Var11.Z(1251232474);
                        u1g.l(hq5Var6, androidx.compose.foundation.layout.d.e(vciVar, mu0.a));
                        h6g h6gVar3 = nu0.a;
                        h6g h6gVar4 = h6g.c;
                        xv7.j(str2, androidx.compose.foundation.layout.d.d(androidx.compose.ui.platform.a.a(vciVar, "subtitle"), 1.0f), ((dq0) ((oq5) hq5Var6).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var6, 48, 3120, 55288);
                        z2 = false;
                    } else {
                        z2 = false;
                        oq5Var11.Z(1247296869);
                    }
                    oq5Var11.p(z2);
                    oq5Var11.p(z2);
                } else {
                    if (ordinal2 != 1) {
                        throw vz1.i(oq5Var11, -1899322807, false);
                    }
                    oq5Var11.Z(1251908925);
                    StringBuilder sb = new StringBuilder();
                    if (str != null) {
                        sb.append(str);
                    }
                    if (str != null && str2 != null) {
                        sb.append(" · ");
                    }
                    if (str2 != null) {
                        sb.append(str2);
                    }
                    String sb2 = sb.toString();
                    u1g.l(hq5Var6, androidx.compose.foundation.layout.d.e(vciVar, mu0.a));
                    h6g h6gVar5 = nu0.a;
                    h6g h6gVar6 = h6g.c;
                    xv7.j(sb2, androidx.compose.foundation.layout.d.d(androidx.compose.ui.platform.a.a(vciVar, "subtitle"), 1.0f), ((dq0) ((oq5) hq5Var6).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var6, 48, 3120, 55288);
                    oq5Var11.p(false);
                }
                oq5Var11.p(true);
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                xv.b((yv) obj5, (j00) obj4, (gvd) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                fz fzVar = (fz) obj5;
                o00 o00Var = (o00) obj4;
                iab iabVar = o00Var.a;
                mt mtVar = o00Var.b;
                fud fudVar = (fud) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var7;
                if (oq5Var12.P(intValue & 1, (intValue & 3) != 2)) {
                    gy gyVar = (gy) szf.Q(fzVar.n, oq5Var12).getValue();
                    gy gyVar2 = (gy) szf.Q(fzVar.o, oq5Var12).getValue();
                    aqi Q = szf.Q(fzVar.p, oq5Var12);
                    List list2 = (List) szf.Q(fzVar.q, oq5Var12).getValue();
                    j00 A = bow.A(fzVar, mtVar, oq5Var12);
                    aqi Q2 = szf.Q(A.o, oq5Var12);
                    ivd f0 = etn.f0(iabVar.c, fudVar, A.q, oq5Var12, 0, 8);
                    sz szVar = (sz) Q.getValue();
                    boolean booleanValue = ((Boolean) Q2.getValue()).booleanValue();
                    boolean z6 = fzVar.j;
                    szVar.getClass();
                    list2.getClass();
                    oq oqVar = mtVar.a;
                    lt B = lxe.B(oqVar);
                    if (list2.isEmpty() || u2x.I(oqVar) || !z6) {
                        list2 = null;
                    }
                    ry ryVar = list2 != null ? new ry(list2) : null;
                    te teVar = iabVar.f;
                    ly lyVar = teVar != null ? new ly(teVar) : null;
                    qz qzVar = szVar instanceof qz ? (qz) szVar : null;
                    ny nyVar = qzVar != null ? new ny(qzVar) : null;
                    sy syVar = new sy(o00Var.c);
                    o1u o1uVar = iabVar.g;
                    if (o1uVar != null) {
                        if (z6) {
                            o1uVar = null;
                        }
                        if (o1uVar != null) {
                            StationId stationId = StationId.a;
                            StationId a2 = StationId.a(oqVar.a);
                            a2.getClass();
                            tyVar = new ty(a2, o1uVar);
                            list = o00Var.d;
                            if (list.isEmpty()) {
                                list = null;
                            }
                            oy oyVar = list == null ? new oy(list) : null;
                            eyVar = !(gyVar2 instanceof ey) ? (ey) gyVar2 : null;
                            if (eyVar != null) {
                                if (eyVar.b.isEmpty()) {
                                    eyVar = null;
                                }
                                if (eyVar != null) {
                                    qyVar = new qy(eyVar);
                                    eyVar2 = gyVar instanceof ey ? (ey) gyVar : null;
                                    if (eyVar2 != null) {
                                        if (eyVar2.b.isEmpty()) {
                                            eyVar2 = null;
                                        }
                                        if (eyVar2 != null) {
                                            pyVar = new py(eyVar2);
                                            xv.b(new yv(B, iabVar, ryVar, lyVar, nyVar, syVar, tyVar, oyVar, qyVar, pyVar, !booleanValue ? myVar : null), A, f0, oq5Var12, 0);
                                        }
                                    }
                                    pyVar = null;
                                    xv.b(new yv(B, iabVar, ryVar, lyVar, nyVar, syVar, tyVar, oyVar, qyVar, pyVar, !booleanValue ? myVar : null), A, f0, oq5Var12, 0);
                                }
                            }
                            qyVar = null;
                            if (gyVar instanceof ey) {
                            }
                            if (eyVar2 != null) {
                            }
                            pyVar = null;
                            xv.b(new yv(B, iabVar, ryVar, lyVar, nyVar, syVar, tyVar, oyVar, qyVar, pyVar, !booleanValue ? myVar : null), A, f0, oq5Var12, 0);
                        }
                    }
                    tyVar = null;
                    list = o00Var.d;
                    if (list.isEmpty()) {
                    }
                    if (list == null) {
                    }
                    if (!(gyVar2 instanceof ey)) {
                    }
                    if (eyVar != null) {
                    }
                    qyVar = null;
                    if (gyVar instanceof ey) {
                    }
                    if (eyVar2 != null) {
                    }
                    pyVar = null;
                    xv.b(new yv(B, iabVar, ryVar, lyVar, nyVar, syVar, tyVar, oyVar, qyVar, pyVar, !booleanValue ? myVar : null), A, f0, oq5Var12, 0);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 9:
                fz fzVar2 = (fz) obj5;
                p00 p00Var = (p00) obj4;
                iab iabVar2 = p00Var.a;
                mt mtVar2 = p00Var.b;
                fud fudVar2 = (fud) obj3;
                hq5 hq5Var8 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var8;
                if (oq5Var13.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    j00 A2 = bow.A(fzVar2, mtVar2, oq5Var13);
                    xv.b(new yv(lxe.B(mtVar2.a), iabVar2, null, null, null, new sy(p00Var.c), null, null, null, null, ((Boolean) szf.Q(A2.o, oq5Var13).getValue()).booleanValue() ? myVar : null), A2, etn.f0(iabVar2.c, fudVar2, A2.q, oq5Var13, 0, 8), oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                ksw.a((f20) obj5, (bg5) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                bci bciVar3 = (bci) obj5;
                b21 b21Var = (b21) obj4;
                aqi aqiVar3 = (aqi) obj3;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var9;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                cxb.a((g21) aqiVar3.getValue(), bciVar3, b21Var, androidx.compose.ui.platform.a.a(vciVar, "artist_bottom_sheet_dialog"), hq5Var9, 3136);
                return Unit.a;
            case 12:
                s31 s31Var = (s31) obj5;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                h06 h06Var = ((s26) obj4).a;
                s31Var.getClass();
                weo.H(s31Var.c, x97.o(h06Var, (spd) obj3), booleanValue2, str3, null);
                return Unit.a;
            case 13:
                yci yciVar = (yci) obj5;
                d41 d41Var = (d41) obj4;
                aqi aqiVar4 = (aqi) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    q7g.r(3078, 4, ild.C(-1404565559, new a3(7, d41Var, aqiVar4), oq5Var15), ild.C(-945069757, new ar(i2, d41Var, aqiVar4), oq5Var15), oq5Var15, yciVar, false);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                xee.a((t41) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                k61 k61Var = (k61) obj5;
                spd spdVar = (spd) obj3;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str4 = (String) obj2;
                str4.getClass();
                k61Var.getClass();
                weo.H(k61Var.a, vnj.j((m7a) obj4, spdVar.a, spdVar.b), booleanValue3, str4, null);
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                vnj.a((k61) obj5, (nii) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                men.d((qxp) obj5, (l81) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 18:
                a1d a1dVar = (a1d) obj5;
                q0d q0dVar = (q0d) obj4;
                yci yciVar2 = (yci) obj3;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                z0d z0dVar = (z0d) a1dVar;
                int i4 = z0dVar.b;
                int size = z0dVar.e.size();
                IntRange intRange = z0dVar.d;
                oq5 oq5Var17 = (oq5) hq5Var11;
                boolean h = oq5Var17.h(q0dVar);
                Object K3 = oq5Var17.K();
                if (h || K3 == kjnVar) {
                    K3 = new m5(1, q0dVar, q0d.class, "onIndicatorRangeChanged", "onIndicatorRangeChanged(Lkotlin/ranges/IntRange;)V", 0, 14);
                    oq5Var17.k0(K3);
                }
                jx7 jx7Var = (jx7) oq5Var17.j(es5.h);
                float n0 = jx7Var.n0(3);
                float n02 = jx7Var.n0(2);
                float n03 = jx7Var.n0(1);
                float n04 = jx7Var.n0(4);
                agr agrVar = eq0.a;
                ivf.j(i4, intRange, (Function1) ((h9f) K3), size, new m2k(n0, n02, n03, n04, ((dq0) oq5Var17.j(agrVar)).a.c, ((dq0) oq5Var17.j(agrVar)).a.a, 5), yciVar2, oq5Var17, 0, 0);
                return Unit.a;
            case 19:
                Function0 function0 = (Function0) obj5;
                q0d q0dVar2 = (q0d) obj4;
                pbu pbuVar = (pbu) obj3;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var12;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                yci c0 = zsd.c0(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), function0);
                kfh d2 = ug3.d(b2c.b, false);
                oq5 oq5Var19 = (oq5) hq5Var12;
                int i5 = oq5Var19.P;
                androidx.compose.runtime.internal.a l2 = oq5Var19.l();
                yci H2 = vnj.H(hq5Var12, c0);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var19.d0();
                if (oq5Var19.O) {
                    oq5Var19.k(grbVar2);
                } else {
                    oq5Var19.n0();
                }
                g0g.U(hq5Var12, d2, wp5.f);
                g0g.U(hq5Var12, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var19, i5, kb5Var2);
                }
                g0g.U(hq5Var12, H2, wp5.d);
                if (q0dVar2 == null) {
                    oq5Var19.Z(-1286278166);
                    t7g.j(pbuVar, null, null, null, hq5Var12, 0, 14);
                    z3 = false;
                } else {
                    z3 = false;
                    oq5Var19.Z(-1294273252);
                }
                oq5Var19.p(z3);
                oq5Var19.p(true);
                return Unit.a;
            case 20:
                yci yciVar3 = (yci) obj5;
                ka1 ka1Var = (ka1) obj4;
                yi1 yi1Var = (yi1) obj3;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var13;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                gz2 gz2Var = b2c.o;
                yci d3 = androidx.compose.foundation.layout.d.d(yciVar3, 1.0f);
                ta5 a3 = sa5.a(qx0.c, gz2Var, hq5Var13, 48);
                oq5 oq5Var21 = (oq5) hq5Var13;
                int i6 = oq5Var21.P;
                androidx.compose.runtime.internal.a l3 = oq5Var21.l();
                yci H3 = vnj.H(hq5Var13, d3);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var21.d0();
                if (oq5Var21.O) {
                    oq5Var21.k(grbVar3);
                } else {
                    oq5Var21.n0();
                }
                kb5 kb5Var3 = wp5.f;
                g0g.U(hq5Var13, a3, kb5Var3);
                kb5 kb5Var4 = wp5.e;
                g0g.U(hq5Var13, l3, kb5Var4);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var21.O || !Intrinsics.d(oq5Var21.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var21, i6, kb5Var5);
                }
                kb5 kb5Var6 = wp5.d;
                g0g.U(hq5Var13, H3, kb5Var6);
                vci vciVar2 = vci.a;
                yci g = androidx.compose.foundation.layout.d.g(a.o(vciVar2, 0.0f, 4, 1), w1g.p(nu0.i(), 0, hq5Var13, 0, 2), 0.0f, 2);
                kfh d4 = ug3.d(b2c.b, false);
                int i7 = oq5Var21.P;
                androidx.compose.runtime.internal.a l4 = oq5Var21.l();
                yci H4 = vnj.H(hq5Var13, g);
                oq5Var21.d0();
                if (oq5Var21.O) {
                    oq5Var21.k(grbVar3);
                } else {
                    oq5Var21.n0();
                }
                g0g.U(hq5Var13, d4, kb5Var3);
                g0g.U(hq5Var13, l4, kb5Var4);
                if (oq5Var21.O || !Intrinsics.d(oq5Var21.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var21, i7, kb5Var5);
                }
                g0g.U(hq5Var13, H4, kb5Var6);
                String str5 = ka1Var.g;
                if (str5 == null || str5.length() == 0) {
                    z4 = false;
                    oq5Var21.Z(-1483458894);
                } else {
                    oq5Var21.Z(-1473858814);
                    yci a4 = androidx.compose.ui.platform.a.a(vciVar2, DeviceService.KEY_DESC);
                    boolean h2 = oq5Var21.h(yi1Var);
                    Object K4 = oq5Var21.K();
                    if (h2 || K4 == kjnVar) {
                        K4 = new m71(0, yi1Var, yi1.class, "onListenersCountClick", "onListenersCountClick()V", 0, 6);
                        oq5Var21.k0(K4);
                    }
                    gdg.g(str5, a4, 0L, (Function0) ((h9f) K4), hq5Var13, 48, 4);
                    z4 = false;
                }
                oq5Var21.p(z4);
                oq5Var21.p(true);
                String str6 = ka1Var.j;
                if (str6 != null) {
                    oq5Var21.Z(-335710623);
                    lxe.h(48, hq5Var13, a.q(vciVar2, 0.0f, 20, 0.0f, 0.0f, 13), str6);
                    z5 = false;
                } else {
                    z5 = false;
                    oq5Var21.Z(-345792660);
                }
                oq5Var21.p(z5);
                oq5Var21.p(true);
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                ksw.f((ib1) obj5, (q0d) obj4, (z0d) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                wn5 wn5Var = (wn5) obj5;
                wn5 wn5Var2 = (wn5) obj4;
                Function2 function2 = (Function2) obj3;
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var14;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                hz2 hz2Var = b2c.l;
                float f2 = 12;
                yci n = a.n(vciVar, 16, f2);
                nho a5 = lho.a(qx0.a, hz2Var, hq5Var14, 48);
                oq5 oq5Var23 = (oq5) hq5Var14;
                int i8 = oq5Var23.P;
                androidx.compose.runtime.internal.a l5 = oq5Var23.l();
                yci H5 = vnj.H(hq5Var14, n);
                xp5.T.getClass();
                grb grbVar4 = wp5.b;
                oq5Var23.d0();
                if (oq5Var23.O) {
                    oq5Var23.k(grbVar4);
                } else {
                    oq5Var23.n0();
                }
                kb5 kb5Var7 = wp5.f;
                g0g.U(hq5Var14, a5, kb5Var7);
                kb5 kb5Var8 = wp5.e;
                g0g.U(hq5Var14, l5, kb5Var8);
                kb5 kb5Var9 = wp5.g;
                if (oq5Var23.O || !Intrinsics.d(oq5Var23.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var23, i8, kb5Var9);
                }
                kb5 kb5Var10 = wp5.d;
                g0g.U(hq5Var14, H5, kb5Var10);
                wn5Var.invoke(hq5Var14, 0);
                u1g.l(hq5Var14, androidx.compose.foundation.layout.d.r(vciVar, f2));
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                kfh d5 = ug3.d(b2c.b, false);
                int i9 = oq5Var23.P;
                androidx.compose.runtime.internal.a l6 = oq5Var23.l();
                yci H6 = vnj.H(hq5Var14, layoutWeightElement);
                oq5Var23.d0();
                if (oq5Var23.O) {
                    oq5Var23.k(grbVar4);
                } else {
                    oq5Var23.n0();
                }
                g0g.U(hq5Var14, d5, kb5Var7);
                g0g.U(hq5Var14, l6, kb5Var8);
                if (oq5Var23.O || !Intrinsics.d(oq5Var23.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var23, i9, kb5Var9);
                }
                g0g.U(hq5Var14, H6, kb5Var10);
                wn5Var2.invoke(hq5Var14, 0);
                oq5Var23.p(true);
                zwf.i(((dq0) ((oq5) hq5Var14).j(eq0.a)).a.c, ild.C(1186331544, new im0(function2, 1), hq5Var14), hq5Var14, 48);
                oq5Var23.p(true);
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                jf0.d(rvf.R(221623), (hq5) obj, (e9g) obj4, (yci) obj5, (Function2) obj3);
                return Unit.a;
            case 24:
                jd1 jd1Var = (jd1) obj5;
                ges gesVar2 = (ges) obj4;
                ges gesVar3 = (ges) obj3;
                hq5 hq5Var15 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var15;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        return Unit.a;
                    }
                }
                yci d6 = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
                ta5 a6 = sa5.a(qx0.c, b2c.n, hq5Var15, 0);
                oq5 oq5Var25 = (oq5) hq5Var15;
                int i10 = oq5Var25.P;
                androidx.compose.runtime.internal.a l7 = oq5Var25.l();
                yci H7 = vnj.H(hq5Var15, d6);
                xp5.T.getClass();
                grb grbVar5 = wp5.b;
                oq5Var25.d0();
                if (oq5Var25.O) {
                    oq5Var25.k(grbVar5);
                } else {
                    oq5Var25.n0();
                }
                g0g.U(hq5Var15, a6, wp5.f);
                g0g.U(hq5Var15, l7, wp5.e);
                kb5 kb5Var11 = wp5.g;
                if (oq5Var25.O || !Intrinsics.d(oq5Var25.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var25, i10, kb5Var11);
                }
                g0g.U(hq5Var15, H7, wp5.d);
                xv7.j(jd1Var.b, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.d.d(vciVar, 1.0f), "artist_list_item_title"), ((dq0) ((oq5) hq5Var15).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, gesVar2, hq5Var15, 48, 3120, 55288);
                w3g w3gVar = jd1Var.d;
                if (w3gVar != null) {
                    oq5Var25.Z(461077790);
                    u1g.l(hq5Var15, androidx.compose.foundation.layout.d.e(vciVar, mu0.a));
                    v3g.e(w3gVar, gesVar3, androidx.compose.ui.platform.a.a(vciVar, "artist_list_item_like_count"), false, hq5Var15, 384, 8);
                } else {
                    oq5Var25.Z(458133193);
                }
                oq5Var25.p(false);
                oq5Var25.p(true);
                return Unit.a;
            case 25:
                return a(obj, obj2);
            case 26:
                ((Integer) obj2).getClass();
                sj2.a((u51) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                lg3.e((pf1) obj5, (rf1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                pf1 pf1Var = (pf1) obj5;
                jg1 jg1Var = (jg1) obj4;
                Function0 function02 = (Function0) obj3;
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var16;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        return Unit.a;
                    }
                }
                lg3.h(pf1Var, jg1Var.b, function02, hq5Var16, 0);
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                yd5.e((ch1) obj5, (Function1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ x3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
