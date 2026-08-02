package bo.app;

import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class z4$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ z4$$ExternalSyntheticLambda3(int i, boolean z, boolean z2) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        boolean z2 = this.f$0;
        switch (i) {
            case 0:
                return z4.a(z2, z);
            default:
                return Updater.mutableStateOf$default(Boolean.valueOf(z2 && z));
        }
    }
}
