package androidx.glance.session;

import android.content.Context;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.paging.PageFetcher$flow$1;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.Strings;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Landroidx/glance/session/SessionManager;", "sessionManager", "Landroidx/glance/session/TimeoutOptions;", "timeouts", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Landroidx/glance/session/SessionManager;Landroidx/glance/session/TimeoutOptions;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionWorker extends CoroutineWorker {
    public final CoroutineDispatcher coroutineContext;
    public final String key;
    public final WorkerParameters params;
    public final SessionManager sessionManager;
    public final TimeoutOptions timeouts;

    public SessionWorker(Context context, WorkerParameters workerParameters, SessionManager sessionManager, TimeoutOptions timeoutOptions, CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.sessionManager = sessionManager;
        this.timeouts = timeoutOptions;
        this.coroutineContext = coroutineDispatcher;
        Data inputData = getInputData();
        sessionManager.getClass();
        String string2 = inputData.getString("KEY");
        if (string2 != null) {
            this.key = string2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation continuation) {
        SessionWorker$doWork$1 sessionWorker$doWork$1;
        int i;
        ListenableWorker.Result result;
        if (continuation instanceof SessionWorker$doWork$1) {
            sessionWorker$doWork$1 = (SessionWorker$doWork$1) continuation;
            int i2 = sessionWorker$doWork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sessionWorker$doWork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sessionWorker$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionWorker$doWork$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0 = this.timeouts.timeSource;
                    PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this, continuation2, 15);
                    sessionWorker$doWork$1.label = 1;
                    obj = TimerScopeKt.withTimerOrNull(differentialMotionFlingController$$ExternalSyntheticLambda0, pageFetcher$flow$1, sessionWorker$doWork$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                result = (ListenableWorker.Result) obj;
                if (result == null) {
                    return result;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                Data data = new Data(linkedHashMap);
                Strings.toByteArrayInternalV1(data);
                return new ListenableWorker.Result.Success(data);
            }
        }
        sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, (ContinuationImpl) continuation);
        Object obj2 = sessionWorker$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionWorker$doWork$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        result = (ListenableWorker.Result) obj2;
        if (result == null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, SessionManagerKt.GlanceSessionManager, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionWorker(Context context, WorkerParameters workerParameters, SessionManager sessionManager, TimeoutOptions timeoutOptions, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, r3, r4, coroutineDispatcher);
        SessionManager sessionManager2 = (i & 4) != 0 ? SessionManagerKt.GlanceSessionManager : sessionManager;
        TimeoutOptions timeoutOptions2 = (i & 8) != 0 ? new TimeoutOptions() : timeoutOptions;
        if ((i & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineDispatcher = MainDispatcherLoader.dispatcher;
        }
    }
}
