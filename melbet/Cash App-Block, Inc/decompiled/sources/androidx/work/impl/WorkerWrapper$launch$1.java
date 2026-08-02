package androidx.work.impl;

import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.room.util.DBUtil;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class WorkerWrapper$launch$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWrapper$launch$1(WorkerWrapper workerWrapper, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        WorkerWrapper workerWrapper = this.this$0;
        switch (i) {
            case 0:
                return new WorkerWrapper$launch$1(workerWrapper, continuation, 0);
            default:
                return new WorkerWrapper$launch$1(workerWrapper, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WorkerWrapper$launch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final WorkerWrapper.Resolution failed;
        int i = this.$r8$classId;
        final WorkerWrapper workerWrapper = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JobImpl jobImpl = workerWrapper.workerJob;
                        WorkerWrapper$launch$1 workerWrapper$launch$1 = new WorkerWrapper$launch$1(workerWrapper, continuation, i2);
                        this.label = 1;
                        obj = JobKt.withContext(jobImpl, workerWrapper$launch$1, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    failed = (WorkerWrapper.Resolution) obj;
                } catch (WorkerStoppedException e) {
                    failed = new WorkerWrapper.Resolution.ResetWorkerStatus(e.reason);
                } catch (CancellationException unused) {
                    failed = new WorkerWrapper.Resolution.Failed();
                } catch (Throwable th) {
                    Logger$LogcatLogger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                    failed = new WorkerWrapper.Resolution.Failed();
                }
                Object runInTransaction = workerWrapper.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.WorkerWrapper$launch$1$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkerWrapper workerWrapper2 = workerWrapper;
                        String str = workerWrapper2.workDescription;
                        String str2 = workerWrapper2.workSpecId;
                        WorkSpecDao_Impl workSpecDao_Impl = workerWrapper2.workSpecDao;
                        WorkSpec workSpec = workerWrapper2.workSpec;
                        WorkerWrapper.Resolution resolution = WorkerWrapper.Resolution.this;
                        boolean z = true;
                        boolean z2 = false;
                        if (!(resolution instanceof WorkerWrapper.Resolution.Finished)) {
                            if (resolution instanceof WorkerWrapper.Resolution.Failed) {
                                ListenableWorker.Result result = ((WorkerWrapper.Resolution.Failed) resolution).result;
                                String str3 = WorkerWrapperKt.TAG;
                                Logger$LogcatLogger.get().info(str3, "Worker result FAILURE for " + str);
                                if (workSpec.isPeriodic()) {
                                    workerWrapper2.resetPeriodic();
                                } else {
                                    workerWrapper2.setFailed(result);
                                }
                                return Boolean.valueOf(z2);
                            }
                            if (!(resolution instanceof WorkerWrapper.Resolution.ResetWorkerStatus)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int i4 = ((WorkerWrapper.Resolution.ResetWorkerStatus) resolution).reason;
                            if (Intrinsics.areEqual(workSpec.backOffOnSystemInterruptions, Boolean.TRUE)) {
                                String str4 = WorkerWrapperKt.TAG;
                                Logger$LogcatLogger.get().debug(str4, "Worker " + workSpec.workerClassName + " was interrupted. Backing off.");
                                workerWrapper2.reschedule(i4);
                            } else {
                                WorkInfo.State state = workSpecDao_Impl.getState(str2);
                                if (state == null || state.isFinished()) {
                                    String str5 = WorkerWrapperKt.TAG;
                                    Logger$LogcatLogger.get().debug(str5, "Status for " + str2 + " is " + state + " ; not doing any work");
                                    z = false;
                                } else {
                                    String str6 = WorkerWrapperKt.TAG;
                                    Logger$LogcatLogger.get().debug(str6, "Status for " + str2 + " is " + state + "; not doing any work and rescheduling for later execution");
                                    workSpecDao_Impl.setState(WorkInfo.State.ENQUEUED, str2);
                                    workSpecDao_Impl.setStopReason(i4, str2);
                                    workSpecDao_Impl.markWorkSpecScheduled(-1L, str2);
                                }
                            }
                            z2 = z;
                            return Boolean.valueOf(z2);
                        }
                        ListenableWorker.Result result2 = ((WorkerWrapper.Resolution.Finished) resolution).result;
                        WorkInfo.State state2 = workSpecDao_Impl.getState(str2);
                        WorkProgressDao_Impl workProgressDao = workerWrapper2.workDatabase.workProgressDao();
                        workProgressDao.getClass();
                        DBUtil.performBlocking(workProgressDao.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str2, 4));
                        if (state2 != null) {
                            if (state2 == WorkInfo.State.RUNNING) {
                                if (result2 instanceof ListenableWorker.Result.Success) {
                                    String str7 = WorkerWrapperKt.TAG;
                                    Logger$LogcatLogger.get().info(str7, "Worker result SUCCESS for " + str);
                                    if (workSpec.isPeriodic()) {
                                        workerWrapper2.resetPeriodic();
                                    } else {
                                        workSpecDao_Impl.setState(WorkInfo.State.SUCCEEDED, str2);
                                        Data data = ((ListenableWorker.Result.Success) result2).mOutputData;
                                        data.getClass();
                                        DBUtil.performBlocking(workSpecDao_Impl.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(18, data, str2));
                                        workerWrapper2.clock.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        DependencyDao_Impl dependencyDao_Impl = workerWrapper2.dependencyDao;
                                        for (String str8 : dependencyDao_Impl.getDependentWorkIds(str2)) {
                                            if (workSpecDao_Impl.getState(str8) == WorkInfo.State.BLOCKED && ((Boolean) DBUtil.performBlocking(dependencyDao_Impl.__db, true, false, new IconKt$$ExternalSyntheticLambda0(str8, 13))).booleanValue()) {
                                                Logger$LogcatLogger.get().info(WorkerWrapperKt.TAG, "Setting status to enqueued for ".concat(str8));
                                                workSpecDao_Impl.setState(WorkInfo.State.ENQUEUED, str8);
                                                workSpecDao_Impl.setLastEnqueueTime(currentTimeMillis, str8);
                                            }
                                        }
                                    }
                                } else {
                                    if (result2 instanceof ListenableWorker.Result.Retry) {
                                        String str9 = WorkerWrapperKt.TAG;
                                        Logger$LogcatLogger.get().info(str9, "Worker result RETRY for " + str);
                                        workerWrapper2.reschedule(-256);
                                        z2 = z;
                                        return Boolean.valueOf(z2);
                                    }
                                    String str10 = WorkerWrapperKt.TAG;
                                    Logger$LogcatLogger.get().info(str10, "Worker result FAILURE for " + str);
                                    if (workSpec.isPeriodic()) {
                                        workerWrapper2.resetPeriodic();
                                    } else {
                                        workerWrapper2.setFailed(result2);
                                    }
                                }
                            } else if (!state2.isFinished()) {
                                workerWrapper2.reschedule(-512);
                                z2 = z;
                                return Boolean.valueOf(z2);
                            }
                        }
                        z = false;
                        z2 = z;
                        return Boolean.valueOf(z2);
                    }
                });
                runInTransaction.getClass();
                return runInTransaction;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$runWorker = WorkerWrapper.access$runWorker(workerWrapper, this);
                    return access$runWorker == coroutineSingletons2 ? coroutineSingletons2 : access$runWorker;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
