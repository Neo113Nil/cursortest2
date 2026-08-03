package com.onesignal.user.internal.backend.impl;

import bc.a0;
import bc.w;
import com.onesignal.common.f;
import com.onesignal.inAppMessages.internal.display.impl.n;
import gb.e;
import gb.g;
import gb.h;
import gb.j;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.c {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // oc.c
        public final h invoke(JSONObject jSONObject) {
            j.e(jSONObject, "it");
            j.a aVar = gb.j.Companion;
            String string = jSONObject.getString(n.EVENT_TYPE_KEY);
            pc.j.d(string, "it.getString(\"type\")");
            gb.j fromString = aVar.fromString(string);
            if (fromString != null) {
                return new h(jSONObject.getString("id"), fromString, f.safeString(jSONObject, "token"), f.safeBool(jSONObject, "enabled"), f.safeInt(jSONObject, "notification_types"), f.safeString(jSONObject, "sdk"), f.safeString(jSONObject, "device_model"), f.safeString(jSONObject, "device_os"), f.safeBool(jSONObject, "rooted"), f.safeInt(jSONObject, "net_type"), f.safeString(jSONObject, "carrier"), f.safeString(jSONObject, "app_version"));
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0066b extends k implements oc.c {
        public static final C0066b INSTANCE = new C0066b();

        public C0066b() {
            super(1);
        }

        @Override // oc.c
        public final JSONObject invoke(g gVar) {
            pc.j.e(gVar, "it");
            return new JSONObject().put("sku", gVar.getSku()).put("iso", gVar.getIso()).put("amount", gVar.getAmount().toString());
        }
    }

    private b() {
    }

    public final gb.a convertToCreateUserResponse(JSONObject jSONObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        pc.j.e(jSONObject, "jsonObject");
        JSONObject safeJSONObject2 = f.safeJSONObject(jSONObject, "identity");
        if (safeJSONObject2 == null || (map3 = f.toMap(safeJSONObject2)) == null) {
            map = w.f1068g;
        } else {
            map = new LinkedHashMap(a0.B(map3.size()));
            Iterator<T> it = map3.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = f.safeJSONObject(jSONObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = f.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = f.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a0.B(map2.size()));
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new gb.a(map, new gb.f(linkedHashMap, safeJSONObject3 != null ? f.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? f.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? f.safeString(safeJSONObject3, "country") : null, safeJSONObject3 != null ? f.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? f.safeDouble(safeJSONObject3, "long") : null), f.expandJSONArray(jSONObject, "subscriptions", a.INSTANCE));
    }

    public final JSONObject convertToJSON(gb.f fVar) {
        pc.j.e(fVar, "properties");
        return f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putMap(new JSONObject(), "tags", fVar.getTags()), "language", fVar.getLanguage()), "timezone_id", fVar.getTimezoneId()), "lat", fVar.getLatitude()), "long", fVar.getLongitude()), "country", fVar.getCountry());
    }

    public final JSONObject convertToJSON(e eVar) {
        pc.j.e(eVar, "propertiesDeltas");
        JSONObject putSafe = f.putSafe(f.putSafe(new JSONObject(), "session_time", eVar.getSessionTime()), "session_count", eVar.getSessionCount());
        BigDecimal amountSpent = eVar.getAmountSpent();
        return f.putJSONArray(f.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", eVar.getPurchases(), C0066b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> list) {
        pc.j.e(list, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(h hVar) {
        pc.j.e(hVar, "subscription");
        JSONObject putSafe = f.putSafe(new JSONObject(), "id", hVar.getId());
        gb.j type = hVar.getType();
        return f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(f.putSafe(putSafe, n.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", hVar.getToken()), "enabled", hVar.getEnabled()), "notification_types", hVar.getNotificationTypes()), "sdk", hVar.getSdk()), "device_model", hVar.getDeviceModel()), "device_os", hVar.getDeviceOS()), "rooted", hVar.getRooted()), "net_type", hVar.getNetType()), "carrier", hVar.getCarrier()), "app_version", hVar.getAppVersion());
    }
}
