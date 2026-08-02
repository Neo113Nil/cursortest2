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
public final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public /* synthetic */ Object L$0;
    public SubSequence$iterator$1 L$1;
    public MutableSetWrapper L$2;
    public long[] L$3;
    public int label;
    public final /* synthetic */ MutableSetWrapper this$0;
    public final /* synthetic */ SubSequence$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper mutableSetWrapper, SubSequence$iterator$1 subSequence$iterator$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableSetWrapper;
        this.this$1 = subSequence$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        MutableSetWrapper mutableSetWrapper;
        long[] jArr;
        int length;
        SubSequence$iterator$1 subSequence$iterator$1;
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            mutableSetWrapper = this.this$0;
            jArr = mutableSetWrapper.parent.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                subSequence$iterator$1 = this.this$1;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        int i5 = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = this.L$3;
        MutableSetWrapper mutableSetWrapper2 = this.L$2;
        SubSequence$iterator$1 subSequence$iterator$12 = this.L$1;
        SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
        SafeTrace.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                mutableSetWrapper = mutableSetWrapper2;
                sequenceScope = sequenceScope2;
                i = i5;
                subSequence$iterator$1 = subSequence$iterator$12;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i3 = 0;
                        mutableSetWrapper2 = mutableSetWrapper;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        subSequence$iterator$12 = subSequence$iterator$1;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                subSequence$iterator$12.position = i7;
                                Object obj2 = mutableSetWrapper2.parent.elements[i7];
                                this.L$0 = sequenceScope2;
                                this.L$1 = subSequence$iterator$12;
                                this.L$2 = mutableSetWrapper2;
                                this.L$3 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
                                sequenceScope2.yield(obj2, this);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return coroutineSingletons;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
