package com.anythink.expressad.atsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18808a = "b";

    /* renamed from: b, reason: collision with root package name */
    public static int f18809b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f18810c = 1;

    /* renamed from: com.anythink.expressad.atsignalcommon.communication.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f18811a;

        public AnonymousClass1(d dVar) {
            this.f18811a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.a(this.f18811a.L(), this.f18811a);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            d b9 = d.b(optJSONObject);
            if (b9 == null) {
                a(obj, "data camapign is empty");
                return;
            }
            new Thread(new AnonymousClass1(b9)).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f18809b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put("data", jSONObject3);
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e9) {
                a(obj, e9.getMessage());
                e9.getMessage();
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    private static void b(String str, d dVar) {
        if (f.f19918n == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19910e);
    }

    private static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18809b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            a(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    private static void a(d dVar) {
        new Thread(new AnonymousClass1(dVar)).start();
    }

    private static String a(float f2, float f9) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, v.a(com.anythink.expressad.foundation.b.a.c().e(), f2));
            jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, v.a(com.anythink.expressad.foundation.b.a.c().e(), f9));
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cj, 0);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.ck, com.anythink.expressad.foundation.b.a.c().e().getResources().getConfiguration().orientation);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cl, v.c(com.anythink.expressad.foundation.b.a.c().e()));
            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, jSONObject2);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18810c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static /* synthetic */ void a(String str, d dVar) {
        if (f.f19918n == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19910e);
    }
}
