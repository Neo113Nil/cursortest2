package com.squareup.cash.card.onboarding;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CardStudioPresenterV2$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenterV2$models$6$1(CardStudioPresenter cardStudioPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStudioPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardStudioPresenterV2$models$6$1(cardStudioPresenter, continuation, 0);
            default:
                return new CardStudioPresenterV2$models$6$1(cardStudioPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStudioPresenterV2$models$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 14;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new TemporaryStorage$getDir$2(cardStudioPresenter, continuation, i2), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
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
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext2 = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new TemporaryStorage$getDir$2(cardStudioPresenter, continuation, i2), this);
                    if (withContext2 != obj3) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj3) {
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
