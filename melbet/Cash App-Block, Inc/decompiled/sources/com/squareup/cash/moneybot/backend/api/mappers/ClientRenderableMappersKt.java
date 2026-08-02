package com.squareup.cash.moneybot.backend.api.mappers;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.compose.ui.draw.RotateKt;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivityData;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.charting.Graph;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderableTapAction;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.kgoose.api.v3.ActivityList;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.InsightChart;
import com.squareup.protos.cash.kgoose.api.v3.TapAction;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public abstract class ClientRenderableMappersKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightChart.Chart.ChartType.values().length];
            try {
                iArr[InsightChart.Chart.ChartType.CHART_TYPE_LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightChart.Chart.ChartType.CHART_TYPE_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Graph getGraph(ProtoValidationScope protoValidationScope, InsightChart.Chart chart, int i, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(chart, patternRedaction, protoValidationScope);
            InsightChart.Chart.ChartType chartType = chart.chart_type;
            int i2 = chartType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
            if (i2 == -1) {
                return null;
            }
            if (i2 == 1) {
                InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = chart.chart;
                InsightChart.Chart.AbstractC0070Chart.LineChart lineChart = abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.LineChart ? (InsightChart.Chart.AbstractC0070Chart.LineChart) abstractC0070Chart : null;
                LineGraph value = lineChart != null ? lineChart.getValue() : null;
                ProtoValidationScope.required(value, "chart line_chart");
                return CameraGraph$OperatingMode.toLineGraph(protoValidationScope2, value, i, patternRedaction);
            }
            if (i2 != 2) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("Chart", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "chart_type", null, patternRedaction.pattern, patternRedaction.template, 8), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            InsightChart.Chart.AbstractC0070Chart abstractC0070Chart2 = chart.chart;
            InsightChart.Chart.AbstractC0070Chart.BarChart barChart = abstractC0070Chart2 instanceof InsightChart.Chart.AbstractC0070Chart.BarChart ? (InsightChart.Chart.AbstractC0070Chart.BarChart) abstractC0070Chart2 : null;
            VerticalStackedBarGraph value2 = barChart != null ? barChart.getValue() : null;
            ProtoValidationScope.required(value2, "chart bar_chart");
            return CameraGraph$OperatingMode.toVerticalStackedBarGraph(protoValidationScope2, value2, i, patternRedaction);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, chart != null ? Reflection.factory.getOrCreateKotlinClass(InsightChart.Chart.class) : null, patternRedaction, null);
        }
    }

    public static final ButtonProminence.Id getProminenceId(squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence, boolean z) {
        buttonProminence.getClass();
        squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence2 = squareup.cash.ui.arcade.elements.ButtonProminence.PROMINENT;
        if (buttonProminence == buttonProminence2 && z) {
            ButtonProminence.Id id = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveProminent;
        }
        if (buttonProminence == buttonProminence2) {
            ButtonProminence.Id id2 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.prominent;
        }
        squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence3 = squareup.cash.ui.arcade.elements.ButtonProminence.SUBTLE;
        if (buttonProminence == buttonProminence3 && z) {
            ButtonProminence.Id id3 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveSubtle;
        }
        if (buttonProminence == buttonProminence3) {
            ButtonProminence.Id id4 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.subtle;
        }
        if (z) {
            ButtonProminence.Id id5 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveStandard;
        }
        ButtonProminence.Id id6 = ArcadeButtonProminences.standard;
        return ArcadeButtonProminences.standard;
    }

    public static final ClientRenderable.InsightChart.Chart toChart(ProtoValidationScope protoValidationScope, InsightChart.Chart chart, int i, PatternRedaction patternRedaction) {
        String reportIfNullAndContinue;
        String reportIfNullAndContinue2;
        Icon icon;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(chart, patternRedaction, protoValidationScope);
            String reportIfNullAndContinue3 = protoValidationScope2.reportIfNullAndContinue(chart.name, "name", (String) null);
            if (reportIfNullAndContinue3 != null && (reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(chart.title, "title", (String) null)) != null && (reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(chart.headline, "headline", (String) null)) != null) {
                LocalizedString localizedString = chart.description;
                String str = localizedString != null ? (String) protoValidationScope2.reportIfNullAndContinue("description translated_value", (String) null, localizedString.translated_value) : null;
                Icon icon2 = chart.description_icon;
                if (icon2 != null) {
                    icon = protoValidationScope2.reportIfNullAndContinue("description_icon arcade_id", (String) null, icon2.arcade_id) == null ? null : chart.description_icon;
                } else {
                    icon = null;
                }
                return new ClientRenderable.InsightChart.Chart(reportIfNullAndContinue3, reportIfNullAndContinue, reportIfNullAndContinue2, str, icon, getGraph(protoValidationScope2, chart, i, patternRedaction));
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, chart != null ? Reflection.factory.getOrCreateKotlinClass(InsightChart.Chart.class) : null, patternRedaction, null);
        }
    }

    public static final ClientRenderable toClientRenderable(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable, String str, String str2, String str3, Set set) {
        HasObservability hasObservability = protoValidationScope.observability;
        clientRenderable.getClass();
        set.getClass();
        PatternRedaction patternRedaction = new PatternRedaction(str, str3, false);
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(clientRenderable, patternRedaction, protoValidationScope);
            try {
                ClientRenderType clientRenderType = clientRenderable.type;
                TapAction tapAction = clientRenderable.tap_action;
                ClientRenderableTapAction clientRenderableTapAction = tapAction != null ? toClientRenderableTapAction(protoValidationScope2, tapAction, patternRedaction) : null;
                if (clientRenderType != null && set.contains(clientRenderType)) {
                    Integer num = clientRenderable.version;
                    return new ClientRenderable.PluginComponent(str, num != null ? num.intValue() : 0, clientRenderType, clientRenderable, clientRenderableTapAction, str2);
                }
                if (clientRenderType == ClientRenderType.CLIENT_RENDER_TYPE_ACTION_CARD) {
                    ClientRenderable.Component component = clientRenderable.component;
                    ClientRenderable.Component.ActionCard actionCard = component instanceof ClientRenderable.Component.ActionCard ? (ClientRenderable.Component.ActionCard) component : null;
                    ProtoValidationScope.required(actionCard != null ? actionCard.getValue() : null, "ClientRenderable action_card");
                    Integer num2 = clientRenderable.version;
                    return new ClientRenderable.PluginComponent(str, num2 != null ? num2.intValue() : 0, clientRenderType, clientRenderable, clientRenderableTapAction, str2);
                }
                if (clientRenderType == ClientRenderType.CLIENT_RENDER_TYPE_NAVIGATION_CARD) {
                    ClientRenderable.Component component2 = clientRenderable.component;
                    ClientRenderable.Component.NavigationCard navigationCard = component2 instanceof ClientRenderable.Component.NavigationCard ? (ClientRenderable.Component.NavigationCard) component2 : null;
                    ProtoValidationScope.required(navigationCard != null ? navigationCard.getValue() : null, "ClientRenderable navigation_card");
                    Integer num3 = clientRenderable.version;
                    return new ClientRenderable.PluginComponent(str, num3 != null ? num3.intValue() : 0, clientRenderType, clientRenderable, clientRenderableTapAction, str2);
                }
                if (clientRenderType == ClientRenderType.CLIENT_RENDER_TYPE_ACTIVITY_LIST) {
                    ClientRenderable.Component component3 = clientRenderable.component;
                    ClientRenderable.Component.ActivityList activityList = component3 instanceof ClientRenderable.Component.ActivityList ? (ClientRenderable.Component.ActivityList) component3 : null;
                    ActivityList value = activityList != null ? activityList.getValue() : null;
                    ProtoValidationScope.required(value, "ClientRenderable activity_list");
                    return toClientRenderable(protoValidationScope2, value, patternRedaction, str, clientRenderableTapAction);
                }
                if (clientRenderType == ClientRenderType.CLIENT_RENDER_TYPE_INSIGHT) {
                    ClientRenderable.Component component4 = clientRenderable.component;
                    ClientRenderable.Component.InsightChart insightChart = component4 instanceof ClientRenderable.Component.InsightChart ? (ClientRenderable.Component.InsightChart) component4 : null;
                    InsightChart value2 = insightChart != null ? insightChart.getValue() : null;
                    ProtoValidationScope.required(value2, "ClientRenderable insight_chart");
                    return toClientRenderable(protoValidationScope2, value2, patternRedaction, str, clientRenderableTapAction);
                }
                if (clientRenderType != ClientRenderType.CLIENT_RENDER_TYPE_CELL_LIST) {
                    hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("ClientRenderable", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "type", null, str, str3, 8), hasObservability.getOneErrorPerAppSessionStrategy());
                    return new ClientRenderable.Error(str);
                }
                ClientRenderable.Component component5 = clientRenderable.component;
                ClientRenderable.Component.CellList cellList = component5 instanceof ClientRenderable.Component.CellList ? (ClientRenderable.Component.CellList) component5 : null;
                ProtoValidationScope.required(cellList != null ? cellList.getValue() : null, "ClientRenderable cell_list");
                Integer num4 = clientRenderable.version;
                return new ClientRenderable.PluginComponent(str, num4 != null ? num4.intValue() : 0, clientRenderType, clientRenderable, clientRenderableTapAction, str2);
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(new MoneybotProtoParsingError("ClientRenderable", null, null, e, str, str3, 6), protoValidationScope.getOneErrorPerAppSessionStrategy());
                return new ClientRenderable.Error(str);
            }
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.ClientRenderable.class), patternRedaction, null);
        }
    }

    public static com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable toClientRenderable$default(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable, String str, String str2, Set set, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return toClientRenderable(protoValidationScope, clientRenderable, str, null, str2, set);
    }

    public static final ClientRenderableTapAction toClientRenderableTapAction(ProtoValidationScope protoValidationScope, TapAction tapAction, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            String str = tapAction.client_route_url;
            if (str == null) {
                try {
                    throw new IllegalArgumentException("client_route_url");
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(TapAction.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    str = null;
                }
            }
            if (str == null) {
                return null;
            }
            return new ClientRenderableTapAction(str);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, tapAction != null ? Reflection.factory.getOrCreateKotlinClass(TapAction.class) : null, patternRedaction, null);
        }
    }

    public static final ClientRenderable.ActivityList toClientRenderable(ProtoValidationScope protoValidationScope, ActivityList activityList, PatternRedaction patternRedaction, String str, ClientRenderableTapAction clientRenderableTapAction) {
        String str2;
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            Integer num = activityList.version;
            int intValue = num != null ? num.intValue() : 0;
            LocalizedString localizedString = activityList.title;
            if (localizedString != null) {
                String str3 = localizedString.translated_value;
                if (str3 == null) {
                    try {
                        throw new IllegalArgumentException("title translated_value");
                    } catch (Exception e) {
                        hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActivityList.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                        str3 = null;
                    }
                }
                str2 = str3;
            } else {
                str2 = null;
            }
            List<ActivityRow> list = activityList.rows;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ActivityData activityData = ActivitiesManager.ActivityPage.Companion.toActivityData((ActivityRow) it.next());
                if (activityData != null) {
                    arrayList.add(activityData);
                }
            }
            Boolean bool = activityList.has_more;
            return new ClientRenderable.ActivityList(str, intValue, str2, arrayList, bool != null ? bool.booleanValue() : false, clientRenderableTapAction);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(ActivityList.class), patternRedaction, null);
        }
    }

    public static final ClientRenderable.InsightChart toClientRenderable(ProtoValidationScope protoValidationScope, InsightChart insightChart, PatternRedaction patternRedaction, String str, ClientRenderableTapAction clientRenderableTapAction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(insightChart, patternRedaction, protoValidationScope);
            Integer num = insightChart.version;
            int intValue = num != null ? num.intValue() : 0;
            List<InsightChart.Chart> list = insightChart.charts;
            ArrayList arrayList = new ArrayList();
            for (InsightChart.Chart chart : list) {
                Integer num2 = insightChart.version;
                ClientRenderable.InsightChart.Chart chart2 = toChart(protoValidationScope2, chart, num2 != null ? num2.intValue() : 0, patternRedaction);
                if (chart2 != null) {
                    arrayList.add(chart2);
                }
            }
            Integer num3 = (Integer) protoValidationScope2.reportIfNullAndContinue("default_chart", (String) null, insightChart.default_chart);
            return new ClientRenderable.InsightChart(str, intValue, arrayList, num3 != null ? num3.intValue() : 0, clientRenderableTapAction);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(InsightChart.class), patternRedaction, null);
        }
    }
}
