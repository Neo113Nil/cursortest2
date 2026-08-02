package com.squareup.cash.score.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreVisualizationKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;
    public final /* synthetic */ Animatable f$1;

    public /* synthetic */ ScoreVisualizationKt$$ExternalSyntheticLambda10(Animatable animatable, Animatable animatable2, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
        this.f$1 = animatable2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Animatable animatable = this.f$1;
        Animatable animatable2 = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setRotationY(((Number) animatable2.getValue()).intValue());
                reusableGraphicsLayerScope.setScaleX(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) animatable.getValue()).floatValue());
                break;
            default:
                reusableGraphicsLayerScope.setTranslationY(((Number) animatable2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) animatable.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
