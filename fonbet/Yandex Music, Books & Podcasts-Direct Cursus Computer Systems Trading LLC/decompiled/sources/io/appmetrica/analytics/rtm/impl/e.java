package io.appmetrica.analytics.rtm.impl;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.lsq;
import defpackage.qen;
import defpackage.xq0;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtm.internal.service.RtmModuleEntryPoint;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class e {

    @NonNull
    protected final JSONObject a;
    public final C0932a b = new C0932a();

    public e(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final void a(@NonNull qen qenVar) {
        String jSONObject;
        String str;
        String optString = this.a.optString("version", null);
        if (!TextUtils.isEmpty(optString)) {
            qenVar.getClass();
            optString.getClass();
            if (lsq.z(optString)) {
                xq0.x("Version must not be empty");
                return;
            }
            qenVar.c = optString;
        }
        String optString2 = this.a.optString(Constants.KEY_VERSION_FLAVOR, null);
        if (optString2 != null) {
            qenVar.d = optString2;
        }
        String optString3 = this.a.optString("service", null);
        if (optString3 != null) {
            b bVar = new b(optString3);
            qenVar.getClass();
            qenVar.j = (String) bVar.getValue();
        }
        String optString4 = this.a.optString("source", null);
        if (optString4 != null) {
            c cVar = new c(optString4);
            qenVar.getClass();
            qenVar.k = (String) cVar.getValue();
        }
        String optString5 = this.a.optString(Constants.KEY_REFERRER, null);
        if (optString5 != null) {
            qenVar.l = optString5;
        }
        C0932a c0932a = this.b;
        JSONObject jSONObject2 = this.a;
        c0932a.getClass();
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
            qenVar.m = jSONObject;
        }
        String optString6 = this.a.optString(Constants.KEY_PAGE, null);
        if (optString6 != null) {
            d dVar = new d(optString6);
            qenVar.getClass();
            qenVar.n = (String) dVar.getValue();
        }
        b(qenVar);
    }

    public abstract void b(qen qenVar);
}
