package com.squareup.cash.card.onboarding;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda23 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;
    public final /* synthetic */ Animatable f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda23(Animatable animatable, Animatable animatable2, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
        this.f$1 = animatable2;
        this.f$2 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$2;
        Animatable animatable = this.f$1;
        Animatable animatable2 = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setAlpha(((Number) animatable2.getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
            case 1:
                reusableGraphicsLayerScope.setAlpha(((Number) animatable2.getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
            case 2:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable2.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
                break;
            case 3:
                reusableGraphicsLayerScope.setTranslationY((1.0f - ((Number) animatable2.getValue()).floatValue()) * (-((Number) state.getValue()).floatValue()));
                reusableGraphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
                break;
            default:
                reusableGraphicsLayerScope.setTranslationY((1.0f - ((Number) animatable2.getValue()).floatValue()) * (-((Number) state.getValue()).floatValue()));
                reusableGraphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
