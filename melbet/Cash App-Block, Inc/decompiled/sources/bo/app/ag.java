package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ag implements u9 {
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) ag.class);
    public final i a;

    public ag(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new tb(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new ib(arrayList2));
        }
        this.a = new i(arrayList);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.a.getJsonObject());
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.e(b, "Caught exception creating Json.", e);
            return jSONObject;
        }
    }
}
