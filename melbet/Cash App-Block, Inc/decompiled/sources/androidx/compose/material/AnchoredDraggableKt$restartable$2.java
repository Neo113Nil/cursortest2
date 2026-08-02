package androidx.compose.material;

import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ Function0 $inputs;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ CoroutineScope $$this$coroutineScope;
        public final /* synthetic */ Function2 $block;
        public final /* synthetic */ Ref$ObjectRef $previousDrag;
        public final /* synthetic */ int $r8$classId;

        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends SuspendLambda implements Function2 {
            public final /* synthetic */ CoroutineScope $$this$coroutineScope;
            public final /* synthetic */ Function2 $block;
            public final /* synthetic */ Object $latestInputs;
            public final /* synthetic */ int $r8$classId;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass2(Function2 function2, Object obj, CoroutineScope coroutineScope, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$block = function2;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation, 0);
                    default:
                        return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                CoroutineScope coroutineScope = this.$$this$coroutineScope;
                Object obj2 = this.$latestInputs;
                Function2 function2 = this.$block;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (function2.invoke(obj2, this) == coroutineSingletons) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        JobKt.cancel(coroutineScope, new AnchoredDragFinishedSignal());
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (function2.invoke(obj2, this) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        JobKt.cancel(coroutineScope, new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass1(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, Function2 function2, int i) {
            this.$r8$classId = i;
            this.$previousDrag = ref$ObjectRef;
            this.$$this$coroutineScope = coroutineScope;
            this.$block = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            int i;
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$12;
            int i2;
            int i3 = this.$r8$classId;
            Ref$ObjectRef ref$ObjectRef = this.$previousDrag;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                        anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                        int i4 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anchoredDraggableKt$restartable$2$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anchoredDraggableKt$restartable$2$1$emit$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Job job = (Job) ref$ObjectRef.element;
                                if (job != null) {
                                    job.cancel(new AnchoredDragFinishedSignal());
                                    anchoredDraggableKt$restartable$2$1$emit$1.L$0 = obj;
                                    anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                                    if (job.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                obj = anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                                SafeTrace.throwOnFailure(obj2);
                            }
                            Object obj3 = obj;
                            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                            CoroutineScope coroutineScope = this.$$this$coroutineScope;
                            ref$ObjectRef.element = JobKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$block, obj3, coroutineScope, null, 0), 1);
                            break;
                        }
                    }
                    anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                    Object obj22 = anchoredDraggableKt$restartable$2$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anchoredDraggableKt$restartable$2$1$emit$1.label;
                    if (i != 0) {
                    }
                    Object obj32 = obj;
                    CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
                    CoroutineScope coroutineScope2 = this.$$this$coroutineScope;
                    ref$ObjectRef.element = JobKt.launch$default(coroutineScope2, null, coroutineStart2, new AnonymousClass2(this.$block, obj32, coroutineScope2, null, 0), 1);
                default:
                    if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) {
                        anchoredDraggableKt$restartable$2$1$emit$12 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                        int i5 = anchoredDraggableKt$restartable$2$1$emit$12.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            anchoredDraggableKt$restartable$2$1$emit$12.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj4 = anchoredDraggableKt$restartable$2$1$emit$12.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = anchoredDraggableKt$restartable$2$1$emit$12.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Job job2 = (Job) ref$ObjectRef.element;
                                if (job2 != null) {
                                    job2.cancel(new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                                    anchoredDraggableKt$restartable$2$1$emit$12.L$0 = obj;
                                    anchoredDraggableKt$restartable$2$1$emit$12.label = 1;
                                    if (job2.join(anchoredDraggableKt$restartable$2$1$emit$12) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                obj = anchoredDraggableKt$restartable$2$1$emit$12.L$0;
                                SafeTrace.throwOnFailure(obj4);
                            }
                            Object obj5 = obj;
                            CoroutineStart coroutineStart3 = CoroutineStart.UNDISPATCHED;
                            CoroutineScope coroutineScope3 = this.$$this$coroutineScope;
                            ref$ObjectRef.element = JobKt.launch$default(coroutineScope3, null, coroutineStart3, new AnonymousClass2(this.$block, obj5, coroutineScope3, null, 1), 1);
                            break;
                        }
                    }
                    anchoredDraggableKt$restartable$2$1$emit$12 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                    Object obj42 = anchoredDraggableKt$restartable$2$1$emit$12.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = anchoredDraggableKt$restartable$2$1$emit$12.label;
                    if (i2 != 0) {
                    }
                    Object obj52 = obj;
                    CoroutineStart coroutineStart32 = CoroutineStart.UNDISPATCHED;
                    CoroutineScope coroutineScope32 = this.$$this$coroutineScope;
                    ref$ObjectRef.element = JobKt.launch$default(coroutineScope32, null, coroutineStart32, new AnonymousClass2(this.$block, obj52, coroutineScope32, null, 1), 1);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableKt$restartable$2(Function0 function0, Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$inputs = function0;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, continuation, 0);
                anchoredDraggableKt$restartable$2.L$0 = obj;
                return anchoredDraggableKt$restartable$2;
            default:
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$22 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, continuation, 1);
                anchoredDraggableKt$restartable$22.L$0 = obj;
                return anchoredDraggableKt$restartable$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AnchoredDraggableKt$restartable$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.$block;
        Function0 function0 = this.$inputs;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    SafeFlow snapshotFlow = Updater.snapshotFlow(function0);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, coroutineScope, function2, 0);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(function0);
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(ref$ObjectRef2, coroutineScope2, function2, i2);
                    this.label = 1;
                    if (snapshotFlow2.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
