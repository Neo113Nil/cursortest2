package androidx.compose.runtime.snapshots;

import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class Snapshot$Companion$$ExternalSyntheticLambda0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ Snapshot$Companion$$ExternalSyntheticLambda0(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    public final void dispose() {
        int i = this.$r8$classId;
        Function function = this.f$0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) function;
                synchronized (SnapshotKt.lock) {
                    SnapshotKt.globalWriteObservers = CollectionsKt.minus(SnapshotKt.globalWriteObservers, function1);
                }
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                return;
            default:
                Function2 function2 = (Function2) function;
                synchronized (SnapshotKt.lock) {
                    SnapshotKt.applyObservers = CollectionsKt.minus(SnapshotKt.applyObservers, function2);
                }
                return;
        }
    }
}
