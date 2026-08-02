package defpackage;

import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ra81 {
    public static String a(Map map) {
        Object failure;
        try {
            kdx kdxVar = new kdx();
            for (Map.Entry entry : map.entrySet()) {
                abb1.d(kdxVar, (String) entry.getKey(), (String) entry.getValue());
            }
            failure = kdxVar.a().toString();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static Map b(JSONObject jSONObject) {
        Object failure;
        try {
            failure = xf71.b(jSONObject);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Objects.toString(jSONObject);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Map) failure;
    }
}
