package com.squareup.cash.borrow.presenters;

import com.squareup.cash.borrow.backend.BorrowError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.franklin.api.FirstTimeBorrowData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CreditFirstTimeBorrowBlockerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CreditFirstTimeBorrowBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditFirstTimeBorrowBlockerPresenter$models$1$1(CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = creditFirstTimeBorrowBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditFirstTimeBorrowBlockerPresenter$models$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditFirstTimeBorrowBlockerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter = this.this$0;
        FirstTimeBorrowData firstTimeBorrowData = creditFirstTimeBorrowBlockerPresenter.args.blocker.first_time_borrow_data;
        if ((firstTimeBorrowData != null ? firstTimeBorrowData.on_display_effect : null) == FirstTimeBorrowData.OnDisplayEffect.CONFETTI) {
            creditFirstTimeBorrowBlockerPresenter.errorReporter.report(new BorrowError.UnexpectedConfettiDisplayEffect(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
