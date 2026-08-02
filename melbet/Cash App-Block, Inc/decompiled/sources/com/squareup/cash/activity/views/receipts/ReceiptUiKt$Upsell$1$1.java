package com.squareup.cash.activity.views.receipts;

import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.protos.franklin.ui.ReceiptSection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ReceiptUiKt$Upsell$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ ReceiptSection.Upsell $upsell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptUiKt$Upsell$1$1(Function1 function1, ReceiptSection.Upsell upsell, Continuation continuation) {
        super(2, continuation);
        this.$onEvent = function1;
        this.$upsell = upsell;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptUiKt$Upsell$1$1(this.$onEvent, this.$upsell, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiptUiKt$Upsell$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.$onEvent.invoke(new ReceiptViewEvent.UpsellViewed(this.$upsell));
        return Unit.INSTANCE;
    }
}
