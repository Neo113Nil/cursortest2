package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.ab40;
import defpackage.as6;
import defpackage.b611;
import defpackage.db40;
import defpackage.ea40;
import defpackage.eb40;
import defpackage.fa40;
import defpackage.fb40;
import defpackage.gb40;
import defpackage.hd40;
import defpackage.jl40;
import defpackage.kga0;
import defpackage.lga0;
import defpackage.lx4;
import defpackage.mga0;
import defpackage.na1;
import defpackage.nga0;
import defpackage.ny61;
import defpackage.oga0;
import defpackage.pga0;
import defpackage.qga0;
import defpackage.smw0;
import defpackage.sy00;
import defpackage.t130;
import defpackage.tse;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x4e;
import defpackage.ya40;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class f implements vpr {
    public final /* synthetic */ a a;
    public final /* synthetic */ eb40 b;
    public final /* synthetic */ gb40 c;
    public final /* synthetic */ r w;
    public final /* synthetic */ ab40 x;
    public final /* synthetic */ tse y;
    public final /* synthetic */ ea40 z;

    public f(a aVar, eb40 eb40Var, gb40 gb40Var, r rVar, ab40 ab40Var, tse tseVar, ea40 ea40Var) {
        this.a = aVar;
        this.b = eb40Var;
        this.c = gb40Var;
        this.w = rVar;
        this.x = ab40Var;
        this.y = tseVar;
        this.z = ea40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1 mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1;
        int i;
        qga0 qga0Var;
        qga0 qga0Var2;
        qga0 qga0Var3;
        Boolean bool;
        qga0 qga0Var4;
        qga0 qga0Var5;
        r0 r0Var;
        Object value;
        f fVar = this;
        if (continuation instanceof MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1) {
            mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1 = (MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1) continuation;
            int i2 = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1.label = i2 - Integer.MIN_VALUE;
                MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1 mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12 = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1;
                Object obj2 = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qga0 qga0Var6 = (qga0) obj;
                    if (!jl40.l(qga0Var6, oga0.a)) {
                        boolean z = qga0Var6 instanceof pga0;
                        ea40 ea40Var = fVar.z;
                        if (z) {
                            fa40 fa40Var = ea40Var.b.a;
                            TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod = fa40Var.k;
                            if (transportRouteAnalytics$InitiatedPaymentMethod == null || (bool = fa40Var.j) == null) {
                                qga0Var4 = qga0Var6;
                            } else {
                                qga0Var4 = qga0Var6;
                                sy00 sy00Var = ea40Var.c;
                                lx4 lx4Var = sy00Var.a;
                                ((na1) sy00Var.b).getClass();
                                ru.yandex.taxi.analytics.j jVar = (ru.yandex.taxi.analytics.j) lx4Var;
                                jVar.v(as6.J());
                                jVar.v(as6.I());
                                b611 b611Var = ea40Var.a;
                                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
                                String str = fa40Var.a;
                                String str2 = fa40Var.b;
                                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var.c;
                                String str3 = fa40Var.d;
                                TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var.e;
                                int i3 = fa40Var.f;
                                Integer num = fa40Var.g;
                                String str4 = fa40Var.h;
                                String str5 = fa40Var.i;
                                String str6 = fa40Var.n;
                                HashMap o = smw0.o(b611Var);
                                if (str6 != null) {
                                    o.put("request_id", str6);
                                }
                                o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                                o.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod.getEventValue());
                                o.put("sum_ticket_price", str);
                                o.put("selected_date", str2);
                                o.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
                                o.put("tariff_id", str3);
                                o.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
                                o.put("payment_method_available", bool);
                                o.put("adult_ticket_cnt", Integer.valueOf(i3));
                                if (num != null) {
                                    o.put("children_ticket_cnt", num);
                                }
                                b611Var.a.a("TransportRoute.PaymentSuccess.Shown", o, 4, x4e.q(o, "start_stop_id", str4, "final_stop_id", str5));
                            }
                            pga0 pga0Var = (pga0) qga0Var4;
                            String str7 = pga0Var.a;
                            CharSequence charSequence = pga0Var.b;
                            ya40 ya40Var = (ya40) this.x;
                            if (str7 != null) {
                                ya40Var.a.r(new t130(16, str7, charSequence));
                            } else {
                                ya40Var.getClass();
                            }
                            qga0Var = qga0Var4;
                        } else {
                            qga0Var = qga0Var6;
                            if (jl40.l(qga0Var, mga0.a)) {
                                fa40 fa40Var2 = ea40Var.b.a;
                                b611 b611Var2 = ea40Var.a;
                                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin2 = ea40Var.d;
                                String str8 = fa40Var2.a;
                                String str9 = fa40Var2.b;
                                qga0Var2 = qga0Var;
                                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = fa40Var2.c;
                                String str10 = fa40Var2.d;
                                TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = fa40Var2.e;
                                Boolean bool2 = fa40Var2.j;
                                int i4 = fa40Var2.f;
                                String str11 = fa40Var2.m;
                                TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod2 = fa40Var2.k;
                                Integer num2 = fa40Var2.g;
                                HashMap o2 = smw0.o(b611Var2);
                                if (str11 != null) {
                                    o2.put("request_id", str11);
                                }
                                o2.put("origin", transportRouteAnalytics$FlowOrigin2.getEventValue());
                                o2.put("sum_ticket_price", str8);
                                o2.put("selected_date", str9);
                                o2.put("vehicle_type", transportRouteAnalytics$VehicleType2.getEventValue());
                                o2.put("tariff_id", str10);
                                o2.put("trip_type", transportRouteAnalytics$TripType2.getEventValue());
                                if (transportRouteAnalytics$InitiatedPaymentMethod2 != null) {
                                    o2.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod2.getEventValue());
                                }
                                if (bool2 != null) {
                                    o2.put("payment_method_available", bool2);
                                }
                                o2.put("adult_ticket_cnt", Integer.valueOf(i4));
                                if (num2 != null) {
                                    o2.put("children_ticket_cnt", num2);
                                }
                                b611Var2.a.a("TransportRoute.InitiatedPayment.Error", o2, 3, new HashMap());
                            } else if (jl40.l(qga0Var, lga0.a)) {
                                fa40 fa40Var3 = ea40Var.b.a;
                                b611 b611Var3 = ea40Var.a;
                                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin3 = ea40Var.d;
                                String str12 = fa40Var3.a;
                                String str13 = fa40Var3.b;
                                qga0Var2 = qga0Var;
                                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType3 = fa40Var3.c;
                                String str14 = fa40Var3.d;
                                TransportRouteAnalytics$TripType transportRouteAnalytics$TripType3 = fa40Var3.e;
                                Boolean bool3 = fa40Var3.j;
                                int i5 = fa40Var3.f;
                                String str15 = fa40Var3.m;
                                TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod3 = fa40Var3.k;
                                Integer num3 = fa40Var3.g;
                                HashMap o3 = smw0.o(b611Var3);
                                if (str15 != null) {
                                    o3.put("request_id", str15);
                                }
                                o3.put("origin", transportRouteAnalytics$FlowOrigin3.getEventValue());
                                o3.put("sum_ticket_price", str12);
                                o3.put("selected_date", str13);
                                o3.put("vehicle_type", transportRouteAnalytics$VehicleType3.getEventValue());
                                o3.put("tariff_id", str14);
                                o3.put("trip_type", transportRouteAnalytics$TripType3.getEventValue());
                                if (transportRouteAnalytics$InitiatedPaymentMethod3 != null) {
                                    o3.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod3.getEventValue());
                                }
                                if (bool3 != null) {
                                    o3.put("payment_method_available", bool3);
                                }
                                o3.put("adult_ticket_cnt", Integer.valueOf(i5));
                                if (num3 != null) {
                                    o3.put("children_ticket_cnt", num3);
                                }
                                b611Var3.a.a("TransportRoute.InitiatedPayment.Shown", o3, 3, new HashMap());
                            } else if (!jl40.l(qga0Var, kga0.a) && !jl40.l(qga0Var, nga0.a)) {
                                w511.b();
                                return null;
                            }
                            qga0Var = qga0Var2;
                        }
                        fVar = this;
                        qga0Var3 = qga0Var;
                        r0Var = fVar.w.h;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, qga0Var3));
                        return zy11.a;
                    }
                    eb40 eb40Var = fVar.b;
                    db40 a = eb40Var.a();
                    String str16 = ((fb40) eb40Var.b.getValue()).c;
                    gb40 gb40Var = fVar.c;
                    hd40 hd40Var = new hd40(a, gb40Var, str16);
                    mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.L$0 = null;
                    mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.L$1 = null;
                    mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.L$2 = qga0Var6;
                    mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.label = 1;
                    if (fVar.a.b(hd40Var, fVar.w, fVar.x, gb40Var, fVar.y, mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qga0Var5 = qga0Var6;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qga0Var5 = (qga0) mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$12.L$2;
                    kotlin.b.b(obj2);
                }
                qga0Var3 = qga0Var5;
                r0Var = fVar.w.h;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, qga0Var3));
                return zy11.a;
            }
        }
        mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1 = new MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1(fVar, continuation);
        MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1 mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$122 = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$1;
        Object obj22 = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2$2$122.label;
        if (i != 0) {
        }
        qga0Var3 = qga0Var5;
        r0Var = fVar.w.h;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, qga0Var3));
        return zy11.a;
    }
}
