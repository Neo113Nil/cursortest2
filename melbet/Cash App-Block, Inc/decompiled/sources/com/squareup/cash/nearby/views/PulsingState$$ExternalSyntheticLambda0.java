package com.squareup.cash.nearby.views;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.offers.views.sup.SwipeState;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.wallet.views.TagHeroBackgroundKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class PulsingState$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;

    public /* synthetic */ PulsingState$$ExternalSyntheticLambda0(float f, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = this.f$0;
        switch (i) {
            case 0:
                Float f2 = (Float) obj;
                f2.getClass();
                break;
            case 1:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.name = "padding";
                inspectorInfo.value = new Dp(f);
                break;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(f);
                break;
            case 3:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setTranslationY(f);
                break;
            case 4:
                ((Float) obj).floatValue();
                break;
            case 5:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setRotationZ(f);
                break;
            case 6:
                ((Density) obj).getClass();
                break;
            case 7:
                ((Density) obj).getClass();
                break;
            case 8:
                ((Density) obj).getClass();
                break;
            case 9:
                ((Density) obj).getClass();
                break;
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setTranslationY(f);
                break;
            case 11:
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                draggableAnchorsConfig.getClass();
                draggableAnchorsConfig.at(SwipeState.UP, -f);
                draggableAnchorsConfig.at(SwipeState.START, RecyclerView.DECELERATION_RATE);
                break;
            case 12:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope5 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope5.getClass();
                reusableGraphicsLayerScope5.setRotationZ(f);
                break;
            case 13:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope6 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope6.getClass();
                reusableGraphicsLayerScope6.setRotationZ(f);
                break;
            case 14:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope7 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope7.getClass();
                reusableGraphicsLayerScope7.setRotationZ(f);
                break;
            case 15:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope8 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope8.getClass();
                reusableGraphicsLayerScope8.setRotationZ(f);
                break;
            case 16:
                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj;
                recurringReloadConfigurationViewModel.getClass();
                break;
            case 17:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope9 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope9.getClass();
                reusableGraphicsLayerScope9.setAlpha(f);
                break;
            case 18:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope10 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope10.getClass();
                reusableGraphicsLayerScope10.setAlpha(RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f));
                break;
            case 19:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope11 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope11.getClass();
                reusableGraphicsLayerScope11.setScaleX(1.3272839f);
                reusableGraphicsLayerScope11.setScaleY(1.3272839f);
                reusableGraphicsLayerScope11.m711setTransformOrigin__ExYCQ(TagHeroBackgroundKt.TAG_BACKGROUND_TRANSFORM_ORIGIN);
                reusableGraphicsLayerScope11.setAlpha(f);
                break;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope12 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope12.getClass();
                reusableGraphicsLayerScope12.setAlpha(f);
                break;
        }
        return Unit.INSTANCE;
    }
}
