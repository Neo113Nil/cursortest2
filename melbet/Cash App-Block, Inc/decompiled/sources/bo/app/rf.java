package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class rf implements Function1 {
    public final /* synthetic */ JSONArray a;

    public rf(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (String) obj2;
        }
        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.String");
        return null;
    }
}
