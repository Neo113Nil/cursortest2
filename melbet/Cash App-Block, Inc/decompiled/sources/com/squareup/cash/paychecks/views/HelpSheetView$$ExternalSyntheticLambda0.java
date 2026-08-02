package com.squareup.cash.paychecks.views;

import android.view.View;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentPaySelectPaymentMethod;
import com.squareup.cash.instruments.screens.InstrumentSelectionResult;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.offers.viewmodels.OffersNotificationViewModel;
import com.squareup.cash.offers.viewmodels.OffersRedemptionViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.InfoTileViewModel;
import com.squareup.cash.offers.views.redemption.OffersRedemptionSheetView;
import com.squareup.cash.offers.views.sup.OffersNotificationView;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSkipDialogModel;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewModel$Main;
import com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class HelpSheetView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(AliasPickerViewModel aliasPickerViewModel, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 9;
        this.f$0 = aliasPickerViewModel;
        this.f$2 = function1;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 20;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        CashInstrumentType cashInstrumentType = null;
        int i3 = 2;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i4 = HelpSheetView.$r8$clinit;
                ((HelpSheetView) obj5).Content((HelpSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ShadowKt.OffersCategoryTile((Modifier) obj5, (CategoryOffersTileViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 2:
                Function0 function0 = (Function0) obj5;
                Button button = (Button) obj4;
                Colors colors = (Colors) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SizeKt.ButtonCompact(function0, SpacerKt.m298padding3ABfNKs(companion, 16.0f), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1282559592, new MoneyTabUIKt$$ExternalSyntheticLambda11(i2, button, colors), gapComposer), gapComposer, 1573248, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                BitmapPainterKt.InfoCollectionItem((Modifier) obj5, (InfoTileViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                FilterGroupsSectionViewModel filterGroupsSectionViewModel = (FilterGroupsSectionViewModel) obj5;
                Function1 function1 = (Function1) obj3;
                Function0 function02 = (Function0) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changedInstance = gapComposer2.changedInstance(filterGroupsSectionViewModel) | gapComposer2.changed(function1) | gapComposer2.changed(function02);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(17, filterGroupsSectionViewModel, function1, function02);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    FilterBarKt.FilterBar(null, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue, gapComposer2, 0, 3);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i5 = OffersRedemptionSheetView.$r8$clinit;
                ((OffersRedemptionSheetView) obj5).Content((OffersRedemptionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                MoveBitcoinViewKt.OffersNotification((String) obj5, (Long) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i6 = OffersNotificationView.$r8$clinit;
                ((OffersNotificationView) obj5).Content((OffersNotificationViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                DistanceAndFlags.OffersTimelineV2((OffersTimelineViewModelV2) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                AliasPickerViewModel aliasPickerViewModel = (AliasPickerViewModel) obj5;
                Function1 function12 = (Function1) obj3;
                MutableState mutableState = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Strings.LoadableFullScreenContent(aliasPickerViewModel, aliasPickerViewModel.isLoading, BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors2.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f), null, null, Expect_jvmKt.rememberComposableLambda(1617332174, new CashtagViewKt$$ExternalSyntheticLambda5(function12, mutableState, i3), gapComposer3), gapComposer3, 196608, 24);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                View view = (View) obj5;
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{AndroidCompositionLocals_androidKt.LocalView.defaultProvidedValue$runtime(view), UiScopeKt.LocalContainerAnimatedVisibilityScope.defaultProvidedValue$runtime(animatedVisibilityScope), UiScopeKt.LocalContainerSharedTransitionScope.defaultProvidedValue$runtime(null)}, composableLambdaImpl, gapComposer4, 8);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                P2PListRowKt.AllowlistSkipDialog((AllowlistSkipDialogModel) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.ErrorContent((PasskeyManagementViewModel.Error) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                JvmActuals_jvmKt.InstalledUI((PaychecksAppletTileModel.Installed) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj5;
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj4;
                MutableFloatState mutableFloatState = (MutableFloatState) obj3;
                Float f = (Float) obj2;
                ((CustomAllocationQuestion) obj).getClass();
                if (f != null) {
                    localCashBalancePresenter.confirmValidAllocation(destinationUiConfiguration, f.floatValue(), new MoneyTabUIKt$$ExternalSyntheticLambda39(i2, localCashBalancePresenter, destinationUiConfiguration, mutableFloatState));
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((PaychecksHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.BenefitsModuleNullStateHeader((PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ArcadePaychecksHome((PaychecksHomeViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i7 = DistributePaycheckView.$r8$clinit;
                ((DistributePaycheckView) obj5).Content((DistributePaycheckViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((EditDistributionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Active((MultipleAllocationViewModel.Active) obj5, (Function1) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                Integer num = (Integer) obj;
                num.getClass();
                Float f2 = (Float) obj2;
                f2.getClass();
                ((Function1) obj3).invoke(((EducationalSheetKt$$ExternalSyntheticLambda8) obj5).invoke((MultipleAllocationViewModel.Active) obj4, num, f2));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i8 = PaycheckAlertDialog.$r8$clinit;
                ((PaycheckAlertDialog) obj5).Content((PaycheckAlertDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((PaycheckCircles) obj5).OverflowCircle(Updater.updateChangedFlags(385), (Composer) obj, (Modifier) obj3, (String) obj4);
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ((PaycheckCircles) obj5).AvatarCircle((Image) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaycheckDistributionMonthlyEstimateExplanation((BottomSheet) obj5, (Modifier) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Icon((Color) obj5, (PaychecksReceiptViewModel.Section.Row.Treatment) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Amount((String) obj5, (PaychecksReceiptViewModel.Section.Row.Treatment) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                int i9 = LowDiskSpaceAlertDialog.$r8$clinit;
                ((LowDiskSpaceAlertDialog) obj5).Content((LowDiskSpaceAlertViewModel$Main) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = (LocalPosLocalCashRedemptionPresenter) obj5;
                String str = (String) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                InstrumentSelectionResult instrumentSelectionResult = (InstrumentSelectionResult) obj2;
                ((WhichInstrument) obj).getClass();
                if (instrumentSelectionResult != null) {
                    Analytics analytics = localPosLocalCashRedemptionPresenter.analytics;
                    String str2 = instrumentSelectionResult.token;
                    if (str2 == null) {
                        str2 = "";
                    }
                    analytics.track(new NearbyPaymentPaySelectPaymentMethod(str2, str), null);
                }
                mutableState2.setValue(new InstrumentSelection(instrumentSelectionResult != null ? instrumentSelectionResult.token : null, instrumentSelectionResult != null ? instrumentSelectionResult.acceptedFeeAmount : null, cashInstrumentType, 12));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(FilterGroupsSectionViewModel filterGroupsSectionViewModel, Function1 function1, Function0 function0) {
        this.$r8$classId = 4;
        this.f$0 = filterGroupsSectionViewModel;
        this.f$2 = function1;
        this.f$1 = function0;
    }

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ HelpSheetView$$ExternalSyntheticLambda0(Function1 function1, EducationalSheetKt$$ExternalSyntheticLambda8 educationalSheetKt$$ExternalSyntheticLambda8, MultipleAllocationViewModel.Active active) {
        this.$r8$classId = 21;
        this.f$2 = function1;
        this.f$0 = educationalSheetKt$$ExternalSyntheticLambda8;
        this.f$1 = active;
    }
}
