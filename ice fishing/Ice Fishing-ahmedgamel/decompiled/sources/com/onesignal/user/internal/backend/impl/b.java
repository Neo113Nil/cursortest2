package com.onesignal.user.internal.backend.impl;

import I7.l;
import Q5.f;
import Q5.g;
import Q5.h;
import Q5.j;
import com.onesignal.common.e;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import q4.C4926b;
import v7.q;
import v7.t;

/* loaded from: classes2.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // I7.l
        public final h invoke(JSONObject it) {
            kotlin.jvm.internal.h.e(it, "it");
            j.a aVar = j.Companion;
            String string = it.getString("type");
            kotlin.jvm.internal.h.d(string, "getString(...)");
            j fromString = aVar.fromString(string);
            if (fromString != null) {
                return new h(it.getString("id"), fromString, e.safeString(it, "token"), e.safeBool(it, "enabled"), e.safeInt(it, "notification_types"), e.safeString(it, "sdk"), e.safeString(it, "device_model"), e.safeString(it, "device_os"), e.safeBool(it, "rooted"), e.safeInt(it, "net_type"), e.safeString(it, "carrier"), e.safeString(it, "app_version"));
            }
            return null;
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0247b extends i implements l {
        public static final C0247b INSTANCE = new C0247b();

        public C0247b() {
            super(1);
        }

        @Override // I7.l
        public final JSONObject invoke(g it) {
            kotlin.jvm.internal.h.e(it, "it");
            return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
        }
    }

    private b() {
    }

    public final Q5.a convertToCreateUserResponse(JSONObject jsonObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        kotlin.jvm.internal.h.e(jsonObject, "jsonObject");
        JSONObject safeJSONObject2 = e.safeJSONObject(jsonObject, U5.c.IDENTITY_NAME_SPACE);
        if (safeJSONObject2 == null || (map3 = e.toMap(safeJSONObject2)) == null) {
            map = q.f41443n;
        } else {
            map = new LinkedHashMap(t.P(map3.size()));
            Iterator<T> it = map3.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = e.safeJSONObject(jsonObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = e.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = e.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.P(map2.size()));
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        f fVar = new f(linkedHashMap, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "country") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "long") : null);
        List expandJSONArray = e.expandJSONArray(jsonObject, "subscriptions", a.INSTANCE);
        String safeString = e.safeString(jsonObject, "ryw_token");
        return new Q5.a(map, fVar, expandJSONArray, safeString != null ? new C4926b(safeString, e.safeLong(jsonObject, "ryw_delay")) : null);
    }

    public final JSONObject convertToJSON(f properties) {
        kotlin.jvm.internal.h.e(properties, "properties");
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), "country", properties.getCountry());
    }

    public final JSONObject convertToJSON(Q5.e propertiesDeltas) {
        kotlin.jvm.internal.h.e(propertiesDeltas, "propertiesDeltas");
        JSONObject putSafe = e.putSafe(e.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return e.putJSONArray(e.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), C0247b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> subscriptions) {
        kotlin.jvm.internal.h.e(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(h subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
        JSONObject putSafe = e.putSafe(new JSONObject(), "id", subscription.getId());
        j type = subscription.getType();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(putSafe, "type", type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), "sdk", subscription.getSdk()), "device_model", subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}
