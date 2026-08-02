package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ia implements Function1 {
    public final /* synthetic */ JSONArray a;

    public ia(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
