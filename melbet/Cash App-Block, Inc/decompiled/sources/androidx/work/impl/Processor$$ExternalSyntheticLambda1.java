package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao_Impl;
import coil3.ImageLoader$Builder;
import coil3.size.DimensionKt;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.bugsnag.android.internal.dag.ContextModule;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlinx.coroutines.JobKt;
import papa.internal.Perfs$$ExternalSyntheticLambda4;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final /* synthetic */ class Processor$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ Processor$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                Processor processor = (Processor) this.f$0;
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) this.f$1;
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f$2;
                processor.getClass();
                try {
                    z = ((Boolean) callbackToFutureAdapter$SafeFuture.delegate.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (processor.mLock) {
                    try {
                        WorkGenerationalId generationalId = Room.generationalId(workerWrapper.workSpec);
                        String str = generationalId.workSpecId;
                        if (processor.getWorkerWrapperUnsafe(str) == workerWrapper) {
                            processor.cleanUpWorkerUnsafe(str);
                        }
                        Logger$LogcatLogger.get().debug(Processor.TAG, "Processor " + str + " executed; reschedule = " + z);
                        Iterator it = processor.mOuterListeners.iterator();
                        while (it.hasNext()) {
                            ((ExecutionListener) it.next()).onExecuted(generationalId, z);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                ContextModule contextModule = (ContextModule) this.f$0;
                final TransactorKt transactorKt = (TransactorKt) this.f$1;
                final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f$2;
                try {
                    FontRequestEmojiCompatConfig create = Countries.create(contextModule.ctx);
                    if (create == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) create.mMetadataLoader;
                    synchronized (fontRequestMetadataLoader.mLock) {
                        fontRequestMetadataLoader.mExecutor = threadPoolExecutor;
                    }
                    create.mMetadataLoader.load(new TransactorKt() { // from class: androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1
                        @Override // androidx.room.TransactorKt
                        public final void onFailed(Throwable th) {
                            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                            try {
                                TransactorKt.this.onFailed(th);
                            } finally {
                                threadPoolExecutor2.shutdown();
                            }
                        }

                        @Override // androidx.room.TransactorKt
                        public final void onLoaded(MetadataRepo metadataRepo) {
                            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                            try {
                                TransactorKt.this.onLoaded(metadataRepo);
                            } finally {
                                threadPoolExecutor2.shutdown();
                            }
                        }
                    });
                    return;
                } catch (Throwable th) {
                    transactorKt.onFailed(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.f$0;
                StartStopToken startStopToken = (StartStopToken) this.f$1;
                GrpcMethod grpcMethod = (GrpcMethod) this.f$2;
                final Processor processor2 = (Processor) workLauncherImpl.processor;
                processor2.getClass();
                WorkGenerationalId workGenerationalId = startStopToken.id;
                final String str2 = workGenerationalId.workSpecId;
                final ArrayList arrayList = new ArrayList();
                WorkSpec workSpec = (WorkSpec) processor2.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkDatabase workDatabase = Processor.this.mWorkDatabase;
                        WorkTagDao_Impl workTagDao = workDatabase.workTagDao();
                        workTagDao.getClass();
                        String str3 = str2;
                        str3.getClass();
                        arrayList.addAll((List) DBUtil.performBlocking(workTagDao.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str3, 13)));
                        return workDatabase.workSpecDao().getWorkSpec(str3);
                    }
                });
                if (workSpec == null) {
                    Logger$LogcatLogger.get().warning(Processor.TAG, "Didn't find WorkSpec for id " + workGenerationalId);
                    processor2.runOnExecuted(workGenerationalId);
                    return;
                }
                synchronized (processor2.mLock) {
                    try {
                        synchronized (processor2.mLock) {
                            if (processor2.getWorkerWrapperUnsafe(str2) == null) {
                                z = false;
                            }
                        }
                        if (z) {
                            Set set = (Set) processor2.mWorkRuns.get(str2);
                            if (((StartStopToken) set.iterator().next()).id.generation == workGenerationalId.generation) {
                                set.add(startStopToken);
                                Logger$LogcatLogger.get().debug(Processor.TAG, "Work " + workGenerationalId + " is already enqueued for processing");
                            } else {
                                processor2.runOnExecuted(workGenerationalId);
                            }
                            return;
                        }
                        if (workSpec.generation != workGenerationalId.generation) {
                            processor2.runOnExecuted(workGenerationalId);
                            return;
                        }
                        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(processor2.mAppContext, processor2.mConfiguration, processor2.mWorkTaskExecutor, processor2, processor2.mWorkDatabase, workSpec, arrayList);
                        if (grpcMethod != null) {
                            imageLoader$Builder.extras = grpcMethod;
                        }
                        WorkerWrapper workerWrapper2 = new WorkerWrapper(imageLoader$Builder);
                        CallbackToFutureAdapter$SafeFuture launchFuture$default = DimensionKt.launchFuture$default(workerWrapper2.workTaskExecutor.mTaskDispatcher.plus(JobKt.Job$default()), new WorkerWrapper$launch$1(workerWrapper2, null, i));
                        launchFuture$default.delegate.addListener(new Processor$$ExternalSyntheticLambda1(i, processor2, launchFuture$default, workerWrapper2), processor2.mWorkTaskExecutor.mMainThreadExecutor);
                        processor2.mEnqueuedWorkMap.put(str2, workerWrapper2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(startStopToken);
                        processor2.mWorkRuns.put(str2, hashSet);
                        Logger$LogcatLogger.get().debug(Processor.TAG, "Processor: processing " + workGenerationalId);
                        return;
                    } finally {
                    }
                }
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) this.f$0;
                String str3 = (String) this.f$1;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$2;
                WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
                workSpecDao.getClass();
                str3.getClass();
                Iterator it2 = ((List) DBUtil.performBlocking(workSpecDao.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str3, 7))).iterator();
                while (it2.hasNext()) {
                    Trace.cancel(workManagerImpl, (String) it2.next());
                }
                return;
            case 4:
                ((AFa1ySDK) this.f$0).e_((Context) this.f$1, (Intent) this.f$2);
                return;
            case 5:
                ((AFj1sSDK) this.f$0).getMediationNetwork((AFi1aSDK) this.f$1, (Runnable) this.f$2);
                return;
            default:
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) this.f$0;
                Handler handler = (Handler) this.f$1;
                Perfs$$ExternalSyntheticLambda4 perfs$$ExternalSyntheticLambda4 = (Perfs$$ExternalSyntheticLambda4) this.f$2;
                try {
                    handler.post(new MainActivity$$ExternalSyntheticLambda8(15, perfs$$ExternalSyntheticLambda4, OkHttpCall.AnonymousClass1.access$readAndUpdate(anonymousClass1)));
                    return;
                } catch (Throwable th2) {
                    handler.post(new MainActivity$$ExternalSyntheticLambda8(16, perfs$$ExternalSyntheticLambda4, th2));
                    return;
                }
        }
    }
}
