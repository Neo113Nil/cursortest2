package com.iab.omid.library.toponad.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.toponad.adsession.OutputDeviceStatus;
import com.iab.omid.library.toponad.walking.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f36290a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f36291b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f36292c = Resources.getSystem().getDisplayMetrics().density;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36293a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f36293a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f36294a;

        /* renamed from: b, reason: collision with root package name */
        final float f36295b;

        public b(float f3, float f9) {
            this.f36294a = f3;
            this.f36295b = f9;
        }
    }

    public static float a(int i) {
        return i / f36292c;
    }

    public static void b(JSONObject jSONObject) {
        b a9 = a(jSONObject);
        try {
            jSONObject.put("width", a9.f36294a);
            jSONObject.put("height", a9.f36295b);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f36291b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float f3;
        float f9;
        if (f36290a != null) {
            Point point = new Point(0, 0);
            f36290a.getDefaultDisplay().getRealSize(point);
            f3 = a(point.x);
            f9 = a(point.y);
        } else {
            f3 = 0.0f;
            f9 = 0.0f;
        }
        return new b(f3, f9);
    }

    public static void b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e9) {
                d.a("Error with setting is picture-in-picture active", e9);
            }
        }
    }

    public static JSONObject a(int i, int i6, int i9, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i6));
            jSONObject.put("width", a(i9));
            jSONObject.put("height", a(i10));
            return jSONObject;
        } catch (JSONException e9) {
            d.a("Error with creating viewStateObject", e9);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e9) {
            d.a("Error with setting not visible reason", e9);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f36292c = context.getResources().getDisplayMetrics().density;
            f36290a = (WindowManager) context.getSystemService("window");
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e9) {
            d.a("Error with setting output device status", e9);
        }
    }

    public static void a(JSONObject jSONObject, a.C0172a c0172a) {
        com.iab.omid.library.toponad.internal.e a9 = c0172a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0172a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a9.d());
            jSONObject.put("friendlyObstructionPurpose", a9.b());
            jSONObject.put("friendlyObstructionReason", a9.a());
        } catch (JSONException e9) {
            d.a("Error with setting friendly obstruction", e9);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e9) {
            d.a("Error with setting has window focus", e9);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e9) {
            d.a("Error with setting ad session id", e9);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e9) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e9);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f36293a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
