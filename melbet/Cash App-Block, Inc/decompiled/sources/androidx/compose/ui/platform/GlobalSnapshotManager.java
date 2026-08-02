package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import curtains.WindowsKt$onNextDraw$1;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class GlobalSnapshotManager {
    public static final AtomicBoolean started = new AtomicBoolean(false);
    public static final AtomicBoolean sent = new AtomicBoolean(false);

    public static void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            BufferedChannel Channel$default = PapaEvent.Channel$default(1, null, null, 6);
            JobKt.launch$default(JobKt.CoroutineScope((CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue()), null, null, new DataStoreImpl$data$1(Channel$default, (Continuation) null, 8), 3);
            WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1 = new WindowsKt$onNextDraw$1(Channel$default, 9);
            synchronized (SnapshotKt.lock) {
                SnapshotKt.globalWriteObservers = CollectionsKt.plus((Collection) SnapshotKt.globalWriteObservers, (Object) windowsKt$onNextDraw$1);
            }
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        }
    }
}
