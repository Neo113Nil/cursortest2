package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v3 implements Function1 {
    public final /* synthetic */ JSONArray a;

    public v3(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
