package io.appmetrica.analytics.rtm.impl;

import android.location.Location;
import android.text.TextUtils;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.y4i0;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtm.internal.service.RtmModuleEntryPoint;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class e {
    protected final JSONObject a;
    public final C1095a b = new C1095a();

    public e(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final void a(y4i0 y4i0Var) {
        String jSONObject;
        String str;
        String optString = this.a.optString("version", null);
        if (!TextUtils.isEmpty(optString)) {
            y4i0Var.getClass();
            if (jl40.A(optString)) {
                ny61.g("Version must not be empty");
                return;
            }
            y4i0Var.c = optString;
        }
        String optString2 = this.a.optString(Constants.KEY_VERSION_FLAVOR, null);
        if (optString2 != null) {
            y4i0Var.d = optString2;
        }
        String optString3 = this.a.optString(Constants.KEY_SERVICE, null);
        if (optString3 != null) {
            b bVar = new b(optString3);
            y4i0Var.getClass();
            y4i0Var.j = (String) bVar.getValue();
        }
        String optString4 = this.a.optString("source", null);
        if (optString4 != null) {
            c cVar = new c(optString4);
            y4i0Var.getClass();
            y4i0Var.k = (String) cVar.getValue();
        }
        String optString5 = this.a.optString("referrer", null);
        if (optString5 != null) {
            y4i0Var.l = optString5;
        }
        C1095a c1095a = this.b;
        JSONObject jSONObject2 = this.a;
        c1095a.getClass();
        JSONObject optJSONObject = jSONObject2.optJSONObject(Constants.KEY_COMPOSITE_ADDITIONAL);
        if (optJSONObject == null) {
            jSONObject = jSONObject2.optString(Constants.KEY_ADDITIONAL, null);
        } else {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(Constants.KEY_ADDITIONAL_JSON);
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            if (optJSONObject.optBoolean(Constants.KEY_INCLUDE_LOCATION)) {
                ServiceContext serviceContext = RtmModuleEntryPoint.getServiceContext();
                try {
                    if (serviceContext == null) {
                        optJSONObject2.put("l_type", "no_service_context");
                    } else {
                        LocationServiceApi locationServiceApi = serviceContext.getLocationServiceApi();
                        Location userLocation = locationServiceApi.getUserLocation();
                        if (userLocation != null) {
                            str = "user";
                        } else {
                            userLocation = locationServiceApi.getSystemLocation();
                            if (userLocation != null) {
                                str = "system";
                            } else {
                                str = "null";
                                userLocation = null;
                            }
                        }
                        if (userLocation != null) {
                            optJSONObject2.put("l_lat", userLocation.getLatitude()).put("l_lon", userLocation.getLongitude()).put("l_time", userLocation.getTime()).put("l_acc", userLocation.getAccuracy());
                        }
                        optJSONObject2.put("l_type", str);
                    }
                } catch (Throwable unused) {
                }
            }
            jSONObject = optJSONObject2.toString();
        }
        if (jSONObject != null) {
            y4i0Var.m = jSONObject;
        }
        String optString6 = this.a.optString(Constants.KEY_PAGE, null);
        if (optString6 != null) {
            d dVar = new d(optString6);
            y4i0Var.getClass();
            y4i0Var.n = (String) dVar.getValue();
        }
        b(y4i0Var);
    }

    public abstract void b(y4i0 y4i0Var);
}
