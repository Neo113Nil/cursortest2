package androidx.glance.session;

import android.content.Context;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.room.TransactionExecutor;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.wire.GrpcMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SessionManagerImpl$scope$1 {
    public final LinkedHashMap sessions = new LinkedHashMap();
    public final /* synthetic */ SessionManagerImpl this$0;

    public SessionManagerImpl$scope$1(SessionManagerImpl sessionManagerImpl) {
        this.this$0 = sessionManagerImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isSessionRunning(Context context, String str, ContinuationImpl continuationImpl) {
        SessionManagerImpl$scope$1$isSessionRunning$1 sessionManagerImpl$scope$1$isSessionRunning$1;
        int i;
        boolean z;
        Iterable iterable;
        Iterator it;
        Object[] objArr;
        AppWidgetSession appWidgetSession;
        if (continuationImpl instanceof SessionManagerImpl$scope$1$isSessionRunning$1) {
            sessionManagerImpl$scope$1$isSessionRunning$1 = (SessionManagerImpl$scope$1$isSessionRunning$1) continuationImpl;
            int i2 = sessionManagerImpl$scope$1$isSessionRunning$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sessionManagerImpl$scope$1$isSessionRunning$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sessionManagerImpl$scope$1$isSessionRunning$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionManagerImpl$scope$1$isSessionRunning$1.label;
                z = false;
                z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    context.getClass();
                    WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
                    WorkDatabase workDatabase = instance$1.mWorkDatabase;
                    TaskExecutor taskExecutor = instance$1.mWorkTaskExecutor;
                    workDatabase.getClass();
                    taskExecutor.getClass();
                    str.getClass();
                    IconKt$$ExternalSyntheticLambda0 iconKt$$ExternalSyntheticLambda0 = new IconKt$$ExternalSyntheticLambda0(str, 18);
                    TransactionExecutor transactionExecutor = ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor;
                    transactionExecutor.getClass();
                    CallbackToFutureAdapter$SafeFuture executeAsync = DimensionKt.executeAsync(transactionExecutor, "loadStatusFuture", new StatusRunnable$$ExternalSyntheticLambda1(z ? 1 : 0, iconKt$$ExternalSyntheticLambda0, workDatabase));
                    sessionManagerImpl$scope$1$isSessionRunning$1.L$0 = this;
                    sessionManagerImpl$scope$1$isSessionRunning$1.L$1 = str;
                    sessionManagerImpl$scope$1$isSessionRunning$1.label = 1;
                    obj = RecipientAvatars.await(executeAsync, sessionManagerImpl$scope$1$isSessionRunning$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = sessionManagerImpl$scope$1$isSessionRunning$1.L$1;
                    this = sessionManagerImpl$scope$1$isSessionRunning$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (CollectionsKt__CollectionsKt.listOf((Object[]) new WorkInfo.State[]{WorkInfo.State.RUNNING, WorkInfo.State.ENQUEUED}).contains(((WorkInfo) it.next()).state)) {
                            objArr = true;
                            break;
                        }
                    }
                }
                objArr = false;
                appWidgetSession = (AppWidgetSession) this.sessions.get(str);
                if ((appWidgetSession == null ? appWidgetSession._isOpen.get() : false) && objArr != false) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        sessionManagerImpl$scope$1$isSessionRunning$1 = new SessionManagerImpl$scope$1$isSessionRunning$1(this, continuationImpl);
        Object obj2 = sessionManagerImpl$scope$1$isSessionRunning$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionManagerImpl$scope$1$isSessionRunning$1.label;
        z = false;
        z = false;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        objArr = false;
        appWidgetSession = (AppWidgetSession) this.sessions.get(str);
        if (appWidgetSession == null ? appWidgetSession._isOpen.get() : false) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startSession(Context context, AppWidgetSession appWidgetSession, ContinuationImpl continuationImpl) {
        SessionManagerImpl$scope$1$startSession$1 sessionManagerImpl$scope$1$startSession$1;
        int i;
        Context context2;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1 = this;
        if (continuationImpl instanceof SessionManagerImpl$scope$1$startSession$1) {
            sessionManagerImpl$scope$1$startSession$1 = (SessionManagerImpl$scope$1$startSession$1) continuationImpl;
            int i2 = sessionManagerImpl$scope$1$startSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sessionManagerImpl$scope$1$startSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sessionManagerImpl$scope$1$startSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionManagerImpl$scope$1$startSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = appWidgetSession.key;
                    AppWidgetSession appWidgetSession2 = (AppWidgetSession) sessionManagerImpl$scope$1.sessions.put(str, appWidgetSession);
                    if (appWidgetSession2 != null) {
                        appWidgetSession2.eventChannel.close(null);
                        appWidgetSession2._isOpen.set(false);
                        appWidgetSession2.parentJob.cancel(null);
                    }
                    GrpcMethod grpcMethod = new GrpcMethod(SessionWorker.class);
                    Pair[] pairArr = {new Pair("KEY", str)};
                    Data.Builder builder = new Data.Builder();
                    Pair pair = pairArr[0];
                    builder.put((String) pair.first, pair.second);
                    ((WorkSpec) grpcMethod.requestAdapter).input = builder.build();
                    OneTimeWorkRequest build = grpcMethod.build();
                    context.getClass();
                    CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) WorkManagerImpl.getInstance$1(context).enqueueUniqueWork(str, ExistingWorkPolicy.REPLACE, build).values;
                    sessionManagerImpl$scope$1$startSession$1.L$0 = sessionManagerImpl$scope$1;
                    context2 = context;
                    sessionManagerImpl$scope$1$startSession$1.L$1 = context2;
                    sessionManagerImpl$scope$1$startSession$1.label = 1;
                    if (RecipientAvatars.await(callbackToFutureAdapter$SafeFuture, sessionManagerImpl$scope$1$startSession$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Context context3 = sessionManagerImpl$scope$1$startSession$1.L$1;
                    SessionManagerImpl$scope$1 sessionManagerImpl$scope$12 = sessionManagerImpl$scope$1$startSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    context2 = context3;
                    sessionManagerImpl$scope$1 = sessionManagerImpl$scope$12;
                }
                SessionManagerImpl sessionManagerImpl = sessionManagerImpl$scope$1.this$0;
                context2.getClass();
                WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context2);
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                GrpcMethod grpcMethod2 = new GrpcMethod(SessionWorker.class);
                grpcMethod2.setInitialDelay(3650L, TimeUnit.DAYS);
                ((WorkSpec) grpcMethod2.requestAdapter).constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.NOT_REQUIRED, true, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
                instance$1.enqueueUniqueWork("sessionWorkerKeepEnabled", existingWorkPolicy, grpcMethod2.build());
                return Unit.INSTANCE;
            }
        }
        sessionManagerImpl$scope$1$startSession$1 = new SessionManagerImpl$scope$1$startSession$1(sessionManagerImpl$scope$1, continuationImpl);
        Object obj2 = sessionManagerImpl$scope$1$startSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionManagerImpl$scope$1$startSession$1.label;
        if (i != 0) {
        }
        SessionManagerImpl sessionManagerImpl2 = sessionManagerImpl$scope$1.this$0;
        context2.getClass();
        WorkManagerImpl instance$12 = WorkManagerImpl.getInstance$1(context2);
        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
        GrpcMethod grpcMethod22 = new GrpcMethod(SessionWorker.class);
        grpcMethod22.setInitialDelay(3650L, TimeUnit.DAYS);
        ((WorkSpec) grpcMethod22.requestAdapter).constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.NOT_REQUIRED, true, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
        instance$12.enqueueUniqueWork("sessionWorkerKeepEnabled", existingWorkPolicy2, grpcMethod22.build());
        return Unit.INSTANCE;
    }
}
