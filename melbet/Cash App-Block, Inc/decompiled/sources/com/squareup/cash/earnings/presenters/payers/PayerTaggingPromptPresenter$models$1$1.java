package com.squareup.cash.earnings.presenters.payers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository$tagPayer$2;
import com.squareup.cash.earnings.screens.PayerTaggingPromptSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PayerTaggingPromptPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayerTaggingPromptPresenter$models$1$1(CardStudioPresenter cardStudioPresenter, Continuation continuation, int i) {
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
                return new PayerTaggingPromptPresenter$models$1$1(cardStudioPresenter, continuation, 0);
            default:
                return new PayerTaggingPromptPresenter$models$1$1(cardStudioPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PayerTaggingPromptPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPayerRepository realPayerRepository = (RealPayerRepository) cardStudioPresenter.ioContext;
                    String str = ((PayerTaggingPromptSheet) cardStudioPresenter.appConfig).payerToken;
                    this.label = 1;
                    if (JobKt.withContext(realPayerRepository.ioDispatcher, new RealPayerRepository$tagPayer$2(realPayerRepository, str, null, 0), this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPayerRepository realPayerRepository2 = (RealPayerRepository) cardStudioPresenter.ioContext;
                    String str2 = ((PayerTaggingPromptSheet) cardStudioPresenter.appConfig).payerToken;
                    this.label = 1;
                    if (JobKt.withContext(realPayerRepository2.ioDispatcher, new RealPayerRepository$tagPayer$2(realPayerRepository2, str2, null, 1), this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
