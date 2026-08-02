package androidx.compose.runtime.snapshots;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public long[] L$1;
    public int label;
    public final /* synthetic */ SnapshotIdSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, Continuation continuation) {
        super(2, continuation);
        this.this$0 = snapshotIdSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, continuation);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c5 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:20:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        long[] jArr;
        int length;
        int i;
        SequenceScope sequenceScope2;
        int i2;
        SequenceScope sequenceScope3;
        int i3;
        SnapshotIdSet snapshotIdSet = this.this$0;
        long j = snapshotIdSet.upperSet;
        long j2 = snapshotIdSet.lowerBound;
        long j3 = snapshotIdSet.lowerSet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            jArr = snapshotIdSet.belowBound;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                sequenceScope2 = sequenceScope;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.INSTANCE;
        }
        if (i4 == 1) {
            length = this.I$1;
            int i5 = this.I$0;
            jArr = this.L$1;
            sequenceScope = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.I$0;
                sequenceScope3 = (SequenceScope) this.L$0;
                SafeTrace.throwOnFailure(obj);
                i3++;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.L$0 = sequenceScope3;
                        this.L$1 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        sequenceScope3.yield(l, this);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return coroutineSingletons;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = this.I$0;
            sequenceScope2 = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            i2++;
            if (i2 >= 64) {
                sequenceScope = sequenceScope2;
                if (j != 0) {
                    sequenceScope3 = sequenceScope;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.L$0 = sequenceScope2;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 2;
                sequenceScope2.yield(l2, this);
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return coroutineSingletons;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.L$0 = sequenceScope;
            this.L$1 = jArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
            sequenceScope.yield(l3, this);
            return coroutineSingletons;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return Unit.INSTANCE;
    }
}
