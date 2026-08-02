package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ChatCardViewModel {

    public final class ActivityList implements ChatCardViewModel {
        public final boolean hasMore;
        public final ArrayList rows;
        public final String title;

        public interface Row {

            public final class Loaded implements Row {
                public final UiCallbackModel item;

                public Loaded(UiCallbackModel uiCallbackModel) {
                    uiCallbackModel.getClass();
                    this.item = uiCallbackModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Loaded) && Intrinsics.areEqual(this.item, ((Loaded) obj).item);
                }

                public final int hashCode() {
                    return this.item.hashCode();
                }

                public final String toString() {
                    return "Loaded(item=" + this.item + ")";
                }
            }

            public final class Loading implements Row {
                public static final Loading INSTANCE = new Loading();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Loading);
                }

                public final int hashCode() {
                    return -324614107;
                }

                public final String toString() {
                    return "Loading";
                }
            }
        }

        public ActivityList(String str, ArrayList arrayList, boolean z) {
            this.title = str;
            this.rows = arrayList;
            this.hasMore = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityList)) {
                return false;
            }
            ActivityList activityList = (ActivityList) obj;
            return Intrinsics.areEqual(this.title, activityList.title) && this.rows.equals(activityList.rows) && this.hasMore == activityList.hasMore;
        }

        public final int hashCode() {
            String str = this.title;
            return Boolean.hashCode(this.hasMore) + CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, "ActivityList(title=", this.title, ", rows=", ", hasMore="), this.hasMore, ")");
        }
    }

    public final class ClientRenderableCard implements ChatCardViewModel {
        public final ChatCardViewEvent action;
        public final UiCallbackModel callbackModel;
        public final ClientRenderType renderType;

        public ClientRenderableCard(ClientRenderType clientRenderType, UiCallbackModel uiCallbackModel, ChatCardViewEvent.LaunchClientRoute launchClientRoute) {
            clientRenderType.getClass();
            this.renderType = clientRenderType;
            this.callbackModel = uiCallbackModel;
            this.action = launchClientRoute;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientRenderableCard)) {
                return false;
            }
            ClientRenderableCard clientRenderableCard = (ClientRenderableCard) obj;
            return this.renderType == clientRenderableCard.renderType && this.callbackModel.equals(clientRenderableCard.callbackModel) && Intrinsics.areEqual(this.action, clientRenderableCard.action);
        }

        public final int hashCode() {
            int hashCode = (this.callbackModel.hashCode() + (this.renderType.hashCode() * 31)) * 31;
            ChatCardViewEvent chatCardViewEvent = this.action;
            return hashCode + (chatCardViewEvent == null ? 0 : chatCardViewEvent.hashCode());
        }

        public final String toString() {
            return "ClientRenderableCard(renderType=" + this.renderType + ", callbackModel=" + this.callbackModel + ", action=" + this.action + ")";
        }
    }

    public final class ErrorCard implements ChatCardViewModel {
        public static final ErrorCard INSTANCE = new ErrorCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorCard);
        }

        public final int hashCode() {
            return -1103611494;
        }

        public final String toString() {
            return "ErrorCard";
        }
    }

    public final class InsightCard implements ChatCardViewModel {
        public final List chartToggleButtons;
        public final ArrayList charts;
        public final int defaultChartIndex;
        public final boolean interactive;

        public interface Chart {

            public final class BarChart implements Chart {
                public final SegmentedBarChartViewModel data;
                public final String description;
                public final Icon descriptionIcon;
                public final String headlineValue;
                public final String title;

                public BarChart(String str, String str2, String str3, Icon icon, SegmentedBarChartViewModel segmentedBarChartViewModel) {
                    this.title = str;
                    this.headlineValue = str2;
                    this.description = str3;
                    this.descriptionIcon = icon;
                    this.data = segmentedBarChartViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BarChart)) {
                        return false;
                    }
                    BarChart barChart = (BarChart) obj;
                    return Intrinsics.areEqual(this.title, barChart.title) && Intrinsics.areEqual(this.headlineValue, barChart.headlineValue) && Intrinsics.areEqual(this.description, barChart.description) && Intrinsics.areEqual(this.descriptionIcon, barChart.descriptionIcon) && Intrinsics.areEqual(this.data, barChart.data);
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getDescription() {
                    return this.description;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final Icon getDescriptionIcon() {
                    return this.descriptionIcon;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getHeadlineValue() {
                    return this.headlineValue;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.headlineValue);
                    String str = this.description;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    Icon icon = this.descriptionIcon;
                    return this.data.hashCode() + ((hashCode + (icon != null ? icon.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BarChart(title=", this.title, ", headlineValue=", this.headlineValue, ", description=");
                    m.append(this.description);
                    m.append(", descriptionIcon=");
                    m.append(this.descriptionIcon);
                    m.append(", data=");
                    m.append(this.data);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Legend {
                public final List items;

                public final class LegendItem {
                    public final Color color;
                    public final String description;
                    public final String label;
                    public final Integer lineIndex;

                    public LegendItem(String str, String str2, Color color, Integer num) {
                        this.label = str;
                        this.description = str2;
                        this.color = color;
                        this.lineIndex = num;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof LegendItem)) {
                            return false;
                        }
                        LegendItem legendItem = (LegendItem) obj;
                        return this.label.equals(legendItem.label) && Intrinsics.areEqual(this.description, legendItem.description) && this.color.equals(legendItem.color) && Intrinsics.areEqual(this.lineIndex, legendItem.lineIndex);
                    }

                    public final int hashCode() {
                        int hashCode = this.label.hashCode() * 31;
                        String str = this.description;
                        int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.color, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                        Integer num = this.lineIndex;
                        return m + (num != null ? num.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegendItem(label=", this.label, ", description=", this.description, ", color=");
                        m.append(this.color);
                        m.append(", lineIndex=");
                        m.append(this.lineIndex);
                        m.append(")");
                        return m.toString();
                    }
                }

                public Legend(List list) {
                    list.getClass();
                    this.items = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Legend) && Intrinsics.areEqual(this.items, ((Legend) obj).items);
                }

                public final int hashCode() {
                    return this.items.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("Legend(items=", ")", this.items);
                }
            }

            public final class LineChart implements Chart {
                public final LineChartViewModel data;
                public final String description;
                public final Icon descriptionIcon;
                public final String headlineValue;
                public final Legend legend;
                public final String title;

                public LineChart(String str, String str2, String str3, Icon icon, LineChartViewModel lineChartViewModel, Legend legend) {
                    this.title = str;
                    this.headlineValue = str2;
                    this.description = str3;
                    this.descriptionIcon = icon;
                    this.data = lineChartViewModel;
                    this.legend = legend;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LineChart)) {
                        return false;
                    }
                    LineChart lineChart = (LineChart) obj;
                    return Intrinsics.areEqual(this.title, lineChart.title) && Intrinsics.areEqual(this.headlineValue, lineChart.headlineValue) && Intrinsics.areEqual(this.description, lineChart.description) && Intrinsics.areEqual(this.descriptionIcon, lineChart.descriptionIcon) && Intrinsics.areEqual(this.data, lineChart.data) && Intrinsics.areEqual(this.legend, lineChart.legend);
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getDescription() {
                    return this.description;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final Icon getDescriptionIcon() {
                    return this.descriptionIcon;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getHeadlineValue() {
                    return this.headlineValue;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.headlineValue;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.description;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Icon icon = this.descriptionIcon;
                    int hashCode4 = (this.data.hashCode() + ((hashCode3 + (icon == null ? 0 : icon.hashCode())) * 31)) * 31;
                    Legend legend = this.legend;
                    return hashCode4 + (legend != null ? legend.items.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LineChart(title=", this.title, ", headlineValue=", this.headlineValue, ", description=");
                    m.append(this.description);
                    m.append(", descriptionIcon=");
                    m.append(this.descriptionIcon);
                    m.append(", data=");
                    m.append(this.data);
                    m.append(", legend=");
                    m.append(this.legend);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class NoChart implements Chart {
                public final String description;
                public final Icon descriptionIcon;
                public final String headlineValue;
                public final String title;

                public NoChart(Icon icon, String str, String str2, String str3) {
                    this.title = str;
                    this.headlineValue = str2;
                    this.description = str3;
                    this.descriptionIcon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NoChart)) {
                        return false;
                    }
                    NoChart noChart = (NoChart) obj;
                    return this.title.equals(noChart.title) && this.headlineValue.equals(noChart.headlineValue) && Intrinsics.areEqual(this.description, noChart.description) && Intrinsics.areEqual(this.descriptionIcon, noChart.descriptionIcon);
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getDescription() {
                    return this.description;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final Icon getDescriptionIcon() {
                    return this.descriptionIcon;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getHeadlineValue() {
                    return this.headlineValue;
                }

                @Override // com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel.InsightCard.Chart
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.headlineValue);
                    String str = this.description;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    Icon icon = this.descriptionIcon;
                    return hashCode + (icon != null ? icon.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoChart(title=", this.title, ", headlineValue=", this.headlineValue, ", description=");
                    m.append(this.description);
                    m.append(", descriptionIcon=");
                    m.append(this.descriptionIcon);
                    m.append(")");
                    return m.toString();
                }
            }

            String getDescription();

            Icon getDescriptionIcon();

            String getHeadlineValue();

            String getTitle();
        }

        public final class ChartToggleButton {
            public final String label;

            public ChartToggleButton(String str) {
                this.label = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChartToggleButton) && this.label.equals(((ChartToggleButton) obj).label);
            }

            public final int hashCode() {
                return this.label.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChartToggleButton(label=", this.label, ")");
            }
        }

        public InsightCard(ArrayList arrayList, List list, int i, boolean z) {
            list.getClass();
            this.charts = arrayList;
            this.chartToggleButtons = list;
            this.defaultChartIndex = i;
            this.interactive = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsightCard)) {
                return false;
            }
            InsightCard insightCard = (InsightCard) obj;
            return Intrinsics.areEqual(this.charts, insightCard.charts) && Intrinsics.areEqual(this.chartToggleButtons, insightCard.chartToggleButtons) && this.defaultChartIndex == insightCard.defaultChartIndex && this.interactive == insightCard.interactive;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.interactive) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.defaultChartIndex, Recorder$$ExternalSyntheticOutline2.m(this.charts.hashCode() * 31, 31, this.chartToggleButtons), 31);
        }

        public final String toString() {
            return "InsightCard(charts=" + this.charts + ", chartToggleButtons=" + this.chartToggleButtons + ", defaultChartIndex=" + this.defaultChartIndex + ", interactive=" + this.interactive + ")";
        }
    }
}
