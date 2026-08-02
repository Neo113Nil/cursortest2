package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequenceScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, Continuation continuation) {
        super(2, continuation);
        this.this$0 = composePausableCompositionException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.this$0, continuation);
        composePausableCompositionException$operationsSequence$1.L$0 = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePausableCompositionException$operationsSequence$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        ComposePausableCompositionException composePausableCompositionException = this.this$0;
        MutableObjectList mutableObjectList = composePausableCompositionException.instances;
        MutableIntList mutableIntList = composePausableCompositionException.f852operations;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 == 0) {
            SafeTrace.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            sequenceScope = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        if (i3 >= Math.min(composePausableCompositionException.lastOperation + 10, mutableIntList._size)) {
            return Unit.INSTANCE;
        }
        int i7 = i3 + 1;
        int i8 = mutableIntList.get(i3);
        switch (i8) {
            case 0:
                str = "up";
                break;
            case 1:
                String m = Boxes$$ExternalSyntheticOutline1.m("down ", mutableObjectList.get(i2));
                i2++;
                str = m;
                break;
            case 2:
                str = "remove " + mutableIntList.get(i7) + ' ' + mutableIntList.get(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + mutableIntList.get(i7) + ' ' + mutableIntList.get(i3 + 2) + ' ' + mutableIntList.get(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int i9 = mutableIntList.get(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + i9 + ' ' + mutableObjectList.get(i2);
                int i10 = i4;
                str = str2;
                i7 = i10;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int i11 = mutableIntList.get(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + i11 + ' ' + mutableObjectList.get(i2);
                int i102 = i4;
                str = str2;
                i7 = i102;
                i2 = i5;
                break;
            case 7:
                Object obj2 = mutableObjectList.get(i2);
                obj2.getClass();
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, obj2);
                i2 += 2;
                str = "apply " + ((Function2) obj2);
                break;
            case 8:
                str = "reuse " + composePausableCompositionException.reused.get(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i8, "unknown op: ");
                break;
        }
        this.L$0 = sequenceScope;
        this.I$0 = i7;
        this.I$1 = i2;
        this.I$2 = i;
        this.label = 1;
        sequenceScope.yield(i3 + ": " + str, this);
        return coroutineSingletons;
    }
}
