package com.squareup.cash.card.onboarding;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda29 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda29(Animatable animatable, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$1;
        Animatable animatable = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
            case 1:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
            case 2:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
            default:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * ((Number) state.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
