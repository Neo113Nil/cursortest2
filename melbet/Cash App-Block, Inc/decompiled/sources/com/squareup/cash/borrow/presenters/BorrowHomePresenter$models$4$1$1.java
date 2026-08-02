package com.squareup.cash.borrow.presenters;

import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewSeeTile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BorrowHomePresenter$models$4$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BorrowHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BorrowHomePresenter$models$4$1$1(BorrowHomePresenter borrowHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = borrowHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BorrowHomePresenter borrowHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new BorrowHomePresenter$models$4$1$1(borrowHomePresenter, continuation, 0);
            case 1:
                return new BorrowHomePresenter$models$4$1$1(borrowHomePresenter, continuation, 1);
            default:
                return new BorrowHomePresenter$models$4$1$1(borrowHomePresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BorrowHomePresenter$models$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BorrowHomePresenter borrowHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                borrowHomePresenter.analytics.track(new BorrowAppletViewSeeTile(BorrowAppletViewSeeTile.TileType.CREDIT_LIMIT_AND_BORROW_BUTTON), null);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                borrowHomePresenter.analytics.track(new BorrowAppletViewSeeTile(BorrowAppletViewSeeTile.TileType.PAYMENT_TIMELINE), null);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                borrowHomePresenter.analytics.track(new BorrowAppletViewSeeTile(BorrowAppletViewSeeTile.TileType.LOAN_HISTORY), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
