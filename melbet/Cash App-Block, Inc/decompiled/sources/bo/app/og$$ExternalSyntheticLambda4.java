package bo.app;

import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class og$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSONArray f$0;

    public /* synthetic */ og$$ExternalSyntheticLambda4(int i, JSONArray jSONArray) {
        this.$r8$classId = i;
        this.f$0 = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        JSONArray jSONArray = this.f$0;
        switch (i) {
            case 0:
                return og.b(jSONArray);
            default:
                return com.braze.support.c.c(jSONArray);
        }
    }
}
