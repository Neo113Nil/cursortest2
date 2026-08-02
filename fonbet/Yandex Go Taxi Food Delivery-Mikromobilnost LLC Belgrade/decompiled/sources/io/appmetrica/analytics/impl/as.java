package io.appmetrica.analytics.impl;

import defpackage.w511;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class as {
    public final bs a;

    public as(Ih ih, es esVar, String str) {
        this.a = new bs(ih, esVar, new w511(21));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", Vc.a(jSONObject2, "report_request_id", Vc.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", Vc.a(jSONObject2, "open_id", Vc.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", Vc.a(jSONObject2, "attribution_id", Vc.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", Vc.a(jSONObject2, "last_migration_api_level", Vc.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(int i) {
        JSONObject a = this.a.a();
        if (a.optInt("attribution_id", 1) == i) {
            return;
        }
        this.a.a(a.put("attribution_id", i));
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized void c(int i) {
        JSONObject a = this.a.a();
        if (a.optInt("last_migration_api_level", 0) != i) {
            this.a.a(a.put("last_migration_api_level", i));
        }
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized void d(int i) {
        JSONObject a = this.a.a();
        if (a.optInt("open_id", 1) != i) {
            this.a.a(a.put("open_id", i));
        }
    }

    public final synchronized boolean d() {
        return this.a.a().optBoolean("init_event_done", false);
    }

    public final synchronized boolean c() {
        return this.a.a().optBoolean("first_event_done", false);
    }

    public final synchronized int b() {
        return this.a.a().optInt("open_id", 1);
    }

    public final synchronized void b(long j) {
        JSONObject a = this.a.a();
        if (a.optLong("session_id", -1L) != j) {
            this.a.a(a.put("session_id", j));
        }
    }

    public final synchronized int a() {
        return this.a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(long j) {
        JSONObject a = this.a.a();
        if (a.optLong("external_attribution_window_start", -1L) != j) {
            this.a.a(a.put("external_attribution_window_start", j));
        }
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized long a(int i) {
        long optLong;
        try {
            JSONObject a = this.a.a();
            JSONObject optJSONObject = a.optJSONObject("numbers_of_type");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optLong = optJSONObject.optLong(String.valueOf(i));
            optJSONObject.put(String.valueOf(i), 1 + optLong);
            this.a.a(a.put("numbers_of_type", optJSONObject));
        } catch (Throwable th) {
            throw th;
        }
        return optLong;
    }
}
