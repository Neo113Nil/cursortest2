package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.b611;
import defpackage.bf30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rw30;
import defpackage.smw0;
import defpackage.w211;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy30;
import defpackage.yw30;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrw30;", "routeState", "Lzy11;", "<anonymous>", "(Lrw30;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteUiStateInteractor$routeUiStateFlow$1", f = "MtDetailedRouteUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteUiStateInteractor$routeUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<Map<String, Map<w211, wy30>>> $previousSchedules;
    final /* synthetic */ Ref$BooleanRef $ticketsEventFired;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteUiStateInteractor$routeUiStateFlow$1(Ref$BooleanRef ref$BooleanRef, o oVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.$ticketsEventFired = ref$BooleanRef;
        this.this$0 = oVar;
        this.$previousSchedules = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteUiStateInteractor$routeUiStateFlow$1 mtDetailedRouteUiStateInteractor$routeUiStateFlow$1 = new MtDetailedRouteUiStateInteractor$routeUiStateFlow$1(this.$ticketsEventFired, this.this$0, this.$previousSchedules, continuation);
        mtDetailedRouteUiStateInteractor$routeUiStateFlow$1.L$0 = obj;
        return mtDetailedRouteUiStateInteractor$routeUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtDetailedRouteUiStateInteractor$routeUiStateFlow$1 mtDetailedRouteUiStateInteractor$routeUiStateFlow$1 = (MtDetailedRouteUiStateInteractor$routeUiStateFlow$1) create((rw30) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtDetailedRouteUiStateInteractor$routeUiStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource2;
        int i2;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType2;
        rw30 rw30Var = (rw30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$ticketsEventFired.element) {
            boolean a = rw30Var.h.a();
            boolean b = rw30Var.h.b();
            if (a || b) {
                o oVar = this.this$0;
                oVar.getClass();
                ArrayList arrayList = new ArrayList();
                if (a) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Aeroexpress.getEventValue());
                }
                if (b) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Suburban.getEventValue());
                }
                yw30 yw30Var = oVar.e;
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = oVar.p;
                int i3 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        transportRouteAnalytics$DetailCardSource2 = TransportRouteAnalytics$DetailCardSource.Hub;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = oVar.q;
                        i2 = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1) {
                                transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Vertical;
                                yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                                this.$ticketsEventFired.element = true;
                            } else if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Horizontal;
                        yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                        this.$ticketsEventFired.element = true;
                    } else if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                }
                transportRouteAnalytics$DetailCardSource2 = TransportRouteAnalytics$DetailCardSource.Transport;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = oVar.q;
                if (mtDetailedRouteAnalyticType2 != null) {
                }
                if (i2 != -1) {
                }
                transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                this.$ticketsEventFired.element = true;
            }
        }
        ?? r10 = rw30Var.b;
        Map<String, Map<w211, wy30>> map = this.$previousSchedules.element;
        if (map != null && !map.equals(r10)) {
            o oVar2 = this.this$0;
            yw30 yw30Var2 = oVar2.e;
            MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource2 = oVar2.p;
            int i4 = mtDetailedRouteAnalyticSource2 == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource2.ordinal()];
            if (i4 != -1) {
                if (i4 == 1) {
                    transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                    MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType3 = oVar2.q;
                    i = mtDetailedRouteAnalyticType3 != null ? -1 : bf30.b[mtDetailedRouteAnalyticType3.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                            b611 b611Var = yw30Var2.a;
                            HashMap o = smw0.o(b611Var);
                            o.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
                            o.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
                            b611Var.a.a("TransportRoute.DetailCard.Loaded", o, 1, new HashMap());
                        } else if (i != 2) {
                            w511.b();
                            return null;
                        }
                    }
                    transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                    b611 b611Var2 = yw30Var2.a;
                    HashMap o2 = smw0.o(b611Var2);
                    o2.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
                    o2.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
                    b611Var2.a.a("TransportRoute.DetailCard.Loaded", o2, 1, new HashMap());
                } else if (i4 != 2) {
                    w511.b();
                    return null;
                }
            }
            transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
            MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType32 = oVar2.q;
            if (mtDetailedRouteAnalyticType32 != null) {
            }
            if (i != -1) {
            }
            transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
            b611 b611Var22 = yw30Var2.a;
            HashMap o22 = smw0.o(b611Var22);
            o22.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
            o22.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
            b611Var22.a.a("TransportRoute.DetailCard.Loaded", o22, 1, new HashMap());
        }
        this.$previousSchedules.element = r10;
        return zy11.a;
    }
}
