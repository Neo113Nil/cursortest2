package ru.yandex.taxi.masstransit.trains.checkout.conditions;

import android.content.Context;
import defpackage.b611;
import defpackage.be40;
import defpackage.ce40;
import defpackage.ea40;
import defpackage.ee40;
import defpackage.fa40;
import defpackage.fe40;
import defpackage.fl10;
import defpackage.ga40;
import defpackage.ge40;
import defpackage.he40;
import defpackage.ie40;
import defpackage.jl40;
import defpackage.lxd;
import defpackage.mja1;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.pho;
import defpackage.qu;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w030;
import defpackage.w511;
import defpackage.wfd;
import defpackage.x240;
import defpackage.x4e;
import defpackage.xl10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final ie40 H;
    public final fl10 I;
    public final xl10 J;
    public final mu5 K;

    public b(Context context, w030 w030Var, ie40 ie40Var, fl10 fl10Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = ie40Var;
        this.I = fl10Var;
        this.J = new xl10(this);
        this.K = new mu5(new x240(8, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void U(b bVar, ge40 ge40Var) {
        pho phoVar;
        String str;
        String str2;
        String str3;
        String str4;
        EmptyList emptyList;
        xl10 xl10Var = bVar.J;
        fl10 fl10Var = bVar.I;
        ie40 ie40Var = bVar.H;
        ea40 ea40Var = (ea40) fl10Var.a;
        if (jl40.l(ge40Var, ee40.a)) {
            ((b) xl10Var.a).r(new qu(9));
            return;
        }
        if (!(ge40Var instanceof fe40)) {
            w511.b();
            return;
        }
        ga40 ga40Var = ea40Var.b;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
        b611 b611Var = ea40Var.a;
        fa40 fa40Var = ga40Var.a;
        String str5 = fa40Var.a;
        String str6 = fa40Var.b;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var.c;
        String str7 = fa40Var.d;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = fa40Var.e;
        int i = fa40Var.f;
        String str8 = fa40Var.h;
        String str9 = fa40Var.i;
        Integer valueOf = Integer.valueOf(i);
        b611Var.getClass();
        pho phoVar2 = b611Var.a;
        HashMap hashMap = new HashMap();
        hashMap.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap.put("sum_ticket_price", str5);
        hashMap.put("selected_date", str6);
        hashMap.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
        hashMap.put("tariff_id", str7);
        String eventValue = transportRouteAnalytics$TripType.getEventValue();
        String str10 = "trip_type";
        hashMap.put("trip_type", eventValue);
        Integer valueOf2 = Integer.valueOf(i);
        String str11 = "adult_ticket_cnt";
        hashMap.put("adult_ticket_cnt", valueOf2);
        String str12 = "children_ticket_cnt";
        hashMap.put("children_ticket_cnt", valueOf);
        String str13 = "start_stop_id";
        phoVar2.a("TransportRoute.CheckoutCondition.Shown", hashMap, 3, x4e.q(hashMap, "start_stop_id", str8, "final_stop_id", str9));
        be40 be40Var = ((fe40) ge40Var).a;
        r0 r0Var = ie40Var.a;
        while (true) {
            Object value = r0Var.getValue();
            CharSequence charSequence = be40Var.a;
            List list = be40Var.c;
            if (list != null) {
                List list2 = list;
                phoVar = phoVar2;
                str4 = str13;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ce40 ce40Var = (ce40) it.next();
                    arrayList.add(new lxd(mja1.a(ce40Var.a, null, 6), ce40Var.b, ce40Var.c));
                    it = it;
                    str12 = str12;
                    str11 = str11;
                    str10 = str10;
                }
                str = str12;
                str2 = str10;
                str3 = str11;
                emptyList = arrayList;
            } else {
                phoVar = phoVar2;
                str = str12;
                str2 = str10;
                str3 = str11;
                str4 = str13;
                emptyList = EmptyList.a;
            }
            if (r0Var.k(value, new he40(charSequence, be40Var.b, emptyList))) {
                break;
            }
            phoVar2 = phoVar;
            str13 = str4;
            str12 = str;
            str11 = str3;
            str10 = str2;
        }
        fa40 fa40Var2 = ea40Var.b.a;
        String str14 = fa40Var2.a;
        String str15 = fa40Var2.b;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = fa40Var2.c;
        String str16 = fa40Var2.d;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = fa40Var2.e;
        int i2 = fa40Var2.f;
        String str17 = fa40Var2.h;
        String str18 = fa40Var2.i;
        String str19 = fa40Var2.m;
        Integer valueOf3 = Integer.valueOf(i2);
        HashMap hashMap2 = new HashMap();
        if (str19 != null) {
            hashMap2.put("request_id", str19);
        }
        hashMap2.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        hashMap2.put("sum_ticket_price", str14);
        hashMap2.put("selected_date", str15);
        hashMap2.put("vehicle_type", transportRouteAnalytics$VehicleType2.getEventValue());
        hashMap2.put("tariff_id", str16);
        hashMap2.put(str2, transportRouteAnalytics$TripType2.getEventValue());
        hashMap2.put(str3, Integer.valueOf(i2));
        hashMap2.put(str, valueOf3);
        phoVar.a("TransportRoute.CheckoutCondition.FirstLoaded", hashMap2, 2, x4e.q(hashMap2, str4, str17, "final_stop_id", str18));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        be40 be40Var = (be40) obj;
        super.G(be40Var);
        tje.N(o(), null, null, new MtTrainConditionsModalRouter$onAttach$1(this, be40Var, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
