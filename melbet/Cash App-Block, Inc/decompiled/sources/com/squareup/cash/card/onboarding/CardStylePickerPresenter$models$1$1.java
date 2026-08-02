package com.squareup.cash.card.onboarding;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardStylePickerViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStylePickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStylePickerPresenter$models$1$1(CardStylePickerPresenter cardStylePickerPresenter, CardStylePickerViewEvent cardStylePickerViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStylePickerPresenter;
        this.$event = cardStylePickerViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStylePickerViewEvent cardStylePickerViewEvent = this.$event;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardStylePickerPresenter$models$1$1(cardStylePickerPresenter, cardStylePickerViewEvent, continuation, 0);
            default:
                return new CardStylePickerPresenter$models$1$1(cardStylePickerPresenter, cardStylePickerViewEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStylePickerPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStylePickerViewEvent cardStylePickerViewEvent = this.$event;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext(cardStylePickerPresenter.ioDispatcher, new CardStylePickerPresenter$cardSelected$2(cardStylePickerPresenter, (CardStylePickerViewEvent.CardSelected) cardStylePickerViewEvent, null), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
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
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStylePickerViewEvent.OnScrollToTheme onScrollToTheme = (CardStylePickerViewEvent.OnScrollToTheme) cardStylePickerViewEvent;
                    String str = onScrollToTheme.themeToken;
                    int i4 = onScrollToTheme.cardIndex;
                    this.label = 1;
                    Object withContext2 = JobKt.withContext(cardStylePickerPresenter.ioDispatcher, new PlaidLinkView.AnonymousClass2(cardStylePickerPresenter, i4, str, (Continuation) null), this);
                    if (withContext2 != obj3) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj3) {
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
