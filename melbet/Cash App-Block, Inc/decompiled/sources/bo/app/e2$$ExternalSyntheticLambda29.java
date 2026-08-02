package bo.app;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2$$ExternalSyntheticLambda29 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Throwable f$0;

    public /* synthetic */ e2$$ExternalSyntheticLambda29(Throwable th, int i) {
        this.$r8$classId = i;
        this.f$0 = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String publishError$lambda$1;
        int i = this.$r8$classId;
        Throwable th = this.f$0;
        switch (i) {
            case 0:
                return e2.b(th);
            default:
                publishError$lambda$1 = Braze.publishError$lambda$1(th);
                return publishError$lambda$1;
        }
    }
}
