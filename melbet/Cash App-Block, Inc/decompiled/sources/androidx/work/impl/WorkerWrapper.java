package androidx.work.impl;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMergerKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import androidx.work.OverwritingInputMerger;
import androidx.work.SystemClock;
import androidx.work.WorkInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;

/* loaded from: classes.dex */
public final class WorkerWrapper {
    public final Context appContext;
    public final SystemClock clock;
    public final Configuration configuration;
    public final DependencyDao_Impl dependencyDao;
    public final Processor foregroundProcessor;
    public final GrpcMethod runtimeExtras;
    public final ArrayList tags;
    public final WorkDatabase workDatabase;
    public final String workDescription;
    public final WorkSpec workSpec;
    public final WorkSpecDao_Impl workSpecDao;
    public final String workSpecId;
    public final WorkManagerTaskExecutor workTaskExecutor;
    public final JobImpl workerJob;

    public WorkerWrapper(ImageLoader$Builder imageLoader$Builder) {
        WorkSpec workSpec = (WorkSpec) imageLoader$Builder.eventListenerFactory;
        this.workSpec = workSpec;
        this.appContext = (Context) imageLoader$Builder.application;
        String str = workSpec.id;
        this.workSpecId = str;
        this.runtimeExtras = (GrpcMethod) imageLoader$Builder.extras;
        this.workTaskExecutor = (WorkManagerTaskExecutor) imageLoader$Builder.mainCoroutineContextLazy;
        Configuration configuration = (Configuration) imageLoader$Builder.defaults;
        this.configuration = configuration;
        this.clock = configuration.clock;
        this.foregroundProcessor = (Processor) imageLoader$Builder.memoryCacheLazy;
        WorkDatabase workDatabase = (WorkDatabase) imageLoader$Builder.diskCacheLazy;
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        ArrayList arrayList = (ArrayList) imageLoader$Builder.componentRegistry;
        this.tags = arrayList;
        this.workDescription = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Work [ id=", str, ", tags={ "), CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), " } ]");
        this.workerJob = JobKt.Job$default();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runWorker(final WorkerWrapper workerWrapper, ContinuationImpl continuationImpl) {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        int i;
        String str;
        CoroutineSingletons coroutineSingletons;
        OverwritingInputMerger overwritingInputMerger;
        Data build;
        Throwable th;
        String str2;
        CancellationException e;
        Logger$LogcatLogger logger$LogcatLogger;
        String str3 = workerWrapper.workDescription;
        String str4 = workerWrapper.workSpecId;
        WorkManagerTaskExecutor workManagerTaskExecutor = workerWrapper.workTaskExecutor;
        WorkDatabase workDatabase = workerWrapper.workDatabase;
        Configuration configuration = workerWrapper.configuration;
        SystemClock systemClock = configuration.tracer;
        WorkSpec workSpec = workerWrapper.workSpec;
        if (continuationImpl instanceof WorkerWrapper$runWorker$1) {
            workerWrapper$runWorker$1 = (WorkerWrapper$runWorker$1) continuationImpl;
            int i2 = workerWrapper$runWorker$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                workerWrapper$runWorker$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = workerWrapper$runWorker$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workerWrapper$runWorker$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    WorkerFactory workerFactory = configuration.workerFactory;
                    systemClock.getClass();
                    final boolean isEnabled = Trace.isEnabled();
                    final String str5 = workSpec.traceTag;
                    String str6 = workSpec.workerClassName;
                    String str7 = workSpec.inputMergerClassName;
                    if (isEnabled && str5 != null) {
                        androidx.tracing.Trace.beginAsyncSection(str5, workSpec.hashCode());
                    }
                    final int i3 = 0;
                    if (((Boolean) workDatabase.runInTransaction(new Callable(workerWrapper) { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                        public final /* synthetic */ WorkerWrapper f$0;

                        {
                            this.f$0 = workerWrapper;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i4 = i3;
                            WorkerWrapper workerWrapper2 = this.f$0;
                            switch (i4) {
                                case 0:
                                    WorkSpec workSpec2 = workerWrapper2.workSpec;
                                    WorkInfo.State state = workSpec2.state;
                                    String str8 = workSpec2.workerClassName;
                                    WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
                                    if (state != state2) {
                                        String str9 = WorkerWrapperKt.TAG;
                                        Logger$LogcatLogger.get().debug(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (workSpec2.isPeriodic() || (workSpec2.state == state2 && workSpec2.runAttemptCount > 0)) {
                                        workerWrapper2.clock.getClass();
                                        if (System.currentTimeMillis() < workSpec2.calculateNextRunTime()) {
                                            Logger$LogcatLogger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    WorkSpecDao_Impl workSpecDao_Impl = workerWrapper2.workSpecDao;
                                    String str10 = workerWrapper2.workSpecId;
                                    boolean z = false;
                                    if (workSpecDao_Impl.getState(str10) == WorkInfo.State.ENQUEUED) {
                                        workSpecDao_Impl.setState(WorkInfo.State.RUNNING, str10);
                                        ((Number) DBUtil.performBlocking(workSpecDao_Impl.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str10, 11))).intValue();
                                        workSpecDao_Impl.setStopReason(-256, str10);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    })).booleanValue()) {
                        return new Resolution.ResetWorkerStatus();
                    }
                    if (workSpec.isPeriodic()) {
                        build = workSpec.input;
                        str = str3;
                        coroutineSingletons = coroutineSingletons2;
                    } else {
                        configuration.inputMergerFactory.getClass();
                        str7.getClass();
                        String str8 = InputMergerKt.TAG;
                        try {
                            Object newInstance = Class.forName(str7).getDeclaredConstructor(null).newInstance(null);
                            newInstance.getClass();
                            overwritingInputMerger = (OverwritingInputMerger) newInstance;
                            str = str3;
                            coroutineSingletons = coroutineSingletons2;
                        } catch (Exception e2) {
                            str = str3;
                            coroutineSingletons = coroutineSingletons2;
                            Logger$LogcatLogger.get().error(InputMergerKt.TAG, "Trouble instantiating ".concat(str7), e2);
                            overwritingInputMerger = null;
                        }
                        if (overwritingInputMerger == null) {
                            Logger$LogcatLogger.get().error(WorkerWrapperKt.TAG, "Could not create Input Merger ".concat(str7));
                            return new Resolution.Failed();
                        }
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(workSpec.input);
                        WorkSpecDao_Impl workSpecDao_Impl = workerWrapper.workSpecDao;
                        workSpecDao_Impl.getClass();
                        str4.getClass();
                        ArrayList plus = CollectionsKt.plus((Iterable) DBUtil.performBlocking(workSpecDao_Impl.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str4, 10)), (Collection) listOf);
                        Data.Builder builder = new Data.Builder();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = plus.iterator();
                        while (it.hasNext()) {
                            Map unmodifiableMap = Collections.unmodifiableMap(((Data) it.next()).values);
                            unmodifiableMap.getClass();
                            linkedHashMap.putAll(unmodifiableMap);
                        }
                        builder.putAll(linkedHashMap);
                        build = builder.build();
                    }
                    UUID fromString = UUID.fromString(str4);
                    ArrayList arrayList = workerWrapper.tags;
                    GrpcMethod grpcMethod = workerWrapper.runtimeExtras;
                    int i4 = workSpec.runAttemptCount;
                    ExecutorService executorService = configuration.executor;
                    DefaultScheduler defaultScheduler = configuration.workerCoroutineContext;
                    WorkerWrapper$runWorker$1 workerWrapper$runWorker$12 = workerWrapper$runWorker$1;
                    WorkProgressUpdater workProgressUpdater = new WorkProgressUpdater(workDatabase, workManagerTaskExecutor);
                    WorkForegroundUpdater workForegroundUpdater = new WorkForegroundUpdater(workDatabase, workerWrapper.foregroundProcessor, workManagerTaskExecutor);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.mId = fromString;
                    workerParameters.mInputData = build;
                    workerParameters.mTags = new HashSet(arrayList);
                    workerParameters.mRuntimeExtras = grpcMethod;
                    workerParameters.mRunAttemptCount = i4;
                    workerParameters.mBackgroundExecutor = executorService;
                    workerParameters.mWorkerContext = defaultScheduler;
                    workerParameters.mWorkTaskExecutor = workManagerTaskExecutor;
                    workerParameters.mWorkerFactory = workerFactory;
                    workerParameters.mProgressUpdater = workProgressUpdater;
                    workerParameters.mForegroundUpdater = workForegroundUpdater;
                    try {
                        final ListenableWorker createWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(workerWrapper.appContext, str6, workerParameters);
                        createWorkerWithDefaultFallback.setUsed();
                        CoroutineContext.Element element = workerWrapper$runWorker$12.getContext().get(Job.Key.$$INSTANCE);
                        element.getClass();
                        Job job = (Job) element;
                        job.invokeOnCompletion(new Function1() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                String str9;
                                Throwable th2 = (Throwable) obj2;
                                if (th2 instanceof WorkerStoppedException) {
                                    ListenableWorker.this.stop(((WorkerStoppedException) th2).reason);
                                }
                                if (isEnabled && (str9 = str5) != null) {
                                    WorkerWrapper workerWrapper2 = workerWrapper;
                                    SystemClock systemClock2 = workerWrapper2.configuration.tracer;
                                    int hashCode = workerWrapper2.workSpec.hashCode();
                                    systemClock2.getClass();
                                    androidx.tracing.Trace.endAsyncSection(str9, hashCode);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i5 = 1;
                        Object runInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(workerWrapper) { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                            public final /* synthetic */ WorkerWrapper f$0;

                            {
                                this.f$0 = workerWrapper;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i42 = i5;
                                WorkerWrapper workerWrapper2 = this.f$0;
                                switch (i42) {
                                    case 0:
                                        WorkSpec workSpec2 = workerWrapper2.workSpec;
                                        WorkInfo.State state = workSpec2.state;
                                        String str82 = workSpec2.workerClassName;
                                        WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
                                        if (state != state2) {
                                            String str9 = WorkerWrapperKt.TAG;
                                            Logger$LogcatLogger.get().debug(str9, str82 + " is not in ENQUEUED state. Nothing more to do");
                                            return Boolean.TRUE;
                                        }
                                        if (workSpec2.isPeriodic() || (workSpec2.state == state2 && workSpec2.runAttemptCount > 0)) {
                                            workerWrapper2.clock.getClass();
                                            if (System.currentTimeMillis() < workSpec2.calculateNextRunTime()) {
                                                Logger$LogcatLogger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + str82 + " because it is being executed before schedule.");
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    default:
                                        WorkSpecDao_Impl workSpecDao_Impl2 = workerWrapper2.workSpecDao;
                                        String str10 = workerWrapper2.workSpecId;
                                        boolean z = false;
                                        if (workSpecDao_Impl2.getState(str10) == WorkInfo.State.ENQUEUED) {
                                            workSpecDao_Impl2.setState(WorkInfo.State.RUNNING, str10);
                                            ((Number) DBUtil.performBlocking(workSpecDao_Impl2.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str10, 11))).intValue();
                                            workSpecDao_Impl2.setStopReason(-256, str10);
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        });
                        runInTransaction.getClass();
                        if (((Boolean) runInTransaction).booleanValue() && !job.isCancelled()) {
                            AndroidMainExecutor androidMainExecutor = workManagerTaskExecutor.mMainThreadExecutor;
                            androidMainExecutor.getClass();
                            CoroutineDispatcher from = JobKt.from(androidMainExecutor);
                            try {
                                DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(workerWrapper, createWorkerWithDefaultFallback, workForegroundUpdater, null, 12);
                                workerWrapper$runWorker$12.label = 1;
                                obj = JobKt.withContext(from, dataStoreImpl$data$1, workerWrapper$runWorker$12);
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                if (obj == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                str2 = str;
                                String str9 = WorkerWrapperKt.TAG;
                                logger$LogcatLogger = Logger$LogcatLogger.get();
                                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str2, " was cancelled");
                                if (logger$LogcatLogger.mLoggingLevel <= 4) {
                                }
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                String str10 = WorkerWrapperKt.TAG;
                                Logger$LogcatLogger.get().error(str10, str + " failed because it threw an exception/error", th);
                                return new Resolution.Failed();
                            }
                        }
                        return new Resolution.ResetWorkerStatus();
                    } catch (Throwable unused) {
                        String str11 = WorkerWrapperKt.TAG;
                        Logger$LogcatLogger.get().error(str11, "Could not create Worker " + str6);
                        return new Resolution.Failed();
                    }
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    SafeTrace.throwOnFailure(obj);
                    str = str3;
                } catch (CancellationException e4) {
                    e = e4;
                    str2 = str3;
                    String str92 = WorkerWrapperKt.TAG;
                    logger$LogcatLogger = Logger$LogcatLogger.get();
                    String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str2, " was cancelled");
                    if (logger$LogcatLogger.mLoggingLevel <= 4) {
                        Log.i(str92, m$12, e);
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                    String str102 = WorkerWrapperKt.TAG;
                    Logger$LogcatLogger.get().error(str102, str + " failed because it threw an exception/error", th);
                    return new Resolution.Failed();
                }
                ListenableWorker.Result result = (ListenableWorker.Result) obj;
                result.getClass();
                return new Resolution.Finished(result);
            }
        }
        workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(workerWrapper, continuationImpl);
        Object obj2 = workerWrapper$runWorker$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workerWrapper$runWorker$1.label;
        if (i != 0) {
        }
        ListenableWorker.Result result2 = (ListenableWorker.Result) obj2;
        result2.getClass();
        return new Resolution.Finished(result2);
    }

    public final void reschedule(int i) {
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        WorkSpecDao_Impl workSpecDao_Impl = this.workSpecDao;
        String str = this.workSpecId;
        workSpecDao_Impl.setState(state, str);
        this.clock.getClass();
        workSpecDao_Impl.setLastEnqueueTime(System.currentTimeMillis(), str);
        workSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride(this.workSpec.nextScheduleTimeOverrideGeneration, str);
        workSpecDao_Impl.markWorkSpecScheduled(-1L, str);
        workSpecDao_Impl.setStopReason(i, str);
    }

    public final void resetPeriodic() {
        this.clock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkSpecDao_Impl workSpecDao_Impl = this.workSpecDao;
        String str = this.workSpecId;
        workSpecDao_Impl.setLastEnqueueTime(currentTimeMillis, str);
        workSpecDao_Impl.setState(WorkInfo.State.ENQUEUED, str);
        RoomDatabase roomDatabase = workSpecDao_Impl.__db;
        ((Number) DBUtil.performBlocking(roomDatabase, false, true, new IconKt$$ExternalSyntheticLambda0(str, 16))).intValue();
        workSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride(this.workSpec.nextScheduleTimeOverrideGeneration, str);
        DBUtil.performBlocking(roomDatabase, false, true, new IconKt$$ExternalSyntheticLambda0(str, 17));
        workSpecDao_Impl.markWorkSpecScheduled(-1L, str);
    }

    public final void setFailed(ListenableWorker.Result result) {
        result.getClass();
        String str = this.workSpecId;
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
        while (true) {
            boolean isEmpty = mutableListOf.isEmpty();
            WorkSpecDao_Impl workSpecDao_Impl = this.workSpecDao;
            if (isEmpty) {
                Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
                outputData.getClass();
                workSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride(this.workSpec.nextScheduleTimeOverrideGeneration, str);
                DBUtil.performBlocking(workSpecDao_Impl.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(18, outputData, str));
                return;
            }
            String str2 = (String) CollectionsKt__MutableCollectionsKt.removeLast(mutableListOf);
            if (workSpecDao_Impl.getState(str2) != WorkInfo.State.CANCELLED) {
                workSpecDao_Impl.setState(WorkInfo.State.FAILED, str2);
            }
            mutableListOf.addAll(this.dependencyDao.getDependentWorkIds(str2));
        }
    }

    public abstract class Resolution {

        public final class Failed extends Resolution {
            public final ListenableWorker.Result result = new ListenableWorker.Result.Failure();
        }

        public final class Finished extends Resolution {
            public final ListenableWorker.Result result;

            public Finished(ListenableWorker.Result result) {
                this.result = result;
            }
        }

        public final class ResetWorkerStatus extends Resolution {
            public final int reason;

            public ResetWorkerStatus(int i) {
                this.reason = i;
            }

            public /* synthetic */ ResetWorkerStatus() {
                this(-256);
            }
        }
    }
}
