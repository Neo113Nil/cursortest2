package com.knotapi.knot.models;

import com.knotapi.knot.Knot;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class KnotEventMapper {
    private static final Map<String, String> CASE_INSENSITIVE_EVENT_MAPPING;
    private static final Map<String, String> EVENT_SPECIAL_MAPPING;
    private static final Set<String> EXCLUDED_KEYS = new HashSet<String>() { // from class: com.knotapi.knot.models.KnotEventMapper.1
        {
            add(BreadcrumbHelper.Category.EVENT);
            add("task_id");
            add("taskID");
            add("taskId");
            add("metaData");
            add("environment");
            add("merchant");
            add("product");
            add("merchantId");
            add("sessionType");
        }
    };

    static {
        HashMap<String, String> hashMap = new HashMap<String, String>() { // from class: com.knotapi.knot.models.KnotEventMapper.2
            {
                put("onTryAgain", "USER_SELECTED_TRY_AGAIN");
                put("onErrorViewContinue", "ERROR_VIEW_CONTINUE");
                put("authentication_otp_timeout", "OTP_TIMEOUT");
                put("click_event", "ON_CLICK");
            }
        };
        EVENT_SPECIAL_MAPPING = hashMap;
        CASE_INSENSITIVE_EVENT_MAPPING = new HashMap();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            CASE_INSENSITIVE_EVENT_MAPPING.put(entry.getKey().toLowerCase(), entry.getValue());
        }
    }

    private static void extractMerchantInfo(JSONObject jSONObject, KnotEvent knotEvent) {
        try {
            String str = "";
            if (jSONObject.has("merchant")) {
                Object obj = jSONObject.get("merchant");
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String optString = jSONObject2.has("name") ? jSONObject2.optString("name", "") : "";
                    if (jSONObject2.has("id")) {
                        knotEvent.setMerchantId(jSONObject2.optString("id", ""));
                    }
                    str = optString;
                } else if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            knotEvent.setMerchantName(str);
            if (jSONObject.has("merchantId") && knotEvent.getMerchantId().isEmpty()) {
                knotEvent.setMerchantId(jSONObject.getString("merchantId"));
            }
        } catch (Exception e) {
            Reporter.error(e, "KnotEventMapper.extractMerchantInfo");
        }
    }

    private static Map<String, Object> extractMetaData(JSONObject jSONObject, String str) {
        Boolean findSendCard;
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject.has("metaData")) {
                Object obj = jSONObject.get("metaData");
                if (obj instanceof JSONObject) {
                    hashMap.putAll(jsonToMap((JSONObject) obj));
                }
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!EXCLUDED_KEYS.contains(next)) {
                    Object obj2 = jSONObject.get(next);
                    if (obj2 instanceof JSONObject) {
                        obj2 = jsonToMap((JSONObject) obj2);
                    } else if (obj2 instanceof JSONArray) {
                        obj2 = jsonToList((JSONArray) obj2);
                    }
                    hashMap.put(next, obj2);
                }
            }
            if (str.equalsIgnoreCase("AUTHENTICATED") && (findSendCard = findSendCard(hashMap)) != null) {
                hashMap.put("sendCard", findSendCard);
            }
            return hashMap;
        } catch (Exception e) {
            Reporter.error(e, "KnotEventMapper.extractMetaData");
            return hashMap;
        }
    }

    private static Boolean findSendCard(Map<String, Object> map) {
        Boolean findSendCardInList;
        Boolean findSendCard;
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((key.equals("send_card") || key.equals("sendCard")) && (value instanceof Boolean)) {
                return (Boolean) value;
            }
            if ((value instanceof Map) && (findSendCard = findSendCard((Map) value)) != null) {
                return findSendCard;
            }
            if ((value instanceof List) && (findSendCardInList = findSendCardInList((List) value)) != null) {
                return findSendCardInList;
            }
        }
        return null;
    }

    private static Boolean findSendCardInList(List<Object> list) {
        Boolean findSendCardInList;
        if (list == null) {
            return null;
        }
        for (Object obj : list) {
            if (obj instanceof Map) {
                Boolean findSendCard = findSendCard((Map) obj);
                if (findSendCard != null) {
                    return findSendCard;
                }
            } else if ((obj instanceof List) && (findSendCardInList = findSendCardInList((List) obj)) != null) {
                return findSendCardInList;
            }
        }
        return null;
    }

    public static KnotEvent fromJson(JSONObject jSONObject) {
        try {
            KnotEvent knotEvent = new KnotEvent();
            if (!jSONObject.has(BreadcrumbHelper.Category.EVENT)) {
                throw new JSONException("Event name is missing from the JSON payload");
            }
            String mapEventName = mapEventName(jSONObject.getString(BreadcrumbHelper.Category.EVENT));
            knotEvent.setEvent(mapEventName);
            knotEvent.setEnvironment(Environment.valueOf(jSONObject.getString("environment")));
            String optString = jSONObject.optString("product", jSONObject.optString("session_type", jSONObject.optString("sessionType", "")));
            if (!optString.isEmpty()) {
                knotEvent.setProduct(Knot.Product.valueOf(optString));
            }
            extractMerchantInfo(jSONObject, knotEvent);
            knotEvent.setTaskId(jSONObject.optString("task_id", jSONObject.optString("taskID", jSONObject.optString("taskId", ""))));
            knotEvent.setMetaData(extractMetaData(jSONObject, mapEventName));
            return knotEvent;
        } catch (Exception e) {
            Reporter.error(e, "KnotEventMapper.fromJson");
            return null;
        }
    }

    private static List<Object> jsonToList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    obj = jsonToMap((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = jsonToList((JSONArray) obj);
                }
                arrayList.add(obj);
            } catch (Exception e) {
                Reporter.error(e, "KnotEventMapper.jsonToList");
                return arrayList;
            }
        }
        return arrayList;
    }

    private static Map<String, Object> jsonToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            obj = jsonToMap((JSONObject) obj);
                        } else if (obj instanceof JSONArray) {
                            obj = jsonToList((JSONArray) obj);
                        }
                        hashMap.put(next, obj);
                    } catch (JSONException e) {
                        Reporter.error(e, "KnotEventMapper.jsonToMap: " + next);
                    }
                }
            } catch (Exception e2) {
                Reporter.error(e2, "KnotEventMapper.jsonToMap");
            }
        }
        return hashMap;
    }

    private static String mapEventName(String str) {
        if (str.contains("_login_x_button")) {
            return "EXIT_BUTTON_SELECTED";
        }
        if (str.contains("_login_cancel_button")) {
            return "CANCEL_BUTTON_SELECTED";
        }
        String str2 = EVENT_SPECIAL_MAPPING.get(str);
        if (str2 == null) {
            str2 = CASE_INSENSITIVE_EVENT_MAPPING.get(str.toLowerCase());
        }
        return str2 != null ? str2 : str.replaceAll("([a-z])([A-Z])", "$1_$2").replace("-", "_").replaceAll("\\s+", "_").replaceAll("[^A-Za-z0-9_]", "").toUpperCase();
    }
}
