package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mb implements IPutIntoJson, l9 {
    public final JSONObject a;
    public final JSONArray b;

    public mb(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        this.b = new JSONArray().put(jSONObject);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONArray jSONArray = this.b;
        jSONArray.getClass();
        return jSONArray;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        if (this.a.length() == 0) {
            return true;
        }
        return this.a.length() == 1 && this.a.has("user_id");
    }
}
