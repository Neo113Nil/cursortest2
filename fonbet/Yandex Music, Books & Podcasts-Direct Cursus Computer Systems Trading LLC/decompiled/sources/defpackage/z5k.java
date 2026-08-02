package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z5k {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public z5k(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("name");
        string.getClass();
        this.a = string;
        String optString = jSONObject.optString(Constants.KEY_VALUE);
        optString.getClass();
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        optString2.getClass();
        this.d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new fak(jSONObject2));
            }
        }
        this.c = arrayList;
    }
}
