package com.squareup.cash.moneybot.views.card;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.LineChartKt;
import com.squareup.cash.charting.components.LineChartSelectionState;
import com.squareup.cash.charting.components.LineChartSelectionState$SelectionBehavior$None;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.components.SelectionBehavior;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.FocusedHeader;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.ScheduleCalendarKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.Strings;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.compose.ModifierKt$consumePointerInput$1;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InsightChartKt {
    /* renamed from: $r8$lambda$BVcVxqijGYf-i8CPmkVWgU4CKes, reason: not valid java name */
    public static Unit m3625$r8$lambda$BVcVxqijGYfi8CPmkVWgU4CKes(FocusedHeader focusedHeader, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            String str = focusedHeader.header;
            String str2 = focusedHeader.largeValue;
            FocusedHeader.Description description = focusedHeader.description;
            Color color = null;
            String str3 = description != null ? description.description : null;
            Icon icon = description != null ? description.icon : null;
            com.squareup.protos.cash.ui.Color color2 = description != null ? description.iconTintColor : null;
            if (color2 == null) {
                gapComposer.startReplaceGroup(407211173);
                gapComposer.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -263958820, color2, gapComposer, false);
            }
            Color color3 = color;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            m3627ChartHeaderContentjM_yU8I(str, str2, str3, icon, color3, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), gapComposer, 0, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static {
        ChatCardViewModel.InsightCard.Chart.BarChart barChart = new ChatCardViewModel.InsightCard.Chart.BarChart("", "", null, null, buildBarChart$default(15, null, null));
        zzd zzdVar = Icons.Companion;
        Icon icon = new Icon("pkQd7c");
        SegmentedBarChartViewModel.Category buildCategory = buildCategory("M", 4000.0f, 8000.0f);
        SegmentedBarChartViewModel.Category buildCategory2 = buildCategory("T", 3000.0f, 8000.0f);
        SegmentedBarChartViewModel.Category buildCategory3 = buildCategory("W", 8000.0f, 8000.0f);
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new ChatCardViewModel.InsightCard.Chart.BarChart("Weekly Spending", "$650.29", "You've spent **$60.54** more this week than you did last week.", icon, buildBarChart$default(3, CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel.Category[]{buildCategory, buildCategory2, buildCategory3, buildCategory("T", RecyclerView.DECELERATION_RATE, 8000.0f), buildCategory("F", 5000.0f, 8000.0f), buildCategory("S", 2500.0f, 8000.0f), buildCategory("S", RecyclerView.DECELERATION_RATE, 8000.0f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel$ChartLabel$DefaultLabel[]{new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$0", valueOf, 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$40", Float.valueOf(4000.0f), 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$80", Float.valueOf(8000.0f), 1)}))));
        List buildToggleButtons = buildToggleButtons();
        listOf.getClass();
        buildToggleButtons.getClass();
        zzd zzdVar2 = Icons.Companion;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new ChatCardViewModel.InsightCard.Chart.BarChart[]{barChart, new ChatCardViewModel.InsightCard.Chart.BarChart("Monthly Spending", "$1,438.01", "You've spent **$30.14** less this month than you did last month.", new Icon("3ZG16R"), buildBarChart$default(3, CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel.Category[]{buildCategory("1-7", 5000.0f, 12000.0f), buildCategory("8-14", 4000.0f, 12000.0f), buildCategory("15-21", 11000.0f, 12000.0f), buildCategory("22-28", RecyclerView.DECELERATION_RATE, 12000.0f), buildCategory("29-30", 3000.0f, 12000.0f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel$ChartLabel$DefaultLabel[]{new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$0", valueOf, 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$60", Float.valueOf(6000.0f), 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$120", Float.valueOf(12000.0f), 1)})))});
        List buildToggleButtons2 = buildToggleButtons();
        listOf2.getClass();
        buildToggleButtons2.getClass();
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new ChatCardViewModel.InsightCard.Chart.BarChart[]{barChart, barChart, new ChatCardViewModel.InsightCard.Chart.BarChart("Yearly Spending", "$14,293.77", null, null, buildBarChart$default(3, CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel.Category[]{buildCategory("Jan", 80000.0f, 150000.0f), buildCategory("Feb", 100000.0f, 150000.0f), buildCategory("Mar", 95000.0f, 150000.0f), buildCategory("Apr", 50000.0f, 150000.0f), buildCategory("May", 75000.0f, 150000.0f), buildCategory("Jun", 100000.0f, 150000.0f), buildCategory("Jul", 145000.0f, 150000.0f), buildCategory("Aug", 99999.0f, 150000.0f), buildCategory("Sep", 123456.0f, 150000.0f), buildCategory("Oct", RecyclerView.DECELERATION_RATE, 150000.0f), buildCategory("Nov", RecyclerView.DECELERATION_RATE, 150000.0f), buildCategory("Dec", RecyclerView.DECELERATION_RATE, 150000.0f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel$ChartLabel$DefaultLabel[]{new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$0", valueOf, 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$750", Float.valueOf(75000.0f), 1), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, "$1,5k", Float.valueOf(150000.0f), 1)})))});
        List buildToggleButtons3 = buildToggleButtons();
        listOf3.getClass();
        buildToggleButtons3.getClass();
        ChatCardViewModel.InsightCard.Chart.LineChart lineChart = new ChatCardViewModel.InsightCard.Chart.LineChart("Stock price", "$375.10", "Stock is up 3.98% this week, bouncing back after some volatility last week.", new Icon("pkQd7c"), buildLineChart(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("M", 1.0f), new LineChartViewModel.AxisLabel("F", 5.0f), new LineChartViewModel.AxisLabel("W", 10.0f), new LineChartViewModel.AxisLabel("M", 15.0f), new LineChartViewModel.AxisLabel("S", 20.0f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("$360", 360.0f), new LineChartViewModel.AxisLabel("$380", 380.0f), new LineChartViewModel.AxisLabel("$400", 400.0f)}), new Pair(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(1.0f, 365.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(2.0f, 370.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(3.0f, 375.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(4.0f, 361.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(5.0f, 375.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(6.0f, 380.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(7.0f, 375.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(8.0f, 380.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(9.0f, 360.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(10.0f, 400.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(11.0f, 390.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(12.0f, 385.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(13.0f, 373.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(14.0f, 360.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(15.0f, 390.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(16.0f, 395.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(17.0f, 370.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(18.0f, 360.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(19.0f, 380.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(20.0f, 390.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)}), "#00D64F")), null);
        ChatCardViewModel.InsightCard.Chart.LineChart lineChart2 = new ChatCardViewModel.InsightCard.Chart.LineChart("Index Performance", null, null, null, buildLineChart(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("10.05", 10.05f), new LineChartViewModel.AxisLabel("10.10", 10.1f), new LineChartViewModel.AxisLabel("10.15", 10.15f), new LineChartViewModel.AxisLabel("10.20", 10.2f), new LineChartViewModel.AxisLabel("10.25", 10.25f), new LineChartViewModel.AxisLabel("10.30", 10.3f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("+10%", 10.0f), new LineChartViewModel.AxisLabel("-15%", -15.0f), new LineChartViewModel.AxisLabel("-30%", -30.0f)}), new Pair(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(10.0f, 10.0f, "+10%", null, null, null, 116), new LineChartViewModel.Line.Point(10.025f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.05f, -12.0f, "-12%", null, null, null, 116), new LineChartViewModel.Line.Point(10.075f, -20.0f, "-20%", null, null, null, 116), new LineChartViewModel.Line.Point(10.1f, -18.0f, "-18%", null, null, null, 116), new LineChartViewModel.Line.Point(10.125f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.15f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.175f, 8.0f, "+8%", null, null, null, 116), new LineChartViewModel.Line.Point(10.2f, 2.0f, "+2%", null, null, null, 116), new LineChartViewModel.Line.Point(10.225f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.25f, -12.0f, "-12%", null, null, null, 116), new LineChartViewModel.Line.Point(10.275f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.3f, 6.0f, "+6%", null, null, null, 116), new LineChartViewModel.Line.Point(10.325f, -2.0f, "-2%", null, null, null, 116), new LineChartViewModel.Line.Point(10.35f, -10.0f, "-10%", null, null, null, 116)}), "#003805"), new Pair(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(10.0f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.025f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.05f, -15.0f, "-15%", null, null, null, 116), new LineChartViewModel.Line.Point(10.075f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.1f, -18.0f, "-18%", null, null, null, 116), new LineChartViewModel.Line.Point(10.125f, -19.0f, "-19%", null, null, null, 116), new LineChartViewModel.Line.Point(10.15f, -20.0f, "-20%", null, null, null, 116), new LineChartViewModel.Line.Point(10.175f, -22.0f, "-22%", null, null, null, 116), new LineChartViewModel.Line.Point(10.2f, -28.0f, "-28%", null, null, null, 116), new LineChartViewModel.Line.Point(10.225f, -30.0f, "-30%", null, null, null, 116), new LineChartViewModel.Line.Point(10.25f, -30.0f, "-30%", null, null, null, 116), new LineChartViewModel.Line.Point(10.275f, 10.0f, "+10%", null, null, null, 116), new LineChartViewModel.Line.Point(10.3f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.325f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.35f, -12.0f, "-12%", null, null, null, 116)}), "#00D64F")), new ChatCardViewModel.InsightCard.Chart.Legend(CollectionsKt__CollectionsKt.listOf((Object[]) new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem[]{new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem("NASDAQ", "-10.4% this month", ColorsKt.toColor("#00D64F"), 0), new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem("S&P 500", null, ColorsKt.toColor("#003805"), 1)})));
        ChatCardViewModel.InsightCard.Chart.LineChart lineChart3 = new ChatCardViewModel.InsightCard.Chart.LineChart("Index Performance", null, null, null, buildLineChart(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("10.05", 10.05f), new LineChartViewModel.AxisLabel("10.10", 10.1f), new LineChartViewModel.AxisLabel("10.15", 10.15f), new LineChartViewModel.AxisLabel("10.20", 10.2f), new LineChartViewModel.AxisLabel("10.25", 10.25f), new LineChartViewModel.AxisLabel("10.30", 10.3f)}), CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("+10%", 10.0f), new LineChartViewModel.AxisLabel("-15%", -15.0f), new LineChartViewModel.AxisLabel("-30%", -30.0f)}), new Pair(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(10.0f, 10.0f, "+10%", null, null, null, 116), new LineChartViewModel.Line.Point(10.025f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.05f, -12.0f, "-12%", null, null, null, 116), new LineChartViewModel.Line.Point(10.075f, -20.0f, "-20%", null, null, null, 116), new LineChartViewModel.Line.Point(10.1f, -18.0f, "-18%", null, null, null, 116), new LineChartViewModel.Line.Point(10.125f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.15f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.175f, 8.0f, "+8%", null, null, null, 116), new LineChartViewModel.Line.Point(10.2f, 2.0f, "+2%", null, null, null, 116), new LineChartViewModel.Line.Point(10.225f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.25f, -12.0f, "-12%", null, null, null, 116), new LineChartViewModel.Line.Point(10.275f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.3f, 6.0f, "+6%", null, null, null, 116), new LineChartViewModel.Line.Point(10.325f, -2.0f, "-2%", null, null, null, 116), new LineChartViewModel.Line.Point(10.35f, -10.0f, "-10%", null, null, null, 116)}), "#003805"), new Pair(CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(10.0f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.025f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.05f, -15.0f, "-15%", null, null, null, 116), new LineChartViewModel.Line.Point(10.075f, RecyclerView.DECELERATION_RATE, "0%", null, null, null, 116), new LineChartViewModel.Line.Point(10.1f, -18.0f, "-18%", null, null, null, 116), new LineChartViewModel.Line.Point(10.125f, -19.0f, "-19%", null, null, null, 116), new LineChartViewModel.Line.Point(10.15f, -20.0f, "-20%", null, null, null, 116), new LineChartViewModel.Line.Point(10.175f, -22.0f, "-22%", null, null, null, 116), new LineChartViewModel.Line.Point(10.2f, -28.0f, "-28%", null, null, null, 116), new LineChartViewModel.Line.Point(10.225f, -30.0f, "-30%", null, null, null, 116), new LineChartViewModel.Line.Point(10.25f, -30.0f, "-30%", null, null, null, 116), new LineChartViewModel.Line.Point(10.275f, 10.0f, "+10%", null, null, null, 116), new LineChartViewModel.Line.Point(10.3f, 5.0f, "+5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.325f, -5.0f, "-5%", null, null, null, 116), new LineChartViewModel.Line.Point(10.35f, -12.0f, "-12%", null, null, null, 116)}), "#00D64F")), new ChatCardViewModel.InsightCard.Chart.Legend(CollectionsKt__CollectionsKt.listOf((Object[]) new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem[]{new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem("NASDAQ", "-10.4% this month", ColorsKt.toColor("#00D64F"), 0), new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem("S&P 500", "-10.3% this month", ColorsKt.toColor("#003805"), 1)})));
        List listOf4 = CollectionsKt__CollectionsJVMKt.listOf(lineChart);
        List buildToggleButtons4 = buildToggleButtons();
        listOf4.getClass();
        buildToggleButtons4.getClass();
        List listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new ChatCardViewModel.InsightCard.Chart.NoChart(new Icon("pkQd7c"), "Insight", "$375.10", "Informative insight that doesn't need a chart."));
        EmptyList emptyList = EmptyList.INSTANCE;
        listOf5.getClass();
        emptyList.getClass();
        CollectionsKt__CollectionsJVMKt.listOf(lineChart).getClass();
        emptyList.getClass();
        CollectionsKt__CollectionsJVMKt.listOf(lineChart2).getClass();
        emptyList.getClass();
        CollectionsKt__CollectionsJVMKt.listOf(lineChart3).getClass();
        emptyList.getClass();
    }

    /* renamed from: ChartDescription-xqIIw2o, reason: not valid java name */
    public static final void m3626ChartDescriptionxqIIw2o(String str, Icon icon, Modifier modifier, Color color, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Icons icons;
        Painter painter;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-208157809);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(icon) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(color) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            long pack = Room.pack(4294967296L, 20.0f / ((Density) gapComposer.consume(staticProvidableCompositionLocal)).getFontScale());
            long pack2 = Room.pack(4294967296L, 16.0f / ((Density) gapComposer.consume(staticProvidableCompositionLocal)).getFontScale());
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            if (icon != null) {
                KeyMappingKt.appendInlineContent(builder, "icon", "�");
            }
            MarkdownSpanValues markdownSpanValues = MarkdownSpanValues.Default;
            Map map = null;
            Worker.DefaultImpls.appendMarkdown$default(builder, str, null, 4);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (icon == null || (str2 = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str2);
            }
            if (icons == null) {
                gapComposer.startReplaceGroup(704286345);
                gapComposer.end(false);
                painter = null;
            } else {
                gapComposer.startReplaceGroup(1823834232);
                painter = icons.painter(gapComposer);
                gapComposer.end(false);
            }
            if (painter == null) {
                gapComposer.startReplaceGroup(704316322);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(704316323);
                map = MapsKt__MapsJVMKt.mapOf(new Pair("icon", new InlineTextContent(new Placeholder(4, pack, pack2), Expect_jvmKt.rememberComposableLambda(339574585, new MoneyTabUIKt$$ExternalSyntheticLambda11(2, painter, color), gapComposer))));
                gapComposer.end(false);
            }
            if (map == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            Map map2 = map;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1164Text25TpFw(0, 0, 0, 0, (i3 >> 3) & 112, 0, 2032, j, (Composer) gapComposer, (Modifier) companion, annotatedString, textStyle, (TextLineBalancing) null, map2, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(str, i, icon, modifier2, color, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    public static final void ChartHeader(ChatCardViewModel.InsightCard.Chart chart, FocusedHeader focusedHeader, ChatCardViewModel.InsightCard.Chart.Legend legend, Composer composer, int i) {
        ?? r13;
        Iterator it;
        FocusedHeader.Description description;
        FocusedHeader focusedHeader2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(14228923);
        int i2 = i | (gapComposer.changedInstance(chart) ? 4 : 2) | (gapComposer.changedInstance(focusedHeader) ? 32 : 16) | (gapComposer.changedInstance(legend) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (legend != null) {
                gapComposer.startReplaceGroup(-1307767076);
                LegendHeader(chart.getTitle(), legend, null, gapComposer, (i2 >> 3) & 112);
                re$$ExternalSyntheticOutline0.m(companion, 24.0f, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1307593538);
                boolean changed = gapComposer.changed(chart);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = defaultHeader(chart);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                FocusedHeader focusedHeader3 = (FocusedHeader) rememberedValue;
                boolean changed2 = gapComposer.changed(chart);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(defaultHeader(chart));
                    if (chart instanceof ChatCardViewModel.InsightCard.Chart.BarChart) {
                        ChatCardViewModel.InsightCard.Chart.BarChart barChart = (ChatCardViewModel.InsightCard.Chart.BarChart) chart;
                        List<SegmentedBarChartViewModel.Category> list = barChart.data.categories;
                        r13 = new ArrayList();
                        for (SegmentedBarChartViewModel.Category category : list) {
                            String str = category.header;
                            if (str == null) {
                                focusedHeader2 = null;
                            } else {
                                String str2 = barChart.title;
                                String str3 = category.subtitle;
                                focusedHeader2 = new FocusedHeader(str2, str, str3 != null ? new FocusedHeader.Description(str3, (Icon) null, 6) : null);
                            }
                            if (focusedHeader2 != null) {
                                r13.add(focusedHeader2);
                            }
                        }
                    } else if (chart instanceof ChatCardViewModel.InsightCard.Chart.LineChart) {
                        ChatCardViewModel.InsightCard.Chart.LineChart lineChart = (ChatCardViewModel.InsightCard.Chart.LineChart) chart;
                        List list2 = lineChart.data.lines;
                        r13 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<LineChartViewModel.Line.Point> list3 = ((LineChartViewModel.Line) it2.next()).points;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            for (LineChartViewModel.Line.Point point : list3) {
                                String str4 = lineChart.title;
                                String str5 = point.label;
                                if (str5 == null) {
                                    str5 = str4;
                                }
                                String str6 = point.description;
                                ChatCardViewModel.InsightCard.Chart.LineChart lineChart2 = lineChart;
                                if (str6 != null) {
                                    it = it2;
                                    description = new FocusedHeader.Description(str6, point.icon, point.iconTintColor);
                                } else {
                                    it = it2;
                                    description = null;
                                }
                                arrayList.add(new FocusedHeader(str4, str5, description));
                                lineChart = lineChart2;
                                it2 = it;
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (Collection) r13);
                        }
                    } else {
                        if (!(chart instanceof ChatCardViewModel.InsightCard.Chart.NoChart)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        r13 = EmptyList.INSTANCE;
                    }
                    rememberedValue2 = CollectionsKt.toList(CollectionsKt.toMutableSet(CollectionsKt.plus((Iterable) r13, (Collection) listOf)));
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                List list4 = (List) rememberedValue2;
                boolean changedInstance = gapComposer.changedInstance(focusedHeader) | gapComposer.changedInstance(focusedHeader3) | gapComposer.changedInstance(list4);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MusicViewKt$$ExternalSyntheticLambda5(12, focusedHeader, focusedHeader3, list4);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                RulerKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue3, gapComposer, 0, 1);
                if (chart instanceof ChatCardViewModel.InsightCard.Chart.NoChart) {
                    gapComposer.startReplaceGroup(-1305589977);
                    gapComposer.end(false);
                } else {
                    re$$ExternalSyntheticOutline0.m(gapComposer, -1305642832, companion, 40.0f, gapComposer);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(chart, focusedHeader, legend, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* renamed from: ChartHeaderContent-jM_yU8I, reason: not valid java name */
    public static final void m3627ChartHeaderContentjM_yU8I(String str, String str2, String str3, Icon icon, Color color, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ?? r6;
        Modifier modifier4;
        ?? r14;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(157093105);
        int i4 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128) | (gapComposer.changedInstance(icon) ? 2048 : 1024) | (gapComposer.changed(color) ? 16384 : PKIFailureInfo.certRevoked);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i6 = i3;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 74899) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier5 = i5 != 0 ? companion : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier5);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i6 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1317020436);
                gapComposer.end(false);
                modifier4 = null;
                modifier3 = modifier5;
                r14 = 1;
                r6 = 0;
            } else {
                gapComposer.startReplaceGroup(-1317020435);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
                modifier3 = modifier5;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).numeralLarge, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                r6 = 0;
                gapComposer.end(false);
                modifier4 = null;
                r14 = 1;
            }
            DBUtil.SpacerWithinSectionMedium(r6, r14, gapComposer, modifier4);
            if (str3 != null) {
                gapComposer.startReplaceGroup(-1316724943);
                m3626ChartDescriptionxqIIw2o(str3, icon, null, color, gapComposer, ((i6 >> 6) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i6 >> 3) & 7168));
                gapComposer.end(r6);
            } else {
                gapComposer.startReplaceGroup(-1316623077);
                gapComposer.end(r6);
            }
            gapComposer.end(r14);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(str, str2, str3, icon, color, modifier2, i, i2);
        }
    }

    /* renamed from: DescriptionIcon-kvuU558, reason: not valid java name */
    public static final void m3628DescriptionIconkvuU558(Painter painter, Color color, Composer composer, int i) {
        int i2;
        Painter painter2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-751597102);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(16.0f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(color) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            painter2 = painter;
            Trace.m1190Iconww6aTOc(painter2, (String) null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f), color != null ? color.value : Color.Unspecified, gapComposer, Painter.$stable | 48 | (i2 & 14), 0);
        } else {
            painter2 = painter;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(painter2, color, i, 13);
        }
    }

    public static final void InsightChart(ChatCardViewModel.InsightCard insightCard, Modifier modifier, boolean z, InsightBarChartSelectionState insightBarChartSelectionState, Composer composer, int i) {
        int i2;
        boolean z2;
        boolean z3;
        Object obj;
        List list;
        boolean z4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1636965672);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(insightCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(insightBarChartSelectionState) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                z3 = true;
            } else {
                gapComposer.skipToGroupEnd();
                z3 = z;
            }
            gapComposer.endDefaults();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changed = gapComposer.changed(insightCard);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj2) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(insightCard.defaultChartIndex, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            boolean changed2 = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj2) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            ArrayList arrayList = insightCard.charts;
            List list2 = insightCard.chartToggleButtons;
            ChatCardViewModel.InsightCard.Chart chart = (ChatCardViewModel.InsightCard.Chart) CollectionsKt.getOrNull(parcelableSnapshotMutableIntState.getIntValue(), arrayList);
            boolean changed3 = gapComposer.changed(chart);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == obj2) {
                ChatCardViewModel.InsightCard.Chart.LineChart lineChart = chart instanceof ChatCardViewModel.InsightCard.Chart.LineChart ? (ChatCardViewModel.InsightCard.Chart.LineChart) chart : null;
                rememberedValue3 = Updater.mutableStateOf$default(lineChart != null ? lineChart.legend : null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState3 = (MutableState) rememberedValue4;
            gapComposer.startMovableGroup(-734638216, Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue()));
            if (chart == null) {
                gapComposer.startReplaceGroup(-1298903234);
                gapComposer.end(false);
                obj = obj2;
                z4 = false;
                list = list2;
            } else {
                gapComposer.startReplaceGroup(-1298903233);
                FocusedHeader focusedHeader = (FocusedHeader) mutableState.getValue();
                ChatCardViewModel.InsightCard.Chart.Legend legend = (ChatCardViewModel.InsightCard.Chart.Legend) mutableState3.getValue();
                if (legend == null) {
                    legend = (ChatCardViewModel.InsightCard.Chart.Legend) mutableState2.getValue();
                }
                int i4 = i3;
                ChartHeader(chart, focusedHeader, legend, gapComposer, 0);
                if (chart instanceof ChatCardViewModel.InsightCard.Chart.BarChart) {
                    gapComposer.startReplaceGroup(969917493);
                    ChatCardViewModel.InsightCard.Chart.BarChart barChart = (ChatCardViewModel.InsightCard.Chart.BarChart) chart;
                    int intValue = parcelableSnapshotMutableIntState.getIntValue();
                    boolean z5 = insightCard.interactive;
                    boolean changed4 = gapComposer.changed(mutableState);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue5 == obj2) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(7, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    list = list2;
                    obj = obj2;
                    InteractiveBarChart(barChart, intValue, insightBarChartSelectionState, z5, z3, (Function1) rememberedValue5, gapComposer, ((i4 << 6) & 57344) | ((i4 >> 6) & 896));
                    gapComposer.end(false);
                    z4 = false;
                } else {
                    obj = obj2;
                    list = list2;
                    if (chart instanceof ChatCardViewModel.InsightCard.Chart.LineChart) {
                        gapComposer.startReplaceGroup(970302792);
                        ChatCardViewModel.InsightCard.Chart.LineChart lineChart2 = (ChatCardViewModel.InsightCard.Chart.LineChart) chart;
                        ChatCardViewModel.InsightCard.Chart.Legend legend2 = (ChatCardViewModel.InsightCard.Chart.Legend) mutableState2.getValue();
                        boolean z6 = insightCard.interactive;
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (rememberedValue6 == obj) {
                            rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda9(8, mutableState3);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        Function1 function1 = (Function1) rememberedValue6;
                        boolean changed5 = gapComposer.changed(mutableState);
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        if (changed5 || rememberedValue7 == obj) {
                            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda9(9, mutableState);
                            gapComposer.updateRememberedValue(rememberedValue7);
                        }
                        Function1 function12 = (Function1) rememberedValue7;
                        int i5 = i4 << 3;
                        int i6 = (i5 & 7168) | 196608 | (i5 & 57344);
                        boolean z7 = z3;
                        InteractiveLineChart(lineChart2, legend2, z6, z7, function1, function12, gapComposer, i6);
                        z3 = z7;
                        z4 = false;
                        gapComposer.end(false);
                    } else {
                        z4 = false;
                        if (!(chart instanceof ChatCardViewModel.InsightCard.Chart.NoChart)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 31286373, false);
                        }
                        gapComposer.startReplaceGroup(970716456);
                        gapComposer.end(false);
                    }
                }
                gapComposer.end(z4);
            }
            gapComposer.end(z4);
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(-1297584400);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1297840987);
                ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f));
                int intValue2 = parcelableSnapshotMutableIntState.getIntValue();
                boolean changed6 = gapComposer.changed(parcelableSnapshotMutableIntState);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changed6 || rememberedValue8 == obj) {
                    rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda14(16, parcelableSnapshotMutableIntState);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                ToggleButtons(list, intValue2, (Function1) rememberedValue8, gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            z2 = z3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(insightCard, modifier, z2, insightBarChartSelectionState, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.lang.Throwable] */
    public static final void InteractiveBarChart(ChatCardViewModel.InsightCard.Chart.BarChart barChart, int i, InsightBarChartSelectionState insightBarChartSelectionState, boolean z, boolean z2, Function1 function1, Composer composer, int i2) {
        Function1 function12;
        Object realKeyStoreProvider$setEntry$2;
        int i3;
        int i4;
        Continuation continuation;
        Integer num;
        ChatCardViewModel.InsightCard.Chart.BarChart barChart2 = barChart;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(561693381);
        int i5 = (i2 & 6) == 0 ? (gapComposer.changedInstance(barChart2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= gapComposer.changed(i) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(insightBarChartSelectionState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            function12 = function1;
            i5 |= gapComposer.changedInstance(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        int i6 = i5;
        if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) != 74898)) {
            Integer num2 = (Integer) insightBarChartSelectionState.selectedCategoryIndexByChart.get(Integer.valueOf(i));
            int i7 = 458752 & i6;
            boolean changed = gapComposer.changed(num2) | (i7 == 131072) | gapComposer.changedInstance(barChart2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                i3 = 0;
                i4 = i7;
                continuation = null;
                realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(num2, function12, barChart, continuation, 11);
                num = num2;
                barChart2 = barChart;
                gapComposer.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            } else {
                num = num2;
                realKeyStoreProvider$setEntry$2 = rememberedValue;
                i4 = i7;
                continuation = null;
                i3 = 0;
            }
            Updater.LaunchedEffect(gapComposer, num, (Function2) realKeyStoreProvider$setEntry$2);
            Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.standard, gapComposer, i3);
            SegmentedBarChartViewModel segmentedBarChartViewModel = barChart2.data;
            List list = segmentedBarChartViewModel.categories;
            ?? r40 = continuation;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r40;
                }
                SegmentedBarChartViewModel.Category category = (SegmentedBarChartViewModel.Category) obj;
                Integer num3 = num;
                boolean z3 = num != null && i8 == num3.intValue();
                List list2 = category.segments;
                SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel = category.label;
                String str = category.header;
                String str2 = category.subtitle;
                String str3 = category.accessibilityLabel;
                List list3 = category.yAxisLabels;
                list2.getClass();
                segmentedBarChartViewModel$ChartLabel$DefaultLabel.getClass();
                arrayList.add(new SegmentedBarChartViewModel.Category(list2, segmentedBarChartViewModel$ChartLabel$DefaultLabel, str, str2, z3, str3, list3));
                num = num3;
                i8 = i9;
            }
            String str4 = segmentedBarChartViewModel.title;
            String str5 = segmentedBarChartViewModel.subtitle;
            SegmentedBarChartViewModel.Legend legend = segmentedBarChartViewModel.legend;
            List list4 = segmentedBarChartViewModel.yAxisLabels;
            str4.getClass();
            str5.getClass();
            SegmentedBarChartViewModel segmentedBarChartViewModel2 = new SegmentedBarChartViewModel(str4, str5, arrayList, legend, list4);
            Strings.getSizes(gapComposer).getClass();
            Object obj2 = DefaultSizes.border.entries;
            ChartConfig.FlexChartConfig flexChartConfig = new ChartConfig.FlexChartConfig(new ChartConfig.CapConfig.SquareCapConfig(), new Color(Strings.getColors(gapComposer).semantic.background.subtle), Strings.getColors(gapComposer).semantic.border.subtle, z ? SelectionBehavior.Focus : SelectionBehavior.None);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            fillMaxWidth.getClass();
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxWidth, Boolean.valueOf(z), new ModifierKt$consumePointerInput$1(z));
            boolean changed2 = gapComposer.changed(rememberHapticTrigger) | ((i6 & 896) == 256) | ((i6 & 112) == 32) | (i4 == 131072) | gapComposer.changedInstance(barChart2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                DatePickerKt$$ExternalSyntheticLambda6 datePickerKt$$ExternalSyntheticLambda6 = new DatePickerKt$$ExternalSyntheticLambda6(rememberHapticTrigger, insightBarChartSelectionState, i, function1, barChart, 2);
                gapComposer.updateRememberedValue(datePickerKt$$ExternalSyntheticLambda6);
                rememberedValue2 = datePickerKt$$ExternalSyntheticLambda6;
            }
            SegmentedBarChartKt.SegmentedBarChart(segmentedBarChartViewModel2, pointerInput, flexChartConfig, z2, (Function1) rememberedValue2, gapComposer, 512 | (57344 & i6), 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(barChart, i, insightBarChartSelectionState, z, z2, function1, i2);
        }
    }

    public static final void InteractiveLineChart(ChatCardViewModel.InsightCard.Chart.LineChart lineChart, ChatCardViewModel.InsightCard.Chart.Legend legend, boolean z, boolean z2, Function1 function1, Function1 function12, Composer composer, int i) {
        int i2;
        Function1 function13;
        GapComposer gapComposer;
        LineChartSelectionState lineChartSelectionState;
        ChatCardViewModel.InsightCard.Chart.LineChart lineChart2 = lineChart;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-398217448);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(lineChart2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(legend) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function13 = function12;
            i2 |= gapComposer2.changedInstance(function13) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        } else {
            function13 = function12;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            LineChartSelectionState rememberLineChartSelectionState = BarChartKt.rememberLineChartSelectionState(z ? LineChartSelectionState$SelectionBehavior$None.INSTANCE$1 : LineChartSelectionState$SelectionBehavior$None.INSTANCE, gapComposer2, 0);
            List selectedPoints = rememberLineChartSelectionState.getSelectedPoints();
            boolean changedInstance = ((i3 & 458752) == 131072) | gapComposer2.changedInstance(rememberLineChartSelectionState) | ((3670016 & i3) == 1048576) | gapComposer2.changedInstance(lineChart2) | gapComposer2.changedInstance(legend);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                lineChartSelectionState = rememberLineChartSelectionState;
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(lineChartSelectionState, function1, function13, legend, lineChart2, null, 18);
                lineChart2 = lineChart2;
                gapComposer2.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                rememberedValue = moleculeKt$immediateClockFlow$1$1$1;
            } else {
                lineChartSelectionState = rememberLineChartSelectionState;
            }
            Updater.LaunchedEffect(gapComposer2, selectedPoints, (Function2) rememberedValue);
            gapComposer = gapComposer2;
            LineChartViewModel lineChartViewModel = lineChart2.data;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            fillMaxWidth.getClass();
            LineChartKt.m3459LineChartg1gPWk(lineChartViewModel, 206.0f, SuspendingPointerInputFilterKt.pointerInput(fillMaxWidth, Boolean.valueOf(z), new ModifierKt$consumePointerInput$1(z)), z2, 0L, lineChartSelectionState, gapComposer, (i3 & 7168) | 48, 16);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduleCalendarKt$$ExternalSyntheticLambda5(lineChart2, legend, z, z2, function1, function12, i);
        }
    }

    public static final void LegendHeader(String str, ChatCardViewModel.InsightCard.Chart.Legend legend, Modifier modifier, Composer composer, int i) {
        String str2;
        int i2;
        Modifier modifier2;
        ChatCardViewModel.InsightCard.Chart.Legend legend2 = legend;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(726610216);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (gapComposer.changed(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(legend2) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(211861474);
            legend2 = legend;
            Iterator it = legend2.items.iterator();
            while (it.hasNext()) {
                LegendItemRow((ChatCardViewModel.InsightCard.Chart.Legend.LegendItem) it.next(), gapComposer, 0);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(str, legend2, modifier2, i, 13);
        }
    }

    public static final void LegendItemRow(ChatCardViewModel.InsightCard.Chart.Legend.LegendItem legendItem, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-39883127);
        int i2 = (gapComposer.changedInstance(legendItem) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Color forTheme = ThemablesKt.forTheme(legendItem.color, gapComposer);
            if (forTheme == null) {
                gapComposer.startReplaceGroup(1107718297);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1107718298);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 10.0f), RoundedCornerShapeKt.CircleShape), forTheme.value, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(false);
            }
            String str = legendItem.label;
            String str2 = legendItem.description;
            gapComposer.startReplaceGroup(657155617);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            int pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer).semantic.text.standard, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
            try {
                builder.append(str);
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1973528337);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1973528338);
                    builder.append("  ");
                    pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer).semantic.text.subtle, 0L, Strings.getTypography(gapComposer).bodyMedium.spanStyle.fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65530));
                    try {
                        builder.append(str2);
                        builder.pop(pushStyle);
                        gapComposer.end(false);
                    } finally {
                    }
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(false);
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, annotatedString, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(true);
            } finally {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(legendItem, i, 6);
        }
    }

    public static final void ToggleButtons(List list, int i, Function1 function1, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1598749212);
        int i3 = i2 | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(Colors.copy$default(Strings.getColors(gapComposer), Colors.Component.copy$default(Strings.getColors(gapComposer).component, null, null, null, null, new Colors.Component.SegmentedControl(Strings.getColors(gapComposer).semantic.background.f1047app, new Colors.Component.SegmentedControl.Button(new Colors.Component.SegmentedControl.Button.Background(Strings.getColors(gapComposer).component.filterBar.chip.background.f181default), Strings.getColors(gapComposer).component.segmentedControl.button.text), Strings.getColors(gapComposer).component.segmentedControl.overlay), null, null, 133955583), null, 55), null, null, Expect_jvmKt.rememberComposableLambda(-220315015, new TabContentViewKt$$ExternalSyntheticLambda16(i, function1, list), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, i, function1, i2, 6);
        }
    }

    public static SegmentedBarChartViewModel buildBarChart$default(int i, List list, List list2) {
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        return new SegmentedBarChartViewModel("$123.45", "Spent recently", list3, null, list2, 8);
    }

    public static final FocusedHeader buildBarChartHeader(ChatCardViewModel.InsightCard.Chart.BarChart barChart, int i) {
        String str;
        SegmentedBarChartViewModel.Category category = (SegmentedBarChartViewModel.Category) CollectionsKt.getOrNull(i, barChart.data.categories);
        if (category == null || (str = category.header) == null) {
            return null;
        }
        String str2 = barChart.title;
        String str3 = category.subtitle;
        return new FocusedHeader(str2, str, str3 != null ? new FocusedHeader.Description(str3, (Icon) null, 6) : null);
    }

    public static final SegmentedBarChartViewModel.Category buildCategory(String str, float f, float f2) {
        return new SegmentedBarChartViewModel.Category(CollectionsKt__CollectionsJVMKt.listOf(new SegmentedBarChartViewModel.Category.Segment(f / f2, ColorsKt.toColor("#00D64F"))), new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(str, null, null, 6), "$" + f, str, false, str, 64);
    }

    public static final LineChartViewModel buildLineChart(List list, List list2, Pair... pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new LineChartViewModel.Line((List) pair.first, ColorsKt.toColor((String) pair.second)));
        }
        return new LineChartViewModel(arrayList, new LineChartViewModel.AxisConfig(list), new LineChartViewModel.AxisConfig(list2));
    }

    public static final List buildToggleButtons() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ChatCardViewModel.InsightCard.ChartToggleButton[]{new ChatCardViewModel.InsightCard.ChartToggleButton("Week"), new ChatCardViewModel.InsightCard.ChartToggleButton("Month"), new ChatCardViewModel.InsightCard.ChartToggleButton("Year")});
    }

    public static final FocusedHeader defaultHeader(ChatCardViewModel.InsightCard.Chart chart) {
        String title = chart.getTitle();
        String headlineValue = chart.getHeadlineValue();
        String description = chart.getDescription();
        return new FocusedHeader(title, headlineValue, description != null ? new FocusedHeader.Description(description, chart.getDescriptionIcon(), 4) : null);
    }
}
