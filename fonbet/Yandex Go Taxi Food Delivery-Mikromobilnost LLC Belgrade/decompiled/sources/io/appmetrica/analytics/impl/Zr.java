package io.appmetrica.analytics.impl;

import android.util.Base64;
import defpackage.jl40;
import defpackage.uza;
import defpackage.w511;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final class Zr {
    public final bs a;

    public Zr(Lh lh, C0734tb c0734tb) {
        this.a = new bs(lh, c0734tb, new w511(19));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(MetaDataField.DEVICE_ID_FIELD, JsonUtils.optStringOrNullable(jSONObject2, MetaDataField.DEVICE_ID_FIELD, JsonUtils.optStringOrNull(jSONObject, MetaDataField.DEVICE_ID_FIELD)));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", Vc.a(jSONObject2, "last_migration_api_level", Vc.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        JSONObject a = this.a.a();
        if (!jl40.l(JsonUtils.optStringOrNull(a, "device_id_hash"), str)) {
            this.a.a(a.put("device_id_hash", str));
        }
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized Ui b() {
        byte[] decode;
        Ui ui;
        String optStringOrNull = JsonUtils.optStringOrNull(this.a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(uza.a), 0);
            } catch (Throwable unused) {
            }
            if (!Or.a(decode)) {
                ui = new Ui(decode);
            }
        }
        ui = null;
        return ui;
    }

    public final synchronized void a(Ui ui) {
        String str;
        if (ui != null) {
            try {
                str = new String(Base64.encode(ui.a(), 0), uza.a);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        JSONObject a = this.a.a();
        if (!jl40.l(JsonUtils.optStringOrNull(a, "referrer"), str)) {
            this.a.a(a.put("referrer", str));
        }
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized void a(String str) {
        JSONObject a = this.a.a();
        if (!jl40.l(JsonUtils.optStringOrNull(a, MetaDataField.DEVICE_ID_FIELD), str)) {
            this.a.a(a.put(MetaDataField.DEVICE_ID_FIELD, str));
        }
        bs bsVar = this.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
    }
}
