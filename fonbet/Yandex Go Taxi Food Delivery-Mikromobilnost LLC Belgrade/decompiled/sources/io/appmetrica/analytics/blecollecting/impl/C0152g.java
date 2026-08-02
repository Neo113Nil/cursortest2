package io.appmetrica.analytics.blecollecting.impl;

import android.location.Location;
import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0152g implements ModuleServiceEventHandler {
    public final C0162q a;

    public /* synthetic */ C0152g(ServiceContext serviceContext, String str, C0162q c0162q, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceContext, str, (i & 4) != 0 ? new C0162q(serviceContext) : c0162q);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        JSONObject a;
        byte[] bArr = counterReportApi.getExtras().get("ble_add_location");
        if (bArr == null || !Boolean.parseBoolean(new String(bArr, uza.a))) {
            return false;
        }
        counterReportApi.getExtras().remove("ble_add_location");
        try {
            C0162q c0162q = this.a;
            ServiceContext serviceContext = c0162q.a;
            Location location = null;
            if (serviceContext == null) {
                c0162q.b.getClass();
                a = r.a(null, "no_service_context");
            } else {
                LocationServiceApi locationServiceApi = serviceContext.getLocationServiceApi();
                String str = "null";
                Location userLocation = locationServiceApi.getUserLocation();
                if (userLocation != null) {
                    str = "user";
                    location = userLocation;
                } else {
                    Location systemLocation = locationServiceApi.getSystemLocation();
                    if (systemLocation != null) {
                        str = "system";
                        location = systemLocation;
                    }
                }
                c0162q.b.getClass();
                a = r.a(location, str);
            }
            String value = counterReportApi.getValue();
            if (value == null) {
                value = "{}";
            }
            counterReportApi.setValue(new JSONObject(value).put("location", a).toString());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0152g(ServiceContext serviceContext, String str, C0162q c0162q) {
        this.a = c0162q;
    }
}
