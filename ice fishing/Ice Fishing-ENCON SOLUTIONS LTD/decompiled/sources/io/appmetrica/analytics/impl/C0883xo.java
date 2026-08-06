package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883xo {

    /* renamed from: a, reason: collision with root package name */
    public final C0909yo f7214a;

    public C0883xo(We we, Bo bo, String str) {
        this.f7214a = new C0909yo(we, bo, new H0.b(21));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC0430gb.a(jSONObject2, "report_request_id", AbstractC0430gb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC0430gb.a(jSONObject2, "open_id", AbstractC0430gb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC0430gb.a(jSONObject2, "attribution_id", AbstractC0430gb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC0430gb.a(jSONObject2, "last_migration_api_level", AbstractC0430gb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j2) {
        C0909yo c0909yo = this.f7214a;
        c0909yo.a(c0909yo.a().put("session_id", j2));
    }

    public final synchronized boolean c() {
        return this.f7214a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f7214a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f7214a.a().optInt("open_id", 1);
    }

    public final synchronized void c(int i2) {
        C0909yo c0909yo = this.f7214a;
        c0909yo.a(c0909yo.a().put("open_id", i2));
    }

    public final synchronized void b(int i2) {
        C0909yo c0909yo = this.f7214a;
        c0909yo.a(c0909yo.a().put("last_migration_api_level", i2));
    }

    public final synchronized int a() {
        return this.f7214a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i2) {
        C0909yo c0909yo = this.f7214a;
        c0909yo.a(c0909yo.a().put("attribution_id", i2));
    }

    public final synchronized void a(long j2) {
        C0909yo c0909yo = this.f7214a;
        c0909yo.a(c0909yo.a().put("external_attribution_window_start", j2));
    }
}
