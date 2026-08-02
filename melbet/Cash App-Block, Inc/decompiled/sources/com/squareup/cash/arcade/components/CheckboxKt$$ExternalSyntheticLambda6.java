package com.squareup.cash.arcade.components;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class CheckboxKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ CheckboxKt$$ExternalSyntheticLambda6(State state, State state2, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
        this.f$1 = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$1;
        State state2 = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state.getValue()).floatValue());
                break;
            case 1:
                reusableGraphicsLayerScope.setTranslationY(reusableGraphicsLayerScope.graphicsDensity.getDensity() * ((state2 == null || !((Boolean) state2.getValue()).booleanValue()) ? ((Number) state.getValue()).floatValue() : 4.0f));
                break;
            case 2:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY(((Number) state.getValue()).floatValue());
                break;
            case 3:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state.getValue()).floatValue());
                break;
            case 4:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue() * (state != null ? ((Number) state.getValue()).floatValue() : 1.0f));
                break;
            case 5:
                reusableGraphicsLayerScope.setScaleX(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
                break;
            default:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
