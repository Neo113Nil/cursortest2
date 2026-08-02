package ru.yandex.taxi.masstransit.trains.checkout.actionpopup;

import defpackage.b611;
import defpackage.c7s0;
import defpackage.ea40;
import defpackage.fa40;
import defpackage.jl40;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o940;
import defpackage.p940;
import defpackage.qu;
import defpackage.smw0;
import defpackage.sy60;
import defpackage.t411;
import defpackage.t940;
import defpackage.u940;
import defpackage.v940;
import defpackage.w511;
import defpackage.w940;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutActionType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes6.dex */
public final class c {
    public final ea40 a;

    public c(ea40 ea40Var) {
        this.a = ea40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w940 w940Var, d dVar, p940 p940Var, ContinuationImpl continuationImpl) {
        MtTrainActionPopupUiActionInteractor$handleAction$1 mtTrainActionPopupUiActionInteractor$handleAction$1;
        int i;
        String str;
        Integer num;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod;
        Boolean bool;
        String str2;
        w940 w940Var2 = w940Var;
        if (continuationImpl instanceof MtTrainActionPopupUiActionInteractor$handleAction$1) {
            mtTrainActionPopupUiActionInteractor$handleAction$1 = (MtTrainActionPopupUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = mtTrainActionPopupUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainActionPopupUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainActionPopupUiActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainActionPopupUiActionInteractor$handleAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(w940Var2 instanceof t940)) {
                        int i3 = 9;
                        if (w940Var2 instanceof v940) {
                            ModalButtonResultType modalButtonResultType = ((v940) w940Var2).a;
                            b bVar = p940Var.a;
                            int i4 = o940.a[modalButtonResultType.ordinal()];
                            if (i4 == 1) {
                                bVar.r(new qu(i3));
                            } else if (i4 == 2) {
                                bVar.r(new qu(i3));
                            } else {
                                if (i4 != 3) {
                                    w511.b();
                                    return null;
                                }
                                bVar.A((m950) bVar.J.get(), new t411(null, null), sy60.Q2);
                            }
                        } else {
                            if (!jl40.l(w940Var2, u940.a)) {
                                w511.b();
                                return null;
                            }
                            p940Var.a.r(new qu(i3));
                        }
                        return zy11.a;
                    }
                    c7s0 c7s0Var = ((t940) w940Var2).a;
                    mtTrainActionPopupUiActionInteractor$handleAction$1.L$0 = w940Var2;
                    mtTrainActionPopupUiActionInteractor$handleAction$1.L$1 = null;
                    mtTrainActionPopupUiActionInteractor$handleAction$1.L$2 = null;
                    mtTrainActionPopupUiActionInteractor$handleAction$1.label = 1;
                    if (dVar.a(c7s0Var, mtTrainActionPopupUiActionInteractor$handleAction$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w940Var2 = (w940) mtTrainActionPopupUiActionInteractor$handleAction$1.L$0;
                    kotlin.b.b(obj);
                }
                TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType = TransportRouteAnalytics$CheckoutActionType.Modal;
                t940 t940Var = (t940) w940Var2;
                str = t940Var.a.f;
                if (str == null) {
                    str = "";
                }
                ea40 ea40Var = this.a;
                ea40Var.a(transportRouteAnalytics$CheckoutActionType, str);
                String str3 = t940Var.a.f;
                String str4 = str3 != null ? str3 : "";
                fa40 fa40Var = ea40Var.b.a;
                b611 b611Var = ea40Var.a;
                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
                String str5 = fa40Var.a;
                String str6 = fa40Var.b;
                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var.c;
                String str7 = fa40Var.d;
                TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var.e;
                int i5 = fa40Var.f;
                num = fa40Var.g;
                transportRouteAnalytics$InitiatedPaymentMethod = fa40Var.k;
                bool = fa40Var.j;
                String str8 = fa40Var.h;
                String str9 = fa40Var.i;
                str2 = fa40Var.m;
                HashMap o = smw0.o(b611Var);
                if (str2 != null) {
                    o.put("request_id", str2);
                }
                o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                o.put("sum_ticket_price", str5);
                o.put("selected_date", str6);
                o.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
                o.put("tariff_id", str7);
                o.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
                if (transportRouteAnalytics$InitiatedPaymentMethod != null) {
                    o.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod.getEventValue());
                }
                if (bool != null) {
                    o.put("payment_method_available", bool);
                }
                o.put("adult_ticket_cnt", Integer.valueOf(i5));
                if (num != null) {
                    o.put("children_ticket_cnt", num);
                }
                o.put("action_type", transportRouteAnalytics$CheckoutActionType.getEventValue());
                o.put(CRLReasonCodeExtension.REASON, str4);
                b611Var.a.a("TransportRoute.CheckoutAction.FirstLoaded", o, 2, x4e.q(o, "start_stop_id", str8, "final_stop_id", str9));
                return zy11.a;
            }
        }
        mtTrainActionPopupUiActionInteractor$handleAction$1 = new MtTrainActionPopupUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = mtTrainActionPopupUiActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainActionPopupUiActionInteractor$handleAction$1.label;
        if (i != 0) {
        }
        TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType2 = TransportRouteAnalytics$CheckoutActionType.Modal;
        t940 t940Var2 = (t940) w940Var2;
        str = t940Var2.a.f;
        if (str == null) {
        }
        ea40 ea40Var2 = this.a;
        ea40Var2.a(transportRouteAnalytics$CheckoutActionType2, str);
        String str32 = t940Var2.a.f;
        if (str32 != null) {
        }
        fa40 fa40Var2 = ea40Var2.b.a;
        b611 b611Var2 = ea40Var2.a;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin2 = ea40Var2.d;
        String str52 = fa40Var2.a;
        String str62 = fa40Var2.b;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = fa40Var2.c;
        String str72 = fa40Var2.d;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = fa40Var2.e;
        int i52 = fa40Var2.f;
        num = fa40Var2.g;
        transportRouteAnalytics$InitiatedPaymentMethod = fa40Var2.k;
        bool = fa40Var2.j;
        String str82 = fa40Var2.h;
        String str92 = fa40Var2.i;
        str2 = fa40Var2.m;
        HashMap o2 = smw0.o(b611Var2);
        if (str2 != null) {
        }
        o2.put("origin", transportRouteAnalytics$FlowOrigin2.getEventValue());
        o2.put("sum_ticket_price", str52);
        o2.put("selected_date", str62);
        o2.put("vehicle_type", transportRouteAnalytics$VehicleType2.getEventValue());
        o2.put("tariff_id", str72);
        o2.put("trip_type", transportRouteAnalytics$TripType2.getEventValue());
        if (transportRouteAnalytics$InitiatedPaymentMethod != null) {
        }
        if (bool != null) {
        }
        o2.put("adult_ticket_cnt", Integer.valueOf(i52));
        if (num != null) {
        }
        o2.put("action_type", transportRouteAnalytics$CheckoutActionType2.getEventValue());
        o2.put(CRLReasonCodeExtension.REASON, str4);
        b611Var2.a.a("TransportRoute.CheckoutAction.FirstLoaded", o2, 2, x4e.q(o2, "start_stop_id", str82, "final_stop_id", str92));
        return zy11.a;
    }
}
