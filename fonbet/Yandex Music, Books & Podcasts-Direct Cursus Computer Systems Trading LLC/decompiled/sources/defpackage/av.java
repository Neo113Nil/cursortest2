package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.a;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class av implements tyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ av(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        htr htrVar;
        switch (this.a) {
            case 0:
                j00 j00Var = (j00) this.b;
                jab jabVar = (jab) this.c;
                int intValue = ((Integer) obj).intValue();
                m7a m7aVar = (m7a) obj2;
                cma cmaVar = (cma) obj3;
                hq5 hq5Var = (hq5) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                m7aVar.getClass();
                thj j = vnj.j(m7aVar, intValue, 0);
                oq5 oq5Var = (oq5) hq5Var;
                Object K = oq5Var.K();
                Object obj6 = gq5.a;
                if (K == obj6) {
                    K = new q7a(m7aVar, new osh(j00Var.h.a(jabVar, null), j, j00Var));
                    oq5Var.k0(K);
                }
                p7a p7aVar = (p7a) K;
                s7a s7aVar = (s7a) gld.O(p7aVar.getState(), hq5Var).getValue();
                boolean h = oq5Var.h(p7aVar);
                Object K2 = oq5Var.K();
                if (h || K2 == obj6) {
                    Object c3Var = new c3(0, p7aVar, p7a.class, "onArtistClick", "onArtistClick()V", 0, 16);
                    oq5Var.k0(c3Var);
                    K2 = c3Var;
                }
                h9f h9fVar = (h9f) K2;
                boolean h2 = oq5Var.h(p7aVar);
                Object K3 = oq5Var.K();
                if (h2 || K3 == obj6) {
                    Object c3Var2 = new c3(0, p7aVar, p7a.class, "onDonationClick", "onDonationClick()V", 0, 17);
                    oq5Var.k0(c3Var2);
                    K3 = c3Var2;
                }
                h9f h9fVar2 = (h9f) K3;
                yci d = d.d(vci.a, 1.0f);
                boolean h3 = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(j);
                Object K4 = oq5Var.K();
                if (h3 || K4 == obj6) {
                    K4 = new bv(j00Var, jabVar, j, 2);
                    oq5Var.k0(K4);
                }
                qld.i(s7aVar, cmaVar.a, (Function0) h9fVar2, a.b(d, null, 0L, 0.0f, null, (Function2) K4, 15), (Function0) h9fVar, oq5Var, (intValue2 >> 3) & 112);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                s31 s31Var = (s31) this.c;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                hq5 hq5Var2 = (hq5) obj4;
                int intValue6 = ((Integer) obj5).intValue();
                kjn kjnVar = gq5.a;
                if ((intValue6 & 6) == 0) {
                    i = (((oq5) hq5Var2).d(intValue3) ? 4 : 2) | intValue6;
                } else {
                    i = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i |= ((oq5) hq5Var2).d(intValue4) ? 32 : 16;
                }
                if ((intValue6 & 384) == 0) {
                    i |= ((oq5) hq5Var2).d(intValue5) ? 256 : 128;
                }
                if ((i & 1171) == 1170) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                s26 s26Var = (s26) arrayList.get(intValue3);
                spd spdVar = new spd(intValue4, intValue5, intValue3);
                s31Var.getClass();
                s26Var.getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f = oq5Var3.f(s26Var) | oq5Var3.f(spdVar);
                Object K5 = oq5Var3.K();
                if (f || K5 == kjnVar) {
                    thj o = x97.o(s26Var.a, spdVar);
                    p31 p31Var = s31Var.a;
                    j31 j31Var = p31Var.b;
                    Context context = s31Var.e;
                    p31Var.d.getClass();
                    quk qukVar = htr.f;
                    String language = swf.I().getLanguage();
                    language.getClass();
                    qukVar.getClass();
                    int hashCode = language.hashCode();
                    if (hashCode == 3424) {
                        if (language.equals("kk")) {
                            htrVar = htr.j;
                            cr crVar = new cr(context, j31Var, htrVar.c, p31Var.c);
                            r31 r31Var = new r31(s31Var, o, s26Var, 0);
                            r31 r31Var2 = new r31(s31Var, o, s26Var, 1);
                            l18 l18Var = l18.b;
                            bdt I = hag.I(byb.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            h31 h31Var = new h31(s26Var, j31Var, crVar, r31Var, r31Var2, ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h());
                            oq5Var3.k0(h31Var);
                            K5 = h31Var;
                        }
                        htrVar = htr.g;
                        cr crVar2 = new cr(context, j31Var, htrVar.c, p31Var.c);
                        r31 r31Var3 = new r31(s31Var, o, s26Var, 0);
                        r31 r31Var22 = new r31(s31Var, o, s26Var, 1);
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        h31 h31Var2 = new h31(s26Var, j31Var, crVar2, r31Var3, r31Var22, ((q36) ((byb) qdcVar2.C(I2)).b(q36.class)).h());
                        oq5Var3.k0(h31Var2);
                        K5 = h31Var2;
                    } else if (hashCode != 3651) {
                        if (hashCode == 3749 && language.equals("uz")) {
                            htrVar = htr.i;
                            cr crVar22 = new cr(context, j31Var, htrVar.c, p31Var.c);
                            r31 r31Var32 = new r31(s31Var, o, s26Var, 0);
                            r31 r31Var222 = new r31(s31Var, o, s26Var, 1);
                            l18 l18Var22 = l18.b;
                            bdt I22 = hag.I(byb.class);
                            qdc qdcVar22 = l18Var22.a;
                            qdcVar22.getClass();
                            h31 h31Var22 = new h31(s26Var, j31Var, crVar22, r31Var32, r31Var222, ((q36) ((byb) qdcVar22.C(I22)).b(q36.class)).h());
                            oq5Var3.k0(h31Var22);
                            K5 = h31Var22;
                        }
                        htrVar = htr.g;
                        cr crVar222 = new cr(context, j31Var, htrVar.c, p31Var.c);
                        r31 r31Var322 = new r31(s31Var, o, s26Var, 0);
                        r31 r31Var2222 = new r31(s31Var, o, s26Var, 1);
                        l18 l18Var222 = l18.b;
                        bdt I222 = hag.I(byb.class);
                        qdc qdcVar222 = l18Var222.a;
                        qdcVar222.getClass();
                        h31 h31Var222 = new h31(s26Var, j31Var, crVar222, r31Var322, r31Var2222, ((q36) ((byb) qdcVar222.C(I222)).b(q36.class)).h());
                        oq5Var3.k0(h31Var222);
                        K5 = h31Var222;
                    } else {
                        if (language.equals("ru")) {
                            htrVar = htr.h;
                            cr crVar2222 = new cr(context, j31Var, htrVar.c, p31Var.c);
                            r31 r31Var3222 = new r31(s31Var, o, s26Var, 0);
                            r31 r31Var22222 = new r31(s31Var, o, s26Var, 1);
                            l18 l18Var2222 = l18.b;
                            bdt I2222 = hag.I(byb.class);
                            qdc qdcVar2222 = l18Var2222.a;
                            qdcVar2222.getClass();
                            h31 h31Var2222 = new h31(s26Var, j31Var, crVar2222, r31Var3222, r31Var22222, ((q36) ((byb) qdcVar2222.C(I2222)).b(q36.class)).h());
                            oq5Var3.k0(h31Var2222);
                            K5 = h31Var2222;
                        }
                        htrVar = htr.g;
                        cr crVar22222 = new cr(context, j31Var, htrVar.c, p31Var.c);
                        r31 r31Var32222 = new r31(s31Var, o, s26Var, 0);
                        r31 r31Var222222 = new r31(s31Var, o, s26Var, 1);
                        l18 l18Var22222 = l18.b;
                        bdt I22222 = hag.I(byb.class);
                        qdc qdcVar22222 = l18Var22222.a;
                        qdcVar22222.getClass();
                        h31 h31Var22222 = new h31(s26Var, j31Var, crVar22222, r31Var32222, r31Var222222, ((q36) ((byb) qdcVar22222.C(I22222)).b(q36.class)).h());
                        oq5Var3.k0(h31Var22222);
                        K5 = h31Var22222;
                    }
                }
                h31 h31Var3 = (h31) K5;
                yci d2 = d.d(b.b(androidx.compose.ui.platform.a.a(vci.a, "concert_item"), intValue3), 1.0f);
                boolean h4 = oq5Var3.h(s31Var) | oq5Var3.h(s26Var) | oq5Var3.h(spdVar);
                Object K6 = oq5Var3.K();
                if (h4 || K6 == kjnVar) {
                    K6 = new x3(12, s31Var, s26Var, spdVar);
                    oq5Var3.k0(K6);
                }
                ksw.m(h31Var3, a.b(d2, null, 0L, 0.0f, null, (Function2) K6, 15), oq5Var3, 0);
                break;
            default:
                con conVar = (con) this.b;
                plv plvVar = (plv) this.c;
                ukd ukdVar = (ukd) obj2;
                flv flvVar = (flv) obj3;
                hq5 hq5Var3 = (hq5) obj4;
                int intValue7 = ((Integer) obj5).intValue();
                ((pho) obj).getClass();
                ukdVar.getClass();
                flvVar.getClass();
                p1g.j(conVar.b(), ukdVar, plvVar, false, ild.C(-76561353, new t2n(4, conVar, flvVar, plvVar), hq5Var3), hq5Var3, (intValue7 & 112) | 24576);
                break;
        }
        return Unit.a;
    }
}
