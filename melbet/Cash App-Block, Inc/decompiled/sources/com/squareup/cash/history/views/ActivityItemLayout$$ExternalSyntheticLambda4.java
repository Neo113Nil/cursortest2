package com.squareup.cash.history.views;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewModel;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$WhenMappings;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile$Payload$V1;
import com.squareup.protos.franklin.common.InstrumentLinkingOption;
import com.squareup.protos.franklin.common.LinkType;
import com.squareup.protos.franklin.common.LinkingAction;
import com.squareup.protos.franklin.common.MultiInstrumentLinkingOptions;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import squareup.cash.investcore.trading.syncvalues.TradingState;
import squareup.cash.savings.SavingsFolderV2;
import squareup.cash.savings.SavingsFolderV2$FolderType$GoalFolder;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes6.dex */
public final /* synthetic */ class ActivityItemLayout$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ActivityItemLayout$$ExternalSyntheticLambda4(RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager) {
        this.$r8$classId = 16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction linkingAction;
        InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType linkType;
        Object fullScreenContent;
        int i = this.$r8$classId;
        boolean z = false;
        AppletTileInstallationState.Installed installed = AppletTileInstallationState.Installed.INSTANCE;
        Object obj2 = null;
        InvestingExchangeViewModel.Content.Icon icon = null;
        InvestingExchangeViewModel.Content.Icon icon2 = null;
        Object obj3 = null;
        switch (i) {
            case 0:
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                ((Long) obj).longValue();
                break;
            case 3:
                break;
            case 4:
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Automation automation = ((UiInvestingAutomation) next).automation;
                        if ((automation != null ? automation.trigger : null) == Automation.AutomationTrigger.CASH_CARD_PURCHASE) {
                            obj2 = next;
                        }
                    }
                }
                break;
            case 5:
                List list2 = (List) obj;
                list2.getClass();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        Automation automation2 = ((UiInvestingAutomation) next2).automation;
                        if ((automation2 != null ? automation2.trigger : null) == Automation.AutomationTrigger.CASH_CARD_PURCHASE) {
                            obj3 = next2;
                        }
                    }
                }
                break;
            case 6:
                VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
                versionedSavingsFolders.getClass();
                List list3 = versionedSavingsFolders.v2_folders;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (((SavingsFolderV2) it3.next()).folder_type instanceof SavingsFolderV2$FolderType$GoalFolder) {
                            break;
                        }
                    }
                }
                z = true;
                break;
            case 7:
                PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) obj;
                passcodeDialogViewModel.getClass();
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                break;
            case 12:
                VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
                versionedFinishSetupTile.getClass();
                VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
                if (versionedFinishSetupTile$Payload$V1 == null) {
                    versionedFinishSetupTile$Payload$V1 = null;
                }
                if (versionedFinishSetupTile$Payload$V1 != null) {
                    break;
                }
                break;
            case 13:
                FinishSetupAppletTileViewModel finishSetupAppletTileViewModel = (FinishSetupAppletTileViewModel) obj;
                finishSetupAppletTileViewModel.getClass();
                if (finishSetupAppletTileViewModel instanceof FinishSetupAppletTileViewModel.Loading) {
                    break;
                } else if (!(finishSetupAppletTileViewModel instanceof FinishSetupAppletTileViewModel.Installed)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                break;
            case 15:
                Placeable placeable = (Placeable) obj;
                placeable.getClass();
                break;
            case 16:
                MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
                multiInstrumentLinkingOptions.getClass();
                List<InstrumentLinkingOption> list4 = multiInstrumentLinkingOptions.instrument_linking_option;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (InstrumentLinkingOption instrumentLinkingOption : list4) {
                    List list5 = instrumentLinkingOption.instrument_types;
                    String str = instrumentLinkingOption.title;
                    String str2 = instrumentLinkingOption.description;
                    Long l = instrumentLinkingOption.fee_bps;
                    Long valueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                    Boolean bool = instrumentLinkingOption.show_in_instrument_selector;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    LinkingAction linkingAction2 = instrumentLinkingOption.action;
                    if (linkingAction2 != null) {
                        LinkType linkType2 = linkingAction2.link_type;
                        linkType2.getClass();
                        int ordinal = linkType2.ordinal();
                        if (ordinal == 0) {
                            linkType = InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType.LINK;
                        } else if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            linkType = InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType.REPLACE;
                        }
                        String str3 = linkingAction2.half_sheet_title;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = linkingAction2.half_sheet_description;
                        linkingAction = new InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction(linkType, str3, str4 != null ? str4 : "");
                    } else {
                        linkingAction = null;
                    }
                    arrayList.add(new InstrumentLinkingOptionManager$InstrumentLinkingOption(list5, str, str2, valueOf, booleanValue, linkingAction));
                }
                break;
            case 17:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 18:
                ((ContourLayout.LayoutSpec) obj).getClass();
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 22:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                break;
            case 23:
                Integer num2 = (Integer) obj;
                num2.intValue();
                break;
            case 24:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj;
                featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
                break;
            case 25:
                StocksAppletTileModel stocksAppletTileModel = (StocksAppletTileModel) obj;
                stocksAppletTileModel.getClass();
                if (!(stocksAppletTileModel instanceof StocksAppletTileModel.Installed)) {
                    if (stocksAppletTileModel instanceof StocksAppletTileModel.Uninstalled) {
                        break;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                }
                break;
            case 26:
                TradingState tradingState = (TradingState) obj;
                tradingState.getClass();
                break;
            case 27:
                CategoryToken categoryToken = (CategoryToken) obj;
                categoryToken.getClass();
                break;
            case 28:
                obj.getClass();
                TransferStockViewModel transferStockViewModel = (TransferStockViewModel) obj;
                if (transferStockViewModel instanceof TransferStockViewModel.Content.BottomSheetContent) {
                    TransferStockViewModel.Content.BottomSheetContent bottomSheetContent = (TransferStockViewModel.Content.BottomSheetContent) transferStockViewModel;
                    String str5 = bottomSheetContent.title;
                    TransferStockViewModel.Content.Subtitle subtitle = bottomSheetContent.subtitle;
                    String str6 = subtitle.label;
                    TransferStockViewModel.Content.Icon icon3 = subtitle.icon;
                    if (icon3 != null) {
                        if (ArcadeMigrationUtilsKt$WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()] != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            icon = InvestingExchangeViewModel.Content.Icon.RECURRING;
                        }
                    }
                    fullScreenContent = new InvestingExchangeViewModel.Content.BottomSheetContent(str5, new InvestingExchangeViewModel.Content.Subtitle(str6, icon), bottomSheetContent.orderTypeButtonVisible, bottomSheetContent.amountSelections, bottomSheetContent.restoreKeypadAmount, bottomSheetContent.maxAmount, bottomSheetContent.submitLabel, bottomSheetContent.submitButtonEnabled, false);
                } else if (transferStockViewModel instanceof TransferStockViewModel.Content.FullScreenContent) {
                    TransferStockViewModel.Content.FullScreenContent fullScreenContent2 = (TransferStockViewModel.Content.FullScreenContent) transferStockViewModel;
                    String str7 = fullScreenContent2.title;
                    TransferStockViewModel.Content.Subtitle subtitle2 = fullScreenContent2.subtitle;
                    String str8 = subtitle2.label;
                    TransferStockViewModel.Content.Icon icon4 = subtitle2.icon;
                    if (icon4 != null) {
                        if (ArcadeMigrationUtilsKt$WhenMappings.$EnumSwitchMapping$0[icon4.ordinal()] != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            icon2 = InvestingExchangeViewModel.Content.Icon.RECURRING;
                        }
                    }
                    fullScreenContent = new InvestingExchangeViewModel.Content.FullScreenContent(str7, new InvestingExchangeViewModel.Content.Subtitle(str8, icon2), fullScreenContent2.orderTypeButtonVisible, fullScreenContent2.restoreKeypadAmount, fullScreenContent2.maxAmount, fullScreenContent2.submitLabel, fullScreenContent2.submitButtonEnabled);
                } else if (!transferStockViewModel.equals(TransferStockViewModel.DefaultEmptyModel.INSTANCE) && !transferStockViewModel.equals(TransferStockViewModel.Loading.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    break;
                }
                break;
            default:
                InvestingExchangeViewEvent investingExchangeViewEvent = (InvestingExchangeViewEvent) obj;
                investingExchangeViewEvent.getClass();
                if (investingExchangeViewEvent instanceof InvestingExchangeViewEvent.AmountEntered) {
                    break;
                } else if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.ChangeOrderTypeClicked.INSTANCE)) {
                    break;
                } else {
                    if (!investingExchangeViewEvent.equals(InvestingExchangeViewEvent.CloseButtonClicked.INSTANCE)) {
                        if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.DialogDismissed.INSTANCE)) {
                            break;
                        } else if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.Expanded.INSTANCE)) {
                            break;
                        } else if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.Peeking.INSTANCE)) {
                            break;
                        } else if (investingExchangeViewEvent instanceof InvestingExchangeViewEvent.ItemSelected) {
                            break;
                        } else if (!investingExchangeViewEvent.equals(InvestingExchangeViewEvent.OnBackPressed.INSTANCE)) {
                            if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.Submit.INSTANCE)) {
                                break;
                            } else if (investingExchangeViewEvent.equals(InvestingExchangeViewEvent.AgreeToSellAll.INSTANCE)) {
                                break;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        }
                    }
                    break;
                }
        }
        return null;
    }

    public /* synthetic */ ActivityItemLayout$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }
}
