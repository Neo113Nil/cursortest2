package com.braze.support;

import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    public static final e a = new e();

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize feature flag Json: " + jSONObject;
    }

    public final FeatureFlag a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String string2 = jSONObject.getString("id");
            string2.getClass();
            boolean z = jSONObject.getBoolean("enabled");
            JSONObject optJSONObject = jSONObject.optJSONObject("properties");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new FeatureFlag(string2, z, optJSONObject, JsonUtils.getOptionalString(jSONObject, "fts"));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 17), 4, (Object) null);
            return null;
        }
    }
}
