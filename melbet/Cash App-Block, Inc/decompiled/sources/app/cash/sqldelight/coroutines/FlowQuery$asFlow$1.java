package app.cash.sqldelight.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.SessionMutex$Session;
import androidx.compose.ui.platform.MotionDurationScaleImpl;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
import androidx.datastore.preferences.core.PreferencesKt$edit$2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.ObservedTableVersions;
import androidx.room.RoomDatabase;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2;
import androidx.room.util.DBUtil;
import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.api.ResponseContextProcessor;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber$setup$1$1$1$1;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.ContainerLifecycle;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.ui.SandboxedActivityContext;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$work$2$childJob$1;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class FlowQuery$asFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_asFlow;
    public Object L$0;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowQuery$asFlow$1(SharingStarted sharingStarted, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.L$2 = sharingStarted;
        this.L$3 = flow;
        this.$this_asFlow = mutableSharedFlow;
        this.L$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_asFlow;
        switch (i) {
            case 0:
                FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1((Query) obj2, continuation);
                flowQuery$asFlow$1.L$0 = obj;
                return flowQuery$asFlow$1;
            case 1:
                FlowQuery$asFlow$1 flowQuery$asFlow$12 = new FlowQuery$asFlow$1((Function1) this.L$2, (AtomicReference) this.L$3, (Function2) obj2, continuation, 1);
                flowQuery$asFlow$12.L$0 = obj;
                return flowQuery$asFlow$12;
            case 2:
                return new FlowQuery$asFlow$1((Ref$ObjectRef) this.L$2, (Recomposer) this.L$3, (LifecycleOwner) this.L$0, (WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2) obj2, continuation, 2);
            case 3:
                return new FlowQuery$asFlow$1((MutexImpl) this.L$0, (Function2) obj2, continuation);
            case 4:
                FlowQuery$asFlow$1 flowQuery$asFlow$13 = new FlowQuery$asFlow$1((TriggerBasedInvalidationTracker) this.L$2, (int[]) this.L$3, (String[]) obj2, continuation, 4);
                flowQuery$asFlow$13.L$0 = obj;
                return flowQuery$asFlow$13;
            case 5:
                return new FlowQuery$asFlow$1((RealServiceContextManager) this.L$2, (RequestContext) this.L$3, (ResponseContext) this.L$0, (String) obj2, continuation, 5);
            case 6:
                return new FlowQuery$asFlow$1((RealServiceContextManager) this.L$2, (ResponseContext) this.L$3, (String) this.L$0, (Exception) obj2, continuation, 6);
            case 7:
                FlowQuery$asFlow$1 flowQuery$asFlow$14 = new FlowQuery$asFlow$1((CustomerStreamingSubscriber) this.L$2, (Reward$Adapter) this.L$3, (Lifecycle) obj2, continuation, 7);
                flowQuery$asFlow$14.L$0 = obj;
                return flowQuery$asFlow$14;
            case 8:
                return new FlowQuery$asFlow$1((RealClientSyncer) this.L$2, (SyncTrigger) this.L$3, (SyncScope) this.L$0, (CompletableDeferredImpl) obj2, continuation, 8);
            case 9:
                FlowQuery$asFlow$1 flowQuery$asFlow$15 = new FlowQuery$asFlow$1((ResponseContext) this.L$2, (String) this.L$3, (Exception) obj2, continuation, 9);
                flowQuery$asFlow$15.L$0 = obj;
                return flowQuery$asFlow$15;
            case 10:
                FlowQuery$asFlow$1 flowQuery$asFlow$16 = new FlowQuery$asFlow$1((RealTabProvider.MetroFactory) this.L$2, (Lifecycle) this.L$3, (BreadcrumbListener.MetroFactory) obj2, continuation, 10);
                flowQuery$asFlow$16.L$0 = obj;
                return flowQuery$asFlow$16;
            case 11:
                return new FlowQuery$asFlow$1((VariantSandboxedComponent) this.L$2, (Ref$BooleanRef) this.L$3, (MainActivity) this.L$0, (Ref$ObjectRef) obj2, continuation, 11);
            case 12:
                return new FlowQuery$asFlow$1((Function1) this.L$3, obj2, continuation, 12);
            case 13:
                FlowQuery$asFlow$1 flowQuery$asFlow$17 = new FlowQuery$asFlow$1((Function2) this.L$2, (Ref$BooleanRef) this.L$3, (Ref$ObjectRef) obj2, continuation, 13);
                flowQuery$asFlow$17.L$0 = obj;
                return flowQuery$asFlow$17;
            case 14:
                FlowQuery$asFlow$1 flowQuery$asFlow$18 = new FlowQuery$asFlow$1((SetupTeardown) this.L$3, obj2, continuation, 14);
                flowQuery$asFlow$18.L$0 = obj;
                return flowQuery$asFlow$18;
            case 15:
                FlowQuery$asFlow$1 flowQuery$asFlow$19 = new FlowQuery$asFlow$1((Ref$ObjectRef) this.L$2, (StandaloneCoroutine) this.L$3, (CoroutinesKt$until$2) obj2, continuation, 15);
                flowQuery$asFlow$19.L$0 = obj;
                return flowQuery$asFlow$19;
            case 16:
                FlowQuery$asFlow$1 flowQuery$asFlow$110 = new FlowQuery$asFlow$1((Function2) this.L$2, this.L$3, (Ref$ObjectRef) obj2, continuation, 16);
                flowQuery$asFlow$110.L$0 = obj;
                return flowQuery$asFlow$110;
            case 17:
                FlowQuery$asFlow$1 flowQuery$asFlow$111 = new FlowQuery$asFlow$1((Ref$ObjectRef) this.L$3, (FlowCollector) obj2, continuation, 17);
                flowQuery$asFlow$111.L$0 = ((ChannelResult) obj).holder;
                return flowQuery$asFlow$111;
            case 18:
                FlowQuery$asFlow$1 flowQuery$asFlow$112 = new FlowQuery$asFlow$1((Flow) this.L$2, (MutableSharedFlow) this.L$3, this.$this_asFlow, continuation, 18);
                flowQuery$asFlow$112.L$0 = obj;
                return flowQuery$asFlow$112;
            default:
                return new FlowQuery$asFlow$1((SharingStarted) this.L$2, (Flow) this.L$3, (MutableSharedFlow) obj2, this.L$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((FlowQuery$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                ((FlowQuery$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 5:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((FlowQuery$asFlow$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((FlowQuery$asFlow$1) create((SessionManager) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((FlowQuery$asFlow$1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 12:
                ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 13:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((FlowQuery$asFlow$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 17:
                Object obj3 = ((ChannelResult) obj).holder;
                FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1((Ref$ObjectRef) this.L$3, (FlowCollector) this.$this_asFlow, (Continuation) obj2, 17);
                flowQuery$asFlow$1.L$0 = obj3;
                return flowQuery$asFlow$1.invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((FlowQuery$asFlow$1) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((FlowQuery$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b0, code lost:
    
        if (((com.squareup.util.coroutines.CoroutinesKt$until$2) r5).invoke(r3, r16) != r9) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a3, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r0, r16) == r9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x020f, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r0, r16) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0202, code lost:
    
        if (r5.join(r16) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r10.collect(r11, r16) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0387, code lost:
    
        if (r0 == r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03a4, code lost:
    
        if (r0 == r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r10.collect(r11, r16) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r3, r5, r16) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r9, r16) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x054c, code lost:
    
        if (r3 == r0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05c3, code lost:
    
        if (r2.lock(r16) == r0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x068b, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r3, r16) == r0) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0732, code lost:
    
        if (r0.emit(r5, r16) == r2) goto L406;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0723 A[Catch: all -> 0x06dc, TRY_LEAVE, TryCatch #4 {all -> 0x06dc, blocks: (B:427:0x06d7, B:429:0x070c, B:434:0x071b, B:436:0x0723, B:444:0x06ea, B:447:0x0707), top: B:422:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0736  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.MutableSharedFlow] */
    /* JADX WARN: Type inference failed for: r3v32, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v35, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v1, types: [app.cash.sqldelight.Query, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [app.cash.sqldelight.Query$Listener] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:392:0x0732 -> B:384:0x070c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Query.Listener listener;
        Object obj2;
        SessionMutex$Session sessionMutex$Session;
        SessionMutex$Session sessionMutex$Session2;
        Object invoke;
        SessionMutex$Session sessionMutex$Session3;
        MutexImpl mutexImpl;
        Function2 function2;
        Mutex mutex;
        FlowCollector flowCollector;
        Object coroutineContext;
        FlowCollector flowCollector2;
        Object await;
        Function1 function1;
        StandaloneCoroutine launch$default;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        int i = this.$r8$classId;
        Object obj3 = this.$this_asFlow;
        ?? r6 = "call to 'resume' before 'invoke' with coroutine";
        Continuation continuation = null;
        switch (i) {
            case 0:
                ?? r5 = (Query) obj3;
                ?? r0 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        final BufferedChannel Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
                        Channel$default.mo1159trySendJP2dKIU(Unit.INSTANCE);
                        Query.Listener listener2 = new Query.Listener() { // from class: app.cash.sqldelight.coroutines.FlowQuery$asFlow$1$$ExternalSyntheticLambda0
                            @Override // app.cash.sqldelight.Query.Listener
                            public final void queryResultsChanged() {
                                BufferedChannel.this.mo1159trySendJP2dKIU(Unit.INSTANCE);
                            }
                        };
                        r5.addListener(listener2);
                        bufferedChannelIterator = Channel$default.new BufferedChannelIterator();
                        r6 = listener2;
                    } else if (i2 == 1) {
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.L$3;
                        Query.Listener listener3 = (Query.Listener) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        bufferedChannelIterator = bufferedChannelIterator2;
                        obj2 = obj;
                        listener = listener3;
                        if (!((Boolean) obj2).booleanValue()) {
                            bufferedChannelIterator.next();
                            this.L$0 = r0;
                            this.L$2 = listener;
                            this.L$3 = bufferedChannelIterator;
                            this.label = 2;
                            r6 = listener;
                            break;
                        } else {
                            r5.removeListener(listener);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = (BufferedChannel.BufferedChannelIterator) this.L$3;
                        Query.Listener listener4 = (Query.Listener) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        bufferedChannelIterator = bufferedChannelIterator3;
                        r6 = listener4;
                    }
                    this.L$0 = r0;
                    this.L$2 = r6;
                    this.L$3 = bufferedChannelIterator;
                    this.label = 1;
                    obj2 = bufferedChannelIterator.hasNext(this);
                    listener = r6;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                } catch (Throwable th) {
                    r5.removeListener(r6);
                    throw th;
                }
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.L$3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        SessionMutex$Session sessionMutex$Session4 = new SessionMutex$Session(JobKt.getJob(coroutineScope.getCoroutineContext()), ((Function1) this.L$2).invoke(coroutineScope));
                        SessionMutex$Session sessionMutex$Session5 = (SessionMutex$Session) atomicReference.getAndSet(sessionMutex$Session4);
                        if (sessionMutex$Session5 != null) {
                            Job job = sessionMutex$Session5.job;
                            this.L$0 = sessionMutex$Session4;
                            this.label = 1;
                            break;
                        }
                        sessionMutex$Session = sessionMutex$Session4;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sessionMutex$Session2 = (SessionMutex$Session) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                sessionMutex$Session3 = sessionMutex$Session2;
                                invoke = obj;
                                while (!atomicReference.compareAndSet(sessionMutex$Session3, null) && atomicReference.get() == sessionMutex$Session3) {
                                }
                                return invoke;
                            } catch (Throwable th2) {
                                th = th2;
                                while (!atomicReference.compareAndSet(sessionMutex$Session2, null)) {
                                }
                                throw th;
                            }
                        }
                        sessionMutex$Session = (SessionMutex$Session) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    Object obj4 = sessionMutex$Session.value;
                    this.L$0 = sessionMutex$Session;
                    this.label = 2;
                    invoke = ((Function2) obj3).invoke(obj4, this);
                    if (invoke != coroutineSingletons2) {
                        sessionMutex$Session3 = sessionMutex$Session;
                        while (!atomicReference.compareAndSet(sessionMutex$Session3, null)) {
                        }
                        return invoke;
                    }
                    return coroutineSingletons2;
                } catch (Throwable th3) {
                    th = th3;
                    sessionMutex$Session2 = sessionMutex$Session;
                    while (!atomicReference.compareAndSet(sessionMutex$Session2, null) && atomicReference.get() == sessionMutex$Session2) {
                    }
                    throw th;
                }
            case 2:
                WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 = (WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2) obj3;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.L$0;
                Recomposer recomposer = (Recomposer) this.L$3;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) ((Ref$ObjectRef) this.L$2).element;
                        if (motionDurationScaleImpl != null) {
                            motionDurationScaleImpl.coroutineScope = JobKt.CoroutineScope(recomposer.effectCoroutineContext);
                        }
                        this.label = 1;
                        if (recomposer.runRecomposeAndApplyChanges(this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    lifecycleOwner.getLifecycle().removeObserver(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    lifecycleOwner.getLifecycle().removeObserver(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                    throw th4;
                }
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                try {
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = (MutexImpl) this.L$0;
                        ?? r3 = (Function2) obj3;
                        this.L$2 = mutexImpl;
                        this.L$3 = (SuspendLambda) r3;
                        this.label = 1;
                        function2 = r3;
                        break;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = (Mutex) this.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th5) {
                                th = th5;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        Function2 function22 = (Function2) ((SuspendLambda) this.L$3);
                        ?? r32 = (Mutex) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        function2 = function22;
                        mutexImpl = r32;
                    }
                    PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(function2, null, 2);
                    this.L$2 = mutexImpl;
                    this.L$3 = null;
                    this.label = 2;
                    if (JobKt.coroutineScope(preferencesKt$edit$2, this) != coroutineSingletons4) {
                        mutex = mutexImpl;
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons4;
                } catch (Throwable th6) {
                    th = th6;
                    mutex = mutexImpl;
                    mutex.unlock(null);
                    throw th;
                }
            case 4:
                int[] iArr = (int[]) this.L$3;
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) this.L$2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                try {
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        if (triggerBasedInvalidationTracker.observedTableStates.onObserverAdded$room_runtime_release(iArr)) {
                            RoomDatabase roomDatabase = triggerBasedInvalidationTracker.database;
                            this.L$0 = flowCollector;
                            this.label = 1;
                            coroutineContext = DBUtil.getCoroutineContext(roomDatabase, false, this);
                            break;
                        }
                        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                        ObservedTableVersions observedTableVersions = triggerBasedInvalidationTracker.observedTableVersions;
                        TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2 = new TriggerBasedInvalidationTracker$createFlow$1$2(ref$ObjectRef3, flowCollector, (String[]) obj3, iArr);
                        this.L$0 = null;
                        this.label = 3;
                        observedTableVersions.collect(triggerBasedInvalidationTracker$createFlow$1$2, this);
                        return coroutineSingletons5;
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        flowCollector2 = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = flowCollector2;
                        Ref$ObjectRef ref$ObjectRef32 = new Ref$ObjectRef();
                        ObservedTableVersions observedTableVersions2 = triggerBasedInvalidationTracker.observedTableVersions;
                        TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$22 = new TriggerBasedInvalidationTracker$createFlow$1$2(ref$ObjectRef32, flowCollector, (String[]) obj3, iArr);
                        this.L$0 = null;
                        this.label = 3;
                        observedTableVersions2.collect(triggerBasedInvalidationTracker$createFlow$1$22, this);
                        return coroutineSingletons5;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    coroutineContext = obj;
                    CashApp$onCreate$4$1$1 cashApp$onCreate$4$1$1 = new CashApp$onCreate$4$1$1(triggerBasedInvalidationTracker, continuation, 5);
                    this.L$0 = flowCollector;
                    this.label = 2;
                    if (JobKt.withContext((CoroutineContext) coroutineContext, cashApp$onCreate$4$1$1, this) != coroutineSingletons5) {
                        flowCollector2 = flowCollector;
                        flowCollector = flowCollector2;
                        Ref$ObjectRef ref$ObjectRef322 = new Ref$ObjectRef();
                        ObservedTableVersions observedTableVersions22 = triggerBasedInvalidationTracker.observedTableVersions;
                        TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$222 = new TriggerBasedInvalidationTracker$createFlow$1$2(ref$ObjectRef322, flowCollector, (String[]) obj3, iArr);
                        this.L$0 = null;
                        this.label = 3;
                        observedTableVersions22.collect(triggerBasedInvalidationTracker$createFlow$1$222, this);
                    }
                    return coroutineSingletons5;
                } catch (Throwable th7) {
                    triggerBasedInvalidationTracker.observedTableStates.onObserverRemoved$room_runtime_release(iArr);
                    throw th7;
                }
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((ResponseContextProcessor) ((RealServiceContextManager) this.L$2).responseContextProcessor.getValue()).processResponseContext((RequestContext) this.L$3, (ResponseContext) this.L$0, (String) obj3, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealServiceContextManager) this.L$2).sessionManager.updateSession((ResponseContext) this.L$3, (String) this.L$0, (Exception) obj3, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                Map map = (Map) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (map == null) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("CLIENTSYNC");
                        forest.d("No gRPC request metadata available.", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    CustomerStreamingSubscriber customerStreamingSubscriber = (CustomerStreamingSubscriber) this.L$2;
                    customerStreamingSubscriber.exponentialBackoff.attempt = 0;
                    CustomerStreamingSubscriber$setup$1$1$1$1 customerStreamingSubscriber$setup$1$1$1$1 = new CustomerStreamingSubscriber$setup$1$1$1$1((Reward$Adapter) this.L$3, customerStreamingSubscriber, map, (Lifecycle) obj3, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(customerStreamingSubscriber$setup$1$1$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                SyncTrigger syncTrigger = (SyncTrigger) this.L$3;
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) obj3;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealClientSyncer realClientSyncer = (RealClientSyncer) this.L$2;
                    Deferred executeSyncRequest = realClientSyncer.requestExecutor.executeSyncRequest(new SyncRequestOperation(realClientSyncer.taskIdGenerator.nextTaskId(syncTrigger.name()), syncTrigger, (SyncScope) this.L$0));
                    this.label = 1;
                    await = executeSyncRequest.await(this);
                    if (await == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    await = obj;
                }
                SyncRequestOperation.Result result = (SyncRequestOperation.Result) await;
                if (result instanceof SyncRequestOperation.Result.Success) {
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(ClientSyncer$Result.Success);
                } else if (result instanceof SyncRequestOperation.Result.Skipped) {
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(ClientSyncer$Result.Success);
                } else {
                    if (!(result instanceof SyncRequestOperation.Result.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(ClientSyncer$Result.Failure);
                }
                return Unit.INSTANCE;
            case 9:
                SessionManager sessionManager = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager.updateSession((ResponseContext) this.L$2, (String) this.L$3, (Exception) obj3, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                Lifecycle lifecycle = (Lifecycle) this.L$3;
                String str = (String) this.L$0;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i13 = 14;
                    if (str == null) {
                        SetupTeardown setupTeardown = (SetupTeardown) ((BreadcrumbListener.MetroFactory) obj3).invoke();
                        this.L$0 = null;
                        this.label = 2;
                        Object coroutineScope2 = JobKt.coroutineScope(new FlowQuery$asFlow$1(setupTeardown, lifecycle, continuation, i13), this);
                        if (coroutineScope2 != obj5) {
                            coroutineScope2 = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        SetupTeardown setupTeardown2 = (SetupTeardown) ((RealTabProvider.MetroFactory) this.L$2).invoke();
                        this.L$0 = null;
                        this.label = 1;
                        Object coroutineScope3 = JobKt.coroutineScope(new FlowQuery$asFlow$1(setupTeardown2, lifecycle, continuation, i13), this);
                        if (coroutineScope3 != obj5) {
                            coroutineScope3 = Unit.INSTANCE;
                            break;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                MainActivity mainActivity = (MainActivity) this.L$0;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.L$2;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                try {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.i("Sandbox: Setting up activity scope for " + ((VariantSandboxedComponent.Impl) variantSandboxedComponent).storageLinkInstance, new Object[0]);
                    this.label = 1;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons11;
                } catch (Exception e) {
                    VariantSandboxedComponent.Impl impl = (VariantSandboxedComponent.Impl) variantSandboxedComponent;
                    Timber.Forest.i(e, "Sandbox: Tearing down activity scope for " + impl.storageLinkInstance, new Object[0]);
                    ((Ref$BooleanRef) this.L$3).element = false;
                    MainContainerDelegate mainContainerDelegate = mainActivity.mainContainerDelegate;
                    if (mainContainerDelegate != null) {
                        MainActivity mainActivity2 = (MainActivity) mainContainerDelegate.mainActivityDelegate;
                        mainActivity2.getSavedStateRegistry().unregisterSavedStateProvider("navigator");
                        mainActivity2.getSavedStateRegistry().unregisterSavedStateProvider("container");
                        Lifecycle lifecycle2 = mainActivity2.getLifecycle();
                        MainContainerDelegate.AnonymousClass3 anonymousClass3 = mainContainerDelegate.lifecycleObserver;
                        if (anonymousClass3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("lifecycleObserver");
                            throw null;
                        }
                        lifecycle2.removeObserver(anonymousClass3);
                        ContainerLifecycle containerLifecycle = mainContainerDelegate.containerLifecycle;
                        if (containerLifecycle == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("containerLifecycle");
                            throw null;
                        }
                        containerLifecycle.lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
                        if (mainContainerDelegate.container == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("container");
                            throw null;
                        }
                    }
                    if (((SandboxedActivityContext) ((Ref$ObjectRef) obj3).element) != null) {
                        if (mainActivity.refWatcher == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("refWatcher");
                            throw null;
                        }
                        Objects.toString(impl.storageLinkInstance);
                    }
                    throw e;
                }
            case 12:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function12 = (Function1) this.L$3;
                    try {
                        this.L$2 = function12;
                        this.L$0 = obj3;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons12;
                    } catch (Throwable th8) {
                        th = th8;
                        function1 = function12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.L$0;
                    function1 = (Function1) this.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                function1.invoke(obj3);
                throw th;
            case 13:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                try {
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Function2 function23 = (Function2) this.L$2;
                        this.L$0 = null;
                        this.label = 1;
                        if (function23.invoke(coroutineScope4, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Exception e2) {
                    if (!((Ref$BooleanRef) this.L$3).element) {
                        throw e2;
                    }
                    ((Ref$ObjectRef) obj3).element = e2;
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                Continuation continuation2 = null;
                if (i17 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    StandaloneCoroutine launch$default2 = JobKt.launch$default(coroutineScope5, null, coroutineStart, new SetupTeardownKt$work$2$childJob$1(m, (SetupTeardown) this.L$3, this.$this_asFlow, continuation2, 0), 1);
                    launch$default = JobKt.launch$default(coroutineScope5, null, coroutineStart, new PreferenceFlow$flow$1(m, continuation2, 20), 1);
                    this.L$0 = null;
                    this.L$2 = launch$default;
                    this.label = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    launch$default = (StandaloneCoroutine) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                this.L$0 = null;
                this.L$2 = null;
                this.label = 2;
                break;
            case 15:
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.L$3;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.L$2;
                Object obj6 = this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(ref$ObjectRef4.element, obj6)) {
                        ref$ObjectRef4.element = StateFlowKt.NO_VALUE;
                        if (!standaloneCoroutine.isCompleted()) {
                            this.L$0 = obj6;
                            this.label = 1;
                            break;
                        }
                        this.L$0 = null;
                        this.label = 2;
                    }
                    return Unit.INSTANCE;
                }
                if (i18 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } else {
                    if (i18 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 16:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 != 0) {
                    if (i19 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Object invoke2 = ((Function2) this.L$2).invoke(coroutineScope6, this.L$3);
                Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) obj3;
                MutableStateFlow mutableStateFlow = (MutableStateFlow) ref$ObjectRef5.element;
                if (mutableStateFlow == null) {
                    ref$ObjectRef5.element = FlowKt.MutableStateFlow(invoke2);
                } else {
                    ((StateFlowImpl) mutableStateFlow).setValue(invoke2);
                }
                this.L$0 = null;
                this.label = 1;
                JobKt.awaitCancellation(this);
                return coroutineSingletons16;
            case 17:
                Object obj7 = this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef = (Ref$ObjectRef) this.L$3;
                    boolean z = obj7 instanceof ChannelResult.Failed;
                    if (!z) {
                        ref$ObjectRef.element = obj7;
                    }
                    FlowCollector flowCollector4 = (FlowCollector) obj3;
                    if (z) {
                        Throwable m4190exceptionOrNullimpl = ChannelResult.m4190exceptionOrNullimpl(obj7);
                        if (m4190exceptionOrNullimpl != null) {
                            throw m4190exceptionOrNullimpl;
                        }
                        Object obj8 = ref$ObjectRef.element;
                        if (obj8 != null) {
                            if (obj8 == CombineKt.NULL) {
                                obj8 = null;
                            }
                            this.L$0 = null;
                            this.L$2 = ref$ObjectRef;
                            this.label = 1;
                            if (flowCollector4.emit(obj8, this) == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                            ref$ObjectRef2 = ref$ObjectRef;
                        }
                        ref$ObjectRef.element = CombineKt.DONE;
                    }
                    return Unit.INSTANCE;
                }
                if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef = ref$ObjectRef2;
                ref$ObjectRef.element = CombineKt.DONE;
                return Unit.INSTANCE;
            case 18:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.L$3;
                SharingCommand sharingCommand = (SharingCommand) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = sharingCommand.ordinal();
                    if (ordinal == 0) {
                        Flow flow = (Flow) this.L$2;
                        this.L$0 = null;
                        this.label = 1;
                        if (flow.collect(mutableSharedFlow, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (obj3 == FlowKt.NO_VALUE) {
                            mutableSharedFlow.resetReplayCache();
                        } else {
                            mutableSharedFlow.tryEmit(obj3);
                        }
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                ?? r10 = (Flow) this.L$3;
                ?? r11 = (MutableSharedFlow) obj3;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharingStarted sharingStarted = (SharingStarted) this.L$2;
                    if (sharingStarted != SharingStarted.Companion.Eagerly) {
                        Continuation continuation3 = null;
                        if (sharingStarted != SharingStarted.Companion.Lazily) {
                            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(sharingStarted.command(((AbstractSharedFlow) r11).getSubscriptionCount()));
                            FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1((Object) r10, (Object) r11, this.L$0, continuation3, 18);
                            this.label = 4;
                            break;
                        } else {
                            SubscriptionCountStateFlow subscriptionCount = ((AbstractSharedFlow) r11).getSubscriptionCount();
                            FlowKt__ShareKt$launchSharing$1$1 flowKt__ShareKt$launchSharing$1$1 = new FlowKt__ShareKt$launchSharing$1$1(2, null);
                            this.label = 2;
                            break;
                        }
                    } else {
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 3;
                            break;
                        } else if (i22 != 3 && i22 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons19;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowQuery$asFlow$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.L$3 = obj2;
        this.L$0 = obj3;
        this.$this_asFlow = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowQuery$asFlow$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.L$3 = obj2;
        this.$this_asFlow = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowQuery$asFlow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$3 = obj;
        this.$this_asFlow = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowQuery$asFlow$1(Query query, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$this_asFlow = query;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowQuery$asFlow$1(MutexImpl mutexImpl, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$0 = mutexImpl;
        this.$this_asFlow = function2;
    }
}
