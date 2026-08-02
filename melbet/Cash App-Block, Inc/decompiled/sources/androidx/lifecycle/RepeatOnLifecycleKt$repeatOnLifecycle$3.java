package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ Lifecycle.State $state;
    public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CoroutineScope $$this$coroutineScope;
        public final /* synthetic */ Function2 $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        public Ref$ObjectRef L$0;
        public Ref$ObjectRef L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = coroutineScope;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            Lifecycle.State state;
            final CoroutineScope coroutineScope;
            final Function2 function2;
            final CancellableContinuationImpl cancellableContinuationImpl;
            Job job;
            LifecycleEventObserver lifecycleEventObserver;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    return Unit.INSTANCE;
                }
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                try {
                    state = this.$state;
                    coroutineScope = this.$$this$coroutineScope;
                    function2 = this.$block;
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Lifecycle.Event.Companion.getClass();
                    final Lifecycle.Event upTo = Lifecycle.Event.Companion.upTo(state);
                    final Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(state);
                    final MutexImpl mutexImpl = new MutexImpl();
                    LifecycleEventObserver lifecycleEventObserver2 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            Lifecycle.Event event2 = Lifecycle.Event.this;
                            Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef3;
                            if (event == event2) {
                                ref$ObjectRef4.element = JobKt.launch$default(coroutineScope, null, null, new FlowQuery$asFlow$1(mutexImpl, function2, null), 3);
                                return;
                            }
                            if (event == downFrom) {
                                Job job2 = (Job) ref$ObjectRef4.element;
                                if (job2 != null) {
                                    job2.cancel(null);
                                }
                                ref$ObjectRef4.element = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                            }
                        }
                    };
                    ref$ObjectRef.element = lifecycleEventObserver2;
                    lifecycle.addObserver(lifecycleEventObserver2);
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef3;
                } catch (Throwable th3) {
                    th = th3;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    job = (Job) ref$ObjectRef2.element;
                    if (job != null) {
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef.element;
                    if (lifecycleEventObserver != null) {
                    }
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = this.L$1;
                ref$ObjectRef2 = this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th4) {
                    th = th4;
                    job = (Job) ref$ObjectRef2.element;
                    if (job != null) {
                        job.cancel(null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef.element;
                    if (lifecycleEventObserver != null) {
                        throw th;
                    }
                    lifecycle.removeObserver(lifecycleEventObserver);
                    throw th;
                }
            }
            Job job2 = (Job) ref$ObjectRef2.element;
            if (job2 != null) {
                job2.cancel(null);
            }
            LifecycleEventObserver lifecycleEventObserver3 = (LifecycleEventObserver) ref$ObjectRef.element;
            if (lifecycleEventObserver3 != null) {
                lifecycle.removeObserver(lifecycleEventObserver3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, coroutineScope, this.$block, null);
            this.label = 1;
            if (JobKt.withContext(handlerContext, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
