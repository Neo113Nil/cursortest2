package defpackage;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.runtime.f;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.chargers.offer.ui.compose.ui.a;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.ahp0;
import defpackage.f0j0;
import defpackage.g0j0;
import defpackage.kcc;
import defpackage.l0j0;
import defpackage.l3y;
import defpackage.lcc;
import defpackage.odf0;
import defpackage.oz40;
import defpackage.pzt0;
import defpackage.rzo;
import defpackage.s6y;
import defpackage.sue0;
import defpackage.t6;
import defpackage.t791;
import defpackage.tje;
import defpackage.v5c0;
import defpackage.vw21;
import defpackage.w511;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.y6i0;
import defpackage.z5w;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.PaidInsuranceScreen$Companion$ButtonStyle;

/* loaded from: classes10.dex */
public final /* synthetic */ class r5y implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r5y(b bVar, oz40 oz40Var, psr0 psr0Var, tls tlsVar) {
        this.a = 16;
        this.b = bVar;
        this.x = oz40Var;
        this.c = psr0Var;
        this.w = tlsVar;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        lhj0 lhj0Var = (lhj0) this.c;
        oz40 oz40Var = (oz40) this.x;
        mhj0 mhj0Var = (mhj0) this.w;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 16;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ttm(i, oz40Var);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c, true, (tls) Q);
            boolean k = btsVar.k(tlsVar) | btsVar.k(lhj0Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new chj0(tlsVar, lhj0Var, oz40Var);
                btsVar.o0(Q2);
            }
            f530 m = an91.m(an91.k(q791.d(b, false, null, null, (sls) Q2, 15), 16.0f), 8.0f, 0.0f, 2);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            jeb1.f(mhj0Var.d, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16378);
            oeb1.c(btsVar, new x2y(1.0f, true));
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new teb(20);
                btsVar.o0(Q3);
            }
            xkb1.b(((Boolean) oz40Var.getValue()).booleanValue(), fnq0.a(c530Var, (tls) Q3), null, false, btsVar, 0, 28);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b bVar = (b) this.b;
        oz40 oz40Var = (oz40) this.x;
        psr0 psr0Var = (psr0) this.c;
        tls tlsVar = (tls) this.w;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (((Boolean) oz40Var.getValue()).booleanValue()) {
            btsVar.e0(1740125725);
            dta1.a(null, false, afb1.d(bVar, btsVar), false, false, wwg.S(1029988895, true, new y740(27, psr0Var, tlsVar), btsVar), btsVar, ImageMetadata.EDGE_MODE, 27);
            btsVar.t(false);
        } else {
            btsVar.e0(1740284290);
            btsVar.t(false);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r16v25, types: [bpl0] */
    /* JADX WARN: Type inference failed for: r1v36, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r23v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v2, types: [bts, fid] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar;
        c6y c6yVar;
        f530 k;
        boolean z;
        Object lc0Var;
        tls tlsVar;
        ?? r0;
        Object c;
        bts btsVar;
        zy11 parameterizedContent$lambda$0$2;
        f530 a;
        int i = this.a;
        c530 c530Var = c530.a;
        Object obj4 = did.a;
        int i2 = 16;
        zy11 zy11Var = zy11.a;
        int i3 = 9;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.b;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                c6y c6yVar2 = (c6y) obj7;
                f530 f530Var = (f530) obj8;
                s5y s5yVar = (s5y) obj6;
                oz40 oz40Var = (oz40) obj5;
                h1m0 h1m0Var = (h1m0) obj;
                ((Integer) obj3).getClass();
                ?? r9 = (bts) ((fid) obj2);
                Object Q = r9.Q();
                if (Q == obj4) {
                    Q = new p5y(h1m0Var, new w01(12, oz40Var));
                    r9.o0(Q);
                }
                p5y p5yVar = (p5y) Q;
                Object Q2 = r9.Q();
                if (Q2 == obj4) {
                    Q2 = new t(new c9v(p5yVar));
                    r9.o0(Q2);
                }
                t tVar2 = (t) Q2;
                if (c6yVar2 != null) {
                    r9.e0(1743490539);
                    r9.e0(887527095);
                    Object obj9 = goe0.a;
                    if (obj9 != null) {
                        r9.e0(1345554384);
                        r9.t(false);
                        z = false;
                    } else {
                        r9.e0(1345603457);
                        View view = (View) r9.m(AndroidCompositionLocals_androidKt.f);
                        boolean k2 = r9.k(view);
                        Object Q3 = r9.Q();
                        if (k2 || Q3 == obj4) {
                            Object tag = view.getTag(dhh0.compose_prefetch_scheduler);
                            r10 = tag instanceof eoe0 ? (eoe0) tag : null;
                            if (r10 == null) {
                                AndroidPrefetchScheduler androidPrefetchScheduler = new AndroidPrefetchScheduler(view);
                                view.setTag(dhh0.compose_prefetch_scheduler, androidPrefetchScheduler);
                                Q3 = androidPrefetchScheduler;
                            } else {
                                Q3 = r10;
                            }
                            r9.o0(Q3);
                        }
                        obj9 = (eoe0) Q3;
                        z = false;
                        r9.t(false);
                    }
                    Object obj10 = obj9;
                    r9.t(z);
                    Object[] objArr = {c6yVar2, p5yVar, tVar2, obj10};
                    boolean k3 = r9.k(c6yVar2) | r9.e(p5yVar) | r9.e(tVar2) | r9.e(obj10);
                    Object Q4 = r9.Q();
                    if (k3 || Q4 == obj4) {
                        c6yVar = c6yVar2;
                        lc0Var = new lc0(c6yVar, p5yVar, tVar2, obj10, 27);
                        tVar = tVar2;
                        r9.o0(lc0Var);
                    } else {
                        lc0Var = Q4;
                        tVar = tVar2;
                        c6yVar = c6yVar2;
                    }
                    zpn.d(objArr, (tls) lc0Var, r9);
                    r9.t(false);
                } else {
                    tVar = tVar2;
                    c6yVar = c6yVar2;
                    r9.e0(1744076749);
                    r9.t(false);
                }
                int i4 = d6y.a;
                f530 f530Var2 = (c6yVar == null || (k = f530Var.k(new ed11(c6yVar))) == null) ? f530Var : k;
                boolean k4 = r9.k(p5yVar) | r9.k(s5yVar);
                Object Q5 = r9.Q();
                if (k4 || Q5 == obj4) {
                    Q5 = new s0v(9, p5yVar, s5yVar);
                    r9.o0(Q5);
                }
                e.b(tVar, f530Var2, (wls) Q5, r9, 8, 0);
                return zy11Var;
            case 1:
                xh0 xh0Var = (xh0) obj7;
                tls tlsVar2 = (tls) obj8;
                sls slsVar = (sls) obj6;
                tls tlsVar3 = (tls) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar2.Y();
                } else if (xh0Var instanceof sh0) {
                    btsVar2.e0(-2085158819);
                    j76.a((sh0) xh0Var, btsVar2, 0);
                    btsVar2.t(false);
                } else if (xh0Var instanceof nh0) {
                    btsVar2.e0(-2085052489);
                    fh4.a((nh0) xh0Var, tlsVar2, btsVar2, 0);
                    btsVar2.t(false);
                } else if (xh0Var instanceof mh0) {
                    btsVar2.e0(-2084938223);
                    com.yandex.go.payments.addmethod.ui.home.d.a((mh0) xh0Var, tlsVar2, btsVar2, 0);
                    btsVar2.t(false);
                } else {
                    if (!(xh0Var instanceof ph0)) {
                        throw unr0.y(764019452, btsVar2, false);
                    }
                    btsVar2.e0(-2084803218);
                    com.yandex.go.payments.addmethod.ui.home.d.d((ph0) xh0Var, tlsVar2, slsVar, tlsVar3, null, btsVar2, 0, 16);
                    btsVar2.t(false);
                }
                return zy11Var;
            case 2:
                hw0 hw0Var = (hw0) obj7;
                tls tlsVar4 = (tls) obj8;
                tls tlsVar5 = (tls) obj6;
                oz40 oz40Var2 = (oz40) obj5;
                dj6 dj6Var = (dj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                }
                ?? r1 = (bts) fidVar2;
                if (r1.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Object Q6 = r1.Q();
                    if (Q6 == obj4) {
                        Q6 = f.j(Boolean.FALSE);
                        r1.o0(Q6);
                    }
                    oz40 oz40Var3 = (oz40) Q6;
                    uv0 uv0Var = hw0Var.f;
                    if (uv0Var == null) {
                        r1.e0(-39294311);
                        r1.t(false);
                        btsVar = r1;
                        tlsVar = tlsVar4;
                    } else {
                        r1.e0(-39294310);
                        r1.e0(-1663834992);
                        fwi fwiVar = (fwi) r1.m(j.h);
                        boolean c2 = r1.c(uv0Var.b == BubblePosition.TOP_RIGHT ? 1 : -1);
                        Object Q7 = r1.Q();
                        if (c2 || Q7 == obj4) {
                            tlsVar = tlsVar4;
                            Q7 = new z5w(((-fwiVar.f0(28.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((fwiVar.f0(dj6Var.d() / 2.0f) * r9) << 32));
                            r1.o0(Q7);
                        } else {
                            tlsVar = tlsVar4;
                        }
                        long j = ((z5w) Q7).a;
                        r1.t(false);
                        Object Q8 = r1.Q();
                        if (Q8 == obj4) {
                            Q8 = new sb0(3, tlsVar5, hw0Var, oz40Var3);
                            r1.o0(Q8);
                        }
                        sls slsVar2 = (sls) Q8;
                        Object Q9 = r1.Q();
                        if (Q9 == obj4) {
                            Q9 = new sz40(Boolean.FALSE);
                            r1.o0(Q9);
                        }
                        sz40 sz40Var = (sz40) Q9;
                        Boolean bool = (Boolean) oz40Var3.getValue();
                        bool.booleanValue();
                        sz40Var.b(bool);
                        zx01 O = bvf0.O(sz40Var, "Popup", r1, 48, 0);
                        gl11 gl11Var = gtq0.f;
                        if (O.g()) {
                            r0 = 0;
                            r1.e0(1666853325);
                            r1.t(false);
                            c = O.c();
                        } else {
                            r1.e0(1666599280);
                            boolean k5 = r1.k(O);
                            c = r1.Q();
                            if (k5 || c == obj4) {
                                i2t0 D = tje.D();
                                tls e = D != null ? D.e() : null;
                                i2t0 O2 = tje.O(D);
                                try {
                                    Object c3 = O.c();
                                    tje.W(D, O2, e);
                                    r1.o0(c3);
                                    c = c3;
                                } catch (Throwable th) {
                                    tje.W(D, O2, e);
                                    throw th;
                                }
                            }
                            r0 = 0;
                            r1.t(false);
                        }
                        boolean booleanValue = ((Boolean) c).booleanValue();
                        r1.e0(-1625289820);
                        float f = booleanValue ? 1.0f : 0.0f;
                        r1.t(r0);
                        Float valueOf = Float.valueOf(f);
                        boolean k6 = r1.k(O);
                        Object Q10 = r1.Q();
                        if (k6 || Q10 == obj4) {
                            Q10 = f.d(new fw0(O, r0));
                            r1.o0(Q10);
                        }
                        boolean booleanValue2 = ((Boolean) ((m3u0) Q10).getValue()).booleanValue();
                        r1.e0(-1625289820);
                        float f2 = booleanValue2 ? 1.0f : 0.0f;
                        r1.t(false);
                        Float valueOf2 = Float.valueOf(f2);
                        boolean k7 = r1.k(O);
                        Object Q11 = r1.Q();
                        if (k7 || Q11 == obj4) {
                            Q11 = f.d(new fw0(O, 1));
                            r1.o0(Q11);
                        }
                        r1.e0(-15038167);
                        ck11 K = sb2.K(200, 0, null, 6);
                        r1.t(false);
                        coa1.c(tra1.b(c530Var, ((Number) bvf0.s(O, valueOf, valueOf2, K, gl11Var, r1, ImageMetadata.EDGE_MODE).A.getValue()).floatValue()), ((Boolean) oz40Var3.getValue()).booleanValue(), j, uv0Var, slsVar2, r1, HProv.ALG_CLASS_DATA_ENCRYPT);
                        btsVar = r1;
                        btsVar.t(false);
                    }
                    Object Q12 = btsVar.Q();
                    if (Q12 == obj4) {
                        Q12 = new w5(2, oz40Var3);
                        btsVar.o0(Q12);
                    }
                    coa1.d((String) oz40Var2.getValue(), hw0Var, tlsVar, (tls) Q12, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
                } else {
                    r1.Y();
                }
                return zy11Var;
            case 3:
                paa paaVar = (paa) obj7;
                f530 f530Var3 = (f530) obj8;
                nc3 nc3Var = (nc3) obj6;
                tls tlsVar6 = (tls) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                } else if (paaVar instanceof oaa) {
                    btsVar3.e0(-634653465);
                    f530 o = an91.o(f530Var3, 0.0f, nc3Var.b, 0.0f, 0.0f, 13);
                    oaa oaaVar = (oaa) paaVar;
                    boolean k8 = btsVar3.k(tlsVar6);
                    Object Q13 = btsVar3.Q();
                    if (k8 || Q13 == obj4) {
                        Q13 = new dv9(6, tlsVar6);
                        btsVar3.o0(Q13);
                    }
                    tls tlsVar7 = (tls) Q13;
                    boolean k9 = btsVar3.k(tlsVar6);
                    Object Q14 = btsVar3.Q();
                    if (k9 || Q14 == obj4) {
                        Q14 = new dv9(7, tlsVar6);
                        btsVar3.o0(Q14);
                    }
                    tls tlsVar8 = (tls) Q14;
                    boolean k10 = btsVar3.k(tlsVar6);
                    Object Q15 = btsVar3.Q();
                    if (k10 || Q15 == obj4) {
                        Q15 = new dv9(8, tlsVar6);
                        btsVar3.o0(Q15);
                    }
                    tls tlsVar9 = (tls) Q15;
                    boolean k11 = btsVar3.k(tlsVar6);
                    Object Q16 = btsVar3.Q();
                    if (k11 || Q16 == obj4) {
                        Q16 = new dv9(i3, tlsVar6);
                        btsVar3.o0(Q16);
                    }
                    tls tlsVar10 = (tls) Q16;
                    boolean k12 = btsVar3.k(tlsVar6);
                    Object Q17 = btsVar3.Q();
                    if (k12 || Q17 == obj4) {
                        Q17 = new dv9(10, tlsVar6);
                        btsVar3.o0(Q17);
                    }
                    a.b(oaaVar, tlsVar7, tlsVar8, tlsVar9, tlsVar10, (tls) Q17, o, btsVar3, 8);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(-634088211);
                    btsVar3.t(false);
                }
                return zy11Var;
            case 4:
                wls wlsVar = (wls) obj7;
                zje zjeVar = (zje) obj8;
                zls zlsVar = (zls) obj6;
                sls slsVar3 = (sls) obj5;
                yje yjeVar = (yje) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(yjeVar) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    String str = (String) wlsVar.invoke(btsVar4, 0);
                    if (evu0.J(str)) {
                        lxv.c("Label must not be blank");
                    }
                    zjeVar.a.c(str, Boolean.TRUE, yjeVar, zlsVar, slsVar3, btsVar4, Integer.valueOf((intValue4 << 9) & 7168));
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 5:
                u540 u540Var = (u540) obj7;
                b bVar = (b) obj8;
                tls tlsVar11 = (tls) obj6;
                tls tlsVar12 = (tls) obj5;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    btsVar5.Y();
                } else if (u540Var.a.c != null) {
                    btsVar5.e0(-1266426620);
                    ocb1.a(null, false, afb1.d(bVar, btsVar5), false, false, null, 0.0f, 0, wwg.S(706039335, true, new mr1(u540Var.a.c.b, tlsVar12, u540Var, 14), btsVar5), btsVar5, 805306368, 507);
                    btsVar5.t(false);
                } else {
                    btsVar5.e0(-1265804977);
                    yt30 yt30Var = u540Var.c;
                    if (yt30Var != null) {
                        btsVar5.e0(-1265718673);
                        wob1.c(yt30Var, tlsVar11, null, afb1.d(bVar, btsVar5), btsVar5, 0, 4);
                        btsVar5.t(false);
                    } else {
                        btsVar5.e0(-1265516987);
                        m791.d(false, false, btsVar5, 0);
                        btsVar5.t(false);
                    }
                    btsVar5.t(false);
                }
                return zy11Var;
            case 6:
                czy0 czy0Var = (czy0) obj7;
                b bVar2 = (b) obj8;
                tls tlsVar13 = (tls) obj6;
                tls tlsVar14 = (tls) obj5;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    btsVar6.Y();
                } else if (czy0Var.a.d != null) {
                    btsVar6.e0(-942121470);
                    ocb1.a(null, false, afb1.d(bVar2, btsVar6), false, false, null, 0.0f, 0, wwg.S(757525717, true, new mr1(czy0Var.a.d.c, tlsVar14, czy0Var, i2), btsVar6), btsVar6, 805306368, 507);
                    btsVar6.t(false);
                } else {
                    btsVar6.e0(-941511359);
                    yt30 yt30Var2 = czy0Var.c;
                    if (yt30Var2 != null) {
                        btsVar6.e0(-941425055);
                        wob1.c(yt30Var2, tlsVar13, null, afb1.d(bVar2, btsVar6), btsVar6, 0, 4);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-941223369);
                        m791.d(false, false, btsVar6, 0);
                        btsVar6.t(false);
                    }
                    btsVar6.t(false);
                }
                return zy11Var;
            case 7:
                f530 f530Var4 = (f530) obj8;
                ugh ughVar = (ugh) obj7;
                List list = (List) obj6;
                tls tlsVar15 = (tls) obj5;
                dj6 dj6Var2 = (dj6) obj;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar7).k(dj6Var2) ? 4 : 2;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    float d = (dj6Var2.d() - 48.0f) - 16.0f;
                    float d2 = (dj6Var2.d() - d) / 2.0f;
                    f530 c4 = ljs0.c(f530Var4, 1.0f);
                    sic a2 = qic.a(lr20.c, x4c.H, btsVar7, 48);
                    int hashCode = Long.hashCode(btsVar7.T);
                    r1b0 o2 = btsVar7.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar7, c4);
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
                    qje.W(btsVar7, d.e, o2);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d3);
                    otr0.a(ughVar, null, an91.b(d2, 0.0f, 2), new t790(d), 16.0f, null, null, false, null, null, null, null, wwg.S(-722946531, true, new dhj0(list, ughVar, tlsVar15, 12), btsVar7), btsVar7, ImageMetadata.EDGE_MODE, 16338);
                    oeb1.c(btsVar7, ljs0.e(c530Var, 12.0f));
                    if (list.size() > 1) {
                        btsVar7.e0(-432496927);
                        com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.a(list.size(), ughVar.k(), btsVar7, 0);
                        btsVar7.t(false);
                    } else {
                        btsVar7.e0(-432369114);
                        btsVar7.t(false);
                    }
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                CharSequence charSequence = (CharSequence) obj7;
                CharSequence charSequence2 = (CharSequence) obj8;
                CharSequence charSequence3 = (CharSequence) obj6;
                CharSequence charSequence4 = (CharSequence) obj5;
                xpr xprVar = (xpr) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(xprVar) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    ed40.C(xprVar.b(c530Var, 1.0f, true), charSequence, charSequence2, btsVar8, 0);
                    ed40.y(xprVar.b(c530Var, 1.0f, true), charSequence3, charSequence4, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                bt40 bt40Var = (bt40) obj7;
                z0a0 z0a0Var = (z0a0) obj8;
                lz6 lz6Var = (lz6) obj6;
                tls tlsVar16 = (tls) obj5;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    pqb1.a(null, bt40Var.h, bt40Var.e, z0a0Var, lz6Var, tlsVar16, btsVar9, 576);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 10:
                CharSequence charSequence5 = (CharSequence) obj7;
                CharSequence charSequence6 = (CharSequence) obj8;
                f360 f360Var = (f360) obj6;
                i360 i360Var = (i360) obj5;
                dj6 dj6Var3 = (dj6) obj;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar10).k(dj6Var3) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                    float d4 = dj6Var3.d();
                    f530 l = ymb1.l(ljs0.m(c530Var, d4), cyk0.c(16.0f));
                    z910 d5 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar10.T);
                    r1b0 o3 = btsVar10.o();
                    f530 d6 = androidx.compose.ui.b.d(btsVar10, l);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar10.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar10.i0();
                    if (btsVar10.S) {
                        btsVar10.n(slsVar5);
                    } else {
                        btsVar10.r0();
                    }
                    qje.W(btsVar10, d.f, d5);
                    qje.W(btsVar10, d.e, o3);
                    wls wlsVar2 = d.g;
                    if (btsVar10.S || !jl40.l(btsVar10.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar10, hashCode2, wlsVar2);
                    }
                    qje.W(btsVar10, d.d, d6);
                    f530 k13 = an91.k(c530Var, 16.0f);
                    uo5 uo5Var = x4c.y;
                    cj6 cj6Var = cj6.a;
                    zgb1.b(charSequence5, charSequence6, cj6Var.a(k13, uo5Var), x4c.H, 0, false, null, null, null, null, btsVar10, HProv.ALG_TYPE_SECURECHANNEL, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                    if (f360Var == null) {
                        btsVar10.e0(-1853677265);
                        btsVar10.t(false);
                    } else {
                        btsVar10.e0(-1853677264);
                        s3b1.f(f360Var.a, rx21.d(ljs0.m(cj6Var.a(c530Var, uo5Var), d4), f360Var.d, f360Var.e), mhe.g, btsVar10, 384, 0);
                        btsVar10.t(false);
                    }
                    f360 f360Var2 = i360Var != null ? i360Var.a : null;
                    if (f360Var2 == null) {
                        btsVar10.e0(-1853268313);
                        btsVar10.t(false);
                    } else {
                        btsVar10.e0(-1853268312);
                        s3b1.f(f360Var2.a, rx21.d(an91.o(cj6Var.a(c530Var, x4c.c), 0.0f, 12.0f, 0.0f, 0.0f, 13), f360Var2.d, f360Var2.e), null, btsVar10, 0, 4);
                        btsVar10.t(false);
                    }
                    ?? r23 = i360Var != null ? i360Var.b : null;
                    if (r23 == 0) {
                        btsVar10.e0(-1852922725);
                        btsVar10.t(false);
                    } else {
                        btsVar10.e0(-1852922724);
                        zgb1.a(r23, cj6Var.a(c530Var, uo5Var), 0, false, null, null, false, null, btsVar10, 0, 252);
                        btsVar10.t(false);
                    }
                    btsVar10.t(true);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                CharSequence charSequence7 = (CharSequence) obj7;
                CharSequence charSequence8 = (CharSequence) obj8;
                PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle = (PaidInsuranceScreen$Companion$ButtonStyle) obj6;
                x990 x990Var = (x990) obj5;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a.a(charSequence7, charSequence8, paidInsuranceScreen$Companion$ButtonStyle, x990Var.z, btsVar11, 0);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                v4b0 v4b0Var = (v4b0) obj7;
                tls tlsVar17 = (tls) obj8;
                oz40 oz40Var4 = (oz40) obj5;
                oz40 oz40Var5 = (oz40) obj6;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (!btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    btsVar12.Y();
                } else if (((Boolean) oz40Var4.getValue()).booleanValue()) {
                    btsVar12.e0(-207043882);
                    btsVar12.t(false);
                } else {
                    btsVar12.e0(-207398491);
                    w7b0 w7b0Var = (w7b0) oz40Var5.getValue();
                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                    com.yandex.go.personal_goals_v2.ui.a.a(v4b0Var, w7b0Var, tlsVar17, an91.o(c530.a, 0.0f, 4.0f, 0.0f, w8a1.f(vuz.o(btsVar12).g, btsVar12).a() + 8.0f, 5), btsVar12, 0, 0);
                    btsVar12.t(false);
                }
                return zy11Var;
            case 13:
                parameterizedContent$lambda$0$2 = PreviewActivity.setParameterizedContent$lambda$0$2((String) obj7, (String) obj8, (Object[]) obj6, (yx40) obj5, (j690) obj, (fid) obj2, ((Integer) obj3).intValue());
                return parameterizedContent$lambda$0$2;
            case 14:
                final f0j0 f0j0Var = (f0j0) obj7;
                zx40 zx40Var = (zx40) obj8;
                tls tlsVar18 = (tls) obj6;
                final sls slsVar6 = (sls) obj5;
                f530 f530Var5 = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar13 = (bts) ((fid) obj2);
                btsVar13.e0(-1200823980);
                Object Q18 = btsVar13.Q();
                if (Q18 == obj4) {
                    Q18 = f.j(new wu60(0L));
                    btsVar13.o0(Q18);
                }
                oz40 oz40Var6 = (oz40) Q18;
                Object Q19 = btsVar13.Q();
                if (Q19 == obj4) {
                    Q19 = f.j(new k6w(0L));
                    btsVar13.o0(Q19);
                }
                oz40 oz40Var7 = (oz40) Q19;
                Object Q20 = btsVar13.Q();
                if (Q20 == obj4) {
                    Q20 = zpn.j(EmptyCoroutineContext.a, btsVar13);
                    btsVar13.o0(Q20);
                }
                tse tseVar = (tse) Q20;
                Object Q21 = btsVar13.Q();
                if (Q21 == obj4) {
                    Q21 = new hc1(oz40Var6, oz40Var7, 3);
                    btsVar13.o0(Q21);
                }
                f530 y = eja1.y(f530Var5, (tls) Q21);
                ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.e eVar = f0j0Var.a;
                Integer num = f0j0Var.b;
                eVar.getClass();
                boolean z2 = ((Boolean) f.d(new agc0(25, num, eVar)).getValue()).booleanValue() || !((Boolean) f0j0Var.a.k.getValue()).booleanValue();
                boolean e2 = btsVar13.e(tseVar) | btsVar13.e(f0j0Var) | btsVar13.k(tlsVar18);
                Object Q22 = btsVar13.Q();
                if (e2 || Q22 == obj4) {
                    ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.a aVar = new ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.a(tseVar, tlsVar18, f0j0Var, oz40Var6, oz40Var7);
                    btsVar13.o0(aVar);
                    Q22 = aVar;
                }
                tls tlsVar19 = (tls) Q22;
                boolean e3 = btsVar13.e(f0j0Var) | btsVar13.k(slsVar6);
                Object Q23 = btsVar13.Q();
                if (e3 || Q23 == obj4) {
                    Q23 = new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.b
                        @Override // defpackage.sls
                        public final Object invoke() {
                            e eVar2 = f0j0.this.a;
                            l3y d7 = eVar2.d();
                            oz40 oz40Var8 = eVar2.j;
                            z5w z5wVar = d7 != null ? new z5w(((l0j0) d7).b()) : null;
                            l3y d8 = eVar2.d();
                            if ((d8 != null ? Integer.valueOf(((l0j0) d8).a()) : null) != null) {
                                eVar2.r.setValue(oz40Var8.getValue());
                                tje.N(eVar2.b, null, null, new ReorderableLazyCollectionState$onDragStop$1(eVar2, eVar2.e(), null), 3);
                            }
                            eVar2.l.setValue(new wu60(0L));
                            oz40Var8.setValue(null);
                            eVar2.m.setValue(new z5w(z5wVar != null ? z5wVar.a : 0L));
                            g gVar = eVar2.f;
                            tje.N(gVar.b, null, null, new Scroller$tryStop$1(gVar, null), 3);
                            eVar2.n.setValue(null);
                            eVar2.o.setValue(null);
                            slsVar6.invoke();
                            return zy11.a;
                        }
                    };
                    btsVar13.o0(Q23);
                }
                sls slsVar7 = (sls) Q23;
                boolean e4 = btsVar13.e(f0j0Var);
                Object Q24 = btsVar13.Q();
                if (e4 || Q24 == obj4) {
                    Q24 = new wls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.c
                        @Override // defpackage.wls
                        public final Object invoke(Object obj11, Object obj12) {
                            lcc lccVar;
                            long f3;
                            long j2;
                            long j3;
                            Object obj13;
                            ((zvd0) obj11).a();
                            e eVar2 = f0j0.this.a;
                            long j4 = ((wu60) obj12).a;
                            kotlinx.coroutines.sync.a aVar2 = eVar2.i;
                            g gVar = eVar2.f;
                            sue0 sue0Var = eVar2.a;
                            oz40 oz40Var8 = eVar2.l;
                            oz40Var8.setValue(new wu60(wu60.f(((wu60) oz40Var8.getValue()).a, j4)));
                            l3y d7 = eVar2.d();
                            if (d7 != null) {
                                long h = eVar2.h(eVar2.e());
                                eVar2.i(h);
                                l0j0 l0j0Var = (l0j0) d7;
                                float b = (int) (l0j0Var.b() >> 32);
                                long f4 = wu60.f((Float.floatToRawIntBits((int) (r8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(b) << 32), h);
                                long i5 = t791.i(f4, rzo.a0(l0j0Var.c()));
                                v5c0 e5 = sue0Var.e();
                                t6 t6Var = eVar2.e;
                                int i6 = kcc.a[((s6y) e5.b).o.ordinal()];
                                if (i6 == 1) {
                                    lccVar = new lcc(t6Var.c, t6Var.d);
                                } else {
                                    if (i6 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    lccVar = new lcc(t6Var.a, t6Var.b);
                                }
                                ahp0 F = e5.F(lccVar);
                                float f5 = F.a;
                                float f6 = F.b;
                                ((s6y) sue0Var.e().b).getClass();
                                boolean z3 = false;
                                boolean z4 = eVar2.g == LayoutDirection.Rtl && eVar2.f() == Orientation.Horizontal;
                                if (z4) {
                                    f3 = wu60.e(i5, eVar2.p);
                                } else {
                                    if (z4) {
                                        w511.b();
                                        return null;
                                    }
                                    f3 = wu60.f(f4, eVar2.p);
                                }
                                Orientation f7 = eVar2.f();
                                int i7 = -((s6y) sue0Var.e().b).l;
                                int i8 = vw21.a[f7.ordinal()];
                                if (i8 == 1) {
                                    j2 = f3;
                                    j3 = i7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                                } else {
                                    if (i8 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    j2 = f3;
                                    j3 = i7 << 32;
                                }
                                long f8 = wu60.f(j2, (Float.floatToRawIntBits((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32));
                                float d8 = t791.d(f8, eVar2.f()) - f5;
                                if (d8 < 0.0f) {
                                    d8 = 0.0f;
                                }
                                float d9 = f6 - t791.d(f8, eVar2.f());
                                if (d9 < 0.0f) {
                                    d9 = 0.0f;
                                }
                                float f9 = eVar2.d;
                                if (d8 < f9) {
                                    z3 = gVar.d(Scroller$Direction.BACKWARD, (1.0f - y6i0.c((d8 + f9) / (f9 * 2.0f), 0.0f, 1.0f)) * 10.0f, new g0j0(eVar2, 2), new ReorderableLazyCollectionState$onDrag$isScrollingStarted$2(eVar2, null));
                                } else if (d9 < f9) {
                                    z3 = gVar.d(Scroller$Direction.FORWARD, (1.0f - y6i0.c((d9 + f9) / (f9 * 2.0f), 0.0f, 1.0f)) * 10.0f, new g0j0(eVar2, 3), new ReorderableLazyCollectionState$onDrag$isScrollingStarted$4(eVar2, null));
                                } else {
                                    tje.N(gVar.b, null, null, new Scroller$tryStop$1(gVar, null), 3);
                                }
                                if (aVar2.h()) {
                                    pzt0 pzt0Var = gVar.d;
                                    if ((pzt0Var == null || !pzt0Var.isActive()) && !z3) {
                                        l3y c5 = eVar2.c(wwg.a(f4, i5), sue0Var.e().H(), Scroller$Direction.FORWARD, new odf0(13, d7));
                                        if (c5 != null) {
                                            obj13 = null;
                                            tje.N(eVar2.b, null, null, new ReorderableLazyCollectionState$onDrag$1(d7, c5, null, eVar2), 3);
                                            aVar2.d(obj13);
                                        }
                                    }
                                    obj13 = null;
                                    aVar2.d(obj13);
                                }
                            }
                            return zy11.a;
                        }
                    };
                    btsVar13.o0(Q24);
                }
                a = androidx.compose.ui.b.a(y, m.a(), new e1z0(eVar, zx40Var, slsVar7, z2, tlsVar19, (wls) Q24));
                btsVar13.t(false);
                return a;
            case 15:
                return b(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            default:
                f530 f530Var6 = (f530) obj8;
                yur yurVar = (yur) obj7;
                iyu iyuVar = (iyu) obj6;
                tls tlsVar20 = (tls) obj5;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    f530 d7 = hi91.d(gi91.b(f530Var6, yurVar), false, null, 3);
                    List list2 = iyuVar != null ? iyuVar.a : null;
                    if (list2 == null) {
                        btsVar14.e0(-1858403875);
                    } else {
                        btsVar14.e0(78598820);
                        Object Q25 = btsVar14.Q();
                        if (Q25 == obj4) {
                            Q25 = new jiz0(28);
                            btsVar14.o0(Q25);
                        }
                        r10 = com.yandex.go.design.compose.list.a.b(list2, (wls) Q25);
                    }
                    btsVar14.t(false);
                    ?? r16 = r10;
                    boolean k14 = btsVar14.k(tlsVar20);
                    Object Q26 = btsVar14.Q();
                    if (k14 || Q26 == obj4) {
                        Q26 = new ec01(15, tlsVar20);
                        btsVar14.o0(Q26);
                    }
                    tls tlsVar21 = (tls) Q26;
                    boolean k15 = btsVar14.k(tlsVar20);
                    Object Q27 = btsVar14.Q();
                    if (k15 || Q27 == obj4) {
                        Q27 = new ec01(i2, tlsVar20);
                        btsVar14.o0(Q27);
                    }
                    cta1.b(r16, tlsVar21, (tls) Q27, d7, btsVar14, 0);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ r5y(f530 f530Var, Object obj, Object obj2, tls tlsVar, int i) {
        this.a = i;
        this.c = f530Var;
        this.b = obj;
        this.w = obj2;
        this.x = tlsVar;
    }

    public /* synthetic */ r5y(wls wlsVar, zje zjeVar, zls zlsVar, sls slsVar) {
        this.a = 4;
        this.b = wlsVar;
        this.c = zjeVar;
        this.w = zlsVar;
        this.x = slsVar;
    }

    public /* synthetic */ r5y(Object obj, Object obj2, oz40 oz40Var, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.x = oz40Var;
        this.w = obj3;
    }

    public /* synthetic */ r5y(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
