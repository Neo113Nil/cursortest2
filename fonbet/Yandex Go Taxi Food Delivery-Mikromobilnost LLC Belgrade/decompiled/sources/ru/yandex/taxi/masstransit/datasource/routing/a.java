package ru.yandex.taxi.masstransit.datasource.routing;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.format.DateFormat;
import com.yandex.go.address.models.Address;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.geometry.Geo;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Segment;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.BoardingOptions;
import com.yandex.mapkit.transport.masstransit.ConstructionSegment;
import com.yandex.mapkit.transport.masstransit.EssentialStop;
import com.yandex.mapkit.transport.masstransit.Fitness;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteStop;
import com.yandex.mapkit.transport.masstransit.RouteStopMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.SectionMetadata;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.Taxi;
import com.yandex.mapkit.transport.masstransit.Thread;
import com.yandex.mapkit.transport.masstransit.Transfer;
import com.yandex.mapkit.transport.masstransit.TransferStop;
import com.yandex.mapkit.transport.masstransit.Transport;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportThreadAlert;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.aqb1;
import defpackage.avj0;
import defpackage.b3v0;
import defpackage.bdc;
import defpackage.bs30;
import defpackage.c3v0;
import defpackage.cdc;
import defpackage.cwa1;
import defpackage.dj40;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.f5q0;
import defpackage.ft20;
import defpackage.gdc;
import defpackage.gv30;
import defpackage.h73;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.ij40;
import defpackage.j73;
import defpackage.jm30;
import defpackage.jst;
import defpackage.kdc;
import defpackage.kiy;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.l540;
import defpackage.l911;
import defpackage.lj40;
import defpackage.m810;
import defpackage.nk31;
import defpackage.npb1;
import defpackage.o430;
import defpackage.oc30;
import defpackage.ole0;
import defpackage.oov0;
import defpackage.p911;
import defpackage.pc30;
import defpackage.pd01;
import defpackage.q2h0;
import defpackage.q5z;
import defpackage.qc30;
import defpackage.r440;
import defpackage.s5r;
import defpackage.s6b1;
import defpackage.scc;
import defpackage.su30;
import defpackage.t7s;
import defpackage.tbo;
import defpackage.tcc;
import defpackage.tog0;
import defpackage.u311;
import defpackage.ubo;
import defpackage.vi30;
import defpackage.vng;
import defpackage.w1u;
import defpackage.w211;
import defpackage.xjf;
import defpackage.xng0;
import defpackage.xob1;
import defpackage.yi40;
import defpackage.zi40;
import defpackage.zpb1;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.masstransit.model.BoardingWagon;
import ru.yandex.taxi.masstransit.model.EssentialPoint$Type;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class a {
    public final zuj0 a;
    public final ole0 b;
    public boolean c;
    public long d;

    public a(zuj0 zuj0Var, ole0 ole0Var) {
        this.a = zuj0Var;
        this.b = ole0Var;
    }

    public static kdc a(ru.yandex.taxi.masstransit.experiment.f fVar, MtTransportType mtTransportType) {
        u311 u311Var;
        if (fVar != null && (u311Var = (u311) fVar.e.get(mtTransportType)) != null) {
            return u311Var.a;
        }
        return xob1.a(mtTransportType);
    }

    public static double e(Section section) {
        return section.getMetadata().getWeight().getTime().getValue();
    }

    public static MtTransportType f(Section section) {
        Transport transport;
        Line line;
        List<Transport> transports = section.getMetadata().getData().getTransports();
        if (transports == null || (transport = (Transport) kotlin.collections.a.R(transports)) == null || (line = transport.getLine()) == null) {
            return null;
        }
        return zpb1.a(line.getVehicleTypes()).b;
    }

    public static boolean h(Section section) {
        TransferStop transferStop;
        RouteStop routeStop;
        RouteStopMetadata metadata;
        Stop stop;
        String name;
        Transfer transfer = section.getMetadata().getData().getTransfer();
        return (transfer == null || (transferStop = transfer.getTransferStop()) == null || (routeStop = transferStop.getRouteStop()) == null || (metadata = routeStop.getMetadata()) == null || (stop = metadata.getStop()) == null || (name = stop.getName()) == null || !(evu0.J(name) ^ true)) ? false : true;
    }

    public static boolean i(hz30 hz30Var) {
        if ((!(hz30Var instanceof yi40) || ((yi40) hz30Var).a == null) && !(hz30Var instanceof bs30)) {
            return (hz30Var instanceof zi40) && ((zi40) hz30Var).a != null;
        }
        return true;
    }

    public static yi40 k(Section section, int i) {
        f5q0 f5q0Var = new f5q0(section.getMetadata().getWeight().getWalkingDistance().getText(), section.getMetadata().getWeight().getTime().getText());
        if (section.getMetadata().getWeight().getWalkingDistance().getValue() <= 0.0d) {
            f5q0Var = null;
        }
        return new yi40(f5q0Var, section.getGeometry(), e(section), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r4 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(List list, List list2, Polyline polyline, Section section) {
        Point position;
        l911 l911Var;
        Point position2;
        SectionMetadata metadata;
        SectionMetadata.SectionData data;
        Fitness fitness;
        Polyline subpolyline;
        List<Point> points;
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            RouteStop routeStop = (RouteStop) obj;
            Subpolyline subpolyline2 = (Subpolyline) kotlin.collections.a.S(i - 1, list2);
            if (subpolyline2 == null || (subpolyline = SubpolylineHelper.subpolyline(polyline, subpolyline2)) == null || (points = subpolyline.getPoints()) == null || (position = (Point) kotlin.collections.a.b0(points)) == null) {
                position = routeStop.getPosition();
            }
            Point point = position;
            Stop stopExit = routeStop.getMetadata().getStopExit();
            if (stopExit != null) {
                List<ConstructionSegment> constructions = (section == null || (metadata = section.getMetadata()) == null || (data = metadata.getData()) == null || (fitness = data.getFitness()) == null) ? null : fitness.getConstructions();
                if (constructions != null) {
                    Iterator<T> it = constructions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ConstructionSegment) next).getConstructionMask().getTransition()) {
                            obj2 = next;
                            break;
                        }
                    }
                    ConstructionSegment constructionSegment = (ConstructionSegment) obj2;
                    if (constructionSegment != null) {
                        int segmentIndex = section.getGeometry().getBegin().getSegmentIndex();
                        PolylinePosition end = constructionSegment.getSubpolyline().getEnd();
                        position2 = Geo.pointOnSegmentByFactor(new Segment(polyline.getPoints().get(end.getSegmentIndex() + segmentIndex), polyline.getPoints().get(end.getSegmentIndex() + segmentIndex + 1)), end.getSegmentPosition());
                    }
                }
                position2 = routeStop.getPosition();
                l911Var = new l911(stopExit.getId(), stopExit.getName(), position2);
            } else {
                l911Var = null;
            }
            arrayList.add(new hj40(routeStop.getMetadata().getStop().getName(), routeStop.getMetadata().getStop().getAdditionalName(), routeStop.getMetadata().getStop().getId(), point, l911Var));
            i = i2;
        }
        return arrayList;
    }

    public final String b(Section section) {
        String str;
        Time arrivalTime;
        TravelEstimation estimation = section.getMetadata().getEstimation();
        if (estimation == null || (arrivalTime = estimation.getArrivalTime()) == null) {
            str = null;
        } else {
            str = n(this.c ? this.d : 0L, arrivalTime);
        }
        return str == null ? "" : str;
    }

    public final String c(Section section) {
        String str;
        Time departureTime;
        TravelEstimation estimation = section.getMetadata().getEstimation();
        if (estimation == null || (departureTime = estimation.getDepartureTime()) == null) {
            str = null;
        } else {
            str = n(this.c ? this.d : 0L, departureTime);
        }
        return str == null ? "" : str;
    }

    public final long d(Section section) {
        Time departureTime;
        TravelEstimation estimation = section.getMetadata().getEstimation();
        return (this.c ? this.d : 0L) + ((estimation == null || (departureTime = estimation.getDepartureTime()) == null) ? System.currentTimeMillis() : departureTime.getValue() * 1000);
    }

    public final CustomImageSpan g() {
        Drawable t = vng.t(q2h0.ic_walk_16, ((avj0) this.a).a);
        if (t == null) {
            return null;
        }
        return new CustomImageSpan(t, 2, false, true, new xjf(String.valueOf(q2h0.ic_walk_16)), 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x04df, code lost:
    
        if (r6 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x07cb, code lost:
    
        if (r5 == true) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0963, code lost:
    
        if (r5 == null) goto L392;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0a0d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final su30 j(Route route, List list, ru.yandex.taxi.masstransit.experiment.f fVar, pd01 pd01Var, long j) {
        vi30 vi30Var;
        Time arrivalTime;
        Time departureTime;
        int i;
        Iterator it;
        List list2;
        Transport transport;
        Transport transport2;
        Line line;
        Transport.TransportThread transportThread;
        List list3;
        Set set;
        MtTransportSystemId mtTransportSystemId;
        hz30 lj40Var;
        List<TransportThreadAlert> alerts;
        Thread thread;
        BoardingOptions boardingOptions;
        Line line2;
        Transport.TransportThread transportThread2;
        List list4;
        BoardingWagon boardingWagon;
        Integer color;
        hz30 k;
        Object obj;
        int i2;
        ArrayList arrayList;
        MtTransportType mtTransportType;
        String mapkitType;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        TransportContour.Style style;
        Integer mainColor;
        Stop stop;
        Stop stop2;
        ArrayList arrayList2;
        MtTransportType mtTransportType2;
        String mapkitType2;
        Object obj4;
        oov0 oov0Var;
        Iterator it2;
        boolean z3;
        Stop stop3;
        Line line3;
        TransferStop transferStop;
        RouteStop routeStop;
        hj40 hj40Var;
        MtTransportSystemId mtTransportSystemId2;
        Integer color2;
        TransferStop transferStop2;
        List<Transport> transports;
        int legIndex;
        char c;
        nk31 nk31Var;
        zzs B;
        ru.yandex.taxi.masstransit.experiment.f fVar2 = fVar;
        pd01 pd01Var2 = pd01Var;
        Address address = (Address) kotlin.collections.a.R(list);
        String str = null;
        if (address != null) {
            List J = kotlin.collections.a.J(list, 1);
            if (J.isEmpty()) {
                J = null;
            }
            if (J != null) {
                this.c = false;
                this.d = j;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Iterator it3 = route.getSections().iterator();
                List list5 = EmptyList.a;
                int i3 = 0;
                int i4 = 0;
                List list6 = list5;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    Section section = (Section) next;
                    Polyline geometry = route.getGeometry();
                    Address address2 = address;
                    Section section2 = (Section) kotlin.collections.a.S(i3 - 1, route.getSections());
                    Section section3 = (Section) kotlin.collections.a.S(i5, route.getSections());
                    MtRouteMapper$mapMtRoute$sections$1$convertedSection$1 mtRouteMapper$mapMtRoute$sections$1$convertedSection$1 = new MtRouteMapper$mapMtRoute$sections$1$convertedSection$1(ref$IntRef);
                    if (section.getMetadata().getData().getTaxi() != null) {
                        int intValue = ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue();
                        i = i5;
                        ArrayList m = m(section.getStops(), section.getRideLegs(), geometry, section3);
                        boolean isEmpty = m.isEmpty();
                        List list7 = m;
                        if (isEmpty) {
                            Point point = (Point) kotlin.collections.a.b0(SubpolylineHelper.subpolyline(geometry, section.getGeometry()).getPoints());
                            list7 = point != null ? Collections.singletonList(new hj40("", "", "taxi_last_stop", point, null)) : list5;
                        }
                        List list8 = list7;
                        String c2 = c(section);
                        long d = d(section);
                        this.c = true;
                        String b = b(section);
                        Subpolyline geometry2 = section.getGeometry();
                        double e = e(section);
                        Taxi taxi = section.getMetadata().getData().getTaxi();
                        k = new l540(taxi != null ? taxi.getJamSegments() : null, MtTransportType.UNKNOWN, geometry2, e, intValue, c2, b, list8, d, new bdc(xng0.controlMain), null);
                    } else {
                        i = i5;
                        if (section.getMetadata().getData().getFitness() != null) {
                            int intValue2 = ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue();
                            double value = section.getMetadata().getWeight().getTime().getValue();
                            int value2 = (int) section.getMetadata().getWeight().getWalkingDistance().getValue();
                            it = it3;
                            list2 = list5;
                            list3 = list6;
                            k = new bs30((value == 0.0d && value2 == 0) ? null : new f5q0(I18nManagerFactory.getI18nManagerInstance().localizeDistance(value2), section.getMetadata().getWeight().getTime().getText()), value2, section.getGeometry(), e(section), intValue2);
                        } else if (section.getMetadata().getData().getTransfer() != null && !h(section)) {
                            k = k(section, ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue());
                        } else if (h(section)) {
                            Transfer transfer = section.getMetadata().getData().getTransfer();
                            Transport transport3 = (transfer == null || (transferStop2 = transfer.getTransferStop()) == null || (transports = transferStop2.getTransports()) == null) ? null : (Transport) kotlin.collections.a.R(transports);
                            if (transport3 == null || (line3 = transport3.getLine()) == null) {
                                it = it3;
                            } else {
                                it = it3;
                                f5q0 f5q0Var = section.getMetadata().getWeight().getTime().getValue() > 0.0d ? new f5q0(section.getMetadata().getWeight().getWalkingDistance().getText(), section.getMetadata().getWeight().getTime().getText()) : null;
                                Transfer transfer2 = section.getMetadata().getData().getTransfer();
                                if (transfer2 != null && (transferStop = transfer2.getTransferStop()) != null && (routeStop = transferStop.getRouteStop()) != null && (hj40Var = (hj40) kotlin.collections.a.R(m(Collections.singletonList(routeStop), section.getRideLegs(), geometry, section3))) != null) {
                                    Line.Style style2 = line3.getStyle();
                                    cdc f = (style2 == null || (color2 = style2.getColor()) == null) ? null : s6b1.f(color2.intValue());
                                    String name = line3.getName();
                                    String shortName = line3.getShortName();
                                    String transportSystemId = line3.getTransportSystemId();
                                    if (transportSystemId == null || (mtTransportSystemId2 = (MtTransportSystemId) p911.a.get(transportSystemId)) == null) {
                                        mtTransportSystemId2 = MtTransportSystemId.UNKNOWN;
                                    }
                                    lj40Var = new zi40(f5q0Var, f, name, shortName, mtTransportSystemId2, hj40Var, c(section), zpb1.a(line3.getVehicleTypes()).b, section.getGeometry(), e(section), ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue());
                                    list2 = list5;
                                    list3 = list6;
                                    k = lj40Var;
                                }
                            }
                            list2 = list5;
                            list3 = list6;
                            k = null;
                        } else {
                            it = it3;
                            MtTransportType f2 = f(section);
                            if (f2 == null || f2 == MtTransportType.UNDERGROUND || aqb1.c(f2) || f2 == MtTransportType.RAILWAY || f2 == MtTransportType.AEROEXPRESS) {
                                list2 = list5;
                                List<Transport> transports2 = section.getMetadata().getData().getTransports();
                                if (transports2 != null && !transports2.isEmpty()) {
                                    dj40 a = zpb1.a(((Transport) kotlin.collections.a.P(transports2)).getLine().getVehicleTypes());
                                    MtTransportType mtTransportType3 = MtTransportType.UNDERGROUND;
                                    if (a.a.contains(mtTransportType3)) {
                                        List<Transport> transports3 = section.getMetadata().getData().getTransports();
                                        if (transports3 != null && (transport = (Transport) kotlin.collections.a.R(transports3)) != null) {
                                            Line line4 = transport.getLine();
                                            Transport.TransportThread transportThread3 = (Transport.TransportThread) kotlin.collections.a.R(transport.getTransports());
                                            Line.Style style3 = line4.getStyle();
                                            kdc f3 = (style3 == null || (color = style3.getColor()) == null) ? null : s6b1.f(color.intValue());
                                            if (f3 == null) {
                                                f3 = a(fVar2, mtTransportType3);
                                            }
                                            kdc kdcVar = f3;
                                            if (transportThread3 == null || (boardingOptions = transportThread3.getBoardingOptions()) == null) {
                                                transport2 = transport;
                                                line = line4;
                                                transportThread = transportThread3;
                                                list3 = list6;
                                                set = null;
                                            } else {
                                                List<BoardingOptions.BoardingArea> area = boardingOptions.getArea();
                                                transport2 = transport;
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it4 = area.iterator();
                                                while (it4.hasNext()) {
                                                    Iterator it5 = it4;
                                                    String id = ((BoardingOptions.BoardingArea) it4.next()).getId();
                                                    if (id != null) {
                                                        BoardingWagon.Companion.getClass();
                                                        switch (id.hashCode()) {
                                                            case -2061210083:
                                                                line2 = line4;
                                                                if (id.equals("train_car:head")) {
                                                                    transportThread2 = transportThread3;
                                                                    list4 = list6;
                                                                    boardingWagon = BoardingWagon.HEAD;
                                                                    break;
                                                                }
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                            case -2060856179:
                                                                line2 = line4;
                                                                if (id.equals("train_car:tail")) {
                                                                    boardingWagon = BoardingWagon.TAIL;
                                                                    transportThread2 = transportThread3;
                                                                    list4 = list6;
                                                                    break;
                                                                }
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                            case -696033646:
                                                                line2 = line4;
                                                                if (id.equals("train_car:middle")) {
                                                                    boardingWagon = BoardingWagon.MIDDLE;
                                                                    transportThread2 = transportThread3;
                                                                    list4 = list6;
                                                                    break;
                                                                }
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                            case 695628653:
                                                                line2 = line4;
                                                                if (id.equals("train_car:middle_head")) {
                                                                    boardingWagon = BoardingWagon.NEAR_THE_HEAD;
                                                                    transportThread2 = transportThread3;
                                                                    list4 = list6;
                                                                    break;
                                                                }
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                            case 695982557:
                                                                line2 = line4;
                                                                if (id.equals("train_car:middle_tail")) {
                                                                    boardingWagon = BoardingWagon.NEAR_THE_TAIL;
                                                                    transportThread2 = transportThread3;
                                                                    list4 = list6;
                                                                    break;
                                                                }
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                            default:
                                                                line2 = line4;
                                                                transportThread2 = transportThread3;
                                                                list4 = list6;
                                                                jst.e.c("Unknown value " + id + " in BoardingWagon");
                                                                break;
                                                        }
                                                        if (boardingWagon == null) {
                                                            arrayList3.add(boardingWagon);
                                                        }
                                                        line4 = line2;
                                                        it4 = it5;
                                                        transportThread3 = transportThread2;
                                                        list6 = list4;
                                                    } else {
                                                        line2 = line4;
                                                        transportThread2 = transportThread3;
                                                        list4 = list6;
                                                    }
                                                    boardingWagon = null;
                                                    if (boardingWagon == null) {
                                                    }
                                                    line4 = line2;
                                                    it4 = it5;
                                                    transportThread3 = transportThread2;
                                                    list6 = list4;
                                                }
                                                line = line4;
                                                transportThread = transportThread3;
                                                list3 = list6;
                                                set = kotlin.collections.a.N0(arrayList3);
                                            }
                                            String transportSystemId2 = line.getTransportSystemId();
                                            if (transportSystemId2 == null || (mtTransportSystemId = (MtTransportSystemId) p911.a.get(transportSystemId2)) == null) {
                                                mtTransportSystemId = MtTransportSystemId.UNKNOWN;
                                            }
                                            MtTransportSystemId mtTransportSystemId3 = mtTransportSystemId;
                                            MtTransportType mtTransportType4 = zpb1.a(line.getVehicleTypes()).b;
                                            String shortName2 = line.getShortName();
                                            String name2 = line.getName();
                                            String c3 = c(section);
                                            long d2 = d(section);
                                            String b2 = b(section);
                                            ArrayList m2 = m(section.getStops(), section.getRideLegs(), geometry, section3);
                                            Subpolyline geometry3 = section.getGeometry();
                                            double e2 = e(section);
                                            String id2 = line.getId();
                                            Transport.TransportThread transportThread4 = (Transport.TransportThread) kotlin.collections.a.R(transport2.getTransports());
                                            String id3 = (transportThread4 == null || (thread = transportThread4.getThread()) == null) ? null : thread.getId();
                                            if (id3 == null) {
                                                id3 = "";
                                            }
                                            w211 w211Var = new w211(id2, id3);
                                            List l = (transportThread == null || (alerts = transportThread.getAlerts()) == null) ? null : l(alerts);
                                            lj40Var = new lj40(set, mtTransportSystemId3, shortName2, name2, w211Var, l == null ? list2 : l, mtTransportType4, kdcVar, c3, d2, b2, m2, geometry3, e2, ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue(), line.getId());
                                            k = lj40Var;
                                        }
                                    }
                                }
                                list3 = list6;
                                MtTransportType f4 = f(section);
                                if (f4 != null && (aqb1.c(f4) || f4 == MtTransportType.RAILWAY || f4 == MtTransportType.AEROEXPRESS)) {
                                    oov0 oov0Var2 = pd01Var2.b;
                                    List list9 = oov0Var2 != null ? oov0Var2.d : null;
                                    List<Transport> transports4 = section.getMetadata().getData().getTransports();
                                    if (transports4 != null) {
                                        List<Transport> list10 = transports4;
                                        ArrayList arrayList4 = new ArrayList(tcc.n(list10, 10));
                                        for (Transport transport4 : list10) {
                                            Iterator<T> it6 = transport4.getTransports().iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    obj2 = it6.next();
                                                    if (((Transport.TransportThread) obj2).getIsRecommended()) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            Transport.TransportThread transportThread5 = (Transport.TransportThread) obj2;
                                            if (transportThread5 == null) {
                                                transportThread5 = (Transport.TransportThread) kotlin.collections.a.P(transport4.getTransports());
                                            }
                                            Iterator<T> it7 = transport4.getTransportContours().iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    obj3 = it7.next();
                                                    if (((TransportContour) obj3).getName().length() > 0) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            TransportContour transportContour = (TransportContour) obj3;
                                            EssentialStop essentialStop = (EssentialStop) kotlin.collections.a.R(transportThread5.getThread().getEssentialStops());
                                            String id4 = (essentialStop == null || (stop2 = essentialStop.getStop()) == null) ? null : stop2.getId();
                                            EssentialStop essentialStop2 = (EssentialStop) kotlin.collections.a.b0(transportThread5.getThread().getEssentialStops());
                                            String id5 = (essentialStop2 == null || (stop = essentialStop2.getStop()) == null) ? null : stop.getId();
                                            List list11 = list9;
                                            if (list9 != null) {
                                                boolean G = kotlin.collections.a.G(list11, id4);
                                                z = true;
                                            } else {
                                                z = true;
                                            }
                                            if ((list11 == null || kotlin.collections.a.G(list11, id5) != z) && f(section) != MtTransportType.AEROEXPRESS) {
                                                z2 = false;
                                                MtTransportType mtTransportType5 = !z2 ? MtTransportType.AEROEXPRESS : zpb1.a(transport4.getLine().getVehicleTypes()).b;
                                                kdc gdcVar = !z2 ? new gdc(tog0.mt_aeroexpress_color) : (transportContour == null || (style = transportContour.getStyle()) == null || (mainColor = style.getMainColor()) == null) ? a(fVar2, mtTransportType5) : s6b1.f(mainColor.intValue());
                                                String name3 = transport4.getLine().getName();
                                                Stop alternateDepartureStop = transportThread5.getAlternateDepartureStop();
                                                arrayList4.add(new c3v0(new b3v0(name3, mtTransportType5, alternateDepartureStop == null ? alternateDepartureStop.getId() : null, new w211(transport4.getLine().getId(), transportThread5.getThread().getId()), z2, l(transportThread5.getAlerts()), transportContour, gdcVar, transport4.getLine().getId()), transportThread5.getIsRecommended()));
                                                fVar2 = fVar;
                                                list9 = list11;
                                            }
                                            z2 = true;
                                            if (!z2) {
                                            }
                                            kdc gdcVar2 = !z2 ? new gdc(tog0.mt_aeroexpress_color) : (transportContour == null || (style = transportContour.getStyle()) == null || (mainColor = style.getMainColor()) == null) ? a(fVar2, mtTransportType5) : s6b1.f(mainColor.intValue());
                                            String name32 = transport4.getLine().getName();
                                            Stop alternateDepartureStop2 = transportThread5.getAlternateDepartureStop();
                                            arrayList4.add(new c3v0(new b3v0(name32, mtTransportType5, alternateDepartureStop2 == null ? alternateDepartureStop2.getId() : null, new w211(transport4.getLine().getId(), transportThread5.getThread().getId()), z2, l(transportThread5.getAlerts()), transportContour, gdcVar2, transport4.getLine().getId()), transportThread5.getIsRecommended()));
                                            fVar2 = fVar;
                                            list9 = list11;
                                        }
                                        ArrayList arrayList5 = !arrayList4.isEmpty() ? arrayList4 : null;
                                        if (arrayList5 != null) {
                                            Iterator it8 = arrayList5.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    obj = it8.next();
                                                    if (((c3v0) obj).b) {
                                                    }
                                                } else {
                                                    obj = null;
                                                }
                                            }
                                            c3v0 c3v0Var = (c3v0) obj;
                                            if (c3v0Var == null) {
                                                c3v0Var = (c3v0) kotlin.collections.a.P(arrayList5);
                                            }
                                            Iterator it9 = arrayList5.iterator();
                                            int i6 = 0;
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    i2 = -1;
                                                } else if (((c3v0) it9.next()).b) {
                                                    i2 = i6;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            Integer valueOf = Integer.valueOf(i2);
                                            if (i2 == -1) {
                                                valueOf = null;
                                            }
                                            int intValue3 = valueOf != null ? valueOf.intValue() : 0;
                                            b3v0 b3v0Var = c3v0Var.a;
                                            kdc gdcVar3 = b3v0Var.e ? new gdc(tog0.mt_aeroexpress_color) : b3v0Var.h;
                                            ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                                            Iterator it10 = arrayList5.iterator();
                                            while (it10.hasNext()) {
                                                arrayList6.add(((c3v0) it10.next()).a);
                                            }
                                            if (intValue3 == 0) {
                                                arrayList = arrayList6;
                                            } else {
                                                ArrayList arrayList7 = new ArrayList(arrayList6);
                                                arrayList7.add(0, arrayList7.remove(intValue3));
                                                arrayList = arrayList7;
                                            }
                                            boolean z4 = b3v0Var.e;
                                            String c4 = c(section);
                                            long d3 = d(section);
                                            String b3 = b(section);
                                            ArrayList m3 = m(section.getStops(), section.getRideLegs(), geometry, section3);
                                            Subpolyline geometry4 = section.getGeometry();
                                            double e3 = e(section);
                                            int intValue4 = ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue();
                                            String str2 = b3v0Var.i;
                                            MtTransportType f5 = f(section);
                                            if (f5 != null && (mapkitType = f5.getMapkitType()) != null) {
                                                MtTransportType.Companion.getClass();
                                                mtTransportType = ij40.a(mapkitType);
                                            }
                                            mtTransportType = MtTransportType.UNKNOWN;
                                            lj40Var = new r440(arrayList, z4, mtTransportType, gdcVar3, c4, d3, b3, m3, geometry4, e3, intValue4, str2);
                                            k = lj40Var;
                                        }
                                    }
                                } else if (section2 != null) {
                                    List<Transport> transports5 = section2.getMetadata().getData().getTransports();
                                    if ((!(transports5 == null || transports5.isEmpty())) && section.getMetadata().getData().getWait() != null) {
                                        k = k(section, ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue());
                                    }
                                }
                                k = null;
                            } else {
                                oov0 oov0Var3 = pd01Var2.b;
                                List<Transport> transports6 = section.getMetadata().getData().getTransports();
                                if (transports6 != null) {
                                    List<Transport> list12 = transports6;
                                    list2 = list5;
                                    ArrayList arrayList8 = new ArrayList(tcc.n(list12, 10));
                                    Iterator it11 = list12.iterator();
                                    while (it11.hasNext()) {
                                        Transport transport5 = (Transport) it11.next();
                                        Iterator<T> it12 = transport5.getTransports().iterator();
                                        while (true) {
                                            if (it12.hasNext()) {
                                                obj4 = it12.next();
                                                if (((Transport.TransportThread) obj4).getIsRecommended()) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        Transport.TransportThread transportThread6 = (Transport.TransportThread) obj4;
                                        if (transportThread6 == null) {
                                            transportThread6 = (Transport.TransportThread) kotlin.collections.a.P(transport5.getTransports());
                                        }
                                        dj40 a2 = zpb1.a(transport5.getLine().getVehicleTypes());
                                        if (oov0Var3 != null) {
                                            it2 = it11;
                                            oov0Var = oov0Var3;
                                            if (oov0Var3.c.contains(transport5.getLine().getId())) {
                                                z3 = true;
                                                String name4 = transport5.getLine().getName();
                                                EssentialStop essentialStop3 = (EssentialStop) kotlin.collections.a.b0(transportThread6.getThread().getEssentialStops());
                                                String name5 = (essentialStop3 != null || (stop3 = essentialStop3.getStop()) == null) ? null : stop3.getName();
                                                String str3 = name5 != null ? "" : name5;
                                                Stop alternateDepartureStop3 = transportThread6.getAlternateDepartureStop();
                                                arrayList8.add(new kiy(new w1u(name4, z3, str3, a2, alternateDepartureStop3 == null ? alternateDepartureStop3.getId() : null, new w211(transport5.getLine().getId(), transportThread6.getThread().getId()), l(transportThread6.getAlerts()), a(fVar2, a2.b), transportThread6.getIsRecommended(), transport5.getLine().getId()), transportThread6.getIsRecommended()));
                                                it11 = it2;
                                                oov0Var3 = oov0Var;
                                            }
                                        } else {
                                            oov0Var = oov0Var3;
                                            it2 = it11;
                                        }
                                        z3 = false;
                                        String name42 = transport5.getLine().getName();
                                        EssentialStop essentialStop32 = (EssentialStop) kotlin.collections.a.b0(transportThread6.getThread().getEssentialStops());
                                        if (essentialStop32 != null) {
                                        }
                                        if (name5 != null) {
                                        }
                                        Stop alternateDepartureStop32 = transportThread6.getAlternateDepartureStop();
                                        arrayList8.add(new kiy(new w1u(name42, z3, str3, a2, alternateDepartureStop32 == null ? alternateDepartureStop32.getId() : null, new w211(transport5.getLine().getId(), transportThread6.getThread().getId()), l(transportThread6.getAlerts()), a(fVar2, a2.b), transportThread6.getIsRecommended(), transport5.getLine().getId()), transportThread6.getIsRecommended()));
                                        it11 = it2;
                                        oov0Var3 = oov0Var;
                                    }
                                    if (arrayList8.isEmpty()) {
                                        arrayList8 = null;
                                    }
                                    if (arrayList8 != null) {
                                        Iterator it13 = arrayList8.iterator();
                                        int i7 = 0;
                                        while (true) {
                                            if (!it13.hasNext()) {
                                                i7 = -1;
                                            } else if (!((kiy) it13.next()).b) {
                                                i7++;
                                            }
                                        }
                                        Integer valueOf2 = Integer.valueOf(i7);
                                        if (i7 == -1) {
                                            valueOf2 = null;
                                        }
                                        int intValue5 = valueOf2 != null ? valueOf2.intValue() : 0;
                                        w1u w1uVar = ((kiy) arrayList8.get(intValue5)).a;
                                        kdc gdcVar4 = w1uVar.b ? new gdc(tog0.mt_aeroexpress_color) : a(fVar2, w1uVar.d.b);
                                        ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                                        Iterator it14 = arrayList8.iterator();
                                        while (it14.hasNext()) {
                                            arrayList9.add(((kiy) it14.next()).a);
                                        }
                                        if (intValue5 == 0) {
                                            arrayList2 = arrayList9;
                                        } else {
                                            ArrayList arrayList10 = new ArrayList(arrayList9);
                                            arrayList10.add(0, arrayList10.remove(intValue5));
                                            arrayList2 = arrayList10;
                                        }
                                        boolean z5 = w1uVar.b;
                                        String str4 = w1uVar.a;
                                        String c5 = c(section);
                                        long d4 = d(section);
                                        String b4 = b(section);
                                        ArrayList m4 = m(section.getStops(), section.getRideLegs(), geometry, null);
                                        Subpolyline geometry5 = section.getGeometry();
                                        double e4 = e(section);
                                        int intValue6 = ((Number) mtRouteMapper$mapMtRoute$sections$1$convertedSection$1.invoke()).intValue();
                                        String str5 = w1uVar.j;
                                        MtTransportType f6 = f(section);
                                        if (f6 != null && (mapkitType2 = f6.getMapkitType()) != null) {
                                            MtTransportType.Companion.getClass();
                                            mtTransportType2 = ij40.a(mapkitType2);
                                        }
                                        mtTransportType2 = MtTransportType.UNKNOWN;
                                        lj40Var = new jm30(arrayList2, z5, str4, mtTransportType2, gdcVar4, c5, d4, b4, m4, geometry5, e4, intValue6, str5);
                                        list3 = list6;
                                        k = lj40Var;
                                    }
                                }
                                list2 = list5;
                            }
                            list3 = list6;
                            k = null;
                        }
                        legIndex = section.getMetadata().getLegIndex();
                        if (i4 == legIndex) {
                            Address address3 = (Address) kotlin.collections.a.S(legIndex - 1, J);
                            String F = address3 != null ? q5z.F(address3) : null;
                            String str6 = F == null ? "" : F;
                            Point d5 = (address3 == null || (B = address3.B()) == null) ? cwa1.d(zzs.f) : new Point(B.a, B.b);
                            String c6 = c(section);
                            c = 1;
                            int i8 = ref$IntRef.element + 1;
                            ref$IntRef.element = i8;
                            nk31Var = new nk31(str6, c6, legIndex, d5, i8);
                            i4 = legIndex;
                        } else {
                            c = 1;
                            nk31Var = null;
                        }
                        hz30[] hz30VarArr = new hz30[2];
                        hz30VarArr[0] = nk31Var;
                        hz30VarArr[c] = k;
                        list6 = kotlin.collections.a.m0(j73.A(hz30VarArr), list3);
                        fVar2 = fVar;
                        pd01Var2 = pd01Var;
                        address = address2;
                        list5 = list2;
                        it3 = it;
                        i3 = i;
                        str = null;
                    }
                    it = it3;
                    list2 = list5;
                    list3 = list6;
                    legIndex = section.getMetadata().getLegIndex();
                    if (i4 == legIndex) {
                    }
                    hz30[] hz30VarArr2 = new hz30[2];
                    hz30VarArr2[0] = nk31Var;
                    hz30VarArr2[c] = k;
                    list6 = kotlin.collections.a.m0(j73.A(hz30VarArr2), list3);
                    fVar2 = fVar;
                    pd01Var2 = pd01Var;
                    address = address2;
                    list5 = list2;
                    it3 = it;
                    i3 = i;
                    str = null;
                }
                Address address4 = address;
                String str7 = str;
                List list13 = list6;
                TravelEstimation estimation = route.getMetadata().getEstimation();
                long j2 = 0;
                String n = (estimation == null || (departureTime = estimation.getDepartureTime()) == null) ? str7 : n(0L, departureTime);
                String str8 = n == null ? "" : n;
                String n2 = (estimation == null || (arrivalTime = estimation.getArrivalTime()) == null) ? str7 : n(j, arrivalTime);
                String str9 = n2 == null ? "" : n2;
                tbo tboVar = new tbo(q5z.F(address4), str8, EssentialPoint$Type.SOURCE, address4.B(), address4.getAddress().n);
                Address address5 = (Address) kotlin.collections.a.Z(J);
                tbo tboVar2 = new tbo(q5z.F(address5), str9, EssentialPoint$Type.DESTINATION, address5.B(), null);
                String str10 = str9;
                String routeId = route.getMetadata().getRouteId();
                Polyline geometry6 = route.getGeometry();
                LocalizedValue time = route.getMetadata().getWeight().getTime();
                vi30 vi30Var2 = new vi30(m810.a(time.getValue() / 60.0d), time.getText());
                LocalizedValue time2 = route.getMetadata().getWeight().getTime();
                List list14 = list13;
                s5r s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, list14), new ft20(24, this)));
                while (s5rVar.hasNext()) {
                    j2 += (long) ((hz30) s5rVar.next()).getDuration();
                }
                boolean z6 = list14 instanceof Collection;
                zuj0 zuj0Var = this.a;
                if (!z6 || !list14.isEmpty()) {
                    Iterator it15 = list14.iterator();
                    while (it15.hasNext()) {
                        if (!i((hz30) it15.next())) {
                            int i9 = (int) (j2 / 60);
                            String g = t7s.g(zuj0Var, TimeUnit.SECONDS.toMillis(j2));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append(" ", g(), 33);
                            spannableStringBuilder.append((CharSequence) ((avj0) zuj0Var).i(kyh0.mt_walking_info, g));
                            vi30Var = new vi30(i9, new SpannedString(spannableStringBuilder));
                            return new su30(list13, geometry6, vi30Var2, vi30Var, routeId, new gv30(str8, str10), new ubo(tboVar, tboVar2));
                        }
                    }
                }
                o430 o430Var = e3n.b;
                int o = (int) e3n.o(kp50.T(time2.getValue(), DurationUnit.SECONDS), DurationUnit.MINUTES);
                String text = time2.getText();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(" ", g(), 33);
                spannableStringBuilder2.append((CharSequence) ((avj0) zuj0Var).i(kyh0.mt_walking_info, text));
                vi30Var = new vi30(o, new SpannedString(spannableStringBuilder2));
                return new su30(list13, geometry6, vi30Var2, vi30Var, routeId, new gv30(str8, str10), new ubo(tboVar, tboVar2));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [pc30] */
    /* JADX WARN: Type inference failed for: r2v7, types: [qc30] */
    public final ArrayList l(List list) {
        oc30 oc30Var;
        String n;
        oc30 oc30Var2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransportThreadAlert transportThreadAlert = (TransportThreadAlert) it.next();
            if (transportThreadAlert.getClosed() != null) {
                oc30Var = oc30.a;
            } else {
                TransportThreadAlert.ClosedUntil closedUntil = transportThreadAlert.getClosedUntil();
                if ((closedUntil != null ? closedUntil.getTime() : null) != null) {
                    TransportThreadAlert.ClosedUntil closedUntil2 = transportThreadAlert.getClosedUntil();
                    Time time = closedUntil2 != null ? closedUntil2.getTime() : null;
                    n = time != null ? n(0L, time) : null;
                    oc30Var2 = new pc30(n != null ? n : "", time != null ? time.getValue() : 0L);
                } else {
                    TransportThreadAlert.LastTrip lastTrip = transportThreadAlert.getLastTrip();
                    if ((lastTrip != null ? lastTrip.getTime() : null) != null) {
                        TransportThreadAlert.LastTrip lastTrip2 = transportThreadAlert.getLastTrip();
                        Time time2 = lastTrip2 != null ? lastTrip2.getTime() : null;
                        n = time2 != null ? n(0L, time2) : null;
                        oc30Var2 = new qc30(n != null ? n : "", time2 != null ? time2.getValue() : 0L);
                    } else {
                        oc30Var = null;
                    }
                }
                oc30Var = oc30Var2;
            }
            if (oc30Var != null) {
                arrayList.add(oc30Var);
            }
        }
        return arrayList;
    }

    public final String n(long j, Time time) {
        return npb1.e(time, DateFormat.getTimeFormat(this.b.a), j);
    }
}
