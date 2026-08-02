package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class peo {
    public static final cib a;

    static {
        r4f r4fVar = new r4f();
        s92 s92Var = s92.a;
        r4fVar.a(peo.class, s92Var);
        r4fVar.a(ud2.class, s92Var);
        a = new cib(8, r4fVar);
    }

    public static ud2 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new ud2(string, string2, string3, string4, j);
    }
}
