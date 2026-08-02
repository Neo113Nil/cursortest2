package bo.app;

import com.braze.Braze;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class u4$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelayedInitializationAnalyticsBehavior f$0;

    public /* synthetic */ u4$$ExternalSyntheticLambda2(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i) {
        this.$r8$classId = i;
        this.f$0 = delayedInitializationAnalyticsBehavior;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String enableDelayedInitialization$lambda$3;
        int i = this.$r8$classId;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = this.f$0;
        switch (i) {
            case 0:
                return u4.a(delayedInitializationAnalyticsBehavior);
            default:
                enableDelayedInitialization$lambda$3 = Braze.Companion.enableDelayedInitialization$lambda$3(delayedInitializationAnalyticsBehavior);
                return enableDelayedInitialization$lambda$3;
        }
    }
}
