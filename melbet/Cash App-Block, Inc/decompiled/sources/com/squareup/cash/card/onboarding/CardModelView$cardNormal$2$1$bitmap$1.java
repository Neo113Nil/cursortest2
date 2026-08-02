package com.squareup.cash.card.onboarding;

import android.content.Context;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardNormal$2$1$bitmap$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTheme.BackgroundImage $backgroundImage;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$cardNormal$2$1$bitmap$1(CardModelView cardModelView, CardTheme.BackgroundImage backgroundImage, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardModelView;
        this.$backgroundImage = backgroundImage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardModelView$cardNormal$2$1$bitmap$1(this.this$0, this.$backgroundImage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$cardNormal$2$1$bitmap$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Context context = this.this$0.getContext();
        context.getClass();
        return CardsKt.createNormal$default(context, this.$backgroundImage);
    }
}
