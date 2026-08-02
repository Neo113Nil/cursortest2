package com.squareup.cash.card.onboarding;

import android.content.Context;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardAlbedo$2$1$bitmap$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $backInkColor;
    public final /* synthetic */ CardTheme.BackgroundImage $background;
    public final /* synthetic */ CardModelView.CardBack $cardBack;
    public final /* synthetic */ int $color;
    public final /* synthetic */ CardTheme.Identifier $id;
    public final /* synthetic */ int $magStripColor;
    public final /* synthetic */ float $opacity;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$cardAlbedo$2$1$bitmap$1(float f, int i, int i2, int i3, CardModelView.CardBack cardBack, CardModelView cardModelView, CardTheme.BackgroundImage backgroundImage, CardTheme.Identifier identifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardModelView;
        this.$opacity = f;
        this.$id = identifier;
        this.$background = backgroundImage;
        this.$color = i;
        this.$cardBack = cardBack;
        this.$backInkColor = i2;
        this.$magStripColor = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardModelView$cardAlbedo$2$1$bitmap$1(this.$opacity, this.$color, this.$backInkColor, this.$magStripColor, this.$cardBack, this.this$0, this.$background, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$cardAlbedo$2$1$bitmap$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Context context = this.this$0.getContext();
        context.getClass();
        return CardsKt.createAlbedo$default(context, this.$id, this.$background, this.$color, this.$cardBack, (int) (this.$opacity * 255.0f), this.$backInkColor, this.$magStripColor);
    }
}
