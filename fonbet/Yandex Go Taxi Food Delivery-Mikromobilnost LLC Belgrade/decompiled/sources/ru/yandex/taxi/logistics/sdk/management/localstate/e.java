package ru.yandex.taxi.logistics.sdk.management.localstate;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import defpackage.aci;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.igu;
import defpackage.ike;
import defpackage.jwh;
import defpackage.ku2;
import defpackage.mth;
import defpackage.qfi;
import defpackage.sfi;
import defpackage.sls;
import defpackage.st2;
import defpackage.tje;
import defpackage.v4r0;
import defpackage.vng;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes9.dex */
public final class e {
    public final igu a;
    public final aci b;
    public final jwh c;
    public final sfi d;
    public final ike e;
    public final i3y f;
    public final n0 g;
    public final eci0 h;
    public final r0 i;
    public final gci0 j;

    public e(igu iguVar, aci aciVar, jwh jwhVar, sfi sfiVar, st2 st2Var, Context context) {
        this.a = iguVar;
        this.b = aciVar;
        this.c = jwhVar;
        this.d = sfiVar;
        ike a = bvf0.a(st2Var.b);
        this.e = a;
        this.f = kotlin.a.a(new ku2(context, 4));
        n0 c = ffx.c(0, 0, null, 7);
        this.g = c;
        this.h = kotlinx.coroutines.flow.e.O(new mth(kotlinx.coroutines.flow.e.o(new n(c, new DeliveriesLocalStateRepositoryImpl$deliveriesStateFlow$1(this, null))), 3), a, wsr0.a(xsr0.a, 3), 1);
        r0 c2 = bvf0.c(EmptySet.a);
        this.i = c2;
        this.j = kotlinx.coroutines.flow.e.d(c2);
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.f.getValue();
    }

    public final void b(UUID uuid) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.i;
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, uuid)));
    }

    public final void c(final String str, final String str2) {
        ru.yandex.taxi.logistics.sdk.utils.a.b(new sls() { // from class: ru.yandex.taxi.logistics.sdk.management.localstate.b
            @Override // defpackage.sls
            public final Object invoke() {
                e eVar = e.this;
                igu iguVar = eVar.a;
                iguVar.a(eVar.a().getString("HIDDEN_DELIVERIES_PREF", null));
                ConcurrentHashMap concurrentHashMap = eVar.b.a;
                String str3 = str;
                Integer num = (Integer) concurrentHashMap.get(str3);
                int intValue = num != null ? num.intValue() : 0;
                if (!iguVar.d.contains(new Pair(str3, Integer.valueOf(intValue)))) {
                    long I = vng.I() - 604800000;
                    HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData = iguVar.c;
                    List<HiddenDeliveries$HiddenDelivery> markedDeliveries = hiddenDeliveries$HiddenDeliveriesData.getMarkedDeliveries();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : markedDeliveries) {
                        if (((HiddenDeliveries$HiddenDelivery) obj).getDate() > I) {
                            arrayList.add(obj);
                        }
                    }
                    hiddenDeliveries$HiddenDeliveriesData.setMarkedDeliveries(kotlin.collections.a.B0(1000, arrayList));
                    iguVar.b();
                    HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData2 = iguVar.c;
                    hiddenDeliveries$HiddenDeliveriesData2.setMarkedDeliveries(kotlin.collections.a.o0(hiddenDeliveries$HiddenDeliveriesData2.getMarkedDeliveries(), new HiddenDeliveries$HiddenDelivery(vng.I(), str3, intValue)));
                    iguVar.b();
                }
                eVar.d.a.g(new qfi(str3));
                jwh jwhVar = eVar.c;
                LinkedHashMap x = g8e.x("delivery_id", str3);
                x.put("revision", Integer.valueOf(intValue));
                x.put(CRLReasonCodeExtension.REASON, str2);
                jwhVar.a.o("Delivery.OrderHidden", null, x);
                SharedPreferences.Editor edit = eVar.a().edit();
                edit.putString("HIDDEN_DELIVERIES_PREF", ((JsonAdapter) iguVar.b.getValue()).toJson(iguVar.c));
                edit.apply();
                tje.X(new DeliveriesLocalStateRepositoryImpl$markHidden$1$2(eVar, null));
                return zy11.a;
            }
        });
    }
}
