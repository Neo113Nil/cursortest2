package bo.app;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class r7$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;

    public /* synthetic */ r7$$ExternalSyntheticLambda0(Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String removeSingleSubscription$lambda$0;
        String addSingleSynchronousSubscription$lambda$0;
        int i = this.$r8$classId;
        Class cls = this.f$0;
        switch (i) {
            case 0:
                return r7.b(cls);
            case 1:
                return r7.c(cls);
            case 2:
                return r7.d(cls);
            case 3:
                removeSingleSubscription$lambda$0 = Braze.removeSingleSubscription$lambda$0(cls);
                return removeSingleSubscription$lambda$0;
            default:
                addSingleSynchronousSubscription$lambda$0 = Braze.addSingleSynchronousSubscription$lambda$0(cls);
                return addSingleSynchronousSubscription$lambda$0;
        }
    }
}
