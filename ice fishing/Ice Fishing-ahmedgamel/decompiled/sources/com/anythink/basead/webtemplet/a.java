package com.anythink.basead.webtemplet;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11416a = "a";

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            com.anythink.basead.webtemplet.a.c.a().b(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static void b(Object obj, String str) {
        try {
            com.anythink.basead.webtemplet.a.c.a().a(obj, str);
        } catch (Exception e9) {
            a(obj, e9.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            new JSONObject().put("data", jSONObject);
            com.anythink.basead.webtemplet.a.c.a().a(obj, jSONObject.toString());
        } catch (Exception e9) {
            a(obj, e9.getMessage());
        }
    }
}
