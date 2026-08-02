package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xb extends ag {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) xb.class);
    public final String c;

    public xb(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof wb) || StringUtils.isNullOrBlank(this.c)) {
            return false;
        }
        wb wbVar = (wb) v9Var;
        if (!StringUtils.isNullOrBlank(wbVar.f) && wbVar.f.equals(this.c)) {
            return this.a.a(v9Var);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject b = super.b();
        try {
            b.put("type", "purchase_property");
            JSONObject jSONObject = b.getJSONObject("data");
            jSONObject.put("product_id", this.c);
            b.put("data", jSONObject);
            return b;
        } catch (JSONException e) {
            BrazeLogger.e(d, "Caught exception creating Json.", e);
            return b;
        }
    }
}
