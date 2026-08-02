package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class pe implements Function1 {
    public final /* synthetic */ JSONArray a;

    public pe(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof String);
    }
}
