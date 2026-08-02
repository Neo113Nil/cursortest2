package bo.app;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class l3 implements Function1 {
    public final /* synthetic */ JSONArray a;

    public l3(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.a.opt(((Number) obj).intValue())));
    }
}
