package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0950g1 implements ModuleServiceEventHandler {
    public final C0946f0 a;
    public final String b = "loc-int-lbs";
    public final C0949g0 c = new C0949g0();

    public C0950g1(C0946f0 c0946f0, String str) {
        this.a = c0946f0;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        Map<String, byte[]> extras = counterReportApi.getExtras();
        String str = this.b;
        C0949g0 c0949g0 = this.c;
        C0946f0 c0946f0 = this.a;
        int type = counterReportApi.getType();
        C0993v0 c0993v0 = new C0993v0((List) c0946f0.a.e.getData(), (List) c0946f0.b.a.a());
        E0 e0 = c0946f0.e;
        j2 a = (e0.a.contains(Integer.valueOf(type)) ? e0.c : e0.b).a(c0993v0);
        C0993v0 c0993v02 = (C0993v0) a.b;
        boolean z = a.a == i2.NOT_CHANGED;
        ChargeType chargeType = c0946f0.c.getChargeType();
        ApplicationState currentState = c0946f0.d.getCurrentState();
        C0952h0 c0952h0 = c0949g0.a;
        c0952h0.getClass();
        C0974o1 c0974o1 = new C0974o1();
        if (c0993v02 != null) {
            List list = c0993v02.a;
            if (list != null) {
                C2 c2 = c0952h0.d;
                JSONArray a2 = w2.a(list);
                c2.getClass();
                c0974o1.b = C2.a(a2);
            }
            List list2 = c0993v02.b;
            if (list2 != null) {
                H h = c0952h0.e;
                JSONArray jSONArray = new JSONArray();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        jSONArray.put(AbstractC0979q0.a((C0966m) it.next()));
                    } catch (Throwable unused) {
                    }
                }
                h.getClass();
                c0974o1.a = H.a(jSONArray);
            }
        }
        c0952h0.b.getClass();
        c0974o1.c = L.a(chargeType);
        U u = c0952h0.c;
        int a3 = Q.a(currentState);
        u.getClass();
        c0974o1.d = U.a(a3);
        U1 u1 = c0952h0.a;
        Boolean valueOf = Boolean.valueOf(z);
        u1.getClass();
        c0974o1.e = valueOf.equals(Boolean.TRUE) ? 1 : valueOf.equals(Boolean.FALSE) ? 0 : -1;
        extras.put(str, MessageNano.toByteArray(c0974o1));
        return false;
    }
}
