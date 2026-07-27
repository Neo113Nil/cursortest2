package com.anythink.core.common;

import com.anythink.core.d.l;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f13039a = "e";

    /* renamed from: b, reason: collision with root package name */
    public static final String f13040b = "cp_event_callback_info";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13041c = "type_start_load";

    private static JSONObject a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(l.a.f17559T, str);
                jSONObject.put("request_id", str2);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void a(Object obj, String str, String str2, String str3, String str4) {
        if (obj == null) {
            return;
        }
        obj.toString();
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONObject a9 = a(str3, str4);
                if (a9 != null) {
                    map.put(str, a9);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Object obj, String str, com.anythink.core.common.h.n nVar) {
        if (nVar == null) {
            return;
        }
        a(obj, str, nVar.aI(), nVar.aB(), nVar.aJ());
    }

    public static void a(Map<String, Object> map, String str, String str2, String str3, String str4) {
        if (map == null) {
            return;
        }
        a(map.get(f13040b), str, str2, str3, str4);
    }
}
