package defpackage;

import com.google.gson.JsonSyntaxException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sv8 {
    public final qc9 a;

    public sv8(qc9 qc9Var) {
        this.a = qc9Var;
    }

    public final rv8 a(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        boolean has = jSONObject.has("card");
        qc9 qc9Var = this.a;
        if (!has) {
            int i = rv8.i;
            return fgq.y(qc9Var, jSONObject);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("templates");
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        if (optJSONObject != null) {
            qc9Var.e(optJSONObject);
        }
        int i2 = rv8.i;
        jSONObject2.getClass();
        return fgq.y(qc9Var, jSONObject2);
    }

    public final xyo b(String str) {
        str.getClass();
        try {
            return new wyo(a(str));
        } catch (JsonSyntaxException e) {
            return new vyo(null, e);
        } catch (z7k e2) {
            return new vyo(null, e2);
        }
    }
}
