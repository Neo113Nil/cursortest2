package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lb implements IPutIntoJson, l9 {
    public final String a;
    public final Boolean b;
    public final jb c;

    public lb(String str, Boolean bool, jb jbVar) {
        this.a = str;
        this.b = bool;
        this.c = jbVar;
    }

    public final boolean b() {
        return this.b != null;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.a);
        }
        Boolean bool = this.b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        jb jbVar = this.c;
        if (jbVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", jbVar.a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        jb jbVar;
        JSONObject propertiesJSONObject = getPropertiesJSONObject();
        if (propertiesJSONObject.length() == 0) {
            return true;
        }
        if (this.b == null && (jbVar = this.c) != null) {
            return !jbVar.b;
        }
        if (propertiesJSONObject.length() == 1) {
            return propertiesJSONObject.has("user_id");
        }
        return false;
    }
}
