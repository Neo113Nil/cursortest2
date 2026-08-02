package com.squareup.cash.earnings.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.views.components.EarningsFilterBarKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsHeaderKt {
    public static final ArrayList LOADING_CHART_BARS;
    public static final AnimatedAmountTextView.AnimationSpeed TOTAL_EARNINGS_ANIMATION_SPEED;
    public static final ComposeDialogKt$$ExternalSyntheticLambda14 earningsChartYAxisMaxValueGetter;

    static {
        ArrayList arrayList = new ArrayList(31);
        for (int i = 0; i < 31; i++) {
            arrayList.add(new EarningsBarViewModel("", true, 0L, EarningsBarViewModel.Color.FUTURE));
        }
        LOADING_CHART_BARS = arrayList;
        TOTAL_EARNINGS_ANIMATION_SPEED = new AnimatedAmountTextView.AnimationSpeed(15);
        earningsChartYAxisMaxValueGetter = new ComposeDialogKt$$ExternalSyntheticLambda14(25);
    }

    public static final void AnimatedTotalEarningsAmountText(EarningsHeaderViewModel.HeaderViewModel.Loaded loaded, MoneyFormatter moneyFormatter, Function0 function0, Modifier modifier, Composer composer, int i) {
        boolean z;
        AnimatedAmountTextView.Amount amount;
        boolean z2;
        long j = loaded.totalEarningsRaw;
        String str = loaded.totalEarningsText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1253933981);
        int i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2) | (gapComposer.changedInstance(moneyFormatter) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changed = gapComposer.changed(str) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AnimatedAmountTextView.Amount(str, j);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedAmountTextView.Amount amount2 = (AnimatedAmountTextView.Amount) rememberedValue;
            if (!loaded.animateTotalEarnings || j <= 0) {
                gapComposer.startReplaceGroup(-1677887661);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(-1855240766);
                z = !((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                gapComposer.end(false);
            }
            boolean changed2 = gapComposer.changed(str) | gapComposer.changed(j) | gapComposer.changed(z);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                if (z) {
                    long j2 = j - (j / 4);
                    amount = new AnimatedAmountTextView.Amount(moneyFormatter.format(new Money(Long.valueOf(j2), loaded.totalEarningsCurrencyCode, 4)), j2);
                } else {
                    amount = amount2;
                }
                rememberedValue2 = Updater.mutableStateOf$default(amount);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changed3 = gapComposer.changed(z) | gapComposer.changed(mutableState) | gapComposer.changedInstance(amount2) | ((i2 & 896) == 256);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                z2 = false;
                RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z, amount2, function0, mutableState, (Continuation) null, 7);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue3 = anonymousClass1;
            } else {
                z2 = false;
            }
            Updater.LaunchedEffect(amount2, valueOf, (Function2) rememberedValue3, gapComposer);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(z2);
            }
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(modifier, textStyle, colors.semantic.text.standard, 0, (AnimatedAmountTextView.Amount) mutableState.getValue(), TOTAL_EARNINGS_ANIMATION_SPEED, false, 0L, gapComposer, (i2 >> 9) & 14, 200);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(i, 25, loaded, moneyFormatter, modifier, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void EarningsHeader(EarningsHeaderViewModel earningsHeaderViewModel, Function1 function1, LocalizedMoneyFormatter.Factory factory, ScreenScaffoldContentScope screenScaffoldContentScope, Composer composer, int i) {
        GapComposer gapComposer;
        ?? r3;
        NeverEqualPolicy neverEqualPolicy;
        DateFilterBarViewModel dateFilterBarViewModel;
        int i2;
        Modifier modifier;
        GapComposer gapComposer2;
        boolean z;
        earningsHeaderViewModel.getClass();
        boolean z2 = earningsHeaderViewModel.showsChart;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1619119844);
        int i3 = (gapComposer3.changedInstance(earningsHeaderViewModel) ? 4 : 2) | i | (gapComposer3.changedInstance(function1) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changedInstance(factory) ? 256 : 128;
        }
        int i4 = i3 | (gapComposer3.changed(screenScaffoldContentScope) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            boolean changed = gapComposer3.changed(factory);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = LocalizedMoneyFormatter.Factory.createAbbreviatedBalancedFractionDigits$default(factory);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue;
            boolean changed2 = gapComposer3.changed(factory);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = factory.create(MoneyFormatterConfig.STANDARD);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            MoneyFormatter moneyFormatter2 = (MoneyFormatter) rememberedValue2;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2010915985, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(19, earningsHeaderViewModel, screenScaffoldContentScope), gapComposer3);
            EarningsHeaderViewModel.HeaderViewModel headerViewModel = earningsHeaderViewModel.header;
            DateFilterBarViewModel dateFilterBarViewModel2 = earningsHeaderViewModel.filterBarViewModel;
            if (headerViewModel instanceof EarningsHeaderViewModel.HeaderViewModel.Loaded) {
                gapComposer3.startReplaceGroup(1196042083);
                EarningsHeaderViewModel.HeaderViewModel.Loaded loaded = (EarningsHeaderViewModel.HeaderViewModel.Loaded) headerViewModel;
                int i5 = i4 & 112;
                boolean z3 = i5 == 32;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new EarningsHeaderKt$$ExternalSyntheticLambda2(0, function1);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                boolean z4 = i5 == 32;
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (z4 || rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = new EarningsHeaderKt$$ExternalSyntheticLambda2(29, function1);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                Function0 function02 = (Function0) rememberedValue4;
                boolean z5 = i5 == 32;
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (z5 || rememberedValue5 == neverEqualPolicy2) {
                    z = true;
                    rememberedValue5 = new EarningsHomeKt$$ExternalSyntheticLambda7(1, function1);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                } else {
                    z = true;
                }
                dateFilterBarViewModel = dateFilterBarViewModel2;
                neverEqualPolicy = neverEqualPolicy2;
                r3 = 0;
                i2 = i4;
                LoadedHeader(loaded, rememberComposableLambda, moneyFormatter, moneyFormatter2, function0, function02, (Function0) rememberedValue5, earningsHeaderViewModel.showsChart, null, gapComposer3, 48);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                modifier = null;
                gapComposer2 = gapComposer4;
            } else {
                r3 = 0;
                neverEqualPolicy = neverEqualPolicy2;
                dateFilterBarViewModel = dateFilterBarViewModel2;
                i2 = i4;
                if (!headerViewModel.equals(EarningsHeaderViewModel.HeaderViewModel.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1196040378, false);
                }
                gapComposer3.startReplaceGroup(1196058509);
                modifier = null;
                LoadingHeader(6, gapComposer3, rememberComposableLambda, null, z2);
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
            }
            DBUtil.SpacerWithinSectionMedium(r3, 1, gapComposer2, modifier);
            DateFilterBarViewModel dateFilterBarViewModel3 = dateFilterBarViewModel;
            boolean isEmpty = dateFilterBarViewModel3.filterOptions.isEmpty();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                gapComposer2.startReplaceGroup(-1576726932);
                DateFilterBarShimmerKt.DateFilterBarShimmer(r3, r3, gapComposer2, hiddenUnless(companion, z2));
                gapComposer2.end(r3);
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(-1576625066);
                List list = dateFilterBarViewModel3.filterOptions;
                DateFilter dateFilter = earningsHeaderViewModel.selectedFilter;
                Modifier hiddenUnless = hiddenUnless(companion, z2);
                boolean changedInstance = gapComposer2.changedInstance(earningsHeaderViewModel) | ((i2 & 112) != 32 ? r3 : true);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new ProfileQueries$$ExternalSyntheticLambda13(20, earningsHeaderViewModel, function1);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                EarningsFilterBarKt.EarningsFilterBar(list, dateFilter, (Function1) rememberedValue6, hiddenUnless, null, false, gapComposer2, 196608, 16);
                gapComposer2.end(r3);
                gapComposer = gapComposer2;
            }
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(earningsHeaderViewModel, function1, factory, screenScaffoldContentScope, i, 29);
        }
    }

    public static final void LoadedHeader(EarningsHeaderViewModel.HeaderViewModel.Loaded loaded, ComposableLambdaImpl composableLambdaImpl, MoneyFormatter moneyFormatter, MoneyFormatter moneyFormatter2, Function0 function0, Function0 function02, Function0 function03, boolean z, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(168701703);
        int i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2) | (gapComposer.changedInstance(moneyFormatter) ? 256 : 128) | (gapComposer.changedInstance(moneyFormatter2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function03) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(z) ? 8388608 : 4194304) | 100663296;
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-643834697, new EarningsHomeKt$$ExternalSyntheticLambda2(10, loaded, moneyFormatter2, function0), gapComposer), (Modifier) null, 0, composableLambdaImpl, (Function3) null, (Function3) null, (Function2) null, gapComposer, 3078, 118);
            gapComposer = gapComposer;
            List list = loaded.chartBars;
            if (list.isEmpty() && z) {
                gapComposer.startReplaceGroup(-1923766607);
                gapComposer.end(false);
                z3 = true;
            } else {
                gapComposer.startReplaceGroup(-1924705504);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                List list2 = list;
                if (list2.isEmpty()) {
                    list2 = LOADING_CHART_BARS;
                }
                List list3 = list2;
                String str = loaded.chartContentDescription;
                boolean changedInstance = gapComposer.changedInstance(moneyFormatter) | gapComposer.changedInstance(loaded);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ProfileQueries$$ExternalSyntheticLambda13(21, moneyFormatter, loaded);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                boolean isEmpty = list.isEmpty();
                if (z) {
                    gapComposer.startReplaceGroup(353575414);
                    boolean z4 = !((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    gapComposer.end(false);
                    z2 = z4;
                } else {
                    gapComposer.startReplaceGroup(-1924062817);
                    gapComposer.end(false);
                    z2 = false;
                }
                EarningsBarChartConfig m3457copyY9O4PVA$default = EarningsBarChartConfig.m3457copyY9O4PVA$default(BarChartKt.DEFAULT_EARNINGS_BAR_CHART_CONFIG, function1, earningsChartYAxisMaxValueGetter, isEmpty, z2, 15);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier hiddenUnless = hiddenUnless(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), z);
                int i3 = i2 & 29360128;
                boolean z5 = (i3 == 8388608) | ((i2 & 458752) == 131072);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda9(z, function02, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                boolean z6 = (i3 == 8388608) | ((i2 & 3670016) == 1048576);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z6 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PoolDescriptionKt$$ExternalSyntheticLambda3(z, function03, 3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                BarChartKt.EarningsBarChart(list3, str, hiddenUnless, m3457copyY9O4PVA$default, function12, (Function0) rememberedValue3, gapComposer, 0, 0);
                gapComposer.end(false);
                z3 = true;
            }
            gapComposer.end(z3);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda2(loaded, composableLambdaImpl, moneyFormatter, moneyFormatter2, function0, function02, function03, z, modifier2, i);
        }
    }

    public static final void LoadingHeader(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, boolean z) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-209233319);
        int i2 = (gapComposer2.changed(z) ? 32 : 16) | i | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            gapComposer2.startReplaceGroup(790249300);
            float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).numeralLarge.spanStyle.fontSize);
            gapComposer2.end(false);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier2);
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
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-844221431, new TrackRowKt$$ExternalSyntheticLambda0(mo231toDpGaN1DYA, 4), gapComposer2), (Modifier) null, 0, composableLambdaImpl, (Function3) null, (Function3) null, (Function2) null, gapComposer2, 3078, 118);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            String stringResource = Room.stringResource(gapComposer2, R.string.earnings_chart_loading_content_description);
            EarningsBarChartConfig m3457copyY9O4PVA$default = EarningsBarChartConfig.m3457copyY9O4PVA$default(BarChartKt.DEFAULT_EARNINGS_BAR_CHART_CONFIG, null, null, true, false, 63);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            BarChartKt.EarningsBarChart(LOADING_CHART_BARS, stringResource, hiddenUnless(SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2), z), m3457copyY9O4PVA$default, null, null, gapComposer2, 0, 48);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHeaderKt$$ExternalSyntheticLambda14(composableLambdaImpl, z, modifier2, i);
        }
    }

    public static final Modifier hiddenUnless(Modifier modifier, boolean z) {
        return z ? modifier : SemanticsModifierKt.clearAndSetSemantics(AlphaKt.alpha(modifier, RecyclerView.DECELERATION_RATE), new ComposeDialogKt$$ExternalSyntheticLambda14(26));
    }
}
