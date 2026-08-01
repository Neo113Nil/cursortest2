package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static String f18530c = "a";

    /* renamed from: a, reason: collision with root package name */
    public int f18531a;

    /* renamed from: b, reason: collision with root package name */
    public int f18532b;

    private void a(int i) {
        this.f18531a = i;
    }

    private int b() {
        return this.f18531a;
    }

    private int c() {
        return this.f18532b;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            if (jSONObject.has("hlp")) {
                aVar.f18532b = jSONObject.optInt("hlp");
            }
            if (jSONObject.has(com.anythink.expressad.foundation.g.g.a.b.aw)) {
                aVar.f18531a = jSONObject.optInt(com.anythink.expressad.foundation.g.g.a.b.aw);
            }
            return aVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void b(int i) {
        this.f18532b = i;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.f18532b);
            jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.aw, this.f18531a);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
