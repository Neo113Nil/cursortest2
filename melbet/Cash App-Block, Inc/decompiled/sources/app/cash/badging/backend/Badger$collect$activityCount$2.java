package app.cash.badging.backend;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Badger$collect$activityCount$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ long J$0;
    public /* synthetic */ long J$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Badger$collect$activityCount$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Number number = (Number) obj;
        switch (this.$r8$classId) {
            case 0:
                long longValue = number.longValue();
                long longValue2 = ((Number) obj2).longValue();
                Badger$collect$activityCount$2 badger$collect$activityCount$2 = new Badger$collect$activityCount$2(i, (Continuation) obj3, 0);
                badger$collect$activityCount$2.J$0 = longValue;
                badger$collect$activityCount$2.J$1 = longValue2;
                return badger$collect$activityCount$2.invokeSuspend(Unit.INSTANCE);
            default:
                long longValue3 = number.longValue();
                long longValue4 = ((Number) obj2).longValue();
                Badger$collect$activityCount$2 badger$collect$activityCount$22 = new Badger$collect$activityCount$2(i, (Continuation) obj3, 1);
                badger$collect$activityCount$22.J$0 = longValue3;
                badger$collect$activityCount$22.J$1 = longValue4;
                return badger$collect$activityCount$22.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                long j = this.J$0;
                long j2 = this.J$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Long(j + j2);
            default:
                long j3 = this.J$0;
                long j4 = this.J$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Long(j3 + j4);
        }
    }
}
