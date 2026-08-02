package androidx.glance.session;

import android.content.Context;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.Recomposer;
import androidx.glance.Applier;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.RemoteViewsRoot;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class SessionWorkerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.runtime.Composition] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.glance.appwidget.AppWidgetSession, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.glance.session.InteractiveFrameClock] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runSession(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, Context context, AppWidgetSession appWidgetSession, TimeoutOptions timeoutOptions, SessionWorker$doWork$2$2.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        SessionWorkerKt$runSession$1 sessionWorkerKt$runSession$1;
        StandaloneCoroutine standaloneCoroutine;
        SessionWorkerKt$runSession$1 sessionWorkerKt$runSession$12;
        CoroutineSingletons coroutineSingletons;
        ?? r1;
        TimeoutOptions timeoutOptions2;
        StandaloneCoroutine standaloneCoroutine2;
        InteractiveFrameClock interactiveFrameClock;
        Context context2;
        Recomposer recomposer;
        AppWidgetSession appWidgetSession2;
        Recomposer recomposer2;
        Job job;
        InteractiveFrameClock interactiveFrameClock2;
        Composition composition;
        BoundsAnimation$animate$2 boundsAnimation$animate$2;
        CompositionImpl compositionImpl;
        ?? r3;
        TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$12 = timerScopeKt$withTimer$2$1$blockScope$1;
        ?? r4 = context;
        ?? r2 = appWidgetSession;
        try {
            if (continuationImpl instanceof SessionWorkerKt$runSession$1) {
                sessionWorkerKt$runSession$1 = (SessionWorkerKt$runSession$1) continuationImpl;
                r3 = sessionWorkerKt$runSession$1.label;
                if ((r3 & PKIFailureInfo.systemUnavail) != 0) {
                    ?? r32 = r3 - PKIFailureInfo.systemUnavail;
                    sessionWorkerKt$runSession$1.label = r32;
                    standaloneCoroutine = r32;
                    sessionWorkerKt$runSession$12 = sessionWorkerKt$runSession$1;
                    Object obj = sessionWorkerKt$runSession$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r1 = sessionWorkerKt$runSession$12.label;
                    int i = 2;
                    Continuation continuation = null;
                    if (r1 == 0) {
                        try {
                            if (r1 != 1) {
                                if (r1 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Composition composition2 = (Composition) sessionWorkerKt$runSession$12.L$3;
                                recomposer2 = (Recomposer) sessionWorkerKt$runSession$12.L$2;
                                job = (Job) sessionWorkerKt$runSession$12.L$1;
                                interactiveFrameClock2 = (InteractiveFrameClock) sessionWorkerKt$runSession$12.L$0;
                                SafeTrace.throwOnFailure(obj);
                                composition = composition2;
                                composition.dispose();
                                interactiveFrameClock2.stopInteractive();
                                job.cancel(null);
                                recomposer2.cancel();
                                return Unit.INSTANCE;
                            }
                            CompositionImpl compositionImpl2 = sessionWorkerKt$runSession$12.L$7;
                            Recomposer recomposer3 = sessionWorkerKt$runSession$12.L$6;
                            StandaloneCoroutine standaloneCoroutine3 = sessionWorkerKt$runSession$12.L$5;
                            InteractiveFrameClock interactiveFrameClock3 = sessionWorkerKt$runSession$12.L$4;
                            timeoutOptions2 = (TimeoutOptions) sessionWorkerKt$runSession$12.L$3;
                            AppWidgetSession appWidgetSession3 = (AppWidgetSession) sessionWorkerKt$runSession$12.L$2;
                            Context context3 = (Context) sessionWorkerKt$runSession$12.L$1;
                            TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$13 = (TimerScopeKt$withTimer$2$1$blockScope$1) sessionWorkerKt$runSession$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            standaloneCoroutine2 = standaloneCoroutine3;
                            interactiveFrameClock = interactiveFrameClock3;
                            context2 = context3;
                            recomposer = recomposer3;
                            appWidgetSession2 = appWidgetSession3;
                            timerScopeKt$withTimer$2$1$blockScope$12 = timerScopeKt$withTimer$2$1$blockScope$13;
                            r1 = compositionImpl2;
                        } catch (Throwable th) {
                            th = th;
                            r1.dispose();
                            r4.stopInteractive();
                            standaloneCoroutine.cancel(null);
                            r2.cancel();
                            throw th;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        interactiveFrameClock = new InteractiveFrameClock(timerScopeKt$withTimer$2$1$blockScope$12);
                        StandaloneCoroutine launch$default = JobKt.launch$default(timerScopeKt$withTimer$2$1$blockScope$12, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(i, continuation, 0), 3);
                        CoroutineScope coroutineScope = timerScopeKt$withTimer$2$1$blockScope$12.$$delegate_0;
                        r2.getClass();
                        RemoteViewsRoot remoteViewsRoot = new RemoteViewsRoot(50);
                        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
                        SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1 sessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1 = new SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1(timerScopeKt$withTimer$2$1$blockScope$12, r2, r4);
                        anonymousClass1.getClass();
                        JobImpl Job$default = JobKt.Job$default();
                        Job job2 = (Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
                        if (job2 != null) {
                            job2.invokeOnCompletion(new BoundsAnimation$animate$1(Job$default, 23));
                        }
                        Recomposer recomposer4 = new Recomposer(coroutineScope.getCoroutineContext().plus(Job$default).plus(sessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1));
                        CompositionImpl compositionImpl3 = new CompositionImpl(recomposer4, new Applier(remoteViewsRoot));
                        try {
                            Recomposer recomposer5 = recomposer4;
                            standaloneCoroutine2 = launch$default;
                            try {
                                JobKt.launch$default(timerScopeKt$withTimer$2$1$blockScope$12, interactiveFrameClock, null, new NetworkFetcher$doFetch$fetchResult$1(5, (Object) compositionImpl3, (Object) appWidgetSession, (Object) r4, (Object) recomposer5, (Object) timerScopeKt$withTimer$2$1$blockScope$12, (Continuation) null, false), 2);
                                context2 = context;
                                compositionImpl = compositionImpl3;
                                appWidgetSession2 = appWidgetSession;
                                try {
                                    ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2(recomposer5, appWidgetSession2, MutableStateFlow, context2, remoteViewsRoot, timerScopeKt$withTimer$2$1$blockScope$12, timeoutOptions, (Continuation) null);
                                    recomposer5 = recomposer5;
                                    try {
                                        JobKt.launch$default(timerScopeKt$withTimer$2$1$blockScope$12, null, null, ziplineLoader$load$2, 3);
                                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i, continuation, 0);
                                        sessionWorkerKt$runSession$12.L$0 = timerScopeKt$withTimer$2$1$blockScope$12;
                                        sessionWorkerKt$runSession$12.L$1 = context2;
                                        sessionWorkerKt$runSession$12.L$2 = appWidgetSession2;
                                        sessionWorkerKt$runSession$12.L$3 = timeoutOptions;
                                        sessionWorkerKt$runSession$12.L$4 = interactiveFrameClock;
                                        sessionWorkerKt$runSession$12.L$5 = standaloneCoroutine2;
                                        sessionWorkerKt$runSession$12.L$6 = recomposer5;
                                        sessionWorkerKt$runSession$12.L$7 = compositionImpl;
                                        sessionWorkerKt$runSession$12.label = 1;
                                        if (FlowKt.first(MutableStateFlow, sessionWorkerKt$runSession$5, sessionWorkerKt$runSession$12) != coroutineSingletons) {
                                            recomposer = recomposer5;
                                            timeoutOptions2 = timeoutOptions;
                                            r1 = compositionImpl;
                                        }
                                        return coroutineSingletons;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = recomposer5;
                                        standaloneCoroutine = standaloneCoroutine2;
                                        r4 = interactiveFrameClock;
                                        r1 = compositionImpl;
                                        r1.dispose();
                                        r4.stopInteractive();
                                        standaloneCoroutine.cancel(null);
                                        r2.cancel();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    recomposer5 = recomposer5;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                compositionImpl = compositionImpl3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            compositionImpl = compositionImpl3;
                            r2 = recomposer4;
                            standaloneCoroutine = launch$default;
                        }
                    }
                    boundsAnimation$animate$2 = new BoundsAnimation$animate$2(6, timerScopeKt$withTimer$2$1$blockScope$12, timeoutOptions2, interactiveFrameClock);
                    sessionWorkerKt$runSession$12.L$0 = interactiveFrameClock;
                    sessionWorkerKt$runSession$12.L$1 = standaloneCoroutine2;
                    sessionWorkerKt$runSession$12.L$2 = recomposer;
                    sessionWorkerKt$runSession$12.L$3 = r1;
                    sessionWorkerKt$runSession$12.L$4 = null;
                    sessionWorkerKt$runSession$12.L$5 = null;
                    sessionWorkerKt$runSession$12.L$6 = null;
                    sessionWorkerKt$runSession$12.L$7 = null;
                    sessionWorkerKt$runSession$12.label = 2;
                    if (appWidgetSession2.receiveEvents(context2, boundsAnimation$animate$2, sessionWorkerKt$runSession$12) != coroutineSingletons) {
                        recomposer2 = recomposer;
                        job = standaloneCoroutine2;
                        interactiveFrameClock2 = interactiveFrameClock;
                        composition = r1;
                        composition.dispose();
                        interactiveFrameClock2.stopInteractive();
                        job.cancel(null);
                        recomposer2.cancel();
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
            }
            boundsAnimation$animate$2 = new BoundsAnimation$animate$2(6, timerScopeKt$withTimer$2$1$blockScope$12, timeoutOptions2, interactiveFrameClock);
            sessionWorkerKt$runSession$12.L$0 = interactiveFrameClock;
            sessionWorkerKt$runSession$12.L$1 = standaloneCoroutine2;
            sessionWorkerKt$runSession$12.L$2 = recomposer;
            sessionWorkerKt$runSession$12.L$3 = r1;
            sessionWorkerKt$runSession$12.L$4 = null;
            sessionWorkerKt$runSession$12.L$5 = null;
            sessionWorkerKt$runSession$12.L$6 = null;
            sessionWorkerKt$runSession$12.L$7 = null;
            sessionWorkerKt$runSession$12.label = 2;
            if (appWidgetSession2.receiveEvents(context2, boundsAnimation$animate$2, sessionWorkerKt$runSession$12) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th6) {
            th = th6;
            r2 = recomposer;
            standaloneCoroutine = standaloneCoroutine2;
            r4 = interactiveFrameClock;
            r1.dispose();
            r4.stopInteractive();
            standaloneCoroutine.cancel(null);
            r2.cancel();
            throw th;
        }
        sessionWorkerKt$runSession$1 = new SessionWorkerKt$runSession$1(continuationImpl);
        standaloneCoroutine = r3;
        sessionWorkerKt$runSession$12 = sessionWorkerKt$runSession$1;
        Object obj2 = sessionWorkerKt$runSession$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r1 = sessionWorkerKt$runSession$12.label;
        int i2 = 2;
        Continuation continuation2 = null;
        if (r1 == 0) {
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAccountStatus.deepLinkSpecs;
    }

    public static final String getMessageToken(Message message) {
        message.getClass();
        if (message instanceof RecordedMessage) {
            return ((RecordedMessage) message).messageToken;
        }
        if (message instanceof PendingMessage) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
