package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;
import java.util.Arrays;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.ImagePositionState;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class vg0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ vg0(f440 f440Var, tls tlsVar, b bVar, g140 g140Var, tls tlsVar2) {
        this.a = 8;
        this.b = f440Var;
        this.c = tlsVar;
        this.x = bVar;
        this.y = g140Var;
        this.w = tlsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar;
        a aVar2;
        String e;
        Pair pair;
        int i = this.a;
        g43 g43Var = lr20.c;
        int i2 = 18;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.y;
        int i3 = 14;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.c;
        Object obj8 = this.b;
        final int i4 = 1;
        switch (i) {
            case 0:
                xh0 xh0Var = (xh0) obj8;
                tls tlsVar = (tls) obj7;
                sls slsVar = (sls) obj5;
                tls tlsVar2 = (tls) obj6;
                com.yandex.go.superapp.web.view.a aVar3 = (com.yandex.go.superapp.web.view.a) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new p0(23);
                        btsVar.o0(Q);
                    }
                    tls tlsVar3 = (tls) Q;
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new p0(21);
                        btsVar.o0(Q2);
                    }
                    androidx.compose.animation.a.b(xh0Var, null, tlsVar3, null, null, (tls) Q2, wwg.S(656088137, true, new dr5(tlsVar, (Object) slsVar, (Object) tlsVar2, (Object) aVar3, 1), btsVar), btsVar, 1769856, 26);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ky kyVar = (ky) obj8;
                String str = (String) obj7;
                lhg lhgVar = (lhg) obj6;
                String str2 = (String) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    a S = wwg.S(841055641, true, new q0(str, 3), btsVar2);
                    if (kyVar != null) {
                        f2d.a.getClass();
                        aVar = f2d.b;
                    } else {
                        aVar = null;
                    }
                    if (kyVar == null) {
                        btsVar2.e0(920548960);
                        btsVar2.t(false);
                        aVar2 = null;
                    } else {
                        btsVar2.e0(920548961);
                        a S2 = wwg.S(-360525553, true, new b0(kyVar, str, lhgVar, str2, this.y, 1), btsVar2);
                        btsVar2.t(false);
                        aVar2 = S2;
                    }
                    web1.c(null, 0.0f, false, 0.0f, null, null, S, null, null, aVar, aVar2, null, false, btsVar2, 1572864, 0, 6591);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                w3b1 w3b1Var = (w3b1) obj8;
                f530 f530Var = (f530) obj7;
                ehr0 ehr0Var = (ehr0) obj6;
                jt1 jt1Var = (jt1) obj5;
                a aVar4 = (a) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                long j = dj6Var.b;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(dj6Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    siy siyVar = (siy) w3b1Var;
                    Pair[] pairArr = (Pair[]) siyVar.a.toArray(new Pair[0]);
                    tcb1.a(f530Var, ru.yandex.taxi.logistics.sdk.ui.component.misc.b.e((Pair[]) Arrays.copyOf(pairArr, pairArr.length), n8e.i(j), n8e.h(j), siyVar.b, 0), ehr0Var, jt1Var, aVar4, btsVar3, 0, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                dha dhaVar = (dha) obj8;
                z0a0 z0a0Var = (z0a0) obj6;
                String str3 = (String) obj5;
                tls tlsVar4 = (tls) obj7;
                oip0 oip0Var = (oip0) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                } else if (dhaVar instanceof aha) {
                    btsVar4.e0(-417525170);
                    ola olaVar = ((aha) dhaVar).a;
                    hfa0 hfa0Var = olaVar.j;
                    boolean k = btsVar4.k(tlsVar4);
                    Object Q3 = btsVar4.Q();
                    if (k || Q3 == o430Var) {
                        Q3 = new fv9(6, tlsVar4);
                        btsVar4.o0(Q3);
                    }
                    sls slsVar2 = (sls) Q3;
                    boolean k2 = btsVar4.k(tlsVar4);
                    Object Q4 = btsVar4.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new dv9(i3, tlsVar4);
                        btsVar4.o0(Q4);
                    }
                    iub1.b(olaVar, hfa0Var, z0a0Var, str3, tlsVar4, slsVar2, (tls) Q4, btsVar4, 0);
                    btsVar4.t(false);
                } else if (dhaVar instanceof cha) {
                    btsVar4.e0(-416996000);
                    djb1.c(oip0Var, btsVar4, 0);
                    btsVar4.t(false);
                } else {
                    if (!(dhaVar instanceof bha)) {
                        throw unr0.y(2064739556, btsVar4, false);
                    }
                    btsVar4.e0(2064761992);
                    btsVar4.t(false);
                }
                return zy11Var;
            case 4:
                qla qlaVar = (qla) obj8;
                oip0 oip0Var2 = (oip0) obj6;
                z0a0 z0a0Var2 = (z0a0) obj5;
                String str4 = (String) obj4;
                tls tlsVar5 = (tls) obj7;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    djb1.a(qlaVar, oip0Var2, z0a0Var2, str4, tlsVar5, btsVar5, 0);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                uep uepVar = (uep) obj8;
                u5t0 u5t0Var = (u5t0) obj6;
                oz40 oz40Var = (oz40) obj5;
                tls tlsVar6 = (tls) obj7;
                oz40 oz40Var2 = (oz40) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    f530 o = an91.o(c530.a, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    sic a = qic.a(g43Var, x4c.G, btsVar6, 0);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o2 = btsVar6.o();
                    f530 d = androidx.compose.ui.b.d(btsVar6, o);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a);
                    qje.W(btsVar6, d.e, o2);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d);
                    String str5 = uepVar.a;
                    FavoriteAddress favoriteAddress = uepVar.e;
                    boolean z = uepVar.g;
                    ru.yandex.taxi.favorites.address.impl.ui.a.e(str5, btsVar6, 0);
                    ru.yandex.taxi.favorites.address.impl.ui.a.b(!z, uepVar.c, uepVar.d, (tu21) oz40Var2.getValue(), u5t0Var, oz40Var, tlsVar6, btsVar6, ImageMetadata.EDGE_MODE);
                    n3c0 n3c0Var = uepVar.h;
                    boolean k3 = btsVar6.k(tlsVar6);
                    Object Q5 = btsVar6.Q();
                    if (k3 || Q5 == o430Var) {
                        Q5 = new adp(1, tlsVar6);
                        btsVar6.o0(Q5);
                    }
                    m3c0.b(n3c0Var, (tls) Q5, btsVar6, 0);
                    String q = favoriteAddress.q();
                    String p = favoriteAddress.p();
                    if (p == null) {
                        p = "";
                    }
                    ru.yandex.taxi.favorites.address.impl.ui.a.a(q, p, btsVar6, 0);
                    e47 e47Var = uepVar.f;
                    boolean k4 = btsVar6.k(tlsVar6);
                    Object Q6 = btsVar6.Q();
                    if (k4 || Q6 == o430Var) {
                        Q6 = new azd(19, tlsVar6);
                        btsVar6.o0(Q6);
                    }
                    fxa1.a(e47Var, z, (sls) Q6, btsVar6, 0);
                    if (((Boolean) oz40Var.getValue()).booleanValue()) {
                        btsVar6.e0(-447978170);
                        boolean k5 = btsVar6.k(oz40Var2) | btsVar6.k(tlsVar6);
                        Object Q7 = btsVar6.Q();
                        if (k5 || Q7 == o430Var) {
                            Q7 = new d0(tlsVar6, oz40Var2, 4);
                            btsVar6.o0(Q7);
                        }
                        ru.yandex.taxi.favorites.address.impl.ui.a.c((tls) Q7, btsVar6, 0);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-447884953);
                        btsVar6.t(false);
                    }
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                w0s w0sVar = (w0s) obj8;
                qor qorVar = (qor) obj5;
                tls tlsVar7 = (tls) obj7;
                tls tlsVar8 = (tls) obj6;
                yur yurVar = (yur) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    sic a2 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode2 = Long.hashCode(btsVar7.T);
                    r1b0 o3 = btsVar7.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar7, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar4);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a2);
                    qje.W(btsVar7, d.e, o3);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d2);
                    xnf0.a(w0sVar.b, null, qorVar, tlsVar7, btsVar7, 0);
                    oeb1.c(btsVar7, ljs0.e(c530Var, 4.0f));
                    mi91.c(w0sVar.c, null, tlsVar7, tlsVar8, yurVar, btsVar7, 0);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                ai30 ai30Var = (ai30) obj8;
                tls tlsVar9 = (tls) obj7;
                aj31 aj31Var = (aj31) obj5;
                tls tlsVar10 = (tls) obj6;
                b bVar = (b) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    yt30 yt30Var = ai30Var.g;
                    lm30 lm30Var = ai30Var.f;
                    if (lm30Var != null) {
                        btsVar8.e0(812381391);
                        c.b(lm30Var, tlsVar9, aj31Var, btsVar8, 0);
                        btsVar8.t(false);
                    } else if (yt30Var != null) {
                        btsVar8.e0(812655586);
                        wob1.c(yt30Var, tlsVar10, null, afb1.d(bVar, btsVar8), btsVar8, 0, 4);
                        btsVar8.t(false);
                    } else {
                        btsVar8.e0(812888644);
                        m791.d(false, false, btsVar8, 0);
                        btsVar8.t(false);
                    }
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                f440 f440Var = (f440) obj8;
                tls tlsVar11 = (tls) obj7;
                b bVar2 = (b) obj5;
                g140 g140Var = (g140) obj4;
                tls tlsVar12 = (tls) obj6;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    yt30 yt30Var2 = f440Var.c;
                    if (yt30Var2 != null) {
                        btsVar9.e0(-491068206);
                        wob1.c(yt30Var2, tlsVar11, null, afb1.d(bVar2, btsVar9), btsVar9, 0, 4);
                        btsVar9.t(false);
                    } else if (g140Var.c != null) {
                        btsVar9.e0(-490802598);
                        ocb1.a(ljs0.c(c530Var, 1.0f), false, afb1.d(bVar2, btsVar9), false, false, null, 0.0f, 0, wwg.S(1602765674, true, new iu30(3, g140Var, tlsVar12), btsVar9), btsVar9, 805306374, 506);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-489642392);
                        m791.d(false, false, btsVar9, 0);
                        btsVar9.t(false);
                    }
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                m940 m940Var = (m940) obj8;
                tls tlsVar13 = (tls) obj7;
                ru.yandex.taxi.masstransit.tickets.c cVar = (ru.yandex.taxi.masstransit.tickets.c) obj5;
                tls tlsVar14 = (tls) obj6;
                oz40 oz40Var3 = (oz40) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (!btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    btsVar10.Y();
                } else if (m940Var instanceof k940) {
                    btsVar10.e0(915202623);
                    f530 d3 = i9a1.d(i9a1.f(c530Var));
                    q6o q6oVar = ((k940) m940Var).b;
                    boolean k6 = btsVar10.k(tlsVar13);
                    Object Q8 = btsVar10.Q();
                    if (k6 || Q8 == o430Var) {
                        Q8 = new s140(11, tlsVar13);
                        btsVar10.o0(Q8);
                    }
                    sls slsVar5 = (sls) Q8;
                    boolean k7 = btsVar10.k(m940Var) | btsVar10.k(tlsVar13);
                    Object Q9 = btsVar10.Q();
                    if (k7 || Q9 == o430Var) {
                        Q9 = new t130(13, m940Var, tlsVar13);
                        btsVar10.o0(Q9);
                    }
                    kh91.a(d3, q6oVar, slsVar5, (tls) Q9, btsVar10, 0);
                    btsVar10.t(false);
                } else if (m940Var instanceof l940) {
                    btsVar10.e0(915624068);
                    im91.d((l940) m940Var, tlsVar13, btsVar10, 0);
                    btsVar10.t(false);
                } else {
                    if (!(m940Var instanceof j940)) {
                        throw unr0.y(1969184248, btsVar10, false);
                    }
                    btsVar10.e0(915769985);
                    j940 j940Var = (j940) m940Var;
                    boolean k8 = btsVar10.k(tlsVar14);
                    Object Q10 = btsVar10.Q();
                    if (k8 || Q10 == o430Var) {
                        Q10 = new d0(tlsVar14, oz40Var3, 11);
                        btsVar10.o0(Q10);
                    }
                    hm91.a(0, btsVar10, tlsVar13, (tls) Q10, j940Var, cVar);
                    btsVar10.t(false);
                }
                return zy11Var;
            case 10:
                vv40 vv40Var = (vv40) obj8;
                hv40 hv40Var = (hv40) obj6;
                tls tlsVar15 = (tls) obj7;
                rv40 rv40Var = (rv40) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (!btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    btsVar11.Y();
                } else if (vv40Var instanceof uv40) {
                    btsVar11.e0(812889628);
                    btsVar11.t(false);
                } else {
                    btsVar11.e0(26213969);
                    ocb1.a(null, false, hv40Var, false, false, null, 0.0f, 0, wwg.S(-70593212, true, new t240(tlsVar15, rv40Var, charSequence), btsVar11), btsVar11, 805306752, 507);
                    btsVar11.t(false);
                }
                return zy11Var;
            case 11:
                b bVar3 = (b) obj8;
                oz40 oz40Var4 = (oz40) obj6;
                v4b0 v4b0Var = (v4b0) obj5;
                tls tlsVar16 = (tls) obj7;
                oz40 oz40Var5 = (oz40) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (!btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    btsVar12.Y();
                } else if (((Boolean) oz40Var4.getValue()).booleanValue()) {
                    btsVar12.e0(-820071677);
                    dta1.a(null, false, afb1.d(bVar3, btsVar12), false, false, wwg.S(693674156, true, new ls40(v4b0Var, tlsVar16, oz40Var5, 5), btsVar12), btsVar12, ImageMetadata.EDGE_MODE, 27);
                    btsVar12.t(false);
                } else {
                    btsVar12.e0(-819839115);
                    btsVar12.t(false);
                }
                return zy11Var;
            case 12:
                e0m0 e0m0Var = (e0m0) obj8;
                oz40 oz40Var6 = (oz40) obj6;
                oz40 oz40Var7 = (oz40) obj5;
                tls tlsVar17 = (tls) obj7;
                zx40 zx40Var = (zx40) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    c530 c530Var2 = c530.a;
                    f530 o4 = an91.o(c530Var2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar13, 0);
                    int hashCode3 = Long.hashCode(btsVar13.T);
                    r1b0 o5 = btsVar13.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar13, o4);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar13.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar13.i0();
                    if (btsVar13.S) {
                        btsVar13.n(slsVar6);
                    } else {
                        btsVar13.r0();
                    }
                    qje.W(btsVar13, d.f, a3);
                    qje.W(btsVar13, d.e, o5);
                    qje.W(btsVar13, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar13, d.h);
                    qje.W(btsVar13, d.d, d4);
                    jeb1.f(e0m0Var.b, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar13).e.d, btsVar13, 48, 0, 16380);
                    String str6 = e0m0Var.c;
                    if (str6 == null) {
                        btsVar13.e0(-937749680);
                        btsVar13.t(false);
                    } else {
                        btsVar13.e0(-937749679);
                        jeb1.f(str6, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar13).g.a, btsVar13, 48, 0, 16380);
                        btsVar13.t(false);
                    }
                    f530 o6 = an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    String str7 = (String) oz40Var6.getValue();
                    boolean z2 = e0m0Var.a;
                    String str8 = e0m0Var.e;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = str8;
                    if (((String) oz40Var6.getValue()).length() > 40) {
                        btsVar13.e0(-1415697528);
                        e = ohb1.e(btsVar13, kyh0.favorite_ride_needs_to_be_reduced);
                        btsVar13.t(false);
                    } else {
                        btsVar13.e0(-1415694912);
                        e = ohb1.e(btsVar13, kyh0.favorite_ride_need_a_name);
                        btsVar13.t(false);
                    }
                    String str10 = e;
                    boolean z3 = ((String) oz40Var6.getValue()).length() > 40 || ((Boolean) oz40Var7.getValue()).booleanValue();
                    boolean k9 = btsVar13.k(e0m0Var) | btsVar13.k(tlsVar17);
                    Object Q11 = btsVar13.Q();
                    if (k9 || Q11 == o430Var) {
                        vqy vqyVar = new vqy(e0m0Var, tlsVar17, oz40Var7, oz40Var6, 27);
                        btsVar13.o0(vqyVar);
                        Q11 = vqyVar;
                    }
                    rcb1.a(str7, (tls) Q11, o6, z2, null, null, null, null, str9, null, null, null, null, str10, null, z3, 0.0f, null, null, null, null, false, 0, 0, zx40Var, null, null, null, null, wwg.S(-719297761, true, new zcp(2, oz40Var6), btsVar13), btsVar13, 384, 196992, 6, 1035910640);
                    cqk0 cqk0Var = e0m0Var.f;
                    boolean k10 = btsVar13.k(tlsVar17);
                    Object Q12 = btsVar13.Q();
                    if (k10 || Q12 == o430Var) {
                        Q12 = new me5(oz40Var6, oz40Var7, tlsVar17);
                        btsVar13.o0(Q12);
                    }
                    wpa1.b(cqk0Var, (tls) Q12, btsVar13, 0);
                    ita1.a(e0m0Var.g, null, btsVar13, 0);
                    oeb1.c(btsVar13, ljs0.e(c530Var2, 8.0f));
                    n9j n9jVar = e0m0Var.h;
                    if (n9jVar == null) {
                        btsVar13.e0(-935700921);
                        btsVar13.t(false);
                    } else {
                        btsVar13.e0(-935700920);
                        xe91.b(n9jVar, btsVar13, 0);
                        btsVar13.t(false);
                    }
                    f47 f47Var = e0m0Var.i;
                    boolean k11 = btsVar13.k(tlsVar17);
                    Object Q13 = btsVar13.Q();
                    if (k11 || Q13 == o430Var) {
                        Q13 = new fm5(tlsVar17, oz40Var6, oz40Var7, 2);
                        btsVar13.o0(Q13);
                    }
                    kxa1.a(f47Var, (sls) Q13, btsVar13, 0);
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                mcu mcuVar = (mcu) obj8;
                t4z0 t4z0Var = (t4z0) obj7;
                TileStyle tileStyle = (TileStyle) obj6;
                v4v v4vVar = (v4v) obj5;
                ImagePositionState imagePositionState = (ImagePositionState) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    lhl0 a4 = khl0.a(lr20.g, x4c.D, btsVar14, 6);
                    int hashCode4 = Long.hashCode(btsVar14.T);
                    r1b0 o7 = btsVar14.o();
                    f530 d5 = androidx.compose.ui.b.d(btsVar14, c530Var);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar14.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar7);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, d.f, a4);
                    qje.W(btsVar14, d.e, o7);
                    wls wlsVar = d.g;
                    if (btsVar14.S || !jl40.l(btsVar14.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar14, hashCode4, wlsVar);
                    }
                    ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.tile.a.c(n.d(btsVar14, d5, d.d, 1.0f, true), mcuVar, t4z0Var, tileStyle, btsVar14, 0);
                    if (v4vVar == null || imagePositionState != ImagePositionState.TRAIL) {
                        btsVar14.e0(-2097869909);
                        btsVar14.t(false);
                    } else {
                        btsVar14.e0(-2098099185);
                        s3b1.f(v4vVar, ljs0.v(c530Var, null, 3).k(new pa31(x4c.E)), null, btsVar14, 0, 4);
                        btsVar14.t(false);
                    }
                    btsVar14.t(true);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                jtz0 jtz0Var = (jtz0) obj8;
                qor qorVar2 = (qor) obj6;
                wg6 wg6Var = (wg6) obj5;
                yur yurVar2 = (yur) obj4;
                tls tlsVar18 = (tls) obj7;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    i.e(jtz0Var, qorVar2, wg6Var, yurVar2, tlsVar18, null, btsVar15, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                m3u0 m3u0Var = (m3u0) obj5;
                tx40 tx40Var = (tx40) obj4;
                tls tlsVar19 = (tls) obj7;
                k kVar = (k) obj;
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                ((mvz0) ((oz40) obj8).getValue()).getClass();
                float w0 = kVar.w0(16.0f);
                float w02 = kVar.w0(12.0f);
                float w03 = kVar.w0(24.0f) / 2.0f;
                zpv0 zpv0Var = (zpv0) ((oz40) obj6).getValue();
                long j2 = ((wu60) zpv0Var.d.getValue()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (((wu60) m3u0Var.getValue()).a >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (((wu60) m3u0Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                float intValue16 = (zpv0Var.e.getValue().intValue() / 2.0f) + intBitsToFloat;
                int i5 = l0.a;
                float max = Math.max(w03 + w02, w0);
                int i6 = wpv0.a[((TooltipAlignment) zpv0Var.b.getValue()).ordinal()];
                if (i6 == 1) {
                    pair = new Pair(Float.valueOf(intValue16 - max), Float.valueOf(max));
                } else if (i6 == 2) {
                    float f = i5;
                    pair = new Pair(Float.valueOf((intValue16 - f) + max), Float.valueOf(f - max));
                } else {
                    if (i6 != 3) {
                        w511.b();
                        return null;
                    }
                    float f2 = i5 / 2.0f;
                    pair = new Pair(Float.valueOf(intValue16 - f2), Float.valueOf(f2));
                }
                float floatValue = ((Number) pair.getFirst()).floatValue();
                tx40Var.setFloatValue(((Number) pair.getSecond()).floatValue());
                int i7 = l0.b;
                tlsVar19.invoke(Integer.valueOf(i7));
                return kVar.w(Math.max(l0.a, (int) (max * 2.0f)), l0.b, kotlin.collections.b.f(), new zps0(floatValue, intBitsToFloat2 - i7, 1, l0));
            case 16:
                final CharSequence charSequence2 = (CharSequence) obj8;
                final CharSequence charSequence3 = (CharSequence) obj7;
                CharSequence charSequence4 = (CharSequence) obj6;
                final CharSequence charSequence5 = (CharSequence) obj5;
                final CharSequence charSequence6 = (CharSequence) obj4;
                final ebp0 ebp0Var = (ebp0) obj;
                fid fidVar16 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((bts) fidVar16).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue17 & 1, (intValue17 & 19) != 18)) {
                    final int i8 = r3 ? 1 : 0;
                    q9b1.a(ebp0Var, wwg.S(-1056099712, true, new wls() { // from class: ya01
                        @Override // defpackage.wls
                        public final Object invoke(Object obj9, Object obj10) {
                            int i9 = i8;
                            zy11 zy11Var2 = zy11.a;
                            switch (i9) {
                                case 0:
                                    fid fidVar17 = (fid) obj9;
                                    int intValue18 = ((Integer) obj10).intValue();
                                    bts btsVar17 = (bts) fidVar17;
                                    if (!btsVar17.V(intValue18 & 1, (intValue18 & 3) != 2)) {
                                        btsVar17.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, charSequence2, null, null, xya1.e(btsVar17).d.c, 0, 0, charSequence3, null, null, 0, 0, null, btsVar17, 0, 0, 32630);
                                        break;
                                    }
                                default:
                                    fid fidVar18 = (fid) obj9;
                                    int intValue19 = ((Integer) obj10).intValue();
                                    bts btsVar18 = (bts) fidVar18;
                                    if (!btsVar18.V(intValue19 & 1, (intValue19 & 3) != 2)) {
                                        btsVar18.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, charSequence2, null, null, xya1.e(btsVar18).d.c, 0, 0, charSequence3, null, null, 0, 0, null, btsVar18, 0, 0, 32630);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar16), wwg.S(1365654047, true, new hex0(i2, ebp0Var, charSequence4), btsVar16), wwg.S(-507559490, true, new wls() { // from class: ya01
                        @Override // defpackage.wls
                        public final Object invoke(Object obj9, Object obj10) {
                            int i9 = i4;
                            zy11 zy11Var2 = zy11.a;
                            switch (i9) {
                                case 0:
                                    fid fidVar17 = (fid) obj9;
                                    int intValue18 = ((Integer) obj10).intValue();
                                    bts btsVar17 = (bts) fidVar17;
                                    if (!btsVar17.V(intValue18 & 1, (intValue18 & 3) != 2)) {
                                        btsVar17.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, charSequence5, null, null, xya1.e(btsVar17).d.c, 0, 0, charSequence6, null, null, 0, 0, null, btsVar17, 0, 0, 32630);
                                        break;
                                    }
                                default:
                                    fid fidVar18 = (fid) obj9;
                                    int intValue19 = ((Integer) obj10).intValue();
                                    bts btsVar18 = (bts) fidVar18;
                                    if (!btsVar18.V(intValue19 & 1, (intValue19 & 3) != 2)) {
                                        btsVar18.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, charSequence5, null, null, xya1.e(btsVar18).d.c, 0, 0, charSequence6, null, null, 0, 0, null, btsVar18, 0, 0, 32630);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar16), null, 0.0f, null, null, null, btsVar16, (intValue17 & 14) | 3504);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            default:
                je31 je31Var = (je31) obj8;
                tls tlsVar20 = (tls) obj7;
                wg6 wg6Var2 = (wg6) obj6;
                z0a0 z0a0Var3 = (z0a0) obj5;
                yur yurVar3 = (yur) obj4;
                fid fidVar17 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    tb31.h(je31Var, tlsVar20, wg6Var2, z0a0Var3, yurVar3, btsVar17, HProv.ALG_CLASS_DATA_ENCRYPT);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ vg0(w0s w0sVar, qor qorVar, tls tlsVar, tls tlsVar2, yur yurVar) {
        this.a = 6;
        this.b = w0sVar;
        this.x = qorVar;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.y = yurVar;
    }

    public /* synthetic */ vg0(vv40 vv40Var, hv40 hv40Var, tls tlsVar, rv40 rv40Var, CharSequence charSequence) {
        this.a = 10;
        this.b = vv40Var;
        this.w = hv40Var;
        this.c = tlsVar;
        this.x = rv40Var;
        this.y = charSequence;
    }

    public /* synthetic */ vg0(Object obj, tls tlsVar, Object obj2, tls tlsVar2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = tlsVar;
        this.x = obj2;
        this.w = tlsVar2;
        this.y = obj3;
    }

    public /* synthetic */ vg0(Object obj, Object obj2, Object obj3, tls tlsVar, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.x = obj3;
        this.c = tlsVar;
        this.y = obj4;
    }

    public /* synthetic */ vg0(Object obj, Object obj2, Object obj3, Object obj4, tls tlsVar, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.c = tlsVar;
    }

    public /* synthetic */ vg0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }
}
