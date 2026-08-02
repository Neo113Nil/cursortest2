package com.squareup.cash.payments.views;

import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ RecipientViewModel $contact;
    public final /* synthetic */ Function1 $onRecipientViewed;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1(Function1 function1, RecipientViewModel recipientViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onRecipientViewed = function1;
        this.$contact = recipientViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RecipientViewModel recipientViewModel = this.$contact;
        Function1 function1 = this.$onRecipientViewed;
        switch (i) {
            case 0:
                return new RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1(function1, recipientViewModel, continuation, 0);
            default:
                return new RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1(function1, recipientViewModel, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RecipientViewModel recipientViewModel = this.$contact;
        Function1 function1 = this.$onRecipientViewed;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(recipientViewModel);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (function1 != null) {
                    function1.invoke(recipientViewModel);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
