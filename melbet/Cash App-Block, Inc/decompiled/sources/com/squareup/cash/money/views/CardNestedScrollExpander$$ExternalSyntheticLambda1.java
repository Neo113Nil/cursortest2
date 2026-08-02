package com.squareup.cash.money.views;

import androidx.compose.animation.core.Animatable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardNestedScrollExpander$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardNestedScrollExpander f$0;

    public /* synthetic */ CardNestedScrollExpander$$ExternalSyntheticLambda1(CardNestedScrollExpander cardNestedScrollExpander, int i) {
        this.$r8$classId = i;
        this.f$0 = cardNestedScrollExpander;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CardNestedScrollExpander cardNestedScrollExpander = this.f$0;
        switch (i) {
            case 0:
                Animatable animatable = (Animatable) obj;
                animatable.getClass();
                cardNestedScrollExpander.cardRevealDistance$delegate.setFloatValue(((Number) animatable.getValue()).floatValue());
                break;
            default:
                cardNestedScrollExpander.invokeTransition.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
