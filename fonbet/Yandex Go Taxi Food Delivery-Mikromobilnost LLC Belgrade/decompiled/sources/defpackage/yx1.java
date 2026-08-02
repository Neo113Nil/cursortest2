package defpackage;

import com.yandex.go.multitariff.RouteStatsVerticalMulticlassDetails;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubV2VerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubVerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ComboOrder;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlassDetails;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.c;
import com.yandex.go.zone.model.Zone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public final class yx1 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public yx1(qh41 qh41Var) {
        this.a = qh41Var;
        this.b = qh41Var.t;
        this.c = new ConcurrentHashMap();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashMap();
        this.f = new jid(10, this);
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0b80, code lost:
    
        if (r3.d != false) goto L512;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0924  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dk31 a(cwd cwdVar) {
        List list;
        String str;
        EmptyList emptyList;
        Object obj;
        ArrayList arrayList;
        ybo a;
        ?? r3;
        DeliveryZoneTariffExtra deliveryZoneTariffExtra;
        ati c;
        dhm dhmVar;
        String a2;
        DeliveryZoneTariffExtra deliveryZoneTariffExtra2;
        ?? r6;
        ck31 ck31Var;
        Zone zone;
        yal0 yal0Var;
        ArrayList arrayList2;
        EmptyList emptyList2;
        int i;
        EmptyList emptyList3;
        ArrayList arrayList3;
        Object obj2;
        Zone zone2;
        Iterator it;
        yal0 yal0Var2;
        ArrayList arrayList4;
        oa31 oa31Var;
        df31 df31Var;
        cf31 cf31Var;
        cf31 cf31Var2;
        ArrayList arrayList5;
        String str2;
        Iterator it2;
        Object obj3;
        EmptyList emptyList4;
        yal0 yal0Var3;
        Zone zone3;
        Set set;
        Map f;
        EmptyList emptyList5;
        Iterator it3;
        List list2;
        String str3;
        List list3;
        xjx0 xjx0Var = (xjx0) this.b;
        yal0 yal0Var4 = cwdVar.b;
        List list4 = cwdVar.c;
        List list5 = cwdVar.d;
        xjx0Var.getClass();
        boolean isEmpty = list5.isEmpty();
        int i2 = 1;
        String str4 = "";
        EmptyList emptyList6 = EmptyList.a;
        int i3 = 0;
        if (isEmpty) {
            arrayList = new ArrayList(list4);
            list = list5;
            str = "";
            emptyList = emptyList6;
        } else {
            List list6 = list4;
            int d = gw00.d(tcc.n(list6, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj4 : list6) {
                linkedHashMap.put(((pex0) obj4).b, obj4);
            }
            ArrayList arrayList6 = new ArrayList(list4);
            if (yal0Var4 == null) {
                yal0Var4 = new yal0(i3);
            }
            t5r o = b.o(new h73(i2, list5), new wjx0(linkedHashMap, i3));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            s5r s5rVar = new s5r(o);
            while (s5rVar.hasNext()) {
                Pair pair = (Pair) s5rVar.next();
                pex0 pex0Var = (pex0) pair.getSecond();
                Object obj5 = linkedHashMap2.get(pex0Var);
                if (obj5 == null) {
                    ArrayList arrayList7 = new ArrayList();
                    linkedHashMap2.put(pex0Var, arrayList7);
                    obj5 = arrayList7;
                }
                List list7 = (List) obj5;
                pjx0 pjx0Var = (pjx0) pair.getFirst();
                pex0 pex0Var2 = (pex0) pair.getSecond();
                jgv jgvVar = xjx0Var.a;
                ServiceLevel serviceLevel = pjx0Var.a;
                List list8 = list5;
                rjx0 rjx0Var = pjx0Var.c;
                String str5 = str4;
                PaidOptions paidOptions = serviceLevel.C;
                Selector selector = serviceLevel.G;
                EmptyList emptyList7 = emptyList6;
                ComboOrder comboOrder = serviceLevel.D;
                boolean z = serviceLevel.E;
                String str6 = serviceLevel.F;
                int i4 = serviceLevel.l;
                String str7 = serviceLevel.e;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                qze0 c2 = xjx0Var.c.c(yal0Var4, serviceLevel, null, null);
                bco bcoVar = xjx0Var.d;
                c cVar = serviceLevel.d;
                yal0 yal0Var5 = yal0Var4;
                TariffOrderFlow tariffOrderFlow = pex0Var2.u0;
                bcoVar.getClass();
                if (tariffOrderFlow == TariffOrderFlow.DRIVE_FLOW) {
                    String b = cVar != null ? cVar.getB() : null;
                    if (b == null) {
                        b = str5;
                    }
                    a = new ybo(0, b, false);
                } else {
                    a = bco.a(cVar);
                }
                ybo yboVar = a;
                ServiceLevel.Requirements requirements = serviceLevel.s;
                boolean z2 = requirements != null && requirements.a;
                HashSet hashSet = new HashSet(serviceLevel.n);
                boolean z3 = serviceLevel.o;
                String str8 = serviceLevel.p;
                Boolean bool = serviceLevel.q;
                boolean z4 = bool == null || bool.booleanValue();
                jsq0 jsq0Var = serviceLevel.r;
                EmptyList M = jsq0Var != null ? a.M(jsq0Var) : null;
                EmptyList emptyList8 = M == null ? emptyList7 : M;
                String str9 = serviceLevel.f;
                SearchScreen searchScreen = serviceLevel.t;
                String str10 = serviceLevel.v;
                String str11 = serviceLevel.w;
                List list9 = serviceLevel.x;
                if (list9 != null) {
                    List list10 = list9;
                    r3 = new ArrayList();
                    for (Object obj6 : list10) {
                        boolean z5 = z3;
                        if (((ServiceLevel.ForceSuggest) obj6).a()) {
                            r3.add(obj6);
                        }
                        z3 = z5;
                    }
                } else {
                    r3 = 0;
                }
                boolean z6 = z3;
                EmptyList emptyList9 = r3 == 0 ? emptyList7 : r3;
                CouponCheckResult couponCheckResult = serviceLevel.z;
                BrandingType brandingType = serviceLevel.B;
                Selector selector2 = serviceLevel.G;
                boolean z7 = serviceLevel.H;
                String str12 = serviceLevel.I;
                cti ctiVar = xjx0Var.b;
                xjx0 xjx0Var2 = xjx0Var;
                DeliveryExtra deliveryExtra = serviceLevel.N;
                ati atiVar = pex0Var2.Z;
                if (deliveryExtra != null) {
                    if (atiVar != null) {
                        ctiVar.getClass();
                        deliveryZoneTariffExtra2 = cti.a(atiVar);
                    } else {
                        deliveryZoneTariffExtra2 = null;
                    }
                    c = ctiVar.b(deliveryExtra, deliveryZoneTariffExtra2);
                } else {
                    if (atiVar != null) {
                        ctiVar.getClass();
                        deliveryZoneTariffExtra = cti.a(atiVar);
                    } else {
                        deliveryZoneTariffExtra = null;
                    }
                    ctiVar.getClass();
                    c = cti.c(deliveryZoneTariffExtra);
                }
                ati atiVar2 = c;
                SummaryStyle summaryStyle = serviceLevel.P;
                if (summaryStyle == null) {
                    summaryStyle = pex0Var2.v0;
                }
                SummaryStyle summaryStyle2 = summaryStyle;
                String a3 = jgvVar.a(selector.d);
                if (a3 == null) {
                    a3 = pex0Var2.i;
                }
                String str13 = a3;
                String a4 = jgvVar.a(selector.c);
                if (a4 == null) {
                    a4 = pex0Var2.j;
                }
                String str14 = a4;
                String str15 = pjx0Var.b;
                oox0 oox0Var = pex0Var2.r;
                String str16 = oox0Var.a;
                if ((rjx0Var instanceof s5p0) && (a2 = ((s5p0) rjx0Var).getA()) != null) {
                    str16 = a2;
                }
                oox0 oox0Var2 = new oox0(str16, oox0Var.b, oox0Var.c);
                if (rjx0Var instanceof ghm) {
                    ghm ghmVar = (ghm) rjx0Var;
                    String a5 = ghmVar.getA();
                    String a6 = ghmVar.getB().getA();
                    String str17 = a6 == null ? str5 : a6;
                    String b2 = ghmVar.getB().getB();
                    String str18 = b2 == null ? str5 : b2;
                    String str19 = pjx0Var.b;
                    c cVar2 = pjx0Var.a.d;
                    dhmVar = new dhm(a5, str17, str18, str19, cVar2 != null ? (int) Math.ceil(cVar2.getA() / 60.0d) : 0);
                } else {
                    dhmVar = null;
                }
                list7.add(pex0.a(pex0Var2, str9, null, null, yboVar, str13, str14, str7, c2, i4, str10, str11, oox0Var2, z2, Boolean.valueOf(z6), str8, z4, hashSet, selector2, z7, str12, null, dhmVar, atiVar2, str15, emptyList8, paidOptions, comboOrder, z, str6, couponCheckResult, searchScreen, brandingType, emptyList9, null, summaryStyle2, -96713603, -1873546401, 8388062));
                list5 = list8;
                str4 = str5;
                emptyList6 = emptyList7;
                linkedHashMap2 = linkedHashMap3;
                yal0Var4 = yal0Var5;
                xjx0Var = xjx0Var2;
            }
            list = list5;
            str = str4;
            emptyList = emptyList6;
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                pex0 pex0Var3 = (pex0) entry.getKey();
                List list11 = (List) entry.getValue();
                Iterator it4 = arrayList6.iterator();
                int i5 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (((pex0) it4.next()).J0.a(pex0Var3)) {
                        break;
                    }
                    i5++;
                }
                if (i5 < 0) {
                    hst hstVar = jst.e;
                    String str20 = pex0Var3.b;
                    ArrayList arrayList8 = new ArrayList(tcc.n(arrayList6, 10));
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        arrayList8.add(((pex0) it5.next()).J0);
                    }
                    ArrayList arrayList9 = new ArrayList(tcc.n(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        arrayList9.add(((pex0) it6.next()).J0);
                    }
                    hstVar.w(new IllegalStateException(b64.n("}]", x4e.m("No origin tariff [", str20, "] found in tariffs list [", "] with original list [", arrayList8), arrayList9)));
                } else {
                    arrayList6.addAll(i5, list11);
                    arrayList6.remove(list11.size() + i5);
                }
            }
            Iterator it7 = arrayList6.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                pex0 pex0Var4 = (pex0) obj;
                if (jl40.l(pex0Var4.b, TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY) && pex0Var4.u0 == TariffOrderFlow.SHUTTLE_FLOW) {
                    break;
                }
            }
            pex0 pex0Var5 = (pex0) obj;
            if (pex0Var5 != null) {
                arrayList6.remove(pex0Var5);
            }
            arrayList = arrayList6;
        }
        Zone zone4 = cwdVar.a;
        yal0 yal0Var6 = cwdVar.b;
        ck31 ck31Var2 = (ck31) this.e;
        g gVar = (g) ((au50) this.h).b;
        h2v c3 = g.c((HubV2VerticalOnSummaryExperiment) gVar.b.b());
        if (c3 == null) {
            c3 = g.b((HubVerticalOnSummaryExperiment) gVar.a.b());
        }
        boolean z8 = c3 != null;
        List list12 = zone4.w;
        ArrayList arrayList10 = new ArrayList();
        for (Object obj7 : list12) {
            if (((ZoneVertical) obj7).c != VerticalType.MIXED || z8) {
                arrayList10.add(obj7);
            }
        }
        if (yal0Var6 == null || (list3 = yal0Var6.k) == null) {
            r6 = emptyList;
        } else {
            r6 = new ArrayList();
            for (Object obj8 : list3) {
                if (((ybl0) obj8).c != VerticalType.MIXED || z8) {
                    r6.add(obj8);
                }
            }
        }
        gk31 gk31Var = (gk31) this.a;
        fef g = yal0Var6 != null ? yal0Var6.g() : null;
        String str21 = zone4.a;
        gk31Var.getClass();
        if (!r6.isEmpty()) {
            ck31Var = ck31Var2;
            Iterable<ybl0> iterable = (Iterable) r6;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                loop24: for (ybl0 ybl0Var : iterable) {
                    if (ybl0Var.c != VerticalType.SINGLE_TARIFF) {
                        if (!arrayList10.isEmpty()) {
                            Iterator it8 = arrayList10.iterator();
                            while (it8.hasNext()) {
                                if (jl40.l(((ZoneVertical) it8.next()).a, ybl0Var.a)) {
                                    break;
                                }
                            }
                        }
                        zone = zone4;
                        yal0Var = yal0Var6;
                        arrayList2 = arrayList;
                        emptyList2 = emptyList;
                    }
                }
            }
            ?? arrayList11 = new ArrayList();
            Iterator it9 = iterable.iterator();
            while (it9.hasNext()) {
                ybl0 ybl0Var2 = (ybl0) it9.next();
                Iterator it10 = arrayList10.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        arrayList3 = arrayList10;
                        obj2 = null;
                        break;
                    }
                    obj2 = it10.next();
                    arrayList3 = arrayList10;
                    if (jl40.l(((ZoneVertical) obj2).a, ybl0Var2.a)) {
                        break;
                    }
                    arrayList10 = arrayList3;
                }
                ZoneVertical zoneVertical = (ZoneVertical) obj2;
                if (zoneVertical != null) {
                    List list13 = zoneVertical.f;
                    List list14 = ybl0Var2.f;
                    it = it9;
                    ArrayList arrayList12 = new ArrayList(tcc.n(list14, 10));
                    Iterator it11 = list14.iterator();
                    while (it11.hasNext()) {
                        VerticalTariffDto verticalTariffDto = (VerticalTariffDto) it11.next();
                        Iterator it12 = list13.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                it2 = it11;
                                obj3 = null;
                                break;
                            }
                            obj3 = it12.next();
                            it2 = it11;
                            Iterator it13 = it12;
                            if (jl40.l(((VerticalTariffDto) obj3).a, verticalTariffDto.a)) {
                                break;
                            }
                            it11 = it2;
                            it12 = it13;
                        }
                        VerticalTariffDto verticalTariffDto2 = (VerticalTariffDto) obj3;
                        String str22 = verticalTariffDto.b;
                        if (str22.length() == 0) {
                            str22 = verticalTariffDto2 != null ? verticalTariffDto2.b : null;
                        }
                        String str23 = str22 == null ? str : str22;
                        String str24 = verticalTariffDto.c;
                        if (str24.length() == 0) {
                            str24 = verticalTariffDto2 != null ? verticalTariffDto2.c : null;
                        }
                        arrayList12.add(new VerticalTariffDto(verticalTariffDto.a, 16, str23, str24 == null ? str : str24, verticalTariffDto.d));
                        it11 = it2;
                    }
                    String str25 = ybl0Var2.a;
                    ZoneVerticalMulticlass zoneVerticalMulticlass = zoneVertical.l;
                    bcl0 bcl0Var = ybl0Var2.m;
                    yo40 yo40Var = gk31Var.b;
                    if (bcl0Var != null) {
                        arrayList4 = arrayList;
                        RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails = bcl0Var.e;
                        zone2 = zone4;
                        List list15 = bcl0Var.a;
                        if (zoneVerticalMulticlass == null) {
                            Set a7 = ((com.yandex.go.taxi.tariffs.repository.g) yo40Var.a).a(str25);
                            Integer num = bcl0Var.b;
                            List list16 = list15;
                            yal0Var2 = yal0Var6;
                            ArrayList arrayList13 = new ArrayList(tcc.n(list16, 10));
                            for (Iterator it14 = list16.iterator(); it14.hasNext(); it14 = it14) {
                                String str26 = ((fq40) it14.next()).a;
                                arrayList13.add(new viq0(str26, a7.contains(str26)));
                            }
                            cf31Var = new cf31(str25, num, arrayList13, bcl0Var.c, bcl0Var.d, new df31(routeStatsVerticalMulticlassDetails.b, routeStatsVerticalMulticlassDetails.c, routeStatsVerticalMulticlassDetails.d, routeStatsVerticalMulticlassDetails.a, routeStatsVerticalMulticlassDetails.e), bcl0Var.g, false, bcl0Var.h, bcl0Var.i, bcl0Var.j, true, bcl0Var.f, false, bcl0Var.a());
                        } else {
                            yal0Var2 = yal0Var6;
                            String str27 = bcl0Var.d;
                            if (str27.length() == 0) {
                                str27 = zoneVerticalMulticlass.d;
                            }
                            String str28 = str27;
                            SelectionRules selectionRules = bcl0Var.g;
                            if (jl40.l(selectionRules, SelectionRules.b)) {
                                selectionRules = null;
                            }
                            if (selectionRules == null) {
                                selectionRules = zoneVerticalMulticlass.f;
                            }
                            SelectionRules selectionRules2 = selectionRules;
                            dbl0 b3 = gk31Var.d.b();
                            boolean z9 = (b3 != null && b3.a.t) || !list15.isEmpty();
                            Set a8 = gk31Var.f.a(str25);
                            Integer num2 = bcl0Var.b;
                            if (num2 == null) {
                                num2 = zoneVerticalMulticlass.a;
                            }
                            Integer num3 = num2;
                            List list17 = list15;
                            ArrayList arrayList14 = new ArrayList(tcc.n(list17, 10));
                            for (Iterator it15 = list17.iterator(); it15.hasNext(); it15 = it15) {
                                String str29 = ((fq40) it15.next()).a;
                                arrayList14.add(new viq0(str29, a8.contains(str29)));
                            }
                            n7v n7vVar = bcl0Var.c;
                            if (n7vVar == null) {
                                n7vVar = zoneVerticalMulticlass.c;
                            }
                            n7v n7vVar2 = n7vVar;
                            RouteStatsVerticalMulticlassDetails.Companion.getClass();
                            if (jl40.l(routeStatsVerticalMulticlassDetails, RouteStatsVerticalMulticlassDetails.f)) {
                                routeStatsVerticalMulticlassDetails = null;
                            }
                            if (routeStatsVerticalMulticlassDetails != null) {
                                yo40Var.getClass();
                                df31Var = new df31(routeStatsVerticalMulticlassDetails.b, routeStatsVerticalMulticlassDetails.c, routeStatsVerticalMulticlassDetails.d, routeStatsVerticalMulticlassDetails.a, routeStatsVerticalMulticlassDetails.e);
                            } else {
                                ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = zoneVerticalMulticlass.e;
                                yo40Var.getClass();
                                df31Var = new df31(null, null, zoneVerticalMulticlassDetails.b, zoneVerticalMulticlassDetails.a, zoneVerticalMulticlassDetails.c);
                            }
                            cf31Var = new cf31(str25, num3, arrayList14, n7vVar2, str28, df31Var, selectionRules2, zoneVerticalMulticlass.g, bcl0Var.h, bcl0Var.i, bcl0Var.j, z9, bcl0Var.f, zoneVerticalMulticlass.i, bcl0Var.a());
                        }
                        cf31Var2 = cf31Var;
                    } else if (zoneVerticalMulticlass != null) {
                        zone2 = zone4;
                        cf31Var2 = yo40Var.j(str25, zoneVerticalMulticlass, false);
                        yal0Var2 = yal0Var6;
                        arrayList4 = arrayList;
                    } else {
                        zone2 = zone4;
                        yal0Var2 = yal0Var6;
                        arrayList4 = arrayList;
                        cf31Var2 = null;
                    }
                    boolean h = gk31Var.g.h(zoneVertical, ybl0Var2, str21);
                    if (h) {
                        ArrayList arrayList15 = new ArrayList();
                        Iterator it16 = arrayList12.iterator();
                        while (it16.hasNext()) {
                            Object next = it16.next();
                            if (jl40.l(((VerticalTariffDto) next).a, "multiclass")) {
                                arrayList15.add(next);
                            }
                        }
                        arrayList5 = arrayList15;
                    } else {
                        if (h) {
                            w511.b();
                            return null;
                        }
                        arrayList5 = arrayList12;
                    }
                    if (h) {
                        str2 = "multiclass";
                    } else {
                        if (h) {
                            w511.b();
                            return null;
                        }
                        String str30 = ybl0Var2.g;
                        if (str30 == null) {
                            str30 = zoneVertical.g;
                        }
                        str2 = str30;
                    }
                    String str31 = ybl0Var2.a;
                    String str32 = ybl0Var2.b;
                    if (str32.length() == 0) {
                        str32 = zoneVertical.b;
                    }
                    String str33 = str32;
                    yo40 yo40Var2 = gk31Var.c;
                    yo40Var2.getClass();
                    VerticalType verticalType = ybl0Var2.c;
                    String str34 = ybl0Var2.a;
                    if (((Boolean) ((krq0) yo40Var2.a).a.b()).booleanValue() && jl40.l(str34, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                        verticalType = VerticalType.DRIVE;
                    }
                    VerticalType verticalType2 = verticalType;
                    String str35 = ybl0Var2.d;
                    if (str35.length() == 0) {
                        str35 = zoneVertical.d;
                    }
                    String str36 = str35;
                    String str37 = ybl0Var2.e;
                    if (str37.length() == 0) {
                        str37 = zoneVertical.e;
                    }
                    String str38 = str37;
                    n7v n7vVar3 = ybl0Var2.h;
                    if (n7vVar3 == null) {
                        n7vVar3 = zoneVertical.h;
                    }
                    n7v n7vVar4 = n7vVar3;
                    n7v n7vVar5 = ybl0Var2.i;
                    if (n7vVar5 == null) {
                        n7vVar5 = zoneVertical.i;
                    }
                    n7v n7vVar6 = n7vVar5;
                    n7v n7vVar7 = ybl0Var2.j;
                    if (n7vVar7 == null) {
                        n7vVar7 = zoneVertical.j;
                    }
                    n7v n7vVar8 = n7vVar7;
                    String str39 = ybl0Var2.k;
                    String str40 = (str39 == null && (str39 = zoneVertical.k) == null) ? str : str39;
                    String str41 = ybl0Var2.l;
                    String a9 = (str41 == null || str41.length() == 0) ? null : gk31Var.e.a(g, str41, false, true);
                    List list18 = zoneVertical.m;
                    Boolean bool2 = ybl0Var2.n;
                    oa31Var = new oa31(str31, str33, verticalType2, str36, str38, arrayList5, str2, n7vVar4, n7vVar6, n7vVar8, str40, a9, cf31Var2, list18, bool2 != null ? bool2.booleanValue() : zoneVertical.n);
                } else {
                    zone2 = zone4;
                    it = it9;
                    yal0Var2 = yal0Var6;
                    arrayList4 = arrayList;
                    oa31Var = null;
                }
                if (oa31Var != null) {
                    arrayList11.add(oa31Var);
                }
                arrayList10 = arrayList3;
                it9 = it;
                arrayList = arrayList4;
                zone4 = zone2;
                yal0Var6 = yal0Var2;
            }
            zone = zone4;
            yal0Var = yal0Var6;
            arrayList2 = arrayList;
            i = 0;
            emptyList3 = arrayList11;
            if (list.isEmpty()) {
                ?? arrayList16 = new ArrayList(emptyList3);
                ArrayList arrayList17 = new ArrayList();
                for (Object obj9 : list) {
                    if (((pjx0) obj9).c.getC()) {
                        arrayList17.add(obj9);
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Iterator it17 = arrayList17.iterator();
                while (it17.hasNext()) {
                    Object next2 = it17.next();
                    String str42 = ((pjx0) next2).b;
                    Object obj10 = linkedHashMap4.get(str42);
                    if (obj10 == null) {
                        obj10 = qv10.w(str42, linkedHashMap4);
                    }
                    ((List) obj10).add(next2);
                }
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    String str43 = (String) entry2.getKey();
                    List list19 = (List) entry2.getValue();
                    int size = arrayList16.size();
                    int i6 = i;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        oa31 oa31Var2 = (oa31) arrayList16.get(i6);
                        if (oa31Var2.d() && jl40.l(oa31Var2.b, str43)) {
                            Iterator it18 = list19.iterator();
                            while (it18.hasNext()) {
                                arrayList16.add(i6, oa31.a(oa31Var2, ((pjx0) it18.next()).a.f, null, 32765));
                            }
                        } else {
                            i6++;
                        }
                    }
                    int size2 = arrayList16.size();
                    for (int i7 = i; i7 < size2; i7++) {
                        oa31 oa31Var3 = (oa31) arrayList16.get(i7);
                        boolean d2 = oa31Var3.d();
                        List list20 = oa31Var3.f;
                        if (!d2) {
                            ArrayList arrayList18 = new ArrayList(list20);
                            Iterator it19 = list20.iterator();
                            int i8 = i;
                            while (true) {
                                if (!it19.hasNext()) {
                                    i8 = -1;
                                    break;
                                }
                                if (jl40.l(((VerticalTariffDto) it19.next()).a, str43)) {
                                    break;
                                }
                                i8++;
                            }
                            if (i8 >= 0 && i8 < arrayList18.size()) {
                                arrayList18.remove(i8);
                            }
                            if (jl40.l(oa31Var3.a, str43)) {
                                i8 = arrayList18.size();
                            }
                            if (i8 >= 0) {
                                Iterator it20 = list19.iterator();
                                while (it20.hasNext()) {
                                    arrayList18.add(i8, new VerticalTariffDto(((pjx0) it20.next()).a.f, 30, null, null, false));
                                    i8++;
                                }
                                arrayList16.set(i7, oa31.a(oa31Var3, null, arrayList18, 32735));
                            }
                        }
                    }
                }
                emptyList4 = arrayList16;
            } else {
                emptyList4 = emptyList3;
            }
            ((uer) this.c).a.getClass();
            ((ye31) this.f).getClass();
            yal0Var3 = yal0Var;
            if (yal0Var != null || yal0Var3.k.isEmpty()) {
                zone3 = zone;
                set = zone3.y;
                if (set == null) {
                    set = EmptySet.a;
                }
            } else {
                set = yal0Var3.l;
                zone3 = zone;
            }
            VerticalMode verticalMode = VerticalMode.SELECTOR;
            VerticalMode verticalMode2 = !set.contains(verticalMode.getMode()) ? verticalMode : VerticalMode.WITHOUT_SELECTOR;
            k kVar = (k) ck31Var;
            Map t = kotlin.collections.b.t(kVar.j.e);
            if (yal0Var3 != null || (f = yal0Var3.p) == null) {
                f = kotlin.collections.b.f();
            }
            if (!emptyList4.isEmpty()) {
                ArrayList arrayList19 = arrayList2;
                ArrayList arrayList20 = new ArrayList(tcc.n(arrayList19, 10));
                Iterator it21 = arrayList19.iterator();
                while (it21.hasNext()) {
                    arrayList20.add(new ois0((pex0) it21.next()).n0());
                }
                return new dk31(arrayList20, VerticalMode.WITHOUT_SELECTOR, zone3, f);
            }
            ArrayList<pex0> arrayList21 = arrayList2;
            if (verticalMode2 == verticalMode) {
                ArrayList c4 = ((fb31) this.d).c(yal0Var3, emptyList4, arrayList21, kotlin.collections.b.t(kVar.j.e), true);
                if (!c4.isEmpty()) {
                    Iterator it22 = c4.iterator();
                    while (true) {
                        if (!it22.hasNext()) {
                            break;
                        }
                        if (!((za31) it22.next()).a.o) {
                            ?? arrayList22 = new ArrayList();
                            Iterator it23 = c4.iterator();
                            while (it23.hasNext()) {
                                Object next3 = it23.next();
                                za31 za31Var = (za31) next3;
                                if (!za31Var.a.c() || !za31Var.b.isEmpty()) {
                                    arrayList22.add(next3);
                                }
                            }
                            emptyList = arrayList22;
                        }
                    }
                }
            }
            if (verticalMode2 != VerticalMode.WITHOUT_SELECTOR) {
                if (emptyList.size() < 2) {
                    VerticalSelectorSettingsExperiment verticalSelectorSettingsExperiment = (VerticalSelectorSettingsExperiment) ((q) this.g).c.b();
                    if (verticalSelectorSettingsExperiment.b) {
                    }
                }
                emptyList5 = emptyList;
                return new dk31(emptyList5, verticalMode2, zone3, f);
            }
            ?? arrayList23 = new ArrayList(((fb31) this.d).c(yal0Var3, emptyList4, arrayList21, t, false));
            if (verticalMode2 == VerticalMode.SELECTOR && emptyList.isEmpty()) {
                for (pex0 pex0Var6 : arrayList21) {
                    if (!arrayList23.isEmpty()) {
                        Iterator it24 = arrayList23.iterator();
                        while (it24.hasNext()) {
                            za31 za31Var2 = (za31) it24.next();
                            if (!za31Var2.a.d() || !jl40.l(za31Var2.a.b, pex0Var6.b)) {
                            }
                        }
                    }
                    arrayList23.add(new ois0(pex0Var6).n0());
                }
            }
            verticalMode2 = VerticalMode.WITHOUT_SELECTOR;
            emptyList5 = arrayList23;
            return new dk31(emptyList5, verticalMode2, zone3, f);
        }
        ?? arrayList24 = new ArrayList(tcc.n(arrayList10, 10));
        Iterator it25 = arrayList10.iterator();
        while (it25.hasNext()) {
            ZoneVertical zoneVertical2 = (ZoneVertical) it25.next();
            cf11 cf11Var = gk31Var.a;
            boolean h2 = ((rfw0) cf11Var.c).h(zoneVertical2, null, str21);
            String str44 = zoneVertical2.a;
            List list21 = zoneVertical2.f;
            ck31 ck31Var3 = ck31Var2;
            if (h2) {
                ArrayList arrayList25 = new ArrayList();
                Iterator it26 = list21.iterator();
                while (it26.hasNext()) {
                    Iterator it27 = it25;
                    Object next4 = it26.next();
                    Iterator it28 = it26;
                    if (jl40.l(((VerticalTariffDto) next4).a, "multiclass")) {
                        arrayList25.add(next4);
                    }
                    it25 = it27;
                    it26 = it28;
                }
                it3 = it25;
                list2 = arrayList25;
            } else {
                it3 = it25;
                if (h2) {
                    w511.b();
                    return null;
                }
                list2 = list21;
            }
            if (h2) {
                str3 = "multiclass";
            } else {
                if (h2) {
                    w511.b();
                    return null;
                }
                str3 = zoneVertical2.g;
            }
            ZoneVerticalMulticlass zoneVerticalMulticlass2 = zoneVertical2.l;
            cf31 j = zoneVerticalMulticlass2 != null ? ((yo40) cf11Var.a).j(str44, zoneVerticalMulticlass2, true) : null;
            String str45 = zoneVertical2.a;
            String str46 = zoneVertical2.b;
            yo40 yo40Var3 = (yo40) cf11Var.b;
            yo40Var3.getClass();
            VerticalType verticalType3 = zoneVertical2.c;
            if (((Boolean) ((krq0) yo40Var3.a).a.b()).booleanValue() && jl40.l(str44, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                verticalType3 = VerticalType.DRIVE;
            }
            VerticalType verticalType4 = verticalType3;
            String str47 = zoneVertical2.d;
            String str48 = zoneVertical2.e;
            n7v n7vVar9 = zoneVertical2.h;
            n7v n7vVar10 = zoneVertical2.i;
            n7v n7vVar11 = zoneVertical2.j;
            String str49 = zoneVertical2.k;
            arrayList24.add(new oa31(str45, str46, verticalType4, str47, str48, list2, str3, n7vVar9, n7vVar10, n7vVar11, str49 == null ? str : str49, null, j, zoneVertical2.m, zoneVertical2.n));
            ck31Var2 = ck31Var3;
            it25 = it3;
        }
        ck31Var = ck31Var2;
        zone = zone4;
        yal0Var = yal0Var6;
        arrayList2 = arrayList;
        emptyList2 = arrayList24;
        i = 0;
        emptyList3 = emptyList2;
        if (list.isEmpty()) {
        }
        ((uer) this.c).a.getClass();
        ((ye31) this.f).getClass();
        yal0Var3 = yal0Var;
        if (yal0Var != null) {
        }
        zone3 = zone;
        set = zone3.y;
        if (set == null) {
        }
        VerticalMode verticalMode3 = VerticalMode.SELECTOR;
        if (!set.contains(verticalMode3.getMode())) {
        }
        k kVar2 = (k) ck31Var;
        Map t2 = kotlin.collections.b.t(kVar2.j.e);
        if (yal0Var3 != null) {
        }
        f = kotlin.collections.b.f();
        if (!emptyList4.isEmpty()) {
        }
    }

    public void b() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        c();
        c();
        if (((KeyStore) this.c) == null) {
            i3y i3yVar = eg11.a;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                keyStore = null;
            } else {
                byte[][] provide = ((cjf) this.a).provide();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : provide) {
                    i3y i3yVar2 = eg11.a;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        CertificateFactory certificateFactory = (CertificateFactory) eg11.a.getValue();
                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                    } catch (CertificateException unused3) {
                        x509Certificate = null;
                    }
                    if (x509Certificate != null) {
                        arrayList.add(x509Certificate);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                    } catch (KeyStoreException unused4) {
                    }
                }
            }
            this.c = keyStore;
        }
        c();
        if (((X509TrustManager) this.d) == null) {
            c();
            if (((KeyStore) this.c) != null) {
                c();
                this.d = eg11.b((KeyStore) this.c);
                c();
                X509TrustManager x509TrustManager = (X509TrustManager) this.d;
                this.g = x509TrustManager != null ? eg11.c(x509TrustManager) : null;
            }
        }
    }

    public void c() {
        if (Thread.holdsLock(this.h)) {
            return;
        }
        ny61.r("Operation should be performed under lock");
    }

    public X509TrustManager d() {
        return (X509TrustManager) ((i3y) this.b).getValue();
    }

    public synchronized void e(s221 s221Var, w221 w221Var) {
        if (jl40.l((w221) ((ConcurrentHashMap) this.c).get(s221Var), w221Var)) {
            return;
        }
        ((ConcurrentHashMap) this.c).put(s221Var, w221Var);
        u221 u221Var = (u221) ((LinkedHashMap) this.e).get(s221Var);
        if (u221Var != null) {
            u221Var.b(new wx11(4, w221Var));
        }
    }

    public yx1(cjf cjfVar) {
        this.a = cjfVar;
        this.b = kotlin.a.a(new z151(7));
        final int i = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: ym51
            public final /* synthetic */ yx1 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                yx1 yx1Var = this.b;
                switch (i2) {
                    case 0:
                        return eg11.c(yx1Var.d());
                    default:
                        X509TrustManager d = yx1Var.d();
                        i3y i3yVar = eg11.a;
                        try {
                            Method declaredMethod = d.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
                            declaredMethod.setAccessible(true);
                            return declaredMethod;
                        } catch (NoSuchMethodException unused) {
                            return null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.a.a(new sls(this) { // from class: ym51
            public final /* synthetic */ yx1 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                yx1 yx1Var = this.b;
                switch (i22) {
                    case 0:
                        return eg11.c(yx1Var.d());
                    default:
                        X509TrustManager d = yx1Var.d();
                        i3y i3yVar = eg11.a;
                        try {
                            Method declaredMethod = d.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
                            declaredMethod.setAccessible(true);
                            return declaredMethod;
                        } catch (NoSuchMethodException unused) {
                            return null;
                        }
                }
            }
        });
        this.h = new Object();
    }

    public /* synthetic */ yx1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
    }

    public yx1(xvf0 xvf0Var, y2r0 y2r0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, z4k0 z4k0Var) {
        this.a = xvf0Var;
        this.g = y2r0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.h = z4k0Var;
    }

    public yx1(xvf0 xvf0Var, i5s0 i5s0Var, xvf0 xvf0Var2, i5s0 i5s0Var2, kpp0 kpp0Var, cfw0 cfw0Var, aj0 aj0Var, xvf0 xvf0Var3) {
        this.a = xvf0Var;
        this.b = i5s0Var;
        this.c = xvf0Var2;
        this.g = i5s0Var2;
        this.d = kpp0Var;
        this.e = cfw0Var;
        this.h = aj0Var;
        this.f = xvf0Var3;
    }

    public yx1(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, b900 b900Var, xvf0 xvf0Var6, k220 k220Var) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.g = b900Var;
        this.f = xvf0Var6;
        this.h = k220Var;
    }

    public yx1(zw30 zw30Var, xvf0 xvf0Var, ci3 ci3Var, xh xhVar, bhx bhxVar, xvf0 xvf0Var2, sku0 sku0Var, im21 im21Var) {
        this.a = zw30Var;
        this.b = xvf0Var;
        this.f = ci3Var;
        this.g = xhVar;
        this.c = bhxVar;
        this.d = xvf0Var2;
        this.h = sku0Var;
        this.e = im21Var;
    }
}
