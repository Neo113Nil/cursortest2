package app.cash.badging.backend;

import androidx.work.impl.constraints.ConstraintsState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.chat.backend.real.ChatBackendModule$Companion$provideReadTokenStorage$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Badger$collect$$inlined$combine$1 implements Flow {
    public final /* synthetic */ Flow[] $flowArray$inlined;
    public final /* synthetic */ int $r8$classId;

    /* renamed from: app.cash.badging.backend.Badger$collect$$inlined$combine$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ FlowCollector L$0;
        public /* synthetic */ Object[] L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            FlowCollector flowCollector = (FlowCollector) obj;
            Object[] objArr = (Object[]) obj2;
            Continuation continuation = (Continuation) obj3;
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, continuation, 0);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                case 1:
                    AnonymousClass3 anonymousClass32 = new AnonymousClass3(3, continuation, 1);
                    anonymousClass32.L$0 = flowCollector;
                    anonymousClass32.L$1 = objArr;
                    return anonymousClass32.invokeSuspend(Unit.INSTANCE);
                default:
                    AnonymousClass3 anonymousClass33 = new AnonymousClass3(3, continuation, 2);
                    anonymousClass33.L$0 = flowCollector;
                    anonymousClass33.L$1 = objArr;
                    return anonymousClass33.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConstraintsState constraintsState;
            int i = 0;
            ConstraintsState constraintsState2 = null;
            switch (this.$r8$classId) {
                case 0:
                    FlowCollector flowCollector = this.L$0;
                    Object[] objArr = this.L$1;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Long[] lArr = (Long[]) objArr;
                        lArr.getClass();
                        int length = lArr.length;
                        long j = 0;
                        while (i < length) {
                            j += lArr[i].longValue();
                            i++;
                        }
                        Long l = new Long(j);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector.emit(l, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowCollector flowCollector2 = this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) this.L$1;
                        int length2 = constraintsStateArr.length;
                        while (true) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                            if (i < length2) {
                                ConstraintsState constraintsState3 = constraintsStateArr[i];
                                if (Intrinsics.areEqual(constraintsState3, constraintsState)) {
                                    i++;
                                } else {
                                    constraintsState2 = constraintsState3;
                                }
                            }
                        }
                        if (constraintsState2 != null) {
                            constraintsState = constraintsState2;
                        }
                        this.label = 1;
                        if (flowCollector2.emit(constraintsState, this) == coroutineSingletons2) {
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
                    FlowCollector flowCollector3 = this.L$0;
                    Object[] objArr2 = this.L$1;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String[] strArr = (String[]) objArr2;
                        Boolean valueOf = Boolean.valueOf(!Intrinsics.areEqual(strArr[0], strArr[1]));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector3.emit(valueOf, this) == coroutineSingletons3) {
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

    public /* synthetic */ Badger$collect$$inlined$combine$1(Flow[] flowArr, int i) {
        this.$r8$classId = i;
        this.$flowArray$inlined = flowArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 3;
        Continuation continuation2 = null;
        final Flow[] flowArr = this.$flowArray$inlined;
        switch (i) {
            case 0:
                final int i3 = 0;
                Object combineInternal = CombineKt.combineInternal(continuation, new Function0() { // from class: app.cash.badging.backend.Badger$collect$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Long[flowArr.length];
                            default:
                                return new ConstraintsState[flowArr.length];
                        }
                    }
                }, new AnonymousClass3(i2, continuation2, i3), flowCollector, flowArr);
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                final int i4 = 1;
                Object combineInternal2 = CombineKt.combineInternal(continuation, new Function0() { // from class: app.cash.badging.backend.Badger$collect$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Long[flowArr.length];
                            default:
                                return new ConstraintsState[flowArr.length];
                        }
                    }
                }, new AnonymousClass3(i2, continuation2, i4), flowCollector, flowArr);
                if (combineInternal2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object combineInternal3 = CombineKt.combineInternal(continuation, new ChatBackendModule$Companion$provideReadTokenStorage$3(flowArr), new AnonymousClass3(i2, continuation2, 2), flowCollector, flowArr);
                if (combineInternal3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
