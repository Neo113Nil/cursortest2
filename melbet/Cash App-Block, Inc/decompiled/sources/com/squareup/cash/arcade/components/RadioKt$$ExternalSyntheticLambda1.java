package com.squareup.cash.arcade.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class RadioKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;

    public /* synthetic */ RadioKt$$ExternalSyntheticLambda1(Animatable animatable, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Animatable animatable = this.f$0;
        switch (i) {
            case 0:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
                break;
            case 1:
                ((Density) obj).getClass();
                break;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setRotationY(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope2.setCameraDistance(reusableGraphicsLayerScope2.graphicsDensity.getDensity() * 12.0f);
                break;
            case 3:
                ((Density) obj).getClass();
                break;
            case 4:
                ((Density) obj).getClass();
                break;
            case 5:
                ((Density) obj).getClass();
                break;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(((Number) animatable.getValue()).floatValue());
                float floatValue = (((Number) animatable.getValue()).floatValue() * 0.05f) + 0.95f;
                reusableGraphicsLayerScope3.setScaleX(floatValue);
                reusableGraphicsLayerScope3.setScaleY(floatValue);
                break;
            case 7:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setTranslationX(((Number) animatable.getValue()).floatValue());
                break;
            case 8:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope5 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope5.getClass();
                reusableGraphicsLayerScope5.setRotationZ(((Number) animatable.getValue()).floatValue());
                break;
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope6 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope6.getClass();
                reusableGraphicsLayerScope6.setTranslationY(reusableGraphicsLayerScope6.graphicsDensity.getDensity() * ((Number) animatable.getValue()).floatValue());
                break;
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope7 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope7.getClass();
                reusableGraphicsLayerScope7.setTranslationY(reusableGraphicsLayerScope7.graphicsDensity.getDensity() * ((Number) animatable.getValue()).floatValue());
                break;
            case 11:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope8 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope8.getClass();
                reusableGraphicsLayerScope8.setScaleX(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope8.setScaleY(((Number) animatable.getValue()).floatValue());
                break;
            case 12:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope9 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope9.getClass();
                reusableGraphicsLayerScope9.setTranslationY(((Number) animatable.getValue()).floatValue());
                break;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope10 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope10.getClass();
                reusableGraphicsLayerScope10.setAlpha(((Number) animatable.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
