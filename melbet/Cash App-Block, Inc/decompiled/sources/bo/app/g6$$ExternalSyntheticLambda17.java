package bo.app;

import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g6$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Integer f$0;

    public /* synthetic */ g6$$ExternalSyntheticLambda17(int i, Integer num) {
        this.$r8$classId = i;
        this.f$0 = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String resetAfterInAppMessageClose$lambda$1;
        int i = this.$r8$classId;
        Integer num = this.f$0;
        switch (i) {
            case 0:
                return g6.b(num);
            default:
                resetAfterInAppMessageClose$lambda$1 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$1(num);
                return resetAfterInAppMessageClose$lambda$1;
        }
    }
}
