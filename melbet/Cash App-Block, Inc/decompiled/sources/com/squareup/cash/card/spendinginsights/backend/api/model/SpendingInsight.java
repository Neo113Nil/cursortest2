package com.squareup.cash.card.spendinginsights.backend.api.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SpendingInsight {
    public final Button button;
    public final HorizontalBarGraph graph;
    public final SpendingAnalysis spendingAnalysis;
    public final String subtitle;
    public final ArrayList title;
    public final TitleSize titleSize;

    public final class Button {
        public final Action action;
        public final Color buttonColor;
        public final String text;
        public final Color textColor;

        public interface Action {

            public final class ClientRoute implements Action {
                public final String route;

                public ClientRoute(String str) {
                    str.getClass();
                    this.route = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.route, ((ClientRoute) obj).route);
                }

                public final int hashCode() {
                    return this.route.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(route=", this.route, ")");
                }
            }

            public final class Exit implements Action {
                public static final Exit INSTANCE = new Exit();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Exit);
                }

                public final int hashCode() {
                    return -1787879382;
                }

                public final String toString() {
                    return "Exit";
                }
            }
        }

        public Button(String str, Color color, Color color2, Action action) {
            this.text = str;
            this.buttonColor = color;
            this.textColor = color2;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && Intrinsics.areEqual(this.buttonColor, button.buttonColor) && Intrinsics.areEqual(this.textColor, button.textColor) && this.action.equals(button.action);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Color color = this.buttonColor;
            int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
            Color color2 = this.textColor;
            return this.action.hashCode() + ((hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Button(text=" + this.text + ", buttonColor=" + this.buttonColor + ", textColor=" + this.textColor + ", action=" + this.action + ")";
        }
    }

    public final class HorizontalBarGraph {
        public final BarColors barColors;
        public final ArrayList bars;

        public final class Bar {
            public final UiAvatar avatar;
            public final String clientRoute;
            public final String label;
            public final long value;
            public final String valueText;

            public Bar(UiAvatar uiAvatar, String str, String str2, long j, String str3) {
                uiAvatar.getClass();
                str3.getClass();
                this.avatar = uiAvatar;
                this.label = str;
                this.valueText = str2;
                this.value = j;
                this.clientRoute = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Bar)) {
                    return false;
                }
                Bar bar = (Bar) obj;
                return Intrinsics.areEqual(this.avatar, bar.avatar) && this.label.equals(bar.label) && this.valueText.equals(bar.valueText) && this.value == bar.value && Intrinsics.areEqual(this.clientRoute, bar.clientRoute);
            }

            public final int hashCode() {
                return this.clientRoute.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.label), 31, this.valueText), 31, this.value);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Bar(avatar=");
                sb.append(this.avatar);
                sb.append(", label=");
                sb.append(this.label);
                sb.append(", valueText=");
                sb.append(this.valueText);
                sb.append(", value=");
                sb.append(this.value);
                return Recorder$$ExternalSyntheticOutline2.m(sb, ", clientRoute=", this.clientRoute, ")");
            }
        }

        public final class BarColors {
            public final Color bar;
            public final Color text;

            public BarColors(Color color, Color color2) {
                color.getClass();
                color2.getClass();
                this.bar = color;
                this.text = color2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BarColors)) {
                    return false;
                }
                BarColors barColors = (BarColors) obj;
                return Intrinsics.areEqual(this.bar, barColors.bar) && Intrinsics.areEqual(this.text, barColors.text);
            }

            public final int hashCode() {
                return this.text.hashCode() + (this.bar.hashCode() * 31);
            }

            public final String toString() {
                return "BarColors(bar=" + this.bar + ", text=" + this.text + ")";
            }
        }

        public HorizontalBarGraph(ArrayList arrayList, BarColors barColors) {
            this.bars = arrayList;
            this.barColors = barColors;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalBarGraph)) {
                return false;
            }
            HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
            return this.bars.equals(horizontalBarGraph.bars) && this.barColors.equals(horizontalBarGraph.barColors);
        }

        public final int hashCode() {
            return this.barColors.hashCode() + (this.bars.hashCode() * 31);
        }

        public final String toString() {
            return "HorizontalBarGraph(bars=" + this.bars + ", barColors=" + this.barColors + ")";
        }
    }

    public final class SpendingAnalysis {
        public final ArrayList categories;
        public final DisplayType displayType;

        public final class AnalysisCategory {
            public final Button button;
            public final Image icon;
            public final String text;
            public final String title;

            public AnalysisCategory(String str, String str2, Image image, Button button) {
                this.title = str;
                this.text = str2;
                this.icon = image;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnalysisCategory)) {
                    return false;
                }
                AnalysisCategory analysisCategory = (AnalysisCategory) obj;
                return this.title.equals(analysisCategory.title) && Intrinsics.areEqual(this.text, analysisCategory.text) && Intrinsics.areEqual(this.icon, analysisCategory.icon) && Intrinsics.areEqual(this.button, analysisCategory.button);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.text;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Image image = this.icon;
                int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
                Button button = this.button;
                return hashCode3 + (button != null ? button.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AnalysisCategory(title=", this.title, ", text=", this.text, ", icon=");
                m.append(this.icon);
                m.append(", button=");
                m.append(this.button);
                m.append(")");
                return m.toString();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DisplayType {
            public static final /* synthetic */ DisplayType[] $VALUES;
            public static final DisplayType CARD;
            public static final DisplayType INLINE;

            static {
                DisplayType displayType = new DisplayType("CARD", 0);
                CARD = displayType;
                DisplayType displayType2 = new DisplayType("INLINE", 1);
                INLINE = displayType2;
                $VALUES = new DisplayType[]{displayType, displayType2};
            }

            public static DisplayType valueOf(String str) {
                return (DisplayType) Enum.valueOf(DisplayType.class, str);
            }

            public static DisplayType[] values() {
                return (DisplayType[]) $VALUES.clone();
            }
        }

        public SpendingAnalysis(DisplayType displayType, ArrayList arrayList) {
            this.displayType = displayType;
            this.categories = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpendingAnalysis)) {
                return false;
            }
            SpendingAnalysis spendingAnalysis = (SpendingAnalysis) obj;
            return this.displayType == spendingAnalysis.displayType && this.categories.equals(spendingAnalysis.categories);
        }

        public final int hashCode() {
            return this.categories.hashCode() + (this.displayType.hashCode() * 31);
        }

        public final String toString() {
            return "SpendingAnalysis(displayType=" + this.displayType + ", categories=" + this.categories + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TitleSize {
        public static final /* synthetic */ TitleSize[] $VALUES;
        public static final TitleSize LARGE;
        public static final TitleSize MEDIUM;

        static {
            TitleSize titleSize = new TitleSize("MEDIUM", 0);
            MEDIUM = titleSize;
            TitleSize titleSize2 = new TitleSize("LARGE", 1);
            LARGE = titleSize2;
            $VALUES = new TitleSize[]{titleSize, titleSize2};
        }

        public static TitleSize valueOf(String str) {
            return (TitleSize) Enum.valueOf(TitleSize.class, str);
        }

        public static TitleSize[] values() {
            return (TitleSize[]) $VALUES.clone();
        }
    }

    public SpendingInsight(ArrayList arrayList, TitleSize titleSize, String str, HorizontalBarGraph horizontalBarGraph, SpendingAnalysis spendingAnalysis, Button button) {
        this.title = arrayList;
        this.titleSize = titleSize;
        this.subtitle = str;
        this.graph = horizontalBarGraph;
        this.spendingAnalysis = spendingAnalysis;
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingInsight)) {
            return false;
        }
        SpendingInsight spendingInsight = (SpendingInsight) obj;
        return this.title.equals(spendingInsight.title) && this.titleSize == spendingInsight.titleSize && Intrinsics.areEqual(this.subtitle, spendingInsight.subtitle) && this.graph.equals(spendingInsight.graph) && Intrinsics.areEqual(this.spendingAnalysis, spendingInsight.spendingAnalysis) && this.button.equals(spendingInsight.button);
    }

    public final int hashCode() {
        int hashCode = (this.titleSize.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (this.graph.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        SpendingAnalysis spendingAnalysis = this.spendingAnalysis;
        return this.button.hashCode() + ((hashCode2 + (spendingAnalysis != null ? spendingAnalysis.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SpendingInsight(title=" + this.title + ", titleSize=" + this.titleSize + ", subtitle=" + this.subtitle + ", graph=" + this.graph + ", spendingAnalysis=" + this.spendingAnalysis + ", button=" + this.button + ")";
    }
}
