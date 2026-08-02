package com.squareup.cash.money.views;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.animations.HypeCountdownAnimationKt;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ProcessingIndicator;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.home.MoneybotHomeScaffoldContentScope;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKey;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKeys;
import com.squareup.cash.moneybot.widgets.ComposerSharedTransitionScope;
import com.squareup.cash.moneybot.widgets.ComposerState;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.PushOnPressScope;
import com.squareup.cash.mooncake.compose_ui.components.SplitButtonEntry;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OfferFooterButton;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.views.FittedTextState;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda11(SplitButtonEntry splitButtonEntry, SplitButtonEntry splitButtonEntry2, float f) {
        this.$r8$classId = 14;
        SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
        this.f$0 = splitButtonEntry;
        this.f$2 = splitButtonEntry2;
    }

    private final Object invoke$com$squareup$cash$offers$views$details$OfferDetailsSheetV2Kt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2 = (OffersDetailsSheetViewModelV2) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean z = offersDetailsSheetViewModelV2 instanceof OffersDetailsSheetViewModelV2.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Strings.m3984LoadableSheetContentosbwsH8(offersDetailsSheetViewModelV2, z, 250.0f, null, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-617945571, new MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5(paddingValues, function1, i), gapComposer), gapComposer, 221568, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$offers$views$home$collectionCluster$InfoCollectionItemKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Button button = (Button) this.f$0;
        Colors colors = (Colors) this.f$2;
        RowScope rowScope = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        rowScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier weight = rowScope.weight(1.0f, Modifier.Companion.$$INSTANCE, false);
            StyledText styledText = button.styled_text;
            Color color = null;
            if (styledText == null) {
                styledText = new StyledText(button.text, (com.squareup.protos.cash.ui.Color) null, 6);
            }
            StyledText styledText2 = styledText;
            StyledText styledText3 = button.styled_text;
            com.squareup.protos.cash.ui.Color color2 = styledText3 != null ? styledText3.text_color : null;
            if (color2 == null) {
                gapComposer.startReplaceGroup(-703483809);
                gapComposer.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 115854306, color2, gapComposer, false);
            }
            UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(weight, styledText2, null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact, color != null ? color.value : colors.component.button.prominent.text.f162default, 1, 0L, 0, 3, gapComposer, 196608, 452);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$offers$views$sup$OffersNotificationKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) this.f$0;
        String str = (String) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), paddingValuesImpl);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).caption, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$offers$views$timeline$OffersTimelineSheetV2Kt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        OffersTimelineViewModelV2 offersTimelineViewModelV2 = (OffersTimelineViewModelV2) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            DistanceAndFlags.OffersTimelineV2(offersTimelineViewModelV2, SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues), function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$onboarding$accountpicker$views$AccountPickerViewKt$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f$0;
        AccountViewModel accountViewModel = (AccountViewModel) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1688536771, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, 3), gapComposer), Expect_jvmKt.rememberComposableLambda(-546508028, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, 4), gapComposer), Modifier.Companion.$$INSTANCE, function0, null, false, true, Expect_jvmKt.rememberComposableLambda(-1071874934, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, 5), gapComposer), null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, 819462198, 0, 3376);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$AllowlistSelectionKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) this.f$0;
        TextFieldState textFieldState = (TextFieldState) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            SearchBarKt.SearchBar(textFieldState, allowlistSelectionViewModel.searchModel.searchBarPlaceholder, SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer), null, null, ShowNavigationBack.Never, null, null, null, null, false, null, gapComposer, 196608, 0, 8152);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$P2PListRowKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        long j;
        P2PListRowModel p2PListRowModel = (P2PListRowModel) this.f$0;
        P2PListRowTapButtonEvent p2PListRowTapButtonEvent = (P2PListRowTapButtonEvent) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = p2PListRowModel.buttonLabel;
            TextStyle textStyle = Strings.getTypography(gapComposer).buttonCompact;
            if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapDisabledUnblock) {
                gapComposer.startReplaceGroup(117099028);
                j = Strings.getColors(gapComposer).component.button.standard.text.disabled;
                gapComposer.end(false);
            } else if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapBlockOrUnblock) {
                gapComposer.startReplaceGroup(-664828141);
                boolean z = ((P2PListRowTapButtonEvent.TapBlockOrUnblock) p2PListRowTapButtonEvent).toBlock;
                if (z) {
                    gapComposer.startReplaceGroup(117104787);
                    j = Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default;
                    gapComposer.end(false);
                } else {
                    if (z) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 117101263, false);
                    }
                    gapComposer.startReplaceGroup(117107507);
                    j = Strings.getColors(gapComposer).component.button.standard.text.f165default;
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                if (!(p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 117096406, false);
                }
                gapComposer.startReplaceGroup(-664543809);
                P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
                boolean z2 = tapAddOrRemove.toAdd;
                if (z2) {
                    gapComposer.startReplaceGroup(117113331);
                    j = Strings.getColors(gapComposer).component.button.prominent.text.f162default;
                    gapComposer.end(false);
                } else {
                    if (z2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 117110435, false);
                    }
                    gapComposer.startReplaceGroup(-664390266);
                    if (tapAddOrRemove.isAtLimit) {
                        gapComposer.startReplaceGroup(117119091);
                        j = Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(117121907);
                        j = Strings.getColors(gapComposer).component.button.standard.text.f165default;
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$P2PListViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        P2PListViewModel p2PListViewModel = (P2PListViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = p2PListViewModel.supportPageUrl;
            if (str == null) {
                gapComposer.startReplaceGroup(690164093);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(690164094);
                Icons icons = Icons.NavigationHelp;
                String str2 = p2PListViewModel.supportPageButtonAccessibilityLabel;
                boolean changed = gapComposer.changed(function1) | gapComposer.changed(str);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TransactorKt.IconAction(titleBarActionScope, icons, str2, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$P2PListViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        final P2PListButtonValues p2PListButtonValues = (P2PListButtonValues) this.f$0;
        final Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = p2PListButtonValues.isProminent ? ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = p2PListButtonValues.enabled;
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(p2PListButtonValues);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                function1.invoke(p2PListButtonValues.event);
                                break;
                            default:
                                function1.invoke(p2PListButtonValues.event);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier disabledClickable = AllowanceViewKt.disabledClickable(fillMaxWidth, z, (Function0) rememberedValue);
            boolean z2 = p2PListButtonValues.enabled;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(p2PListButtonValues);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                function1.invoke(p2PListButtonValues.event);
                                break;
                            default:
                                function1.invoke(p2PListButtonValues.event);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue2, disabledClickable, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(-153228763, new P2PListViewKt$$ExternalSyntheticLambda12(p2PListButtonValues, i), gapComposer), gapComposer, 1572864, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 16;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$2;
        int i4 = 14;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                NextAvailableCashTag nextAvailableCashTag = (NextAvailableCashTag) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                if (nextAvailableCashTag == null) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(-1218909106);
                    gapComposer.end(false);
                } else {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startReplaceGroup(-1218909105);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(28, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    HypeCountdownAnimationKt.m3503HypeCountdownAnimationuDo3WH8(nextAvailableCashTag, null, 0L, (Function0) rememberedValue, gapComposer2, 64);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                ChatCardViewModel.ActivityList activityList = (ChatCardViewModel.ActivityList) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    String str = activityList.title;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (str == null) {
                        gapComposer3.startReplaceGroup(1307141691);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1307141692);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                        TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleSmall;
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer3, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        re$$ExternalSyntheticOutline0.m(companion2, 24.0f, gapComposer3, false);
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer3.startReplaceGroup(-1194890193);
                    for (ChatCardViewModel.ActivityList.Row row : activityList.rows) {
                        if (row instanceof ChatCardViewModel.ActivityList.Row.Loaded) {
                            gapComposer3.startReplaceGroup(-789897137);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                            UiCallbackModel uiCallbackModel = ((ChatCardViewModel.ActivityList.Row.Loaded) row).item;
                            ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, fillMaxWidth, Color.Transparent, gapComposer3, 3456, 0);
                            gapComposer3.end(false);
                        } else {
                            if (!Intrinsics.areEqual(row, ChatCardViewModel.ActivityList.Row.Loading.INSTANCE)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -164029295, false);
                            }
                            gapComposer3.startReplaceGroup(-164020749);
                            ShimmerCellsKt.m3504ShimmerCellItemFNF3uiM(false, false, Color.Transparent, gapComposer3, MLKEMEngine.KyberPolyBytes, 3);
                            gapComposer3.end(false);
                        }
                    }
                    gapComposer3.end(false);
                    gapComposer3.end(true);
                    if (activityList.hasMore) {
                        gapComposer3.startReplaceGroup(1307900913);
                        boolean changed2 = gapComposer3.changed(function12);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(3, function12);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue2, 15), 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer3, 54);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.activity_list_show_all), (Map) null, (Function1) null, false);
                        Strings.getSizes(gapComposer3).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion2, 8.0f, gapComposer3);
                        Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(gapComposer3).semantic.icon.subtle, gapComposer3, 54, 4);
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1308680470);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Painter painter = (Painter) obj5;
                Color color = (Color) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InsightChartKt.m3628DescriptionIconkvuU558(painter, color, gapComposer4, Painter.$stable | 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ProcessingIndicator processingIndicator = chat.processingIndicator;
                    if (processingIndicator == null) {
                        gapComposer5.startReplaceGroup(1387245584);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(1387245585);
                        ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        PagerDefaults.ThinkingIndicator(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), processingIndicator, function13, gapComposer5, 0);
                        gapComposer5.end(false);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 4.0f, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 10);
                    TabToolbarInternalViewModel tabToolbarViewModel = moneybotHomeViewModel.getTabToolbarViewModel();
                    boolean changed3 = gapComposer6.changed(function14);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(i2, function14);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    TabToolbarsKt.TabToolbar(m302paddingqDBjuR0$default2, tabToolbarViewModel, null, false, null, null, null, (Function1) rememberedValue3, null, null, new MoneybotToolbarSharedElementConfig(uiScope, uiScope, MoneybotToolbarSharedKey$Leading.INSTANCE, MoneybotToolbarSharedKey$Trailing.INSTANCE), null, false, gapComposer6, 6, 8, 7036);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Modifier modifier = (Modifier) obj5;
                Function1 function15 = (Function1) obj4;
                UiScope uiScope2 = (UiScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                uiScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(uiScope2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Transition transition = (Transition) gapComposer7.consume(UiScopeKt.LocalSwipeTransition);
                    boolean z = transition != null && transition.isRunning();
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer7, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Modifier alpha = AlphaKt.alpha(SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 24.0f, RecyclerView.DECELERATION_RATE, 24.0f, 8.0f, 2)), z ? RecyclerView.DECELERATION_RATE : 1.0f);
                    ComposerState composerState = ComposerState.COLLAPSED;
                    boolean z2 = !z;
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new InsightChartKt$$ExternalSyntheticLambda19(17);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.Composer(alpha, composerState, null, false, false, z2, null, null, uiScope2, uiScope2, null, (Function1) rememberedValue4, null, null, gapComposer7, ((intValue5 << 24) & 234881024) | 48 | ((intValue5 << 27) & 1879048192), 48, 13532);
                    Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer7);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue5;
                    boolean changed4 = gapComposer7.changed(function15);
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda21(21, function15);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    BoxKt.Box(ImageKt.m182clickableO2vRcR0$default(matchParentSize, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue6, 28), gapComposer7, 0);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ParticleGridRenderer particleGridRenderer = (ParticleGridRenderer) obj5;
                State state = (State) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    MoneybotColors moneybotColors = (MoneybotColors) gapComposer8.consume(MoneybotThemeKt.LocalMoneybotColors);
                    if (moneybotColors == null) {
                        gapComposer8.startReplaceGroup(-973090538);
                        Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        moneybotColors = MoneybotColorsKt.fromArcade(colors2);
                    } else {
                        gapComposer8.startReplaceGroup(-973091964);
                    }
                    gapComposer8.end(false);
                    Brush brush = moneybotColors.canvas.gradient;
                    if (brush == null) {
                        gapComposer8.startReplaceGroup(1406319107);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1406319108);
                        BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 700.0f), brush, null, 6), gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    if (particleGridRenderer != null) {
                        gapComposer8.startReplaceGroup(1406598170);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM());
                        boolean changed5 = gapComposer8.changed(state);
                        Object rememberedValue7 = gapComposer8.rememberedValue();
                        if (changed5 || rememberedValue7 == neverEqualPolicy) {
                            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, i4);
                            gapComposer8.updateRememberedValue(rememberedValue7);
                        }
                        MoneybotHomeViewKt.MoneybotParticleGrid(particleGridRenderer, ColorKt.graphicsLayer(m277height3ABfNKs, (Function1) rememberedValue7), gapComposer8, 0);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1406846108);
                        gapComposer8.end(false);
                    }
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                MoneybotHomeScaffoldContentScope moneybotHomeScaffoldContentScope = (MoneybotHomeScaffoldContentScope) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    float f = moneybotHomeScaffoldContentScope.totalHeight;
                    PaddingValuesImpl paddingValuesImpl = moneybotHomeScaffoldContentScope.contentInsets;
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(fillMaxWidth2, f - paddingValuesImpl.top), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paddingValuesImpl.bottom, 7);
                    boolean changed6 = gapComposer9.changed(function16);
                    Object rememberedValue8 = gapComposer9.rememberedValue();
                    if (changed6 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda21(22, function16);
                        gapComposer9.updateRememberedValue(rememberedValue8);
                    }
                    MoneybotHomeViewKt.HomeErrorNotice(0, gapComposer9, m302paddingqDBjuR0$default3, (Function0) rememberedValue8);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                MoneybotDebugOverlayViewModel.Sheet sheet = (MoneybotDebugOverlayViewModel.Sheet) obj5;
                Function1 function17 = (Function1) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer9).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    CrossfadeKt.Crossfade(sheet, (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(10716961, new MoneyTabUIKt$$ExternalSyntheticLambda11(9, (Object) paddingValues, (Object) function17), gapComposer10), gapComposer10, 24576, 14);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                PaddingValues paddingValues2 = (PaddingValues) obj5;
                Function1 function18 = (Function1) obj4;
                MoneybotDebugOverlayViewModel.Sheet sheet2 = (MoneybotDebugOverlayViewModel.Sheet) obj;
                Composer composer10 = (Composer) obj2;
                ((Integer) obj3).getClass();
                sheet2.getClass();
                if (sheet2 instanceof MoneybotDebugOverlayViewModel.Sheet.Main) {
                    GapComposer gapComposer11 = (GapComposer) composer10;
                    gapComposer11.startReplaceGroup(1441516539);
                    ExpandableContentKt.MainDebugToolsContent(0, gapComposer11, SpacerKt.padding(companion, paddingValues2), ((MoneybotDebugOverlayViewModel.Sheet.Main) sheet2).itemRows, function18);
                    gapComposer11.end(false);
                } else {
                    if (!(sheet2 instanceof MoneybotDebugOverlayViewModel.Sheet.TokenUsage)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer10, 1709066105, false);
                    }
                    GapComposer gapComposer12 = (GapComposer) composer10;
                    gapComposer12.startReplaceGroup(1441752821);
                    ExpandableContentKt.TokenUsageSheetContent(((MoneybotDebugOverlayViewModel.Sheet.TokenUsage) sheet2).tokenUsageModel, SpacerKt.padding(companion, paddingValues2), gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 10:
                Function1 function19 = (Function1) obj4;
                TextFieldState textFieldState = (TextFieldState) obj5;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer11).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    boolean changed7 = gapComposer13.changed(function19) | gapComposer13.changed(textFieldState);
                    Object rememberedValue9 = gapComposer13.rememberedValue();
                    if (changed7 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(1, textFieldState, function19);
                        gapComposer13.updateRememberedValue(rememberedValue9);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue9, null, !StringsKt.isBlank(textFieldState.getValue$foundation().text), ExpandableContentKt.f496lambda$1338492857, gapComposer13, ((intValue9 << 12) & 57344) | 3072, 2);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ComposerSharedTransitionScope composerSharedTransitionScope = (ComposerSharedTransitionScope) obj5;
                ComposerSharedElementKeys composerSharedElementKeys = (ComposerSharedElementKeys) obj4;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) ((Composer) obj2);
                gapComposer14.startReplaceGroup(-1338641345);
                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                if (composerSharedTransitionScope != null) {
                    gapComposer14.startReplaceGroup(-1338639249);
                    Object obj6 = composerSharedElementKeys.sendButton;
                    if (obj6 == null) {
                        obj6 = ComposerSharedElementKey.SendButton;
                    }
                    modifier2 = SharedTransitionScope.sharedElement$default(composerSharedTransitionScope, modifier2, composerSharedTransitionScope.rememberSharedContentState(obj6, gapComposer14, 0), composerSharedTransitionScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    gapComposer14.end(false);
                }
                gapComposer14.end(false);
                Object rememberedValue10 = gapComposer14.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new MoneyTabUIKt$$ExternalSyntheticLambda6(29);
                    gapComposer14.updateRememberedValue(rememberedValue10);
                }
                ComposerKt.SendButton(432, gapComposer14, modifier2, (Function0) rememberedValue10, false);
                return Unit.INSTANCE;
            case 12:
                TextFieldValue textFieldValue = (TextFieldValue) obj5;
                String str2 = (String) obj4;
                Function2 function2 = (Function2) obj;
                Composer composer12 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer12).changedInstance(function2) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer12;
                if (gapComposer15.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    if (textFieldValue.annotatedString.text.length() == 0) {
                        gapComposer15.startReplaceGroup(-437986621);
                        TextStyle textStyle2 = ((Typography) gapComposer15.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        Colors colors3 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                        } else {
                            gapComposer15.startReplaceGroup(-1762997739);
                            gapComposer15.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.placeholder, (Composer) gapComposer15, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer15.end(false);
                    } else {
                        gapComposer15.startReplaceGroup(-437815563);
                        gapComposer15.end(false);
                    }
                    function2.invoke(gapComposer15, Integer.valueOf(intValue10 & 14));
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Modifier modifier3 = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier3.getClass();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj2);
                gapComposer16.startReplaceGroup(1111072087);
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = ((PushOnPressScope) obj5).interactionSource;
                gapComposer16.startReplaceGroup(-1706576738);
                IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) gapComposer16.consume(IndicationKt.LocalIndication);
                gapComposer16.end(false);
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(modifier3, mutableInteractionSourceImpl2, indicationNodeFactory, true, null, null, (Function0) obj4, 16);
                gapComposer16.end(false);
                return m182clickableO2vRcR0$default;
            case 14:
                SplitButtonEntry splitButtonEntry = (SplitButtonEntry) obj5;
                SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
                SplitButtonEntry splitButtonEntry2 = (SplitButtonEntry) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer13).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer13;
                if (gapComposer17.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    if (splitButtonEntry != null) {
                        gapComposer17.startReplaceGroup(-635139901);
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        Object rememberedValue11 = gapComposer17.rememberedValue();
                        if (rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new OffersHomeQueries$$ExternalSyntheticLambda1(15);
                            gapComposer17.updateRememberedValue(rememberedValue11);
                        }
                        KeypadKt.PrimarySplitButton(0, gapComposer17, SemanticsModifierKt.semantics(horizontalWeight, false, (Function1) rememberedValue11), splitButtonEntry.text.toString(), splitButtonEntry.onClick);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(-634790097);
                        gapComposer17.end(false);
                    }
                    SplitButtons.Style style2 = SplitButtons.Style.MOONCAKE_PILLS;
                    gapComposer17.startReplaceGroup(-634625425);
                    gapComposer17.end(false);
                    if (splitButtonEntry2 != null) {
                        gapComposer17.startReplaceGroup(-634581095);
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        Object rememberedValue12 = gapComposer17.rememberedValue();
                        if (rememberedValue12 == neverEqualPolicy) {
                            rememberedValue12 = new OffersHomeQueries$$ExternalSyntheticLambda1(i3);
                            gapComposer17.updateRememberedValue(rememberedValue12);
                        }
                        KeypadKt.SecondarySplitButton(0, gapComposer17, SemanticsModifierKt.semantics(horizontalWeight2, false, (Function1) rememberedValue12), splitButtonEntry2.text.toString(), splitButtonEntry2.onClick);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(-634221681);
                        gapComposer17.end(false);
                    }
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                FittedTextState fittedTextState = (FittedTextState) obj5;
                Function2 function22 = (Function2) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj;
                Composer composer14 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl2.getClass();
                Density density = boxWithConstraintsScopeImpl2.density;
                long j = boxWithConstraintsScopeImpl2.constraints;
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer14).changed(boxWithConstraintsScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    boolean changed8 = gapComposer18.changed(fittedTextState) | gapComposer18.changed(j);
                    Object rememberedValue13 = gapComposer18.rememberedValue();
                    if (changed8 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = (FittedTextState) function22.invoke(fittedTextState, new Constraints(j));
                        gapComposer18.updateRememberedValue(rememberedValue13);
                    }
                    FittedTextState fittedTextState2 = (FittedTextState) rememberedValue13;
                    BasicTextKt.m347BasicTextRWo7tUw(fittedTextState2.text, SizeKt.m288sizeInqDBjuR0(companion, density.mo233toDpu2uoSUM(Constraints.m1027getMinWidthimpl(j)), density.mo233toDpu2uoSUM(Constraints.m1026getMinHeightimpl(j)), boxWithConstraintsScopeImpl2.m259getMaxWidthD9Ej5fM(), boxWithConstraintsScopeImpl2.m258getMaxHeightD9Ej5fM()), fittedTextState2.style, null, fittedTextState2.overflow, false, fittedTextState2.maxLines, 0, null, gapComposer18, 0, 936);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Function1 function110 = (Function1) obj4;
                OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel = (OffersFilterGroupSheetViewModel) obj5;
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer15).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (gapComposer19.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    Modifier horizontalWeight3 = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                    boolean changed9 = gapComposer19.changed(function110);
                    Object rememberedValue14 = gapComposer19.rememberedValue();
                    if (changed9 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new MusicViewKt$$ExternalSyntheticLambda0(20, function110);
                        gapComposer19.updateRememberedValue(rememberedValue14);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, horizontalWeight3, null, false, false, null, UtilsKt.f513lambda$1584023237, gapComposer19, 1572864, 60);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight4 = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                    boolean changed10 = gapComposer19.changed(function110) | gapComposer19.changedInstance(offersFilterGroupSheetViewModel);
                    Object rememberedValue15 = gapComposer19.rememberedValue();
                    if (changed10 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0(23, function110, offersFilterGroupSheetViewModel);
                        gapComposer19.updateRememberedValue(rememberedValue15);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue15, horizontalWeight4, buttonProminence, false, false, null, UtilsKt.f511lambda$1384212238, gapComposer19, 1573248, 56);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                OffersGreenStatusViewModel offersGreenStatusViewModel = (OffersGreenStatusViewModel) obj5;
                Function1 function111 = (Function1) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer16 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer16).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer16;
                if (gapComposer20.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    UtilsKt.OffersGreenStatus(offersGreenStatusViewModel, SpacerKt.padding(companion, paddingValues3), function111, gapComposer20, 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                OfferDetailsSheetViewModel.FooterSectionViewModel footerSectionViewModel = (OfferDetailsSheetViewModel.FooterSectionViewModel) obj5;
                Function1 function112 = (Function1) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer17;
                if (gapComposer21.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons footerButtons = (OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons) footerSectionViewModel;
                    OfferFooterButton offerFooterButton = footerButtons.secondaryFooterButton;
                    if (offerFooterButton == null) {
                        gapComposer21.startReplaceGroup(-1009675358);
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(-1009675357);
                        OfferDetailsSheetKt.OfferDetailsSecondaryButton(offerFooterButton, function112, gapComposer21, 0);
                        gapComposer21.end(false);
                    }
                    OfferDetailsSheetKt.OfferDetailsPrimaryButton(footerButtons.primaryFooterButton, function112, gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$offers$views$details$OfferDetailsSheetV2Kt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$offers$views$home$collectionCluster$InfoCollectionItemKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$offers$views$sup$OffersNotificationKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$offers$views$timeline$OffersTimelineSheetV2Kt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$onboarding$accountpicker$views$AccountPickerViewKt$$ExternalSyntheticLambda28(obj, obj2, obj3);
            case 24:
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj;
                ((Integer) obj3).getClass();
                animatedVisibilityScope.getClass();
                GapComposer gapComposer22 = (GapComposer) ((Composer) obj2);
                Updater.CompositionLocalProvider((CompositionLocalContext) obj5, Expect_jvmKt.rememberComposableLambda(201440473, new HelpSheetView$$ExternalSyntheticLambda0(10, (View) gapComposer22.consume(AndroidCompositionLocals_androidKt.LocalView), animatedVisibilityScope, (ComposableLambdaImpl) obj4), gapComposer22), gapComposer22, 48);
                return Unit.INSTANCE;
            case 25:
                return invoke$com$squareup$cash$p2pblocking$views$AllowlistSelectionKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$p2pblocking$views$P2PListRowKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$p2pblocking$views$P2PListViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$p2pblocking$views$P2PListViewKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            default:
                EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) obj5;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                int intValue16 = ((Integer) obj2).intValue();
                float floatValue = ((Float) obj3).floatValue();
                ((DistributionWheelViewModel) obj).getClass();
                List access$allocationsSortedForWheel = ImageResources_androidKt.access$allocationsSortedForWheel(editDistributionConfiguration);
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) access$allocationsSortedForWheel.get(intValue16);
                Money money = editDistributionConfiguration.averageMonthlyPaycheck;
                AndroidStringManager androidStringManager = (AndroidStringManager) localCashBalancePresenter.stringManager;
                NumberFormat numberFormat = (NumberFormat) ((Lazy) localCashBalancePresenter.clock).getValue();
                numberFormat.getClass();
                return ImageResources_androidKt.access$toDistributionWheelViewModel(access$allocationsSortedForWheel, destinationUiConfiguration, floatValue, false, money, androidStringManager, numberFormat, (MoneyFormatter) localCashBalancePresenter.screen);
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda11(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$2 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda11(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda11(Function0 function0, AccountViewModel accountViewModel) {
        this.$r8$classId = 23;
        this.f$0 = function0;
        this.f$2 = accountViewModel;
    }
}
