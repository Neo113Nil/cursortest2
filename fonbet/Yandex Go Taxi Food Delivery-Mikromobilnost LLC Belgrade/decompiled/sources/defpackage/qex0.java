package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.dto.response.d2;
import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.objects.AttributedDescription;
import com.yandex.go.zone.dto.objects.AuctionInfo;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ComboExtra;
import com.yandex.go.zone.dto.objects.ComboOrder;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import com.yandex.go.zone.dto.objects.DriveExtra;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.SuffixSpanType;
import com.yandex.go.zone.dto.objects.SuggestsPreferences;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.c;
import com.yandex.go.zone.model.Zone;
import defpackage.h6k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.tariffs.model.TariffSource;
import ru.yandex.taxi.tariffs.model.a;

/* loaded from: classes10.dex */
public final class qex0 {
    public final jgv a;
    public final fwq0 b;
    public final cti c;
    public final pmw0 d;

    public qex0(jgv jgvVar, fwq0 fwq0Var, cti ctiVar, pmw0 pmw0Var) {
        this.a = jgvVar;
        this.b = fwq0Var;
        this.c = ctiVar;
        this.d = pmw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0255  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r36v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v78, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pex0 a(qex0 qex0Var, Zone zone, yal0 yal0Var, ServiceLevel serviceLevel, ZoneTariffInfo zoneTariffInfo, is60 is60Var, ay1 ay1Var, a aVar, LinkedHashSet linkedHashSet, int i) {
        ati c;
        String str;
        int i2;
        String str2;
        ay1 ay1Var2;
        boolean z;
        ybo a;
        ybo yboVar;
        TariffOrderFlow tariffOrderFlow;
        h6k0 h6k0Var;
        int i3;
        String str3;
        List list;
        ofa0 ofa0Var;
        Boolean bool;
        List M;
        List list2;
        List list3;
        ?? r4;
        CouponCheckResult couponCheckResult;
        Selector selector;
        boolean z2;
        String str4;
        ComboExtra.RouteDisplayType routeDisplayType;
        SummaryStyle summaryStyle;
        qjc qjcVar;
        String a2;
        String str5;
        n7v n7vVar;
        f5 f5Var;
        String str6;
        ServiceLevel.RideTime rideTime;
        List list4;
        Iterator it;
        ServiceLevel.RideTime rideTime2;
        SummaryStyle summaryStyle2;
        Object obj;
        ServiceLevel.Branding branding;
        ati atiVar;
        ServiceLevel.TariffCard tariffCard;
        EmptyList emptyList;
        oox0 b;
        int i4;
        String a3;
        String a4;
        pox0 pox0Var;
        String str7;
        String str8;
        String str9;
        String str10;
        List list5;
        List list6;
        List list7;
        List list8;
        int i5;
        Map map;
        AuctionInfo auctionInfo;
        ServiceLevel.ScheduledOrderViewDto scheduledOrderViewDto;
        zvb zvbVar;
        fom0 fom0Var;
        fom0 fom0Var2;
        h6k0 h6k0Var2;
        ArrayList arrayList;
        EmptyList emptyList2;
        v580 v580Var;
        Object obj2;
        n7v n7vVar2;
        Boolean bool2;
        String str11;
        ofa0 ofa0Var2;
        kdc b2;
        String str12;
        String str13;
        String str14;
        String e;
        ay1 ay1Var3 = (i & 32) != 0 ? null : ay1Var;
        a aVar2 = (i & 64) != 0 ? new a(0) : aVar;
        LinkedHashSet linkedHashSet2 = (i & 128) != 0 ? null : linkedHashSet;
        fwq0 fwq0Var = qex0Var.b;
        int max = Math.max(zone.p, 2);
        qn11 qn11Var = nmx0.d;
        qn11 b3 = zone.b(nmx0.class);
        if (b3 != null) {
            qn11Var = b3;
        }
        nmx0 nmx0Var = (nmx0) qn11Var;
        jgv jgvVar = fwq0Var.a;
        cti ctiVar = fwq0Var.b;
        DeliveryExtra deliveryExtra = serviceLevel.N;
        List list9 = serviceLevel.J;
        TariffUnavailable tariffUnavailable = serviceLevel.m;
        ServiceLevel.RequirementAlternatives requirementAlternatives = serviceLevel.V;
        Selector selector2 = serviceLevel.G;
        ComboExtra comboExtra = serviceLevel.O;
        DeliveryZoneTariffExtra deliveryZoneTariffExtra = zoneTariffInfo != null ? zoneTariffInfo.F : null;
        if (deliveryExtra != null) {
            c = ctiVar.b(deliveryExtra, deliveryZoneTariffExtra);
        } else {
            ctiVar.getClass();
            c = cti.c(deliveryZoneTariffExtra);
        }
        boolean j = ay1Var3 != null ? ay1Var3.j() : false;
        ijx0 ijx0Var = TariffOrderFlow.Companion;
        String str15 = zoneTariffInfo != null ? zoneTariffInfo.E : null;
        ijx0Var.getClass();
        TariffOrderFlow a5 = ijx0.a(str15);
        if (a5 == null) {
            a5 = TariffOrderFlow.TAXI_FLOW;
        }
        if (zoneTariffInfo == null || (str = zoneTariffInfo.e) == null) {
            str = serviceLevel.f;
        }
        boolean z3 = yal0Var.t;
        h6k0 h6k0Var3 = yal0Var.q;
        TariffSource tariffSource = z3 ? TariffSource.ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS : TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
        boolean z4 = j;
        PaidOptions paidOptions = serviceLevel.C;
        ComboOrder comboOrder = serviceLevel.D;
        boolean z5 = serviceLevel.E;
        String str16 = serviceLevel.F;
        int i6 = serviceLevel.l;
        if (ay1Var3 == null || (e = ay1Var3.e()) == null) {
            i2 = i6;
            String str17 = zoneTariffInfo != null ? zoneTariffInfo.d : null;
            if (str17 == null) {
                str17 = serviceLevel.e;
            }
            str2 = str17;
        } else {
            i2 = i6;
            str2 = e;
        }
        qze0 c2 = fwq0Var.c.c(yal0Var, serviceLevel, linkedHashSet2, ay1Var3);
        ybo yboVar2 = c != null ? c.m : null;
        c cVar = serviceLevel.d;
        ybo yboVar3 = yboVar2;
        if (a5 != TariffOrderFlow.DELIVERY_FLOW || yboVar3 == null) {
            fwq0Var.e.getClass();
            if (a5 == TariffOrderFlow.DRIVE_FLOW) {
                String b4 = cVar != null ? cVar.getB() : null;
                if (b4 == null) {
                    b4 = "";
                }
                ay1Var2 = ay1Var3;
                z = false;
                a = new ybo(0, b4, false);
            } else {
                ay1Var2 = ay1Var3;
                z = false;
                a = bco.a(cVar);
            }
        } else {
            a = yboVar3;
            ay1Var2 = ay1Var3;
            z = false;
        }
        boolean z6 = !(tariffUnavailable == null ? true : z);
        boolean z7 = tariffUnavailable != null ? tariffUnavailable.i : false;
        ServiceLevel.Requirements requirements = serviceLevel.s;
        boolean z8 = requirements != null && requirements.a;
        boolean z9 = tariffUnavailable != null ? tariffUnavailable.e : false;
        String str18 = (tariffUnavailable == null || (str14 = tariffUnavailable.b) == null) ? "" : str14;
        String str19 = (tariffUnavailable == null || (str13 = tariffUnavailable.c) == null) ? "" : str13;
        SuffixSpanType suffixSpanType = tariffUnavailable != null ? tariffUnavailable.g : null;
        String str20 = (tariffUnavailable == null || (str12 = tariffUnavailable.a) == null) ? "" : str12;
        d2 d2Var = tariffUnavailable != null ? tariffUnavailable.d : null;
        if (tariffUnavailable != null) {
            String str21 = tariffUnavailable.k;
            i3 = 1;
            yp2 yp2Var = fwq0Var.f;
            yboVar = a;
            tariffOrderFlow = a5;
            pdc pdcVar = fwq0Var.d;
            String str22 = tariffUnavailable.j;
            list = list9;
            ufu ufuVar = (ufu) pdcVar;
            h6k0Var = h6k0Var3;
            kdc i7 = ufuVar.i(str21);
            if (i7 == null || (b2 = ufuVar.b(str22)) == null) {
                str3 = str;
                ofa0Var2 = null;
            } else {
                str3 = str;
                ofa0Var2 = new ofa0(i7, b2, yp2Var.a(str21, AppColor$Palette.TextOnControl), yp2Var.a(str22, AppColor$Palette.Control));
            }
            ofa0Var = ofa0Var2;
        } else {
            yboVar = a;
            tariffOrderFlow = a5;
            h6k0Var = h6k0Var3;
            i3 = 1;
            str3 = str;
            list = list9;
            ofa0Var = null;
        }
        String str23 = (tariffUnavailable == null || (str11 = tariffUnavailable.h) == null) ? "" : str11;
        HashSet hashSet = new HashSet(serviceLevel.n);
        boolean z10 = serviceLevel.o;
        String str24 = serviceLevel.p;
        ?? r36 = (zoneTariffInfo == null ? (bool = serviceLevel.q) == null || bool.booleanValue() : (bool2 = zoneTariffInfo.r) == null || bool2.booleanValue() || zoneTariffInfo.C.a()) ? i3 : 0;
        EmptyList emptyList3 = EmptyList.a;
        if (zoneTariffInfo != null) {
            M = sb2.p(zoneTariffInfo);
        } else {
            jsq0 jsq0Var = serviceLevel.r;
            M = jsq0Var != null ? kotlin.collections.a.M(jsq0Var) : null;
            if (M == null) {
                list2 = emptyList3;
                SearchScreen searchScreen = serviceLevel.t;
                ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo = serviceLevel.u;
                String str25 = serviceLevel.v;
                String str26 = serviceLevel.w;
                list3 = serviceLevel.x;
                if (list3 == null) {
                    List list10 = list3;
                    r4 = new ArrayList();
                    for (Object obj3 : list10) {
                        boolean z11 = z10;
                        if (((ServiceLevel.ForceSuggest) obj3).a()) {
                            r4.add(obj3);
                        }
                        z10 = z11;
                    }
                } else {
                    r4 = 0;
                }
                boolean z12 = z10;
                EmptyList emptyList4 = r4 != 0 ? emptyList3 : r4;
                couponCheckResult = serviceLevel.z;
                if (couponCheckResult == null) {
                    couponCheckResult = yal0Var.a;
                }
                CouponCheckResult couponCheckResult2 = couponCheckResult;
                BrandingType brandingType = serviceLevel.B;
                Selector selector3 = serviceLevel.G;
                boolean z13 = serviceLevel.H;
                String str27 = serviceLevel.I;
                List list11 = list;
                List list12 = (list11 != null || list11.isEmpty()) ? emptyList3 : list;
                PriceMeta priceMeta = serviceLevel.h;
                DriveExtra driveExtra = serviceLevel.L;
                b a6 = driveExtra == null ? driveExtra.getA() : null;
                if (comboExtra == null) {
                    selector = selector3;
                    z2 = comboExtra.getA();
                } else {
                    selector = selector3;
                    z2 = false;
                }
                if (comboExtra == null) {
                    str4 = str24;
                    routeDisplayType = comboExtra.getB();
                } else {
                    str4 = str24;
                    routeDisplayType = null;
                }
                qjc qjcVar2 = new qjc(z2, routeDisplayType);
                summaryStyle = serviceLevel.P;
                ServiceLevel.TariffCard tariffCard2 = serviceLevel.R;
                if (zoneTariffInfo == null) {
                    qjcVar = qjcVar2;
                    a2 = jgvVar.a(zoneTariffInfo.c);
                } else {
                    qjcVar = qjcVar2;
                    a2 = z4 ? null : jgvVar.a(selector2.d);
                }
                if (ay1Var2 == null) {
                    str5 = a2;
                    n7vVar = ay1Var2.d();
                } else {
                    str5 = a2;
                    n7vVar = null;
                }
                String a7 = n7vVar == null ? jgvVar.a(n7vVar) : zoneTariffInfo != null ? jgvVar.a(zoneTariffInfo.f) : z4 ? null : jgvVar.a(selector2.c);
                String str28 = (zoneTariffInfo != null || (n7vVar2 = zoneTariffInfo.g) == null) ? null : n7vVar2.a;
                f5Var = serviceLevel.Q;
                String str29 = a7;
                if (f5Var == e5.INSTANCE) {
                    f5Var = null;
                }
                if (f5Var != null) {
                    Iterator it2 = yal0Var.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            str6 = str28;
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        Iterator it3 = it2;
                        str6 = str28;
                        if (((ServiceLevel) obj2).l == serviceLevel.l) {
                            break;
                        }
                        it2 = it3;
                        str28 = str6;
                    }
                    ServiceLevel serviceLevel2 = (ServiceLevel) obj2;
                    f5Var = serviceLevel2 != null ? serviceLevel2.Q : null;
                } else {
                    str6 = str28;
                }
                if (f5Var == null) {
                    f5Var = e5.INSTANCE;
                }
                f5 f5Var2 = f5Var;
                ?? r0 = ((c != null || (v580Var = c.b) == null) ? null : v580Var.b.a()) == null ? i3 : 0;
                rideTime = serviceLevel.k;
                list4 = list;
                if (list4 != null || list4.isEmpty()) {
                    list = emptyList3;
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        rideTime2 = rideTime;
                        summaryStyle2 = summaryStyle;
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    rideTime2 = rideTime;
                    summaryStyle2 = summaryStyle;
                    if (((ServiceLevel.Branding) obj).getC() == ServiceLevel.Branding.Type.RIDE_TIME) {
                        break;
                    }
                    rideTime = rideTime2;
                    summaryStyle = summaryStyle2;
                }
                branding = (ServiceLevel.Branding) obj;
                if (branding == null) {
                    b = fwq0.b(yal0Var, r0, branding.getS());
                    atiVar = c;
                    tariffCard = tariffCard2;
                    emptyList = emptyList3;
                } else if (rideTime2 != null) {
                    Integer b5 = rideTime2.getB();
                    if (b5 != null) {
                        if (r0 != 0) {
                            b5 = null;
                        }
                        if (b5 != null) {
                            i4 = b5.intValue();
                            ServiceLevel.RideTimeAppearance c3 = rideTime2.getC();
                            String a8 = c3 == null ? c3.getA() : null;
                            a3 = rideTime2.getA();
                            Integer b6 = rideTime2.getB();
                            if (a3 != null || a3.length() == 0 || b6 == null || b6.intValue() <= 0) {
                                atiVar = c;
                                tariffCard = tariffCard2;
                                emptyList = emptyList3;
                                b = oox0.d;
                            } else {
                                if (r0 != 0 || (a4 = rideTime2.getA()) == null) {
                                    a4 = "";
                                }
                                if (a8 == null || a8.length() == 0) {
                                    atiVar = c;
                                    tariffCard = tariffCard2;
                                    emptyList = emptyList3;
                                    pox0Var = jhc0.b;
                                } else {
                                    atiVar = c;
                                    sqk0 sqk0Var = nmx0Var.c;
                                    if (!nmx0Var.b || sqk0Var == null || (str7 = sqk0Var.d) == null || str7.length() == 0 || (str8 = sqk0Var.b) == null || str8.length() == 0 || (str9 = sqk0Var.a) == null || str9.length() == 0 || (str10 = sqk0Var.c) == null || str10.length() == 0) {
                                        sqk0Var = null;
                                    }
                                    if (sqk0Var != null) {
                                        tariffCard = tariffCard2;
                                        emptyList = emptyList3;
                                        pox0Var = new o5v(sqk0Var.a, sqk0Var.b, sqk0Var.c, sqk0Var.d);
                                    } else {
                                        tariffCard = tariffCard2;
                                        emptyList = emptyList3;
                                        pox0Var = new khs0(a8);
                                    }
                                }
                                b = new oox0(a4, i4, pox0Var);
                            }
                        }
                    }
                    i4 = -1;
                    ServiceLevel.RideTimeAppearance c32 = rideTime2.getC();
                    if (c32 == null) {
                    }
                    a3 = rideTime2.getA();
                    Integer b62 = rideTime2.getB();
                    if (a3 != null) {
                    }
                    atiVar = c;
                    tariffCard = tariffCard2;
                    emptyList = emptyList3;
                    b = oox0.d;
                } else {
                    atiVar = c;
                    tariffCard = tariffCard2;
                    emptyList = emptyList3;
                    if (ay1Var2 != null) {
                        String g = ay1Var2.g();
                        int h = ay1Var2.h();
                        if (g != null && g.length() != 0 && h > 0) {
                            b = new oox0(r0 == 0 ? ay1Var2.g() : "", ay1Var2.h());
                        }
                    }
                    b = fwq0.b(yal0Var, r0, null);
                }
                wu1 b7 = ay1Var2 == null ? ay1Var2.b() : null;
                boolean c4 = ay1Var2 == null ? ay1Var2.c() : false;
                String f = ay1Var2 == null ? ay1Var2.f() : null;
                String str30 = zoneTariffInfo == null ? zoneTariffInfo.a : null;
                boolean z14 = zoneTariffInfo == null ? zoneTariffInfo.k : false;
                boolean z15 = zoneTariffInfo == null ? zoneTariffInfo.u : false;
                boolean z16 = zoneTariffInfo == null ? zoneTariffInfo.i : false;
                boolean z17 = zoneTariffInfo == null ? zoneTariffInfo.j : false;
                pmw0 pmw0Var = fwq0Var.g;
                list5 = zoneTariffInfo == null ? zoneTariffInfo.o : null;
                if (list5 == null) {
                    list5 = emptyList;
                }
                pmw0Var.getClass();
                String str31 = str3;
                ArrayList b8 = pmw0.b(str31, list5);
                list6 = zoneTariffInfo == null ? zoneTariffInfo.q : null;
                if (list6 == null) {
                    list6 = emptyList;
                }
                list7 = zoneTariffInfo == null ? zoneTariffInfo.m : null;
                if (list7 == null) {
                    list7 = emptyList;
                }
                list8 = zoneTariffInfo == null ? zoneTariffInfo.n : null;
                if (list8 == null) {
                    list8 = emptyList;
                }
                oox0 oox0Var = b;
                String str32 = zoneTariffInfo == null ? zoneTariffInfo.v : null;
                TariffCard tariffCard3 = zoneTariffInfo == null ? zoneTariffInfo.t : null;
                if (zoneTariffInfo != null) {
                    i5 = i3;
                } else {
                    i5 = zoneTariffInfo.x;
                    if (i5 <= 0) {
                        i5 = max;
                    }
                }
                int i8 = i5 - 1;
                int i9 = zoneTariffInfo == null ? zoneTariffInfo.w : 0;
                map = zoneTariffInfo == null ? zoneTariffInfo.y : null;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                Map map2 = map;
                List list13 = zoneTariffInfo == null ? zoneTariffInfo.B : null;
                List list14 = list13 != null ? emptyList : list13;
                List list15 = zoneTariffInfo == null ? zoneTariffInfo.z : null;
                List list16 = list15 != null ? emptyList : list15;
                boolean z18 = zoneTariffInfo == null ? zoneTariffInfo.D : false;
                if (zoneTariffInfo != null || (r0 = zoneTariffInfo.C) == null) {
                    ExtraContactPhonesRules extraContactPhonesRules = ExtraContactPhonesRules.f;
                }
                ExtraContactPhonesRules extraContactPhonesRules2 = extraContactPhonesRules;
                String a9 = requirementAlternatives == null ? requirementAlternatives.getA() : null;
                List b9 = requirementAlternatives == null ? requirementAlternatives.getB() : null;
                List list17 = b9 != null ? emptyList : b9;
                List list18 = serviceLevel.W.a;
                String str33 = str30;
                boolean z19 = serviceLevel.U;
                boolean z20 = z17;
                now nowVar = yal0Var.o;
                zvb zvbVar2 = new zvb(z19, nowVar == null ? nowVar.getB() : null);
                auctionInfo = serviceLevel.X;
                if (auctionInfo == null) {
                    AuctionInfo.Companion.getClass();
                    auctionInfo = AuctionInfo.f;
                }
                AuctionInfo auctionInfo2 = auctionInfo;
                scheduledOrderViewDto = serviceLevel.Y;
                if (scheduledOrderViewDto != null) {
                    zvbVar = zvbVar2;
                    fom0Var2 = null;
                } else {
                    int i10 = ewq0.a[scheduledOrderViewDto.getA().ordinal()];
                    zvbVar = zvbVar2;
                    if (i10 != i3) {
                        dom0 dom0Var = dom0.a;
                        if (i10 != 2) {
                            if (i10 == 3) {
                                fom0Var = eom0.a;
                            } else {
                                if (i10 != 4) {
                                    w511.b();
                                    return null;
                                }
                                String b10 = scheduledOrderViewDto.getB();
                                if (b10 != null && b10.length() != 0) {
                                    fom0Var2 = new bom0(b10);
                                }
                            }
                        }
                        fom0Var2 = dom0Var;
                    } else {
                        fom0Var = com0.a;
                    }
                    fom0Var2 = fom0Var;
                }
                String i11 = ay1Var2 == null ? ay1Var2.i() : null;
                SuggestsPreferences suggestsPreferences = serviceLevel.Z;
                String str34 = suggestsPreferences == null ? suggestsPreferences.a : null;
                AttributedDescription attributedDescription = zoneTariffInfo == null ? zoneTariffInfo.I : null;
                fef g2 = yal0Var.g();
                if (h6k0Var != null) {
                    arrayList = b8;
                    h6k0Var2 = h6k0Var;
                    emptyList2 = emptyList;
                } else if (h6k0Var.getE().isEmpty()) {
                    h6k0Var2 = h6k0Var;
                    List b11 = h6k0Var2.getB();
                    ?? arrayList2 = new ArrayList();
                    Iterator it4 = b11.iterator();
                    int i12 = 0;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            scc.m();
                            throw null;
                        }
                        String str35 = (String) next;
                        Iterator it5 = it4;
                        ArrayList arrayList3 = b8;
                        q6k0 a10 = fwq0.a(h6k0Var2, i12, str35, fwq0Var.h.c(g2, str35, true));
                        if (a10 != null) {
                            arrayList2.add(a10);
                        }
                        it4 = it5;
                        b8 = arrayList3;
                        i12 = i13;
                    }
                    arrayList = b8;
                    emptyList2 = arrayList2;
                } else {
                    List e2 = h6k0Var.getE();
                    ?? arrayList4 = new ArrayList();
                    int i14 = 0;
                    for (Object obj4 : e2) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            scc.m();
                            throw null;
                        }
                        h6k0.a aVar3 = (h6k0.a) obj4;
                        h6k0 h6k0Var4 = h6k0Var;
                        q6k0 a11 = fwq0.a(h6k0Var4, i14, aVar3.getA(), aVar3.getB());
                        if (a11 != null) {
                            arrayList4.add(a11);
                        }
                        i14 = i15;
                        h6k0Var = h6k0Var4;
                    }
                    emptyList2 = arrayList4;
                    arrayList = b8;
                    h6k0Var2 = h6k0Var;
                }
                return new pex0(tariffSource, str31, arrayList, list6, list7, list8, is60Var, yboVar, str5, str29, str6, str2, c2, i2, str33, str25, str26, oox0Var, z16, z20, z6, z7, z8, Boolean.valueOf(z12), str4, z14, r36, z15, z9, str18, str19, suffixSpanType, str20, d2Var, ofa0Var, str23, f, hashSet, i9, selector, b7, c4, z13, str27, list12, priceMeta, null, null, extraContactPhonesRules2, z18, atiVar, qjcVar, a6, list2, paidOptions, comboOrder, z5, str16, tariffCard3, couponCheckResult2, searchScreen, queueOnSearchDisplayInfo, brandingType, str32, i8, map2, list14, emptyList4, list16, aVar2, tariffOrderFlow, summaryStyle2, f5Var2, tariffCard, a9, list17, list18, zvbVar, auctionInfo2, fom0Var2, i11, str34, attributedDescription, emptyList2, h6k0Var2 == null ? h6k0Var2.getC() : 0, 0, 2408448, 0);
            }
        }
        list2 = M;
        SearchScreen searchScreen2 = serviceLevel.t;
        ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo2 = serviceLevel.u;
        String str252 = serviceLevel.v;
        String str262 = serviceLevel.w;
        list3 = serviceLevel.x;
        if (list3 == null) {
        }
        boolean z122 = z10;
        if (r4 != 0) {
        }
        couponCheckResult = serviceLevel.z;
        if (couponCheckResult == null) {
        }
        CouponCheckResult couponCheckResult22 = couponCheckResult;
        BrandingType brandingType2 = serviceLevel.B;
        Selector selector32 = serviceLevel.G;
        boolean z132 = serviceLevel.H;
        String str272 = serviceLevel.I;
        List list112 = list;
        if (list112 != null) {
        }
        PriceMeta priceMeta2 = serviceLevel.h;
        DriveExtra driveExtra2 = serviceLevel.L;
        if (driveExtra2 == null) {
        }
        if (comboExtra == null) {
        }
        if (comboExtra == null) {
        }
        qjc qjcVar22 = new qjc(z2, routeDisplayType);
        summaryStyle = serviceLevel.P;
        ServiceLevel.TariffCard tariffCard22 = serviceLevel.R;
        if (zoneTariffInfo == null) {
        }
        if (ay1Var2 == null) {
        }
        if (n7vVar == null) {
        }
        if (zoneTariffInfo != null) {
        }
        f5Var = serviceLevel.Q;
        String str292 = a7;
        if (f5Var == e5.INSTANCE) {
        }
        if (f5Var != null) {
        }
        if (f5Var == null) {
        }
        f5 f5Var22 = f5Var;
        if (((c != null || (v580Var = c.b) == null) ? null : v580Var.b.a()) == null) {
        }
        rideTime = serviceLevel.k;
        list4 = list;
        if (list4 != null) {
        }
        list = emptyList3;
        it = list.iterator();
        while (true) {
            if (it.hasNext()) {
            }
            rideTime = rideTime2;
            summaryStyle = summaryStyle2;
        }
        branding = (ServiceLevel.Branding) obj;
        if (branding == null) {
        }
        if (ay1Var2 == null) {
        }
        if (ay1Var2 == null) {
        }
        if (ay1Var2 == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        pmw0 pmw0Var2 = fwq0Var.g;
        if (zoneTariffInfo == null) {
        }
        if (list5 == null) {
        }
        pmw0Var2.getClass();
        String str312 = str3;
        ArrayList b82 = pmw0.b(str312, list5);
        if (zoneTariffInfo == null) {
        }
        if (list6 == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (list7 == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (list8 == null) {
        }
        oox0 oox0Var2 = b;
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo != null) {
        }
        int i82 = i5 - 1;
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (map == null) {
        }
        Map map22 = map;
        if (zoneTariffInfo == null) {
        }
        if (list13 != null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (list15 != null) {
        }
        if (zoneTariffInfo == null) {
        }
        if (zoneTariffInfo != null) {
        }
        ExtraContactPhonesRules extraContactPhonesRules3 = ExtraContactPhonesRules.f;
        ExtraContactPhonesRules extraContactPhonesRules22 = extraContactPhonesRules3;
        if (requirementAlternatives == null) {
        }
        if (requirementAlternatives == null) {
        }
        if (b9 != null) {
        }
        List list182 = serviceLevel.W.a;
        String str332 = str30;
        boolean z192 = serviceLevel.U;
        boolean z202 = z17;
        now nowVar2 = yal0Var.o;
        zvb zvbVar22 = new zvb(z192, nowVar2 == null ? nowVar2.getB() : null);
        auctionInfo = serviceLevel.X;
        if (auctionInfo == null) {
        }
        AuctionInfo auctionInfo22 = auctionInfo;
        scheduledOrderViewDto = serviceLevel.Y;
        if (scheduledOrderViewDto != null) {
        }
        if (ay1Var2 == null) {
        }
        SuggestsPreferences suggestsPreferences2 = serviceLevel.Z;
        if (suggestsPreferences2 == null) {
        }
        if (zoneTariffInfo == null) {
        }
        fef g22 = yal0Var.g();
        if (h6k0Var != null) {
        }
        return new pex0(tariffSource, str312, arrayList, list6, list7, list8, is60Var, yboVar, str5, str292, str6, str2, c2, i2, str332, str252, str262, oox0Var2, z16, z202, z6, z7, z8, Boolean.valueOf(z122), str4, z14, r36, z15, z9, str18, str19, suffixSpanType, str20, d2Var, ofa0Var, str23, f, hashSet, i9, selector, b7, c4, z132, str272, list12, priceMeta2, null, null, extraContactPhonesRules22, z18, atiVar, qjcVar, a6, list2, paidOptions, comboOrder, z5, str16, tariffCard3, couponCheckResult22, searchScreen2, queueOnSearchDisplayInfo2, brandingType2, str32, i82, map22, list14, emptyList4, list16, aVar2, tariffOrderFlow, summaryStyle2, f5Var22, tariffCard, a9, list17, list182, zvbVar, auctionInfo22, fom0Var2, i11, str34, attributedDescription, emptyList2, h6k0Var2 == null ? h6k0Var2.getC() : 0, 0, 2408448, 0);
    }
}
