package androidx.work.impl;

import android.content.Context;
import androidx.tracing.Trace;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements Function6 {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1(6, Trace.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        Configuration configuration = (Configuration) obj2;
        TaskExecutor taskExecutor = (TaskExecutor) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        Trackers trackers = (Trackers) obj5;
        Processor processor = (Processor) obj6;
        context.getClass();
        configuration.getClass();
        taskExecutor.getClass();
        workDatabase.getClass();
        trackers.getClass();
        processor.getClass();
        String str = Schedulers.TAG;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workDatabase, configuration);
        PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
        Logger$LogcatLogger.get().debug(Schedulers.TAG, "Created SystemJobScheduler and enabled SystemJobService");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Scheduler[]{systemJobScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor)});
    }
}
