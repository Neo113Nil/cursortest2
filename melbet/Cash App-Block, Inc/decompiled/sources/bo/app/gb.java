package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gb implements u9 {
    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        return v9Var instanceof hb;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "open");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
