package androidx.work;

import androidx.room.util.DBUtil;
import androidx.work.Data;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.ui.gcm.CashWorkerFactory;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class Configuration {
    public final int contentUriTriggerWorkersLimit;
    public final SystemClock inputMergerFactory;
    public final boolean isMarkingJobsAsImportantWhileForeground;
    public final int maxJobSchedulerId;
    public final int maxSchedulerLimit;
    public final int minimumLoggingLevel;
    public final MemoryCacheService runnableScheduler;
    public final SystemClock tracer;
    public final WorkerFactory workerFactory;
    public final ExecutorService executor = DBUtil.access$createDefaultExecutor(false);
    public final DefaultScheduler workerCoroutineContext = Dispatchers.Default;
    public final ExecutorService taskExecutor = DBUtil.access$createDefaultExecutor(true);
    public final SystemClock clock = new SystemClock();

    public Configuration(Data.Builder builder) {
        WorkerFactory workerFactory = (CashWorkerFactory) builder.values;
        this.workerFactory = workerFactory == null ? DefaultWorkerFactory.INSTANCE : workerFactory;
        this.inputMergerFactory = SystemClock.INSTANCE;
        this.runnableScheduler = new MemoryCacheService(20);
        this.minimumLoggingLevel = 4;
        this.maxJobSchedulerId = Integer.MAX_VALUE;
        this.maxSchedulerLimit = 20;
        this.contentUriTriggerWorkersLimit = 8;
        this.isMarkingJobsAsImportantWhileForeground = true;
        this.tracer = new SystemClock();
    }
}
