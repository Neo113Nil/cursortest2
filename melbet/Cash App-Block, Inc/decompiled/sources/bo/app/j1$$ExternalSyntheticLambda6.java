package bo.app;

import com.braze.BrazeUser;
import com.braze.support.BrazeFileUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ j1$$ExternalSyntheticLambda6(int i, String str) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String incrementCustomUserAttribute$lambda$0;
        String downloadFileToPath$lambda$4;
        int i = this.$r8$classId;
        String str = this.f$0;
        int i2 = this.f$1;
        switch (i) {
            case 0:
                return j1.b(str, i2);
            case 1:
                incrementCustomUserAttribute$lambda$0 = BrazeUser.incrementCustomUserAttribute$lambda$0(str, i2);
                return incrementCustomUserAttribute$lambda$0;
            default:
                downloadFileToPath$lambda$4 = BrazeFileUtils.downloadFileToPath$lambda$4(i2, str);
                return downloadFileToPath$lambda$4;
        }
    }

    public /* synthetic */ j1$$ExternalSyntheticLambda6(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }
}
