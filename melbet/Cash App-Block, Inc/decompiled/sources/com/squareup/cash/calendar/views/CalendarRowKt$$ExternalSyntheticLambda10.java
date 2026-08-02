package com.squareup.cash.calendar.views;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubSectionHeaderView;
import com.squareup.cash.buynowpaylater.views.AfterPaySectionRowView;
import com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.instancing.GridCell;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class CalendarRowKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map map;
        switch (this.$r8$classId) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                int i = AfterPayOrderHubMainHeaderView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 2:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 3:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 4:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 5:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 6:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 7:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 8:
                Context context = (Context) obj;
                context.getClass();
                return new AfterPayOrderHubSectionHeaderView(context);
            case 9:
                int i2 = AfterPaySectionRowView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 10:
                int i3 = AfterPaySectionRowView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 11:
                int i4 = AfterPaySectionRowView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 12:
                int i5 = AfterPaySectionRowView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 13:
                int i6 = AfterPayTotalOwedRow.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 14:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = CanvasKt.lambda$313022783;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(CanvasKt.lambda$1895805494);
                snapshotStateList.add(CanvasKt.f335lambda$1335973193);
                return Unit.INSTANCE;
            case 16:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setRotationZ(90.0f);
                return Unit.INSTANCE;
            case 17:
                return Integer.valueOf((int) ((-((Integer) obj).intValue()) * 0.05f));
            case 18:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                List list = (List) obj;
                list.getClass();
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) CollectionsKt.firstOrNull(list);
                map = cardThemeDefinitions != null ? cardThemeDefinitions.card_theme_definitions : null;
                if (map != null) {
                    return map;
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            case 20:
                List list2 = (List) obj;
                list2.getClass();
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) CollectionsKt.firstOrNull(list2);
                map = tagThemeDefinitions != null ? tagThemeDefinitions.tag_theme_definitions : null;
                if (map != null) {
                    return map;
                }
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                return emptyMap2;
            case 21:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(700, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(700, 0, null, 6), 2));
            case 22:
                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) obj;
                paymentDeviceItemViewModel.getClass();
                return paymentDeviceItemViewModel.id;
            case 23:
                ((Exception) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                List list3 = (List) obj;
                list3.getClass();
                TagThemeDefinitions tagThemeDefinitions2 = (TagThemeDefinitions) CollectionsKt.firstOrNull(list3);
                map = tagThemeDefinitions2 != null ? tagThemeDefinitions2.tag_theme_definitions : null;
                if (map != null) {
                    return map;
                }
                EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                emptyMap3.getClass();
                return emptyMap3;
            case 25:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 26:
                ((CardScene) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((Float) obj).floatValue();
                return Unit.INSTANCE;
            case 28:
                GridCell gridCell = (GridCell) obj;
                gridCell.getClass();
                return Integer.valueOf(gridCell.virtualRow);
            default:
                GridCell gridCell2 = (GridCell) obj;
                gridCell2.getClass();
                return Integer.valueOf(gridCell2.virtualCol);
        }
    }
}
