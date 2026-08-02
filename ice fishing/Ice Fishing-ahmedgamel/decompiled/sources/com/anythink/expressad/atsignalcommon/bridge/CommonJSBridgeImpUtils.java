package com.anythink.expressad.atsignalcommon.bridge;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CommonJSBridgeImpUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18735a = "CommonJSBridgeImpUtils";

    /* renamed from: b, reason: collision with root package name */
    public static int f18736b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f18737c = 1;

    public static /* synthetic */ void a(String str, d dVar) {
        if (f.f19918n == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19910e);
    }

    private static void b(String str, d dVar) {
        if (f.f19918n == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19910e);
    }

    public static String buildClickJsonObject(float f2, float f9) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(a.cg, v.a(t.b().g(), f2));
            jSONObject2.put(a.ch, v.a(t.b().g(), f9));
            jSONObject2.put(a.cj, 0);
            jSONObject2.put(a.ck, t.b().g().getResources().getConfiguration().orientation);
            jSONObject2.put(a.cl, v.c(t.b().g()));
            jSONObject.put(a.ci, jSONObject2);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18737c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18736b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    public static String codeToJsonString(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            d b9 = d.b(optJSONObject);
            if (b9 == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(b9);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void updateFrequence(final d dVar) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonJSBridgeImpUtils.a(d.this.L(), d.this);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }).start();
    }
}
