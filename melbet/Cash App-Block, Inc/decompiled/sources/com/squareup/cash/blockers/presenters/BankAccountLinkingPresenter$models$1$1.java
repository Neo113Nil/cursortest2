package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class BankAccountLinkingPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ BankAccountLinkingPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankAccountLinkingPresenter$models$1$1(BankAccountLinkingPresenter bankAccountLinkingPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = bankAccountLinkingPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        BankAccountLinkingPresenter bankAccountLinkingPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BankAccountLinkingPresenter$models$1$1(bankAccountLinkingPresenter, mutableState, continuation, 0);
            default:
                return new BankAccountLinkingPresenter$models$1$1(bankAccountLinkingPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BankAccountLinkingPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BankAccountLinkingPresenter bankAccountLinkingPresenter = this.this$0;
        MutableState mutableState = this.$state$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) mutableState.getValue();
                    this.L$0 = mutableState;
                    this.label = 1;
                    obj = BankAccountLinkingPresenter.access$verifyAccount(bankAccountLinkingPresenter, bankAccountLinkingViewModel, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((BankAccountLinkingViewModel) obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BankAccountLinkingViewModel bankAccountLinkingViewModel2 = (BankAccountLinkingViewModel) mutableState.getValue();
                    this.L$0 = mutableState;
                    this.label = 1;
                    obj = BankAccountLinkingPresenter.access$linkAccount(bankAccountLinkingPresenter, bankAccountLinkingViewModel2, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((BankAccountLinkingViewModel) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
