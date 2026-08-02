package app.cash.sqldelight.coroutines;

import androidx.tracing.Trace;
import app.cash.sqldelight.ExecutableQuery$$ExternalSyntheticLambda0;
import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FlowQuery$mapToOne$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Query $it;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowQuery$mapToOne$1$1(Query query, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$it = query;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FlowQuery$mapToOne$1$1(this.$it, continuation, 0);
            case 1:
                return new FlowQuery$mapToOne$1$1(this.$it, continuation, 1);
            case 2:
                return new FlowQuery$mapToOne$1$1(this.$it, continuation, 2);
            default:
                return new FlowQuery$mapToOne$1$1(this.$it, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FlowQuery$mapToOne$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Query query = this.$it;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitAsOne = Trace.awaitAsOne(query, this);
                    return awaitAsOne == coroutineSingletons ? coroutineSingletons : awaitAsOne;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object await = query.execute(new ExecutableQuery$$ExternalSyntheticLambda0(query, 2)).await(this);
                    return await == coroutineSingletons2 ? coroutineSingletons2 : await;
                }
                if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object await2 = query.execute(new ExecutableQuery$$ExternalSyntheticLambda0(query, 3)).await(this);
                    return await2 == coroutineSingletons3 ? coroutineSingletons3 : await2;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object await3 = query.execute(new ExecutableQuery$$ExternalSyntheticLambda0(query, 3)).await(this);
                    return await3 == coroutineSingletons4 ? coroutineSingletons4 : await3;
                }
                if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
