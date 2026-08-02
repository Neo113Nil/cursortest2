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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0874g1 implements ModuleServiceEventHandler {
    public final C0869f0 a;
    public final String b = "loc-int-lbs";
    public final C0873g0 c = new C0873g0();

    public C0874g1(@NotNull C0869f0 c0869f0, @NotNull String str) {
        this.a = c0869f0;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(@NotNull ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, @NotNull CounterReportApi counterReportApi) {
        Map<String, byte[]> extras = counterReportApi.getExtras();
        String str = this.b;
        C0873g0 c0873g0 = this.c;
        C0869f0 c0869f0 = this.a;
        int type = counterReportApi.getType();
        C0918v0 c0918v0 = new C0918v0((List) c0869f0.a.e.getData(), (List) c0869f0.b.a.a());
        E0 e0 = c0869f0.e;
        j2 a = (e0.a.contains(Integer.valueOf(type)) ? e0.c : e0.b).a(c0918v0);
        C0918v0 c0918v02 = (C0918v0) a.b;
        boolean z = a.a == i2.NOT_CHANGED;
        ChargeType chargeType = c0869f0.c.getChargeType();
        ApplicationState currentState = c0869f0.d.getCurrentState();
        C0877h0 c0877h0 = c0873g0.a;
        c0877h0.getClass();
        C0899o1 c0899o1 = new C0899o1();
        if (c0918v02 != null) {
            List list = c0918v02.a;
            if (list != null) {
                E2 e2 = c0877h0.d;
                JSONArray a2 = w2.a(list);
                e2.getClass();
                c0899o1.b = E2.a(a2);
            }
            List list2 = c0918v02.b;
            if (list2 != null) {
                H h = c0877h0.e;
                JSONArray jSONArray = new JSONArray();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        jSONArray.put(AbstractC0904q0.a((C0891m) it.next()));
                    } catch (Throwable unused) {
                    }
                }
                h.getClass();
                c0899o1.a = H.a(jSONArray);
            }
        }
        c0877h0.b.getClass();
        c0899o1.c = L.a(chargeType);
        U u = c0877h0.c;
        int a3 = Q.a(currentState);
        u.getClass();
        c0899o1.d = U.a(a3);
        U1 u1 = c0877h0.a;
        Boolean valueOf = Boolean.valueOf(z);
        u1.getClass();
        c0899o1.e = valueOf.equals(Boolean.TRUE) ? 1 : valueOf.equals(Boolean.FALSE) ? 0 : -1;
        extras.put(str, MessageNano.toByteArray(c0899o1));
        return false;
    }
}
