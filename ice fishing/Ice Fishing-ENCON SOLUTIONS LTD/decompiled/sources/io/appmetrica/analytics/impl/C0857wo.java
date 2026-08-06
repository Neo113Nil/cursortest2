package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857wo {

    /* renamed from: a, reason: collision with root package name */
    public final C0909yo f7161a;

    public C0857wo(Ze ze, C0300ba c0300ba) {
        this.f7161a = new C0909yo(ze, c0300ba, new H0.b(20));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC0430gb.a(jSONObject2, "last_migration_api_level", AbstractC0430gb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        C0909yo c0909yo = this.f7161a;
        c0909yo.a(c0909yo.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f7161a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        C0909yo c0909yo = this.f7161a;
        c0909yo.a(c0909yo.a().put("referrer_checked", true));
    }

    public final synchronized C0616ng b() {
        byte[] decode;
        C0616ng c0616ng;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f7161a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(z1.a.f8620a), 0);
            } catch (Throwable unused) {
            }
            c0616ng = (decode == null || decode.length == 0) ? null : new C0616ng(decode);
        }
        return c0616ng;
    }

    public final synchronized void a(String str) {
        C0909yo c0909yo = this.f7161a;
        c0909yo.a(c0909yo.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f7161a.a(), "device_id_hash");
    }

    public final synchronized void a(C0616ng c0616ng) {
        try {
            C0909yo c0909yo = this.f7161a;
            c0909yo.a(c0909yo.a().put("referrer", c0616ng != null ? new String(Base64.encode(c0616ng.a(), 0), z1.a.f8620a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
