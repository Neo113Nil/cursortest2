package androidx.work.impl.workers;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao_Impl;
import bo.app.c7$$ExternalSyntheticLambda6;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result.Success doWork() {
        WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(getApplicationContext());
        WorkDatabase workDatabase = instance$1.mWorkDatabase;
        workDatabase.getClass();
        WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
        WorkNameDao_Impl workNameDao = workDatabase.workNameDao();
        WorkTagDao_Impl workTagDao = workDatabase.workTagDao();
        SystemIdInfoDao_Impl systemIdInfoDao = workDatabase.systemIdInfoDao();
        instance$1.mConfiguration.clock.getClass();
        List list = (List) DBUtil.performBlocking(workSpecDao.__db, true, false, new c7$$ExternalSyntheticLambda6(System.currentTimeMillis() - 86400000, 4));
        RoomDatabase roomDatabase = workSpecDao.__db;
        List list2 = (List) DBUtil.performBlocking(roomDatabase, true, false, new TransactorKt$$ExternalSyntheticLambda0(20));
        List list3 = (List) DBUtil.performBlocking(roomDatabase, true, false, new TransactorKt$$ExternalSyntheticLambda0(23));
        if (!list.isEmpty()) {
            Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
            String str = DiagnosticsWorkerKt.TAG;
            logger$LogcatLogger.info(str, "Recently completed work:\n\n");
            Logger$LogcatLogger.get().info(str, DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, list));
        }
        if (!list2.isEmpty()) {
            Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
            String str2 = DiagnosticsWorkerKt.TAG;
            logger$LogcatLogger2.info(str2, "Running work:\n\n");
            Logger$LogcatLogger.get().info(str2, DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, list2));
        }
        if (!list3.isEmpty()) {
            Logger$LogcatLogger logger$LogcatLogger3 = Logger$LogcatLogger.get();
            String str3 = DiagnosticsWorkerKt.TAG;
            logger$LogcatLogger3.info(str3, "Enqueued work:\n\n");
            Logger$LogcatLogger.get().info(str3, DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, list3));
        }
        return ListenableWorker.Result.success();
    }
}
