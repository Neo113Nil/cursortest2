package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.builders.SetBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import yads.tm0;

/* loaded from: classes7.dex */
public final class zi81 {
    public static String a(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uc81 uc81Var = (uc81) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", uc81Var.a.name());
            jSONObject.put("value", uc81Var.b);
            jSONArray = jSONArray.put(jSONObject);
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }

    public static Set b(JSONArray jSONArray) {
        Object failure;
        try {
            SetBuilder setBuilder = new SetBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                setBuilder.add(new uc81(tm0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            failure = setBuilder.b();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Objects.toString(jSONArray);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Set) failure;
    }
}
