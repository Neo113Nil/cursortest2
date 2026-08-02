package bo.app;

import com.braze.BrazeUser;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ double f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ j1$$ExternalSyntheticLambda10(String str, double d, double d2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = d;
        this.f$2 = d2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String locationCustomAttribute$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                return j1.b(this.f$0, this.f$1, this.f$2);
            default:
                locationCustomAttribute$lambda$3 = BrazeUser.setLocationCustomAttribute$lambda$3(this.f$0, this.f$1, this.f$2);
                return locationCustomAttribute$lambda$3;
        }
    }
}
