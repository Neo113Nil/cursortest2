package com.squareup.cash.offers.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.media3.ui.PlayerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.HomeContentType;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFilterGroupSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.offers.views.home.OffersHomeViewKt;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.protos.cash.blockly.sync_values.P2PAllowListCustomer;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import squareup.cash.bankingbenefits.ui.VersionedCashGreen;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersStyledTextKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OffersStyledTextKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long duration;
        long duration2;
        switch (this.$r8$classId) {
            case 0:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
                versionedCashGreen.getClass();
                return versionedCashGreen.cash_green_v1;
            case 2:
                ((OffersFilterGroupSheetViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                list.getClass();
                float floatValue = ((Number) list.get(0)).floatValue();
                float floatValue2 = ((Number) list.get(1)).floatValue();
                OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState = new OffersCollapsibleHeaderScaffoldState();
                offersCollapsibleHeaderScaffoldState.headerHeightInPx$delegate.setFloatValue(floatValue);
                offersCollapsibleHeaderScaffoldState.headerYOffsetInPx$delegate.setFloatValue(floatValue2);
                return offersCollapsibleHeaderScaffoldState;
            case 4:
                OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) obj;
                offersCommonOfferRowViewModel.getClass();
                return offersCommonOfferRowViewModel.id;
            case 5:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return ((animatedContentTransitionScopeImpl.getInitialState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons) && (animatedContentTransitionScopeImpl.getTargetState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.Loading)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, null, 5), 2), EnterExitTransitionKt.fadeOut$default(null, 3)) : ((animatedContentTransitionScopeImpl.getInitialState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.Loading) && (animatedContentTransitionScopeImpl.getTargetState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.MessageText)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(1, new OffersStyledTextKt$$ExternalSyntheticLambda0(6)).plus(EnterExitTransitionKt.fadeIn$default(null, 3)), EnterExitTransitionKt.slideOutVertically$default(3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 3))) : ((animatedContentTransitionScopeImpl.getInitialState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.MessageText) && (animatedContentTransitionScopeImpl.getTargetState() instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(600, 600, null, 4), 2), EnterExitTransitionKt.slideOutVertically$default(3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 3))) : AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
            case 6:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 7:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return ((animatedContentTransitionScopeImpl2.getInitialState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard) && (animatedContentTransitionScopeImpl2.getTargetState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Loading)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, null, 5), 2), EnterExitTransitionKt.fadeOut$default(null, 3)) : ((animatedContentTransitionScopeImpl2.getInitialState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Loading) && (animatedContentTransitionScopeImpl2.getTargetState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(1, new OffersStyledTextKt$$ExternalSyntheticLambda0(8)).plus(EnterExitTransitionKt.fadeIn$default(null, 3)), EnterExitTransitionKt.slideOutVertically$default(3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 3))) : ((animatedContentTransitionScopeImpl2.getInitialState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText) && (animatedContentTransitionScopeImpl2.getTargetState() instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard)) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(600, 600, null, 4), 2), EnterExitTransitionKt.slideOutVertically$default(3, null).plus(EnterExitTransitionKt.fadeOut$default(null, 3))) : AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 9:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl3);
            case 10:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl4.getClass();
                Object initialState = animatedContentTransitionScopeImpl4.getInitialState();
                OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile = initialState instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile ? (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) initialState : null;
                String str = currentTile != null ? currentTile.offerToken : null;
                Object targetState = animatedContentTransitionScopeImpl4.getTargetState();
                OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile2 = targetState instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile ? (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) targetState : null;
                return Intrinsics.areEqual(str, currentTile2 != null ? currentTile2.offerToken : null) ? AnimatedContentKt.with(EnterTransitionImpl.None, ExitTransitionImpl.None) : OffersHeroTileKt.defaultTransitionSpec;
            case 11:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl5.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl5);
            case 12:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.EaseInOutCubic;
                ContentTransform with = AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(new TweenSpec(100, 100, cubicBezierEasing), 2), EnterExitTransitionKt.fadeOut$default(OffersHomeViewKt.tweenCubicBezierEasing$default(150, 2, cubicBezierEasing), 2));
                with.sizeTransform = null;
                return with;
            case 13:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 14:
                ((Integer) obj).intValue();
                return HomeContentType.CATEGORY;
            case 15:
                ((OffersSearchViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                OffersSearchListItemViewModel offersSearchListItemViewModel = (OffersSearchListItemViewModel) obj;
                offersSearchListItemViewModel.getClass();
                return offersSearchListItemViewModel.getId();
            case 17:
                OffersSearchListItemViewModel offersSearchListItemViewModel2 = (OffersSearchListItemViewModel) obj;
                offersSearchListItemViewModel2.getClass();
                if ((offersSearchListItemViewModel2 instanceof OffersCommonOfferRowViewModel) || (offersSearchListItemViewModel2 instanceof OffersSearchListItemViewModel.OffersSearchFilterRowViewModel)) {
                    return "OffersRow";
                }
                return Reflection.factory.getOrCreateKotlinClass(offersSearchListItemViewModel2.getClass());
            case 18:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return blockersData;
            case 19:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 20:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl6.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl6);
            case 21:
                PlayerView playerView = (PlayerView) obj;
                playerView.getClass();
                playerView.setPlayer(null);
                return Unit.INSTANCE;
            case 22:
                if (((AllowlistSelectionViewEvent.ChangeSearchText) obj).text.getValue().length() > 0) {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, DurationUnit.MILLISECONDS);
                } else {
                    Duration.Companion companion2 = Duration.Companion;
                    duration = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                return new Duration(duration);
            case 23:
                P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
                p2PAllowListCustomer.getClass();
                return p2PAllowListCustomer.allowlist_customer_token;
            case 24:
                if (((SelectCustomerViewEvent.ChangeSearchText) obj).text.getValue().length() > 0) {
                    Duration.Companion companion3 = Duration.Companion;
                    duration2 = DurationKt.toDuration(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, DurationUnit.MILLISECONDS);
                } else {
                    Duration.Companion companion4 = Duration.Companion;
                    duration2 = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                return new Duration(duration2);
            case 25:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl7 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl7.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl7);
            case 26:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled());
            case 27:
                PaychecksAppletTileModel paychecksAppletTileModel = (PaychecksAppletTileModel) obj;
                paychecksAppletTileModel.getClass();
                return paychecksAppletTileModel.getShowAsServiceApplet() ? AppletTileInstallationSectionId.SERVICE : AppletTileInstallationSectionId.BANKING_GROUPED;
            case 28:
                PaychecksAppletTileModel paychecksAppletTileModel2 = (PaychecksAppletTileModel) obj;
                paychecksAppletTileModel2.getClass();
                if (paychecksAppletTileModel2 instanceof PaychecksAppletTileModel.Loading) {
                    return AppletTileInstallationState.Loading.INSTANCE;
                }
                if (paychecksAppletTileModel2 instanceof PaychecksAppletTileModel.Installed) {
                    return AppletTileInstallationState.Installed.INSTANCE;
                }
                if (paychecksAppletTileModel2 instanceof PaychecksAppletTileModel.Uninstalled) {
                    return AppletTileInstallationState.Uninstalled.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount = (PaychecksUiState.RealizedAllocationAmount) obj;
                realizedAllocationAmount.getClass();
                return realizedAllocationAmount.destination;
        }
    }
}
