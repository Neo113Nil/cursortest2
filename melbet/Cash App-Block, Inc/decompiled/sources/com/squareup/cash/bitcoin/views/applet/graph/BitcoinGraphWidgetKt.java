package com.squareup.cash.bitcoin.views.applet.graph;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public abstract class BitcoinGraphWidgetKt {
    public static final ArrayList POINTS;

    static {
        IntRange until = RangesKt___RangesKt.until(0, 1024);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            float nextInt = it.nextInt();
            arrayList.add(new InvestingGraphContentModel.Point(nextInt, nextInt + 5.0f, InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new SsnViewKt$$ExternalSyntheticLambda0(12))));
        }
        POINTS = arrayList;
        IntRange until2 = RangesKt___RangesKt.until(0, 1024);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, 10));
        IntProgressionIterator it2 = until2.iterator();
        while (it2.hasNext) {
            float nextInt2 = it2.nextInt();
            arrayList2.add(new InvestingGraphContentModel.Point(nextInt2, 5.0f - nextInt2, InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new SsnViewKt$$ExternalSyntheticLambda0(12))));
        }
        ArrayList arrayList3 = POINTS;
        ColorModel.Bitcoin bitcoin = ColorModel.Bitcoin.INSTANCE;
        new BitcoinHomeGraphWidgetViewModel(new InvestingGraphContentModel.Loaded(arrayList3, arrayList3, 1024.0f, new InvestingGraphContentModel$AccentColorType$UptoDateData(bitcoin), null, null, null, null, null, 496), new InvestingHomePortfolioHeaderContentModel("$150.00", InvestingHomePortfolioHeaderContentModel.TitleColorType.UP_TO_DATE, new InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData("$64,619.62 USD", InvestingCryptoImage.ARROW_UP, "1.23%", "past month", bitcoin), null), "$150.00", ".00047 BTC", HistoricalRange.MONTH);
    }

    public static final void BitcoinGraphWidget(BitcoinHomeGraphWidgetViewModel bitcoinHomeGraphWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12 = function1;
        bitcoinHomeGraphWidgetViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1271775285);
        int i2 = i | (gapComposer.changed(bitcoinHomeGraphWidgetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = bitcoinHomeGraphWidgetViewModel.graphHeaderModel;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            BitcoinGraphHeaderKt.BitcoinGraphHeader(investingHomePortfolioHeaderContentModel, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 8);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            InvestingGraphContentModel investingGraphContentModel = bitcoinHomeGraphWidgetViewModel.graphModel;
            investingGraphContentModel.getClass();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(13, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function13 = (Function1) rememberedValue;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            InvestingGraphTabsViewKt.m3722MooncakeInvestingGraphRFMEUTM(investingGraphContentModel, null, function13, null, true, colors.semantic.background.subtle, gapComposer, 196608, 26);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            HistoricalRange historicalRange = bitcoinHomeGraphWidgetViewModel.selectedRange;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(14, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            InvestingGraphTabsViewKt.InvestingGraphTimeRangeButtons(historicalRange, false, (Function1) rememberedValue2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, gapComposer, 48, 16);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinHomeGraphWidgetViewModel, function12, i, 6);
        }
    }
}
