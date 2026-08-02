package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zb implements u9 {
    public final String a;

    public zb(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull("campaign_id")) {
            return;
        }
        this.a = optJSONObject.optString("campaign_id", null);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof ac)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.a)) {
            return true;
        }
        ac acVar = (ac) v9Var;
        return !StringUtils.isNullOrBlank(acVar.e) && acVar.e.equals(this.a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
