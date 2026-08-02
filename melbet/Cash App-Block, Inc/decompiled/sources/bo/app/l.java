package bo.app;

import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l {
    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize banner Json: " + jSONObject;
    }

    public final Banner a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(0), 6, (Object) null);
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("banner");
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(2), 6, (Object) null);
                return null;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("properties");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            JSONObject jSONObject2 = optJSONObject2;
            if (!optJSONObject.isNull("stable_key")) {
                String optString = optJSONObject.optString("stable_key");
                if (optString.length() != 0) {
                    str = optString;
                    String string2 = optJSONObject.getString("id");
                    string2.getClass();
                    String string3 = optJSONObject.getString("placement_id");
                    string3.getClass();
                    String string4 = optJSONObject.getString("html");
                    string4.getClass();
                    return new Banner(string2, string3, string4, optJSONObject.getBoolean("is_control"), optJSONObject.getLong("expires_at"), optJSONObject.getBoolean("is_test_send"), str, jSONObject2);
                }
            }
            str = null;
            String string22 = optJSONObject.getString("id");
            string22.getClass();
            String string32 = optJSONObject.getString("placement_id");
            string32.getClass();
            String string42 = optJSONObject.getString("html");
            string42.getClass();
            return new Banner(string22, string32, string42, optJSONObject.getBoolean("is_control"), optJSONObject.getLong("expires_at"), optJSONObject.getBoolean("is_test_send"), str, jSONObject2);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 0), 4, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}
