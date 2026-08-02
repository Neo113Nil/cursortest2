package com.squareup.cash.earningstracker.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.FractionDigitsStrategy;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.moneyformatter.UnitMagnitudeFormat;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.datefilterbar.views.DateFilterBarKt;
import com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.FilterableEarnings;
import com.squareup.cash.earningstracker.viewmodels.HeroHeaderViewModel;
import com.squareup.cash.earningstracker.views.components.BarChartConfigKt;
import com.squareup.cash.earningstracker.views.components.BarChartKt;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.earningstracker.views.utils.EarningsTrackerBarChartUtilsKt;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.fakes.UnlocalizedMoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsTrackerViewKt {
    static {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.COMPACT;
        UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
        new UnlocalizedMoneyFormatter(MoneyFormatterConfig.copy$default(moneyFormatterConfig, new NumberFormat.Abbreviated(roundingMode, FractionDigitsStrategy.BALANCED), null, null, 30));
        new UnlocalizedMoneyFormatter(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.STANDARD, null, CurrencyRepresentationOption.NONE, null, 29));
    }

    public static final void EarningsContent(EarningsTrackerViewModel.Loaded loaded, Function1 function1, final MoneyFormatter moneyFormatter, final MoneyFormatter moneyFormatter2, Composer composer, int i) {
        GapComposer gapComposer;
        EarningsTrackerViewModel.Loaded loaded2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(771740999);
        int i2 = i | (gapComposer2.changedInstance(loaded) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(moneyFormatter) ? 256 : 128) | (gapComposer2.changedInstance(moneyFormatter2) ? 2048 : 1024);
        final int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
            HeroHeaderViewModel heroHeaderViewModel = loaded.heroHeader;
            boolean changedInstance = gapComposer2.changedInstance(moneyFormatter2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.earningstracker.views.EarningsTrackerViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        MoneyFormatter moneyFormatter3 = moneyFormatter2;
                        switch (i4) {
                            case 0:
                                Money money = (Money) obj;
                                money.getClass();
                                return moneyFormatter3.format(money);
                            default:
                                Long l = (Long) obj;
                                l.getClass();
                                return moneyFormatter3.format(new Money(l, (CurrencyCode) null, 6));
                        }
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EarningsHomeKt$$ExternalSyntheticLambda7(16, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final int i5 = 1;
            EarningsHeaderKt.EarningsHeader(heroHeaderViewModel, function12, null, (Function0) rememberedValue2, gapComposer2, 0);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            List list = loaded.chartBars;
            String str = loaded.earningsGraphContentDescription;
            EarningsBarChartConfig earningsBarChartConfig = BarChartConfigKt.DEFAULT_BAR_CHART_CONFIG;
            boolean changedInstance2 = gapComposer2.changedInstance(moneyFormatter);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new Function1() { // from class: com.squareup.cash.earningstracker.views.EarningsTrackerViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i42 = i5;
                        MoneyFormatter moneyFormatter3 = moneyFormatter;
                        switch (i42) {
                            case 0:
                                Money money = (Money) obj;
                                money.getClass();
                                return moneyFormatter3.format(money);
                            default:
                                Long l = (Long) obj;
                                l.getClass();
                                return moneyFormatter3.format(new Money(l, (CurrencyCode) null, 6));
                        }
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            EarningsBarChartConfig m3457copyY9O4PVA$default = EarningsBarChartConfig.m3457copyY9O4PVA$default(earningsBarChartConfig, (Function1) rememberedValue3, EarningsTrackerBarChartUtilsKt.yAxisMaxValueGetter, false, !booleanValue, 79);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z2 = i4 == 32;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda3(13, function1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function1 function13 = (Function1) rememberedValue4;
            boolean z3 = i4 == 32;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new EarningsHomeKt$$ExternalSyntheticLambda7(17, function1);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            BarChartKt.BarChart(list, str, m300paddingVpY3zN4$default, m3457copyY9O4PVA$default, function13, (Function0) rememberedValue5, gapComposer2, 0, 0);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            boolean z4 = i4 == 32;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new EarningsHomeKt$$ExternalSyntheticLambda7(18, function1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            LoadingErrorKt.KeyStatsSection(loaded, (Function0) rememberedValue6, null, gapComposer2, i2 & 14, 4);
            loaded2 = loaded;
            gapComposer = gapComposer2;
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            LoadingErrorKt.TopCustomersSection(i4, 4, gapComposer, null, loaded2.topCustomers, function1);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            loaded2 = loaded;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(loaded2, i, function1, moneyFormatter, moneyFormatter2, 27);
        }
    }

    public static final void EarningsTrackerUi(EarningsTrackerViewModel earningsTrackerViewModel, Function1 function1, MoneyFormatter moneyFormatter, MoneyFormatter moneyFormatter2, Composer composer, int i) {
        EarningsTrackerViewModel earningsTrackerViewModel2;
        Function1 function12;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1497532106);
        int i2 = i | (gapComposer2.changedInstance(earningsTrackerViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer2.changedInstance(moneyFormatter) ? 256 : 128) | (gapComposer2.changedInstance(moneyFormatter2) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            Toolbar(function1, gapComposer2, (i3 >> 3) & 14);
            boolean z = earningsTrackerViewModel instanceof FilterableEarnings;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer2.startReplaceGroup(-1975418126);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                FilterableEarnings filterableEarnings = (FilterableEarnings) earningsTrackerViewModel;
                if (filterableEarnings.getFilterBarViewModel().filterOptions.isEmpty()) {
                    gapComposer2.startReplaceGroup(-1975332070);
                    DateFilterBarShimmerKt.DateFilterBarShimmer(0, 1, gapComposer2, null);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1975281974);
                    DateFilterBarViewModel filterBarViewModel = filterableEarnings.getFilterBarViewModel();
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (z2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DateFilterBarKt.DateFilterBar(filterBarViewModel, (Function1) rememberedValue, null, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1975064478);
                gapComposer2.end(false);
            }
            if (earningsTrackerViewModel instanceof EarningsTrackerViewModel.Loading) {
                gapComposer2.startReplaceGroup(1460310256);
                LoadingShimmer(((EarningsTrackerViewModel.Loading) earningsTrackerViewModel).filterBarViewModel, gapComposer2, 0);
                gapComposer2.end(false);
                earningsTrackerViewModel2 = earningsTrackerViewModel;
                function12 = function1;
                gapComposer = gapComposer2;
            } else if (earningsTrackerViewModel instanceof EarningsTrackerViewModel.Loaded) {
                gapComposer2.startReplaceGroup(1460313129);
                boolean z3 = (i3 & 112) == 32;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new EarningsHomeKt$$ExternalSyntheticLambda7(21, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                earningsTrackerViewModel2 = earningsTrackerViewModel;
                function12 = function1;
                gapComposer = gapComposer2;
                VisibleKt.PullToRefresh(196656, 12, gapComposer, Expect_jvmKt.rememberComposableLambda(-1892021396, new EarningsTrackerViewKt$$ExternalSyntheticLambda3(earningsTrackerViewModel, function1, moneyFormatter, moneyFormatter2, 1), gapComposer2), null, Room.stringResource(gapComposer2, R.string.earnings_tracker_pull_to_refresh_label), (Function0) rememberedValue2, false, false);
                gapComposer.end(false);
            } else {
                earningsTrackerViewModel2 = earningsTrackerViewModel;
                function12 = function1;
                gapComposer = gapComposer2;
                if (!(earningsTrackerViewModel2 instanceof EarningsTrackerViewModel.LoadingError)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1460309818, false);
                }
                gapComposer.startReplaceGroup(1460329466);
                boolean z4 = (i3 & 112) == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z4 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new EarningsHomeKt$$ExternalSyntheticLambda7(22, function12);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                LoadingErrorKt.LoadingError(48, gapComposer, SizeKt.fillMaxHeight(companion, 1.0f), (Function0) rememberedValue3);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            earningsTrackerViewModel2 = earningsTrackerViewModel;
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(earningsTrackerViewModel2, function12, moneyFormatter, moneyFormatter2, i, 6);
        }
    }

    public static final void EarningsTrackerView(EarningsTrackerViewModel earningsTrackerViewModel, Function1 function1, RealImageLoader realImageLoader, LocalizedMoneyFormatter.Factory factory, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        Function1 function12;
        GapComposer gapComposer;
        earningsTrackerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1199779419);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(earningsTrackerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer2.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(factory) ? 2048 : 1024;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = LocalizedMoneyFormatter.Factory.createAbbreviatedBalancedFractionDigits$default(factory);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = factory.createNoSymbol();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            function12 = function1;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-503690330, new AvatarsKt$$ExternalSyntheticLambda4(realImageLoader2, earningsTrackerViewModel, function1, moneyFormatter, (MoneyFormatter) rememberedValue2, 22), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda3(14, function12);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue3, gapComposer, 0);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2((Object) earningsTrackerViewModel, function12, realImageLoader, (Object) factory, i, 5);
        }
    }

    public static final void LoadingShimmer(DateFilterBarViewModel dateFilterBarViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(882109843);
        int i2 = (gapComposer.changedInstance(dateFilterBarViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DateFilter dateFilter = (DateFilter) CollectionsKt.firstOrNull(dateFilterBarViewModel.filterOptions);
            if (dateFilter == null) {
                dateFilter = new DateFilter.Monthly(1, 2024);
            }
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            EarningsHeaderKt.EarningsHeaderShimmer(null, gapComposer, 0);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            LoadingErrorKt.EarningsBarChartShimmer(dateFilter, null, gapComposer, 0);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            LoadingErrorKt.KeyStatsShimmer(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            LoadingErrorKt.TopCustomersShimmer(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(dateFilterBarViewModel, i, 8);
        }
    }

    public static final void Toolbar(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-793410271);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposableLambdaImpl composableLambdaImpl = NetEarningsInfoSheetViewKt.f397lambda$513503641;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(composableLambdaImpl, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1409964798, new ErrorView$$ExternalSyntheticLambda3(10, function1), gapComposer), gapComposer, 1572918, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 13, false);
        }
    }
}
