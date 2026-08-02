package ru.yandex.taxi.logistics.sdk.management;

import com.yandex.delivery.mapper.model.DisplayTarget;
import com.yandex.delivery.mapper.model.PointType;
import defpackage.aki;
import defpackage.axa0;
import defpackage.be7;
import defpackage.bgi;
import defpackage.bvf0;
import defpackage.cbz0;
import defpackage.ce7;
import defpackage.cgi;
import defpackage.dc8;
import defpackage.dgi;
import defpackage.doe;
import defpackage.fa90;
import defpackage.gfi;
import defpackage.go2;
import defpackage.gp50;
import defpackage.hfi;
import defpackage.ho2;
import defpackage.hxb0;
import defpackage.i3y;
import defpackage.i5v;
import defpackage.ic50;
import defpackage.ike;
import defpackage.io2;
import defpackage.j5v;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l2z;
import defpackage.l7i;
import defpackage.lz40;
import defpackage.m7i;
import defpackage.nr50;
import defpackage.nvd0;
import defpackage.ny61;
import defpackage.or50;
import defpackage.ovd0;
import defpackage.ow;
import defpackage.oxa0;
import defpackage.qr50;
import defpackage.s701;
import defpackage.scc;
import defpackage.sls;
import defpackage.st2;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.v2e0;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.xwa0;
import defpackage.y8n;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesPointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesStateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.BottomSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PaidWaitingInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRoutePointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.DeliveriesRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.Responses$DeliveriesResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesPollingTimer;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class i implements qr50 {
    public final ru.yandex.taxi.logistics.sdk.management.deliveries.h a;
    public final AppVisibilitySubscriptionImpl b;
    public final ce7 c;
    public final v2e0 d;
    public final ike e;
    public final i3y f = kotlin.a.a(new ic50(14));
    public final i3y g = kotlin.a.a(new sls() { // from class: ru.yandex.taxi.logistics.sdk.management.g
        @Override // defpackage.sls
        public final Object invoke() {
            i iVar = i.this;
            return new jqr(kotlinx.coroutines.flow.e.K((lz40) iVar.f.getValue(), ((DeliveriesPollingTimer) iVar.d).b), new NetworkDeliveriesSourceImpl$updatesMergedFlow$2$1(iVar, null), 3);
        }
    });
    public final kotlinx.coroutines.flow.internal.g h;
    public final i3y i;

    public i(ru.yandex.taxi.logistics.sdk.management.deliveries.h hVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, ce7 ce7Var, com.yandex.delivery.utils.auth.impl.a aVar, st2 st2Var, l7i l7iVar, v2e0 v2e0Var) {
        this.a = hVar;
        this.b = appVisibilitySubscriptionImpl;
        this.c = ce7Var;
        this.d = v2e0Var;
        this.e = bvf0.a(st2Var.b);
        this.h = kotlinx.coroutines.flow.e.X(new m0(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.logistics.sdk.f(ru.yandex.taxi.experiments.d.b(((m7i) l7iVar).a))), aVar.h, new NetworkDeliveriesSourceImpl$updateFlow$1(this, null)), new NetworkDeliveriesSourceImpl$special$$inlined$flatMapLatest$1(3, null));
        this.i = kotlin.a.a(new l2z(4, this, st2Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [oxa0] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v11 */
    /* JADX WARN: Type inference failed for: r37v4, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i iVar, ContinuationImpl continuationImpl) {
        NetworkDeliveriesSourceImpl$updateDeliveries$1 networkDeliveriesSourceImpl$updateDeliveries$1;
        int i;
        io2 io2Var;
        Iterator it;
        Object obj;
        EmptyList emptyList;
        String str;
        ?? r18;
        ?? r37;
        vwa0 vwa0Var;
        ?? r11;
        fa90 fa90Var;
        ArrayList arrayList;
        DisplayTarget displayTarget;
        ?? r6;
        EmptyList emptyList2;
        Object obj2;
        ce7 ce7Var = iVar.c;
        if (continuationImpl instanceof NetworkDeliveriesSourceImpl$updateDeliveries$1) {
            networkDeliveriesSourceImpl$updateDeliveries$1 = (NetworkDeliveriesSourceImpl$updateDeliveries$1) continuationImpl;
            int i2 = networkDeliveriesSourceImpl$updateDeliveries$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkDeliveriesSourceImpl$updateDeliveries$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = networkDeliveriesSourceImpl$updateDeliveries$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkDeliveriesSourceImpl$updateDeliveries$1.label;
                Object obj4 = null;
                int i3 = 10;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ru.yandex.taxi.logistics.sdk.management.deliveries.h hVar = iVar.a;
                    Set keySet = ce7Var.b.keySet();
                    ArrayList arrayList2 = new ArrayList(tcc.n(keySet, 10));
                    Iterator it2 = keySet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new DeliveriesRequestDto.DeliveriesDto(((be7) it2.next()).a()));
                    }
                    DeliveriesRequestDto deliveriesRequestDto = new DeliveriesRequestDto(arrayList2);
                    networkDeliveriesSourceImpl$updateDeliveries$1.label = 1;
                    obj3 = hVar.a(deliveriesRequestDto, networkDeliveriesSourceImpl$updateDeliveries$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                io2Var = (io2) obj3;
                v2e0 v2e0Var = iVar.d;
                Long l = io2Var.a().a;
                ((DeliveriesPollingTimer) v2e0Var).a.g(Long.valueOf(l == null ? l.longValue() : 60000L));
                boolean z = false;
                if (io2Var instanceof ho2) {
                    if (!(io2Var instanceof go2)) {
                        w511.b();
                        return null;
                    }
                    jgz.a.h(CoreConstants.PushMessage.SERVICE_TYPE);
                    jgz.a("Deliveries update failure", new Object[0]);
                    return new nr50(((go2) io2Var).a);
                }
                jgz.a.h(CoreConstants.PushMessage.SERVICE_TYPE);
                jgz.a("Deliveries update success", new Object[0]);
                List<Responses$DeliveriesResponseDto.DeliveriesDto> deliveries = ((Responses$DeliveriesResponseDto) ((ho2) io2Var).a).getDeliveries();
                ArrayList arrayList3 = new ArrayList(tcc.n(deliveries, 10));
                Iterator it3 = deliveries.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Responses$DeliveriesResponseDto.DeliveriesDto) it3.next()).getDeliveryId());
                }
                Set N0 = kotlin.collections.a.N0(arrayList3);
                LinkedHashMap linkedHashMap = ce7Var.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (N0.contains(((be7) entry.getKey()).a())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ce7Var.b = new LinkedHashMap(linkedHashMap2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = deliveries.iterator();
                while (it4.hasNext()) {
                    Responses$DeliveriesResponseDto.DeliveriesDto deliveriesDto = (Responses$DeliveriesResponseDto.DeliveriesDto) it4.next();
                    be7 be7Var = new be7(deliveriesDto.getDeliveryId(), deliveriesDto.getEtag());
                    Object obj5 = (hfi) ce7Var.b.get(be7Var);
                    if (obj5 != null) {
                        it = it4;
                        obj2 = obj4;
                    } else {
                        DeliveriesStateDto state = deliveriesDto.getState();
                        if (state != null) {
                            String deliveryId = deliveriesDto.getDeliveryId();
                            Iterator it5 = ce7Var.b.keySet().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj = obj4;
                                    break;
                                }
                                obj = it5.next();
                                if (jl40.l(((be7) obj).a(), deliveryId)) {
                                    break;
                                }
                            }
                            be7 be7Var2 = (be7) obj;
                            if (be7Var2 != null) {
                                ce7Var.b.remove(be7Var2);
                            }
                            bgi bgiVar = ce7Var.a;
                            String deliveryId2 = deliveriesDto.getDeliveryId();
                            int revision = (int) deliveriesDto.getRevision();
                            dgi dgiVar = (dgi) bgiVar;
                            dgiVar.getClass();
                            String originalOrderId = state.getContext().getOriginalOrderId();
                            Boolean isPerformerPositionAvailable = state.getContext().isPerformerPositionAvailable();
                            boolean booleanValue = isPerformerPositionAvailable != null ? isPerformerPositionAvailable.booleanValue() : z;
                            Boolean isCompleted = state.getContext().isCompleted();
                            boolean booleanValue2 = isCompleted != null ? isCompleted.booleanValue() : z;
                            DeliveriesStateDto.ContextDto.PerformerSearchDto performerSearch = state.getContext().getPerformerSearch();
                            EmptyList emptyList3 = EmptyList.a;
                            if (performerSearch != null) {
                                boolean isInProgress = performerSearch.isInProgress();
                                Object obj6 = obj4;
                                s701 s701Var = dgiVar.e;
                                if (isInProgress) {
                                    r6 = Long.valueOf(s701Var.a(deliveryId2));
                                } else {
                                    s701Var.b(deliveryId2);
                                    r6 = obj6;
                                }
                                Long estimate = performerSearch.getEstimate();
                                ?? valueOf = estimate != null ? Long.valueOf(estimate.longValue() * 1000) : obj6;
                                List<DynamicSearchStatusDto> dynamicSearchStatuses = performerSearch.getDynamicSearchStatuses();
                                if (dynamicSearchStatuses != null) {
                                    List<DynamicSearchStatusDto> list = dynamicSearchStatuses;
                                    it = it4;
                                    ?? arrayList5 = new ArrayList(tcc.n(list, i3));
                                    for (DynamicSearchStatusDto dynamicSearchStatusDto : list) {
                                        arrayList5.add(new y8n((int) dynamicSearchStatusDto.getStatusDisplayTime(), dynamicSearchStatusDto.getDynamicSummary(), dynamicSearchStatusDto.getDynamicDescription()));
                                        deliveryId2 = deliveryId2;
                                        emptyList3 = emptyList3;
                                    }
                                    emptyList = emptyList3;
                                    emptyList2 = arrayList5;
                                } else {
                                    it = it4;
                                    emptyList = emptyList3;
                                    emptyList2 = emptyList;
                                }
                                str = deliveryId2;
                                r18 = new oxa0(r6, valueOf, emptyList2);
                                r37 = obj6;
                            } else {
                                it = it4;
                                Object obj7 = obj4;
                                emptyList = emptyList3;
                                str = deliveryId2;
                                r18 = obj7;
                                r37 = obj7;
                            }
                            Boolean autoOpenPostcard = state.getContext().getAutoOpenPostcard();
                            boolean booleanValue3 = autoOpenPostcard != null ? autoOpenPostcard.booleanValue() : false;
                            List<DisplayTargetsItemDto> displayTargets = state.getContext().getDisplayTargets();
                            ArrayList arrayList6 = new ArrayList(tcc.n(displayTargets, 10));
                            Iterator it6 = displayTargets.iterator();
                            while (it6.hasNext()) {
                                int i4 = cgi.a[((DisplayTargetsItemDto) it6.next()).ordinal()];
                                if (i4 == 1) {
                                    displayTarget = DisplayTarget.DELIVERY_DASHBOARD;
                                } else if (i4 == 2) {
                                    displayTarget = DisplayTarget.MULTIORDER;
                                } else {
                                    if (i4 != 3) {
                                        w511.b();
                                        return r37;
                                    }
                                    displayTarget = DisplayTarget.SUMMARY_TRAP;
                                }
                                arrayList6.add(displayTarget);
                            }
                            Boolean shouldTrackGeo = state.getContext().getShouldTrackGeo();
                            gfi gfiVar = new gfi(booleanValue, booleanValue2, r18, booleanValue3, arrayList6, shouldTrackGeo != null ? shouldTrackGeo.booleanValue() : false);
                            String summary = state.getSummary();
                            String description = state.getDescription();
                            j5v j5vVar = dgiVar.f;
                            DeliveryIconStrategyDto iconStrategy = state.getIconStrategy();
                            j5vVar.getClass();
                            i5v a = j5v.a(iconStrategy);
                            PerformerDto performer = state.getPerformer();
                            if (performer != null) {
                                dgiVar.b.getClass();
                                vwa0Var = xwa0.a(performer);
                            } else {
                                vwa0Var = r37;
                            }
                            List<BottomSectionDto> bottomSections = state.getBottomSections();
                            if (bottomSections != null) {
                                List<BottomSectionDto> list2 = bottomSections;
                                gp50 gp50Var = dgiVar.i;
                                r11 = new ArrayList(tcc.n(list2, 10));
                                for (BottomSectionDto bottomSectionDto : list2) {
                                    gp50Var.getClass();
                                    String title = bottomSectionDto.getTitle();
                                    String subtitle = bottomSectionDto.getSubtitle();
                                    String imageTag = bottomSectionDto.getImageTag();
                                    ActionDto action = bottomSectionDto.getAction();
                                    r11.add(new dc8(title, subtitle, imageTag, action != null ? ((ow) gp50Var.b).h(action) : r37));
                                }
                            } else {
                                r11 = emptyList;
                            }
                            Object meta = state.getMeta();
                            Object adsOnMapMeta = state.getContext().getAdsOnMapMeta();
                            List<ActionDto> actions = state.getActions();
                            ow owVar = dgiVar.c;
                            ArrayList arrayList7 = new ArrayList(tcc.n(actions, 10));
                            Iterator it7 = actions.iterator();
                            while (it7.hasNext()) {
                                arrayList7.add(owVar.h((ActionDto) it7.next()));
                            }
                            PaidWaitingInfoDto paidWaitingInfo = state.getPaidWaitingInfo();
                            if (paidWaitingInfo != null) {
                                dgiVar.h.getClass();
                                fa90Var = new fa90(paidWaitingInfo.getFreeWaitingUntil(), paidWaitingInfo.getPaidWaitingTitle(), paidWaitingInfo.getWaitingPrice());
                            } else {
                                fa90Var = r37;
                            }
                            PerformerRouteDto performerRoute = state.getPerformerRoute();
                            if (performerRoute != null) {
                                List<PerformerRoutePointDto> sortedRoutePoints = performerRoute.getSortedRoutePoints();
                                arrayList = new ArrayList(tcc.n(sortedRoutePoints, 10));
                                Iterator it8 = sortedRoutePoints.iterator();
                                while (it8.hasNext()) {
                                    PerformerRoutePointDto performerRoutePointDto = (PerformerRoutePointDto) it8.next();
                                    arrayList.add(new axa0(new doe(performerRoutePointDto.getCoordinates().get(1).doubleValue(), performerRoutePointDto.getCoordinates().get(0).doubleValue())));
                                    revision = revision;
                                    it8 = it8;
                                    fa90Var = fa90Var;
                                    arrayList7 = arrayList7;
                                    originalOrderId = originalOrderId;
                                }
                            } else {
                                arrayList = r37;
                            }
                            fa90 fa90Var2 = fa90Var;
                            ArrayList arrayList8 = arrayList7;
                            int i5 = revision;
                            String str2 = originalOrderId;
                            List<DeliveriesPointDto> sortedRoutePoints2 = state.getSortedRoutePoints();
                            ArrayList arrayList9 = new ArrayList(tcc.n(sortedRoutePoints2, 10));
                            Iterator it9 = sortedRoutePoints2.iterator();
                            int i6 = 0;
                            List list3 = r11;
                            while (it9.hasNext()) {
                                Object next = it9.next();
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    scc.m();
                                    throw r37;
                                }
                                DeliveriesPointDto deliveriesPointDto = (DeliveriesPointDto) next;
                                Set N02 = kotlin.collections.a.N0(state.getActiveRoutePoints());
                                Iterator it10 = it9;
                                ovd0 ovd0Var = dgiVar.d;
                                PointTypeDto type = deliveriesPointDto.getType();
                                ovd0Var.getClass();
                                int i8 = nvd0.a[type.ordinal()];
                                ArrayList arrayList10 = arrayList;
                                PointType pointType = i8 != 1 ? i8 != 2 ? i8 != 3 ? PointType.UNKNOWN : PointType.SOURCE : PointType.RETURN : PointType.DESTINATION;
                                int i9 = i5;
                                DeliveriesStateDto deliveriesStateDto = state;
                                doe doeVar = new doe(deliveriesPointDto.getCoordinates().get(1).doubleValue(), deliveriesPointDto.getCoordinates().get(0).doubleValue());
                                boolean contains = N02.contains(Long.valueOf(i6));
                                dgiVar = dgiVar;
                                hxb0 hxb0Var = dgiVar.g;
                                PointPinDto pin = deliveriesPointDto.getPin();
                                hxb0Var.getClass();
                                arrayList9.add(new aki(pointType, doeVar, contains, hxb0.a(pin)));
                                i6 = i7;
                                it9 = it10;
                                arrayList = arrayList10;
                                i5 = i9;
                                state = deliveriesStateDto;
                                list3 = list3;
                            }
                            ArrayList arrayList11 = arrayList;
                            int i10 = i5;
                            List list4 = list3;
                            TimelineDto timeline = state.getTimeline();
                            hfi hfiVar = new hfi(str, i10, str2, gfiVar, summary, description, a, vwa0Var, list4, arrayList8, fa90Var2, meta, adsOnMapMeta, arrayList9, arrayList11, timeline != null ? cbz0.b(timeline) : r37);
                            ce7Var.b.put(be7Var, hfiVar);
                            obj5 = hfiVar;
                            obj2 = r37;
                        } else {
                            it = it4;
                            Object obj8 = obj4;
                            jgz jgzVar = jgz.a;
                            jgz.a("No DeliveryItem cache and no DeliveryState in json", new Object[0]);
                            obj5 = obj8;
                            obj2 = obj8;
                        }
                    }
                    if (obj5 != null) {
                        arrayList4.add(obj5);
                    }
                    obj4 = obj2;
                    it4 = it;
                    z = false;
                    i3 = 10;
                }
                return new or50(arrayList4);
            }
        }
        networkDeliveriesSourceImpl$updateDeliveries$1 = new NetworkDeliveriesSourceImpl$updateDeliveries$1(iVar, continuationImpl);
        Object obj32 = networkDeliveriesSourceImpl$updateDeliveries$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkDeliveriesSourceImpl$updateDeliveries$1.label;
        Object obj42 = null;
        int i32 = 10;
        if (i != 0) {
        }
        io2Var = (io2) obj32;
        v2e0 v2e0Var2 = iVar.d;
        Long l2 = io2Var.a().a;
        ((DeliveriesPollingTimer) v2e0Var2).a.g(Long.valueOf(l2 == null ? l2.longValue() : 60000L));
        boolean z2 = false;
        if (io2Var instanceof ho2) {
        }
    }

    @Override // defpackage.qr50
    public final Object a(ContinuationImpl continuationImpl) {
        lz40 lz40Var = (lz40) this.f.getValue();
        zy11 zy11Var = zy11.a;
        Object emit = lz40Var.emit(zy11Var, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
    }

    @Override // defpackage.qr50
    public final tpr b() {
        return (tpr) this.i.getValue();
    }
}
