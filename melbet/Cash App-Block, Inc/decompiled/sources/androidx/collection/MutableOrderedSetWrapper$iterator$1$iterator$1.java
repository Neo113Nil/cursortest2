package androidx.collection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SubSequence$iterator$1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public /* synthetic */ Object L$0;
    public SubSequence$iterator$1 L$1;
    public MutableOrderedSetWrapper L$2;
    public long[] L$3;
    public int label;
    public final /* synthetic */ MutableOrderedSetWrapper this$0;
    public final /* synthetic */ SubSequence$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper, SubSequence$iterator$1 subSequence$iterator$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = subSequence$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        long[] jArr;
        int i;
        SubSequence$iterator$1 subSequence$iterator$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            mutableOrderedSetWrapper = this.this$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = mutableOrderedSetWrapper.parent;
            jArr = mutableOrderedScatterSet.nodes;
            i = mutableOrderedScatterSet.tail;
            subSequence$iterator$1 = this.this$1;
        } else {
            if (i2 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            jArr = this.L$3;
            mutableOrderedSetWrapper = this.L$2;
            subSequence$iterator$1 = this.L$1;
            sequenceScope = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.INSTANCE;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        subSequence$iterator$1.position = i;
        Object obj2 = mutableOrderedSetWrapper.parent.elements[i];
        this.L$0 = sequenceScope;
        this.L$1 = subSequence$iterator$1;
        this.L$2 = mutableOrderedSetWrapper;
        this.L$3 = jArr;
        this.I$0 = i3;
        this.label = 1;
        sequenceScope.yield(obj2, this);
        return coroutineSingletons;
    }
}
