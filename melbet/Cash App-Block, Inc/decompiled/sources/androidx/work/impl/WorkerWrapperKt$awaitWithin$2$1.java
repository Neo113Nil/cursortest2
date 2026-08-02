package androidx.work.impl;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class WorkerWrapperKt$awaitWithin$2$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_awaitWithin;
    public final /* synthetic */ Object $worker;

    public /* synthetic */ WorkerWrapperKt$awaitWithin$2$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$worker = obj;
        this.$this_awaitWithin = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.$r8$classId) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    ((ListenableWorker) this.$worker).stop(((WorkerStoppedException) th).reason);
                }
                ((ListenableFuture) this.$this_awaitWithin).cancel(false);
                return Unit.INSTANCE;
            case 1:
                TextFieldState textFieldState = ((TransformedTextFieldState) this.$worker).textFieldState;
                textFieldState.notifyImeListeners.remove((TextFieldState.NotifyImeListener) this.$this_awaitWithin);
                return Unit.INSTANCE;
            default:
                SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
                synchronized (SnapshotKt.lock) {
                    j = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = 1 + j;
                }
                return new MutableSnapshot(j, snapshotIdSet, (Function1) this.$worker, (Function1) this.$this_awaitWithin);
        }
    }
}
