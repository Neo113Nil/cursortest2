package app.cash.cdp.persistence.repository;

import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$SelectByIdQuery;
import com.squareup.cash.observability.backend.real.WeakThrowableScribe$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class PersistedEventRepository$getEventsBatch$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $maxEvents;
    public final /* synthetic */ PersistedEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistedEventRepository$getEventsBatch$2(long j, PersistedEventRepository persistedEventRepository, Continuation continuation) {
        super(2, continuation);
        this.$maxEvents = j;
        this.this$0 = persistedEventRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersistedEventRepository$getEventsBatch$2(this.$maxEvents, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersistedEventRepository$getEventsBatch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        long j = this.$maxEvents;
        if (j < 1) {
            return EmptyList.INSTANCE;
        }
        PersistedEventRepository persistedEventRepository = this.this$0;
        SessionQueries sessionQueries = persistedEventRepository.queries;
        WeakThrowableScribe$$ExternalSyntheticLambda0 weakThrowableScribe$$ExternalSyntheticLambda0 = new WeakThrowableScribe$$ExternalSyntheticLambda0(1);
        sessionQueries.getClass();
        List executeAsList = new StorageLinkQueries$SelectByIdQuery(sessionQueries, j, new CashApp$$ExternalSyntheticLambda2(weakThrowableScribe$$ExternalSyntheticLambda0, 20), 2).executeAsList();
        SessionQueries sessionQueries2 = persistedEventRepository.oldQueries;
        WeakThrowableScribe$$ExternalSyntheticLambda0 weakThrowableScribe$$ExternalSyntheticLambda02 = new WeakThrowableScribe$$ExternalSyntheticLambda0(2);
        sessionQueries2.getClass();
        return CollectionsKt.plus((Iterable) new StorageLinkQueries$SelectByIdQuery(sessionQueries2, j, new CashApp$$ExternalSyntheticLambda2(weakThrowableScribe$$ExternalSyntheticLambda02, 18), 1).executeAsList(), (Collection) executeAsList);
    }
}
