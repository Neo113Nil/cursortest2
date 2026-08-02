package com.squareup.cash.moneybot.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import coil3.network.NetworkFetcher$doFetch$2;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.backend.loader.SingleActivityCache$InMemory;
import com.squareup.cash.activity.backend.loader.SingleActivityManager;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.charting.Graph;
import com.squareup.cash.moneybot.backend.api.model.charting.LineGraph;
import com.squareup.cash.moneybot.backend.api.model.charting.VerticalStackedBarGraph;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderableTapAction;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class MoneybotChatContentFactory {
    public final ActivityItemPresenter.Factory activityItemPresenterFactory;
    public final ActivityToken activityToken;
    public final ChatManager chatManager;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final ErrorReporter errorReporter;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MoneybotChatPresenter$$ExternalSyntheticLambda0 onMessage;
    public final ClientRenderablePluginRegistry pluginRegistry;
    public final RealSingleActivityManager$Factory$Impl singleActivityManagerFactory;
    public final AndroidStringManager stringManager;
    public int thinkingTextIndex;

    public final class RowResolution {
        public final boolean isTerminal;
        public final ChatCardViewModel.ActivityList.Row row;

        public RowResolution(ChatCardViewModel.ActivityList.Row row, boolean z) {
            this.row = row;
            this.isTerminal = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowResolution)) {
                return false;
            }
            RowResolution rowResolution = (RowResolution) obj;
            return this.row.equals(rowResolution.row) && this.isTerminal == rowResolution.isTerminal;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isTerminal) + (this.row.hashCode() * 31);
        }

        public final String toString() {
            return "RowResolution(row=" + this.row + ", isTerminal=" + this.isTerminal + ")";
        }
    }

    public MoneybotChatContentFactory(ErrorReporter errorReporter, AndroidStringManager androidStringManager, ActivityItemPresenter.Factory factory, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, ClientRenderablePluginRegistry clientRenderablePluginRegistry, MoneybotFlagsHelper moneybotFlagsHelper, RealSingleActivityManager$Factory$Impl realSingleActivityManager$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, BetterNavigator.ScreenNavigator screenNavigator, ChatManager chatManager, MoneybotChatPresenter$$ExternalSyntheticLambda0 moneybotChatPresenter$$ExternalSyntheticLambda0) {
        this.errorReporter = errorReporter;
        this.stringManager = androidStringManager;
        this.activityItemPresenterFactory = factory;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.pluginRegistry = clientRenderablePluginRegistry;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.singleActivityManagerFactory = realSingleActivityManager$Factory$Impl;
        this.navigator = screenNavigator;
        this.chatManager = chatManager;
        this.onMessage = moneybotChatPresenter$$ExternalSyntheticLambda0;
        this.activityToken = RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN);
    }

    public static final void chatToMessageViewModels$closeGroup(boolean z, Ref$ObjectRef ref$ObjectRef, ArrayList arrayList, ArrayList arrayList2, Map map) {
        String str;
        if (z && (str = (String) ref$ObjectRef.element) != null) {
            String joinToString$default = CollectionsKt.joinToString$default(arrayList2, "\n\n", null, null, 0, null, null, 62);
            if (joinToString$default.length() == 0) {
                joinToString$default = null;
            }
            MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState = (MessageViewModel.MoneybotMessageViewModel.ThumbState) map.get(str);
            if (thumbState == null) {
                thumbState = MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
            }
            arrayList.add(new MessageViewModel.QuickActionsBarViewModel(str, joinToString$default, thumbState));
            ref$ObjectRef.element = null;
            arrayList2.clear();
        }
    }

    public final ActivityItemPresenter rememberActivityItemPresenter(ActivityItem activityItem, int i, String str, GapComposer gapComposer) {
        boolean changed = gapComposer.changed(activityItem);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.activityItemPresenterFactory.create(this.navigator, activityItem, new ActivityItemPresentationContext(ActivityItemOrigin.SEARCH_RESULTS, i, new MoneybotChatScreen(str != null ? new ChatKickoffParams(str, null, 11) : null, (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 62), ActivityScope.MONEYBOT, this.activityToken, 1), this.defaultActivityItemEventHandlerFactory, new MoneyTabUIKt$$ExternalSyntheticLambda13(19));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ActivityItemPresenter) rememberedValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityPageHandler, java.util.Locale, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final ChatCardViewModel.ActivityList toActivityList(ClientRenderable.ActivityList activityList, String str, GapComposer gapComposer, int i) {
        boolean z;
        ArrayList arrayList;
        Object obj;
        RowResolution rowResolution;
        boolean z2;
        gapComposer.startReplaceGroup(609033465);
        List list = activityList.rows;
        ?? r9 = 0;
        if (list.isEmpty()) {
            gapComposer.end(false);
            return null;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boolean.valueOf(this.moneybotFlagsHelper.activityListLiveRowsEnabled());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ChatCardViewModel.ActivityList.Row.Loading loading = ChatCardViewModel.ActivityList.Row.Loading.INSTANCE;
            if (!hasNext) {
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!((RowResolution) it2.next()).isTerminal) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                String str2 = activityList.title;
                if (z) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((RowResolution) it3.next()).row);
                    }
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(loading);
                    }
                }
                ChatCardViewModel.ActivityList activityList2 = new ChatCardViewModel.ActivityList(str2, arrayList, activityList.hasMore);
                gapComposer.end(false);
                return activityList2;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                Throwable th = r9;
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw th;
            }
            ActivityItem activityItem = (ActivityItem) next;
            if (!booleanValue || activityItem.getActivityItemGlobalId().activity_id == null) {
                obj = r9;
                gapComposer.startReplaceGroup(-1638840763);
                rowResolution = new RowResolution(new ChatCardViewModel.ActivityList.Row.Loaded(rememberActivityItemPresenter(activityItem, i2, str, gapComposer).models(gapComposer)), true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1638921394);
                boolean changed = gapComposer.changed(activityItem.getActivityItemGlobalId());
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = this.singleActivityManagerFactory.create(new ActivitiesManager.ActivityContext(this.activityToken, ActivityScope.MONEYBOT, (ActivitiesManager.ActivityPageHandler) r9, 12), activityItem.getActivityItemGlobalId(), new SingleActivityCache$InMemory(), r9);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SingleActivityManager singleActivityManager = (SingleActivityManager) rememberedValue2;
                boolean changed2 = gapComposer.changed(singleActivityManager);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    RealSingleActivityManager realSingleActivityManager = (RealSingleActivityManager) singleActivityManager;
                    realSingleActivityManager.getClass();
                    rememberedValue3 = FlowKt.callbackFlow(new NetworkFetcher$doFetch$2(realSingleActivityManager, r9, 19));
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                ActivityItem activityItem2 = activityItem;
                obj = r9;
                int i4 = i2;
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, new SingleActivity(LoadingState.LOADING), null, gapComposer, 0, 2);
                int ordinal = ((SingleActivity) collectAsState.getValue()).loadingState.ordinal();
                if (ordinal == 0) {
                    z2 = false;
                    gapComposer.startReplaceGroup(1100946391);
                    gapComposer.end(false);
                    rowResolution = new RowResolution(loading, false);
                } else if (ordinal == 1) {
                    gapComposer.startReplaceGroup(1100955499);
                    ActivityItem activityItem3 = ((SingleActivity) collectAsState.getValue()).activityItem;
                    if (activityItem3 != null) {
                        activityItem2 = activityItem3;
                    }
                    rowResolution = new RowResolution(new ChatCardViewModel.ActivityList.Row.Loaded(rememberActivityItemPresenter(activityItem2, i4, str, gapComposer).models(gapComposer)), true);
                    z2 = false;
                    gapComposer.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1100945027, false);
                    }
                    gapComposer.startReplaceGroup(1100949339);
                    RowResolution rowResolution2 = new RowResolution(new ChatCardViewModel.ActivityList.Row.Loaded(rememberActivityItemPresenter(activityItem2, i4, str, gapComposer).models(gapComposer)), true);
                    gapComposer.end(false);
                    rowResolution = rowResolution2;
                    z2 = false;
                }
                gapComposer.end(z2);
            }
            arrayList2.add(rowResolution);
            r9 = obj;
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final ChatCardViewModel.InsightCard toInsightChart(ClientRenderable.InsightChart insightChart) {
        LineGraph.Legend legend;
        boolean z;
        ?? r3;
        boolean z2;
        Iterator it;
        Object noChart;
        Long valueOf;
        ChatCardViewModel.InsightCard.Chart.Legend legend2;
        int i = insightChart.defaultChart;
        ArrayList arrayList = insightChart.charts;
        if (i < 0 || i > arrayList.size() - 1) {
            this.errorReporter.report(new GeneralMoneybotError("Invalid defaultChart index for InsightChart"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            loop13: while (it2.hasNext()) {
                Graph graph = ((ClientRenderable.InsightChart.Chart) it2.next()).graph;
                LineGraph lineGraph = graph instanceof LineGraph ? (LineGraph) graph : null;
                if (lineGraph != null && (legend = lineGraph.legend) != null) {
                    ArrayList arrayList2 = legend.items;
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            if (((LineGraph.Legend.LegendItem) it3.next()).lineIndex == null) {
                                z = true;
                                break loop13;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        z = false;
        int i2 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ClientRenderable.InsightChart.Chart chart = (ClientRenderable.InsightChart.Chart) it4.next();
            Graph graph2 = chart.graph;
            String str = chart.headline;
            String str2 = chart.title;
            if (graph2 instanceof LineGraph) {
                LineGraph lineGraph2 = (LineGraph) graph2;
                String str3 = chart.description;
                Icon icon = chart.descriptionIcon;
                ArrayList arrayList4 = lineGraph2.lines;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, i2));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    LineGraph.Line line = (LineGraph.Line) it5.next();
                    ArrayList arrayList6 = line.points;
                    Iterator it6 = it5;
                    boolean z3 = z;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, i2));
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        LineGraph.Line.Point point = (LineGraph.Line.Point) it7.next();
                        arrayList7.add(new LineChartViewModel.Line.Point(point.xValue, point.yValue, point.label, point.description, point.icon, point.iconTintColor, 4));
                        it7 = it7;
                        it4 = it4;
                    }
                    arrayList5.add(new LineChartViewModel.Line(arrayList7, line.color));
                    it5 = it6;
                    z = z3;
                    i2 = 10;
                }
                z2 = z;
                it = it4;
                ArrayList arrayList8 = lineGraph2.xAxisLabels;
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
                Iterator it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(new LineChartViewModel.AxisLabel(((Graph.AxisLabel) it8.next()).text, r6.value));
                    str2 = str2;
                }
                String str4 = str2;
                LineChartViewModel.AxisConfig axisConfig = new LineChartViewModel.AxisConfig(arrayList9);
                ArrayList arrayList10 = lineGraph2.yAxisLabels;
                ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList10, 10));
                Iterator it9 = arrayList10.iterator();
                while (it9.hasNext()) {
                    arrayList11.add(new LineChartViewModel.AxisLabel(((Graph.AxisLabel) it9.next()).text, r8.value));
                    str = str;
                }
                String str5 = str;
                LineChartViewModel lineChartViewModel = new LineChartViewModel(arrayList5, axisConfig, new LineChartViewModel.AxisConfig(arrayList11));
                LineGraph.Legend legend3 = lineGraph2.legend;
                if (legend3 != null) {
                    ArrayList<LineGraph.Legend.LegendItem> arrayList12 = legend3.items;
                    ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList12, 10));
                    for (LineGraph.Legend.LegendItem legendItem : arrayList12) {
                        arrayList13.add(new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem(legendItem.label, legendItem.summary, legendItem.color, legendItem.lineIndex));
                    }
                    legend2 = new ChatCardViewModel.InsightCard.Chart.Legend(arrayList13);
                } else {
                    legend2 = null;
                }
                noChart = new ChatCardViewModel.InsightCard.Chart.LineChart(str4, str5, str3, icon, lineChartViewModel, legend2);
            } else {
                z2 = z;
                it = it4;
                if (graph2 instanceof VerticalStackedBarGraph) {
                    VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) graph2;
                    ArrayList arrayList14 = verticalStackedBarGraph.bars;
                    Iterator it10 = arrayList14.iterator();
                    if (it10.hasNext()) {
                        Iterator it11 = ((VerticalStackedBarGraph.Bar) it10.next()).items.iterator();
                        long j = 0;
                        while (it11.hasNext()) {
                            j += ((VerticalStackedBarGraph.Bar.BarItem) it11.next()).value;
                        }
                        valueOf = Long.valueOf(j);
                        while (it10.hasNext()) {
                            Iterator it12 = ((VerticalStackedBarGraph.Bar) it10.next()).items.iterator();
                            long j2 = 0;
                            while (it12.hasNext()) {
                                j2 = ((VerticalStackedBarGraph.Bar.BarItem) it12.next()).value + j2;
                            }
                            Long valueOf2 = Long.valueOf(j2);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                    } else {
                        valueOf = null;
                    }
                    long longValue = valueOf != null ? valueOf.longValue() : 0L;
                    ArrayList arrayList15 = verticalStackedBarGraph.yAxisLabels;
                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                    Iterator it13 = arrayList15.iterator();
                    while (it13.hasNext()) {
                        arrayList16.add(new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(null, ((Graph.AxisLabel) it13.next()).text, Float.valueOf(r6.value), 1));
                        str2 = str2;
                        str = str;
                    }
                    String str6 = str2;
                    String str7 = str;
                    String str8 = chart.description;
                    Icon icon2 = chart.descriptionIcon;
                    int i3 = 10;
                    ArrayList arrayList17 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList14, 10));
                    Iterator it14 = arrayList14.iterator();
                    while (it14.hasNext()) {
                        VerticalStackedBarGraph.Bar bar = (VerticalStackedBarGraph.Bar) it14.next();
                        ArrayList arrayList18 = bar.items;
                        ArrayList arrayList19 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList18, i3));
                        Iterator it15 = arrayList18.iterator();
                        while (it15.hasNext()) {
                            Iterator it16 = it14;
                            Icon icon3 = icon2;
                            float f = r12.value / longValue;
                            Color color = ((VerticalStackedBarGraph.Bar.BarItem) it15.next()).color;
                            if (Float.isNaN(f)) {
                                f = RecyclerView.DECELERATION_RATE;
                            }
                            arrayList19.add(new SegmentedBarChartViewModel.Category.Segment(f, color));
                            icon2 = icon3;
                            it14 = it16;
                        }
                        arrayList17.add(new SegmentedBarChartViewModel.Category((List) arrayList19, new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(bar.categoryText, null, null, 6), bar.header, bar.subtitle, false, bar.accessibilityText, 64));
                        icon2 = icon2;
                        it14 = it14;
                        i3 = 10;
                    }
                    noChart = new ChatCardViewModel.InsightCard.Chart.BarChart(str6, str7, str8, icon2, new SegmentedBarChartViewModel("", "", arrayList17, null, arrayList16.isEmpty() ? null : arrayList16, 8));
                } else {
                    if (graph2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    noChart = new ChatCardViewModel.InsightCard.Chart.NoChart(chart.descriptionIcon, str2, str, chart.description);
                }
            }
            arrayList3.add(noChart);
            z = z2;
            it4 = it;
            i2 = 10;
        }
        boolean z4 = z;
        if (arrayList.size() > 1) {
            r3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it17 = arrayList.iterator();
            while (it17.hasNext()) {
                r3.add(new ChatCardViewModel.InsightCard.ChartToggleButton(((ClientRenderable.InsightChart.Chart) it17.next()).name));
            }
        } else {
            r3 = EmptyList.INSTANCE;
        }
        return new ChatCardViewModel.InsightCard(arrayList3, r3, i, insightChart.version >= 1 && !z4);
    }

    public final ChatCardViewModel toPluginCard(ClientRenderable.PluginComponent pluginComponent, String str, ClientRenderable.PluginComponent pluginComponent2, MoneybotChatScreen moneybotChatScreen, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-1602175420);
        ClientRenderType clientRenderType = pluginComponent.renderType;
        clientRenderType.getClass();
        ClientRenderablePlugin clientRenderablePlugin = (ClientRenderablePlugin) this.pluginRegistry.plugins.get(clientRenderType);
        if (clientRenderablePlugin == null) {
            gapComposer.end(false);
            return null;
        }
        PluginContext pluginContext = new PluginContext(str, null, pluginComponent.requestId, moneybotChatScreen, pluginComponent.renderableKey);
        boolean changed = gapComposer.changed(pluginComponent.proto) | gapComposer.changed(pluginComponent2 != null ? pluginComponent2.proto : null) | gapComposer.changed(pluginContext);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (changed || rememberedValue == obj) {
            Object obj3 = new Exception[1];
            gapComposer.updateRememberedValue(obj3);
            obj2 = obj3;
        }
        Exception[] excArr = (Exception[]) obj2;
        com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable = pluginComponent.proto;
        com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable2 = pluginComponent2 != null ? pluginComponent2.proto : null;
        boolean changedInstance = gapComposer.changedInstance(excArr) | gapComposer.changedInstance(this) | gapComposer.changedInstance(pluginComponent);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue2;
        if (changedInstance || rememberedValue2 == obj) {
            Object moneyTabUIKt$$ExternalSyntheticLambda39 = new MoneyTabUIKt$$ExternalSyntheticLambda39(2, excArr, this, pluginComponent);
            gapComposer.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda39);
            obj4 = moneyTabUIKt$$ExternalSyntheticLambda39;
        }
        UiCallbackModel rememberCallbackModel = clientRenderablePlugin.rememberCallbackModel(clientRenderable, clientRenderable2, pluginContext, this.navigator, this.onMessage, (Function1) obj4, gapComposer, 0);
        if (rememberCallbackModel == null) {
            ChatCardViewModel.ErrorCard errorCard = excArr[0] != null ? ChatCardViewModel.ErrorCard.INSTANCE : null;
            gapComposer.end(false);
            return errorCard;
        }
        ClientRenderableTapAction clientRenderableTapAction = pluginComponent.tapAction;
        ChatCardViewModel.ClientRenderableCard clientRenderableCard = new ChatCardViewModel.ClientRenderableCard(clientRenderType, rememberCallbackModel, clientRenderableTapAction != null ? new ChatCardViewEvent.LaunchClientRoute(pluginComponent.requestId, clientRenderableTapAction.clientRoute) : null);
        gapComposer.end(false);
        return clientRenderableCard;
    }
}
