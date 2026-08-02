package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.b611;
import defpackage.ea40;
import defpackage.fa40;
import defpackage.ga40;
import defpackage.hb40;
import defpackage.ib40;
import defpackage.ny61;
import defpackage.smw0;
import defpackage.ud40;
import defpackage.vd40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wd40;
import defpackage.x4e;
import defpackage.xd40;
import defpackage.y940;
import defpackage.yd40;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;
    public final /* synthetic */ xd40 c;

    public n(vpr vprVar, r rVar, xd40 xd40Var) {
        this.a = vprVar;
        this.b = rVar;
        this.c = xd40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        r rVar;
        Object obj2;
        hb40 hb40Var;
        if (continuation instanceof MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1) {
            mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 = (MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ib40 ib40Var = (ib40) obj;
                    PaymentMethod$Type paymentMethod$Type = ib40Var.b.a;
                    int i3 = paymentMethod$Type == null ? -1 : yd40.a[paymentMethod$Type.ordinal()];
                    TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : TransportRouteAnalytics$InitiatedPaymentMethod.SbpToken : TransportRouteAnalytics$InitiatedPaymentMethod.YandexCard : TransportRouteAnalytics$InitiatedPaymentMethod.Card;
                    r rVar2 = this.b;
                    ga40 ga40Var = rVar2.e;
                    fa40 fa40Var = ga40Var.a;
                    if (fa40Var.k != transportRouteAnalytics$InitiatedPaymentMethod) {
                        rVar = rVar2;
                        ga40Var.a = fa40.a(fa40Var, null, null, null, null, null, 0, null, null, null, transportRouteAnalytics$InitiatedPaymentMethod != null ? Boolean.valueOf(ib40Var.a()) : null, transportRouteAnalytics$InitiatedPaymentMethod, null, null, null, 14847);
                    } else {
                        rVar = rVar2;
                    }
                    Object obj4 = this.c;
                    if (obj4 instanceof ud40) {
                        ud40 ud40Var = (ud40) obj4;
                        hb40 hb40Var2 = ud40Var.f.a;
                        if (hb40Var2 != null) {
                            PaymentMethod$Type paymentMethod$Type2 = ib40Var.b.a;
                            int i4 = paymentMethod$Type2 == null ? -1 : yd40.a[paymentMethod$Type2.ordinal()];
                            if (i4 != 1 && i4 != 2 && i4 != 3) {
                                ib40Var = ib40.c;
                            }
                            hb40Var = hb40.a(hb40Var2, null, ib40Var, 55);
                        } else {
                            hb40Var = null;
                        }
                        obj4 = ud40.a(ud40Var, null, null, new y940(hb40Var), 31);
                    }
                    ea40 ea40Var = rVar.f;
                    TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
                    b611 b611Var = ea40Var.a;
                    ga40 ga40Var2 = ea40Var.b;
                    if (!(obj4 instanceof ud40)) {
                        MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$12 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1;
                        obj2 = obj4;
                        if (obj2 instanceof vd40) {
                            fa40 fa40Var2 = ga40Var2.a;
                            String str = fa40Var2.b;
                            TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var2.e;
                            int i5 = fa40Var2.f;
                            Integer num = fa40Var2.g;
                            TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod2 = fa40Var2.k;
                            Boolean bool = fa40Var2.j;
                            String str2 = fa40Var2.h;
                            String str3 = fa40Var2.i;
                            String str4 = fa40Var2.m;
                            HashMap o = smw0.o(b611Var);
                            if (str4 != null) {
                                o.put("request_id", str4);
                            }
                            o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                            o.put("selected_date", str);
                            o.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
                            if (transportRouteAnalytics$InitiatedPaymentMethod2 != null) {
                                o.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod2.getEventValue());
                            }
                            if (bool != null) {
                                o.put("payment_method_available", bool);
                            }
                            o.put("adult_ticket_cnt", Integer.valueOf(i5));
                            if (num != null) {
                                o.put("children_ticket_cnt", num);
                            }
                            b611Var.a.a("TransportRoute.CheckoutError.Shown", o, 4, x4e.q(o, "start_stop_id", str2, "final_stop_id", str3));
                            mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$12;
                            obj2 = obj2;
                        } else {
                            if (!(obj2 instanceof wd40)) {
                                w511.b();
                                return null;
                            }
                            mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$12;
                        }
                    } else if (ea40Var.e) {
                        obj2 = obj4;
                    } else {
                        fa40 fa40Var3 = ga40Var2.a;
                        String str5 = fa40Var3.a;
                        MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$13 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1;
                        String str6 = fa40Var3.b;
                        Object obj5 = obj4;
                        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var3.c;
                        String str7 = fa40Var3.d;
                        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = fa40Var3.e;
                        int i6 = fa40Var3.f;
                        Integer num2 = fa40Var3.g;
                        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod3 = fa40Var3.k;
                        String str8 = fa40Var3.h;
                        String str9 = fa40Var3.i;
                        String str10 = fa40Var3.m;
                        Boolean bool2 = fa40Var3.j;
                        HashMap o2 = smw0.o(b611Var);
                        if (str10 != null) {
                            o2.put("request_id", str10);
                        }
                        o2.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                        o2.put("sum_ticket_price", str5);
                        o2.put("selected_date", str6);
                        o2.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
                        o2.put("tariff_id", str7);
                        o2.put("trip_type", transportRouteAnalytics$TripType2.getEventValue());
                        if (transportRouteAnalytics$InitiatedPaymentMethod3 != null) {
                            o2.put("payment_method", transportRouteAnalytics$InitiatedPaymentMethod3.getEventValue());
                        }
                        if (bool2 != null) {
                            o2.put("payment_method_available", bool2);
                        }
                        o2.put("adult_ticket_cnt", Integer.valueOf(i6));
                        if (num2 != null) {
                            o2.put("children_ticket_cnt", num2);
                        }
                        b611Var.a.a("TransportRoute.Checkout.FirstLoaded", o2, 2, x4e.q(o2, "start_stop_id", str8, "final_stop_id", str9));
                        ea40Var.e = true;
                        mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$13;
                        obj2 = obj5;
                    }
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1 = new MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj32 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
