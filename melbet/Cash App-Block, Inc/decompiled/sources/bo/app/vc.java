package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vc implements q9 {
    public final int a;

    public vc(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optInt("re_eligibility", -1);
    }

    public static final String b() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            return new JSONObject().put("re_eligibility", this.a);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(24), 4, (Object) null);
            return null;
        }
    }
}
