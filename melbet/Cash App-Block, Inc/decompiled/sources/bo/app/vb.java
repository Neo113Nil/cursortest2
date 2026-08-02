package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vb implements u9 {
    public final String a;

    public vb(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull("product_id")) {
            return;
        }
        this.a = optJSONObject.optString("product_id", null);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof wb)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.a)) {
            return true;
        }
        wb wbVar = (wb) v9Var;
        return !StringUtils.isNullOrBlank(wbVar.f) && wbVar.f.equals(this.a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
