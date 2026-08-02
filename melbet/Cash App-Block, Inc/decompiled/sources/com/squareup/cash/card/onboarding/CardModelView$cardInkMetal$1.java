package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.Paint;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardInkMetal$1 extends SuspendLambda implements Function3 {
    public /* synthetic */ CardModelView.ViewModel L$0;
    public /* synthetic */ Bitmap L$1;
    public CardModelView.CardFront L$2;
    public int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CardModelView$cardInkMetal$1 cardModelView$cardInkMetal$1 = new CardModelView$cardInkMetal$1(3, (Continuation) obj3);
        cardModelView$cardInkMetal$1.L$0 = (CardModelView.ViewModel) obj;
        cardModelView$cardInkMetal$1.L$1 = (Bitmap) obj2;
        return cardModelView$cardInkMetal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CardModelView.CardFront cardFront;
        CardModelView.CardFront cardFront2;
        CardModelView.ViewModel viewModel = this.L$0;
        Bitmap bitmap = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EquatableBitmap equatableBitmap = null;
        Object[] objArr = 0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Paint paint = CardModelView.REMOVE_PAINT;
            cardFront = CardModelView.Companion.toCardFront(viewModel);
            if (bitmap != null) {
                this.L$0 = viewModel;
                this.L$1 = null;
                this.L$2 = cardFront;
                this.label = 1;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2(bitmap, objArr == true ? 1 : 0, 0), this);
                if (withContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = withContext;
                cardFront2 = cardFront;
            }
            CardModelView.CardFront copy$default = CardModelView.CardFront.copy$default(cardFront, equatableBitmap);
            Paint paint2 = CardModelView.REMOVE_PAINT;
            return new Pair(copy$default, CardModelView.Companion.toCardBack(viewModel));
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cardFront2 = this.L$2;
        SafeTrace.throwOnFailure(obj);
        equatableBitmap = (EquatableBitmap) obj;
        cardFront = cardFront2;
        CardModelView.CardFront copy$default2 = CardModelView.CardFront.copy$default(cardFront, equatableBitmap);
        Paint paint22 = CardModelView.REMOVE_PAINT;
        return new Pair(copy$default2, CardModelView.Companion.toCardBack(viewModel));
    }
}
