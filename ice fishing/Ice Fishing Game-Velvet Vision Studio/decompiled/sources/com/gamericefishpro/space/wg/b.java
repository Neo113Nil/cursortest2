package com.gamericefishpro.space.wg;

import com.appsflyer.AdRevenueScheme;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.vd.m;
import com.gamericefishpro.space.vg.e;
import com.gamericefishpro.space.vg.f;
import com.gamericefishpro.space.vg.g;
import com.gamericefishpro.space.vg.h;
import com.gamericefishpro.space.vg.j;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h invoke(JSONObject it) throws JSONException {
            Intrinsics.checkNotNullParameter(it, "it");
            j.a aVar = j.Companion;
            String string = it.getString(m.EVENT_TYPE_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            j jVarFromString = aVar.fromString(string);
            if (jVarFromString != null) {
                return new h(it.getString("id"), jVarFromString, com.gamericefishpro.space.yb.d.safeString(it, "token"), com.gamericefishpro.space.yb.d.safeBool(it, "enabled"), com.gamericefishpro.space.yb.d.safeInt(it, "notification_types"), com.gamericefishpro.space.yb.d.safeString(it, "sdk"), com.gamericefishpro.space.yb.d.safeString(it, "device_model"), com.gamericefishpro.space.yb.d.safeString(it, "device_os"), com.gamericefishpro.space.yb.d.safeBool(it, "rooted"), com.gamericefishpro.space.yb.d.safeInt(it, "net_type"), com.gamericefishpro.space.yb.d.safeString(it, "carrier"), com.gamericefishpro.space.yb.d.safeString(it, "app_version"));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.wg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0071b extends l implements Function1 {
        public static final C0071b INSTANCE = new C0071b();

        public C0071b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JSONObject invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
        }
    }

    private b() {
    }

    public final com.gamericefishpro.space.vg.a convertToCreateUserResponse(JSONObject jsonObject) {
        Map mapC;
        LinkedHashMap linkedHashMap;
        JSONObject jSONObjectSafeJSONObject;
        Map<String, Object> map;
        Map<String, Object> map2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONObject jSONObjectSafeJSONObject2 = com.gamericefishpro.space.yb.d.safeJSONObject(jsonObject, "identity");
        if (jSONObjectSafeJSONObject2 == null || (map2 = com.gamericefishpro.space.yb.d.toMap(jSONObjectSafeJSONObject2)) == null) {
            mapC = m0.c();
        } else {
            mapC = new LinkedHashMap(l0.a(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapC.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject jSONObjectSafeJSONObject3 = com.gamericefishpro.space.yb.d.safeJSONObject(jsonObject, "properties");
        if (jSONObjectSafeJSONObject3 == null || (jSONObjectSafeJSONObject = com.gamericefishpro.space.yb.d.safeJSONObject(jSONObjectSafeJSONObject3, "tags")) == null || (map = com.gamericefishpro.space.yb.d.toMap(jSONObjectSafeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(l0.a(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new com.gamericefishpro.space.vg.a(mapC, new f(linkedHashMap, jSONObjectSafeJSONObject3 != null ? com.gamericefishpro.space.yb.d.safeString(jSONObjectSafeJSONObject3, "language") : null, jSONObjectSafeJSONObject3 != null ? com.gamericefishpro.space.yb.d.safeString(jSONObjectSafeJSONObject3, "timezone_id") : null, jSONObjectSafeJSONObject3 != null ? com.gamericefishpro.space.yb.d.safeString(jSONObjectSafeJSONObject3, AdRevenueScheme.COUNTRY) : null, jSONObjectSafeJSONObject3 != null ? com.gamericefishpro.space.yb.d.safeDouble(jSONObjectSafeJSONObject3, "lat") : null, jSONObjectSafeJSONObject3 != null ? com.gamericefishpro.space.yb.d.safeDouble(jSONObjectSafeJSONObject3, "long") : null), com.gamericefishpro.space.yb.d.expandJSONArray(jsonObject, "subscriptions", a.INSTANCE));
    }

    public final JSONObject convertToJSON(f properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), AdRevenueScheme.COUNTRY, properties.getCountry());
    }

    public final JSONObject convertToJSON(e propertiesDeltas) throws JSONException {
        Intrinsics.checkNotNullParameter(propertiesDeltas, "propertiesDeltas");
        JSONObject jSONObjectPutSafe = com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return com.gamericefishpro.space.yb.d.putJSONArray(com.gamericefishpro.space.yb.d.putSafe(jSONObjectPutSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), C0071b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(h subscription) throws JSONException {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        JSONObject jSONObjectPutSafe = com.gamericefishpro.space.yb.d.putSafe(new JSONObject(), "id", subscription.getId());
        j type = subscription.getType();
        return com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(jSONObjectPutSafe, m.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), "sdk", subscription.getSdk()), "device_model", subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}
