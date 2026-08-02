package com.squareup.cash.pools.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.GraphView;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolsListViewKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PoolsListViewKt$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = PoolToastKt.lambda$275201719;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(PoolToastKt.f569lambda$1823111520);
                return Unit.INSTANCE;
            case 1:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 4:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl);
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver4, 0);
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver5, 0);
                return Unit.INSTANCE;
            case 8:
                return new AnimationVector1D(((Dp) obj).value);
            case 9:
                AnimationVector1D animationVector1D = (AnimationVector1D) obj;
                animationVector1D.getClass();
                return new Dp(animationVector1D.value);
            case 10:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.at(Float.valueOf(1.0f), 0).easing = new CubicBezierEasing(0.17f, RecyclerView.DECELERATION_RATE, 0.63f, 1.0f);
                Float valueOf = Float.valueOf(1.03f);
                keyframesSpecConfig.at(valueOf, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                keyframesSpecConfig.at(valueOf, EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE).easing = new CubicBezierEasing(0.39f, RecyclerView.DECELERATION_RATE, 0.83f, 1.0f);
                keyframesSpecConfig.durationMillis = 616;
                return Unit.INSTANCE;
            case 11:
                InvestingGraphContentModel.Point point = (InvestingGraphContentModel.Point) obj;
                int i = GraphView.$r8$clinit;
                point.getClass();
                return new PriceValue((long) point.y);
            case 12:
                int i2 = InvestingGraphTabsView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 13:
                int i3 = InvestingPortfolioAmountView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 14:
                int i4 = InvestingPortfolioAmountView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 15:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i5 = MooncakeInvestingGraphView.$r8$clinit;
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w());
            case 16:
                int i6 = MooncakeInvestingGraphView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 17:
                int i7 = MooncakeInvestingGraphView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 18:
                int i8 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 19:
                int i9 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 20:
                int i10 = MooncakeInvestingGraphView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 21:
                int i11 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 22:
                int i12 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 23:
                ((MooncakeInvestingGraphView) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver6);
                return Unit.INSTANCE;
            case 25:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return !animatedContentTransitionScopeImpl2.getInitialState().getClass().equals(animatedContentTransitionScopeImpl2.getTargetState().getClass()) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2)) : AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
            case 28:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            default:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl3);
        }
    }
}
