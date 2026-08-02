package com.squareup.cash.dialog;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.play.integrity.internal.aj;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.VerifyCheckDepositViewModel;
import com.squareup.cash.common.composeui.animations.RegularShaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.components.EarningsCardKt;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.TimeframeViewModel;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter$models$3$1;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationResult;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.family.sectionprovider.ManagedAccountItem;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.formview.components.ArcadeFormButtonView;
import com.squareup.cash.formview.components.FormCustomizedCardView;
import com.squareup.cash.formview.components.FormElementViewBuilder;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellActivityViewModel$Accessory$Amount;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfileTransactionsBarViewModel;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.KTypesJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ArcadeModal$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 2;
        int i3 = 1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((ArcadeModal) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState = (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int ordinal = captureState.ordinal();
                    if (ordinal == 0) {
                        gapComposer.startReplaceGroup(1475773303);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.check_capture_incomplete), (Map) null, (Function1) null, false);
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 740341332, false);
                        }
                        gapComposer.startReplaceGroup(1475889677);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Icons icons = Icons.Check16;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.icon.success, gapComposer, 54, 4);
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 4.0f));
                        String stringResource = Room.stringResource(gapComposer, R.string.check_capture_complete);
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((RegularShaker) obj3).currentOffset$delegate.setFloatValue(floatValue);
                return Unit.INSTANCE;
            case 3:
                PaperMoneyDepositBarcodeViewModel.Ready ready = (PaperMoneyDepositBarcodeViewModel.Ready) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str = ready.success.title_text;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer2, fillMaxWidth, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LocalizedString localizedString = actionableButtonCtaGroup.disclaimer_text;
                    String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                    if (translated == null) {
                        translated = "";
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, translated, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AtmWithdrawalMapViewArcadeKt.FeeInformationFooter((AtmWithdrawalMapViewModel.AtmFeeViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                EarningsCardKt.EarningsActivitySection((EarningsHomeViewModel.EarningsActivity) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                TimeframeViewModel timeframeViewModel = (TimeframeViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, timeframeViewModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                EarningsTrackerViewKt.LoadingShimmer((DateFilterBarViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                EarningsTrackerViewModel.Loaded loaded = (EarningsTrackerViewModel.Loaded) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(R.string.earnings_tracker_key_stats_net_earnings_cell_body, new Object[]{loaded.formattedProcessingFees}, gapComposer5), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) obj3;
                ((ControlDisablingConfirmationScreen.DisablingConfirmationQuestion) obj).getClass();
                boolean z = ((ControlDisablingConfirmationResult) obj2) instanceof ControlDisablingConfirmationResult.Positive;
                CoroutineScope coroutineScope = baseDependentControlPresenter.sandboxedScope;
                if (z) {
                    JobKt.launch$default(coroutineScope, null, null, new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, objArr2 == true ? 1 : 0, i3), 3);
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, objArr == true ? 1 : 0, i2), 3);
                }
                return Unit.INSTANCE;
            case 11:
                DependentBalancesViewModel.BalanceStatModel balanceStatModel = (DependentBalancesViewModel.BalanceStatModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceStatModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.AllowanceSection((AllowanceSectionViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((ManagedAccountItem) obj3).UI((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.InfoCard((FidesmoProvisioningViewModel.PreScanInstructions.InfoCard) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((ArcadeFormButtonView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ((FormCustomizedCardView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                StateFlowKt.emitOrThrow(((FormElementViewBuilder) obj3).viewEvents, new FormViewEvent.FormUrlClicked(str2));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ((ArcadeFormDateInputView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ((ArcadeFormEmojiPicker) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((ArcadeFormMerchantTransactionPickerView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((ArcadeFormTextInputGroupView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ArcadeFormUpsellKt.HorizontalUpsellContent((FormBlocker.Element.UpsellElement) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                AvatarEntry avatarEntry = (AvatarEntry) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size48, avatarEntry, null, false, gapComposer7, 6, 28);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                aj ajVar = (aj) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((GenericComponentViewModel$CellActivityViewModel$Accessory$Amount) ajVar).amount, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.ErrorToast((GlobalSearchViewModel.ErrorToast) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 26:
                GrowToolsManagerViewModel.Loaded.DetailRow detailRow = (GrowToolsManagerViewModel.Loaded.DetailRow) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, detailRow.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                KTypesJvm.Totals((GrowToolsManagerViewModel.Loaded.TotalStats) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                PaymentHistoryWidgetKt.ProfileTransactionsBar((ProfileTransactionsBarViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, instrumentCellViewModel.primaryLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeModal$$ExternalSyntheticLambda5(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
