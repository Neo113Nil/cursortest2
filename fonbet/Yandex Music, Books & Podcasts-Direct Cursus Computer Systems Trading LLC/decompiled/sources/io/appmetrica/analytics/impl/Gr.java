package io.appmetrica.analytics.impl;

import android.util.Base64;
import defpackage.kac;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Gr {
    public final Ir a;

    public Gr(C0724vh c0724vh, C0371jb c0371jb) {
        this.a = new Ir(c0724vh, c0371jb, new kac(21));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put(Constants.KEY_REFERRER, JsonUtils.optStringOrNullable(jSONObject2, Constants.KEY_REFERRER, JsonUtils.optStringOrNull(jSONObject, Constants.KEY_REFERRER)));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", Fc.a(jSONObject2, "last_migration_api_level", Fc.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized Qi b() {
        byte[] decode;
        Qi qi;
        String optStringOrNull = JsonUtils.optStringOrNull(this.a.a(), Constants.KEY_REFERRER);
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            if (!AbstractC0734vr.a(decode)) {
                qi = new Qi(decode);
            }
        }
        qi = null;
        return qi;
    }

    public final synchronized boolean c() {
        return this.a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        Ir ir = this.a;
        ir.a(ir.a().put("referrer_checked", true));
    }

    public final synchronized void b(String str) {
        Ir ir = this.a;
        ir.a(ir.a().put("device_id_hash", str));
    }

    public final synchronized void a(String str) {
        Ir ir = this.a;
        ir.a(ir.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
    }

    public final synchronized void a(Qi qi) {
        try {
            Ir ir = this.a;
            ir.a(ir.a().put(Constants.KEY_REFERRER, qi != null ? new String(Base64.encode(qi.a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
