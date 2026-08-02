package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class tc71 implements gu71 {
    public final sh81 a;
    public final hb81 b;

    public tc71(sh81 sh81Var, hb81 hb81Var) {
        this.a = sh81Var;
        this.b = hb81Var;
    }

    @Override // defpackage.gu71
    public final xh71 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        this.a.getClass();
        String a = sh81.a("url", jSONObject);
        String b = cea1.b("optOutUrl", jSONObject);
        if (b == null) {
            b = "";
        }
        String str = b;
        this.b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return new m671(optString, a, str, jSONObject.optBoolean("darkTheme"), arrayList);
    }
}
