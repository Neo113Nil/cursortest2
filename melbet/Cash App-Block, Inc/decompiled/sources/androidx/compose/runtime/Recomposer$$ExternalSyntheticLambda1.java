package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class Recomposer$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Recomposer f$0;

    public /* synthetic */ Recomposer$$ExternalSyntheticLambda1(Recomposer recomposer, int i) {
        this.$r8$classId = i;
        this.f$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Recomposer recomposer = this.f$0;
        switch (i) {
            case 0:
                recomposer.onNewFrameAwaiter();
                break;
            default:
                recomposer.onNewFrameAwaiter();
                break;
        }
        return Unit.INSTANCE;
    }
}
