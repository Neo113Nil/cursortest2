package bo.app;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ea implements u9 {
    public final String a;
    public final HashSet b = new HashSet();

    public ea(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.a = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.b.add(optJSONArray.getString(i));
            }
        }
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (v9Var instanceof fa) {
            fa faVar = (fa) v9Var;
            if (!StringUtils.isNullOrBlank(faVar.e) && faVar.e.equals(this.a)) {
                int size = this.b.size();
                String str = faVar.f;
                return size > 0 ? !StringUtils.isNullOrBlank(str) && this.b.contains(faVar.f) : StringUtils.isNullOrBlank(str);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.a);
            if (this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
