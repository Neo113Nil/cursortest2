package androidx.camera.camera2.pipe;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.charting.Graph;
import com.squareup.cash.moneybot.backend.api.model.charting.LineGraph;
import com.squareup.cash.moneybot.backend.api.model.charting.VerticalStackedBarGraph;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.AxisLabel;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CameraGraph$OperatingMode {
    public static final void AfterpayCategoryIconTile(Modifier modifier, AfterpaySearchViewModel.CategoryTileViewModel.CategoryIconTileViewModel categoryIconTileViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-848063647);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(categoryIconTileViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(26, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(categoryIconTileViewModel.icon, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, null, gapComposer, 432, 2040);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 8.0f, gapComposer);
            KeypadKt.m3651TextPdH14aY(1, 0, 0, 0, 196608, 0, 4050, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, categoryIconTileViewModel.title, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(modifier, categoryIconTileViewModel, function0, i, 8);
        }
    }

    public static final void AfterpayCategoryTile(Modifier modifier, AfterpaySearchViewModel.CategoryTileViewModel categoryTileViewModel, Function0 function0, Composer composer, int i) {
        categoryTileViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1706529261);
        int i2 = (gapComposer.changedInstance(categoryTileViewModel) ? 32 : 16) | i | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (categoryTileViewModel instanceof AfterpaySearchViewModel.CategoryTileViewModel.CategoryIconTileViewModel) {
            gapComposer.startReplaceGroup(702893762);
            AfterpayCategoryIconTile(modifier, (AfterpaySearchViewModel.CategoryTileViewModel.CategoryIconTileViewModel) categoryTileViewModel, function0, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(false);
        } else {
            if (!(categoryTileViewModel instanceof AfterpaySearchViewModel.CategoryTileViewModel.CategoryImageTileViewModel)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 702892082, false);
            }
            gapComposer.startReplaceGroup(702897431);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(i, 18, modifier, categoryTileViewModel, function0);
        }
    }

    public static final ArrayList getValidationFailures(LineGraph.Line.DataPoint dataPoint, int i) {
        ArrayList arrayList = new ArrayList();
        if (dataPoint.x_value == null) {
            arrayList.add("x_value");
        }
        if (dataPoint.y_value == null) {
            arrayList.add("y_value");
        }
        if (i >= 1) {
            LocalizedString localizedString = dataPoint.label;
            if ((localizedString != null ? localizedString.translated_value : null) == null) {
                arrayList.add(AnnotatedPrivateKey.LABEL);
            }
        }
        if (i >= 1) {
            LocalizedString localizedString2 = dataPoint.description;
            if ((localizedString2 != null ? localizedString2.translated_value : null) == null) {
                arrayList.add("description");
            }
        }
        return arrayList;
    }

    public static final Graph.AxisLabel toAxisLabel(ProtoValidationScope protoValidationScope, AxisLabel axisLabel, PatternRedaction patternRedaction) {
        String str;
        try {
            try {
                str = ProtoValidationScope.required(axisLabel.text, "text");
                "text".concat(" translated_value");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, axisLabel != null ? Reflection.factory.getOrCreateKotlinClass(axisLabel.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str != null) {
                Long l = axisLabel.value;
                try {
                    ProtoValidationScope.required(l, "value");
                } catch (Exception e2) {
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, axisLabel != null ? Reflection.factory.getOrCreateKotlinClass(axisLabel.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    l = null;
                }
                if (l != null) {
                    return new Graph.AxisLabel(str, l.longValue());
                }
            }
            return null;
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, axisLabel != null ? Reflection.factory.getOrCreateKotlinClass(AxisLabel.class) : null, patternRedaction, null);
        }
    }

    public static final VerticalStackedBarGraph.Bar toBar(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph.Bar bar, int i, PatternRedaction patternRedaction) {
        bar.getClass();
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(bar, patternRedaction, protoValidationScope);
            String required = ProtoValidationScope.required(bar.category_text, "category_text");
            String reportIfNullAndContinue = i >= 1 ? protoValidationScope2.reportIfNullAndContinue(bar.header_text, "header_text", (String) null) : null;
            String str = reportIfNullAndContinue == null ? "" : reportIfNullAndContinue;
            String reportIfNullAndContinue2 = i >= 1 ? protoValidationScope2.reportIfNullAndContinue(bar.subtitle_text, "subtitle_text", (String) null) : null;
            String str2 = reportIfNullAndContinue2 == null ? "" : reportIfNullAndContinue2;
            String reportIfNullAndContinue3 = protoValidationScope2.reportIfNullAndContinue(bar.accessibility_text, "accessibility_text", (String) null);
            List list = bar.bar_items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toBarItem(protoValidationScope2, (VerticalStackedBarGraph.Bar.BarItem) it.next(), patternRedaction));
            }
            return new VerticalStackedBarGraph.Bar(arrayList, required, str, str2, reportIfNullAndContinue3);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.Bar.class), patternRedaction, null);
        }
    }

    public static final VerticalStackedBarGraph.Bar.BarItem toBarItem(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph.Bar.BarItem barItem, PatternRedaction patternRedaction) {
        barItem.getClass();
        try {
            Color color = barItem.color;
            if (color == null) {
                throw new IllegalArgumentException("color");
            }
            Long l = barItem.value;
            if (l != null) {
                return new VerticalStackedBarGraph.Bar.BarItem(color, l.longValue());
            }
            throw new IllegalArgumentException("value");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.Bar.BarItem.class), patternRedaction, null);
        }
    }

    public static final LineGraph.Legend toLegend(ProtoValidationScope protoValidationScope, LineGraph.GraphLegend graphLegend, int i, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(graphLegend, patternRedaction, protoValidationScope);
            List list = graphLegend.items;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LineGraph.Legend.LegendItem legendItem = toLegendItem(protoValidationScope2, (LineGraph.GraphLegend.LegendItem) it.next(), patternRedaction);
                if (legendItem != null) {
                    arrayList.add(legendItem);
                }
            }
            if (arrayList.size() == i) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((LineGraph.Legend.LegendItem) it2.next()).lineIndex == null) {
                            protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("LineGraph", "One or more legend items missing line_index, disabling focus behavior", "legend.items.line_index", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
                            break;
                        }
                    }
                }
                return new LineGraph.Legend(arrayList);
            }
            protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("LineGraph", "Legend must have exactly " + i + " items to match number of lines, but found " + arrayList.size() + " valid items", "legend", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, graphLegend != null ? Reflection.factory.getOrCreateKotlinClass(LineGraph.GraphLegend.class) : null, patternRedaction, null);
        }
    }

    public static final LineGraph.Legend.LegendItem toLegendItem(ProtoValidationScope protoValidationScope, LineGraph.GraphLegend.LegendItem legendItem, PatternRedaction patternRedaction) {
        Color color;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(legendItem, patternRedaction, protoValidationScope);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(legendItem.label, AnnotatedPrivateKey.LABEL, (String) null);
            if (reportIfNullAndContinue != null && (color = (Color) protoValidationScope2.reportIfNullAndContinue("color", (String) null, legendItem.color)) != null) {
                return new LineGraph.Legend.LegendItem(reportIfNullAndContinue, protoValidationScope2.reportIfNullAndContinue(legendItem.summary, "summary", (String) null), color, legendItem.line_index);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, legendItem != null ? Reflection.factory.getOrCreateKotlinClass(LineGraph.GraphLegend.LegendItem.class) : null, patternRedaction, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LineGraph.Line toLine(ProtoValidationScope protoValidationScope, LineGraph.Line line, int i, PatternRedaction patternRedaction) {
        LineGraph.Line.Point point;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        HasObservability hasObservability = protoValidationScope.observability;
        line.getClass();
        List<LineGraph.Line.DataPoint> list = line.data_points;
        try {
            int size = list.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (LineGraph.Line.DataPoint dataPoint : list) {
                ArrayList validationFailures = getValidationFailures(dataPoint, i);
                if (!validationFailures.isEmpty()) {
                    Iterator it = validationFailures.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        Integer num = (Integer) linkedHashMap.get(str);
                        linkedHashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    }
                    i2++;
                }
                Long l = dataPoint.x_value;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = dataPoint.y_value;
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        String str2 = (i < 1 || (localizedString2 = dataPoint.label) == null) ? null : localizedString2.translated_value;
                        if (str2 == null) {
                            str2 = "";
                        }
                        point = new LineGraph.Line.Point(longValue, longValue2, str2, (i < 1 || (localizedString = dataPoint.description) == null) ? null : localizedString.translated_value, dataPoint.icon, dataPoint.icon_tint_color);
                        if (point == null) {
                            arrayList.add(point);
                        }
                    }
                }
                point = null;
                if (point == null) {
                }
            }
            if (i2 > 0) {
                String joinToString$default = CollectionsKt.joinToString$default(linkedHashMap.entrySet(), "\n  - ", null, null, 0, null, new MoneyTabUIKt$$ExternalSyntheticLambda13(16), 30);
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("Line", i2 + "/" + size + " data points failed validation for fields:\n  - " + joinToString$default, "data_points", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
            }
            if (arrayList.isEmpty()) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("Line", "Line must have at least one valid data point", "data_points", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            Color color = line.color;
            if (color != null) {
                return new LineGraph.Line(color, arrayList);
            }
            throw new IllegalArgumentException("color");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(LineGraph.Line.class), patternRedaction, null);
        }
    }

    public static final com.squareup.cash.moneybot.backend.api.model.charting.LineGraph toLineGraph(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.ui.graphs.LineGraph lineGraph, int i, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(lineGraph, patternRedaction, protoValidationScope);
            List list = lineGraph.lines;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    LineGraph.Line line = toLine(protoValidationScope2, (LineGraph.Line) it.next(), i, patternRedaction);
                    if (line != null) {
                        arrayList.add(line);
                    }
                } catch (MoneybotProtoParsingError e) {
                    protoValidationScope.getErrorReporter().report(e, protoValidationScope.getOneErrorPerAppSessionStrategy());
                    return null;
                }
            }
            if (arrayList.isEmpty()) {
                protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("LineGraph", "LineGraph must have at least one valid line", "lines", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
                return null;
            }
            List list2 = lineGraph.y_axis_labels;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Graph.AxisLabel axisLabel = toAxisLabel(protoValidationScope2, (AxisLabel) it2.next(), patternRedaction);
                if (axisLabel != null) {
                    arrayList2.add(axisLabel);
                }
            }
            LineGraph.GraphLegend graphLegend = lineGraph.legend;
            LineGraph.Legend legend = graphLegend != null ? toLegend(protoValidationScope2, graphLegend, arrayList.size(), patternRedaction) : null;
            if (arrayList2.isEmpty()) {
                protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("LineGraph", "LineGraph must have at least one valid y axis label", "y_axis_labels", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
                return null;
            }
            if (legend == null && arrayList.size() > 1) {
                protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("LineGraph", "LineGraph with multiple lines must have a valid legend", "legend", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
                return null;
            }
            List list3 = lineGraph.x_axis_labels;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Graph.AxisLabel axisLabel2 = toAxisLabel(protoValidationScope2, (AxisLabel) it3.next(), patternRedaction);
                if (axisLabel2 != null) {
                    arrayList3.add(axisLabel2);
                }
            }
            return new com.squareup.cash.moneybot.backend.api.model.charting.LineGraph(arrayList, arrayList2, arrayList3, legend);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.ui.graphs.LineGraph.class), patternRedaction, null);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m44toStringimpl(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OperatingMode(mode=", i, ')');
    }

    public static final com.squareup.cash.moneybot.backend.api.model.charting.VerticalStackedBarGraph toVerticalStackedBarGraph(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph verticalStackedBarGraph, int i, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(verticalStackedBarGraph, patternRedaction, protoValidationScope);
            List list = verticalStackedBarGraph.bars;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(toBar(protoValidationScope2, (VerticalStackedBarGraph.Bar) it.next(), i, patternRedaction));
                } catch (ProtoParsingError e) {
                    protoValidationScope.getErrorReporter().report(e, protoValidationScope.getOneErrorPerAppSessionStrategy());
                    return null;
                }
            }
            if (arrayList.isEmpty()) {
                protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("VerticalStackedBarGraph", "VerticalStackedBarGraph must have at least one bar", "bars", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
                return null;
            }
            List list2 = verticalStackedBarGraph.y_axis_labels;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Graph.AxisLabel axisLabel = toAxisLabel(protoValidationScope2, (AxisLabel) it2.next(), patternRedaction);
                if (axisLabel != null) {
                    arrayList2.add(axisLabel);
                }
            }
            if (!arrayList2.isEmpty()) {
                return new com.squareup.cash.moneybot.backend.api.model.charting.VerticalStackedBarGraph(arrayList, arrayList2);
            }
            protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("VerticalStackedBarGraph", "VerticalStackedBarGraph must have at least one valid y axis label", "y_axis_labels", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph.class), patternRedaction, null);
        }
    }
}
