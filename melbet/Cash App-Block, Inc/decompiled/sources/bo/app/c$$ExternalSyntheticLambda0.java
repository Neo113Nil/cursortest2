package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class c$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ JSONArray f$1;

    public /* synthetic */ c$$ExternalSyntheticLambda0(int i, JSONArray jSONArray, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String convertStringJsonArrayToList$lambda$0;
        int i = this.$r8$classId;
        JSONArray jSONArray = this.f$1;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                return c.a(i2, jSONArray);
            default:
                convertStringJsonArrayToList$lambda$0 = JsonUtils.convertStringJsonArrayToList$lambda$0(i2, jSONArray);
                return convertStringJsonArrayToList$lambda$0;
        }
    }
}
