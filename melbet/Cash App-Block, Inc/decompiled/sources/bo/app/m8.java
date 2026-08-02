package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m8 implements Function1 {
    public final /* synthetic */ JSONArray a;

    public m8(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type org.json.JSONObject");
        return null;
    }
}
