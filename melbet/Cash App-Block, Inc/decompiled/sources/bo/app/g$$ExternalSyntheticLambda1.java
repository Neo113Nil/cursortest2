package bo.app;

import com.braze.support.BrazeImageUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Exception f$0;

    public /* synthetic */ g$$ExternalSyntheticLambda1(int i, Exception exc) {
        this.$r8$classId = i;
        this.f$0 = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String localBitmap$lambda$7;
        int i = this.$r8$classId;
        Exception exc = this.f$0;
        switch (i) {
            case 0:
                return g.a(exc);
            case 1:
                return j6.a(exc);
            default:
                localBitmap$lambda$7 = BrazeImageUtils.getLocalBitmap$lambda$7(exc);
                return localBitmap$lambda$7;
        }
    }
}
