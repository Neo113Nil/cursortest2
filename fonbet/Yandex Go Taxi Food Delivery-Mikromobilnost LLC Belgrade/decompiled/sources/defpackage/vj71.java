package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import yads.ik2;

/* loaded from: classes7.dex */
public final class vj71 {
    public static rr41 a(String str) {
        new ik2();
        JSONObject jSONObject = new JSONObject(i771.b(str));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return new rr41(20, hashMap, string);
    }
}
