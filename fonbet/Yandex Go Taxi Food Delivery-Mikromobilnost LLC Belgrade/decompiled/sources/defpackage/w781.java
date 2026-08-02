package defpackage;

import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class w781 {
    public static ListBuilder a(JSONArray jSONArray) {
        Object failure;
        ListBuilder a = rcc.a();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                failure = jSONArray.getString(i);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                a.add((String) failure);
            }
        }
        return a.j();
    }
}
