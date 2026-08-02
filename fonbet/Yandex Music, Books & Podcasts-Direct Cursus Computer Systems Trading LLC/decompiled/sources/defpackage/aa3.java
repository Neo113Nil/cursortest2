package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.flex.ui.content.d;
import com.yandex.plus.bdui.plus.analytics.c;
import com.yandex.plus.bdui.plus.checkout.div.e;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.bdui.plus.content.i;
import com.yandex.plus.bdui.w;
import com.yandex.plus.log.api.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class aa3 implements Function1 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ aa3(j jVar, List list, LinkedHashMap linkedHashMap, f fVar, b bVar, TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, o oVar, e eVar, Map map, d dVar, tf6 tf6Var) {
        this.c = jVar;
        this.b = list;
        this.d = linkedHashMap;
        this.f = fVar;
        this.h = bVar;
        this.i = tarifficatorBduiScenarioActivity;
        this.j = oVar;
        this.k = eVar;
        this.l = map;
        this.e = dVar;
        this.g = tf6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator it;
        gb3 gb3Var;
        poi poiVar;
        nab labVar;
        Object obj2;
        qkb qkbVar;
        vuf vufVar;
        sdr sdrVar;
        vuf vufVar2;
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.f;
        Object obj11 = this.d;
        Object obj12 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                fvf fvfVar = (fvf) obj12;
                eoe eoeVar = (eoe) obj11;
                va3 va3Var = (va3) obj8;
                u0s u0sVar = (u0s) obj7;
                gb3 gb3Var2 = (gb3) obj6;
                aqi aqiVar = (aqi) obj5;
                thj thjVar = (thj) obj4;
                poi poiVar2 = (poi) obj3;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                List list = this.b;
                vuf.Y(vufVar3, null, new wn5(new up((tvd) obj10, (c93) obj9, va3Var, list, 8), -1573053042, true), 3);
                Iterator it2 = list.iterator();
                int i3 = 0;
                int i4 = -1;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    q93 q93Var = (q93) next;
                    if (q93Var instanceof qzn) {
                        i4++;
                    }
                    if (q93Var instanceof k93) {
                        jab jabVar = new jab(qkb.BrandedButtons, 1, i4 + 1, 1);
                        va3Var.getClass();
                        va3Var.b.M(jabVar, u0sVar);
                        vuf.Y(vufVar3, null, new wn5(new ba3(i3, 0, (k93) q93Var, gb3Var2, va3Var, u0sVar, jabVar), 1605414563, true), 3);
                        poiVar = poiVar2;
                        it = it2;
                        gb3Var = gb3Var2;
                    } else {
                        gb3 gb3Var3 = gb3Var2;
                        if (q93Var instanceof p93) {
                            jcj jcjVar = (jcj) aqiVar.getValue();
                            jcjVar.getClass();
                            boolean z = jcjVar.b;
                            j0s j0sVar = jcjVar.a;
                            thj thjVar2 = thjVar;
                            it = it2;
                            gb3Var = gb3Var3;
                            List h = u75.h(new u0s("details", 1, z && j0sVar == j0s.a), new u0s("chapters", 2, z && j0sVar == j0s.b));
                            va3Var.getClass();
                            h.getClass();
                            ob3 ob3Var = va3Var.b;
                            ob3Var.getClass();
                            if (!ob3Var.B) {
                                ob3Var.B = true;
                                Iterator it3 = h.iterator();
                                while (it3.hasNext()) {
                                    ob3Var.l.b().g((u0s) it3.next());
                                }
                            }
                            vuf.Y(vufVar3, null, new wn5(new ca3((p93) q93Var, aqiVar), 444036058, true), 3);
                            poiVar = poiVar2;
                            thjVar = thjVar2;
                        } else {
                            thj thjVar3 = thjVar;
                            it = it2;
                            gb3Var = gb3Var3;
                            if (q93Var instanceof m93) {
                                jab jabVar2 = new jab(qkb.InformationBlock, 1, i4 + 1, 1);
                                va3Var.getClass();
                                va3Var.b.M(jabVar2, u0sVar);
                                lc lcVar = new lc((m93) q93Var, u0sVar, jabVar2, thjVar3, va3Var, 2);
                                thjVar = thjVar3;
                                obj2 = null;
                                vuf.Y(vufVar3, null, new wn5(lcVar, 475595675, true), 3);
                            } else {
                                thjVar = thjVar3;
                                if (q93Var instanceof o93) {
                                    o93 o93Var = (o93) q93Var;
                                    String str = o93Var.a.b;
                                    if (str == null) {
                                        labVar = new jab(qkb.OtherAlbums, 1, i4 + 1, 1);
                                    } else {
                                        qkb qkbVar2 = qkb.Carousel;
                                        labVar = new lab(1, i4 + 1, 1, "other_albums", str);
                                    }
                                    va3Var.getClass();
                                    va3Var.b.M(labVar, u0sVar);
                                    obj2 = null;
                                    vuf.Y(vufVar3, null, new wn5(new up(o93Var, va3Var, u0sVar, labVar, 7), 507155292, true), 3);
                                } else if (q93Var instanceof l93) {
                                    ArrayList arrayList = ((l93) q93Var).a;
                                    jab jabVar3 = new jab(qkb.Chapters, 1, i4 + 1, arrayList.size());
                                    va3Var.getClass();
                                    va3Var.b.M(jabVar3, u0sVar);
                                    wp wpVar = new wp(poiVar2, 2);
                                    vqn vqnVar = new vqn();
                                    vqnVar.a = -1;
                                    poiVar = poiVar2;
                                    vufVar3.Z(arrayList.size(), null, new vv(arrayList, 8), new wn5(new m83(arrayList, vqnVar, va3Var, u0sVar, jabVar3, wpVar, 0), -1091073711, true));
                                } else {
                                    poiVar = poiVar2;
                                    if (!(q93Var instanceof n93)) {
                                        b6e.s();
                                        return null;
                                    }
                                    jab jabVar4 = new jab(qkb.OfflineMode, 1, i4 + 1, 1);
                                    va3Var.getClass();
                                    va3Var.b.M(jabVar4, u0sVar);
                                    vuf.Y(vufVar3, null, new wn5(new xk(16, va3Var, jabVar4, u0sVar), 570274526, true), 3);
                                }
                            }
                            poiVar = poiVar2;
                        }
                        i3 = i5;
                        it2 = it;
                        gb3Var2 = gb3Var;
                        poiVar2 = poiVar;
                    }
                    i3 = i5;
                    it2 = it;
                    gb3Var2 = gb3Var;
                    poiVar2 = poiVar;
                }
                jf0.h(vufVar3, fvfVar, eoeVar);
                return Unit.a;
            case 1:
                fvf fvfVar2 = (fvf) obj12;
                eoe eoeVar2 = (eoe) obj11;
                dvl dvlVar = (dvl) obj9;
                gvd gvdVar = dvlVar.c;
                final qzl qzlVar = (qzl) obj7;
                fvf fvfVar3 = (fvf) obj6;
                sdr sdrVar2 = (sdr) obj5;
                poi poiVar3 = (poi) obj3;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                vuf.Y(vufVar4, "header_block", new wn5(new lc(dvlVar, (nab) obj8, (thj) obj4, qzlVar, (tvd) obj10, 11), -965014083, true), 2);
                Iterator it4 = this.b.iterator();
                int i6 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    final yxl yxlVar = (yxl) next2;
                    yxlVar.getClass();
                    pxl pxlVar = pxl.a;
                    boolean equals = yxlVar.equals(pxlVar);
                    rxl rxlVar = rxl.a;
                    if (equals) {
                        qkbVar = qkb.AddToPlaylist;
                    } else if (yxlVar instanceof qxl) {
                        qkbVar = qkb.BrandedButtons;
                    } else if (yxlVar instanceof sxl) {
                        qkbVar = qkb.SimilarEntities;
                    } else if (yxlVar instanceof txl) {
                        qkbVar = qkb.SimilarPlaylists;
                    } else if (yxlVar instanceof xxl) {
                        qkbVar = qkb.Tracks;
                    } else {
                        if (!yxlVar.equals(rxlVar)) {
                            b6e.s();
                            return null;
                        }
                        qkbVar = qkb.OfflineMode;
                    }
                    if (!yxlVar.equals(pxlVar)) {
                        if (!(yxlVar instanceof qxl)) {
                            if (yxlVar instanceof sxl) {
                                i2 = ((sxl) yxlVar).a.size();
                            } else if (yxlVar instanceof txl) {
                                i2 = ((txl) yxlVar).a.size();
                            } else if (yxlVar instanceof xxl) {
                                i2 = ((xxl) yxlVar).getCount();
                            } else if (!yxlVar.equals(rxlVar)) {
                                b6e.s();
                                return null;
                            }
                        }
                        i2 = 1;
                    }
                    gvd gvdVar2 = gvdVar;
                    Iterator it5 = it4;
                    final jab jabVar5 = new jab(qkbVar, 1, i6 + 2, i2);
                    qzlVar.b(jabVar5);
                    if (yxlVar instanceof qxl) {
                        vuf.Y(vufVar4, p1g.B(yxlVar), new wn5(new gyl(2, jabVar5, yxlVar, qzlVar), -141805441, true), 2);
                    } else if (yxlVar instanceof xxl) {
                        vuf.Y(vufVar4, "tracks spacing", gld.c, 2);
                        xxl xxlVar = (xxl) yxlVar;
                        if (!(xxlVar instanceof uxl)) {
                            if (xxlVar instanceof vxl) {
                                sdrVar = sdrVar2;
                                vuf.Y(vufVar4, p1g.B(yxlVar), new wn5(new up(fvfVar3, yxlVar, qzlVar, sdrVar2, 24), -1406807543, true), 2);
                                vxl vxlVar = (vxl) yxlVar;
                                ndc ndcVar = vxlVar.b;
                                if (Intrinsics.d(ndcVar, hdc.a) || Intrinsics.d(ndcVar, jdc.a)) {
                                    vufVar2 = vufVar4;
                                    final int i8 = 1;
                                    p1g.I(vufVar2, vxlVar.c, null, new wp(poiVar3, 4), qzlVar.a(null, jabVar5, null), new Function2() { // from class: dyl
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj13, Object obj14) {
                                            int i9 = i8;
                                            hq5 hq5Var = (hq5) obj13;
                                            ((Integer) obj14).getClass();
                                            switch (i9) {
                                                case 0:
                                                    oq5 oq5Var = (oq5) hq5Var;
                                                    oq5Var.Z(890156974);
                                                    owu h0 = o2g.h0(qzlVar, ((wxl) yxlVar).c, jabVar5, null, oq5Var, 4);
                                                    oq5Var.p(false);
                                                    return h0;
                                                default:
                                                    oq5 oq5Var2 = (oq5) hq5Var;
                                                    oq5Var2.Z(377397639);
                                                    owu h02 = o2g.h0(qzlVar, ((vxl) yxlVar).d, jabVar5, null, oq5Var2, 4);
                                                    oq5Var2.p(false);
                                                    return h02;
                                            }
                                        }
                                    }, gvdVar2.b(), new eyl(qzlVar, jabVar5, i8));
                                } else if (ndcVar instanceof ldc) {
                                    ldc ldcVar = (ldc) ndcVar;
                                    hcc hccVar = (hcc) ldcVar.a.get(ldcVar.b);
                                    boolean z2 = ldcVar.c;
                                    hccVar.getClass();
                                    u0s u0sVar2 = new u0s(hccVar.a, hccVar.c + 1, z2);
                                    vufVar2 = vufVar4;
                                    p1g.I(vufVar2, ldcVar.d, u0sVar2, new wp(poiVar3, 5), qzlVar.a(ldcVar, jabVar5, u0sVar2), new gvl(qzlVar, yxlVar, jabVar5, u0sVar2, 3), gvdVar2.b(), new eyl(qzlVar, jabVar5, 2));
                                } else {
                                    b6e.s();
                                }
                                vufVar = vufVar2;
                                vufVar4 = vufVar;
                                sdrVar2 = sdrVar;
                                i6 = i7;
                                gvdVar = gvdVar2;
                                i2 = 1;
                                it4 = it5;
                            } else {
                                vuf vufVar5 = vufVar4;
                                sdrVar = sdrVar2;
                                if (xxlVar instanceof wxl) {
                                    final int i9 = 0;
                                    p1g.I(vufVar5, ((wxl) yxlVar).b, null, new wp(poiVar3, 3), qzlVar.a(null, jabVar5, null), new Function2() { // from class: dyl
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj13, Object obj14) {
                                            int i92 = i9;
                                            hq5 hq5Var = (hq5) obj13;
                                            ((Integer) obj14).getClass();
                                            switch (i92) {
                                                case 0:
                                                    oq5 oq5Var = (oq5) hq5Var;
                                                    oq5Var.Z(890156974);
                                                    owu h0 = o2g.h0(qzlVar, ((wxl) yxlVar).c, jabVar5, null, oq5Var, 4);
                                                    oq5Var.p(false);
                                                    return h0;
                                                default:
                                                    oq5 oq5Var2 = (oq5) hq5Var;
                                                    oq5Var2.Z(377397639);
                                                    owu h02 = o2g.h0(qzlVar, ((vxl) yxlVar).d, jabVar5, null, oq5Var2, 4);
                                                    oq5Var2.p(false);
                                                    return h02;
                                            }
                                        }
                                    }, gvdVar2.b(), new eyl(qzlVar, jabVar5, i9));
                                    vufVar = vufVar5;
                                    vufVar4 = vufVar;
                                    sdrVar2 = sdrVar;
                                    i6 = i7;
                                    gvdVar = gvdVar2;
                                    i2 = 1;
                                    it4 = it5;
                                } else {
                                    b6e.s();
                                }
                            }
                            return null;
                        }
                        vuf.Y(vufVar4, p1g.B(yxlVar), new wn5(new gab(24, yxlVar, jabVar5), 520666400, true), 2);
                    } else {
                        vufVar = vufVar4;
                        sdrVar = sdrVar2;
                        final int i10 = 0;
                        if (yxlVar.equals(pxlVar)) {
                            vuf.Y(vufVar, p1g.B(yxlVar), new wn5(new pyc() { // from class: fyl
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                    int i11 = i10;
                                    a aVar = (a) obj13;
                                    hq5 hq5Var = (hq5) obj14;
                                    int intValue = ((Integer) obj15).intValue();
                                    switch (i11) {
                                        case 0:
                                            aVar.getClass();
                                            oq5 oq5Var = (oq5) hq5Var;
                                            if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                w1g.f(qzlVar, jabVar5, null, oq5Var, 0);
                                            } else {
                                                oq5Var.S();
                                            }
                                            break;
                                        default:
                                            aVar.getClass();
                                            oq5 oq5Var2 = (oq5) hq5Var;
                                            if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                vci vciVar = vci.a;
                                                u1g.l(oq5Var2, androidx.compose.foundation.layout.d.e(vciVar, 40));
                                                qzl qzlVar2 = qzlVar;
                                                boolean h2 = oq5Var2.h(qzlVar2);
                                                jab jabVar6 = jabVar5;
                                                boolean h3 = h2 | oq5Var2.h(jabVar6);
                                                Object K = oq5Var2.K();
                                                if (h3 || K == gq5.a) {
                                                    K = new iik(17, qzlVar2, jabVar6);
                                                    oq5Var2.k0(K);
                                                }
                                                cxb.g((Function0) K, androidx.compose.foundation.layout.d.d(vciVar, 1.0f), oq5Var2, 48);
                                            } else {
                                                oq5Var2.S();
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 1262238343, true), 2);
                        } else {
                            final int i11 = 1;
                            if (yxlVar instanceof sxl) {
                                vuf.Y(vufVar, p1g.B(yxlVar), new wn5(new gyl(yxlVar, qzlVar, jabVar5), -1224455194, true), 2);
                            } else if (yxlVar instanceof txl) {
                                vuf.Y(vufVar, p1g.B(yxlVar), gld.d, 2);
                                vuf.Y(vufVar, "playlist_similar_content_block", new wn5(new gyl(i11, jabVar5, yxlVar, qzlVar), 1666417404, true), 2);
                            } else {
                                if (!yxlVar.equals(rxlVar)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar, p1g.B(yxlVar), new wn5(new pyc() { // from class: fyl
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                        int i112 = i11;
                                        a aVar = (a) obj13;
                                        hq5 hq5Var = (hq5) obj14;
                                        int intValue = ((Integer) obj15).intValue();
                                        switch (i112) {
                                            case 0:
                                                aVar.getClass();
                                                oq5 oq5Var = (oq5) hq5Var;
                                                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                    w1g.f(qzlVar, jabVar5, null, oq5Var, 0);
                                                } else {
                                                    oq5Var.S();
                                                }
                                                break;
                                            default:
                                                aVar.getClass();
                                                oq5 oq5Var2 = (oq5) hq5Var;
                                                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                    vci vciVar = vci.a;
                                                    u1g.l(oq5Var2, androidx.compose.foundation.layout.d.e(vciVar, 40));
                                                    qzl qzlVar2 = qzlVar;
                                                    boolean h2 = oq5Var2.h(qzlVar2);
                                                    jab jabVar6 = jabVar5;
                                                    boolean h3 = h2 | oq5Var2.h(jabVar6);
                                                    Object K = oq5Var2.K();
                                                    if (h3 || K == gq5.a) {
                                                        K = new iik(17, qzlVar2, jabVar6);
                                                        oq5Var2.k0(K);
                                                    }
                                                    cxb.g((Function0) K, androidx.compose.foundation.layout.d.d(vciVar, 1.0f), oq5Var2, 48);
                                                } else {
                                                    oq5Var2.S();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, -1902874972, true), 2);
                            }
                        }
                        vufVar4 = vufVar;
                        sdrVar2 = sdrVar;
                        i6 = i7;
                        gvdVar = gvdVar2;
                        i2 = 1;
                        it4 = it5;
                    }
                    vufVar = vufVar4;
                    sdrVar = sdrVar2;
                    vufVar4 = vufVar;
                    sdrVar2 = sdrVar;
                    i6 = i7;
                    gvdVar = gvdVar2;
                    i2 = 1;
                    it4 = it5;
                }
                vuf vufVar6 = vufVar4;
                vuf.Y(vufVar6, null, new wn5(new tik(3, eoeVar2), -673862746, true), 3);
                jf0.h(vufVar6, fvfVar2, eoeVar2);
                return Unit.a;
            default:
                j jVar = (j) obj12;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj11;
                f fVar = (f) obj10;
                b bVar = (b) obj9;
                dzf dzfVar = (dzf) obj8;
                o oVar = (o) obj7;
                e eVar = (e) obj6;
                Map map = (Map) obj5;
                d dVar = (d) obj4;
                tf6 tf6Var = (tf6) obj3;
                ((c) obj).getClass();
                Set b = uop.b((String) jVar.a);
                b.getClass();
                Map b2 = tah.b(new Pair(new w("divKitVersions"), b));
                Map map2 = com.yandex.plus.bdui.plus.d.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (((Set) jVar.b).contains((com.yandex.plus.divkit.api.e) entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set A0 = CollectionsKt.A0(linkedHashMap2.values());
                A0.getClass();
                Map b3 = tah.b(new Pair(new w("divKitFeatures"), A0));
                List list2 = this.b;
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((com.yandex.plus.bdui.plus.handler.d) it6.next()).a);
                }
                Set A02 = CollectionsKt.A0(arrayList2);
                A02.getClass();
                Map b4 = tah.b(new Pair(new w("divKitHandlers"), A02));
                Set keySet = linkedHashMap.keySet();
                keySet.getClass();
                return t75.c(new com.yandex.plus.bdui.content.c("PlusDivKit", new com.yandex.plus.bdui.plus.b(fVar, bVar, i2), ern.a(i.class), new i11(list2, dzfVar, oVar, jVar, eVar, map, linkedHashMap, dVar, tf6Var, bVar), com.yandex.plus.core.network.api.utils.a.y(com.yandex.plus.core.network.api.utils.a.y(com.yandex.plus.core.network.api.utils.a.y(b2, b3), b4), tah.b(new Pair(new w("divKitCustomTypes"), keySet)))));
        }
    }

    public /* synthetic */ aa3(List list, fvf fvfVar, eoe eoeVar, tvd tvdVar, c93 c93Var, va3 va3Var, u0s u0sVar, gb3 gb3Var, aqi aqiVar, thj thjVar, poi poiVar) {
        this.b = list;
        this.c = fvfVar;
        this.d = eoeVar;
        this.f = tvdVar;
        this.h = c93Var;
        this.i = va3Var;
        this.j = u0sVar;
        this.k = gb3Var;
        this.l = aqiVar;
        this.e = thjVar;
        this.g = poiVar;
    }

    public /* synthetic */ aa3(List list, fvf fvfVar, eoe eoeVar, dvl dvlVar, nab nabVar, thj thjVar, qzl qzlVar, tvd tvdVar, fvf fvfVar2, sdr sdrVar, poi poiVar) {
        this.b = list;
        this.c = fvfVar;
        this.d = eoeVar;
        this.h = dvlVar;
        this.i = nabVar;
        this.e = thjVar;
        this.j = qzlVar;
        this.f = tvdVar;
        this.k = fvfVar2;
        this.l = sdrVar;
        this.g = poiVar;
    }
}
