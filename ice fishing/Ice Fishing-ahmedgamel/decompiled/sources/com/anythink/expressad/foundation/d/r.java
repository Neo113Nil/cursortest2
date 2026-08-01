package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18870a = "amount_max";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18871b = "callback_rule";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18872c = "virtual_currency";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18873d = "amount";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18874e = "icon";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18875f = "currency_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18876g = "name";

    /* renamed from: h, reason: collision with root package name */
    private int f18877h = 0;
    private int i = 1;

    /* renamed from: j, reason: collision with root package name */
    private String f18878j = "";

    /* renamed from: k, reason: collision with root package name */
    private int f18879k = 1;

    /* renamed from: l, reason: collision with root package name */
    private String f18880l = "";

    /* renamed from: m, reason: collision with root package name */
    private int f18881m = 1;

    /* renamed from: n, reason: collision with root package name */
    private String f18882n = "Virtual Item";

    private void c(int i) {
        this.f18879k = i;
    }

    private int d() {
        return this.f18877h;
    }

    private int e() {
        return this.i;
    }

    private String f() {
        return this.f18878j;
    }

    private String g() {
        return this.f18880l;
    }

    private int h() {
        return this.f18881m;
    }

    public final int a() {
        return this.f18879k;
    }

    public final String b() {
        return this.f18882n;
    }

    private void a(int i) {
        this.f18877h = i;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(String str) {
        this.f18880l = str;
    }

    private void d(int i) {
        this.f18881m = i;
    }

    public static r a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            r rVar = new r();
            rVar.f18877h = jSONObject.optInt("amount_max", 0);
            rVar.i = jSONObject.optInt("callback_rule", 1);
            rVar.f18878j = jSONObject.optString("virtual_currency", "");
            rVar.f18880l = jSONObject.optString("icon", "");
            rVar.f18881m = jSONObject.optInt("currency_id", 1);
            if (jSONObject.has("amount")) {
                rVar.f18879k = jSONObject.optInt("amount", 1);
            }
            if (jSONObject.has("name")) {
                rVar.f18882n = jSONObject.optString("name", "Virtual Item");
            }
            return rVar;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private void b(String str) {
        this.f18878j = str;
    }

    private void d(String str) {
        this.f18882n = str;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount_max", this.f18877h);
            jSONObject.put("callback_rule", this.i);
            jSONObject.put("virtual_currency", this.f18878j);
            jSONObject.put("amount", this.f18879k);
            jSONObject.put("icon", this.f18880l);
            jSONObject.put("currency_id", this.f18881m);
            jSONObject.put("name", this.f18882n);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    private static r a(JSONObject jSONObject) {
        r rVar = new r();
        rVar.f18877h = jSONObject.optInt("amount_max", 0);
        rVar.i = jSONObject.optInt("callback_rule", 1);
        rVar.f18878j = jSONObject.optString("virtual_currency", "");
        rVar.f18880l = jSONObject.optString("icon", "");
        rVar.f18881m = jSONObject.optInt("currency_id", 1);
        if (jSONObject.has("amount")) {
            rVar.f18879k = jSONObject.optInt("amount", 1);
        }
        if (jSONObject.has("name")) {
            rVar.f18882n = jSONObject.optString("name", "Virtual Item");
        }
        return rVar;
    }
}
