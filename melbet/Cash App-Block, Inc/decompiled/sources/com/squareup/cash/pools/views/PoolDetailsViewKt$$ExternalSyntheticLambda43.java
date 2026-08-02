package com.squareup.cash.pools.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda43 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PoolDetailsAnimationStateHolder f$0;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda43(PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder, int i) {
        this.$r8$classId = i;
        this.f$0 = poolDetailsAnimationStateHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder = this.f$0;
        switch (i) {
            case 0:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                Animatable animatable = poolDetailsAnimationStateHolder.progressRingScaleAnimatable;
                reusableGraphicsLayerScope.setScaleX(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) animatable.getValue()).floatValue());
                break;
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                Animatable animatable2 = poolDetailsAnimationStateHolder.progressUiScaleAnimatable;
                reusableGraphicsLayerScope2.setScaleX(((Number) animatable2.getValue()).floatValue());
                reusableGraphicsLayerScope2.setScaleY(((Number) animatable2.getValue()).floatValue());
                reusableGraphicsLayerScope2.setAlpha(((Number) poolDetailsAnimationStateHolder.progressUiAlphaAnimatable.getValue()).floatValue());
                break;
            default:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.at(new Dp((-poolDetailsAnimationStateHolder.avatarSize) / 3.0f), 0).easing = new CubicBezierEasing(0.17f, 0.17f, 0.67f, 1.0f);
                float f = (-poolDetailsAnimationStateHolder.avatarSize) / 3.36f;
                keyframesSpecConfig.at(new Dp(f), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                keyframesSpecConfig.at(new Dp(f), EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE).easing = new CubicBezierEasing(0.33f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
                keyframesSpecConfig.durationMillis = 616;
                break;
        }
        return Unit.INSTANCE;
    }
}
