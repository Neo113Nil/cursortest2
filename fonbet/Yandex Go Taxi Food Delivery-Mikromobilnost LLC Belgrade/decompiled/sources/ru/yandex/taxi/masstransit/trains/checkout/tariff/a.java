package ru.yandex.taxi.masstransit.trains.checkout.tariff;

import defpackage.ai40;
import defpackage.b611;
import defpackage.bi40;
import defpackage.ci40;
import defpackage.ea40;
import defpackage.fa40;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qh40;
import defpackage.sh40;
import defpackage.smw0;
import defpackage.t130;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xh40;
import defpackage.yh40;
import defpackage.zh40;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutTariffButtonType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class a {
    public final ea40 a;

    public a(ea40 ea40Var) {
        this.a = ea40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bi40 bi40Var, d dVar, qh40 qh40Var, ContinuationImpl continuationImpl) {
        MtTrainTariffActionInteractor$handleAction$1 mtTrainTariffActionInteractor$handleAction$1;
        int i;
        Object value;
        ci40 ci40Var;
        String str;
        Integer num;
        String str2;
        if (continuationImpl instanceof MtTrainTariffActionInteractor$handleAction$1) {
            mtTrainTariffActionInteractor$handleAction$1 = (MtTrainTariffActionInteractor$handleAction$1) continuationImpl;
            int i2 = mtTrainTariffActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainTariffActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainTariffActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainTariffActionInteractor$handleAction$1.label;
                ea40 ea40Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(bi40Var instanceof zh40)) {
                        if (bi40Var instanceof ai40) {
                            ai40 ai40Var = (ai40) bi40Var;
                            String str3 = ai40Var.a;
                            fa40 fa40Var = ea40Var.b.a;
                            ea40Var.a.b(ea40Var.d, fa40Var.a, fa40Var.b, fa40Var.c, str3, fa40Var.e, fa40Var.f, TransportRouteAnalytics$CheckoutTariffButtonType.TariffItem, fa40Var.h, fa40Var.i, fa40Var.m, fa40Var.g, fa40Var.l);
                            String str4 = ai40Var.a;
                            r0 r0Var = dVar.c;
                            do {
                                value = r0Var.getValue();
                                ci40Var = (ci40) value;
                            } while (!r0Var.k(value, new ci40(ci40Var.a, ci40Var.b, str4, ci40Var.d)));
                        } else if (bi40Var instanceof xh40) {
                            xh40 xh40Var = (xh40) bi40Var;
                            String str5 = xh40Var.a;
                            String str6 = str5 == null ? "" : str5;
                            fa40 fa40Var2 = ea40Var.b.a;
                            ea40Var.a.b(ea40Var.d, fa40Var2.a, fa40Var2.b, fa40Var2.c, str6, fa40Var2.e, fa40Var2.f, TransportRouteAnalytics$CheckoutTariffButtonType.Apply, fa40Var2.h, fa40Var2.i, fa40Var2.m, fa40Var2.g, fa40Var2.l);
                            qh40Var.a.r(new t130(18, str5, xh40Var.b));
                        } else {
                            if (!jl40.l(bi40Var, yh40.a)) {
                                w511.b();
                                return null;
                            }
                            fa40 fa40Var3 = ea40Var.b.a;
                            ea40Var.a.b(ea40Var.d, fa40Var3.a, fa40Var3.b, fa40Var3.c, fa40Var3.d, fa40Var3.e, fa40Var3.f, TransportRouteAnalytics$CheckoutTariffButtonType.Back, fa40Var3.h, fa40Var3.i, fa40Var3.m, fa40Var3.g, fa40Var3.l);
                        }
                        return zy11.a;
                    }
                    fa40 fa40Var4 = ea40Var.b.a;
                    b611 b611Var = ea40Var.a;
                    TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
                    String str7 = fa40Var4.a;
                    String str8 = fa40Var4.b;
                    TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var4.c;
                    String str9 = fa40Var4.d;
                    MtTrainTariffActionInteractor$handleAction$1 mtTrainTariffActionInteractor$handleAction$12 = mtTrainTariffActionInteractor$handleAction$1;
                    TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var4.e;
                    int i3 = fa40Var4.f;
                    Integer num2 = fa40Var4.g;
                    String str10 = fa40Var4.h;
                    String str11 = fa40Var4.i;
                    HashMap o = smw0.o(b611Var);
                    o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                    o.put("tariff_price", str7);
                    o.put("selected_date", str8);
                    o.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
                    if (str9 != null) {
                        o.put("tariff_id", str9);
                    }
                    o.put("trip_type", transportRouteAnalytics$TripType.getEventValue());
                    o.put("adult_ticket_cnt", Integer.valueOf(i3));
                    if (num2 != null) {
                        o.put("children_ticket_cnt", num2);
                    }
                    b611Var.a.a("TransportRoute.CheckoutTariff.Shown", o, 3, x4e.q(o, "start_stop_id", str10, "final_stop_id", str11));
                    sh40 sh40Var = ((zh40) bi40Var).a;
                    mtTrainTariffActionInteractor$handleAction$12.L$0 = null;
                    mtTrainTariffActionInteractor$handleAction$12.L$1 = null;
                    mtTrainTariffActionInteractor$handleAction$12.L$2 = null;
                    mtTrainTariffActionInteractor$handleAction$12.label = 1;
                    if (dVar.a(sh40Var, mtTrainTariffActionInteractor$handleAction$12) == obj2) {
                        return obj2;
                    }
                    ea40Var = ea40Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fa40 fa40Var5 = ea40Var.b.a;
                b611 b611Var2 = ea40Var.a;
                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin2 = ea40Var.d;
                String str12 = fa40Var5.a;
                String str13 = fa40Var5.b;
                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = fa40Var5.c;
                str = fa40Var5.d;
                TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = fa40Var5.e;
                int i4 = fa40Var5.f;
                num = fa40Var5.g;
                String str14 = fa40Var5.h;
                String str15 = fa40Var5.i;
                str2 = fa40Var5.m;
                HashMap o2 = smw0.o(b611Var2);
                if (str2 != null) {
                    o2.put("request_id", str2);
                }
                o2.put("origin", transportRouteAnalytics$FlowOrigin2.getEventValue());
                o2.put("tariff_price", str12);
                o2.put("selected_date", str13);
                o2.put("vehicle_type", transportRouteAnalytics$VehicleType2.getEventValue());
                if (str != null) {
                    o2.put("tariff_id", str);
                }
                o2.put("trip_type", transportRouteAnalytics$TripType2.getEventValue());
                o2.put("adult_ticket_cnt", Integer.valueOf(i4));
                if (num != null) {
                    o2.put("children_ticket_cnt", num);
                }
                b611Var2.a.a("TransportRoute.CheckoutTariff.FirstLoaded", o2, 2, x4e.q(o2, "start_stop_id", str14, "final_stop_id", str15));
                return zy11.a;
            }
        }
        mtTrainTariffActionInteractor$handleAction$1 = new MtTrainTariffActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = mtTrainTariffActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainTariffActionInteractor$handleAction$1.label;
        ea40 ea40Var2 = this.a;
        if (i != 0) {
        }
        fa40 fa40Var52 = ea40Var2.b.a;
        b611 b611Var22 = ea40Var2.a;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin22 = ea40Var2.d;
        String str122 = fa40Var52.a;
        String str132 = fa40Var52.b;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType22 = fa40Var52.c;
        str = fa40Var52.d;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType22 = fa40Var52.e;
        int i42 = fa40Var52.f;
        num = fa40Var52.g;
        String str142 = fa40Var52.h;
        String str152 = fa40Var52.i;
        str2 = fa40Var52.m;
        HashMap o22 = smw0.o(b611Var22);
        if (str2 != null) {
        }
        o22.put("origin", transportRouteAnalytics$FlowOrigin22.getEventValue());
        o22.put("tariff_price", str122);
        o22.put("selected_date", str132);
        o22.put("vehicle_type", transportRouteAnalytics$VehicleType22.getEventValue());
        if (str != null) {
        }
        o22.put("trip_type", transportRouteAnalytics$TripType22.getEventValue());
        o22.put("adult_ticket_cnt", Integer.valueOf(i42));
        if (num != null) {
        }
        b611Var22.a.a("TransportRoute.CheckoutTariff.FirstLoaded", o22, 2, x4e.q(o22, "start_stop_id", str142, "final_stop_id", str152));
        return zy11.a;
    }
}
