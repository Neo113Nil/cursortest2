package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19657a = "amount_max";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19658b = "callback_rule";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19659c = "virtual_currency";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19660d = "amount";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19661e = "icon";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19662f = "currency_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19663g = "name";

    /* renamed from: h, reason: collision with root package name */
    private int f19664h = 0;
    private int i = 1;

    /* renamed from: j, reason: collision with root package name */
    private String f19665j = "";

    /* renamed from: k, reason: collision with root package name */
    private int f19666k = 1;

    /* renamed from: l, reason: collision with root package name */
    private String f19667l = "";

    /* renamed from: m, reason: collision with root package name */
    private int f19668m = 1;

    /* renamed from: n, reason: collision with root package name */
    private String f19669n = "Virtual Item";

    private void c(int i) {
        this.f19666k = i;
    }

    private int d() {
        return this.f19664h;
    }

    private int e() {
        return this.i;
    }

    private String f() {
        return this.f19665j;
    }

    private String g() {
        return this.f19667l;
    }

    private int h() {
        return this.f19668m;
    }

    public final int a() {
        return this.f19666k;
    }

    public final String b() {
        return this.f19669n;
    }

    private void a(int i) {
        this.f19664h = i;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(String str) {
        this.f19667l = str;
    }

    private void d(int i) {
        this.f19668m = i;
    }

    public static r a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            r rVar = new r();
            rVar.f19664h = jSONObject.optInt("amount_max", 0);
            rVar.i = jSONObject.optInt("callback_rule", 1);
            rVar.f19665j = jSONObject.optString("virtual_currency", "");
            rVar.f19667l = jSONObject.optString("icon", "");
            rVar.f19668m = jSONObject.optInt("currency_id", 1);
            if (jSONObject.has("amount")) {
                rVar.f19666k = jSONObject.optInt("amount", 1);
            }
            if (jSONObject.has("name")) {
                rVar.f19669n = jSONObject.optString("name", "Virtual Item");
            }
            return rVar;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private void b(String str) {
        this.f19665j = str;
    }

    private void d(String str) {
        this.f19669n = str;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount_max", this.f19664h);
            jSONObject.put("callback_rule", this.i);
            jSONObject.put("virtual_currency", this.f19665j);
            jSONObject.put("amount", this.f19666k);
            jSONObject.put("icon", this.f19667l);
            jSONObject.put("currency_id", this.f19668m);
            jSONObject.put("name", this.f19669n);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    private static r a(JSONObject jSONObject) {
        r rVar = new r();
        rVar.f19664h = jSONObject.optInt("amount_max", 0);
        rVar.i = jSONObject.optInt("callback_rule", 1);
        rVar.f19665j = jSONObject.optString("virtual_currency", "");
        rVar.f19667l = jSONObject.optString("icon", "");
        rVar.f19668m = jSONObject.optInt("currency_id", 1);
        if (jSONObject.has("amount")) {
            rVar.f19666k = jSONObject.optInt("amount", 1);
        }
        if (jSONObject.has("name")) {
            rVar.f19669n = jSONObject.optString("name", "Virtual Item");
        }
        return rVar;
    }
}
