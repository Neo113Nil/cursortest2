package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static String f19317c = "a";

    /* renamed from: a, reason: collision with root package name */
    public int f19318a;

    /* renamed from: b, reason: collision with root package name */
    public int f19319b;

    private void a(int i) {
        this.f19318a = i;
    }

    private int b() {
        return this.f19318a;
    }

    private int c() {
        return this.f19319b;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            if (jSONObject.has("hlp")) {
                aVar.f19319b = jSONObject.optInt("hlp");
            }
            if (jSONObject.has(com.anythink.expressad.foundation.g.g.a.b.aw)) {
                aVar.f19318a = jSONObject.optInt(com.anythink.expressad.foundation.g.g.a.b.aw);
            }
            return aVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void b(int i) {
        this.f19319b = i;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.f19319b);
            jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.aw, this.f19318a);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
