package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b4 extends ag {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) b4.class);
    public final String c;

    public b4(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) v9Var;
        if (StringUtils.isNullOrBlank(a4Var.f) || !a4Var.f.equals(this.c)) {
            return false;
        }
        return this.a.a(v9Var);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject b = super.b();
        try {
            b.put("type", "custom_event_property");
            JSONObject jSONObject = b.getJSONObject("data");
            jSONObject.put("event_name", this.c);
            b.put("data", jSONObject);
            return b;
        } catch (JSONException e) {
            BrazeLogger.e(d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e);
            return b;
        }
    }
}
