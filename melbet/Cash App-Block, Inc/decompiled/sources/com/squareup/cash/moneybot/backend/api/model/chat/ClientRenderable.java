package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.backend.api.model.charting.Graph;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ClientRenderable extends Message.ToolResponse.UserContent {

    public final class ActivityList implements ClientRenderable {
        public final boolean hasMore;
        public final String requestId;
        public final List rows;
        public final ClientRenderableTapAction tapAction;
        public final String title;
        public final int version;

        public ActivityList(String str, int i, String str2, List list, boolean z, ClientRenderableTapAction clientRenderableTapAction) {
            this.requestId = str;
            this.version = i;
            this.title = str2;
            this.rows = list;
            this.hasMore = z;
            this.tapAction = clientRenderableTapAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityList)) {
                return false;
            }
            ActivityList activityList = (ActivityList) obj;
            return Intrinsics.areEqual(this.requestId, activityList.requestId) && this.version == activityList.version && Intrinsics.areEqual(this.title, activityList.title) && this.rows.equals(activityList.rows) && this.hasMore == activityList.hasMore && Intrinsics.areEqual(this.tapAction, activityList.tapAction);
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final ClientRenderableTapAction getTapAction() {
            return this.tapAction;
        }

        public final int hashCode() {
            String str = this.requestId;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.title;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.rows), 31, this.hasMore);
            ClientRenderableTapAction clientRenderableTapAction = this.tapAction;
            return m2 + (clientRenderableTapAction != null ? clientRenderableTapAction.clientRoute.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("ActivityList(requestId=", this.version, this.requestId, ", version=", ", title=");
            NavAction$$ExternalSyntheticOutline0.m(this.title, ", rows=", ", hasMore=", m, this.rows);
            m.append(this.hasMore);
            m.append(", tapAction=");
            m.append(this.tapAction);
            m.append(")");
            return m.toString();
        }
    }

    public final class Error implements ClientRenderable {
        public final String requestId;

        public Error(String str) {
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.requestId, ((Error) obj).requestId);
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final ClientRenderableTapAction getTapAction() {
            return null;
        }

        public final int hashCode() {
            String str = this.requestId;
            return Integer.hashCode(0) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(requestId=", this.requestId, ", version=0)");
        }
    }

    public final class InsightChart implements ClientRenderable {
        public final ArrayList charts;
        public final int defaultChart;
        public final String requestId;
        public final ClientRenderableTapAction tapAction;
        public final int version;

        public final class Chart {
            public final String description;
            public final Icon descriptionIcon;
            public final Graph graph;
            public final String headline;
            public final String name;
            public final String title;

            public Chart(String str, String str2, String str3, String str4, Icon icon, Graph graph) {
                this.name = str;
                this.title = str2;
                this.headline = str3;
                this.description = str4;
                this.descriptionIcon = icon;
                this.graph = graph;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Chart)) {
                    return false;
                }
                Chart chart = (Chart) obj;
                return this.name.equals(chart.name) && this.title.equals(chart.title) && this.headline.equals(chart.headline) && Intrinsics.areEqual(this.description, chart.description) && Intrinsics.areEqual(this.descriptionIcon, chart.descriptionIcon) && Intrinsics.areEqual(this.graph, chart.graph);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.title), 31, this.headline);
                String str = this.description;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.descriptionIcon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                Graph graph = this.graph;
                return hashCode2 + (graph != null ? graph.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Chart(name=", this.name, ", title=", this.title, ", headline=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.headline, ", description=", this.description, ", descriptionIcon=");
                m.append(this.descriptionIcon);
                m.append(", graph=");
                m.append(this.graph);
                m.append(")");
                return m.toString();
            }
        }

        public InsightChart(String str, int i, ArrayList arrayList, int i2, ClientRenderableTapAction clientRenderableTapAction) {
            this.requestId = str;
            this.version = i;
            this.charts = arrayList;
            this.defaultChart = i2;
            this.tapAction = clientRenderableTapAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsightChart)) {
                return false;
            }
            InsightChart insightChart = (InsightChart) obj;
            return Intrinsics.areEqual(this.requestId, insightChart.requestId) && this.version == insightChart.version && this.charts.equals(insightChart.charts) && this.defaultChart == insightChart.defaultChart && Intrinsics.areEqual(this.tapAction, insightChart.tapAction);
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final ClientRenderableTapAction getTapAction() {
            return this.tapAction;
        }

        public final int hashCode() {
            String str = this.requestId;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.defaultChart, CameraState$Type$EnumUnboxingLocalUtility.m(this.charts, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
            ClientRenderableTapAction clientRenderableTapAction = this.tapAction;
            return m + (clientRenderableTapAction != null ? clientRenderableTapAction.clientRoute.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("InsightChart(requestId=", this.version, this.requestId, ", version=", ", charts=");
            m.append(this.charts);
            m.append(", defaultChart=");
            m.append(this.defaultChart);
            m.append(", tapAction=");
            m.append(this.tapAction);
            m.append(")");
            return m.toString();
        }
    }

    public final class PluginComponent implements ClientRenderable {
        public final com.squareup.protos.cash.kgoose.api.v3.ClientRenderable proto;
        public final ClientRenderType renderType;
        public final String renderableKey;
        public final String requestId;
        public final ClientRenderableTapAction tapAction;
        public final int version;

        public PluginComponent(String str, int i, ClientRenderType clientRenderType, com.squareup.protos.cash.kgoose.api.v3.ClientRenderable clientRenderable, ClientRenderableTapAction clientRenderableTapAction, String str2) {
            clientRenderType.getClass();
            clientRenderable.getClass();
            this.requestId = str;
            this.version = i;
            this.renderType = clientRenderType;
            this.proto = clientRenderable;
            this.tapAction = clientRenderableTapAction;
            this.renderableKey = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginComponent)) {
                return false;
            }
            PluginComponent pluginComponent = (PluginComponent) obj;
            return Intrinsics.areEqual(this.requestId, pluginComponent.requestId) && this.version == pluginComponent.version && this.renderType == pluginComponent.renderType && Intrinsics.areEqual(this.proto, pluginComponent.proto) && Intrinsics.areEqual(this.tapAction, pluginComponent.tapAction) && Intrinsics.areEqual(this.renderableKey, pluginComponent.renderableKey);
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable
        public final ClientRenderableTapAction getTapAction() {
            return this.tapAction;
        }

        public final int hashCode() {
            String str = this.requestId;
            int hashCode = (this.proto.hashCode() + ((this.renderType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31)) * 31;
            ClientRenderableTapAction clientRenderableTapAction = this.tapAction;
            int hashCode2 = (hashCode + (clientRenderableTapAction == null ? 0 : clientRenderableTapAction.clientRoute.hashCode())) * 31;
            String str2 = this.renderableKey;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("PluginComponent(requestId=", this.version, this.requestId, ", version=", ", renderType=");
            m.append(this.renderType);
            m.append(", proto=");
            m.append(this.proto);
            m.append(", tapAction=");
            m.append(this.tapAction);
            m.append(", renderableKey=");
            m.append(this.renderableKey);
            m.append(")");
            return m.toString();
        }
    }

    String getRequestId();

    ClientRenderableTapAction getTapAction();
}
