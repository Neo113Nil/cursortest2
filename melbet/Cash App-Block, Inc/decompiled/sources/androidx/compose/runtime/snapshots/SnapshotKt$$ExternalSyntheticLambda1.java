package androidx.compose.runtime.snapshots;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SnapshotKt$$ExternalSyntheticLambda1(Function1 function1, Function1 function12, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        Function1 function12 = this.f$0;
        switch (i) {
            case 0:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
