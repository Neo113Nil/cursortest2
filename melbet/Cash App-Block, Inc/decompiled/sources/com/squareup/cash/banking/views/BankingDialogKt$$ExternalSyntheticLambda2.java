package com.squareup.cash.banking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.arcade.values.TitleBarAction;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ToastActionScope;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.treehouse.ToastBinding;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.applets.views.BalanceAppletTile;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.views.BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonDisplayType;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarViewModel;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.bitcoin.views.applet.balance.BitcoinBalanceWidgetKt;
import com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.autoinvest.InvestingAutoInvestKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingDialogKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$BitcoinHomeViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        Function1 function1;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel = (BitcoinHomeToolbarViewModel) this.f$1;
        Function1 function12 = (Function1) this.f$0;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        int i = intValue;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            boolean z2 = bitcoinHomeToolbarViewModel.showBitcoinMapMenuIcon;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2) {
                gapComposer.startReplaceGroup(-588361405);
                Icons icons = Icons.Map24;
                String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_map_title_bitcoin_map);
                boolean changed = gapComposer.changed(function12);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(26, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function1 = function12;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (i & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            } else {
                function1 = function12;
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                gapComposer.startReplaceGroup(-588179776);
                gapComposer.end(false);
            }
            if (bitcoinHomeToolbarViewModel.showScannerMenuIcon) {
                gapComposer.startReplaceGroup(-588135756);
                Icons icons2 = Icons.NavigationScanQr;
                String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_toolbar_scanner_title);
                Function1 function13 = function1;
                boolean changed2 = gapComposer.changed(function13);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(27, function13);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                TransactorKt.IconAction(titleBarActionScope, icons2, stringResource2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer, (i & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-587939712);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$autoinvest$BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = (InvestingCryptoRecurringPurchaseTileViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            for (InvestingCryptoRecurringPurchaseTileViewModel.Item item : investingCryptoRecurringPurchaseTileViewModel.items) {
                String str = item.frequency;
                String str2 = item.timestamp;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(501471658, new BankingDialogKt$$ExternalSyntheticLambda8(item, 23), gapComposer);
                boolean changedInstance = gapComposer.changedInstance(item);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BadgeQueries$$ExternalSyntheticLambda5(item, 12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function12 = (Function1) rememberedValue;
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(item);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InvestingAutoInvestKt$$ExternalSyntheticLambda1(function1, item, 1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, function12, (Function0) rememberedValue2, null, null, str2, null, false, 0, 0L, gapComposer, 6, 1968);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$buttons$BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Modifier fillMaxHeight;
        BitcoinTradeButtonsWidgetViewModel bitcoinTradeButtonsWidgetViewModel = (BitcoinTradeButtonsWidgetViewModel) this.f$1;
        final Function1 function1 = (Function1) this.f$0;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            for (final BitcoinTradeButtonViewModel bitcoinTradeButtonViewModel : bitcoinTradeButtonsWidgetViewModel.buttons) {
                BitcoinTradeButtonDisplayType bitcoinTradeButtonDisplayType = bitcoinTradeButtonViewModel.displayType;
                boolean z = bitcoinTradeButtonDisplayType instanceof BitcoinTradeButtonDisplayType.Drawable;
                int i3 = 13;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z) {
                    gapComposer.startReplaceGroup(-644267515);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                        gapComposer.startReplaceGroup(-644099154);
                        fillMaxHeight = SizeKt.m277height3ABfNKs(companion, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue()));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-643982563);
                        gapComposer.end(false);
                        fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                    }
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(fillMaxHeight, 1.0f);
                    boolean changedInstance = gapComposer.changedInstance(bitcoinTradeButtonDisplayType);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BadgeQueries$$ExternalSyntheticLambda5(bitcoinTradeButtonDisplayType, i3);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(horizontalWeight, false, (Function1) rememberedValue2);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changed(bitcoinTradeButtonViewModel);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = i2;
                                BitcoinTradeButtonViewModel bitcoinTradeButtonViewModel2 = bitcoinTradeButtonViewModel;
                                Function1 function12 = function1;
                                switch (i4) {
                                    case 0:
                                        function12.invoke(bitcoinTradeButtonViewModel2.event);
                                        break;
                                    default:
                                        function12.invoke(bitcoinTradeButtonViewModel2.event);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    GapComposer gapComposer2 = gapComposer;
                    coil3.size.SizeKt.Button((Function0) rememberedValue3, semantics, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1115859042, new BankingDialogKt$$ExternalSyntheticLambda8(bitcoinTradeButtonDisplayType, 24), gapComposer), gapComposer2, 1573248, 56);
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                } else {
                    if (!(bitcoinTradeButtonDisplayType instanceof BitcoinTradeButtonDisplayType.Text)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 117762315, false);
                    }
                    gapComposer.startReplaceGroup(-643516354);
                    String str = ((BitcoinTradeButtonDisplayType.Text) bitcoinTradeButtonDisplayType).displayText;
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(SizeKt.fillMaxHeight(companion, 1.0f), 1.0f);
                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changed(bitcoinTradeButtonViewModel);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Function0() { // from class: com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = i;
                                BitcoinTradeButtonViewModel bitcoinTradeButtonViewModel2 = bitcoinTradeButtonViewModel;
                                Function1 function12 = function1;
                                switch (i4) {
                                    case 0:
                                        function12.invoke(bitcoinTradeButtonViewModel2.event);
                                        break;
                                    default:
                                        function12.invoke(bitcoinTradeButtonViewModel2.event);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function0 = (Function0) rememberedValue4;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda14(i3, parcelableSnapshotMutableIntState);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    BitcoinTradeButtonsWidgetViewKt.TextButton(str, function0, (Function1) rememberedValue5, horizontalWeight2, gapComposer, MLKEMEngine.KyberPolyBytes);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel = (BitcoinStoriesWidgetViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            CrossfadeKt.Crossfade(bitcoinStoriesWidgetViewModel, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (FiniteAnimationSpec) null, "bitcoin-stories-widget-content", Expect_jvmKt.rememberComposableLambda(1879976667, new BrandSheetViewKt$$ExternalSyntheticLambda6(24, function1), gapComposer), gapComposer, 27696, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$onramp$BitcoinOnRampWidgetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        BitcoinOnRampWidgetViewModel bitcoinOnRampWidgetViewModel = (BitcoinOnRampWidgetViewModel) this.f$1;
        Object obj4 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            for (final BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel : bitcoinOnRampWidgetViewModel.options) {
                Icons icons = bitcoinOnRampOptionViewModel.icon;
                ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(providableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.background.subtle;
                Colors colors2 = (Colors) gapComposer.consume(providableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.icon.subtle;
                String str = bitcoinOnRampOptionViewModel.accessoryLabel;
                int i3 = 2;
                CellDefaultAccessory label = str != null ? new CellDefaultAccessory.Label(str, 2) : CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1884835086, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.onramp.BitcoinOnRampWidgetViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i4 = i2;
                        BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel2 = bitcoinOnRampOptionViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinOnRampOptionViewModel2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinOnRampOptionViewModel2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean changed = gapComposer.changed(obj4) | gapComposer.changedInstance(bitcoinOnRampOptionViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(i3, obj4, bitcoinOnRampOptionViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, rememberComposableLambda, null, j2, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-2025162950, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.onramp.BitcoinOnRampWidgetViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i4 = i;
                        BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel2 = bitcoinOnRampOptionViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinOnRampOptionViewModel2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinOnRampOptionViewModel2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, label, 0L, null, gapComposer, 3120, 6, 27536);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$sendreceive$BitcoinSendReceiveBottomSheetViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel = (BitcoinSendReceiveBottomSheetViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = bitcoinSendReceiveBottomSheetViewModel.sendButtonText;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            BitcoinSendRestrictionViewKt.Button(0, gapComposer, adaptiveStackScope.horizontalWeight(companion, 1.0f), str, (Function0) rememberedValue);
            String str2 = bitcoinSendReceiveBottomSheetViewModel.receiveButtonText;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(9, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BitcoinSendRestrictionViewKt.Button(0, gapComposer, adaptiveStackScope.horizontalWeight(companion, 1.0f), str2, (Function0) rememberedValue2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$stackingtools$BitcoinStackingToolsViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        BitcoinStackingToolsViewModel bitcoinStackingToolsViewModel = (BitcoinStackingToolsViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        int i = 16;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem = bitcoinStackingToolsViewModel.receiveP2PAsBitcoinItem;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (bitcoinStackingToolsItem == null) {
                gapComposer.startReplaceGroup(355558632);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(355558633);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(i, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                BitcoinStackingToolsViewKt.CellDefault(bitcoinStackingToolsItem, (Function0) rememberedValue, Icons.ContactAdd24, null, gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            }
            BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem2 = bitcoinStackingToolsViewModel.roundUpsItem;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(17, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BitcoinStackingToolsViewKt.CellDefault(bitcoinStackingToolsItem2, (Function0) rememberedValue2, Icons.RoundUps24, null, gapComposer, MLKEMEngine.KyberPolyBytes);
            BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem3 = bitcoinStackingToolsViewModel.autoInvestItem;
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(18, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            BitcoinStackingToolsViewKt.CellDefault(bitcoinStackingToolsItem3, (Function0) rememberedValue3, Icons.RecurringAutomatic24, null, gapComposer, MLKEMEngine.KyberPolyBytes);
            BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem4 = bitcoinStackingToolsViewModel.paidInBitcoinItem;
            if (bitcoinStackingToolsItem4 == null) {
                gapComposer.startReplaceGroup(356036125);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(356036126);
                boolean changed4 = gapComposer.changed(function1);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(19, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                BitcoinStackingToolsViewKt.CellDefault(bitcoinStackingToolsItem4, (Function0) rememberedValue4, Icons.Deposit24, null, gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextStyle textStyle;
        ButtonProminence buttonProminence;
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 24;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = 6;
        Object obj4 = Composer.Companion.Empty;
        int i5 = 2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                boolean z = true;
                Function1 function1 = (Function1) obj6;
                BankingDialogViewModel bankingDialogViewModel = (BankingDialogViewModel) obj5;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    z = false;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, z)) {
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(bankingDialogViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(false ? 1 : 0, function1, bankingDialogViewModel);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(868780866, new BankingDialogKt$$ExternalSyntheticLambda0(bankingDialogViewModel, i5), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function3 function3 = (Function3) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 19) != 18)) {
                    if (function3 == null) {
                        gapComposer2.startReplaceGroup(562648351);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(562648352);
                        function3.invoke(new InlineMessageButtonScope(adaptiveStackScope), gapComposer2, 0);
                        ModalKt.VerticalDivider(adaptiveStackScope.divider(), gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    composableLambdaImpl.invoke((Object) new InlineMessageButtonScope(adaptiveStackScope), (Object) gapComposer2, (Object) 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                ((ParcelableSnapshotMutableIntState) obj6).setIntValue(mo833measureBRTryo0.get(AlignmentLinesKt.FirstLineTop));
                ((ParcelableSnapshotMutableIntState) obj5).setIntValue(mo833measureBRTryo0.get(AlignmentLinesKt.FirstLineBottom));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 11));
            case 3:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj6;
                DropdownState dropdownState = (DropdownState) obj5;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 19) != 18)) {
                    composableLambdaImpl2.invoke((Object) new InputDropdownScope(columnScope, dropdownState), (Object) gapComposer3, (Object) 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                TitleBarCoreBinding titleBarCoreBinding = (TitleBarCoreBinding) obj6;
                TitleBarAction titleBarAction = (TitleBarAction) obj5;
                boolean z2 = true;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(titleBarActionScope) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    z2 = false;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, z2)) {
                    boolean changed2 = gapComposer4.changed(titleBarCoreBinding);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    Object obj7 = rememberedValue2;
                    if (changed2 || rememberedValue2 == obj4) {
                        Object titleBarCoreBinding$$ExternalSyntheticLambda3 = new TitleBarCoreBinding$$ExternalSyntheticLambda3(titleBarCoreBinding, false ? 1 : 0);
                        gapComposer4.updateRememberedValue(titleBarCoreBinding$$ExternalSyntheticLambda3);
                        obj7 = titleBarCoreBinding$$ExternalSyntheticLambda3;
                    }
                    titleBarCoreBinding.Action(titleBarActionScope, titleBarAction, (Function0) obj7, gapComposer4, intValue4 & 14);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                String str = (String) obj6;
                ToastBinding toastBinding = (ToastBinding) obj5;
                ToastActionScope toastActionScope = (ToastActionScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                toastActionScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(toastActionScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Function0 function0 = (Function0) toastBinding.actionOnClick$delegate.getValue();
                    if (function0 == null) {
                        gapComposer5.startReplaceGroup(-486646356);
                        Object rememberedValue3 = gapComposer5.rememberedValue();
                        if (rememberedValue3 == obj4) {
                            rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda0(i5);
                            gapComposer5.updateRememberedValue(rememberedValue3);
                        }
                        function0 = (Function0) rememberedValue3;
                    } else {
                        gapComposer5.startReplaceGroup(-431340793);
                    }
                    gapComposer5.end(false);
                    toastActionScope.TextAction((intValue5 << 9) & 7168, gapComposer5, null, str, function0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                BalanceAppletTileViewModel.Loaded.Lite.Uninstalled.UninstalledRowModel uninstalledRowModel = (BalanceAppletTileViewModel.Loaded.Lite.Uninstalled.UninstalledRowModel) obj6;
                BalanceAppletTile balanceAppletTile = (BalanceAppletTile) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    String str2 = uninstalledRowModel.title;
                    String str3 = uninstalledRowModel.subtitle;
                    boolean changed3 = gapComposer6.changed(balanceAppletTile);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue4 == obj4) {
                        rememberedValue4 = new ErrorView$$ExternalSyntheticLambda0(balanceAppletTile, 11);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    SharedUIKt.AppletTileRowUninstalledContent(2131232816, 0, gapComposer6, str2, str3, (Function0) rememberedValue4);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                BalanceHomeViewModel.Loaded loaded = (BalanceHomeViewModel.Loaded) obj5;
                Function1 function12 = (Function1) obj6;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(1 & intValue7, (intValue7 & 17) != 16)) {
                    BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel restrictedBalanceViewModel = loaded.restrictedBalanceViewModel;
                    if (restrictedBalanceViewModel == null) {
                        gapComposer7.startReplaceGroup(619771525);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(619771526);
                        BalanceHomeViewKt.RestrictedBalanceLabel(restrictedBalanceViewModel, function12, gapComposer7, 0);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Function1 function13 = (Function1) obj6;
                BankingDialogViewModel.Button button = (BankingDialogViewModel.Button) obj5;
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changed4 = gapComposer8.changed(function13) | gapComposer8.changedInstance(button);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed4 || rememberedValue5 == obj4) {
                        rememberedValue5 = new BankingDialogKt$$ExternalSyntheticLambda5(21, function13, button);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue5, null, false, Expect_jvmKt.rememberComposableLambda(1090557436, new BankingDialogKt$$ExternalSyntheticLambda8(button, false ? 1 : 0), gapComposer8), gapComposer8, ((intValue8 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                LocalizedString localizedString = (LocalizedString) obj5;
                Function1 function14 = (Function1) obj6;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(1 & intValue9, (intValue9 & 17) != 16)) {
                    String str4 = localizedString.translated_value;
                    str4.getClass();
                    boolean changed5 = gapComposer9.changed(function14);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changed5 || rememberedValue6 == obj4) {
                        rememberedValue6 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function14, r10, 10);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str4, (Function2) rememberedValue6, null, null, 0L, null, null, null, 0, 0, 0, gapComposer9, 0, 2044);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj5;
                Function1 function15 = (Function1) obj6;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(1 & intValue10, (intValue10 & 17) != 16)) {
                    ActionableButtonDefault actionableButtonDefault = actionableButtonCtaGroup.secondary_button;
                    if (actionableButtonDefault == null) {
                        gapComposer10.startReplaceGroup(110509613);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(110509614);
                        boolean changed6 = gapComposer10.changed(function15);
                        Object rememberedValue7 = gapComposer10.rememberedValue();
                        if (changed6 || rememberedValue7 == obj4) {
                            rememberedValue7 = new AvatarsKt$$ExternalSyntheticLambda1(7, function15);
                            gapComposer10.updateRememberedValue(rememberedValue7);
                        }
                        BenefitsLeafletViewKt.ButtonCta(actionableButtonDefault, (Function1) rememberedValue7, gapComposer10, 0);
                        gapComposer10.end(false);
                    }
                    ActionableButtonDefault actionableButtonDefault2 = actionableButtonCtaGroup.primary_button;
                    if (actionableButtonDefault2 == null) {
                        gapComposer10.startReplaceGroup(110690095);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(110690096);
                        boolean changed7 = gapComposer10.changed(function15);
                        Object rememberedValue8 = gapComposer10.rememberedValue();
                        if (changed7 || rememberedValue8 == obj4) {
                            rememberedValue8 = new AvatarsKt$$ExternalSyntheticLambda1(8, function15);
                            gapComposer10.updateRememberedValue(rememberedValue8);
                        }
                        BenefitsLeafletViewKt.ButtonCta(actionableButtonDefault2, (Function1) rememberedValue8, gapComposer10, 0);
                        gapComposer10.end(false);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                BenefitsLeafletViewModel benefitsLeafletViewModel = (BenefitsLeafletViewModel) obj5;
                Function1 function16 = (Function1) obj6;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(1 & intValue11, (intValue11 & 19) != 18)) {
                    boolean z3 = benefitsLeafletViewModel instanceof BenefitsLeafletViewModel.Loading;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (z3) {
                        gapComposer11.startReplaceGroup(1965654463);
                        Modifier padding = SpacerKt.padding(companion2, paddingValues);
                        ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer11, SpacerKt.m298padding3ABfNKs(padding, 64.0f));
                        gapComposer11.end(false);
                    } else if (benefitsLeafletViewModel instanceof BenefitsLeafletViewModel.Loaded) {
                        gapComposer11.startReplaceGroup(805906760);
                        BenefitsLeafletViewKt.LeafletContent(0, gapComposer11, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((BenefitsLeafletViewModel.Loaded) benefitsLeafletViewModel).elements, function16);
                        gapComposer11.end(false);
                    } else {
                        if (!Intrinsics.areEqual(benefitsLeafletViewModel, BenefitsLeafletViewModel.Error.INSTANCE)) {
                            gapComposer11.startReplaceGroup(1965670427);
                            gapComposer11.end(false);
                            a$$ExternalSyntheticBUOutline0.m$3("Unexpected view model: ".concat(benefitsLeafletViewModel.getClass().getSimpleName()));
                            return null;
                        }
                        gapComposer11.startReplaceGroup(806141306);
                        BenefitsLeafletViewKt.ErrorContent(0, 0, gapComposer11, SpacerKt.padding(companion2, paddingValues), function16);
                        gapComposer11.end(false);
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                BetterOverdraftViewModel.Loaded loaded2 = (BetterOverdraftViewModel.Loaded) obj5;
                Function1 function17 = (Function1) obj6;
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(1 & intValue12, (intValue12 & 19) != 18)) {
                    String str5 = loaded2.toggleButtonText;
                    if (str5 == null) {
                        gapComposer12.startReplaceGroup(-1608289726);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(-1608289725);
                        Modifier horizontalWeight = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                        ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                        boolean changed8 = gapComposer12.changed(function17);
                        Object rememberedValue9 = gapComposer12.rememberedValue();
                        if (changed8 || rememberedValue9 == obj4) {
                            rememberedValue9 = new TransfersView$$ExternalSyntheticLambda0(i5, function17);
                            gapComposer12.updateRememberedValue(rememberedValue9);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, horizontalWeight, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-580540435, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str5, i4), gapComposer12), gapComposer12, 1573248, 56);
                        gapComposer12.end(false);
                    }
                    String str6 = loaded2.payButtonText;
                    if (str6 == null) {
                        gapComposer12.startReplaceGroup(-1608051708);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(-1608051707);
                        Modifier horizontalWeight2 = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                        ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                        boolean changed9 = gapComposer12.changed(function17);
                        Object rememberedValue10 = gapComposer12.rememberedValue();
                        if (changed9 || rememberedValue10 == obj4) {
                            rememberedValue10 = new TransfersView$$ExternalSyntheticLambda0(i2, function17);
                            gapComposer12.updateRememberedValue(rememberedValue10);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, horizontalWeight2, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(-503774954, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str6, 7), gapComposer12), gapComposer12, 1573248, 56);
                        gapComposer12.end(false);
                    }
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                OverdraftViewModel overdraftViewModel = (OverdraftViewModel) obj5;
                Function1 function18 = (Function1) obj6;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                int i6 = OverdraftCoverageSheetView.$r8$clinit;
                paddingValues2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(1 & intValue13, (intValue13 & 19) != 18)) {
                    Strings.m3984LoadableSheetContentosbwsH8(overdraftViewModel, overdraftViewModel instanceof OverdraftViewModel.Loading, 200.0f, SpacerKt.padding(companion, paddingValues2), null, Expect_jvmKt.rememberComposableLambda(-696615140, new SetPinViewKt$$ExternalSyntheticLambda4(9, function18), gapComposer13), gapComposer13, 196992, 16);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                TransfersViewModel transfersViewModel = (TransfersViewModel) obj5;
                Function1 function19 = (Function1) obj6;
                TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab = (TransfersViewModel$Companion$TransfersTab) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                transfersViewModel$Companion$TransfersTab.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(transfersViewModel$Companion$TransfersTab.ordinal()) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 19) != 18)) {
                    gapComposer14.skipToGroupEnd();
                } else if (transfersViewModel$Companion$TransfersTab == TransfersViewModel$Companion$TransfersTab.BankTab) {
                    gapComposer14.startReplaceGroup(-877160246);
                    BankingDialogKt.BankTransferSegment(transfersViewModel.bankTransferContent, function19, gapComposer14, 0);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.startReplaceGroup(-877073880);
                    TransfersViewModel.WireTransferContent wireTransferContent = transfersViewModel.wireTransferContent;
                    wireTransferContent.getClass();
                    BankingDialogKt.WireTransferSegment(wireTransferContent, function19, gapComposer14, 0);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 15:
                String str7 = (String) obj6;
                Subtitle subtitle = (Subtitle) obj5;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ((DefaultSizes) gapComposer15.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 8.0f, gapComposer15);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer15, 6);
                    int hashCode = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer15, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer15.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer15, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer15, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer15, (Modifier) null, ((Typography) gapComposer15.consume(staticProvidableCompositionLocal)).labelSmall, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    String str8 = subtitle.text;
                    int ordinal = subtitle.style.ordinal();
                    if (ordinal == 0) {
                        gapComposer15.startReplaceGroup(535806575);
                        textStyle = ((Typography) gapComposer15.consume(staticProvidableCompositionLocal)).labelSmall;
                        gapComposer15.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer15, 535804532, false);
                        }
                        gapComposer15.startReplaceGroup(535808302);
                        textStyle = ((Typography) gapComposer15.consume(staticProvidableCompositionLocal)).bodySmall;
                        gapComposer15.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer15, (Modifier) null, textStyle, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                    gapComposer15.end(true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Function1 function110 = (Function1) obj6;
                BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj5;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    boolean changed10 = gapComposer16.changed(function110);
                    Object rememberedValue11 = gapComposer16.rememberedValue();
                    if (changed10 || rememberedValue11 == obj4) {
                        rememberedValue11 = new TransfersView$$ExternalSyntheticLambda0(29, function110);
                        gapComposer16.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue11, null, ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(435481656, new BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel, true ? 1 : 0), gapComposer16), gapComposer16, 1573248, 58);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Function1 function111 = (Function1) obj6;
                BenefitsHomeViewModel.Content.StickyCtaViewModel stickyCtaViewModel = (BenefitsHomeViewModel.Content.StickyCtaViewModel) obj5;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean changed11 = gapComposer17.changed(function111);
                    Object rememberedValue12 = gapComposer17.rememberedValue();
                    if (changed11 || rememberedValue12 == obj4) {
                        rememberedValue12 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(i4, function111);
                        gapComposer17.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue12, null, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(1770659346, new BankingDialogKt$$ExternalSyntheticLambda8(stickyCtaViewModel, 18), gapComposer17), gapComposer17, 1573248, 58);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Function1 function112 = (Function1) obj6;
                BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel = (BenefitsHubViewModel.Loaded.CallToActionViewModel) obj5;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    boolean changed12 = gapComposer18.changed(function112) | gapComposer18.changedInstance(callToActionViewModel);
                    Object rememberedValue13 = gapComposer18.rememberedValue();
                    if (changed12 || rememberedValue13 == obj4) {
                        rememberedValue13 = new BankingDialogKt$$ExternalSyntheticLambda5(i3, function112, callToActionViewModel);
                        gapComposer18.updateRememberedValue(rememberedValue13);
                    }
                    Function0 function02 = (Function0) rememberedValue13;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-446165440, new BankingDialogKt$$ExternalSyntheticLambda8(callToActionViewModel, 20), gapComposer18);
                    ButtonRow.Prominence prominence = callToActionViewModel.prominence;
                    int i7 = prominence == null ? -1 : BenefitsHubViewKt.WhenMappings.$EnumSwitchMapping$1[prominence.ordinal()];
                    if (i7 != -1) {
                        if (i7 == 1) {
                            buttonProminence = ButtonProminence.PROMINENT;
                        } else if (i7 == 2) {
                            buttonProminence = ButtonProminence.SUBTLE;
                        } else if (i7 != 3 && i7 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        coil3.size.SizeKt.Button(function02, fillMaxWidth2, buttonProminence, false, false, null, rememberComposableLambda, gapComposer18, 1572912, 56);
                    }
                    buttonProminence = ButtonProminence.STANDARD;
                    coil3.size.SizeKt.Button(function02, fillMaxWidth2, buttonProminence, false, false, null, rememberComposableLambda, gapComposer18, 1572912, 56);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                BitcoinDisplayCurrencyViewModel.Loaded loaded3 = (BitcoinDisplayCurrencyViewModel.Loaded) obj5;
                Function1 function113 = (Function1) obj6;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    boolean z4 = loaded3.symbolExperimentEnabled;
                    String str9 = loaded3.formattedBitcoinValue;
                    String str10 = loaded3.formattedSatoshisValue;
                    BitcoinDisplayUnits bitcoinDisplayUnits = loaded3.selectedUnits;
                    int i8 = 23;
                    if (z4) {
                        gapComposer19.startReplaceGroup(1691399912);
                        String stringResource = Room.stringResource(gapComposer19, R.string.profile_section_btc_display_unit_symbol_title_clean);
                        boolean z5 = bitcoinDisplayUnits == BitcoinDisplayUnits.SATOSHIS;
                        boolean changed13 = gapComposer19.changed(function113);
                        Object rememberedValue14 = gapComposer19.rememberedValue();
                        if (changed13 || rememberedValue14 == obj4) {
                            rememberedValue14 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(22, function113);
                            gapComposer19.updateRememberedValue(rememberedValue14);
                        }
                        BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyItem(0, gapComposer19, null, stringResource, str10, (Function0) rememberedValue14, z5);
                        String stringResource2 = Room.stringResource(gapComposer19, R.string.profile_section_btc_display_unit_btc_title_clean);
                        boolean z6 = bitcoinDisplayUnits == BitcoinDisplayUnits.BITCOIN;
                        boolean changed14 = gapComposer19.changed(function113);
                        Object rememberedValue15 = gapComposer19.rememberedValue();
                        if (changed14 || rememberedValue15 == obj4) {
                            rememberedValue15 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(i8, function113);
                            gapComposer19.updateRememberedValue(rememberedValue15);
                        }
                        BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyItem(0, gapComposer19, null, stringResource2, str9, (Function0) rememberedValue15, z6);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(1692134612);
                        String stringResource3 = Room.stringResource(gapComposer19, R.string.profile_section_btc_display_unit_btc_title);
                        boolean z7 = bitcoinDisplayUnits == BitcoinDisplayUnits.BITCOIN;
                        boolean changed15 = gapComposer19.changed(function113);
                        Object rememberedValue16 = gapComposer19.rememberedValue();
                        if (changed15 || rememberedValue16 == obj4) {
                            rememberedValue16 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(i3, function113);
                            gapComposer19.updateRememberedValue(rememberedValue16);
                        }
                        BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyItem(0, gapComposer19, null, stringResource3, str9, (Function0) rememberedValue16, z7);
                        String stringResource4 = Room.stringResource(gapComposer19, R.string.profile_section_btc_display_unit_sat_title);
                        boolean z8 = bitcoinDisplayUnits == BitcoinDisplayUnits.SATOSHIS;
                        boolean changed16 = gapComposer19.changed(function113);
                        Object rememberedValue17 = gapComposer19.rememberedValue();
                        if (changed16 || rememberedValue17 == obj4) {
                            rememberedValue17 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(19, function113);
                            gapComposer19.updateRememberedValue(rememberedValue17);
                        }
                        BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyItem(0, gapComposer19, null, stringResource4, str10, (Function0) rememberedValue17, z8);
                        gapComposer19.end(false);
                    }
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1468878493, new BrandSheetViewKt$$ExternalSyntheticLambda6(i8, function113), gapComposer19), gapComposer19, 24966, 10);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                BitcoinHomeViewModel bitcoinHomeViewModel = (BitcoinHomeViewModel) obj5;
                Function1 function114 = (Function1) obj6;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(1 & intValue20, (intValue20 & 17) != 16)) {
                    BitcoinHomeViewKt.Toolbar(bitcoinHomeViewModel.getToolbarViewModel(), function114, null, gapComposer20, 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                return invoke$com$squareup$cash$bitcoin$views$applet$BitcoinHomeViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$bitcoin$views$applet$autoinvest$BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 23:
                Function1 function115 = (Function1) obj6;
                BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel = (BitcoinBalanceWidgetViewModel) obj5;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(1 & intValue21, (intValue21 & 17) != 16)) {
                    BitcoinBalanceWidgetKt.BalanceSubAmount(0, gapComposer21, null, bitcoinBalanceWidgetViewModel.subAmount, function115);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$bitcoin$views$applet$buttons$BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$bitcoin$views$applet$onramp$BitcoinOnRampWidgetViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$bitcoin$views$applet$sendreceive$BitcoinSendReceiveBottomSheetViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$bitcoin$views$applet$stackingtools$BitcoinStackingToolsViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            default:
                Function1 function116 = (Function1) obj6;
                BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel = (BitcoinDependentWelcomeViewModel) obj5;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed17 = gapComposer22.changed(function116);
                    Object rememberedValue18 = gapComposer22.rememberedValue();
                    if (changed17 || rememberedValue18 == obj4) {
                        rememberedValue18 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(i3, function116);
                        gapComposer22.updateRememberedValue(rememberedValue18);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue18, fillMaxWidth3, buttonProminence5, false, false, null, Expect_jvmKt.rememberComposableLambda(-545701749, new BankingDialogKt$$ExternalSyntheticLambda8(bitcoinDependentWelcomeViewModel, 27), gapComposer22), gapComposer22, 1573296, 56);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda2(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
