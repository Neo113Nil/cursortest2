package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.RotateKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.charting.LineGraph;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlottedCard;
import com.squareup.cash.moneybot.components.plugins.SlottedCardPlugin;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.CompositionChart;
import com.squareup.protos.cash.kgoose.api.v3.ItemizedTable;
import com.squareup.protos.cash.kgoose.api.v3.LineGraph;
import com.squareup.protos.cash.kgoose.api.v3.Metric;
import com.squareup.protos.cash.kgoose.api.v3.ProgressRing;
import com.squareup.protos.cash.kgoose.api.v3.SlotContent;
import com.squareup.protos.cash.kgoose.api.v3.SlotContentType;
import com.squareup.protos.cash.kgoose.api.v3.StackedImage;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public abstract class SlottedCardMappersKt {
    public static final Regex AMOUNT_TEXT_NUMBERS_REGEX = new Regex("-?\\d[\\d,]*(\\.\\d+)?");

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SlotContentType.values().length];
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_LINE_GRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_COMPOSITION_CHART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_ITEMIZED_TABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_STACKED_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SlotContentType.SLOT_CONTENT_TYPE_PROGRESS_RING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Metric.TrendDirection.values().length];
            try {
                iArr2[Metric.TrendDirection.TREND_DIRECTION_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        toCompositionChartSlotContent$lambda$0$reportCompositionChartProtoError(r1, r9, "Segment.fraction", "CompositionChart segment fraction must be between 0 and 1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SlotContent.CompositionChart toCompositionChartSlotContent(ProtoValidationScope protoValidationScope, CompositionChart compositionChart, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(compositionChart, patternRedaction, protoValidationScope);
            List<CompositionChart.Segment> list = compositionChart.segments;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    CompositionChart.Segment segment = (CompositionChart.Segment) it.next();
                    Float f = (Float) protoValidationScope2.reportIfNullAndContinue("composition chart segment fraction", (String) null, segment.fraction);
                    if (f == null) {
                        break;
                    }
                    float floatValue = f.floatValue();
                    if (RecyclerView.DECELERATION_RATE > floatValue || floatValue > 1.0f) {
                        break;
                    }
                    arrayList.add(new SlotContent.CompositionChart.Segment(floatValue, segment.color));
                } else {
                    double d = 0.0d;
                    while (arrayList.iterator().hasNext()) {
                        d += ((SlotContent.CompositionChart.Segment) r7.next()).fraction;
                    }
                    if (0.99d > d || d > 1.01d) {
                        toCompositionChartSlotContent$lambda$0$reportCompositionChartProtoError(protoValidationScope2, patternRedaction, "segments", "Segment fractions sum should be 1. Actual sum: " + d);
                        return null;
                    }
                    int size = arrayList.size();
                    if (2 > size || size >= 6) {
                        toCompositionChartSlotContent$lambda$0$reportCompositionChartProtoError(protoValidationScope2, patternRedaction, "segments", "Segment size must be between 2 and 5. Actual valid segments size: " + arrayList.size());
                    }
                    if ((!arrayList.isEmpty() ? arrayList : null) != null) {
                        return new SlotContent.CompositionChart(arrayList);
                    }
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CompositionChart.class), patternRedaction, null);
        }
    }

    public static final void toCompositionChartSlotContent$lambda$0$reportCompositionChartProtoError(ProtoValidationScope protoValidationScope, PatternRedaction patternRedaction, String str, String str2) {
        HasObservability hasObservability = protoValidationScope.observability;
        hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("CompositionChart", str2, str, patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
    }

    public static final SlotContent.Table toItemizedTableSlotContent(ProtoValidationScope protoValidationScope, ItemizedTable itemizedTable, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(itemizedTable, patternRedaction, protoValidationScope);
            List<ItemizedTable.Row> list = itemizedTable.rows;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SlotContent.Table.Row slotContentRow = toSlotContentRow(protoValidationScope2, (ItemizedTable.Row) it.next(), patternRedaction);
                if (slotContentRow != null) {
                    arrayList.add(slotContentRow);
                }
            }
            if (!arrayList.isEmpty()) {
                return new SlotContent.Table(arrayList);
            }
            protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("ItemizedTable", "ItemizedTable must have at least one valid row", "rows", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ItemizedTable.class), patternRedaction, null);
        }
    }

    public static final SlotContent.LineGraph toLineGraphSlotContent(ProtoValidationScope protoValidationScope, LineGraph lineGraph, String str, PatternRedaction patternRedaction) {
        LineGraph.Line line;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(lineGraph, patternRedaction, protoValidationScope);
            LineGraph.Line line2 = (LineGraph.Line) protoValidationScope2.reportIfNullAndContinue("line_graph line", (String) null, lineGraph.line);
            if (line2 == null || (line = CameraGraph$OperatingMode.toLine(protoValidationScope2, line2, 0, patternRedaction)) == null) {
                return null;
            }
            Color color = line.color;
            ArrayList<LineGraph.Line.Point> arrayList = line.points;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (LineGraph.Line.Point point : arrayList) {
                arrayList2.add(new SlotContent.LineGraph.Point(point.xValue, point.yValue));
            }
            return new SlotContent.LineGraph(CollectionsKt__CollectionsJVMKt.listOf(new SlotContent.LineGraph.Line(color, arrayList2)), str);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.LineGraph.class), patternRedaction, null);
        }
    }

    public static final SlotContent.Metric toMetricSlotContent(ProtoValidationScope protoValidationScope, Metric metric, PatternRedaction patternRedaction, LocalizedMoneyFormatter.Factory factory) {
        HasObservability hasObservability = protoValidationScope.observability;
        Metric.TrendDirection trendDirection = metric.trend_direction;
        if (trendDirection == null || trendDirection == Metric.TrendDirection.TREND_DIRECTION_UNSPECIFIED) {
            trendDirection = null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        try {
            Metric.Value value = metric.value;
            if (value == null) {
                try {
                    throw new IllegalArgumentException("metric value");
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Metric.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    value = null;
                }
            }
            if (value == null) {
                return null;
            }
            if (value instanceof Metric.Value.Money) {
                return toMoneyMetricSlotContent((Metric.Value.Money) value, trendDirection, decimalFormat, factory);
            }
            if (value instanceof Metric.Value.Percentage) {
                return toNumericMetricSlotContent(((Metric.Value.Percentage) value).getValue(), trendDirection, decimalFormat, "%");
            }
            if (value instanceof Metric.Value.Number) {
                return toNumericMetricSlotContent(((Metric.Value.Number) value).getValue(), trendDirection, decimalFormat, null);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(Metric.class), patternRedaction, null);
        }
    }

    public static final SlotContent.Metric toMoneyMetricSlotContent(Metric.Value.Money money, Metric.TrendDirection trendDirection, DecimalFormat decimalFormat, LocalizedMoneyFormatter.Factory factory) {
        Double valueOf = Double.valueOf(0.0d);
        RoundingMode roundingMode = RoundingMode.DOWN;
        String format2 = factory.createAbbreviatedUpToOneFractionDigit().format(money.getValue());
        Long l = money.getValue().amount;
        l.getClass();
        boolean z = l.longValue() < 0;
        MatcherMatchResult find = AMOUNT_TEXT_NUMBERS_REGEX.find(format2);
        if (find == null) {
            return new SlotContent.Metric(null, format2, null, 0.0d, trendDirection, format2, 0.0d);
        }
        String value = find.getValue();
        String substring = format2.substring(0, find.getRange().first);
        if (substring.length() <= 0) {
            substring = null;
        }
        String substring2 = format2.substring(find.getRange().last + 1);
        String str = substring2.length() > 0 ? substring2 : null;
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(StringsKt__StringsJVMKt.replace$default(value, ",", ""));
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        if (z) {
            doubleValue = -doubleValue;
        }
        double d = str != null ? 0.5d : 5.0d;
        Double valueOf2 = Double.valueOf((trendDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$1[trendDirection.ordinal()]) == 1 ? d + doubleValue : doubleValue - d);
        Double d2 = doubleValue >= 0.0d ? valueOf : null;
        if (doubleValue >= 0.0d) {
            valueOf = null;
        }
        double doubleValue2 = ((Number) RangesKt___RangesKt.coerceIn(valueOf2, d2, valueOf)).doubleValue();
        String format3 = z ? decimalFormat.format(Math.abs(doubleValue2)) : decimalFormat.format(doubleValue2);
        double d3 = doubleValue;
        format3.getClass();
        return new SlotContent.Metric(substring, value, str, d3, trendDirection, format3, doubleValue2);
    }

    public static final SlotContent.Metric toNumericMetricSlotContent(double d, Metric.TrendDirection trendDirection, DecimalFormat decimalFormat, String str) {
        Double valueOf = Double.valueOf(0.0d);
        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(decimalFormat.format(d), str == null ? "" : str);
        MatcherMatchResult find = AMOUNT_TEXT_NUMBERS_REGEX.find(m$1);
        if (find == null) {
            return new SlotContent.Metric(null, m$1, null, 0.0d, trendDirection, m$1, 0.0d);
        }
        String value = find.getValue();
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(StringsKt__StringsJVMKt.replace$default(value, ",", ""));
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        String substring = m$1.substring(find.getRange().last + 1);
        String str2 = substring.length() > 0 ? substring : null;
        Double valueOf2 = Double.valueOf((trendDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$1[trendDirection.ordinal()]) == 1 ? 5.0d + doubleValue : doubleValue - 5.0d);
        Double d2 = doubleValue >= 0.0d ? valueOf : null;
        if (doubleValue >= 0.0d) {
            valueOf = null;
        }
        double doubleValue2 = ((Number) RangesKt___RangesKt.coerceIn(valueOf2, d2, valueOf)).doubleValue();
        String format2 = decimalFormat.format(doubleValue2);
        format2.getClass();
        return new SlotContent.Metric(null, value, str2, doubleValue, trendDirection, format2, doubleValue2);
    }

    public static final SlotContent.ProgressRing toProgressRingSlotContent(ProtoValidationScope protoValidationScope, ProgressRing progressRing, PatternRedaction patternRedaction) {
        Object image;
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(progressRing, patternRedaction, protoValidationScope);
            Double d = (Double) protoValidationScope2.reportIfNullAndContinue("progress ring fraction", (String) null, progressRing.fraction);
            if (d != null) {
                double doubleValue = d.doubleValue();
                if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                    List<ProgressRing.ProgressRingContent> list = progressRing.contents;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ProgressRing.ProgressRingContent.Content content = (ProgressRing.ProgressRingContent.Content) protoValidationScope2.reportIfNullAndContinue("progress ring content", (String) null, ((ProgressRing.ProgressRingContent) it.next()).content);
                        if (content != null) {
                            if (content instanceof ProgressRing.ProgressRingContent.Content.Text) {
                                String str = (String) protoValidationScope2.reportIfNullAndContinue("progress ring content text", (String) null, ((ProgressRing.ProgressRingContent.Content.Text) content).getValue().text);
                                if (str != null) {
                                    image = new SlotContent.ProgressRing.Content.Text(((ProgressRing.ProgressRingContent.Content.Text) content).getValue().background_color, str);
                                }
                            } else if (content instanceof ProgressRing.ProgressRingContent.Content.Avatar) {
                                image = new SlotContent.ProgressRing.Content.Avatar(((ProgressRing.ProgressRingContent.Content.Avatar) content).getValue());
                            } else {
                                if (!(content instanceof ProgressRing.ProgressRingContent.Content.Image)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                image = new SlotContent.ProgressRing.Content.Image(((ProgressRing.ProgressRingContent.Content.Image) content).getValue());
                            }
                            arrayList.add(image);
                        }
                    }
                    return new SlotContent.ProgressRing((float) doubleValue, progressRing.color, arrayList);
                }
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("ProgressRing", "ProgressRing fraction must be between 0 and 1", "fraction", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ProgressRing.class), patternRedaction, null);
        }
    }

    public static final SlotContent toSlotContent(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.kgoose.api.v3.SlotContent slotContent, PatternRedaction patternRedaction, LocalizedMoneyFormatter.Factory factory) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(slotContent, patternRedaction, protoValidationScope);
            SlotContentType slotContentType = slotContent.type;
            switch (slotContentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[slotContentType.ordinal()]) {
                case 1:
                    SlotContent.Component component = slotContent.component;
                    SlotContent.Component.LineGraph lineGraph = component instanceof SlotContent.Component.LineGraph ? (SlotContent.Component.LineGraph) component : null;
                    com.squareup.protos.cash.kgoose.api.v3.LineGraph lineGraph2 = (com.squareup.protos.cash.kgoose.api.v3.LineGraph) protoValidationScope2.reportIfNullAndContinue("line_graph", (String) null, lineGraph != null ? lineGraph.getValue() : null);
                    if (lineGraph2 != null) {
                        LocalizedString localizedString = slotContent.accessibility_label;
                        return toLineGraphSlotContent(protoValidationScope2, lineGraph2, localizedString != null ? localizedString.translated_value : null, patternRedaction);
                    }
                    return null;
                case 2:
                    SlotContent.Component component2 = slotContent.component;
                    SlotContent.Component.Metric metric = component2 instanceof SlotContent.Component.Metric ? (SlotContent.Component.Metric) component2 : null;
                    Metric metric2 = (Metric) protoValidationScope2.reportIfNullAndContinue("metric", (String) null, metric != null ? metric.getValue() : null);
                    if (metric2 != null) {
                        return toMetricSlotContent(protoValidationScope2, metric2, patternRedaction, factory);
                    }
                    return null;
                case 3:
                    SlotContent.Component component3 = slotContent.component;
                    SlotContent.Component.CompositionChart compositionChart = component3 instanceof SlotContent.Component.CompositionChart ? (SlotContent.Component.CompositionChart) component3 : null;
                    CompositionChart compositionChart2 = (CompositionChart) protoValidationScope2.reportIfNullAndContinue("composition_chart", (String) null, compositionChart != null ? compositionChart.getValue() : null);
                    if (compositionChart2 != null) {
                        return toCompositionChartSlotContent(protoValidationScope2, compositionChart2, patternRedaction);
                    }
                    return null;
                case 4:
                    SlotContent.Component component4 = slotContent.component;
                    SlotContent.Component.ItemizedTable itemizedTable = component4 instanceof SlotContent.Component.ItemizedTable ? (SlotContent.Component.ItemizedTable) component4 : null;
                    ItemizedTable itemizedTable2 = (ItemizedTable) protoValidationScope2.reportIfNullAndContinue("itemized_table", (String) null, itemizedTable != null ? itemizedTable.getValue() : null);
                    if (itemizedTable2 != null) {
                        return toItemizedTableSlotContent(protoValidationScope2, itemizedTable2, patternRedaction);
                    }
                    return null;
                case 5:
                    SlotContent.Component component5 = slotContent.component;
                    SlotContent.Component.StackedImage stackedImage = component5 instanceof SlotContent.Component.StackedImage ? (SlotContent.Component.StackedImage) component5 : null;
                    StackedImage stackedImage2 = (StackedImage) protoValidationScope2.reportIfNullAndContinue("stacked_image", (String) null, stackedImage != null ? stackedImage.getValue() : null);
                    if (stackedImage2 != null) {
                        LocalizedString localizedString2 = slotContent.accessibility_label;
                        return toStackedImageSlotContent(protoValidationScope2, stackedImage2, localizedString2 != null ? localizedString2.translated_value : null, patternRedaction);
                    }
                    return null;
                case 6:
                    SlotContent.Component component6 = slotContent.component;
                    SlotContent.Component.ProgressRing progressRing = component6 instanceof SlotContent.Component.ProgressRing ? (SlotContent.Component.ProgressRing) component6 : null;
                    ProgressRing progressRing2 = (ProgressRing) protoValidationScope2.reportIfNullAndContinue("progress_ring", (String) null, progressRing != null ? progressRing.getValue() : null);
                    if (progressRing2 != null) {
                        return toProgressRingSlotContent(protoValidationScope2, progressRing2, patternRedaction);
                    }
                    return null;
                default:
                    return null;
            }
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, slotContent != null ? Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.SlotContent.class) : null, patternRedaction, null);
        }
    }

    public static final SlotContent.Table.Row toSlotContentRow(ProtoValidationScope protoValidationScope, ItemizedTable.Row row, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(row, patternRedaction, protoValidationScope);
            ItemizedTable.Row.Icon icon = row.icon;
            ItemizedTable.Row.Icon.Avatar avatar = icon instanceof ItemizedTable.Row.Icon.Avatar ? (ItemizedTable.Row.Icon.Avatar) icon : null;
            UiAvatar uiAvatar = (UiAvatar) protoValidationScope2.reportIfNullAndContinue("row icon avatar", (String) null, avatar != null ? avatar.getValue() : null);
            if (uiAvatar != null) {
                LocalizedString localizedString = row.title;
                String str = (String) protoValidationScope2.reportIfNullAndContinue("row title translated_value", (String) null, localizedString != null ? localizedString.translated_value : null);
                if (str != null) {
                    LocalizedString localizedString2 = row.label;
                    String str2 = (String) protoValidationScope2.reportIfNullAndContinue("row label translated_value", (String) null, localizedString2 != null ? localizedString2.translated_value : null);
                    if (str2 != null) {
                        return new SlotContent.Table.Row(uiAvatar, str, str2);
                    }
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, row != null ? Reflection.factory.getOrCreateKotlinClass(ItemizedTable.Row.class) : null, patternRedaction, null);
        }
    }

    public static SlottedCard toSlottedCard$default(SlottedCardPlugin slottedCardPlugin, com.squareup.protos.cash.kgoose.api.v3.SlottedCard slottedCard, String str, LocalizedMoneyFormatter.Factory factory, String str2) {
        String str3;
        String str4;
        String str5;
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(slottedCard, patternRedaction, slottedCardPlugin);
            LocalizedString localizedString = slottedCard.label;
            String str6 = (String) protoValidationScope.reportIfNullAndContinue("label translated_value", (String) null, localizedString != null ? localizedString.translated_value : null);
            String str7 = str6 == null ? "" : str6;
            String required = ProtoValidationScope.required(slottedCard.text, "text");
            com.squareup.protos.cash.kgoose.api.v3.SlotContent slotContent = slottedCard.slot;
            com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent slotContent2 = slotContent != null ? toSlotContent(protoValidationScope, slotContent, patternRedaction, factory) : null;
            LocalizedString localizedString2 = slottedCard.subtext;
            String str8 = (String) protoValidationScope.reportIfNullAndContinue("subtext translated_value", (String) null, localizedString2 != null ? localizedString2.translated_value : null);
            if (str8 == null) {
                str3 = "";
                str5 = str2;
                str4 = str;
            } else {
                str3 = str8;
                str4 = str;
                str5 = str2;
            }
            return new SlottedCard(str4, str7, required, slotContent2, str3, str5);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.SlottedCard.class), patternRedaction, null);
        }
    }

    public static final SlotContent.StackedImage.Content toStackedImageContent(ProtoValidationScope protoValidationScope, StackedImage.StackedImageContent stackedImageContent, PatternRedaction patternRedaction) {
        String str;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(stackedImageContent, patternRedaction, protoValidationScope);
            StackedImage.StackedImageContent.Content content = stackedImageContent.content;
            if (content instanceof StackedImage.StackedImageContent.Content.Avatar) {
                UiAvatar uiAvatar = (UiAvatar) protoValidationScope2.reportIfNullAndContinue("stacked_image content avatar", (String) null, ((StackedImage.StackedImageContent.Content.Avatar) content).getValue());
                if (uiAvatar != null) {
                    return new SlotContent.StackedImage.Content.Avatar(uiAvatar);
                }
            } else if (content instanceof StackedImage.StackedImageContent.Content.Image) {
                Image image = (Image) protoValidationScope2.reportIfNullAndContinue("stacked_image content image", (String) null, ((StackedImage.StackedImageContent.Content.Image) content).getValue());
                if (image != null) {
                    return new SlotContent.StackedImage.Content.Image(image);
                }
            } else if (content instanceof StackedImage.StackedImageContent.Content.Text) {
                StackedImage.StackedImageContent.TextContent textContent = (StackedImage.StackedImageContent.TextContent) protoValidationScope2.reportIfNullAndContinue("stacked_image content text", (String) null, ((StackedImage.StackedImageContent.Content.Text) content).getValue());
                if (textContent != null && (str = (String) protoValidationScope2.reportIfNullAndContinue("stacked_image content text text", (String) null, textContent.text)) != null) {
                    return new SlotContent.StackedImage.Content.Text(textContent.background_color, str);
                }
            } else if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, stackedImageContent != null ? Reflection.factory.getOrCreateKotlinClass(StackedImage.StackedImageContent.class) : null, patternRedaction, null);
        }
    }

    public static final SlotContent.StackedImage toStackedImageSlotContent(ProtoValidationScope protoValidationScope, StackedImage stackedImage, String str, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(stackedImage, patternRedaction, protoValidationScope);
            if (stackedImage.contents.isEmpty()) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("StackedImage", "StackedImage must have at least one content item", "contents", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            List<StackedImage.StackedImageContent> list = stackedImage.contents;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SlotContent.StackedImage.Content stackedImageContent = toStackedImageContent(protoValidationScope2, (StackedImage.StackedImageContent) it.next(), patternRedaction);
                if (stackedImageContent != null) {
                    arrayList.add(stackedImageContent);
                }
            }
            if (arrayList.size() >= stackedImage.contents.size()) {
                return new SlotContent.StackedImage(str, arrayList);
            }
            protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("StackedImage", "StackedImage must have only valid content items", "contents", patternRedaction.pattern, patternRedaction.template), protoValidationScope.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(StackedImage.class), patternRedaction, null);
        }
    }
}
