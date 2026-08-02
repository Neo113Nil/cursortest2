package defpackage;

import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import yads.hc1;

/* loaded from: classes7.dex */
public abstract class xf71 {
    public static final zcx a = tje.a(sbx.d, hc1.w);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object failure;
        try {
            failure = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Integer) failure;
    }

    public static MapBuilder b(JSONObject jSONObject) {
        MapBuilder mapBuilder = new MapBuilder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null && optString.length() != 0 && !"null".equals(optString)) {
                mapBuilder.put(next, optString);
            }
        }
        return mapBuilder.j();
    }

    public static final JSONObject c(String str) {
        Object failure;
        try {
            failure = new JSONObject(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (JSONObject) failure;
    }

    public static ListBuilder d(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ListBuilder a2 = rcc.a();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (optString != null && optString.length() != 0 && !"null".equals(optString)) {
                a2.add(optString);
            }
        }
        return a2.j();
    }
}
