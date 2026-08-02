package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public abstract class ua implements f9 {
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) ua.class);
    public final ArrayList a;

    public ua(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONArray getPropertiesJSONObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((f9) obj).getPropertiesJSONObject());
            }
            return jSONArray;
        } catch (Exception e) {
            BrazeLogger.e(b, "Caught exception creating Json.", e);
            return jSONArray;
        }
    }
}
