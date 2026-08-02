package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public final ArrayList a(JSONArray jSONArray) {
        c cVar;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("banner_id");
                long j = jSONObject.getLong("dismissal_time");
                string2.getClass();
                arrayList.add(new d(string2, j));
                cVar = this;
            } catch (Exception e) {
                cVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) cVar, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda0(i, jSONArray, 0), 4, (Object) null);
            }
            i++;
            this = cVar;
        }
        return arrayList;
    }

    public static final String a(int i, JSONArray jSONArray) {
        return "Skipping malformed acknowledged dismissal at index " + i + " in array " + jSONArray;
    }
}
