package bo.app;

import com.braze.BrazeUser;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda21 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ JSONObject f$1;

    public /* synthetic */ j1$$ExternalSyntheticLambda21(String str, JSONObject jSONObject, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String customUserAttribute$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                return j1.b(this.f$0, this.f$1);
            default:
                customUserAttribute$lambda$6 = BrazeUser.setCustomUserAttribute$lambda$6(this.f$0, this.f$1);
                return customUserAttribute$lambda$6;
        }
    }
}
