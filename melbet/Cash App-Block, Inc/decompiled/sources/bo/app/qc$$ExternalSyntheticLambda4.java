package bo.app;

import androidx.compose.foundation.text.input.TextFieldState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qc$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ qc$$ExternalSyntheticLambda4(String str, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return qc.b(this.f$0, this.f$1);
            default:
                return new TextFieldState(this.f$0, this.f$1);
        }
    }
}
